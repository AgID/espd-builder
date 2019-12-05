package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ContractFolderIDType;

/**
 * Corresponding to {@link ContractFolderIDType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ContractFolderIDModel extends IdentifierModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String referenceNumber;
	

	/**
	 * constructor
	 */
	public ContractFolderIDModel() {
		this.referenceNumber = StringUtils.EMPTY;
	}	

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
}
