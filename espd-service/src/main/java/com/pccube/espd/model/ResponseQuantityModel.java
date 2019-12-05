package com.pccube.espd.model;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseQuantityType;

/**
 * Corresponding to {@link ResponseQuantityType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ResponseQuantityModel extends MeasureModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Float responseQuantity;


	/**
	 * constructor
	 */
	public ResponseQuantityModel() {
		this.responseQuantity = null;
	}
	
	
	public Float getResponseQuantity() {
		return responseQuantity;
	}
	public void setResponseQuantity(Float responseQuantity) {
		this.responseQuantity = responseQuantity;
	}

}
