package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ProcurementProjectType;

/**
 * Corresponding to {@link ProcurementProjectType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class ProcurementProjectModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IDModel idModel;
	private List<String> names;
	private List<DescriptionModel> descriptionModels;
	private ProcurementTypeCodeModel procurementTypeCodeModel;
	private List<CommodityClassificationModel> mainCommodityClassificationModels;
	
	
	/**
	 * constructor
	 */
	public ProcurementProjectModel() {
		this.idModel = new IDModel();
		this.names = new ArrayList<String>();
		this.descriptionModels = new ArrayList<DescriptionModel>();
		this.procurementTypeCodeModel = new ProcurementTypeCodeModel();
		this.mainCommodityClassificationModels = new ArrayList<CommodityClassificationModel>();
	}
	
	
	public IDModel getIdModel() {
		return idModel;
	}
	public void setIdModel(IDModel idModel) {
		this.idModel = idModel;
	}
	public List<String> getNames() {
		if (names == null)
			names = new ArrayList<String>();
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public List<DescriptionModel> getDescriptionModels() {
		if (descriptionModels == null)
			descriptionModels = new ArrayList<DescriptionModel>();
		return descriptionModels;
	}
	public void setDescriptionModels(List<DescriptionModel> descriptionModels) {
		this.descriptionModels = descriptionModels;
	}
	public ProcurementTypeCodeModel getProcurementTypeCodeModel() {
		return procurementTypeCodeModel;
	}
	public void setProcurementTypeCodeModel(ProcurementTypeCodeModel procurementTypeCodeModel) {
		this.procurementTypeCodeModel = procurementTypeCodeModel;
	}
	public List<CommodityClassificationModel> getMainCommodityClassificationModels() {
		if (mainCommodityClassificationModels == null)
			mainCommodityClassificationModels = new ArrayList<CommodityClassificationModel>();
		return mainCommodityClassificationModels;
	}
	public void setMainCommodityClassificationModels(List<CommodityClassificationModel> mainCommodityClassificationModels) {
		this.mainCommodityClassificationModels = mainCommodityClassificationModels;
	}

}
