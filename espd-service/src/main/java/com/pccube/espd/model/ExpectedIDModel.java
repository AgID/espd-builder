package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedIDType;;

/**
 * Corresponding to {@link ExpectedIDType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ExpectedIDModel extends IdentifierModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String expectedID;
	
	
	/**
	 * constructor
	 */
	public ExpectedIDModel() {
		this.expectedID = StringUtils.EMPTY;
	}
	

	public String getExpectedID() {
		return expectedID;
	}

	public void setExpectedID(String expectedID) {
		this.expectedID = expectedID;
	}

}
