package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentTypeType;

/**
 * Corresponding to {@link DocumentTypeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class DocumentTypeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String documentType;
	
	
	/**
	 * constructor
	 */
	public DocumentTypeModel() {
		this.documentType = StringUtils.EMPTY;
	}

	
	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	
}
