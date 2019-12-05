package com.pccube.espd.service;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;

import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.model.QualificationApplicationRequestModel;
import com.pccube.espd.model.QualificationApplicationResponseModel;
import com.pccube.espd.model.TenderingCriterionModel;

public interface MasterService {
	
	public QualificationApplicationRequestModel initRequest() throws ServiceException;

	public QualificationApplicationResponseModel initResponse() throws ServiceException;
	
	public ByteArrayOutputStream downloadRequest(QualificationApplicationRequestModel requestModel) throws ServiceException;
	
	public ByteArrayOutputStream downloadResponse(QualificationApplicationResponseModel responseModel) throws ServiceException;

	public QualificationApplicationRequestModel uploadRequestCA(InputStream requestStream) throws ServiceException;

	public QualificationApplicationResponseModel uploadResponseOrRequestEO(InputStream inputStream) throws ServiceException;
	
	public List<TenderingCriterionModel> initCriteria(String[] criterionKeys) throws ServiceException;
	
}
