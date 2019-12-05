package com.pccube.espd.model;

import java.io.Serializable;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ProcurementProjectLotType;

/**
 * Corresponding to {@link ProcurementProjectLotType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ProcurementProjectLotModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IDModel idModel;
	
	
	/**
	 * constructor
	 */
	public ProcurementProjectLotModel() {
		this.idModel = new IDModel();
	}
	

	public IDModel getIdModel() {
		return idModel;
	}

	public void setIdModel(IDModel idModel) {
		this.idModel = idModel;
	}

}
