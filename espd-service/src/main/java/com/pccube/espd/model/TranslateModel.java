package com.pccube.espd.model;

import java.io.Serializable;

public class TranslateModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String codeLanguage;
	private String[] labels;
	
	
	public String getCodeLanguage() {
		return codeLanguage;
	}
	public void setCodeLanguage(String codeLanguage) {
		this.codeLanguage = codeLanguage;
	}
	public String[] getLabels() {
		return labels;
	}
	public void setLabels(String[] labels) {
		this.labels = labels;
	}
}
