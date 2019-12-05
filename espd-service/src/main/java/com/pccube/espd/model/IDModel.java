package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;

/**
 * Corresponding to {@link IDType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class IDModel extends IdentifierModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	
	/**
	 * constructor
	 */	
	public IDModel() {
		this.id = StringUtils.EMPTY;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
