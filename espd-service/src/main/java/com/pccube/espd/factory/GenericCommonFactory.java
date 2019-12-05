package com.pccube.espd.factory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pccube.espd.codelists.CdCriterionElementType;
import com.pccube.espd.codelists.CdResponseDataType;
import com.pccube.espd.config.EspdConfiguration;
import com.pccube.espd.config.VariableConfiguration;
import com.pccube.espd.enums.Agency;
import com.pccube.espd.enums.Cardinality;
import com.pccube.espd.enums.CodeList;
import com.pccube.espd.enums.CriterionElement;
import com.pccube.espd.enums.Language;
import com.pccube.espd.enums.ResponseData;
import com.pccube.espd.enums.UnitCode;
import com.pccube.espd.model.ConfidentialityLevelCodeModel;
import com.pccube.espd.model.CriterionTypeCodeModel;
import com.pccube.espd.model.DescriptionModel;
import com.pccube.espd.model.EvidenceModel;
import com.pccube.espd.model.EvidenceSuppliedModel;
import com.pccube.espd.model.ExpectedIDModel;
import com.pccube.espd.model.ResponseCodeTypeModel;
import com.pccube.espd.model.TenderingCriterionPropertyModel;
import com.pccube.espd.model.TenderingCriterionResponseModel;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AttachmentType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DocumentReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EvidenceSuppliedType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EvidenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ExternalReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyNameType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PeriodType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ProcurementProjectLotType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ProcurementProjectType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ResponseValueType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionPropertyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionResponseType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConfidentialityLevelCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EndDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IdentificationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProcedureCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseURIType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StartDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.URIType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidatedCriterionPropertyIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueDataTypeCodeType;

@Component
public class GenericCommonFactory extends GenericFactory {
	
	private static EspdConfiguration espdConfiguration;
	
	private static VariableConfiguration variableConfiguration;
	
	@Autowired
    public GenericCommonFactory(EspdConfiguration espdConfiguration, VariableConfiguration variableConfiguration) {
		GenericCommonFactory.espdConfiguration = espdConfiguration;
		GenericCommonFactory.variableConfiguration = variableConfiguration;
    }
	
	protected static TenderingCriterionResponseType initTenderingCriterionResponseType(TenderingCriterionPropertyType tenderingCriterionPropertyType){
		isInitResponse = true;
		TenderingCriterionResponseType tenderingCriterionResponseType = new TenderingCriterionResponseType();

		/* Section: TenderingCriterionResponse.Id */
		IDType idType = new IDType();
		idType.setValue(UUID.randomUUID().toString());
		idType.setSchemeID(espdConfiguration.getIsoNumberPublication());
		idType.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
		idType.setSchemeVersionID(espdConfiguration.getTaxonomyVersion());
		tenderingCriterionResponseType.setID(idType);

		/* Section: TenderingCriterionResponse.ValidatedCriterionPropertyId */
		ValidatedCriterionPropertyIDType validateCriterionPropertyIdType = new ValidatedCriterionPropertyIDType();
		validateCriterionPropertyIdType.setValue(tenderingCriterionPropertyType.getID().getValue());
		validateCriterionPropertyIdType.setSchemeID(CodeList.CRITERIA_TAXONOMY.getNameList());
		validateCriterionPropertyIdType.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
		validateCriterionPropertyIdType.setSchemeVersionID(espdConfiguration.getTaxonomyVersion());
		tenderingCriterionResponseType.setValidatedCriterionPropertyID(validateCriterionPropertyIdType);

		/* Section: TenderingCriterionResponse.ConfidentialityLevelCode */
		ConfidentialityLevelCodeModel confidentialityLevelCodeModel = new ConfidentialityLevelCodeModel(variableConfiguration.cmConfidentialityLevel);
		ConfidentialityLevelCodeType confidentialityLevelCodeType = new ConfidentialityLevelCodeType();
		confidentialityLevelCodeType.setListID(confidentialityLevelCodeModel.getListID());
		confidentialityLevelCodeType.setListAgencyName(confidentialityLevelCodeModel.getListAgencyName());
		confidentialityLevelCodeType.setListAgencyID(confidentialityLevelCodeModel.getListAgencyID());
		confidentialityLevelCodeType.setListVersionID(confidentialityLevelCodeModel.getListVersionID());
		tenderingCriterionResponseType.setConfidentialityLevelCode(confidentialityLevelCodeType);
		
		/* Section: TenderingCriterionResponse.ResponseValue */
		ResponseValueType responseValueType = mapperResponseValueType(tenderingCriterionPropertyType.getValueDataTypeCode());
		if (responseValueType != null) {
			tenderingCriterionResponseType.getResponseValue().add(responseValueType);
		}

		/* Section: TenderingCriterionResponse.ApplicablePeriod */
		PeriodType periodType = new PeriodType();
		periodType.setStartDate(new StartDateType());
		periodType.setEndDate(new EndDateType());
		tenderingCriterionResponseType.getApplicablePeriod().add(periodType);
		
		/* Section: TenderingCriterionResponse.EvidenceSupplied */
		EvidenceSuppliedType evidenceSuppliedType = mapperEvidenceSuppliedType(tenderingCriterionPropertyType.getValueDataTypeCode());
		if (evidenceSuppliedType != null) {
			tenderingCriterionResponseType.getEvidenceSupplied().add(evidenceSuppliedType);
		}
    	
		return tenderingCriterionResponseType;
	}
	
