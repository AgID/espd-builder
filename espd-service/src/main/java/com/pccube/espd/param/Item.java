package com.pccube.espd.param;

import java.util.List;

import com.pccube.espd.model.CommodityClassificationModel;
import com.pccube.espd.model.ProcurementProjectLotModel;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionType;

public class Item {

	private Authentication authentication;
	private List<TenderingCriterionType> criteriaRequest;
	private List<ProcurementProjectLotModel> listPplm;
	private List<CommodityClassificationModel> listCcm;
	private String[] criteriaKeys;

	public Authentication getAuthentication() {
		return authentication;
	}
	public void setAuthentication(Authentication authentication) {
		this.authentication = authentication;
	}
	public List<TenderingCriterionType> getCriteriaRequest() {
		return criteriaRequest;
	}
	public void setCriteriaRequest(List<TenderingCriterionType> criteriaRequest) {
		this.criteriaRequest = criteriaRequest;
	}
	public List<ProcurementProjectLotModel> getListPplm() {
		return listPplm;
	}
	public void setListPplm(List<ProcurementProjectLotModel> listPplm) {
		this.listPplm = listPplm;
	}
	public List<CommodityClassificationModel> getListCcm() {
		return listCcm;
	}
	public void setListCcm(List<CommodityClassificationModel> listCcm) {
		this.listCcm = listCcm;
	}
	public String[] getCriteriaKeys() {
		return criteriaKeys;
	}
	public void setCriteriaKeys(String[] criteriaKeys) {
		this.criteriaKeys = criteriaKeys;
	}

}
