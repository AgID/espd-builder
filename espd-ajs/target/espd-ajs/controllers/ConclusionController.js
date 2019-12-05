angular.module('espdApp')
  .controller('ConclusionController', ['$scope', 'AngularCommonService', 'ParentService', 'CommonService', 'CriterionParentService', 'SupportService', function ($scope, AngularCommonService, ParentService, CommonService, CriterionParentService, SupportService) {

    ////////////////////////////////////////////---Variables---//////////////////////////////////////////////////////////
    var CriterionParserCA = CriterionParentService.getCriterionParserCA();
    var CriterionParserEO = CriterionParentService.getCriterionParserEO();
    var CriterionParserCommon = CriterionParentService.getCriterionParserCommon();
    var MainService = ParentService.getMainService();
    var ConclusionService = ParentService.getConclusionService();
    var CancelService = SupportService.getCancelService();
    var TranslateService = SupportService.getTranslateService();
    var $compile = AngularCommonService.getCompile();
    var $state = AngularCommonService.getState();
    $scope.CriterionParserCA = CriterionParserCA;
    $scope.CriterionParserEO = CriterionParserEO;
    $scope.CriterionParserCommon = CriterionParserCommon;
    var CritCommon = CriterionParserCommon;
    $scope.tryNextValidity = false;
    $scope.applicationJson = MainService.getApplicationJson();
    $scope.startVariables = MainService.getJsonStart();
    var toWait = [];
    $scope.criterionsCodesEO = ConclusionService.getCriterionCodesEO();
    $scope.criterionsCodes = ConclusionService.getCriterionCodes();
    $scope.criterionSelection = {}
    $scope.criterions = {};
    $scope.defaultLanguage = MainService.getDefaultLanguage().toUpperCase();
    var isEmpty = true;
    $scope.afterConclusionPage = true;
    var firstTimeLoadCriterion = true;

    ////////////////////////////////////////////---Functions---//////////////////////////////////////////////////////////

    const unbuildAllCriterions = function (json) {
      for (var criterion in json.tenderingCriterionModels) {
        json.tenderingCriterionModels[criterion] = CritCommon.unbuildCriterion(json.tenderingCriterionModels[criterion]);
      }
      return json;
    }

    /* SET JSON */

    const setJson = function () {
      for (let i = 0; i < $scope.criterionSelection.length; i++) {
        $scope.applicationJson.tenderingCriterionModels.push(angular.copy($scope.criterions[i]));
      }
      ConclusionService.setBackup($scope.applicationJson);
      MainService.setApplicationJson($scope.applicationJson);
    }

    /* LOAD Criterions */
    const loadCriterions = function () {
      // SE UN CRITERION DI ESCLUSIONE STA GIA' NELL'APPLICATIONJSON LO METTO NEI CRITERIONS
      let cont = 0;
      while (cont < $scope.applicationJson.tenderingCriterionModels.length) {
        if ($scope.criterionsCodes.indexOf($scope.applicationJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code) > -1) {
          $scope.criterions[CommonService.rebuildCriterionCode($scope.applicationJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code)] = angular.copy($scope.applicationJson.tenderingCriterionModels[cont]);
          isEmpty = false; // Serve a vedere se sono stati già selezionati criteri in precedenza
          $scope.criterionSelection[CommonService.rebuildCriterionCode($scope.applicationJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code)] = true;
          $scope.applicationJson.tenderingCriterionModels.splice(cont, 1);
          if(cont!=0){
            cont--;
          }
        } else {
          cont++;
        }
      }
      MainService.getCriterions(
        $scope.criterionsCodesEO
      ).then(function (response) {
        //SE UN CRITERION DI ESCLUSIONE NON STA GIA' NELL'APPLICATIONJSON LO BUILDO E LO METTO NEI CRITERIONS
        for (var criterion in response.data.payload) {
          if ($scope.criterions[CommonService.rebuildCriterionCode(response.data.payload[criterion].criterionTypeCodeModel.criterionElementType.code)] == undefined) {
            $scope.criterions[CommonService.rebuildCriterionCode(response.data.payload[criterion].criterionTypeCodeModel.criterionElementType.code)] = CritCommon.rebuildCriterion(response.data.payload[criterion]);
          }
        }
        $scope.criterionSelection = CommonService.fillSelectedCriterion(isEmpty, $scope.criterions, $scope.criterionSelection);
        if ($scope.startVariables.userRole == 'ca') {
          for (let criterionId = 0; criterionId < $scope.criterionsCodes.length; criterionId++) {
            const el = document.getElementById($scope.criterionsCodes[criterionId]);
            const criterionCreated = CriterionParserCA.build($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodes[criterionId])], 'criterions.' + CommonService.rebuildCriterionCode($scope.criterionsCodes[criterionId]), CommonService.rebuildCriterionCode($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodes[criterionId])].criterionTypeCodeModel.criterionElementType.code));
            if (el != null) {
              el.appendChild(criterionCreated);
              $compile(criterionCreated)($scope);
            }
          }
        }
        if ($scope.startVariables.userRole == 'eo') {
          for (let criterionId = 0; criterionId < $scope.criterionsCodesEO.length; criterionId++) {
            const el = document.getElementById($scope.criterionsCodesEO[criterionId]);
            const criterionCreated = CriterionParserEO.build($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodesEO[criterionId])], 'criterions.' + CommonService.rebuildCriterionCode($scope.criterionsCodesEO[criterionId]), CommonService.rebuildCriterionCode($scope.criterions[CommonService.rebuildCriterionCode($scope.criterionsCodesEO[criterionId])].criterionTypeCodeModel.criterionElementType.code));
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
      toWait.push(MainService.getCpvsList({
        listCcm: $scope.applicationJson.procurementProjectModel.mainCommodityClassificationModels,
        authentication: {
          user: $scope.startVariables.userRole
        }
      }, $scope));
      CommonService.waitingTranslation(toWait, $scope, loadCriterions, firstTimeLoadCriterion);
    }


    /* Ottiene una copia di backup di un json, data la chiave dell'ng-repeat */
    $scope.getJsonFromCriterion = function (key) {
      return angular.copy(CriterionParserCA.getItemOnRepeat()[key]);
    }

    /*Pusha un a parte di criterion in un dato path*/
    $scope.pushOnCriterion = function (path, obj) {
      path.push(obj);
    }

    $scope.goBack = function () {
      $scope.$broadcast('removeEmptyValues');
      setJson()
      $state.go('home.selection');
    }

    $scope.cancelModal = function () {
      $('#cancelModal').modal();
    }

    $scope.cancel = function () {
      $(".modal-backdrop").remove();
      var newJson = CancelService.cancel(MainService.getCountProgress());
      MainService.setApplicationJson(newJson);
      MainService.setJsonStart({});
      MainService.setCountProgress(1);
      MainService.emptyMaxActiveCountProgress();
      MainService.setMaxActiveCountProgress(1);
      $state.go('home.start');
    }

    /*Scarica l'xml attuale dal json applicativo*/
    $scope.downloadXml = function () {
      var appJsonBackup = angular.copy($scope.applicationJson);
      $scope.$broadcast('removeEmptyValues');
      var data = CommonService.prepareToDownload($scope);
      for (let code = 0; code < $scope.criterionSelection.length; code++) {
        data.bean.tenderingCriterionModels.push(angular.copy($scope.criterions[code]));
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

    $scope.goOverview = function () {
      $scope.tryNextValidity = true;
      $scope.$broadcast('removeEmptyValues');
      setJson();
      $state.go('home.overview')
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
    }

    ////////////////////////////////////////////---Init---///////////////////////////////////////////////////////////////

    $scope.$on('translatePage', function () {
      translatePage();
    });
    $scope.$on('setApplicationJson', function () {
      $scope.$broadcast('removeEmptyValues');
      setJson();
    });
    translatePage();

  }]);
