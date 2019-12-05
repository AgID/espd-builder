package com.pccube.espd.model;

import java.io.Serializable;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EvidenceSuppliedType;

/**
 * Corresponding to {@link EvidenceSuppliedType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class EvidenceSuppliedModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IDModel idModel;
	
	private EvidenceModel evidenceModel; // Proprietà aggiunta per utilità di soluzione per il FE.
	
	
	/**
	 * constructor
	 */
	public EvidenceSuppliedModel() {
		this.idModel = new IDModel();
		this.evidenceModel = new EvidenceModel();
	}

	
	public IDModel getIdModel() {
		return idModel;
	}

	public void setIdModel(IDModel idModel) {
		this.idModel = idModel;
	}

	public EvidenceModel getEvidenceModel() {
		return evidenceModel;
	}

	public void setEvidenceModel(EvidenceModel evidenceModel) {
		this.evidenceModel = evidenceModel;
	}
}
