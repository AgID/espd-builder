angular.module('espdApp')
  .factory('SelectionService', function () {

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
      'print',
      'yes',
      'no',
      'all_selection_switch',
      'createcasel_header',
      'createcasel_suitability',
      'crit_eu_main_purely_national',
      'crit_selection_eo_suitability_article',
      'crit_selection_suitability_article_tooltip',
      'createcasel_economic_and_financial_standing',
      'crit_selection_ca_economic_article',
      'crit_selection_economic_financial_standing_article_tooltip',
      'crit_end_date',
      'crit_start_date',
      'createcasel_technical_professional_ability',
      'crit_selection_technical_professional_ability_article',
      'createcasel_quality_assurance',
      'crit_selection_quality_assurance_article',
      'validator_period',
      'createcasel_alert',
      'question_to_use_alpha',
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
       'CRITERION.SELECTION.SUITABILITY.PROFESSIONAL_REGISTER_ENROLMENT',
       'CRITERION.SELECTION.SUITABILITY.TRADE_REGISTER_ENROLMENT',
       'CRITERION.SELECTION.SUITABILITY.AUTHORISATION',
       'CRITERION.SELECTION.SUITABILITY.MEMBERSHIP',
       'CRITERION.SELECTION.ECONOMIC_FINANCIAL_STANDING.TURNOVER.GENERAL_YEARLY',
       'CRITERION.SELECTION.ECONOMIC_FINANCIAL_STANDING.TURNOVER.AVERAGE_YEARLY',
       'CRITERION.SELECTION.ECONOMIC_FINANCIAL_STANDING.TURNOVER.SPECIFIC_AVERAGE',
       'CRITERION.SELECTION.ECONOMIC_FINANCIAL_STANDING.TURNOVER.SPECIFIC_YEARLY',
       'CRITERION.SELECTION.ECONOMIC_FINANCIAL_STANDING.TURNOVER.SET_UP',
       'CRITERION.SELECTION.ECONOMIC_FINANCIAL_STANDING.FINANCIAL_RATIO',
       'CRITERION.SELECTION.ECONOMIC_FINANCIAL_STANDING.RISK_INDEMNITY_INSURANCE',
       'CRITERION.SELECTION.ECONOMIC_FINANCIAL_STANDING.OTHER_REQUIREMENTS',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.REFERENCES.WORKS_PERFORMANCE',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.REFERENCES.SUPPLIES_DELIVERY_PERFORMANCE',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.REFERENCES.SERVICES_DELIVERY_PERFORMANCE',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.TECHNICAL.TECHNICIANS_FOR_QUALITY_CONTROL',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.TECHNICAL.TECHNICIANS_FOR_CARRYING_WORKS',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.TECHNICAL.FACILITIES_FOR_QUALITY_ENSURING',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.TECHNICAL.FACILITIES_FOR_STUDY_RESEARCH',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.TECHNICAL.SUPPLY_CHAIN_MANAGEMENT',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.TECHNICAL.CHECKS.ALLOWANCE_OF_CHECKS',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.TECHNICAL.PROFESSIONAL_QUALIFICATIONS',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.TECHNICAL.ENVIRONMENTAL_MANAGEMENT_MEASURES',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.MANAGEMENT.MANAGERIAL_STAFF',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.MANAGEMENT.AVERAGE_ANNUAL_MANPOWER',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.TECHNICAL.EQUIPMENT',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.MANAGEMENT.SUBCONTRACTING_PROPORTION',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.MANAGEMENT.ARTEFACTS.NO_AUTHENTICATED_ARTEFACTS',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.MANAGEMENT.ARTEFACTS.AUTHENTICATED_ARTEFACTS',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.CERTIFICATES.QUALITY_ASSURANCE.QA_INSTITUTES_CERTIFICATE',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.CERTIFICATES.QUALITY_ASSURANCE.QA_INDEPENDENT_CERTIFICATE',
       'CRITERION.SELECTION.TECHNICAL_PROFESSIONAL_ABILITY.CERTIFICATES.ENVIRONMENTAL_MANAGEMENT.ENV_INDEPENDENT_CERTIFICATE'
    ];

    var jsonBackup;

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
      setAllCriterionSelected: function (allSelected) {
        localStorage.setItem("allCriterionSelected", JSON.stringify(allSelected));
      },
      getAllCriterionSelected: function () {
        var json = JSON.parse(localStorage.getItem("allCriterionSelected"));
        if (json == null)
          return {};
        else
          return json;
      },
      getCriterionCodes: function () {
        return criterionCodes;
      },
      getCriterionCodes: function () {
        return criterionCodes;
      }
    }

  })
