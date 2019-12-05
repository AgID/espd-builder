package com.pccube.espd.enums;

public enum CodeList {

	BID_TYPE("BidType"),
	BOOLEAN_GUI_CONTROL_TYPE("BooleanGUIControlType"),
	CONFIDENTIALITY_LEVEL("ConfidentialityLevel"),
	COUNTRY_CODE_IDENTIFIER("CountryCodeIdentifier"),
	CRITERION_ELEMENT_TYPE("CriterionElementType"),
	CRITERIA_TAXONOMY("CriteriaTaxonomy"),
	CPV_CODES("CPVCodes"),
	CURRENCY_CODE("CurrencyCode"),
	DOC_REF_CONTENT_TYPE("DocRefContentType"),
	EO_ID_TYPE("EOIDType"),
	EO_INDUSTRY_CLASSIFICATION_CODE("EOIndustryClassificationCode"),
	EO_ROLE_TYPE("EORoleType"),
	EU_LANGUAGE_CODE("EULanguageCode"),
	EVALUATION_METHOD_TYPE("EvaluationMethodType"),
	FINANCIAL_RATIO_TYPE("FinancialRatioType"),
	LEGISLATION_TYPE("LegislationType"),
	PROCEDURE_TYPE("ProcedureType"),
	PROFILE_EXECUTION_ID("ProfileExecutionID"),
	PROJECT_TYPE("ProjectType"),
	PROPERTY_GROUP_TYPE("PropertyGroupType"),
	QUALIFICATION_APPLICATION_TYPE("QualificationApplicationType"),
	RESPONSE_DATA_TYPE("ResponseDataType"),
	SERVICES_PROJECT_SUB_TYPE("ServicesProjectSubType"),
	WEIGHTING_TYPE("WeightingType");

    
    private final String nameList;

    CodeList(String nameList) {
		this.nameList = nameList;
	}

	public String getNameList() {
		return nameList;
	}
	
}