	/*protected static ResponseMeasureType initResponseMeasureType(ValueDataTypeCodeType valueDataTypeCodeType){
		ResponseMeasureType responseMeasureType = new ResponseMeasureType();
		String dataType = valueDataTypeCodeType.getValue();
		
		if (dataType.equalsIgnoreCase(ResponseData.QUANTITY_YEAR.getCode())) {
			
			responseMeasureType.setUnitCode(UnitCode.YEAR.getCode());
		
		} else if (dataType.equalsIgnoreCase(ResponseData.QUANTITY_INTEGER.getCode())) {
			
			responseMeasureType.setUnitCode(UnitCode.INTEGER.getCode());
		
		}
		
		return responseMeasureType;
	}*/

	protected static ResponseQuantityType initResponseQuantityType(ValueDataTypeCodeType valueDataTypeCodeType){
		ResponseQuantityType responseQuantityType = new ResponseQuantityType();
		String dataType = valueDataTypeCodeType.getValue();
		
		if (dataType.equalsIgnoreCase(ResponseData.PERCENTAGE.getCode())) {
			
			responseQuantityType.setUnitCode(UnitCode.PERCENTAGE.getCode());
		
		} else if (dataType.equalsIgnoreCase(ResponseData.QUANTITY_YEAR.getCode())) {
				
			responseQuantityType.setUnitCode(UnitCode.YEAR.getCode());
		
		} else if (dataType.equalsIgnoreCase(ResponseData.QUANTITY_INTEGER.getCode())) {
			
			responseQuantityType.setUnitCode(UnitCode.INTEGER.getCode());
		
		}
		
		return responseQuantityType;
	}

	protected static ResponseIDType initResponseIDType(ResponseIDType responseIDType){
		
		if (responseIDType == null) {
			responseIDType = new ResponseIDType();
		}

		if (StringUtils.isBlank(responseIDType.getSchemeAgencyID())){
			responseIDType.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
		}
		return responseIDType;
	}

	protected static ProcurementProjectType initProcurementProjectType(ProcurementProjectType procurementProjectType){
		
		if (procurementProjectType == null) {
			procurementProjectType = new ProcurementProjectType();
		}

		if (procurementProjectType.getID() != null){
			if (StringUtils.isBlank(procurementProjectType.getID().getSchemeAgencyID())){
				procurementProjectType.getID().setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
			}
			if (StringUtils.isBlank(procurementProjectType.getID().getSchemeVersionID())){
				procurementProjectType.getID().setSchemeVersionID(espdConfiguration.getTaxonomyVersion());
			}
		}
		return procurementProjectType;
	}
	
