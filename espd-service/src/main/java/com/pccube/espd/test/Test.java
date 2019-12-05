package com.pccube.espd.test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamSource;

import org.oasis_open.docs.codelist.ns.genericode._1.CodeListDocument;
import org.oasis_open.docs.codelist.ns.genericode._1.Column;
import org.oasis_open.docs.codelist.ns.genericode._1.SimpleValue;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.cglib.core.Predicate;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.pccube.espd.factory.MarshallerCriteriaFactory;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionPropertyGroupType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionPropertyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionType;
import oasis.names.specification.ubl.schema.xsd.qualificationapplicationrequest_2.QualificationApplicationRequestType;
import oasis.names.specification.ubl.schema.xsd.qualificationapplicationresponse_2.QualificationApplicationResponseType;

/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*testUnmarshalCriteria();
		
		testUnmarshalGC();
		
		testFilteredTypeCode();
		
		testFilteredCardinality();*/
		
		testFilteredCardinalityWithParent();
	}
	
	public static Jaxb2Marshaller jaxb2Marshaller;

    public static Jaxb2Marshaller instanceJaxb2Marshaller() {
    	if (jaxb2Marshaller == null){
    		jaxb2Marshaller = new Jaxb2Marshaller();
    	}
    	
        jaxb2Marshaller.setPackagesToScan(
        		QualificationApplicationRequestType.class.getPackage().getName(),
                QualificationApplicationResponseType.class.getPackage().getName(),
                CodeListDocument.class.getPackage().getName());
        
        Map<String, Object> map = new HashMap<>(2);
        
        map.put(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        jaxb2Marshaller.setMarshallerProperties(map);
        
        return jaxb2Marshaller;
    }

    
    
    /**************************/
    /*** UNMARSHAL CRITERIA ***/
    
	@SuppressWarnings("unchecked")
	private static void testUnmarshalCriteria(){

		instanceJaxb2Marshaller();
		
		InputStream requestCustomStream = MarshallerCriteriaFactory.class.getResourceAsStream("/xml/SELFCONTAINED-ESPDRequest_v2.1.0_ita_custom.xml");
		
		JAXBElement<QualificationApplicationRequestType> requestCustomElement = 
				(JAXBElement<QualificationApplicationRequestType>) 
				jaxb2Marshaller.unmarshal(new StreamSource(requestCustomStream));
		
		System.out.println("");

		System.out.println("*** CUSTOM ***");
		System.out.println(requestCustomElement.getValue().getTenderingCriterion().get(0));
		System.out.println("**************");
		
		System.out.println("");
		
		InputStream requestStream = MarshallerCriteriaFactory.class.getResourceAsStream("/xml/SELFCONTAINED-ESPDRequest_v2.1.0_ita.xml");
		
		JAXBElement<QualificationApplicationRequestType> requestElement = 
				(JAXBElement<QualificationApplicationRequestType>) 
				jaxb2Marshaller.unmarshal(new StreamSource(requestStream));
		
		System.out.println("*** CLASSIC ***");
		System.out.println(requestElement.getValue().getTenderingCriterion().get(0));
		System.out.println("***************");
		
		System.out.println("");
	}

	

    /******************************/
    /*** UNMARSHAL GENERIC CODE ***/
	
	@SuppressWarnings("unchecked")
	private static void testUnmarshalGC(){

		instanceJaxb2Marshaller();
		
		InputStream codelistStream = MarshallerCriteriaFactory.class.getResourceAsStream("/codelists/gc/BidType-CodeList.gc");

		JAXBElement<CodeListDocument> codelistElement = 
				(JAXBElement<CodeListDocument>) 
				jaxb2Marshaller.unmarshal(new StreamSource(codelistStream));

		System.out.println("*** BidType CODELIST ***");
		Column col = (Column) codelistElement.getValue().getSimpleCodeList().getRow().get(0).getValue().get(0).getColumnRef();
		SimpleValue sim = codelistElement.getValue().getSimpleCodeList().getRow().get(0).getValue().get(0).getSimpleValue();
		if ("code".equals(col.getId()))
			System.out.println(sim.getValue());
		System.out.println("***************");
		
		System.out.println("");
	    
	}
	

	
	/****************************/
	/**** FILTERED TYPE CODE ****/
	
	@SuppressWarnings("unchecked")
	private static void testFilteredTypeCode(){
		
		instanceJaxb2Marshaller();
		
		InputStream requestCustomStream = MarshallerCriteriaFactory.class.getResourceAsStream("/xml/SELFCONTAINED-ESPDRequest_v2.1.0_eu_custom.xml");
		
		JAXBElement<QualificationApplicationRequestType> requestCustomElement = 
				(JAXBElement<QualificationApplicationRequestType>) 
				jaxb2Marshaller.unmarshal(new StreamSource(requestCustomStream));
		
		List<TenderingCriterionType> criteria = requestCustomElement.getValue().getTenderingCriterion();
		
		String criteriaToSearch = "005eb9ed-1347-4ca3-bb29-9bc0db64e1ab";

		System.out.println("***********************");
		System.out.println("*** Filter CRITERIA ***");
		System.out.println("***********************");
		
		CollectionUtils.filter(criteria, new Predicate() {
			
			@Override
			public boolean evaluate(Object arg0) {
				return criteriaToSearch.contains(
						((TenderingCriterionType) arg0).getID().getValue());
			}
		});
		
		System.out.println("********************************************");
		System.out.println("*** " + criteria.get(0).getID().getValue() + " ***");
		System.out.println("********************************************");
		
		List<TenderingCriterionPropertyGroupType> genericgroups = criteria.get(0).getTenderingCriterionPropertyGroup();
		
		List<TenderingCriterionPropertyGroupType> definitelygroups = new ArrayList<TenderingCriterionPropertyGroupType>();

		System.out.println("*****************************************************");
		System.out.println("*** Aggiungo i GROUP e i SUBGROUP dei SubCriteria ***");
		System.out.println("********************");
		
		addSubcriteriaGroup(definitelygroups, criteria.get(0).getSubTenderingCriterion());

		System.out.println("************************");
		System.out.println("*** Aggiungo i GROUP ***");
		System.out.println("************************");
		
		addGroup(definitelygroups, genericgroups);	

		System.out.println("***************************");
		System.out.println("*** Aggiungo i SUBGROUP ***");
		System.out.println("***************************");
		
		addSubGroup(definitelygroups, genericgroups);		

		System.out.println("*********************");
		System.out.println("*** Filter GROUPS ***");
		System.out.println("*********************");
		
		String subgroupToSearch = "8c39b505-8abe-44fa-a3e0-f2d78b9d8224";
		
		CollectionUtils.filter(definitelygroups, new Predicate() {
			
			@Override
			public boolean evaluate(Object arg0) {
				return subgroupToSearch.contains(
						((TenderingCriterionPropertyGroupType) arg0).getID().getValue());
			}
			
		});
		
		System.out.println("********************************************");
		System.out.println("*** " + definitelygroups.get(0).getTypeCode().getValue() + " ***");
		System.out.println("********************************************");
		
	}
	
	private static void addSubcriteriaGroup(List<TenderingCriterionPropertyGroupType> definitelygroups, List<TenderingCriterionType> genericsubcriteria){
		
		if (genericsubcriteria != null && !genericsubcriteria.isEmpty()){

			for (TenderingCriterionType subcriteria : genericsubcriteria){
				
				if (subcriteria.getTenderingCriterionPropertyGroup() != null && !subcriteria.getTenderingCriterionPropertyGroup().isEmpty()){
					addGroup(definitelygroups, subcriteria.getTenderingCriterionPropertyGroup());
					addSubGroup(definitelygroups, subcriteria.getTenderingCriterionPropertyGroup());
				}
			}
		}
	}
	
	private static void addGroup(List<TenderingCriterionPropertyGroupType> definitelygroups, List<TenderingCriterionPropertyGroupType> genericgroups){

		if (genericgroups != null && !genericgroups.isEmpty())
			definitelygroups.addAll(genericgroups);
	}
	
	private static void addSubGroup(List<TenderingCriterionPropertyGroupType> definitelygroups, List<TenderingCriterionPropertyGroupType> genericgroups){

		if (genericgroups != null && !genericgroups.isEmpty()){

			for (TenderingCriterionPropertyGroupType group : genericgroups){
				
				if (group.getSubsidiaryTenderingCriterionPropertyGroup() != null && !group.getSubsidiaryTenderingCriterionPropertyGroup().isEmpty()){
					definitelygroups.addAll(group.getSubsidiaryTenderingCriterionPropertyGroup());
					addSubGroup(definitelygroups, group.getSubsidiaryTenderingCriterionPropertyGroup());
				}
			}
		}
	}
	

	
	/******************************/
	/**** FILTERED CARDINALITY ****/

	@SuppressWarnings("unchecked")
	private static void testFilteredCardinality(){
		
		instanceJaxb2Marshaller();
		
		InputStream requestCustomStream = MarshallerCriteriaFactory.class.getResourceAsStream("/xml/SELFCONTAINED-ESPDRequest_v2.1.0_eu_custom.xml");
		
		JAXBElement<QualificationApplicationRequestType> requestCustomElement = 
				(JAXBElement<QualificationApplicationRequestType>) 
				jaxb2Marshaller.unmarshal(new StreamSource(requestCustomStream));
		
		List<TenderingCriterionType> criteria = requestCustomElement.getValue().getTenderingCriterion();
		
		String criteriaToSearch = "005eb9ed-1347-4ca3-bb29-9bc0db64e1ab";

		System.out.println("***********************");
		System.out.println("*** Filter CRITERIA ***");
		System.out.println("***********************");
		
		CollectionUtils.filter(criteria, new Predicate() {
			
			@Override
			public boolean evaluate(Object arg0) {
				return criteriaToSearch.contains(
						((TenderingCriterionType) arg0).getID().getValue());
			}
		});
		
		System.out.println("********************************************");
		System.out.println("*** " + criteria.get(0).getID().getValue() + " ***");
		System.out.println("********************************************");
			
		List<TenderingCriterionPropertyGroupType> genericgroups = criteria.get(0).getTenderingCriterionPropertyGroup();

		List<TenderingCriterionPropertyType> definitelyProperties = new ArrayList<TenderingCriterionPropertyType>();

		System.out.println("*******************************************");
		System.out.println("*** Aggiungo i PROPERTY dei SubCriteria ***");
		System.out.println("*******************************************");
		
		addSubcriteriaProperty(definitelyProperties, criteria.get(0).getSubTenderingCriterion());

		System.out.println("*************************************");
		System.out.println("*** Aggiungo i PROPERTY dei Group ***");
		System.out.println("*************************************");

		addProperty(definitelyProperties, genericgroups);	

		System.out.println("****************************************");
		System.out.println("*** Aggiungo i PROPERTY dei Subgroup ***");
		System.out.println("****************************************");

		addSubProperty(definitelyProperties, genericgroups);	

		System.out.println("*********************");
		System.out.println("*** Filter GROUPS ***");
		System.out.println("*********************");
		
		String propertyToSearch = "d663fa0a-c7a8-42fa-a600-5f16e67b3bbe";
		
		CollectionUtils.filter(definitelyProperties, new Predicate() {
			
			@Override
			public boolean evaluate(Object arg0) {
				return propertyToSearch.contains(
						((TenderingCriterionPropertyType) arg0).getID().getValue());
			}
			
		});
		
		
		System.out.println("************");
		System.out.println("*** " + definitelyProperties.get(0).getCardinality().getValue() + " ***");
		System.out.println("************");
		
	}
	
	private static void addSubcriteriaProperty(List<TenderingCriterionPropertyType> definitelyProperties, List<TenderingCriterionType> genericSubcriteria){
		
		if (genericSubcriteria != null && !genericSubcriteria.isEmpty()){

			for (TenderingCriterionType subcriteria : genericSubcriteria){
				
				if (subcriteria.getTenderingCriterionPropertyGroup() != null && !subcriteria.getTenderingCriterionPropertyGroup().isEmpty()){
					addProperty(definitelyProperties, subcriteria.getTenderingCriterionPropertyGroup());
					addSubProperty(definitelyProperties, subcriteria.getTenderingCriterionPropertyGroup());
				}
			}
		}
	}

	private static void addProperty(List<TenderingCriterionPropertyType> definitelyProperties, List<TenderingCriterionPropertyGroupType> genericGroups){

		if (genericGroups != null && !genericGroups.isEmpty()){
			for (TenderingCriterionPropertyGroupType group : genericGroups){
				if (group.getTenderingCriterionProperty() != null && !group.getTenderingCriterionProperty().isEmpty())
					definitelyProperties.addAll(group.getTenderingCriterionProperty());
			}
		}
	}
	
	private static void addSubProperty(List<TenderingCriterionPropertyType> definitelyProperties, List<TenderingCriterionPropertyGroupType> genericGroups){

		if (genericGroups != null && !genericGroups.isEmpty()){

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


	
	/******************************************/
	/**** FILTERED CARDINALITY with PARENT ****/
	
	@SuppressWarnings("unchecked")
	private static void testFilteredCardinalityWithParent(){
		
		instanceJaxb2Marshaller();
		
		InputStream requestCustomStream = MarshallerCriteriaFactory.class.getResourceAsStream("/xml/SELFCONTAINED-ESPDRequest_v2.1.0_ita_custom.xml");
		
		JAXBElement<QualificationApplicationRequestType> requestCustomElement = 
				(JAXBElement<QualificationApplicationRequestType>) 
				jaxb2Marshaller.unmarshal(new StreamSource(requestCustomStream));

		System.out.println("***********************");
		System.out.println("*** Filter CRITERIA ***");
		System.out.println("***********************");
		
		List<TenderingCriterionType> criteria = requestCustomElement.getValue().getTenderingCriterion();
		
		String criteriaToSearch = "3aaca389-4a7b-406b-a4b9-080845d127e7";
		
		CollectionUtils.filter(criteria, new Predicate() {
			
			@Override
			public boolean evaluate(Object arg0) {
				return criteriaToSearch.contains(
						((TenderingCriterionType) arg0).getID().getValue());
			}
		});
		
		System.out.println("********************************************");
		System.out.println("*** " + criteria.get(0).getID().getValue() + " ***");
		System.out.println("********************************************");

		
		System.out.println("***********************");
		System.out.println("*** Filter GROUPS 1 ***");
		System.out.println("***********************");
			
		String parentsToSearch1 = "1e73d705-9dc1-43f1-9b5c-2d0deac7bc5f%%f156d97a-9700-4ad9-8d21-e3ac57102278%%609cc954-64be-4b4f-800a-f17589deb936%%52ffcf91-3598-438f-8c3d-faf97da02602";
		
		ArrayList<String> parentsSplitted1 = new ArrayList<String>(((List<String>) Arrays.asList(parentsToSearch1.split("%%"))));
		
		List<TenderingCriterionPropertyGroupType> groups1 = criteria.get(0).getTenderingCriterionPropertyGroup();
		
		List<TenderingCriterionPropertyGroupType> majorGroups1 = predicateGroup(parentsSplitted1, groups1);

		List<TenderingCriterionPropertyGroupType> definitelyGroups1 = new ArrayList<TenderingCriterionPropertyGroupType>();

		if (!parentsSplitted1.isEmpty()) 
			predicateSubGroup(parentsSplitted1, majorGroups1, definitelyGroups1);
		else
			definitelyGroups1.addAll(majorGroups1);

		System.out.println(definitelyGroups1.get(0).getID().getValue());
		
		System.out.println("***********************");
		System.out.println("*** Filter GROUPS 2 ***");
		System.out.println("***********************");

		String parentsToSearch2 = "1e73d705-9dc1-43f1-9b5c-2d0deac7bc5f%%f156d97a-9700-4ad9-8d21-e3ac57102278%%45a67f48-d146-4faf-8239-dd6977dffe29%%52ffcf91-3598-438f-8c3d-faf97da02602";
		
		ArrayList<String> parentsSplitted2 = new ArrayList<String>(((List<String>) Arrays.asList(parentsToSearch2.split("%%"))));
		
		List<TenderingCriterionPropertyGroupType> groups2 = criteria.get(0).getTenderingCriterionPropertyGroup();
		
		List<TenderingCriterionPropertyGroupType> majorGroups2 = predicateGroup(parentsSplitted2, groups2);

		List<TenderingCriterionPropertyGroupType> definitelyGroups2 = new ArrayList<TenderingCriterionPropertyGroupType>();

		if (!parentsSplitted2.isEmpty()) 
			predicateSubGroup(parentsSplitted2, majorGroups2, definitelyGroups2);
		else
			definitelyGroups2.addAll(majorGroups2);

		System.out.println(definitelyGroups2.get(0).getID().getValue());

	}
	
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
		
		if (groups != null && !groups.isEmpty()) {

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
					
					if (!parentsSplitted.isEmpty())
						predicateSubGroup(parentsSplitted, subgroupsToReturn, definitelyGroups);
					else
						definitelyGroups.addAll(subgroupsToReturn);
				}
			}
		}
	}
	
	
	
}
