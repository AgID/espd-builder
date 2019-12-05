package com.pccube.espd.service;

import java.util.List;

import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.CountryModel;

@FunctionalInterface
public interface CountryService {

	public List<CountryModel> list() throws ServiceException;
}
