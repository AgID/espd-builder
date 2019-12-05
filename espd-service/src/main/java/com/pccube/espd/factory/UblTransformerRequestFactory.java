package com.pccube.espd.factory;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.pccube.espd.enums.Customization;
import com.pccube.espd.model.ContractFolderIDModel;
import com.pccube.espd.model.ContractingPartyModel;
import com.pccube.espd.model.CustomizationIDModel;
import com.pccube.espd.model.DocumentReferenceModel;
import com.pccube.espd.model.IDModel;
import com.pccube.espd.model.ProcedureCodeModel;
import com.pccube.espd.model.ProcurementProjectLotModel;
import com.pccube.espd.model.ProcurementProjectModel;
import com.pccube.espd.model.ProfileExecutionIDModel;
import com.pccube.espd.model.ProfileIDModel;
import com.pccube.espd.model.QualificationApplicationRequestModel;
import com.pccube.espd.model.QualificationApplicationTypeCodeModel;
import com.pccube.espd.model.TenderingCriterionModel;
import com.pccube.espd.model.UUIDModel;
import com.pccube.espd.model.VersionIDModel;
import com.pccube.espd.model.WeightingTypeCodeModel;
import com.pccube.espd.utility.UtilityManager;

import oasis.names.specification.ubl.schema.xsd.qualificationapplicationrequest_2.QualificationApplicationRequestType;

