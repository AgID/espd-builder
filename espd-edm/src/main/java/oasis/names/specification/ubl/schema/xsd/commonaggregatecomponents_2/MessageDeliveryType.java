//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EndpointURIType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EnvelopeTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProtocolIDType;
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
 * <p>Classe Java per MessageDeliveryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MessageDeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProtocolID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EnvelopeTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EndpointURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageDeliveryType", propOrder = {
    "protocolID",
    "envelopeTypeCode",
    "endpointURI"
})
public class MessageDeliveryType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ProtocolID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProtocolIDType protocolID;
    @XmlElement(name = "EnvelopeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EnvelopeTypeCodeType envelopeTypeCode;
    @XmlElement(name = "EndpointURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EndpointURIType endpointURI;

    /**
     * Recupera il valore della proprietà protocolID.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolIDType }
     *     
     */
    public ProtocolIDType getProtocolID() {
        return protocolID;
    }

    /**
     * Imposta il valore della proprietà protocolID.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolIDType }
     *     
     */
    public void setProtocolID(ProtocolIDType value) {
        this.protocolID = value;
    }

    /**
     * Recupera il valore della proprietà envelopeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopeTypeCodeType }
     *     
     */
    public EnvelopeTypeCodeType getEnvelopeTypeCode() {
        return envelopeTypeCode;
    }

    /**
     * Imposta il valore della proprietà envelopeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopeTypeCodeType }
     *     
     */
    public void setEnvelopeTypeCode(EnvelopeTypeCodeType value) {
        this.envelopeTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà endpointURI.
     * 
     * @return
     *     possible object is
     *     {@link EndpointURIType }
     *     
     */
    public EndpointURIType getEndpointURI() {
        return endpointURI;
    }

    /**
     * Imposta il valore della proprietà endpointURI.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointURIType }
     *     
     */
    public void setEndpointURI(EndpointURIType value) {
        this.endpointURI = value;
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
            ProtocolIDType theProtocolID;
            theProtocolID = this.getProtocolID();
            strategy.appendField(locator, this, "protocolID", buffer, theProtocolID, (this.protocolID!= null));
        }
        {
            EnvelopeTypeCodeType theEnvelopeTypeCode;
            theEnvelopeTypeCode = this.getEnvelopeTypeCode();
            strategy.appendField(locator, this, "envelopeTypeCode", buffer, theEnvelopeTypeCode, (this.envelopeTypeCode!= null));
        }
        {
            EndpointURIType theEndpointURI;
            theEndpointURI = this.getEndpointURI();
            strategy.appendField(locator, this, "endpointURI", buffer, theEndpointURI, (this.endpointURI!= null));
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
        final MessageDeliveryType that = ((MessageDeliveryType) object);
        {
            ProtocolIDType lhsProtocolID;
            lhsProtocolID = this.getProtocolID();
            ProtocolIDType rhsProtocolID;
            rhsProtocolID = that.getProtocolID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "protocolID", lhsProtocolID), LocatorUtils.property(thatLocator, "protocolID", rhsProtocolID), lhsProtocolID, rhsProtocolID, (this.protocolID!= null), (that.protocolID!= null))) {
                return false;
            }
        }
        {
            EnvelopeTypeCodeType lhsEnvelopeTypeCode;
            lhsEnvelopeTypeCode = this.getEnvelopeTypeCode();
            EnvelopeTypeCodeType rhsEnvelopeTypeCode;
            rhsEnvelopeTypeCode = that.getEnvelopeTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "envelopeTypeCode", lhsEnvelopeTypeCode), LocatorUtils.property(thatLocator, "envelopeTypeCode", rhsEnvelopeTypeCode), lhsEnvelopeTypeCode, rhsEnvelopeTypeCode, (this.envelopeTypeCode!= null), (that.envelopeTypeCode!= null))) {
                return false;
            }
        }
        {
            EndpointURIType lhsEndpointURI;
            lhsEndpointURI = this.getEndpointURI();
            EndpointURIType rhsEndpointURI;
            rhsEndpointURI = that.getEndpointURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endpointURI", lhsEndpointURI), LocatorUtils.property(thatLocator, "endpointURI", rhsEndpointURI), lhsEndpointURI, rhsEndpointURI, (this.endpointURI!= null), (that.endpointURI!= null))) {
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
            ProtocolIDType theProtocolID;
            theProtocolID = this.getProtocolID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "protocolID", theProtocolID), currentHashCode, theProtocolID, (this.protocolID!= null));
        }
        {
            EnvelopeTypeCodeType theEnvelopeTypeCode;
            theEnvelopeTypeCode = this.getEnvelopeTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "envelopeTypeCode", theEnvelopeTypeCode), currentHashCode, theEnvelopeTypeCode, (this.envelopeTypeCode!= null));
        }
        {
            EndpointURIType theEndpointURI;
            theEndpointURI = this.getEndpointURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endpointURI", theEndpointURI), currentHashCode, theEndpointURI, (this.endpointURI!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