	private static ResponseValueType mapperResponseValueType(ValueDataTypeCodeType valueDataTypeCodeType){
		ResponseValueType responseValueType = new ResponseValueType();
		String dataType = valueDataTypeCodeType.getValue();
		
		IDType idType = new IDType();
		idType.setValue(UUID.randomUUID().toString());
		idType.setSchemeID(espdConfiguration.getIsoNumberPublication());
		idType.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
		idType.setSchemeVersionID(espdConfiguration.getTaxonomyVersion());
		responseValueType.setID(idType);
		
		if (dataType.equalsIgnoreCase(ResponseData.AMOUNT.getCode()) ||
			dataType.equalsIgnoreCase(ResponseData.MAXIMUM_AMOUNT.getCode()) ||
			dataType.equalsIgnoreCase(ResponseData.MINIMUM_AMOUNT.getCode())) {
			
			responseValueType.setResponseAmount(new ResponseAmountType());
			
		} else if (dataType.equalsIgnoreCase(ResponseData.DESCRIPTION.getCode()) ||
				dataType.equalsIgnoreCase(ResponseData.CERTIFICATION_LEVEL_DESCRIPTION.getCode())){
			
			responseValueType.getDescription().add(new DescriptionType());
			
		} else if (dataType.equalsIgnoreCase(ResponseData.CODE.getCode()) ||
				dataType.equalsIgnoreCase(ResponseData.CODE_COUNTRY.getCode()) ||
				dataType.equalsIgnoreCase(ResponseData.TRANSLATION_TYPE_CODE.getCode()) ||
				dataType.equalsIgnoreCase(ResponseData.COPY_QUALITY_TYPE_CODE.getCode())){
			
			responseValueType.setResponseCode(new ResponseCodeType());
			
		} else if (dataType.equalsIgnoreCase(ResponseData.DATE.getCode()) ||
				dataType.equalsIgnoreCase(ResponseData.PERIOD.getCode())){
			
			responseValueType.setResponseDate(new ResponseDateType());
			
		} else if (dataType.equalsIgnoreCase(ResponseData.LOT_IDENTIFIER.getCode()) ||
				dataType.equalsIgnoreCase(ResponseData.IDENTIFIER.getCode()) ||
				dataType.equalsIgnoreCase(ResponseData.ECONOMIC_OPERATOR_IDENTIFIER.getCode())){
			
			responseValueType.setResponseID(initResponseIDType(null));
			
		/*} else if (dataType.equalsIgnoreCase(ResponseData.INDICATOR.getCode())){
			
			responseValueType.setResponseIndicator(new ResponseIndicatorType());*/
			
		} else if (dataType.equalsIgnoreCase(ResponseData.MAXIMUM_VALUE_NUMERIC.getCode()) ||
				dataType.equalsIgnoreCase(ResponseData.MINIMUM_VALUE_NUMERIC.getCode())){
			
			responseValueType.setResponseNumeric(new ResponseNumericType());
			
		} else if (dataType.equalsIgnoreCase(ResponseData.PERCENTAGE.getCode()) ||
				dataType.equalsIgnoreCase(ResponseData.QUANTITY.getCode()) ||
				dataType.equalsIgnoreCase(ResponseData.QUANTITY_YEAR.getCode()) ||
				dataType.equalsIgnoreCase(ResponseData.QUANTITY_INTEGER.getCode())){
			
			responseValueType.setResponseQuantity(initResponseQuantityType(valueDataTypeCodeType));
		
		/*} else if (dataType.equalsIgnoreCase(ResponseData.QUANTITY_YEAR.getCode()) ||
				dataType.equalsIgnoreCase(ResponseData.QUANTITY_INTEGER.getCode())){
			
			responseValueType.setResponseMeasure(initResponseMeasureType(valueDataTypeCodeType));*/
		
		} else if (dataType.equalsIgnoreCase(ResponseData.TIME.getCode())){
			
			responseValueType.setResponseTime(new ResponseTimeType());
			
		} else if (dataType.equalsIgnoreCase(ResponseData.URL.getCode())){
			
			responseValueType.setResponseURI(new ResponseURIType());
			
		} else if (dataType.equalsIgnoreCase(ResponseData.EVIDENCE_IDENTIFIER.getCode())){
			
			responseValueType = null;
		}
		
		return responseValueType;
	}
	
