package com.pccube.espd.factory;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pccube.espd.codelists.CdCountryCodeIdentifier;
import com.pccube.espd.codelists.CdDocRefContentType;
import com.pccube.espd.codelists.CdEOIndustryClassificationCode;
import com.pccube.espd.codelists.CdEORoleType;
import com.pccube.espd.codelists.CdProfileExecutionID;
import com.pccube.espd.codelists.CdProjectType;
import com.pccube.espd.codelists.CdQualificationApplicationType;
import com.pccube.espd.config.EspdConfiguration;
import com.pccube.espd.config.VariableConfiguration;
import com.pccube.espd.enums.Agency;
import com.pccube.espd.enums.Currency;
import com.pccube.espd.enums.Customization;
import com.pccube.espd.enums.QualificationApplication;
import com.pccube.espd.model.AddressLineModel;
import com.pccube.espd.model.AddressModel;
import com.pccube.espd.model.CapabilityModel;
import com.pccube.espd.model.ContactModel;
import com.pccube.espd.model.ContractFolderIDModel;
import com.pccube.espd.model.ContractingPartyModel;
import com.pccube.espd.model.CountryModel;
import com.pccube.espd.model.CustomizationIDModel;
import com.pccube.espd.model.DocumentReferenceModel;
import com.pccube.espd.model.DocumentTypeCodeModel;
import com.pccube.espd.model.EconomicOperatorPartyModel;
import com.pccube.espd.model.EconomicOperatorRoleModel;
import com.pccube.espd.model.IDModel;
import com.pccube.espd.model.IdentificationCodeModel;
import com.pccube.espd.model.IndustryClassificationCodeModel;
import com.pccube.espd.model.PartyIdentificationModel;
import com.pccube.espd.model.PartyModel;
import com.pccube.espd.model.PartyNameModel;
import com.pccube.espd.model.PersonModel;
import com.pccube.espd.model.PowerOfAttorneyModel;
import com.pccube.espd.model.ProcedureCodeModel;
import com.pccube.espd.model.ProcurementProjectModel;
import com.pccube.espd.model.ProcurementTypeCodeModel;
import com.pccube.espd.model.ProfileExecutionIDModel;
import com.pccube.espd.model.ProfileIDModel;
import com.pccube.espd.model.QualificationApplicationTypeCodeModel;
import com.pccube.espd.model.QualifyingPartyModel;
import com.pccube.espd.model.RoleCodeModel;
import com.pccube.espd.model.UUIDModel;
import com.pccube.espd.model.VersionIDModel;
import com.pccube.espd.model.WeightingTypeCodeModel;
import com.pccube.espd.utility.UtilityManager;

@Component
public class GenericTransformerFactory extends GenericFactory {
	
	@Autowired
	private EspdConfiguration espdConfiguration;

	@Autowired
	private VariableConfiguration variableConfiguration;
	
	protected VersionIDModel initUblVersionIDModel(){
		VersionIDModel ublVersionIDModel = new VersionIDModel();
		ublVersionIDModel.setUblVersion(espdConfiguration.getUblVersion());
		ublVersionIDModel.setSchemeAgencyID(Agency.OASIS_UBL_TC.getCode());
		return ublVersionIDModel;
	}
	
	protected CustomizationIDModel initCustomizationIDModel(Customization customization){
		CustomizationIDModel customizationIDModel = new CustomizationIDModel();
		customizationIDModel.setCustomizationID(customization.getCustomizationId());
		customizationIDModel.setSchemeAgencyID(Agency.CEN_BII.getCode());
		customizationIDModel.setSchemeVersionID(UNOPUNTOZERO);
		return customizationIDModel;
	}
	
	protected ProfileIDModel initProfileIDModel(){
		ProfileIDModel profileIDModel = new ProfileIDModel();
		profileIDModel.setProfileID(espdConfiguration.getBisIdentification());
		profileIDModel.setSchemeAgencyID(Agency.CEN_BII.getCode());
		profileIDModel.setSchemeVersionID(UNOPUNTOZERO);
		return profileIDModel;
	}

