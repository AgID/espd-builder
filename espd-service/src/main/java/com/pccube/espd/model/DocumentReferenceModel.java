package com.pccube.espd.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DocumentReferenceType;

/**
 * Corresponding to {@link DocumentReferenceType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class DocumentReferenceModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IDModel idModel; 
	private UUIDModel uuidModel;
	private DocumentTypeCodeModel documentTypeCodeModel;
	private DocumentTypeModel documentTypeModel;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date whenDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date whenTime;
	private AttachmentModel attachmentModel;
	private PartyModel issuerPartyModel;

	
	/**
	 * constructor
	 */
	public DocumentReferenceModel() {
		this.idModel = new IDModel();
		this.uuidModel = new UUIDModel();
		this.documentTypeCodeModel = new DocumentTypeCodeModel();
		this.documentTypeModel = new DocumentTypeModel();
		this.whenDate = null;
		this.whenTime = null;
		this.attachmentModel = new AttachmentModel();
		this.issuerPartyModel = new PartyModel();
	}
	

	public IDModel getIdModel() {
		return idModel;
	}
	public void setIdModel(IDModel idModel) {
		this.idModel = idModel;
	}
	public UUIDModel getUuidModel() {
		return uuidModel;
	}
	public void setUuidModel(UUIDModel uuidModel) {
		this.uuidModel = uuidModel;
	}
	public DocumentTypeCodeModel getDocumentTypeCodeModel() {
		return documentTypeCodeModel;
	}
	public void setDocumentTypeCodeModel(DocumentTypeCodeModel documentTypeCodeModel) {
		this.documentTypeCodeModel = documentTypeCodeModel;
	}
	public DocumentTypeModel getDocumentTypeModel() {
		return documentTypeModel;
	}
	public void setDocumentTypeModel(DocumentTypeModel documentTypeModel) {
		this.documentTypeModel = documentTypeModel;
	}
	public Date getWhenDate() {
		return whenDate;
	}
	public void setWhenDate(Date whenDate) {
		this.whenDate = whenDate;
	}
	public Date getWhenTime() {
		return whenTime;
	}
	public void setWhenTime(Date whenTime) {
		this.whenTime = whenTime;
	}
	public AttachmentModel getAttachmentModel() {
		return attachmentModel;
	}
	public void setAttachmentModel(AttachmentModel attachmentModel) {
		this.attachmentModel = attachmentModel;
	}
	public PartyModel getIssuerPartyModel() {
		return issuerPartyModel;
	}
	public void setIssuerPartyModel(PartyModel issuerPartyModel) {
		this.issuerPartyModel = issuerPartyModel;
	}
	
}
