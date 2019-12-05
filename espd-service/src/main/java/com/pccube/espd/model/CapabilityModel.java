package com.pccube.espd.model;

import java.io.Serializable;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CapabilityType;

/**
 * Corresponding to {@link CapabilityType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CapabilityModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ValueAmountModel valueAmountModel;


	/**
	 * constructor
	 */
	public CapabilityModel() {
		this.valueAmountModel = new ValueAmountModel();
	}
	
	
	public ValueAmountModel getValueAmountModel() {
		return valueAmountModel;
	}
	public void setValueAmountModel(ValueAmountModel valueAmountModel) {
		this.valueAmountModel = valueAmountModel;
	}

}
