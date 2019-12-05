package com.pccube.espd.enums;

public enum Iso {

    ISO_3166_1("ISO 3166-1"),
    ISO_3166_2("ISO 3166-2");
    
    private final String iso;

    Iso(String iso) {
		this.iso = iso;
	}

	public String getIso() {
		return iso;
	}

    
}
