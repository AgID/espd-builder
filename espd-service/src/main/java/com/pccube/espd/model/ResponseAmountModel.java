package com.pccube.espd.model;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseAmountType;

/**
 * Corresponding to {@link ResponseAmountType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ResponseAmountModel extends AmountModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Float responseAmount;


	/**
	 * constructor
	 */
	public ResponseAmountModel() {
		this.responseAmount = null;
	}
	
	
	public Float getResponseAmount() {
		return responseAmount;
	}
	public void setResponseAmount(Float responseAmount) {
		this.responseAmount = responseAmount;
	}

}
