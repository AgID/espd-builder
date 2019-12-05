/* Solo in questa pagina, è gestita la selezione singola dei criterion da parte della CA,
  e il dovere di rispondere solo ai criteri selezionati da parte dell'EO */
angular.module('espdApp')
  .controller('SelectionController', ['$scope','AngularCommonService', 'EmptyModelService', 'CriterionParentService', 'ParentService', 'CommonService', 'SupportService',function ($scope,AngularCommonService, EmptyModelService, CriterionParentService,ParentService, CommonService, SupportService) {

    ////////////////////////////////////////////--Variables--///////////////////////////////////////////////////
    var CriterionParserCA = CriterionParentService.getCriterionParserCA();
    var CriterionParserEO = CriterionParentService.getCriterionParserEO();
    var CriterionParserCommon = CriterionParentService.getCriterionParserCommon();
    var MainService = ParentService.getMainService();
    var SelectionService = ParentService.getSelectionService();
    var ProcedureService = ParentService.getProcedureService();
    var CancelService = SupportService.getCancelService();
    var TranslateService = SupportService.getTranslateService();
    var $compile = AngularCommonService.getCompile();
    var $state = AngularCommonService.getState();
    $scope.CriterionParserCA = CriterionParserCA;
    $scope.CriterionParserEO = CriterionParserEO;
    var CritCommon = CriterionParserCommon;
    $scope.CommonService = CommonService;
    $scope.CriterionParserCommon = CriterionParserCommon;
    $scope.tryNextValidity = false;
    $scope.applicationJson = MainService.getApplicationJson();
    $scope.startVariables = MainService.getJsonStart();
    $scope.criterionsCodes = SelectionService.getCriterionCodes();
    $scope.criterionsCodesEO = [];
    if ($scope.startVariables.userRole == 'ca') {
      $scope.criterionMenu = $scope.criterionsCodes;
    } else {
      $scope.criterionMenu = $scope.criterionsCodesEO;
    }
    $scope.criterionSelection = {}
    $scope.criterions = {};
    $scope.afterSelectionPage = true;
    $scope.defaultLanguage = MainService.getDefaultLanguage().toUpperCase();
    var firstTimeLoadCriterion = true;
    var toWait = [];
    var isEmpty = true;
    if ($scope.startVariables.userRole == 'ca') {
      SelectionService.getAllCriterionSelected().allCriterionsSelected != undefined ? $scope.allCriterionsSelected = SelectionService.getAllCriterionSelected().allCriterionsSelected : $scope.allCriterionsSelected = true
    } else {
      $scope.allCriterionsSelected = true;
    }
    ////////////////////////////////////////////--Functions--///////////////////////////////////////////////////

    //get list...
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

    //get list...
    const getBooleanGUIControlType = function () {
      return ProcedureService.getBooleanGUIControlType(MainService.getDefaultLanguage())
        .then(function (response) {
          if ($scope.booleanGUIControlTypeList == undefined) {
            $scope.booleanGUIControlTypeList = response.data.payload;
          } else {
            for (let i = 0; i < $scope.booleanGUIControlTypeList.length; i++) {
              $scope.booleanGUIControlTypeList[i].translation = response.data.payload[i].translation
            }
          }
        })
    };
    //get list...
    const getRatioType = function () {
      return ProcedureService.getRatioType(MainService.getDefaultLanguage())
        .then(function (response) {
          if ($scope.ratioTypeList == undefined) {
            $scope.ratioTypeList = response.data.payload;
          } else {
            for (let i = 0; i < $scope.ratioTypeList.length; i++) {
              $scope.ratioTypeList[i].translation = response.data.payload[i].translation
            }
          }
        })
    };

    /* Carica i criteri e imposta a 'selezionati' quelli già presenti nel json applicativo*/
    const loadCriterions = function () {
      // SE UN CRITERION DI Selezione STA GIA' NELL'APPLICATIONJSON LO METTO NEI CRITERIONS
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
      MainService.getCriterions(
        $scope.criterionsCodes
      ).then(function (response) {
        //SE UN CRITERION DI Selezione NON STA GIA' NELL'APPLICATIONJSON LO BUILDO E LO METTO NEI CRITERIONS
        for (var criterion in response.data.payload) {
          if ($scope.criterions[CommonService.rebuildCriterionCode(response.data.payload[criterion].criterionTypeCodeModel.criterionElementType.code)] == undefined && $scope.startVariables.userRole == 'ca') {
            $scope.criterions[CommonService.rebuildCriterionCode(response.data.payload[criterion].criterionTypeCodeModel.criterionElementType.code)] = CritCommon.rebuildCriterion(response.data.payload[criterion]);
            $scope.criterionSelection[CommonService.rebuildCriterionCode(response.data.payload[criterion].criterionTypeCodeModel.criterionElementType.code)] = false;

          }
        }
        if ($scope.startVariables.userRole == 'ca') {
          for (var criterionIdEO in $scope.criterionsCodes) {
            var elEO = document.getElementById($scope.criterionsCodes[criterionIdEO]);
            var criterionCreatedEO;
            criterionCreatedEO = CriterionParserCA.build($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodes[criterionIdEO])], 'criterions.' + CommonService.rebuildCriterionCode($scope.criterionsCodes[criterionIdEO]), CommonService.rebuildCriterionCode($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodes[criterionIdEO])].criterionTypeCodeModel.criterionElementType.code));
            elEO.appendChild(criterionCreatedEO);
            $compile(criterionCreatedEO)($scope);
          }
        }
        if ($scope.startVariables.userRole == 'eo') {
          for (var criterionId in $scope.criterionsCodesEO) {
            var el = document.getElementById($scope.criterionsCodesEO[criterionId]);
            var criterionCreated;
            criterionCreated = CriterionParserEO.build($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodesEO[criterionId])], 'criterions.' + CommonService.rebuildCriterionCode($scope.criterionsCodesEO[criterionId]), CommonService.rebuildCriterionCode($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodesEO[criterionId])].criterionTypeCodeModel.criterionElementType.code));
            el.appendChild(criterionCreated);
            $compile(criterionCreated)($scope);
          }
        }
        firstTimeLoadCriterion = false;
        $scope.$emit('hideLoading');
      });
    }

    /* Traduce la pagina quando il MainController lancia l'evento di traduzione in broadcast ai suoi figli.
       Traduce inoltre la liste e ordina la lista dei paesi
    */
    const translatePage = function () {
      if (!MainService.getLoading()) {
        $scope.$emit('showLoading');
      }
      toWait.push(TranslateService.translateWithCodes(MainService.getDefaultLanguage(), $scope.countriesToTranslate).then(function (response) {
          for (var countryTransl in response.data.payload) {
            var isocode = countryTransl.split('_')[1];
            var getCountry = CommonService.getCountryByIsoCode(isocode, $scope.countries);
            getCountry.countryName = response.data.payload[countryTransl];
          }
          CommonService.bubbleSort($scope.countries, $scope.countries.length);
        }));
      toWait.push(TranslateService.translate(MainService.getDefaultLanguage())
        .then(function (response) {
          $scope.variablesTranslate = response.data.payload;
        }));
      toWait.push(getCurrencyType());
      toWait.push(MainService.getLotsList({
        listPplm: $scope.applicationJson.procurementProjectLotModels,
        authentication: {
          user: $scope.startVariables.userRole
        }
      }, $scope));
      toWait.push(MainService.getCpvsList({
        listCcm: $scope.applicationJson.procurementProjectModel.mainCommodityClassificationModels,
        authentication: {
          user: $scope.startVariables.userRole
        }
      }, $scope));
      toWait.push(getRatioType());
      toWait.push(getBooleanGUIControlType());
      CommonService.waitingTranslation(toWait, $scope, loadCriterions, firstTimeLoadCriterion);
    }

    const setJson = function () {
      // select all if no is checked
      if (!$scope.allCriterionsSelected) {
        for (var criterion in $scope.criterions) {
          if ($scope.criterionsCodes.indexOf($scope.criterions[criterion].criterionTypeCodeModel.criterionElementType.code) > -1) {
            $scope.criterionSelection[CommonService.rebuildCriterionCode($scope.criterions[criterion].criterionTypeCodeModel.criterionElementType.code)] = true;
          }
        }
      }
      for (var code in $scope.criterionSelection) {
        if ($scope.criterionSelection[code] == true) {
          $scope.applicationJson.tenderingCriterionModels.push(angular.copy($scope.criterions[code]));
        }
      }
      SelectionService.setBackup($scope.applicationJson);
      MainService.setApplicationJson($scope.applicationJson);
    }

    //Get list..
    const getCountries = function () {
      $scope.$emit('showLoading');
      MainService.getCountries()
        .then(function (response) {
          $scope.countries = response.data.payload;
          $scope.countriesToTranslate = [];
          for (var key in $scope.countries) {
            $scope.countriesToTranslate.push('country_' + $scope.countries[key].iso2Code);
          }
          translatePage();
        })
    }

    const unbuildAllCriterions = function (json) {
      for (var criterion in json.tenderingCriterionModels) {
        json.tenderingCriterionModels[criterion] = CritCommon.unbuildCriterion(json.tenderingCriterionModels[criterion]);
      }
      return json;
    }

    $scope.goNext = function () {
      SelectionService.setAllCriterionSelected({
        allCriterionsSelected: $scope.allCriterionsSelected
      })
      $scope.tryNextValidity = true;
      $scope.$broadcast('removeEmptyValues');
      setJson()
      $state.go('home.conclusion');
    }

    $scope.goBack = function () {
      SelectionService.setAllCriterionSelected({
        allCriterionsSelected: $scope.allCriterionsSelected
      })
      $scope.$broadcast('removeEmptyValues');
      setJson()
      $state.go('home.exclusion');
    }

    $scope.cancelModal = function () {
      $('#cancelModal').modal();
    }

    $scope.cancel = function () {
      $(".modal-backdrop").remove();
      var newJson = CancelService.cancel(MainService.getCountProgress());
      let cont=0;
      while(cont<newJson.tenderingCriterionModels.length){
        if ($scope.criterionsCodes.indexOf(newJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code) > -1) {
          newJson.tenderingCriterionModels.splice(cont, 1);
          if(cont!=0){
            cont--;
          }
        } else{
          cont++;
        }
      }
      MainService.setApplicationJson(newJson);
      MainService.setCountProgress(3);
      MainService.emptyMaxActiveCountProgress();
      MainService.setMaxActiveCountProgress(3);
      $state.go('home.exclusion');
    }

    /*Scarica l'xml attuale dal json applicativo e imposta come criteri di selezione soltanto quelli Selezionati*/
    $scope.downloadXml = function () {
      var appJsonBackup = angular.copy($scope.applicationJson);
      $scope.$broadcast('removeEmptyValues');
      var data = CommonService.prepareToDownload($scope);
      if (!$scope.allCriterionsSelected) {
        for (var criterion in $scope.criterions) {
          if ($scope.criterionsCodes.indexOf($scope.criterions[criterion].criterionTypeCodeModel.criterionElementType.code) > -1) {
            $scope.criterionSelection[CommonService.rebuildCriterionCode($scope.criterions[criterion].criterionTypeCodeModel.criterionElementType.code)] = true;
          }
        }
      }
      for (var code in $scope.criterionSelection) {
        if ($scope.criterionSelection[code] == true) {
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

    /* Ottiene una copia di backup di un json, data la chiave dell'ng-repeat */
    $scope.getJsonFromCriterion = function (key) {
      return angular.copy(CriterionParserCA.getItemOnRepeat()[key]);
    }

    /*Pusha un a parte di criterion in un dato path*/
    $scope.pushOnCriterion = function (path, obj) {
      path.push(obj);
    }

    /*Controllo validazione delle Date*/
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
      return false;
    }


    $scope.changeCriterionSelected = function (value) {
      $scope.allCriterionsSelected = value;
    }


    ////////////////////////////////////////////--Init--////////////////////////////////////////////////////////

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
