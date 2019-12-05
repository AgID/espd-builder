package com.pccube.espd.param;


public class Response {

	private Result result;
	private Object payload;
	

	public Response() {
		this.result = new Result();
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public Object getPayload() {
		return payload;
	}
	public void setPayload(Object payload) {
		this.payload = payload;
	}
}
