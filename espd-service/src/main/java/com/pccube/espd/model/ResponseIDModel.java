package com.pccube.espd.model;


import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseIDType;

/**
 * Corresponding to {@link ResponseIDType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ResponseIDModel extends IdentifierModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String responseId;
	
	private IDModel idModel; // Proprietà aggiunta per utilità di soluzione per il FE.


	/**
	 * constructor
	 */
	public ResponseIDModel() {
		this.responseId = null;
	}
	
	
	public String getResponseId() {
		return responseId;
	}
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
	public IDModel getIdModel() {
		return idModel;
	}
	public void setIdModel(IDModel idModel) {
		this.idModel = idModel;
	}

}
