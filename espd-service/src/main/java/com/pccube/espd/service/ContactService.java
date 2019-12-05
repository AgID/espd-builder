package com.pccube.espd.service;

import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.ContactModel;

@FunctionalInterface
public interface ContactService {

	public ContactModel view(String lang) throws ServiceException;

}
