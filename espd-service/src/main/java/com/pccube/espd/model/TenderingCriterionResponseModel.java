package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionResponseType;

/**
 * Corresponding to {@link TenderingCriterionResponseType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class TenderingCriterionResponseModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IDModel idModel;
	private IDModel validatedCriterionPropertyIdModel;
	private ConfidentialityLevelCodeModel confidentialityLevelCodeModel;
	private List<ResponseValueModel> responseValueModels;
	private List<PeriodModel> applicablePeriodModels;
	private List<EvidenceSuppliedModel> evidenceSuppliedModels;

	
	/**
	 * constructor
	 */
	public TenderingCriterionResponseModel() {
		this.idModel = new IDModel();
		this.validatedCriterionPropertyIdModel = new IDModel();
		this.confidentialityLevelCodeModel = new ConfidentialityLevelCodeModel();
		this.responseValueModels = new ArrayList<ResponseValueModel>();
		this.applicablePeriodModels = new ArrayList<PeriodModel>();
		this.evidenceSuppliedModels = new ArrayList<EvidenceSuppliedModel>();
	}


	public IDModel getIdModel() {
		return idModel;
	}
	public void setIdModel(IDModel idModel) {
		this.idModel = idModel;
	}
	public IDModel getValidatedCriterionPropertyIdModel() {
		return validatedCriterionPropertyIdModel;
	}
	public void setValidatedCriterionPropertyIdModel(IDModel validatedCriterionPropertyIdModel) {
		this.validatedCriterionPropertyIdModel = validatedCriterionPropertyIdModel;
	}
	public ConfidentialityLevelCodeModel getConfidentialityLevelCodeModel() {
		return confidentialityLevelCodeModel;
	}
	public void setConfidentialityLevelCodeModel(ConfidentialityLevelCodeModel confidentialityLevelCodeModel) {
		this.confidentialityLevelCodeModel = confidentialityLevelCodeModel;
	}
	public List<ResponseValueModel> getResponseValueModels() {
		if (responseValueModels == null)
			responseValueModels = new ArrayList<ResponseValueModel>();
		return responseValueModels;
	}
	public void setResponseValueModels(List<ResponseValueModel> responseValueModels) {
		this.responseValueModels = responseValueModels;
	}
	public List<PeriodModel> getApplicablePeriodModels() {
		if (applicablePeriodModels == null)
			applicablePeriodModels = new ArrayList<PeriodModel>();
		return applicablePeriodModels;
	}
	public void setApplicablePeriodModels(List<PeriodModel> applicablePeriodModels) {
		this.applicablePeriodModels = applicablePeriodModels;
	}
	public List<EvidenceSuppliedModel> getEvidenceSuppliedModels() {
		if (evidenceSuppliedModels == null)
			evidenceSuppliedModels = new ArrayList<EvidenceSuppliedModel>();
		return evidenceSuppliedModels;
	}
	public void setEvidenceSuppliedModels(List<EvidenceSuppliedModel> evidenceSuppliedModels) {
		this.evidenceSuppliedModels = evidenceSuppliedModels;
	}
	
}
