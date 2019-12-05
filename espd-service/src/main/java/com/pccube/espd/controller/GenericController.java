package com.pccube.espd.controller;

import javax.servlet.http.HttpServletResponse;

import com.pccube.espd.param.Response;

public class GenericController {

	protected static final String RESPONSE_OK_CODE = "200";
	protected static final String RESPONSE_OK_DESCRIPTION = "OK";
	protected static final String RESPONSE_KO_CODE = "500";
	protected static final String RESPONSE_KO_DESCRIPTION = "Si è verificato un errore imprevisto.";
	
	protected static final String LOG_START_REST_CONTROLLER = "Start rest controller -> ";
	protected static final String LOG_SERVICE_CALL = "Service call";
	protected static final String LOG_SERVICE_CALL_PERFORMED = "Service call performed";
	protected static final String LOG_SERVICE_ERROR = "Service error";
	protected static final String LOG_ERROR = "Error";
	protected static final String LOG_EXIT_CODE = "EXIT CODE : ";
	protected static final String LOG_TEXT =      "TEXT      : ";
	protected static final String LOG_END_REST_CONTROLLER = "End rest controller";
	
	
	public HttpServletResponse setHeaders(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin","*");
		return response;
	}
	
	protected Response setResponse(Response serviceResponse, Object payload, String exitCode, String text) {
		serviceResponse.setPayload(payload);
		serviceResponse.getResult().setExitCode(exitCode);
		serviceResponse.getResult().setText(text);
		
		return serviceResponse;
	}
	
}
