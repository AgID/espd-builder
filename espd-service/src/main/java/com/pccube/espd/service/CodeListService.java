package com.pccube.espd.service;

import java.util.List;

import com.pccube.espd.codelists.CdBidType;
import com.pccube.espd.codelists.CdBooleanGUIControlType;
import com.pccube.espd.codelists.CdCPVCodes;
import com.pccube.espd.codelists.CdCurrencyCode;
import com.pccube.espd.codelists.CdDocRefContentType;
import com.pccube.espd.codelists.CdEOIDType;
import com.pccube.espd.codelists.CdEOIndustryClassificationCode;
import com.pccube.espd.codelists.CdEORoleType;
import com.pccube.espd.codelists.CdEvaluationMethodType;
import com.pccube.espd.codelists.CdFinancialRatioType;
import com.pccube.espd.codelists.CdProcedureType;
import com.pccube.espd.codelists.CdProjectType;
import com.pccube.espd.codelists.CdWeightingType;
import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.CommodityClassificationModel;
import com.pccube.espd.model.ProcurementProjectLotModel;
import com.pccube.espd.model.ResponseValueModel;
import com.pccube.espd.model.TenderingCriterionPropertyModel;

public interface CodeListService {

	public List<CdDocRefContentType> docRefContentTypeList(String lang) throws ServiceException;

	public List<CdProcedureType> procedureTypeList(String lang) throws ServiceException;

	public List<CdProjectType> projectTypeList(String lang) throws ServiceException;
	
	public List<CdEORoleType> eoRoleTypeList(String lang) throws ServiceException;
	
	public List<CdEOIDType> eoIDTypeList(String lang) throws ServiceException;
	
	public List<CdEOIndustryClassificationCode> eoIndustryClassificationCodeList(String lang) throws ServiceException;

	public List<CdCurrencyCode> currencyCodeList(String lang) throws ServiceException;

	public List<CdBidType> bidTypeList(String lang) throws ServiceException;

	public List<CdFinancialRatioType> financialRatioTypeList(String lang) throws ServiceException;

	public List<TenderingCriterionPropertyModel> lotsListCA(List<ProcurementProjectLotModel> procurementProjectLotModels) throws ServiceException;

	public List<ResponseValueModel> lotsListEO(List<ProcurementProjectLotModel> procurementProjectLotModels) throws ServiceException;

	public List<TenderingCriterionPropertyModel> cpvsListCA(List<CommodityClassificationModel> mainCommodityClassificationModels) throws ServiceException;

	public List<ResponseValueModel> cpvsListEO(List<CommodityClassificationModel> mainCommodityClassificationModels) throws ServiceException;

	public List<CdCPVCodes> cpvCodesList(String lang) throws ServiceException;
	
	public List<CdBooleanGUIControlType> booleanGUIControlTypeList(String lang) throws ServiceException;
	
	public List<CdWeightingType> weightingTypeList(String lang) throws ServiceException;
	
	public List<CdEvaluationMethodType> evaluationMethodTypeList(String lang) throws ServiceException;

}
