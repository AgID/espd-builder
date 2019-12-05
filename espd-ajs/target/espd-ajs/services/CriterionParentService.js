/* Sonar :O */
angular.module('espdApp')
    .factory('CriterionParentService', function (CriterionParserCA, CriterionParserEO, CriterionParserCommon) {
        return{
            getCriterionParserCA:function () {
                return CriterionParserCA;
            },
            getCriterionParserEO:function () {
                return CriterionParserEO;
            },
            getCriterionParserCommon:function () {
                return CriterionParserCommon;
            }
        }
    });
