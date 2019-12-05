package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EvidenceType;

/**
 * Corresponding to {@link EvidenceType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class EvidenceModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IDModel idModel;
	//EvidenceTypeCode Secondo specifiche della Comunità Europea, questa sezione viene sviluppata in futuro.
	private String name;
	private List<DescriptionModel> descriptionModels;
	private List<String> candidateStatements;
	private ConfidentialityLevelCodeModel confidentialityLevelCodeModel;
	private List<DocumentReferenceModel> documentReferenceModels;
	
	
	/**
	 * constructor
	 */
	public EvidenceModel() {
		this.idModel = new IDModel();
		this.descriptionModels = new ArrayList<DescriptionModel>();
		this.candidateStatements = new ArrayList<String>();
		this.confidentialityLevelCodeModel = new ConfidentialityLevelCodeModel();
		this.documentReferenceModels = new ArrayList<DocumentReferenceModel>();
	}
	
	
	public IDModel getIdModel() {
		return idModel;
	}
	public void setIdModel(IDModel idModel) {
		this.idModel = idModel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<DescriptionModel> getDescriptionModels() {
		if (descriptionModels == null)
			descriptionModels = new ArrayList<DescriptionModel>();
		return descriptionModels;
	}
	public void setDescriptionModels(List<DescriptionModel> descriptionModels) {
		this.descriptionModels = descriptionModels;
	}
	public List<String> getCandidateStatements() {
		if (candidateStatements == null)
			candidateStatements = new ArrayList<String>();
		return candidateStatements;
	}
	public void setCandidateStatements(List<String> candidateStatements) {
		this.candidateStatements = candidateStatements;
	}
	public ConfidentialityLevelCodeModel getConfidentialityLevelCodeModel() {
		return confidentialityLevelCodeModel;
	}
	public void setConfidentialityLevelCodeModel(ConfidentialityLevelCodeModel confidentialityLevelCodeModel) {
		this.confidentialityLevelCodeModel = confidentialityLevelCodeModel;
	}
	public List<DocumentReferenceModel> getDocumentReferenceModels() {
		if (documentReferenceModels == null)
			documentReferenceModels = new ArrayList<DocumentReferenceModel>();
		return documentReferenceModels;
	}
	public void setDocumentReferenceModels(List<DocumentReferenceModel> documentReferenceModels) {
		this.documentReferenceModels = documentReferenceModels;
	}
	
	public boolean checkObject() {
		return 
			(
				documentReferenceModels != null && !documentReferenceModels.isEmpty() && 
				(
					(documentReferenceModels.get(0).getIdModel() != null && StringUtils.isNotBlank(documentReferenceModels.get(0).getIdModel().getId())) 
					||
					(documentReferenceModels.get(0).getAttachmentModel() != null && documentReferenceModels.get(0).getAttachmentModel().getExternalReferenceModel() != null
					 && documentReferenceModels.get(0).getAttachmentModel().getExternalReferenceModel().getUriModel() != null
					 && StringUtils.isNotBlank(documentReferenceModels.get(0).getAttachmentModel().getExternalReferenceModel().getUriModel().getUri()))  
					||
					(documentReferenceModels.get(0).getIssuerPartyModel() != null && documentReferenceModels.get(0).getIssuerPartyModel().getPartyNameModels() != null
					 && !documentReferenceModels.get(0).getIssuerPartyModel().getPartyNameModels().isEmpty()
					 && documentReferenceModels.get(0).getIssuerPartyModel().getPartyNameModels().get(0) != null
					 && StringUtils.isNotBlank(documentReferenceModels.get(0).getIssuerPartyModel().getPartyNameModels().get(0).getName()))
				)
			);  
	}
}
