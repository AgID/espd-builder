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
 * <p>Classe Java per QualifyingPropertiesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="QualifyingPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignedProperties" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}UnsignedProperties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Target" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifyingPropertiesType", propOrder = {
    "signedProperties",
    "unsignedProperties"
})
public class QualifyingPropertiesType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SignedProperties")
    protected SignedPropertiesType signedProperties;
    @XmlElement(name = "UnsignedProperties")
    protected UnsignedPropertiesType unsignedProperties;
    @XmlAttribute(name = "Target", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String target;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Recupera il valore della proprietà signedProperties.
     * 
     * @return
     *     possible object is
     *     {@link SignedPropertiesType }
     *     
     */
    public SignedPropertiesType getSignedProperties() {
        return signedProperties;
    }

    /**
     * Imposta il valore della proprietà signedProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedPropertiesType }
     *     
     */
    public void setSignedProperties(SignedPropertiesType value) {
        this.signedProperties = value;
    }

    /**
     * Recupera il valore della proprietà unsignedProperties.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedPropertiesType }
     *     
     */
    public UnsignedPropertiesType getUnsignedProperties() {
        return unsignedProperties;
    }

    /**
     * Imposta il valore della proprietà unsignedProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedPropertiesType }
     *     
     */
    public void setUnsignedProperties(UnsignedPropertiesType value) {
        this.unsignedProperties = value;
    }

    /**
     * Recupera il valore della proprietà target.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Imposta il valore della proprietà target.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
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
            SignedPropertiesType theSignedProperties;
            theSignedProperties = this.getSignedProperties();
            strategy.appendField(locator, this, "signedProperties", buffer, theSignedProperties, (this.signedProperties!= null));
        }
        {
            UnsignedPropertiesType theUnsignedProperties;
            theUnsignedProperties = this.getUnsignedProperties();
            strategy.appendField(locator, this, "unsignedProperties", buffer, theUnsignedProperties, (this.unsignedProperties!= null));
        }
        {
            String theTarget;
            theTarget = this.getTarget();
            strategy.appendField(locator, this, "target", buffer, theTarget, (this.target!= null));
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
        final QualifyingPropertiesType that = ((QualifyingPropertiesType) object);
        {
            SignedPropertiesType lhsSignedProperties;
            lhsSignedProperties = this.getSignedProperties();
            SignedPropertiesType rhsSignedProperties;
            rhsSignedProperties = that.getSignedProperties();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signedProperties", lhsSignedProperties), LocatorUtils.property(thatLocator, "signedProperties", rhsSignedProperties), lhsSignedProperties, rhsSignedProperties, (this.signedProperties!= null), (that.signedProperties!= null))) {
                return false;
            }
        }
        {
            UnsignedPropertiesType lhsUnsignedProperties;
            lhsUnsignedProperties = this.getUnsignedProperties();
            UnsignedPropertiesType rhsUnsignedProperties;
            rhsUnsignedProperties = that.getUnsignedProperties();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unsignedProperties", lhsUnsignedProperties), LocatorUtils.property(thatLocator, "unsignedProperties", rhsUnsignedProperties), lhsUnsignedProperties, rhsUnsignedProperties, (this.unsignedProperties!= null), (that.unsignedProperties!= null))) {
                return false;
            }
        }
        {
            String lhsTarget;
            lhsTarget = this.getTarget();
            String rhsTarget;
            rhsTarget = that.getTarget();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "target", lhsTarget), LocatorUtils.property(thatLocator, "target", rhsTarget), lhsTarget, rhsTarget, (this.target!= null), (that.target!= null))) {
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
            SignedPropertiesType theSignedProperties;
            theSignedProperties = this.getSignedProperties();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signedProperties", theSignedProperties), currentHashCode, theSignedProperties, (this.signedProperties!= null));
        }
        {
            UnsignedPropertiesType theUnsignedProperties;
            theUnsignedProperties = this.getUnsignedProperties();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unsignedProperties", theUnsignedProperties), currentHashCode, theUnsignedProperties, (this.unsignedProperties!= null));
        }
        {
            String theTarget;
            theTarget = this.getTarget();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "target", theTarget), currentHashCode, theTarget, (this.target!= null));
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
