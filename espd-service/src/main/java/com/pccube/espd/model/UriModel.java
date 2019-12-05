package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.URIType;

/**
 * Corresponding to {@link URIType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class UriModel extends IdentifierModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String uri;
	
	
	/**
	 * constructor
	 */
	public UriModel() {
		this.uri = StringUtils.EMPTY;
	}
	

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
