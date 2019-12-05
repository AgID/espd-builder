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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineNumberNumericType;
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
 * <p>Classe Java per EventLineItemType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EventLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineNumberNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ParticipatingLocationsLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RetailPlannedImpact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplyItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventLineItemType", propOrder = {
    "lineNumberNumeric",
    "participatingLocationsLocation",
    "retailPlannedImpact",
    "supplyItem"
})
public class EventLineItemType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "LineNumberNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LineNumberNumericType lineNumberNumeric;
    @XmlElement(name = "ParticipatingLocationsLocation")
    protected LocationType participatingLocationsLocation;
    @XmlElement(name = "RetailPlannedImpact")
    protected List<RetailPlannedImpactType> retailPlannedImpact;
    @XmlElement(name = "SupplyItem", required = true)
    protected ItemType supplyItem;

    /**
     * Recupera il valore della proprietà lineNumberNumeric.
     * 
     * @return
     *     possible object is
     *     {@link LineNumberNumericType }
     *     
     */
    public LineNumberNumericType getLineNumberNumeric() {
        return lineNumberNumeric;
    }

    /**
     * Imposta il valore della proprietà lineNumberNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link LineNumberNumericType }
     *     
     */
    public void setLineNumberNumeric(LineNumberNumericType value) {
        this.lineNumberNumeric = value;
    }

    /**
     * Recupera il valore della proprietà participatingLocationsLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getParticipatingLocationsLocation() {
        return participatingLocationsLocation;
    }

    /**
     * Imposta il valore della proprietà participatingLocationsLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setParticipatingLocationsLocation(LocationType value) {
        this.participatingLocationsLocation = value;
    }

    /**
     * Gets the value of the retailPlannedImpact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailPlannedImpact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetailPlannedImpact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailPlannedImpactType }
     * 
     * 
     */
    public List<RetailPlannedImpactType> getRetailPlannedImpact() {
        if (retailPlannedImpact == null) {
            retailPlannedImpact = new ArrayList<RetailPlannedImpactType>();
        }
        return this.retailPlannedImpact;
    }

    /**
     * Recupera il valore della proprietà supplyItem.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getSupplyItem() {
        return supplyItem;
    }

    /**
     * Imposta il valore della proprietà supplyItem.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setSupplyItem(ItemType value) {
        this.supplyItem = value;
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
            LineNumberNumericType theLineNumberNumeric;
            theLineNumberNumeric = this.getLineNumberNumeric();
            strategy.appendField(locator, this, "lineNumberNumeric", buffer, theLineNumberNumeric, (this.lineNumberNumeric!= null));
        }
        {
            LocationType theParticipatingLocationsLocation;
            theParticipatingLocationsLocation = this.getParticipatingLocationsLocation();
            strategy.appendField(locator, this, "participatingLocationsLocation", buffer, theParticipatingLocationsLocation, (this.participatingLocationsLocation!= null));
        }
        {
            List<RetailPlannedImpactType> theRetailPlannedImpact;
            theRetailPlannedImpact = (((this.retailPlannedImpact!= null)&&(!this.retailPlannedImpact.isEmpty()))?this.getRetailPlannedImpact():null);
            strategy.appendField(locator, this, "retailPlannedImpact", buffer, theRetailPlannedImpact, ((this.retailPlannedImpact!= null)&&(!this.retailPlannedImpact.isEmpty())));
        }
        {
            ItemType theSupplyItem;
            theSupplyItem = this.getSupplyItem();
            strategy.appendField(locator, this, "supplyItem", buffer, theSupplyItem, (this.supplyItem!= null));
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
        final EventLineItemType that = ((EventLineItemType) object);
        {
            LineNumberNumericType lhsLineNumberNumeric;
            lhsLineNumberNumeric = this.getLineNumberNumeric();
            LineNumberNumericType rhsLineNumberNumeric;
            rhsLineNumberNumeric = that.getLineNumberNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineNumberNumeric", lhsLineNumberNumeric), LocatorUtils.property(thatLocator, "lineNumberNumeric", rhsLineNumberNumeric), lhsLineNumberNumeric, rhsLineNumberNumeric, (this.lineNumberNumeric!= null), (that.lineNumberNumeric!= null))) {
                return false;
            }
        }
        {
            LocationType lhsParticipatingLocationsLocation;
            lhsParticipatingLocationsLocation = this.getParticipatingLocationsLocation();
            LocationType rhsParticipatingLocationsLocation;
            rhsParticipatingLocationsLocation = that.getParticipatingLocationsLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "participatingLocationsLocation", lhsParticipatingLocationsLocation), LocatorUtils.property(thatLocator, "participatingLocationsLocation", rhsParticipatingLocationsLocation), lhsParticipatingLocationsLocation, rhsParticipatingLocationsLocation, (this.participatingLocationsLocation!= null), (that.participatingLocationsLocation!= null))) {
                return false;
            }
        }
        {
            List<RetailPlannedImpactType> lhsRetailPlannedImpact;
            lhsRetailPlannedImpact = (((this.retailPlannedImpact!= null)&&(!this.retailPlannedImpact.isEmpty()))?this.getRetailPlannedImpact():null);
            List<RetailPlannedImpactType> rhsRetailPlannedImpact;
            rhsRetailPlannedImpact = (((that.retailPlannedImpact!= null)&&(!that.retailPlannedImpact.isEmpty()))?that.getRetailPlannedImpact():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "retailPlannedImpact", lhsRetailPlannedImpact), LocatorUtils.property(thatLocator, "retailPlannedImpact", rhsRetailPlannedImpact), lhsRetailPlannedImpact, rhsRetailPlannedImpact, ((this.retailPlannedImpact!= null)&&(!this.retailPlannedImpact.isEmpty())), ((that.retailPlannedImpact!= null)&&(!that.retailPlannedImpact.isEmpty())))) {
                return false;
            }
        }
        {
            ItemType lhsSupplyItem;
            lhsSupplyItem = this.getSupplyItem();
            ItemType rhsSupplyItem;
            rhsSupplyItem = that.getSupplyItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplyItem", lhsSupplyItem), LocatorUtils.property(thatLocator, "supplyItem", rhsSupplyItem), lhsSupplyItem, rhsSupplyItem, (this.supplyItem!= null), (that.supplyItem!= null))) {
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
            LineNumberNumericType theLineNumberNumeric;
            theLineNumberNumeric = this.getLineNumberNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineNumberNumeric", theLineNumberNumeric), currentHashCode, theLineNumberNumeric, (this.lineNumberNumeric!= null));
        }
        {
            LocationType theParticipatingLocationsLocation;
            theParticipatingLocationsLocation = this.getParticipatingLocationsLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "participatingLocationsLocation", theParticipatingLocationsLocation), currentHashCode, theParticipatingLocationsLocation, (this.participatingLocationsLocation!= null));
        }
        {
            List<RetailPlannedImpactType> theRetailPlannedImpact;
            theRetailPlannedImpact = (((this.retailPlannedImpact!= null)&&(!this.retailPlannedImpact.isEmpty()))?this.getRetailPlannedImpact():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "retailPlannedImpact", theRetailPlannedImpact), currentHashCode, theRetailPlannedImpact, ((this.retailPlannedImpact!= null)&&(!this.retailPlannedImpact.isEmpty())));
        }
        {
            ItemType theSupplyItem;
            theSupplyItem = this.getSupplyItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplyItem", theSupplyItem), currentHashCode, theSupplyItem, (this.supplyItem!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
