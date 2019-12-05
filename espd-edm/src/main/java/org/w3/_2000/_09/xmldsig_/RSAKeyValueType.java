//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.w3._2000._09.xmldsig_;

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
 * <p>Classe Java per RSAKeyValueType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RSAKeyValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Modulus" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *         &lt;element name="Exponent" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSAKeyValueType", propOrder = {
    "modulus",
    "exponent"
})
public class RSAKeyValueType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Modulus", required = true)
    protected byte[] modulus;
    @XmlElement(name = "Exponent", required = true)
    protected byte[] exponent;

    /**
     * Recupera il valore della proprietà modulus.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getModulus() {
        return modulus;
    }

    /**
     * Imposta il valore della proprietà modulus.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setModulus(byte[] value) {
        this.modulus = value;
    }

    /**
     * Recupera il valore della proprietà exponent.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getExponent() {
        return exponent;
    }

    /**
     * Imposta il valore della proprietà exponent.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setExponent(byte[] value) {
        this.exponent = value;
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
            byte[] theModulus;
            theModulus = this.getModulus();
            strategy.appendField(locator, this, "modulus", buffer, theModulus, (this.modulus!= null));
        }
        {
            byte[] theExponent;
            theExponent = this.getExponent();
            strategy.appendField(locator, this, "exponent", buffer, theExponent, (this.exponent!= null));
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
        final RSAKeyValueType that = ((RSAKeyValueType) object);
        {
            byte[] lhsModulus;
            lhsModulus = this.getModulus();
            byte[] rhsModulus;
            rhsModulus = that.getModulus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modulus", lhsModulus), LocatorUtils.property(thatLocator, "modulus", rhsModulus), lhsModulus, rhsModulus, (this.modulus!= null), (that.modulus!= null))) {
                return false;
            }
        }
        {
            byte[] lhsExponent;
            lhsExponent = this.getExponent();
            byte[] rhsExponent;
            rhsExponent = that.getExponent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exponent", lhsExponent), LocatorUtils.property(thatLocator, "exponent", rhsExponent), lhsExponent, rhsExponent, (this.exponent!= null), (that.exponent!= null))) {
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
            byte[] theModulus;
            theModulus = this.getModulus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modulus", theModulus), currentHashCode, theModulus, (this.modulus!= null));
        }
        {
            byte[] theExponent;
            theExponent = this.getExponent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exponent", theExponent), currentHashCode, theExponent, (this.exponent!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
