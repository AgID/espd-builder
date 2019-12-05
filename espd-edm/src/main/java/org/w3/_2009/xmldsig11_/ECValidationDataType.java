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
 * <p>Classe Java per ECValidationDataType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ECValidationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="seed" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="hashAlgorithm" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECValidationDataType", propOrder = {
    "seed"
})
public class ECValidationDataType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(required = true)
    protected byte[] seed;
    @XmlAttribute(name = "hashAlgorithm", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String hashAlgorithm;

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
     * Recupera il valore della proprietà hashAlgorithm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashAlgorithm() {
        return hashAlgorithm;
    }

    /**
     * Imposta il valore della proprietà hashAlgorithm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashAlgorithm(String value) {
        this.hashAlgorithm = value;
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
            byte[] theSeed;
            theSeed = this.getSeed();
            strategy.appendField(locator, this, "seed", buffer, theSeed, (this.seed!= null));
        }
        {
            String theHashAlgorithm;
            theHashAlgorithm = this.getHashAlgorithm();
            strategy.appendField(locator, this, "hashAlgorithm", buffer, theHashAlgorithm, (this.hashAlgorithm!= null));
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
        final ECValidationDataType that = ((ECValidationDataType) object);
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
            String lhsHashAlgorithm;
            lhsHashAlgorithm = this.getHashAlgorithm();
            String rhsHashAlgorithm;
            rhsHashAlgorithm = that.getHashAlgorithm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hashAlgorithm", lhsHashAlgorithm), LocatorUtils.property(thatLocator, "hashAlgorithm", rhsHashAlgorithm), lhsHashAlgorithm, rhsHashAlgorithm, (this.hashAlgorithm!= null), (that.hashAlgorithm!= null))) {
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
            byte[] theSeed;
            theSeed = this.getSeed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seed", theSeed), currentHashCode, theSeed, (this.seed!= null));
        }
        {
            String theHashAlgorithm;
            theHashAlgorithm = this.getHashAlgorithm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hashAlgorithm", theHashAlgorithm), currentHashCode, theHashAlgorithm, (this.hashAlgorithm!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
