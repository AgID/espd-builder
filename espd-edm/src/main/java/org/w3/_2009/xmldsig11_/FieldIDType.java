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
import javax.xml.bind.annotation.XmlAnyElement;
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
import org.w3c.dom.Element;


/**
 * <p>Classe Java per FieldIDType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FieldIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.w3.org/2009/xmldsig11#}Prime"/&gt;
 *         &lt;element ref="{http://www.w3.org/2009/xmldsig11#}TnB"/&gt;
 *         &lt;element ref="{http://www.w3.org/2009/xmldsig11#}PnB"/&gt;
 *         &lt;element ref="{http://www.w3.org/2009/xmldsig11#}GnB"/&gt;
 *         &lt;any processContents='lax' namespace='##other'/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldIDType", propOrder = {
    "prime",
    "tnB",
    "pnB",
    "gnB",
    "any"
})
public class FieldIDType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Prime")
    protected PrimeFieldParamsType prime;
    @XmlElement(name = "TnB")
    protected TnBFieldParamsType tnB;
    @XmlElement(name = "PnB")
    protected PnBFieldParamsType pnB;
    @XmlElement(name = "GnB")
    protected CharTwoFieldParamsType gnB;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Recupera il valore della proprietà prime.
     * 
     * @return
     *     possible object is
     *     {@link PrimeFieldParamsType }
     *     
     */
    public PrimeFieldParamsType getPrime() {
        return prime;
    }

    /**
     * Imposta il valore della proprietà prime.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeFieldParamsType }
     *     
     */
    public void setPrime(PrimeFieldParamsType value) {
        this.prime = value;
    }

    /**
     * Recupera il valore della proprietà tnB.
     * 
     * @return
     *     possible object is
     *     {@link TnBFieldParamsType }
     *     
     */
    public TnBFieldParamsType getTnB() {
        return tnB;
    }

    /**
     * Imposta il valore della proprietà tnB.
     * 
     * @param value
     *     allowed object is
     *     {@link TnBFieldParamsType }
     *     
     */
    public void setTnB(TnBFieldParamsType value) {
        this.tnB = value;
    }

    /**
     * Recupera il valore della proprietà pnB.
     * 
     * @return
     *     possible object is
     *     {@link PnBFieldParamsType }
     *     
     */
    public PnBFieldParamsType getPnB() {
        return pnB;
    }

    /**
     * Imposta il valore della proprietà pnB.
     * 
     * @param value
     *     allowed object is
     *     {@link PnBFieldParamsType }
     *     
     */
    public void setPnB(PnBFieldParamsType value) {
        this.pnB = value;
    }

    /**
     * Recupera il valore della proprietà gnB.
     * 
     * @return
     *     possible object is
     *     {@link CharTwoFieldParamsType }
     *     
     */
    public CharTwoFieldParamsType getGnB() {
        return gnB;
    }

    /**
     * Imposta il valore della proprietà gnB.
     * 
     * @param value
     *     allowed object is
     *     {@link CharTwoFieldParamsType }
     *     
     */
    public void setGnB(CharTwoFieldParamsType value) {
        this.gnB = value;
    }

    /**
     * Recupera il valore della proprietà any.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Imposta il valore della proprietà any.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
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
            PrimeFieldParamsType thePrime;
            thePrime = this.getPrime();
            strategy.appendField(locator, this, "prime", buffer, thePrime, (this.prime!= null));
        }
        {
            TnBFieldParamsType theTnB;
            theTnB = this.getTnB();
            strategy.appendField(locator, this, "tnB", buffer, theTnB, (this.tnB!= null));
        }
        {
            PnBFieldParamsType thePnB;
            thePnB = this.getPnB();
            strategy.appendField(locator, this, "pnB", buffer, thePnB, (this.pnB!= null));
        }
        {
            CharTwoFieldParamsType theGnB;
            theGnB = this.getGnB();
            strategy.appendField(locator, this, "gnB", buffer, theGnB, (this.gnB!= null));
        }
        {
            Object theAny;
            theAny = this.getAny();
            strategy.appendField(locator, this, "any", buffer, theAny, (this.any!= null));
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
        final FieldIDType that = ((FieldIDType) object);
        {
            PrimeFieldParamsType lhsPrime;
            lhsPrime = this.getPrime();
            PrimeFieldParamsType rhsPrime;
            rhsPrime = that.getPrime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prime", lhsPrime), LocatorUtils.property(thatLocator, "prime", rhsPrime), lhsPrime, rhsPrime, (this.prime!= null), (that.prime!= null))) {
                return false;
            }
        }
        {
            TnBFieldParamsType lhsTnB;
            lhsTnB = this.getTnB();
            TnBFieldParamsType rhsTnB;
            rhsTnB = that.getTnB();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tnB", lhsTnB), LocatorUtils.property(thatLocator, "tnB", rhsTnB), lhsTnB, rhsTnB, (this.tnB!= null), (that.tnB!= null))) {
                return false;
            }
        }
        {
            PnBFieldParamsType lhsPnB;
            lhsPnB = this.getPnB();
            PnBFieldParamsType rhsPnB;
            rhsPnB = that.getPnB();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pnB", lhsPnB), LocatorUtils.property(thatLocator, "pnB", rhsPnB), lhsPnB, rhsPnB, (this.pnB!= null), (that.pnB!= null))) {
                return false;
            }
        }
        {
            CharTwoFieldParamsType lhsGnB;
            lhsGnB = this.getGnB();
            CharTwoFieldParamsType rhsGnB;
            rhsGnB = that.getGnB();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gnB", lhsGnB), LocatorUtils.property(thatLocator, "gnB", rhsGnB), lhsGnB, rhsGnB, (this.gnB!= null), (that.gnB!= null))) {
                return false;
            }
        }
        {
            Object lhsAny;
            lhsAny = this.getAny();
            Object rhsAny;
            rhsAny = that.getAny();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny, (this.any!= null), (that.any!= null))) {
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
            PrimeFieldParamsType thePrime;
            thePrime = this.getPrime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prime", thePrime), currentHashCode, thePrime, (this.prime!= null));
        }
        {
            TnBFieldParamsType theTnB;
            theTnB = this.getTnB();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tnB", theTnB), currentHashCode, theTnB, (this.tnB!= null));
        }
        {
            PnBFieldParamsType thePnB;
            thePnB = this.getPnB();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pnB", thePnB), currentHashCode, thePnB, (this.pnB!= null));
        }
        {
            CharTwoFieldParamsType theGnB;
            theGnB = this.getGnB();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gnB", theGnB), currentHashCode, theGnB, (this.gnB!= null));
        }
        {
            Object theAny;
            theAny = this.getAny();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny, (this.any!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
