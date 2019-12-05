package com.pccube.espd.factory;

import java.io.InputStream;
import java.text.ParseException;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.stream.StreamSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.cglib.core.Predicate;
import org.springframework.stereotype.Component;

import com.pccube.espd.config.EspdConfiguration;
import com.pccube.espd.config.JaxbConfiguration;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionResponseType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionType;
import oasis.names.specification.ubl.schema.xsd.qualificationapplicationrequest_2.QualificationApplicationRequestType;
import oasis.names.specification.ubl.schema.xsd.qualificationapplicationresponse_2.QualificationApplicationResponseType;

/**
 * Class used to generate Criteria Object from XML stream files.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
@Component
public class MarshallerCriteriaFactory {

	@Autowired
	private JaxbConfiguration jaxbConfiguration;
	
	@Autowired
	private EspdConfiguration espdConfiguration;

	
	/**
	 * Get Criteria from a {@link QualificationApplicationRequestType} file.
	 * 
	 * @param criterionKeys List of criteria to extract.
	 * 
	 * @return A list of {@link TenderingCriterionType} objects coming out from file.
	 * 
	 * @throws ParseException 
	 */
	public List<TenderingCriterionType> criteriaRequest() throws ParseException {

		InputStream requestStream = MarshallerCriteriaFactory.class.
				getResourceAsStream("/" + espdConfiguration.getXmlRequestSelfcontained());
		
		return unmarshalRequestCriteria(requestStream);
	}
	
	/**
	 * Get Criteria from a {@link QualificationApplicationRequestType} file.
	 * 
	 * @param criterionKeys List of criteria to extract.
	 * 
	 * @return A list of {@link TenderingCriterionType} objects coming out from file.
	 * 
	 * @throws ParseException 
	 */
	public List<TenderingCriterionType> criteriaRequestCustom() throws ParseException {

		InputStream requestStream = MarshallerCriteriaFactory.class.
				getResourceAsStream("/" + espdConfiguration.getXmlRequestSelfcontainedCustom());
		
		return unmarshalRequestCriteria(requestStream);
	}

	/**
	 * Convert a {@link TenderingCriterionType} coming from an input stream of {@link QualificationApplicationRequestType}.
	 *
	 * @param requestStream
	 * 
	 * @return A list of {@link TenderingCriterionType} objects coming out from the stream.
	 * 
	 * @throws ParseException 
	 */
	@SuppressWarnings("unchecked")
	protected List<TenderingCriterionType> unmarshalRequestCriteria(InputStream requestStream) throws ParseException {

		JAXBElement<QualificationApplicationRequestType> requestElement = 
				(JAXBElement<QualificationApplicationRequestType>) 
				jaxbConfiguration.jaxb2Marshaller.unmarshal(new StreamSource(requestStream));
		
		List<TenderingCriterionType> tenderingCriterionTypes = null;
		
		if (requestElement.getValue() != null) {
			tenderingCriterionTypes = requestElement.getValue().getTenderingCriterion();
		}
		
		return tenderingCriterionTypes;
	}
	
	public List<TenderingCriterionType> filterRequestCriteria(List<TenderingCriterionType> criterionTypes, List<String> criterionKeys) {

		if (criterionKeys != null && criterionKeys.size() > 0) {
			CollectionUtils.filter(criterionTypes, new Predicate() {
				
				@Override
				public boolean evaluate(Object arg0) {
					return criterionKeys.contains(
							((TenderingCriterionType) arg0).getCriterionTypeCode().getValue());
				}
			});
		}
		return criterionTypes;
	}
	
	/**
	 * Get Criteria from a {@link QualificationApplicationResponseType} file.
	 * 
	 * @return A list of {@link TenderingCriterionResponseType} objects coming out from file.
	 * 
	 * @throws ParseException 
	 */
	public List<TenderingCriterionResponseType> criteriaResponse() throws ParseException {

		InputStream responseStream = MarshallerCriteriaFactory.class.getResourceAsStream("/" + espdConfiguration.getXmlResponseSelfcontained());
		
		return unmarshalResponseCriteria(responseStream);
	}

	/**
	 * Convert a {@link TenderingCriterionResponseType} coming from an input stream of {@link QualificationApplicationResponseType}.
	 *
	 * @param responseStream
	 * 
	 * @return A list of {@link TenderingCriterionResponseType} objects coming out from the stream.
	 * 
	 * @throws ParseException 
	 */
	@SuppressWarnings("unchecked")
	protected List<TenderingCriterionResponseType> unmarshalResponseCriteria(InputStream responseStream) throws ParseException {

		JAXBElement<QualificationApplicationResponseType> responseElement = 
				(JAXBElement<QualificationApplicationResponseType>) 
				jaxbConfiguration.jaxb2Marshaller.unmarshal(new StreamSource(responseStream));
		
		List<TenderingCriterionResponseType> tenderingCriterionResponseTypes = null;
		
		if (responseElement.getValue() != null) {
			tenderingCriterionResponseTypes = responseElement.getValue().getTenderingCriterionResponse();
		}
		
		return tenderingCriterionResponseTypes;
	}
	
	public List<TenderingCriterionResponseType> filterResponseCriteria(List<TenderingCriterionResponseType> criterionResponseTypes, List<String> propertyIDKeys) {

		if (propertyIDKeys != null && propertyIDKeys.size() > 0) {
			CollectionUtils.filter(criterionResponseTypes, new Predicate() {
				
				@Override
				public boolean evaluate(Object arg0) {
					return propertyIDKeys.contains(
							((TenderingCriterionResponseType) arg0).getValidatedCriterionPropertyID().getValue());
				}
			});
		}
		return criterionResponseTypes;
	}
}
