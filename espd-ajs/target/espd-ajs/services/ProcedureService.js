angular.module('espdApp')
  .factory('ProcedureService', function ($http, urlPath, $httpParamSerializerJQLike, CommonService) {
    const variablesTranslate = [
      'createca_header',
      'createca_info_pub',
      'createca_to_be_filled_alert',
      'createca_ted_reception_id',
      'createca_ted_reception_id_placeholder',
      'filter_ted_reception_id_placeholder',
      'createca_ojs_label',
      'createca_ojs_url',
      'createca_ngoj_label',
      'ngoj_placeholder',
      'createca_contact_details_ca',
      'createca_name',
      'createca_info_procurement_proc',
      'type_of_procedure_none',
      'type_of_procedure_open',
      'type_of_procedure_resticted',
      'type_of_procedure_negotiation',
      'type_of_procedure_dialogue',
      'type_of_procedure_partnership',
      'createca_procurer_name',
      'createca_procurer_name_placeholder',
      'createca_procurer_simog',
      'createca_procurer_simog_placeholder',
      'createca_title_or_short_desc',
      'createca_title_or_short_desc_placeholder',
      'createca_file_ref_ca',
      'createca_file_ref_ca_placeholder',
      'createca_official_journal_alert',
      'createca_country',
      'previous',
      'cancel',
      'print',
      'download_as',
      'download_pdf',
      'download_zip',
      'next',
      'createca_desc_pub',
      'createca_desc_pub_placeholder',
      'createca_name_pub',
      'createca_name_pub_placeholder',
      'createca_fiscal_code',
      'createca_fiscal_code_placeholder',
      'createca_url_comm',
      'createca_url_comm_placeholder',
      'createca_street_and_num',
      'createca_street_and_num_placeholder',
      'createca_city',
      'createca_city_placeholder',
      'createca_postcode',
      'createca_postcode_placeholder',
      'createca_contact_person',
      'createca_contact_person_placeholder',
      'createca_telephone',
      'createca_telephone_placeholder',
      'createca_fax',
      'createca_fax_placeholder',
      'createca_email',
      'createca_email_placeholder',
      'createca_objects_of_contract',
      'createca_type_of_procedure',
      'createca_lotti',
      'createca_tenders',
      'createca_num_lots_info',
      'createca_max_lotti',
      'createca_max_lotti_awarded',
      'createca_add_cpv',
      "createca_add_cig",
      'createeo_header',
      'createeo_info_eo',
      'createeo_name',
      'createeo_vat',
      'createeo_internet_addr_if_exists',
      'createeo_contact_person',
      'createeo_another_vat',
      'createeo_another_vat_label',
      'createeo_another_vat_placeholder',
      'createeo_eo_group_role',
      'createca_all_lots',
      'createca_one_lot_only',
      'createca_select_max_lotti',
      'createca_name_placeholder',
      'createeo_is_eo_sized',
      'yes',
      'no',
      'createca_code_cpv',
      'createca_code_lots',
      'createca_info_procedure',
      'createca_contact_person_placeholder',
      'createeo_vat_placeholder',
      'createeo_internet_addr_if_exists',
      'createeo_internet_addr_if_exists_placeholder',
      'createeo_is_eo_sized',
      'yes',
      'no',
      'createeo_employees_number',
      'createeo_employees_number_placeholder',
      'crit_selection_economic_average_yearly_turnover_main',
      'crit_selection_economic_average_yearly_turnover_main_placeholder',
      'createeo_currency',
      'createeo_if_proc_reserved',
      'createeo_eo_approved_cert',
      'createeo_info_respresent',
      'createeo_last_name',
      'createeo_last_name_placeholder',
      'createeo_birth_date',
      'createeo_birth_date_placeholder',
      'createeo_birth_place',
      'createeo_birth_place_placeholder',
      'createeo_pos_act_in_capacity',
      'createeo_pos_act_in_capacity_placeholder',
      'createeo_detinfo_of_represent',
      'createeo_detinfo_of_represent_placeholder',
      'createeo_info_reliance',
      'createeo_separate_espd_sections_a_b',
      'download',
      'crit_start_date',
      'crit_end_date',
      'createca_code_cpv_placeholder',
      'createca_code_lots_placeholder',
      'createca_type_of_document',
      'invalid_form_tooltip',
      'validator_required',
      'invalid_form_tooltip',
      'validator_period',
      'createeo_information_subcontractors',
      'crit_issuer',
      'crit_url',
      'crit_code',
      'crit_code_cig',
      'createca_ojs_url_placeholder',
      'selectedOption',
      'critCheckAll',
      'critUncheckAll',
      'crit_filter',
      'crit_add',
      'crit_lots',
      'crit_cpv_codes',
      'modal_empty_button'
    ];

    var criterionsCodesCA = [
      'CRITERION.OTHER.CA_DATA.LOTS_SUBMISSION'
    ];

    var criterionsCodesEO = [
      'CRITERION.OTHER.EO_DATA.SHELTERED_WORKSHOP',
      'CRITERION.OTHER.EO_DATA.REGISTERED_IN_OFFICIAL_LIST',
      'CRITERION.OTHER.EO_DATA.TOGETHER_WITH_OTHERS',
      'CRITERION.OTHER.EO_DATA.LOTS_TENDERED',
      'CRITERION.OTHER.EO_DATA.RELIES_ON_OTHER_CAPACITIES',
      'CRITERION.OTHER.EO_DATA.SUBCONTRACTS_WITH_THIRD_PARTIES'/*,
      'CRITERION.OTHER.EO_DATA.CONTRIBUTIONS_CERTIFICATES'*/
    ];

    var jsonBackup;

    return {
      getVariablesTranslate: function () {
        return variablesTranslate;
      },
      getDocRefContentTypeList: function (lang) {
        return $http({
          url: urlPath + '/codelist/docRefContentTypeList',
          headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
            'Accept-Language': 'it/It',
            'Accept': 'application/xml, application/json'
          },
          method: "POST",
          data: $httpParamSerializerJQLike({
            lang: lang
          })
        });
      },
      getProcedureType: function (lang) {
        return $http({
          url: urlPath + '/codelist/procedureTypeList',
          headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
            'Accept-Language': 'it/It',
            'Accept': 'application/xml, application/json'
          },
          method: "POST",
          data: $httpParamSerializerJQLike({
            lang: lang
          })
        });
      },
      getProjectType: function (lang, scope) {
        return $http({
          url: urlPath + '/codelist/projectTypeList',
          headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
            'Accept-Language': 'it/It',
            'Accept': 'application/xml, application/json'
          },
          method: "POST",
          data: $httpParamSerializerJQLike({
            lang: lang
          })
        }).then(function (response) {
          if (scope.projectTypeList == undefined) {
            scope.projectTypeList = response.data.payload;
          } else {
            for (let i = 0; i < scope.projectTypeList.length; i++) {
              scope.projectTypeList[i].translation = response.data.payload[i].translation;
            }
          }
          if (scope.applicationJson.procurementProjectModel && scope.applicationJson.procurementProjectModel.procurementTypeCodeModel.projectType.code != null)
            scope.applicationJson.procurementProjectModel.procurementTypeCodeModel.projectType.name = scope.projectTypeList[CommonService.getIndexOnList(scope.applicationJson.procurementProjectModel.procurementTypeCodeModel.projectType.code, scope.projectTypeList)].translation;
        });
      },
      getEoIndustryClassificationCodeList: function (lang) {
        return $http({
          url: urlPath + '/codelist/eoIndustryClassificationCodeList',
          headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
            'Accept-Language': 'it/It',
            'Accept': 'application/xml, application/json'
          },
          method: "POST",
          data: $httpParamSerializerJQLike({
            lang: lang
          })
        });
      },
      getRoleType: function (lang) {
        return $http({
          url: urlPath + '/codelist/eoRoleTypeList',
          headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
            'Accept-Language': 'it/It',
            'Accept': 'application/xml, application/json'
          },
          method: "POST",
          data: $httpParamSerializerJQLike({
            lang: lang
          })
        });
      },
      getCPVCodesList: function (lang) {
        return $http({
          url: urlPath + '/codelist/cpvCodesList',
          headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
            'Accept-Language': 'it/It',
            'Accept': 'application/xml, application/json'
          },
          method: "POST",
          data: $httpParamSerializerJQLike({
            lang: lang
          })
        });
      },
      getBidType: function (lang, scope) {
        return $http({
          url: urlPath + '/codelist/bidTypeList',
          headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
            'Accept-Language': 'it/It',
            'Accept': 'application/xml, application/json'
          },
          method: "POST",
          data: $httpParamSerializerJQLike({
            lang: lang
          })
        }).then(function (response) {
          if (scope.bidTypeList == undefined) {
            scope.bidTypeList = response.data.payload;
          } else {
            for (let i = 0; i < scope.bidTypeList.length; i++) {
              scope.bidTypeList[i].translation = response.data.payload[i].translation
            }
          }
        });
      },
      getRatioType: function (lang) {
        return $http({
          url: urlPath + '/codelist/financialRatioTypeList',
          headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
            'Accept-Language': 'it/It',
            'Accept': 'application/xml, application/json'
          },
          method: "POST",
          data: $httpParamSerializerJQLike({
            lang: lang
          })
        });
      },
      getBooleanGUIControlType: function (lang) {
        return $http({
          url: urlPath + '/codelist/booleanGUIControlTypeList',
          headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
            'Accept-Language': 'it/It',
            'Accept': 'application/xml, application/json'
          },
          method: "POST",
          data: $httpParamSerializerJQLike({
            lang: lang
          })
        });
      },
      getEoIDType: function (lang) {
        return $http({
          url: urlPath + '/codelist/eoIDTypeList',
          headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
            'Accept-Language': 'it/It',
            'Accept': 'application/xml, application/json'
          },
          method: "POST",
          data: $httpParamSerializerJQLike({
            lang: lang
          })
        });
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
      getCriterionCodesCA: function () {
        return criterionsCodesCA;
      },
      getCriterionCodesEO: function () {
        return criterionsCodesEO;
      }
    }
  });
