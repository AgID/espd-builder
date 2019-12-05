angular.module('espdApp')
  .factory('MainService', function ($http, urlPath, $httpParamSerializerJQLike, $q, uuid) {
    var isLoading = false;

    return {
      getConfig: function () {
        return $http.post(urlPath + '/master/config');
      },
      languageList: function () {
        return $http.post(urlPath + '/language/list');
      },
      getDefaultLanguage: function () {
        return JSON.parse(sessionStorage.getItem("defaultLanguage"));
      },
      setDefaultLanguage: function (lang) {
        sessionStorage.setItem("defaultLanguage", JSON.stringify(lang));
      },
      getCountProgress: function () {
        return JSON.parse(sessionStorage.getItem("countProgress"));
      },
      setCountProgress: function (count) {
        sessionStorage.setItem("countProgress", JSON.stringify(count));
      },
      getMaxActiveCountProgress: function () {
        return JSON.parse(sessionStorage.getItem("maxActiveCountProgress"));
      },
      setMaxActiveCountProgress: function (ind) {
        if (ind > JSON.parse(sessionStorage.getItem("maxActiveCountProgress"))) {
          sessionStorage.setItem("maxActiveCountProgress", JSON.stringify(ind));
        }
      },
      emptyMaxActiveCountProgress: function () {
        sessionStorage.setItem("maxActiveCountProgress", JSON.stringify(1));
      },
      setJsonStart: function (json) {
        sessionStorage.setItem("jsonStart", JSON.stringify(json));
      },
      getJsonStart: function () {
        var json = JSON.parse(sessionStorage.getItem("jsonStart"));
        if (json == null)
          return {};
        else
          return json;
      },
      setApplicationJson: function (json) {
        sessionStorage.setItem("applicationJson", JSON.stringify(json));
      },
      getApplicationJson: function () {
        var json = JSON.parse(sessionStorage.getItem("applicationJson"));
        if (json == null)
          return {};
        else
          return json;
      },
      setLoading: function (loading) {
        isLoading = loading;
      },
      getCountries: function () {
        return $http.post(urlPath + '/country/list');
      },
      getLoading: function () {
        return isLoading;
      },
      downloadXml: function (json) {
          return $http.post(urlPath + '/master/download', json);
//        return $http({
//          url: urlPath + '/master/download',
//          headers: {
//            'Content-Type': 'application/x-www-form-urlencoded',
//            'Accept-Language': 'it/It',
//            'Accept': 'application/xml, application/json'
//          },
//          method: "POST",
//          data: json
//        });
      },
      getCriterions: function (array) {
    	  var criteriaKey = {criteriaKeys: array};
          return $http.post(urlPath + '/master/initCriteria', criteriaKey);
//        return $http({
//          url: urlPath + '/master/initCriteria',
//          headers: {
//            'Content-Type': 'application/x-www-form-urlencoded',
//            'Accept-Language': 'it/It',
//            'Accept': 'application/xml, application/json'
//          },
//          method: "POST",
//          data: { criteriaKeys: array }
//        });
      },
      getCurrencyType: function (lang) {
        return $http({
          url: urlPath + '/codelist/currencyCodeList',
          headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
            'Accept-Language': 'it/It',
            'Accept': 'application/xml, application/json'
          },
          method: "POST",
          data: $httpParamSerializerJQLike({
            lang: lang
          })
        });
      },
      getLotsList: function (lots,scope) {
        if (lots.listPplm.length > 0) {
          return $http.post(urlPath + '/codelist/lotsList', lots).then(function (response) {
  	        if (scope.lotsList == undefined) {
  	          scope.lotsList = response.data.payload;
  	        } else {
  	          for (let i = 0; i < scope.lotsList.length; i++) {
  	            scope.lotsList[i].translation = response.data.payload[i].translation
  	          }
  	        }
  	      });
//	      return $http({
//	        url: urlPath + '/codelist/lotsList',
//	        headers: {
//	          'Content-Type': 'application/x-www-form-urlencoded',
//	          'Accept-Language': 'it/It',
//	          'Accept': 'application/xml, application/json'
//	        },
//	        method: "POST",
//	        data: lots
//	      }).then(function (response) {
//	        if (scope.lotsList == undefined) {
//	          scope.lotsList = response.data.payload;
//	        } else {
//	          for (let i = 0; i < scope.lotsList.length; i++) {
//	            scope.lotsList[i].translation = response.data.payload[i].translation
//	          }
//	        }
//	      });
        } else {
          var deferred = $q.defer();
          deferred.resolve({
            data: {
              payload: []
            }
          });
          return deferred.promise;
        }
      },
      getCpvsList: function (cpvs, scope) {
        if (cpvs.listCcm && cpvs.listCcm.length > 0) {
	      return $http.post(urlPath + '/codelist/cpvsList', cpvs).then(function (response) {
	        if (scope.cpvsList == undefined) {
	          scope.cpvsList = response.data.payload;
	        } else {
	          for (let i = 0; i < scope.cpvsList.length; i++) {
	            scope.cpvsList[i].translation = response.data.payload[i].translation
	          }
	        }
	      });
//          return $http({
//            url: urlPath + '/codelist/cpvsList',
//            headers: {
//              'Content-Type': 'application/x-www-form-urlencoded',
//              'Accept-Language': 'it/It',
//              'Accept': 'application/xml, application/json'
//            },
//            method: "POST",
//            data: cpvs
//          }).then(function (response) {
//            if (scope.cpvsList == undefined) {
//              scope.cpvsList = response.data.payload;
//            } else {
//              for (let i = 0; i < scope.cpvsList.length; i++) {
//                scope.cpvsList[i].translation = response.data.payload[i].translation
//              }
//            }
//          });
        } else {
          var deferred = $q.defer();
          deferred.resolve({
            data: {
              payload: []
            }
          });
          return deferred.promise;
        }
      },
      closeSidenav: function () {
        document.getElementById("espdSidenav").style.width = "0";
      },
      openSidenav: function () {
        document.getElementById("espdSidenav").removeAttribute("style");
      },
      scrollToDivByID: function (id) {
        document.getElementById(id).scrollIntoView();
      },
      holdTop: function (btn, action, start, speedup) {
        var t;

        var repeat = function () {
          action();
          t = setTimeout(repeat, start);
          start = start / speedup;
        }

        btn.mousedown = function () {
          repeat();
        }

        btn.mouseup = function () {
          clearTimeout(t);
        }
      }
    }
  });
