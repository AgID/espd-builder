package com.pccube.espd.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.cglib.core.Predicate;
import org.springframework.stereotype.Component;

import com.pccube.espd.config.VariableConfiguration;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionPropertyGroupType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionPropertyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CardinalityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IndexType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TypeCodeType;

@Component
public class GenericSearchFactory extends GenericFactory {
	
	private static VariableConfiguration variableConfiguration;
	
	@Autowired
    public GenericSearchFactory(VariableConfiguration variableConfiguration) {
		GenericSearchFactory.variableConfiguration = variableConfiguration;
    }

	/*** SEARCH DescriptionType ***/
	
	protected static List<DescriptionType> searchDescriptionType(IDType criteriaToSearch, String elementToSearch, String nameClass){

		List<DescriptionType> descriptionsToReturn = null;

		if (nameClass.equals(TenderingCriterionType.class.getName())) {

			descriptionsToReturn = searchDescriptionTypeInTenderingCriterion(criteriaToSearch);
			
		} else if (nameClass.equals(TenderingCriterionPropertyGroupType.class.getName())) {
			
			descriptionsToReturn = searchDescriptionTypeInTenderingCriterionPropertyGroup(criteriaToSearch, elementToSearch);
			
		} else if (nameClass.equals(TenderingCriterionPropertyType.class.getName())) {

			descriptionsToReturn = searchDescriptionTypeInTenderingCriterionProperty(criteriaToSearch, elementToSearch);
		}
		
		return descriptionsToReturn;
	}
	
	private static List<DescriptionType> searchDescriptionTypeInTenderingCriterion(IDType criteriaToSearch){

		List<DescriptionType> descriptionsToReturn = null;
		
		if (criteriaToSearch != null && StringUtils.isNotBlank(criteriaToSearch.getValue())){
			
			TenderingCriterionType criterionFounded = searchTenderingCriterionType(criteriaToSearch.getValue());
			if (criterionFounded != null) {
				descriptionsToReturn = criterionFounded.getDescription();
			}
		}
		
		return descriptionsToReturn;
	}

	private static List<DescriptionType> searchDescriptionTypeInTenderingCriterionPropertyGroup(IDType criteriaToSearch, String elementToSearch){

		List<DescriptionType> descriptionsToReturn = null;
		
		if (criteriaToSearch != null && StringUtils.isNotBlank(criteriaToSearch.getValue()) && StringUtils.isNotBlank(elementToSearch)){
			
			TenderingCriterionPropertyGroupType groupFounded = searchTenderingCriterionPropertyGroupType(criteriaToSearch.getValue(), elementToSearch);
			if (groupFounded != null) {
				descriptionsToReturn = groupFounded.getDescription();
			}
		}
		
		return descriptionsToReturn;
	}
	
	private static List<DescriptionType> searchDescriptionTypeInTenderingCriterionProperty(IDType criteriaToSearch, String elementToSearch){
		
		List<DescriptionType> descriptionsToReturn = null;
		
		if (criteriaToSearch != null && StringUtils.isNotBlank(criteriaToSearch.getValue()) && StringUtils.isNotBlank(elementToSearch)){
			
			TenderingCriterionPropertyType propertyFounded = searchTenderingCriterionPropertyType(criteriaToSearch.getValue(), elementToSearch);
			if (propertyFounded != null) {
				descriptionsToReturn = propertyFounded.getDescription();
			}
		}
		
		return descriptionsToReturn;
	}

	/*** SEARCH ResponseCodeType ***/
	
	protected static ResponseCodeType searchResponseCodeType(IDType criteriaToSearch, IDType propertyToSearch){

		ResponseCodeType responseCodeToReturn = null;
		
		if (criteriaToSearch != null && StringUtils.isNotBlank(criteriaToSearch.getValue()) &&
				propertyToSearch != null && StringUtils.isNotBlank(propertyToSearch.getValue())){

			TenderingCriterionPropertyType propertyFounded = searchTenderingCriterionPropertyType(criteriaToSearch.getValue(), propertyToSearch.getValue());
			if (propertyFounded != null) {
				responseCodeToReturn = propertyFounded.getResponseCode();
			}
		}
			
		return responseCodeToReturn;
	}

	/*** SEARCH TypeCodeType ***/
	
	protected static TypeCodeType searchTypeCodeType(IDType criteriaToSearch, String groupToSearch){

		TypeCodeType typeCodeToReturn = null;
		
		if (criteriaToSearch != null && StringUtils.isNotBlank(criteriaToSearch.getValue()) && StringUtils.isNotBlank(groupToSearch)){
		
			TenderingCriterionPropertyGroupType groupFounded = searchTenderingCriterionPropertyGroupType(criteriaToSearch.getValue(), groupToSearch);
			if (groupFounded != null) {
				typeCodeToReturn = groupFounded.getTypeCode();
			}
		}
		
		return typeCodeToReturn;
	}


