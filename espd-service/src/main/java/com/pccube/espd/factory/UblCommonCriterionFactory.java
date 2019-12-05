package com.pccube.espd.factory;

import java.util.ArrayList;
import java.util.List;

import com.pccube.espd.config.EspdConfiguration;
import com.pccube.espd.config.VariableConfiguration;
import com.pccube.espd.enums.CriterionElement;
import com.pccube.espd.model.TenderingCriterionModel;
import com.pccube.espd.model.TenderingCriterionPropertyGroupModel;
import com.pccube.espd.model.TenderingCriterionPropertyModel;
import com.pccube.espd.model.TenderingCriterionResponseModel;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EvidenceSuppliedType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LegislationType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PeriodType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ResponseValueType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionPropertyGroupType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionPropertyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionResponseType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CertificationLevelDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeightingConsiderationDescriptionType;

/**
 * Simple factory for creating aggregate UBL elements that are shared between a {@link TenderingCriterionType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class UblCommonCriterionFactory extends GenericCommonFactory {
	
	protected static List<TenderingCriterionPropertyType> lotsPropertyTypes = null;
	
	protected static List<TenderingCriterionPropertyType> cpvsPropertyTypes = null;


	public UblCommonCriterionFactory(EspdConfiguration espdConfiguration, VariableConfiguration variableConfiguration) {
		super(espdConfiguration, variableConfiguration);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
     * A tendering criterion describes a rule or a condition that is used by the contracting body 
     * to evaluate and compare tenders by economic operators and which will be used 
     * for the exclusion and the selection of candidates to the award decision.
     * 
     * Cardinality 0..n
     * 
     * @param tenderingCriterionModels
     *
     * @return The corresponding UBL element
	 * @throws IllegalAccessException 
     */
    public static List<TenderingCriterionType> buildTenderingCriterionTypes(List<TenderingCriterionModel> tenderingCriterionModels) throws IllegalAccessException {
    	List<TenderingCriterionType> tenderingCriterionTypes = null;
        
    	if (tenderingCriterionModels != null && tenderingCriterionModels.size() > 0){
    		tenderingCriterionTypes = new ArrayList<TenderingCriterionType>();
    		TenderingCriterionType tenderingCriterionType = null;
    		for (TenderingCriterionModel tenderingCriterionModel : tenderingCriterionModels){
    			tenderingCriterionType = new TenderingCriterionType();
    			tenderingCriterionType.setID(UblCommonBasicFactory.buildIdType(tenderingCriterionModel.getIdModel()));
    			tenderingCriterionType.setCriterionTypeCode(UblCommonBasicFactory.buildCriterionTypeCodeType(tenderingCriterionModel.getCriterionTypeCodeModel()));
    			tenderingCriterionType.setName(UblCommonBasicFactory.buildNameType(tenderingCriterionModel.getName()));
    			List<DescriptionType> descriptionTypes = UblCommonBasicFactory.buildDescriptionTypes(tenderingCriterionModel.getDescriptionModels(), true);
    	    	if (descriptionTypes != null && descriptionTypes.size() > 0){
    	    		tenderingCriterionType.getDescription().addAll(descriptionTypes);
    	    	}
    	    	tenderingCriterionType.setWeightNumeric(UblCommonBasicFactory.buildWeightNumericType(tenderingCriterionModel.getWeightNumeric()));
    	    	tenderingCriterionType.setEvaluationMethodTypeCode(UblCommonBasicFactory.buildEvaluationMethodTypeCodeType(tenderingCriterionModel.getEvaluationMethodTypeCodeModel()));
    	    	List<WeightingConsiderationDescriptionType> weightingConsiderationDescriptionTypes = UblCommonBasicFactory.buildWeightingConsiderationDescriptionTypes(tenderingCriterionModel.getWeightingConsiderationDescriptions());
    	    	if (weightingConsiderationDescriptionTypes != null && weightingConsiderationDescriptionTypes.size() > 0){
        	    	tenderingCriterionType.getWeightingConsiderationDescription().addAll(weightingConsiderationDescriptionTypes);
        	    }
    	    	List<TenderingCriterionType> subTenderingCriterionTypes = UblCommonCriterionFactory.buildTenderingCriterionTypes(tenderingCriterionModel.getSubTenderingCriterionModels());
    	    	if (subTenderingCriterionTypes != null && subTenderingCriterionTypes.size() > 0){
    	    		tenderingCriterionType.getSubTenderingCriterion().addAll(subTenderingCriterionTypes);
    	    	}
    	    	List<LegislationType> legislationTypes = UblCommonAggregateFactory.buildLegislationTypes(tenderingCriterionModel.getLegislationModels());
    	    	if (legislationTypes != null && legislationTypes.size() > 0){
    	    		tenderingCriterionType.getLegislation().addAll(legislationTypes);
    	    	}
    	    	List<TenderingCriterionPropertyGroupType> tenderingCriterionPropertyGroupTypes = UblCommonCriterionFactory.buildTenderingCriterionPropertyGroupTypes(tenderingCriterionModel.getTenderingCriterionPropertyGroupModels());
    	    	if (tenderingCriterionPropertyGroupTypes != null && tenderingCriterionPropertyGroupTypes.size() > 0){
    	    		tenderingCriterionType.getTenderingCriterionPropertyGroup().addAll(tenderingCriterionPropertyGroupTypes);
    	    	}
    	    	
    			if (!GenericFactory.isAllFieldsNull(tenderingCriterionType)) {
    				tenderingCriterionTypes.add(tenderingCriterionType);
    			}
    		}
    		
    		if (tenderingCriterionTypes.isEmpty()) {
    			tenderingCriterionTypes = null;
    		}
    	}
    	
    	return tenderingCriterionTypes;
    }

	/**
     * The first level group of properties and sub-groups of properties in the structure of a criterion.
     * 
     * Cardinality 1..n
     * 
     * @param tenderingCriterionPropertyGroupModels
     *
     * @return The corresponding UBL element
	 * @throws IllegalAccessException 
     */
    public static List<TenderingCriterionPropertyGroupType> buildTenderingCriterionPropertyGroupTypes(List<TenderingCriterionPropertyGroupModel> tenderingCriterionPropertyGroupModels) throws IllegalAccessException {
    	List<TenderingCriterionPropertyGroupType> tenderingCriterionPropertyGroupTypes = null;

    	if (tenderingCriterionPropertyGroupModels != null && tenderingCriterionPropertyGroupModels.size() > 0){
    		tenderingCriterionPropertyGroupTypes = new ArrayList<TenderingCriterionPropertyGroupType>();
    		TenderingCriterionPropertyGroupType tenderingCriterionPropertyGroupType = null;
    		for (TenderingCriterionPropertyGroupModel tenderingCriterionPropertyGroupModel : tenderingCriterionPropertyGroupModels){
    			tenderingCriterionPropertyGroupType = new TenderingCriterionPropertyGroupType();
    			tenderingCriterionPropertyGroupType.setID(UblCommonBasicFactory.buildIdType(tenderingCriterionPropertyGroupModel.getIdModel()));
    			tenderingCriterionPropertyGroupType.setPropertyGroupTypeCode(UblCommonBasicFactory.buildPropertyGroupTypeCodeType(tenderingCriterionPropertyGroupModel.getPropertyGroupTypeCodeModel()));
    			List<TenderingCriterionPropertyType> tenderingCriterionPropertyTypes  = UblCommonCriterionFactory.buildTenderingCriterionPropertyTypes(
    					tenderingCriterionPropertyGroupModel.getTenderingCriterionPropertyModels(), tenderingCriterionPropertyGroupType);
    	    	if (tenderingCriterionPropertyTypes != null && tenderingCriterionPropertyTypes.size() > 0){
    	    		tenderingCriterionPropertyGroupType.getTenderingCriterionProperty().addAll(tenderingCriterionPropertyTypes);
    	    	}
	    		if (lotsPropertyTypes != null && lotsPropertyTypes.size() > 0){
					tenderingCriterionPropertyGroupType.getTenderingCriterionProperty().addAll(lotsPropertyTypes);
				}
	    		if (cpvsPropertyTypes != null && cpvsPropertyTypes.size() > 0){
					tenderingCriterionPropertyGroupType.getTenderingCriterionProperty().addAll(cpvsPropertyTypes);
				}
    	    	List<TenderingCriterionPropertyGroupType> subsidiaryTenderingCriterionPropertyGroupTypes = UblCommonCriterionFactory.buildTenderingCriterionPropertyGroupTypes(tenderingCriterionPropertyGroupModel.getSubsidiaryTenderingCriterionPropertyGroupModels());
    	    	if (subsidiaryTenderingCriterionPropertyGroupTypes != null && subsidiaryTenderingCriterionPropertyGroupTypes.size() > 0){
    	    		tenderingCriterionPropertyGroupType.getSubsidiaryTenderingCriterionPropertyGroup().addAll(subsidiaryTenderingCriterionPropertyGroupTypes);
    	    	}
    			
    	    	if (!GenericFactory.isAllFieldsNull(tenderingCriterionPropertyGroupType)) {
    	    		tenderingCriterionPropertyGroupTypes.add(tenderingCriterionPropertyGroupType);
    	    	}
    		}
    		
    		if (tenderingCriterionPropertyGroupTypes.isEmpty()) {
    			tenderingCriterionPropertyGroupTypes = null;
    		}
    	}
    	
    	return tenderingCriterionPropertyGroupTypes;
    }

	/**
     * Caption (i.e. a 'label'), specific MS or contracting authority requirement 
     * (e.g. 'Number of references expected: 5') or 
     * a question addressed to the economic operator 
     * (e.g. 'Your average yearly turnover for the past three years?').
     * 
     * Cardinality 1..n
     * 
     * @param tenderingCriterionPropertyModels
     *
     * @return The corresponding UBL element
	 * @throws IllegalAccessException 
     */
    public static List<TenderingCriterionPropertyType> buildTenderingCriterionPropertyTypes(List<TenderingCriterionPropertyModel> tenderingCriterionPropertyModels, TenderingCriterionPropertyGroupType tenderingCriterionPropertyGroupType) throws IllegalAccessException {
    	List<TenderingCriterionPropertyType> tenderingCriterionPropertyTypes = null;
    	lotsPropertyTypes = null;
    	cpvsPropertyTypes = null;
    	
    	if (tenderingCriterionPropertyModels != null && tenderingCriterionPropertyModels.size() > 0){
    		tenderingCriterionPropertyTypes = new ArrayList<TenderingCriterionPropertyType>();
    		TenderingCriterionPropertyType tenderingCriterionPropertyType = null;
    		for (TenderingCriterionPropertyModel tenderingCriterionPropertyModel : tenderingCriterionPropertyModels){
    			tenderingCriterionPropertyType = new TenderingCriterionPropertyType();
    			tenderingCriterionPropertyType.setID(UblCommonBasicFactory.buildIdType(tenderingCriterionPropertyModel.getIdModel()));
    	    	List<DescriptionType> descriptionTypes = UblCommonBasicFactory.buildDescriptionTypes(tenderingCriterionPropertyModel.getDescriptionModels(), true);
    	    	if (descriptionTypes != null && descriptionTypes.size() > 0){
    	    		tenderingCriterionPropertyType.getDescription().addAll(descriptionTypes);
    	    	}
    	    	tenderingCriterionPropertyType.setTypeCode(UblCommonBasicFactory.buildTypeCodeType(tenderingCriterionPropertyModel.getTypeCodeModel()));
    	    	tenderingCriterionPropertyType.setValueDataTypeCode(UblCommonBasicFactory.buildValueDataTypeCodeType(tenderingCriterionPropertyModel.getValueDataTypeCodeModel()));
    			tenderingCriterionPropertyType.setValueUnitCode(UblCommonBasicFactory.buildValueUnitCodeType(tenderingCriterionPropertyModel.getValueUnitCodeModel()));
    			tenderingCriterionPropertyType.setValueCurrencyCode(UblCommonBasicFactory.buildValueCurrencyCodeType(tenderingCriterionPropertyModel.getValueCurrencyCodeModel()));
    			tenderingCriterionPropertyType.setExpectedAmount(UblCommonBasicFactory.buildExpectedAmountType(tenderingCriterionPropertyModel.getExpectedAmountModel()));
    			tenderingCriterionPropertyType.setExpectedID(UblCommonBasicFactory.buildExpectedIDType(tenderingCriterionPropertyModel.getExpectedIDModel()));
    			tenderingCriterionPropertyType.setExpectedCode(UblCommonBasicFactory.buildExpectedCodeType(tenderingCriterionPropertyModel.getExpectedCodeModel()));
    			tenderingCriterionPropertyType.setExpectedDescription(UblCommonBasicFactory.buildExpectedDescriptionType(tenderingCriterionPropertyModel.getExpectedDescription()));
    			tenderingCriterionPropertyType.setExpectedValueNumeric(UblCommonBasicFactory.buildExpectedValueNumericType(tenderingCriterionPropertyModel.getExpectedValueNumeric()));
    			tenderingCriterionPropertyType.setMaximumValueNumeric(UblCommonBasicFactory.buildMaximumValueNumericType(tenderingCriterionPropertyModel.getMaximumValueNumeric()));
    			tenderingCriterionPropertyType.setMinimumValueNumeric(UblCommonBasicFactory.buildMinimumValueNumericType(tenderingCriterionPropertyModel.getMinimumValueNumeric()));
    			List<CertificationLevelDescriptionType> certificationLevelDescriptionTypes = UblCommonBasicFactory.buildCertificationLevelDescriptionTypes(tenderingCriterionPropertyModel.getCertificationLevelDescriptions());
    	    	if (certificationLevelDescriptionTypes != null && certificationLevelDescriptionTypes.size() > 0){
    	    		tenderingCriterionPropertyType.getCertificationLevelDescription().addAll(certificationLevelDescriptionTypes);
    	    	}
    	    	List<PeriodType> periodTypes = UblCommonAggregateFactory.buildPeriodTypes(tenderingCriterionPropertyModel.getPeriodModels());
    	    	if (periodTypes != null && periodTypes.size() > 0){
    	    		tenderingCriterionPropertyType.getApplicablePeriod().addAll(periodTypes);
    	    	}

    			if (tenderingCriterionPropertyModel.getTypeCodeModel() != null && tenderingCriterionPropertyModel.getTypeCodeModel().getCriterionElementType() != null &&
    					CriterionElement.QUESTION.getCode().equalsIgnoreCase(tenderingCriterionPropertyModel.getTypeCodeModel().getCriterionElementType().getCode())){
	    	    	
    				if (isResponse){
	    				// Separare il TenderingCriterionResponse dalla singola TenderingCriterionProperty di tipo Question, inserendoli in una lista esterna 
	    				tenderingCriterionResponseModels.add(separateTenderingCriterionResponseModel(tenderingCriterionPropertyModel));
	    	    	}
	    	    	
    			}
    			
    			if (tenderingCriterionPropertyModel.getTypeCodeModel() != null && tenderingCriterionPropertyModel.getTypeCodeModel().getCriterionElementType() != null &&
    					CriterionElement.REQUIREMENT.getCode().equalsIgnoreCase(tenderingCriterionPropertyModel.getTypeCodeModel().getCriterionElementType().getCode()) &&
    					tenderingCriterionPropertyModel.getLotsPropertyModels() != null && !tenderingCriterionPropertyModel.getLotsPropertyModels().isEmpty()){
    				
    				// Separare il TenderingCriterionProperty dei lotti dalla singola TenderingCriterionProperty di tipo Requirement, aggiungendoli alla TenderingCriterionPropertyGroup padre 
    				lotsPropertyTypes = UblCommonCriterionFactory.buildTenderingCriterionPropertyTypes(tenderingCriterionPropertyModel.getLotsPropertyModels(), null);
    				
    			} else if (tenderingCriterionPropertyModel.getTypeCodeModel() != null && tenderingCriterionPropertyModel.getTypeCodeModel().getCriterionElementType() != null &&
    					CriterionElement.REQUIREMENT.getCode().equalsIgnoreCase(tenderingCriterionPropertyModel.getTypeCodeModel().getCriterionElementType().getCode()) &&
    					tenderingCriterionPropertyModel.getCpvsPropertyModels() != null && !tenderingCriterionPropertyModel.getCpvsPropertyModels().isEmpty()){
    				
    				// Separare il TenderingCriterionProperty dei cpvs dalla singola TenderingCriterionProperty di tipo Requirement, aggiungendoli alla TenderingCriterionPropertyGroup padre 
    				cpvsPropertyTypes = UblCommonCriterionFactory.buildTenderingCriterionPropertyTypes(tenderingCriterionPropertyModel.getCpvsPropertyModels(), null);
    				
    			} else {

        			if (!GenericFactory.isAllFieldsNull(tenderingCriterionPropertyType) ||
        					(tenderingCriterionPropertyModel.getTypeCodeModel() != null && tenderingCriterionPropertyModel.getTypeCodeModel().getCriterionElementType() != null && 
        					CriterionElement.CAPTION.getCode().equalsIgnoreCase(tenderingCriterionPropertyModel.getTypeCodeModel().getCriterionElementType().getCode()))) {
        				tenderingCriterionPropertyTypes.add(tenderingCriterionPropertyType);
        			}
    			}
    		}
    		
    		if (tenderingCriterionPropertyTypes.isEmpty()) {
    			tenderingCriterionPropertyTypes = null;
    		}
    	}
    	
    	return tenderingCriterionPropertyTypes;
    }
    
    /**
     * A class to describe a response to a criterion property.
     * 
     * Cardinality 0..n
     * 
     * @param tenderingCriterionResponseModels
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static List<TenderingCriterionResponseType> buildTenderingCriterionResponseTypes(List<TenderingCriterionResponseModel> tenderingCriterionResponseModels) throws IllegalAccessException {
    	List<TenderingCriterionResponseType> tenderingCriterionResponseTypes = null;
        
    	if (tenderingCriterionResponseModels != null && tenderingCriterionResponseModels.size() > 0){
    		tenderingCriterionResponseTypes = new ArrayList<TenderingCriterionResponseType>();
    		for (TenderingCriterionResponseModel tenderingCriterionResponseModel : tenderingCriterionResponseModels){
    			TenderingCriterionResponseType tenderingCriterionResponseType = buildTenderingCriterionResponseType(tenderingCriterionResponseModel);
    			
    			if (tenderingCriterionResponseType != null) {
    				tenderingCriterionResponseTypes.add(tenderingCriterionResponseType);
    			}
    		}
    	}
    	
    	return tenderingCriterionResponseTypes;
    }
    
    /**
     * A class to describe a response to a criterion property.
     * 
     * Cardinality 1
     * 
     * @param tenderingCriterionResponseModel
     *
     * @return The corresponding UBL element
     * @throws IllegalAccessException 
     */
    public static TenderingCriterionResponseType buildTenderingCriterionResponseType(TenderingCriterionResponseModel tenderingCriterionResponseModel) throws IllegalAccessException {
    	TenderingCriterionResponseType tenderingCriterionResponseType = null;
		
    	if (tenderingCriterionResponseModel != null){
        	tenderingCriterionResponseType = new TenderingCriterionResponseType();
    		tenderingCriterionResponseType.setID(UblCommonBasicFactory.buildIdType(tenderingCriterionResponseModel.getIdModel()));
    		tenderingCriterionResponseType.setValidatedCriterionPropertyID(UblCommonBasicFactory.buildValidatedCriterionPropertyIdType(tenderingCriterionResponseModel.getValidatedCriterionPropertyIdModel()));
    		tenderingCriterionResponseType.setConfidentialityLevelCode(UblCommonBasicFactory.buildConfidentialityLevelCodeType(tenderingCriterionResponseModel.getConfidentialityLevelCodeModel()));
    		List<ResponseValueType> responseValueTypes = UblCommonAggregateFactory.buildResponseValueTypes(tenderingCriterionResponseModel.getResponseValueModels());
        	if (responseValueTypes != null && responseValueTypes.size() > 0){
        		tenderingCriterionResponseType.getResponseValue().addAll(responseValueTypes);
        	}
        	List<PeriodType> periodTypes = UblCommonAggregateFactory.buildPeriodTypes(tenderingCriterionResponseModel.getApplicablePeriodModels());
        	if (periodTypes != null && periodTypes.size() > 0){
        		tenderingCriterionResponseType.getApplicablePeriod().addAll(periodTypes);
    	    }
        	List<EvidenceSuppliedType> evidenceSuppliedTypes = UblCommonAggregateFactory.buildEvidenceSuppliedTypes(tenderingCriterionResponseModel.getEvidenceSuppliedModels());
        	if (evidenceSuppliedTypes != null && evidenceSuppliedTypes.size() > 0){
        		tenderingCriterionResponseType.getEvidenceSupplied().addAll(evidenceSuppliedTypes);
        	}
        	
        	if (GenericFactory.isAllFieldsNull(tenderingCriterionResponseType) || 
        			(tenderingCriterionResponseType.getResponseValue() != null && tenderingCriterionResponseType.getResponseValue().isEmpty() 
        				&& tenderingCriterionResponseType.getEvidenceSupplied() != null && tenderingCriterionResponseType.getEvidenceSupplied().isEmpty()
                			&& tenderingCriterionResponseType.getApplicablePeriod() != null && tenderingCriterionResponseType.getApplicablePeriod().isEmpty())) {
        		tenderingCriterionResponseType = null;
        	}
    	}
    	
    	return tenderingCriterionResponseType;
    }
}
