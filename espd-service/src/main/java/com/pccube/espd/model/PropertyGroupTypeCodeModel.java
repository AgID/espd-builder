package com.pccube.espd.model;

import com.pccube.espd.codelists.CdPropertyGroupType;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PropertyGroupTypeCodeType;

/**
 * Corresponding to {@link PropertyGroupTypeCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class PropertyGroupTypeCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CdPropertyGroupType propertyGroupType;
	
	
	/**
	 * constructor
	 */
	public PropertyGroupTypeCodeModel() {
		this.propertyGroupType = new CdPropertyGroupType();
	}
	

	public CdPropertyGroupType getPropertyGroupType() {
		return propertyGroupType;
	}

	public void setPropertyGroupType(CdPropertyGroupType propertyGroupType) {
		this.propertyGroupType = propertyGroupType;
	}

}
