package com.pccube.espd.enums;

public enum Agency {

	OASIS_UBL_TC("OASIS-UBL-TC"),
	CEN_BII("CEN-BII"),
	EU_COM_GROW("EU-COM-GROW"),
	DGPE("DGPE"),
	ADE("AdE"),
	EU_COM_OP("EU-COM-OP");
	
	
	private final String code;

	Agency(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
