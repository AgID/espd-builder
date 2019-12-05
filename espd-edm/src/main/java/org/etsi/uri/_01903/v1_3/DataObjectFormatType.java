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
 * <p>Classe Java per DataObjectFormatType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DataObjectFormatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ObjectIdentifier" type="{http://uri.etsi.org/01903/v1.3.2#}ObjectIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="MimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Encoding" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ObjectReference" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataObjectFormatType", propOrder = {
    "description",
    "objectIdentifier",
    "mimeType",
    "encoding"
})
public class DataObjectFormatType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ObjectIdentifier")
    protected ObjectIdentifierType objectIdentifier;
    @XmlElement(name = "MimeType")
    protected String mimeType;
    @XmlElement(name = "Encoding")
    @XmlSchemaType(name = "anyURI")
    protected String encoding;
    @XmlAttribute(name = "ObjectReference", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String objectReference;

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà objectIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getObjectIdentifier() {
        return objectIdentifier;
    }

    /**
     * Imposta il valore della proprietà objectIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setObjectIdentifier(ObjectIdentifierType value) {
        this.objectIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà mimeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Imposta il valore della proprietà mimeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Recupera il valore della proprietà encoding.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Imposta il valore della proprietà encoding.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Recupera il valore della proprietà objectReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectReference() {
        return objectReference;
    }

    /**
     * Imposta il valore della proprietà objectReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectReference(String value) {
        this.objectReference = value;
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
            String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, (this.description!= null));
        }
        {
            ObjectIdentifierType theObjectIdentifier;
            theObjectIdentifier = this.getObjectIdentifier();
            strategy.appendField(locator, this, "objectIdentifier", buffer, theObjectIdentifier, (this.objectIdentifier!= null));
        }
        {
            String theMimeType;
            theMimeType = this.getMimeType();
            strategy.appendField(locator, this, "mimeType", buffer, theMimeType, (this.mimeType!= null));
        }
        {
            String theEncoding;
            theEncoding = this.getEncoding();
            strategy.appendField(locator, this, "encoding", buffer, theEncoding, (this.encoding!= null));
        }
        {
            String theObjectReference;
            theObjectReference = this.getObjectReference();
            strategy.appendField(locator, this, "objectReference", buffer, theObjectReference, (this.objectReference!= null));
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
        final DataObjectFormatType that = ((DataObjectFormatType) object);
        {
            String lhsDescription;
            lhsDescription = this.getDescription();
            String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, (this.description!= null), (that.description!= null))) {
                return false;
            }
        }
        {
            ObjectIdentifierType lhsObjectIdentifier;
            lhsObjectIdentifier = this.getObjectIdentifier();
            ObjectIdentifierType rhsObjectIdentifier;
            rhsObjectIdentifier = that.getObjectIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectIdentifier", lhsObjectIdentifier), LocatorUtils.property(thatLocator, "objectIdentifier", rhsObjectIdentifier), lhsObjectIdentifier, rhsObjectIdentifier, (this.objectIdentifier!= null), (that.objectIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsMimeType;
            lhsMimeType = this.getMimeType();
            String rhsMimeType;
            rhsMimeType = that.getMimeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mimeType", lhsMimeType), LocatorUtils.property(thatLocator, "mimeType", rhsMimeType), lhsMimeType, rhsMimeType, (this.mimeType!= null), (that.mimeType!= null))) {
                return false;
            }
        }
        {
            String lhsEncoding;
            lhsEncoding = this.getEncoding();
            String rhsEncoding;
            rhsEncoding = that.getEncoding();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encoding", lhsEncoding), LocatorUtils.property(thatLocator, "encoding", rhsEncoding), lhsEncoding, rhsEncoding, (this.encoding!= null), (that.encoding!= null))) {
                return false;
            }
        }
        {
            String lhsObjectReference;
            lhsObjectReference = this.getObjectReference();
            String rhsObjectReference;
            rhsObjectReference = that.getObjectReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectReference", lhsObjectReference), LocatorUtils.property(thatLocator, "objectReference", rhsObjectReference), lhsObjectReference, rhsObjectReference, (this.objectReference!= null), (that.objectReference!= null))) {
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
            String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, (this.description!= null));
        }
        {
            ObjectIdentifierType theObjectIdentifier;
            theObjectIdentifier = this.getObjectIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectIdentifier", theObjectIdentifier), currentHashCode, theObjectIdentifier, (this.objectIdentifier!= null));
        }
        {
            String theMimeType;
            theMimeType = this.getMimeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mimeType", theMimeType), currentHashCode, theMimeType, (this.mimeType!= null));
        }
        {
            String theEncoding;
            theEncoding = this.getEncoding();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encoding", theEncoding), currentHashCode, theEncoding, (this.encoding!= null));
        }
        {
            String theObjectReference;
            theObjectReference = this.getObjectReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectReference", theObjectReference), currentHashCode, theObjectReference, (this.objectReference!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
