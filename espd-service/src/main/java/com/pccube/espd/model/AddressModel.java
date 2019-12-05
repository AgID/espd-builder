package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType;

/**
 * Corresponding to {@link AddressType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class AddressModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String streetName;
	private String cityName;
	private String postalZone;
	private CountryModel countryModel;
	private List<AddressLineModel> addressLineModels;
	
	/**
	 * constructor
	 */
	public AddressModel() {
		this.streetName = StringUtils.EMPTY;
		this.cityName = StringUtils.EMPTY;
		this.postalZone = StringUtils.EMPTY;
		this.countryModel = new CountryModel();
		this.addressLineModels = new ArrayList<AddressLineModel>();
	}
	
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getPostalZone() {
		return postalZone;
	}
	public void setPostalZone(String postalZone) {
		this.postalZone = postalZone;
	}
	public CountryModel getCountryModel() {
		return countryModel;
	}
	public void setCountryModel(CountryModel countryModel) {
		this.countryModel = countryModel;
	}
	public List<AddressLineModel> getAddressLineModels() {
		if (addressLineModels == null)
			addressLineModels = new ArrayList<AddressLineModel>();
		return addressLineModels;
	}
	public void setAddressLineModels(List<AddressLineModel> addressLineModels) {
		this.addressLineModels = addressLineModels;
	}

}
