package com.pccube.espd.factory;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.pccube.espd.config.EspdConfiguration;
import com.pccube.espd.config.VariableConfiguration;
import com.pccube.espd.enums.CodeList;
import com.pccube.espd.enums.ResponseData;
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
import com.pccube.espd.model.DescriptionModel;
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
import com.pccube.espd.model.QualificationApplicationRequestModel;
import com.pccube.espd.model.QualificationApplicationResponseModel;
import com.pccube.espd.model.QualifyingPartyModel;
import com.pccube.espd.model.ResponseValueModel;
import com.pccube.espd.model.ServiceProviderPartyModel;
import com.pccube.espd.model.UriModel;

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
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionPropertyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionResponseType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueDataTypeCodeType;

/**
 * Simple factory for creating aggregate BEAN elements that are shared between a 
 * {@link QualificationApplicationRequestModel} and {@link QualificationApplicationResponseModel}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class BeanCommonAggregateFactory extends GenericCommonFactory {
	
    public BeanCommonAggregateFactory(EspdConfiguration espdConfiguration, VariableConfiguration variableConfiguration) {
		super(espdConfiguration, variableConfiguration);
	}

	public static List<ContractingPartyModel> buildContractingPartyModels(List<ContractingPartyType> contractingPartyTypes) throws ParseException, IllegalAccessException {
    	List<ContractingPartyModel> contractingPartyModels = null;
    	
    	if (contractingPartyTypes != null && contractingPartyTypes.size() > 0) {
    		contractingPartyModels = new ArrayList<ContractingPartyModel>();
    		ContractingPartyModel contractingPartyModel = null;
    		for (ContractingPartyType contractingPartyType : contractingPartyTypes){
    			contractingPartyModel = new ContractingPartyModel();
    			contractingPartyModel.setBuyerProfileUriModel(BeanCommonBasicFactory.buildBuyerProfileURIModel(contractingPartyType.getBuyerProfileURI()));
    			contractingPartyModel.setPartyModel(BeanCommonAggregateFactory.buildPartyModel(contractingPartyType.getParty()));
    			
    			if (!contractingPartyModel.isAllFieldsNull()) { 
    				contractingPartyModels.add(contractingPartyModel); 
    			}
    		}
    		
    		if (contractingPartyModels.isEmpty()) { 
    			contractingPartyModels = null; 
    		}
    	}
        return contractingPartyModels;
    }

    public static PartyModel buildPartyModel(PartyType partyType) throws ParseException, IllegalAccessException {
    	PartyModel partyModel = null;
    	
    	if (partyType != null){
    		partyModel = new PartyModel();
        	List<PartyIdentificationModel> partyIdentificationModels = BeanCommonAggregateFactory.buildPartyIdentificationModels(partyType.getPartyIdentification());
        	if (partyIdentificationModels != null && partyIdentificationModels.size() > 0){
        		partyModel.getPartyIdentificationModels().addAll(partyIdentificationModels);
        	}
        	partyModel.setWebsiteUriModel(BeanCommonBasicFactory.buildWebsiteURIModel(partyType.getWebsiteURI()));
        	partyModel.setEndPointIDModel(BeanCommonBasicFactory.buildEndpointIDModel(partyType.getEndpointID()));
            List<PartyNameModel> partyNameModels = BeanCommonAggregateFactory.buildPartyNameModels(partyType.getPartyName());
        	if (partyNameModels != null && partyNameModels.size() > 0){
        		partyModel.getPartyNameModels().addAll(partyNameModels);
        	}
        	partyModel.setAddressModel(BeanCommonAggregateFactory.buildAddressModel(partyType.getPostalAddress()));
        	partyModel.setContactModel(BeanCommonAggregateFactory.buildContactModel(partyType.getContact()));
        	List<ServiceProviderPartyModel> serviceProviderPartyModels = BeanCommonAggregateFactory.buildServiceProviderPartyModels(partyType.getServiceProviderParty());
        	if (serviceProviderPartyModels != null && serviceProviderPartyModels.size() > 0){
        		partyModel.getServiceProviderPartyModels().addAll(serviceProviderPartyModels);
        	}
        	partyModel.setIndustryClassificationCodeModel(BeanCommonBasicFactory.buildIndustryClassificationCodeModel(partyType.getIndustryClassificationCode()));
        	List<PowerOfAttorneyModel> powerOfAttorneyModels = BeanCommonAggregateFactory.buildPowerOfAttorneyModels(partyType.getPowerOfAttorney());
        	if (powerOfAttorneyModels != null && powerOfAttorneyModels.size() > 0){
        		partyModel.getPowerOfAttorneyModels().addAll(powerOfAttorneyModels);
        	}
        	List<PersonModel> personModels = BeanCommonAggregateFactory.buildPersonModels(partyType.getPerson());
        	if (personModels != null && personModels.size() > 0){
        		partyModel.getPersonModels().addAll(personModels);
        	}
        	
        	if (partyModel.isAllFieldsNull()) { 
				partyModel = null;
        	}
    	}
    	return partyModel;
    }
    
    public static List<PartyIdentificationModel> buildPartyIdentificationModels(List<PartyIdentificationType> partyIdentificationTypes) throws IllegalAccessException {
		List<PartyIdentificationModel> partyIdentificationModels = null;
		    	
    	if (partyIdentificationTypes != null && partyIdentificationTypes.size() > 0){
    		partyIdentificationModels = new ArrayList<PartyIdentificationModel>();
    		PartyIdentificationModel partyIdentificationModel = null;
    		for (PartyIdentificationType partyIdentificationType : partyIdentificationTypes){
    			partyIdentificationModel = new PartyIdentificationModel();
    			partyIdentificationModel.setIdModel(BeanCommonBasicFactory.buildIdModel(partyIdentificationType.getID()));
    			
    			if (!partyIdentificationModel.isAllFieldsNull()) { 
    				partyIdentificationModels.add(partyIdentificationModel);
    			}
    		}
    		
    		if (partyIdentificationModels.isEmpty()) { 
				partyIdentificationModels = null;
    		}
    	}
        return partyIdentificationModels;
    }

    public static List<PartyNameModel> buildPartyNameModels(List<PartyNameType> partyNameTypes) throws IllegalAccessException {
		List<PartyNameModel> partyNameModels = null;
		    	
    	if (partyNameTypes != null && partyNameTypes.size() > 0){
    		partyNameModels = new ArrayList<PartyNameModel>();
    		PartyNameModel partyNameModel = null;
    		for (PartyNameType partyNameType : partyNameTypes){
    			partyNameModel = new PartyNameModel();
    			partyNameModel.setName(BeanCommonBasicFactory.buildName(partyNameType.getName()));
    			
    			if (!partyNameModel.isAllFieldsNull()) { 
    				partyNameModels.add(partyNameModel);
    			}
    		}
    		
    		if (partyNameModels.isEmpty()) { 
				partyNameModels = null;
    		}
    	}
        return partyNameModels;
    }
    
    public static AddressModel buildAddressModel(AddressType addressType) throws IllegalAccessException {
    	AddressModel addressModel = null;
    	
    	if (addressType != null){
    		addressModel = new AddressModel();
    		addressModel.setStreetName(BeanCommonBasicFactory.buildStreetName(addressType.getStreetName()));
    		addressModel.setCityName(BeanCommonBasicFactory.buildCityName(addressType.getCityName()));
    		addressModel.setPostalZone(BeanCommonBasicFactory.buildPostalZone(addressType.getPostalZone()));
    		addressModel.setCountryModel(BeanCommonAggregateFactory.buildCountryModel(addressType.getCountry()));
    		List<AddressLineModel> addressLineModels = BeanCommonAggregateFactory.buildAddressLineModels(addressType.getAddressLine());
        	if (addressLineModels != null && addressLineModels.size() > 0){
        		addressModel.getAddressLineModels().addAll(addressLineModels);
        	}
        	
        	if (addressModel.isAllFieldsNull()) { 
				addressModel = null;
        	}
    	}
    	return addressModel;
    }

    public static CountryModel buildCountryModel(CountryType countryType) throws IllegalAccessException {
    	CountryModel countryModel = null;
    	
    	if (countryType != null){
    		countryModel = new CountryModel();
    		countryModel.setName(BeanCommonBasicFactory.buildName(countryType.getName()));
    		countryModel.setIdentificationCodeModel(BeanCommonBasicFactory.buildIdentificationCodeModel(countryType.getIdentificationCode()));
    		
        	if (countryModel.isAllFieldsNull()) { 
				countryModel = null;
        	}
    	}
    	return countryModel;
    }
    
    public static ContactModel buildContactModel(ContactType contactType) throws IllegalAccessException {
    	ContactModel contactModel = null;
    	
    	if (contactType != null){
    		contactModel = new ContactModel();
    		contactModel.setName(BeanCommonBasicFactory.buildName(contactType.getName()));
    		contactModel.setTelephone(BeanCommonBasicFactory.buildTelephone(contactType.getTelephone()));
    		contactModel.setTelefax(BeanCommonBasicFactory.buildTelefax(contactType.getTelefax()));
    		contactModel.setEmail(BeanCommonBasicFactory.buildElectronicMail(contactType.getElectronicMail()));
    		
        	if (contactModel.isAllFieldsNull()) { 
				contactModel = null;
        	}
    	}
    	return contactModel;
    }

    public static List<ServiceProviderPartyModel> buildServiceProviderPartyModels(List<ServiceProviderPartyType> serviceProviderPartyTypes) throws ParseException, IllegalAccessException {
    	List<ServiceProviderPartyModel> serviceProviderPartyModels = null;
    	
    	if (serviceProviderPartyTypes != null && serviceProviderPartyTypes.size() > 0){
    		serviceProviderPartyModels = new ArrayList<ServiceProviderPartyModel>();
    		ServiceProviderPartyModel serviceProviderPartyModel = null;
    		for (ServiceProviderPartyType serviceProviderPartyType : serviceProviderPartyTypes){
    			serviceProviderPartyModel = new ServiceProviderPartyModel();
    			serviceProviderPartyModel.setPartyModel(BeanCommonAggregateFactory.buildPartyModel(serviceProviderPartyType.getParty()));
    			
    			if (!serviceProviderPartyModel.isAllFieldsNull()) { 
    				serviceProviderPartyModels.add(serviceProviderPartyModel);
    			}
    		}
    		
    		if (serviceProviderPartyModels.isEmpty()) { 
				serviceProviderPartyModels = null;
    		}
    	}
        return serviceProviderPartyModels;
    }
    
    public static ProcurementProjectModel buildProcurementProjectModel(ProcurementProjectType procurementProjectType) throws IllegalAccessException {
    	ProcurementProjectModel procurementProjectModel = null;
    	
    	if (procurementProjectType != null){
    		procurementProjectModel = new ProcurementProjectModel();
    		procurementProjectModel.setIdModel(BeanCommonBasicFactory.buildIdModel(procurementProjectType.getID()));
    		List<String> names = BeanCommonBasicFactory.buildNames(procurementProjectType.getName());
        	if (names != null && names.size() > 0){
        		procurementProjectModel.getNames().addAll(names);
        	}
        	List<DescriptionModel> descriptionModels = BeanCommonBasicFactory.buildDescriptionModels(procurementProjectType.getDescription());
        	if (descriptionModels != null && descriptionModels.size() > 0){
        		procurementProjectModel.getDescriptionModels().addAll(descriptionModels);
        	}
        	procurementProjectModel.setProcurementTypeCodeModel(BeanCommonBasicFactory.buildProcurementTypeCodeModel(procurementProjectType.getProcurementTypeCode()));
        	List<CommodityClassificationModel> commodityClassificationModels = BeanCommonAggregateFactory.buildCommodityClassificationModels(procurementProjectType.getMainCommodityClassification());
        	if (commodityClassificationModels != null && commodityClassificationModels.size() > 0){
        		procurementProjectModel.getMainCommodityClassificationModels().addAll(commodityClassificationModels);
        	}
        	
        	if (procurementProjectModel.isAllFieldsNull()) { 
				procurementProjectModel = null;
        	}
    	}
    	return procurementProjectModel;
    }
    
    public static List<CommodityClassificationModel> buildCommodityClassificationModels(List<CommodityClassificationType> commodityClassificationTypes) throws IllegalAccessException {
    	List<CommodityClassificationModel> commodityClassificationModels = null;
    	
    	if (commodityClassificationTypes != null && commodityClassificationTypes.size() > 0){
    		commodityClassificationModels = new ArrayList<CommodityClassificationModel>();
    		CommodityClassificationModel commodityClassificationModel = null;
    		for (CommodityClassificationType commodityClassificationType : commodityClassificationTypes){
    			commodityClassificationModel = new CommodityClassificationModel();
    			commodityClassificationModel.setItemClassificationCodeModel(BeanCommonBasicFactory.buildItemClassificationCodeModel(commodityClassificationType.getItemClassificationCode()));
    			
    			if (!commodityClassificationModel.isAllFieldsNull()) { 
    				commodityClassificationModels.add(commodityClassificationModel);
    			}
    		}
    		
    		if (commodityClassificationModels.isEmpty()) { 
				commodityClassificationModels = null;
    		}
    	}
        return commodityClassificationModels;
    }
    
    public static List<ProcurementProjectLotModel> buildProcurementProjectLotModels(List<ProcurementProjectLotType> procurementProjectLotTypes) throws IllegalAccessException {
    	List<ProcurementProjectLotModel> procurementProjectLotModels = null;
    	
    	if (procurementProjectLotTypes != null && procurementProjectLotTypes.size() > 0){
    		procurementProjectLotModels = new ArrayList<ProcurementProjectLotModel>();
    		ProcurementProjectLotModel procurementProjectLotModel = null;
    		for (ProcurementProjectLotType procurementProjectLotType : procurementProjectLotTypes){
    			procurementProjectLotModel = new ProcurementProjectLotModel();
    			procurementProjectLotModel.setIdModel(BeanCommonBasicFactory.buildIdModel(procurementProjectLotType.getID()));
    			
    			if (!procurementProjectLotModel.isAllFieldsNull()) { 
    				procurementProjectLotModels.add(procurementProjectLotModel);
    			}
    		}
    		
    		if (procurementProjectLotModels.isEmpty()) { 
				procurementProjectLotModels = null;
    		}
    	}
    	
    	return procurementProjectLotModels;
    }
    
    public static List<DocumentReferenceModel> buildDocumentReferenceModels(List<DocumentReferenceType> documentReferenceTypes) throws ParseException, IllegalAccessException {
    	List<DocumentReferenceModel> documentReferenceModels = null;
    	
    	if (documentReferenceTypes != null && documentReferenceTypes.size() > 0){
    		documentReferenceModels = new ArrayList<DocumentReferenceModel>();
    		DocumentReferenceModel documentReferenceModel = null;
    		for (DocumentReferenceType documentReferenceType : documentReferenceTypes){
    			documentReferenceModel = new DocumentReferenceModel();
    			documentReferenceModel.setIdModel(BeanCommonBasicFactory.buildIdModel(documentReferenceType.getID()));
    			documentReferenceModel.setUuidModel(BeanCommonBasicFactory.buildUuidModel(documentReferenceType.getUUID()));
    			documentReferenceModel.setDocumentTypeCodeModel(BeanCommonBasicFactory.buildDocumentTypeCodeModel(documentReferenceType.getDocumentTypeCode()));
    			documentReferenceModel.setDocumentTypeModel(BeanCommonBasicFactory.buildDocumentTypeModel(documentReferenceType.getDocumentType()));
    			documentReferenceModel.setWhenDate(BeanCommonBasicFactory.buildDate(documentReferenceType.getIssueDate()));
    			documentReferenceModel.setWhenTime(BeanCommonBasicFactory.buildTime(documentReferenceType.getIssueTime()));
    			documentReferenceModel.setAttachmentModel(BeanCommonAggregateFactory.buildAttachmentModel(documentReferenceType.getAttachment()));
    			documentReferenceModel.setIssuerPartyModel(BeanCommonAggregateFactory.buildPartyModel(documentReferenceType.getIssuerParty()));
    			
    			if (!documentReferenceModel.isAllFieldsNull()) { 
    				documentReferenceModels.add(documentReferenceModel);
    			}
    		}
    		
    		if (documentReferenceModels.isEmpty()) { 
				documentReferenceModels = null;
    		}
    	}
    	
        return documentReferenceModels;
    }

    public static AttachmentModel buildAttachmentModel(AttachmentType attachmentType) throws IllegalAccessException {
    	AttachmentModel attachmentModel = null;
    	
    	if (attachmentType != null){
    		attachmentModel = new AttachmentModel();
    		attachmentModel.setExternalReferenceModel(BeanCommonAggregateFactory.buildExternalReferenceModel(attachmentType.getExternalReference()));
    		
    		if (attachmentModel.isAllFieldsNull()) { 
				attachmentModel =  null;
    		}
    	}
        return attachmentModel;
    }
    
    public static ExternalReferenceModel buildExternalReferenceModel(ExternalReferenceType externalReferenceType) throws IllegalAccessException {
    	ExternalReferenceModel externalReferenceModel = null;
    	
    	if (externalReferenceType != null){
    		externalReferenceModel = new ExternalReferenceModel();
    		externalReferenceModel.setUriModel(BeanCommonBasicFactory.buildUriModel(externalReferenceType.getURI()));
    		externalReferenceModel.setFileName((externalReferenceType.getFileName() != null) ? externalReferenceType.getFileName().getValue() : StringUtils.EMPTY);
    		List<DescriptionModel> descriptionModels = BeanCommonBasicFactory.buildDescriptionModels(externalReferenceType.getDescription());
        	if (descriptionModels != null && descriptionModels.size() > 0){
        		externalReferenceModel.getDescriptionModels().addAll(descriptionModels);
        	}
        	
    		if (externalReferenceModel.isAllFieldsNull()) { 
				externalReferenceModel =  null;
    		}
    	}
        return externalReferenceModel;
    }
    
    public static List<LegislationModel> buildLegislationModels(List<LegislationType> legislationTypes) throws IllegalAccessException {
    	List<LegislationModel> legislationModels = null;
        
    	if (legislationTypes != null && legislationTypes.size() > 0){
    		legislationModels = new ArrayList<LegislationModel>();
    		LegislationModel legislationModel = null;
    		for (LegislationType legislationType : legislationTypes){
    			legislationModel = new LegislationModel();
    			legislationModel.setIdModel(BeanCommonBasicFactory.buildIdModel(legislationType.getID()));
    			List<String> titles = BeanCommonBasicFactory.buildTitles(legislationType.getTitle());
    	    	if (titles != null && titles.size() > 0){
    	    		legislationModel.getTitles().addAll(titles);
    	    	}
    	    	List<DescriptionModel> descriptionModels = BeanCommonBasicFactory.buildDescriptionModels(legislationType.getDescription());
    	    	if (descriptionModels != null && descriptionModels.size() > 0){
    	    		legislationModel.getDescriptionModels().addAll(descriptionModels);
    	    	}
    	    	List<String> jurisdictionLevels = BeanCommonBasicFactory.buildJurisdictionLevels(legislationType.getJurisdictionLevel());
    	    	if (jurisdictionLevels != null && jurisdictionLevels.size() > 0){
    	    		legislationModel.getJurisdictionLevels().addAll(jurisdictionLevels);
    	    	}
    	    	List<String> articles = BeanCommonBasicFactory.buildArticles(legislationType.getArticle());
    	    	if (articles != null && articles.size() > 0){
    	    		legislationModel.getArticles().addAll(articles);
    	    	}
    	    	List<UriModel> uriModels = BeanCommonBasicFactory.buildUriModels(legislationType.getURI());
    	    	if (uriModels != null && uriModels.size() > 0){
    	    		legislationModel.getUriModels().addAll(uriModels);
    	    	}
    	    	
    	    	if (!legislationModel.isAllFieldsNull()) { 
    				legislationModels.add(legislationModel);
    	    	}
    		}

    		if (legislationModels.isEmpty()) { 
				legislationModels = null;
    		}
    	}
    	
    	return legislationModels;
    }

    public static List<PeriodModel> buildPeriodModels(List<PeriodType> periodTypes) throws ParseException, IllegalAccessException{
    	List<PeriodModel> periodModels = null;
    	
    	if (periodTypes != null && periodTypes.size() > 0){
    		periodModels = new ArrayList<PeriodModel>();
    		PeriodModel periodModel = null;
    		for (PeriodType periodType : periodTypes){
    			periodModel = new PeriodModel();
    			periodModel.setStartDate(BeanCommonBasicFactory.buildStartDate(periodType.getStartDate()));
    			periodModel.setEndDate(BeanCommonBasicFactory.buildEndDate(periodType.getEndDate()));

    	    	if (!periodModel.isAllFieldsNull()) { 
    				periodModels.add(periodModel);
    	    	}
    		}

    		if (periodModels.isEmpty()) { 
				periodModels = null;
    		}
    	}
    	return periodModels;
    }

    public static List<EvidenceModel> buildEvidenceModels(List<EvidenceType> evidenceTypes) throws ParseException, IllegalAccessException {
    	List<EvidenceModel> evidenceModels = null;
    	
    	if (evidenceTypes != null && evidenceTypes.size() > 0){
    		evidenceModels = new ArrayList<EvidenceModel>();
    		for (EvidenceType evidenceType : evidenceTypes){
    			EvidenceModel evidenceModel = buildEvidenceModel(evidenceType);
    			
    			if (evidenceModel != null) { 
    				evidenceModels.add(evidenceModel);
    			}
    		}

    		if (evidenceModels.isEmpty()) { 
				evidenceModels = null;
    		}
    	}
    	return evidenceModels;
    }
    
    public static EvidenceModel buildEvidenceModel(EvidenceType evidenceType) throws ParseException, IllegalAccessException {
    	EvidenceModel evidenceModel = null;
    	
    	if (evidenceType != null){
    		evidenceModel = new EvidenceModel();
    		evidenceModel.setIdModel(BeanCommonBasicFactory.buildIdModel(evidenceType.getID()));
    		evidenceModel.setName(BeanCommonBasicFactory.buildName(evidenceType.getName()));
    		List<DescriptionModel> descriptionModels = BeanCommonBasicFactory.buildDescriptionModels(evidenceType.getDescription());
        	if (descriptionModels != null && descriptionModels.size() > 0){
        		evidenceModel.getDescriptionModels().addAll(descriptionModels);
        	}
        	List<String> candidates = BeanCommonBasicFactory.buildCandidateStatements(evidenceType.getCandidateStatement());
        	if (candidates != null && candidates.size() > 0){
        		evidenceModel.getCandidateStatements().addAll(candidates);
        	}
        	evidenceModel.setConfidentialityLevelCodeModel(BeanCommonBasicFactory.buildConfidentialityLevelCodeModel(evidenceType.getConfidentialityLevelCode()));
        	List<DocumentReferenceModel> documentReferenceModels = BeanCommonAggregateFactory.buildDocumentReferenceModels(evidenceType.getDocumentReference());
        	if (documentReferenceModels != null && documentReferenceModels.size() > 0){
        		evidenceModel.getDocumentReferenceModels().addAll(documentReferenceModels);
        	}
        	
        	if (evidenceModel.isAllFieldsNull()) { 
				evidenceModel = null; 
        	}
    	}
    	
    	return evidenceModel;
    }

    public static List<EconomicOperatorPartyModel> buildEconomicOperatorPartyModels(List<EconomicOperatorPartyType> economicOperatorPartyTypes) throws ParseException, IllegalAccessException {
    	List<EconomicOperatorPartyModel> economicOperatorPartyModels = null;
    	
    	if (economicOperatorPartyTypes != null && economicOperatorPartyTypes.size() > 0){
    		economicOperatorPartyModels = new ArrayList<EconomicOperatorPartyModel>();
    		EconomicOperatorPartyModel economicOperatorPartyModel = null;
    		for (EconomicOperatorPartyType economicOperatorPartyType : economicOperatorPartyTypes){
    			economicOperatorPartyModel = new EconomicOperatorPartyModel();
    			List<QualifyingPartyModel> qualifyingPartyModels = BeanCommonAggregateFactory.buildQualifyingPartyModels(economicOperatorPartyType.getQualifyingParty());
    	    	if (qualifyingPartyModels != null && qualifyingPartyModels.size() > 0){
    	    		economicOperatorPartyModel.getQualifyingPartyModels().addAll(qualifyingPartyModels);
    	    	}
    	    	economicOperatorPartyModel.setEconomicOperatorRoleModel(BeanCommonAggregateFactory.buildEconomicOperatorRoleModel(economicOperatorPartyType.getEconomicOperatorRole()));
    	    	economicOperatorPartyModel.setPartyModel(BeanCommonAggregateFactory.buildPartyModel(economicOperatorPartyType.getParty()));
    	    	
    	    	if (!economicOperatorPartyModel.isAllFieldsNull()) { 
    				economicOperatorPartyModels.add(economicOperatorPartyModel);
    	    	}
    		}

    		if (economicOperatorPartyModels.isEmpty()) { 
				economicOperatorPartyModels = null;
    		}
    	}
    	return economicOperatorPartyModels;
    }   

    public static List<QualifyingPartyModel> buildQualifyingPartyModels(List<QualifyingPartyType> qualifyingPartyTypes) throws ParseException, IllegalAccessException {
    	List<QualifyingPartyModel> qualifyingPartyModels = null;
    	
    	if (qualifyingPartyTypes != null && qualifyingPartyTypes.size() > 0){
    		qualifyingPartyModels = new ArrayList<QualifyingPartyModel>();
    		QualifyingPartyModel qualifyingPartyModel = null;
    		for (QualifyingPartyType qualifyingPartyType : qualifyingPartyTypes){
    			qualifyingPartyModel = new QualifyingPartyModel();
    			qualifyingPartyModel.setEmployeeQuantityModel(BeanCommonBasicFactory.buildEmployeeQuantityModel(qualifyingPartyType.getEmployeeQuantity()));
    			qualifyingPartyModel.setBusinessClassificationSchemeModel(BeanCommonAggregateFactory.buildClassificationSchemeModel(qualifyingPartyType.getBusinessClassificationScheme()));
    	    	List<CapabilityModel> capabilityModels = BeanCommonAggregateFactory.buildCapabilityModels(qualifyingPartyType.getFinancialCapability());
    	    	if (capabilityModels != null && capabilityModels.size() > 0){
    	    		qualifyingPartyModel.getFinancialCapabilityModels().addAll(capabilityModels);
    	    	} 
    	    	List<CompletedTaskModel> completedTaskModels = BeanCommonAggregateFactory.buildCompletedTaskModels(qualifyingPartyType.getCompletedTask());
    	    	if (completedTaskModels != null && completedTaskModels.size() > 0){
    	    		qualifyingPartyModel.getCompletedTaskModels().addAll(completedTaskModels);
    	    	} 
    	    	qualifyingPartyModel.setPartyModel(BeanCommonAggregateFactory.buildPartyModel(qualifyingPartyType.getParty()));
    	    	
    	    	if (!qualifyingPartyModel.isAllFieldsNull()) { 
    				qualifyingPartyModels.add(qualifyingPartyModel);
    	    	}
    		}

    		if (qualifyingPartyModels.isEmpty()) { 
				qualifyingPartyModels = null;
    		}
    	}
    	return qualifyingPartyModels;
    }   

    public static ClassificationSchemeModel buildClassificationSchemeModel(ClassificationSchemeType classificationSchemeType) throws IllegalAccessException {
    	ClassificationSchemeModel classificationSchemeModel = null;

    	if (classificationSchemeType != null){
    		classificationSchemeModel = new ClassificationSchemeModel();
        	List<DescriptionModel> descriptionModels = BeanCommonBasicFactory.buildDescriptionModels(classificationSchemeType.getDescription());
        	if (descriptionModels != null && descriptionModels.size() > 0){
        		classificationSchemeModel.getDescriptionModels().addAll(descriptionModels);
        	}
        	
        	if (classificationSchemeModel.isAllFieldsNull()) { 
				classificationSchemeModel = null;
        	}
    	}
    	return classificationSchemeModel;
    }   

    public static List<CapabilityModel> buildCapabilityModels(List<CapabilityType> capabilityTypes) throws IllegalAccessException {
    	List<CapabilityModel> capabilityModels = null;
    	
    	if (capabilityTypes != null && capabilityTypes.size() > 0){
    		capabilityModels = new ArrayList<CapabilityModel>();
    		CapabilityModel capabilityModel = null;
    		for (CapabilityType capabilityType : capabilityTypes){
    			capabilityModel = new CapabilityModel();
    			capabilityModel.setValueAmountModel(BeanCommonBasicFactory.buildValueAmountModel(capabilityType.getValueAmount()));
    			
    			if (!capabilityModel.isAllFieldsNull()) { 
    				capabilityModels.add(capabilityModel);
    			}
    		}

    		if (capabilityModels.isEmpty()) { 
				capabilityModels = null;
    		}
    	}
        return capabilityModels;
    }

    public static List<CompletedTaskModel> buildCompletedTaskModels(List<CompletedTaskType> completedTaskTypes) throws IllegalAccessException {
    	List<CompletedTaskModel> completedTaskModels = null;
    	
    	if (completedTaskTypes != null && completedTaskTypes.size() > 0){
    		completedTaskModels = new ArrayList<CompletedTaskModel>();
    		CompletedTaskModel completedTaskModel = null;
    		for (CompletedTaskType completedTaskType : completedTaskTypes){
    			completedTaskModel = new CompletedTaskModel();
            	List<DescriptionModel> descriptionModels = BeanCommonBasicFactory.buildDescriptionModels(completedTaskType.getDescription());
            	if (descriptionModels != null && descriptionModels.size() > 0){
            		completedTaskModel.getDescriptionModels().addAll(descriptionModels);
            	}
            	
            	if (!completedTaskModel.isAllFieldsNull()) { 
    				completedTaskModels.add(completedTaskModel);
            	}
    		}

    		if (completedTaskModels.isEmpty()) { 
				completedTaskModels = null;
    		}
    	}
        return completedTaskModels;
    }  

    public static EconomicOperatorRoleModel buildEconomicOperatorRoleModel(EconomicOperatorRoleType economicOperatorRoleType) throws IllegalAccessException {
    	EconomicOperatorRoleModel economicOperatorRoleModel = null;

    	if (economicOperatorRoleType != null && economicOperatorRoleType.getRoleCode() != null){
    		economicOperatorRoleModel = new EconomicOperatorRoleModel();
    		economicOperatorRoleModel.setRoleCodeModel(BeanCommonBasicFactory.buildRoleCodeModel(economicOperatorRoleType.getRoleCode()));
        	List<String> roleDescriptions = BeanCommonBasicFactory.buildRoleDescriptions(economicOperatorRoleType.getRoleDescription());
        	if (roleDescriptions != null && roleDescriptions.size() > 0){
        		economicOperatorRoleModel.getRoleDescriptions().addAll(roleDescriptions);
        	}
        	
        	if (economicOperatorRoleModel.isAllFieldsNull()) { 
				economicOperatorRoleModel = null;
        	}
    	}
    	return economicOperatorRoleModel;
    }  

    public static List<PowerOfAttorneyModel> buildPowerOfAttorneyModels(List<PowerOfAttorneyType> powerOfAttorneyTypes) throws ParseException, IllegalAccessException {
    	List<PowerOfAttorneyModel> powerOfAttorneyModels = null;
    	
    	if (powerOfAttorneyTypes != null && powerOfAttorneyTypes.size() > 0){
    		powerOfAttorneyModels = new ArrayList<PowerOfAttorneyModel>();
    		PowerOfAttorneyModel powerOfAttorneyModel = null;
    		for (PowerOfAttorneyType powerOfAttorneyType : powerOfAttorneyTypes){
    			powerOfAttorneyModel = new PowerOfAttorneyModel();
    			powerOfAttorneyModel.setAgentPartyModel(BeanCommonAggregateFactory.buildPartyModel(powerOfAttorneyType.getAgentParty()));
            	List<DescriptionModel> descriptionModels = BeanCommonBasicFactory.buildDescriptionModels(powerOfAttorneyType.getDescription());
            	if (descriptionModels != null && descriptionModels.size() > 0){
            		powerOfAttorneyModel.getDescriptionModels().addAll(descriptionModels);
            	}
            	
            	if (!powerOfAttorneyModel.isAllFieldsNull()) { 
    				powerOfAttorneyModels.add(powerOfAttorneyModel);
            	}
    		}

    		if (powerOfAttorneyModels.isEmpty()) { 
				powerOfAttorneyModels = null;
    		}
    	}
        return powerOfAttorneyModels;
    } 

    public static List<PersonModel> buildPersonModels(List<PersonType> personTypes) throws ParseException, IllegalAccessException {
    	List<PersonModel> personModels = null;
    	
    	if (personTypes != null && personTypes.size() > 0){
    		personModels = new ArrayList<PersonModel>();
    		PersonModel personModel = null;
    		for (PersonType personType : personTypes){
    			personModel = new PersonModel();
    			personModel.setFirstName(BeanCommonBasicFactory.buildFirstName(personType.getFirstName()));
    			personModel.setFamilyName(BeanCommonBasicFactory.buildFamilyName(personType.getFamilyName()));
    			personModel.setBirthDate(BeanCommonBasicFactory.buildBirthDate(personType.getBirthDate()));
    			personModel.setBirthplaceName(BeanCommonBasicFactory.buildBirthplaceName(personType.getBirthplaceName()));
    			personModel.setResidenceAddressModel(BeanCommonAggregateFactory.buildAddressModel(personType.getResidenceAddress()));
    			personModel.setContactModel(BeanCommonAggregateFactory.buildContactModel(personType.getContact()));
    			
    			if (!personModel.isAllFieldsNull()) { 
    				personModels.add(personModel);
    			}
    		}

    		if (personModels.isEmpty()) { 
				personModels = null;
    		}
    	}
        return personModels;
    } 
    
    public static List<AddressLineModel> buildAddressLineModels(List<AddressLineType> addressLineTypes) throws IllegalAccessException {
    	List<AddressLineModel> addressLineModels = null;
    	
    	if (addressLineTypes != null && addressLineTypes.size() > 0){
    		addressLineModels = new ArrayList<AddressLineModel>();
    		AddressLineModel addressLineModel = null;
    		for (AddressLineType addressLineType : addressLineTypes){
    			addressLineModel = new AddressLineModel();
    			addressLineModel.setLine(BeanCommonBasicFactory.buildLine(addressLineType.getLine()));
    			
    			if (!addressLineModel.isAllFieldsNull()) { 
    				addressLineModels.add(addressLineModel);
    			}
    		}

    		if (addressLineModels.isEmpty()) { 
				addressLineModels = null;
    		}
    	}
        return addressLineModels;
    }

    public static List<EvidenceSuppliedModel> buildEvidenceSuppliedModels(List<EvidenceSuppliedType> evidenceSuppliedTypes, TenderingCriterionResponseType tenderingCriterionResponseType) throws ParseException, IllegalAccessException {
    	List<EvidenceSuppliedModel> evidenceSuppliedModels = null;
    	
    	if (evidenceSuppliedTypes != null && evidenceSuppliedTypes.size() > 0){
    		evidenceSuppliedModels = new ArrayList<EvidenceSuppliedModel>();
    		EvidenceSuppliedModel evidenceSuppliedModel = null;
    		for (EvidenceSuppliedType evidenceSuppliedType : evidenceSuppliedTypes){
    			evidenceSuppliedModel = new EvidenceSuppliedModel();
    			if (isResponse || isInit){
    	    		EvidenceType evidenceType = new EvidenceType();
    	    		
    				if (fromRequest || isInit){
        	    		// Aggiungere le Evidence con valori di default nelle singole EvidenceSupplied, settando l'UUID.
    	    			evidenceType = initEvidenceType(tenderingCriterionResponseType);
    	    			evidenceSuppliedType.setID(evidenceType.getID());
    				} else {
        	    		// Muovere le Evidence dalla lista esterna alle EvidenceSupplied, aventi lo stesso UUID.
    					// Se la Evidence è null, potrebbe stare effettuando l'upload di una Response.
    					evidenceType = moveEvidenceType(evidenceSuppliedType.getID());
    					if (evidenceType == null){
    						evidenceType = initEvidenceType(tenderingCriterionResponseType); 
    						evidenceSuppliedType.setID(evidenceType.getID());  
    					}					
    	    		}
	    			
	    			evidenceSuppliedModel.setEvidenceModel(BeanCommonAggregateFactory.buildEvidenceModel(evidenceType));
    			}
    			evidenceSuppliedModel.setIdModel(BeanCommonBasicFactory.buildIdModel(evidenceSuppliedType.getID()));
    			
    			if (!evidenceSuppliedModel.isAllFieldsNull()) { 
    				evidenceSuppliedModels.add(evidenceSuppliedModel);
    			}
    		}
	    	
	    	if (evidenceSuppliedModels.isEmpty()) { 
				evidenceSuppliedModels = null;
	    	}
    	}
    	return evidenceSuppliedModels;
    }

    public static List<ResponseValueModel> buildResponseValueModels(List<ResponseValueType> responseValueTypes, TenderingCriterionPropertyType tenderingCriterionPropertyType) throws ParseException, IllegalAccessException{
    	List<ResponseValueModel> responseValueModels = null;
    	ValueDataTypeCodeType dataType = (tenderingCriterionPropertyType != null) ? tenderingCriterionPropertyType.getValueDataTypeCode() : null;
    	ExpectedCodeType expectedType = (tenderingCriterionPropertyType != null) ? tenderingCriterionPropertyType.getExpectedCode() : null;
    	
    	if (responseValueTypes != null && responseValueTypes.size() > 0){
    		responseValueModels = new ArrayList<ResponseValueModel>();
    		ResponseValueModel responseValueModel = null;
    		/*if (tenderingCriterionPropertyType != null && tenderingCriterionPropertyType.getValueDataTypeCode() != null
    				&& ResponseData.IDENTIFIER.getCode().equalsIgnoreCase(tenderingCriterionPropertyType.getValueDataTypeCode().getValue())) {
    			
    			responseValueModel = new ResponseValueModel();
    			List<ResponseIDModel> responseIdModels = new ArrayList<ResponseIDModel>();
        		for (ResponseValueType responseValueType : responseValueTypes){
        			ResponseIDModel responseIdModel = moveResponseIDType(responseValueType);
        			
        			if (!GenericFactory.isAllFieldsNull(responseIdModel)) responseIdModels.add(responseIdModel);
        		}
        		responseValueModel.setResponseIdModels(responseIdModels);
    			if (!responseValueModel.isAllFieldsNull()) responseValueModels.add(responseValueModel);
    		
    		} else {*/
        	
    			for (ResponseValueType responseValueType : responseValueTypes){
        			responseValueModel = new ResponseValueModel();
        			responseValueModel.setIdModel(BeanCommonBasicFactory.buildIdModel(responseValueType.getID()));
        			List<DescriptionModel> descriptionModels = BeanCommonBasicFactory.buildDescriptionModels(responseValueType.getDescription());
        	    	if (descriptionModels != null && descriptionModels.size() > 0){
        	    		responseValueModel.getDescriptionModels().addAll(descriptionModels);
        	    	}
        	    	responseValueModel.setResponseAmountModel(BeanCommonBasicFactory.buildResponseAmountModel(responseValueType.getResponseAmount()));
        	    	responseValueModel.setResponseCodeModel(BeanCommonBasicFactory.buildResponseCodeModel(responseValueType.getResponseCode(), false));
        	    	responseValueModel.setResponseDate(BeanCommonBasicFactory.buildResponseDate(responseValueType.getResponseDate()));    	    	
        	    	responseValueModel.setResponseTime(BeanCommonBasicFactory.buildResponseTime(responseValueType.getResponseTime()));
        	    	responseValueModel.setResponseIdModel(BeanCommonBasicFactory.buildResponseIDModel(responseValueType.getResponseID()));
        	    	if (dataType != null && ResponseData.INDICATOR.getCode().equalsIgnoreCase(dataType.getValue())){
        	    		responseValueModel.setResponseIndicator(BeanCommonBasicFactory.buildResponseIndicator(responseValueType.getResponseIndicator()));
        	    	}
        	    	responseValueModel.setResponseMeasureModel(BeanCommonBasicFactory.buildResponseMeasureModel(responseValueType.getResponseMeasure()));
        	    	responseValueModel.setResponseNumeric(BeanCommonBasicFactory.buildResponseNumeric(responseValueType.getResponseNumeric()));
        	    	responseValueModel.setResponseQuantityModel(BeanCommonBasicFactory.buildResponseQuantityModel(responseValueType.getResponseQuantity()));
        	    	responseValueModel.setResponseUriModel(BeanCommonBasicFactory.buildResponseUriModel(responseValueType.getResponseURI()));
        	    	
        	    	if (
        	    			(isInitResponse && dataType != null && !ResponseData.LOT_IDENTIFIER.getCode().equalsIgnoreCase(dataType.getValue()) &&
        	    			ResponseData.CODE.getCode().equalsIgnoreCase(dataType.getValue()) && 
        	    			expectedType != null && StringUtils.isNotBlank(expectedType.getListID()) && !expectedType.getListID().equalsIgnoreCase(CodeList.CPV_CODES.getNameList())) 
        	    			|| 
        	    			(!isInitResponse && !responseValueModel.valueIsNull())
        	    			||
        	    			(dataType != null && ResponseData.INDICATOR.getCode().equalsIgnoreCase(dataType.getValue())) 
        	    			||
        	    			(dataType != null && ResponseData.DESCRIPTION.getCode().equalsIgnoreCase(dataType.getValue())) 
        	    			||
        	    			(dataType != null && ResponseData.CERTIFICATION_LEVEL_DESCRIPTION.getCode().equalsIgnoreCase(dataType.getValue()))
        	    			||
        	    			(dataType != null && ResponseData.PERCENTAGE.getCode().equalsIgnoreCase(dataType.getValue()))
        	    			||
        	    			(dataType != null && ResponseData.QUANTITY.getCode().equalsIgnoreCase(dataType.getValue()))
        	    			||
        	    			(dataType != null && ResponseData.QUANTITY_YEAR.getCode().equalsIgnoreCase(dataType.getValue()))
        	    			||
        	    			(dataType != null && ResponseData.QUANTITY_INTEGER.getCode().equalsIgnoreCase(dataType.getValue()))
        	    		) {
        	    		responseValueModels.add(responseValueModel);
        	    	}
        		}
    		//}
	    	
	    	if (responseValueModels.isEmpty()) { 
				responseValueModels = null;
	    	}
    	}
    	return responseValueModels;
    }
}
