package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LegislationType;

/**
 * Corresponding to {@link LegislationType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class LegislationModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IDModel idModel;
	private List<String> titles;
	private List<DescriptionModel> descriptionModels;
	private List<String> jurisdictionLevels;
	private List<String> articles;
	private List<UriModel> uriModels;
	
	
	/**
	 * constructor
	 */
	public LegislationModel() {
		this.idModel = new IDModel();
		this.titles = new ArrayList<String>();
		this.descriptionModels = new ArrayList<DescriptionModel>();
		this.jurisdictionLevels = new ArrayList<String>();
		this.articles = new ArrayList<String>();
		this.uriModels = new ArrayList<UriModel>();
	}
	
	
	public IDModel getIdModel() {
		return idModel;
	}
	public void setIdModel(IDModel idModel) {
		this.idModel = idModel;
	}
	public List<String> getTitles() {
		if (titles == null)
			titles = new ArrayList<String>();
		return titles;
	}
	public void setTitles(List<String> titles) {
		this.titles = titles;
	}
	public List<DescriptionModel> getDescriptionModels() {
		if (descriptionModels == null)
			descriptionModels = new ArrayList<DescriptionModel>();
		return descriptionModels;
	}
	public void setDescriptionModels(List<DescriptionModel> descriptionModels) {
		this.descriptionModels = descriptionModels;
	}
	public List<String> getJurisdictionLevels() {
		if (jurisdictionLevels == null)
			jurisdictionLevels = new ArrayList<String>();
		return jurisdictionLevels;
	}
	public void setJurisdictionLevels(List<String> jurisdictionLevels) {
		this.jurisdictionLevels = jurisdictionLevels;
	}
	public List<String> getArticles() {
		if (articles == null)
			articles = new ArrayList<String>();
		return articles;
	}
	public void setArticles(List<String> articles) {
		this.articles = articles;
	}
	public List<UriModel> getUriModels() {
		if (uriModels == null)
			uriModels = new ArrayList<UriModel>();
		return uriModels;
	}
	public void setUriModels(List<UriModel> uriModels) {
		this.uriModels = uriModels;
	}
	
	
}
