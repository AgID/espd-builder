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
 * <p>Classe Java per DSAKeyValueType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DSAKeyValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="P" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *           &lt;element name="Q" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="G" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary" minOccurs="0"/&gt;
 *         &lt;element name="Y" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *         &lt;element name="J" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Seed" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *           &lt;element name="PgenCounter" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSAKeyValueType", propOrder = {
    "p",
    "q",
    "g",
    "y",
    "j",
    "seed",
    "pgenCounter"
})
public class DSAKeyValueType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "P")
    protected byte[] p;
    @XmlElement(name = "Q")
    protected byte[] q;
    @XmlElement(name = "G")
    protected byte[] g;
    @XmlElement(name = "Y", required = true)
    protected byte[] y;
    @XmlElement(name = "J")
    protected byte[] j;
    @XmlElement(name = "Seed")
    protected byte[] seed;
    @XmlElement(name = "PgenCounter")
    protected byte[] pgenCounter;

    /**
     * Recupera il valore della proprietà p.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getP() {
        return p;
    }

    /**
     * Imposta il valore della proprietà p.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setP(byte[] value) {
        this.p = value;
    }

    /**
     * Recupera il valore della proprietà q.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getQ() {
        return q;
    }

    /**
     * Imposta il valore della proprietà q.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setQ(byte[] value) {
        this.q = value;
    }

    /**
     * Recupera il valore della proprietà g.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getG() {
        return g;
    }

    /**
     * Imposta il valore della proprietà g.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setG(byte[] value) {
        this.g = value;
    }

    /**
     * Recupera il valore della proprietà y.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getY() {
        return y;
    }

    /**
     * Imposta il valore della proprietà y.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setY(byte[] value) {
        this.y = value;
    }

    /**
     * Recupera il valore della proprietà j.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getJ() {
        return j;
    }

    /**
     * Imposta il valore della proprietà j.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setJ(byte[] value) {
        this.j = value;
    }

    /**
     * Recupera il valore della proprietà seed.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSeed() {
        return seed;
    }

    /**
     * Imposta il valore della proprietà seed.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSeed(byte[] value) {
        this.seed = value;
    }

    /**
     * Recupera il valore della proprietà pgenCounter.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPgenCounter() {
        return pgenCounter;
    }

    /**
     * Imposta il valore della proprietà pgenCounter.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPgenCounter(byte[] value) {
        this.pgenCounter = value;
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
            byte[] theP;
            theP = this.getP();
            strategy.appendField(locator, this, "p", buffer, theP, (this.p!= null));
        }
        {
            byte[] theQ;
            theQ = this.getQ();
            strategy.appendField(locator, this, "q", buffer, theQ, (this.q!= null));
        }
        {
            byte[] theG;
            theG = this.getG();
            strategy.appendField(locator, this, "g", buffer, theG, (this.g!= null));
        }
        {
            byte[] theY;
            theY = this.getY();
            strategy.appendField(locator, this, "y", buffer, theY, (this.y!= null));
        }
        {
            byte[] theJ;
            theJ = this.getJ();
            strategy.appendField(locator, this, "j", buffer, theJ, (this.j!= null));
        }
        {
            byte[] theSeed;
            theSeed = this.getSeed();
            strategy.appendField(locator, this, "seed", buffer, theSeed, (this.seed!= null));
        }
        {
            byte[] thePgenCounter;
            thePgenCounter = this.getPgenCounter();
            strategy.appendField(locator, this, "pgenCounter", buffer, thePgenCounter, (this.pgenCounter!= null));
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
        final DSAKeyValueType that = ((DSAKeyValueType) object);
        {
            byte[] lhsP;
            lhsP = this.getP();
            byte[] rhsP;
            rhsP = that.getP();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "p", lhsP), LocatorUtils.property(thatLocator, "p", rhsP), lhsP, rhsP, (this.p!= null), (that.p!= null))) {
                return false;
            }
        }
        {
            byte[] lhsQ;
            lhsQ = this.getQ();
            byte[] rhsQ;
            rhsQ = that.getQ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "q", lhsQ), LocatorUtils.property(thatLocator, "q", rhsQ), lhsQ, rhsQ, (this.q!= null), (that.q!= null))) {
                return false;
            }
        }
        {
            byte[] lhsG;
            lhsG = this.getG();
            byte[] rhsG;
            rhsG = that.getG();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "g", lhsG), LocatorUtils.property(thatLocator, "g", rhsG), lhsG, rhsG, (this.g!= null), (that.g!= null))) {
                return false;
            }
        }
        {
            byte[] lhsY;
            lhsY = this.getY();
            byte[] rhsY;
            rhsY = that.getY();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "y", lhsY), LocatorUtils.property(thatLocator, "y", rhsY), lhsY, rhsY, (this.y!= null), (that.y!= null))) {
                return false;
            }
        }
        {
            byte[] lhsJ;
            lhsJ = this.getJ();
            byte[] rhsJ;
            rhsJ = that.getJ();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "j", lhsJ), LocatorUtils.property(thatLocator, "j", rhsJ), lhsJ, rhsJ, (this.j!= null), (that.j!= null))) {
                return false;
            }
        }
        {
            byte[] lhsSeed;
            lhsSeed = this.getSeed();
            byte[] rhsSeed;
            rhsSeed = that.getSeed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seed", lhsSeed), LocatorUtils.property(thatLocator, "seed", rhsSeed), lhsSeed, rhsSeed, (this.seed!= null), (that.seed!= null))) {
                return false;
            }
        }
        {
            byte[] lhsPgenCounter;
            lhsPgenCounter = this.getPgenCounter();
            byte[] rhsPgenCounter;
            rhsPgenCounter = that.getPgenCounter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pgenCounter", lhsPgenCounter), LocatorUtils.property(thatLocator, "pgenCounter", rhsPgenCounter), lhsPgenCounter, rhsPgenCounter, (this.pgenCounter!= null), (that.pgenCounter!= null))) {
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
            byte[] theP;
            theP = this.getP();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "p", theP), currentHashCode, theP, (this.p!= null));
        }
        {
            byte[] theQ;
            theQ = this.getQ();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "q", theQ), currentHashCode, theQ, (this.q!= null));
        }
        {
            byte[] theG;
            theG = this.getG();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "g", theG), currentHashCode, theG, (this.g!= null));
        }
        {
            byte[] theY;
            theY = this.getY();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "y", theY), currentHashCode, theY, (this.y!= null));
        }
        {
            byte[] theJ;
            theJ = this.getJ();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "j", theJ), currentHashCode, theJ, (this.j!= null));
        }
        {
            byte[] theSeed;
            theSeed = this.getSeed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seed", theSeed), currentHashCode, theSeed, (this.seed!= null));
        }
        {
            byte[] thePgenCounter;
            thePgenCounter = this.getPgenCounter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pgenCounter", thePgenCounter), currentHashCode, thePgenCounter, (this.pgenCounter!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
