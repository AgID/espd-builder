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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SupplyChainActivityTypeCodeType;
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
 * <p>Classe Java per ActivityDataLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ActivityDataLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SupplyChainActivityTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BuyerCustomerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerSupplierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActivityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActivityOriginLocation"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActivityFinalLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SalesItem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityDataLineType", propOrder = {
    "id",
    "supplyChainActivityTypeCode",
    "buyerCustomerParty",
    "sellerSupplierParty",
    "activityPeriod",
    "activityOriginLocation",
    "activityFinalLocation",
    "salesItem"
})
public class ActivityDataLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "SupplyChainActivityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected SupplyChainActivityTypeCodeType supplyChainActivityTypeCode;
    @XmlElement(name = "BuyerCustomerParty")
    protected CustomerPartyType buyerCustomerParty;
    @XmlElement(name = "SellerSupplierParty")
    protected SupplierPartyType sellerSupplierParty;
    @XmlElement(name = "ActivityPeriod")
    protected PeriodType activityPeriod;
    @XmlElement(name = "ActivityOriginLocation", required = true)
    protected LocationType activityOriginLocation;
    @XmlElement(name = "ActivityFinalLocation")
    protected LocationType activityFinalLocation;
    @XmlElement(name = "SalesItem", required = true)
    protected List<SalesItemType> salesItem;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà supplyChainActivityTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link SupplyChainActivityTypeCodeType }
     *     
     */
    public SupplyChainActivityTypeCodeType getSupplyChainActivityTypeCode() {
        return supplyChainActivityTypeCode;
    }

    /**
     * Imposta il valore della proprietà supplyChainActivityTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyChainActivityTypeCodeType }
     *     
     */
    public void setSupplyChainActivityTypeCode(SupplyChainActivityTypeCodeType value) {
        this.supplyChainActivityTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà buyerCustomerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getBuyerCustomerParty() {
        return buyerCustomerParty;
    }

    /**
     * Imposta il valore della proprietà buyerCustomerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setBuyerCustomerParty(CustomerPartyType value) {
        this.buyerCustomerParty = value;
    }

    /**
     * Recupera il valore della proprietà sellerSupplierParty.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getSellerSupplierParty() {
        return sellerSupplierParty;
    }

    /**
     * Imposta il valore della proprietà sellerSupplierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setSellerSupplierParty(SupplierPartyType value) {
        this.sellerSupplierParty = value;
    }

    /**
     * Recupera il valore della proprietà activityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getActivityPeriod() {
        return activityPeriod;
    }

    /**
     * Imposta il valore della proprietà activityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setActivityPeriod(PeriodType value) {
        this.activityPeriod = value;
    }

    /**
     * Recupera il valore della proprietà activityOriginLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getActivityOriginLocation() {
        return activityOriginLocation;
    }

    /**
     * Imposta il valore della proprietà activityOriginLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setActivityOriginLocation(LocationType value) {
        this.activityOriginLocation = value;
    }

    /**
     * Recupera il valore della proprietà activityFinalLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getActivityFinalLocation() {
        return activityFinalLocation;
    }

    /**
     * Imposta il valore della proprietà activityFinalLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setActivityFinalLocation(LocationType value) {
        this.activityFinalLocation = value;
    }

    /**
     * Gets the value of the salesItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesItemType }
     * 
     * 
     */
    public List<SalesItemType> getSalesItem() {
        if (salesItem == null) {
            salesItem = new ArrayList<SalesItemType>();
        }
        return this.salesItem;
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
            IDType theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID, (this.id!= null));
        }
        {
            SupplyChainActivityTypeCodeType theSupplyChainActivityTypeCode;
            theSupplyChainActivityTypeCode = this.getSupplyChainActivityTypeCode();
            strategy.appendField(locator, this, "supplyChainActivityTypeCode", buffer, theSupplyChainActivityTypeCode, (this.supplyChainActivityTypeCode!= null));
        }
        {
            CustomerPartyType theBuyerCustomerParty;
            theBuyerCustomerParty = this.getBuyerCustomerParty();
            strategy.appendField(locator, this, "buyerCustomerParty", buffer, theBuyerCustomerParty, (this.buyerCustomerParty!= null));
        }
        {
            SupplierPartyType theSellerSupplierParty;
            theSellerSupplierParty = this.getSellerSupplierParty();
            strategy.appendField(locator, this, "sellerSupplierParty", buffer, theSellerSupplierParty, (this.sellerSupplierParty!= null));
        }
        {
            PeriodType theActivityPeriod;
            theActivityPeriod = this.getActivityPeriod();
            strategy.appendField(locator, this, "activityPeriod", buffer, theActivityPeriod, (this.activityPeriod!= null));
        }
        {
            LocationType theActivityOriginLocation;
            theActivityOriginLocation = this.getActivityOriginLocation();
            strategy.appendField(locator, this, "activityOriginLocation", buffer, theActivityOriginLocation, (this.activityOriginLocation!= null));
        }
        {
            LocationType theActivityFinalLocation;
            theActivityFinalLocation = this.getActivityFinalLocation();
            strategy.appendField(locator, this, "activityFinalLocation", buffer, theActivityFinalLocation, (this.activityFinalLocation!= null));
        }
        {
            List<SalesItemType> theSalesItem;
            theSalesItem = (((this.salesItem!= null)&&(!this.salesItem.isEmpty()))?this.getSalesItem():null);
            strategy.appendField(locator, this, "salesItem", buffer, theSalesItem, ((this.salesItem!= null)&&(!this.salesItem.isEmpty())));
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
        final ActivityDataLineType that = ((ActivityDataLineType) object);
        {
            IDType lhsID;
            lhsID = this.getID();
            IDType rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            SupplyChainActivityTypeCodeType lhsSupplyChainActivityTypeCode;
            lhsSupplyChainActivityTypeCode = this.getSupplyChainActivityTypeCode();
            SupplyChainActivityTypeCodeType rhsSupplyChainActivityTypeCode;
            rhsSupplyChainActivityTypeCode = that.getSupplyChainActivityTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplyChainActivityTypeCode", lhsSupplyChainActivityTypeCode), LocatorUtils.property(thatLocator, "supplyChainActivityTypeCode", rhsSupplyChainActivityTypeCode), lhsSupplyChainActivityTypeCode, rhsSupplyChainActivityTypeCode, (this.supplyChainActivityTypeCode!= null), (that.supplyChainActivityTypeCode!= null))) {
                return false;
            }
        }
        {
            CustomerPartyType lhsBuyerCustomerParty;
            lhsBuyerCustomerParty = this.getBuyerCustomerParty();
            CustomerPartyType rhsBuyerCustomerParty;
            rhsBuyerCustomerParty = that.getBuyerCustomerParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buyerCustomerParty", lhsBuyerCustomerParty), LocatorUtils.property(thatLocator, "buyerCustomerParty", rhsBuyerCustomerParty), lhsBuyerCustomerParty, rhsBuyerCustomerParty, (this.buyerCustomerParty!= null), (that.buyerCustomerParty!= null))) {
                return false;
            }
        }
        {
            SupplierPartyType lhsSellerSupplierParty;
            lhsSellerSupplierParty = this.getSellerSupplierParty();
            SupplierPartyType rhsSellerSupplierParty;
            rhsSellerSupplierParty = that.getSellerSupplierParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sellerSupplierParty", lhsSellerSupplierParty), LocatorUtils.property(thatLocator, "sellerSupplierParty", rhsSellerSupplierParty), lhsSellerSupplierParty, rhsSellerSupplierParty, (this.sellerSupplierParty!= null), (that.sellerSupplierParty!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsActivityPeriod;
            lhsActivityPeriod = this.getActivityPeriod();
            PeriodType rhsActivityPeriod;
            rhsActivityPeriod = that.getActivityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activityPeriod", lhsActivityPeriod), LocatorUtils.property(thatLocator, "activityPeriod", rhsActivityPeriod), lhsActivityPeriod, rhsActivityPeriod, (this.activityPeriod!= null), (that.activityPeriod!= null))) {
                return false;
            }
        }
        {
            LocationType lhsActivityOriginLocation;
            lhsActivityOriginLocation = this.getActivityOriginLocation();
            LocationType rhsActivityOriginLocation;
            rhsActivityOriginLocation = that.getActivityOriginLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activityOriginLocation", lhsActivityOriginLocation), LocatorUtils.property(thatLocator, "activityOriginLocation", rhsActivityOriginLocation), lhsActivityOriginLocation, rhsActivityOriginLocation, (this.activityOriginLocation!= null), (that.activityOriginLocation!= null))) {
                return false;
            }
        }
        {
            LocationType lhsActivityFinalLocation;
            lhsActivityFinalLocation = this.getActivityFinalLocation();
            LocationType rhsActivityFinalLocation;
            rhsActivityFinalLocation = that.getActivityFinalLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activityFinalLocation", lhsActivityFinalLocation), LocatorUtils.property(thatLocator, "activityFinalLocation", rhsActivityFinalLocation), lhsActivityFinalLocation, rhsActivityFinalLocation, (this.activityFinalLocation!= null), (that.activityFinalLocation!= null))) {
                return false;
            }
        }
        {
            List<SalesItemType> lhsSalesItem;
            lhsSalesItem = (((this.salesItem!= null)&&(!this.salesItem.isEmpty()))?this.getSalesItem():null);
            List<SalesItemType> rhsSalesItem;
            rhsSalesItem = (((that.salesItem!= null)&&(!that.salesItem.isEmpty()))?that.getSalesItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesItem", lhsSalesItem), LocatorUtils.property(thatLocator, "salesItem", rhsSalesItem), lhsSalesItem, rhsSalesItem, ((this.salesItem!= null)&&(!this.salesItem.isEmpty())), ((that.salesItem!= null)&&(!that.salesItem.isEmpty())))) {
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
            IDType theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID, (this.id!= null));
        }
        {
            SupplyChainActivityTypeCodeType theSupplyChainActivityTypeCode;
            theSupplyChainActivityTypeCode = this.getSupplyChainActivityTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplyChainActivityTypeCode", theSupplyChainActivityTypeCode), currentHashCode, theSupplyChainActivityTypeCode, (this.supplyChainActivityTypeCode!= null));
        }
        {
            CustomerPartyType theBuyerCustomerParty;
            theBuyerCustomerParty = this.getBuyerCustomerParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "buyerCustomerParty", theBuyerCustomerParty), currentHashCode, theBuyerCustomerParty, (this.buyerCustomerParty!= null));
        }
        {
            SupplierPartyType theSellerSupplierParty;
            theSellerSupplierParty = this.getSellerSupplierParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sellerSupplierParty", theSellerSupplierParty), currentHashCode, theSellerSupplierParty, (this.sellerSupplierParty!= null));
        }
        {
            PeriodType theActivityPeriod;
            theActivityPeriod = this.getActivityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activityPeriod", theActivityPeriod), currentHashCode, theActivityPeriod, (this.activityPeriod!= null));
        }
        {
            LocationType theActivityOriginLocation;
            theActivityOriginLocation = this.getActivityOriginLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activityOriginLocation", theActivityOriginLocation), currentHashCode, theActivityOriginLocation, (this.activityOriginLocation!= null));
        }
        {
            LocationType theActivityFinalLocation;
            theActivityFinalLocation = this.getActivityFinalLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activityFinalLocation", theActivityFinalLocation), currentHashCode, theActivityFinalLocation, (this.activityFinalLocation!= null));
        }
        {
            List<SalesItemType> theSalesItem;
            theSalesItem = (((this.salesItem!= null)&&(!this.salesItem.isEmpty()))?this.getSalesItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesItem", theSalesItem), currentHashCode, theSalesItem, ((this.salesItem!= null)&&(!this.salesItem.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
