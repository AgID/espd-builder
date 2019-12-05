package com.pccube.espd.model;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseMeasureType;

/**
 * Corresponding to {@link ResponseMeasureType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ResponseMeasureModel extends MeasureModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Float responseMeasure;


	/**
	 * constructor
	 */
	public ResponseMeasureModel() {
		this.responseMeasure = null;
	}
	
	
	public Float getResponseMeasure() {
		return responseMeasure;
	}
	public void setResponseMeasure(Float responseMeasure) {
		this.responseMeasure = responseMeasure;
	}

}
