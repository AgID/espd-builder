
package com.pccube.espd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

import com.pccube.espd.delegate.ContactServiceDelegate;
import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.param.Response;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/contact")
public class ContactController extends GenericController {
	
	static final Logger logger = Logger.getLogger(ContactController.class);

    @Autowired
    private ContactServiceDelegate delegate;
    
    
    @PostMapping(value = "/view")
    @ResponseBody
    public ResponseEntity<Response> view(HttpServletRequest request, HttpServletResponse response,
    		@RequestParam(name = "lang", required = true) String lang) {

		logger.info(LOG_START_REST_CONTROLLER + "/contact/view");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.view(lang), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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
