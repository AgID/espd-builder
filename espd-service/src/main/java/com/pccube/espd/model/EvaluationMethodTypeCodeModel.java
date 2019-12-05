package com.pccube.espd.model;

import com.pccube.espd.codelists.CdEvaluationMethodType;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EvaluationMethodTypeCodeType;

/**
 * Corresponding to {@link EvaluationMethodTypeCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class EvaluationMethodTypeCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CdEvaluationMethodType evaluationMethodType;
	
	
	/**
	 * constructor
	 */
	public EvaluationMethodTypeCodeModel() {
		this.evaluationMethodType = new CdEvaluationMethodType();
	}

	
	public CdEvaluationMethodType getEvaluationMethodType() {
		return evaluationMethodType;
	}

	public void setEvaluationMethodType(CdEvaluationMethodType evaluationMethodType) {
		this.evaluationMethodType = evaluationMethodType;
	}
	
}
