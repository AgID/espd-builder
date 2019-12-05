package com.pccube.espd.model;

import java.io.Serializable;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ContractingPartyType;


/**
 * Corresponding to {@link ContractingPartyType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ContractingPartyModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BuyerProfileUriModel buyerProfileUriModel;
	private PartyModel partyModel;
	

	/**
	 * constructor
	 */
	public ContractingPartyModel() {
		this.buyerProfileUriModel = new BuyerProfileUriModel();
		this.partyModel = new PartyModel();
	}

	
	public BuyerProfileUriModel getBuyerProfileUriModel() {
		return buyerProfileUriModel;
	}

	public void setBuyerProfileUriModel(BuyerProfileUriModel buyerProfileUriModel) {
		this.buyerProfileUriModel = buyerProfileUriModel;
	}

	public PartyModel getPartyModel() {
		return partyModel;
	}

	public void setPartyModel(PartyModel partyModel) {
		this.partyModel = partyModel;
	}
	

}
