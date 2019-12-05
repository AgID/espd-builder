package com.pccube.espd.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pccube.espd.exception.ServiceException;

import com.pccube.espd.enums.Language;
import com.pccube.espd.model.LanguageModel;

@Service
public class LanguageServiceImpl extends GenericService implements LanguageService {

	static final Logger logger = Logger.getLogger(LanguageServiceImpl.class);

    @Transactional(rollbackFor=Exception.class)
	public List<LanguageModel> list() throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "list");
		List<LanguageModel> languages = new ArrayList<LanguageModel>();
		try{
	    	
			for(Iterator<Language> i = Language.LANGUAGES.iterator(); i.hasNext();){
				Language lang = i.next();
				LanguageModel modelSingle = new LanguageModel();
				modelSingle.setSourceLanguage(lang.getSourceLanguage());
				modelSingle.setEnglishName(lang.getEnglishName()); 
				modelSingle.setCode(lang.getCode());
				languages.add(modelSingle);
			}
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return languages;
	}
}
