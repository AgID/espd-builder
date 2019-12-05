package com.pccube.espd.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import com.pccube.espd.enums.Currency;
import com.pccube.espd.enums.Iso;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CountryType;


/**
 * Corresponding to {@link CountryType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CountryModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private IdentificationCodeModel identificationCodeModel;
	
	private Currency currency;
	private String iso2Code;
	private Iso iso;
	
	
	/**
	 * constructor
	 */
	public CountryModel() {
		this.name = StringUtils.EMPTY;
		this.identificationCodeModel = new IdentificationCodeModel();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public IdentificationCodeModel getIdentificationCodeModel() {
		return identificationCodeModel;
	}
	public void setIdentificationCodeModel(IdentificationCodeModel identificationCodeModel) {
		this.identificationCodeModel = identificationCodeModel;
	}
	
	
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public String getIso2Code() {
		return iso2Code;
	}
	public void setIso2Code(String iso2Code) {
		this.iso2Code = iso2Code;
	}
	public Iso getIso() {
		return iso;
	}
	public void setIso(Iso iso) {
		this.iso = iso;
	}
	
	
}
