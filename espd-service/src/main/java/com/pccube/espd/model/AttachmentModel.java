package com.pccube.espd.model;

import java.io.Serializable;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AttachmentType;


/**
 * Corresponding to {@link AttachmentType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class AttachmentModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ExternalReferenceModel externalReferenceModel;

	
	/**
	 * constructor
	 */
	public AttachmentModel() {
		this.externalReferenceModel = new ExternalReferenceModel();
	}

	
	public ExternalReferenceModel getExternalReferenceModel() {
		return externalReferenceModel;
	}

	public void setExternalReferenceModel(ExternalReferenceModel externalReferenceModel) {
		this.externalReferenceModel = externalReferenceModel;
	}
	
	
}
