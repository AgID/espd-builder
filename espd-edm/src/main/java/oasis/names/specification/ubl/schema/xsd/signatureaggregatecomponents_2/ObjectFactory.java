//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.signatureaggregatecomponents_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.specification.ubl.schema.xsd.signatureaggregatecomponents_2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SignatureInformation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2", "SignatureInformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.signatureaggregatecomponents_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignatureInformationType }
     * 
     */
    public SignatureInformationType createSignatureInformationType() {
        return new SignatureInformationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2", name = "SignatureInformation")
    public JAXBElement<SignatureInformationType> createSignatureInformation(SignatureInformationType value) {
        return new JAXBElement<SignatureInformationType>(_SignatureInformation_QNAME, SignatureInformationType.class, null, value);
    }

}
