package com.pccube.espd.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.AboutModel;
import com.pccube.espd.service.AboutService;
import com.pccube.espd.service.CryptoService;

@Component
public class AboutServiceDelegate {
	
	@Autowired
	private AboutService service;

	@Autowired
	private CryptoService cryptoService;

	public AboutModel info() throws ServiceException {
		return (AboutModel)this.cryptoService.encryptBeanWithIteration(this.service.info());
	}
}