	private static EvidenceSuppliedType mapperEvidenceSuppliedType(ValueDataTypeCodeType valueDataTypeCodeType){
		EvidenceSuppliedType evidenceSuppliedType = new EvidenceSuppliedType();
		String dataType = valueDataTypeCodeType.getValue();
		
		if (dataType.equalsIgnoreCase(ResponseData.EVIDENCE_IDENTIFIER.getCode())){
			
			evidenceSuppliedType = new EvidenceSuppliedType();
			evidenceSuppliedType.setID(new IDType());
		} else {

			evidenceSuppliedType = null;
		}
		
		return evidenceSuppliedType;
	}
	
	protected static EvidenceType initEvidenceType(TenderingCriterionResponseType tenderingCriterionResponseType){
		EvidenceType evidenceType = new EvidenceType();
		
		/* Section: Evidence.Uuid */
		IDType uuidType = new IDType();
		uuidType.setValue(UUID.randomUUID().toString());
		uuidType.setSchemeID(espdConfiguration.getIsoNumberPublication());
		uuidType.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
		uuidType.setSchemeVersionID(DUEPUNTOZERO);
		evidenceType.setID(uuidType);
		
		/* Section: Evidence.ConfidentialityLevelCode */
		ConfidentialityLevelCodeModel confidentialityLevelCodeModel = new ConfidentialityLevelCodeModel(variableConfiguration.cmConfidentialityLevel);
		ConfidentialityLevelCodeType confidentialityLevelCodeType = new ConfidentialityLevelCodeType();
		//confidentialityLevelCodeType.setValue(tenderingCriterionResponseType.getConfidentialityLevelCode().getValue());
		confidentialityLevelCodeType.setListID(confidentialityLevelCodeModel.getListID());
		confidentialityLevelCodeType.setListAgencyName(confidentialityLevelCodeModel.getListAgencyName());
		confidentialityLevelCodeType.setListAgencyID(confidentialityLevelCodeModel.getListAgencyID());
		confidentialityLevelCodeType.setListVersionID(confidentialityLevelCodeModel.getListVersionID());
		evidenceType.setConfidentialityLevelCode(confidentialityLevelCodeType);

		/* Section: Evidence.DocumentReference */
		DocumentReferenceType documentReferenceType = new DocumentReferenceType();
		IDType idType = new IDType();
		idType.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
		documentReferenceType.setID(idType);
		AttachmentType attachmentType = new AttachmentType();
		ExternalReferenceType externalReferenceType = new ExternalReferenceType();
		externalReferenceType.setURI(new URIType());
		attachmentType.setExternalReference(externalReferenceType);
		documentReferenceType.setAttachment(attachmentType);
		PartyType partyType = new PartyType();
		PartyNameType partyNameType = new PartyNameType();
		partyNameType.setName(new NameType());
		partyType.getPartyName().add(partyNameType);
		documentReferenceType.setIssuerParty(partyType);
		
		evidenceType.getDocumentReference().add(documentReferenceType);
		
		return evidenceType;
	}
	
