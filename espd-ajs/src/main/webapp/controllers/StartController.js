/*
  Gestisce la definizione del ruolo che andrà a creare / rispondere al questionario,
  e come il questionario stesso viene inizializzato ( se caricato da file xml o creato da zero)
*/
angular.module('espdApp')
  .controller('StartController', ['$scope', 'StartService', 'TranslateService', 'MainService', '$state', 'CriterionParserCA', 'CriterionParserCommon', function ($scope, StartService, TranslateService, MainService, $state, CriterionParserCA, CriterionParserCommon) {


    /////////////////////////--- VAR---////////////////////////////
    var CritCommon = CriterionParserCommon;
    var bozza = MainService.getJsonStart();
    bozza.userRole != '' ? $scope.userRole = bozza.userRole : $scope.userRole = '';
    bozza.operations != '' ? $scope.operations = bozza.operations : $scope.operations = '';
    bozza.operations != '' ? $scope.operations = bozza.operations : $scope.operations = '';
    (bozza.uploadRequest != null && bozza.uploadRequest != undefined) ? $scope.uploadRequest = bozza.uploadRequest : $scope.uploadRequest = null;
    (bozza.uploadResponse != null && bozza.uploadResponse != undefined) ? $scope.uploadResponse = bozza.uploadResponse : $scope.uploadResponse = null;
    (bozza.uploadSingleRequest != null && bozza.uploadSingleRequest != undefined) ? $scope.uploadSingleRequest = bozza.uploadSingleRequest : $scope.uploadSingleRequest = null;
    (bozza.codeCountry != null && bozza.codeCountry != undefined) ? $scope.codeCountry = bozza.codeCountry : $scope.codeCountry = 'IT';
    $scope.isStartPage = true;

    ////////////////////////--Functions--///////////////////////////

    /*Serve ad ordinare le liste usate nelle select quando i nomi delle option subiscono la traduzione per il cambio della lingua*/
    const bubbleSort = function (countries, n) {
      var collator = Intl.Collator(MainService.getDefaultLanguage());
      var flagReturn = false;
      for (var i = 0; i < n - 1; i++)
        if (collator.compare($scope.countries[i].countryName, $scope.countries[i + 1].countryName) == 1) {
          // swap arr[i], arr[i+1]
          var temp = $scope.countries[i];
          $scope.countries[i] = $scope.countries[i + 1];
          $scope.countries[i + 1] = temp;
          flagReturn = true;
        }
      if (flagReturn == true) {
        bubbleSort($scope.countries, n);
      }
    }

    /*Dato l'isocode del paese, ritorna il json del paese completo*/
    const getCountryByIsoCode = function (isocode) {
      for (var key in $scope.countries) {
        if ($scope.countries[key].iso2Code == isocode) {
          return $scope.countries[key];
        }
      }
    }

    /* Traduce la pagina quando il MainController lancia l'evento di traduzione in broadcast ai suoi figli.
       Traduce inoltre la lista dei paesi e li ordina
    */
    const translatePage = function () {
      if (!MainService.getLoading()) {
        $scope.$emit('showLoading');
      }
      TranslateService.translate(MainService.getDefaultLanguage())
        .then(function (response) {
          $scope.variablesTranslate = response.data.payload;
        });
      TranslateService.translateWithCodes(MainService.getDefaultLanguage(), $scope.countriesToTranslate)
        .then(function (response) {
          for (var countryTransl in response.data.payload) {
            var isocode = countryTransl.split('_')[1];
            var getCountry = getCountryByIsoCode(isocode);
            getCountry.countryName = response.data.payload[countryTransl];
          }
          bubbleSort($scope.countries, $scope.countries.length);
          $scope.$emit('hideLoading');
        });
    }

    /* Get della lista dei paesi */
    const getCountries = function () {
      $scope.$emit('showLoading');
      StartService.getCountries()
        .then(function (response) {
          $scope.countries = response.data.payload;
          $scope.countriesToTranslate = [];
          for (var key in $scope.countries) {
            $scope.countriesToTranslate.push('country_' + $scope.countries[key].iso2Code);
          }
          translatePage();
        })
    }

    /* Disabilita il tasto per andare avanti se non sono soddisfatte le condizioni necessarie
    e.g. l'utente ha scelto il ruolo e l'utente ha caricato il file o l'utente ha scelto il ruolo e vuole iniziare il questionario da zero*/
    $scope.nextDisabled = function () {
      return (StartService.nextDisabled($scope.userRole, $scope.operations, $scope.uploadSingleRequest, $scope.codeCountry));
    }

    /* Salva una copia di backup del json che utilizza l'applicativo */
    const setJson = function () {
      var jsonObjects = MainService.getJsonStart();
      jsonObjects.userRole = $scope.userRole;
      jsonObjects.operations = $scope.operations;
      jsonObjects.operations = $scope.operations;
      jsonObjects.uploadSingleRequest = $scope.uploadSingleRequest;
      jsonObjects.uploadRequest = $scope.uploadRequest;
      jsonObjects.uploadResponse = $scope.uploadResponse;
      jsonObjects.codeCountry = $scope.codeCountry;
      StartService.setBackup(jsonObjects);
      MainService.setJsonStart(jsonObjects);
    }

    /* Gestisce la scelta di un opzione che include l'upload di un file e imposta il json dell'applicativo*/
    const goingNextWithUpload = function () {
      if ($scope.uploadSingleRequest != null && ($scope.operations == 'espd_request' || $scope.operations == 'create_espd_request_or_response' || $scope.operations == 'eo_import_espd' )) {
        StartService.uploadFileToUrl(
          {
            authentication: {
              user: $scope.userRole
            },
            bean: $scope.uploadSingleRequest.base64
          }
        ).then(function (response) {
          if (response.data.result.exitCode != '200') {
            $scope.errorOnUpload = true
          }
          else {
            var appjson = response.data.payload;
            for (var criterion in appjson.tenderingCriterionModels) {  //Se nel file xml sono presenti dei criterion, vengono REBUILDATI (spiegazione nel documento di dettaglio)
              CritCommon.rebuildCriterion(appjson.tenderingCriterionModels[criterion]);
            }
            // va fatto un replace di alcuni caratteri per poi usare la mask di gestione del numero avviso nella sezione Procedura
            for (var doc in response.data.payload.additionalDocumentReferenceModels) {
              var numeroAvviso = response.data.payload.additionalDocumentReferenceModels[doc].idModel.id;
              numeroAvviso = numeroAvviso.replace('/S ', '');
              numeroAvviso = numeroAvviso.replace('-', '');
              response.data.payload.additionalDocumentReferenceModels[doc].idModel.id = numeroAvviso;
            }
            MainService.setApplicationJson(appjson);
            $state.go('home.procedure');
          }
        });
      }
    }

    /* Il ruolo selezionato è CA e vengono gestiti i casi di upload o di creazione del questionario*/
    const goNextAsCa = function () {
      goingNextWithUpload()
      if ($scope.operations == 'create_espd_request_or_response') {
        StartService.initCa({
          authentication: {
            user: $scope.userRole
          },
          bean: null
        }).then(function (response) {
          // va fatto un replace di alcuni caratteri per poi usare la mask di gestione del numero avviso nella sezione Procedura
          for (var doc in response.data.payload.additionalDocumentReferenceModels) {
            var numeroAvviso = response.data.payload.additionalDocumentReferenceModels[doc].idModel.id;
            numeroAvviso = numeroAvviso.replace('/S ', '');
            numeroAvviso = numeroAvviso.replace('-', '');
            response.data.payload.additionalDocumentReferenceModels[doc].idModel.id = numeroAvviso;
          }
          MainService.setApplicationJson(response.data.payload);
          $state.go('home.procedure');
        });
      }
    }

    /* Il ruolo selezionato è EO e viene gestito il caso di upload*/
    const goNextAsEo = function () {
      goingNextWithUpload()
      if ($scope.operations == 'eo_create_espd_response') {
      }
    }

    /* Switcha l'andare avanti a seconda del ruolo selezionato*/
    $scope.goNext = function () {
      setJson();
      MainService.emptyMaxActiveCountProgress();
      if ($scope.userRole == 'ca') {
        goNextAsCa();
      }
      if ($scope.userRole == 'eo') {
        goNextAsEo();
      }
    }

    /* Serve ad andare alla pagina di selezione lingua, al momento disattivata*/
    $scope.goBack = function () {
      setJson();
      $state.go('home.languages');
    }

    /* Apre il prompt della selezione del file da uploadare */
    $scope.upload = function (id) {
      document.querySelector('#' + id).click()
    }

    //Listener per le scelte che fa l'utente e resetta le optioni(ng-model) a seconda del cambio di opzione
    $scope.$watch('userRole', function (newValue, oldValue) {
      if (newValue != undefined && oldValue != undefined) {
        if (newValue != oldValue) {
          var jsonObjects = {userRole: $scope.userRole};
          MainService.setJsonStart(jsonObjects);
          $scope.operations = null;
          $scope.uploadSingleRequest = null;
          $scope.uploadRequest = null;
          $scope.uploadResponse = null;
          $scope.codeCountry = null;
        }
      }
    });


    ///////////////////////--INIT--////////////////////////////////
    $scope.$on('translatePage', function () {
      translatePage();
    });
    $scope.$on('setApplicationJson', function () {
      $scope.$broadcast('removeEmptyValues');
      setJson();
    });
    getCountries();
  }]);
