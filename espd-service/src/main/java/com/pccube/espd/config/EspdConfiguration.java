package com.pccube.espd.config;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.pccube.espd.utility.PropertySplitter;

/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
@Repository
public class EspdConfiguration {

    @Value("${espd.environment:false}")
    private boolean espdEnvironment;

	//@Value("#{PropertySplitter.mapWithSeparators('${espd.page.breadcrumb:}', ',', '->')}")
	//private Map<String, String> breadcrumbAsMap;
    @Value("${espd.page.breadcrumb:''}")
	private String breadcrumbAsMap;
    
    @Value("${espd.page.showFooter:true}")
    private boolean showFooter;

    @Value("${piwik.enabled:false}")
    private boolean piwikEnabled;

    @Value("${info.build.version:N/A}")
    private String buildVersion;

    @Value("${espd.exchange-model.version:ESPD-EDMv2.1.0-SELFCONTAINED}")
	private String exchangeModelVersion;

    @Value("${espd.taxonomy.version:2.1.0}")
	private String taxonomyVersion;

    @Value("${last.build.date:N/A}")
    private String lastBuildDate;

    @Value("${spring.messages.basename:i18n/messages}")
    private String springMessagesBasename;

    @Value("${spring.codelist.basename:codelists/xlsx/ESPD-CodeLists-V2.1.0.xlsx}")
    private String springCodelistBasename;

    @Value("${transformation.output.xml.request.regulated:xml/REGULATED-ESPDRequest.xml}")
    private String xmlRequestRegulated;
    
    @Value("${transformation.output.xml.response.regulated:xml/REGULATED-ESPDResponse.xml}")
    private String xmlResponseRegulated;
    
    @Value("${transformation.output.xml.request.selfcontained:xml/SELFCONTAINED-ESPDRequest_v2.1.0_ita.xml}")
    private String xmlRequestSelfcontained;

    @Value("${transformation.output.xml.request.selfcontained.custom:xml/SELFCONTAINED-ESPDRequest_v2.1.0_ita_custom.xml}")
    private String xmlRequestSelfcontainedCustom;
    
    @Value("${transformation.output.xml.response.selfcontained:xml/SELFCONTAINED-ESPDResponse.xml}")
    private String xmlResponseSelfcontained;

    @Value("${ubl.version:2.2}")
    private String ublVersion;
    
    @Value("${bis.identification:4.1}")
    private String bisIdentification;
    
    @Value("${iso.number.publication:ISO/IEC 9834-8:2008}")
    private String isoNumberPublication;
    
    @Value("${client.identification:Consip S.p.A. a socio unico}")
    private String clientIdentification;
    
    @Value("${client.taxcode:05359681003}")
    private String clientTaxCode;
    
    @Value("${client.location:IT}")
    private String clientLocation;
    
    
	public boolean isEspdEnvironment() {
		return espdEnvironment;
	}

	public void setEspdEnvironment(boolean espdEnvironment) {
		this.espdEnvironment = espdEnvironment;
	}

	public Map<String, String> getBreadcrumbAsMap() {
		//return breadcrumbAsMap;
		return PropertySplitter.mapWithSeparators(breadcrumbAsMap, ",", "->");
	}

	public void setBreadcrumbAsMap(String breadcrumbAsMap) {
		this.breadcrumbAsMap = breadcrumbAsMap;
	}

	public boolean isShowFooter() {
		return showFooter;
	}

	public void setShowFooter(boolean showFooter) {
		this.showFooter = showFooter;
	}

	public boolean isPiwikEnabled() {
		return piwikEnabled;
	}

	public void setPiwikEnabled(boolean piwikEnabled) {
		this.piwikEnabled = piwikEnabled;
	}

	public String getBuildVersion() {
		return buildVersion;
	}

	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	public String getExchangeModelVersion() {
		return exchangeModelVersion;
	}

	public void setExchangeModelVersion(String exchangeModelVersion) {
		this.exchangeModelVersion = exchangeModelVersion;
	}

	public String getTaxonomyVersion() {
		return taxonomyVersion;
	}

	public void setTaxonomyVersion(String taxonomyVersion) {
		this.taxonomyVersion = taxonomyVersion;
	}

	public String getLastBuildDate() {
		return lastBuildDate;
	}

	public void setLastBuildDate(String lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}

	public String getSpringMessagesBasename() {
		return springMessagesBasename;
	}

	public void setSpringMessagesBasename(String springMessagesBasename) {
		this.springMessagesBasename = springMessagesBasename;
	}

	public String getSpringCodelistBasename() {
		return springCodelistBasename;
	}

	public void setSpringCodelistBasename(String springCodelistBasename) {
		this.springCodelistBasename = springCodelistBasename;
	}

	public String getXmlRequestRegulated() {
		return xmlRequestRegulated;
	}

	public void setXmlRequestRegulated(String xmlRequestRegulated) {
		this.xmlRequestRegulated = xmlRequestRegulated;
	}

	public String getXmlResponseRegulated() {
		return xmlResponseRegulated;
	}

	public void setXmlResponseRegulated(String xmlResponseRegulated) {
		this.xmlResponseRegulated = xmlResponseRegulated;
	}

	public String getXmlRequestSelfcontained() {
		return xmlRequestSelfcontained;
	}

	public void setXmlRequestSelfcontained(String xmlRequestSelfcontained) {
		this.xmlRequestSelfcontained = xmlRequestSelfcontained;
	}

	public String getXmlRequestSelfcontainedCustom() {
		return xmlRequestSelfcontainedCustom;
	}

	public void setXmlRequestSelfcontainedCustom(String xmlRequestSelfcontainedCustom) {
		this.xmlRequestSelfcontainedCustom = xmlRequestSelfcontainedCustom;
	}

	public String getXmlResponseSelfcontained() {
		return xmlResponseSelfcontained;
	}

	public void setXmlResponseSelfcontained(String xmlResponseSelfcontained) {
		this.xmlResponseSelfcontained = xmlResponseSelfcontained;
	}

	public String getUblVersion() {
		return ublVersion;
	}

	public void setUblVersion(String ublVersion) {
		this.ublVersion = ublVersion;
	}

	public String getBisIdentification() {
		return bisIdentification;
	}

	public void setBisIdentification(String bisIdentification) {
		this.bisIdentification = bisIdentification;
	}

	public String getIsoNumberPublication() {
		return isoNumberPublication;
	}

	public void setIsoNumberPublication(String isoNumberPublication) {
		this.isoNumberPublication = isoNumberPublication;
	}

	public String getClientIdentification() {
		return clientIdentification;
	}

	public void setClientIdentification(String clientIdentification) {
		this.clientIdentification = clientIdentification;
	}

	public String getClientTaxCode() {
		return clientTaxCode;
	}

	public void setClientTaxCode(String clientTaxCode) {
		this.clientTaxCode = clientTaxCode;
	}

	public String getClientLocation() {
		return clientLocation;
	}

	public void setClientLocation(String clientLocation) {
		this.clientLocation = clientLocation;
	}
    
    
}
