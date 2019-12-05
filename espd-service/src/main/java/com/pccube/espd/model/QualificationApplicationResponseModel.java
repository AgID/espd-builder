package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import oasis.names.specification.ubl.schema.xsd.qualificationapplicationresponse_2.QualificationApplicationResponseType;

/**
 * Corresponding to {@link QualificationApplicationResponseType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class QualificationApplicationResponseModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private VersionIDModel ublVersionIDModel;
	private CustomizationIDModel customizationIDModel;
	private ProfileIDModel profileIDModel;
	private ProfileExecutionIDModel profileExecutionIDModel;
	private IDModel idModel;
	private boolean copyIndicator;
	private UUIDModel uuidModel;
	private ContractFolderIDModel contractFolderIDModel;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date date;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date time;
	private VersionIDModel versionIDModel;
	private VersionIDModel previousVersionIDModel;
	private ProcedureCodeModel procedureCodeModel;
	private QualificationApplicationTypeCodeModel qualificationApplicationTypeCodeModel;
	private List<String> weightScoringMethodologyNotes;
	private WeightingTypeCodeModel weightingTypeCodeModel;
	private List<ContractingPartyModel> contractingPartyModels;
	private ProcurementProjectModel procurementProjectModel;
	private List<ProcurementProjectLotModel> procurementProjectLotModels;
	private List<DocumentReferenceModel> additionalDocumentReferenceModels;
	private List<TenderingCriterionModel> tenderingCriterionModels;
	private List<EconomicOperatorPartyModel> economicOperatorPartyModels;
	private List<TenderingCriterionResponseModel> tenderingCriterionResponseModels;
	private List<EvidenceModel> evidenceModels;

	
	/**
	 * constructor
	 */
	public QualificationApplicationResponseModel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor with init
	 */
	public QualificationApplicationResponseModel(boolean init) {
		if (init) {
			this.ublVersionIDModel = new VersionIDModel();
			this.customizationIDModel = new CustomizationIDModel();
			this.profileIDModel = new ProfileIDModel();
			this.profileExecutionIDModel = new ProfileExecutionIDModel();
			this.idModel = new IDModel();
			this.copyIndicator = false;
			this.uuidModel = new UUIDModel();
			this.contractFolderIDModel = new ContractFolderIDModel();
			this.date = null;
			this.time = null;
			this.versionIDModel = new VersionIDModel();
			this.previousVersionIDModel = new VersionIDModel();
			this.procedureCodeModel = new ProcedureCodeModel();
			this.qualificationApplicationTypeCodeModel = new QualificationApplicationTypeCodeModel();
			this.weightScoringMethodologyNotes = new ArrayList<String>();
			this.weightingTypeCodeModel = new WeightingTypeCodeModel();
			this.contractingPartyModels = new ArrayList<ContractingPartyModel>();
			this.procurementProjectModel = new ProcurementProjectModel();
			this.procurementProjectLotModels = new ArrayList<ProcurementProjectLotModel>();
			this.additionalDocumentReferenceModels = new ArrayList<DocumentReferenceModel>();
			this.tenderingCriterionModels = new ArrayList<TenderingCriterionModel>();
			this.economicOperatorPartyModels = new ArrayList<EconomicOperatorPartyModel>();
			this.tenderingCriterionResponseModels = new ArrayList<TenderingCriterionResponseModel>();
			this.evidenceModels = new ArrayList<EvidenceModel>();
		}
	}
	
	
	public VersionIDModel getUblVersionIDModel() {
		return ublVersionIDModel;
	}
	public void setUblVersionIDModel(VersionIDModel ublVersionIDModel) {
		this.ublVersionIDModel = ublVersionIDModel;
	}
	public CustomizationIDModel getCustomizationIDModel() {
		return customizationIDModel;
	}
	public void setCustomizationIDModel(CustomizationIDModel customizationIDModel) {
		this.customizationIDModel = customizationIDModel;
	}
	public ProfileIDModel getProfileIDModel() {
		return profileIDModel;
	}
	public void setProfileIDModel(ProfileIDModel profileIDModel) {
		this.profileIDModel = profileIDModel;
	}
	public ProfileExecutionIDModel getProfileExecutionIDModel() {
		return profileExecutionIDModel;
	}
	public void setProfileExecutionIDModel(ProfileExecutionIDModel profileExecutionIDModel) {
		this.profileExecutionIDModel = profileExecutionIDModel;
	}
	public IDModel getIdModel() {
		return idModel;
	}
	public void setIdModel(IDModel idModel) {
		this.idModel = idModel;
	}
	public boolean isCopyIndicator() {
		return copyIndicator;
	}
	public void setCopyIndicator(boolean copyIndicator) {
		this.copyIndicator = copyIndicator;
	}
	public UUIDModel getUuidModel() {
		return uuidModel;
	}
	public void setUuidModel(UUIDModel uuidModel) {
		this.uuidModel = uuidModel;
	}
	public ContractFolderIDModel getContractFolderIDModel() {
		return contractFolderIDModel;
	}
	public void setContractFolderIDModel(ContractFolderIDModel contractFolderIDModel) {
		this.contractFolderIDModel = contractFolderIDModel;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public VersionIDModel getVersionIDModel() {
		return versionIDModel;
	}
	public void setVersionIDModel(VersionIDModel versionIDModel) {
		this.versionIDModel = versionIDModel;
	}
	public VersionIDModel getPreviousVersionIDModel() {
		return previousVersionIDModel;
	}
	public void setPreviousVersionIDModel(VersionIDModel previousVersionIDModel) {
		this.previousVersionIDModel = previousVersionIDModel;
	}
	public ProcedureCodeModel getProcedureCodeModel() {
		return procedureCodeModel;
	}
	public void setProcedureCodeModel(ProcedureCodeModel procedureCodeModel) {
		this.procedureCodeModel = procedureCodeModel;
	}
	public QualificationApplicationTypeCodeModel getQualificationApplicationTypeCodeModel() {
		return qualificationApplicationTypeCodeModel;
	}
	public void setQualificationApplicationTypeCodeModel(
			QualificationApplicationTypeCodeModel qualificationApplicationTypeCodeModel) {
		this.qualificationApplicationTypeCodeModel = qualificationApplicationTypeCodeModel;
	}
	public List<String> getWeightScoringMethodologyNotes() {
		if (weightScoringMethodologyNotes == null)
			weightScoringMethodologyNotes = new ArrayList<String>();
		return weightScoringMethodologyNotes;
	}
	public void setWeightScoringMethodologyNotes(List<String> weightScoringMethodologyNotes) {
		this.weightScoringMethodologyNotes = weightScoringMethodologyNotes;
	}
	public WeightingTypeCodeModel getWeightingTypeCodeModel() {
		return weightingTypeCodeModel;
	}
	public void setWeightingTypeCodeModel(WeightingTypeCodeModel weightingTypeCodeModel) {
		this.weightingTypeCodeModel = weightingTypeCodeModel;
	}
	public List<ContractingPartyModel> getContractingPartyModels() {
		if (contractingPartyModels == null)
			contractingPartyModels = new ArrayList<ContractingPartyModel>();
		return contractingPartyModels;
	}
	public void setContractingPartyModels(List<ContractingPartyModel> contractingPartyModels) {
		this.contractingPartyModels = contractingPartyModels;
	}
	public ProcurementProjectModel getProcurementProjectModel() {
		return procurementProjectModel;
	}
	public void setProcurementProjectModel(ProcurementProjectModel procurementProjectModel) {
		this.procurementProjectModel = procurementProjectModel;
	}
	public List<ProcurementProjectLotModel> getProcurementProjectLotModels() {
		if (procurementProjectLotModels == null)
			procurementProjectLotModels = new ArrayList<ProcurementProjectLotModel>();
		return procurementProjectLotModels;
	}
	public void setProcurementProjectLotModels(List<ProcurementProjectLotModel> procurementProjectLotModels) {
		this.procurementProjectLotModels = procurementProjectLotModels;
	}
	public List<DocumentReferenceModel> getAdditionalDocumentReferenceModels() {
		if (additionalDocumentReferenceModels == null)
			additionalDocumentReferenceModels = new ArrayList<DocumentReferenceModel>();
		return additionalDocumentReferenceModels;
	}
	public void setAdditionalDocumentReferenceModels(List<DocumentReferenceModel> additionalDocumentReferenceModels) {
		this.additionalDocumentReferenceModels = additionalDocumentReferenceModels;
	}
	public List<TenderingCriterionModel> getTenderingCriterionModels() {
		if (tenderingCriterionModels == null)
			tenderingCriterionModels = new ArrayList<TenderingCriterionModel>();
		return tenderingCriterionModels;
	}
	public void setTenderingCriterionModels(List<TenderingCriterionModel> tenderingCriterionModels) {
		this.tenderingCriterionModels = tenderingCriterionModels;
	}
	public List<EconomicOperatorPartyModel> getEconomicOperatorPartyModels() {
		if (economicOperatorPartyModels == null)
			economicOperatorPartyModels = new ArrayList<EconomicOperatorPartyModel>();
		return economicOperatorPartyModels;
	}
	public void setEconomicOperatorPartyModels(List<EconomicOperatorPartyModel> economicOperatorPartyModels) {
		this.economicOperatorPartyModels = economicOperatorPartyModels;
	}

	public List<TenderingCriterionResponseModel> getTenderingCriterionResponseModels() {
		if (tenderingCriterionResponseModels == null)
			tenderingCriterionResponseModels = new ArrayList<TenderingCriterionResponseModel>();
		return tenderingCriterionResponseModels;
	}

	public void setTenderingCriterionResponseModels(List<TenderingCriterionResponseModel> tenderingCriterionResponseModels) {
		this.tenderingCriterionResponseModels = tenderingCriterionResponseModels;
	}

	public List<EvidenceModel> getEvidenceModels() {
		if (evidenceModels == null)
			evidenceModels = new ArrayList<EvidenceModel>();
		return evidenceModels;
	}

	public void setEvidenceModels(List<EvidenceModel> evidenceModels) {
		this.evidenceModels = evidenceModels;
	}
	
}
