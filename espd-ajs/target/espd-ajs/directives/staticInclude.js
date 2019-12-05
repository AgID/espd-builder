angular.module('espdApp').directive('staticInclude', function () {
    return {
        restrict: 'AE',
        templateUrl: function (ele, attrs) {
            return attrs.templatePath;
        }
    };
});
