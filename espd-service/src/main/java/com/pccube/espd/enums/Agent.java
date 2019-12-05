package com.pccube.espd.enums;

public enum Agent {

	CONTRACTING_AUTHORITY("CA"),
	ECONOMIC_OPERATOR("EO");
	
	private final String code;

	Agent(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
