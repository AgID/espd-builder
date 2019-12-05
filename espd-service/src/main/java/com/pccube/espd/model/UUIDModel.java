package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

public class UUIDModel extends IdentifierModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String uuid;
	
	
	/**
	 * constructor
	 */
	public UUIDModel() {
		this.uuid = StringUtils.EMPTY;
	}
	

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
