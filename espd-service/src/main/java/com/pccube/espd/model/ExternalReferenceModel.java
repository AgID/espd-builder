package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ExternalReferenceType;


/**
 * Corresponding to {@link ExternalReferenceType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ExternalReferenceModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UriModel uriModel;
	private String fileName;
	private List<DescriptionModel> descriptionModels;
	
	
	/**
	 * constructor
	 */
	public ExternalReferenceModel() {
		this.uriModel = new UriModel();
		this.fileName = StringUtils.EMPTY;
		this.descriptionModels = new ArrayList<DescriptionModel>();
	}

	
	public UriModel getUriModel() {
		return uriModel;
	}
	public void setUriModel(UriModel uriModel) {
		this.uriModel = uriModel;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
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
