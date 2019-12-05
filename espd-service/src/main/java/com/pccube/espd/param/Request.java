package com.pccube.espd.param;


public class Request {

	private Authentication authentication;
	private Object bean;

	public Authentication getAuthentication() {
		return authentication;
	}
	public void setAuthentication(Authentication authentication) {
		this.authentication = authentication;
	}
	public Object getBean() {
		return bean;
	}
	public void setBean(Object bean) {
		this.bean = bean;
	}
	
}
