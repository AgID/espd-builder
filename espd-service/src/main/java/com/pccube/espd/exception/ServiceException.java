package com.pccube.espd.exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	private final String code;
	
	public ServiceException(String code, String text) {
		super(text);
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
