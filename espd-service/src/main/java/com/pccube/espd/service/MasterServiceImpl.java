package com.pccube.espd.service;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.factory.BeanTransformerRequestFactory;
import com.pccube.espd.factory.MarshallerFactory;
import com.pccube.espd.model.QualificationApplicationRequestModel;
import com.pccube.espd.model.QualificationApplicationResponseModel;
import com.pccube.espd.model.TenderingCriterionModel;


@Service
public class MasterServiceImpl extends GenericService implements MasterService {

	static final Logger logger = Logger.getLogger(MasterServiceImpl.class);

	@Autowired
	private MarshallerFactory marshallerFactory;

	@Autowired
	private BeanTransformerRequestFactory beanTransformerRequestFactory;
	
	@Transactional(rollbackFor=Exception.class)
    public QualificationApplicationRequestModel initRequest() throws ServiceException {
    	
		logger.info(LOG_START_SERVICE + "initRequest");
		QualificationApplicationRequestModel requestModel = null;
		try{
			
			requestModel = beanTransformerRequestFactory.createQualificationApplicationRequestModel();
	    	
		} catch (Exception ex) {
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return requestModel;
    }

	@Transactional(rollbackFor=Exception.class)
    public QualificationApplicationResponseModel initResponse() throws ServiceException {
    	
		logger.info(LOG_START_SERVICE + "initResponse");
		QualificationApplicationResponseModel responseModel = null;
		try{
			
			responseModel = null;
	    	
		} catch (Exception ex) {
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return responseModel;
    }
	
    @Transactional(rollbackFor=Exception.class)
    public ByteArrayOutputStream downloadRequest(QualificationApplicationRequestModel requestModel) throws ServiceException {
    	
		logger.info(LOG_START_SERVICE + "downloadRequest");
		ByteArrayOutputStream out = null;
		try{
			
			out = marshallerFactory.marshalRequest(requestModel);
	    	
		} catch (Exception ex) {
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return out;
    }

    @Transactional(rollbackFor=Exception.class)
    public ByteArrayOutputStream downloadResponse(QualificationApplicationResponseModel responseModel) throws ServiceException {
    	
		logger.info(LOG_START_SERVICE + "downloadResponse");
		ByteArrayOutputStream out = null;
		try{

			out = marshallerFactory.marshalResponse(responseModel);
	    	
		} catch (Exception ex) {
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return out;
    }
    
    @Transactional(rollbackFor=Exception.class)
    public QualificationApplicationRequestModel uploadRequestCA(InputStream requestStream) throws ServiceException {
    	
		logger.info(LOG_START_SERVICE + "uploadRequestCA");
		QualificationApplicationRequestModel requestModel = null;
		try{
			
			if (requestStream == null) {
				throw new ServiceException(NULL_STREAM_FILE_ERROR_CODE, NULL_STREAM_FILE_ERROR_STRING);
			}
	    	
			requestModel = marshallerFactory.unmarshalRequestCA(requestStream);
				
		} catch (Exception ex) {
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return requestModel;
    }
    
    @Transactional(rollbackFor=Exception.class)
    public QualificationApplicationResponseModel uploadResponseOrRequestEO(InputStream inputStream) throws ServiceException {
    	
		logger.info(LOG_START_SERVICE + "uploadResponseOrRequestEO");
		QualificationApplicationResponseModel responseModel = null;
		try{

			if (inputStream == null) {
				throw new ServiceException(NULL_STREAM_FILE_ERROR_CODE, NULL_STREAM_FILE_ERROR_STRING);
			}
			
			responseModel = marshallerFactory.unmarshalResponseOrRequestEO(inputStream);
	    	
		} catch (Exception ex) {
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return responseModel;
    }
	
	@Transactional(rollbackFor=Exception.class)
    public List<TenderingCriterionModel> initCriteria(String[] criterionKeys) throws ServiceException {
    	
		logger.info(LOG_START_SERVICE + "initCriteria");
		List<TenderingCriterionModel> tenderingCriterionModels = null;
		try{
			
			tenderingCriterionModels = beanTransformerRequestFactory.createTenderingCriterion(
					new ArrayList<String>(Arrays.asList(criterionKeys)));
	    	
		} catch (Exception ex) {
			logger.error(LOG_ERROR, ex);
			throw new ServiceException(NOT_MANAGED_SERVICE_ERROR_CODE, ex.getMessage());
		}
    	
		return tenderingCriterionModels;
    }

}
