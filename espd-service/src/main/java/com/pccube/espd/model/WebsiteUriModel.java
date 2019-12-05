package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WebsiteURIType;

/**
 * Corresponding to {@link WebsiteURIType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class WebsiteUriModel extends IdentifierModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String websiteUri;
	

	/**
	 * constructor
	 */
	public WebsiteUriModel() {
		this.websiteUri = StringUtils.EMPTY;
	}
	

	public String getWebsiteUri() {
		return websiteUri;
	}

	public void setWebsiteUri(String websiteUri) {
		this.websiteUri = websiteUri;
	}

}
