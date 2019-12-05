package com.pccube.espd.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.MeasureType;

/**
 * Attributes of the {@link MeasureType} that are common for CommonBasicComponents.
 * Corresponding to {@link MeasureType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class MeasureModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String unitCode;

	
	/**
	 * constructor
	 */
	public MeasureModel() {
		this.unitCode = StringUtils.EMPTY;
	}


	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

}
