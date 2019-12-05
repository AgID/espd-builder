/*Sonar :P */
angular.module('espdApp')
    .factory('AngularCommonService', function ($compile, $state, $window, $q, $filter) {
        return{
            getCompile:function () {
                return $compile;
            },
            getState:function () {
                return $state;
            },
            getWindow:function () {
                return $window;
            },
            getQ:function () {
                return $q;
            },
            getFilter:function () {
                return $filter;
            }
        }
    });
