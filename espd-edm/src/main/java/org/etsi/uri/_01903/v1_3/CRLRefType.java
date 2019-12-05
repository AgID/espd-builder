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
 * <p>Classe Java per CRLRefType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CRLRefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DigestAlgAndValue" type="{http://uri.etsi.org/01903/v1.3.2#}DigestAlgAndValueType"/&gt;
 *         &lt;element name="CRLIdentifier" type="{http://uri.etsi.org/01903/v1.3.2#}CRLIdentifierType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRLRefType", propOrder = {
    "digestAlgAndValue",
    "crlIdentifier"
})
public class CRLRefType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "DigestAlgAndValue", required = true)
    protected DigestAlgAndValueType digestAlgAndValue;
    @XmlElement(name = "CRLIdentifier")
    protected CRLIdentifierType crlIdentifier;

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

    /**
     * Recupera il valore della proprietà crlIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link CRLIdentifierType }
     *     
     */
    public CRLIdentifierType getCRLIdentifier() {
        return crlIdentifier;
    }

    /**
     * Imposta il valore della proprietà crlIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link CRLIdentifierType }
     *     
     */
    public void setCRLIdentifier(CRLIdentifierType value) {
        this.crlIdentifier = value;
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
            DigestAlgAndValueType theDigestAlgAndValue;
            theDigestAlgAndValue = this.getDigestAlgAndValue();
            strategy.appendField(locator, this, "digestAlgAndValue", buffer, theDigestAlgAndValue, (this.digestAlgAndValue!= null));
        }
        {
            CRLIdentifierType theCRLIdentifier;
            theCRLIdentifier = this.getCRLIdentifier();
            strategy.appendField(locator, this, "crlIdentifier", buffer, theCRLIdentifier, (this.crlIdentifier!= null));
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
        final CRLRefType that = ((CRLRefType) object);
        {
            DigestAlgAndValueType lhsDigestAlgAndValue;
            lhsDigestAlgAndValue = this.getDigestAlgAndValue();
            DigestAlgAndValueType rhsDigestAlgAndValue;
            rhsDigestAlgAndValue = that.getDigestAlgAndValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "digestAlgAndValue", lhsDigestAlgAndValue), LocatorUtils.property(thatLocator, "digestAlgAndValue", rhsDigestAlgAndValue), lhsDigestAlgAndValue, rhsDigestAlgAndValue, (this.digestAlgAndValue!= null), (that.digestAlgAndValue!= null))) {
                return false;
            }
        }
        {
            CRLIdentifierType lhsCRLIdentifier;
            lhsCRLIdentifier = this.getCRLIdentifier();
            CRLIdentifierType rhsCRLIdentifier;
            rhsCRLIdentifier = that.getCRLIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "crlIdentifier", lhsCRLIdentifier), LocatorUtils.property(thatLocator, "crlIdentifier", rhsCRLIdentifier), lhsCRLIdentifier, rhsCRLIdentifier, (this.crlIdentifier!= null), (that.crlIdentifier!= null))) {
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
            DigestAlgAndValueType theDigestAlgAndValue;
            theDigestAlgAndValue = this.getDigestAlgAndValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "digestAlgAndValue", theDigestAlgAndValue), currentHashCode, theDigestAlgAndValue, (this.digestAlgAndValue!= null));
        }
        {
            CRLIdentifierType theCRLIdentifier;
            theCRLIdentifier = this.getCRLIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "crlIdentifier", theCRLIdentifier), currentHashCode, theCRLIdentifier, (this.crlIdentifier!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
