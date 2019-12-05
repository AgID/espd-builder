package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PreviousVersionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.VersionIDType;

/**
 * Corresponding to {@link VersionIDType} or {@link PreviousVersionIDType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class VersionIDModel extends IdentifierModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String ublVersion;
	private String versionID;
	private String previousVersionID;
	private boolean reloaded;
	
	
	/**
	 * constructor
	 */
	public VersionIDModel() {
		this.ublVersion = StringUtils.EMPTY;
		this.versionID = StringUtils.EMPTY;
		this.previousVersionID = StringUtils.EMPTY;
	}
	
	
	public String getVersionID() {
		return versionID;
	}
	public void setVersionID(String versionID) {
		this.versionID = versionID;
	}
	public String getPreviousVersionID() {
		return previousVersionID;
	}
	public void setPreviousVersionID(String previousVersionID) {
		this.previousVersionID = previousVersionID;
	}
	public String getUblVersion() {
		return ublVersion;
	}
	public void setUblVersion(String ublVersion) {
		this.ublVersion = ublVersion;
	}
	public boolean isReloaded() {
		return reloaded;
	}
	public void setReloaded(boolean reloaded) {
		this.reloaded = reloaded;
	}

}
