package com.pccube.espd.model;

import com.pccube.espd.codelists.CdWeightingType;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeightingTypeCodeType;

/**
 * Corresponding to {@link WeightingTypeCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class WeightingTypeCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CdWeightingType weightingType;
	
	
	/**
	 * constructor
	 */
	public WeightingTypeCodeModel() {
		this.weightingType = new CdWeightingType();
	}

	public WeightingTypeCodeModel(CodeModel codemodel) {
		this.weightingType = new CdWeightingType();
		this.setListID(codemodel.getListID());
		this.setListAgencyName(codemodel.getListAgencyName());
		this.setListAgencyID(codemodel.getListAgencyID());
		this.setListVersionID(codemodel.getListVersionID());
	}
	

	public CdWeightingType getWeightingType() {
		return weightingType;
	}

	public void setWeightingType(CdWeightingType weightingType) {
		this.weightingType = weightingType;
	}

}
