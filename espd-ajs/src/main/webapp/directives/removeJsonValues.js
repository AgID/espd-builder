/* Mostra o nasconde sezioni a discrezione dell'indicator */
//indicatorStorage è una variabile che viene settata nello switchElementCode dei criterion parsers
angular.module('espdApp').directive('removeJsonValues', ['CriterionParserCommon', function (CriterionParserCommon) {
  return {
    restrict: 'A',
    // scope: '=',
    link: function (scope, element, attrs) {
      scope.$on('removeEmptyValues', function () {
        if (attrs.indicatorpath) {
          if (scope.$parent['indicatorStorage' + attrs.indicatorpath]) {
            if (scope.$parent['indicatorStorage' + attrs.indicatorpath][attrs.indicatorpath + "_"] == 'false' && attrs.removeJsonValues == 'ONTRUE') {
              CriterionParserCommon.copyBackupForCardinality(scope[attrs.compresspath]);
            }
            else if (scope.$parent['indicatorStorage' + attrs.indicatorpath][attrs.indicatorpath + "_"] == 'true' && attrs.removeJsonValues == 'ONFALSE') {
              CriterionParserCommon.copyBackupForCardinality(scope[attrs.compresspath]);
            }
          }
          else {
            if (scope['indicatorStorage' + attrs.indicatorpath][attrs.indicatorpath + "_"] == 'false' && attrs.removeJsonValues == 'ONTRUE') {
              CriterionParserCommon.copyBackupForCardinality(scope[attrs.compresspath]);
            }
            else if (scope['indicatorStorage' + attrs.indicatorpath][attrs.indicatorpath + "_"] == 'true' && attrs.removeJsonValues == 'ONFALSE') {
              CriterionParserCommon.copyBackupForCardinality(scope[attrs.compresspath]);
            }
          }
        }
      })
    }
  };
}]);