	/*** SEARCH IndexType ***/
	
	protected static IndexType searchIndexType(IDType criteriaToSearch){

		IndexType indexToReturn = null;

		if (criteriaToSearch != null && StringUtils.isNotBlank(criteriaToSearch.getValue())){
			
			TenderingCriterionType criterionFounded = searchTenderingCriterionType(criteriaToSearch.getValue());
			if (criterionFounded != null) {
				indexToReturn = criterionFounded.getIndex();
			}
		}
		
		return indexToReturn;
	}

	/*** SEARCH CardinalityType ***/
	
	protected static CardinalityType searchCardinalityType(IDType criteriaToSearch, String elementToSearch, String nameClass){

		CardinalityType cardinalityToReturn = null;

		if (nameClass.equals(TenderingCriterionType.class.getName())) {
			
			cardinalityToReturn = searchCardinalityTypeInTenderingCriterion(criteriaToSearch);

		} else if (nameClass.equals(TenderingCriterionPropertyGroupType.class.getName())) {
			
			cardinalityToReturn = searchCardinalityTypeInTenderingCriterionPropertyGroup(criteriaToSearch, elementToSearch);
			
		} else if (nameClass.equals(TenderingCriterionPropertyType.class.getName())) {

			cardinalityToReturn = searchCardinalityTypeInTenderingCriterionProperty(criteriaToSearch, elementToSearch);
		}
		
		return cardinalityToReturn;
	}
	
	private static CardinalityType searchCardinalityTypeInTenderingCriterion(IDType criteriaToSearch){

		CardinalityType cardinalityToReturn = null;
		
		if (criteriaToSearch != null && StringUtils.isNotBlank(criteriaToSearch.getValue())){
			
			TenderingCriterionType criterionFounded = searchTenderingCriterionType(criteriaToSearch.getValue());
			if (criterionFounded != null) {
				cardinalityToReturn = criterionFounded.getCardinality();
			}
		}

		return cardinalityToReturn;
	}
	

	private static CardinalityType searchCardinalityTypeInTenderingCriterionPropertyGroup(IDType criteriaToSearch, String elementToSearch){

		CardinalityType cardinalityToReturn = null;

		if (criteriaToSearch != null && StringUtils.isNotBlank(criteriaToSearch.getValue()) && StringUtils.isNotBlank(elementToSearch)){
		
			TenderingCriterionPropertyGroupType groupFounded = searchTenderingCriterionPropertyGroupType(criteriaToSearch.getValue(), elementToSearch);
			if (groupFounded != null) {
				cardinalityToReturn = groupFounded.getCardinality();
			}
		}

		return cardinalityToReturn;
	}

	private static CardinalityType searchCardinalityTypeInTenderingCriterionProperty(IDType criteriaToSearch, String elementToSearch){

		CardinalityType cardinalityToReturn = null;

		if (criteriaToSearch != null && StringUtils.isNotBlank(criteriaToSearch.getValue()) && StringUtils.isNotBlank(elementToSearch)){
		
			TenderingCriterionPropertyType propertyFounded = searchTenderingCriterionPropertyType(criteriaToSearch.getValue(), elementToSearch);
			if (propertyFounded != null) {
				cardinalityToReturn = propertyFounded.getCardinality();
			}
		}

		return cardinalityToReturn;
	}

	/*** SEARCH TenderingCriterionType ***/
	
	protected static TenderingCriterionType searchTenderingCriterionType(String criteriaToSearch){
		
		TenderingCriterionType criteriaToReturn = null;
		

		List<TenderingCriterionType> genericCriteria = new ArrayList<TenderingCriterionType>();
		genericCriteria.addAll(variableConfiguration.itemCriteriaCustom.getCriteriaRequest());
		
		List<TenderingCriterionType> definitelyCriteria = new ArrayList<TenderingCriterionType>();
		definitelyCriteria.addAll(genericCriteria);
		
		addSubcriteria(definitelyCriteria, genericCriteria);
		
		CollectionUtils.filter(definitelyCriteria, new Predicate() {
			
			@Override
			public boolean evaluate(Object arg0) {
				return criteriaToSearch.contains(
						((TenderingCriterionType) arg0).getID().getValue());
			}
		});
		

		if (definitelyCriteria != null && !definitelyCriteria.isEmpty() && definitelyCriteria.get(0) != null) {
			criteriaToReturn = definitelyCriteria.get(0);
		}
		
		return criteriaToReturn;
	}
	
	private static void addSubcriteria(List<TenderingCriterionType> definitelyCriteria, List<TenderingCriterionType> genericCriteria){
		
		if (genericCriteria != null){

			for (TenderingCriterionType criterion : genericCriteria){
				
				if (criterion.getSubTenderingCriterion() != null && !criterion.getSubTenderingCriterion().isEmpty()){
					definitelyCriteria.addAll(criterion.getSubTenderingCriterion());
				}
			}
		}
	}

