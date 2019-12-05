package com.pccube.espd.factory;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pccube.espd.model.ContractFolderIDModel;
import com.pccube.espd.model.ContractingPartyModel;
import com.pccube.espd.model.CustomizationIDModel;
import com.pccube.espd.model.DocumentReferenceModel;
import com.pccube.espd.model.EconomicOperatorPartyModel;
import com.pccube.espd.model.EvidenceModel;
import com.pccube.espd.model.IDModel;
import com.pccube.espd.model.ProcedureCodeModel;
import com.pccube.espd.model.ProcurementProjectLotModel;
import com.pccube.espd.model.ProcurementProjectModel;
import com.pccube.espd.model.ProfileExecutionIDModel;
import com.pccube.espd.model.ProfileIDModel;
import com.pccube.espd.model.QualificationApplicationResponseModel;
import com.pccube.espd.model.QualificationApplicationTypeCodeModel;
import com.pccube.espd.model.TenderingCriterionModel;
import com.pccube.espd.model.TenderingCriterionResponseModel;
import com.pccube.espd.model.UUIDModel;
import com.pccube.espd.model.VersionIDModel;
import com.pccube.espd.model.WeightingTypeCodeModel;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EvidenceType;
import oasis.names.specification.ubl.schema.xsd.qualificationapplicationresponse_2.QualificationApplicationResponseType;

