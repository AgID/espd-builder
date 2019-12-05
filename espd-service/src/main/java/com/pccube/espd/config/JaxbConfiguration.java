package com.pccube.espd.config;

import org.oasis_open.docs.codelist.ns.genericode._1.CodeListDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import oasis.names.specification.ubl.schema.xsd.qualificationapplicationrequest_2.QualificationApplicationRequestType;
import oasis.names.specification.ubl.schema.xsd.qualificationapplicationresponse_2.QualificationApplicationResponseType;

import javax.xml.bind.Marshaller;
import java.util.HashMap;
import java.util.Map;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
@Configuration
public class JaxbConfiguration {
	
	@Autowired
	public Jaxb2Marshaller jaxb2Marshaller;

    @Bean
    public Jaxb2Marshaller instanceJaxb2Marshaller() {
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
    
}
