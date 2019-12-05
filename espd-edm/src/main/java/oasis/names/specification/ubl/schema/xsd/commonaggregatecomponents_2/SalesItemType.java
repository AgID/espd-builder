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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
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
 * <p>Classe Java per SalesItemType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SalesItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActivityProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxExclusivePrice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxInclusivePrice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesItemType", propOrder = {
    "quantity",
    "activityProperty",
    "taxExclusivePrice",
    "taxInclusivePrice",
    "item"
})
public class SalesItemType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected QuantityType quantity;
    @XmlElement(name = "ActivityProperty")
    protected List<ActivityPropertyType> activityProperty;
    @XmlElement(name = "TaxExclusivePrice")
    protected List<PriceType> taxExclusivePrice;
    @XmlElement(name = "TaxInclusivePrice")
    protected List<PriceType> taxInclusivePrice;
    @XmlElement(name = "Item", required = true)
    protected ItemType item;

    /**
     * Recupera il valore della proprietà quantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantity() {
        return quantity;
    }

    /**
     * Imposta il valore della proprietà quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantity(QuantityType value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the activityProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityPropertyType }
     * 
     * 
     */
    public List<ActivityPropertyType> getActivityProperty() {
        if (activityProperty == null) {
            activityProperty = new ArrayList<ActivityPropertyType>();
        }
        return this.activityProperty;
    }

    /**
     * Gets the value of the taxExclusivePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxExclusivePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxExclusivePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceType }
     * 
     * 
     */
    public List<PriceType> getTaxExclusivePrice() {
        if (taxExclusivePrice == null) {
            taxExclusivePrice = new ArrayList<PriceType>();
        }
        return this.taxExclusivePrice;
    }

    /**
     * Gets the value of the taxInclusivePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInclusivePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInclusivePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceType }
     * 
     * 
     */
    public List<PriceType> getTaxInclusivePrice() {
        if (taxInclusivePrice == null) {
            taxInclusivePrice = new ArrayList<PriceType>();
        }
        return this.taxInclusivePrice;
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
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity, (this.quantity!= null));
        }
        {
            List<ActivityPropertyType> theActivityProperty;
            theActivityProperty = (((this.activityProperty!= null)&&(!this.activityProperty.isEmpty()))?this.getActivityProperty():null);
            strategy.appendField(locator, this, "activityProperty", buffer, theActivityProperty, ((this.activityProperty!= null)&&(!this.activityProperty.isEmpty())));
        }
        {
            List<PriceType> theTaxExclusivePrice;
            theTaxExclusivePrice = (((this.taxExclusivePrice!= null)&&(!this.taxExclusivePrice.isEmpty()))?this.getTaxExclusivePrice():null);
            strategy.appendField(locator, this, "taxExclusivePrice", buffer, theTaxExclusivePrice, ((this.taxExclusivePrice!= null)&&(!this.taxExclusivePrice.isEmpty())));
        }
        {
            List<PriceType> theTaxInclusivePrice;
            theTaxInclusivePrice = (((this.taxInclusivePrice!= null)&&(!this.taxInclusivePrice.isEmpty()))?this.getTaxInclusivePrice():null);
            strategy.appendField(locator, this, "taxInclusivePrice", buffer, theTaxInclusivePrice, ((this.taxInclusivePrice!= null)&&(!this.taxInclusivePrice.isEmpty())));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            strategy.appendField(locator, this, "item", buffer, theItem, (this.item!= null));
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
        final SalesItemType that = ((SalesItemType) object);
        {
            QuantityType lhsQuantity;
            lhsQuantity = this.getQuantity();
            QuantityType rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity, (this.quantity!= null), (that.quantity!= null))) {
                return false;
            }
        }
        {
            List<ActivityPropertyType> lhsActivityProperty;
            lhsActivityProperty = (((this.activityProperty!= null)&&(!this.activityProperty.isEmpty()))?this.getActivityProperty():null);
            List<ActivityPropertyType> rhsActivityProperty;
            rhsActivityProperty = (((that.activityProperty!= null)&&(!that.activityProperty.isEmpty()))?that.getActivityProperty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activityProperty", lhsActivityProperty), LocatorUtils.property(thatLocator, "activityProperty", rhsActivityProperty), lhsActivityProperty, rhsActivityProperty, ((this.activityProperty!= null)&&(!this.activityProperty.isEmpty())), ((that.activityProperty!= null)&&(!that.activityProperty.isEmpty())))) {
                return false;
            }
        }
        {
            List<PriceType> lhsTaxExclusivePrice;
            lhsTaxExclusivePrice = (((this.taxExclusivePrice!= null)&&(!this.taxExclusivePrice.isEmpty()))?this.getTaxExclusivePrice():null);
            List<PriceType> rhsTaxExclusivePrice;
            rhsTaxExclusivePrice = (((that.taxExclusivePrice!= null)&&(!that.taxExclusivePrice.isEmpty()))?that.getTaxExclusivePrice():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxExclusivePrice", lhsTaxExclusivePrice), LocatorUtils.property(thatLocator, "taxExclusivePrice", rhsTaxExclusivePrice), lhsTaxExclusivePrice, rhsTaxExclusivePrice, ((this.taxExclusivePrice!= null)&&(!this.taxExclusivePrice.isEmpty())), ((that.taxExclusivePrice!= null)&&(!that.taxExclusivePrice.isEmpty())))) {
                return false;
            }
        }
        {
            List<PriceType> lhsTaxInclusivePrice;
            lhsTaxInclusivePrice = (((this.taxInclusivePrice!= null)&&(!this.taxInclusivePrice.isEmpty()))?this.getTaxInclusivePrice():null);
            List<PriceType> rhsTaxInclusivePrice;
            rhsTaxInclusivePrice = (((that.taxInclusivePrice!= null)&&(!that.taxInclusivePrice.isEmpty()))?that.getTaxInclusivePrice():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxInclusivePrice", lhsTaxInclusivePrice), LocatorUtils.property(thatLocator, "taxInclusivePrice", rhsTaxInclusivePrice), lhsTaxInclusivePrice, rhsTaxInclusivePrice, ((this.taxInclusivePrice!= null)&&(!this.taxInclusivePrice.isEmpty())), ((that.taxInclusivePrice!= null)&&(!that.taxInclusivePrice.isEmpty())))) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, (this.quantity!= null));
        }
        {
            List<ActivityPropertyType> theActivityProperty;
            theActivityProperty = (((this.activityProperty!= null)&&(!this.activityProperty.isEmpty()))?this.getActivityProperty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activityProperty", theActivityProperty), currentHashCode, theActivityProperty, ((this.activityProperty!= null)&&(!this.activityProperty.isEmpty())));
        }
        {
            List<PriceType> theTaxExclusivePrice;
            theTaxExclusivePrice = (((this.taxExclusivePrice!= null)&&(!this.taxExclusivePrice.isEmpty()))?this.getTaxExclusivePrice():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxExclusivePrice", theTaxExclusivePrice), currentHashCode, theTaxExclusivePrice, ((this.taxExclusivePrice!= null)&&(!this.taxExclusivePrice.isEmpty())));
        }
        {
            List<PriceType> theTaxInclusivePrice;
            theTaxInclusivePrice = (((this.taxInclusivePrice!= null)&&(!this.taxInclusivePrice.isEmpty()))?this.getTaxInclusivePrice():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxInclusivePrice", theTaxInclusivePrice), currentHashCode, theTaxInclusivePrice, ((this.taxInclusivePrice!= null)&&(!this.taxInclusivePrice.isEmpty())));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "item", theItem), currentHashCode, theItem, (this.item!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
