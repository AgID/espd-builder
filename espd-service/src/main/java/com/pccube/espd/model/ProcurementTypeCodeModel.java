package com.pccube.espd.model;

import com.pccube.espd.codelists.CdProjectType;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProcurementTypeCodeType;

/**
 * Corresponding to {@link ProcurementTypeCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ProcurementTypeCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CdProjectType projectType;
	
	
	/**
	 * constructor
	 */
	public ProcurementTypeCodeModel() {
		this.projectType = new CdProjectType();
	}

	public ProcurementTypeCodeModel(CodeModel codemodel) {
		this.projectType = new CdProjectType();
		this.setListID(codemodel.getListID());
		this.setListAgencyName(codemodel.getListAgencyName());
		this.setListAgencyID(codemodel.getListAgencyID());
		this.setListVersionID(codemodel.getListVersionID());
	}
	
	
	public CdProjectType getProjectType() {
		return projectType;
	}
	public void setProjectType(CdProjectType projectType) {
		this.projectType = projectType;
	}

}
