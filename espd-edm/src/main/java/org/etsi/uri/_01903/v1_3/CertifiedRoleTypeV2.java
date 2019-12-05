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
 * <p>Classe Java per CertifiedRoleTypeV2 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CertifiedRoleTypeV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}X509AttributeCertificate"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}OtherAttributeCertificate"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertifiedRoleTypeV2", propOrder = {
    "x509AttributeCertificate",
    "otherAttributeCertificate"
})
public class CertifiedRoleTypeV2 implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "X509AttributeCertificate")
    protected EncapsulatedPKIDataType x509AttributeCertificate;
    @XmlElement(name = "OtherAttributeCertificate")
    protected AnyType otherAttributeCertificate;

    /**
     * Recupera il valore della proprietà x509AttributeCertificate.
     * 
     * @return
     *     possible object is
     *     {@link EncapsulatedPKIDataType }
     *     
     */
    public EncapsulatedPKIDataType getX509AttributeCertificate() {
        return x509AttributeCertificate;
    }

    /**
     * Imposta il valore della proprietà x509AttributeCertificate.
     * 
     * @param value
     *     allowed object is
     *     {@link EncapsulatedPKIDataType }
     *     
     */
    public void setX509AttributeCertificate(EncapsulatedPKIDataType value) {
        this.x509AttributeCertificate = value;
    }

    /**
     * Recupera il valore della proprietà otherAttributeCertificate.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getOtherAttributeCertificate() {
        return otherAttributeCertificate;
    }

    /**
     * Imposta il valore della proprietà otherAttributeCertificate.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setOtherAttributeCertificate(AnyType value) {
        this.otherAttributeCertificate = value;
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
            EncapsulatedPKIDataType theX509AttributeCertificate;
            theX509AttributeCertificate = this.getX509AttributeCertificate();
            strategy.appendField(locator, this, "x509AttributeCertificate", buffer, theX509AttributeCertificate, (this.x509AttributeCertificate!= null));
        }
        {
            AnyType theOtherAttributeCertificate;
            theOtherAttributeCertificate = this.getOtherAttributeCertificate();
            strategy.appendField(locator, this, "otherAttributeCertificate", buffer, theOtherAttributeCertificate, (this.otherAttributeCertificate!= null));
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
        final CertifiedRoleTypeV2 that = ((CertifiedRoleTypeV2) object);
        {
            EncapsulatedPKIDataType lhsX509AttributeCertificate;
            lhsX509AttributeCertificate = this.getX509AttributeCertificate();
            EncapsulatedPKIDataType rhsX509AttributeCertificate;
            rhsX509AttributeCertificate = that.getX509AttributeCertificate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "x509AttributeCertificate", lhsX509AttributeCertificate), LocatorUtils.property(thatLocator, "x509AttributeCertificate", rhsX509AttributeCertificate), lhsX509AttributeCertificate, rhsX509AttributeCertificate, (this.x509AttributeCertificate!= null), (that.x509AttributeCertificate!= null))) {
                return false;
            }
        }
        {
            AnyType lhsOtherAttributeCertificate;
            lhsOtherAttributeCertificate = this.getOtherAttributeCertificate();
            AnyType rhsOtherAttributeCertificate;
            rhsOtherAttributeCertificate = that.getOtherAttributeCertificate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherAttributeCertificate", lhsOtherAttributeCertificate), LocatorUtils.property(thatLocator, "otherAttributeCertificate", rhsOtherAttributeCertificate), lhsOtherAttributeCertificate, rhsOtherAttributeCertificate, (this.otherAttributeCertificate!= null), (that.otherAttributeCertificate!= null))) {
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
            EncapsulatedPKIDataType theX509AttributeCertificate;
            theX509AttributeCertificate = this.getX509AttributeCertificate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "x509AttributeCertificate", theX509AttributeCertificate), currentHashCode, theX509AttributeCertificate, (this.x509AttributeCertificate!= null));
        }
        {
            AnyType theOtherAttributeCertificate;
            theOtherAttributeCertificate = this.getOtherAttributeCertificate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherAttributeCertificate", theOtherAttributeCertificate), currentHashCode, theOtherAttributeCertificate, (this.otherAttributeCertificate!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
