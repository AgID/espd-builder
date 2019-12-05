package com.pccube.espd.model;

import java.io.Serializable;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EmployeeQuantityType;

/**
 * Corresponding to {@link EmployeeQuantityType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class EmployeeQuantityModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer employeeQuantity;


	/**
	 * constructor
	 */
	public EmployeeQuantityModel() {
		this.employeeQuantity = null;
	}


	public Integer getEmployeeQuantity() {
		return employeeQuantity;
	}
	public void setEmployeeQuantity(Integer employeeQuantity) {
		this.employeeQuantity = employeeQuantity;
	}
	
	
}
