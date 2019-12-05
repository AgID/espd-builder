package com.pccube.espd.factory;

import java.lang.reflect.Field;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.pccube.espd.model.EvidenceModel;
import com.pccube.espd.model.TenderingCriterionResponseModel;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EvidenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ResponseValueType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionResponseType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;

@Component
public class GenericFactory {

	protected static final String LOG_INFO_CRITERION_INDEX = "Criterion index -> ";
	protected static final String LOG_INFO_GROUP_UUID = "Group uuid -> ";
	protected static final String LOG_INFO_NOT_AVAILABLE = "Not available";
	
	protected static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
	
	protected static final String SPLIT_ID_PARENT = "%%";

	protected static final String UNOPUNTOZERO = "1.0";
	protected static final String DUEPUNTOZERO = "2.0";
	protected static final String QUATTRO = "4";
	
	protected static final String ITCF = "IT:CF";
	protected static final String EXCLUDE_FIELD = "serialVersionUID";
	protected static final String LOTS_EN = "Lots IDs";
	protected static final String LOTS_IT = "Identificazione lotti";
	protected static final String LOT_ID_EN = "Lot ID";
	protected static final String LOT_ID_IT = "Identificativo lotto";
	protected static final String CPVS_EN = "CPVs";
	protected static final String CPVS_IT = "CPVs";
	protected static final String CPV_CODE_EN = "CPV Code";
	protected static final String CPV_CODE_IT = "Codice CPV";

	protected static boolean isInit = false;
	protected static boolean isResponse = false;
	protected static boolean fromRequest = false;
	protected static boolean isInitResponse = false;
	
	protected static List<TenderingCriterionResponseType> tenderingCriterionResponseTypes;
	protected static List<EvidenceType> evidenceTypes;
	protected static List<TenderingCriterionResponseModel> tenderingCriterionResponseModels;
	protected static List<EvidenceModel> evidenceModels;
	
	
	public static boolean isAllFieldsNull(Object obj) throws IllegalAccessException {
		if (obj == null) {
			return true;
		}
		
		for (Field field : obj.getClass().getDeclaredFields()){
			
			field.setAccessible(true);
			
			if (field.getName().equalsIgnoreCase(EXCLUDE_FIELD)){
				field.setAccessible(true);
				continue;
			}
	        
			if (obj.getClass() == ResponseValueType.class && field.getType() == IDType.class){
				field.setAccessible(true);
				continue;
			}
			
			if (field.get(obj) != null){
				field.setAccessible(false);
	            return false;
			}
			
	        if (field.getType() == String.class &&  !StringUtils.EMPTY.equals(field.get(obj))){
				field.setAccessible(false);
	            return false;
	        }
		}
		return true;  
	}
}
