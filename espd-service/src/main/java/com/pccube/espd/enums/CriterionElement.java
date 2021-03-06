package com.pccube.espd.enums;

public enum CriterionElement {

	CRITERION("CRITERION"),
	SUBCRITERION("SUBCRITERION"),
	REQUIREMENT_GROUP("REQUIREMENT_GROUP"),
	REQUIREMENT_SUBGROUP("REQUIREMENT_SUBGROUP"),
	REQUIREMENT("REQUIREMENT"),
	QUESTION_GROUP("QUESTION_GROUP"),
	QUESTION_SUBGROUP("QUESTION_SUBGROUP"),
	QUESTION("QUESTION"),
	CAPTION("CAPTION"),
	ADDITIONAL_DESCRIPTION_LINE("ADDITIONAL_DESCRIPTION_LINE"),
	LEGISLATION("LEGISLATION");


	private final String code;

	CriterionElement(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
