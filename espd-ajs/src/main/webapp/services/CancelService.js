/* La funzionalità di cancella riporta risetta il json applicativo allo stato di una certa rotta*/
angular.module('espdApp').factory('CancelService',function (ParentService) {

    const cancel = function(countProgress) {
        var previousJson;
        switch(countProgress) {
            case 2:
                previousJson = ParentService.getStartService().getBackup();
                break;
            case 3:
                previousJson = ParentService.getProcedureService().getBackup();
                break;
            case 4:
                previousJson = ParentService.getExclusionService().getBackup();
                break;
            case 5:
                previousJson = {}; //pagina di conclusion
                break;
          default:
              break;
        }
        return previousJson;
    }

    return {
        cancel: cancel
    }
});
