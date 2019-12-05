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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pccube.espd.delegate.CodeListServiceDelegate;
import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.param.Response;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/codelist")
public class CodeListController extends GenericController {
	
	static final Logger logger = Logger.getLogger(CodeListController.class);
	
    @Autowired
    private CodeListServiceDelegate delegate;

    
    @PostMapping(value = "/docRefContentTypeList")
	@ResponseBody
	public ResponseEntity<Response> docRefContentTypeList(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "lang", required = true) String lang) {

		logger.info(LOG_START_REST_CONTROLLER + "/codelist/docRefContentTypeList");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.docRefContentTypeList(lang), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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

    @PostMapping(value = "/procedureTypeList")
	@ResponseBody
	public ResponseEntity<Response> procedureTypeList(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "lang", required = true) String lang) {

		logger.info(LOG_START_REST_CONTROLLER + "/codelist/procedureTypeList");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.procedureTypeList(lang), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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

    @PostMapping(value = "/projectTypeList")
	@ResponseBody
	public ResponseEntity<Response> projectTypeList(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "lang", required = true) String lang) {

		logger.info(LOG_START_REST_CONTROLLER + "/codelist/projectTypeList");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.projectTypeList(lang), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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

    @PostMapping(value = "/eoRoleTypeList")
	@ResponseBody
	public ResponseEntity<Response> eoRoleTypeList(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "lang", required = true) String lang) {

		logger.info(LOG_START_REST_CONTROLLER + "/codelist/eoRoleTypeList");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.eoRoleTypeList(lang), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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

    @PostMapping(value = "/eoIDTypeList")
	@ResponseBody
	public ResponseEntity<Response> eoIDTypeList(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "lang", required = true) String lang) {

		logger.info(LOG_START_REST_CONTROLLER + "/codelist/eoIDTypeList");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.eoIDTypeList(lang), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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

    @PostMapping(value = "/eoIndustryClassificationCodeList")
	@ResponseBody
	public ResponseEntity<Response> eoIndustryClassificationCodeList(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "lang", required = true) String lang) {

		logger.info(LOG_START_REST_CONTROLLER + "/codelist/eoIndustryClassificationCodeList");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.eoIndustryClassificationCodeList(lang), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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

    @PostMapping(value = "/currencyCodeList")
	@ResponseBody
	public ResponseEntity<Response> currencyCodeList(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "lang", required = true) String lang) {

		logger.info(LOG_START_REST_CONTROLLER + "/codelist/currencyCodeList");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.currencyCodeList(lang), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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

    @PostMapping(value = "/bidTypeList")
	@ResponseBody
	public ResponseEntity<Response> bidTypeList(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "lang", required = true) String lang) {

		logger.info(LOG_START_REST_CONTROLLER + "/codelist/bidTypeList");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.bidTypeList(lang), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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

    @PostMapping(value = "/financialRatioTypeList")
	@ResponseBody
	public ResponseEntity<Response> financialRatioTypeList(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "lang", required = true) String lang) {

		logger.info(LOG_START_REST_CONTROLLER + "/codelist/financialRatioTypeList");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.financialRatioTypeList(lang), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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
    
    @PostMapping(value = "/lotsList")
	@ResponseBody
    @Consumes(MediaType.APPLICATION_JSON)
	public ResponseEntity<Response> lotsList(HttpServletRequest request, HttpServletResponse response) {

		logger.info(LOG_START_REST_CONTROLLER + "/codelist/lotsList");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.lotsList(request.getReader()), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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
    
    @PostMapping(value = "/cpvsList")
	@ResponseBody
    @Consumes(MediaType.APPLICATION_JSON)
	public ResponseEntity<Response> cpvsList(HttpServletRequest request, HttpServletResponse response) {

		logger.info(LOG_START_REST_CONTROLLER + "/codelist/cpvsList");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.cpvsList(request.getReader()), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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
    
    @PostMapping(value = "/cpvCodesList")
	@ResponseBody
	public ResponseEntity<Response> cpvCodesList(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "lang", required = true) String lang) {

		logger.info(LOG_START_REST_CONTROLLER + "/codelist/cpvCodesList");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.cpvCodesList(lang), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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

    @PostMapping(value = "/booleanGUIControlTypeList")
	@ResponseBody
	public ResponseEntity<Response> booleanGUIControlTypeList(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "lang", required = true) String lang) {

		logger.info(LOG_START_REST_CONTROLLER + "/codelist/booleanGUIControlTypeList");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.booleanGUIControlTypeList(lang), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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

    @PostMapping(value = "/weightingTypeList")
	@ResponseBody
	public ResponseEntity<Response> weightingTypeList(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "lang", required = true) String lang) {

		logger.info(LOG_START_REST_CONTROLLER + "/codelist/weightingTypeList");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.weightingTypeList(lang), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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

    @PostMapping(value = "/evaluationMethodTypeList")
	@ResponseBody
	public ResponseEntity<Response> evaluationMethodTypeList(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "lang", required = true) String lang) {

		logger.info(LOG_START_REST_CONTROLLER + "/codelist/evaluationMethodTypeList");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.evaluationMethodTypeList(lang), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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
}
