package com.pccube.espd.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ContactType;

/**
 * Corresponding to {@link ContactType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ContactModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String telephone;
	private String telefax;
	private String email;
	
	private String contactHeader;
	private String contactInfo;
	private String reportApplicationIssue;
	private String reportSecurityIncidentTitle;
	private String reportSecurityIncident;
	private String backToMain;


	/**
	 * constructor
	 */
	public ContactModel() {
		this.name = StringUtils.EMPTY;
		this.telephone = StringUtils.EMPTY;
		this.telefax = StringUtils.EMPTY;
		this.email = StringUtils.EMPTY;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getTelefax() {
		return telefax;
	}
	public void setTelefax(String telefax) {
		this.telefax = telefax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getContactHeader() {
		return contactHeader;
	}
	public void setContactHeader(String contactHeader) {
		this.contactHeader = contactHeader;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	public String getReportApplicationIssue() {
		return reportApplicationIssue;
	}
	public void setReportApplicationIssue(String reportApplicationIssue) {
		this.reportApplicationIssue = reportApplicationIssue;
	}
	public String getReportSecurityIncidentTitle() {
		return reportSecurityIncidentTitle;
	}
	public void setReportSecurityIncidentTitle(String reportSecurityIncidentTitle) {
		this.reportSecurityIncidentTitle = reportSecurityIncidentTitle;
	}
	public String getReportSecurityIncident() {
		return reportSecurityIncident;
	}
	public void setReportSecurityIncident(String reportSecurityIncident) {
		this.reportSecurityIncident = reportSecurityIncident;
	}
	public String getBackToMain() {
		return backToMain;
	}
	public void setBackToMain(String backToMain) {
		this.backToMain = backToMain;
	}
	
	
}