	protected static TenderingCriterionResponseType moveTenderingCriterionResponseType(IDType idTypeUploaded, IDType idType){
		isInitResponse = false;
		TenderingCriterionResponseType tenderingCriterionResponseType = null;
		
		if (tenderingCriterionResponseTypes != null && tenderingCriterionResponseTypes.size() > 0){
			// Controllo inserito per evitare l'errore in fase di upalod di una Response inviata da Infocamere.
			if (tenderingCriterionResponseTypes.get(0).getValidatedCriterionPropertyID() == null) { 
				return null;
			}
			tenderingCriterionResponseType = tenderingCriterionResponseTypes.stream()
					.filter(filteredType -> idTypeUploaded.getValue().equalsIgnoreCase(
							filteredType.getValidatedCriterionPropertyID().getValue()))
					.findAny().orElse(null);
			// Setting necessario nel caso venga ricaricato l'xml, da cui vengono estratti i criteri.
			if (tenderingCriterionResponseType != null) {
				ValidatedCriterionPropertyIDType validatedCriterionPropertyIDType = tenderingCriterionResponseType.getValidatedCriterionPropertyID();
				validatedCriterionPropertyIDType.setValue(idType.getValue());
			}
		}
		
		return tenderingCriterionResponseType;
	}
	
	protected static EvidenceType moveEvidenceType(IDType idType){
		EvidenceType evidenceType = null;
		
		if (evidenceTypes != null && evidenceTypes.size() > 0 && idType != null && idType.getValue() != null){
			evidenceType = evidenceTypes.stream()
					.filter(filteredType -> idType.getValue().equalsIgnoreCase(
							filteredType.getID().getValue()))
					.findAny().orElse(null);
		}
		
		return evidenceType;
	}
	
	/*protected static ResponseIDModel moveResponseIDType(ResponseValueType responseValueType){
		ResponseIDModel responseIDModel = null;
		
		if (responseValueType != null && responseValueType.getResponseID() != null){
			IDModel idModel = new IDModel();
			idModel.setId(responseValueType.getResponseID().getValue());
			
			responseIDModel = new ResponseIDModel();
			responseIDModel.setIdModel(idModel);
		}
		
		return responseIDModel;
	}*/
	
	protected static TenderingCriterionResponseModel separateTenderingCriterionResponseModel(TenderingCriterionPropertyModel tenderingCriterionPropertyModel) {
		return tenderingCriterionPropertyModel.getTenderingCriterionResponseModel();
	}
	
	protected static EvidenceModel separateEvidenceModel(EvidenceSuppliedModel evidenceSuppliedModel) throws IllegalAccessException {
		 return evidenceSuppliedModel.getEvidenceModel();
	}
	
	protected static TenderingCriterionPropertyModel moveLotsPropertyModel(List<TenderingCriterionPropertyModel> lotsPropertyModels){
		TenderingCriterionPropertyModel tenderingCriterionPropertyModel = new TenderingCriterionPropertyModel();
			
		String cardinality = (lotsPropertyModels != null && lotsPropertyModels.size() > 0) ? lotsPropertyModels.get(0).getCardinality() : Cardinality.UNOENNE.getCode();
		tenderingCriterionPropertyModel.setCardinality(cardinality); 
		
		List<DescriptionModel> descriptionModels = new ArrayList<DescriptionModel>();
		DescriptionModel descriptionModel = new DescriptionModel();
		descriptionModel.setDescription((cardinality.equalsIgnoreCase(Cardinality.UNOENNE.getCode())) ? LOTS_EN : LOT_ID_EN);
		descriptionModel.setLanguageID(Language.ENGLISH.getCode().toUpperCase());
		descriptionModels.add(descriptionModel);
		descriptionModel = new DescriptionModel();
		descriptionModel.setDescription((cardinality.equalsIgnoreCase(Cardinality.UNOENNE.getCode())) ? LOTS_IT : LOT_ID_IT);
		descriptionModel.setLanguageID(Language.ITALIAN.getCode().toUpperCase());
		descriptionModels.add(descriptionModel);
		tenderingCriterionPropertyModel.setDescriptionModels(descriptionModels);
		
		CdResponseDataType responseDataType = new CdResponseDataType();
		responseDataType.setCode(ResponseData.LOT_IDENTIFIER.getCode());
		ResponseCodeTypeModel valueDataTypeCodeModel = new ResponseCodeTypeModel();
		valueDataTypeCodeModel.setResponseDataType(responseDataType);
		tenderingCriterionPropertyModel.setValueDataTypeCodeModel(valueDataTypeCodeModel);
		
		CdCriterionElementType criterionElementType = new CdCriterionElementType();
		criterionElementType.setCode(CriterionElement.REQUIREMENT.getCode());
		CriterionTypeCodeModel typeCodeModel = new CriterionTypeCodeModel();
		typeCodeModel.setCriterionElementType(criterionElementType);
		tenderingCriterionPropertyModel.setTypeCodeModel(typeCodeModel);
		
		tenderingCriterionPropertyModel.setLotsPropertyModels(lotsPropertyModels);
		
		return tenderingCriterionPropertyModel;
	}
	
