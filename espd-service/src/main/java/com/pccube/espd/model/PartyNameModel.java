package com.pccube.espd.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyNameType;

/**
 * Corresponding to {@link PartyNameType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class PartyNameModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	
	/**
	 * constructor
	 */
	public PartyNameModel() {
		this.name = StringUtils.EMPTY;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
