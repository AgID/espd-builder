package com.pccube.espd.model;

import com.pccube.espd.codelists.CdQualificationApplicationType;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QualificationApplicationTypeCodeType;

/**
 * Corresponding to {@link QualificationApplicationTypeCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class QualificationApplicationTypeCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CdQualificationApplicationType qualificationApplicationType;
	
	
	/**
	 * constructor
	 */
	public QualificationApplicationTypeCodeModel() {
		this.qualificationApplicationType = new CdQualificationApplicationType();
	}

	public QualificationApplicationTypeCodeModel(CodeModel codemodel) {
		this.qualificationApplicationType = new CdQualificationApplicationType();
		this.setListID(codemodel.getListID());
		this.setListAgencyName(codemodel.getListAgencyName());
		this.setListAgencyID(codemodel.getListAgencyID());
		this.setListVersionID(codemodel.getListVersionID());
	}
	
	
	public CdQualificationApplicationType getQualificationApplicationType() {
		return qualificationApplicationType;
	}
	
	public void setQualificationApplicationType(CdQualificationApplicationType qualificationApplicationType) {
		this.qualificationApplicationType = qualificationApplicationType;
	}
}
