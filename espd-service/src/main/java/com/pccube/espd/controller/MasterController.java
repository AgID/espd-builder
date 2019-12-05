package com.pccube.espd.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pccube.espd.config.EspdConfiguration;
import com.pccube.espd.delegate.MasterServiceDelegate;
import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.param.Response;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/master")
class MasterController extends GenericController {
	
	static final Logger logger = Logger.getLogger(MasterController.class);
    
	@Autowired
	private EspdConfiguration espdConfiguration;
	
    @Autowired
    private MasterServiceDelegate delegate;

	
	@PostMapping(value = "/config")
    @ResponseBody
    public ResponseEntity<Response> config(HttpServletRequest request, HttpServletResponse response) {

		logger.info(LOG_START_REST_CONTROLLER + "/master/config");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, espdConfiguration, RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
			logger.info(LOG_SERVICE_CALL_PERFORMED);
		} catch(Exception e) {
			logger.error(LOG_ERROR, e);
			setResponse(serviceResponse, null, RESPONSE_KO_CODE, RESPONSE_KO_DESCRIPTION);
		}
		logger.info(LOG_EXIT_CODE + serviceResponse.getResult().getExitCode());
		logger.info(LOG_TEXT + serviceResponse.getResult().getText());
		logger.info(LOG_END_REST_CONTROLLER);

		setHeaders(response);
		return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

	@PostMapping(value = "/init")
    @ResponseBody
    public ResponseEntity<Response> init(HttpServletRequest request, HttpServletResponse response) {

		logger.info(LOG_START_REST_CONTROLLER + "/master/init");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.init(request.getReader()), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
			logger.info(LOG_SERVICE_CALL_PERFORMED);
		} catch(ServiceException e) {
			logger.info(LOG_SERVICE_ERROR);
			setResponse(serviceResponse, null, e.getCode(), e.getMessage());
		} catch(Exception e) {
			logger.error(LOG_ERROR, e);
			setResponse(serviceResponse, null, RESPONSE_KO_CODE, RESPONSE_KO_DESCRIPTION);
		}
		logger.info(LOG_EXIT_CODE + serviceResponse.getResult().getExitCode());
		logger.info(LOG_TEXT + serviceResponse.getResult().getText());
		logger.info(LOG_END_REST_CONTROLLER);

		setHeaders(response);
		return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

	@PostMapping(value = "/initCriteria")
    @ResponseBody
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseEntity<Response> initCriteria(HttpServletRequest request, HttpServletResponse response) {

		logger.info(LOG_START_REST_CONTROLLER + "/master/initCriteria");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.initCriteria(request.getReader()), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
			logger.info(LOG_SERVICE_CALL_PERFORMED);
		} catch(ServiceException e) {
			logger.info(LOG_SERVICE_ERROR);
			setResponse(serviceResponse, null, e.getCode(), e.getMessage());
		} catch(Exception e) {
			logger.error(LOG_ERROR, e);
			setResponse(serviceResponse, null, RESPONSE_KO_CODE, RESPONSE_KO_DESCRIPTION);
		}
		logger.info(LOG_EXIT_CODE + serviceResponse.getResult().getExitCode());
		logger.info(LOG_TEXT + serviceResponse.getResult().getText());
		logger.info(LOG_END_REST_CONTROLLER);

		setHeaders(response);
		return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

	@PostMapping(value = "/download")
    @ResponseBody
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseEntity<Response> download(HttpServletRequest request, HttpServletResponse response) {

		logger.info(LOG_START_REST_CONTROLLER + "/master/download");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.download(request.getReader()), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
			logger.info(LOG_SERVICE_CALL_PERFORMED);
		} catch(ServiceException e) {
			logger.info(LOG_SERVICE_ERROR);
			setResponse(serviceResponse, null, e.getCode(), e.getMessage());
		} catch(Exception e) {
			logger.error(LOG_ERROR, e);
			setResponse(serviceResponse, null, RESPONSE_KO_CODE, RESPONSE_KO_DESCRIPTION);
		}
		logger.info(LOG_EXIT_CODE + serviceResponse.getResult().getExitCode());
		logger.info(LOG_TEXT + serviceResponse.getResult().getText());
		logger.info(LOG_END_REST_CONTROLLER);

		setHeaders(response);
		return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

	@PostMapping(value = "/upload")
    @ResponseBody
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public ResponseEntity<Response> upload(HttpServletRequest request, HttpServletResponse response) {
		
		logger.info(LOG_START_REST_CONTROLLER + "/master/upload");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.upload(request.getReader()), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
			logger.info(LOG_SERVICE_CALL_PERFORMED);
		} catch(ServiceException e) {
			logger.info(LOG_SERVICE_ERROR);
			setResponse(serviceResponse, null, e.getCode(), e.getMessage());
		} catch(Exception e) {
			logger.error(LOG_ERROR, e);
			setResponse(serviceResponse, null, RESPONSE_KO_CODE, RESPONSE_KO_DESCRIPTION);
		}
		logger.info(LOG_EXIT_CODE + serviceResponse.getResult().getExitCode());
		logger.info(LOG_TEXT + serviceResponse.getResult().getText());
		logger.info(LOG_END_REST_CONTROLLER);

		setHeaders(response);
		return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }
	
	@PostMapping(value = "/generateUUID")
    @ResponseBody
    public ResponseEntity<Response> generateUUID(HttpServletRequest request, HttpServletResponse response) {
		
		logger.info(LOG_START_REST_CONTROLLER + "/master/generateUUID");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.generateUUID(), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
			logger.info(LOG_SERVICE_CALL_PERFORMED);
		} catch(Exception e) {
			logger.error(LOG_ERROR, e);
			setResponse(serviceResponse, null, RESPONSE_KO_CODE, RESPONSE_KO_DESCRIPTION);
		}
		logger.info(LOG_EXIT_CODE + serviceResponse.getResult().getExitCode());
		logger.info(LOG_TEXT + serviceResponse.getResult().getText());
		logger.info(LOG_END_REST_CONTROLLER);

		setHeaders(response);
		return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }
}
