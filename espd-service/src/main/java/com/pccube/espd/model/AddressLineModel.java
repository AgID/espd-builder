package com.pccube.espd.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressLineType;

/**
 * Corresponding to {@link AddressLineType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class AddressLineModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String line;
	
	
	/**
	 * constructor
	 */
	public AddressLineModel() {
		this.line = StringUtils.EMPTY;
	}
	
	
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	

}
