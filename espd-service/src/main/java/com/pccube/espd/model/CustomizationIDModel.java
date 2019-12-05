package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CustomizationIDType;

/**
 * Corresponding to {@link CustomizationIDType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CustomizationIDModel extends IdentifierModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String customizationID;

	
	/**
	 * constructor
	 */
	public CustomizationIDModel() {
		this.customizationID = StringUtils.EMPTY;
	}
	
	public String getCustomizationID() {
		return customizationID;
	}

	public void setCustomizationID(String customizationID) {
		this.customizationID = customizationID;
	}
}
