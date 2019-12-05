package com.pccube.espd.model;

import java.io.Serializable;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CommodityClassificationType;

/**
 * Corresponding to {@link CommodityClassificationType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CommodityClassificationModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ItemClassificationCodeModel itemClassificationCodeModel;
	

	/**
	 * constructor
	 */
	public CommodityClassificationModel() {
		this.itemClassificationCodeModel = new ItemClassificationCodeModel();
	}
	
	
	public ItemClassificationCodeModel getItemClassificationCodeModel() {
		return itemClassificationCodeModel;
	}

	public void setItemClassificationCodeModel(ItemClassificationCodeModel itemClassificationCodeModel) {
		this.itemClassificationCodeModel = itemClassificationCodeModel;
	}

}
