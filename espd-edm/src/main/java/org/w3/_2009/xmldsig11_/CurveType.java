//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.w3._2009.xmldsig11_;

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
 * <p>Classe Java per CurveType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CurveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="A" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *         &lt;element name="B" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveType", propOrder = {
    "a",
    "b"
})
public class CurveType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "A", required = true)
    protected byte[] a;
    @XmlElement(name = "B", required = true)
    protected byte[] b;

    /**
     * Recupera il valore della proprietà a.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getA() {
        return a;
    }

    /**
     * Imposta il valore della proprietà a.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setA(byte[] value) {
        this.a = value;
    }

    /**
     * Recupera il valore della proprietà b.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getB() {
        return b;
    }

    /**
     * Imposta il valore della proprietà b.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setB(byte[] value) {
        this.b = value;
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
            byte[] theA;
            theA = this.getA();
            strategy.appendField(locator, this, "a", buffer, theA, (this.a!= null));
        }
        {
            byte[] theB;
            theB = this.getB();
            strategy.appendField(locator, this, "b", buffer, theB, (this.b!= null));
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
        final CurveType that = ((CurveType) object);
        {
            byte[] lhsA;
            lhsA = this.getA();
            byte[] rhsA;
            rhsA = that.getA();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "a", lhsA), LocatorUtils.property(thatLocator, "a", rhsA), lhsA, rhsA, (this.a!= null), (that.a!= null))) {
                return false;
            }
        }
        {
            byte[] lhsB;
            lhsB = this.getB();
            byte[] rhsB;
            rhsB = that.getB();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "b", lhsB), LocatorUtils.property(thatLocator, "b", rhsB), lhsB, rhsB, (this.b!= null), (that.b!= null))) {
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
            byte[] theA;
            theA = this.getA();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "a", theA), currentHashCode, theA, (this.a!= null));
        }
        {
            byte[] theB;
            theB = this.getB();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "b", theB), currentHashCode, theB, (this.b!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
