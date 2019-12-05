package com.pccube.espd.factory;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pccube.espd.config.VariableConfiguration;
import com.pccube.espd.enums.Customization;
import com.pccube.espd.model.QualificationApplicationRequestModel;
import com.pccube.espd.model.TenderingCriterionModel;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ContractingPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DocumentReferenceType;
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

/**
 * Transforms a {@link QualificationApplicationRequestType} into a {@link QualificationApplicationRequestModel}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
@Component
public class BeanTransformerRequestFactory extends GenericTransformerFactory {

	@Autowired
	private MarshallerCriteriaFactory marshallerCriteriaFactory;

	@Autowired
	private VariableConfiguration variableConfiguration;

	public BeanTransformerRequestFactory() {
		// TODO Auto-generated constructor stub
	}
	
	/**
     * Create a {@link QualificationApplicationRequestModel}.
     *
     * @return An entity containing the basic information for the XML request file.
     */
	public QualificationApplicationRequestModel createQualificationApplicationRequestModel() {
		
		GenericFactory.isInit = true;
		GenericFactory.isResponse = false;
		GenericFactory.fromRequest = false;
		
		QualificationApplicationRequestModel requestModel = new QualificationApplicationRequestModel(GenericFactory.isInit);
		
		createUBLVersionID(requestModel);
		
		createCustomizationID(requestModel);

		createProfileID(requestModel);

		createProfileExecutionID(requestModel);

		createID(requestModel);

		createUUID(requestModel);

		createContractFolderID(requestModel);

		createVersionID(requestModel);

		createProcedureCode(requestModel);

		createQualificationApplicationTypeCode(requestModel);

		//createWeightingTypeCode(requestModel);
		
		createAdditionalDocumentReference(requestModel);
		
		createContractingParty(requestModel);
		
		createProcurementProject(requestModel);
		
		return requestModel;
	}
	
	private void createUBLVersionID(QualificationApplicationRequestModel requestModel){
		requestModel.setUblVersionIDModel(initUblVersionIDModel());
	}
	
	private void createCustomizationID(QualificationApplicationRequestModel requestModel){
		requestModel.setCustomizationIDModel(initCustomizationIDModel(Customization.REQUEST));
	}
	
	private void createProfileID(QualificationApplicationRequestModel requestModel){
		requestModel.setProfileIDModel(initProfileIDModel());
	}
	
	private void createProfileExecutionID(QualificationApplicationRequestModel requestModel){
		requestModel.setProfileExecutionIDModel(initProfileExecutionIDModel());
	}
	
	private void createID(QualificationApplicationRequestModel requestModel){
		requestModel.setIdModel(initIDModel(Customization.REQUEST));
	}
	
	private void createUUID(QualificationApplicationRequestModel requestModel){
		requestModel.setUuidModel(initUUIDModel());
	}
	
	private void createContractFolderID(QualificationApplicationRequestModel requestModel){
		requestModel.setContractFolderIDModel(initContractFolderIDModel());
	}
	
	private void createVersionID(QualificationApplicationRequestModel requestModel){
		requestModel.setVersionIDModel(initVersionIDModel());
	}
	
	private void createProcedureCode(QualificationApplicationRequestModel requestModel){
		requestModel.setProcedureCodeModel(initProcedureCodeModel());
	}
	
	private void createQualificationApplicationTypeCode(QualificationApplicationRequestModel requestModel){
		requestModel.setQualificationApplicationTypeCodeModel(initQualificationApplicationTypeCodeModel());
	}
	
	@SuppressWarnings("unused")
	private void createWeightingTypeCode(QualificationApplicationRequestModel requestModel){
		requestModel.setWeightingTypeCodeModel(initWeightingTypeCodeModel());
	}
	
	private void createAdditionalDocumentReference(QualificationApplicationRequestModel requestModel){
		requestModel.getAdditionalDocumentReferenceModels().add(initDocumentReferenceModel());
	}
	
	private void createContractingParty(QualificationApplicationRequestModel requestModel){
		requestModel.getContractingPartyModels().add(initContractingPartyModel());
	}
	
	private void createProcurementProject(QualificationApplicationRequestModel requestModel){
		requestModel.setProcurementProjectModel(initProcurementProjectModel());
	}

	
	/**
     * Create a {@link TenderingCriterionModel} list.
     *
     * @param criterionKeys The keys of criteria required.
     * 
     * @return An list containing the criteria required.
     * 
	 * @throws ParseException 
	 * @throws IllegalAccessException 
     */
	public List<TenderingCriterionModel> createTenderingCriterion(List<String> criterionKeys) throws ParseException, IllegalAccessException{
		
		GenericFactory.isInit = true;
		GenericFactory.isResponse = false;
		GenericFactory.fromRequest = false;
		
		List<TenderingCriterionModel> tenderingCriterionModels = null;
		
		List<TenderingCriterionType> tenderingCriterionTypes = new ArrayList<TenderingCriterionType>();
		tenderingCriterionTypes.addAll(variableConfiguration.itemCriteriaCustom.getCriteriaRequest());
		
		List<TenderingCriterionType> filteredTenderingCriterionTypes = 
				marshallerCriteriaFactory.filterRequestCriteria(tenderingCriterionTypes, criterionKeys);
		
		if (filteredTenderingCriterionTypes != null && filteredTenderingCriterionTypes.size() > 0) {
			tenderingCriterionModels = BeanCommonCriterionFactory.buildTenderingCriterionModels(filteredTenderingCriterionTypes);
		}
		
		return tenderingCriterionModels;
	}

	/**
     * Transforms a {@link QualificationApplicationRequestType} into a {@link QualificationApplicationRequestModel} .
     * 
     * @param requestType The XML object structure of an ESPD Request.
     *
     * @return An entity containing the information coming from the XML request file.
     * 
	 * @throws ParseException 
	 * @throws IllegalAccessException 
     */
	public QualificationApplicationRequestModel generateQualificationApplicationRequestModel(QualificationApplicationRequestType requestType) throws ParseException, IllegalAccessException{
		
		GenericFactory.isInit = false;
		GenericFactory.isResponse = false;
		GenericFactory.fromRequest = false;
		
		QualificationApplicationRequestModel requestModel = new QualificationApplicationRequestModel();
		
		addUBLVersionID(requestModel, requestType.getUBLVersionID());
		
		addCustomizationID(requestModel, requestType.getCustomizationID());
		
		addProfileID(requestModel, requestType.getProfileID());
		
		addProfileExecutionID(requestModel, requestType.getProfileExecutionID());
		
		addID(requestModel, requestType.getID());
		
		addCopyIndicator(requestModel, requestType.getCopyIndicator());
		
		addUUID(requestModel, requestType.getUUID());
		
		addContractFolderID(requestModel, requestType.getContractFolderID());
		
		addDate(requestModel, requestType.getIssueDate());
		
		addTime(requestModel, requestType.getIssueTime());
		
		addVersionID(requestModel, requestType.getVersionID());
		
		addPreviousVersionID(requestModel, requestType.getPreviousVersionID());
		
		addProcedureCode(requestModel, requestType.getProcedureCode());
		
		addQualificationApplicationTypeCode(requestModel, requestType.getQualificationApplicationTypeCode());
		
		/*addWeightScoringMethodologyNote(requestModel, requestType.getWeightScoringMethodologyNote());
		
		addWeightingTypeCode(requestModel, requestType.getWeightingTypeCode());*/
		
		addAdditionalDocumentReference(requestModel, requestType.getAdditionalDocumentReference());
			
		addContractingParty(requestModel, requestType.getContractingParty());
		
		addProcurementProject(requestModel, requestType.getProcurementProject());
		
		addProcurementProjectLot(requestModel, requestType.getProcurementProjectLot());
		
		addTenderingCriterion(requestModel, requestType.getTenderingCriterion());
		
		return requestModel;
	}
	
	private void addUBLVersionID(QualificationApplicationRequestModel requestModel, UBLVersionIDType ublVersionIDType){
		requestModel.setUblVersionIDModel(BeanCommonBasicFactory.buildUblVersionIDModel(ublVersionIDType));
	}
	
	private void addCustomizationID(QualificationApplicationRequestModel requestModel, CustomizationIDType customizationIDType){
		requestModel.setCustomizationIDModel(BeanCommonBasicFactory.buildCustomizationIDModel(customizationIDType));
	}
	
	private void addProfileID(QualificationApplicationRequestModel requestModel, ProfileIDType profileIDType){
		requestModel.setProfileIDModel(BeanCommonBasicFactory.buildProfileIDModel(profileIDType));
	}

	private void addProfileExecutionID(QualificationApplicationRequestModel requestModel, ProfileExecutionIDType profileExecutionType){
		requestModel.setProfileExecutionIDModel(BeanCommonBasicFactory.buildProfileExecutionIDModel(profileExecutionType));	
	}
	
	private void addID(QualificationApplicationRequestModel requestModel, IDType idType){
		requestModel.setIdModel(BeanCommonBasicFactory.buildIdModel(idType));	
	}
	
	private void addCopyIndicator(QualificationApplicationRequestModel requestModel, CopyIndicatorType copyIndicatorType){
		requestModel.setCopyIndicator(BeanCommonBasicFactory.buildCopyIndicator(copyIndicatorType));
	}
	
	private void addUUID(QualificationApplicationRequestModel requestModel, UUIDType uuidType){
		requestModel.setUuidModel(BeanCommonBasicFactory.buildUuidModel(uuidType));
	}
	
	private void addContractFolderID(QualificationApplicationRequestModel requestModel, ContractFolderIDType contractFolderIDType){
		requestModel.setContractFolderIDModel(BeanCommonBasicFactory.buildContractFolderIDModel(contractFolderIDType));		
	}

	private void addDate(QualificationApplicationRequestModel requestModel, IssueDateType issueDateType) throws ParseException{
		requestModel.setDate(BeanCommonBasicFactory.buildDate(issueDateType));			
	}
	
	private void addTime(QualificationApplicationRequestModel requestModel, IssueTimeType issueTimeType) throws ParseException{
		requestModel.setTime(BeanCommonBasicFactory.buildTime(issueTimeType));			
	}
	
	private void addVersionID(QualificationApplicationRequestModel requestModel, VersionIDType versionIDType){
		requestModel.setVersionIDModel(BeanCommonBasicFactory.buildVersionIDModel(versionIDType));	
	}
	
	private void addPreviousVersionID(QualificationApplicationRequestModel requestModel, PreviousVersionIDType previousVersionIDType){
		requestModel.setPreviousVersionIDModel(BeanCommonBasicFactory.buildPreviousVersionIDModel(previousVersionIDType));	
	}
	
	private void addProcedureCode(QualificationApplicationRequestModel requestModel, ProcedureCodeType procedureCodeType){
		requestModel.setProcedureCodeModel(BeanCommonBasicFactory.buildProcedureCodeModel(procedureCodeType));
	}

	private void addQualificationApplicationTypeCode(QualificationApplicationRequestModel requestModel, 
			QualificationApplicationTypeCodeType qualificationCodeType){
		requestModel.setQualificationApplicationTypeCodeModel(
				BeanCommonBasicFactory.buildQualificationApplicationTypeCodeModel(qualificationCodeType));
	}

	@SuppressWarnings("unused")
	private void addWeightScoringMethodologyNote(QualificationApplicationRequestModel requestModel, List<WeightScoringMethodologyNoteType> weightScoringMethodologyNoteTypes){
		requestModel.setWeightScoringMethodologyNotes(
				BeanCommonBasicFactory.buildWeightScoringMethodologyNotes(weightScoringMethodologyNoteTypes));
	}

	@SuppressWarnings("unused")
	private void addWeightingTypeCode(QualificationApplicationRequestModel requestModel, WeightingTypeCodeType weightingCodeType){
		requestModel.setWeightingTypeCodeModel(
				BeanCommonBasicFactory.buildWeightingTypeCodeModel(weightingCodeType));
	}
	
	private void addAdditionalDocumentReference(QualificationApplicationRequestModel requestModel, List<DocumentReferenceType> documentReferenceTypes) throws ParseException, IllegalAccessException {
		if(documentReferenceTypes != null && documentReferenceTypes.size() > 0){
			requestModel.getAdditionalDocumentReferenceModels().addAll(
					BeanCommonAggregateFactory.buildDocumentReferenceModels(documentReferenceTypes));
		}
	}
	
	private void addContractingParty(QualificationApplicationRequestModel requestModel, List<ContractingPartyType> contractingPartyTypes) throws ParseException, IllegalAccessException {
		if(contractingPartyTypes != null && contractingPartyTypes.size() > 0){
			requestModel.getContractingPartyModels().addAll(
					BeanCommonAggregateFactory.buildContractingPartyModels(contractingPartyTypes));
		}
	}
	
	private void addProcurementProject(QualificationApplicationRequestModel requestModel, ProcurementProjectType procurementProjectType) throws IllegalAccessException {
		if (procurementProjectType != null) {
			requestModel.setProcurementProjectModel(BeanCommonAggregateFactory.buildProcurementProjectModel(procurementProjectType));
		} else {
			requestModel.setProcurementProjectModel(initProcurementProjectModel());
		}
	}

	
	private void addProcurementProjectLot(QualificationApplicationRequestModel requestModel, List<ProcurementProjectLotType> procurementProjectLotTypes) throws IllegalAccessException {
		if (procurementProjectLotTypes != null && procurementProjectLotTypes.size() > 0){
			requestModel.getProcurementProjectLotModels().addAll(
					BeanCommonAggregateFactory.buildProcurementProjectLotModels(procurementProjectLotTypes));
		}
	}
	
	private void addTenderingCriterion(QualificationApplicationRequestModel requestModel, List<TenderingCriterionType> tenderingCriterionTypes) throws ParseException, IllegalAccessException {
		if (tenderingCriterionTypes != null && tenderingCriterionTypes.size() > 0){
			requestModel.getTenderingCriterionModels().addAll(
					BeanCommonCriterionFactory.buildTenderingCriterionModels(tenderingCriterionTypes));
		}
	}
}