	/*** SEARCH TenderingCriterionPropertyGroupType ***/
	
	protected static TenderingCriterionPropertyGroupType searchTenderingCriterionPropertyGroupType(String criteriaToSearch, String parentsToSearch){
		
		TenderingCriterionPropertyGroupType groupToReturn = null;
		
		TenderingCriterionType criteriaFounded = searchTenderingCriterionType(criteriaToSearch);
		
		if (criteriaFounded != null) {

			/*List<TenderingCriterionPropertyGroupType> genericGroups = criteriaFounded.getTenderingCriterionPropertyGroup();
		
			List<TenderingCriterionPropertyGroupType> definitelyGroups = new ArrayList<TenderingCriterionPropertyGroupType>();
	
			addSubcriteriaGroup(definitelyGroups, criteriaFounded.getSubTenderingCriterion());
			
			addGroup(definitelyGroups, genericGroups);	
			
			addSubGroup(definitelyGroups, genericGroups);	
	
			CollectionUtils.filter(definitelyGroups, new Predicate() {
				
				@Override
				public boolean evaluate(Object arg0) {
					return groupToSearch.contains(
							((TenderingCriterionPropertyGroupType) arg0).getID().getValue());
				}
				
			});
			
			if (definitelyGroups != null && !definitelyGroups.isEmpty() && definitelyGroups.get(0) != null)
				groupToReturn = definitelyGroups.get(0);*/
			
			ArrayList<String> parentsSplitted = new ArrayList<String>(((List<String>) Arrays.asList(parentsToSearch.split(SPLIT_ID_PARENT))));
			
			List<TenderingCriterionPropertyGroupType> groups = criteriaFounded.getTenderingCriterionPropertyGroup();
			
			List<TenderingCriterionPropertyGroupType> majorGroups = predicateGroup(parentsSplitted, groups);

			List<TenderingCriterionPropertyGroupType> definitelyGroups = new ArrayList<TenderingCriterionPropertyGroupType>();
			
			if (!parentsSplitted.isEmpty()) {
				predicateSubGroup(parentsSplitted, majorGroups, definitelyGroups);
			} else {
				definitelyGroups.addAll(majorGroups);
			}

			if (definitelyGroups != null && !definitelyGroups.isEmpty() && definitelyGroups.get(0) != null) {
				groupToReturn = definitelyGroups.get(0);
			}
		}
			
		return groupToReturn;
	}
	
	/*private static void addSubcriteriaGroup(List<TenderingCriterionPropertyGroupType> definitelyGroups, List<TenderingCriterionType> genericSubcriteria){
		
		if (genericSubcriteria != null && !genericSubcriteria.isEmpty()){

			for (TenderingCriterionType subcriteria : genericSubcriteria){
				
				if (subcriteria.getTenderingCriterionPropertyGroup() != null && !subcriteria.getTenderingCriterionPropertyGroup().isEmpty()){
					addGroup(definitelyGroups, subcriteria.getTenderingCriterionPropertyGroup());
					addSubGroup(definitelyGroups, subcriteria.getTenderingCriterionPropertyGroup());
				}
			}
		}
	}

	private static void addGroup(List<TenderingCriterionPropertyGroupType> definitelyGroups, List<TenderingCriterionPropertyGroupType> genericGroups){

		if (genericGroups != null && !genericGroups.isEmpty())
			definitelyGroups.addAll(genericGroups);
	}
	
	private static void addSubGroup(List<TenderingCriterionPropertyGroupType> definitelyGroups, List<TenderingCriterionPropertyGroupType> genericGroups){

		if (genericGroups != null && !genericGroups.isEmpty()){

			for (TenderingCriterionPropertyGroupType group : genericGroups){
				
				if (group.getSubsidiaryTenderingCriterionPropertyGroup() != null && !group.getSubsidiaryTenderingCriterionPropertyGroup().isEmpty()){
					definitelyGroups.addAll(group.getSubsidiaryTenderingCriterionPropertyGroup());
					addSubGroup(definitelyGroups, group.getSubsidiaryTenderingCriterionPropertyGroup());
				}
			}
		}
	}*/
	
	private static List<TenderingCriterionPropertyGroupType> predicateGroup(ArrayList<String> parentsSplitted, List<TenderingCriterionPropertyGroupType> groups){

		
		List<TenderingCriterionPropertyGroupType> groupsToReturn = new ArrayList<TenderingCriterionPropertyGroupType>();

		if (groups != null && !groups.isEmpty()) {
			groupsToReturn.addAll(groups);
		
			CollectionUtils.filter(groupsToReturn, new Predicate() {
				
				@Override
				public boolean evaluate(Object arg0) {
					return parentsSplitted.get(0).contains(
							((TenderingCriterionPropertyGroupType) arg0).getID().getValue());
				}
			});
			
			parentsSplitted.remove(0);
		}
		
		return groupsToReturn;
	}
	
