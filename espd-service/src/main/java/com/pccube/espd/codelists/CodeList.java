package com.pccube.espd.codelists;

import java.io.Serializable;

import com.pccube.espd.enums.Status;

/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CodeList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected String code;
	protected String name;
	protected String description;
	protected String translation;
	protected Status status;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
}
