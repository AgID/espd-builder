package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueCurrencyCodeType;;

/**
 * Corresponding to {@link ValueCurrencyCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ValueCurrencyCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String valueCurrencyCode;
	
	
	/**
	 * constructor
	 */
	public ValueCurrencyCodeModel() {
		this.valueCurrencyCode = StringUtils.EMPTY;
	}

	
	public String getValueCurrencyCode() {
		return valueCurrencyCode;
	}

	public void setValueCurrencyCode(String valueCurrencyCode) {
		this.valueCurrencyCode = valueCurrencyCode;
	}

}
