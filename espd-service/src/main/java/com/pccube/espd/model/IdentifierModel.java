package com.pccube.espd.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.IdentifierType;

/**
 * Attributes of the {@link IdentifierType} that are common for CommonBasicComponents.
 * Corresponding to {@link IdentifierType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class IdentifierModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected String schemeID;
	protected String schemeName;
	protected String schemeAgencyID;
	protected String schemeAgencyName;
	protected String schemeVersionID;
	protected String schemeDataURI;
	protected String schemeURI;
	
	
	/**
	 * constructor
	 */
	public IdentifierModel() {
		this.schemeID = StringUtils.EMPTY;
		this.schemeName = StringUtils.EMPTY;
		this.schemeAgencyID = StringUtils.EMPTY;
		this.schemeAgencyName = StringUtils.EMPTY;
		this.schemeVersionID = StringUtils.EMPTY;
		this.schemeDataURI = StringUtils.EMPTY;
		this.schemeURI = StringUtils.EMPTY;
	}
	
	
	public String getSchemeID() {
		return schemeID;
	}
	public void setSchemeID(String schemeID) {
		this.schemeID = schemeID;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public String getSchemeAgencyID() {
		return schemeAgencyID;
	}
	public void setSchemeAgencyID(String schemeAgencyID) {
		this.schemeAgencyID = schemeAgencyID;
	}
	public String getSchemeAgencyName() {
		return schemeAgencyName;
	}
	public void setSchemeAgencyName(String schemeAgencyName) {
		this.schemeAgencyName = schemeAgencyName;
	}
	public String getSchemeVersionID() {
		return schemeVersionID;
	}
	public void setSchemeVersionID(String schemeVersionID) {
		this.schemeVersionID = schemeVersionID;
	}
	public String getSchemeDataURI() {
		return schemeDataURI;
	}
	public void setSchemeDataURI(String schemeDataURI) {
		this.schemeDataURI = schemeDataURI;
	}
	public String getSchemeURI() {
		return schemeURI;
	}
	public void setSchemeURI(String schemeURI) {
		this.schemeURI = schemeURI;
	}

}
