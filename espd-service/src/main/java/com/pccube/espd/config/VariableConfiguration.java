package com.pccube.espd.config;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pccube.espd.enums.CodeList;
import com.pccube.espd.factory.MarshallerCodeListFactory;
import com.pccube.espd.factory.MarshallerCriteriaFactory;
import com.pccube.espd.model.CodeModel;
import com.pccube.espd.param.Item;

/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
@Configuration
public class VariableConfiguration extends GenericConfiguration {

	static final Logger logger = Logger.getLogger(VariableConfiguration.class);

	@Autowired
	private MarshallerCodeListFactory marshallerCodeListFactory;

	@Autowired
	private MarshallerCriteriaFactory marshallerCriteriaFactory;
	
	/*
	 * Declaring
	 */


	@Autowired
	@Qualifier("cmBooleanGUIControlType")
	public CodeModel cmBooleanGUIControlType;
	
	@Autowired
	@Qualifier("cmConfidentialityLevel")
	public CodeModel cmConfidentialityLevel;

	@Autowired
	@Qualifier("cmCountryCodeIdentifier")
	public CodeModel cmCountryCodeIdentifier;
	
	@Autowired
	@Qualifier("cmCriterionElementType")
	public CodeModel cmCriterionElementType;
	
	@Autowired
	@Qualifier("cmCPVCodes")
	public CodeModel cmCPVCodes;

	@Autowired
	@Qualifier("cmDocRefContentType")
	public CodeModel cmDocRefContentType;

	@Autowired
	@Qualifier("cmEOIDType")
	public CodeModel cmEOIDType;

	@Autowired
	@Qualifier("cmEOIndustryClassificationCode")
	public CodeModel cmEOIndustryClassificationCode;

	@Autowired
	@Qualifier("cmEORoleType")
	public CodeModel cmEORoleType;

	@Autowired
	@Qualifier("cmEvaluationMethodType")
	public CodeModel cmEvaluationMethodType;
	
	@Autowired
	@Qualifier("cmProcedureType")
	public CodeModel cmProcedureType;

	@Autowired
	@Qualifier("cmProfileExecutionID")
	public CodeModel cmProfileExecutionID;

	@Autowired
	@Qualifier("cmProjectType")
	public CodeModel cmProjectType;

	@Autowired
	@Qualifier("cmQualificationApplicationType")
	public CodeModel cmQualificationApplicationType;

	@Autowired
	@Qualifier("cmResponseDataType")
	public CodeModel cmResponseDataType;

	@Autowired
	@Qualifier("cmWeightingType")
	public CodeModel cmWeightingType;

	@Autowired
	@Qualifier("itemCriteria")
	public Item itemCriteria;
	
	@Autowired
	@Qualifier("itemCriteriaCustom")
	public Item itemCriteriaCustom;
	
	/*
	 * Loading
	 */
	
	@Bean
	@Qualifier("cmBooleanGUIControlType")
	public CodeModel loadCmBooleanGUIControlType(){
		logger.info(LOG_START_CONFIGURATION + "loadCmBooleanGUIControlType");
		
		if (cmBooleanGUIControlType == null){
			cmBooleanGUIControlType = new CodeModel();
    	}
		
		try {
			cmBooleanGUIControlType = marshallerCodeListFactory.codeListIdentification(CodeList.BOOLEAN_GUI_CONTROL_TYPE);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);
		return cmBooleanGUIControlType;
	}
	
	@Bean
	@Qualifier("cmConfidentialityLevel")
	public CodeModel loadCmConfidentialityLevel(){
		logger.info(LOG_START_CONFIGURATION + "loadCmConfidentialityLevel");
		
		if (cmConfidentialityLevel == null){
			cmConfidentialityLevel = new CodeModel();
    	}
		
		try {
			cmConfidentialityLevel = marshallerCodeListFactory.codeListIdentification(CodeList.CONFIDENTIALITY_LEVEL);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);
		return cmConfidentialityLevel;
	}
	
