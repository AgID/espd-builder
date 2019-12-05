package com.pccube.espd.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.CodeType;

/**
 * Attributes of the {@link CodeType} that are common for CommonBasicComponents.
 * Corresponding to {@link CodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CodeModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected String listID;
	protected String listAgencyID;
	protected String listAgencyName;
	protected String listName;
	protected String listVersionID;
	protected String name;
	protected String languageID;
	protected String listURI;
	protected String listSchemeURI;
	
	
	/**
	 * constructor
	 */
	public CodeModel() {
		this.listID = StringUtils.EMPTY;
		this.listAgencyID = StringUtils.EMPTY;
		this.listAgencyName = StringUtils.EMPTY;
		this.listName = StringUtils.EMPTY;
		this.listVersionID = StringUtils.EMPTY;
		this.name = StringUtils.EMPTY;
		this.languageID = StringUtils.EMPTY;
		this.listURI = StringUtils.EMPTY;
		this.listSchemeURI = StringUtils.EMPTY;
	}
	
	
	public String getListID() {
		return listID;
	}
	public void setListID(String listID) {
		this.listID = listID;
	}
	public String getListAgencyID() {
		return listAgencyID;
	}
	public void setListAgencyID(String listAgencyID) {
		this.listAgencyID = listAgencyID;
	}
	public String getListAgencyName() {
		return listAgencyName;
	}
	public void setListAgencyName(String listAgencyName) {
		this.listAgencyName = listAgencyName;
	}
	public String getListName() {
		return listName;
	}
	public void setListName(String listName) {
		this.listName = listName;
	}
	public String getListVersionID() {
		return listVersionID;
	}
	public void setListVersionID(String listVersionID) {
		this.listVersionID = listVersionID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguageID() {
		return languageID;
	}
	public void setLanguageID(String languageID) {
		this.languageID = languageID;
	}
	public String getListURI() {
		return listURI;
	}
	public void setListURI(String listURI) {
		this.listURI = listURI;
	}
	public String getListSchemeURI() {
		return listSchemeURI;
	}
	public void setListSchemeURI(String listSchemeURI) {
		this.listSchemeURI = listSchemeURI;
	}
	
	
}
