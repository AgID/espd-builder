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
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Classe Java per OCSPIdentifierType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCSPIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponderID" type="{http://uri.etsi.org/01903/v1.3.2#}ResponderIDType"/&gt;
 *         &lt;element name="ProducedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCSPIdentifierType", propOrder = {
    "responderID",
    "producedAt"
})
public class OCSPIdentifierType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ResponderID", required = true)
    protected ResponderIDType responderID;
    @XmlElement(name = "ProducedAt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar producedAt;
    @XmlAttribute(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * Recupera il valore della proprietà responderID.
     * 
     * @return
     *     possible object is
     *     {@link ResponderIDType }
     *     
     */
    public ResponderIDType getResponderID() {
        return responderID;
    }

    /**
     * Imposta il valore della proprietà responderID.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponderIDType }
     *     
     */
    public void setResponderID(ResponderIDType value) {
        this.responderID = value;
    }

    /**
     * Recupera il valore della proprietà producedAt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProducedAt() {
        return producedAt;
    }

    /**
     * Imposta il valore della proprietà producedAt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProducedAt(XMLGregorianCalendar value) {
        this.producedAt = value;
    }

    /**
     * Recupera il valore della proprietà uri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Imposta il valore della proprietà uri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
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
            ResponderIDType theResponderID;
            theResponderID = this.getResponderID();
            strategy.appendField(locator, this, "responderID", buffer, theResponderID, (this.responderID!= null));
        }
        {
            XMLGregorianCalendar theProducedAt;
            theProducedAt = this.getProducedAt();
            strategy.appendField(locator, this, "producedAt", buffer, theProducedAt, (this.producedAt!= null));
        }
        {
            String theURI;
            theURI = this.getURI();
            strategy.appendField(locator, this, "uri", buffer, theURI, (this.uri!= null));
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
        final OCSPIdentifierType that = ((OCSPIdentifierType) object);
        {
            ResponderIDType lhsResponderID;
            lhsResponderID = this.getResponderID();
            ResponderIDType rhsResponderID;
            rhsResponderID = that.getResponderID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responderID", lhsResponderID), LocatorUtils.property(thatLocator, "responderID", rhsResponderID), lhsResponderID, rhsResponderID, (this.responderID!= null), (that.responderID!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsProducedAt;
            lhsProducedAt = this.getProducedAt();
            XMLGregorianCalendar rhsProducedAt;
            rhsProducedAt = that.getProducedAt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "producedAt", lhsProducedAt), LocatorUtils.property(thatLocator, "producedAt", rhsProducedAt), lhsProducedAt, rhsProducedAt, (this.producedAt!= null), (that.producedAt!= null))) {
                return false;
            }
        }
        {
            String lhsURI;
            lhsURI = this.getURI();
            String rhsURI;
            rhsURI = that.getURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uri", lhsURI), LocatorUtils.property(thatLocator, "uri", rhsURI), lhsURI, rhsURI, (this.uri!= null), (that.uri!= null))) {
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
            ResponderIDType theResponderID;
            theResponderID = this.getResponderID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responderID", theResponderID), currentHashCode, theResponderID, (this.responderID!= null));
        }
        {
            XMLGregorianCalendar theProducedAt;
            theProducedAt = this.getProducedAt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "producedAt", theProducedAt), currentHashCode, theProducedAt, (this.producedAt!= null));
        }
        {
            String theURI;
            theURI = this.getURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uri", theURI), currentHashCode, theURI, (this.uri!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
