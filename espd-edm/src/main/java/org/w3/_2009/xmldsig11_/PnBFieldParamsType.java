//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.w3._2009.xmldsig11_;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Classe Java per PnBFieldParamsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PnBFieldParamsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2009/xmldsig11#}CharTwoFieldParamsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="K1" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="K2" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="K3" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnBFieldParamsType", propOrder = {
    "k1",
    "k2",
    "k3"
})
public class PnBFieldParamsType
    extends CharTwoFieldParamsType
    implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "K1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger k1;
    @XmlElement(name = "K2", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger k2;
    @XmlElement(name = "K3", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger k3;

    /**
     * Recupera il valore della proprietà k1.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getK1() {
        return k1;
    }

    /**
     * Imposta il valore della proprietà k1.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setK1(BigInteger value) {
        this.k1 = value;
    }

    /**
     * Recupera il valore della proprietà k2.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getK2() {
        return k2;
    }

    /**
     * Imposta il valore della proprietà k2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setK2(BigInteger value) {
        this.k2 = value;
    }

    /**
     * Recupera il valore della proprietà k3.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getK3() {
        return k3;
    }

    /**
     * Imposta il valore della proprietà k3.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setK3(BigInteger value) {
        this.k3 = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            BigInteger theK1;
            theK1 = this.getK1();
            strategy.appendField(locator, this, "k1", buffer, theK1, (this.k1 != null));
        }
        {
            BigInteger theK2;
            theK2 = this.getK2();
            strategy.appendField(locator, this, "k2", buffer, theK2, (this.k2 != null));
        }
        {
            BigInteger theK3;
            theK3 = this.getK3();
            strategy.appendField(locator, this, "k3", buffer, theK3, (this.k3 != null));
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
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PnBFieldParamsType that = ((PnBFieldParamsType) object);
        {
            BigInteger lhsK1;
            lhsK1 = this.getK1();
            BigInteger rhsK1;
            rhsK1 = that.getK1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "k1", lhsK1), LocatorUtils.property(thatLocator, "k1", rhsK1), lhsK1, rhsK1, (this.k1 != null), (that.k1 != null))) {
                return false;
            }
        }
        {
            BigInteger lhsK2;
            lhsK2 = this.getK2();
            BigInteger rhsK2;
            rhsK2 = that.getK2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "k2", lhsK2), LocatorUtils.property(thatLocator, "k2", rhsK2), lhsK2, rhsK2, (this.k2 != null), (that.k2 != null))) {
                return false;
            }
        }
        {
            BigInteger lhsK3;
            lhsK3 = this.getK3();
            BigInteger rhsK3;
            rhsK3 = that.getK3();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "k3", lhsK3), LocatorUtils.property(thatLocator, "k3", rhsK3), lhsK3, rhsK3, (this.k3 != null), (that.k3 != null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            BigInteger theK1;
            theK1 = this.getK1();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "k1", theK1), currentHashCode, theK1, (this.k1 != null));
        }
        {
            BigInteger theK2;
            theK2 = this.getK2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "k2", theK2), currentHashCode, theK2, (this.k2 != null));
        }
        {
            BigInteger theK3;
            theK3 = this.getK3();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "k3", theK3), currentHashCode, theK3, (this.k3 != null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
