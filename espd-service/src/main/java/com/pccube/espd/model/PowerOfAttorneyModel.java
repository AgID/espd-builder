package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PowerOfAttorneyType;

/**
 * Corresponding to {@link PowerOfAttorneyType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class PowerOfAttorneyModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PartyModel agentPartyModel;
	private List<DescriptionModel> descriptionModels;
	
	
	/**
	 * constructor
	 */
	public PowerOfAttorneyModel() {
		this.agentPartyModel = new PartyModel();
		this.descriptionModels = new ArrayList<DescriptionModel>();
	}
	
	
	public PartyModel getAgentPartyModel() {
		return agentPartyModel;
	}

	public void setAgentPartyModel(PartyModel agentPartyModel) {
		this.agentPartyModel = agentPartyModel;
	}

	public List<DescriptionModel> getDescriptionModels() {
		if (descriptionModels == null)
			descriptionModels = new ArrayList<DescriptionModel>();
		return descriptionModels;
	}
	
	public void setDescriptionModels(List<DescriptionModel> descriptionModels) {
		this.descriptionModels = descriptionModels;
	}

}