	private static void predicateSubGroup(ArrayList<String> parentsSplitted, List<TenderingCriterionPropertyGroupType> groups, List<TenderingCriterionPropertyGroupType> definitelyGroups){

		List<TenderingCriterionPropertyGroupType> subgroups = null;
		
		if (groups != null) {

			for (TenderingCriterionPropertyGroupType group : groups) {
				
				subgroups = group.getSubsidiaryTenderingCriterionPropertyGroup();

				List<TenderingCriterionPropertyGroupType> subgroupsToReturn = new ArrayList<TenderingCriterionPropertyGroupType>();
				
				if (subgroups != null) {
					
					subgroupsToReturn.addAll(subgroups);

					CollectionUtils.filter(subgroupsToReturn, new Predicate() {
						
						@Override
						public boolean evaluate(Object arg0) {
							return parentsSplitted.get(0).contains(
									((TenderingCriterionPropertyGroupType) arg0).getID().getValue());
						}
					});
					
					parentsSplitted.remove(0);
					
					if (!parentsSplitted.isEmpty()) {
						predicateSubGroup(parentsSplitted, subgroupsToReturn, definitelyGroups);
					} else {
						definitelyGroups.addAll(subgroupsToReturn);
					}
				}
			}
		}
	}

	/*** SEARCH TenderingCriterionPropertyType ***/
	
	protected static TenderingCriterionPropertyType searchTenderingCriterionPropertyType(String criteriaToSearch, String propertyToSearch){
		
		TenderingCriterionPropertyType propertyToReturn = null;
		
		TenderingCriterionType criteriaFounded = searchTenderingCriterionType(criteriaToSearch);
		
		
		if (criteriaFounded != null) {

			List<TenderingCriterionPropertyGroupType> genericGroups = criteriaFounded.getTenderingCriterionPropertyGroup();
		
			List<TenderingCriterionPropertyType> definitelyProperties = new ArrayList<TenderingCriterionPropertyType>();
	
			addSubcriteriaProperty(definitelyProperties, criteriaFounded.getSubTenderingCriterion());
			
			addProperty(definitelyProperties, genericGroups);	
			
			addSubProperty(definitelyProperties, genericGroups);	
			
			CollectionUtils.filter(definitelyProperties, new Predicate() {
				
				@Override
				public boolean evaluate(Object arg0) {
					return propertyToSearch.contains(
							((TenderingCriterionPropertyType) arg0).getID().getValue());
				}
				
			});
			
			if (definitelyProperties != null && !definitelyProperties.isEmpty() && definitelyProperties.get(0) != null) {
				propertyToReturn = definitelyProperties.get(0);
			}
		}
			
		return propertyToReturn;
	}
	
	private static void addSubcriteriaProperty(List<TenderingCriterionPropertyType> definitelyProperties, List<TenderingCriterionType> genericSubcriteria){
		
		if (genericSubcriteria != null){

			for (TenderingCriterionType subcriteria : genericSubcriteria){
				
				if (subcriteria.getTenderingCriterionPropertyGroup() != null && !subcriteria.getTenderingCriterionPropertyGroup().isEmpty()){
					addProperty(definitelyProperties, subcriteria.getTenderingCriterionPropertyGroup());
					addSubProperty(definitelyProperties, subcriteria.getTenderingCriterionPropertyGroup());
				}
			}
		}
	}

	private static void addProperty(List<TenderingCriterionPropertyType> definitelyProperties, List<TenderingCriterionPropertyGroupType> genericGroups){

		if (genericGroups != null){
			
			for (TenderingCriterionPropertyGroupType group : genericGroups){
				
				if (group.getTenderingCriterionProperty() != null && !group.getTenderingCriterionProperty().isEmpty()) {
					definitelyProperties.addAll(group.getTenderingCriterionProperty());
				}
			}
		}
	}
	
	private static void addSubProperty(List<TenderingCriterionPropertyType> definitelyProperties, List<TenderingCriterionPropertyGroupType> genericGroups){

		if (genericGroups != null){

			for (TenderingCriterionPropertyGroupType group : genericGroups){

				if (group.getTenderingCriterionProperty() != null && !group.getTenderingCriterionProperty().isEmpty()){
					definitelyProperties.addAll(group.getTenderingCriterionProperty());
				}
				if (group.getSubsidiaryTenderingCriterionPropertyGroup() != null && !group.getSubsidiaryTenderingCriterionPropertyGroup().isEmpty()){
					addSubProperty(definitelyProperties, group.getSubsidiaryTenderingCriterionPropertyGroup());
				}
			}
		}
	}
}
