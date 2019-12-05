package com.pccube.espd.enums;

public enum UnitCode {

	YEAR("YEAR"),
	INTEGER("INTEGER"),
	PERCENTAGE("PERCENTAGE");
	
	private final String code;

	UnitCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