	protected ProfileExecutionIDModel initProfileExecutionIDModel(){
		CdProfileExecutionID profileExecutionID = new CdProfileExecutionID();
		profileExecutionID.setCode(espdConfiguration.getExchangeModelVersion());
		ProfileExecutionIDModel profileExecutionIDModel = new ProfileExecutionIDModel(variableConfiguration.cmProfileExecutionID);
		profileExecutionIDModel.setProfileExecutionID(profileExecutionID);
		return profileExecutionIDModel;
	}

	protected IDModel initIDModel(Customization customization){
		IDModel idModel = new IDModel();
		idModel.setId(customization.getKeyId() 
				+ "-" + Agency.DGPE.getCode()
				+ "-" + UtilityManager.randomAlphanumeric(10, true, false));
		idModel.setSchemeAgencyID(espdConfiguration.getClientTaxCode());
		return idModel;
	}

	protected UUIDModel initUUIDModel(){
		UUIDModel uuidModel = new UUIDModel();
		uuidModel.setUuid(UUID.randomUUID().toString());
		uuidModel.setSchemeID(espdConfiguration.getIsoNumberPublication());
		uuidModel.setSchemeAgencyName(espdConfiguration.getClientTaxCode());
		uuidModel.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
		uuidModel.setSchemeVersionID(QUATTRO);
		return uuidModel;
	}

	protected ContractFolderIDModel initContractFolderIDModel(){
		ContractFolderIDModel contractFolderIDModel = new ContractFolderIDModel();
		contractFolderIDModel.setSchemeAgencyID(Agency.DGPE.getCode());
		return contractFolderIDModel;
	}

	protected VersionIDModel initVersionIDModel(){
		VersionIDModel versionIDModel = new VersionIDModel();
		versionIDModel.setVersionID(UNOPUNTOZERO);
		versionIDModel.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
		versionIDModel.setSchemeVersionID(DUEPUNTOZERO);
		return versionIDModel;
	}

	protected ProcedureCodeModel initProcedureCodeModel(){
		ProcedureCodeModel procedureCodeModel = new ProcedureCodeModel(variableConfiguration.cmProcedureType);
		return procedureCodeModel;
	}

	protected QualificationApplicationTypeCodeModel initQualificationApplicationTypeCodeModel(){
		CdQualificationApplicationType qualificationApplicationType = new CdQualificationApplicationType();
		qualificationApplicationType.setCode(QualificationApplication.SELFCONTAINED.getCode());
		QualificationApplicationTypeCodeModel qualificationCodeModel = new QualificationApplicationTypeCodeModel(variableConfiguration.cmQualificationApplicationType);
		qualificationCodeModel.setQualificationApplicationType(qualificationApplicationType);
		return qualificationCodeModel;
	}

	protected WeightingTypeCodeModel initWeightingTypeCodeModel(){
		WeightingTypeCodeModel weightingTypeCodeModel = new WeightingTypeCodeModel(variableConfiguration.cmWeightingType);
		return weightingTypeCodeModel;
	}
	
	protected ContractingPartyModel initContractingPartyModel(){
		/* Section: ContractingParty.Party.PartyName */
		PartyNameModel partyNameModel = new PartyNameModel();
		partyNameModel.setName(espdConfiguration.getClientIdentification());

		/* Section: ContractingParty.Party.IndustryClassificationCode */
		IndustryClassificationCodeModel industryClassificationCodeModel = new IndustryClassificationCodeModel(variableConfiguration.cmEOIndustryClassificationCode);
		industryClassificationCodeModel.setEoIndustryClassificationCode(new CdEOIndustryClassificationCode());

		/* Section: ContractingParty.Party.PartyIdentification */
		IDModel idModel = new IDModel();
		idModel.setId(espdConfiguration.getClientTaxCode());
		idModel.setSchemeAgencyID(Agency.ADE.getCode());
		idModel.setSchemeID(ITCF);
		PartyIdentificationModel partyIdentificationModel = new PartyIdentificationModel();
		partyIdentificationModel.setIdModel(idModel);

		/* Section: ContractingParty.Party.PostalAddress */
		CdCountryCodeIdentifier countryCodeIdentifier = new CdCountryCodeIdentifier();
		countryCodeIdentifier.setCode(espdConfiguration.getClientLocation());
		IdentificationCodeModel identificationCodeModel = new IdentificationCodeModel(variableConfiguration.cmCountryCodeIdentifier);
		identificationCodeModel.setCountryCodeIdentifier(countryCodeIdentifier);
		CountryModel countryModel = new CountryModel();
		countryModel.setIdentificationCodeModel(identificationCodeModel);
		AddressModel addressModel = new AddressModel();
		addressModel.setCountryModel(countryModel);
		
		/* Section: ContractingParty.Party */
		PartyModel partyModel = new PartyModel();
		partyModel.getPartyNameModels().add(partyNameModel);
		partyModel.setIndustryClassificationCodeModel(industryClassificationCodeModel);
		partyModel.getPartyIdentificationModels().add(partyIdentificationModel);
		partyModel.setAddressModel(addressModel);

		/* Section: ContractingParty */
		ContractingPartyModel contractingPartyModel = new ContractingPartyModel();
		contractingPartyModel.setPartyModel(partyModel);
		
		return contractingPartyModel;
	}
	
