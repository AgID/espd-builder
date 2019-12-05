package com.pccube.espd.model;

import java.util.ArrayList;
import java.util.List;

import com.pccube.espd.codelists.CdDocRefContentType;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentTypeCodeType;

/**
 * Corresponding to {@link DocumentTypeCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class DocumentTypeCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CdDocRefContentType docRefContentType;
	private List<CdDocRefContentType> docRefContentTypes;
	
	
	/**
	 * constructor
	 */
	public DocumentTypeCodeModel() {
		this.docRefContentType = new CdDocRefContentType();
		this.docRefContentTypes = new ArrayList<CdDocRefContentType>();
	}

	public DocumentTypeCodeModel(CodeModel codemodel) {
		this.docRefContentType = new CdDocRefContentType();
		this.docRefContentTypes = new ArrayList<CdDocRefContentType>();
		this.setListID(codemodel.getListID());
		this.setListAgencyName(codemodel.getListAgencyName());
		this.setListAgencyID(codemodel.getListAgencyID());
		this.setListVersionID(codemodel.getListVersionID());
	}
	

	public CdDocRefContentType getDocRefContentType() {
		return docRefContentType;
	}

	public void setDocRefContentType(CdDocRefContentType docRefContentType) {
		this.docRefContentType = docRefContentType;
	}

	public List<CdDocRefContentType> getDocRefContentTypes() {
		if (docRefContentTypes == null)
			docRefContentTypes = new ArrayList<CdDocRefContentType>();
		return docRefContentTypes;
	}

	public void setDocRefContentTypes(List<CdDocRefContentType> docRefContentTypes) {
		this.docRefContentTypes = docRefContentTypes;
	}

}
