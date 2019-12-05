package com.pccube.espd.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PeriodType;

/**
 * Corresponding to {@link PeriodType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class PeriodModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date startDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private Date endDate;
	
	
	/**
	 * constructor
	 */
	public PeriodModel() {
		this.startDate = null;
		this.endDate = null;
	}
	
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
