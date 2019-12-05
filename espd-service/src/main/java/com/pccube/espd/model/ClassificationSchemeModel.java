package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ClassificationSchemeType;

/**
 * Corresponding to {@link ClassificationSchemeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ClassificationSchemeModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<DescriptionModel> descriptionModels;

	
	/**
	 * constructor
	 */
	public ClassificationSchemeModel() {
		this.descriptionModels = new ArrayList<DescriptionModel>();
	}
	
	
	public List<DescriptionModel> getDescriptionModels() {
		if (descriptionModels == null)
			descriptionModels = new ArrayList<DescriptionModel>();
		return descriptionModels;
	}
	public void setDescriptionModels(List<DescriptionModel> descriptionModels) {
		this.descriptionModels = descriptionModels;
	}

}
