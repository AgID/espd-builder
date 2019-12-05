package com.pccube.espd.model;

import com.pccube.espd.codelists.CdResponseDataType;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseCodeType;

/**
 * Corresponding to {@link ResponseCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ResponseCodeTypeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CdResponseDataType responseDataType;
	
	
	/**
	 * constructor
	 */
	public ResponseCodeTypeModel() {
		this.responseDataType = new CdResponseDataType();
	}

	public ResponseCodeTypeModel(CodeModel codemodel) {
		this.responseDataType = new CdResponseDataType();
		this.setListID(codemodel.getListID());
		this.setListAgencyName(codemodel.getListAgencyName());
		this.setListAgencyID(codemodel.getListAgencyID());
		this.setListVersionID(codemodel.getListVersionID());
	}
	

	public CdResponseDataType getResponseDataType() {
		return responseDataType;
	}

	public void setResponseDataType(CdResponseDataType responseDataType) {
		this.responseDataType = responseDataType;
	}

}
