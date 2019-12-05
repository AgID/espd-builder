package com.pccube.espd.enums;

public enum QualificationApplication {

	/**
	 * Regulated
	 */
	REGULATED("REGULATED"),
	/**
	 * Self-Contained
	 */
    SELFCONTAINED("SELFCONTAINED");
	
	
	private String code;
	
	QualificationApplication(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
