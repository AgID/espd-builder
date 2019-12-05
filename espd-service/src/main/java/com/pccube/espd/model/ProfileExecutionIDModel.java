package com.pccube.espd.model;

import com.pccube.espd.codelists.CdProfileExecutionID;
import com.pccube.espd.enums.CodeList;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProfileExecutionIDType;

/**
 * Corresponding to {@link ProfileExecutionIDType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ProfileExecutionIDModel extends IdentifierModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CdProfileExecutionID profileExecutionID;
	
	
	/**
	 * constructor
	 */
	public ProfileExecutionIDModel() {
		this.profileExecutionID = new CdProfileExecutionID();
	}

	public ProfileExecutionIDModel(CodeModel codemodel) {
		this.profileExecutionID = new CdProfileExecutionID();
		this.setSchemeID(codemodel.getListID());
		this.setSchemeAgencyName(codemodel.getListAgencyName());
		this.setSchemeAgencyID(codemodel.getListAgencyID());
		this.setSchemeVersionID(codemodel.getListVersionID());
	}

	public CdProfileExecutionID getProfileExecutionID() {
		return profileExecutionID;
	}

	public void setProfileExecutionID(CdProfileExecutionID profileExecutionID) {
		this.profileExecutionID = profileExecutionID;
	} 

	@Override
	public String getSchemeID() {
		return CodeList.PROFILE_EXECUTION_ID.getNameList();
	}

}
