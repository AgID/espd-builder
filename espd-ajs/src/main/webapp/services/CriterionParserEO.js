angular.module('espdApp')
  .factory('CriterionParserEO', function (CommonService, $state, CriterionParserCommon) {

    var CritCommon = CriterionParserCommon;
    var ifCases = {}
    var itemOnRepeat = {}

    let switchCardinality = function () {
      //SONAR DOCET
    };
    let iterateJson = function () {
      //SONAR DOCET
    };
    let switchCardinalityField = function () {
      //SONAR DOCET
    }

    /*Pulsante di aggiunta di una sezione del criterio, a seconda della cardinalità*/
    const createPlusButton = function (json, path, iteratingOn, cardinality, fromEmpty) {
      var button = document.createElement('button');
      if (fromEmpty) {
        button.setAttribute('ng-click', iteratingOn + "[0].flagDelete != 'false' && " + iteratingOn + "[0].flagDelete ? " + iteratingOn + "[0].flagDelete='false' :" + iteratingOn + ".push(" + "CriterionParserCA.getItemOnRepeat()['" + path + "'])");
      } else {
        button.setAttribute('ng-click', path + ".flagDelete != 'false' && " + iteratingOn + "[0].flagDelete ? " + path + ".flagDelete='false' :" + iteratingOn + ".push(" + "CriterionParserCommon.startCopyBackupForCardinality(" + path + "))");
      }
      button.setAttribute('ng-disabled', 'isOverview');
      button.setAttribute('class', 'btn espd-btn-secondario');
      button.style.float = 'right';
      var span = CritCommon.createSpan('fa fa-plus');
      switch (cardinality) {
        case '0..1':
          button.setAttribute('ng-if', iteratingOn + ".length < 1");
          break;
        default:
          break;
      }
      button.appendChild(span);
      return button;
    }

    /*Pulsante di delete di una sezione del criterio, a seconda della cardinalità*/
    const createDeleteButton = function (json, path, iteratingOn, cardinality) {
      var button = document.createElement('button');
      button.setAttribute('ng-click', iteratingOn + ".length>1 ?" + iteratingOn + ".splice($index,1) : CriterionParserCommon.copyBackupForCardinality(" + path + ",true)");
      button.setAttribute('class', 'btn espd-btn-secondario');
      button.setAttribute('ng-disabled', 'isOverview');
      button.style.float = 'right';
      var span = CritCommon.createSpan('fa fa-trash');
      switch (cardinality) {
        case '0..1':
          button.setAttribute('ng-if', iteratingOn + ".length == 1");
          break;
        case '0..n':
          button.setAttribute('ng-if', iteratingOn + ".length > 0");
          break;
        case '1..n':
          button.setAttribute('ng-if', iteratingOn + ".length > 1");
          break;
        default:
          break;
      }
      button.appendChild(span);
      return button;
    }

    const createInputTextarea = function (path, json) {
      var div12 = CritCommon.createDiv('col-lg-12 espd-nopadding');
      var input = document.createElement('textarea');
      input.setAttribute('class', 'form-control');
      input.setAttribute('rows', '3');
      input.setAttribute('type', 'text');
      if (json.typeCodeModel.criterionElementType.code == 'QUESTION') {
        input.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0].descriptionModels[0].description');
        input.setAttribute('ng-disabled', 'isOverview');
      } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
        input.setAttribute('ng-model', path + '.expectedDescription');
        input.setAttribute('disabled', '');
      }
      input.style = "font-weight:500;";
      div12.appendChild(input);
      return div12;
    }

    const createInputEvidenceIdentifier = function (path) {
      var parentDiv = CritCommon.createDiv('row');
      var urlDiv = CritCommon.createDiv('col-lg-12 espd-verticalMargin1em');
      var inputUrl = document.createElement('input');
      inputUrl.setAttribute('class', 'form-control espd-urlStyle ');
      inputUrl.setAttribute('type', 'text');
      inputUrl.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.documentReferenceModels[0].attachmentModel.externalReferenceModel.uriModel.uri');
      inputUrl.setAttribute('ng-disabled', 'isOverview');
      inputUrl.style = "font-weight:500;";
      inputUrl.setAttribute('ng-attr-placeholder', '{{variablesTranslate.crit_url}}')
      urlDiv.appendChild(inputUrl);
      var referenceCodeDiv = CritCommon.createDiv('col-lg-12 espd-verticalMargin1em');
      var inputReferenceCode = document.createElement('input');
      inputReferenceCode.setAttribute('class', 'form-control');
      inputReferenceCode.setAttribute('type', 'text');
      inputReferenceCode.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.documentReferenceModels[0].idModel.id');
      inputReferenceCode.setAttribute('ng-disabled', 'isOverview');
      inputReferenceCode.style = "font-weight:500;";
      inputReferenceCode.setAttribute('ng-attr-placeholder', '{{variablesTranslate.crit_code}}')
      referenceCodeDiv.appendChild(inputReferenceCode);
      var issuerDiv = CritCommon.createDiv('col-lg-12 espd-verticalMargin1em');
      var inputIssuer = document.createElement('input');
      inputIssuer.setAttribute('class', 'form-control');
      inputIssuer.setAttribute('type', 'text');
      inputIssuer.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.evidenceSuppliedModels[0].evidenceModel.documentReferenceModels[0].issuerPartyModel.partyNameModels[0].name');
      inputIssuer.setAttribute('ng-disabled', 'isOverview');
      inputIssuer.style = "font-weight:500;";
      inputIssuer.setAttribute('ng-attr-placeholder', '{{variablesTranslate.crit_issuer}}')
      issuerDiv.appendChild(inputIssuer);
      parentDiv.appendChild(urlDiv);
      parentDiv.appendChild(referenceCodeDiv);
      parentDiv.appendChild(issuerDiv);
      return parentDiv;
    }
    
    const createInputEconomicOperatorIdentifier = function (path, json) {
        var parentDiv = CritCommon.createDiv('row');
        
        var selectDiv = CritCommon.createDiv('col-lg-12 espd-verticalMargin1em');
        var select = document.createElement('select');
        select.setAttribute('class', 'form-control optsorted');
        var option = document.createElement('option');
        option.setAttribute('disabled', '');
        option.setAttribute('selected', '');
        option.setAttribute('hidden', '');
        option.setAttribute('value', '');
        option.innerHTML = '---'
        var options = document.createElement('option');
        var toSwitch;
        if (json.typeCodeModel.criterionElementType.code == 'QUESTION') {
          select.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0].responseIdModel.schemeID');
          select.setAttribute('ng-disabled', 'isOverview');
        } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
          select.setAttribute('ng-model', path + '.expectedIDModel.schemeID');
          select.setAttribute('disabled', '');
        }
        switchCodeList(json, toSwitch, options);
        select.appendChild(option);
        select.appendChild(options); 
        selectDiv.appendChild(select);       

        var inputDiv = CritCommon.createDiv('col-lg-12 espd-verticalMargin1em');
        var input = document.createElement('input');
        input.setAttribute('class', 'form-control');
        input.setAttribute('type', 'text');
        if (json.typeCodeModel.criterionElementType.code == 'QUESTION') {
          input.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0].responseIdModel.responseId');
          input.setAttribute('ng-disabled', 'isOverview');
        } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
          input.setAttribute('ng-model', path + '.expectedIDModel.expectedID');
          input.setAttribute('disabled', '');
        }
        input.style = "font-weight:500;";
        inputDiv.appendChild(input); 

        parentDiv.appendChild(selectDiv);
        parentDiv.appendChild(inputDiv);
        return parentDiv;	
    }

    const createInputTextIdentifier = function (path, json) {
      var input = document.createElement('input');
      input.setAttribute('class', 'form-control');
      input.setAttribute('type', 'text');
      if (json.typeCodeModel.criterionElementType.code == 'QUESTION') {
        input.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0].responseIdModel.responseId');
        input.setAttribute('ng-disabled', 'isOverview');
      } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
        input.setAttribute('ng-model', path + '.expectedIDModel.expectedID');
        input.setAttribute('disabled', '');
      }
      input.style = "font-weight:500;";
      return input;
    }

    const createInputTextUri = function (path, json) {
      var input = document.createElement('input');
      input.setAttribute('class', 'form-control espd-urlStyle');
      input.setAttribute('type', 'text');
      if (json.typeCodeModel.criterionElementType.code == 'QUESTION') {
        input.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0].responseUriModel.uri');
        input.setAttribute('ng-disabled', 'isOverview');
      } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
        input.setAttribute('ng-model', path + '.expectedIDModel.expectedID');
        input.setAttribute('disabled', '');
      }
      input.style = "font-weight:500;";
      return input;
    }

    const createInputNumber = function (path, json) {
      var input = document.createElement('input');
      input.setAttribute('class', 'form-control');
      input.setAttribute('type', 'number');
      if (json.typeCodeModel.criterionElementType.code == 'QUESTION') {
        input.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0].responseNumeric');
        input.setAttribute('ng-disabled', 'isOverview');
      } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
        input.setAttribute('ng-model', path + '.expectedValueNumeric');
        input.setAttribute('disabled', '');
      }
      input.style = "font-weight:500;";
      return input;
    }

    const createInputQuantity = function (path, json) {
      var input = document.createElement('input');
      input.setAttribute('class', 'form-control');
      input.setAttribute('type', 'number');
      if (json.typeCodeModel.criterionElementType.code == 'QUESTION') {
        input.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0].responseQuantityModel.responseQuantity');
        input.setAttribute('ng-disabled', 'isOverview');
      } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
        input.setAttribute('ng-model', path + '.expectedValueNumeric');
        input.setAttribute('disabled', '');
      }
      input.style = "font-weight:500;";
      switch (json.valueDataTypeCodeModel.responseDataType.code) {
	      case 'QUANTITY_INTEGER':
	          input.setAttribute('onkeypress', 'return (event.charCode >= 48 && event.charCode <= 57)||event.charCode == 45');
	          break;
	      case 'QUANTITY_YEAR':
	          input.setAttribute('min', '0');
	          input.setAttribute('onkeypress', 'return (event.charCode >= 48 && event.charCode <= 57)||event.charCode == 45');
	          break;
	      default:
	    	  break;
      }
      return input;
    }

    const createInputCurrency = function (path, json) {
      var div12 = CritCommon.createDiv('col-lg-12 espd-nopadding');
      var div9 = CritCommon.createDiv('col-lg-8 espd-nopadding');
      var div3 = CritCommon.createDiv('col-lg-4');
      div3.style = 'padding-right: 0';
      var input = document.createElement('input');
      input.setAttribute('class', 'form-control');
      input.setAttribute('type', 'number');
      input.style = "font-weight:500;";
      var select = document.createElement('select');
      select.setAttribute('class', 'form-control optsorted');
      var option = document.createElement('option');
      option.setAttribute('disabled', '');
      option.setAttribute('selected', '');
      option.setAttribute('hidden', '');
      option.setAttribute('value', '');
      option.innerHTML = '---'
      var options = document.createElement('option');
      options.setAttribute('ng-repeat', 'currency in currencyType');
      options.setAttribute('value', '{{currency.code}}');
      options.innerHTML = '{{currency.code}}';
      select.appendChild(option);
      select.appendChild(options)
      if (json.typeCodeModel.criterionElementType.code == 'QUESTION') {
        input.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0].responseAmountModel.responseAmount');
        input.setAttribute('ng-disabled', 'isOverview');
        select.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0].responseAmountModel.currencyID');
        select.setAttribute('ng-disabled', 'isOverview');
      } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
        input.setAttribute('ng-model', path + '.expectedAmountModel.expectedAmount');
        select.setAttribute('ng-model', path + '.expectedAmountModel.currencyID');
        input.setAttribute('disabled', '');
        select.setAttribute('disabled', '');
      }
      div9.appendChild(input);
      div3.appendChild(select);
      div12.appendChild(div9);
      div12.appendChild(div3);
      return div12;
    }

    const createInputDate = function (path, json) {
      var input = document.createElement('input');
      input.setAttribute('class', 'form-control');
      input.setAttribute('type', 'date');
      input.setAttribute('date-input', '');
      if (json.typeCodeModel.criterionElementType.code == 'QUESTION') {
        input.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0].responseDate');
        input.setAttribute('ng-style', "{'color':" + path + ".tenderingCriterionResponseModel.responseValueModels[0].responseDate==null ? 'grey' :'#555'}");
        input.setAttribute('ng-disabled', 'isOverview');
      } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
        input.setAttribute('ng-model', path + '.periodModels[0]');
        input.setAttribute('ng-style', "{'color':" + path + ".periodModels[0]==null ? 'grey' :'#555'}");
      }
      input.style = "font-weight:500;";
      return input;
    }

    const createInputTime = function (path, json) {
      var input = document.createElement('input');
      input.setAttribute('class', 'form-control');
      input.setAttribute('type', 'time');
      input.setAttribute('ng-model', path + '.value');
      input.setAttribute('date-input', '');
      if (json.typeCodeModel.criterionElementType.code == 'QUESTION') {
        input.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0].responseTime');
        input.setAttribute('ng-disabled', 'isOverview');
        input.setAttribute('ng-style', "{'color': " + path + ".tenderingCriterionResponseModel.responseValueModels[0].responseTime==null ? 'grey' :'#555'}");
      } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
        input.setAttribute('ng-model', path + '.periodModels[0]');
        input.setAttribute('disabled', '');
        input.setAttribute('ng-style', "{'color':" + path + ".periodModels[0]==null ? 'grey' :'#555'}");
      }
      input.style = "font-weight:500;";
      return input;
    }

    const createInputPeriod = function (path, json) {
      var div = CritCommon.createDiv('col-lg-12 espd-nopadding');
      var divLabel1 = CritCommon.createDiv('col-lg-5 espd-nopadding');
      var labelInput1 = document.createElement('label');
      labelInput1.setAttribute('class', 'col-lg-12 espd-nopadding');
      var span1 = CritCommon.createSpan('');
      span1.innerHTML = '{{variablesTranslate.crit_start_date}}';
      labelInput1.appendChild(span1);
      divLabel1.appendChild(labelInput1);
      div.appendChild(divLabel1);

      var labelSpace = CritCommon.createDiv('col-lg-2');
      div.appendChild(labelSpace);

      var divLabel2 = CritCommon.createDiv('col-lg-5 espd-nopadding');
      var labelInput2 = document.createElement('label');
      labelInput2.setAttribute('class', 'col-lg-12 espd-nopadding');
      var span2 = CritCommon.createSpan('');
      span2.innerHTML = '{{variablesTranslate.crit_end_date}}';
      labelInput2.appendChild(span2);
      divLabel2.appendChild(labelInput2);
      div.appendChild(divLabel2);

      var divContainer = CritCommon.createDiv('col-lg-12 espd-nopadding');
      var divInput = CritCommon.createDiv('col-lg-5 espd-nopadding');

      var divSpace = CritCommon.createDiv('col-lg-2');
      var inputFrom = document.createElement('input');
      var spanError = document.createElement('span');
      spanError.setAttribute('class', 'valid-feedback-error');
      spanError.innerHTML = '{{variablesTranslate.validator_period}}';
      inputFrom.setAttribute('class', 'form-control');
      inputFrom.setAttribute('type', 'date');
      inputFrom.setAttribute('date-input', '');
      inputFrom.style = "font-weight:500;";
      divInput.appendChild(inputFrom);
      divInput.appendChild(spanError);
      divContainer.appendChild(divInput);
      divContainer.appendChild(divSpace);
      var divInput2 = CritCommon.createDiv('col-lg-5 espd-nopadding');
      var inputTo = document.createElement('input');
      inputTo.setAttribute('class', 'form-control');
      inputTo.setAttribute('type', 'date');
      inputTo.setAttribute('date-input', '');
      inputTo.style = "font-weight:500;";
      if (json.typeCodeModel.criterionElementType.code == 'QUESTION') {
        inputFrom.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.applicablePeriodModels[0].startDate');
        inputTo.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.applicablePeriodModels[0].endDate');
        inputFrom.setAttribute('ng-disabled', 'isOverview');
        inputTo.setAttribute('ng-disabled', 'isOverview');
        inputFrom.setAttribute('ng-style', "{'color':" + path + ".tenderingCriterionResponseModel.applicablePeriodModels[0].startDate==null ? 'grey' :'#555'}");
        inputTo.setAttribute('ng-style', "{'color': " + path + ".tenderingCriterionResponseModel.applicablePeriodModels[0].endDate==null ? 'grey' :'#555'}");
        inputFrom.setAttribute('ng-class', "periodValidation(" + path + ".tenderingCriterionResponseModel.applicablePeriodModels[0].startDate," + path + ".tenderingCriterionResponseModel.applicablePeriodModels[0].endDate) ? 'espd-fieldInvalid' : ''");
        inputTo.setAttribute('ng-class', "periodValidation(" + path + ".tenderingCriterionResponseModel.applicablePeriodModels[0].startDate," + path + ".tenderingCriterionResponseModel.applicablePeriodModels[0].endDate) ? 'espd-fieldInvalid' : ''");
        spanError.setAttribute('ng-show', 'periodValidation(' + path + '.tenderingCriterionResponseModel.applicablePeriodModels[0].startDate,' + path + '.tenderingCriterionResponseModel.applicablePeriodModels[0].endDate)');
      } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
        inputFrom.setAttribute('ng-model', path + '.periodModels[0].startDate');
        inputTo.setAttribute('ng-model', path + '.periodModels[0].endDate');
        inputFrom.setAttribute('disabled', '');
        inputTo.setAttribute('disabled', '');
        inputFrom.setAttribute('ng-style', "{'color':" + path + ".periodModels[0].startDate==null ? 'grey' :'#555'}");
        inputTo.setAttribute('ng-style', "{'color':" + path + ".periodModels[0].endDate==null ? 'grey' :'#555'}");
        inputFrom.setAttribute('ng-class', "periodValidation(" + path + ".periodModels[0].startDate," + path + ".periodModels[0].endDate) ? 'espd-fieldInvalid' : ''");
        inputTo.setAttribute('ng-class', "periodValidation(" + path + ".periodModels[0].startDate," + path + ".periodModels[0].endDate) ? 'espd-fieldInvalid' : ''");
        spanError.setAttribute('ng-show', 'periodValidation(' + path + '.periodModels[0].startDate,' + path + '.periodModels[0].endDate)');
      }
      divInput2.appendChild(inputTo);
      divInput2.appendChild(angular.copy(spanError));
      divContainer.appendChild(divInput2);
      div.appendChild(divContainer);
      return div;
    }

    /*Faccio vedere nelle select soltanto le option con stato ACTIVE che mi arriva da BE*/
    const switchEconomicOperatorID = function (toSwitch, options) {
      switch (toSwitch) {
        case 'BidType':
          options.setAttribute('ng-repeat', 'x in bidTypeList');
          options.setAttribute('ng-show', "x.status == 'ACTIVE'")
          break;
        case 'FinancialRatioType':
          options.setAttribute('ng-repeat', 'x in ratioTypeList');
          options.setAttribute('ng-show', "x.status == 'ACTIVE'")
          break;
        case 'EORoleType':
          options.setAttribute('ng-repeat', 'x in roleTypeList');
          options.setAttribute('ng-show', "x.status == 'ACTIVE'")
          break;
        case 'EOIDType':
          options.setAttribute('ng-repeat', 'x in eoIDTypeList');
          options.setAttribute('ng-show', "x.status == 'ACTIVE'")
          break;
        default:
          break;
      }
    }

    const switchCodeList = function (json, toSwitch, options) {
      switch (json.valueDataTypeCodeModel.responseDataType.code) {
        case 'CODE':
        case 'ECONOMIC_OPERATOR_IDENTIFIER':
          if (json.typeCodeModel.criterionElementType.code == 'QUESTION') {
            if (json.responseCodeModel) {
              toSwitch = json.responseCodeModel.listID;
            }
          } else {
            if (json.expectedCodeModel) {
              toSwitch = json.expectedCodeModel.listID;
            }
          }
          switchEconomicOperatorID(toSwitch, options);
          options.setAttribute('value', '{{x.code}}');
          options.innerHTML = '{{x.translation}}';
          break;
        case 'CODE_COUNTRY':
          options.setAttribute('ng-repeat', 'country in countries');
          options.setAttribute('value', '{{country.iso2Code}}');
          options.innerHTML = '{{country.countryName}}';
          break;
        case 'CODE_BOOLEAN':
          break;
        default:
          break;
      }
    }

    const createCode = function (path, json) {
      var select = document.createElement('select');
      select.setAttribute('class', 'form-control optsorted');
      var option = document.createElement('option');
      option.setAttribute('disabled', '');
      option.setAttribute('selected', '');
      option.setAttribute('hidden', '');
      option.setAttribute('value', '');
      option.innerHTML = '---'
      var options = document.createElement('option');
      var toSwitch;
      if (json.typeCodeModel.criterionElementType.code == 'QUESTION') {
        select.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0].responseCodeModel.responseCode');
        select.setAttribute('ng-disabled', 'isOverview');
      } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
        select.setAttribute('ng-model', path + '.expectedCodeModel.expectedCode');
        select.setAttribute('disabled', '');
      }
      switchCodeList(json, toSwitch, options);
      select.appendChild(option);
      select.appendChild(options);
      return select;
    }

    /* Sonar :C */
    /* Multiselect tradotta a textarea con scritti gli elementi selezionati per il caso CODE generica */
    const multiCodeAsTextResponseValueNotNullCaseCode = function (json, arrayAsString, i) {
      if (angular.isArray(json.tenderingCriterionResponseModel.responseValueModels[i])) {
        for (var j = 0; j < json.tenderingCriterionResponseModel.responseValueModels[i].length; j++) {
          arrayAsString += json.tenderingCriterionResponseModel.responseValueModels[i][j].responseCodeModel.responseCode;
          if (j != json.tenderingCriterionResponseModel.responseValueModels[i].length - 1) {
            arrayAsString += ', '
          }
        }
        return arrayAsString;
      } else {
        arrayAsString += json.tenderingCriterionResponseModel.responseValueModels[i].responseCodeModel.responseCode;
        if (i != json.tenderingCriterionResponseModel.responseValueModels.length - 1) {
          arrayAsString += ', '
        }
        return arrayAsString;
      }
    }

    const multiCodeAsTextResponseValueNotNull = function (json, arrayAsString) {
      switch (json.valueDataTypeCodeModel.responseDataType.code) {
        case 'LOT_IDENTIFIER':
          for (var k = 0; k < json.tenderingCriterionResponseModel.responseValueModels.length; k++) {
            arrayAsString += json.tenderingCriterionResponseModel.responseValueModels[k].responseIdModel.responseId;
            if (k != json.tenderingCriterionResponseModel.responseValueModels.length - 1) {
              arrayAsString += ', '
            }
          }
          break;
        case 'CODE':
          for (var i = 0; i < json.tenderingCriterionResponseModel.responseValueModels.length; i++) {
            multiCodeAsTextResponseValueNotNullCaseCode(json, arrayAsString, i);
          }
          break;
        default:
          break;
      }
    }

    /* Multiselect tradotta a textarea con scritti gli elementi selezionati con tenderingCriterionResponseModel di tipo requirement*/
    const multiCodeAsTextRequirement = function (json, arrayAsString) {
      switch (json.valueDataTypeCodeModel.responseDataType.code) {
        case 'LOT_IDENTIFIER':
          for (var i = 0; i < json.lotsPropertyModels.length; i++) {
            arrayAsString += json.lotsPropertyModels[i].expectedIDModel.expectedID;
            if (i != json.lotsPropertyModels.length - 1) {
              arrayAsString += ', '
            }
          }
          return arrayAsString;
          break;
        case 'CODE':
          for (var j = 0; j < json.cpvsPropertyModels.length; j++) {
            arrayAsString += json.cpvsPropertyModels[j].expectedCodeModel.expectedCode;
            if (j != json.cpvsPropertyModels.length - 1) {
              arrayAsString += ', '
            }
          }
          return arrayAsString;
          break;
        default:
          break;
      }
    }

    /* Multiselect tradotta a textarea con scritti gli elementi selezionati */
    const createMultiCodeAsText = function (path, json) {
      var div = CritCommon.createDiv('col-lg-12 espd-nopadding');
      var input = document.createElement('textarea');
      input.setAttribute('class', 'form-control');
      input.setAttribute('rows', '3');
      input.setAttribute('type', 'text');
      input.setAttribute('ng-disabled', 'true');
      var arrayAsString = "";
      if (json.tenderingCriterionResponseModel != null) {
        multiCodeAsTextResponseValueNotNull(json, arrayAsString);
        input.value = arrayAsString;
      } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
        arrayAsString = multiCodeAsTextRequirement(json, arrayAsString);
        input.value = arrayAsString;
      }
      input.style = "font-weight:500;";
      div.appendChild(input);
      return div;
    }

    /*Multiselect*/
    const createMultiCode = function (path, json) {
      if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
        return createMultiCodeAsText(path, json);
      }
      var div = CritCommon.createDiv('col-lg-12 espd-nopadding');
      var multiselect = document.createElement('multiselect');
      if (json.cardinality == '1' || json.cardinality == '') {
        multiselect.setAttribute('multiple', 'false');
      } else {
        multiselect.setAttribute('multiple', 'true');
      }
      multiselect.setAttribute('class', 'espd-input-xlarge');
      multiselect.setAttribute('change', 'selected()');
      multiselect.setAttribute('ng-if', 'isTraductionDone');
      multiselect.setAttribute('ng-disabled', path + ".typeCodeModel.criterionElementType.code=='REQUIREMENT' || isOverview");
      multiselect.setAttribute('role', '{{startVariables.userRole}}');
      switch (json.valueDataTypeCodeModel.responseDataType.code) {
        case 'LOT_IDENTIFIER':
          if (json.cardinality == '1' || json.cardinality == '') {
            multiselect.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0]');
          } else {
            multiselect.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels');
          }
          multiselect.setAttribute('customPlaceholder', '{{variablesTranslate.crit_lots}}')
          multiselect.setAttribute('options', 'elem.responseIdModel.responseId for elem in lotsList');
          multiselect.setAttribute('typeList', 'LOTS');
          break;
        case 'CODE':
          if (json.cardinality == '1' || json.cardinality == '') {
            multiselect.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0]');
          } else {
            multiselect.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels');
          }
          multiselect.setAttribute('customPlaceholder', '{{variablesTranslate.crit_cpv_codes}}');
          multiselect.setAttribute('options', 'elem.responseCodeModel.responseCode for elem in cpvsList');
          multiselect.setAttribute('typeList', 'CPVS');
          break;
        default:
          break;
      }
      div.appendChild(multiselect);
      return div;
    }

    const createInputRadio = function (path, json, type) {
      var labelMargin = CritCommon.createLabelRadioMargin();
      var labelMargin2 = CritCommon.createLabelRadioMargin();
      var inputTrue = document.createElement('input');
      inputTrue.setAttribute('class', 'espd-marginLeft1em espd-radioSize');
      inputTrue.setAttribute('type', 'radio');
      inputTrue.setAttribute('value', 'true');
      inputTrue.setAttribute('tabindex', path + '.value0');
      var inputFalse = document.createElement('input');
      inputFalse.setAttribute('class', 'espd-marginLeft1em espd-radioSize');
      inputFalse.setAttribute('type', 'radio');
      inputFalse.setAttribute('value', 'false');
      inputFalse.style = "font-weight:500;";
      var spanYes;
      var spanNo;
      if (type == 'CODE_BOOLEAN') {
        spanYes = CritCommon.createSpanWithText('{{booleanGUIControlTypeList[0].translation}}', '');
        spanNo = CritCommon.createSpanWithText('{{booleanGUIControlTypeList[1].translation}}', '');
      } else {
        spanYes = CritCommon.createSpanWithText('{{variablesTranslate.yes}}', '');
        spanNo = CritCommon.createSpanWithText('{{variablesTranslate.no}}', '')
      }
      var divReturn = CritCommon.createDiv('radio radio-info');
      var container1 = CritCommon.createSpanWithText('', '');
      var container2 = CritCommon.createSpanWithText('', 'espd-marginLeft3em');
      if (json.typeCodeModel.criterionElementType.code == 'QUESTION') {
        divReturn.setAttribute('ng-init', "$parent.indicatorStorage" + path + "['" + path + "_'] = " + path + ".tenderingCriterionResponseModel.responseValueModels[0].responseIndicator");
        inputTrue.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0].responseIndicator');
        inputFalse.setAttribute('ng-model', path + '.tenderingCriterionResponseModel.responseValueModels[0].responseIndicator');
        inputTrue.setAttribute('ng-disabled', 'isOverview');
        inputFalse.setAttribute('ng-disabled', 'isOverview');
        inputTrue.setAttribute('ng-change', "$parent.indicatorStorage" + path + "['" + path + "_'] = 'true'");
        inputFalse.setAttribute('ng-change', "$parent.indicatorStorage" + path + "['" + path + "_'] = 'false'");
        container1.setAttribute('ng-click', '!isOverview ? ' + path + ".tenderingCriterionResponseModel.responseValueModels[0].responseIndicator = 'true' : ''; !isOverview ? $parent.indicatorStorage" + path + "['" + path + "_'] = 'true' : ''");
        container2.setAttribute('ng-click', '!isOverview ? ' + path + ".tenderingCriterionResponseModel.responseValueModels[0].responseIndicator = 'false' : ''; !isOverview ? $parent.indicatorStorage" + path + "['" + path + "_'] = 'false' : ''");
      } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT') {
        if (type == 'CODE_BOOLEAN') {
          inputTrue.setAttribute('ng-model', path + '.expectedCodeModel.expectedCode');
          inputFalse.setAttribute('ng-model', path + '.expectedCodeModel.expectedCode');
          inputTrue.setAttribute('ng-value', 'booleanGUIControlTypeList[0].code');
          inputFalse.setAttribute('ng-value', 'booleanGUIControlTypeList[1].code');
          divReturn.setAttribute('ng-init', "$parent.indicatorStorage" + path + "['" + path + "_'] = " + path + ".expectedCodeModel.expectedCode");
        } else {
          inputTrue.setAttribute('ng-model', path + '.expectedIDModel.expectedID');
          inputFalse.setAttribute('ng-model', path + '.expectedIDModel.expectedID');
          divReturn.setAttribute('ng-init', "$parent.indicatorStorage" + path + "['" + path + "_'] = " + path + ".expectedIDModel.expectedID");

        }
        inputTrue.setAttribute('disabled', '');
        inputFalse.setAttribute('disabled', '');
      }
      container1.appendChild(inputTrue);
      labelMargin.appendChild(spanYes);
      container1.appendChild(labelMargin);
      divReturn.appendChild(container1);
      container2.appendChild(inputFalse);
      labelMargin2.appendChild(spanNo);
      container2.appendChild(labelMargin2);
      divReturn.appendChild(container2);
      return divReturn;
    }

    /* Sonar :@ */
    /* Gestisco il fatto che la sezione sia visibile a seconda del valore dell'indicator precedente nel caso ONTRUE */
    const switchElementCodeOnTrue = function (div, json, path, indicatorPath, compressPath) {
      if (ifCases[path][1] == 'QUESTION') {
        if (indicatorPath) {
          div.setAttribute('ng-show', "indicatorStorage" + ifCases[path][0] + "? indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == 'true' || (booleanGUIControlTypeList[0] && booleanGUIControlTypeList[0].code && indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == booleanGUIControlTypeList[0].code) &&" + indicatorPath + ".length ==0 : $parent.indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == 'true' && " + indicatorPath + ".length ==0");
          div.setAttribute('indicatorPath', ifCases[path][0]);
          div.setAttribute('compressPath', compressPath);
          div.setAttribute('remove-json-values', 'ONTRUE');
        } else {
          div.setAttribute('ng-show', "indicatorStorage" + ifCases[path][0] + "? indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == 'true' || (booleanGUIControlTypeList[0] && booleanGUIControlTypeList[0].code && indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == booleanGUIControlTypeList[0].code) : $parent.indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == 'true'");
          div.setAttribute('indicatorPath', ifCases[path][0]);
          div.setAttribute('compressPath', compressPath);
          div.setAttribute('remove-json-values', 'ONTRUE');
        }
      } else if (ifCases[path][1] == 'REQUIREMENT') {
        if (indicatorPath) {
          div.setAttribute('ng-show', "indicatorStorage" + ifCases[path][0] + " ? indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == 'true' || (booleanGUIControlTypeList[0] && booleanGUIControlTypeList[0].code && indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == booleanGUIControlTypeList[0].code) && " + indicatorPath + ".length ==0 : $parent.indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == 'true' && " + indicatorPath + ".length ==0");
        } else {
          div.setAttribute('ng-show', "indicatorStorage" + ifCases[path][0] + "? indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == 'true' || (booleanGUIControlTypeList[0] && booleanGUIControlTypeList[0].code && indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == booleanGUIControlTypeList[0].code) : $parent.indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == 'true'");
        }
      }
    }

    /* Sonar :@ */
    /* Gestisco il fatto che la sezione sia visibile a seconda del valore dell'indicator precedente nel caso ONFALSE */
    const switchElementCodeOnFalse = function (div, json, path, indicatorPath, compressPath) {
      if (ifCases[path][1] == 'QUESTION') {
        if (indicatorPath) {
          div.setAttribute('ng-show', "indicatorStorage" + ifCases[path][0] + "? indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == 'false' || (booleanGUIControlTypeList[1] && booleanGUIControlTypeList[1].code && indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == booleanGUIControlTypeList[1].code) && " + indicatorPath + ".length ==0 : $parent.indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == 'false' && " + indicatorPath + ".length ==0");
          div.setAttribute('compressPath', compressPath);
          div.setAttribute('indicatorPath', ifCases[path][0]);
          div.setAttribute('remove-json-values', 'ONFALSE');
        } else {
          div.setAttribute('ng-show', "indicatorStorage" + ifCases[path][0] + " ? indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == 'false' || (booleanGUIControlTypeList[1] && booleanGUIControlTypeList[1].code && indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == booleanGUIControlTypeList[1].code) : $parent.indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == 'false'");
          div.setAttribute('compressPath', compressPath);
          div.setAttribute('indicatorPath', ifCases[path][0]);
          div.setAttribute('remove-json-values', 'ONFALSE');
        }
      } else if (ifCases[path][1] == 'REQUIREMENT') {
        if (indicatorPath) {
          div.setAttribute('ng-show', "indicatorStorage" + ifCases[path][0] + " ? indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == 'false' || (booleanGUIControlTypeList[1] && booleanGUIControlTypeList[1].code && indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == booleanGUIControlTypeList[1].code) && " + indicatorPath + ".length ==0 : $parent.indicatorStorage" + ifCases[path][0]);
        } else {
          div.setAttribute('ng-show', "indicatorStorage" + ifCases[path][0] + "? indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == 'false' || (booleanGUIControlTypeList[1] && booleanGUIControlTypeList[1].code && indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == booleanGUIControlTypeList[1].code) : $parent.indicatorStorage" + ifCases[path][0] + "['" + ifCases[path][0] + "_'] == 'false'");
        }
      }
    }

    const switchElementCodeDefaultCase = function (div, indicatorPath) {
      if (indicatorPath) {
        div.setAttribute('ng-show', indicatorPath + ".length ==0");
      }
    }

    /* Gestisco il fatto che la sezione sia visibile a seconda del valore dell'indicator precedente nel caso ONTRUE */
    const switchElementCode = function (div, json, path, indicatorPath, compressPath) {
      if (json.propertyGroupTypeCodeModel && ifCases[path] != undefined) {
        try {
          switch (json.propertyGroupTypeCodeModel.propertyGroupType.code) {
            case 'ONTRUE':
              switchElementCodeOnTrue(div, json, path, indicatorPath, compressPath);
              break;
            case 'ONFALSE':
              switchElementCodeOnFalse(div, json, path, indicatorPath, compressPath);
              break;
            default:
              switchElementCodeDefaultCase(div, indicatorPath);
              break;
          }
        } catch (e) {
        }
      } else {
        if (indicatorPath) {
          div.setAttribute('ng-show', indicatorPath + ".length ==0");
        }
      }
    }

    /*Creo un div di inserimento nuova domanda con tasto '+'*/
    const switchCardinalityCreateDivNoElements = function (json, path, iteratingOn, fullPath, parentNode) {
      var buttonsContainer = CritCommon.createDiv('col-lg-12 espd-noheight espd-marginBottom3Em espd-critButtonContainerPosition');
      buttonsContainer.appendChild(createPlusButton(json, path, iteratingOn, json.cardinality, true));
      var divNoElements = CritCommon.createDivNoElements('col-lg-12 espd-divVanilla');
      divNoElements.appendChild(angular.copy(buttonsContainer));
      var div11copy = CritCommon.createDiv('col-lg-12 espd-nopadding espd-verticalMargin2em');
      var label = CritCommon.createLabel('Click to insert a new question');
      div11copy.appendChild(label);
      divNoElements.appendChild(div11copy);
      divNoElements.setAttribute("ng-show", fullPath + ".flagDelete == 'true'")
      parentNode.appendChild(divNoElements);
    }

    /* SONAR*/
    const iterateJsonImplIfConditionTwo = function (key, indexSub, outFor) {
      var cond;
      cond = (key == 'subTenderingCriterionModels' && indexSub && indexSub == '0');
      return cond && !outFor;
    }
    /* SONAR*/
    const iterateJsonImplIfConditionThree = function (key, indexSub, outFor) {
      var cond;
      cond = (key == 'subTenderingCriterionModels' && indexSub && indexSub != '0');
      return cond && outFor;
    }

    const iterateJsonImplPartTwo = function (json, parentNode, path, fullPath, key, index) {
      var repeatKey = CritCommon.generateKeyForRepeat(path, key, index);
      var div = CritCommon.createDiv12Repeat(repeatKey, path, key, index);
      div.setAttribute('ng-show', "!" + repeatKey + ".flagDelete ||" + repeatKey + ".flagDelete!='true'");
      var iteratingOn = path + '.' + key + '[' + index + ']';
      if (key == 'tenderingCriterionPropertyModels') {
        if (!(json[key][index][0].typeCodeModel.criterionElementType.code == 'CAPTION' && json[key][index][0].descriptionModels[0].description == "")) {
          parentNode.appendChild(div);
          switchCardinalityField(div, json[key][index][0], repeatKey, iteratingOn, fullPath + "." + key + '[' + index + ']' + '[' + 0 + ']');
        }
      } else {
        parentNode.appendChild(div);
        switchCardinality(div, json[key][index][0], repeatKey, iteratingOn, fullPath + "." + key + '[' + index + ']' + '[' + 0 + ']');
      }
    }

    const iterateJsonImpl = function (json, parentNode, path, fullPath, key, outFor) {
      for (var index in json[key]) {
        if (json[key].hasOwnProperty(index)) {
          var indexSub;
          if (key == 'subTenderingCriterionModels' && json[key][index][0].index && json[key][index][0].index != '') {
            indexSub = json[key][index][0].index.split('_')[1];
          }
          if (key != 'subTenderingCriterionModels' || iterateJsonImplIfConditionTwo(key, indexSub, outFor) ||
            iterateJsonImplIfConditionThree(key, indexSub, outFor)) {
            iterateJsonImplPartTwo(json, parentNode, path, fullPath, key, index);
          }
        }
      }
    }
    const iterateJsonSubcriterionEndPage = function (json, parentNode, path, fullPath) {
      //SERVE A RENDERIZZARE NEL CRITERION IL SUBCRITERION IN FONDO ALLA SEZIONE
      if (json.subTenderingCriterionModels && json.subTenderingCriterionModels.length > 0) {
        iterateJsonImpl(json, parentNode, path, fullPath, 'subTenderingCriterionModels', true);
      }
    }

    iterateJson = function (json, parentNode, path, fullPath) {
      for (var key in json) {
        if (json.hasOwnProperty(key)) {
          switch (key) {
            case 'caption':
            case 'legislation':
              break;
            case 'tenderingCriterionPropertyGroupModels':
            case 'subsidiaryTenderingCriterionPropertyGroupModels':
            case 'subTenderingCriterionModels':
            case 'tenderingCriterionPropertyModels':
              iterateJsonImpl(json, parentNode, path, fullPath, key, false);
              break;
            default:
              break;
          }
        }
      }
      iterateJsonSubcriterionEndPage(json, parentNode, path, fullPath);
      return parentNode;
    }

    /*Bottoni per aggiunta/rimozione di sezioni*/
    const switchCardinalityCreateDuplicateButtons = function (json, path, iteratingOn, div) {
      if (json.typeCodeModel.criterionElementType.code != 'REQUIREMENT_SUBGROUP' && json.typeCodeModel.criterionElementType.code != 'REQUIREMENT_GROUP') {
        var buttonsContainer = CritCommon.createDiv('col-lg-12 espd-noheight espd-marginBottom3Em espd-critButtonContainerPosition');
        var plusButton = createPlusButton(json, path, iteratingOn, json.cardinality);
        var deleteButton = createDeleteButton(json, path, iteratingOn, json.cardinality);
        buttonsContainer.appendChild(plusButton);
        buttonsContainer.appendChild(deleteButton);
        div.appendChild(buttonsContainer);
      }
    }

    const switchCardinalityDivCreation = function (json) {
      var div = CritCommon.createDiv('');
      if (json.cardinality == '1' || json.cardinality == '0..1' || json.cardinality == '') {
        div = CritCommon.createDiv('col-lg-12 nopadding');
      } else if (json.typeCodeModel.criterionElementType.code == 'REQUIREMENT_SUBGROUP' || json.typeCodeModel.criterionElementType.code == 'REQUIREMENT_GROUP') {
        div = CritCommon.createDiv('col-lg-12 nopadding');
      } else if (json.typeCodeModel.criterionElementType.code != 'REQUIREMENT') {
        div = CritCommon.createDiv('col-lg-12 espd-divVanilla');
      }
      if (json.descriptionModels) {
        for (var key in json.descriptionModels) {
          if (json.descriptionModels.hasOwnProperty(key)) {
            var desc = json.descriptionModels[key];
            div.appendChild(CritCommon.createGenericDescription(desc));
          }
        }
      }
      return div;
    }

    /* Gestisco la cardinalità */
    switchCardinality = function (node, json, path, iteratingOn, fullPath) {
      var div = switchCardinalityDivCreation(json);
      switchElementCode(div, json, fullPath.substring(0, fullPath.lastIndexOf('.')), null, path);
      switch (json.cardinality) {
        case '0..n':
        case '1..n':
          var parentNode = node.parentElement;
          switchCardinalityCreateDuplicateButtons(json, path, iteratingOn, div);
          itemOnRepeat[path] = CritCommon.startCopyBackupForCardinality(json);
          var div11 = CritCommon.createDiv('col-lg-12 espd-nopadding');
          div.appendChild(div11);
          if (json.cardinality != '1..n') {
            switchCardinalityCreateDivNoElements(json, path, iteratingOn, fullPath, parentNode);
          }
          node.appendChild(div);
          iterateJson(json, div11, path, fullPath);
          break;
        case '1':
        case '':
          node.appendChild(div);
          iterateJson(json, div, path, fullPath);
          break;
        default:
          node.appendChild(div);
          iterateJson(json, div, path, fullPath);
          break;
      }
    }

    const insertFieldMultiEvidenceID = function (json, path, iteratingOn, fullPath, node) {
      var buttonsContainer = CritCommon.createDiv('col-lg-12 espd-noheight espd-marginBottom3Em espd-critButtonContainerPosition');
      buttonsContainer.appendChild(createPlusButton(json, path, iteratingOn, json.cardinality, true));
      var divNoElements = CritCommon.createDivNoElements('col-lg-12 espd-divVanilla');
      divNoElements.appendChild(angular.copy(buttonsContainer));
      var div11copy = CritCommon.createDiv('col-lg-12 espd-nopadding espd-verticalMargin2em');
      var label = CritCommon.createLabel('Click to insert a new question');
      div11copy.appendChild(label);
      divNoElements.appendChild(div11copy);
      switchElementCode(divNoElements, json, fullPath.substring(0, fullPath.lastIndexOf('.')), iteratingOn);
      node.appendChild(divNoElements);
    }

    const insertFieldDivCreation = function (json) {
      var div = CritCommon.createDiv('col-lg-12 espd-nopadding');
      for (let key in json.descriptionModels) {
        if (json.descriptionModels.hasOwnProperty(key)) {
          var desc = json.descriptionModels[key];
          var label;
          if (json.valueDataTypeCodeModel.responseDataType.code == 'AMOUNT' || json.valueDataTypeCodeModel.responseDataType.code == 'MAXIMUM_AMOUNT' || json.valueDataTypeCodeModel.responseDataType.code == 'MINIMUM_AMOUNT') {
            label = CritCommon.createLabelForAmount(desc.description);
          } else {
            label = CritCommon.createLabel(desc.description);
          }
          label.setAttribute('ng-show', "'" + desc.languageID + "'" + ' == defaultLanguage');
          div.appendChild(label);
        }
      }
      return div;
    }

    const createDivEvidenceIdentifier = function(json, itemOnRepeat, path, iteratingOn, node, fullPath){
      if (json.cardinality != '1') {
        itemOnRepeat[path] = CritCommon.startCopyBackupForCardinality(json);
        var buttonsContainer = CritCommon.createDiv('col-lg-12 espd-noheight espd-marginBottom3Em espd-critButtonContainerPosition');
        var plusButton = createPlusButton(json, path, iteratingOn, json.cardinality);
        buttonsContainer.appendChild(plusButton);
        var deleteButton = createDeleteButton(json, path, iteratingOn, json.cardinality);
        buttonsContainer.appendChild(deleteButton);
        node.appendChild(buttonsContainer);
      }
      if (json.cardinality != '1..n') {
        insertFieldMultiEvidenceID(json, path, iteratingOn, fullPath, node);
      }
    }

    const createInputCode = function (json,divField,path) {
      if ((json.responseCodeModel && json.responseCodeModel.listID == 'CPVCodes') ||
        (json.cpvsPropertyModels && json.cpvsPropertyModels.length > 0)) {
        if ($state.$current.name == 'home.overview') {
          divField.appendChild(createMultiCodeAsText(path, json));
        } else {
          divField.appendChild(createMultiCode(path, json));
        }
      } else {
        divField.appendChild(createCode(path, json));
      }
    }

    //Sonar :/
    const insertFieldSwitchOne = function (div,divField ,path,json,iteratingOn,node, fullPath) {
      switch (json.valueDataTypeCodeModel.responseDataType.code) {
        case 'DESCRIPTION':
        case 'CERTIFICATION_LEVEL_DESCRIPTION':
          divField.appendChild(createInputTextarea(path, json));
          break;
        case 'INDICATOR':
        case 'WEIGHT_INDICATOR':
        case 'CODE_BOOLEAN':
          div.classList.add('espd-verticalAlign');
          ifCases[fullPath.substring(0, fullPath.lastIndexOf('.'))] = [path, json.typeCodeModel.criterionElementType.code];
          divField.appendChild(createInputRadio(path, json, json.valueDataTypeCodeModel.responseDataType.code));
          break;
        case 'AMOUNT':
        case 'MAXIMUM_AMOUNT':
        case 'MINIMUM_AMOUNT':
          divField.appendChild(createInputCurrency(path, json));
          break;
        case 'PERCENTAGE':
        case 'QUANTITY':
        case 'QUANTITY_INTEGER':
        case 'QUANTITY_YEAR':
          divField.appendChild(createInputQuantity(path, json));
          break;
        case 'MAXIMUM_VALUE_NUMERIC':
        case 'MINIMUM_VALUE_NUMERIC':
          divField.appendChild(createInputNumber(path, json));
          break;
        case 'LOT_IDENTIFIER':
          if ($state.$current.name == 'home.overview') {
            divField.appendChild(createMultiCodeAsText(path, json));
          } else {
            divField.appendChild(createMultiCode(path, json));
          }
          break;
        case 'CODE':
        case 'CODE_COUNTRY':
          createInputCode(json,divField,path);
          break;
        case 'TRANSLATION_TYPE_CODE':
        case 'COPY_QUALITY_TYPE_CODE':
          divField.appendChild(createCode(path, json));
          break;
        default:
          break;
      }
    }

    //Sonar :S
    const insertFieldSwitchTwo = function (div,divField ,path,json,iteratingOn,node, fullPath) {
      switch (json.valueDataTypeCodeModel.responseDataType.code) {
        case 'DATE':
          divField.appendChild(createInputDate(path, json));
          break;
        case 'PERIOD':
          div.classList.add('espd-verticalAlign');
          divField.appendChild(createInputPeriod(path, json));
          break;
        case 'EVIDENCE_IDENTIFIER':
          createDivEvidenceIdentifier(json,itemOnRepeat,path,iteratingOn,node, fullPath);
          divField.appendChild(createInputEvidenceIdentifier(path));
          break;
        case 'ECONOMIC_OPERATOR_IDENTIFIER':
          divField.appendChild(createInputEconomicOperatorIdentifier(path, json));
          break;
        case 'IDENTIFIER':
          divField.appendChild(createInputTextIdentifier(path, json));
          break;
        case 'URL':
          divField.appendChild(createInputTextUri(path, json));
          break;
        case 'TIME':
          divField.appendChild(createInputTime(path, json));
          break;
        default:
          break;
      }
    }

    const insertField = function (node, json, iteratingOn, path, fullPath) {
      var div = insertFieldDivCreation(json);
      var divField = CritCommon.createDiv('col-lg-7 espd-nomargin');
      insertFieldSwitchOne(div,divField ,path,json,iteratingOn,node, fullPath);
      insertFieldSwitchTwo(div,divField ,path,json,iteratingOn,node, fullPath);
      div.appendChild(divField);
      node.appendChild(div);
    }

    const switchCardinalityFieldIfFirstCondition = function (json) {
      return json.cardinality != '1' && json.cardinality != '0..1' && json.cardinality != undefined;
    }

    const switchCardinalityFieldIfSecondCondition = function (json) {
      return json.valueDataTypeCodeModel.responseDataType.code != 'LOT_IDENTIFIER'
        && json.valueDataTypeCodeModel.responseDataType.code != 'CODE' &&
        json.typeCodeModel.criterionElementType.code != 'REQUIREMENT';
    }

    switchCardinalityField = function (node, json, path, iteratingOn, fullPath) {
      var div;
      if (switchCardinalityFieldIfFirstCondition(json) && switchCardinalityFieldIfSecondCondition(json)) {
        div = CritCommon.createDiv('col-lg-12 espd-divVanilla espd-verticalMargin1em');
      } else {
        div = CritCommon.createDiv('col-lg-12 espd-nopadding espd-verticalMargin1em');
      }
      switch (json.cardinality) {
        case '1':
        case '':
        default:
          itemOnRepeat[path] = CritCommon.startCopyBackupForCardinality(json);
          node.appendChild(div);
          insertField(div, json, iteratingOn, path, fullPath);
          break;
      }
    }

    return {
      build: function (json, path) {
        var form = CritCommon.createForm(CommonService.rebuildCriterionCode(json.criterionTypeCodeModel.criterionElementType.code));
        var parentNode = CritCommon.createDiv('espd-panel panel-body');
        form.appendChild(parentNode);
        parentNode.appendChild(CritCommon.createHeaderNameCriteriaEO(json.name));
        if (json.descriptionModels) {
          for (var key in json.descriptionModels) {
            if (json.descriptionModels.hasOwnProperty(key)) {
              var desc = json.descriptionModels[key];
              parentNode.appendChild(CritCommon.createGenericDescription(desc));
            }
          }
        }
        iterateJson(json, parentNode, path, path);
        return form;
      },
      getItemOnRepeat: function () {
        return angular.copy(itemOnRepeat);
      }
    }
  });
