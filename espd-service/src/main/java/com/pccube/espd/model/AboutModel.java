package com.pccube.espd.model;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

public class AboutModel extends BaseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String buildVersion;
	private String lastBuildDate;
	private String environment;


	/**
	 * constructor
	 */
	public AboutModel() {
		this.buildVersion = StringUtils.EMPTY;
		this.lastBuildDate = StringUtils.EMPTY;
		this.environment = StringUtils.EMPTY;
	}
	

	public String getBuildVersion() {
		return buildVersion;
	}

	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	public String getLastBuildDate() {
		return lastBuildDate;
	}

	public void setLastBuildDate(String lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
}
