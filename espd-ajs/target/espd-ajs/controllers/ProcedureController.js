angular.module('espdApp')
  .controller('ProcedureController', ['$scope', 'ParentService', 'CriterionParentService', 'AngularCommonService', 'EmptyModelService', 'CommonService', 'SupportService', function ($scope, ParentService, CriterionParentService, AngularCommonService, EmptyModelService, CommonService, SupportService) {


    // /////////////////////////////---Variables--///////////////////////////////////////////
    var CriterionParserCA = CriterionParentService.getCriterionParserCA();
    var CriterionParserEO = CriterionParentService.getCriterionParserEO();
    var CriterionParserCommon = CriterionParentService.getCriterionParserCommon();
    var MainService = ParentService.getMainService();
    var ProcedureService = ParentService.getProcedureService();
    var CancelService = SupportService.getCancelService();
    var TranslateService = SupportService.getTranslateService();
    var $compile = AngularCommonService.getCompile();
    var $state = AngularCommonService.getState();
    var $window = AngularCommonService.getWindow();
    var cvpCodeEmpty = EmptyModelService.getCvpCodeEmpty();
    var rappresentanteEmpty = EmptyModelService.getRappresentanteEmpty();
    var procurementProjectLotModel = EmptyModelService.getProcurementProjectLotModel();
    $scope.CriterionParserCA = CriterionParserCA;
    $scope.CriterionParserEO = CriterionParserEO;
    $scope.CriterionParserCommon = CriterionParserCommon;
    var CritCommon = CriterionParserCommon;
    var toWait = [];
    $scope.tryNextValidity = false;
    $scope.numeroLotti = 0;
    $scope.CommonService = CommonService;
    $scope.criterionParser = CriterionParserCA;
    $scope.startVariables = MainService.getJsonStart();
    $scope.applicationJson = MainService.getApplicationJson();
    $scope.selectedLotti = [];
    $scope.numeroLotti = $scope.applicationJson.procurementProjectLotModels.length;
    $scope.criterionsCodesCA = ProcedureService.getCriterionCodesCA();
    $scope.criterionsCodesEO = ProcedureService.getCriterionCodesEO();
    $scope.criterionSelection = {}
    $scope.cpvsCodiciInseriti = [];
    $scope.cigCode = [];
    $scope.cigCodeOld = [];
    $scope.defaultLanguage = MainService.getDefaultLanguage().toUpperCase();
    //Registro in una variabile i codici CPV inseriti in precedenza se ci sono
    if ($scope.applicationJson.procurementProjectModel && $scope.applicationJson.procurementProjectModel.mainCommodityClassificationModels) {
      for (let key = 0; key < $scope.applicationJson.procurementProjectModel.mainCommodityClassificationModels.length; key++) {
        $scope.cpvsCodiciInseriti.push($scope.applicationJson.procurementProjectModel.mainCommodityClassificationModels[key].code);
      }
    }
    $scope.filterCpvCode = "";
    $scope.filterCpvDescription = "";
    if ($scope.startVariables.userRole == 'eo') {
      if ($scope.applicationJson.economicOperatorPartyModels && $scope.applicationJson.economicOperatorPartyModels[0].partyModel.powerOfAttorneyModels.length == 0) {
        $scope.applicationJson.economicOperatorPartyModels[0].partyModel.powerOfAttorneyModels.push(rappresentanteEmpty);
      }
    }
    var firstTimeLoadCriterion = true;
    if ($scope.startVariables.userRole == 'eo') {
      $scope.anotherVat = $scope.applicationJson.economicOperatorPartyModels[0].partyModel.partyIdentificationModels[0].idModel.id.split('_')[1];
      if ($scope.anotherVat == undefined) {
        $scope.anotherVat = '';
      }
      $scope.applicationJson.economicOperatorPartyModels[0].partyModel.partyIdentificationModels[0].idModel.id = $scope.applicationJson.economicOperatorPartyModels[0].partyModel.partyIdentificationModels[0].idModel.id.split('_')[0];
      $scope.rappresentanteBackup = angular.copy($scope.applicationJson.economicOperatorPartyModels[0].partyModel.powerOfAttorneyModels[0]);
    }

    $scope.uiMaskOptions = {
      clearOnBlur: false
    }

    // /////////////////////////////--Functions--////////////////////////////////////////////

    String.prototype.splice = function (idx, rem, str) {
      return this.slice(0, idx) + str + this.slice(idx + Math.abs(rem));
    };

    /* Salva una copia di backup del json dell'applicativo */
    const setJsonEO = function () {
        $scope.applicationJson.economicOperatorPartyModels[0].partyModel.partyIdentificationModels[0].idModel.id += '_' + $scope.anotherVat;
    }

    const setJsonCA = function () {
        let cont = 0;
        while (cont < $scope.applicationJson.tenderingCriterionModels.length) {
          if ($scope.criterionsCodesCA.indexOf($scope.applicationJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code) > -1 && $scope.criterionSelection[CommonService.rebuildCriterionCode($scope.applicationJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code)] == false) {
            $scope.applicationJson.tenderingCriterionModels.splice(cont, 1);
            if(cont!=0){
              cont--;
            }
          } else {
            cont++;
          }
        }
    }

    const setJson = function () {
      // set anotherVat in the applicationJson
      if ($scope.startVariables.userRole == 'eo') {
//    	  $scope.applicationJson.economicOperatorPartyModels[0].partyModel.partyIdentificationModels[0].idModel.id += '_' + $scope.anotherVat;
    	  setJsonEO();
      }
      // Remove criterion not checked
      if ($scope.startVariables.userRole == 'ca') {
//        let cont = 0;
//        while (cont < $scope.applicationJson.tenderingCriterionModels.length) {
//          if ($scope.criterionsCodesCA.indexOf($scope.applicationJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code) > -1 && $scope.criterionSelection[CommonService.rebuildCriterionCode($scope.applicationJson.tenderingCriterionModels[cont].criterionTypeCodeModel.criterionElementType.code)] == false) {
//            $scope.applicationJson.tenderingCriterionModels.splice(cont, 1);
//            if(cont!=0){
//              cont--;
//            }
//          } else {
//            cont++;
//          }
//        }
    	  setJsonCA();
      }
      ProcedureService.setBackup($scope.applicationJson);
      MainService.setApplicationJson($scope.applicationJson);
    }

    /* START CodeList */

    /* Get della lista DocRefContentType e traduzione*/
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
          // check if the code is popolated in the previous xml and update the
          // translation
          for (let key = 0; key < $scope.applicationJson.additionalDocumentReferenceModels.length; key++) {
            if ($scope.applicationJson.additionalDocumentReferenceModels[key].documentTypeCodeModel != null && $scope.applicationJson.additionalDocumentReferenceModels[key].documentTypeCodeModel.docRefContentType.code != null)
              $scope.applicationJson.additionalDocumentReferenceModels[key].documentTypeCodeModel.docRefContentType.translation = CommonService.getDocRefByCode($scope.applicationJson.additionalDocumentReferenceModels[key].documentTypeCodeModel.docRefContentType.code, $scope.docRefContentTypeList);
          }
        });
    }

    /* Get della lista EoIndustryClassificationCode e traduzione*/
    const getEoIndustryClassificationCodeList = function () {
      return ProcedureService.getEoIndustryClassificationCodeList(MainService.getDefaultLanguage())
        .then(function (response) {
          //First loading
          if ($scope.eoIndustryClassificationCodeList == undefined) {
            $scope.eoIndustryClassificationCodeList = response.data.payload;
          } else {
            for (let i = 0; i < $scope.eoIndustryClassificationCodeList.length; i++) {
              $scope.eoIndustryClassificationCodeList[i].translation = response.data.payload[i].translation;
            }
          }
          if ($scope.startVariables.userRole == "eo") {
            if ($scope.applicationJson.economicOperatorPartyModels[0].partyModel.industryClassificationCodeModel != null
              && $scope.applicationJson.economicOperatorPartyModels[0].partyModel.industryClassificationCodeModel.eoIndustryClassificationCode.code != null) {
                $scope.applicationJson.economicOperatorPartyModels[0].partyModel.industryClassificationCodeModel.eoIndustryClassificationCode.name = $scope.eoIndustryClassificationCodeList[CommonService.getIndexOnList($scope.applicationJson.economicOperatorPartyModels[0].partyModel.industryClassificationCodeModel.eoIndustryClassificationCode.code, $scope.eoIndustryClassificationCodeList)].translation;
            }
          }
        });
    }

    /* Get della lista ProcedureType e traduzione*/
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
          if ($scope.applicationJson.procedureCodeModel && $scope.applicationJson.procedureCodeModel.procedureType.code != null)
            $scope.applicationJson.procedureCodeModel.procedureType.name = $scope.procedureTypeList[CommonService.getIndexOnList($scope.applicationJson.procedureCodeModel.procedureType.code, $scope.procedureTypeList)].translation;
        })
    };

    /* Get della lista CPV e traduzione*/
    const getCPVCodesList = function () {
      return ProcedureService.getCPVCodesList(MainService.getDefaultLanguage()).then(function (response) {
        if ($scope.cpvCodesList == undefined) {
          $scope.cpvCodesList = response.data.payload;
          $scope.cpvsCodici = [];
        } else {
          for (let i = 0; i < $scope.cpvCodesList.length; i++) {
            $scope.cpvCodesList[i].translation = response.data.payload[i].translation
          }
        }
      });
    };

    /* Get della lista RoleType e traduzione*/
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
          if ($scope.startVariables.userRole == "eo") {
            if ($scope.applicationJson.economicOperatorPartyModels[0].economicOperatorRoleModel && $scope.applicationJson.economicOperatorPartyModels[0].economicOperatorRoleModel != null
              && $scope.applicationJson.economicOperatorPartyModels[0].economicOperatorRoleModel.roleCodeModel.eoRoleType.code != null) {
              $scope.applicationJson.economicOperatorPartyModels[0].economicOperatorRoleModel.roleDescriptions[0] = $scope.roleTypeList[CommonService.getIndexOnList($scope.applicationJson.economicOperatorPartyModels[0].economicOperatorRoleModel.roleCodeModel.eoRoleType.code, $scope.roleTypeList)].description;
              $scope.applicationJson.economicOperatorPartyModels[0].economicOperatorRoleModel.roleCodeModel.eoRoleType.name = $scope.roleTypeList[CommonService.getIndexOnList($scope.applicationJson.economicOperatorPartyModels[0].economicOperatorRoleModel.roleCodeModel.eoRoleType.code, $scope.roleTypeList)].translation;
            }
          }
        })
    };

    /* Get della lista RatioType e traduzione*/
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

    /* Get della lista EoIDType e traduzione*/
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

    /* END CodeList */

    /* LOAD Criterions */

    /* Builda un criterion esistente nel json dell'applicativo(a seconda del ruolo) e lo compila */
    const buildExistingCriterion = function (exists, existsCriterion, criterion, response, el) {
      $scope.criterionSelection[CommonService.rebuildCriterionCode(response.data.payload[criterion].criterionTypeCodeModel.criterionElementType.code)] = true;
      var criterionLotsSubmission;
      if ($scope.startVariables.userRole == 'ca') {
        criterionLotsSubmission = CriterionParserCA.build($scope.applicationJson.tenderingCriterionModels[existsCriterion], 'applicationJson.tenderingCriterionModels[' + existsCriterion + ']', $scope.applicationJson.tenderingCriterionModels[existsCriterion].criterionTypeCodeModel.criterionElementType.code, true);
      }
      if ($scope.startVariables.userRole == 'eo') {
        criterionLotsSubmission = CriterionParserEO.build($scope.applicationJson.tenderingCriterionModels[existsCriterion], 'applicationJson.tenderingCriterionModels[' + existsCriterion + ']', $scope.applicationJson.tenderingCriterionModels[existsCriterion].criterionTypeCodeModel.criterionElementType.code, true);
      }
      el.appendChild(criterionLotsSubmission);
      $compile(criterionLotsSubmission)($scope);
    }

    /* REBUILDA un criterion non presente ancora nel json dell'applicativo (a seconda del ruolo) e lo compila */
    const buildNotExistingCriterion = function (criterion, response, el) {
      $scope.criterionSelection[CommonService.rebuildCriterionCode(response.data.payload[criterion].criterionTypeCodeModel.criterionElementType.code)] = false;
      $scope.applicationJson.tenderingCriterionModels.push(CritCommon.rebuildCriterion(response.data.payload[criterion]));
      var path = 'applicationJson.tenderingCriterionModels[';
      path += $scope.applicationJson.tenderingCriterionModels.length - 1 + ']';
      var criterionLotsSubmission;
      if ($scope.startVariables.userRole == 'ca') {
        criterionLotsSubmission = CriterionParserCA.build(response.data.payload[criterion], path, response.data.payload[criterion].criterionTypeCodeModel.criterionElementType.code, true);
      }
      if ($scope.startVariables.userRole == 'eo') {
        criterionLotsSubmission = CriterionParserEO.build(response.data.payload[criterion], path, response.data.payload[criterion].criterionTypeCodeModel.criterionElementType.code, true);
      }
      el.appendChild(criterionLotsSubmission);
      $compile(criterionLotsSubmission)($scope);
    }

    /* Inizializzazione dei criterion */
    const loadCriterions = function () {
      var criterions;
      if ($scope.startVariables.userRole == 'ca') {
        criterions = $scope.criterionsCodesCA;
      } else {
        criterions = $scope.criterionsCodesEO;
      }
      MainService.getCriterions(
        criterions
      ).then(function (response) {
        // PER OGNI CRITERION CONTROLLO SE ESISTE GIA' NEL JSON
        for (let criterion = 0; criterion < response.data.payload.length; criterion++) {
          var exists = false;
          var el = document.getElementById(response.data.payload[criterion].criterionTypeCodeModel.criterionElementType.code);
          for (let existsCriterion = 0; existsCriterion < $scope.applicationJson.tenderingCriterionModels.length; existsCriterion++) {
            if (response.data.payload[criterion].criterionTypeCodeModel.criterionElementType.code == $scope.applicationJson.tenderingCriterionModels[existsCriterion].criterionTypeCodeModel.criterionElementType.code) {
              exists = true;
              buildExistingCriterion(exists, existsCriterion, criterion, response, el);
            }
          }
          if (!exists) {
            buildNotExistingCriterion(criterion, response, el)
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
      TranslateService.translate(MainService.getDefaultLanguage())
        .then(function (response) {
          $scope.variablesTranslate = response.data.payload;
        });
      TranslateService.translateWithCodes(MainService.getDefaultLanguage(), $scope.countriesToTranslate)
        .then(function (response) {
          for (let countryTransl in response.data.payload) {
            if (response.data.payload.hasOwnProperty(countryTransl)) {
              var isocode = countryTransl.split('_')[1];
              var getCountry = CommonService.getCountryByIsoCode(isocode, $scope.countries);
              getCountry.countryName = response.data.payload[countryTransl];
            }
          }
          CommonService.bubbleSort($scope.countries, $scope.countries.length);
          if ($scope.applicationJson.contractingPartyModels[0].partyModel.addressModel.countryModel) {
            if ($scope.countries[CommonService.getCountryIndex($scope.applicationJson.contractingPartyModels[0].partyModel.addressModel.countryModel.identificationCodeModel.countryCodeIdentifier.code, $scope.countries)]) {
              $scope.applicationJson.contractingPartyModels[0].partyModel.addressModel.countryModel.name = $scope.countries[CommonService.getCountryIndex($scope.applicationJson.contractingPartyModels[0].partyModel.addressModel.countryModel.identificationCodeModel.countryCodeIdentifier.code, $scope.countries)].countryName;
            }
          }
        });
      toWait.push(getDocRefContentTypeList());
      toWait.push(getProcedureType());
      toWait.push(ProcedureService.getProjectType(MainService.getDefaultLanguage(), $scope));
      toWait.push(getRoleType());
      toWait.push(getCurrencyType());
      toWait.push(ProcedureService.getBidType(MainService.getDefaultLanguage(), $scope));
      toWait.push(getRatioType());
      toWait.push(getEoIndustryClassificationCodeList());
      toWait.push(getCPVCodesList());
      toWait.push(MainService.getCpvsList({
        listCcm: $scope.applicationJson.procurementProjectModel.mainCommodityClassificationModels,
        authentication: {
          user: $scope.startVariables.userRole
        }
      }, $scope));
      toWait.push(getEoIDType());
      if ($scope.startVariables.userRole == 'eo') {
        toWait.push(MainService.getLotsList({
          listPplm: $scope.applicationJson.procurementProjectLotModels,
          authentication: {
            user: $scope.startVariables.userRole
          }
        }, $scope));
      }
      // Carica i criterion una volta completata la traduzione (Sonar :D)
      CommonService.waitingTranslation(toWait, $scope, loadCriterions, firstTimeLoadCriterion);
    }

    /* Get della lista dei paesi */
    const getCountries = function () {
      $scope.$emit('showLoading');
      MainService.getCountries()
        .then(function (response) {
          $scope.countries = response.data.payload;
          $scope.countriesToTranslate = [];
          for (let key = 0; key < $scope.countries.length; key++) {
            $scope.countriesToTranslate.push('country_' + $scope.countries[key].iso2Code);
          }
          translatePage();
        })
    }

    /* Serve a ricercare un CPV per codice o per descrizione*/
    const filterCpvBothValues = function () {
      if ($scope.filterCpvCode.length < 3 || $scope.filterCpvDescription.length < 5) {
        if ($scope.filterCpvCode.length < 3) {
          $scope.cpvFilterCodeError = true;
        }
        if ($scope.filterCpvDescription.length < 5) {
          $scope.cpvFilterDescriptionError = true;
        }
        return;
      } else {
        $scope.cpvFilterCodeError = false;
        $scope.cpvFilterDescriptionError = false;
        for (var i = 0; i < $scope.cpvCodesList.length; i++) {
          if ($scope.cpvCodesList[i].code.indexOf($scope.filterCpvCode) != -1 && $scope.cpvCodesList[i].translation.indexOf($scope.filterCpvDescription) != -1 && $scope.cpvsCodiciInseriti.indexOf($scope.cpvCodesList[i].code) == -1) {
            $scope.filteredCpvList.push($scope.cpvCodesList[i]);
          }
        }
      }
    }
    /* Serve a ricercare un CPV per codice*/
    const filterCpvFirstValue = function () {
      if ($scope.filterCpvCode.length < 3) {
        if ($scope.filterCpvCode.length < 3) {
          $scope.cpvFilterCodeError = true;
        }
        return;
      } else {
        $scope.cpvFilterCodeError = false;
        $scope.cpvFilterDescriptionError = false;
        for (var i = 0; i < $scope.cpvCodesList.length; i++) {
          if ($scope.cpvCodesList[i].code.indexOf($scope.filterCpvCode) > -1 && $scope.cpvsCodiciInseriti.indexOf($scope.cpvCodesList[i].code) == -1) {
            $scope.filteredCpvList.push($scope.cpvCodesList[i]);
          }
        }
      }
    }

    /* Serve a ricercare un CPV per descrizione*/
    const filterCpvSecondValue = function () {
      if ($scope.filterCpvDescription.length < 5) {
        if ($scope.filterCpvDescription.length < 5) {
          $scope.cpvFilterDescriptionError = true;
        }
        return;
      } else {
        $scope.cpvFilterCodeError = false;
        $scope.cpvFilterDescriptionError = false;
        for (var i = 0; i < $scope.cpvCodesList.length; i++) {
          if ($scope.cpvCodesList[i].translation && $scope.cpvCodesList[i].translation.indexOf($scope.filterCpvDescription) != -1 && $scope.cpvsCodiciInseriti.indexOf($scope.cpvCodesList[i].code) == -1) {
            $scope.filteredCpvList.push($scope.cpvCodesList[i]);
          }
        }
      }
    }

    /* Serve a ricercare un CPV e switcha a seconda del caso*/
    $scope.filterCpvList = function () {
      $scope.filteredCpvList = [];
      // CASO ENTRAMBI VALORIZZATI
      if ($scope.filterCpvCode != "" && $scope.filterCpvDescription != "") {
        filterCpvBothValues()
      }
      if ($scope.filterCpvCode != "" && $scope.filterCpvDescription == "") {
        filterCpvFirstValue()
      }
      if ($scope.filterCpvCode == "" && $scope.filterCpvDescription != "") {
        filterCpvSecondValue()
      }
    }

    /*Aggiunge un CPV al json applicativo*/
    $scope.addCpv = function (cpv, index) {
      $scope.filteredCpvList.splice(index, 1);
      var cpvTransformed = angular.copy(cvpCodeEmpty);
      cpvTransformed.itemClassificationCodeModel.itemClassificationCode = cpv.code;
      cpvTransformed.itemClassificationCodeModel.name = cpv.translation;
      $scope.applicationJson.procurementProjectModel.mainCommodityClassificationModels.push(cpvTransformed);
      $scope.cpvsCodiciInseriti.push(cpv.code);
    }

    $scope.addSectionPub = function () {
      var infoPub = angular.copy($scope.applicationJson.additionalDocumentReferenceModels[0]);
      infoPub.documentTypeCodeModel.docRefContentType.code = null;
      infoPub.attachmentModel.externalReferenceModel.fileName = null;
      infoPub.attachmentModel.externalReferenceModel.descriptionModels[0] = {description: null};
      infoPub.attachmentModel.externalReferenceModel.descriptionModels[1] = {description: null};
      infoPub.idModel.id = null;
      infoPub.attachmentModel.externalReferenceModel.uriModel.uri = null;
      $scope.applicationJson.additionalDocumentReferenceModels.push(infoPub);
    }

    /* Apre la modal di ricerca CPV */
    $scope.addCVPCode = function () {
      $('#cpvModal').modal({
        backdrop: 'static',
        keyboard: false
      });
    }

    /*Cancella i filtri di ricerca CPV*/
    $scope.removeCpvFilters = function () {
      $scope.filterCpvCode = "";
      $scope.filterCpvDescription = "";
      $scope.filteredCpvList = [];
    }

    /*Rimuove un CPV inserito*/
    $scope.removeCpvFromInserted = function (code) {
      let cont =0;
      while(cont<$scope.cpvsCodiciInseriti.length){
        if (code == $scope.cpvsCodiciInseriti[cont]) {
          $scope.cpvsCodiciInseriti.splice(cont, 1);
          if(cont!=0){
            cont--;
          }
        } else {
          cont++;
        }
      }
    }

    /* Setta il CIG CODE di un lotto nella maniera corretta per il BE */
    const getCig = function () {
      $scope.removeCig();
      for (var i = 0; i < $scope.applicationJson.procurementProjectLotModels.length; i++) {
        var lotModel = $scope.applicationJson.procurementProjectLotModels[i];
        if (lotModel && lotModel.idModel && lotModel.idModel.id) {
          var cigSplit = lotModel.idModel.id.split('_');
          if (cigSplit.length == 2) {
            $scope.cigCode[i] = cigSplit[1];
            $scope.cigCodeOld[i] = cigSplit[1];
          }
        }
      }
    }

    /* Imposta i lotti nella maniera 'IDLOTTO'_'CIG' */
    $scope.setLotti = function () {
      $scope.applicationJson.procurementProjectLotModels = [];
      for (var i = 0; i < $scope.numeroLotti; i++) {
        var lotModel = angular.copy(procurementProjectLotModel);
        lotModel.idModel.id = "Lotto" + (i + 1) + ($scope.cigCodeOld[i] ? "_" + $scope.cigCodeOld[i] : "");
        $scope.applicationJson.procurementProjectLotModels.push(lotModel);
      }
      getCig();
      /* Codice sotto non so se utile */
      $scope.lotti = [];
      for (let lotto = 0; lotto < $scope.applicationJson.procurementProjectLotModels.length; lotto++) {
        $scope.lotti.push($scope.applicationJson.procurementProjectLotModels[lotto].idModel.id);
      }
    }

    /* Modal di settaggio dei CIG per i lotti */
    $scope.openCIG = function () {
      $('#cigModal').modal({
        backdrop: 'static',
        keyboard: false
      });
    }

    /* Salva un cig inserito */
    $scope.saveCig = function () {
      for (var i = 0; i < $scope.applicationJson.procurementProjectLotModels.length; i++) {
        var lotModel = $scope.applicationJson.procurementProjectLotModels[i];
        if (lotModel && lotModel.idModel && lotModel.idModel.id) {
          $scope.applicationJson.procurementProjectLotModels[i].idModel.id =
            lotModel.idModel.id.split('_')[0] + ($scope.cigCode[i] ? "_" + $scope.cigCode[i] : "");
        }
      }
    }

    $scope.reloadCig = function () {
      getCig();
    }

    /* Rimuove un cig inserito */
    $scope.removeCig = function () {
      $scope.cigCode = [];
      $scope.cigCodeOld = [];
    }

    $scope.removeCigAndRebase = function (index) {
      $scope.applicationJson.procurementProjectLotModels.splice(index, 1);
      $scope.cigCode.splice(index, 1);
      $scope.cigCodeOld.splice(index, 1);
      $scope.numeroLotti = $scope.numeroLotti - 1;
      getCig();
      $scope.setLotti();
    }

    /** Fine CIG * */

    /*Apre un tooltip al trigger del mouse*/
    $scope.triggerTooltip = function (id) {
      angular.element('#' + id).tooltip({
        placement: "top",
        html: true,
        trigger: "hover"
      });
    }

    /* Pusha un nuovo json vuoto di un rappresentante nel json applicativo*/
    $scope.addRappresentante = function () {
      $scope.applicationJson.economicOperatorPartyModels[0].partyModel.powerOfAttorneyModels.push(angular.copy(rappresentanteEmpty));
    }

    $scope.checkCollapsed = function (id) {
      var el = document.getElementById(id);
      if (el.classList.contains('collapsed')) {
        return true;
      }
      return false;
    }

    /*Controllo di mutua esclusione tra VAT e ANOTHER_VAT*/
    const checkVat = function () {
      var vat = document.getElementById('createeo_vat');
      var anotherVat = document.getElementById('createeo_another_vat');
      if ($scope.applicationJson.economicOperatorPartyModels[0].partyModel.partyIdentificationModels[0].idModel.id != '' || ($scope.anotherVat != '' && $scope.anotherVat != undefined)) {
        vat.classList.remove('ng-invalid');
        anotherVat.classList.add('ng-valid');
        anotherVat.classList.remove('ng-invalid');
        vat.classList.add('ng-valid');
        return true;
      } else {
        anotherVat.classList.add('ng-invalid');
        anotherVat.classList.remove('ng-valid');
        vat.classList.add('ng-invalid');
        vat.classList.remove('ng-valid');
        return false;
      }
    }

    /*UNBUILDA I CRITERION  (Concetto di unbuilding spiegato nel documento di dettaglio) */
    const unbuildAllCriterions = function (json) {
      for (var criterion = 0; criterion < json.tenderingCriterionModels.length; criterion++) {
        CritCommon.unbuildCriterion(json.tenderingCriterionModels[criterion]);
      }
    }

    /*Validazione dei campi per CA*/
    const validitaCA = function (formFirstSection) {
      return $scope.startVariables.userRole == 'ca' && formFirstSection.checkValidity();
    }

    /*Validazione dei campi per EO*/
    const validitaEO = function (formFirstSection, secondSectionForm) {
      return $scope.startVariables.userRole == 'eo' && formFirstSection.checkValidity() && secondSectionForm.checkValidity();
    }

    /*Imposta le classi che indicano la validazione*/
    const setValidityClasses = function (fieldsRequired, key) {
      if (fieldsRequired.hasOwnProperty(key)) {
        var field = fieldsRequired[key];
        if (field.classList != undefined && field.classList.contains('ng-invalid')) {
          field.classList.add('espd-fieldInvalid');
          field.parentNode.classList.remove('childValidation');
        } else if (field.classList != undefined && field.classList.contains('ng-valid') && field.classList.contains('espd-fieldInvalid')) {
          field.classList.remove('espd-fieldInvalid');
          field.parentNode.classList.add('childValidation');
        }
      }
    }

    /* Controlla la validità dei campi prima di proseguire alla prossima pagina*/
    const checkValidity = function () {
      var formFirstSection = document.getElementById('firstSectionForm');
      var secondSectionForm = document.getElementById('secondSectionForm');
      var fieldsRequired = document.getElementsByClassName('valid-feedback');
      if ($scope.startVariables.userRole == 'eo')
        checkVat();
      for (var key in fieldsRequired) {
        setValidityClasses(fieldsRequired, key);
      }
      if (validitaCA(formFirstSection) || validitaEO(formFirstSection, secondSectionForm)) {
        $scope.formError = false;
        return false;
      } else {
        $scope.formError = true;
        $window.scrollTo(0, angular.element(document.getElementById('errorMessage')).offsetTop);
        return true;
      }
    }

    $scope.goNext = function () {
      if (!checkValidity()) {
        $scope.tryNextValidity = true;
        $scope.$broadcast('removeEmptyValues');
        setJson()
        $state.go('home.exclusion');
      }
    }

    $scope.addAllLots = function () {
      for (var lot in $scope.lotti) {
        if ($scope.selectedLotti.indexOf($scope.lotti[lot]) == -1) {
          $scope.selectedLotti.push($scope.lotti[lot]);
        }
      }
    }

    $scope.removeAllLots = function () {
      $scope.selectedLotti = [];
    }

    $scope.goBack = function () {
      setJson()
      $scope.$broadcast('removeEmptyValues');
      $state.go('home.start');
    }

    $scope.cancelModal = function () {
      $('#cancelModal').modal();
    }

    $scope.cancel = function () {
      $(".modal-backdrop").remove();
      var newJson = CancelService.cancel(MainService.getCountProgress());
      MainService.setApplicationJson(newJson);
      MainService.setCountProgress(1);
      MainService.emptyMaxActiveCountProgress();
      MainService.setMaxActiveCountProgress(1);
      $state.go('home.start');
    }

    $scope.getJsonFromCriterion = function (key) {
      return angular.copy(CriterionParserCA.getItemOnRepeat()[key]);
    }

    /*Scarica l'xml attuale dal json applicativo*/
    $scope.downloadXml = function () {
      var appJsonBackup = angular.copy($scope.applicationJson);
      $scope.$broadcast('removeEmptyValues');
      var data = CommonService.prepareToDownload($scope);
      unbuildAllCriterions(data.bean);
      if ($scope.startVariables.userRole == 'eo') {
        data.bean.economicOperatorPartyModels[0].partyModel.partyIdentificationModels[0].idModel.id += '_' + $scope.anotherVat;
      } else {
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

    /*Pusha un elemento di cardinalità x,n o 0,1(se vuoto) in un dato path di un criterion*/
    $scope.pushOnCriterion = function (path, obj) {
      path.push(obj);
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

// ////////////////////////////////--Init--//////////////////////////////////////////////

    $scope.$on('translatePage', function () {
      translatePage();
    });
    $scope.$on('setApplicationJson', function () {
      $scope.$broadcast('removeEmptyValues');
      setJson();
    });
    getCountries();
    getCig();
  }]);
