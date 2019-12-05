package com.pccube.espd.factory;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.pccube.espd.config.EspdConfiguration;
import com.pccube.espd.config.VariableConfiguration;
import com.pccube.espd.model.AddressLineModel;
import com.pccube.espd.model.AddressModel;
import com.pccube.espd.model.AttachmentModel;
import com.pccube.espd.model.CapabilityModel;
import com.pccube.espd.model.ClassificationSchemeModel;
import com.pccube.espd.model.CommodityClassificationModel;
import com.pccube.espd.model.CompletedTaskModel;
import com.pccube.espd.model.ContactModel;
import com.pccube.espd.model.ContractingPartyModel;
import com.pccube.espd.model.CountryModel;
import com.pccube.espd.model.DocumentReferenceModel;
import com.pccube.espd.model.EconomicOperatorPartyModel;
import com.pccube.espd.model.EconomicOperatorRoleModel;
import com.pccube.espd.model.EvidenceModel;
import com.pccube.espd.model.EvidenceSuppliedModel;
import com.pccube.espd.model.ExternalReferenceModel;
import com.pccube.espd.model.LegislationModel;
import com.pccube.espd.model.PartyIdentificationModel;
import com.pccube.espd.model.PartyModel;
import com.pccube.espd.model.PartyNameModel;
import com.pccube.espd.model.PeriodModel;
import com.pccube.espd.model.PersonModel;
import com.pccube.espd.model.PowerOfAttorneyModel;
import com.pccube.espd.model.ProcurementProjectLotModel;
import com.pccube.espd.model.ProcurementProjectModel;
import com.pccube.espd.model.QualifyingPartyModel;
import com.pccube.espd.model.ResponseValueModel;
import com.pccube.espd.model.ServiceProviderPartyModel;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressLineType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AttachmentType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CapabilityType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ClassificationSchemeType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CommodityClassificationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CompletedTaskType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ContactType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ContractingPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CountryType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DocumentReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EconomicOperatorPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EconomicOperatorRoleType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EvidenceSuppliedType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EvidenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ExternalReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LegislationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyIdentificationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyNameType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PeriodType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PersonType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PowerOfAttorneyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ProcurementProjectLotType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ProcurementProjectType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.QualifyingPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ResponseValueType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ServiceProviderPartyType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ArticleType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CandidateStatementType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.JurisdictionLevelType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RoleDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TitleType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.URIType;
import oasis.names.specification.ubl.schema.xsd.qualificationapplicationrequest_2.QualificationApplicationRequestType;
import oasis.names.specification.ubl.schema.xsd.qualificationapplicationresponse_2.QualificationApplicationResponseType;

