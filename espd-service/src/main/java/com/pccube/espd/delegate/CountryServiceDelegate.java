package com.pccube.espd.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.CountryModel;
import com.pccube.espd.service.CountryService;
import com.pccube.espd.service.CryptoService;

@Component
public class CountryServiceDelegate {
	
	@Autowired
	private CountryService service;

	@Autowired
	private CryptoService cryptoService;

	public List<CountryModel> list() throws ServiceException {
		List<CountryModel> listaCountry = this.service.list();
		for(CountryModel country : listaCountry) {
			this.cryptoService.encryptBeanWithIteration(country);
		}
		return listaCountry;
	}

}
