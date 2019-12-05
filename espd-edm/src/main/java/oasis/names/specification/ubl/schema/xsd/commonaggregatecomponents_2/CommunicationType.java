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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ChannelCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ChannelType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueType;
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
 * <p>Classe Java per CommunicationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CommunicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChannelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Channel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Value" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationType", propOrder = {
    "channelCode",
    "channel",
    "value"
})
public class CommunicationType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ChannelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ChannelCodeType channelCode;
    @XmlElement(name = "Channel", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ChannelType channel;
    @XmlElement(name = "Value", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValueType value;

    /**
     * Recupera il valore della proprietà channelCode.
     * 
     * @return
     *     possible object is
     *     {@link ChannelCodeType }
     *     
     */
    public ChannelCodeType getChannelCode() {
        return channelCode;
    }

    /**
     * Imposta il valore della proprietà channelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelCodeType }
     *     
     */
    public void setChannelCode(ChannelCodeType value) {
        this.channelCode = value;
    }

    /**
     * Recupera il valore della proprietà channel.
     * 
     * @return
     *     possible object is
     *     {@link ChannelType }
     *     
     */
    public ChannelType getChannel() {
        return channel;
    }

    /**
     * Imposta il valore della proprietà channel.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelType }
     *     
     */
    public void setChannel(ChannelType value) {
        this.channel = value;
    }

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setValue(ValueType value) {
        this.value = value;
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
            ChannelCodeType theChannelCode;
            theChannelCode = this.getChannelCode();
            strategy.appendField(locator, this, "channelCode", buffer, theChannelCode, (this.channelCode!= null));
        }
        {
            ChannelType theChannel;
            theChannel = this.getChannel();
            strategy.appendField(locator, this, "channel", buffer, theChannel, (this.channel!= null));
        }
        {
            ValueType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
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
        final CommunicationType that = ((CommunicationType) object);
        {
            ChannelCodeType lhsChannelCode;
            lhsChannelCode = this.getChannelCode();
            ChannelCodeType rhsChannelCode;
            rhsChannelCode = that.getChannelCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "channelCode", lhsChannelCode), LocatorUtils.property(thatLocator, "channelCode", rhsChannelCode), lhsChannelCode, rhsChannelCode, (this.channelCode!= null), (that.channelCode!= null))) {
                return false;
            }
        }
        {
            ChannelType lhsChannel;
            lhsChannel = this.getChannel();
            ChannelType rhsChannel;
            rhsChannel = that.getChannel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "channel", lhsChannel), LocatorUtils.property(thatLocator, "channel", rhsChannel), lhsChannel, rhsChannel, (this.channel!= null), (that.channel!= null))) {
                return false;
            }
        }
        {
            ValueType lhsValue;
            lhsValue = this.getValue();
            ValueType rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
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
            ChannelCodeType theChannelCode;
            theChannelCode = this.getChannelCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "channelCode", theChannelCode), currentHashCode, theChannelCode, (this.channelCode!= null));
        }
        {
            ChannelType theChannel;
            theChannel = this.getChannel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "channel", theChannel), currentHashCode, theChannel, (this.channel!= null));
        }
        {
            ValueType theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue, (this.value!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
