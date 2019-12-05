package com.pccube.espd.model;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseCodeType;

/**
 * Corresponding to {@link ResponseCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ResponseCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String responseCode;


	/**
	 * constructor
	 */
	public ResponseCodeModel() {
		this.responseCode = null;
	}
	
	
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
}
