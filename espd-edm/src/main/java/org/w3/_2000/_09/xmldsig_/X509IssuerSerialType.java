//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.w3._2000._09.xmldsig_;

import java.io.Serializable;
import java.math.BigInteger;
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
 * <p>Classe Java per X509IssuerSerialType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="X509IssuerSerialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="X509IssuerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="X509SerialNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X509IssuerSerialType", propOrder = {
    "x509IssuerName",
    "x509SerialNumber"
})
public class X509IssuerSerialType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "X509IssuerName", required = true)
    protected String x509IssuerName;
    @XmlElement(name = "X509SerialNumber", required = true)
    protected BigInteger x509SerialNumber;

    /**
     * Recupera il valore della proprietà x509IssuerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX509IssuerName() {
        return x509IssuerName;
    }

    /**
     * Imposta il valore della proprietà x509IssuerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX509IssuerName(String value) {
        this.x509IssuerName = value;
    }

    /**
     * Recupera il valore della proprietà x509SerialNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getX509SerialNumber() {
        return x509SerialNumber;
    }

    /**
     * Imposta il valore della proprietà x509SerialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setX509SerialNumber(BigInteger value) {
        this.x509SerialNumber = value;
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
            String theX509IssuerName;
            theX509IssuerName = this.getX509IssuerName();
            strategy.appendField(locator, this, "x509IssuerName", buffer, theX509IssuerName, (this.x509IssuerName!= null));
        }
        {
            BigInteger theX509SerialNumber;
            theX509SerialNumber = this.getX509SerialNumber();
            strategy.appendField(locator, this, "x509SerialNumber", buffer, theX509SerialNumber, (this.x509SerialNumber!= null));
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
        final X509IssuerSerialType that = ((X509IssuerSerialType) object);
        {
            String lhsX509IssuerName;
            lhsX509IssuerName = this.getX509IssuerName();
            String rhsX509IssuerName;
            rhsX509IssuerName = that.getX509IssuerName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "x509IssuerName", lhsX509IssuerName), LocatorUtils.property(thatLocator, "x509IssuerName", rhsX509IssuerName), lhsX509IssuerName, rhsX509IssuerName, (this.x509IssuerName!= null), (that.x509IssuerName!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsX509SerialNumber;
            lhsX509SerialNumber = this.getX509SerialNumber();
            BigInteger rhsX509SerialNumber;
            rhsX509SerialNumber = that.getX509SerialNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "x509SerialNumber", lhsX509SerialNumber), LocatorUtils.property(thatLocator, "x509SerialNumber", rhsX509SerialNumber), lhsX509SerialNumber, rhsX509SerialNumber, (this.x509SerialNumber!= null), (that.x509SerialNumber!= null))) {
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
            String theX509IssuerName;
            theX509IssuerName = this.getX509IssuerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "x509IssuerName", theX509IssuerName), currentHashCode, theX509IssuerName, (this.x509IssuerName!= null));
        }
        {
            BigInteger theX509SerialNumber;
            theX509SerialNumber = this.getX509SerialNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "x509SerialNumber", theX509SerialNumber), currentHashCode, theX509SerialNumber, (this.x509SerialNumber!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
