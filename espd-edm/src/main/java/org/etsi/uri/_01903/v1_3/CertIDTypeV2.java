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


/**
 * <p>Classe Java per CertIDTypeV2 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CertIDTypeV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertDigest" type="{http://uri.etsi.org/01903/v1.3.2#}DigestAlgAndValueType"/&gt;
 *         &lt;element name="IssuerSerialV2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
@XmlType(name = "CertIDTypeV2", propOrder = {
    "certDigest",
    "issuerSerialV2"
})
public class CertIDTypeV2 implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "CertDigest", required = true)
    protected DigestAlgAndValueType certDigest;
    @XmlElement(name = "IssuerSerialV2")
    protected byte[] issuerSerialV2;
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
     * Recupera il valore della proprietà issuerSerialV2.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIssuerSerialV2() {
        return issuerSerialV2;
    }

    /**
     * Imposta il valore della proprietà issuerSerialV2.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIssuerSerialV2(byte[] value) {
        this.issuerSerialV2 = value;
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
            byte[] theIssuerSerialV2;
            theIssuerSerialV2 = this.getIssuerSerialV2();
            strategy.appendField(locator, this, "issuerSerialV2", buffer, theIssuerSerialV2, (this.issuerSerialV2 != null));
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
        final CertIDTypeV2 that = ((CertIDTypeV2) object);
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
            byte[] lhsIssuerSerialV2;
            lhsIssuerSerialV2 = this.getIssuerSerialV2();
            byte[] rhsIssuerSerialV2;
            rhsIssuerSerialV2 = that.getIssuerSerialV2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issuerSerialV2", lhsIssuerSerialV2), LocatorUtils.property(thatLocator, "issuerSerialV2", rhsIssuerSerialV2), lhsIssuerSerialV2, rhsIssuerSerialV2, (this.issuerSerialV2 != null), (that.issuerSerialV2 != null))) {
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
            byte[] theIssuerSerialV2;
            theIssuerSerialV2 = this.getIssuerSerialV2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issuerSerialV2", theIssuerSerialV2), currentHashCode, theIssuerSerialV2, (this.issuerSerialV2 != null));
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
