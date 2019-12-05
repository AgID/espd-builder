package com.pccube.espd.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
import com.pccube.espd.enums.CodeList;
import com.pccube.espd.enums.Language;
import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.factory.GenericMapperFactory;
import com.pccube.espd.factory.MarshallerCodeListFactory;
import com.pccube.espd.model.CommodityClassificationModel;
import com.pccube.espd.model.ProcurementProjectLotModel;
import com.pccube.espd.model.ResponseValueModel;
import com.pccube.espd.model.TenderingCriterionPropertyModel;

@Service
public class CodeListServiceImpl extends GenericService implements CodeListService {

	static final Logger logger = Logger.getLogger(CodeListServiceImpl.class);

	@Autowired
	private MarshallerCodeListFactory marshallerCodeListFactory;

    @Transactional(rollbackFor=Exception.class)
	public List<CdDocRefContentType> docRefContentTypeList(String lang) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "docRefContentTypeList");
		List<CdDocRefContentType> types = new ArrayList<CdDocRefContentType>();
		try{
	    	
			types = new CdDocRefContentType().mapperlist(
					marshallerCodeListFactory.codeListSimple(CodeList.DOC_REF_CONTENT_TYPE, Language.getByLanguageCode(lang)));
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR + ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<CdProcedureType> procedureTypeList(String lang) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "procedureTypeList");
		List<CdProcedureType> types = new ArrayList<CdProcedureType>();
		try{
	    	
			types = new CdProcedureType().mapperlist(
					marshallerCodeListFactory.codeListSimple(CodeList.PROCEDURE_TYPE, Language.getByLanguageCode(lang)));
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<CdProjectType> projectTypeList(String lang) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "projectTypeList");
		List<CdProjectType> types = new ArrayList<CdProjectType>();
		try{
	    	
			types = new CdProjectType().mapperlist(
					marshallerCodeListFactory.codeListSimple(CodeList.PROJECT_TYPE, Language.getByLanguageCode(lang)));
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<CdEORoleType> eoRoleTypeList(String lang) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "eoRoleTypeList");
		List<CdEORoleType> types = new ArrayList<CdEORoleType>();
		try{
	    	
			types = new CdEORoleType().mapperlist(
					marshallerCodeListFactory.codeListSimple(CodeList.EO_ROLE_TYPE, Language.getByLanguageCode(lang)));
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<CdEOIDType> eoIDTypeList(String lang) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "eoIDTypeList");
		List<CdEOIDType> types = new ArrayList<CdEOIDType>();
		try{
	    	
			types = new CdEOIDType().mapperlist(
					marshallerCodeListFactory.codeListSimple(CodeList.EO_ID_TYPE, Language.getByLanguageCode(lang)));
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<CdEOIndustryClassificationCode> eoIndustryClassificationCodeList(String lang) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "eoIndustryClassificationCodeList");
		List<CdEOIndustryClassificationCode> types = new ArrayList<CdEOIndustryClassificationCode>();
		try{
	    	
			types = new CdEOIndustryClassificationCode().mapperlist(
					marshallerCodeListFactory.codeListSimple(CodeList.EO_INDUSTRY_CLASSIFICATION_CODE, Language.getByLanguageCode(lang)));
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<CdCurrencyCode> currencyCodeList(String lang) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "currencyCodeList");
		List<CdCurrencyCode> types = new ArrayList<CdCurrencyCode>();
		try{
	    	
			types = new CdCurrencyCode().mapperlist(
					marshallerCodeListFactory.codeListSimple(CodeList.CURRENCY_CODE, Language.getByLanguageCode(lang)));
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<CdBidType> bidTypeList(String lang) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "bidTypeList");
		List<CdBidType> types = new ArrayList<CdBidType>();
		try{
	    	
			types = new CdBidType().mapperlist(
					marshallerCodeListFactory.codeListSimple(CodeList.BID_TYPE, Language.getByLanguageCode(lang)));
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<CdFinancialRatioType> financialRatioTypeList(String lang) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "financialRatioTypeList");
		List<CdFinancialRatioType> types = new ArrayList<CdFinancialRatioType>();
		try{
	    	
			types = new CdFinancialRatioType().mapperlist(
					marshallerCodeListFactory.codeListSimple(CodeList.FINANCIAL_RATIO_TYPE, Language.getByLanguageCode(lang)));
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<TenderingCriterionPropertyModel> lotsListCA(List<ProcurementProjectLotModel> procurementProjectLotModels) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "lotsListCA");
		List<TenderingCriterionPropertyModel> types = new ArrayList<TenderingCriterionPropertyModel>();
		try{
	    	
			types = GenericMapperFactory.mapperLotsListCA(procurementProjectLotModels);
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<ResponseValueModel> lotsListEO(List<ProcurementProjectLotModel> procurementProjectLotModels) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "lotsListEO");
		List<ResponseValueModel> types = new ArrayList<ResponseValueModel>();
		try{
	    	
			types = GenericMapperFactory.mapperLotsListEO(procurementProjectLotModels);
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<TenderingCriterionPropertyModel> cpvsListCA(List<CommodityClassificationModel> mainCommodityClassificationModels) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "cpvsListCA");
		List<TenderingCriterionPropertyModel> types = new ArrayList<TenderingCriterionPropertyModel>();
		try{
	    	
			types = GenericMapperFactory.mapperCpvsListCA(mainCommodityClassificationModels);
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<ResponseValueModel> cpvsListEO(List<CommodityClassificationModel> mainCommodityClassificationModels) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "cpvsListEO");
		List<ResponseValueModel> types = new ArrayList<ResponseValueModel>();
		try{
	    	
			types = GenericMapperFactory.mapperCpvsListEO(mainCommodityClassificationModels);
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<CdCPVCodes> cpvCodesList(String lang) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "cpvCodesList");
		List<CdCPVCodes> types = new ArrayList<CdCPVCodes>();
		try{
	    	
			types = new CdCPVCodes().mapperlist(
					marshallerCodeListFactory.codeListSimple(CodeList.CPV_CODES, Language.getByLanguageCode(lang)));
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<CdBooleanGUIControlType> booleanGUIControlTypeList(String lang) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "booleanGUIControlTypeList");
		List<CdBooleanGUIControlType> types = new ArrayList<CdBooleanGUIControlType>();
		try{
	    	
			types = new CdBooleanGUIControlType().mapperlist(
					marshallerCodeListFactory.codeListSimple(CodeList.BOOLEAN_GUI_CONTROL_TYPE, Language.getByLanguageCode(lang)));
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<CdWeightingType> weightingTypeList(String lang) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "weightingTypeList");
		List<CdWeightingType> types = new ArrayList<CdWeightingType>();
		try{
	    	
			types = new CdWeightingType().mapperlist(
					marshallerCodeListFactory.codeListSimple(CodeList.WEIGHTING_TYPE, Language.getByLanguageCode(lang)));
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

    @Transactional(rollbackFor=Exception.class)
	public List<CdEvaluationMethodType> evaluationMethodTypeList(String lang) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "evaluationMethodTypeList");
		List<CdEvaluationMethodType> types = new ArrayList<CdEvaluationMethodType>();
		try{
	    	
			types = new CdEvaluationMethodType().mapperlist(
					marshallerCodeListFactory.codeListSimple(CodeList.EVALUATION_METHOD_TYPE, Language.getByLanguageCode(lang)));
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return types;
	}

}
