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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SpecificationIDType;
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
 * <p>Classe Java per PromotionalSpecificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PromotionalSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecificationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PromotionalEventLineItem" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EventTactic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionalSpecificationType", propOrder = {
    "specificationID",
    "promotionalEventLineItem",
    "eventTactic"
})
public class PromotionalSpecificationType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SpecificationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SpecificationIDType specificationID;
    @XmlElement(name = "PromotionalEventLineItem", required = true)
    protected List<PromotionalEventLineItemType> promotionalEventLineItem;
    @XmlElement(name = "EventTactic")
    protected List<EventTacticType> eventTactic;

    /**
     * Recupera il valore della proprietà specificationID.
     * 
     * @return
     *     possible object is
     *     {@link SpecificationIDType }
     *     
     */
    public SpecificationIDType getSpecificationID() {
        return specificationID;
    }

    /**
     * Imposta il valore della proprietà specificationID.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificationIDType }
     *     
     */
    public void setSpecificationID(SpecificationIDType value) {
        this.specificationID = value;
    }

    /**
     * Gets the value of the promotionalEventLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionalEventLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionalEventLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionalEventLineItemType }
     * 
     * 
     */
    public List<PromotionalEventLineItemType> getPromotionalEventLineItem() {
        if (promotionalEventLineItem == null) {
            promotionalEventLineItem = new ArrayList<PromotionalEventLineItemType>();
        }
        return this.promotionalEventLineItem;
    }

    /**
     * Gets the value of the eventTactic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventTactic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventTactic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventTacticType }
     * 
     * 
     */
    public List<EventTacticType> getEventTactic() {
        if (eventTactic == null) {
            eventTactic = new ArrayList<EventTacticType>();
        }
        return this.eventTactic;
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
            SpecificationIDType theSpecificationID;
            theSpecificationID = this.getSpecificationID();
            strategy.appendField(locator, this, "specificationID", buffer, theSpecificationID, (this.specificationID!= null));
        }
        {
            List<PromotionalEventLineItemType> thePromotionalEventLineItem;
            thePromotionalEventLineItem = (((this.promotionalEventLineItem!= null)&&(!this.promotionalEventLineItem.isEmpty()))?this.getPromotionalEventLineItem():null);
            strategy.appendField(locator, this, "promotionalEventLineItem", buffer, thePromotionalEventLineItem, ((this.promotionalEventLineItem!= null)&&(!this.promotionalEventLineItem.isEmpty())));
        }
        {
            List<EventTacticType> theEventTactic;
            theEventTactic = (((this.eventTactic!= null)&&(!this.eventTactic.isEmpty()))?this.getEventTactic():null);
            strategy.appendField(locator, this, "eventTactic", buffer, theEventTactic, ((this.eventTactic!= null)&&(!this.eventTactic.isEmpty())));
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
        final PromotionalSpecificationType that = ((PromotionalSpecificationType) object);
        {
            SpecificationIDType lhsSpecificationID;
            lhsSpecificationID = this.getSpecificationID();
            SpecificationIDType rhsSpecificationID;
            rhsSpecificationID = that.getSpecificationID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specificationID", lhsSpecificationID), LocatorUtils.property(thatLocator, "specificationID", rhsSpecificationID), lhsSpecificationID, rhsSpecificationID, (this.specificationID!= null), (that.specificationID!= null))) {
                return false;
            }
        }
        {
            List<PromotionalEventLineItemType> lhsPromotionalEventLineItem;
            lhsPromotionalEventLineItem = (((this.promotionalEventLineItem!= null)&&(!this.promotionalEventLineItem.isEmpty()))?this.getPromotionalEventLineItem():null);
            List<PromotionalEventLineItemType> rhsPromotionalEventLineItem;
            rhsPromotionalEventLineItem = (((that.promotionalEventLineItem!= null)&&(!that.promotionalEventLineItem.isEmpty()))?that.getPromotionalEventLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "promotionalEventLineItem", lhsPromotionalEventLineItem), LocatorUtils.property(thatLocator, "promotionalEventLineItem", rhsPromotionalEventLineItem), lhsPromotionalEventLineItem, rhsPromotionalEventLineItem, ((this.promotionalEventLineItem!= null)&&(!this.promotionalEventLineItem.isEmpty())), ((that.promotionalEventLineItem!= null)&&(!that.promotionalEventLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            List<EventTacticType> lhsEventTactic;
            lhsEventTactic = (((this.eventTactic!= null)&&(!this.eventTactic.isEmpty()))?this.getEventTactic():null);
            List<EventTacticType> rhsEventTactic;
            rhsEventTactic = (((that.eventTactic!= null)&&(!that.eventTactic.isEmpty()))?that.getEventTactic():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventTactic", lhsEventTactic), LocatorUtils.property(thatLocator, "eventTactic", rhsEventTactic), lhsEventTactic, rhsEventTactic, ((this.eventTactic!= null)&&(!this.eventTactic.isEmpty())), ((that.eventTactic!= null)&&(!that.eventTactic.isEmpty())))) {
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
            SpecificationIDType theSpecificationID;
            theSpecificationID = this.getSpecificationID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specificationID", theSpecificationID), currentHashCode, theSpecificationID, (this.specificationID!= null));
        }
        {
            List<PromotionalEventLineItemType> thePromotionalEventLineItem;
            thePromotionalEventLineItem = (((this.promotionalEventLineItem!= null)&&(!this.promotionalEventLineItem.isEmpty()))?this.getPromotionalEventLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "promotionalEventLineItem", thePromotionalEventLineItem), currentHashCode, thePromotionalEventLineItem, ((this.promotionalEventLineItem!= null)&&(!this.promotionalEventLineItem.isEmpty())));
        }
        {
            List<EventTacticType> theEventTactic;
            theEventTactic = (((this.eventTactic!= null)&&(!this.eventTactic.isEmpty()))?this.getEventTactic():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventTactic", theEventTactic), currentHashCode, theEventTactic, ((this.eventTactic!= null)&&(!this.eventTactic.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
