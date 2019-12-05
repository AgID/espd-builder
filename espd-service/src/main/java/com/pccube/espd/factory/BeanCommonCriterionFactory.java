package com.pccube.espd.factory;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.pccube.espd.enums.CodeList;
import com.pccube.espd.enums.CriterionElement;
import com.pccube.espd.enums.ResponseData;
import com.pccube.espd.model.DescriptionModel;
import com.pccube.espd.model.EvidenceSuppliedModel;
import com.pccube.espd.model.ExpectedCodeModel;
import com.pccube.espd.model.LegislationModel;
import com.pccube.espd.model.PeriodModel;
import com.pccube.espd.model.ResponseCodeTypeModel;
import com.pccube.espd.model.ResponseValueModel;
import com.pccube.espd.model.TenderingCriterionModel;
import com.pccube.espd.model.TenderingCriterionPropertyGroupModel;
import com.pccube.espd.model.TenderingCriterionPropertyModel;
import com.pccube.espd.model.TenderingCriterionResponseModel;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionPropertyGroupType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionPropertyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionResponseType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionType;

/**
 * Simple factory for creating aggregate BEAN elements that are shared between a {@link TenderingCriterionModel}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class BeanCommonCriterionFactory extends GenericFactory {

	static final Logger logger = Logger.getLogger(BeanCommonCriterionFactory.class);
    
    public static List<TenderingCriterionPropertyGroupModel> buildTenderingCriterionPropertyGroupModels(List<TenderingCriterionPropertyGroupType> tenderingCriterionPropertyGroupTypes, TenderingCriterionType tenderingCriterionType, String idGroupParent) throws ParseException, IllegalAccessException {
    	List<TenderingCriterionPropertyGroupModel> tenderingCriterionPropertyGroupModels = null;

    	if (tenderingCriterionPropertyGroupTypes != null && tenderingCriterionPropertyGroupTypes.size() > 0){
    		tenderingCriterionPropertyGroupModels = new ArrayList<TenderingCriterionPropertyGroupModel>();
    		TenderingCriterionPropertyGroupModel tenderingCriterionPropertyGroupModel = null;
    		for (TenderingCriterionPropertyGroupType tenderingCriterionPropertyGroupType : tenderingCriterionPropertyGroupTypes){
    			tenderingCriterionPropertyGroupModel = new TenderingCriterionPropertyGroupModel();
    			tenderingCriterionPropertyGroupModel.setIdParent(GenericCommonFactory.mapperIdParent(idGroupParent, tenderingCriterionPropertyGroupType.getID()));
    			
    			logger.info(LOG_INFO_GROUP_UUID + ((tenderingCriterionPropertyGroupType.getID() != null && StringUtils.isNotBlank(tenderingCriterionPropertyGroupType.getID().getValue())) 
    					? tenderingCriterionPropertyGroupType.getID().getValue() : LOG_INFO_NOT_AVAILABLE));
    			
    			tenderingCriterionPropertyGroupModel.setIdModel(BeanCommonBasicFactory.buildIdModel(tenderingCriterionPropertyGroupType.getID()));
    			tenderingCriterionPropertyGroupModel.setPropertyGroupTypeCodeModel(BeanCommonBasicFactory.buildPropertyGroupTypeCodeModel(tenderingCriterionPropertyGroupType.getPropertyGroupTypeCode()));
    			if (!isInit){
    				tenderingCriterionPropertyGroupType.setTypeCode(GenericSearchFactory.searchTypeCodeType(tenderingCriterionType.getID(), tenderingCriterionPropertyGroupModel.getIdParent()));
    	    	}
    			tenderingCriterionPropertyGroupModel.setTypeCodeModel(BeanCommonBasicFactory.buildTypeCodeModel(tenderingCriterionPropertyGroupType.getTypeCode()));
    			if (!isInit){
    				tenderingCriterionPropertyGroupType.setCardinality(GenericSearchFactory.searchCardinalityType(
    						tenderingCriterionType.getID(), tenderingCriterionPropertyGroupModel.getIdParent(), TenderingCriterionPropertyGroupType.class.getName()));
    	    	}
    			tenderingCriterionPropertyGroupModel.setCardinality(BeanCommonBasicFactory.buildCardinality(tenderingCriterionPropertyGroupType.getCardinality()));
    	    	List<TenderingCriterionPropertyModel> tenderingCriterionPropertyModels = BeanCommonCriterionFactory.buildTenderingCriterionPropertyModels(
    	    			tenderingCriterionPropertyGroupType.getTenderingCriterionProperty(), tenderingCriterionPropertyGroupModel.getIdParent(), tenderingCriterionType);
    	    	if (tenderingCriterionPropertyModels != null && tenderingCriterionPropertyModels.size() > 0){
    	    		tenderingCriterionPropertyGroupModel.getTenderingCriterionPropertyModels().addAll(tenderingCriterionPropertyModels);
    	    	}
    	    	List<TenderingCriterionPropertyGroupModel> subsidiaryTenderingCriterionPropertyGroupModels = BeanCommonCriterionFactory.buildTenderingCriterionPropertyGroupModels(
    	    			tenderingCriterionPropertyGroupType.getSubsidiaryTenderingCriterionPropertyGroup(), tenderingCriterionType, tenderingCriterionPropertyGroupModel.getIdParent());
    	    	if (subsidiaryTenderingCriterionPropertyGroupModels != null && subsidiaryTenderingCriterionPropertyGroupModels.size() > 0){
    	    		tenderingCriterionPropertyGroupModel.getSubsidiaryTenderingCriterionPropertyGroupModels().addAll(subsidiaryTenderingCriterionPropertyGroupModels);
    	    	}
    	    	
    	    	if (!tenderingCriterionPropertyGroupModel.isAllFieldsNull()) { 
    				tenderingCriterionPropertyGroupModels.add(tenderingCriterionPropertyGroupModel);
    	    	}
    		}

    		if (tenderingCriterionPropertyGroupModels.isEmpty()) { 
				tenderingCriterionPropertyGroupModels = null;
    		}
    	}
    	
    	return tenderingCriterionPropertyGroupModels;
    }
    
    public static List<TenderingCriterionPropertyModel> buildTenderingCriterionPropertyModels(List<TenderingCriterionPropertyType> tenderingCriterionPropertyTypes, 
    		String idParentGroup, TenderingCriterionType tenderingCriterionType) throws ParseException, IllegalAccessException {
    	List<TenderingCriterionPropertyModel> tenderingCriterionPropertyModels = null;
    	List<TenderingCriterionPropertyModel> lotsPropertyModels = null;
    	List<TenderingCriterionPropertyModel> cpvsPropertyModels = null;

    	if (tenderingCriterionPropertyTypes != null && tenderingCriterionPropertyTypes.size() > 0){
    		tenderingCriterionPropertyModels = new ArrayList<TenderingCriterionPropertyModel>();
    		lotsPropertyModels = new ArrayList<TenderingCriterionPropertyModel>();
    		cpvsPropertyModels = new ArrayList<TenderingCriterionPropertyModel>();
    		List<TenderingCriterionPropertyType> propertyTypesUploaded = tenderingCriterionPropertyTypes;
    		/* In fase di upload cerco il PropertyGroup corrispondente che si trova nella tassonomia */
    		if (!isInit){
    			TenderingCriterionPropertyGroupType propertyGroupTypeFounded = GenericSearchFactory.searchTenderingCriterionPropertyGroupType(
    					tenderingCriterionType.getID().getValue(), idParentGroup);
    			if (propertyGroupTypeFounded != null) {
    				tenderingCriterionPropertyTypes = propertyGroupTypeFounded.getTenderingCriterionProperty();
    			}
    		}
    		TenderingCriterionPropertyModel tenderingCriterionPropertyModel = null;
			TenderingCriterionPropertyType propertyTypeLast = null;
    		for (int i = 0; i < propertyTypesUploaded.size(); i++){
    			TenderingCriterionPropertyType propertyTypeUploaded = propertyTypesUploaded.get(i);
    			TenderingCriterionPropertyType tenderingCriterionPropertyType = null;
    			if ((i + 1) <= tenderingCriterionPropertyTypes.size()){
    				
    				if (tenderingCriterionPropertyTypes.size() != propertyTypesUploaded.size()){ 
    					tenderingCriterionPropertyType = tenderingCriterionPropertyTypes.get(i);
    				} else {
        				tenderingCriterionPropertyType = propertyTypeUploaded;
    				}
    				
    				propertyTypeLast = tenderingCriterionPropertyTypes.get(i);
    			} else {
    				tenderingCriterionPropertyType = propertyTypeUploaded;
    				if (propertyTypeLast == null) { 
    					propertyTypeLast = propertyTypeUploaded;
    				}
    			}
    			tenderingCriterionPropertyModel = new TenderingCriterionPropertyModel();
    			tenderingCriterionPropertyModel.setIdModel(BeanCommonBasicFactory.buildIdModel(tenderingCriterionPropertyType.getID()));
    	    	//List<DescriptionModel> descriptionModels = BeanCommonBasicFactory.buildDescriptionModels(tenderingCriterionPropertyType.getDescription());
    			List<DescriptionModel> descriptionModels = BeanCommonBasicFactory.buildDescriptionModels(propertyTypeLast.getDescription());
    	    	if (descriptionModels != null && descriptionModels.size() > 0){
    	    		tenderingCriterionPropertyModel.getDescriptionModels().addAll(descriptionModels);
    	    	}
    	    	tenderingCriterionPropertyModel.setTypeCodeModel(BeanCommonBasicFactory.buildTypeCodeModel(tenderingCriterionPropertyType.getTypeCode()));
    	    	ResponseCodeTypeModel responseCodeTypeModel = BeanCommonBasicFactory.buildResponseCodeTypeModel(tenderingCriterionPropertyType.getValueDataTypeCode());
    	    	tenderingCriterionPropertyModel.setValueDataTypeCodeModel(responseCodeTypeModel);
    	    	tenderingCriterionPropertyModel.setValueUnitCodeModel(BeanCommonBasicFactory.buildValueUnitCodeModel(tenderingCriterionPropertyType.getValueUnitCode()));
    	    	tenderingCriterionPropertyModel.setValueCurrencyCodeModel(BeanCommonBasicFactory.buildValueCurrencyCodeModel(tenderingCriterionPropertyType.getValueCurrencyCode()));
    	    	tenderingCriterionPropertyModel.setExpectedAmountModel(BeanCommonBasicFactory.buildExpectedAmountModel(propertyTypeUploaded.getExpectedAmount()));
    	    	tenderingCriterionPropertyModel.setExpectedIDModel(BeanCommonBasicFactory.buildExpectedIDModel(propertyTypeUploaded.getExpectedID()));
    	    	ExpectedCodeModel expectedCodeModel = BeanCommonBasicFactory.buildExpectedCodeModel(propertyTypeUploaded.getExpectedCode());
    	    	tenderingCriterionPropertyModel.setExpectedCodeModel(expectedCodeModel);
    	    	tenderingCriterionPropertyModel.setExpectedDescription(BeanCommonBasicFactory.buildExpectedDescription(propertyTypeUploaded.getExpectedDescription()));
    			tenderingCriterionPropertyModel.setExpectedValueNumeric(BeanCommonBasicFactory.buildExpectedValueNumeric(propertyTypeUploaded.getExpectedValueNumeric()));
    	    	tenderingCriterionPropertyModel.setMaximumValueNumeric(BeanCommonBasicFactory.buildMaximumValueNumeric(propertyTypeUploaded.getMaximumValueNumeric()));
    	    	tenderingCriterionPropertyModel.setMinimumValueNumeric(BeanCommonBasicFactory.buildMinimumValueNumeric(propertyTypeUploaded.getMinimumValueNumeric()));
    			List<String> certificationLevelDescriptions = BeanCommonBasicFactory.buildCertificationLevelDescriptions(propertyTypeUploaded.getCertificationLevelDescription());
    	    	if (certificationLevelDescriptions != null && certificationLevelDescriptions.size() > 0){
    	    		tenderingCriterionPropertyModel.getCertificationLevelDescriptions().addAll(certificationLevelDescriptions);
    	    	}
    	    	List<PeriodModel> periodModels = BeanCommonAggregateFactory.buildPeriodModels(propertyTypeUploaded.getApplicablePeriod());
    	    	if (periodModels != null && periodModels.size() > 0){
    	    		tenderingCriterionPropertyModel.getPeriodModels().addAll(periodModels);
    	    	}
    	    	
    	    	/* Proprietà aggiunta per utilità di soluzione per il FE */
    	    	tenderingCriterionPropertyModel.setResponseCodeModel(BeanCommonBasicFactory.buildResponseCodeModel(propertyTypeLast.getResponseCode(), true));
    	    	tenderingCriterionPropertyModel.setCardinality(BeanCommonBasicFactory.buildCardinality(propertyTypeLast.getCardinality()));
    			tenderingCriterionPropertyModel.setLogicalIdModel(BeanCommonBasicFactory.buildIdModel(propertyTypeLast.getID()));
    	    	
    			/* Gestione delle TenderingCriterionResponse */
    			if (tenderingCriterionPropertyType.getTypeCode() != null && CriterionElement.QUESTION.getCode().equalsIgnoreCase(tenderingCriterionPropertyType.getTypeCode().getValue())){
        	    	if (isResponse || isInit){
        	    		TenderingCriterionResponseType tenderingCriterionResponseType = new TenderingCriterionResponseType();
        	    		
        	    		if (fromRequest || isInit){
            	    		// Aggiungere i TenderingCriterionResponse con valori di default nelle singole TenderingCriterionProperty di tipo Question.
        	    			tenderingCriterionResponseType = GenericCommonFactory.initTenderingCriterionResponseType(tenderingCriterionPropertyType);
        	    		} else {
            	    		// Muovere i TenderingCriterionResponse dalla lista esterna alle TenderingCriterionProperty di tipo Question, aventi lo stesso UUID.
        					// Se la TenderingCriterionResponse è null, potrebbe stare effettuando l'upload di una Response.
        	    			tenderingCriterionResponseType = GenericCommonFactory.moveTenderingCriterionResponseType(propertyTypeUploaded.getID(), tenderingCriterionPropertyType.getID());
        					if (tenderingCriterionResponseType == null){
        						tenderingCriterionResponseType = GenericCommonFactory.initTenderingCriterionResponseType(tenderingCriterionPropertyType); 
        					}			
        	    		}
        	    		
        	    		tenderingCriterionPropertyModel.setTenderingCriterionResponseModel(
        	    				BeanCommonCriterionFactory.buildTenderingCriterionResponseModel(tenderingCriterionResponseType, tenderingCriterionPropertyType));
        	    		
        	    	}
    			}

    			/* Gestione delle liste dei Lotti e dei CPV */
    			if (!isInit && tenderingCriterionPropertyType.getTypeCode() != null && CriterionElement.REQUIREMENT.getCode().equalsIgnoreCase(tenderingCriterionPropertyType.getTypeCode().getValue()) &&
    					responseCodeTypeModel != null && responseCodeTypeModel.getResponseDataType() != null && StringUtils.isNotBlank(responseCodeTypeModel.getResponseDataType().getCode()) &&
	    				responseCodeTypeModel.getResponseDataType().getCode().equalsIgnoreCase(ResponseData.LOT_IDENTIFIER.getCode())) {

    	    		// Aggiungere i TenderingCriterionProperty alla lista di tutti i lotti della TenderingCriterionPropertyGroup padre.
        			if (!tenderingCriterionPropertyModel.isAllFieldsNull() && tenderingCriterionPropertyModel.getExpectedIDModel() != null
        					&& StringUtils.isNotBlank(tenderingCriterionPropertyModel.getExpectedIDModel().getExpectedID())) {
        				lotsPropertyModels.add(tenderingCriterionPropertyModel);
        			}
    				
    			} else if (!isInit && tenderingCriterionPropertyType.getTypeCode() != null && CriterionElement.REQUIREMENT.getCode().equalsIgnoreCase(tenderingCriterionPropertyType.getTypeCode().getValue()) && 
    					responseCodeTypeModel != null && responseCodeTypeModel.getResponseDataType() != null && StringUtils.isNotBlank(responseCodeTypeModel.getResponseDataType().getCode()) &&
	    				responseCodeTypeModel.getResponseDataType().getCode().equalsIgnoreCase(ResponseData.CODE.getCode()) && 
	    				expectedCodeModel != null && StringUtils.isNotBlank(expectedCodeModel.getListID()) && 
	    				expectedCodeModel.getListID().equalsIgnoreCase(CodeList.CPV_CODES.getNameList())) {

    	    		// Aggiungere i TenderingCriterionProperty alla lista di tutti i cpvs della TenderingCriterionPropertyGroup padre.
        			if (!tenderingCriterionPropertyModel.isAllFieldsNull() && tenderingCriterionPropertyModel.getExpectedCodeModel() != null
        					&& StringUtils.isNotBlank(tenderingCriterionPropertyModel.getExpectedCodeModel().getExpectedCode())) {
        				cpvsPropertyModels.add(tenderingCriterionPropertyModel);
        			}

    			} else {
    				
        			if (!tenderingCriterionPropertyModel.isAllFieldsNull() ||
        					(tenderingCriterionPropertyType.getTypeCode() != null && CriterionElement.CAPTION.getCode().equalsIgnoreCase(tenderingCriterionPropertyType.getTypeCode().getValue()))) {
        				tenderingCriterionPropertyModels.add(tenderingCriterionPropertyModel);
        			}
    			}
    	    	
    		}
    		
    		if (lotsPropertyModels != null && !lotsPropertyModels.isEmpty()){
    			tenderingCriterionPropertyModels.add(GenericCommonFactory.moveLotsPropertyModel(lotsPropertyModels));
    		}
    		
    		if (cpvsPropertyModels != null && !cpvsPropertyModels.isEmpty()){
    			tenderingCriterionPropertyModels.add(GenericCommonFactory.moveCpvsPropertyModel(cpvsPropertyModels));
    		}

    		if (tenderingCriterionPropertyModels.isEmpty()) { 
				tenderingCriterionPropertyModels = null;
    		}
    	}
    	
    	return tenderingCriterionPropertyModels;
    }
    
    public static List<TenderingCriterionModel> buildTenderingCriterionModels(List<TenderingCriterionType> tenderingCriterionTypes) throws ParseException, IllegalAccessException {
    	List<TenderingCriterionModel> tenderingCriterionModels = null;
        
    	if (tenderingCriterionTypes != null && tenderingCriterionTypes.size() > 0){
    		tenderingCriterionModels = new ArrayList<TenderingCriterionModel>();
    		TenderingCriterionModel tenderingCriterionModel = null;
    		for (TenderingCriterionType tenderingCriterionType : tenderingCriterionTypes){
    			tenderingCriterionModel = new TenderingCriterionModel();
    			if (!isInit){
    	    		tenderingCriterionType.setIndex(GenericSearchFactory.searchIndexType(tenderingCriterionType.getID()));
    	    	}
    			String indexCriterion = BeanCommonBasicFactory.buildIndex(tenderingCriterionType.getIndex());

    			logger.info(LOG_INFO_CRITERION_INDEX + indexCriterion);
    			
    			tenderingCriterionModel.setIndex(indexCriterion);
    			tenderingCriterionModel.setIdModel(BeanCommonBasicFactory.buildIdModel(tenderingCriterionType.getID()));
    			tenderingCriterionModel.setCriterionTypeCodeModel(BeanCommonBasicFactory.buildCriterionTypeCodeModel(tenderingCriterionType.getCriterionTypeCode()));
    			tenderingCriterionModel.setName(BeanCommonBasicFactory.buildName(tenderingCriterionType.getName()));
    	    	if (!isInit){
    	    		if (tenderingCriterionType.getDescription() != null){
        	    		tenderingCriterionType.getDescription().clear();
        	    		tenderingCriterionType.getDescription().addAll(GenericSearchFactory.searchDescriptionType(
        						tenderingCriterionType.getID(), null, TenderingCriterionType.class.getName()));
    	    		}
    	    	}
    			List<DescriptionModel> descriptionModels = BeanCommonBasicFactory.buildDescriptionModels(tenderingCriterionType.getDescription());
    	    	if (descriptionModels != null && descriptionModels.size() > 0){
    	    		tenderingCriterionModel.getDescriptionModels().addAll(descriptionModels);
    	    	}
    	    	if (!isInit){
    	    		tenderingCriterionType.setCardinality(GenericSearchFactory.searchCardinalityType(
    						tenderingCriterionType.getID(), null, TenderingCriterionType.class.getName()));
    	    	}
    	    	tenderingCriterionModel.setCardinality(BeanCommonBasicFactory.buildCardinality(tenderingCriterionType.getCardinality()));
    	    	tenderingCriterionModel.setWeightNumeric(BeanCommonBasicFactory.buildWeightNumeric(tenderingCriterionType.getWeightNumeric()));
    	    	tenderingCriterionModel.setEvaluationMethodTypeCodeModel(BeanCommonBasicFactory.buildEvaluationMethodTypeCodeModel(tenderingCriterionType.getEvaluationMethodTypeCode()));
    	    	List<String> weightingConsiderationDescriptions = BeanCommonBasicFactory.buildWeightingConsiderationDescriptions(tenderingCriterionType.getWeightingConsiderationDescription());
    	    	if (weightingConsiderationDescriptions != null && weightingConsiderationDescriptions.size() > 0){
    	    		tenderingCriterionModel.getWeightingConsiderationDescriptions().addAll(weightingConsiderationDescriptions);
        	    }
    	    	List<TenderingCriterionModel> subTenderingCriterionModels = BeanCommonCriterionFactory.buildTenderingCriterionModels(tenderingCriterionType.getSubTenderingCriterion());
    	    	if (subTenderingCriterionModels != null && subTenderingCriterionModels.size() > 0){
    	    		tenderingCriterionModel.getSubTenderingCriterionModels().addAll(subTenderingCriterionModels);
    	    	}
    	    	List<LegislationModel> legislationModels = BeanCommonAggregateFactory.buildLegislationModels(tenderingCriterionType.getLegislation());
    	    	if (legislationModels != null && legislationModels.size() > 0){
    	    		tenderingCriterionModel.getLegislationModels().addAll(legislationModels);
    	    	}
    	    	List<TenderingCriterionPropertyGroupModel> tenderingCriterionPropertyGroupModels = BeanCommonCriterionFactory.buildTenderingCriterionPropertyGroupModels(
    	    			tenderingCriterionType.getTenderingCriterionPropertyGroup(), tenderingCriterionType, StringUtils.EMPTY);
    	    	if (tenderingCriterionPropertyGroupModels != null && tenderingCriterionPropertyGroupModels.size() > 0){
    	    		tenderingCriterionModel.getTenderingCriterionPropertyGroupModels().addAll(tenderingCriterionPropertyGroupModels);
    	    	}
    	    	
    	    	if (!tenderingCriterionModel.isAllFieldsNull()) { 
    				tenderingCriterionModels.add(tenderingCriterionModel);
    	    	}
    		}

    		if (tenderingCriterionModels.isEmpty()) { 
				tenderingCriterionModels = null;
    		}
    	}
    	
    	return tenderingCriterionModels;
    }

    public static List<TenderingCriterionResponseModel> buildTenderingCriterionResponseModels(List<TenderingCriterionResponseType> tenderingCriterionResponseTypes) throws ParseException, IllegalAccessException {
    	List<TenderingCriterionResponseModel> tenderingCriterionResponseModels = null;
        
    	if (tenderingCriterionResponseTypes != null && tenderingCriterionResponseTypes.size() > 0){
    		tenderingCriterionResponseModels = new ArrayList<TenderingCriterionResponseModel>();
    		for (TenderingCriterionResponseType tenderingCriterionResponseType : tenderingCriterionResponseTypes){
    	    	TenderingCriterionResponseModel tenderingCriterionResponseModel = buildTenderingCriterionResponseModel(tenderingCriterionResponseType, null);
    	    	
    			if (tenderingCriterionResponseModel != null) { 
    				tenderingCriterionResponseModels.add(tenderingCriterionResponseModel);
    			}
    		}

    		if (tenderingCriterionResponseModels.isEmpty()) { 
				tenderingCriterionResponseModels = null;
    		}
    	}
    	
    	return tenderingCriterionResponseModels;
    }
    
    public static TenderingCriterionResponseModel buildTenderingCriterionResponseModel(TenderingCriterionResponseType tenderingCriterionResponseType, TenderingCriterionPropertyType tenderingCriterionPropertyType) throws ParseException, IllegalAccessException {
		TenderingCriterionResponseModel tenderingCriterionResponseModel = null;
		
		if (tenderingCriterionResponseType != null){
			tenderingCriterionResponseModel = new TenderingCriterionResponseModel();
			tenderingCriterionResponseModel.setIdModel(BeanCommonBasicFactory.buildIdModel(tenderingCriterionResponseType.getID()));
			tenderingCriterionResponseModel.setValidatedCriterionPropertyIdModel(BeanCommonBasicFactory.buildValidatedCriterionPropertyIdModel(tenderingCriterionResponseType.getValidatedCriterionPropertyID()));
			tenderingCriterionResponseModel.setConfidentialityLevelCodeModel(BeanCommonBasicFactory.buildConfidentialityLevelCodeModel(tenderingCriterionResponseType.getConfidentialityLevelCode()));
			List<ResponseValueModel> responseValueModels = BeanCommonAggregateFactory.buildResponseValueModels(tenderingCriterionResponseType.getResponseValue(), tenderingCriterionPropertyType);
	    	if (responseValueModels != null && responseValueModels.size() > 0){
	    		tenderingCriterionResponseModel.getResponseValueModels().addAll(responseValueModels);
	    	}
	    	List<PeriodModel> periodModels = BeanCommonAggregateFactory.buildPeriodModels(tenderingCriterionResponseType.getApplicablePeriod());
	    	if (periodModels != null && periodModels.size() > 0){
	    		tenderingCriterionResponseModel.getApplicablePeriodModels().addAll(periodModels);
		    }
	    	List<EvidenceSuppliedModel> evidenceSuppliedModels = BeanCommonAggregateFactory.buildEvidenceSuppliedModels(tenderingCriterionResponseType.getEvidenceSupplied(), tenderingCriterionResponseType);
	    	if (evidenceSuppliedModels != null && evidenceSuppliedModels.size() > 0){
	    		tenderingCriterionResponseModel.getEvidenceSuppliedModels().addAll(evidenceSuppliedModels);
	    	}
	    	
	    	if (tenderingCriterionResponseModel.isAllFieldsNull()) { 
				tenderingCriterionResponseModel = null;
	    	}
		}
    	
    	return tenderingCriterionResponseModel;
    }
    
}
