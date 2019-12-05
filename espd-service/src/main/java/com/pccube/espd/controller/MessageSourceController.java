
package com.pccube.espd.controller;

import com.pccube.espd.delegate.MessageSourceServiceDelegate;
import com.pccube.espd.exception.ServiceException;
import com.pccube.espd.param.Response;

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

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/message")
public class MessageSourceController extends GenericController {
	
	static final Logger logger = Logger.getLogger(MessageSourceController.class);
	
    @Autowired
    private MessageSourceServiceDelegate delegate;
    
    
    @PostMapping(value = {"/translate"})
    @ResponseBody
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseEntity<Response> translate(HttpServletRequest request, HttpServletResponse response) {

		logger.info(LOG_START_REST_CONTROLLER + "/message/translate");
    	Response serviceResponse = new Response();
		try {
			logger.info(LOG_SERVICE_CALL);
			setResponse(serviceResponse, delegate.translate(request.getReader()), RESPONSE_OK_CODE, RESPONSE_OK_DESCRIPTION);
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

    /*@RequestMapping(value = {"/translate", "/{flow:request|response}/{agent:ca|eo}/translate"}, method = RequestMethod.POST)
    @ResponseBody public String translate(@RequestParam(value = "labels[]") String[] labels, @RequestParam String lang) throws JsonProcessingException {
        System.out.print(mapper.writeValueAsString(labels).concat(" " + lang));
    	Locale locale = Locale.forLanguageTag(lang);
        for (int i = 0; i < labels.length; i++) {
            if (isBlank(labels[i])) {
                continue;
            }
            labels[i] = ms.getMessage(labels[i], null, locale);
        }
        // TODO use MessageSourceResolvable to retrieve all labels at once
        return mapper.writeValueAsString(labels);
    }*/
}
