package com.pccube.espd.service;

import static org.apache.commons.lang3.StringUtils.isBlank;

import java.util.HashMap;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.TranslateModel;

@Service
public class MessageSourceServiceImpl extends GenericService implements MessageSourceService {

	static final Logger logger = Logger.getLogger(MessageSourceServiceImpl.class);

	@Autowired
    private MessageSource ms;
    
    @Transactional(rollbackFor=Exception.class)
    public HashMap<String,String> translate(TranslateModel translate) throws ServiceException {
	
		logger.info(LOG_START_SERVICE + "translate");
		String[] labels = null;
		HashMap<String,String> map = new HashMap<String, String>();
		
		try{
			
	    	labels = translate.getLabels();
	    	String lang = translate.getCodeLanguage();
	    	Locale locale = Locale.forLanguageTag(lang);
	        for (int i = 0; i < labels.length; i++) {
	            if (isBlank(labels[i])) {
	                continue;
	            }
	            map.put(labels[i], ms.getMessage(labels[i], null, locale));
	            //labels[i] = ms.getMessage(labels[i], null, locale);
	        }
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
		
		return map;
	}
	/*public String[] translate(TranslateModel translate) throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "translate");
		String[] labels = null;
		
		try{
			
	    	labels = translate.getLabels();
	    	String lang = translate.getCodeLanguage();
	    	Locale locale = Locale.forLanguageTag(lang);
	        for (int i = 0; i < labels.length; i++) {
	            if (isBlank(labels[i])) {
	                continue;
	            }
	            labels[i] = ms.getMessage(labels[i], null, locale);
	        }
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR + ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return labels;
	}*/

}
