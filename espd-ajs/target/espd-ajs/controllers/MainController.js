angular.module('espdApp')
  .controller('MainController', ['$rootScope', '$scope', 'MainService', 'urlPath', '$locale', 'StartService', 'ProcedureService', 'ExclusionService', 'SelectionService', 'ConclusionService', 'TranslateService', '$state', '$timeout', '$document', function ($rootScope, $scope, MainService, urlPath, $locale, StartService, ProcedureService, ExclusionService, SelectionService, ConclusionService, TranslateService, $state, $timeout, $document, VariableTranslateController) {
    $scope.MainService = MainService;

    const getPageTranslate = function (lang) {
      TranslateService.translate(lang)
        .then(function (response) {
          $scope.variablesTranslate = response.data.payload;
          angular.element(document.getElementsByClassName("selectpicker")[0]).selectpicker('refresh');
        });
    }

    const getConfig = function () {
      MainService.getConfig()
        .then(function (response) {
          $scope.espdEnvironment = response.data.payload.espdEnvironment;
          $scope.breadcrumb = {
            breadcrumbAsMap: response.data.payload.breadcrumbAsMap
          };
          $scope.footer = {
            lastBuildDate: response.data.payload.lastBuildDate,
            piwikEnabled: response.data.payload.piwikEnabled,
            showFooter: response.data.payload.showFooter
          };
          for (var key in $scope.breadcrumb) {
            for (var val in $scope.breadcrumb[key]) {
              TranslateService.pushOnVariablesTranslate($scope.breadcrumb[key][val]);
            }
          }
          var lang = MainService.getDefaultLanguage();
          if (lang == null) {
            //$scope.defaultLang = $locale.id.split("-")[0];
        	$scope.defaultLang = 'it';  
            $scope.selectedLang = $scope.defaultLang;
            MainService.setDefaultLanguage($scope.defaultLang)
            getPageTranslate($scope.defaultLang);

          } else {
            $scope.defaultLang = lang;
            $scope.selectedLang = $scope.defaultLang;
            getPageTranslate($scope.defaultLang);
          }
        });
    }

    const getLanguageList = function () {
      MainService.languageList()
        .then(function (response) {
          $scope.languages = response.data.payload;
        })
    }

    $scope.notHome = function () {
      if ($state.$current.name == 'home.languages') {
        return false;
      }
      else {
        return true;
      }
    }

    /*Lancia un broadcast di traduzione alle rotte figlie*/
    const broadCastTranslate = function () {
      $scope.$broadcast('translatePage', null)
    }

    $scope.changeLanguage = function () {
      MainService.setDefaultLanguage($scope.selectedLang)
      getPageTranslate($scope.selectedLang);
      broadCastTranslate();
    }

    $scope.initSelectPicker = function () {
      angular.element(document).ready(function () {
        var elements = document.getElementsByClassName("selectpicker");
        for (var i = 0; i < elements.length; i++) {
          angular.element(elements[i]).selectpicker();
        }
      });
    }

    $scope.setDefaultLanguage = function (lang) {
      $scope.selectedLang = lang;
      MainService.setDefaultLanguage($scope.selectedLang);
      getPageTranslate($scope.selectedLang);
    }

    $scope.checkProgress = function () {
      return MainService.getCountProgress()
    }

    $scope.checkMaxProgress = function () {
      return MainService.getMaxActiveCountProgress();
    }

    $scope.goToHome = function () {
      $state.go('home.languages');
    }
    /*Dopo un'ora apre la modal di avviso inattività*/
    const startIdleTimeout = function () {
      $scope.timeoutIdle = $timeout(function () {
        $('#timeoutModal').modal();
      }, 3600000)
    }

    $scope.changeState = function (ind) {
      if (ind <= MainService.getMaxActiveCountProgress()) {
        $scope.$broadcast('setApplicationJson', {});
        switch (ind) {
          case 1:
            $state.go('home.start');
            break;
          case 2:
            $state.go('home.procedure');
            break;
          case 3:
            $state.go('home.exclusion');
            break;
          case 4:
            $state.go('home.selection');
            break;
          case 5:
            $state.go('home.conclusion');
            break;
          default:
            break;
        }
      }
    }

    //scroll down function
    $scope.scrollDown = function () {
      //find current panel
      var selected = angular.element(".espd-panel.current-panel");
      //list of anchors (panel)
      var anchors = angular.element(".espd-panel:visible");

      //if selected is undefined -> first call of scroll down (so select the first anchor)
      if (selected == undefined)
        selected = anchors.first();

      //actual panel position
      var pos = anchors.index(selected);
      //next panel position
      var next = anchors.get(pos + 1);

      //if next is undefined -> last call of scroll down (so scroll to the bottom page)
      if (next == undefined) {
        $scope.finishScrollDown = true;
        angular.element('html, body').animate({scrollTop: angular.element('html,body').height()}, 300);
      }
      else {
        //else select the next target
        var $target = angular.element(next);

        //update the current panel
        angular.element(selected).removeClass("current-panel");
        angular.element(next).addClass("current-panel");

        //scroll to next target
        if ($target.offset()) {
          angular.element('html, body').animate({scrollTop: $target.offset().top}, 300);
        }
      }
      /*
      var $target = angular.element('html,body');
      const actualHeight = Math.trunc(angular.element(window).scrollTop() + angular.element(window).height());
      const maxHeight = Math.trunc($target.height());
      if(actualHeight != maxHeight) {
          if(actualHeight < maxHeight/2)
              $target.animate({scrollTop: $target.height()}, 900);
          else
              $target.animate({scrollTop: $target.height()}, 300);
      }
      */
    }

    //scroll top function
    $scope.scrollTop = function () {
      //find current panel
      var selected = angular.element(".espd-panel.current-panel");
      //list of anchors (panel)
      var anchors = angular.element(".espd-panel:visible");

      //if selected is undefined -> first call of scroll top (so select the first anchor)
      if (selected == undefined || selected.length == 0)
        selected = anchors.first();

      //actual panel position
      var pos = anchors.index(selected);
      //next panel position
      var prev = anchors.get(pos - 1);

      //if prev is -1 -> scroll to top page
      if (pos - 1 == -1) {
        angular.element('html, body').animate({scrollTop: 0}, 300);
      }
      else if ($scope.finishScrollDown) {
        //else if bottom page scroll to last anchor
        var $target = angular.element(anchors.last());

        //update the current panel
        angular.element(selected).removeClass("current-panel");
        angular.element(angular.element(anchors.last())).addClass("current-panel");

        if ($target.offset())
          angular.element('html, body').animate({scrollTop: $target.offset().top}, 300);

        $scope.finishScrollDown = false;
      }
      else {
        //else select the prev target
        var $target = angular.element(prev);

        //update the current panel
        angular.element(selected).removeClass("current-panel");
        angular.element(prev).addClass("current-panel");

        //scroll to next target
        if ($target.offset()) {
          angular.element('html, body').animate({scrollTop: $target.offset().top}, 300);
        }
      }
      /*
      var $target = angular.element('html,body');
      const actualHeight = Math.trunc(angular.element(window).scrollTop() + angular.element(window).height());
      const maxHeight = Math.trunc($target.height());
      if(angular.element(window).scrollTop() != 0) {
          if(actualHeight > maxHeight/2)
              $target.animate({scrollTop: 0}, 900);
          else
              $target.animate({scrollTop: 0}, 300);
      }
      */
    }

    //scroll event
    angular.element(window).bind("scroll", function () {
      $scope.checkScroll();
    });

    Math.trunc = Math.trunc || function(x) {
		  if (isNaN(x)) {
		    return NaN;
		  }
		  if (x > 0) {
		    return Math.floor(x);
		  }
		  return Math.ceil(x);
	};

    //set bottom page and start page on scroll event
    $scope.checkScroll = function () {
      var $target = angular.element('html,body');
      const actualHeight = Math.trunc(angular.element(window).scrollTop() + angular.element(window).height());
      const maxHeight = Math.trunc($target.height());
      //check bottom page
      $scope.bottomPage = (actualHeight > maxHeight - 20);
      //check start page
      $scope.startPage = (angular.element(window).scrollTop() == 0);
      //if start page reset current panel
      if ($scope.startPage)
        angular.element(".espd-panel.current-panel").first().removeClass("current-panel");

      if ($scope.$root.$$phase != '$apply' && $scope.$root.$$phase != '$digest') {
        $scope.$apply();
      }
    }


    /////////////////////////////////// --Init-- //////////////////////////////////////
    getConfig();
    getLanguageList();
    startIdleTimeout();
    var bodyElement = angular.element($document);
    //*Resetta il count dell'inattività
    angular.forEach(['keydown', 'keyup', 'click', 'mousemove', 'DOMMouseScroll', 'mousewheel', 'mousedown', 'touchstart', 'touchmove', 'scroll', 'focus'],
      function (EventName) {
        bodyElement.bind(EventName, function (e) {
          $timeout.cancel($scope.timeoutIdle);
          startIdleTimeout();
        });
      });

    $scope.showMenu = function () {
      if ($state.$current.name == 'home.selection' || $state.$current.name == 'home.exclusion') {
        return true;
      } else {
        return false;
      }
    }

    $scope.$on('goNext', function (event, data) {
      $scope.goNext(data.index);
    });
    $scope.$on('goBack', function (event, data) {
      $scope.goBack(data.index);
    })

    $scope.scrollButtons = function () {
      document.getElementById('navigationButtons').scrollIntoView({behavior: "smooth"});
    }
    // $('#pleaseWaitDialog').modal();
    $scope.$on('showLoading', function (event, data) {
      MainService.setLoading(true);
      $('#pleaseWaitDialog').modal();
    })
    $scope.$on('hideLoading', function (event, data) {
      $scope.isLoading = false;
      MainService.setLoading(false);
      $('#pleaseWaitDialog').modal('hide');

      //set bottom and start page variables on view content loaded
      $scope.checkScroll();
    })
  }]);
