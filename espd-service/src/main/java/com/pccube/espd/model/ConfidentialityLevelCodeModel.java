package com.pccube.espd.model;

import com.pccube.espd.codelists.CdConfidentialityLevel;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConfidentialityLevelCodeType;

/**
 * Corresponding to {@link ConfidentialityLevelCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ConfidentialityLevelCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CdConfidentialityLevel confidentialityLevel;
	

	/**
	 * constructor
	 */
	public ConfidentialityLevelCodeModel() {
		this.confidentialityLevel = new CdConfidentialityLevel();
	}

	public ConfidentialityLevelCodeModel(CodeModel codemodel) {
		this.confidentialityLevel = new CdConfidentialityLevel();
		this.setListID(codemodel.getListID());
		this.setListAgencyName(codemodel.getListAgencyName());
		this.setListAgencyID(codemodel.getListAgencyID());
		this.setListVersionID(codemodel.getListVersionID());
	}

	public CdConfidentialityLevel getConfidentialityLevel() {
		return confidentialityLevel;
	}

	public void setConfidentialityLevel(CdConfidentialityLevel confidentialityLevel) {
		this.confidentialityLevel = confidentialityLevel;
	}
}
