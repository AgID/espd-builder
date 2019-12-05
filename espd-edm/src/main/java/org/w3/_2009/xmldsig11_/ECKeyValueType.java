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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * <p>Classe Java per ECKeyValueType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ECKeyValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ECParameters" type="{http://www.w3.org/2009/xmldsig11#}ECParametersType"/&gt;
 *           &lt;element name="NamedCurve" type="{http://www.w3.org/2009/xmldsig11#}NamedCurveType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="PublicKey" type="{http://www.w3.org/2009/xmldsig11#}ECPointType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECKeyValueType", propOrder = {
    "ecParameters",
    "namedCurve",
    "publicKey"
})
public class ECKeyValueType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ECParameters")
    protected ECParametersType ecParameters;
    @XmlElement(name = "NamedCurve")
    protected NamedCurveType namedCurve;
    @XmlElement(name = "PublicKey", required = true)
    protected byte[] publicKey;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Recupera il valore della proprietà ecParameters.
     * 
     * @return
     *     possible object is
     *     {@link ECParametersType }
     *     
     */
    public ECParametersType getECParameters() {
        return ecParameters;
    }

    /**
     * Imposta il valore della proprietà ecParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link ECParametersType }
     *     
     */
    public void setECParameters(ECParametersType value) {
        this.ecParameters = value;
    }

    /**
     * Recupera il valore della proprietà namedCurve.
     * 
     * @return
     *     possible object is
     *     {@link NamedCurveType }
     *     
     */
    public NamedCurveType getNamedCurve() {
        return namedCurve;
    }

    /**
     * Imposta il valore della proprietà namedCurve.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedCurveType }
     *     
     */
    public void setNamedCurve(NamedCurveType value) {
        this.namedCurve = value;
    }

    /**
     * Recupera il valore della proprietà publicKey.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPublicKey() {
        return publicKey;
    }

    /**
     * Imposta il valore della proprietà publicKey.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPublicKey(byte[] value) {
        this.publicKey = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
            ECParametersType theECParameters;
            theECParameters = this.getECParameters();
            strategy.appendField(locator, this, "ecParameters", buffer, theECParameters, (this.ecParameters!= null));
        }
        {
            NamedCurveType theNamedCurve;
            theNamedCurve = this.getNamedCurve();
            strategy.appendField(locator, this, "namedCurve", buffer, theNamedCurve, (this.namedCurve!= null));
        }
        {
            byte[] thePublicKey;
            thePublicKey = this.getPublicKey();
            strategy.appendField(locator, this, "publicKey", buffer, thePublicKey, (this.publicKey!= null));
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
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
        final ECKeyValueType that = ((ECKeyValueType) object);
        {
            ECParametersType lhsECParameters;
            lhsECParameters = this.getECParameters();
            ECParametersType rhsECParameters;
            rhsECParameters = that.getECParameters();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ecParameters", lhsECParameters), LocatorUtils.property(thatLocator, "ecParameters", rhsECParameters), lhsECParameters, rhsECParameters, (this.ecParameters!= null), (that.ecParameters!= null))) {
                return false;
            }
        }
        {
            NamedCurveType lhsNamedCurve;
            lhsNamedCurve = this.getNamedCurve();
            NamedCurveType rhsNamedCurve;
            rhsNamedCurve = that.getNamedCurve();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namedCurve", lhsNamedCurve), LocatorUtils.property(thatLocator, "namedCurve", rhsNamedCurve), lhsNamedCurve, rhsNamedCurve, (this.namedCurve!= null), (that.namedCurve!= null))) {
                return false;
            }
        }
        {
            byte[] lhsPublicKey;
            lhsPublicKey = this.getPublicKey();
            byte[] rhsPublicKey;
            rhsPublicKey = that.getPublicKey();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publicKey", lhsPublicKey), LocatorUtils.property(thatLocator, "publicKey", rhsPublicKey), lhsPublicKey, rhsPublicKey, (this.publicKey!= null), (that.publicKey!= null))) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
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
            ECParametersType theECParameters;
            theECParameters = this.getECParameters();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ecParameters", theECParameters), currentHashCode, theECParameters, (this.ecParameters!= null));
        }
        {
            NamedCurveType theNamedCurve;
            theNamedCurve = this.getNamedCurve();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namedCurve", theNamedCurve), currentHashCode, theNamedCurve, (this.namedCurve!= null));
        }
        {
            byte[] thePublicKey;
            thePublicKey = this.getPublicKey();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "publicKey", thePublicKey), currentHashCode, thePublicKey, (this.publicKey!= null));
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId, (this.id!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
