package com.pccube.espd.delegate;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
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
import com.pccube.espd.enums.Agent;
import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.ResponseValueModel;
import com.pccube.espd.model.TenderingCriterionPropertyModel;
import com.pccube.espd.param.Item;
import com.pccube.espd.service.CodeListService;
import com.pccube.espd.service.CryptoService;

@Component
public class CodeListServiceDelegate {

	@Autowired
	private CodeListService service;

	@Autowired
	private CryptoService cryptoService;

	public List<CdDocRefContentType> docRefContentTypeList(String lang) throws ServiceException {
		List<CdDocRefContentType> list = this.service.docRefContentTypeList(lang);
		for(CdDocRefContentType bean : list) {
			this.cryptoService.encryptBeanWithIteration(bean);
		}
		return list;
	}

	public List<CdProcedureType> procedureTypeList(String lang) throws ServiceException {
		List<CdProcedureType> list = this.service.procedureTypeList(lang);
		for(CdProcedureType bean : list) {
			this.cryptoService.encryptBeanWithIteration(bean);
		}
		return list;
	}

	public List<CdProjectType> projectTypeList(String lang) throws ServiceException {
		List<CdProjectType> list = this.service.projectTypeList(lang);
		for(CdProjectType bean : list) {
			this.cryptoService.encryptBeanWithIteration(bean);
		}
		return list;
	}

	public List<CdEORoleType> eoRoleTypeList(String lang) throws ServiceException {
		List<CdEORoleType> list = this.service.eoRoleTypeList(lang);
		for(CdEORoleType bean : list) {
			this.cryptoService.encryptBeanWithIteration(bean);
		}
		return list;
	}

	public List<CdEOIDType> eoIDTypeList(String lang) throws ServiceException {
		List<CdEOIDType> list = this.service.eoIDTypeList(lang);
		for(CdEOIDType bean : list) {
			this.cryptoService.encryptBeanWithIteration(bean);
		}
		return list;
	}

	public List<CdEOIndustryClassificationCode> eoIndustryClassificationCodeList(String lang) throws ServiceException {
		List<CdEOIndustryClassificationCode> list = this.service.eoIndustryClassificationCodeList(lang);
		for(CdEOIndustryClassificationCode bean : list) {
			this.cryptoService.encryptBeanWithIteration(bean);
		}
		return list;
	}

	public List<CdCurrencyCode> currencyCodeList(String lang) throws ServiceException {
		List<CdCurrencyCode> list = this.service.currencyCodeList(lang);
		for(CdCurrencyCode bean : list) {
			this.cryptoService.encryptBeanWithIteration(bean);
		}
		return list;
	}

	public List<CdBidType> bidTypeList(String lang) throws ServiceException {
		List<CdBidType> list = this.service.bidTypeList(lang);
		for(CdBidType bean : list) {
			this.cryptoService.encryptBeanWithIteration(bean);
		}
		return list;
	}

	public List<CdFinancialRatioType> financialRatioTypeList(String lang) throws ServiceException {
		List<CdFinancialRatioType> list = this.service.financialRatioTypeList(lang);
		for(CdFinancialRatioType bean : list) {
			this.cryptoService.encryptBeanWithIteration(bean);
		}
		return list;
	}

	public Object lotsList(java.io.Reader body) throws ServiceException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		Item item = mapper.readValue(body, Item.class);

		String agent = item.getAuthentication().getUser();
		
		if (agent.equalsIgnoreCase(Agent.CONTRACTING_AUTHORITY.getCode())) {

			List<TenderingCriterionPropertyModel> list = this.service.lotsListCA(item.getListPplm());
			for(TenderingCriterionPropertyModel bean : list) {
				this.cryptoService.encryptBeanWithIteration(bean);
			}
			return list;
			
		} else if (agent.equalsIgnoreCase(Agent.ECONOMIC_OPERATOR.getCode())){

			List<ResponseValueModel> list = this.service.lotsListEO(item.getListPplm());
			for(ResponseValueModel bean : list) {
				this.cryptoService.encryptBeanWithIteration(bean);
			}
			return list;
		}
		
		return null;
	}

	public Object cpvsList(java.io.Reader body) throws ServiceException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		Item item = mapper.readValue(body, Item.class);

		String agent = item.getAuthentication().getUser();
		
		if (agent.equalsIgnoreCase(Agent.CONTRACTING_AUTHORITY.getCode())) {

			List<TenderingCriterionPropertyModel> list = this.service.cpvsListCA(item.getListCcm());
			for(TenderingCriterionPropertyModel bean : list) {
				this.cryptoService.encryptBeanWithIteration(bean);
			}
			return list;
		
		} else if (agent.equalsIgnoreCase(Agent.ECONOMIC_OPERATOR.getCode())){

			List<ResponseValueModel> list = this.service.cpvsListEO(item.getListCcm());
			for(ResponseValueModel bean : list) {
				this.cryptoService.encryptBeanWithIteration(bean);
			}
			return list;
		}
		
		return null;
	}

	public List<CdCPVCodes> cpvCodesList(String lang) throws ServiceException {
		List<CdCPVCodes> list = this.service.cpvCodesList(lang);
		for(CdCPVCodes bean : list) {
			this.cryptoService.encryptBeanWithIteration(bean);
		}
		return list;
	}

	public List<CdBooleanGUIControlType> booleanGUIControlTypeList(String lang) throws ServiceException {
		List<CdBooleanGUIControlType> list = this.service.booleanGUIControlTypeList(lang);
		for(CdBooleanGUIControlType bean : list) {
			this.cryptoService.encryptBeanWithIteration(bean);
		}
		return list;
	}

	public List<CdWeightingType> weightingTypeList(String lang) throws ServiceException {
		List<CdWeightingType> list = this.service.weightingTypeList(lang);
		for(CdWeightingType bean : list) {
			this.cryptoService.encryptBeanWithIteration(bean);
		}
		return list;
	}

	public List<CdEvaluationMethodType> evaluationMethodTypeList(String lang) throws ServiceException {
		List<CdEvaluationMethodType> list = this.service.evaluationMethodTypeList(lang);
		for(CdEvaluationMethodType bean : list) {
			this.cryptoService.encryptBeanWithIteration(bean);
		}
		return list;
	}
}