	protected static TenderingCriterionPropertyModel moveCpvsPropertyModel(List<TenderingCriterionPropertyModel> cpvsPropertyModels){
		TenderingCriterionPropertyModel tenderingCriterionPropertyModel = new TenderingCriterionPropertyModel();
		
		String cardinality = (cpvsPropertyModels != null && cpvsPropertyModels.size() > 0) ? cpvsPropertyModels.get(0).getCardinality() : Cardinality.UNOENNE.getCode();
		tenderingCriterionPropertyModel.setCardinality(cardinality); 
			
		List<DescriptionModel> descriptionModels = new ArrayList<DescriptionModel>();
		DescriptionModel descriptionModel = new DescriptionModel();
		descriptionModel.setDescription(CPV_CODE_EN);
		descriptionModel.setLanguageID(Language.ENGLISH.getCode().toUpperCase());
		descriptionModels.add(descriptionModel);
		descriptionModel = new DescriptionModel();
		descriptionModel.setDescription(CPV_CODE_IT);
		descriptionModel.setLanguageID(Language.ITALIAN.getCode().toUpperCase());
		descriptionModels.add(descriptionModel);
		tenderingCriterionPropertyModel.setDescriptionModels(descriptionModels);
		
		CdResponseDataType responseDataType = new CdResponseDataType();
		responseDataType.setCode(ResponseData.CODE.getCode());
		ResponseCodeTypeModel valueDataTypeCodeModel = new ResponseCodeTypeModel();
		valueDataTypeCodeModel.setResponseDataType(responseDataType);
		tenderingCriterionPropertyModel.setValueDataTypeCodeModel(valueDataTypeCodeModel);
		
		CdCriterionElementType criterionElementType = new CdCriterionElementType();
		criterionElementType.setCode(CriterionElement.REQUIREMENT.getCode());
		CriterionTypeCodeModel typeCodeModel = new CriterionTypeCodeModel();
		typeCodeModel.setCriterionElementType(criterionElementType);
		tenderingCriterionPropertyModel.setTypeCodeModel(typeCodeModel);
		
		tenderingCriterionPropertyModel.setCpvsPropertyModels(cpvsPropertyModels);
		
		return tenderingCriterionPropertyModel;
	}
	
	/*protected static ResponseValueModel separateResponseValueModel(ResponseIDModel responseIdModel){
		ResponseValueModel responseValueModel = null;
		
		if (responseIdModel != null){
			ResponseIDModel responseIdModelApp = new ResponseIDModel();
			if (responseIdModel.getIdModel() != null){
				responseIdModelApp.setResponseId(responseIdModel.getIdModel().getId());
			}
			
			responseValueModel = new ResponseValueModel();
			responseValueModel.setResponseIdModel(responseIdModelApp);
		}
		
		return responseValueModel;
	}*/

