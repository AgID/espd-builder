package com.pccube.espd.model;

import com.pccube.espd.codelists.CdCriterionElementType;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CriterionTypeCodeType;

/**
 * Corresponding to {@link CriterionTypeCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CriterionTypeCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CdCriterionElementType criterionElementType;


	/**
	 * constructor
	 */
	public CriterionTypeCodeModel() {
		this.criterionElementType = new CdCriterionElementType();
	}

	public CriterionTypeCodeModel(CodeModel codemodel) {
		this.criterionElementType = new CdCriterionElementType();
		this.setListID(codemodel.getListID());
		this.setListAgencyName(codemodel.getListAgencyName());
		this.setListAgencyID(codemodel.getListAgencyID());
		this.setListVersionID(codemodel.getListVersionID());
	}
	
	
	public CdCriterionElementType getCriterionElementType() {
		return criterionElementType;
	}

	public void setCriterionElementType(CdCriterionElementType criterionElementType) {
		this.criterionElementType = criterionElementType;
	}

}
