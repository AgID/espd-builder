package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionType;

/**
 * Corresponding to {@link TenderingCriterionType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class TenderingCriterionModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IDModel idModel;
	private CriterionTypeCodeModel criterionTypeCodeModel;
	private String name;
	private List<DescriptionModel> descriptionModels;
	private Float weightNumeric;
	private EvaluationMethodTypeCodeModel evaluationMethodTypeCodeModel;
	private List<String> weightingConsiderationDescriptions;
	private List<TenderingCriterionModel> subTenderingCriterionModels;
	private List<LegislationModel> legislationModels;
	private List<TenderingCriterionPropertyGroupModel> tenderingCriterionPropertyGroupModels;

	private String cardinality; // Proprietà aggiunta per utilità di soluzione per il FE.
	private String index; // Proprietà aggiunta per utilità di soluzione per il FE.
	
	/**
	 * constructor
	 */
	public TenderingCriterionModel() {
		this.idModel = new IDModel();
		this.criterionTypeCodeModel = new CriterionTypeCodeModel();
		this.name = StringUtils.EMPTY;
		this.descriptionModels = new ArrayList<DescriptionModel>();
		this.weightNumeric = null;
		this.evaluationMethodTypeCodeModel = new EvaluationMethodTypeCodeModel();
		this.weightingConsiderationDescriptions = new ArrayList<String>();
		this.subTenderingCriterionModels = new ArrayList<TenderingCriterionModel>();
		this.legislationModels = new ArrayList<LegislationModel>();
		this.tenderingCriterionPropertyGroupModels = new ArrayList<TenderingCriterionPropertyGroupModel>();

		this.cardinality = StringUtils.EMPTY;
		this.index = StringUtils.EMPTY;
	}
	

	public IDModel getIdModel() {
		return idModel;
	}

	public void setIdModel(IDModel idModel) {
		this.idModel = idModel;
	}

	public CriterionTypeCodeModel getCriterionTypeCodeModel() {
		return criterionTypeCodeModel;
	}

	public void setCriterionTypeCodeModel(CriterionTypeCodeModel criterionTypeCodeModel) {
		this.criterionTypeCodeModel = criterionTypeCodeModel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DescriptionModel> getDescriptionModels() {
		if (descriptionModels == null)
			descriptionModels = new ArrayList<DescriptionModel>();
		return descriptionModels;
	}
	
	public void setDescriptionModels(List<DescriptionModel> descriptionModels) {
		this.descriptionModels = descriptionModels;
	}

	public Float getWeightNumeric() {
		return weightNumeric;
	}

	public void setWeightNumeric(Float weightNumeric) {
		this.weightNumeric = weightNumeric;
	}

	public EvaluationMethodTypeCodeModel getEvaluationMethodTypeCodeModel() {
		return evaluationMethodTypeCodeModel;
	}

	public void setEvaluationMethodTypeCodeModel(EvaluationMethodTypeCodeModel evaluationMethodTypeCodeModel) {
		this.evaluationMethodTypeCodeModel = evaluationMethodTypeCodeModel;
	}

	public List<String> getWeightingConsiderationDescriptions() {
		if (weightingConsiderationDescriptions == null)
			weightingConsiderationDescriptions = new ArrayList<String>();
		return weightingConsiderationDescriptions;
	}

	public void setWeightingConsiderationDescriptions(List<String> weightingConsiderationDescriptions) {
		this.weightingConsiderationDescriptions = weightingConsiderationDescriptions;
	}

	public List<TenderingCriterionModel> getSubTenderingCriterionModels() {
		if (subTenderingCriterionModels == null)
			subTenderingCriterionModels = new ArrayList<TenderingCriterionModel>();
		return subTenderingCriterionModels;
	}

	public void setSubTenderingCriterionModels(List<TenderingCriterionModel> subTenderingCriterionModels) {
		this.subTenderingCriterionModels = subTenderingCriterionModels;
	}

	public List<LegislationModel> getLegislationModels() {
		if (legislationModels == null)
			legislationModels = new ArrayList<LegislationModel>();
		return legislationModels;
	}

	public void setLegislationModels(List<LegislationModel> legislationModels) {
		this.legislationModels = legislationModels;
	}

	public List<TenderingCriterionPropertyGroupModel> getTenderingCriterionPropertyGroupModels() {
		if (tenderingCriterionPropertyGroupModels == null)
			tenderingCriterionPropertyGroupModels = new ArrayList<TenderingCriterionPropertyGroupModel>();
		return tenderingCriterionPropertyGroupModels;
	}

	public void setTenderingCriterionPropertyGroupModels(List<TenderingCriterionPropertyGroupModel> tenderingCriterionPropertyGroupModels) {
		this.tenderingCriterionPropertyGroupModels = tenderingCriterionPropertyGroupModels;
	}

	public String getCardinality() {
		return cardinality;
	}

	public void setCardinality(String cardinality) {
		this.cardinality = cardinality;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

}
