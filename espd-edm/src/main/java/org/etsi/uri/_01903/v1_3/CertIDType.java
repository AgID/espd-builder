//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.etsi.uri._01903.v1_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import org.w3._2000._09.xmldsig_.X509IssuerSerialType;


/**
 * <p>Classe Java per CertIDType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CertIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertDigest" type="{http://uri.etsi.org/01903/v1.3.2#}DigestAlgAndValueType"/&gt;
 *         &lt;element name="IssuerSerial" type="{http://www.w3.org/2000/09/xmldsig#}X509IssuerSerialType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertIDType", propOrder = {
    "certDigest",
    "issuerSerial"
})
public class CertIDType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "CertDigest", required = true)
    protected DigestAlgAndValueType certDigest;
    @XmlElement(name = "IssuerSerial", required = true)
    protected X509IssuerSerialType issuerSerial;
    @XmlAttribute(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * Recupera il valore della proprietà certDigest.
     * 
     * @return
     *     possible object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public DigestAlgAndValueType getCertDigest() {
        return certDigest;
    }

    /**
     * Imposta il valore della proprietà certDigest.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public void setCertDigest(DigestAlgAndValueType value) {
        this.certDigest = value;
    }

    /**
     * Recupera il valore della proprietà issuerSerial.
     * 
     * @return
     *     possible object is
     *     {@link X509IssuerSerialType }
     *     
     */
    public X509IssuerSerialType getIssuerSerial() {
        return issuerSerial;
    }

    /**
     * Imposta il valore della proprietà issuerSerial.
     * 
     * @param value
     *     allowed object is
     *     {@link X509IssuerSerialType }
     *     
     */
    public void setIssuerSerial(X509IssuerSerialType value) {
        this.issuerSerial = value;
    }

    /**
     * Recupera il valore della proprietà uri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Imposta il valore della proprietà uri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            DigestAlgAndValueType theCertDigest;
            theCertDigest = this.getCertDigest();
            strategy.appendField(locator, this, "certDigest", buffer, theCertDigest, (this.certDigest!= null));
        }
        {
            X509IssuerSerialType theIssuerSerial;
            theIssuerSerial = this.getIssuerSerial();
            strategy.appendField(locator, this, "issuerSerial", buffer, theIssuerSerial, (this.issuerSerial!= null));
        }
        {
            String theURI;
            theURI = this.getURI();
            strategy.appendField(locator, this, "uri", buffer, theURI, (this.uri!= null));
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CertIDType that = ((CertIDType) object);
        {
            DigestAlgAndValueType lhsCertDigest;
            lhsCertDigest = this.getCertDigest();
            DigestAlgAndValueType rhsCertDigest;
            rhsCertDigest = that.getCertDigest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certDigest", lhsCertDigest), LocatorUtils.property(thatLocator, "certDigest", rhsCertDigest), lhsCertDigest, rhsCertDigest, (this.certDigest!= null), (that.certDigest!= null))) {
                return false;
            }
        }
        {
            X509IssuerSerialType lhsIssuerSerial;
            lhsIssuerSerial = this.getIssuerSerial();
            X509IssuerSerialType rhsIssuerSerial;
            rhsIssuerSerial = that.getIssuerSerial();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issuerSerial", lhsIssuerSerial), LocatorUtils.property(thatLocator, "issuerSerial", rhsIssuerSerial), lhsIssuerSerial, rhsIssuerSerial, (this.issuerSerial!= null), (that.issuerSerial!= null))) {
                return false;
            }
        }
        {
            String lhsURI;
            lhsURI = this.getURI();
            String rhsURI;
            rhsURI = that.getURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uri", lhsURI), LocatorUtils.property(thatLocator, "uri", rhsURI), lhsURI, rhsURI, (this.uri!= null), (that.uri!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            DigestAlgAndValueType theCertDigest;
            theCertDigest = this.getCertDigest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "certDigest", theCertDigest), currentHashCode, theCertDigest, (this.certDigest!= null));
        }
        {
            X509IssuerSerialType theIssuerSerial;
            theIssuerSerial = this.getIssuerSerial();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issuerSerial", theIssuerSerial), currentHashCode, theIssuerSerial, (this.issuerSerial!= null));
        }
        {
            String theURI;
            theURI = this.getURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uri", theURI), currentHashCode, theURI, (this.uri!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
