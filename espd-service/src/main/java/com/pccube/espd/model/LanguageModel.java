package com.pccube.espd.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

public class LanguageModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String sourceLanguage;
	private String englishName;
	private String code;
	
	
	/**
	 * constructor
	 */
	public LanguageModel() {
		this.sourceLanguage = StringUtils.EMPTY;
		this.englishName = StringUtils.EMPTY;
		this.code = StringUtils.EMPTY;
	}
	
	
	public String getSourceLanguage() {
		return sourceLanguage;
	}
	public void setSourceLanguage(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
	}
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
