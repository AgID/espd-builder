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
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Classe Java per OCSPRefType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCSPRefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OCSPIdentifier" type="{http://uri.etsi.org/01903/v1.3.2#}OCSPIdentifierType"/&gt;
 *         &lt;element name="DigestAlgAndValue" type="{http://uri.etsi.org/01903/v1.3.2#}DigestAlgAndValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCSPRefType", propOrder = {
    "ocspIdentifier",
    "digestAlgAndValue"
})
public class OCSPRefType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "OCSPIdentifier", required = true)
    protected OCSPIdentifierType ocspIdentifier;
    @XmlElement(name = "DigestAlgAndValue")
    protected DigestAlgAndValueType digestAlgAndValue;

    /**
     * Recupera il valore della proprietà ocspIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link OCSPIdentifierType }
     *     
     */
    public OCSPIdentifierType getOCSPIdentifier() {
        return ocspIdentifier;
    }

    /**
     * Imposta il valore della proprietà ocspIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link OCSPIdentifierType }
     *     
     */
    public void setOCSPIdentifier(OCSPIdentifierType value) {
        this.ocspIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà digestAlgAndValue.
     * 
     * @return
     *     possible object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public DigestAlgAndValueType getDigestAlgAndValue() {
        return digestAlgAndValue;
    }

    /**
     * Imposta il valore della proprietà digestAlgAndValue.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public void setDigestAlgAndValue(DigestAlgAndValueType value) {
        this.digestAlgAndValue = value;
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
            OCSPIdentifierType theOCSPIdentifier;
            theOCSPIdentifier = this.getOCSPIdentifier();
            strategy.appendField(locator, this, "ocspIdentifier", buffer, theOCSPIdentifier, (this.ocspIdentifier!= null));
        }
        {
            DigestAlgAndValueType theDigestAlgAndValue;
            theDigestAlgAndValue = this.getDigestAlgAndValue();
            strategy.appendField(locator, this, "digestAlgAndValue", buffer, theDigestAlgAndValue, (this.digestAlgAndValue!= null));
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
        final OCSPRefType that = ((OCSPRefType) object);
        {
            OCSPIdentifierType lhsOCSPIdentifier;
            lhsOCSPIdentifier = this.getOCSPIdentifier();
            OCSPIdentifierType rhsOCSPIdentifier;
            rhsOCSPIdentifier = that.getOCSPIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ocspIdentifier", lhsOCSPIdentifier), LocatorUtils.property(thatLocator, "ocspIdentifier", rhsOCSPIdentifier), lhsOCSPIdentifier, rhsOCSPIdentifier, (this.ocspIdentifier!= null), (that.ocspIdentifier!= null))) {
                return false;
            }
        }
        {
            DigestAlgAndValueType lhsDigestAlgAndValue;
            lhsDigestAlgAndValue = this.getDigestAlgAndValue();
            DigestAlgAndValueType rhsDigestAlgAndValue;
            rhsDigestAlgAndValue = that.getDigestAlgAndValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "digestAlgAndValue", lhsDigestAlgAndValue), LocatorUtils.property(thatLocator, "digestAlgAndValue", rhsDigestAlgAndValue), lhsDigestAlgAndValue, rhsDigestAlgAndValue, (this.digestAlgAndValue!= null), (that.digestAlgAndValue!= null))) {
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
            OCSPIdentifierType theOCSPIdentifier;
            theOCSPIdentifier = this.getOCSPIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ocspIdentifier", theOCSPIdentifier), currentHashCode, theOCSPIdentifier, (this.ocspIdentifier!= null));
        }
        {
            DigestAlgAndValueType theDigestAlgAndValue;
            theDigestAlgAndValue = this.getDigestAlgAndValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "digestAlgAndValue", theDigestAlgAndValue), currentHashCode, theDigestAlgAndValue, (this.digestAlgAndValue!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