/**
 * Simple factory for creating aggregate UBL elements that are shared between a 
 * {@link QualificationApplicationRequestType} and {@link QualificationApplicationResponseType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class UblCommonAggregateFactory extends GenericCommonFactory {

	public UblCommonAggregateFactory(EspdConfiguration espdConfiguration, VariableConfiguration variableConfiguration) {
		super(espdConfiguration, variableConfiguration);
		// TODO Auto-generated constructor stub
	}

	
	/**
     * The contracting authority or contracting entity who is buying supplies, services or 
     * public works using a tendering procedure as described in the applicable directive (Directives 2014/24/EU, 2014/25/EU).
     * 
     * Cardinality 1..n
     * 
     * @param contractingPartyModels Contracting authority or entity.
     *
     * @return The corresponding UBL element
	 * @throws IllegalAccessException 
     */
    public static List<ContractingPartyType> buildContractingPartyType(List<ContractingPartyModel> contractingPartyModels) throws IllegalAccessException {
    	List<ContractingPartyType> contractingPartyTypes = null;
    	
    	if (contractingPartyModels != null && contractingPartyModels.size() > 0){
    		contractingPartyTypes = new ArrayList<ContractingPartyType>();
    		ContractingPartyType contractingPartyType = null;
    		for (ContractingPartyModel contractingPartyModel : contractingPartyModels){
    			contractingPartyType = new ContractingPartyType();
    			contractingPartyType.setBuyerProfileURI(UblCommonBasicFactory.buildBuyerProfileURIType(contractingPartyModel.getBuyerProfileUriModel()));
    	    	contractingPartyType.setParty(UblCommonAggregateFactory.buildPartyType(contractingPartyModel.getPartyModel()));
    			
    	    	if (!GenericFactory.isAllFieldsNull(contractingPartyType)) { 
    	    		contractingPartyTypes.add(contractingPartyType);
    	    	}
    		}
    		
    		if (contractingPartyTypes.isEmpty()) {
    			contractingPartyTypes = null;
    		}
    	}
        return contractingPartyTypes;
    }
	
	/**
     * Main data placeholder structure for, in this case, the contracting body.
     * 
     * Cardinality 1
     * 
     * @param partyModel Class embedded reference to an external source.
     *
     * @return The corresponding UBL element
	 * @throws IllegalAccessException 
     */
    public static PartyType buildPartyType(PartyModel partyModel) throws IllegalAccessException {
    	PartyType partyType = null;
    	
    	if (partyModel != null){
    		partyType = new PartyType();
        	List<PartyIdentificationType> partyIdentificationTypes = UblCommonAggregateFactory.buildPartyIdentificationTypes(partyModel.getPartyIdentificationModels());
        	if (partyIdentificationTypes != null && partyIdentificationTypes.size() > 0){
            	partyType.getPartyIdentification().addAll(partyIdentificationTypes);
        	}
        	partyType.setWebsiteURI(UblCommonBasicFactory.buildWebsiteURIType(partyModel.getWebsiteUriModel()));
            partyType.setEndpointID(UblCommonBasicFactory.buildEndpointIDType(partyModel.getEndPointIDModel()));
            List<PartyNameType> partyNameTypes = UblCommonAggregateFactory.buildPartyNameTypes(partyModel.getPartyNameModels());
        	if (partyNameTypes != null && partyNameTypes.size() > 0){
            	partyType.getPartyName().addAll(partyNameTypes);
        	}
        	partyType.setPostalAddress(UblCommonAggregateFactory.buildAddressType(partyModel.getAddressModel()));
        	partyType.setContact(UblCommonAggregateFactory.buildContactType(partyModel.getContactModel()));
        	List<ServiceProviderPartyType> serviceProviderPartyTypes = UblCommonAggregateFactory.buildServiceProviderPartyTypes(partyModel.getServiceProviderPartyModels());
        	if (serviceProviderPartyTypes != null && serviceProviderPartyTypes.size() > 0){
            	partyType.getServiceProviderParty().addAll(serviceProviderPartyTypes);
        	}
        	partyType.setIndustryClassificationCode(UblCommonBasicFactory.buildIndustryClassificationCodeType(partyModel.getIndustryClassificationCodeModel()));
        	List<PowerOfAttorneyType> powerOfAttorneyTypes = UblCommonAggregateFactory.buildPowerOfAttorneyTypes(partyModel.getPowerOfAttorneyModels());
        	if (powerOfAttorneyTypes != null && powerOfAttorneyTypes.size() > 0){
            	partyType.getPowerOfAttorney().addAll(powerOfAttorneyTypes);
        	}
        	List<PersonType> personTypes = UblCommonAggregateFactory.buildPersonTypes(partyModel.getPersonModels());
        	if (personTypes != null && personTypes.size() > 0){
            	partyType.getPerson().addAll(personTypes);
        	}
        	
        	if (GenericFactory.isAllFieldsNull(partyType)) { 
        		partyType = null;
        	}
    	}
    	return partyType;
    }
	
	/**
     * The national identifier of a contracting body as it is legally registered (e.g. VAT identification).
     * 
     * Cardinality 0..n
     * 
     * @param partyIdentificationModels
     *
     * @return The corresponding UBL element
	 * @throws IllegalAccessException 
     */
    public static List<PartyIdentificationType> buildPartyIdentificationTypes(List<PartyIdentificationModel> partyIdentificationModels) throws IllegalAccessException {
		List<PartyIdentificationType> partyIdentificationTypes = null;
		    	
    	if (partyIdentificationModels != null && partyIdentificationModels.size() > 0){
    		partyIdentificationTypes = new ArrayList<PartyIdentificationType>();
    		PartyIdentificationType partyIdentificationType = null;
    		for (PartyIdentificationModel partyIdentificationModel : partyIdentificationModels){
    			partyIdentificationType = new PartyIdentificationType();
    			partyIdentificationType.setID(UblCommonBasicFactory.buildIdType(partyIdentificationModel.getIdModel()));
    			
    			if (!GenericFactory.isAllFieldsNull(partyIdentificationType)) { 
    				partyIdentificationTypes.add(partyIdentificationType);
    			}
    		}
    		
    		if (partyIdentificationTypes.isEmpty()) { 
    			partyIdentificationTypes = null;
    		}
    	}
        return partyIdentificationTypes;
    }
	
	/**
     * The name of the contracting body as it is registered.
     * 
     * Cardinality 0..n
     * 
     * @param partyNameModels
     *
     * @return The corresponding UBL element
	 * @throws IllegalAccessException 
     */
    public static List<PartyNameType> buildPartyNameTypes(List<PartyNameModel> partyNameModels) throws IllegalAccessException {
		List<PartyNameType> partyNameTypes = null;
		    	
    	if (partyNameModels != null && partyNameModels.size() > 0){
    		partyNameTypes = new ArrayList<PartyNameType>();
    		PartyNameType partyNameType = null;
    		for (PartyNameModel partyNameModel : partyNameModels){
    			partyNameType = new PartyNameType();
    			partyNameType.setName(UblCommonBasicFactory.buildNameType(partyNameModel.getName()));
    			
    			if (!GenericFactory.isAllFieldsNull(partyNameType)) { 
    				partyNameTypes.add(partyNameType);
    			}
    		}
    		
    		if (partyNameTypes.isEmpty()) { 
    			partyNameTypes = null;
    		}
    	}
        return partyNameTypes;
    }
	
	/**
     * Contracting body address information.
     * 
     * Cardinality 0..n
     * 
     * @param addressModel Contracting body address information.
     *
     * @return The corresponding UBL element
	 * @throws IllegalAccessException 
     */
    public static AddressType buildAddressType(AddressModel addressModel) throws IllegalAccessException {
    	AddressType addressType = null;
    	
    	if (addressModel != null){
    		addressType = new AddressType();
        	addressType.setStreetName(UblCommonBasicFactory.buildStreetNameType(addressModel.getStreetName()));
        	addressType.setCityName(UblCommonBasicFactory.buildCityNameType(addressModel.getCityName()));
        	addressType.setPostalZone(UblCommonBasicFactory.buildPostalZoneType(addressModel.getPostalZone()));
        	addressType.setCountry(UblCommonAggregateFactory.buildCountryType(addressModel.getCountryModel()));
        	List<AddressLineType> addressLineTypes = UblCommonAggregateFactory.buildAddressLineTypes(addressModel.getAddressLineModels());
        	if (addressLineTypes != null && addressLineTypes.size() > 0){
        		addressType.getAddressLine().addAll(addressLineTypes);
        	}
        	
        	if (GenericFactory.isAllFieldsNull(addressType)) { 
        		addressType = null;
        	}
    	}
    	return addressType;
    }

    /**
     * The main address line in an address. Usually the street name and number or post office box.
     *
     * 0..1
     * 
     * @param addressLineModels
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static List<AddressLineType> buildAddressLineTypes(List<AddressLineModel> addressLineModels) throws IllegalAccessException {
    	List<AddressLineType> addressLineTypes = null;
    	
    	if (addressLineModels != null && addressLineModels.size() > 0){
    		addressLineTypes = new ArrayList<AddressLineType>();
    		AddressLineType addressLineType = null;
    		for (AddressLineModel addressLineModel : addressLineModels){
    			addressLineType = new AddressLineType();
    			addressLineType.setLine(UblCommonBasicFactory.buildLineType(addressLineModel.getLine()));
    			
    			if (!GenericFactory.isAllFieldsNull(addressLineType)) { 
    				addressLineTypes.add(addressLineType);
    			}
    		}
    		
    		if (addressLineTypes.isEmpty()) { 
    			addressLineTypes = null;
    		}
    	}
        return addressLineTypes;
    }

    /**
     * The country of the contracting body.
     *
     * 0..1
     * 
     * @param countryModel The country of the contracting body.
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static CountryType buildCountryType(CountryModel countryModel) throws IllegalAccessException {
    	CountryType countryType = null;
    	
    	if (countryModel != null){
    		countryType = new CountryType();
        	countryType.setName(UblCommonBasicFactory.buildNameType(countryModel.getName()));
        	countryType.setIdentificationCode(UblCommonBasicFactory.buildIdentificationCodeType(countryModel.getIdentificationCodeModel()));
        	
        	if (GenericFactory.isAllFieldsNull(countryType)) { 
        		countryType = null;
        	}
    	}
    	return countryType;
    }

    /**
     * Used to provide contacting information for a party in general or a person.
     *
     * 0..1
     * 
     * @param contactModel Contacting information for a party in general or a person.
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static ContactType buildContactType(ContactModel contactModel) throws IllegalAccessException {
    	ContactType contactType = null;
    	
    	if (contactModel != null){
    		contactType = new ContactType();
        	contactType.setName(UblCommonBasicFactory.buildNameType(contactModel.getName()));
        	contactType.setTelephone(UblCommonBasicFactory.buildTelephoneType(contactModel.getTelephone()));
        	contactType.setTelefax(UblCommonBasicFactory.buildTelefaxType(contactModel.getTelefax()));
        	contactType.setElectronicMail(UblCommonBasicFactory.buildElectronicMailType(contactModel.getEmail()));
        	
        	if (GenericFactory.isAllFieldsNull(contactType)) {
        		contactType = null;
        	}
    	}
    	return contactType;
    }

    /**
     * Used to place the main data about the service provider.
     *
     * 0..n
     * 
     * @param serviceProviderPartyModels Service providers are officially recognised organisations that can supply ESPD Request documents.
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static List<ServiceProviderPartyType> buildServiceProviderPartyTypes(List<ServiceProviderPartyModel> serviceProviderPartyModels) throws IllegalAccessException {
    	List<ServiceProviderPartyType> serviceProviderPartyTypes = null;
    	
    	if (serviceProviderPartyModels != null && serviceProviderPartyModels.size() > 0){
    		serviceProviderPartyTypes = new ArrayList<ServiceProviderPartyType>();
    		ServiceProviderPartyType serviceProviderPartyType = null;
    		for (ServiceProviderPartyModel serviceProviderPartyModel : serviceProviderPartyModels){
    			serviceProviderPartyType = new ServiceProviderPartyType();
    			serviceProviderPartyType.setParty(UblCommonAggregateFactory.buildPartyType(serviceProviderPartyModel.getPartyModel()));
    			
    			if (!GenericFactory.isAllFieldsNull(serviceProviderPartyType)) {
    				serviceProviderPartyTypes.add(serviceProviderPartyType);
    			}
    		}
    		
    		if (serviceProviderPartyTypes.isEmpty()) {
    			serviceProviderPartyTypes = null;
    		}
    	}
        return serviceProviderPartyTypes;
    }
    
	/**
     * An overall definition of the procurement procedure.
     * 
     * Cardinality 0..1
     *
     * @param procurementProjectModel Definition of the procurement procedure.
     *
     * @return The corresponding UBL element
	 * @throws IllegalAccessException 
     */
    public static ProcurementProjectType buildProcurementProjectType(ProcurementProjectModel procurementProjectModel) throws IllegalAccessException {
    	ProcurementProjectType procurementProjectType = null;
    	
    	if (procurementProjectModel != null){
    		procurementProjectType = new ProcurementProjectType();
    		procurementProjectType.setID(UblCommonBasicFactory.buildIdType(procurementProjectModel.getIdModel()));
        	List<NameType> nameTypes = UblCommonBasicFactory.buildNameTypes(procurementProjectModel.getNames());
        	if (nameTypes != null && nameTypes.size() > 0){
        		procurementProjectType.getName().addAll(nameTypes);
        	}
        	List<DescriptionType> descriptionTypes = UblCommonBasicFactory.buildDescriptionTypes(procurementProjectModel.getDescriptionModels(), false);
        	if (descriptionTypes != null && descriptionTypes.size() > 0){
        		procurementProjectType.getDescription().addAll(descriptionTypes);
        	}
        	procurementProjectType.setProcurementTypeCode(UblCommonBasicFactory.buildProcurementTypeCodeType(procurementProjectModel.getProcurementTypeCodeModel()));
        	List<CommodityClassificationType> commodityClassificationTypes = UblCommonAggregateFactory.buildCommodityClassificationTypes(procurementProjectModel.getMainCommodityClassificationModels());
        	if (commodityClassificationTypes != null && commodityClassificationTypes.size() > 0){
        		procurementProjectType.getMainCommodityClassification().addAll(commodityClassificationTypes);
        	}
        	procurementProjectType = initProcurementProjectType(procurementProjectType);
        	
        	if (GenericFactory.isAllFieldsNull(procurementProjectType)) {
        		procurementProjectType = null;
        	}
    	}
    	return procurementProjectType;
    }
    
	/**
     * A class to classify the works, services or supplies. 
     * The Self-contained ESPD uses it to assign CPV codes to works and services.
     * 
     * Cardinality 0..n
     *
     * @param commodityClassificationModels A class to classify the works, services or supplies.
     *
     * @return The corresponding UBL element
	 * @throws IllegalAccessException 
     */
    public static List<CommodityClassificationType> buildCommodityClassificationTypes(List<CommodityClassificationModel> commodityClassificationModels) throws IllegalAccessException {
    	List<CommodityClassificationType> commodityClassificationTypes = null;
    	
    	if (commodityClassificationModels != null && commodityClassificationModels.size() > 0){
    		commodityClassificationTypes = new ArrayList<CommodityClassificationType>();
    		CommodityClassificationType commodityClassificationType = null;
    		for (CommodityClassificationModel commodityClassificationModel : commodityClassificationModels){
    			commodityClassificationType = new CommodityClassificationType();
    			commodityClassificationType.setItemClassificationCode(UblCommonBasicFactory.buildItemClassificationCodeType(commodityClassificationModel.getItemClassificationCodeModel()));
    			
    			if (!GenericFactory.isAllFieldsNull(commodityClassificationType)) {
    				commodityClassificationTypes.add(commodityClassificationType);
    			}
    		}
    		
    		if (commodityClassificationTypes.isEmpty()) {
    			commodityClassificationTypes = null;
    		}
    	}
        return commodityClassificationTypes;
    }
	
	/**
     * A sub-project into which a procurement procedure can be divided. 
     * A procurement project lot has its specific characteristics 
     * (e.g. different objectives and different selection criteria) 
     * and usually generates its own contract.
     * 
     * Cardinality 0..n
     *
     * @param procurementProjectLotModels One of the procurement project lots into which this contract can be divided.
     *
     * @return The corresponding UBL element
	 * @throws IllegalAccessException 
     */
    public static List<ProcurementProjectLotType> buildProcurementProjectLotType(List<ProcurementProjectLotModel> procurementProjectLotModels) throws IllegalAccessException {
    	List<ProcurementProjectLotType> procurementProjectLotTypes = null;
    	
    	if (procurementProjectLotModels != null && procurementProjectLotModels.size() > 0){
    		procurementProjectLotTypes = new ArrayList<ProcurementProjectLotType>();
    		ProcurementProjectLotType procurementProjectLotType = null;
    		for (ProcurementProjectLotModel procurementProjectLotModel : procurementProjectLotModels){
    			procurementProjectLotType = new ProcurementProjectLotType();
    			procurementProjectLotType.setID(UblCommonBasicFactory.buildIdType(procurementProjectLotModel.getIdModel()));
    			procurementProjectLotType = initProcurementProjectLotType(procurementProjectLotType);
    			
    			if (!GenericFactory.isAllFieldsNull(procurementProjectLotType)) {
    				procurementProjectLotTypes.add(procurementProjectLotType);
    			}
    		}
    		
    		if (procurementProjectLotTypes.isEmpty()) {
    			procurementProjectLotTypes = null;
    		}
    	}
    	
    	return procurementProjectLotTypes;
    }
	
	/**
     * A reference to an additional document associated with this document.
     * 
     * Cardinality 0..n
     * 
     * @param documentReferenceModels Reference to an additional document associated.
     *
     * @return The corresponding UBL element
	 * @throws ParseException 
	 * @throws IllegalAccessException 
     */
    public static List<DocumentReferenceType> buildDocumentReferenceTypes(List<DocumentReferenceModel> documentReferenceModels) throws ParseException, IllegalAccessException {
    	List<DocumentReferenceType> documentReferenceTypes = null;
    	
    	if (documentReferenceModels != null && documentReferenceModels.size() > 0){
    		documentReferenceTypes = new ArrayList<DocumentReferenceType>();
    		DocumentReferenceType documentReferenceType = null;
    		for (DocumentReferenceModel documentReferenceModel : documentReferenceModels){
    	    	documentReferenceType = new DocumentReferenceType();
    	    	documentReferenceType.setID(UblCommonBasicFactory.buildIdType(documentReferenceModel.getIdModel()));
    	    	documentReferenceType = initDocumentReferenceType(documentReferenceType);
    	    	documentReferenceType.setUUID(UblCommonBasicFactory.buildUuidType(documentReferenceModel.getUuidModel()));
    	    	documentReferenceType.setDocumentTypeCode(UblCommonBasicFactory.buildDocumentTypeCodeType(documentReferenceModel.getDocumentTypeCodeModel()));
    	    	documentReferenceType.setDocumentType(UblCommonBasicFactory.buildDocumentTypeType(documentReferenceModel.getDocumentTypeModel()));
    	    	documentReferenceType.setIssueDate(UblCommonBasicFactory.buildIssueDateType(documentReferenceModel.getWhenDate()));
    	    	documentReferenceType.setIssueTime(UblCommonBasicFactory.buildIssueTimeType(documentReferenceModel.getWhenTime()));
    	    	documentReferenceType.setAttachment(UblCommonAggregateFactory.buildAttachmentType(documentReferenceModel.getAttachmentModel()));
    	    	documentReferenceType.setIssuerParty(UblCommonAggregateFactory.buildPartyType(documentReferenceModel.getIssuerPartyModel()));
    	    	
    			if (!GenericFactory.isAllFieldsNull(documentReferenceType)) {
    				documentReferenceTypes.add(documentReferenceType);
    			}
    		}
    		
    		if (documentReferenceTypes.isEmpty()) {
    			documentReferenceTypes = null;
    		}
    	}
    	
        return documentReferenceTypes;
    }
	
	/**
     * A class that allows for embedding the content or making reference to an external source of the content.
     * 
     * Cardinality 1
     * 
     * @param attachmentModel Class embedded reference to an external source.
     *
     * @return The corresponding UBL element
	 * @throws IllegalAccessException 
     */
    public static AttachmentType buildAttachmentType(AttachmentModel attachmentModel) throws IllegalAccessException {
    	AttachmentType attachmentType = null;
    	
    	if (attachmentModel != null){
    		attachmentType = new AttachmentType();
        	attachmentType.setExternalReference(UblCommonAggregateFactory.buildExternalReferenceType(attachmentModel.getExternalReferenceModel()));
        	
        	if (GenericFactory.isAllFieldsNull(attachmentType)) {
        		attachmentType = null;
        	}
    	}
        return attachmentType;
    }
	
	/**
     * A reference to the authentic source of content of this document.
     * 
     * Cardinality 1
     * 
     * @param externalReferenceModel Reference to the authentic source (UriModel, Filename, Descriptions).
     *
     * @return The corresponding UBL element
	 * @throws IllegalAccessException 
     */
    public static ExternalReferenceType buildExternalReferenceType(ExternalReferenceModel externalReferenceModel) throws IllegalAccessException {
    	ExternalReferenceType externalReferenceType = null;
    	
    	if (externalReferenceModel != null){
    		externalReferenceType = new ExternalReferenceType();
        	externalReferenceType.setURI(UblCommonBasicFactory.buildUriType(externalReferenceModel.getUriModel()));
        	externalReferenceType.setFileName(UblCommonBasicFactory.buildFileNameType(externalReferenceModel.getFileName()));
        	List<DescriptionType> descriptionTypes = UblCommonBasicFactory.buildDescriptionTypes(externalReferenceModel.getDescriptionModels(), false);
        	if (descriptionTypes != null && descriptionTypes.size() > 0){
            	externalReferenceType.getDescription().addAll(descriptionTypes);
        	}

        	if (GenericFactory.isAllFieldsNull(externalReferenceType)) {
        		externalReferenceType = null;
        	}
    	}
        return externalReferenceType;
    }
	
	/**
     * A reference to the legislation related to the Criterion.
     * 
     * Cardinality 0..n
     * 
     * @param legislationModels
     *
     * @return The corresponding UBL element
	 * @throws IllegalAccessException 
     */
    public static List<LegislationType> buildLegislationTypes(List<LegislationModel> legislationModels) throws IllegalAccessException {
    	List<LegislationType> legislationTypes = null;
        
    	if (legislationModels != null && legislationModels.size() > 0){
    		legislationTypes = new ArrayList<LegislationType>();
    		LegislationType legislationType = null;
    		for (LegislationModel legislationModel : legislationModels){
    			legislationType = new LegislationType();
    			legislationType.setID(UblCommonBasicFactory.buildIdType(legislationModel.getIdModel()));
    			List<TitleType> titleTypes = UblCommonBasicFactory.buildTitleTypes(legislationModel.getTitles());
    	    	if (titleTypes != null && titleTypes.size() > 0){
    	    		legislationType.getTitle().addAll(titleTypes);
    	    	}
    	    	List<DescriptionType> descriptionTypes = UblCommonBasicFactory.buildDescriptionTypes(legislationModel.getDescriptionModels(), false);
    	    	if (descriptionTypes != null && descriptionTypes.size() > 0){
    	    		legislationType.getDescription().addAll(descriptionTypes);
    	    	}
    	    	List<JurisdictionLevelType> jurisdictionLevelTypes = UblCommonBasicFactory.buildJurisdictionLevelTypes(legislationModel.getJurisdictionLevels());
    	    	if (jurisdictionLevelTypes != null && jurisdictionLevelTypes.size() > 0){
    	    		legislationType.getJurisdictionLevel().addAll(jurisdictionLevelTypes);
    	    	}
    	    	List<ArticleType> articleTypes = UblCommonBasicFactory.buildArticleTypes(legislationModel.getArticles());
    	    	if (articleTypes != null && articleTypes.size() > 0){
    	    		legislationType.getArticle().addAll(articleTypes);
    	    	}
    	    	List<URIType> uriTypes = UblCommonBasicFactory.buildUriTypes(legislationModel.getUriModels());
    	    	if (uriTypes != null && uriTypes.size() > 0){
    	    		legislationType.getURI().addAll(uriTypes);
    	    	}
    	    	
    	    	if (!GenericFactory.isAllFieldsNull(legislationType)) {
    	    		legislationTypes.add(legislationType);
    	    	}
    		}
    		
    		if (legislationTypes.isEmpty()) {
    			legislationTypes = null;
    		}
    	}
    	
    	return legislationTypes;
    }
    
    /**
     * The period to which this criterion property shall apply.
     * 
     * Cardinality 0..1
     * 
     * @param periodModels
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static List<PeriodType> buildPeriodTypes(List<PeriodModel> periodModels) throws IllegalAccessException{
    	List<PeriodType> periodTypes = null;
    	
    	if (periodModels != null && periodModels.size() > 0){
    		periodTypes = new ArrayList<PeriodType>();
    		PeriodType periodType = null;
    		for (PeriodModel periodModel : periodModels){
    			periodType = new PeriodType();
    			periodType.setStartDate(UblCommonBasicFactory.buildStartDateType(periodModel.getStartDate()));
    			periodType.setEndDate(UblCommonBasicFactory.buildEndDateType(periodModel.getEndDate()));
    			
    			if (!GenericFactory.isAllFieldsNull(periodType)) {
    				periodTypes.add(periodType);
    			}
    		}
    		
    		if (periodTypes.isEmpty()) {
    			periodTypes = null;
    		}
    	}
    	return periodTypes;
    }

    /**
     * A pointer to one or more evidences that support the veracity of this criterion.
     * 
     * Cardinality 0..n
     * 
     * @param evidenceModels
     *
     * @return The corresponding UBL element
     * 
     * @throws ParseException 
     * @throws IllegalAccessException 
     */
    public static List<EvidenceType> buildEvidenceTypes(List<EvidenceModel> evidenceModels) throws ParseException, IllegalAccessException{
    	List<EvidenceType> evidenceTypes = null;
    	
    	if (evidenceModels != null && evidenceModels.size() > 0){
    		evidenceTypes = new ArrayList<EvidenceType>();
    		EvidenceType evidenceType = null;
    		for (EvidenceModel evidenceModel : evidenceModels){
    			evidenceType = new EvidenceType();
    			evidenceType.setID(UblCommonBasicFactory.buildIdType(evidenceModel.getIdModel()));
    			evidenceType.setName(UblCommonBasicFactory.buildNameType(evidenceModel.getName()));
    			List<DescriptionType> descriptionTypes = UblCommonBasicFactory.buildDescriptionTypes(evidenceModel.getDescriptionModels(), false);
    	    	if (descriptionTypes != null && descriptionTypes.size() > 0){
    	    		evidenceType.getDescription().addAll(descriptionTypes);
    	    	}
    	    	List<CandidateStatementType> candidateTypes = UblCommonBasicFactory.buildCandidateStatementTypes(evidenceModel.getCandidateStatements());
    	    	if (candidateTypes != null && candidateTypes.size() > 0){
    	    		evidenceType.getCandidateStatement().addAll(candidateTypes);
    	    	}
    	    	evidenceType.setConfidentialityLevelCode(UblCommonBasicFactory.buildConfidentialityLevelCodeType(evidenceModel.getConfidentialityLevelCodeModel()));
    	    	List<DocumentReferenceType> documentReferenceTypes = UblCommonAggregateFactory.buildDocumentReferenceTypes(evidenceModel.getDocumentReferenceModels());
            	if (documentReferenceTypes != null && documentReferenceTypes.size() > 0){
            		evidenceType.getDocumentReference().addAll(documentReferenceTypes);
            	}
    			
            	if (!GenericFactory.isAllFieldsNull(evidenceType) 
            			&& evidenceType.getDocumentReference() != null && !evidenceType.getDocumentReference().isEmpty()) {
            		evidenceTypes.add(evidenceType);
            	}
    		}
    		
    		if (evidenceTypes.isEmpty()) {
    			evidenceTypes = null;
    		}
    	}
    	return evidenceTypes;
    }

    /**
     * Any natural or legal person or public entity, including any temporary association of undertakings, 
     * which offers the execution of works and/or a work, the supply of products or the provision of services on the market. 
     * Information about the party submitting the qualification.
     * 
     * Cardinality 1..n
     * 
     * @param economicOperatorPartyModels
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static List<EconomicOperatorPartyType> buildEconomicOperatorPartyTypes(List<EconomicOperatorPartyModel> economicOperatorPartyModels) throws IllegalAccessException{
    	List<EconomicOperatorPartyType> economicOperatorPartyTypes = null;
    	
    	if (economicOperatorPartyModels != null && economicOperatorPartyModels.size() > 0){
    		economicOperatorPartyTypes = new ArrayList<EconomicOperatorPartyType>();
    		EconomicOperatorPartyType economicOperatorPartyType = null;
    		for (EconomicOperatorPartyModel economicOperatorPartyModel : economicOperatorPartyModels){
    			economicOperatorPartyType = new EconomicOperatorPartyType();
    			List<QualifyingPartyType> qualifyingPartyTypes = UblCommonAggregateFactory.buildQualifyingPartyTypes(economicOperatorPartyModel.getQualifyingPartyModels());
    	    	if (qualifyingPartyTypes != null && qualifyingPartyTypes.size() > 0){
    	    		economicOperatorPartyType.getQualifyingParty().addAll(qualifyingPartyTypes);
    	    	}
    	    	economicOperatorPartyType.setEconomicOperatorRole(UblCommonAggregateFactory.buildEconomicOperatorRoleType(economicOperatorPartyModel.getEconomicOperatorRoleModel()));
    	    	economicOperatorPartyType.setParty(UblCommonAggregateFactory.buildPartyType(economicOperatorPartyModel.getPartyModel()));
    	    	
    	    	if (!GenericFactory.isAllFieldsNull(economicOperatorPartyType)) {
    	    		economicOperatorPartyTypes.add(economicOperatorPartyType);
    	    	}
    		}
    		
    		if (economicOperatorPartyTypes.isEmpty()) {
    			economicOperatorPartyTypes = null;
    		}
    	}
    	return economicOperatorPartyTypes;
    }   

    /**
     * The distinctive features or characteristics qualifying an economic operator to be a party in a tendering process 
     * (e.g., number of employees, number of operating units, type of business, technical and financial capabilities, completed projects).
     * 
     * Cardinality 0..n
     * 
     * @param qualifyingPartyModels
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static List<QualifyingPartyType> buildQualifyingPartyTypes(List<QualifyingPartyModel> qualifyingPartyModels) throws IllegalAccessException{
    	List<QualifyingPartyType> qualifyingPartyTypes = null;
    	
    	if (qualifyingPartyModels != null && qualifyingPartyModels.size() > 0){
    		qualifyingPartyTypes = new ArrayList<QualifyingPartyType>();
    		QualifyingPartyType qualifyingPartyType = null;
    		for (QualifyingPartyModel qualifyingPartyModel : qualifyingPartyModels){
    			qualifyingPartyType = new QualifyingPartyType();
    			qualifyingPartyType.setEmployeeQuantity(UblCommonBasicFactory.buildEmployeeQuantityType(qualifyingPartyModel.getEmployeeQuantityModel()));
    	    	qualifyingPartyType.setBusinessClassificationScheme(UblCommonAggregateFactory.buildClassificationSchemeType(qualifyingPartyModel.getBusinessClassificationSchemeModel()));
    	    	List<CapabilityType> capabilityTypes = UblCommonAggregateFactory.buildCapabilityTypes(qualifyingPartyModel.getFinancialCapabilityModels());
    	    	if (capabilityTypes != null && capabilityTypes.size() > 0){
    	    		qualifyingPartyType.getFinancialCapability().addAll(capabilityTypes);
    	    	} 
    	    	List<CompletedTaskType> completedTaskTypes = UblCommonAggregateFactory.buildCompletedTaskTypes(qualifyingPartyModel.getCompletedTaskModels());
    	    	if (completedTaskTypes != null && completedTaskTypes.size() > 0){
    	    		qualifyingPartyType.getCompletedTask().addAll(completedTaskTypes);
    	    	} 
    	    	qualifyingPartyType.setParty(UblCommonAggregateFactory.buildPartyType(qualifyingPartyModel.getPartyModel()));
    	    	
    	    	if (!GenericFactory.isAllFieldsNull(qualifyingPartyType)) {
    	    		qualifyingPartyTypes.add(qualifyingPartyType);
    	    	}
    		}
    		
    		if (qualifyingPartyTypes.isEmpty()) {
    			qualifyingPartyTypes = null;
    		}
    	}
    	return qualifyingPartyTypes;
    }   

    /**
     * The distinctive features or characteristics qualifying an economic operator to be a party in a tendering process 
     * (e.g., number of employees, number of operating units, type of business, technical and financial capabilities, completed projects).
     * 
     * Cardinality 0..n
     * 
     * @param classificationSchemeModel
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static ClassificationSchemeType buildClassificationSchemeType(ClassificationSchemeModel classificationSchemeModel) throws IllegalAccessException{
    	ClassificationSchemeType classificationSchemeType = null;

    	if (classificationSchemeModel != null && classificationSchemeModel.getDescriptionModels() != null
    			&& classificationSchemeModel.getDescriptionModels().size() > 0){
        	classificationSchemeType = new ClassificationSchemeType();
        	List<DescriptionType> descriptionTypes = UblCommonBasicFactory.buildDescriptionTypes(classificationSchemeModel.getDescriptionModels(), false);
        	if (descriptionTypes != null && descriptionTypes.size() > 0){
        		classificationSchemeType.getDescription().addAll(descriptionTypes);
        	}
        	
        	if (GenericFactory.isAllFieldsNull(classificationSchemeType)) {
        		classificationSchemeType = null;
        	}
    	}
    	return classificationSchemeType;
    }   

    /**
     * A monetary amount as a measure of this capability.
     * 
     * Cardinality 0..1
     * 
     * @param capabilityModels
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static List<CapabilityType> buildCapabilityTypes(List<CapabilityModel> capabilityModels) throws IllegalAccessException{
    	List<CapabilityType> capabilityTypes = null;
    	
    	if (capabilityModels != null && capabilityModels.size() > 0){
    		capabilityTypes = new ArrayList<CapabilityType>();
    		CapabilityType capabilityType = null;
    		for (CapabilityModel capabilityModel : capabilityModels){
    			capabilityType = new CapabilityType();
    			capabilityType.setValueAmount(UblCommonBasicFactory.buildValueAmountType(capabilityModel.getValueAmountModel()));
            	
    			if (!GenericFactory.isAllFieldsNull(capabilityType)) {
    				capabilityTypes.add(capabilityType);
    			}
    		}
    		
    		if (capabilityTypes.isEmpty()) {
    			capabilityTypes = null;
    		}
    	}
        return capabilityTypes;
    }

    /**
     * The distinctive features or characteristics qualifying an economic operator to be a party in a tendering process 
     * (e.g., number of employees, number of operating units, type of business, technical and financial capabilities, completed projects).
     * 
     * Cardinality 0..n
     * 
     * @param completedTaskModels
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static List<CompletedTaskType> buildCompletedTaskTypes(List<CompletedTaskModel> completedTaskModels) throws IllegalAccessException{
    	List<CompletedTaskType> completedTaskTypes = null;
    	
    	if (completedTaskModels != null && completedTaskModels.size() > 0){
    		completedTaskTypes = new ArrayList<CompletedTaskType>();
    		CompletedTaskType completedTaskType = null;
    		for (CompletedTaskModel completedTaskModel : completedTaskModels){
    			completedTaskType = new CompletedTaskType();
            	List<DescriptionType> descriptionTypes = UblCommonBasicFactory.buildDescriptionTypes(completedTaskModel.getDescriptionModels(), false);
            	if (descriptionTypes != null && descriptionTypes.size() > 0){
            		completedTaskType.getDescription().addAll(descriptionTypes);
            	}
            	
            	if (!GenericFactory.isAllFieldsNull(completedTaskType)) {
            		completedTaskTypes.add(completedTaskType);
            	}
    		}
    		
    		if (completedTaskTypes.isEmpty()) {
    			completedTaskTypes = null;
    		}
    	}
        return completedTaskTypes;
    }  

    /**
     * The function of the economic operator when bidding from a consortium (Sole contractor / Lead entity, member of a group, etc.).
     * 
     * Cardinality 1
     * 
     * @param economicOperatorRoleModel
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static EconomicOperatorRoleType buildEconomicOperatorRoleType(EconomicOperatorRoleModel economicOperatorRoleModel) throws IllegalAccessException{
    	EconomicOperatorRoleType economicOperatorRoleType = null;

    	if (economicOperatorRoleModel != null && economicOperatorRoleModel.getRoleCodeModel() != null){
    		economicOperatorRoleType = new EconomicOperatorRoleType();
    		economicOperatorRoleType.setRoleCode(UblCommonBasicFactory.buildRoleCodeType(economicOperatorRoleModel.getRoleCodeModel()));
        	List<RoleDescriptionType> roleDescriptionTypes = UblCommonBasicFactory.buildRoleDescriptionTypes(economicOperatorRoleModel.getRoleDescriptions());
        	if (roleDescriptionTypes != null && roleDescriptionTypes.size() > 0){
        		economicOperatorRoleType.getRoleDescription().addAll(roleDescriptionTypes);
        	}
        	
        	if (GenericFactory.isAllFieldsNull(economicOperatorRoleType)) {
        		economicOperatorRoleType = null;
        	}
    	}
    	return economicOperatorRoleType;
    }  

    /**
     * Official or legal mandate issued by an authority (e.g. an attorney or a notary) 
     * to represent the economic operator as a representative of the economic operator in public procurement procedures.
     * 
     * Cardinality 0..n
     * 
     * @param powerOfAttorneyModels
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static List<PowerOfAttorneyType> buildPowerOfAttorneyTypes(List<PowerOfAttorneyModel> powerOfAttorneyModels) throws IllegalAccessException{
    	List<PowerOfAttorneyType> powerOfAttorneyTypes = null;
    	
    	if (powerOfAttorneyModels != null && powerOfAttorneyModels.size() > 0){
    		powerOfAttorneyTypes = new ArrayList<PowerOfAttorneyType>();
    		PowerOfAttorneyType powerOfAttorneyType = null;
    		for (PowerOfAttorneyModel powerOfAttorneyModel : powerOfAttorneyModels){
    			powerOfAttorneyType = new PowerOfAttorneyType();
    			powerOfAttorneyType.setAgentParty(UblCommonAggregateFactory.buildPartyType(powerOfAttorneyModel.getAgentPartyModel()));
            	List<DescriptionType> descriptionTypes = UblCommonBasicFactory.buildDescriptionTypes(powerOfAttorneyModel.getDescriptionModels(), false);
            	if (descriptionTypes != null && descriptionTypes.size() > 0){
            		powerOfAttorneyType.getDescription().addAll(descriptionTypes);
            	}
            	
            	if (!GenericFactory.isAllFieldsNull(powerOfAttorneyType)) {
            		powerOfAttorneyTypes.add(powerOfAttorneyType);
            	}
    		}
    		
    		if (powerOfAttorneyTypes.isEmpty()) {
    			powerOfAttorneyTypes = null;
    		}
    	}
        return powerOfAttorneyTypes;
    }  

    /**
     * A representative of the economic operator.
     * 
     * Cardinality 0..n
     * 
     * @param qualifyingPartyModels
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static List<PersonType> buildPersonTypes(List<PersonModel> personModels) throws IllegalAccessException{
    	List<PersonType> personTypes = null;
    	
    	if (personModels != null && personModels.size() > 0){
    		personTypes = new ArrayList<PersonType>();
    		PersonType personType = null;
    		for (PersonModel personModel : personModels){
    			personType = new PersonType();
    			personType.setFirstName(UblCommonBasicFactory.buildFirstNameType(personModel.getFirstName()));
    			personType.setFamilyName(UblCommonBasicFactory.buildFamilyNameType(personModel.getFamilyName()));
    			personType.setBirthDate(UblCommonBasicFactory.buildBirthDateType(personModel.getBirthDate()));
    			personType.setBirthplaceName(UblCommonBasicFactory.buildBirthplaceNameType(personModel.getBirthplaceName()));
    			personType.setResidenceAddress(UblCommonAggregateFactory.buildAddressType(personModel.getResidenceAddressModel()));
    			personType.setContact(UblCommonAggregateFactory.buildContactType(personModel.getContactModel()));
    			
    			if (!GenericFactory.isAllFieldsNull(personType)) {
    				personTypes.add(personType);
    			}
    		}
    		
    		if (personTypes.isEmpty()) {
    			personTypes = null;
    		}
    	}
        return personTypes;
    }  

    /**
     * A reference to the evidence supporting this criterion property response.
     * 
     * Cardinality 0..1
     * 
     * @param evidenceSuppliedModels
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static List<EvidenceSuppliedType> buildEvidenceSuppliedTypes(List<EvidenceSuppliedModel> evidenceSuppliedModels) throws IllegalAccessException{
    	List<EvidenceSuppliedType> evidenceSuppliedTypes = null;
    	
    	if (evidenceSuppliedModels != null && evidenceSuppliedModels.size() > 0){
    		evidenceSuppliedTypes = new ArrayList<EvidenceSuppliedType>();
    		EvidenceSuppliedType evidenceSuppliedType = null;
    		for (EvidenceSuppliedModel evidenceSuppliedModel : evidenceSuppliedModels){
    			evidenceSuppliedType = new EvidenceSuppliedType();
    			evidenceSuppliedType.setID(UblCommonBasicFactory.buildIdType(evidenceSuppliedModel.getIdModel()));
    			if (isResponse){
    				// Separare le Evidence dalla singola EvidenceSupplied, inserendoli in una lista esterna 
    				EvidenceModel evidenceModel = separateEvidenceModel(evidenceSuppliedModel);
    				if (evidenceModel != null && evidenceModel.checkObject()){
    					evidenceModels.add(evidenceModel);
    				} else {
    					evidenceSuppliedType = null;
    				}
    	    	}
    			
    			if (!GenericFactory.isAllFieldsNull(evidenceSuppliedType)) {
    				evidenceSuppliedTypes.add(evidenceSuppliedType);
    			}
    		}
    		
    		if (evidenceSuppliedTypes.isEmpty()) {
    			evidenceSuppliedTypes = null;
    		}
    	}
    	return evidenceSuppliedTypes;
    }

    /**
     * A class to describe the criterion property response value.
     * 
     * Cardinality 0..n
     * 
     * @param responseValueModels
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static List<ResponseValueType> buildResponseValueTypes(List<ResponseValueModel> responseValueModels) throws IllegalAccessException{
    	List<ResponseValueType> responseValueTypes = null;
    	
    	if (responseValueModels != null && responseValueModels.size() > 0){
    		responseValueTypes = new ArrayList<ResponseValueType>();
    		ResponseValueType responseValueType = null;
    		for (ResponseValueModel responseValueModel : responseValueModels){
    			responseValueType = new ResponseValueType();
    			
    			/*if (responseValueModel.getResponseIdModels() != null && responseValueModel.getResponseIdModels().size() > 0){
    				// Separare le ResponseIDModel dalla singola ResponseValue, convertendoli in singole ResponseValue 
    				for (ResponseIDModel responseIdModel : responseValueModel.getResponseIdModels()){
    					ResponseValueModel responseValueModelApp = separateResponseValueModel(responseIdModel);
    					responseValueType = new ResponseValueType();
    					responseValueType.setID(UblCommonBasicFactory.buildIdType(responseValueModelApp.getIdModel()));
    					responseValueType.setResponseID(UblCommonBasicFactory.buildResponseIdType(responseValueModelApp.getResponseIdModel()));

            	    	if (!GenericFactory.isAllFieldsNull(responseValueType)) responseValueTypes.add(responseValueType);
    				}
    			} else {*/
        			responseValueType.setID(UblCommonBasicFactory.buildIdType(responseValueModel.getIdModel()));
        			List<DescriptionType> descriptionTypes = UblCommonBasicFactory.buildDescriptionTypes(responseValueModel.getDescriptionModels(), false);
        	    	if (descriptionTypes != null && descriptionTypes.size() > 0){
        	    		responseValueType.getDescription().addAll(descriptionTypes);
        	    	}
        	    	responseValueType.setResponseAmount(UblCommonBasicFactory.buildResponseAmountType(responseValueModel.getResponseAmountModel()));
        	    	responseValueType.setResponseCode(UblCommonBasicFactory.buildResponseCodeType(responseValueModel.getResponseCodeModel()));
        	    	responseValueType.setResponseDate(UblCommonBasicFactory.buildResponseDateType(responseValueModel.getResponseDate()));    	    	
        	    	responseValueType.setResponseTime(UblCommonBasicFactory.buildResponseTimeType(responseValueModel.getResponseTime()));
        	    	responseValueType.setResponseID(UblCommonBasicFactory.buildResponseIDType(responseValueModel.getResponseIdModel()));
        	    	responseValueType.setResponseIndicator(UblCommonBasicFactory.buildResponseIndicatorType(responseValueModel.getResponseIndicator()));
        	    	responseValueType.setResponseMeasure(UblCommonBasicFactory.buildResponseMeasureType(responseValueModel.getResponseMeasureModel()));
        	    	responseValueType.setResponseNumeric(UblCommonBasicFactory.buildResponseNumericType(responseValueModel.getResponseNumeric()));
        	    	responseValueType.setResponseQuantity(UblCommonBasicFactory.buildResponseQuantityType(responseValueModel.getResponseQuantityModel()));
        	    	responseValueType.setResponseURI(UblCommonBasicFactory.buildResponseUriType(responseValueModel.getResponseUriModel()));
        			
        	    	if (!GenericFactory.isAllFieldsNull(responseValueType)) {
        	    		
        	    		/*if (responseValueType.getID() != null){
        	    			responseValueModel.getIdModel()
                			responseValueType.setID(UblCommonBasicFactory.buildIdType(responseValueModel.getIdModel()));
        	    		}*/
        	    		
        	    		responseValueTypes.add(responseValueType);
        	    	}
    			//}
    		}
    		
    		if (responseValueTypes.isEmpty()) {
    			responseValueTypes = null;
    		}
    	}
    	return responseValueTypes;
    }
}
