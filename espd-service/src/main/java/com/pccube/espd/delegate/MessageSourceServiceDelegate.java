package com.pccube.espd.delegate;

import java.io.IOException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.TranslateModel;
import com.pccube.espd.service.CryptoService;
import com.pccube.espd.service.MessageSourceService;

@Component
public class MessageSourceServiceDelegate {

	@Autowired
	private MessageSourceService service;

	@Autowired
	private CryptoService cryptoService;

	public HashMap<String, String> translate(java.io.Reader body) throws ServiceException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		HashMap<String, String> map = this.service.translate((TranslateModel)this.cryptoService.decryptBeanWithIteration(mapper.readValue(body, TranslateModel.class)));
	    //String[] arrayTranslate = this.service.translate((TranslateModel)this.cryptoService.decryptBeanWithIteration(mapper.readValue(body, TranslateModel.class)));
		/*String[] retArrayTranslate = null;
		if(arrayTranslate != null){
			retArrayTranslate = new String[arrayTranslate.length];
			for(int i = 0; i < arrayTranslate.length; i++) {
				retArrayTranslate[i] = String.valueOf(this.cryptoService.encryptBeanWithIteration(arrayTranslate[i]));
			}
		}*/
		return map;
	}
}
