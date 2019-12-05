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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FrozenPeriodDaysNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumInventoryQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MultipleOrderQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OrderIntervalDaysNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReplenishmentOwnerDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TargetInventoryQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TargetServicePercentType;
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
 * <p>Classe Java per ItemManagementProfileType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ItemManagementProfileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FrozenPeriodDaysNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumInventoryQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MultipleOrderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderIntervalDaysNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReplenishmentOwnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TargetServicePercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TargetInventoryQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EffectivePeriod"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemLocationQuantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemManagementProfileType", propOrder = {
    "frozenPeriodDaysNumeric",
    "minimumInventoryQuantity",
    "multipleOrderQuantity",
    "orderIntervalDaysNumeric",
    "replenishmentOwnerDescription",
    "targetServicePercent",
    "targetInventoryQuantity",
    "effectivePeriod",
    "item",
    "itemLocationQuantity"
})
public class ItemManagementProfileType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "FrozenPeriodDaysNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FrozenPeriodDaysNumericType frozenPeriodDaysNumeric;
    @XmlElement(name = "MinimumInventoryQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumInventoryQuantityType minimumInventoryQuantity;
    @XmlElement(name = "MultipleOrderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MultipleOrderQuantityType multipleOrderQuantity;
    @XmlElement(name = "OrderIntervalDaysNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OrderIntervalDaysNumericType orderIntervalDaysNumeric;
    @XmlElement(name = "ReplenishmentOwnerDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ReplenishmentOwnerDescriptionType> replenishmentOwnerDescription;
    @XmlElement(name = "TargetServicePercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TargetServicePercentType targetServicePercent;
    @XmlElement(name = "TargetInventoryQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TargetInventoryQuantityType targetInventoryQuantity;
    @XmlElement(name = "EffectivePeriod", required = true)
    protected PeriodType effectivePeriod;
    @XmlElement(name = "Item", required = true)
    protected ItemType item;
    @XmlElement(name = "ItemLocationQuantity")
    protected ItemLocationQuantityType itemLocationQuantity;

    /**
     * Recupera il valore della proprietà frozenPeriodDaysNumeric.
     * 
     * @return
     *     possible object is
     *     {@link FrozenPeriodDaysNumericType }
     *     
     */
    public FrozenPeriodDaysNumericType getFrozenPeriodDaysNumeric() {
        return frozenPeriodDaysNumeric;
    }

    /**
     * Imposta il valore della proprietà frozenPeriodDaysNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link FrozenPeriodDaysNumericType }
     *     
     */
    public void setFrozenPeriodDaysNumeric(FrozenPeriodDaysNumericType value) {
        this.frozenPeriodDaysNumeric = value;
    }

    /**
     * Recupera il valore della proprietà minimumInventoryQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MinimumInventoryQuantityType }
     *     
     */
    public MinimumInventoryQuantityType getMinimumInventoryQuantity() {
        return minimumInventoryQuantity;
    }

    /**
     * Imposta il valore della proprietà minimumInventoryQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumInventoryQuantityType }
     *     
     */
    public void setMinimumInventoryQuantity(MinimumInventoryQuantityType value) {
        this.minimumInventoryQuantity = value;
    }

    /**
     * Recupera il valore della proprietà multipleOrderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MultipleOrderQuantityType }
     *     
     */
    public MultipleOrderQuantityType getMultipleOrderQuantity() {
        return multipleOrderQuantity;
    }

    /**
     * Imposta il valore della proprietà multipleOrderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleOrderQuantityType }
     *     
     */
    public void setMultipleOrderQuantity(MultipleOrderQuantityType value) {
        this.multipleOrderQuantity = value;
    }

    /**
     * Recupera il valore della proprietà orderIntervalDaysNumeric.
     * 
     * @return
     *     possible object is
     *     {@link OrderIntervalDaysNumericType }
     *     
     */
    public OrderIntervalDaysNumericType getOrderIntervalDaysNumeric() {
        return orderIntervalDaysNumeric;
    }

    /**
     * Imposta il valore della proprietà orderIntervalDaysNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderIntervalDaysNumericType }
     *     
     */
    public void setOrderIntervalDaysNumeric(OrderIntervalDaysNumericType value) {
        this.orderIntervalDaysNumeric = value;
    }

    /**
     * Gets the value of the replenishmentOwnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replenishmentOwnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplenishmentOwnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplenishmentOwnerDescriptionType }
     * 
     * 
     */
    public List<ReplenishmentOwnerDescriptionType> getReplenishmentOwnerDescription() {
        if (replenishmentOwnerDescription == null) {
            replenishmentOwnerDescription = new ArrayList<ReplenishmentOwnerDescriptionType>();
        }
        return this.replenishmentOwnerDescription;
    }

    /**
     * Recupera il valore della proprietà targetServicePercent.
     * 
     * @return
     *     possible object is
     *     {@link TargetServicePercentType }
     *     
     */
    public TargetServicePercentType getTargetServicePercent() {
        return targetServicePercent;
    }

    /**
     * Imposta il valore della proprietà targetServicePercent.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetServicePercentType }
     *     
     */
    public void setTargetServicePercent(TargetServicePercentType value) {
        this.targetServicePercent = value;
    }

    /**
     * Recupera il valore della proprietà targetInventoryQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TargetInventoryQuantityType }
     *     
     */
    public TargetInventoryQuantityType getTargetInventoryQuantity() {
        return targetInventoryQuantity;
    }

    /**
     * Imposta il valore della proprietà targetInventoryQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetInventoryQuantityType }
     *     
     */
    public void setTargetInventoryQuantity(TargetInventoryQuantityType value) {
        this.targetInventoryQuantity = value;
    }

    /**
     * Recupera il valore della proprietà effectivePeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Imposta il valore della proprietà effectivePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEffectivePeriod(PeriodType value) {
        this.effectivePeriod = value;
    }

    /**
     * Recupera il valore della proprietà item.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Imposta il valore della proprietà item.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Recupera il valore della proprietà itemLocationQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ItemLocationQuantityType }
     *     
     */
    public ItemLocationQuantityType getItemLocationQuantity() {
        return itemLocationQuantity;
    }

    /**
     * Imposta il valore della proprietà itemLocationQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLocationQuantityType }
     *     
     */
    public void setItemLocationQuantity(ItemLocationQuantityType value) {
        this.itemLocationQuantity = value;
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
            FrozenPeriodDaysNumericType theFrozenPeriodDaysNumeric;
            theFrozenPeriodDaysNumeric = this.getFrozenPeriodDaysNumeric();
            strategy.appendField(locator, this, "frozenPeriodDaysNumeric", buffer, theFrozenPeriodDaysNumeric, (this.frozenPeriodDaysNumeric!= null));
        }
        {
            MinimumInventoryQuantityType theMinimumInventoryQuantity;
            theMinimumInventoryQuantity = this.getMinimumInventoryQuantity();
            strategy.appendField(locator, this, "minimumInventoryQuantity", buffer, theMinimumInventoryQuantity, (this.minimumInventoryQuantity!= null));
        }
        {
            MultipleOrderQuantityType theMultipleOrderQuantity;
            theMultipleOrderQuantity = this.getMultipleOrderQuantity();
            strategy.appendField(locator, this, "multipleOrderQuantity", buffer, theMultipleOrderQuantity, (this.multipleOrderQuantity!= null));
        }
        {
            OrderIntervalDaysNumericType theOrderIntervalDaysNumeric;
            theOrderIntervalDaysNumeric = this.getOrderIntervalDaysNumeric();
            strategy.appendField(locator, this, "orderIntervalDaysNumeric", buffer, theOrderIntervalDaysNumeric, (this.orderIntervalDaysNumeric!= null));
        }
        {
            List<ReplenishmentOwnerDescriptionType> theReplenishmentOwnerDescription;
            theReplenishmentOwnerDescription = (((this.replenishmentOwnerDescription!= null)&&(!this.replenishmentOwnerDescription.isEmpty()))?this.getReplenishmentOwnerDescription():null);
            strategy.appendField(locator, this, "replenishmentOwnerDescription", buffer, theReplenishmentOwnerDescription, ((this.replenishmentOwnerDescription!= null)&&(!this.replenishmentOwnerDescription.isEmpty())));
        }
        {
            TargetServicePercentType theTargetServicePercent;
            theTargetServicePercent = this.getTargetServicePercent();
            strategy.appendField(locator, this, "targetServicePercent", buffer, theTargetServicePercent, (this.targetServicePercent!= null));
        }
        {
            TargetInventoryQuantityType theTargetInventoryQuantity;
            theTargetInventoryQuantity = this.getTargetInventoryQuantity();
            strategy.appendField(locator, this, "targetInventoryQuantity", buffer, theTargetInventoryQuantity, (this.targetInventoryQuantity!= null));
        }
        {
            PeriodType theEffectivePeriod;
            theEffectivePeriod = this.getEffectivePeriod();
            strategy.appendField(locator, this, "effectivePeriod", buffer, theEffectivePeriod, (this.effectivePeriod!= null));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            strategy.appendField(locator, this, "item", buffer, theItem, (this.item!= null));
        }
        {
            ItemLocationQuantityType theItemLocationQuantity;
            theItemLocationQuantity = this.getItemLocationQuantity();
            strategy.appendField(locator, this, "itemLocationQuantity", buffer, theItemLocationQuantity, (this.itemLocationQuantity!= null));
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
        final ItemManagementProfileType that = ((ItemManagementProfileType) object);
        {
            FrozenPeriodDaysNumericType lhsFrozenPeriodDaysNumeric;
            lhsFrozenPeriodDaysNumeric = this.getFrozenPeriodDaysNumeric();
            FrozenPeriodDaysNumericType rhsFrozenPeriodDaysNumeric;
            rhsFrozenPeriodDaysNumeric = that.getFrozenPeriodDaysNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frozenPeriodDaysNumeric", lhsFrozenPeriodDaysNumeric), LocatorUtils.property(thatLocator, "frozenPeriodDaysNumeric", rhsFrozenPeriodDaysNumeric), lhsFrozenPeriodDaysNumeric, rhsFrozenPeriodDaysNumeric, (this.frozenPeriodDaysNumeric!= null), (that.frozenPeriodDaysNumeric!= null))) {
                return false;
            }
        }
        {
            MinimumInventoryQuantityType lhsMinimumInventoryQuantity;
            lhsMinimumInventoryQuantity = this.getMinimumInventoryQuantity();
            MinimumInventoryQuantityType rhsMinimumInventoryQuantity;
            rhsMinimumInventoryQuantity = that.getMinimumInventoryQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumInventoryQuantity", lhsMinimumInventoryQuantity), LocatorUtils.property(thatLocator, "minimumInventoryQuantity", rhsMinimumInventoryQuantity), lhsMinimumInventoryQuantity, rhsMinimumInventoryQuantity, (this.minimumInventoryQuantity!= null), (that.minimumInventoryQuantity!= null))) {
                return false;
            }
        }
        {
            MultipleOrderQuantityType lhsMultipleOrderQuantity;
            lhsMultipleOrderQuantity = this.getMultipleOrderQuantity();
            MultipleOrderQuantityType rhsMultipleOrderQuantity;
            rhsMultipleOrderQuantity = that.getMultipleOrderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multipleOrderQuantity", lhsMultipleOrderQuantity), LocatorUtils.property(thatLocator, "multipleOrderQuantity", rhsMultipleOrderQuantity), lhsMultipleOrderQuantity, rhsMultipleOrderQuantity, (this.multipleOrderQuantity!= null), (that.multipleOrderQuantity!= null))) {
                return false;
            }
        }
        {
            OrderIntervalDaysNumericType lhsOrderIntervalDaysNumeric;
            lhsOrderIntervalDaysNumeric = this.getOrderIntervalDaysNumeric();
            OrderIntervalDaysNumericType rhsOrderIntervalDaysNumeric;
            rhsOrderIntervalDaysNumeric = that.getOrderIntervalDaysNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderIntervalDaysNumeric", lhsOrderIntervalDaysNumeric), LocatorUtils.property(thatLocator, "orderIntervalDaysNumeric", rhsOrderIntervalDaysNumeric), lhsOrderIntervalDaysNumeric, rhsOrderIntervalDaysNumeric, (this.orderIntervalDaysNumeric!= null), (that.orderIntervalDaysNumeric!= null))) {
                return false;
            }
        }
        {
            List<ReplenishmentOwnerDescriptionType> lhsReplenishmentOwnerDescription;
            lhsReplenishmentOwnerDescription = (((this.replenishmentOwnerDescription!= null)&&(!this.replenishmentOwnerDescription.isEmpty()))?this.getReplenishmentOwnerDescription():null);
            List<ReplenishmentOwnerDescriptionType> rhsReplenishmentOwnerDescription;
            rhsReplenishmentOwnerDescription = (((that.replenishmentOwnerDescription!= null)&&(!that.replenishmentOwnerDescription.isEmpty()))?that.getReplenishmentOwnerDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "replenishmentOwnerDescription", lhsReplenishmentOwnerDescription), LocatorUtils.property(thatLocator, "replenishmentOwnerDescription", rhsReplenishmentOwnerDescription), lhsReplenishmentOwnerDescription, rhsReplenishmentOwnerDescription, ((this.replenishmentOwnerDescription!= null)&&(!this.replenishmentOwnerDescription.isEmpty())), ((that.replenishmentOwnerDescription!= null)&&(!that.replenishmentOwnerDescription.isEmpty())))) {
                return false;
            }
        }
        {
            TargetServicePercentType lhsTargetServicePercent;
            lhsTargetServicePercent = this.getTargetServicePercent();
            TargetServicePercentType rhsTargetServicePercent;
            rhsTargetServicePercent = that.getTargetServicePercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetServicePercent", lhsTargetServicePercent), LocatorUtils.property(thatLocator, "targetServicePercent", rhsTargetServicePercent), lhsTargetServicePercent, rhsTargetServicePercent, (this.targetServicePercent!= null), (that.targetServicePercent!= null))) {
                return false;
            }
        }
        {
            TargetInventoryQuantityType lhsTargetInventoryQuantity;
            lhsTargetInventoryQuantity = this.getTargetInventoryQuantity();
            TargetInventoryQuantityType rhsTargetInventoryQuantity;
            rhsTargetInventoryQuantity = that.getTargetInventoryQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "targetInventoryQuantity", lhsTargetInventoryQuantity), LocatorUtils.property(thatLocator, "targetInventoryQuantity", rhsTargetInventoryQuantity), lhsTargetInventoryQuantity, rhsTargetInventoryQuantity, (this.targetInventoryQuantity!= null), (that.targetInventoryQuantity!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsEffectivePeriod;
            lhsEffectivePeriod = this.getEffectivePeriod();
            PeriodType rhsEffectivePeriod;
            rhsEffectivePeriod = that.getEffectivePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectivePeriod", lhsEffectivePeriod), LocatorUtils.property(thatLocator, "effectivePeriod", rhsEffectivePeriod), lhsEffectivePeriod, rhsEffectivePeriod, (this.effectivePeriod!= null), (that.effectivePeriod!= null))) {
                return false;
            }
        }
        {
            ItemType lhsItem;
            lhsItem = this.getItem();
            ItemType rhsItem;
            rhsItem = that.getItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "item", lhsItem), LocatorUtils.property(thatLocator, "item", rhsItem), lhsItem, rhsItem, (this.item!= null), (that.item!= null))) {
                return false;
            }
        }
        {
            ItemLocationQuantityType lhsItemLocationQuantity;
            lhsItemLocationQuantity = this.getItemLocationQuantity();
            ItemLocationQuantityType rhsItemLocationQuantity;
            rhsItemLocationQuantity = that.getItemLocationQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemLocationQuantity", lhsItemLocationQuantity), LocatorUtils.property(thatLocator, "itemLocationQuantity", rhsItemLocationQuantity), lhsItemLocationQuantity, rhsItemLocationQuantity, (this.itemLocationQuantity!= null), (that.itemLocationQuantity!= null))) {
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
            FrozenPeriodDaysNumericType theFrozenPeriodDaysNumeric;
            theFrozenPeriodDaysNumeric = this.getFrozenPeriodDaysNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frozenPeriodDaysNumeric", theFrozenPeriodDaysNumeric), currentHashCode, theFrozenPeriodDaysNumeric, (this.frozenPeriodDaysNumeric!= null));
        }
        {
            MinimumInventoryQuantityType theMinimumInventoryQuantity;
            theMinimumInventoryQuantity = this.getMinimumInventoryQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumInventoryQuantity", theMinimumInventoryQuantity), currentHashCode, theMinimumInventoryQuantity, (this.minimumInventoryQuantity!= null));
        }
        {
            MultipleOrderQuantityType theMultipleOrderQuantity;
            theMultipleOrderQuantity = this.getMultipleOrderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multipleOrderQuantity", theMultipleOrderQuantity), currentHashCode, theMultipleOrderQuantity, (this.multipleOrderQuantity!= null));
        }
        {
            OrderIntervalDaysNumericType theOrderIntervalDaysNumeric;
            theOrderIntervalDaysNumeric = this.getOrderIntervalDaysNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderIntervalDaysNumeric", theOrderIntervalDaysNumeric), currentHashCode, theOrderIntervalDaysNumeric, (this.orderIntervalDaysNumeric!= null));
        }
        {
            List<ReplenishmentOwnerDescriptionType> theReplenishmentOwnerDescription;
            theReplenishmentOwnerDescription = (((this.replenishmentOwnerDescription!= null)&&(!this.replenishmentOwnerDescription.isEmpty()))?this.getReplenishmentOwnerDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replenishmentOwnerDescription", theReplenishmentOwnerDescription), currentHashCode, theReplenishmentOwnerDescription, ((this.replenishmentOwnerDescription!= null)&&(!this.replenishmentOwnerDescription.isEmpty())));
        }
        {
            TargetServicePercentType theTargetServicePercent;
            theTargetServicePercent = this.getTargetServicePercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetServicePercent", theTargetServicePercent), currentHashCode, theTargetServicePercent, (this.targetServicePercent!= null));
        }
        {
            TargetInventoryQuantityType theTargetInventoryQuantity;
            theTargetInventoryQuantity = this.getTargetInventoryQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "targetInventoryQuantity", theTargetInventoryQuantity), currentHashCode, theTargetInventoryQuantity, (this.targetInventoryQuantity!= null));
        }
        {
            PeriodType theEffectivePeriod;
            theEffectivePeriod = this.getEffectivePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectivePeriod", theEffectivePeriod), currentHashCode, theEffectivePeriod, (this.effectivePeriod!= null));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "item", theItem), currentHashCode, theItem, (this.item!= null));
        }
        {
            ItemLocationQuantityType theItemLocationQuantity;
            theItemLocationQuantity = this.getItemLocationQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemLocationQuantity", theItemLocationQuantity), currentHashCode, theItemLocationQuantity, (this.itemLocationQuantity!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