	protected ProcurementProjectModel initProcurementProjectModel(){

		/* Section: ProcurementProject.ID */
		IDModel idModel = new IDModel();
		idModel.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
		idModel.setSchemeVersionID(espdConfiguration.getTaxonomyVersion());
		
		/* Section: ProcurementProject.ProcurementTypeCode */
		CdProjectType projectType = new CdProjectType();
		ProcurementTypeCodeModel procurementTypeCodeModel = new ProcurementTypeCodeModel(variableConfiguration.cmProjectType);
		procurementTypeCodeModel.setProjectType(projectType);

		/* Section: ProcurementProject */
		ProcurementProjectModel procurementProjectModel = new ProcurementProjectModel();
		procurementProjectModel.setIdModel(idModel);
		procurementProjectModel.setProcurementTypeCodeModel(procurementTypeCodeModel);
		procurementProjectModel.getMainCommodityClassificationModels();
		
		return procurementProjectModel;
	}
	
	protected EconomicOperatorPartyModel initEconomicOperatorPartyModel(){
		/* Section: EconomicOperatorParty.Party.IndustryClassificationCode */
		CdEOIndustryClassificationCode eoIndustryClassificationCode = new CdEOIndustryClassificationCode();
		IndustryClassificationCodeModel industryClassificationCodeModel = new IndustryClassificationCodeModel(variableConfiguration.cmEOIndustryClassificationCode);
		industryClassificationCodeModel.setEoIndustryClassificationCode(eoIndustryClassificationCode);

		/* Section: EconomicOperatorParty.Party.PartyName */
		PartyNameModel partyNameModel = new PartyNameModel();

		/* Section: EconomicOperatorParty.Party.PartyIdentification */
		PartyIdentificationModel partyIdentificationModel = new PartyIdentificationModel();
		IDModel idModel = new IDModel();
		idModel.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
		partyIdentificationModel.setIdModel(idModel);

		/* Section: EconomicOperatorParty.Party.Contact */
		ContactModel contactModel = new ContactModel();

		/* Section: EconomicOperatorParty.Party.PostalAddress.AddressLine */
		AddressLineModel addressLineModel = new AddressLineModel();
		
		/* Section: EconomicOperatorParty.Party.PostalAddress */
		CdCountryCodeIdentifier countryCodeIdentifier = new CdCountryCodeIdentifier();
		IdentificationCodeModel identificationCodeModel = new IdentificationCodeModel(variableConfiguration.cmCountryCodeIdentifier);
		identificationCodeModel.setCountryCodeIdentifier(countryCodeIdentifier);
		CountryModel countryModel = new CountryModel();
		countryModel.setIdentificationCodeModel(identificationCodeModel);
		AddressModel addressModel = new AddressModel();
		addressModel.getAddressLineModels().add(addressLineModel);
		addressModel.setCountryModel(countryModel);	

		/* Section: EconomicOperatorParty.Party.PowerOfAttorney.AgentParty.Person.PostalAddress.AddressLine */
		AddressLineModel pAddressLineModel = new AddressLineModel();
		
		/* Section: EconomicOperatorParty.Party.PowerOfAttorney.AgentParty.Person.PostalAddress */
		CdCountryCodeIdentifier pCountryCodeIdentifier = new CdCountryCodeIdentifier();
		IdentificationCodeModel pIdentificationCodeModel = new IdentificationCodeModel(variableConfiguration.cmCountryCodeIdentifier);
		pIdentificationCodeModel.setCountryCodeIdentifier(pCountryCodeIdentifier);
		CountryModel pCountryModel = new CountryModel();
		pCountryModel.setIdentificationCodeModel(pIdentificationCodeModel);
		AddressModel pAddressModel = new AddressModel();
		pAddressModel.getAddressLineModels().add(pAddressLineModel);
		pAddressModel.setCountryModel(pCountryModel);	
		
		/* Section: EconomicOperatorParty.Party.PowerOfAttorney.AgentParty.Person */
		PersonModel personModel = new PersonModel();
		personModel.setResidenceAddressModel(pAddressModel);
		
		/* Section: EconomicOperatorParty.Party.PowerOfAttorney.AgentParty */
		PartyModel agentPartyModel = new PartyModel();
		agentPartyModel.getPersonModels().add(personModel);
		
		/* Section: EconomicOperatorParty.Party.PowerOfAttorney */
		PowerOfAttorneyModel powerOfAttorneyModel = new PowerOfAttorneyModel();
		powerOfAttorneyModel.setAgentPartyModel(agentPartyModel);
		
		/* Section: EconomicOperatorParty.Party */
		PartyModel partyModel = new PartyModel();
		partyModel.getPartyNameModels().add(partyNameModel);
		partyModel.getPartyIdentificationModels().add(partyIdentificationModel);
		partyModel.setIndustryClassificationCodeModel(industryClassificationCodeModel);
		partyModel.setContactModel(contactModel);
		partyModel.setAddressModel(addressModel);
		partyModel.getPowerOfAttorneyModels().add(powerOfAttorneyModel);
		
		/* Section: EconomicOperatorParty.EconomicOperatorRole */
		CdEORoleType eoRoleType = new CdEORoleType();
		RoleCodeModel roleCodeModel = new RoleCodeModel(variableConfiguration.cmEORoleType);
		roleCodeModel.setEoRoleType(eoRoleType);
		EconomicOperatorRoleModel economicOperatorRoleModel = new EconomicOperatorRoleModel();
		economicOperatorRoleModel.setRoleCodeModel(roleCodeModel);

		/* Section: EconomicOperatorParty.QualifyingParty */
		CapabilityModel capabilityModel = new CapabilityModel();
		capabilityModel.getValueAmountModel().setCurrencyID(Currency.EUR.getCode());
		QualifyingPartyModel qualifyingPartyModel = new QualifyingPartyModel();
		qualifyingPartyModel.getFinancialCapabilityModels().add(capabilityModel);

		/* Section: EconomicOperatorParty */
		EconomicOperatorPartyModel economicOperatorPartyModel = new EconomicOperatorPartyModel();
		economicOperatorPartyModel.getQualifyingPartyModels().add(qualifyingPartyModel);
		economicOperatorPartyModel.setEconomicOperatorRoleModel(economicOperatorRoleModel);
		economicOperatorPartyModel.setPartyModel(partyModel);	
		
		return economicOperatorPartyModel;
	}
	
	protected DocumentReferenceModel initDocumentReferenceModel(){
		/* Section: DocumentReference.ID */
		IDModel idModel = new IDModel();
		idModel.setSchemeAgencyID(Agency.EU_COM_OP.getCode());
		
		/* Section: DocumentReference.DocumentTypeCode */
		CdDocRefContentType docRefContentType = new CdDocRefContentType();
		DocumentTypeCodeModel documentTypeCodeModel = new DocumentTypeCodeModel(variableConfiguration.cmDocRefContentType);
		documentTypeCodeModel.setDocRefContentType(docRefContentType);
		
		/* Section: DocumentReference */
		DocumentReferenceModel documentReferenceModel = new DocumentReferenceModel();
		documentReferenceModel.setIdModel(idModel);
		documentReferenceModel.setDocumentTypeCodeModel(documentTypeCodeModel);
		
		return documentReferenceModel;
	}
}
