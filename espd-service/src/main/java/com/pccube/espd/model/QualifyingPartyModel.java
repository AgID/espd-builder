package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.QualifyingPartyType;

/**
 * Corresponding to {@link QualifyingPartyType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class QualifyingPartyModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private EmployeeQuantityModel employeeQuantityModel;
	private ClassificationSchemeModel businessClassificationSchemeModel;
	private List<CapabilityModel> financialCapabilityModels;
	private List<CompletedTaskModel> completedTaskModels;
	private PartyModel partyModel;
	
	
	/**
	 * constructor
	 */
	public QualifyingPartyModel() {
		this.employeeQuantityModel = new EmployeeQuantityModel();
		this.businessClassificationSchemeModel = new ClassificationSchemeModel();
		this.financialCapabilityModels = new ArrayList<CapabilityModel>();
		this.completedTaskModels = new ArrayList<CompletedTaskModel>();
		this.partyModel = new PartyModel();
	}


	public EmployeeQuantityModel getEmployeeQuantityModel() {
		return employeeQuantityModel;
	}
	public void setEmployeeQuantityModel(EmployeeQuantityModel employeeQuantityModel) {
		this.employeeQuantityModel = employeeQuantityModel;
	}
	public ClassificationSchemeModel getBusinessClassificationSchemeModel() {
		return businessClassificationSchemeModel;
	}
	public void setBusinessClassificationSchemeModel(ClassificationSchemeModel businessClassificationSchemeModel) {
		this.businessClassificationSchemeModel = businessClassificationSchemeModel;
	}
	public List<CapabilityModel> getFinancialCapabilityModels() {
		if (financialCapabilityModels == null)
			financialCapabilityModels = new ArrayList<CapabilityModel>();
		return financialCapabilityModels;
	}
	public void setFinancialCapabilityModels(List<CapabilityModel> financialCapabilityModels) {
		this.financialCapabilityModels = financialCapabilityModels;
	}
	public List<CompletedTaskModel> getCompletedTaskModels() {
		if (completedTaskModels == null)
			completedTaskModels = new ArrayList<CompletedTaskModel>();
		return completedTaskModels;
	}
	public void setCompletedTaskModels(List<CompletedTaskModel> completedTaskModels) {
		this.completedTaskModels = completedTaskModels;
	}
	public PartyModel getPartyModel() {
		return partyModel;
	}
	public void setPartyModel(PartyModel partyModel) {
		this.partyModel = partyModel;
	}
	
}
