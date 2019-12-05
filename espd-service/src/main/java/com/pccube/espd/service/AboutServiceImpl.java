package com.pccube.espd.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pccube.espd.config.EspdConfiguration;
import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.AboutModel;

@Service
public class AboutServiceImpl extends GenericService implements AboutService {
	
	static final Logger logger = Logger.getLogger(AboutServiceImpl.class);
	
	@Autowired
	private EspdConfiguration espdConfiguration;
	    
    @Transactional(rollbackFor=Exception.class)
	public AboutModel info() throws ServiceException {
    	
		logger.info(LOG_START_SERVICE + "info");
		AboutModel model = null;
		try{

			model = new AboutModel();
	    	model.setBuildVersion(espdConfiguration.getBuildVersion());
	    	model.setLastBuildDate(espdConfiguration.getLastBuildDate());
	    	model.setEnvironment(String.valueOf(espdConfiguration.isEspdEnvironment()));
	    	
		} catch(Exception ex) {
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	return model;
	}

}
