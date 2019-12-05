package com.pccube.espd.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.AmountType;

/**
 * Attributes of the {@link AmountType} that are common for CommonBasicComponents.
 * Corresponding to {@link AmountType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class AmountModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String currencyID;

	
	/**
	 * constructor
	 */
	public AmountModel() {
		this.currencyID = StringUtils.EMPTY;
	}


	public String getCurrencyID() {
		return currencyID;
	}
	public void setCurrencyID(String currencyID) {
		this.currencyID = currencyID;
	}
}
