angular.module('espdApp')
    .factory('SupportService', function (TranslateService,CancelService) {
        return{
            getTranslateService:function () {
                return TranslateService;
            },
            getCancelService:function () {
                return CancelService;
            }
        }
    });