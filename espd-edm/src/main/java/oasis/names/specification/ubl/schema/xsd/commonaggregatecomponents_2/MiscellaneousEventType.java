//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MiscellaneousEventTypeCodeType;
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
 * <p>Classe Java per MiscellaneousEventType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MiscellaneousEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MiscellaneousEventTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EventLineItem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiscellaneousEventType", propOrder = {
    "miscellaneousEventTypeCode",
    "eventLineItem"
})
public class MiscellaneousEventType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "MiscellaneousEventTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected MiscellaneousEventTypeCodeType miscellaneousEventTypeCode;
    @XmlElement(name = "EventLineItem", required = true)
    protected List<EventLineItemType> eventLineItem;

    /**
     * Recupera il valore della proprietà miscellaneousEventTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousEventTypeCodeType }
     *     
     */
    public MiscellaneousEventTypeCodeType getMiscellaneousEventTypeCode() {
        return miscellaneousEventTypeCode;
    }

    /**
     * Imposta il valore della proprietà miscellaneousEventTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousEventTypeCodeType }
     *     
     */
    public void setMiscellaneousEventTypeCode(MiscellaneousEventTypeCodeType value) {
        this.miscellaneousEventTypeCode = value;
    }

    /**
     * Gets the value of the eventLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventLineItemType }
     * 
     * 
     */
    public List<EventLineItemType> getEventLineItem() {
        if (eventLineItem == null) {
            eventLineItem = new ArrayList<EventLineItemType>();
        }
        return this.eventLineItem;
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
            MiscellaneousEventTypeCodeType theMiscellaneousEventTypeCode;
            theMiscellaneousEventTypeCode = this.getMiscellaneousEventTypeCode();
            strategy.appendField(locator, this, "miscellaneousEventTypeCode", buffer, theMiscellaneousEventTypeCode, (this.miscellaneousEventTypeCode!= null));
        }
        {
            List<EventLineItemType> theEventLineItem;
            theEventLineItem = (((this.eventLineItem!= null)&&(!this.eventLineItem.isEmpty()))?this.getEventLineItem():null);
            strategy.appendField(locator, this, "eventLineItem", buffer, theEventLineItem, ((this.eventLineItem!= null)&&(!this.eventLineItem.isEmpty())));
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
        final MiscellaneousEventType that = ((MiscellaneousEventType) object);
        {
            MiscellaneousEventTypeCodeType lhsMiscellaneousEventTypeCode;
            lhsMiscellaneousEventTypeCode = this.getMiscellaneousEventTypeCode();
            MiscellaneousEventTypeCodeType rhsMiscellaneousEventTypeCode;
            rhsMiscellaneousEventTypeCode = that.getMiscellaneousEventTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "miscellaneousEventTypeCode", lhsMiscellaneousEventTypeCode), LocatorUtils.property(thatLocator, "miscellaneousEventTypeCode", rhsMiscellaneousEventTypeCode), lhsMiscellaneousEventTypeCode, rhsMiscellaneousEventTypeCode, (this.miscellaneousEventTypeCode!= null), (that.miscellaneousEventTypeCode!= null))) {
                return false;
            }
        }
        {
            List<EventLineItemType> lhsEventLineItem;
            lhsEventLineItem = (((this.eventLineItem!= null)&&(!this.eventLineItem.isEmpty()))?this.getEventLineItem():null);
            List<EventLineItemType> rhsEventLineItem;
            rhsEventLineItem = (((that.eventLineItem!= null)&&(!that.eventLineItem.isEmpty()))?that.getEventLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventLineItem", lhsEventLineItem), LocatorUtils.property(thatLocator, "eventLineItem", rhsEventLineItem), lhsEventLineItem, rhsEventLineItem, ((this.eventLineItem!= null)&&(!this.eventLineItem.isEmpty())), ((that.eventLineItem!= null)&&(!that.eventLineItem.isEmpty())))) {
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
            MiscellaneousEventTypeCodeType theMiscellaneousEventTypeCode;
            theMiscellaneousEventTypeCode = this.getMiscellaneousEventTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "miscellaneousEventTypeCode", theMiscellaneousEventTypeCode), currentHashCode, theMiscellaneousEventTypeCode, (this.miscellaneousEventTypeCode!= null));
        }
        {
            List<EventLineItemType> theEventLineItem;
            theEventLineItem = (((this.eventLineItem!= null)&&(!this.eventLineItem.isEmpty()))?this.getEventLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventLineItem", theEventLineItem), currentHashCode, theEventLineItem, ((this.eventLineItem!= null)&&(!this.eventLineItem.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
