angular.module('espdApp')
    .factory('ParentService', function (MainService, StartService, ProcedureService, ExclusionService, SelectionService, ConclusionService,OverviewService) {
        return{
            getMainService:function () {
                return MainService;
            },
            getStartService:function () {
                return StartService;
            },
            getProcedureService:function () {
                return ProcedureService;
            },
            getExclusionService:function () {
                return ExclusionService;
            },
            getSelectionService:function () {
                return SelectionService;
            },
            getConclusionService:function () {
                return ConclusionService;
            },
            getOverviewService:function () {
                return OverviewService;
            }
        }
    });
