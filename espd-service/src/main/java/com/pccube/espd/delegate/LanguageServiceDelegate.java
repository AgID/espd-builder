package com.pccube.espd.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.LanguageModel;
import com.pccube.espd.service.CryptoService;
import com.pccube.espd.service.LanguageService;

@Component
public class LanguageServiceDelegate {
	
	@Autowired
	private LanguageService service;

	@Autowired
	private CryptoService cryptoService;

	public List<LanguageModel> list() throws ServiceException {
		List<LanguageModel> listaLanguage = this.service.list();
		for(LanguageModel language : listaLanguage) {
			this.cryptoService.encryptBeanWithIteration(language);
		}
		return listaLanguage;
	}

}