	@Bean
	@Qualifier("cmCountryCodeIdentifier")
	public CodeModel loadCmCountryCodeIdentifier(){
		logger.info(LOG_START_CONFIGURATION + "loadCmCountryCodeIdentifier");
		
		if (cmCountryCodeIdentifier == null){
			cmCountryCodeIdentifier = new CodeModel();
    	}
		
		try {
			cmCountryCodeIdentifier = marshallerCodeListFactory.codeListIdentification(CodeList.COUNTRY_CODE_IDENTIFIER);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);		
		return cmCountryCodeIdentifier;
	}
	
	@Bean
	@Qualifier("cmCriterionElementType")
	public CodeModel loadCmCriterionElementType(){
		logger.info(LOG_START_CONFIGURATION + "loadCmCriterionElementType");
		
		if (cmCriterionElementType == null){
			cmCriterionElementType = new CodeModel();
    	}
		
		try {
			cmCriterionElementType = marshallerCodeListFactory.codeListIdentification(CodeList.CRITERION_ELEMENT_TYPE);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}
		
		logger.info(LOG_END_CONFIGURATION);				
		return cmCriterionElementType;
	}
	
	@Bean
	@Qualifier("cmCPVCodes")
	public CodeModel loadCmCPVCodes(){
		logger.info(LOG_START_CONFIGURATION + "loadCmCPVCodes");
		
		if (cmCPVCodes == null){
			cmCPVCodes = new CodeModel();
    	}
		
		try {
			cmCPVCodes = marshallerCodeListFactory.codeListIdentification(CodeList.CPV_CODES);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);				
		return cmCPVCodes;
	}
	
	@Bean
	@Qualifier("cmDocRefContentType")
	public CodeModel loadCmDocRefContentType(){
		logger.info(LOG_START_CONFIGURATION + "loadCmDocRefContentType");
		
		if (cmDocRefContentType == null){
			cmDocRefContentType = new CodeModel();
    	}
		
		try {
			cmDocRefContentType = marshallerCodeListFactory.codeListIdentification(CodeList.DOC_REF_CONTENT_TYPE);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);				
		return cmDocRefContentType;
	}
	
	@Bean
	@Qualifier("cmEOIDType")
	public CodeModel loadCmEOIDType(){
		logger.info(LOG_START_CONFIGURATION + "loadCmEOIDType");
		
		if (cmEOIDType == null){
			cmEOIDType = new CodeModel();
    	}
		
		try {
			cmEOIDType = marshallerCodeListFactory.codeListIdentification(CodeList.EO_ID_TYPE);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);			
		return cmEOIDType;
	}
	
	@Bean
	@Qualifier("cmEOIndustryClassificationCode")
	public CodeModel loadCmEOIndustryClassificationCode(){
		logger.info(LOG_START_CONFIGURATION + "loadCmEOIndustryClassificationCode");
		
		if (cmEOIndustryClassificationCode == null){
			cmEOIndustryClassificationCode = new CodeModel();
    	}
		
		try {
			cmEOIndustryClassificationCode = marshallerCodeListFactory.codeListIdentification(CodeList.EO_INDUSTRY_CLASSIFICATION_CODE);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);			
		return cmEOIndustryClassificationCode;
	}
	
	@Bean
	@Qualifier("cmEORoleType")
	public CodeModel loadCmEORoleType(){
		logger.info(LOG_START_CONFIGURATION + "loadCmEORoleType");
		
		if (cmEORoleType == null){
			cmEORoleType = new CodeModel();
    	}
		
		try {
			cmEORoleType = marshallerCodeListFactory.codeListIdentification(CodeList.EO_ROLE_TYPE);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);			
		return cmEORoleType;
	}
	
	@Bean
	@Qualifier("cmEvaluationMethodType")
	public CodeModel loadCmEvaluationMethodType(){
		logger.info(LOG_START_CONFIGURATION + "loadCmEvaluationMethodType");
		
		if (cmEvaluationMethodType == null){
			cmEvaluationMethodType = new CodeModel();
    	}
		
		try {
			cmEvaluationMethodType = marshallerCodeListFactory.codeListIdentification(CodeList.EVALUATION_METHOD_TYPE);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);			
		return cmEvaluationMethodType;
	}
	
