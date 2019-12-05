package com.pccube.espd.model;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueAmountType;

/**
 * Corresponding to {@link ValueAmountType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ValueAmountModel extends AmountModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Float valueAmount;


	/**
	 * constructor
	 */
	public ValueAmountModel() {
		this.valueAmount = null;
	}
	
	
	public Float getValueAmount() {
		return valueAmount;
	}
	public void setValueAmount(Float valueAmount) {
		this.valueAmount = valueAmount;
	}

}
