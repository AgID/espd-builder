package com.pccube.espd.model;

import java.io.Serializable;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ServiceProviderPartyType;

/**
 * Corresponding to {@link ServiceProviderPartyType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ServiceProviderPartyModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PartyModel partyModel;
	
	
	/**
	 * constructor
	 */
	public ServiceProviderPartyModel() {
		this.partyModel = new PartyModel();
	}

	
	public PartyModel getPartyModel() {
		return partyModel;
	}

	public void setPartyModel(PartyModel partyModel) {
		this.partyModel = partyModel;
	}

}
