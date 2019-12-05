package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionPropertyType;

/**
 * Corresponding to {@link TenderingCriterionPropertyType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class TenderingCriterionPropertyModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IDModel idModel;
	private List<DescriptionModel> descriptionModels;
	private CriterionTypeCodeModel typeCodeModel; //TypeCode
	private ResponseCodeTypeModel valueDataTypeCodeModel; //ValueDataTypeCode
	private ValueUnitCodeModel valueUnitCodeModel;
	private ValueCurrencyCodeModel valueCurrencyCodeModel;
	private ExpectedAmountModel expectedAmountModel;
	private ExpectedIDModel expectedIDModel;
	private ExpectedCodeModel expectedCodeModel;
	private String expectedDescription;
	private Float expectedValueNumeric;
	private Float maximumValueNumeric;
	private Float minimumValueNumeric;
	private List<String> certificationLevelDescriptions;
	private List<PeriodModel> periodModels;
	private List<EvidenceModel> evidenceModels;
	
	private TenderingCriterionResponseModel tenderingCriterionResponseModel; // Proprietà aggiunta per utilità di soluzione per il FE.
	private List<TenderingCriterionPropertyModel> lotsPropertyModels; // Proprietà aggiunta per utilità di soluzione per il FE.
	private List<TenderingCriterionPropertyModel> cpvsPropertyModels; // Proprietà aggiunta per utilità di soluzione per il FE.
	private ResponseIDModel responseIDModel; // Proprietà aggiunta per utilità di soluzione per il FE.
	private ResponseCodeModel responseCodeModel; // Proprietà aggiunta per utilità di soluzione per il FE.
	private String cardinality; // Proprietà aggiunta per utilità di soluzione per il FE.
	private IDModel logicalIdModel;
	
	/**
	 * constructor
	 */
	public TenderingCriterionPropertyModel() {
		this.idModel = new IDModel();
		this.descriptionModels = new ArrayList<DescriptionModel>();
		this.typeCodeModel = new CriterionTypeCodeModel();
		this.valueDataTypeCodeModel = new ResponseCodeTypeModel();
		this.valueUnitCodeModel = new ValueUnitCodeModel();
		this.valueCurrencyCodeModel = new ValueCurrencyCodeModel();
		this.expectedAmountModel = new ExpectedAmountModel();
		this.expectedIDModel = new ExpectedIDModel();
		this.expectedCodeModel = new ExpectedCodeModel();
		this.expectedDescription = StringUtils.EMPTY;
		this.expectedValueNumeric = null;
		this.maximumValueNumeric = null;
		this.minimumValueNumeric = null;
		this.certificationLevelDescriptions = new ArrayList<String>();
		this.periodModels = new ArrayList<PeriodModel>();
		this.evidenceModels = new ArrayList<EvidenceModel>();

		this.lotsPropertyModels = new ArrayList<TenderingCriterionPropertyModel>();
		this.cpvsPropertyModels = new ArrayList<TenderingCriterionPropertyModel>();
		this.responseIDModel = new ResponseIDModel();
		this.responseCodeModel = new ResponseCodeModel();
		this.cardinality = StringUtils.EMPTY;
		this.logicalIdModel = new IDModel();
	}
	
	
	public IDModel getIdModel() {
		return idModel;
	}
	public void setIdModel(IDModel idModel) {
		this.idModel = idModel;
	}
	public List<DescriptionModel> getDescriptionModels() {
		if (descriptionModels == null)
			descriptionModels = new ArrayList<DescriptionModel>();
		return descriptionModels;
	}
	public void setDescriptionModels(List<DescriptionModel> descriptionModels) {
		this.descriptionModels = descriptionModels;
	}
	public CriterionTypeCodeModel getTypeCodeModel() {
		return typeCodeModel;
	}
	public void setTypeCodeModel(CriterionTypeCodeModel typeCodeModel) {
		this.typeCodeModel = typeCodeModel;
	}
	public ResponseCodeTypeModel getValueDataTypeCodeModel() {
		return valueDataTypeCodeModel;
	}
	public void setValueDataTypeCodeModel(ResponseCodeTypeModel valueDataTypeCodeModel) {
		this.valueDataTypeCodeModel = valueDataTypeCodeModel;
	}
	public ValueUnitCodeModel getValueUnitCodeModel() {
		return valueUnitCodeModel;
	}
	public void setValueUnitCodeModel(ValueUnitCodeModel valueUnitCodeModel) {
		this.valueUnitCodeModel = valueUnitCodeModel;
	}
	public ValueCurrencyCodeModel getValueCurrencyCodeModel() {
		return valueCurrencyCodeModel;
	}
	public void setValueCurrencyCodeModel(ValueCurrencyCodeModel valueCurrencyCodeModel) {
		this.valueCurrencyCodeModel = valueCurrencyCodeModel;
	}
	public ExpectedAmountModel getExpectedAmountModel() {
		return expectedAmountModel;
	}
	public void setExpectedAmountModel(ExpectedAmountModel expectedAmountModel) {
		this.expectedAmountModel = expectedAmountModel;
	}
	public ExpectedIDModel getExpectedIDModel() {
		return expectedIDModel;
	}
	public void setExpectedIDModel(ExpectedIDModel expectedIDModel) {
		this.expectedIDModel = expectedIDModel;
	}
	public ExpectedCodeModel getExpectedCodeModel() {
		return expectedCodeModel;
	}
	public void setExpectedCodeModel(ExpectedCodeModel expectedCodeModel) {
		this.expectedCodeModel = expectedCodeModel;
	}
	public String getExpectedDescription() {
		return expectedDescription;
	}
	public void setExpectedDescription(String expectedDescription) {
		this.expectedDescription = expectedDescription;
	}
	public Float getExpectedValueNumeric() {
		return expectedValueNumeric;
	}
	public void setExpectedValueNumeric(Float expectedValueNumeric) {
		this.expectedValueNumeric = expectedValueNumeric;
	}
	public Float getMaximumValueNumeric() {
		return maximumValueNumeric;
	}
	public void setMaximumValueNumeric(Float maximumValueNumeric) {
		this.maximumValueNumeric = maximumValueNumeric;
	}
	public Float getMinimumValueNumeric() {
		return minimumValueNumeric;
	}
	public void setMinimumValueNumeric(Float minimumValueNumeric) {
		this.minimumValueNumeric = minimumValueNumeric;
	}
	public List<String> getCertificationLevelDescriptions() {
		if (certificationLevelDescriptions == null)
			certificationLevelDescriptions = new ArrayList<String>();
		return certificationLevelDescriptions;
	}
	public void setCertificationLevelDescriptions(List<String> certificationLevelDescriptions) {
		this.certificationLevelDescriptions = certificationLevelDescriptions;
	}
	public List<PeriodModel> getPeriodModels() {
		if (periodModels == null)
			periodModels = new ArrayList<PeriodModel>();
		return periodModels;
	}
	public void setPeriodModels(List<PeriodModel> periodModels) {
		this.periodModels = periodModels;
	}
	public List<EvidenceModel> getEvidenceModels() {
		if (evidenceModels == null)
			evidenceModels = new ArrayList<EvidenceModel>();
		return evidenceModels;
	}
	public void setEvidenceModels(List<EvidenceModel> evidenceModels) {
		this.evidenceModels = evidenceModels;
	}
	public TenderingCriterionResponseModel getTenderingCriterionResponseModel() {
		return tenderingCriterionResponseModel;
	}
	public void setTenderingCriterionResponseModel(TenderingCriterionResponseModel tenderingCriterionResponseModel) {
		this.tenderingCriterionResponseModel = tenderingCriterionResponseModel;
	}
	public List<TenderingCriterionPropertyModel> getLotsPropertyModels() {
		if (lotsPropertyModels == null)
			lotsPropertyModels = new ArrayList<TenderingCriterionPropertyModel>();
		return lotsPropertyModels;
	}
	public void setLotsPropertyModels(List<TenderingCriterionPropertyModel> lotsPropertyModels) {
		this.lotsPropertyModels = lotsPropertyModels;
	}
	public List<TenderingCriterionPropertyModel> getCpvsPropertyModels() {
		if (cpvsPropertyModels == null)
			cpvsPropertyModels = new ArrayList<TenderingCriterionPropertyModel>();
		return cpvsPropertyModels;
	}
	public void setCpvsPropertyModels(List<TenderingCriterionPropertyModel> cpvsPropertyModels) {
		this.cpvsPropertyModels = cpvsPropertyModels;
	}
	public ResponseIDModel getResponseIDModel() {
		return responseIDModel;
	}
	public void setResponseIDModel(ResponseIDModel responseIDModel) {
		this.responseIDModel = responseIDModel;
	}
	public ResponseCodeModel getResponseCodeModel() {
		return responseCodeModel;
	}
	public void setResponseCodeModel(ResponseCodeModel responseCodeModel) {
		this.responseCodeModel = responseCodeModel;
	}
	public String getCardinality() {
		return cardinality;
	}
	public void setCardinality(String cardinality) {
		this.cardinality = cardinality;
	}
	public IDModel getLogicalIdModel() {
		return logicalIdModel;
	}
	public void setLogicalIdModel(IDModel logicalIdModel) {
		this.logicalIdModel = logicalIdModel;
	}
	
}
