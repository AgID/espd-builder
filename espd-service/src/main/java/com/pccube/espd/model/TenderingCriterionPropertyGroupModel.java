package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionPropertyGroupType;

/**
 * Corresponding to {@link TenderingCriterionPropertyGroupType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class TenderingCriterionPropertyGroupModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IDModel idModel;
	private PropertyGroupTypeCodeModel propertyGroupTypeCodeModel;
	private List<TenderingCriterionPropertyModel> tenderingCriterionPropertyModels;
	private List<TenderingCriterionPropertyGroupModel> subsidiaryTenderingCriterionPropertyGroupModels;

	private CriterionTypeCodeModel typeCodeModel; //TypeCode - Proprietà aggiunta per utilità di soluzione per il FE.
	private String cardinality; // Proprietà aggiunta per utilità di soluzione per il FE.
	private String flagDelete; // Proprietà aggiunta per utilità di soluzione per il FE.
	private String idParent; // Proprietà aggiunta per utilità di soluzione per il BE.
	
	/**
	 * constructor
	 */
	public TenderingCriterionPropertyGroupModel() {
		this.idModel = new IDModel();
		this.propertyGroupTypeCodeModel = new PropertyGroupTypeCodeModel();
		this.tenderingCriterionPropertyModels = new ArrayList<TenderingCriterionPropertyModel>();
		this.subsidiaryTenderingCriterionPropertyGroupModels = new ArrayList<TenderingCriterionPropertyGroupModel>();
		
		this.typeCodeModel = new CriterionTypeCodeModel();
		this.cardinality = StringUtils.EMPTY;
	}
	
	
	public IDModel getIdModel() {
		return idModel;
	}
	public void setIdModel(IDModel idModel) {
		this.idModel = idModel;
	}
	public PropertyGroupTypeCodeModel getPropertyGroupTypeCodeModel() {
		return propertyGroupTypeCodeModel;
	}
	public void setPropertyGroupTypeCodeModel(PropertyGroupTypeCodeModel propertyGroupTypeCodeModel) {
		this.propertyGroupTypeCodeModel = propertyGroupTypeCodeModel;
	}
	public List<TenderingCriterionPropertyModel> getTenderingCriterionPropertyModels() {
		if (tenderingCriterionPropertyModels == null)
			tenderingCriterionPropertyModels = new ArrayList<TenderingCriterionPropertyModel>();
		return tenderingCriterionPropertyModels;
	}
	public void setTenderingCriterionPropertyModels(
			List<TenderingCriterionPropertyModel> tenderingCriterionPropertyModels) {
		this.tenderingCriterionPropertyModels = tenderingCriterionPropertyModels;
	}
	public List<TenderingCriterionPropertyGroupModel> getSubsidiaryTenderingCriterionPropertyGroupModels() {
		if (subsidiaryTenderingCriterionPropertyGroupModels == null)
			subsidiaryTenderingCriterionPropertyGroupModels = new ArrayList<TenderingCriterionPropertyGroupModel>();
		return subsidiaryTenderingCriterionPropertyGroupModels;
	}
	public void setSubsidiaryTenderingCriterionPropertyGroupModels(
			List<TenderingCriterionPropertyGroupModel> subsidiaryTenderingCriterionPropertyGroupModels) {
		this.subsidiaryTenderingCriterionPropertyGroupModels = subsidiaryTenderingCriterionPropertyGroupModels;
	}
	public CriterionTypeCodeModel getTypeCodeModel() {
		return typeCodeModel;
	}
	public void setTypeCodeModel(CriterionTypeCodeModel typeCodeModel) {
		this.typeCodeModel = typeCodeModel;
	}
	public String getCardinality() {
		return cardinality;
	}
	public void setCardinality(String cardinality) {
		this.cardinality = cardinality;
	}
	public String isFlagDelete() {
		return flagDelete;
	}
	public void setFlagDelete(String flagDelete) {
		this.flagDelete = flagDelete;
	}
	public String getIdParent() {
		return idParent;
	}
	public void setIdParent(String idParent) {
		this.idParent = idParent;
	}
	
}
