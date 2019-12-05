package com.pccube.espd.model;

import org.apache.commons.lang3.StringUtils;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ItemClassificationCodeType;

/**
 * Corresponding to {@link ItemClassificationCodeType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ItemClassificationCodeModel extends CodeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String itemClassificationCode;
	
	
	/**
	 * constructor
	 */	
	public ItemClassificationCodeModel() {
		this.itemClassificationCode = StringUtils.EMPTY;
	}
	

	public String getItemClassificationCode() {
		return itemClassificationCode;
	}

	public void setItemClassificationCode(String itemClassificationCode) {
		this.itemClassificationCode = itemClassificationCode;
	}
}
