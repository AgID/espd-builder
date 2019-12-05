package com.pccube.espd.model;

import com.pccube.espd.codelists.CdCountryCodeIdentifier;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IdentificationCodeType;

/**
 * Corresponding to {@link IdentificationCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class IdentificationCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CdCountryCodeIdentifier countryCodeIdentifier;
	

	/**
	 * constructor
	 */
	public IdentificationCodeModel() {
		this.countryCodeIdentifier = new CdCountryCodeIdentifier();
	}
	
	public IdentificationCodeModel(CodeModel codemodel) {
		this.countryCodeIdentifier = new CdCountryCodeIdentifier();
		this.setListID(codemodel.getListID());
		this.setListAgencyName(codemodel.getListAgencyName());
		this.setListAgencyID(codemodel.getListAgencyID());
		this.setListVersionID(codemodel.getListVersionID());
	}
	
	
	public CdCountryCodeIdentifier getCountryCodeIdentifier() {
		return countryCodeIdentifier;
	}
	public void setCountryCodeIdentifier(CdCountryCodeIdentifier countryCodeIdentifier) {
		this.countryCodeIdentifier = countryCodeIdentifier;
	}

}