	@Bean
	@Qualifier("cmProcedureType")
	public CodeModel loadCmProcedureType(){
		logger.info(LOG_START_CONFIGURATION + "loadCmProcedureType");
		
		if (cmProcedureType == null){
			cmProcedureType = new CodeModel();
    	}
		
		try {
			cmProcedureType = marshallerCodeListFactory.codeListIdentification(CodeList.PROCEDURE_TYPE);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);			
		return cmProcedureType;
	}
	
	@Bean
	@Qualifier("cmProfileExecutionID")
	public CodeModel loadCmProfileExecutionID(){
		logger.info(LOG_START_CONFIGURATION + "loadCmProfileExecutionID");
		
		if (cmProfileExecutionID == null){
			cmProfileExecutionID = new CodeModel();
    	}
		
		try {
			cmProfileExecutionID = marshallerCodeListFactory.codeListIdentification(CodeList.PROFILE_EXECUTION_ID);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);			
		return cmProfileExecutionID;
	}

	@Bean
	@Qualifier("cmProjectType")
	public CodeModel loadCmProjectType(){
		logger.info(LOG_START_CONFIGURATION + "loadCmProjectType");
		
		if (cmProjectType == null){
			cmProjectType = new CodeModel();
    	}
		
		try {
			cmProjectType = marshallerCodeListFactory.codeListIdentification(CodeList.PROJECT_TYPE);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);				
		return cmProjectType;
	}

	@Bean
	@Qualifier("cmQualificationApplicationType")
	public CodeModel loadCmQualificationApplicationType(){
		logger.info(LOG_START_CONFIGURATION + "loadCmQualificationApplicationType");
		
		if (cmQualificationApplicationType == null){
			cmQualificationApplicationType = new CodeModel();
    	}
		
		try {
			cmQualificationApplicationType = marshallerCodeListFactory.codeListIdentification(CodeList.QUALIFICATION_APPLICATION_TYPE);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);			
		return cmQualificationApplicationType;
	}

	@Bean
	@Qualifier("cmResponseDataType")
	public CodeModel loadCmResponseDataType(){
		logger.info(LOG_START_CONFIGURATION + "loadCmResponseDataType");
		
		if (cmResponseDataType == null){
			cmResponseDataType = new CodeModel();
    	}
		
		try {
			cmResponseDataType = marshallerCodeListFactory.codeListIdentification(CodeList.RESPONSE_DATA_TYPE);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);				
		return cmResponseDataType;
	}

	@Bean
	@Qualifier("cmWeightingType")
	public CodeModel loadCmWeightingType(){
		logger.info(LOG_START_CONFIGURATION + "loadCmWeightingType");
		
		if (cmWeightingType == null){
			cmWeightingType = new CodeModel();
    	}
		
		try {
			cmWeightingType = marshallerCodeListFactory.codeListIdentification(CodeList.WEIGHTING_TYPE);
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);				
		return cmWeightingType;
	}

	@Bean
	@Qualifier("itemCriteria")
	public Item loadItemCriteria(){
		logger.info(LOG_START_CONFIGURATION + "loadItemCriteria");
		
		if (itemCriteria == null){
			itemCriteria = new Item();
    	}
		
		try {
			itemCriteria.setCriteriaRequest(marshallerCriteriaFactory.criteriaRequest());
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);				
		return itemCriteria;
	}

	@Bean
	@Qualifier("itemCriteriaCustom")
	public Item loadItemCriteriaCustom(){
		logger.info(LOG_START_CONFIGURATION + "loadItemCriteriaCustom");
		
		if (itemCriteriaCustom == null){
			itemCriteriaCustom = new Item();
    	}
		
		try {
			itemCriteriaCustom.setCriteriaRequest(marshallerCriteriaFactory.criteriaRequestCustom());
		} catch (Exception ex) {
			logger.error(LOG_CONFIGURATION_ERROR, ex);
		}

		logger.info(LOG_END_CONFIGURATION);				
		return itemCriteriaCustom;
	}
}
