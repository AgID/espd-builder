package com.pccube.espd.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pccube.espd.factory.GenericFactory;

@JsonIgnoreProperties(value = { "allFieldsNull" })
public class BaseModel {
	
	public boolean isAllFieldsNull() throws IllegalAccessException {
		return GenericFactory.isAllFieldsNull(this);  
	}
}
