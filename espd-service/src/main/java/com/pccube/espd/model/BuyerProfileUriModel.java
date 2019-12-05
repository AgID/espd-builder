package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BuyerProfileURIType;

/**
 * Corresponding to {@link BuyerProfileURIType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class BuyerProfileUriModel extends IdentifierModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String buyerProfileUri;
	
	
	/**
	 * constructor
	 */
	public BuyerProfileUriModel() {
		this.buyerProfileUri = StringUtils.EMPTY;
	}

	
	public String getBuyerProfileUri() {
		return buyerProfileUri;
	}

	public void setBuyerProfileUri(String buyerProfileUri) {
		this.buyerProfileUri = buyerProfileUri;
	}

}
