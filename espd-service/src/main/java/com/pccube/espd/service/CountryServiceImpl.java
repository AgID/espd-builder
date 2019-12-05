package com.pccube.espd.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pccube.espd.enums.Country;
import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.CountryModel;

@Service
public class CountryServiceImpl extends GenericService implements CountryService {

	static final Logger logger = Logger.getLogger(CountryServiceImpl.class);

    @Transactional(rollbackFor=Exception.class)
	public List<CountryModel> list() throws ServiceException {
		
		logger.info(LOG_START_SERVICE + "list");
		List<CountryModel> countries = new ArrayList<CountryModel>();
		try{
	    	
			for(Iterator<Country> i = Country.COUNTRIES.iterator(); i.hasNext();){
				Country country = i.next();
				CountryModel modelSingle = new CountryModel();
				modelSingle.setIso2Code(country.getIso2Code());
				modelSingle.setName(country.getName()); 
				modelSingle.setCurrency(country.getCurrency());
				countries.add(modelSingle);
			}
	    	
		}catch(Exception ex){
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return countries;
	}
}
