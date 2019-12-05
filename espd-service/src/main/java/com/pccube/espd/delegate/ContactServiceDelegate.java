package com.pccube.espd.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.ContactModel;
import com.pccube.espd.service.ContactService;
import com.pccube.espd.service.CryptoService;

@Component
public class ContactServiceDelegate {
	
	@Autowired
	private ContactService service;

	@Autowired
	private CryptoService cryptoService;

	public ContactModel view(String lang) throws ServiceException {
		return (ContactModel)this.cryptoService.encryptBeanWithIteration(this.service.view(lang));
	}
}
