package com.pccube.espd.service;

import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.AboutModel;

@FunctionalInterface
public interface AboutService {

	public AboutModel info() throws ServiceException;
	
}
