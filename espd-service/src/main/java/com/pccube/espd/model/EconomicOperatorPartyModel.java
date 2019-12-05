package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EconomicOperatorPartyType;

/**
 * Corresponding to {@link EconomicOperatorPartyType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class EconomicOperatorPartyModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<QualifyingPartyModel> qualifyingPartyModels;
	private EconomicOperatorRoleModel economicOperatorRoleModel;
	private PartyModel partyModel;

	
	/**
	 * constructor
	 */
	public EconomicOperatorPartyModel() {
		this.qualifyingPartyModels = new ArrayList<QualifyingPartyModel>();
		this.economicOperatorRoleModel = new EconomicOperatorRoleModel();
		this.partyModel = new PartyModel();
	}


	public List<QualifyingPartyModel> getQualifyingPartyModels() {
		if (qualifyingPartyModels == null)
			qualifyingPartyModels = new ArrayList<QualifyingPartyModel>();
		return qualifyingPartyModels;
	}
	public void setQualifyingPartyModels(List<QualifyingPartyModel> qualifyingPartyModels) {
		this.qualifyingPartyModels = qualifyingPartyModels;
	}
	public EconomicOperatorRoleModel getEconomicOperatorRoleModel() {
		return economicOperatorRoleModel;
	}
	public void setEconomicOperatorRoleModel(EconomicOperatorRoleModel economicOperatorRoleModel) {
		this.economicOperatorRoleModel = economicOperatorRoleModel;
	}
	public PartyModel getPartyModel() {
		return partyModel;
	}
	public void setPartyModel(PartyModel partyModel) {
		this.partyModel = partyModel;
	}
	
}
