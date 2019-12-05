package com.pccube.espd.service;

import java.util.HashMap;

import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.TranslateModel;

@FunctionalInterface
public interface MessageSourceService {

	public HashMap<String, String> translate(TranslateModel translate) throws ServiceException;

}
