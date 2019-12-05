package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyType;


/**
 * Corresponding to {@link PartyType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class PartyModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<PartyIdentificationModel> partyIdentificationModels;
	private WebsiteUriModel websiteUriModel;
	private EndPointIDModel endPointIDModel;
	private List<PartyNameModel> partyNameModels;
	private AddressModel addressModel;
	private ContactModel contactModel;
	private List<ServiceProviderPartyModel> serviceProviderPartyModels;
	private IndustryClassificationCodeModel industryClassificationCodeModel;
	private List<PowerOfAttorneyModel> powerOfAttorneyModels;
	private List<PersonModel> personModels;
	
	/**
	 * constructor
	 */
	public PartyModel() {
		this.partyIdentificationModels = new ArrayList<PartyIdentificationModel>();
		this.websiteUriModel = new WebsiteUriModel();
		this.endPointIDModel = new EndPointIDModel();
		this.partyNameModels = new ArrayList<PartyNameModel>();
		this.addressModel = new AddressModel();
		this.contactModel = new ContactModel();
		this.serviceProviderPartyModels = new ArrayList<ServiceProviderPartyModel>();
		this.industryClassificationCodeModel = new IndustryClassificationCodeModel();
		this.powerOfAttorneyModels = new ArrayList<PowerOfAttorneyModel>();
		this.personModels = new ArrayList<PersonModel>();
	}

	
	public List<PartyIdentificationModel> getPartyIdentificationModels() {
		if (partyIdentificationModels == null)
			partyIdentificationModels = new ArrayList<PartyIdentificationModel>();
		return partyIdentificationModels;
	}

	public void setPartyIdentificationModels(List<PartyIdentificationModel> partyIdentificationModels) {
		this.partyIdentificationModels = partyIdentificationModels;
	}

	public WebsiteUriModel getWebsiteUriModel() {
		return websiteUriModel;
	}

	public void setWebsiteUriModel(WebsiteUriModel websiteUriModel) {
		this.websiteUriModel = websiteUriModel;
	}

	public EndPointIDModel getEndPointIDModel() {
		return endPointIDModel;
	}

	public void setEndPointIDModel(EndPointIDModel endPointIDModel) {
		this.endPointIDModel = endPointIDModel;
	}

	public List<PartyNameModel> getPartyNameModels() {
		if (partyNameModels == null)
			partyNameModels = new ArrayList<PartyNameModel>();
		return partyNameModels;
	}

	public void setPartyNameModels(List<PartyNameModel> partyNameModels) {
		this.partyNameModels = partyNameModels;
	}

	public AddressModel getAddressModel() {
		return addressModel;
	}

	public void setAddressModel(AddressModel addressModel) {
		this.addressModel = addressModel;
	}

	public ContactModel getContactModel() {
		return contactModel;
	}

	public void setContactModel(ContactModel contactModel) {
		this.contactModel = contactModel;
	}

	public List<ServiceProviderPartyModel> getServiceProviderPartyModels() {
		if (serviceProviderPartyModels == null)
			serviceProviderPartyModels = new ArrayList<ServiceProviderPartyModel>();
		return serviceProviderPartyModels;
	}

	public void setServiceProviderPartyModels(List<ServiceProviderPartyModel> serviceProviderPartyModels) {
		this.serviceProviderPartyModels = serviceProviderPartyModels;
	}

	public IndustryClassificationCodeModel getIndustryClassificationCodeModel() {
		return industryClassificationCodeModel;
	}

	public void setIndustryClassificationCodeModel(IndustryClassificationCodeModel industryClassificationCodeModel) {
		this.industryClassificationCodeModel = industryClassificationCodeModel;
	}

	public List<PowerOfAttorneyModel> getPowerOfAttorneyModels() {
		if (powerOfAttorneyModels == null)
			powerOfAttorneyModels = new ArrayList<PowerOfAttorneyModel>();
		return powerOfAttorneyModels;
	}

	public void setPowerOfAttorneyModels(List<PowerOfAttorneyModel> powerOfAttorneyModels) {
		this.powerOfAttorneyModels = powerOfAttorneyModels;
	}

	public List<PersonModel> getPersonModels() {
		if (personModels == null)
			personModels = new ArrayList<PersonModel>();
		return personModels;
	}

	public void setPersonModels(List<PersonModel> personModels) {
		this.personModels = personModels;
	}
	
	

}
