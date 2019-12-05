package com.pccube.espd.service;

import java.util.List;

import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.LanguageModel;

@FunctionalInterface
public interface LanguageService {

	public List<LanguageModel> list() throws ServiceException;

}
