package com.pccube.espd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EconomicOperatorRoleType;

/**
 * Corresponding to {@link EconomicOperatorRoleType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class EconomicOperatorRoleModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private RoleCodeModel roleCodeModel;
	private List<String> roleDescriptions;
	

	/**
	 * constructor
	 */
	public EconomicOperatorRoleModel() {
		this.roleCodeModel = new RoleCodeModel();
		this.roleDescriptions = new ArrayList<String>();
	}
	

	public RoleCodeModel getRoleCodeModel() {
		return roleCodeModel;
	}
	public void setRoleCodeModel(RoleCodeModel roleCodeModel) {
		this.roleCodeModel = roleCodeModel;
	}
	public List<String> getRoleDescriptions() {
		return roleDescriptions;
	}
	public void setRoleDescriptions(List<String> roleDescriptions) {
		this.roleDescriptions = roleDescriptions;
	}
}
