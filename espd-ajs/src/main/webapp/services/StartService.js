angular.module('espdApp')
    .factory('StartService', function (urlPath, $http) {

        var toTranslate = [
            'filter_header',
            'app_environment',
            'filter_alert',
            'faq_text_more_info',
            'click_here',
            'faq_text_answers',
            'faq_leaflet',
            'filter_who_are_you',
            'tooltip_espd_used_both_ca_eo',
            'filter_i_am_ca',
            'tooltip_ca_ref_buyer',
            'filter_i_am_ca_or_eo',
            'filter_i_am_eop',
            'tooltip_eo_ref_suppl',
            'filter_what_you_do',
            'filter_create_espd',
            'tooltip_ca_can_create_espd',
            'filter_ted_reception_id_placeholder',
            'tooltip_ted_reception_id',
            'filter_reuse_espd',
            'tooltip_ca_can_import_espd',
            'filter_review_espd',
            'tooltip_review_espd',
            'filter_import_espd',
            'tooltip_filter_eo_can_import_espd',
            'filter_merge_espds',
            'tooltip_filter_eo_merge_espds',
            'filter_create_response',
            'tooltip_filter_create_response',
            'filter_upload_document',
            'filter_upload_request_response',
            'filter_upload_documents',
            'filter_upload_request',
            'filter_upload_response',
            'filter_where_are_you_from_ca',
            'filter_where_are_you_from_eo',
            'filter_select_country',
            'download',
            'previous',
            'cancel',
            'print',
            'download_as',
            'download_pdf',
            'download_zip',
            'next',
            'espd_upload_error'
        ]

        var jsonBackup;

        function nextDisabled(userRole, operations, uploadSingleRequest, codeCountry) {
            /*switch (userRole) {
                case 'ca':
                    if ((operations == 'create_espd_request_or_response' && codeCountry != null)
                        || ((operations == 'espd_request') && uploadSingleRequest != null)) {
                        return true;
                    }
                    return false;
                    break;
                case 'eo' :
                    if ((operations == 'eo_import_espd' && uploadSingleRequest != null)
                        || (operations == 'eo_create_espd_response' && codeCountry != null)) {
                        return true;
                    }
                    return false;
                    break;
                default:
                    return false;
                	break;
            }*/
        	if (userRole == 'ca') {
        		return ((operations == 'create_espd_request_or_response' && codeCountry != null)
                        || ((operations == 'espd_request') && uploadSingleRequest != null));
        	}
        	if (userRole == 'eo') {
        		return ((operations == 'eo_import_espd' && uploadSingleRequest != null)
                        || (operations == 'eo_create_espd_response' && codeCountry != null));
        	}
        	return false;
        }

        const uploadFileToUrl = function ( toSend ) {
            return $http({
            	url: urlPath + '/master/upload',
                headers: {
                    'Content-Type': 'application/json',
                    'Accept-Language': 'it/It',
                    'Accept': 'application/xml, application/json'
                },
                method: "POST",
                data: toSend
            });
        }

        const initCa = function (bean) {
            return $http({
                url: urlPath + '/master/init',
                headers: {
                    'Content-Type': 'application/json',
                    'Accept-Language': 'it/It',
                    'Accept': 'application/xml, application/json'
                },
                method: "POST",
                data: bean
            });
        }

        ////////////////////////////////////////////////////////////////////////////////////////////77

        return {
            getVariablesTranslate: function () {
                return toTranslate;
            },
            getCountries: function () {
                return $http.post(urlPath + '/country/list');
            },
            uploadFileToUrl:uploadFileToUrl,
            nextDisabled: nextDisabled,
            initCa:initCa,
            getBackup: function() {
                return jsonBackup;
            },
            setBackup: function(json) {
                jsonBackup = json;
            }
        }

    })
