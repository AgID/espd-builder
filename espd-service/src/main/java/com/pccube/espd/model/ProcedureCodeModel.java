package com.pccube.espd.model;

import com.pccube.espd.codelists.CdProcedureType;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProcedureCodeType;

/**
 * Corresponding to {@link ProcedureCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ProcedureCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CdProcedureType procedureType;
	
	
	/**
	 * constructor
	 */
	public ProcedureCodeModel() {
		this.procedureType = new CdProcedureType();
	}

	public ProcedureCodeModel(CodeModel codemodel) {
		this.procedureType = new CdProcedureType();
		this.setListID(codemodel.getListID());
		this.setListAgencyName(codemodel.getListAgencyName());
		this.setListAgencyID(codemodel.getListAgencyID());
		this.setListVersionID(codemodel.getListVersionID());
	}
	

	public CdProcedureType getProcedureType() {
		return procedureType;
	}

	public void setProcedureType(CdProcedureType procedureType) {
		this.procedureType = procedureType;
	}
}
