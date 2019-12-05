package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EndpointIDType;

/**
 * Corresponding to {@link EndpointIDType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class EndPointIDModel extends IdentifierModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String endPointID;
	
	
	/**
	 * constructor
	 */
	public EndPointIDModel() {
		this.endPointID = StringUtils.EMPTY;
	}
	

	public String getEndPointID() {
		return endPointID;
	}

	public void setEndPointID(String endPointID) {
		this.endPointID = endPointID;
	}

}
