package com.pccube.espd.service;

import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pccube.espd.exception.ServiceException;

import com.pccube.espd.model.ContactModel;

@Service
public class ContactServiceImpl extends GenericService implements ContactService {
	
	static final Logger logger = Logger.getLogger(ContactServiceImpl.class);

    @Transactional(rollbackFor=Exception.class)
    public ContactModel view(String lang) throws ServiceException {
    	
		logger.info(LOG_START_SERVICE + "view");
		ContactModel model = new ContactModel();
		try{
	    	
	    	InputStream input = null;
	    	String filename = "messages_"+ lang +".properties";
	    	input = getClass().getClassLoader().getResourceAsStream(filename);

	    	Properties prop = new Properties();
	    	prop.load(input);
				
	    	model.setContactHeader(prop.getProperty("contact_header"));
	    	model.setContactInfo(prop.getProperty("contact_info"));
	    	model.setReportApplicationIssue(prop.getProperty("report_appliction_issue"));
	    	model.setReportSecurityIncidentTitle(prop.getProperty("report_security_incident_title"));
	    	model.setReportSecurityIncident(prop.getProperty("report_security_incident"));
	    	model.setBackToMain(prop.getProperty("back_to_main"));
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return model;
    }
	
}
