package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;


import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedCodeType;

/**
 * Corresponding to {@link ExpectedCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ExpectedCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String expectedCode;

	
	/**
	 * constructor
	 */
	public ExpectedCodeModel() {
		this.expectedCode = StringUtils.EMPTY;
	}
	
	
	public String getExpectedCode() {
		return expectedCode;
	}

	public void setExpectedCode(String expectedCode) {
		this.expectedCode = expectedCode;
	} 
	
}
