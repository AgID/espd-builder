angular.module('espdApp')
    .factory('CriterionParserCA', function (CommonService, $state, CriterionParserCommon, MainService) {

        var CritCommon = CriterionParserCommon;
        var ifCases = {};
        var itemOnRepeat = {};

        /*Pulsante di aggiunta di una sezione del criterio, a seconda della cardinalità*/
        const createPlusButton = function (json, path, iteratingOn, cardinality, pathOfCheck, fromEmpty) {
            var button = document.createElement('button');
            if (fromEmpty) {
                button.setAttribute('ng-click', iteratingOn + "[0].flagDelete != 'false'&& " + iteratingOn + "[0].flagDelete ? " + iteratingOn + "[0].flagDelete='false' :" + iteratingOn + ".push(" + "CriterionParserCA.getItemOnRepeat()['" + path + "'])");
            } else {
                button.setAttribute('ng-click', path + ".flagDelete != 'false' && " + iteratingOn + "[0].flagDelete ? " + path + ".flagDelete='false' :" + iteratingOn + ".push(" + "CriterionParserCommon.startCopyBackupForCardinality(" + path + "))");
            }
            button.setAttribute('class', 'btn espd-btn-secondario');
            button.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            button.style.float = 'right';
            var span = CritCommon.createSpan('fa fa-plus');
            switch (cardinality) {
                case '0..1':
                    button.setAttribute('ng-if', iteratingOn + ".length < 1");
                    break;
            }
            button.appendChild(span);
            return button;
        }

        /*Pulsante di delete di una sezione del criterio, a seconda della cardinalità*/
        const createDeleteButton = function (json, path, iteratingOn, cardinality, pathOfCheck) {
            var button = document.createElement('button');
            button.setAttribute('ng-click', iteratingOn + ".length>1 ?" + iteratingOn + ".splice($index,1) : CriterionParserCommon.copyBackupForCardinality(" + path + ",true)");
            button.setAttribute('class', 'btn espd-btn-secondario');
            button.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
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

        /*Textarea*/
        const createInputTextarea = function (path, pathOfCheck) {
            var div12 = CritCommon.createDiv('col-lg-12 nopadding');
            var input = document.createElement('textarea');
            input.setAttribute('class', 'form-control');
            input.setAttribute('rows', '3');
            input.setAttribute('type', 'text');
            input.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            input.setAttribute('ng-model', path + '.expectedDescription');
            input.style = "font-weight:500;";
            div12.appendChild(input);
            return div12;
        }

        /* Evidence id rappresentato da 3 campi di input*/
        const createInputEvidenceIdentifier = function (path, pathOfCheck) {
            var parentDiv = CritCommon.createDiv('row');
            var urlDiv = CritCommon.createDiv('col-lg-12 espd-verticalMargin1em');
            var inputUrl = document.createElement('input');
            inputUrl.setAttribute('class', 'form-control espd-urlStyle ');
            inputUrl.setAttribute('type', 'text');
            inputUrl.setAttribute('ng-model', path + 'evidenceModel.documentReferenceModels[0].attachmentModel.externalReferenceModel.uriModel.uri');
            inputUrl.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            inputUrl.style = "font-weight:500;";
            inputUrl.setAttribute('ng-attr-placeholder', '{{variablesTranslate.crit_url}}')
            urlDiv.appendChild(inputUrl);
            var referenceCodeDiv = CritCommon.createDiv('col-lg-12 espd-verticalMargin1em');
            var inputReferenceCode = document.createElement('input');
            inputReferenceCode.setAttribute('class', 'form-control');
            inputReferenceCode.setAttribute('type', 'text');
            inputReferenceCode.setAttribute('ng-model', path + 'evidenceModel.documentReferenceModels[0].idModel.id');
            inputReferenceCode.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            inputReferenceCode.style = "font-weight:500;";
            inputReferenceCode.setAttribute('ng-attr-placeholder', '{{variablesTranslate.crit_code}}')
            referenceCodeDiv.appendChild(inputReferenceCode);
            var issuerDiv = CritCommon.createDiv('col-lg-12 espd-verticalMargin1em');
            var inputIssuer = document.createElement('input');
            inputIssuer.setAttribute('class', 'form-control');
            inputIssuer.setAttribute('type', 'text');
            inputIssuer.setAttribute('ng-model', path + 'evidenceModel.documentReferenceModels[0].issuerPartyModel.partyNameModels[0].name');
            inputIssuer.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            inputIssuer.style = "font-weight:500;";
            inputIssuer.setAttribute('ng-attr-placeholder', '{{variablesTranslate.crit_issuer}}')
            issuerDiv.appendChild(inputIssuer);
            parentDiv.appendChild(urlDiv);
            parentDiv.appendChild(referenceCodeDiv);
            parentDiv.appendChild(issuerDiv);
            return parentDiv;
        }

        /* Economic Operator Identifier rappresentato da 2 campi. Una select per definire la ListId e un capo di testo per definire il relativo valore. */
        const createInputEconomicOperatorIdentifier = function (path, pathOfCheck) {
            var parentDiv = CritCommon.createDiv('row');
            
            var selectDiv = CritCommon.createDiv('col-lg-12 espd-verticalMargin1em');
            var select = document.createElement('select');
            select.setAttribute('class', 'form-control optsorted');
            select.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            select.setAttribute('ng-model', path + '.expectedCodeModel.expectedCode');
            var option = document.createElement('option');
            option.setAttribute('disabled', '');
            option.setAttribute('selected', '');
            option.setAttribute('hidden', '');
            option.setAttribute('value', '');
            option.innerHTML = '---'; 
            var options = document.createElement('option');
            options.setAttribute('ng-repeat', 'x in eoIDTypeList');
            options.setAttribute('ng-show', "x.status == 'ACTIVE'")
            options.setAttribute('value', '{{x.code}}');
            options.innerHTML = '{{x.translation}}';
            select.appendChild(option);
            select.appendChild(options); 
            selectDiv.appendChild(select);       

            var inputDiv = CritCommon.createDiv('col-lg-12 espd-verticalMargin1em');
            var input = document.createElement('input');
            input.setAttribute('class', 'form-control');
            input.setAttribute('type', 'text');
            input.setAttribute('ng-model', path + '.expectedIDModel.expectedID');
            input.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            input.style = "font-weight:500;";
            inputDiv.appendChild(input); 

            parentDiv.appendChild(selectDiv);
            parentDiv.appendChild(inputDiv);
            return parentDiv;	
        }

        /* Input text id*/
        const createInputTextIdentifier = function (path, pathOfCheck) {
            var input = document.createElement('input');
            input.setAttribute('class', 'form-control');
            input.setAttribute('type', 'text');
            input.setAttribute('ng-model', path + '.expectedIDModel.expectedID');
            input.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            input.style = "font-weight:500;";
            return input;
        }

        /* Input text (URL) */
        const createInputTextUri = function (path, pathOfCheck) {
            var input = document.createElement('input');
            input.setAttribute('class', 'form-control');
            input.setAttribute('type', 'text');
            input.setAttribute('ng-model', path + '.expectedIDModel.expectedID');
            input.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            input.style = "font-weight:500;";
            return input;
        }

        /* Input numerico */
        const createInputNumber = function (path, pathOfCheck) {
            var input = document.createElement('input');
            input.setAttribute('class', 'form-control');
            input.setAttribute('type', 'number');
            input.setAttribute('ng-model', path + '.expectedValueNumeric');
            input.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            input.style = "font-weight:500;";
            return input;
        }

        /* Input numerico */
        const createInputMeasure = function (path, json, pathOfCheck) {
            var input = document.createElement('input');
            input.setAttribute('class', 'form-control');
            input.setAttribute('type', 'number');
            input.setAttribute('ng-model', path + '.expectedValueNumeric');
            input.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            input.style = "font-weight:500;";
            return input;
        }

        /* Input numerico */
        const createInputQuantity = function (path, type, pathOfCheck) {
            var input = document.createElement('input');
            input.setAttribute('class', 'form-control');
            input.setAttribute('type', 'number');
            input.setAttribute('ng-model', path + '.expectedValueNumeric');
            input.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            input.style = "font-weight:500;";
            switch (type) {
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

        /* Input numerico */
        const createInputCurrency = function (path, type, pathOfCheck) {
            var div12 = CritCommon.createDiv('col-lg-12 nopadding');
            var div9 = CritCommon.createDiv('col-lg-8 nopadding');
            var div3 = CritCommon.createDiv('col-lg-4');
            div3.style = 'padding-right: 0';
            var input = document.createElement('input');
            input.setAttribute('class', 'form-control');
            input.setAttribute('type', 'number');
            input.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            input.setAttribute('ng-model', path + '.expectedAmountModel.expectedAmount');
            input.style = "font-weight:500;";
            var select = document.createElement('select');
            select.setAttribute('ng-model', path + '.expectedAmountModel.currencyID');
            select.setAttribute('class', 'form-control optsorted');
            select.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            var option = document.createElement('option');
            option.setAttribute('disabled', '');
            option.setAttribute('selected', '');
            option.setAttribute('hidden', '');
            option.setAttribute('value', '');
            option.innerHTML = '---';
            var options = document.createElement('option');
            options.setAttribute('ng-repeat', 'currency in currencyType');
            options.setAttribute('value', '{{currency.code}}');
            options.setAttribute('ng-show', "currency.status == 'ACTIVE'");
            options.innerHTML = '{{currency.code}}';
            select.appendChild(option);
            select.appendChild(options);
            div9.appendChild(input);
            div3.appendChild(select);
            div12.appendChild(div9);
            div12.appendChild(div3);
            return div12;
        }

        /* Imposta la checkbox per selezionare i criteri su SELEZIONE */
        const createSelectionCriterion = function (path, pathOfCheck) {
            var input = document.createElement('input');
            input.setAttribute('class', 'espd-selectionCheckboxPosition');
            input.setAttribute('type', 'checkbox');
            input.setAttribute('ng-model', path);
            input.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            if (path.indexOf("EXCLUSION") > -1)
                input.setAttribute('ng-show', '!afterExclusionPage && !isOverview');
            else
                input.setAttribute('ng-show', '!afterExclusionPage');
            return input;
        }

        /*Data*/
        const createInputDate = function (path, pathOfCheck) {
            var input = document.createElement('input');
            input.setAttribute('class', 'form-control');
            input.setAttribute('type', 'date');
            input.setAttribute('ng-style', "{'color':" + path + ".periodModels[0]==null ? 'grey' :'#555'}");
            input.setAttribute('date-input', '');
            input.setAttribute('ng-model', path + '.periodModels[0]');
            input.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            input.style = "font-weight:500;";
            return input;
        }

        /* Orario */
        const createInputTime = function (path, pathOfCheck) {
            var input = document.createElement('input');
            input.setAttribute('class', 'form-control');
            input.setAttribute('type', 'time');
            input.setAttribute('ng-model', path + '.periodModels[0]');
            input.setAttribute('ng-style', "{'color':" + path + ".periodModels[0]==null ? 'grey' :'#555'}");
            input.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            input.style = "font-weight:500;";
            return input;
        }

        /*Data da - Data a*/
        const createInputPeriod = function (path, pathOfCheck) {
            var div = CritCommon.createDiv('col-lg-12 nopadding');
            var divLabel1 = CritCommon.createDiv('col-lg-5 nopadding');
            var labelInput1 = document.createElement('label');
            labelInput1.setAttribute('class', 'col-lg-12 nopadding');
            var span1 = CritCommon.createSpan('');
            span1.innerHTML = '{{variablesTranslate.crit_start_date}}';
            labelInput1.appendChild(span1);
            divLabel1.appendChild(labelInput1);
            div.appendChild(divLabel1);

            var labelSpace = CritCommon.createDiv('col-lg-2');
            div.appendChild(labelSpace);

            var divLabel2 = CritCommon.createDiv('col-lg-5 nopadding');
            var labelInput2 = document.createElement('label');
            labelInput2.setAttribute('class', 'col-lg-12 nopadding');
            var span2 = CritCommon.createSpan('');
            span2.innerHTML = '{{variablesTranslate.crit_end_date}}';
            labelInput2.appendChild(span2);
            divLabel2.appendChild(labelInput2);
            div.appendChild(divLabel2);

            var divContainer = CritCommon.createDiv('col-lg-12 nopadding');
            var divInput = CritCommon.createDiv('col-lg-5 nopadding');
            var spanError = document.createElement('span');
            spanError.setAttribute('class', 'valid-feedback-error');
            spanError.innerHTML = '{{variablesTranslate.validator_period}}';
            spanError.setAttribute('ng-show', 'periodValidation(' + path + '.periodModels[0].startDate,' + path + '.periodModels[0].endDate)');
            var inputFrom = document.createElement('input');
            inputFrom.setAttribute('class', 'form-control');
            inputFrom.setAttribute('type', 'date');
            inputFrom.setAttribute('date-input', '');
            inputFrom.setAttribute('ng-model', path + '.periodModels[0].startDate');
            inputFrom.setAttribute('ng-style', "{'color':" + path + ".periodModels[0].startDate==null ? 'grey' :'#555'}");
            inputFrom.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            inputFrom.setAttribute('ng-class', "periodValidation(" + path + ".periodModels[0].startDate," + path + ".periodModels[0].endDate) ? 'espd-fieldInvalid' : ''");
            inputFrom.style = "font-weight:500;";
            divInput.appendChild(inputFrom);
            divInput.appendChild(spanError);
            divContainer.appendChild(divInput);
            var divSpace = CritCommon.createDiv('col-lg-2');
            var divInput2 = CritCommon.createDiv('col-lg-5 nopadding');
            var inputTo = document.createElement('input');
            inputTo.setAttribute('class', 'form-control');
            inputTo.setAttribute('type', 'date');
            inputTo.setAttribute('date-input', '');
            inputTo.setAttribute('ng-model', path + '.periodModels[0].endDate');
            inputTo.setAttribute('ng-style', "{'color':" + path + ".periodModels[0].endDate==null ? 'grey' :'#555'}");
            inputTo.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            inputTo.setAttribute('ng-class', "periodValidation(" + path + ".periodModels[0].startDate," + path + ".periodModels[0].endDate,true) ? 'espd-fieldInvalid' : ''");
            inputTo.style = "font-weight:500;";
            divInput2.appendChild(inputTo);
            divInput2.appendChild(angular.copy(spanError));
            divContainer.appendChild(divSpace);
            divContainer.appendChild(divInput2);
            div.appendChild(divContainer);
            return div;
        }

        /*Lista generica*/
        const createCode = function (path, json, pathOfCheck) {
            var select = document.createElement('select');
            select.setAttribute('class', 'form-control optsorted');
            select.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            var option = document.createElement('option');
            option.setAttribute('disabled', '');
            option.setAttribute('selected', '');
            option.setAttribute('hidden', '');
            option.setAttribute('value', '');
            option.innerHTML = '---'
            var options = document.createElement('option');
            switch (json.valueDataTypeCodeModel.responseDataType.code) {
                case 'CODE':
                    select.setAttribute('ng-model', path + '.expectedCodeModel.expectedCode');
                    if (json.expectedCodeModel) {
                        switch (json.expectedCodeModel.listID) {
                            case 'BidType':
                                options.setAttribute('ng-repeat', 'x in bidTypeList');
                                options.setAttribute('ng-show', "x.status == 'ACTIVE'")
                                break;
                            case 'FinancialRatioType':
                                options.setAttribute('ng-repeat', 'x in ratioTypeList');
                                options.setAttribute('ng-show', "x.status == 'ACTIVE'")
                                break;
                        }
                    }
                    options.setAttribute('value', '{{x.code}}');
                    options.innerHTML = '{{x.translation}}';
                    break;
                case 'CODE_COUNTRY':
                    select.setAttribute('ng-model', path + '.expectedCodeModel.expectedCode');
                    options.setAttribute('ng-repeat', 'country in countries');
                    options.setAttribute('value', '{{country.iso2Code}}');
                    options.innerHTML = '{{country.countryName}}';
                    break;
                case 'LOT_IDENTIFIER':
                    options.setAttribute('ng-repeat', 'lot in lotsList');
                    options.setAttribute('ng-value', 'lot');
                    // options.setAttribute('ng-selected', 'lot.expectedIDModel.expectedID == $parent.'+path+'.lotsPropertyModels[0].expectedIDModel.expectedID');
                    options.innerHTML = '{{lot.expectedIDModel.expectedID}}';
                    select.setAttribute('ng-model', path + '.lotsPropertyModels[0]');
                    break;
            }
            select.appendChild(option);
            select.appendChild(options);
            return select;
        }

        /* Multiselect tradotta a textarea con scritti gli elementi selezionati */
        const createMultiCodeAsText = function (path, json) {
            var div = CritCommon.createDiv('col-lg-12 nopadding');
            var input = document.createElement('textarea');
            input.setAttribute('class', 'form-control');
            input.setAttribute('rows', '3');
            input.setAttribute('type', 'text');
            input.setAttribute('ng-disabled', 'true');
            var arrayAsString = "";
            switch (json.valueDataTypeCodeModel.responseDataType.code) {
                case 'LOT_IDENTIFIER':
                	if (json.lotsPropertyModels) {
                        for (var i = 0; i < json.lotsPropertyModels.length; i++) {
                            arrayAsString += json.lotsPropertyModels[i].expectedIDModel.expectedID;
                            if (i != json.lotsPropertyModels.length - 1) {
                                arrayAsString += ', '
                            }
                        }
                	}
                    break;
                case 'CODE':
                	if (json.cpvsPropertyModels) {
                        for (var i = 0; i < json.cpvsPropertyModels.length; i++) {
                            arrayAsString += json.cpvsPropertyModels[i].expectedCodeModel.expectedCode;
                            if (i != json.cpvsPropertyModels.length - 1) {
                                arrayAsString += ', '
                            }
                        }
                	}
                    break;
                default:
                    break;
            }
            input.value = arrayAsString;
            input.style = "font-weight:500;";
            div.appendChild(input);
            return div;
        }

        /*Multiselect*/
        const createMultiCode = function (path, json, pathOfCheck) {
            var div = CritCommon.createDiv('col-lg-12 nopadding');
            var multiselect = document.createElement('multiselect');
            multiselect.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            if (json.cardinality == '1') {
                multiselect.setAttribute('multiple', 'false');
            } else {
                multiselect.setAttribute('multiple', 'true');
            }
            multiselect.setAttribute('change', 'selected()');
            multiselect.setAttribute('ng-required', pathOfCheck);
            multiselect.setAttribute('role', '{{startVariables.userRole}}');
            switch (json.valueDataTypeCodeModel.responseDataType.code) {
                case 'LOT_IDENTIFIER':
                    if (json.cardinality == '1') {
                        multiselect.setAttribute('ng-model', path + '.lotsPropertyModels[0]');
                    } else {
                        multiselect.setAttribute('ng-model', path + '.lotsPropertyModels');
                    }
                    multiselect.setAttribute('customPlaceholder', '{{variablesTranslate.crit_lots}}')
                    multiselect.setAttribute('options', 'elem.expectedIDModel.expectedID for elem in lotsList');
                    multiselect.setAttribute('typeList', 'LOTS');
                    break;
                case 'CODE':
                    if (json.cardinality == '1') {
                        multiselect.setAttribute('ng-model', path + '.cpvsPropertyModels[0]');
                    } else {
                        multiselect.setAttribute('ng-model', path + '.cpvsPropertyModels');
                    }
                    multiselect.setAttribute('customPlaceholder', '{{variablesTranslate.crit_cpv_codes}}');
                    multiselect.setAttribute('options', 'elem.expectedCodeModel.expectedCode for elem in cpvsList');
                    multiselect.setAttribute('typeList', 'CPVS');
                    break;
            }
            multiselect.setAttribute('ng-if', 'isTraductionDone');
            div.appendChild(multiselect);
            return div;
        }

        /*Radio button*/
        const createInputRadio = function (path, pathOfCheck, json, type) {
            var labelMargin = CritCommon.createLabelRadioMargin();
            var labelMargin2 = CritCommon.createLabelRadioMargin();
            var inputTrue = document.createElement('input');
            inputTrue.setAttribute('class', 'espd-marginLeft1em espd-radioSize');
            inputTrue.setAttribute('type', 'radio');
            // inputTrue.setAttribute('ng-model', path + '.value');
            inputTrue.setAttribute('tabindex', path + '.value0');
            inputTrue.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            var inputFalse = document.createElement('input');
            inputFalse.setAttribute('class', 'espd-marginLeft1em espd-radioSize');
            inputFalse.setAttribute('type', 'radio');
            // inputFalse.setAttribute('ng-model', path + '.value');
            inputFalse.setAttribute('ng-disabled', 'isOverview || criterionSelection.' + pathOfCheck + '==false');
            inputFalse.style = "font-weight:500;";
            var spanYes;
            var spanNo;
            var container1 = CritCommon.createSpanWithText('', '');
            var container2 = CritCommon.createSpanWithText('', 'espd-marginLeft3em');
            var divReturn = CritCommon.createDiv('radio radio-info');
            if (type == 'CODE_BOOLEAN') {
                spanYes = CritCommon.createSpanWithText('{{booleanGUIControlTypeList[0].translation}}', '');
                spanNo = CritCommon.createSpanWithText('{{booleanGUIControlTypeList[1].translation}}', '');
                inputTrue.setAttribute('ng-model', path + '.expectedCodeModel.expectedCode');
                inputFalse.setAttribute('ng-model', path + '.expectedCodeModel.expectedCode');
                inputTrue.setAttribute('ng-value', 'booleanGUIControlTypeList[0].code');
                inputFalse.setAttribute('ng-value', 'booleanGUIControlTypeList[1].code');
                container1.setAttribute('ng-click', '!isOverview && criterionSelection.' + pathOfCheck + '==true ? ' + path + ".expectedCodeModel.expectedCode = booleanGUIControlTypeList[0].code : ''; !isOverview && criterionSelection." + pathOfCheck + "==true ?  $parent.indicatorStorage" + path + "['" + path + "_'] = 'true' : ''");
                container2.setAttribute('ng-click', '!isOverview && criterionSelection.' + pathOfCheck + '==true ? ' + path + ".expectedCodeModel.expectedCode = booleanGUIControlTypeList[1].code : ''; !isOverview && criterionSelection." + pathOfCheck + "==true ?  $parent.indicatorStorage" + path + "['" + path + "_'] = 'false' : ''");
                divReturn.setAttribute('ng-init', "$parent.indicatorStorage" + path + "['" + path + "_'] = " + path + ".expectedCodeModel.expectedCode");
            } else {
                spanYes = CritCommon.createSpanWithText('{{variablesTranslate.yes}}', '');
                spanNo = CritCommon.createSpanWithText('{{variablesTranslate.no}}', '')
                inputTrue.setAttribute('ng-model', path + '.expectedIDModel.expectedID');
                inputFalse.setAttribute('ng-model', path + '.expectedIDModel.expectedID');
                inputTrue.setAttribute('value', 'true');
                inputFalse.setAttribute('value', 'false');
                container1.setAttribute('ng-click', '!isOverview && criterionSelection.' + pathOfCheck + '==true ? ' + path + ".expectedIDModel.expectedID = 'true' : ''; !isOverview && criterionSelection." + pathOfCheck + "==true ?  $parent.indicatorStorage" + path + "['" + path + "_'] = 'true' : ''");
                container2.setAttribute('ng-click', '!isOverview && criterionSelection.' + pathOfCheck + '==true ? ' + path + ".expectedIDModel.expectedID = 'false' : ''; !isOverview && criterionSelection." + pathOfCheck + "==true ?  $parent.indicatorStorage" + path + "['" + path + "_'] = 'false' : ''");
                divReturn.setAttribute('ng-init', "$parent.indicatorStorage" + path + "['" + path + "_'] = " + path + ".expectedIDModel.expectedID");
            }

            // container1.setAttribute('ng-click', '!isOverview && criterionSelection.' + pathOfCheck + '==true ? ' + path + '.expectedIDModel.expectedID = "true" : ""');
            inputTrue.setAttribute('ng-change', "$parent.indicatorStorage" + path + "['" + path + "_'] = 'true'");
            inputFalse.setAttribute('ng-change', "$parent.indicatorStorage" + path + "['" + path + "_'] = 'false'");

            // container2.setAttribute('ng-click', '!isOverview && criterionSelection.' + pathOfCheck + '==true ?' + path + '.expectedIDModel.expectedID = "false": ""');
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

        /* Gestisco il fatto che la sezione sia visibile a seconda del valore dell'indicator precedente */
        const switchElementCode = function (div, json, path, indicatorPath, compressPath) {
            if (json.propertyGroupTypeCodeModel && ifCases[path] != undefined) {
                switch (json.propertyGroupTypeCodeModel.propertyGroupType.code) {
                    case 'ONTRUE':
                        if (indicatorPath) {
                            div.setAttribute('ng-show', "indicatorStorage" + ifCases[path] + "? indicatorStorage" + ifCases[path] + "['" + ifCases[path] + "_'] == 'true' || (booleanGUIControlTypeList[0] && booleanGUIControlTypeList[0].code && indicatorStorage" + ifCases[path] + "['" + ifCases[path] + "_'] == booleanGUIControlTypeList[0].code) && " + indicatorPath + ".length ==0 : $parent.indicatorStorage" + ifCases[path] + "['" + ifCases[path] + "_'] == 'true' && " + indicatorPath + ".length ==0");
                            div.setAttribute('compressPath', compressPath);
                            div.setAttribute('indicatorPath', ifCases[path]);
                            div.setAttribute('remove-json-values', 'ONTRUE');
                        } else {
                            div.setAttribute('ng-show', "indicatorStorage" + ifCases[path] + " ? indicatorStorage" + ifCases[path] + "['" + ifCases[path] + "_'] == 'true' || (booleanGUIControlTypeList[0] && booleanGUIControlTypeList[0].code && indicatorStorage" + ifCases[path] + "['" + ifCases[path] + "_'] == booleanGUIControlTypeList[0].code) : $parent.indicatorStorage" + ifCases[path] + "['" + ifCases[path] + "_'] == 'true'");
                            div.setAttribute('compressPath', compressPath);
                            div.setAttribute('indicatorPath', ifCases[path]);
                            div.setAttribute('remove-json-values', 'ONTRUE');
                        }
                        break;
                    case 'ONFALSE':
                        if (indicatorPath) {
                            div.setAttribute('ng-show', "indicatorStorage" + ifCases[path] + " ? indicatorStorage" + ifCases[path] + "['" + ifCases[path] + "_'] == 'false' || (booleanGUIControlTypeList[1] && booleanGUIControlTypeList[1].code && indicatorStorage" + ifCases[path] + "['" + ifCases[path] + "_'] == booleanGUIControlTypeList[1].code) && " + indicatorPath + ".length ==0 : $parent.indicatorStorage" + ifCases[path] + "['" + ifCases[path] + "_'] == 'false' && " + indicatorPath + ".length ==0");
                            div.setAttribute('compressPath', compressPath);
                            div.setAttribute('indicatorPath', ifCases[path]);
                            div.setAttribute('remove-json-values', 'ONFALSE');
                        } else {
                            div.setAttribute('ng-show', "indicatorStorage" + ifCases[path] + " ? indicatorStorage" + ifCases[path] + "['" + ifCases[path] + "_'] == 'false' || (booleanGUIControlTypeList[1] && booleanGUIControlTypeList[1].code && indicatorStorage" + ifCases[path] + "['" + ifCases[path] + "_'] == booleanGUIControlTypeList[1].code) : $parent.indicatorStorage" + ifCases[path] + "['" + ifCases[path] + "_'] == 'false'");
                            div.setAttribute('compressPath', compressPath);
                            div.setAttribute('indicatorPath', ifCases[path]);
                            div.setAttribute('remove-json-values', 'ONFALSE');
                        }
                        break;
                    default:
                        if (indicatorPath) {
                            div.setAttribute('ng-show', indicatorPath + ".length ==0");
                        }
                        break;
                }
            } else {
                if (indicatorPath) {
                    div.setAttribute('ng-show', indicatorPath + ".length ==0");
                }
            }
        }

        /*Gestione della cardinalità*/
        const switchCardinality = function (node, json, path, iteratingOn, fullPath, pathOfCheck) {
            var div;
            if (json.cardinality == '1' || json.cardinality == '0..1' || json.cardinality == '') {
                div = CritCommon.createDiv('col-lg-12 espd-verticalMargin1em nopadding');
            } else {
                div = CritCommon.createDiv('col-lg-12 espd-divVanilla');
            }
            //LA CA NON VEDE LE QUESTION
            if (json.typeCodeModel != undefined && (json.typeCodeModel.criterionElementType.code == 'QUESTION_GROUP' || json.typeCodeModel.criterionElementType.code == 'QUESTION_SUBGROUP')) {
                div.setAttribute('ng-show', 'false');
            }
            /* Appendo la descrizione */
            if (json.descriptionModels) {
                for (var key in json.descriptionModels) {
                	var desc = json.descriptionModels[key];
                    div.appendChild(CritCommon.createGenericDescription(desc));
                }
            }
            switchElementCode(div, json, fullPath.substring(0, fullPath.lastIndexOf('.')), null, path);
            //Gestisco la cardinalità
            switch (json.cardinality) {
                // Nei casi 1..n e 0..n aggiungo i tasti '+' e 'delete' per poter aggiungere o rimuovere domande
                case '0..n':
                case '1..n':
                    var parentNode = node.parentElement;
                    var buttonsContainer = CritCommon.createDiv('col-lg-12 espd-noheight espd-marginBottom3Em espd-critButtonContainerPosition');
                    var plusButton = createPlusButton(json, path, iteratingOn, json.cardinality, pathOfCheck);
                    var deleteButton = createDeleteButton(json, path, iteratingOn, json.cardinality, pathOfCheck);
                    buttonsContainer.appendChild(plusButton);
                    buttonsContainer.appendChild(deleteButton);
                    div.appendChild(buttonsContainer);
                    itemOnRepeat[path] = CritCommon.startCopyBackupForCardinality(json);
                    if (json.cardinality != '1..n') {
                        var buttonsContainer = CritCommon.createDiv('col-lg-12 espd-noheight espd-marginBottom3Em espd-critButtonContainerPosition');
                        buttonsContainer.appendChild(createPlusButton(json, path, iteratingOn, json.cardinality, pathOfCheck, true));
                        var divNoElements = CritCommon.createDivNoElements('col-lg-12 espd-divVanilla');
                        divNoElements.appendChild(angular.copy(buttonsContainer));
                        divNoElements.classList.remove('espd-critButtonContainerPosition');
                        var div11copy = CritCommon.createDiv('col-lg-12 nopadding');
                        var label = CritCommon.createLabel('Click to insert a new question');
                        div11copy.appendChild(label);
                        divNoElements.appendChild(div11copy);
                        divNoElements.setAttribute("ng-show", fullPath + ".flagDelete == 'true'")
                        parentNode.appendChild(divNoElements);
                    }
                    node.appendChild(div);
                    iterateJson(json, div, path, fullPath, pathOfCheck);
                    break;
                case '0..1':
                case '1':
                    node.appendChild(div);
                    iterateJson(json, div, path, fullPath, pathOfCheck);
                    break;
                default:
                    node.appendChild(div);
                    iterateJson(json, div, path, fullPath, pathOfCheck);
                    break;
            }
        }

        /*Crea un input diverso a seconda del tipo di tenderingCriterionPropertyModels in input*/
        const insertField = function (node, json, path, fullPath, pathOfCheck) {
            var div = CritCommon.createDiv('col-lg-12 nopadding');
            for (key in json.descriptionModels) {
            	var desc = json.descriptionModels[key];
                var label;
                if (json.valueDataTypeCodeModel.responseDataType.code == 'AMOUNT' || json.valueDataTypeCodeModel.responseDataType.code == 'MAXIMUM_AMOUNT' || json.valueDataTypeCodeModel.responseDataType.code == 'MINIMUM_AMOUNT') {
                    label = CritCommon.createLabelForAmount(desc.description);
                } else {
                    label = CritCommon.createLabel(desc.description);
                }
                var divField = CritCommon.createDiv('col-lg-7 espd-nomargin');
                var x = "'" + desc.languageID + "'" + ' == defaultLanguage';
                label.setAttribute('ng-show', "'" + desc.languageID + "'" + ' == defaultLanguage');
                div.appendChild(label);
            }
            var divField = CritCommon.createDiv('col-lg-7 espd-nomargin');
            switch (json.valueDataTypeCodeModel.responseDataType.code) {
                case 'DESCRIPTION':
                case 'CERTIFICATION_LEVEL_DESCRIPTION':
                    divField.appendChild(createInputTextarea(path, pathOfCheck));
                    break;
                case 'INDICATOR':
                case 'WEIGHT_INDICATOR':
                case 'CODE_BOOLEAN':
                    div.classList.add('espd-verticalAlign');
                    // ifCases[fullPath.substring(0, fullPath.lastIndexOf('.'))] = fullPath;
                    ifCases[fullPath.substring(0, fullPath.lastIndexOf('.'))] = path;
                    divField.appendChild(createInputRadio(path, pathOfCheck, json, json.valueDataTypeCodeModel.responseDataType.code));
                    break;
                case 'AMOUNT':
                case 'MAXIMUM_AMOUNT':
                case 'MINIMUM_AMOUNT':
                    divField.appendChild(createInputCurrency(path, json.valueDataTypeCodeModel.responseDataType.code, pathOfCheck));
                    break;
//                case 'QUANTITY_INTEGER':
//                case 'QUANTITY_YEAR':
//                    divField.appendChild(createInputMeasure(path, json.valueDataTypeCodeModel.responseDataType.code, pathOfCheck));
//                    break;
                case 'PERCENTAGE':
                case 'QUANTITY':
                case 'QUANTITY_INTEGER':
                case 'QUANTITY_YEAR':
                    divField.appendChild(createInputQuantity(path, json.valueDataTypeCodeModel.responseDataType.code, pathOfCheck));
                    break;
                case 'MAXIMUM_VALUE_NUMERIC':
                case 'MINIMUM_VALUE_NUMERIC':
                    divField.appendChild(createInputNumber(path, json.valueDataTypeCodeModel.responseDataType.code, pathOfCheck));
                    break;
                case 'LOT_IDENTIFIER':
                    if ($state.$current.name == 'home.overview') {
                        divField.appendChild(createMultiCodeAsText(path, json));
                    } else {
                        divField.appendChild(createMultiCode(path, json, pathOfCheck));
                    }
                    break;
                case 'CODE':
                case 'CODE_COUNTRY':
                    if ((json.expectedCodeModel && json.expectedCodeModel.listID == 'CPVCodes') ||
                        (json.cpvsPropertyModels && json.cpvsPropertyModels.length > 0)) {
                        if ($state.$current.name == 'home.overview') {
                            divField.appendChild(createMultiCodeAsText(path, json));
                        } else {
                            divField.appendChild(createMultiCode(path, json, pathOfCheck));
                        }
                    } else {
                        divField.appendChild(createCode(path, json, pathOfCheck));
                    }
                    break;
                case 'TRANSLATION_TYPE_CODE':
                case 'COPY_QUALITY_TYPE_CODE':
                    divField.appendChild(createCode(path, json, pathOfCheck));
                    break;
                case 'DATE':
                    divField.appendChild(createInputDate(path, pathOfCheck));
                    break;
                case 'PERIOD':
                    div.classList.add('espd-verticalAlign');
                    divField.appendChild(createInputPeriod(path, pathOfCheck));
                    break;
                case 'EVIDENCE_IDENTIFIER':
                    divField.appendChild(createInputEvidenceIdentifier(path, pathOfCheck));
                    break;
                case 'ECONOMIC_OPERATOR_IDENTIFIER':
                    divField.appendChild(createInputEconomicOperatorIdentifier(path, pathOfCheck));
                    break;
                case 'IDENTIFIER':
                    divField.appendChild(createInputTextIdentifier(path, pathOfCheck));
                    break;
                case 'URL':
                    divField.appendChild(createInputTextUri(path, pathOfCheck));
                    break;
                case 'TIME':
                    divField.appendChild(createInputTime(path, pathOfCheck));
                    break;
                default:
                    break;
            }
            div.appendChild(divField);
            node.appendChild(div);
        }

        /*Al momento poco utile, servirebbe a distinguere la cardinalità dei singoli tenderingCriterionPropertyModels*/
        const switchCardinalityField = function (node, json, path, iteratingOn, fullPath, pathOfCheck) {
            var div = CritCommon.createDiv('col-lg-12 nopadding espd-verticalMargin1em');
            switch (json.cardinality) {
                case '0..1':
                case '1..n':
                case '0..n':
                case '1':
                default:
                    itemOnRepeat[path] = CritCommon.startCopyBackupForCardinality(json);
                    node.appendChild(div);
                    insertField(div, json, path, fullPath, pathOfCheck);
                    break;
            }
        }

        /*Sonar :V */
        /* Creo un ng-repeat per ogni campo significativo del criterio, utilizzando come chiave dell'ng-repeat il path di dove si trova
        il campo all'interno del json;
        Inoltre chiamo 2 metodi diversi a seconda se il campo è un tenderingCriterionPropertyModels o meno*/
        const iterateJsonImpl = function (json, parentNode, path, fullPath, pathOfCheck, key, outFor) {
            for (var index in json[key]) {
            	var indexSub;
            	if (key == 'subTenderingCriterionModels' && json[key][index][0].index && json[key][index][0].index != ''){
            		indexSub = json[key][index][0].index.split('_')[1];
            	}
            	if (key != 'subTenderingCriterionModels' || (key == 'subTenderingCriterionModels' && indexSub && indexSub == '0' && !outFor) ||
        			(key == 'subTenderingCriterionModels' && indexSub && indexSub != '0' && outFor)) {
	                var repeatKey = CritCommon.generateKeyForRepeat(path, key, index);
	                var div = CritCommon.createDiv12Repeat(repeatKey, path, key, index);
	                div.setAttribute('ng-show', "!" + repeatKey + ".flagDelete ||" + repeatKey + ".flagDelete!='true'");
	                var iteratingOn = path + '.' + key + '[' + index + ']';
	                if (key == 'tenderingCriterionPropertyModels' && json[key][index][0].typeCodeModel.criterionElementType.code != 'QUESTION') {
	                    if (!(json[key][index][0].typeCodeModel.criterionElementType.code == 'CAPTION' && json[key][index][0].descriptionModels[0].description == "")) {
	                        parentNode.appendChild(div);
	                        switchCardinalityField(div, json[key][index][0], repeatKey, iteratingOn, fullPath + "." + key + '[' + index + ']' + '[' + 0 + ']', pathOfCheck);
	                    }
	                } else {
	                    parentNode.appendChild(div);
	                    switchCardinality(div, json[key][index][0], repeatKey, iteratingOn, fullPath + "." + key + '[' + index + ']' + '[' + 0 + ']', pathOfCheck);
	                }
            	}
            }
        }

        /*Itera ricorsivamente il json del criterion selezionando chiavi definite su cui lavorare*/
        const iterateJson = function (json, parentNode, path, fullPath, pathOfCheck) {
            for (var key in json) {
                switch (key) {
                    case 'caption':
                    case 'legislation':
                        break;
                    case 'tenderingCriterionPropertyGroupModels':
                    case 'subTenderingCriterionModels':
                    case 'subsidiaryTenderingCriterionPropertyGroupModels':
                    case 'tenderingCriterionPropertyModels':
                        iterateJsonImpl(json, parentNode, path, fullPath, pathOfCheck, key, false);
                        break;
                    default:
                        break;
                }
            }
            //SERVE A RENDERIZZARE NEL CRITERION IL SUBCRITERION IN FONDO ALLA SEZIONE
            if(json.subTenderingCriterionModels && json.subTenderingCriterionModels.length>0){
                iterateJsonImpl(json, parentNode, path, fullPath, pathOfCheck,'subTenderingCriterionModels', true);
            }
            return parentNode;
        }

        return {
          /*Crea un singolo criterion*/
            build: function (json, path, prefixId, isProcedure) {
                var form = CritCommon.createForm(CommonService.rebuildCriterionCode(json.criterionTypeCodeModel.criterionElementType.code));
                var parentNode = CritCommon.createDiv('espd-panel panel-body');
                form.appendChild(parentNode);
                var htmlGenerated;
                /*Se siamo in procedura il criterio è creato in maniera diversa*/
                if (isProcedure) {
                    var checkboxSelection = createSelectionCriterion('criterionSelection.' + CommonService.rebuildCriterionCode(json.criterionTypeCodeModel.criterionElementType.code));
                    parentNode.appendChild(checkboxSelection);
                    parentNode.appendChild(CritCommon.createHeaderNameCriteriaCA(json.name, CommonService.rebuildCriterionCode(json.criterionTypeCodeModel.criterionElementType.code)));
                    if (json.descriptionModels) {
                        for (var key in json.descriptionModels) {
                        	var desc = json.descriptionModels[key];
                            parentNode.appendChild(CritCommon.createGenericDescription(desc));
                        }
                    }
                    htmlGenerated = iterateJson(json, parentNode, path, path, CommonService.rebuildCriterionCode(json.criterionTypeCodeModel.criterionElementType.code));
                } else {
                    var checkboxSelection = createSelectionCriterion('criterionSelection.' + path.split('.')[1]);
                    parentNode.appendChild(checkboxSelection);
                    parentNode.appendChild(CritCommon.createHeaderNameCriteriaCA(json.name, path.split('.')[1]));
                    if (json.descriptionModels) {
                        for (var key in json.descriptionModels) {
                        	var desc = json.descriptionModels[key];
                            parentNode.appendChild(CritCommon.createGenericDescription(desc));
                        }
                    }
                    htmlGenerated = iterateJson(json, parentNode, path, path, path.split('.')[1]);
                }
                return form;
            },
            getItemOnRepeat: function () {
                return angular.copy(itemOnRepeat);
            }
        }
    })
;
