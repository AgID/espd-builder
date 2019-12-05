package com.pccube.espd.enums;

public enum Customization {

	/**
	 * Request
	 */
    REQUEST("urn:www.cenbii.eu:transaction:biitrdm070:ver3.0", "ESPDREQ"),
	/**
	 * Response
	 */
    RESPONSE("urn:www.cenbii.eu:transaction:biitrdm092:ver3.0", "ESPDRES");
	

    private final String customizationId;
    
    private final String keyId;

    Customization(String customizationId, String keyId) {
		this.customizationId = customizationId;
		this.keyId = keyId;
	}

	public String getCustomizationId() {
		return customizationId;
	}

	public String getKeyId() {
		return keyId;
	}

}
