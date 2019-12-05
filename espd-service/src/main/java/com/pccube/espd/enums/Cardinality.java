package com.pccube.espd.enums;

public enum Cardinality {

	UNO("1"),
	ZEROUNO("0..1"),
	ZEROENNE("0..n"),
	UNOENNE("1..n");
	
	private final String code;

	Cardinality(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