/**
 * Transforms a {@link QualificationApplicationResponseModel} into a {@link QualificationApplicationResponseType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
@Component
public class UblTransformerResponseFactory extends GenericTransformerFactory {

	public UblTransformerResponseFactory() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
     * Transforms a {@link QualificationApplicationResponseModel} into a {@link QualificationApplicationResponseType} .
     * 
     * @param responseModel An entity containing the information writing on the XML response file.
     *
     * @return The XML object structure of an ESPD Response
     * 
	 * @throws ParseException 
	 * @throws IllegalAccessException 
     */
	public QualificationApplicationResponseType generateQualificationApplicationResponseType(QualificationApplicationResponseModel responseModel) throws ParseException, IllegalAccessException {
		
		GenericFactory.isInit = false;
		GenericFactory.isResponse = true;
		GenericFactory.fromRequest = false;

		QualificationApplicationResponseType responseType = new QualificationApplicationResponseType();
		
		addUBLVersionID(responseType, responseModel.getUblVersionIDModel());
		
		addCustomizationID(responseType, responseModel.getCustomizationIDModel());
		
		addProfileID(responseType, responseModel.getProfileIDModel());
		
		addProfileExecutionID(responseType, responseModel.getProfileExecutionIDModel());
		
		addID(responseType, responseModel.getIdModel());
		
		addCopyIndicator(responseType, responseModel.isCopyIndicator());
		
		addUUID(responseType, responseModel.getUuidModel());
		
		addContractFolderID(responseType, responseModel.getContractFolderIDModel());
		
		addIssueDate(responseType, responseModel.getDate());
		
		addIssueTime(responseType, responseModel.getTime());
		
		addVersionID(responseType, responseModel.getVersionIDModel());
		
		addPreviousVersionID(responseType, responseModel.getVersionIDModel());
		
		addProcedureCode(responseType, responseModel.getProcedureCodeModel());
		
		addQualificationApplicationTypeCode(responseType, responseModel.getQualificationApplicationTypeCodeModel());
		
		/*addWeightScoringMethodologyNote(responseType, responseModel.getWeightScoringMethodologyNotes());
		
		addWeightingTypeCode(responseType, responseModel.getWeightingTypeCodeModel());*/
		
		addAdditionalDocumentReference(responseType, responseModel.getAdditionalDocumentReferenceModels());
			
		addContractingParty(responseType, responseModel.getContractingPartyModels());
		
		addProcurementProject(responseType, responseModel.getProcurementProjectModel());
		
		addProcurementProjectLot(responseType, responseModel.getProcurementProjectLotModels());
		
		addEconomicOperatorParty(responseType, responseModel.getEconomicOperatorPartyModels());
		
		addTenderingCriterion(responseType, responseModel.getTenderingCriterionModels());
		
		addTenderingCriterionResponse(responseType);
		
		addEvidence(responseType);
				
		return responseType;
	}
	
	private void addUBLVersionID(QualificationApplicationResponseType responseType, VersionIDModel ublVersionIDModel){
		responseType.setUBLVersionID(UblCommonBasicFactory.buildUblVersionIDType(ublVersionIDModel));
	}
	
	private void addCustomizationID(QualificationApplicationResponseType responseType, CustomizationIDModel customizationIDModel){
		responseType.setCustomizationID(UblCommonBasicFactory.buildCustomizationIDType(customizationIDModel));
	}
	
	private void addProfileID(QualificationApplicationResponseType responseType, ProfileIDModel profileModel){
		responseType.setProfileID(UblCommonBasicFactory.buildProfileIDType(profileModel));
	}

	private void addProfileExecutionID(QualificationApplicationResponseType responseType, ProfileExecutionIDModel profileExecutionModel){
		responseType.setProfileExecutionID(UblCommonBasicFactory.buildProfileExecutionIDType(profileExecutionModel));
	}
	
	private void addID(QualificationApplicationResponseType responseType, IDModel idModel){
		responseType.setID(UblCommonBasicFactory.buildIdType(idModel));	
	}
	
	private void addCopyIndicator(QualificationApplicationResponseType responseType, boolean copyIndicator){
		responseType.setCopyIndicator(UblCommonBasicFactory.buildCopyIndicatorType(copyIndicator));
	}
	
	private void addUUID(QualificationApplicationResponseType responseType, UUIDModel uuidModel){
		responseType.setUUID(UblCommonBasicFactory.buildUuidType(uuidModel));
	}
	
	private void addContractFolderID(QualificationApplicationResponseType responseType, ContractFolderIDModel contractFolderIDModel){
		responseType.setContractFolderID(UblCommonBasicFactory.buildContractFolderIDType(contractFolderIDModel));		
	}

	private void addIssueDate(QualificationApplicationResponseType responseType, Date when){
		responseType.setIssueDate(UblCommonBasicFactory.buildIssueDateType(when));			
	}
	
	private void addIssueTime(QualificationApplicationResponseType responseType, Date when){
		responseType.setIssueTime(UblCommonBasicFactory.buildIssueTimeType(when));			
	}
	
	private void addVersionID(QualificationApplicationResponseType responseType, VersionIDModel versionIDModel){
		responseType.setVersionID(UblCommonBasicFactory.buildVersionIDType(versionIDModel));	
	}
	
	private void addPreviousVersionID(QualificationApplicationResponseType responseType, VersionIDModel versionIDModel){
		responseType.setPreviousVersionID(UblCommonBasicFactory.buildPreviousVersionIDType(versionIDModel));	
	}
	
	private void addProcedureCode(QualificationApplicationResponseType responseType, ProcedureCodeModel procedureCodeModel){
		responseType.setProcedureCode(UblCommonBasicFactory.buildProcedureCodeType(procedureCodeModel));
	}

	private void addQualificationApplicationTypeCode(QualificationApplicationResponseType responseType, 
			QualificationApplicationTypeCodeModel qualificationCodeModel){
		responseType.setQualificationApplicationTypeCode(UblCommonBasicFactory.buildQualificationApplicationTypeCodeType(qualificationCodeModel));
	}

	@SuppressWarnings("unused")
	private void addWeightScoringMethodologyNote(QualificationApplicationResponseType responseType, List<String> notes){
		if(notes != null && notes.size() > 0){
			responseType.getWeightScoringMethodologyNote().addAll(
					UblCommonBasicFactory.buildWeightScoringMethodologyNoteTypes(notes));
		}
	}

	@SuppressWarnings("unused")
	private void addWeightingTypeCode(QualificationApplicationResponseType responseType, WeightingTypeCodeModel weightingCodeModel){
		responseType.setWeightingTypeCode(UblCommonBasicFactory.buildWeightingTypeCodeType(weightingCodeModel));
	}
	
	private void addAdditionalDocumentReference(QualificationApplicationResponseType responseType, List<DocumentReferenceModel> documentReferenceModels) throws ParseException, IllegalAccessException{
		if(documentReferenceModels != null && documentReferenceModels.size() > 0){
			responseType.getAdditionalDocumentReference().addAll(
					UblCommonAggregateFactory.buildDocumentReferenceTypes(documentReferenceModels));
		}
	}
	
	private void addContractingParty(QualificationApplicationResponseType responseType, List<ContractingPartyModel> contractingPartyModels) throws IllegalAccessException{
		if(contractingPartyModels != null && contractingPartyModels.size() > 0){
			responseType.getContractingParty().addAll(
					UblCommonAggregateFactory.buildContractingPartyType(contractingPartyModels));
		}
	}
	
	private void addProcurementProject(QualificationApplicationResponseType responseType, ProcurementProjectModel procurementProjectModel) throws IllegalAccessException{
		if (procurementProjectModel == null) {
			procurementProjectModel = initProcurementProjectModel();
		}

		responseType.setProcurementProject(UblCommonAggregateFactory.buildProcurementProjectType(procurementProjectModel));
	}
	
	private void addProcurementProjectLot(QualificationApplicationResponseType responseType, List<ProcurementProjectLotModel> procurementProjectLotModels) throws IllegalAccessException{
		if(procurementProjectLotModels != null && procurementProjectLotModels.size() > 0){
			responseType.getProcurementProjectLot().addAll(
					UblCommonAggregateFactory.buildProcurementProjectLotType(procurementProjectLotModels));
		}
	}
	
	private void addEconomicOperatorParty(QualificationApplicationResponseType responseType, List<EconomicOperatorPartyModel> economicOperatorPartyModels) throws IllegalAccessException{
		if(economicOperatorPartyModels != null && economicOperatorPartyModels.size() > 0){
			responseType.getEconomicOperatorParty().addAll(
					UblCommonAggregateFactory.buildEconomicOperatorPartyTypes(economicOperatorPartyModels));
		}
	}
	
	private void addTenderingCriterion(QualificationApplicationResponseType responseType, List<TenderingCriterionModel> tenderingCriterionModels) throws IllegalAccessException{
		if (tenderingCriterionModels != null && tenderingCriterionModels.size() > 0){	
			GenericFactory.tenderingCriterionResponseModels = new ArrayList<TenderingCriterionResponseModel>();
			GenericFactory.evidenceModels = new ArrayList<EvidenceModel>();
			responseType.getTenderingCriterion().addAll(
					UblCommonCriterionFactory.buildTenderingCriterionTypes(tenderingCriterionModels));
		}
	}
	
	private void addTenderingCriterionResponse(QualificationApplicationResponseType responseType) throws IllegalAccessException{
		if (GenericFactory.tenderingCriterionResponseModels != null && GenericFactory.tenderingCriterionResponseModels.size() > 0){
			responseType.getTenderingCriterionResponse().addAll(
					UblCommonCriterionFactory.buildTenderingCriterionResponseTypes(GenericFactory.tenderingCriterionResponseModels));
		}
	}

	private void addEvidence(QualificationApplicationResponseType responseType) throws ParseException, IllegalAccessException {
		if (GenericFactory.evidenceModels != null && GenericFactory.evidenceModels.size() > 0){
			List<EvidenceType> evidenceTypes = UblCommonAggregateFactory.buildEvidenceTypes(GenericFactory.evidenceModels);
			if (evidenceTypes != null && evidenceTypes.size() > 0) {
				responseType.getEvidence().addAll(evidenceTypes);
			}
		}
	}
	
}
