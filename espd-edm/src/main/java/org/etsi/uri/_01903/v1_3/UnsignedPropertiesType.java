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
 * <p>Classe Java per UnsignedPropertiesType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UnsignedPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}UnsignedSignatureProperties" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}UnsignedDataObjectProperties" minOccurs="0"/&gt;
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
@XmlType(name = "UnsignedPropertiesType", propOrder = {
    "unsignedSignatureProperties",
    "unsignedDataObjectProperties"
})
public class UnsignedPropertiesType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "UnsignedSignatureProperties")
    protected UnsignedSignaturePropertiesType unsignedSignatureProperties;
    @XmlElement(name = "UnsignedDataObjectProperties")
    protected UnsignedDataObjectPropertiesType unsignedDataObjectProperties;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Recupera il valore della proprietà unsignedSignatureProperties.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedSignaturePropertiesType }
     *     
     */
    public UnsignedSignaturePropertiesType getUnsignedSignatureProperties() {
        return unsignedSignatureProperties;
    }

    /**
     * Imposta il valore della proprietà unsignedSignatureProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedSignaturePropertiesType }
     *     
     */
    public void setUnsignedSignatureProperties(UnsignedSignaturePropertiesType value) {
        this.unsignedSignatureProperties = value;
    }

    /**
     * Recupera il valore della proprietà unsignedDataObjectProperties.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedDataObjectPropertiesType }
     *     
     */
    public UnsignedDataObjectPropertiesType getUnsignedDataObjectProperties() {
        return unsignedDataObjectProperties;
    }

    /**
     * Imposta il valore della proprietà unsignedDataObjectProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedDataObjectPropertiesType }
     *     
     */
    public void setUnsignedDataObjectProperties(UnsignedDataObjectPropertiesType value) {
        this.unsignedDataObjectProperties = value;
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
            UnsignedSignaturePropertiesType theUnsignedSignatureProperties;
            theUnsignedSignatureProperties = this.getUnsignedSignatureProperties();
            strategy.appendField(locator, this, "unsignedSignatureProperties", buffer, theUnsignedSignatureProperties, (this.unsignedSignatureProperties!= null));
        }
        {
            UnsignedDataObjectPropertiesType theUnsignedDataObjectProperties;
            theUnsignedDataObjectProperties = this.getUnsignedDataObjectProperties();
            strategy.appendField(locator, this, "unsignedDataObjectProperties", buffer, theUnsignedDataObjectProperties, (this.unsignedDataObjectProperties!= null));
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
        final UnsignedPropertiesType that = ((UnsignedPropertiesType) object);
        {
            UnsignedSignaturePropertiesType lhsUnsignedSignatureProperties;
            lhsUnsignedSignatureProperties = this.getUnsignedSignatureProperties();
            UnsignedSignaturePropertiesType rhsUnsignedSignatureProperties;
            rhsUnsignedSignatureProperties = that.getUnsignedSignatureProperties();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unsignedSignatureProperties", lhsUnsignedSignatureProperties), LocatorUtils.property(thatLocator, "unsignedSignatureProperties", rhsUnsignedSignatureProperties), lhsUnsignedSignatureProperties, rhsUnsignedSignatureProperties, (this.unsignedSignatureProperties!= null), (that.unsignedSignatureProperties!= null))) {
                return false;
            }
        }
        {
            UnsignedDataObjectPropertiesType lhsUnsignedDataObjectProperties;
            lhsUnsignedDataObjectProperties = this.getUnsignedDataObjectProperties();
            UnsignedDataObjectPropertiesType rhsUnsignedDataObjectProperties;
            rhsUnsignedDataObjectProperties = that.getUnsignedDataObjectProperties();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unsignedDataObjectProperties", lhsUnsignedDataObjectProperties), LocatorUtils.property(thatLocator, "unsignedDataObjectProperties", rhsUnsignedDataObjectProperties), lhsUnsignedDataObjectProperties, rhsUnsignedDataObjectProperties, (this.unsignedDataObjectProperties!= null), (that.unsignedDataObjectProperties!= null))) {
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
            UnsignedSignaturePropertiesType theUnsignedSignatureProperties;
            theUnsignedSignatureProperties = this.getUnsignedSignatureProperties();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unsignedSignatureProperties", theUnsignedSignatureProperties), currentHashCode, theUnsignedSignatureProperties, (this.unsignedSignatureProperties!= null));
        }
        {
            UnsignedDataObjectPropertiesType theUnsignedDataObjectProperties;
            theUnsignedDataObjectProperties = this.getUnsignedDataObjectProperties();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unsignedDataObjectProperties", theUnsignedDataObjectProperties), currentHashCode, theUnsignedDataObjectProperties, (this.unsignedDataObjectProperties!= null));
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
