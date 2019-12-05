angular.module('espdApp')
  .controller('ExclusionController', ['$scope', 'AngularCommonService', 'EmptyModelService', 'CriterionParentService', 'ParentService', 'CommonService', 'SupportService', function ($scope, AngularCommonService, EmptyModelService, CriterionParentService, ParentService, CommonService, SupportService) {

    //////////////////////////////////////////--VARIABLES--/////////////////////////////////////////////////
    var CriterionParserCA = CriterionParentService.getCriterionParserCA();
    var CriterionParserEO = CriterionParentService.getCriterionParserEO();
    var CriterionParserCommon = CriterionParentService.getCriterionParserCommon();
    var MainService = ParentService.getMainService();
    var ExclusionService = ParentService.getExclusionService();
    var SelectionService = ParentService.getSelectionService();
    var CancelService = SupportService.getCancelService();
    var TranslateService = SupportService.getTranslateService();
    var $compile = AngularCommonService.getCompile();
    var $state = AngularCommonService.getState();
    $scope.CriterionParserCA = CriterionParserCA;
    $scope.CriterionParserEO = CriterionParserEO;
    $scope.CriterionParserCommon = CriterionParserCommon;
    $scope.MainService = MainService;
    var CritCommon = CriterionParserCommon;
    $scope.tryNextValidity = false;
    $scope.applicationJson = MainService.getApplicationJson();
    $scope.startVariables = MainService.getJsonStart();
    $scope.criterionsCodes = ExclusionService.getCriterionCodes();
    $scope.criterionsCodesEO = [];
    $scope.CommonService = CommonService;
    if ($scope.startVariables.userRole == 'ca') {
      $scope.criterionMenu = $scope.criterionsCodes;
    } else {
      $scope.criterionMenu = $scope.criterionsCodesEO;
    }
    $scope.criterionSelection = {}
    $scope.criterions = {};
    $scope.afterExclusionPage = true;
    $scope.defaultLanguage = MainService.getDefaultLanguage().toUpperCase();
    var firstTimeLoadCriterion = true;
    var toWait = [];
    var isEmpty = true;
    //////////////////////////////////////////--FUNCTIONS--/////////////////////////////////////////////////

    /* Inizializzazione dei criterion */
    const loadCriterions = function () {
      // SE UN CRITERION DI ESCLUSIONE STA GIA' NELL'APPLICATIONJSON LO METTO NEI CRITERIONS
      let cont = 0;
      while(cont<$scope.applicationJson.tenderingCriterionModels.length){
        if ($scope.criterionsCodes.indexOf($scope.applicationJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code) > -1) {
          $scope.criterions[CommonService.rebuildCriterionCode($scope.applicationJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code)] = angular.copy($scope.applicationJson.tenderingCriterionModels[cont]);
          isEmpty = false; // Serve a vedere se sono stati già selezionati criteri in precedenza
          $scope.criterionSelection[CommonService.rebuildCriterionCode($scope.applicationJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code)] = true;
          $scope.criterionsCodesEO.push($scope.applicationJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code);
          $scope.applicationJson.tenderingCriterionModels.splice(cont, 1);
          if(cont!=0){
            cont--;
          }
        } else{
          cont ++;
        }
      }
      MainService.getCriterions($scope.criterionsCodes).then(function (response) {
        //SE UN CRITERION DI ESCLUSIONE NON STA GIA' NELL'APPLICATIONJSON LO BUILDO E LO METTO NEI CRITERIONS
        for (var criterion in response.data.payload) {
          if ($scope.criterions[CommonService.rebuildCriterionCode(response.data.payload[criterion].criterionTypeCodeModel.criterionElementType.code)] == undefined && $scope.startVariables.userRole == 'ca') {
            $scope.criterions[CommonService.rebuildCriterionCode(response.data.payload[criterion].criterionTypeCodeModel.criterionElementType.code)] = CritCommon.rebuildCriterion(response.data.payload[criterion]);
          }
        }
        $scope.criterionSelection = CommonService.fillSelectedCriterionExclusion(isEmpty, $scope.criterions, $scope.criterionSelection);
        if ($scope.startVariables.userRole == 'ca') {
          for (var criterionId in $scope.criterionsCodes) {
            if ($scope.criterionsCodes.hasOwnProperty(criterionId)) {
              var el = document.getElementById($scope.criterionsCodes[criterionId]);
              var criterionCreated = CriterionParserCA.build($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodes[criterionId])], 'criterions.' + CommonService.rebuildCriterionCode($scope.criterionsCodes[criterionId]), CommonService.rebuildCriterionCode($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodes[criterionId])].criterionTypeCodeModel.criterionElementType.code));
              el.appendChild(criterionCreated);
              $compile(criterionCreated)($scope);
            }
          }
        }
        if ($scope.startVariables.userRole == 'eo') {
          for (var criterionIdEO in $scope.criterionsCodesEO) {
            if ($scope.criterionsCodesEO.hasOwnProperty(criterionIdEO)) {
              var elEO = document.getElementById($scope.criterionsCodesEO[criterionIdEO]);
              var criterionCreatedEO = CriterionParserEO.build($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodesEO[criterionIdEO])], 'criterions.' + CommonService.rebuildCriterionCode($scope.criterionsCodesEO[criterionIdEO]), CommonService.rebuildCriterionCode($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodesEO[criterionIdEO])].criterionTypeCodeModel.criterionElementType.code));
              elEO.appendChild(criterionCreatedEO);
              $compile(criterionCreatedEO)($scope);
            }
          }
        }
        firstTimeLoadCriterion = false;
        $scope.$emit('hideLoading');
      });
    };

    /* START CodeList */

    /* Get della lista CurrencyType e traduzione*/
    const getCurrencyType = function () {
      return MainService.getCurrencyType(MainService.getDefaultLanguage())
        .then(function (response) {
          if ($scope.currencyType == undefined) {
            $scope.currencyType = response.data.payload;
          } else {
            for (let i = 0; i < $scope.currencyType.length; i++) {
              $scope.currencyType[i].translation = response.data.payload[i].translation
            }
          }
        })
    };
    /* END CodeList */

    /* SET JSON */
    const setJson = function () {
      for (var code in $scope.criterionSelection) {
        if ($scope.criterionSelection[code]) {
          $scope.applicationJson.tenderingCriterionModels.push(angular.copy($scope.criterions[code]));
        }
      }
      ExclusionService.setBackup($scope.applicationJson);
      MainService.setApplicationJson($scope.applicationJson);
    };

    /* Traduce la pagina quando il MainController lancia l'evento di traduzione in broadcast ai suoi figli.
       Traduce inoltre la liste e ordina la lista dei paesi
    */
    const translatePage = function () {
      if (!MainService.getLoading()) {
        $scope.$emit('showLoading');
      }
      toWait.push(TranslateService.translateWithCodes(MainService.getDefaultLanguage(), $scope.countriesToTranslate)
        .then(function (response) {
          for (var countryTransl in response.data.payload) {
            if (response.data.payload.hasOwnProperty(countryTransl)) {
              var isocode = countryTransl.split('_')[1];
              var getCountry = CommonService.getCountryByIsoCode(isocode, $scope.countries);
              getCountry.countryName = response.data.payload[countryTransl];
            }
          }
          CommonService.bubbleSort($scope.countries, $scope.countries.length);
        }));
      toWait.push(TranslateService.translate(MainService.getDefaultLanguage())
        .then(function (response) {
          $scope.variablesTranslate = response.data.payload;
        }));
      toWait.push(MainService.getLotsList({
        listPplm: $scope.applicationJson.procurementProjectLotModels,
        authentication: {
          user: $scope.startVariables.userRole
        }
      }, $scope));
      toWait.push(getCurrencyType());
      toWait.push(MainService.getCpvsList({
        listCcm: $scope.applicationJson.procurementProjectModel.mainCommodityClassificationModels,
        authentication: {
          user: $scope.startVariables.userRole
        }
      }, $scope));
      CommonService.waitingTranslation(toWait, $scope, loadCriterions, firstTimeLoadCriterion);
    }

    /* Get della lista dei paesi */
    const getCountries = function () {
      $scope.$emit('showLoading');
      MainService.getCountries()
        .then(function (response) {
          $scope.countries = response.data.payload;
          $scope.countriesToTranslate = [];
          for (var key in $scope.countries) {
            if ($scope.countries.hasOwnProperty(key)) {
              $scope.countriesToTranslate.push('country_' + $scope.countries[key].iso2Code);
            }
          }
          translatePage();
        })
    }

    /*Apre un tooltip al trigger del mouse*/
    $scope.triggerTooltip = function (id) {
      angular.element('#' + id).tooltip({
        placement: "top",
        html: true,
        trigger: "hover"
      });
    }

    $scope.goNext = function () {
      $scope.tryNextValidity = true;
      $scope.$broadcast('removeEmptyValues');
      setJson()
      $state.go('home.selection');
    }

    $scope.goBack = function () {
      setJson()
      $scope.$broadcast('removeEmptyValues');
      $state.go('home.procedure');
    }

    $scope.cancelModal = function () {
      $('#cancelModal').modal();
    }

    /*Torna alla pagina precedente e cancella tutte le informazioni di questa pagina e di quelle successive*/
    $scope.cancel = function () {
      $(".modal-backdrop").remove();
      var newJson = CancelService.cancel(MainService.getCountProgress());
      const allCriterionCodes = $scope.criterionsCodes.concat(SelectionService.getCriterionCodes());
      let cont = 0;
      while(cont<newJson.tenderingCriterionModels.length){
        if (allCriterionCodes.indexOf(newJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code) > -1) {
          newJson.tenderingCriterionModels.splice(cont, 1);
          if(cont!=0){
            cont--;
          }
        } else{
          cont ++;
        }
      }
      MainService.setApplicationJson(newJson);
      MainService.setCountProgress(2);
      MainService.emptyMaxActiveCountProgress();
      MainService.setMaxActiveCountProgress(2);
      $state.go('home.procedure');
    };

    const unbuildAllCriterions = function (json) {
      for (var criterion in json.tenderingCriterionModels) {
        json.tenderingCriterionModels[criterion] = CritCommon.unbuildCriterion(json.tenderingCriterionModels[criterion]);
      }
      return json;
    }

    /*Scarica l'xml attuale dal json applicativo*/
    $scope.downloadXml = function () {
      var appJsonBackup = angular.copy($scope.applicationJson);
      $scope.$broadcast('removeEmptyValues');
      var data = CommonService.prepareToDownload($scope);
      for (var code in $scope.criterionSelection) {
        if ($scope.criterionSelection[code]) {
          data.bean.tenderingCriterionModels.push(angular.copy($scope.criterions[code]));
        }
      }
      data.bean = unbuildAllCriterions(data.bean);
      if ($scope.startVariables.userRole != 'eo') {
        if (data.bean && data.bean.economicOperatorPartyModels) {
          delete data.bean['economicOperatorPartyModels'];
        }
      }
      MainService.downloadXml(data)
        .then(function (response) {
          CommonService.responseToByteArray(response, $scope);
          $scope.applicationJson = appJsonBackup;
        })
    }

    /*Controllo di validità sulle date*/
    $scope.periodValidation = function (start, end) {
      if (start != null && end != null) {
        if (start > end) {
          return true;
        }
        return false;
      } else {
        if (start < end) {
          return true;
        }
        return false;
      }
    }


    //////////////////////////////////////////--INIT--/////////////////////////////////////////////////
    $scope.$on('translatePage', function () {
      translatePage();
    });
    $scope.$on('setApplicationJson', function () {
      $scope.$broadcast('removeEmptyValues');
      setJson();
    });
    $scope.scrollDown = CommonService.scrollDown;
    $scope.scrollTop = CommonService.scrollTop;
    getCountries();
  }]);
