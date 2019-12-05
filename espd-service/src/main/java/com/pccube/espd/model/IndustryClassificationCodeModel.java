package com.pccube.espd.model;

import com.pccube.espd.codelists.CdEOIndustryClassificationCode;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IndustryClassificationCodeType;

/**
 * Corresponding to {@link IndustryClassificationCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class IndustryClassificationCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CdEOIndustryClassificationCode eoIndustryClassificationCode;

	
	/**
	 * constructor
	 */
	public IndustryClassificationCodeModel() {
		this.eoIndustryClassificationCode = new CdEOIndustryClassificationCode();
	}	

	public IndustryClassificationCodeModel(CodeModel codemodel) {
		this.eoIndustryClassificationCode = new CdEOIndustryClassificationCode();
		this.setListID(codemodel.getListID());
		this.setListAgencyName(codemodel.getListAgencyName());
		this.setListAgencyID(codemodel.getListAgencyID());
		this.setListVersionID(codemodel.getListVersionID());
	}
	
	public CdEOIndustryClassificationCode getEoIndustryClassificationCode() {
		return eoIndustryClassificationCode;
	}

	public void setEoIndustryClassificationCode(CdEOIndustryClassificationCode eoIndustryClassificationCode) {
		this.eoIndustryClassificationCode = eoIndustryClassificationCode;
	}
}
