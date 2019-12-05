package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonFormat;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ResponseValueType;

/**
 * Corresponding to {@link ResponseValueType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ResponseValueModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IDModel idModel;
	private List<DescriptionModel> descriptionModels;
	private ResponseAmountModel responseAmountModel;
	private ResponseCodeModel responseCodeModel;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date responseDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date responseTime;
	private ResponseIDModel responseIdModel;
	private String responseIndicator;
	private ResponseMeasureModel responseMeasureModel;
	private Float responseNumeric;
	private ResponseQuantityModel responseQuantityModel;
	private UriModel responseUriModel;

	//private List<ResponseIDModel> responseIdModels; // Proprietà aggiunta per utilità di soluzione per il FE.
	
	
	/**
	 * constructor
	 */
	public ResponseValueModel() {
		this.idModel = new IDModel();
		this.descriptionModels = new ArrayList<DescriptionModel>();
		this.responseAmountModel = new ResponseAmountModel();
		this.responseCodeModel = new ResponseCodeModel();
		this.responseDate = null;
		this.responseTime = null;
		this.responseIdModel = new ResponseIDModel();
		this.responseIndicator = StringUtils.EMPTY;
		this.responseMeasureModel = new ResponseMeasureModel();
		this.responseNumeric = null;
		this.responseQuantityModel = new ResponseQuantityModel();
		this.responseUriModel = new UriModel();
	}


	public IDModel getIdModel() {
		return idModel;
	}
	public void setIdModel(IDModel idModel) {
		this.idModel = idModel;
	}
	public List<DescriptionModel> getDescriptionModels() {
		if (descriptionModels == null)
			descriptionModels = new ArrayList<DescriptionModel>();
		return descriptionModels;
	}
	public void setDescriptionModels(List<DescriptionModel> descriptionModels) {
		this.descriptionModels = descriptionModels;
	}
	public ResponseAmountModel getResponseAmountModel() {
		return responseAmountModel;
	}
	public void setResponseAmountModel(ResponseAmountModel responseAmountModel) {
		this.responseAmountModel = responseAmountModel;
	}
	public ResponseCodeModel getResponseCodeModel() {
		return responseCodeModel;
	}
	public void setResponseCodeModel(ResponseCodeModel responseCodeModel) {
		this.responseCodeModel = responseCodeModel;
	}
	public Date getResponseDate() {
		return responseDate;
	}
	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}
	public Date getResponseTime() {
		return responseTime;
	}
	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}
	public ResponseIDModel getResponseIdModel() {
		return responseIdModel;
	}
	public void setResponseIdModel(ResponseIDModel responseIdModel) {
		this.responseIdModel = responseIdModel;
	}
	public String getResponseIndicator() {
		return responseIndicator;
	}
	public void setResponseIndicator(String responseIndicator) {
		this.responseIndicator = responseIndicator;
	}
	public ResponseMeasureModel getResponseMeasureModel() {
		return responseMeasureModel;
	}
	public void setResponseMeasureModel(ResponseMeasureModel responseMeasureModel) {
		this.responseMeasureModel = responseMeasureModel;
	}
	public Float getResponseNumeric() {
		return responseNumeric;
	}
	public void setResponseNumeric(Float responseNumeric) {
		this.responseNumeric = responseNumeric;
	}
	public ResponseQuantityModel getResponseQuantityModel() {
		return responseQuantityModel;
	}
	public void setResponseQuantityModel(ResponseQuantityModel responseQuantityModel) {
		this.responseQuantityModel = responseQuantityModel;
	}
	public UriModel getResponseUriModel() {
		return responseUriModel;
	}
	public void setResponseUriModel(UriModel responseUriModel) {
		this.responseUriModel = responseUriModel;
	}
	/*public List<ResponseIDModel> getResponseIdModels() {
		return responseIdModels;
	}
	public void setResponseIdModels(List<ResponseIDModel> responseIdModels) {
		this.responseIdModels = responseIdModels;
	}*/

	public boolean valueIsNull() throws IllegalAccessException{
		
		return !((this.responseAmountModel != null && !this.responseAmountModel.isAllFieldsNull()) ||
			(this.responseCodeModel != null && !this.responseCodeModel.isAllFieldsNull()) ||
			this.responseDate != null || this.responseTime != null ||
			(this.responseIdModel != null && !this.responseIdModel.isAllFieldsNull()) ||
			StringUtils.isNotBlank(this.responseIndicator) || 
			(this.responseUriModel != null && !this.responseUriModel.isAllFieldsNull()) ||
			(this.responseMeasureModel != null && !this.responseMeasureModel.isAllFieldsNull()) || 
			(this.responseNumeric != null && !Float.isNaN(this.responseNumeric)) ||
			(this.responseQuantityModel != null && !this.responseQuantityModel.isAllFieldsNull()));
	}
}
