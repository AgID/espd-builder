package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
/**
 * Corresponding to {@link DescriptionType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class DescriptionModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String description;


	/**
	 * constructor
	 */
	public DescriptionModel() {
		this.description = StringUtils.EMPTY;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
