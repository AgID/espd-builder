package com.pccube.espd.factory;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.text.ParseException;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pccube.espd.config.JaxbConfiguration;
import com.pccube.espd.model.QualificationApplicationRequestModel;
import com.pccube.espd.model.QualificationApplicationResponseModel;

import oasis.names.specification.ubl.schema.xsd.qualificationapplicationrequest_2.QualificationApplicationRequestType;
import oasis.names.specification.ubl.schema.xsd.qualificationapplicationresponse_2.QualificationApplicationResponseType;

/**
 * Class used to generate or to import XML files containing 
 * {@link QualificationApplicationRequestType} or {@link QualificationApplicationResponseType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
@Component
public class MarshallerFactory {

	@Autowired
	private JaxbConfiguration jaxbConfiguration;
	
	@Autowired
	private UblTransformerRequestFactory ublTransformerRequestFactory;
	
	@Autowired
	private UblTransformerResponseFactory ublTransformerResponseFactory;
	
	@Autowired
	private BeanTransformerRequestFactory beanTransformerRequestFactory;
	
	@Autowired
	private BeanTransformerResponseFactory beanTransformerResponseFactory;
	
	private oasis.names.specification.ubl.schema.xsd.qualificationapplicationrequest_2.ObjectFactory requestObjectFactory;
	
	private oasis.names.specification.ubl.schema.xsd.qualificationapplicationresponse_2.ObjectFactory responseObjectFactory;
	
	
	public MarshallerFactory() {
		// TODO Auto-generated constructor stub
		this.requestObjectFactory = new oasis.names.specification.ubl.schema.xsd.qualificationapplicationrequest_2.ObjectFactory();
		this.responseObjectFactory = new oasis.names.specification.ubl.schema.xsd.qualificationapplicationresponse_2.ObjectFactory();
	}

	
	/**
	 * Create a {@link QualificationApplicationRequestType} from the provided 
	 * {@link QualificationApplicationRequestModel} and marshals it to the output stream.
	 *
	 * @param requestModel The QualificationApplicationRequest that will be written out
	 *
	 * @return The stream where the XML representation will be written out
	 * 
	 * @throws ParseException 
	 * @throws IllegalAccessException 
	 */
	public ByteArrayOutputStream marshalRequest(QualificationApplicationRequestModel requestModel) throws ParseException, IllegalAccessException {
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		QualificationApplicationRequestType requestType = 
				ublTransformerRequestFactory.generateQualificationApplicationRequestType(requestModel);
		
		StreamResult result = new StreamResult(out);
		
		jaxbConfiguration.jaxb2Marshaller.marshal(
				requestObjectFactory.createQualificationApplicationRequest(requestType), result);
		
		return out;
	}

	/**
	 * Create a {@link QualificationApplicationResponseType} from the provided 
	 * {@link QualificationApplicationResponseModel} and marshals it to the output stream.
	 *
	 * @param responseModel The QualificationApplicationResponse that will be written out
	 *
	 * @return The stream where the XML representation will be written out
	 * 
	 * @throws ParseException 
	 * @throws IllegalAccessException 
	 */
	public ByteArrayOutputStream marshalResponse(QualificationApplicationResponseModel responseModel) throws ParseException, IllegalAccessException {
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		QualificationApplicationResponseType responseType = 
				ublTransformerResponseFactory.generateQualificationApplicationResponseType(responseModel);
		
		StreamResult result = new StreamResult(out);
		
		jaxbConfiguration.jaxb2Marshaller.marshal(
				responseObjectFactory.createQualificationApplicationResponse(responseType), result);
		
		return out;
	}

	/**
	 * Convert a {@link QualificationApplicationRequestType} coming from an input stream 
	 * into a {@link QualificationApplicationRequestModel} object.
	 *
	 * @param requestStream An input stream containing the QualificationApplicationRequest.
	 *
	 * @return An {@link QualificationApplicationRequestModel} object coming out from the stream.
	 * 
	 * @throws ParseException 
	 * @throws IllegalAccessException 
	 */
	@SuppressWarnings("unchecked")
	public QualificationApplicationRequestModel unmarshalRequestCA(InputStream requestStream) throws ParseException, IllegalAccessException {

		JAXBElement<Object> objectElement = (JAXBElement<Object>) 
				jaxbConfiguration.jaxb2Marshaller.unmarshal(new StreamSource(requestStream));

		QualificationApplicationRequestModel requestModel = null;
		
		if (objectElement.getDeclaredType().getTypeName().equals(
				QualificationApplicationRequestType.class.getTypeName())){

			QualificationApplicationRequestType requestElement = (QualificationApplicationRequestType) objectElement.getValue();
			
			requestModel = beanTransformerRequestFactory.generateQualificationApplicationRequestModel(requestElement);
		}
		
		return requestModel;
	}
	
	/**
	 * Convert a {@link QualificationApplicationRequestType}, if is a request, 
	 * or a {@link QualificationApplicationResponseType}, if is a response, 
	 * coming from an input stream into a {@link QualificationApplicationResponseModel} object.
	 *
	 * @param inputStream An input stream containing the QualificationApplicationRequest.
	 *
	 * @return An {@link QualificationApplicationResponseModel} object coming out from the stream.
	 * @throws IllegalAccessException 
	 */
	@SuppressWarnings("unchecked")
	public QualificationApplicationResponseModel unmarshalResponseOrRequestEO(InputStream inputStream) throws ParseException, IllegalAccessException {

		JAXBElement<Object> objectElement = (JAXBElement<Object>) 
				jaxbConfiguration.jaxb2Marshaller.unmarshal(new StreamSource(inputStream));
		
		QualificationApplicationResponseModel responseModel = null;

		if (objectElement.getDeclaredType().getTypeName().equals(
				QualificationApplicationRequestType.class.getTypeName())){
			
			QualificationApplicationRequestType requestElement = (QualificationApplicationRequestType) objectElement.getValue();
			
			responseModel = beanTransformerResponseFactory.generateQualificationApplicationResponseModel(requestElement);
			
		} else if (objectElement.getDeclaredType().getTypeName().equals(
				QualificationApplicationResponseType.class.getTypeName())){
					
			QualificationApplicationResponseType responseElement = (QualificationApplicationResponseType) objectElement.getValue();
			
			responseModel = beanTransformerResponseFactory.generateQualificationApplicationResponseModel(responseElement);
		}
		
		return responseModel;
	}

}
