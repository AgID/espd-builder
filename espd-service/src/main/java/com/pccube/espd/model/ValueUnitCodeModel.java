package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueUnitCodeType;

/**
 * Corresponding to {@link ValueUnitCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ValueUnitCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String valueUnitCode;
	
	
	/**
	 * constructor
	 */
	public ValueUnitCodeModel() {
		this.valueUnitCode = StringUtils.EMPTY;
	}
	

	public String getValueUnitCode() {
		return valueUnitCode;
	}

	public void setValueUnitCode(String valueUnitCode) {
		this.valueUnitCode = valueUnitCode;
	}

}
