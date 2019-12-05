//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.etsi.uri._01903.v1_4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.etsi.uri._01903.v1_3.ObjectIdentifierType;
import org.etsi.uri._01903.v1_3.XAdESTimeStampType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.etsi.uri._01903.v1_4 package. 
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

    private final static QName _TimeStampValidationData_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "TimeStampValidationData");
    private final static QName _SignaturePolicyStore_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "SignaturePolicyStore");
    private final static QName _SPDocSpecification_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "SPDocSpecification");
    private final static QName _RenewedDigests_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "RenewedDigests");
    private final static QName _RecomputedDigestValue_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "RecomputedDigestValue");
    private final static QName _ArchiveTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "ArchiveTimeStamp");
    private final static QName _CompleteCertificateRefsV2_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "CompleteCertificateRefsV2");
    private final static QName _AttributeCertificateRefsV2_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "AttributeCertificateRefsV2");
    private final static QName _SigAndRefsTimeStampV2_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "SigAndRefsTimeStampV2");
    private final static QName _RefsOnlyTimeStampV2_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "RefsOnlyTimeStampV2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.etsi.uri._01903.v1_4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidationDataType }
     * 
     */
    public ValidationDataType createValidationDataType() {
        return new ValidationDataType();
    }

    /**
     * Create an instance of {@link SignaturePolicyStoreType }
     * 
     */
    public SignaturePolicyStoreType createSignaturePolicyStoreType() {
        return new SignaturePolicyStoreType();
    }

    /**
     * Create an instance of {@link RenewedDigestsType }
     * 
     */
    public RenewedDigestsType createRenewedDigestsType() {
        return new RenewedDigestsType();
    }

    /**
     * Create an instance of {@link RecomputedDigestValueType }
     * 
     */
    public RecomputedDigestValueType createRecomputedDigestValueType() {
        return new RecomputedDigestValueType();
    }

    /**
     * Create an instance of {@link CompleteCertificateRefsTypeV2 }
     * 
     */
    public CompleteCertificateRefsTypeV2 createCompleteCertificateRefsTypeV2() {
        return new CompleteCertificateRefsTypeV2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "TimeStampValidationData")
    public JAXBElement<ValidationDataType> createTimeStampValidationData(ValidationDataType value) {
        return new JAXBElement<ValidationDataType>(_TimeStampValidationData_QNAME, ValidationDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignaturePolicyStoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "SignaturePolicyStore")
    public JAXBElement<SignaturePolicyStoreType> createSignaturePolicyStore(SignaturePolicyStoreType value) {
        return new JAXBElement<SignaturePolicyStoreType>(_SignaturePolicyStore_QNAME, SignaturePolicyStoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "SPDocSpecification")
    public JAXBElement<ObjectIdentifierType> createSPDocSpecification(ObjectIdentifierType value) {
        return new JAXBElement<ObjectIdentifierType>(_SPDocSpecification_QNAME, ObjectIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenewedDigestsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "RenewedDigests")
    public JAXBElement<RenewedDigestsType> createRenewedDigests(RenewedDigestsType value) {
        return new JAXBElement<RenewedDigestsType>(_RenewedDigests_QNAME, RenewedDigestsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecomputedDigestValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "RecomputedDigestValue")
    public JAXBElement<RecomputedDigestValueType> createRecomputedDigestValue(RecomputedDigestValueType value) {
        return new JAXBElement<RecomputedDigestValueType>(_RecomputedDigestValue_QNAME, RecomputedDigestValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "ArchiveTimeStamp")
    public JAXBElement<XAdESTimeStampType> createArchiveTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_ArchiveTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsTypeV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "CompleteCertificateRefsV2")
    public JAXBElement<CompleteCertificateRefsTypeV2> createCompleteCertificateRefsV2(CompleteCertificateRefsTypeV2 value) {
        return new JAXBElement<CompleteCertificateRefsTypeV2>(_CompleteCertificateRefsV2_QNAME, CompleteCertificateRefsTypeV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsTypeV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "AttributeCertificateRefsV2")
    public JAXBElement<CompleteCertificateRefsTypeV2> createAttributeCertificateRefsV2(CompleteCertificateRefsTypeV2 value) {
        return new JAXBElement<CompleteCertificateRefsTypeV2>(_AttributeCertificateRefsV2_QNAME, CompleteCertificateRefsTypeV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "SigAndRefsTimeStampV2")
    public JAXBElement<XAdESTimeStampType> createSigAndRefsTimeStampV2(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_SigAndRefsTimeStampV2_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "RefsOnlyTimeStampV2")
    public JAXBElement<XAdESTimeStampType> createRefsOnlyTimeStampV2(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_RefsOnlyTimeStampV2_QNAME, XAdESTimeStampType.class, null, value);
    }

}
