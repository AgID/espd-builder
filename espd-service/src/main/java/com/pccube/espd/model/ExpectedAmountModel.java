package com.pccube.espd.model;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedAmountType;

/**
 * Corresponding to {@link ExpectedAmountType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ExpectedAmountModel extends AmountModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Float expectedAmount;


	/**
	 * constructor
	 */
	public ExpectedAmountModel() {
		this.expectedAmount = null;
	}
	
	
	public Float getExpectedAmount() {
		return expectedAmount;
	}
	public void setExpectedAmount(Float expectedAmount) {
		this.expectedAmount = expectedAmount;
	}

}
