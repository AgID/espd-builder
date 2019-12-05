/*
  RIEPILOGO DELLE INFORMAZIONI INSERITE FINO AD ORA
  I METODI SONO GLI STESSI UTILIZZATI NELLE PAGINE PRECEDENTI
*/
angular.module('espdApp')
  .controller('OverviewController', ['$scope', 'MainService', 'ProcedureService', 'CommonService', 'OverviewService', 'TranslateService', 'ExclusionService', 'SelectionService', 'CriterionParserCA', 'CriterionParserEO', '$compile', '$state', '$window', '$q', 'CriterionParserCommon', function ($scope, MainService, ProcedureService, CommonService, OverviewService, TranslateService, ExclusionService, SelectionService, CriterionParserCA, CriterionParserEO, $compile, $state, $window, $q, CriterionParserCommon) {

    ///////////////////////////////---Variables--///////////////////////////////////////////
    $scope.CriterionParserCA = CriterionParserCA;
    $scope.CriterionParserEO = CriterionParserEO;
    var CritCommon = CriterionParserCommon;
    $scope.tryNextValidity = false;
    $scope.applicationJson = MainService.getApplicationJson();
    $scope.startVariables = MainService.getJsonStart();
    $scope.criterionsCodes = OverviewService.getCriterionCodes();
    $scope.defaultLanguage = MainService.getDefaultLanguage().toUpperCase();
    if ($scope.startVariables.userRole == "eo") {
      $scope.criterionsCodes.shift();
      if ($scope.applicationJson.economicOperatorPartyModels[0].economicOperatorRoleModel 
    		  && $scope.applicationJson.economicOperatorPartyModels[0].economicOperatorRoleModel.roleCodeModel.eoRoleType.code != 'SC'
    			  && $scope.applicationJson.economicOperatorPartyModels[0].economicOperatorRoleModel.roleCodeModel.eoRoleType.code != 'LE') {
        $scope.criterionsCodes.splice($scope.criterionsCodes.indexOf("CRITERION.OTHER.EO_DATA.RELIES_ON_OTHER_CAPACITIES"), 1);
      }
    }
    var firstTimeLoadCriterion = true;
    $scope.isOverview = true;
    $scope.criterionsCodesEO = [];
    $scope.criterions = {};
    $scope.criterionSelection = {};
    var isEmpty = true;
    var toWait = [];

    ///////////////////////////////--Functions--////////////////////////////////////////////

    const getDocRefContentTypeList = function () {
      return ProcedureService.getDocRefContentTypeList(MainService.getDefaultLanguage())
        .then(function (response) {
          if ($scope.docRefContentTypeList == undefined) { // PRIMO CARICAMENTO
            $scope.docRefContentTypeList = response.data.payload;
          } else {
            for (let i = 0; i < $scope.docRefContentTypeList.length; i++) {
              $scope.docRefContentTypeList[i].translations = response.data.payload[i].translations;
            }
          }
          //check if the code is popolated in the previous xml and update the translation
          for (var key in $scope.applicationJson.additionalDocumentReferenceModels) {
            if ($scope.applicationJson.additionalDocumentReferenceModels[key].documentTypeCodeModel != null && $scope.applicationJson.additionalDocumentReferenceModels[key].documentTypeCodeModel.docRefContentType.code != null)
              $scope.applicationJson.additionalDocumentReferenceModels[key].documentTypeCodeModel.docRefContentType.translation = CommonService.getDocRefByCode($scope.applicationJson.additionalDocumentReferenceModels[key].documentTypeCodeModel.docRefContentType.code, $scope.docRefContentTypeList);
          }
        });
    };

    const getProcedureType = function () {
      return ProcedureService.getProcedureType(MainService.getDefaultLanguage())
        .then(function (response) {
          if ($scope.procedureTypeList == undefined) {
            $scope.procedureTypeList = response.data.payload;
          } else {
            for (let i = 0; i < $scope.procedureTypeList.length; i++) {
              $scope.procedureTypeList[i].translation = response.data.payload[i].translation;
            }
          }
          if ($scope.applicationJson.procedureCodeModel.procedureType.code != null)
            $scope.applicationJson.procedureCodeModel.procedureType.name = $scope.procedureTypeList[CommonService.getIndexOnList($scope.applicationJson.procedureCodeModel.procedureType.code, $scope.procedureTypeList)].translation;
        })
    };
    //
    // const getProjectType = function () {
    //     return ProcedureService.getProjectType(MainService.getDefaultLanguage())
    //         .then(function (response) {
    //             if ($scope.projectTypeList == undefined) {
    //                 $scope.projectTypeList = response.data.payload;
    //             } else {
    //                 for (let i = 0; i < $scope.projectTypeList.length; i++) {
    //                     $scope.projectTypeList[i].translation = response.data.payload[i].translation;
    //                 }
    //             }
    //             if ($scope.applicationJson.procurementProjectModel && $scope.applicationJson.procurementProjectModel.procurementTypeCodeModel.projectType.code != null)
    //                 $scope.applicationJson.procurementProjectModel.procurementTypeCodeModel.projectType.name = $scope.projectTypeList[CommonService.getIndexOnList($scope.applicationJson.procurementProjectModel.procurementTypeCodeModel.projectType.code, $scope.projectTypeList)].translation;
    //         })
    // };

    const getRoleType = function () {
      return ProcedureService.getRoleType(MainService.getDefaultLanguage())
        .then(function (response) {
          if ($scope.roleTypeList == undefined) {
            $scope.roleTypeList = response.data.payload;
          } else {
            for (let i = 0; i < $scope.roleTypeList.length; i++) {
              $scope.roleTypeList[i].translation = response.data.payload[i].translation
            }
          }
        })
    };

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

    const getEoIDType = function () {
      return ProcedureService.getEoIDType(MainService.getDefaultLanguage())
        .then(function (response) {
          if ($scope.eoIDTypeList == undefined) {
            $scope.eoIDTypeList = response.data.payload;
          } else {
            for (let i = 0; i < $scope.eoIDTypeList.length; i++) {
              $scope.eoIDTypeList[i].translation = response.data.payload[i].translation
            }
          }
        })
    };

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

    const loadCriterions = function () {
      // SE UN CRITERION DI ESCLUSIONE STA GIA' NELL'APPLICATIONJSON LO METTO NEI CRITERIONS
      angular.element(document).ready(function () {
        let cont = 0;
        while (cont < $scope.applicationJson.tenderingCriterionModels.length) {
          if ($scope.criterionsCodes.indexOf($scope.applicationJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code) > -1) {
            $scope.criterions[CommonService.rebuildCriterionCode($scope.applicationJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code)] = angular.copy($scope.applicationJson.tenderingCriterionModels[cont]);
            isEmpty = false; // Serve a vedere se sono stati già selezionati criteri in precedenza
            $scope.criterionSelection[CommonService.rebuildCriterionCode($scope.applicationJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code)] = true;
            $scope.criterionsCodesEO.push($scope.applicationJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code);
            $scope.applicationJson.tenderingCriterionModels.splice(cont, 1);
            if(cont!=0){
              cont--;
            }
          } else {
            cont++;
          }
        }
        MainService.getCriterions(
          $scope.criterionsCodes
        ).then(function (response) {

          //SE UN CRITERION DI ESCLUSIONE NON STA GIA' NELL'APPLICATIONJSON LO BUILDO E LO METTO NEI CRITERIONS
          for (var criterion in response.data.payload) {
            if ($scope.criterions[CommonService.rebuildCriterionCode(response.data.payload[criterion].criterionTypeCodeModel.criterionElementType.code)] == undefined && $scope.startVariables.userRole == 'ca') {
              $scope.criterions[CommonService.rebuildCriterionCode(response.data.payload[criterion].criterionTypeCodeModel.criterionElementType.code)] = CritCommon.rebuildCriterion(response.data.payload[criterion]);
            }
          }
          $scope.criterionSelection = CommonService.fillSelectedCriterion(isEmpty, $scope.criterions, $scope.criterionSelection);
          if ($scope.startVariables.userRole == 'ca') {
            for (var criterionId in $scope.criterionsCodes) {
              var el = document.getElementById($scope.criterionsCodes[criterionId]);
              var criterionCreated = CriterionParserCA.build($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodes[criterionId])], 'criterions.' + CommonService.rebuildCriterionCode($scope.criterionsCodes[criterionId]), CommonService.rebuildCriterionCode($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodes[criterionId])].criterionTypeCodeModel.criterionElementType.code));
              if (!el) {
                console.log("");
              }
              el.appendChild(criterionCreated);
              $compile(criterionCreated)($scope);
            }
          }
          if ($scope.startVariables.userRole == 'eo') {
            for (var criterionId in $scope.criterionsCodesEO) {
              var el = document.getElementById($scope.criterionsCodesEO[criterionId]);
              var criterionCreated = CriterionParserEO.build($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodesEO[criterionId])], 'criterions.' + CommonService.rebuildCriterionCode($scope.criterionsCodesEO[criterionId]), CommonService.rebuildCriterionCode($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodesEO[criterionId])].criterionTypeCodeModel.criterionElementType.code));
              el.appendChild(criterionCreated);
              $compile(criterionCreated)($scope);
            }
          }
          firstTimeLoadCriterion = false;
          $scope.$emit('hideLoading');
        });
      });
    }

    const unbuildAllCriterions = function (json) {
      for (var criterion in json.tenderingCriterionModels) {
        CritCommon.unbuildCriterion(json.tenderingCriterionModels[criterion]);
      }
    }

    const translatePage = function () {
      if (!MainService.getLoading()) {
        $scope.$emit('showLoading');
      }
      toWait.push(TranslateService.translateWithCodes(MainService.getDefaultLanguage(), $scope.countriesToTranslate)
        .then(function (response) {
          for (var countryTransl in response.data.payload) {
            var isocode = countryTransl.split('_')[1];
            var getCountry = CommonService.getCountryByIsoCode(isocode, $scope.countries);
            getCountry.countryName = response.data.payload[countryTransl];
          }
          CommonService.bubbleSort($scope.countries, $scope.countries.length);
        }));
      TranslateService.translate(MainService.getDefaultLanguage())
        .then(function (response) {
          $scope.variablesTranslate = response.data.payload;
        });
      toWait.push(getDocRefContentTypeList());
      toWait.push(getProcedureType());
      toWait.push(ProcedureService.getProjectType(MainService.getDefaultLanguage(), $scope));
      toWait.push(getRoleType());
      toWait.push(getCurrencyType());
      toWait.push(ProcedureService.getBidType(MainService.getDefaultLanguage(), $scope));
      toWait.push(getRatioType());
      toWait.push(getBooleanGUIControlType());
      toWait.push(getEoIDType());
      if ($scope.startVariables.userRole == 'eo') {
        toWait.push(MainService.getLotsList({
          listPplm: $scope.applicationJson.procurementProjectLotModels,
          authentication: {
            user: $scope.startVariables.userRole
          }
        }, $scope));
      }
      CommonService.waitingTranslation(toWait, $scope, loadCriterions, firstTimeLoadCriterion);
    }


    $scope.nextDisabled = function () {
      return false;
    }

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
    };

    $scope.goBack = function () {
      $state.go('home.conclusion');
    }

    $scope.downloadXml = function () {
      var appJsonBackup = angular.copy($scope.applicationJson);
      $scope.$broadcast('removeEmptyValues');
      var data = CommonService.prepareToDownload($scope);
      if ($scope.startVariables.userRole == 'eo') {
        data.bean.economicOperatorPartyModels[0].partyModel.partyIdentificationModels[0].idModel.id += '_' + $scope.anotherVat;
      } else {
        if (data.bean && data.bean.economicOperatorPartyModels) {
          delete data.bean['economicOperatorPartyModels'];
        }
      }
      for (var code in $scope.criterionSelection) {
        if ($scope.criterionSelection[code] == true) {
          data.bean.tenderingCriterionModels.push(angular.copy($scope.criterions[code]));
        }
      }
      unbuildAllCriterions(data.bean);
      MainService.downloadXml(data)
        .then(function (response) {
          CommonService.responseToByteArray(response, $scope);
          $scope.applicationJson = appJsonBackup;
        });
    }

    $scope.getJsonFromCriterion = function (key) {
      return angular.copy(CriterionParserCA.getItemOnRepeat()[key]);
    }

    $scope.pushOnCriterion = function (path, obj) {
      path.push(obj);
    }

    $scope.rebuildCriterion = function (criterion) {
      return CommonService.rebuildCriterionCode(criterion);
    }

//////////////////////////////////--Init--//////////////////////////////////////////////
    $scope.$on('translatePage', function () {
      translatePage();
    });
    getCountries();
  }]);