	protected static ProcurementProjectLotType initProcurementProjectLotType(ProcurementProjectLotType procurementProjectLotType){
		
		if (procurementProjectLotType != null){
			IDType idType = procurementProjectLotType.getID();
			if (idType == null) {
				idType = new IDType();
			}
			idType.setSchemeAgencyID(espdConfiguration.getClientTaxCode());
			
			procurementProjectLotType.setID(idType);
		}
		
		return procurementProjectLotType;
	}

	protected static DocumentReferenceType initDocumentReferenceType(DocumentReferenceType documentReferenceType){
		
		if (documentReferenceType != null){
			IDType idType = documentReferenceType.getID();
			if (idType == null) {
				idType = new IDType();
			}
			idType.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
			
			documentReferenceType.setID(idType);
		}
		
		return documentReferenceType;
	}

	protected static IdentificationCodeType initIdentificationCodeType(IdentificationCodeType identificationCodeType){
		
		if (identificationCodeType != null){
        	if (StringUtils.isBlank(identificationCodeType.getListID())) {
        		identificationCodeType.setListID(variableConfiguration.cmCountryCodeIdentifier.getListID());
        	}
        	if (StringUtils.isBlank(identificationCodeType.getListAgencyName())) {
        		identificationCodeType.setListAgencyName(variableConfiguration.cmCountryCodeIdentifier.getListAgencyName());
        	}
        	if (StringUtils.isBlank(identificationCodeType.getListAgencyID())) {
        		identificationCodeType.setListAgencyID(variableConfiguration.cmCountryCodeIdentifier.getListAgencyID());
        	}
        	if (StringUtils.isBlank(identificationCodeType.getListVersionID())) {
        		identificationCodeType.setListVersionID(variableConfiguration.cmCountryCodeIdentifier.getListVersionID());
        	}
		}
		
		return identificationCodeType;
	}


	protected static ProcedureCodeType initProcedureCodeType(ProcedureCodeType procedureCodeType){
		
		if (procedureCodeType != null){
        	if (StringUtils.isBlank(procedureCodeType.getListID())) {
        		procedureCodeType.setListID(variableConfiguration.cmProcedureType.getListID());
        	}
        	if (StringUtils.isBlank(procedureCodeType.getListAgencyName())) {
        		procedureCodeType.setListAgencyName(variableConfiguration.cmProcedureType.getListAgencyName());
        	}
        	if (StringUtils.isBlank(procedureCodeType.getListAgencyID())) {
        		procedureCodeType.setListAgencyID(variableConfiguration.cmProcedureType.getListAgencyID());
        	}
        	if (StringUtils.isBlank(procedureCodeType.getListVersionID())) {
        		procedureCodeType.setListVersionID(variableConfiguration.cmProcedureType.getListVersionID());
        	}
		}
		
		return procedureCodeType;
	}

	protected static ExpectedIDModel initExpectedIDModel(ExpectedIDModel expectedIDModel){
		
		if (expectedIDModel != null && StringUtils.isBlank(expectedIDModel.getSchemeAgencyID())) {
			expectedIDModel.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
		}
		
		return expectedIDModel;
	}
	
	protected static String mapperIdParent(String idGroupParent, IDType idType){
		
		if (idType != null && StringUtils.isNotBlank(idType.getValue())){
			if (StringUtils.isBlank(idGroupParent)) {
				idGroupParent = idType.getValue();
			} else {
				idGroupParent += (SPLIT_ID_PARENT + idType.getValue());
			}
		}
		
		return idGroupParent;
	}
	
	protected static Float resetFloat(BigDecimal value) {
		return (isInitResponse) ? null : value.floatValue();
	}
	
	protected static String resetString(String value) {
		return (isInitResponse) ? null : value;
	}
	
}
