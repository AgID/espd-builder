package com.pccube.espd.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonFormat;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PersonType;

/**
 * Corresponding to {@link PersonType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class PersonModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String familyName;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date birthDate;
	private String birthplaceName;
	private AddressModel residenceAddressModel;
	private ContactModel contactModel;

	
	/**
	 * constructor
	 */
	public PersonModel() {
		this.firstName = StringUtils.EMPTY;
		this.familyName = StringUtils.EMPTY;
		this.birthDate = null;
		this.birthplaceName = StringUtils.EMPTY;
		this.residenceAddressModel = new AddressModel();
		this.contactModel = new ContactModel();
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getBirthplaceName() {
		return birthplaceName;
	}
	public void setBirthplaceName(String birthplaceName) {
		this.birthplaceName = birthplaceName;
	}
	public AddressModel getResidenceAddressModel() {
		return residenceAddressModel;
	}
	public void setResidenceAddressModel(AddressModel residenceAddressModel) {
		this.residenceAddressModel = residenceAddressModel;
	}
	public ContactModel getContactModel() {
		return contactModel;
	}
	public void setContactModel(ContactModel contactModel) {
		this.contactModel = contactModel;
	}
	
}
