angular.module('espdApp').factory('ExclusionService', function () {

    var variablesTranslate = [
        'createcaexcl_header',
        'previous',
        'cancel',
        'print',
        'download_as',
        'download_pdf',
        'download_zip',
        'download',
        'next',
        'crit_top_title_grounds_criminal_conv',
        'crit_top_title_grounds_payment_taxes',
        'crit_top_title_insolvency_conflicts',
        'crit_top_title_purely_national',
        'print',
        'yes',
        'no',
        'crit_eu_main_title_grounds_criminal_conv',
        'crit_eu_main_title_payment_taxes',
        'crit_eu_main_breaching_obligations',
        'crit_eu_main_purely_national',
        'createeo_currency',
        'crit_end_date',
        'crit_start_date',
        'validator_period',
        'crit_issuer',
        'crit_url',
        'crit_code',
        'selectedOption',
        'critCheckAll',
        'critUncheckAll',
        'crit_filter',
        'crit_lots',
        'crit_cpv_codes'
    ];

    var criterionCodes = [
        'CRITERION.EXCLUSION.CONVICTIONS.PARTICIPATION_IN_CRIMINAL_ORGANISATION',
         'CRITERION.EXCLUSION.CONVICTIONS.CORRUPTION',
         'CRITERION.EXCLUSION.CONVICTIONS.FRAUD',
         'CRITERION.EXCLUSION.CONVICTIONS.TERRORIST_OFFENCES',
         'CRITERION.EXCLUSION.CONVICTIONS.MONEY_LAUNDERING',
         'CRITERION.EXCLUSION.CONVICTIONS.CHILD_LABOUR-HUMAN_TRAFFICKING',
         'CRITERION.EXCLUSION.CONTRIBUTIONS.PAYMENT_OF_TAXES',
         'CRITERION.EXCLUSION.CONTRIBUTIONS.PAYMENT_OF_SOCIAL_SECURITY',
         'CRITERION.EXCLUSION.SOCIAL.ENVIRONMENTAL_LAW',
         'CRITERION.EXCLUSION.SOCIAL.SOCIAL_LAW',
         'CRITERION.EXCLUSION.SOCIAL.LABOUR_LAW',
         'CRITERION.EXCLUSION.BUSINESS.BANKRUPTCY',
         'CRITERION.EXCLUSION.BUSINESS.INSOLVENCY',
         'CRITERION.EXCLUSION.BUSINESS.CREDITORS_ARRANGEMENT',
         'CRITERION.EXCLUSION.BUSINESS.BANKRUPTCY_ANALOGOUS',
         'CRITERION.EXCLUSION.BUSINESS.LIQUIDATOR_ADMINISTERED',
         'CRITERION.EXCLUSION.BUSINESS.ACTIVITIES_SUSPENDED',
         'CRITERION.EXCLUSION.MISCONDUCT.MC_PROFESSIONAL',
         'CRITERION.EXCLUSION.MISCONDUCT.MARKET_DISTORTION',
         'CRITERION.EXCLUSION.CONFLICT_OF_INTEREST.PROCEDURE_PARTICIPATION',
         'CRITERION.EXCLUSION.CONFLICT_OF_INTEREST.PROCEDURE_PREPARATION',
         'CRITERION.EXCLUSION.CONFLICT_OF_INTEREST.EARLY_TERMINATION',
         'CRITERION.EXCLUSION.CONFLICT_OF_INTEREST.MISINTERPRETATION',
         'CRITERION.EXCLUSION.NATIONAL.OTHER'
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
        getCriterionCodes: function  () {
            return criterionCodes;
        }
    }
})
