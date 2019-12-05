package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProfileIDType;

/**
 * Corresponding to {@link ProfileIDType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ProfileIDModel extends IdentifierModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String profileID;
	
	
	/**
	 * constructor
	 */
	public ProfileIDModel() {
		this.profileID = StringUtils.EMPTY;
	}
	

	public String getProfileID() {
		return profileID;
	}

	public void setProfileID(String profileID) {
		this.profileID = profileID;
	}

}