/**
 * Transforms a {@link QualificationApplicationRequestModel} into a {@link QualificationApplicationRequestType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
@Component
public class UblTransformerRequestFactory extends GenericTransformerFactory {

	public UblTransformerRequestFactory() {
		// TODO Auto-generated constructor stub
	}
	
	/**
     * Transforms a {@link QualificationApplicationRequestModel} into a {@link QualificationApplicationRequestType} .
     * 
     * @param requestModel An entity containing the information writing on the XML request file.
     *
     * @return The XML object structure of an ESPD Request
     * 
	 * @throws ParseException 
	 * @throws IllegalAccessException  
     */
	public QualificationApplicationRequestType generateQualificationApplicationRequestType(QualificationApplicationRequestModel requestModel) throws ParseException, IllegalAccessException {
		
		GenericFactory.isInit = false;
		GenericFactory.isResponse = false;
		GenericFactory.fromRequest = false;
		
		QualificationApplicationRequestType requestType = new QualificationApplicationRequestType();
		
		addUBLVersionID(requestType, requestModel.getUblVersionIDModel());
		
		addCustomizationID(requestType, requestModel.getCustomizationIDModel());
		
		addProfileID(requestType, requestModel.getProfileIDModel());
		
		addProfileExecutionID(requestType, requestModel.getProfileExecutionIDModel());
		
		addID(requestType, requestModel.getIdModel());
		
		addCopyIndicator(requestType, requestModel.isCopyIndicator());
		
		addUUID(requestType, requestModel.getUuidModel());
		
		addContractFolderID(requestType, requestModel.getContractFolderIDModel());
		
		addIssueDate(requestType, requestModel.getDate());
		
		addIssueTime(requestType, requestModel.getTime());
		
		addVersionID(requestType, requestModel.getVersionIDModel());
		
		addPreviousVersionID(requestType, requestModel.getVersionIDModel());
		
		addProcedureCode(requestType, requestModel.getProcedureCodeModel());
		
		addQualificationApplicationTypeCode(requestType, requestModel.getQualificationApplicationTypeCodeModel());
		
		/*addWeightScoringMethodologyNote(requestType, requestModel.getWeightScoringMethodologyNotes());
		
		addWeightingTypeCode(requestType, requestModel.getWeightingTypeCodeModel());*/
		
		addAdditionalDocumentReference(requestType, requestModel.getAdditionalDocumentReferenceModels());
			
		addContractingParty(requestType, requestModel.getContractingPartyModels());
		
		addProcurementProject(requestType, requestModel.getProcurementProjectModel());
		
		addProcurementProjectLot(requestType, requestModel.getProcurementProjectLotModels());
		
		addTenderingCriterion(requestType, requestModel.getTenderingCriterionModels());
		
		return requestType;
	}
	
	private void addUBLVersionID(QualificationApplicationRequestType requestType, VersionIDModel ublVersionIDModel){
		if (ublVersionIDModel == null) {
			ublVersionIDModel = initUblVersionIDModel();
		}
		
		requestType.setUBLVersionID(UblCommonBasicFactory.buildUblVersionIDType(ublVersionIDModel));
	}
	
	private void addCustomizationID(QualificationApplicationRequestType requestType, CustomizationIDModel customizationIDModel){
		if (customizationIDModel == null) {
			customizationIDModel = initCustomizationIDModel(Customization.REQUEST);
		}
		
		requestType.setCustomizationID(UblCommonBasicFactory.buildCustomizationIDType(customizationIDModel));
	}
	
	private void addProfileID(QualificationApplicationRequestType requestType, ProfileIDModel profileModel){
		if (profileModel == null) {
			profileModel = initProfileIDModel();
		}
		
		requestType.setProfileID(UblCommonBasicFactory.buildProfileIDType(profileModel));
	}

	private void addProfileExecutionID(QualificationApplicationRequestType requestType, ProfileExecutionIDModel profileExecutionModel){
		if (profileExecutionModel == null) {
			profileExecutionModel = initProfileExecutionIDModel();
		}
		
		requestType.setProfileExecutionID(UblCommonBasicFactory.buildProfileExecutionIDType(profileExecutionModel));
	}
	
	private void addID(QualificationApplicationRequestType requestType, IDModel idModel){
		if (idModel == null) {
			idModel = initIDModel(Customization.REQUEST);
		}

		requestType.setID(UblCommonBasicFactory.buildIdType(idModel));	
	}
	
	private void addCopyIndicator(QualificationApplicationRequestType requestType, boolean copyIndicator){
		requestType.setCopyIndicator(UblCommonBasicFactory.buildCopyIndicatorType(copyIndicator));
	}
	
	private void addUUID(QualificationApplicationRequestType requestType, UUIDModel uuidModel){
		if (uuidModel == null) {
			uuidModel = initUUIDModel();
		}
		
		requestType.setUUID(UblCommonBasicFactory.buildUuidType(uuidModel));
	}
	
	private void addContractFolderID(QualificationApplicationRequestType requestType, ContractFolderIDModel contractFolderIDModel){
		if (contractFolderIDModel == null) {
			contractFolderIDModel = initContractFolderIDModel();
		}
		
		requestType.setContractFolderID(UblCommonBasicFactory.buildContractFolderIDType(contractFolderIDModel));		
	}

	private void addIssueDate(QualificationApplicationRequestType requestType, Date when){
		requestType.setIssueDate(UblCommonBasicFactory.buildIssueDateType(when));			
	}
	
	private void addIssueTime(QualificationApplicationRequestType requestType, Date when){
		requestType.setIssueTime(UblCommonBasicFactory.buildIssueTimeType(when));			
	}
	
	private void addVersionID(QualificationApplicationRequestType requestType, VersionIDModel versionIDModel){
		if (versionIDModel != null && versionIDModel.isReloaded()) {
			versionIDModel.setVersionID(UtilityManager.changeVersion(versionIDModel.getVersionID(), 1, false));
		} else { 
			versionIDModel = initVersionIDModel();
		}
		
		requestType.setVersionID(UblCommonBasicFactory.buildVersionIDType(versionIDModel));	
	}
	
	private void addPreviousVersionID(QualificationApplicationRequestType requestType, VersionIDModel versionIDModel){
		if (versionIDModel != null && versionIDModel.isReloaded() && StringUtils.isNotEmpty(versionIDModel.getVersionID())) {
			versionIDModel.setPreviousVersionID(versionIDModel.getVersionID());
		}
			
		requestType.setPreviousVersionID(UblCommonBasicFactory.buildPreviousVersionIDType(versionIDModel));	
	}
	
	private void addProcedureCode(QualificationApplicationRequestType requestType, ProcedureCodeModel procedureCodeModel){
		if (procedureCodeModel == null) {
			procedureCodeModel = initProcedureCodeModel();
		}
			
		requestType.setProcedureCode(UblCommonBasicFactory.buildProcedureCodeType(procedureCodeModel));
	}

	private void addQualificationApplicationTypeCode(QualificationApplicationRequestType requestType, 
			QualificationApplicationTypeCodeModel qualificationCodeModel){
		if (qualificationCodeModel == null) {
			qualificationCodeModel = initQualificationApplicationTypeCodeModel();
		}
			
		requestType.setQualificationApplicationTypeCode(UblCommonBasicFactory.buildQualificationApplicationTypeCodeType(qualificationCodeModel));
	}

	@SuppressWarnings("unused")
	private void addWeightScoringMethodologyNote(QualificationApplicationRequestType requestType, List<String> notes){
		if(notes != null && notes.size() > 0){
			requestType.getWeightScoringMethodologyNote().addAll(
					UblCommonBasicFactory.buildWeightScoringMethodologyNoteTypes(notes));
		}
	}

	@SuppressWarnings("unused")
	private void addWeightingTypeCode(QualificationApplicationRequestType requestType, WeightingTypeCodeModel weightingCodeModel){
		if (weightingCodeModel == null) {
			weightingCodeModel = initWeightingTypeCodeModel();
		}
			
		requestType.setWeightingTypeCode(UblCommonBasicFactory.buildWeightingTypeCodeType(weightingCodeModel));
	}
	
	private void addAdditionalDocumentReference(QualificationApplicationRequestType requestType, List<DocumentReferenceModel> documentReferenceModels) throws ParseException, IllegalAccessException {
		if(documentReferenceModels != null && documentReferenceModels.size() > 0){
			requestType.getAdditionalDocumentReference().addAll(
					UblCommonAggregateFactory.buildDocumentReferenceTypes(documentReferenceModels));
		}
	}
	
	private void addContractingParty(QualificationApplicationRequestType requestType, List<ContractingPartyModel> contractingPartyModels) throws IllegalAccessException{
		if (contractingPartyModels != null && contractingPartyModels.size() > 0){
			requestType.getContractingParty().addAll(
					UblCommonAggregateFactory.buildContractingPartyType(contractingPartyModels));
		}
	}
	
	private void addProcurementProject(QualificationApplicationRequestType requestType, ProcurementProjectModel procurementProjectModel) throws IllegalAccessException{
		if (procurementProjectModel == null) {
			procurementProjectModel = initProcurementProjectModel();
		}
		
		requestType.setProcurementProject(UblCommonAggregateFactory.buildProcurementProjectType(procurementProjectModel));
	}
	
	private void addProcurementProjectLot(QualificationApplicationRequestType requestType, List<ProcurementProjectLotModel> procurementProjectLotModels) throws IllegalAccessException{
		if (procurementProjectLotModels != null && procurementProjectLotModels.size() > 0){
			requestType.getProcurementProjectLot().addAll(
					UblCommonAggregateFactory.buildProcurementProjectLotType(procurementProjectLotModels));
		}
	}
	
	private void addTenderingCriterion(QualificationApplicationRequestType requestType, List<TenderingCriterionModel> tenderingCriterionModels) throws IllegalAccessException{
		if (tenderingCriterionModels != null && tenderingCriterionModels.size() > 0){
			requestType.getTenderingCriterion().addAll(
					UblCommonCriterionFactory.buildTenderingCriterionTypes(tenderingCriterionModels));
		}
	}
}
