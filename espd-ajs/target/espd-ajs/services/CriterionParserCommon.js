angular.module('espdApp')
  .factory('CriterionParserCommon', function ($filter, MainService, uuid) {

    const getUUID = function () {
      var hash = uuid.v4();
      return hash;
    }

    //REBUILDA UN CRITERIO(spiegazione nel documento di dettaglio)
    const rebuildCriterion = function (criterion) {
      for (var key in criterion) {
        switch (key) {
          case 'subTenderingCriterionModels':
          case 'tenderingCriterionPropertyGroupModels':
          case 'subsidiaryTenderingCriterionPropertyGroupModels':
            var modelList = [];
            var map = {};
            for (var elem in criterion[key]) {
              rebuildCriterion(criterion[key][elem]);
              if (criterion[key][elem].idModel != undefined) {
                if (map[criterion[key][elem].idModel.id] == undefined) {
                  map[criterion[key][elem].idModel.id] = [criterion[key][elem]];
                }
                else {
                  map[criterion[key][elem].idModel.id].push(criterion[key][elem]);
                }
              }
              else {
                criterion[key][elem] = [angular.copy(criterion[key][elem])]
              }
            }
            for (var str in map) {
              modelList.push(map[str]);
            }
            if (modelList.length > 0) {
              criterion[key] = angular.copy(modelList);
            }
            break;
          case 'tenderingCriterionPropertyModels':
            var modelList = [];
            var map = {};
            for (var elem in criterion[key]) {
              rebuildCriterion(criterion[key][elem]);
              if (criterion[key][elem].logicalIdModel != undefined) {
                if (map[criterion[key][elem].logicalIdModel.id] == undefined) {
                  map[criterion[key][elem].logicalIdModel.id] = [criterion[key][elem]];
                }
                else {
                  map[criterion[key][elem].logicalIdModel.id].push(criterion[key][elem]);
                }
              }
              else {
                criterion[key][elem] = [angular.copy(criterion[key][elem])]
              }
            }
            for (var str in map) {
              modelList.push(map[str]);
            }
            if (modelList.length > 0) {
              criterion[key] = angular.copy(modelList);
            }
            break;
          default:
            break
        }
      }
      return criterion;
    }

    //UNBUILDA il criterio (spiegazione nel documento di dettaglio)
    const unbuildCriterion = function (criterion) {
      for (var key in criterion) {
        switch (key) {
          case 'subTenderingCriterionModels':
          case 'tenderingCriterionPropertyGroupModels':
          case 'subsidiaryTenderingCriterionPropertyGroupModels':
          case 'tenderingCriterionPropertyModels':
            var modelList = [];
            for (var elem in criterion[key]) {
              for (var arr in criterion[key][elem]) {
                unbuildCriterion(criterion[key][elem][arr]);
                modelList.push(criterion[key][elem][arr]);
              }
            }
            criterion[key] = angular.copy(modelList);
            break;
          default:
            break
        }
      }
      return criterion;
    }

    const createForm = function (id) {
      var form = document.createElement('form');
      form.setAttribute('name', id);
      form.setAttribute('novalidate', '');
      form.setAttribute('class', 'col-md-12 col-lg-12');
      return form;
    }

    const createDiv = function (classes) {
      var div = document.createElement('div');
      div.setAttribute('class', classes);
      return div;
    }

    const createDivNoElements = function (classes) {
      var div = document.createElement('div');
      div.setAttribute('class', classes);
      // div.setAttribute('ng-show', path + ".length ==0");
      div.style = 'position:relative';
      return div;
    }

    const createSpan = function (classes) {
      var span = document.createElement('span');
      span.setAttribute('class', classes);
      return span;
    }

    const createLabel = function (text) {
      var label = document.createElement('label');
      label.setAttribute('class', 'col-lg-4 espd-textRight');
      var span = createSpan('');
      span.innerHTML = text;
      label.appendChild(span);
      return label;
    }

    const createLabelForAmount = function (text) {
      var labelInput = document.createElement('label');
      labelInput.setAttribute('class', 'col-lg-4 espd-textRight');
      var span = createSpan('');
      span.innerHTML = text;
      labelInput.appendChild(span);
      return labelInput;
    }

    const createSpanWithText = function (text, classes) {
      var span = document.createElement('span');
      span.setAttribute('class', classes)
      span.innerHTML = text;
      return span;
    }

    const createLabelRadioMargin = function () {
      var label = document.createElement('label');
      return label;
    }

    const createDiv12Repeat = function (repeatKey, path, key, index) {
      var div = createDiv('col-lg-12 nopadding');
      div.setAttribute('ng-repeat', repeatKey + ' in ' + path + '.' + key + '[' + index + ']' + " track by $index");
      return div;
    }

    const createHeaderNameCriteriaCA = function (name, code) {
      var rowHeader = createDiv('row');
      var colHeader = createDiv('col-md-12 col-lg-12');
      var divHeader = createDiv('espd-criteriaHeaderName');
      divHeader.style="position: relative;";
      var header = createSpanWithText(name, 'espd-pointer');
      header.setAttribute('ng-click', "isOverview ? '' : criterionSelection." + code + '= !criterionSelection.' + code);
      divHeader.appendChild(header)
      colHeader.appendChild(divHeader);
      rowHeader.appendChild(colHeader);
      return rowHeader;
    }

    const createHeaderNameCriteriaEO = function (name) {
      var rowHeader = createDiv('row');
      var colHeader = createDiv('col-md-12 col-lg-12');
      var divHeader = createDiv('espd-criteriaHeaderName');
      var header = createSpanWithText(name, '');
      divHeader.appendChild(header)
      colHeader.appendChild(divHeader);
      rowHeader.appendChild(colHeader);
      return rowHeader;
    }

    const createGenericDescription = function (desc) {
    	var row = createDiv('row');
        var col = createDiv('col-md-12 col-lg-12');
        var div = createDiv('espd-criteriaDesc');
        div.appendChild(createSpanWithText(desc.description, ''))
        col.appendChild(div);
        row.appendChild(col);
        row.setAttribute('ng-show', "'" + desc.languageID + "'" + ' == defaultLanguage');
        return row;
    }

    const generateKeyForRepeat = function (path, key, index) {
      var keyRepeat = '';
      var arr = path.split('.');
      for (var str in arr) {
        keyRepeat += arr[str];
      }
      keyRepeat += key + index;
      keyRepeat = keyRepeat.replace(/[[\]]/g, '')
      return keyRepeat;
    }

    /*Suota tutti i valori dato un certo tenderingCriterionModels per gestire l'inserimento di un nuovo blocco con cardinalità (CA)*/
    const svuotaCampiCA = function (json, parentJson) {
      switch (json.valueDataTypeCodeModel.responseDataType.code) {
        case 'DESCRIPTION':
        case 'CERTIFICATION_LEVEL_DESCRIPTION':
        case 'URL':
          if (json.idModel){
            json.idModel.id = getUUID();
          }
          if (json.expectedIDModel && json.expectedIDModel.expectedID) {
	        json.expectedIDModel.expectedID = null;
	      }
          break;
        case 'INDICATOR':
        case 'WEIGHT_INDICATOR':
        case 'IDENTIFIER':
          if (json.idModel){
            json.idModel.id = getUUID();
          }
          if (json.expectedIDModel && json.expectedIDModel.expectedID) {
            json.expectedIDModel.expectedID = null;
          }
          break;
        case 'AMOUNT':
        case 'MAXIMUM_AMOUNT':
        case 'MINIMUM_AMOUNT':
          if (json.idModel){
            json.idModel.id = getUUID();
          }
          if (json.expectedAmountModel && json.expectedAmountModel.expectedAmount) {
            json.expectedAmountModel.expectedAmount = null;
          }
          break;
        case 'PERCENTAGE':
        case 'QUANTITY':
        case 'QUANTITY_INTEGER':
        case 'QUANTITY_YEAR':
        case 'MAXIMUM_VALUE_NUMERIC':
        case 'MINIMUM_VALUE_NUMERIC':
          if (json.idModel){
            json.idModel.id = getUUID();
          }
          if (json.expectedValueNumeric) {
            json.expectedValueNumeric = null;
          }
          break;
        case 'LOT_IDENTIFIER':
      	  if (json.idModel){
            json.idModel.id = getUUID();
      	  }
          if (json.lotsPropertyModels) {
            json.lotsPropertyModels = [];
          }
          break;
        case 'CODE':
        case 'CODE_COUNTRY':
        case 'CODE_BOOLEAN':
        case 'TRANSLATION_TYPE_CODE':
        case 'COPY_QUALITY_TYPE_CODE':
        case 'ECONOMIC_OPERATOR_IDENTIFIER':
    	  if (json.idModel){
            json.idModel.id = getUUID();
    	  }
          if (json.expectedCodeModel && json.expectedCodeModel.expectedCode) {
            json.expectedCodeModel.expectedCode = null;
          }
          break;
        case 'DATE':
        case 'TIME':
  	      if (json.idModel){
            json.idModel.id = getUUID();
  	      }
          if (json.periodModels && json.periodModels[0]) {
            json.periodModels[0] = null;
          }
          break;
        case 'PERIOD':
	      if (json.idModel){
	        json.idModel.id = getUUID();
	      }
          if (json.periodModels && json.periodModels[0]) {
            json.periodModels[0].startDate = null;
            json.periodModels[0].endDate = null;
          }
          break;
        case 'EVIDENCE_IDENTIFIER':
          var id = getUUID();
          json.tenderingCriterionResponseModel.idModel.id = getUUID();
          json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].idModel.id = id;
          json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.idModel.id = id;
          if (json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel && json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.documentReferenceModels[0]) {
            if (json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.documentReferenceModels[0].attachmentModel.externalReferenceModel.uriModel) {
              json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.documentReferenceModels[0].attachmentModel.externalReferenceModel.uriModel.uri = null;
            }
            if (json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.documentReferenceModels[0].idModel) {
              json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.documentReferenceModels[0].idModel.id = null;
            }
            json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.documentReferenceModels[0].issuerPartyModel.partyNameModels[0].name = null;
          }
          break;
        default:
          break;
      }
      return json;
    }

    /*Suota tutti i valori dato un certo tenderingCriterionModels per gestire l'inserimento di un nuovo blocco con cardinalità (EO)*/
    const svuotaCampiEO = function (json, parentJson) {
      if (json.tenderingCriterionResponseModel) {
        switch (json.valueDataTypeCodeModel.responseDataType.code) {
          case 'DESCRIPTION':
          case 'CERTIFICATION_LEVEL_DESCRIPTION':
            var idParent = getUUID();
            if (json.idModel){
                json.idModel.id = idParent;
            }
            if (json.tenderingCriterionResponseModel.responseValueModels.length > 0 && json.tenderingCriterionResponseModel.responseValueModels[0].descriptionModels[0]) {
              json.tenderingCriterionResponseModel.validatedCriterionPropertyIdModel.id = idParent;
              json.tenderingCriterionResponseModel.idModel.id = getUUID();
              json.tenderingCriterionResponseModel.responseValueModels[0].idModel.id = getUUID();
              json.tenderingCriterionResponseModel.responseValueModels[0].descriptionModels[0].description = '';
            }
            break;
          case 'URL':
              var idParent = getUUID();
              if (json.idModel){
                  json.idModel.id = idParent;
              }
              if (json.tenderingCriterionResponseModel.responseValueModels.length > 0 && json.tenderingCriterionResponseModel.responseValueModels[0].responseUriModel) {
                json.tenderingCriterionResponseModel.validatedCriterionPropertyIdModel.id = idParent;
                json.tenderingCriterionResponseModel.idModel.id = getUUID();
                //json.tenderingCriterionResponseModel.responseValueModels[0].idModel.id = getUUID();
                json.tenderingCriterionResponseModel.responseValueModels[0].responseUriModel.uri = '';
              }
              break;
          case 'CODE':
          case 'CODE_COUNTRY':
          case 'TRANSLATION_TYPE_CODE':
          case 'COPY_QUALITY_TYPE_CODE':
            var idParent = getUUID();
            if (json.idModel){
                json.idModel.id = idParent;
            }
            if (json.tenderingCriterionResponseModel.responseValueModels.length > 0) {
              if (!angular.isArray(json.tenderingCriterionResponseModel.responseValueModels) && json.tenderingCriterionResponseModel.responseValueModels[0].responseCodeModel) {
                json.tenderingCriterionResponseModel.validatedCriterionPropertyIdModel.id = idParent;
                json.tenderingCriterionResponseModel.idModel.id = getUUID();
                // json.tenderingCriterionResponseModel.responseValueModels[0].idModel.id = getUUID();
                json.tenderingCriterionResponseModel.responseValueModels[0].responseCodeModel.responseCode = null;
              } else {
                json.tenderingCriterionResponseModel.validatedCriterionPropertyIdModel.id = idParent;
                json.tenderingCriterionResponseModel.idModel.id = getUUID();
                json.tenderingCriterionResponseModel.responseValueModels = [];
                //json.tenderingCriterionResponseModel.responseValueModels[0].idModel.id = getUUID();
              }
            }
            break;
          case 'INDICATOR':
          case 'WEIGHT_INDICATOR':
          case 'CODE_BOOLEAN':
            var idParent = getUUID();
            if (json.idModel){
                json.idModel.id = idParent;
            }
            if (json.tenderingCriterionResponseModel.responseValueModels.length > 0 && json.tenderingCriterionResponseModel.responseValueModels[0]) {
              json.tenderingCriterionResponseModel.validatedCriterionPropertyIdModel.id = idParent;
              json.tenderingCriterionResponseModel.idModel.id = getUUID();
              if (json.tenderingCriterionResponseModel.responseValueModels[0].idModel) {
            	  json.tenderingCriterionResponseModel.responseValueModels[0].idModel.id = getUUID();
              }
              json.tenderingCriterionResponseModel.responseValueModels[0].responseIndicator = null;
            }
            break;
          case 'ECONOMIC_OPERATOR_IDENTIFIER':
          case 'IDENTIFIER':
            var idParent = getUUID();
            if (json.idModel){
                json.idModel.id = idParent;
            }
            if (json.tenderingCriterionResponseModel.responseValueModels.length > 0 && json.tenderingCriterionResponseModel.responseValueModels[0].responseIdModel) {
              json.tenderingCriterionResponseModel.validatedCriterionPropertyIdModel.id = idParent;
              json.tenderingCriterionResponseModel.idModel.id = getUUID();
              if (json.tenderingCriterionResponseModel.responseValueModels[0].idModel) {
                  json.tenderingCriterionResponseModel.responseValueModels[0].idModel.id = getUUID();
              }
              json.tenderingCriterionResponseModel.responseValueModels[0].responseIdModel.responseId = null;
            }
            break;
          case 'AMOUNT':
          case 'MAXIMUM_AMOUNT':
          case 'MINIMUM_AMOUNT':
            var idParent = getUUID();
            if (json.idModel){
                json.idModel.id = idParent;
            }
            if (json.tenderingCriterionResponseModel.responseValueModels.length > 0 && json.tenderingCriterionResponseModel.responseValueModels[0].responseAmountModel) {
              json.tenderingCriterionResponseModel.validatedCriterionPropertyIdModel.id = idParent;
              json.tenderingCriterionResponseModel.responseValueModels[0].responseAmountModel.responseAmount = null;
              json.tenderingCriterionResponseModel.idModel.id = getUUID();
              //json.tenderingCriterionResponseModel.responseValueModels[0].idModel.id = getUUID();
            }
            break;
          /*case 'QUANTITY_INTEGER':
          case 'QUANTITY_YEAR':
            var idParent = getUUID();
            json.idModel.id = idParent;
            if (json.tenderingCriterionResponseModel.responseValueModels.length > 0 && json.tenderingCriterionResponseModel.responseValueModels[0].responseMeasureModel) {
              json.tenderingCriterionResponseModel.validatedCriterionPropertyIdModel.id = idParent;
              json.tenderingCriterionResponseModel.responseValueModels[0].responseMeasureModel.responseMeasure = null;
              json.tenderingCriterionResponseModel.idModel.id = getUUID();
              //json.tenderingCriterionResponseModel.responseValueModels[0].idModel.id = getUUID();
            }
            break;*/
          case 'PERCENTAGE':
          case 'QUANTITY':
          case 'QUANTITY_INTEGER':
          case 'QUANTITY_YEAR':
            var idParent = getUUID();
            if (json.idModel){
                json.idModel.id = idParent;
            }
            if (json.tenderingCriterionResponseModel.responseValueModels.length > 0 && json.tenderingCriterionResponseModel.responseValueModels[0].responseQuantityModel) {
              json.tenderingCriterionResponseModel.validatedCriterionPropertyIdModel.id = idParent;
              json.tenderingCriterionResponseModel.responseValueModels[0].responseQuantityModel.responseQuantity = null;
              json.tenderingCriterionResponseModel.idModel.id = getUUID();
              //json.tenderingCriterionResponseModel.responseValueModels[0].idModel.id = getUUID();
            }
            break;
          case 'MAXIMUM_VALUE_NUMERIC':
          case 'MINIMUM_VALUE_NUMERIC':
            var idParent = getUUID();
            if (json.idModel){
                json.idModel.id = idParent;
            }
            if (json.tenderingCriterionResponseModel.responseValueModels.length > 0 && json.tenderingCriterionResponseModel.responseValueModels[0]) {
              json.tenderingCriterionResponseModel.validatedCriterionPropertyIdModel.id = idParent;
              json.tenderingCriterionResponseModel.responseValueModels[0].responseNumeric = null;
              json.tenderingCriterionResponseModel.idModel.id = getUUID();
              //json.tenderingCriterionResponseModel.responseValueModels[0].idModel.id = getUUID();
            }
            break;
          case 'LOT_IDENTIFIER':
            var idParent = getUUID();
            if (json.idModel){
                json.idModel.id = idParent;
            }
            if (json.tenderingCriterionResponseModel.responseValueModels) {
              json.tenderingCriterionResponseModel.validatedCriterionPropertyIdModel.id = idParent;
              json.tenderingCriterionResponseModel.responseValueModels = [];
            }
            break;
          case 'DATE':
            var idParent = getUUID();
            if (json.idModel){
                json.idModel.id = idParent;
            }
            if (json.tenderingCriterionResponseModel.responseValueModels.length > 0 && json.tenderingCriterionResponseModel.responseValueModels[0]) {
              json.tenderingCriterionResponseModel.validatedCriterionPropertyIdModel.id = idParent;
              json.tenderingCriterionResponseModel.responseValueModels[0].responseDate = null;
              json.tenderingCriterionResponseModel.idModel.id = getUUID();
              //json.tenderingCriterionResponseModel.responseValueModels[0].idModel.id = getUUID();
            }
            break;
          case 'TIME':
            var idParent = getUUID();
            if (json.idModel){
                json.idModel.id = idParent;
            }
            if (json.tenderingCriterionResponseModel.responseValueModels.length > 0 && json.tenderingCriterionResponseModel.responseValueModels[0]) {
              json.tenderingCriterionResponseModel.validatedCriterionPropertyIdModel.id = idParent;
              json.tenderingCriterionResponseModel.responseValueModels[0].responseTime = null;
              json.tenderingCriterionResponseModel.idModel.id = getUUID();
              //json.tenderingCriterionResponseModel.responseValueModels[0].idModel.id = getUUID();
            }
            break;
          case 'PERIOD':
        	var idParent = getUUID();
            if (json.idModel){
                json.idModel.id = idParent;
            }
            json.tenderingCriterionResponseModel.validatedCriterionPropertyIdModel.id = idParent;
            if (json.tenderingCriterionResponseModel.applicablePeriodModels.length > 0 && json.tenderingCriterionResponseModel.applicablePeriodModels[0]) {
              json.tenderingCriterionResponseModel.applicablePeriodModels[0].startDate = null;
              json.tenderingCriterionResponseModel.applicablePeriodModels[0].endDate = null;
              //json.tenderingCriterionResponseModel.idModel.id = getUUID();
            }
            break;
          case 'EVIDENCE_IDENTIFIER':
            var id = getUUID();
            var idParent = getUUID();
            if (json.idModel){
                json.idModel.id = idParent;
            }
            json.tenderingCriterionResponseModel.validatedCriterionPropertyIdModel.id = idParent;
            json.tenderingCriterionResponseModel.idModel.id = getUUID();
            json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].idModel.id = id;
            json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.idModel.id = id;
            if (json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel && json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.documentReferenceModels[0]) {
              if (json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.documentReferenceModels[0].attachmentModel.externalReferenceModel.uriModel) {
                json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.documentReferenceModels[0].attachmentModel.externalReferenceModel.uriModel.uri = null;
              }
              if (json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.documentReferenceModels[0].idModel) {
                json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.documentReferenceModels[0].idModel.id = null;
              }
              json.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.documentReferenceModels[0].issuerPartyModel.partyNameModels[0].name = null;
            }
            break;
          default:
            break;
        }
        return json;
      } else {
        return;
      }
    }

    /*Copia una certo porzione di criterio per aggiungerla col tasto '+'*/
    const copyBackupForCardinality = function (json, removeFlag) {
      if (removeFlag) {
        json.flagDelete = 'true';
      }
      for (var key in json) {
        switch (key) {
          case 'subTenderingCriterionModels':
          case 'tenderingCriterionPropertyGroupModels':
          case 'subsidiaryTenderingCriterionPropertyGroupModels':
            for (var index = 0; index < json[key].length; index++) {
              if (json[key][index]) {
                if (json[key][index] == undefined)
                  console.log();
                var test = json[key][index];
                for (var i = 0; i < json[key][index].length; i++) {
                  copyBackupForCardinality(json[key][index][i]);
                }
              }
            }
            break;
          case 'tenderingCriterionPropertyModels':
            for (index in json[key]) {
              for (i = 0; i < json[key][index].length; i++) {
                if (json[key][index][i].typeCodeModel.criterionElementType.code == 'QUESTION') {
                  svuotaCampiEO(json[key][index][i], json);
                } else if (json[key][index][i].typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
                  svuotaCampiCA(json[key][index][i], json);
                }
              }
            }
            break;
          default:
        	if (json.typeCodeModel && json.typeCodeModel.criterionElementType) {
                if (json.typeCodeModel.criterionElementType.code == 'QUESTION') {
                  svuotaCampiEO(json, json);
                } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
                  svuotaCampiCA(json, json);
                }
        	}
            break;
        }
      }
      return json;
    }

    /*In alcuni casi serve fare un copy prima di svuotare i campi e utilizzo questa funzione*/
    const startCopyBackupForCardinality = function (json) {
      return copyBackupForCardinality(angular.copy(json));
    }

    return {
      rebuildCriterion: rebuildCriterion,
      unbuildCriterion: unbuildCriterion,
      createForm: createForm,
      createDiv: createDiv,
      createDivNoElements: createDivNoElements,
      createSpan: createSpan,
      createLabel: createLabel,
      createLabelForAmount: createLabelForAmount,
      createSpanWithText: createSpanWithText,
      createLabelRadioMargin: createLabelRadioMargin,
      createDiv12Repeat: createDiv12Repeat,
      createHeaderNameCriteriaCA: createHeaderNameCriteriaCA,
      createHeaderNameCriteriaEO: createHeaderNameCriteriaEO,
      createGenericDescription: createGenericDescription,
      generateKeyForRepeat: generateKeyForRepeat,
      startCopyBackupForCardinality: startCopyBackupForCardinality,
      copyBackupForCardinality: copyBackupForCardinality
    }
  })
