/* Classe di supporto (fornisce metodi comuni)*/
angular.module('espdApp').factory('CommonService', function (MainService, $q) {

  const bubbleSort = function (countries, n) {
    var collator = Intl.Collator(MainService.getDefaultLanguage());
    var flagReturn = false;
    for (var i = 0; i < n - 1; i++)
      if (collator.compare(countries[i].countryName, countries[i + 1].countryName) == 1) {
        // swap arr[i], arr[i+1]
        const temp = countries[i];
        countries[i] = countries[i + 1];
        countries[i + 1] = temp;
        flagReturn = true;
      }
    if (flagReturn) {
      bubbleSort(countries, n);
    }
  }

  const getCountryByIsoCode = function (isocode, countries) {
    for (let key in countries) {
      if (countries[key].iso2Code == isocode) {
        return countries[key];
      }
    }
  }

  const getDocRefByCode = function (code, docref) {
    for (let key in docref) {
      if (docref[key].code == code) {
        return docref[key].translation;
      }
    }
  }

  const getCountryIndex = function (code, countries) {
    for (var i = 0; i < countries.length; i++) {
      if (countries[i].iso2Code == code) {
        return i;
      }
    }
  }

  const getIndexOnList = function (code, list) {
    for (var i = 0; i < list.length; i++) {
      if (list[i].code == code) {
        return i;
      }
    }
  }

  // SERVE A VALORIZZARE LA SELEZIONE DEI CRITERION DA PARTE DELLA CA, SIA IN UPLOAD REQUEST CHE IN NUOVA REQUEST
  const fillSelectedCriterion = function (isEmpty, criterions, criterionSelection) {
    if (isEmpty) {
      for (var criterion in criterions) {
        criterionSelection[criterion] = false;
      }
    }
    else {
      for (var criterionUndef in criterions) {
        if (criterionSelection[criterionUndef] == undefined) {
          criterionSelection[criterionUndef] = false;
        }
      }
    }
    return criterionSelection;
  }
  const fillSelectedCriterionExclusion = function (isEmpty, criterions, criterionSelection) {
    if (isEmpty) {
      for (var criterion in criterions) {
        criterionSelection[criterion] = true;
      }
    }
    else {
      for (var criterionUndef in criterions) {
        if (criterionSelection[criterionUndef] == undefined) {
          criterionSelection[criterionUndef] = true;
        }
      }
    }
    return criterionSelection;
  }

  //CREA UNA CHIAVE TRAMITE L'ID DEL CRITERION
  const rebuildCriterionCode = function (code) {
    code = code.replace(/_/g, '');
    code = code.replace(/-/g, '');
    var codeSplit = code.split('.');
    var finalCode = "";
    for (var c in codeSplit) {
      if (codeSplit.hasOwnProperty(c)) {
        finalCode += codeSplit[c];
      }
    }
    return finalCode;
  }

  const prepareToDownload = function (scope) {
    var data = {
      bean: angular.copy(scope.applicationJson),
      authentication: {
        user: scope.startVariables.userRole
      }
    }
    data.bean.date = new Date();
    data.bean.time = new Date();
    for (let doc = 0; doc < data.bean.additionalDocumentReferenceModels.length; doc++) {
      var numeroAvviso = data.bean.additionalDocumentReferenceModels[doc].idModel.id;
      numeroAvviso = [numeroAvviso.slice(0, 4), "/S ", numeroAvviso.slice(4)].join('');
      numeroAvviso = [numeroAvviso.slice(0, 10), "-", numeroAvviso.slice(10)].join('');
      data.bean.additionalDocumentReferenceModels[doc].idModel.id = numeroAvviso;
    }
    return data;
  }

  /*Serve per il download dell'xml*/
  const responseToByteArray = function (response, scope) {
    var binaryString = window.atob(response.data.payload);
    var binaryLen = binaryString.length;
    var bytes = new Uint8Array(binaryLen);
    for (var i = 0; i < binaryLen; i++) {
      var ascii = binaryString.charCodeAt(i);
      bytes[i] = ascii;
    }

    var blob = new Blob([bytes], {type: "application/xml"});
    var fileName = "";
    if (scope.startVariables.userRole == 'ca')
      fileName = "Request.xml";
    else
      fileName = "Response.xml";

    if (navigator.appVersion.toString().indexOf('.NET') >= 0)
      window.navigator.msSaveBlob(blob, fileName);
    else {
      var link = document.createElement("a");
      link.href = window.URL.createObjectURL(blob);
      document.body.appendChild(link);
      link.download = fileName;
      link.click();
      document.body.removeChild(link);
    }
  }

  /*Lancia il caricamento dei criterions una volta tradotta la pagina*/
  const waitingTranslation = function (toWait, scope, loadCriterions, firstTimeLoadCriterion) {
    $q.all(toWait).then(function () {
      toWait = [];
      scope.isTraductionDone = true;
      scope.defaultLanguage = MainService.getDefaultLanguage().toUpperCase();
      if (firstTimeLoadCriterion) {
        loadCriterions();
      } else {
        scope.$emit('hideLoading');
      }
    });
  }

  const scrollDown = function () {
    var el = document.getElementById('criterionsSidenav')
    el.scrollTo({
      "behavior": "smooth",
      "left": 0,
      "top": el.scrollTop + 25
    })
  }

  const scrollTop = function () {
    var el = document.getElementById('criterionsSidenav')
    el.scrollTo({
      "behavior": "smooth",
      "left": 0,
      "top": el.scrollTop - 25
    })
  }

  return {
    bubbleSort: bubbleSort,
    getCountryByIsoCode: getCountryByIsoCode,
    getDocRefByCode: getDocRefByCode,
    getCountryIndex: getCountryIndex,
    getIndexOnList: getIndexOnList,
    fillSelectedCriterion: fillSelectedCriterion,
    rebuildCriterionCode: rebuildCriterionCode,
    fillSelectedCriterionExclusion: fillSelectedCriterionExclusion,
    getTranslateService: function () {
      return TranslateService;
    },
    getCancelService: function () {
      return CancelService;
    },
    prepareToDownload: prepareToDownload,
    responseToByteArray: responseToByteArray,
    waitingTranslation: waitingTranslation,
    scrollDown: scrollDown,
    scrollTop: scrollTop

  }
});
