package com.pccube.espd.factory;

import java.text.ParseException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pccube.espd.enums.Customization;
import com.pccube.espd.model.QualificationApplicationResponseModel;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ContractingPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DocumentReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EconomicOperatorPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ProcurementProjectLotType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ProcurementProjectType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ContractFolderIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CopyIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CustomizationIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PreviousVersionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProcedureCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProfileExecutionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProfileIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QualificationApplicationTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UBLVersionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UUIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.VersionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeightScoringMethodologyNoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeightingTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.qualificationapplicationrequest_2.QualificationApplicationRequestType;
import oasis.names.specification.ubl.schema.xsd.qualificationapplicationresponse_2.QualificationApplicationResponseType;

/**
 * Transforms a {@link QualificationApplicationResponseType} into a {@link QualificationApplicationResponseModel}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
@Component
public class BeanTransformerResponseFactory extends GenericTransformerFactory {

	public BeanTransformerResponseFactory() {
		// TODO Auto-generated constructor stub
	}


	/**
     * Transforms a {@link QualificationApplicationRequestType} into a {@link QualificationApplicationResponseModel}.
     * 
     * @param requestType The XML object structure of an ESPD Request.
     *
     * @return An entity containing the information coming from the XML response file.
	 * @throws IllegalAccessException 
     */
	public QualificationApplicationResponseModel generateQualificationApplicationResponseModel(QualificationApplicationRequestType requestType) throws ParseException, IllegalAccessException {
		
		GenericFactory.isInit = false;
		GenericFactory.isResponse = true;
		GenericFactory.fromRequest = true;
		
		GenericFactory.tenderingCriterionResponseTypes = null; 
		GenericFactory.evidenceTypes = null;
		
		QualificationApplicationResponseModel responseModel = new QualificationApplicationResponseModel();
		
		addUBLVersionID(responseModel, requestType.getUBLVersionID());
		
		createCustomizationID(responseModel);
		
		addProfileID(responseModel, requestType.getProfileID());
		
		addProfileExecutionID(responseModel, requestType.getProfileExecutionID());
		
		addID(responseModel, requestType.getID());
		
		addCopyIndicator(responseModel, requestType.getCopyIndicator());
		
		addUUID(responseModel, requestType.getUUID());
		
		addContractFolderID(responseModel, requestType.getContractFolderID());
		
		addDate(responseModel, requestType.getIssueDate());
		
		addTime(responseModel, requestType.getIssueTime());
		
		addVersionID(responseModel, requestType.getVersionID());
		
		addPreviousVersionID(responseModel, requestType.getPreviousVersionID());
		
		addProcedureCode(responseModel, requestType.getProcedureCode());
		
		addQualificationApplicationTypeCode(responseModel, requestType.getQualificationApplicationTypeCode());
		
		/*addWeightScoringMethodologyNote(responseModel, requestType.getWeightScoringMethodologyNote());
		
		addWeightingTypeCode(responseModel, requestType.getWeightingTypeCode());*/
		
		addAdditionalDocumentReference(responseModel, requestType.getAdditionalDocumentReference());
			
		addContractingParty(responseModel, requestType.getContractingParty());
		
		addProcurementProject(responseModel, requestType.getProcurementProject());
		
		addProcurementProjectLot(responseModel, requestType.getProcurementProjectLot());
		
		createEconomicOperatorParty(responseModel);
		
		addTenderingCriterion(responseModel, requestType.getTenderingCriterion());
		
		return responseModel;
	}
	
	private void createCustomizationID(QualificationApplicationResponseModel responseModel){
		responseModel.setCustomizationIDModel(initCustomizationIDModel(Customization.RESPONSE));
	}
	
	private void createEconomicOperatorParty(QualificationApplicationResponseModel responseModel){
		responseModel.getEconomicOperatorPartyModels().add(initEconomicOperatorPartyModel());
	}
	
	/**
     * Transforms a {@link QualificationApplicationResponseType} into a {@link QualificationApplicationResponseModel}.
     * 
     * @param responseType The XML object structure of an ESPD Response.
     *
     * @return An entity containing the information coming from the XML response file.
	 * @throws IllegalAccessException 
     */
	public QualificationApplicationResponseModel generateQualificationApplicationResponseModel(QualificationApplicationResponseType responseType) throws ParseException, IllegalAccessException{

		GenericFactory.isInit = false;
		GenericFactory.isResponse = true;
		GenericFactory.fromRequest = false;
		
		GenericFactory.tenderingCriterionResponseTypes = responseType.getTenderingCriterionResponse(); 
		GenericFactory.evidenceTypes = responseType.getEvidence();
				
		QualificationApplicationResponseModel responseModel = new QualificationApplicationResponseModel();
		
		addUBLVersionID(responseModel, responseType.getUBLVersionID());
		
		addCustomizationID(responseModel, responseType.getCustomizationID());
		
		addProfileID(responseModel, responseType.getProfileID());
		
		addProfileExecutionID(responseModel, responseType.getProfileExecutionID());
		
		addID(responseModel, responseType.getID());
		
		addCopyIndicator(responseModel, responseType.getCopyIndicator());
		
		addUUID(responseModel, responseType.getUUID());
		
		addContractFolderID(responseModel, responseType.getContractFolderID());
		
		addDate(responseModel, responseType.getIssueDate());
		
		addTime(responseModel, responseType.getIssueTime());
		
		addVersionID(responseModel, responseType.getVersionID());
		
		addPreviousVersionID(responseModel, responseType.getPreviousVersionID());
		
		addProcedureCode(responseModel, responseType.getProcedureCode());
		
		addQualificationApplicationTypeCode(responseModel, responseType.getQualificationApplicationTypeCode());
		
		/*addWeightScoringMethodologyNote(responseModel, responseType.getWeightScoringMethodologyNote());
		
		addWeightingTypeCode(responseModel, responseType.getWeightingTypeCode());*/
			
		addAdditionalDocumentReference(responseModel, responseType.getAdditionalDocumentReference());
		
		addContractingParty(responseModel, responseType.getContractingParty());
		
		addProcurementProject(responseModel, responseType.getProcurementProject());
		
		addProcurementProjectLot(responseModel, responseType.getProcurementProjectLot());
		
		addEconomicOperatorParty(responseModel, responseType.getEconomicOperatorParty());
		
		addTenderingCriterion(responseModel, responseType.getTenderingCriterion());
		
		return responseModel;
	}
	
	private void addUBLVersionID(QualificationApplicationResponseModel responseModel, UBLVersionIDType ublVersionIDType){
		responseModel.setUblVersionIDModel(BeanCommonBasicFactory.buildUblVersionIDModel(ublVersionIDType));
	}
	
	private void addCustomizationID(QualificationApplicationResponseModel responseModel, CustomizationIDType customizationIDType){
		responseModel.setCustomizationIDModel(BeanCommonBasicFactory.buildCustomizationIDModel(customizationIDType));
	}
	
	private void addProfileID(QualificationApplicationResponseModel responseModel, ProfileIDType profileIDType){
		responseModel.setProfileIDModel(BeanCommonBasicFactory.buildProfileIDModel(profileIDType));
	}

	private void addProfileExecutionID(QualificationApplicationResponseModel responseModel, ProfileExecutionIDType profileExecutionType){
		responseModel.setProfileExecutionIDModel(BeanCommonBasicFactory.buildProfileExecutionIDModel(profileExecutionType));	
	}
	
	private void addID(QualificationApplicationResponseModel responseModel, IDType idType){
		responseModel.setIdModel(BeanCommonBasicFactory.buildIdModel(idType));	
	}
	
	private void addCopyIndicator(QualificationApplicationResponseModel responseModel, CopyIndicatorType copyIndicatorType){
		responseModel.setCopyIndicator(BeanCommonBasicFactory.buildCopyIndicator(copyIndicatorType));
	}
	
	private void addUUID(QualificationApplicationResponseModel responseModel, UUIDType uuidType){
		responseModel.setUuidModel(BeanCommonBasicFactory.buildUuidModel(uuidType));
	}
	
	private void addContractFolderID(QualificationApplicationResponseModel responseModel, ContractFolderIDType contractFolderIDType){
		responseModel.setContractFolderIDModel(BeanCommonBasicFactory.buildContractFolderIDModel(contractFolderIDType));		
	}

	private void addDate(QualificationApplicationResponseModel responseModel, IssueDateType issueDateType) throws ParseException{
		responseModel.setDate(BeanCommonBasicFactory.buildDate(issueDateType));			
	}
	
	private void addTime(QualificationApplicationResponseModel responseModel, IssueTimeType issueTimeType) throws ParseException{
		responseModel.setTime(BeanCommonBasicFactory.buildTime(issueTimeType));			
	}
	
	private void addVersionID(QualificationApplicationResponseModel responseModel, VersionIDType versionIDType){
		responseModel.setVersionIDModel(BeanCommonBasicFactory.buildVersionIDModel(versionIDType));	
	}
	
	private void addPreviousVersionID(QualificationApplicationResponseModel responseModel, PreviousVersionIDType previousVersionIDType){
		responseModel.setPreviousVersionIDModel(BeanCommonBasicFactory.buildPreviousVersionIDModel(previousVersionIDType));	
	}
	
	private void addProcedureCode(QualificationApplicationResponseModel responseModel, ProcedureCodeType procedureCodeType){
		responseModel.setProcedureCodeModel(BeanCommonBasicFactory.buildProcedureCodeModel(procedureCodeType));
	}

	private void addQualificationApplicationTypeCode(QualificationApplicationResponseModel responseModel, 
			QualificationApplicationTypeCodeType qualificationCodeType){
		responseModel.setQualificationApplicationTypeCodeModel(
				BeanCommonBasicFactory.buildQualificationApplicationTypeCodeModel(qualificationCodeType));
	}

	@SuppressWarnings("unused")
	private void addWeightScoringMethodologyNote(QualificationApplicationResponseModel responseModel, List<WeightScoringMethodologyNoteType> weightScoringMethodologyNoteTypes){
		if(weightScoringMethodologyNoteTypes != null && weightScoringMethodologyNoteTypes.size() > 0){
			responseModel.setWeightScoringMethodologyNotes(
					BeanCommonBasicFactory.buildWeightScoringMethodologyNotes(weightScoringMethodologyNoteTypes));
		}
	}

	@SuppressWarnings("unused")
	private void addWeightingTypeCode(QualificationApplicationResponseModel responseModel, WeightingTypeCodeType weightingCodeType){
		responseModel.setWeightingTypeCodeModel(
				BeanCommonBasicFactory.buildWeightingTypeCodeModel(weightingCodeType));
	}
	
	private void addAdditionalDocumentReference(QualificationApplicationResponseModel responseModel, List<DocumentReferenceType> documentReferenceTypes) throws ParseException, IllegalAccessException {
		if(documentReferenceTypes != null && documentReferenceTypes.size() > 0){
			responseModel.getAdditionalDocumentReferenceModels().addAll(
					BeanCommonAggregateFactory.buildDocumentReferenceModels(documentReferenceTypes));
		}
	}
	
	private void addContractingParty(QualificationApplicationResponseModel responseModel, List<ContractingPartyType> contractingPartyTypes) throws ParseException, IllegalAccessException{
		if(contractingPartyTypes != null && contractingPartyTypes.size() > 0){
			responseModel.getContractingPartyModels().addAll(
					BeanCommonAggregateFactory.buildContractingPartyModels(contractingPartyTypes));
		}
	}
	
	private void addProcurementProject(QualificationApplicationResponseModel responseModel, ProcurementProjectType procurementProjectType) throws IllegalAccessException{
		responseModel.setProcurementProjectModel(BeanCommonAggregateFactory.buildProcurementProjectModel(procurementProjectType));
	}
	
	private void addProcurementProjectLot(QualificationApplicationResponseModel responseModel, List<ProcurementProjectLotType> procurementProjectLotTypes) throws IllegalAccessException{
		if(procurementProjectLotTypes != null && procurementProjectLotTypes.size() > 0){
			responseModel.getProcurementProjectLotModels().addAll(
					BeanCommonAggregateFactory.buildProcurementProjectLotModels(procurementProjectLotTypes));
		}
	}
	
	private void addEconomicOperatorParty(QualificationApplicationResponseModel responseModel, List<EconomicOperatorPartyType> economicOperatorPartyTypes) throws ParseException, IllegalAccessException{
		if(economicOperatorPartyTypes != null && economicOperatorPartyTypes.size() > 0){
			responseModel.getEconomicOperatorPartyModels().addAll(
					BeanCommonAggregateFactory.buildEconomicOperatorPartyModels(economicOperatorPartyTypes));
		}
	}
	
	private void addTenderingCriterion(QualificationApplicationResponseModel responseModel, List<TenderingCriterionType> tenderingCriterionTypes) throws ParseException, IllegalAccessException{
		if (tenderingCriterionTypes != null && tenderingCriterionTypes.size() > 0){
			responseModel.getTenderingCriterionModels().addAll(
					BeanCommonCriterionFactory.buildTenderingCriterionModels(tenderingCriterionTypes));
		}
	}
}
