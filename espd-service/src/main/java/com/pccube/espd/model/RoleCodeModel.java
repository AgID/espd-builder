package com.pccube.espd.model;

import com.pccube.espd.codelists.CdEORoleType;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RoleCodeType;

/**
 * Corresponding to {@link RoleCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class RoleCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CdEORoleType eoRoleType;
	

	/**
	 * constructor
	 */
	public RoleCodeModel() {
		this.eoRoleType = new CdEORoleType();
	}

	public RoleCodeModel(CodeModel codemodel) {
		this.eoRoleType = new CdEORoleType();
		this.setListID(codemodel.getListID());
		this.setListAgencyName(codemodel.getListAgencyName());
		this.setListAgencyID(codemodel.getListAgencyID());
		this.setListVersionID(codemodel.getListVersionID());
	}
	
	
	public CdEORoleType getEoRoleType() {
		return eoRoleType;
	}
	public void setEoRoleType(CdEORoleType eoRoleType) {
		this.eoRoleType = eoRoleType;
	}
}
