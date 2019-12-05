angular.module('espdApp')
    .factory('ConclusionService', function () {

        var variablesTranslate = [
            'createcafinish_header',
            'previous',
            'cancel',
            'print',
            'download_as',
            'download_pdf',
            'download_zip',
            'download',
            'next',
            'print',
            'yes',
            'no',
            'crit_end_date',
            'crit_start_date',
            'createcafinish_reduction',
            'createcafinish_toptext',
            'createcafinish_concl_statements',
            'createcafinish_concl_statements_text_first',
            'createcafinish_concl_statements_text_second',
            'createcafinish_concl_statements_text_third',
            'createcafinish_concl_statements_text_fourth',
            'createcafinish_concl_statements_text_fifth',
            'createcafinish_concl_statements_signature',
            'crit_date',
            'place',
            'signature',
            'createcafinish_export',
            'createcafinish_export_content',
            'validator_period',
            'crit_issuer',
            'crit_url',
            'crit_code',
            'crit_code_cig',
            'selectedOption',
            'critCheckAll',
            'critUncheckAll',
            'crit_filter',
            'crit_lots',
            'crit_cpv_codes'
        ];

        var criterionCodesEO = [
            'CRITERION.OTHER.EO_DATA.REDUCTION_OF_CANDIDATES'
        ];

        var criterionCodes = [
            'CRITERION.OTHER.EO_DATA.REDUCTION_OF_CANDIDATES'
        ];

        return {
            getVariablesTranslate: function () {
                return variablesTranslate;
            },
            getBackup: function () {
                var json = JSON.parse(localStorage.getItem("jsonBackup"));
                if (json == null)
                    return {};
                else
                    return json;
            },
            setBackup: function (json) {
                localStorage.setItem("jsonBackup", JSON.stringify(json));
            },
            getCriterionCodesEO: function() {
                return criterionCodesEO;
            },
            getCriterionCodes: function() {
                return criterionCodes;
            }
        }

    });
