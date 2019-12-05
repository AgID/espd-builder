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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InvoicedQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineExtensionAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ParentDocumentLineReferenceIDType;
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
 * <p>Classe Java per ConsumptionLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ParentDocumentLineReferenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InvoicedQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineExtensionAmount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UtilityItem"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Price" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UnstructuredPrice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionLineType", propOrder = {
    "id",
    "parentDocumentLineReferenceID",
    "invoicedQuantity",
    "lineExtensionAmount",
    "period",
    "delivery",
    "allowanceCharge",
    "taxTotal",
    "utilityItem",
    "price",
    "unstructuredPrice"
})
public class ConsumptionLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "ParentDocumentLineReferenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ParentDocumentLineReferenceIDType parentDocumentLineReferenceID;
    @XmlElement(name = "InvoicedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected InvoicedQuantityType invoicedQuantity;
    @XmlElement(name = "LineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected LineExtensionAmountType lineExtensionAmount;
    @XmlElement(name = "Period")
    protected PeriodType period;
    @XmlElement(name = "Delivery")
    protected List<DeliveryType> delivery;
    @XmlElement(name = "AllowanceCharge")
    protected List<AllowanceChargeType> allowanceCharge;
    @XmlElement(name = "TaxTotal")
    protected List<TaxTotalType> taxTotal;
    @XmlElement(name = "UtilityItem", required = true)
    protected UtilityItemType utilityItem;
    @XmlElement(name = "Price")
    protected PriceType price;
    @XmlElement(name = "UnstructuredPrice")
    protected UnstructuredPriceType unstructuredPrice;

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
     * Recupera il valore della proprietà parentDocumentLineReferenceID.
     * 
     * @return
     *     possible object is
     *     {@link ParentDocumentLineReferenceIDType }
     *     
     */
    public ParentDocumentLineReferenceIDType getParentDocumentLineReferenceID() {
        return parentDocumentLineReferenceID;
    }

    /**
     * Imposta il valore della proprietà parentDocumentLineReferenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentDocumentLineReferenceIDType }
     *     
     */
    public void setParentDocumentLineReferenceID(ParentDocumentLineReferenceIDType value) {
        this.parentDocumentLineReferenceID = value;
    }

    /**
     * Recupera il valore della proprietà invoicedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link InvoicedQuantityType }
     *     
     */
    public InvoicedQuantityType getInvoicedQuantity() {
        return invoicedQuantity;
    }

    /**
     * Imposta il valore della proprietà invoicedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicedQuantityType }
     *     
     */
    public void setInvoicedQuantity(InvoicedQuantityType value) {
        this.invoicedQuantity = value;
    }

    /**
     * Recupera il valore della proprietà lineExtensionAmount.
     * 
     * @return
     *     possible object is
     *     {@link LineExtensionAmountType }
     *     
     */
    public LineExtensionAmountType getLineExtensionAmount() {
        return lineExtensionAmount;
    }

    /**
     * Imposta il valore della proprietà lineExtensionAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link LineExtensionAmountType }
     *     
     */
    public void setLineExtensionAmount(LineExtensionAmountType value) {
        this.lineExtensionAmount = value;
    }

    /**
     * Recupera il valore della proprietà period.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPeriod() {
        return period;
    }

    /**
     * Imposta il valore della proprietà period.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPeriod(PeriodType value) {
        this.period = value;
    }

    /**
     * Gets the value of the delivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryType }
     * 
     * 
     */
    public List<DeliveryType> getDelivery() {
        if (delivery == null) {
            delivery = new ArrayList<DeliveryType>();
        }
        return this.delivery;
    }

    /**
     * Gets the value of the allowanceCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getAllowanceCharge() {
        if (allowanceCharge == null) {
            allowanceCharge = new ArrayList<AllowanceChargeType>();
        }
        return this.allowanceCharge;
    }

    /**
     * Gets the value of the taxTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTotalType }
     * 
     * 
     */
    public List<TaxTotalType> getTaxTotal() {
        if (taxTotal == null) {
            taxTotal = new ArrayList<TaxTotalType>();
        }
        return this.taxTotal;
    }

    /**
     * Recupera il valore della proprietà utilityItem.
     * 
     * @return
     *     possible object is
     *     {@link UtilityItemType }
     *     
     */
    public UtilityItemType getUtilityItem() {
        return utilityItem;
    }

    /**
     * Imposta il valore della proprietà utilityItem.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityItemType }
     *     
     */
    public void setUtilityItem(UtilityItemType value) {
        this.utilityItem = value;
    }

    /**
     * Recupera il valore della proprietà price.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Imposta il valore della proprietà price.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * Recupera il valore della proprietà unstructuredPrice.
     * 
     * @return
     *     possible object is
     *     {@link UnstructuredPriceType }
     *     
     */
    public UnstructuredPriceType getUnstructuredPrice() {
        return unstructuredPrice;
    }

    /**
     * Imposta il valore della proprietà unstructuredPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link UnstructuredPriceType }
     *     
     */
    public void setUnstructuredPrice(UnstructuredPriceType value) {
        this.unstructuredPrice = value;
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
            ParentDocumentLineReferenceIDType theParentDocumentLineReferenceID;
            theParentDocumentLineReferenceID = this.getParentDocumentLineReferenceID();
            strategy.appendField(locator, this, "parentDocumentLineReferenceID", buffer, theParentDocumentLineReferenceID, (this.parentDocumentLineReferenceID!= null));
        }
        {
            InvoicedQuantityType theInvoicedQuantity;
            theInvoicedQuantity = this.getInvoicedQuantity();
            strategy.appendField(locator, this, "invoicedQuantity", buffer, theInvoicedQuantity, (this.invoicedQuantity!= null));
        }
        {
            LineExtensionAmountType theLineExtensionAmount;
            theLineExtensionAmount = this.getLineExtensionAmount();
            strategy.appendField(locator, this, "lineExtensionAmount", buffer, theLineExtensionAmount, (this.lineExtensionAmount!= null));
        }
        {
            PeriodType thePeriod;
            thePeriod = this.getPeriod();
            strategy.appendField(locator, this, "period", buffer, thePeriod, (this.period!= null));
        }
        {
            List<DeliveryType> theDelivery;
            theDelivery = (((this.delivery!= null)&&(!this.delivery.isEmpty()))?this.getDelivery():null);
            strategy.appendField(locator, this, "delivery", buffer, theDelivery, ((this.delivery!= null)&&(!this.delivery.isEmpty())));
        }
        {
            List<AllowanceChargeType> theAllowanceCharge;
            theAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            strategy.appendField(locator, this, "allowanceCharge", buffer, theAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())));
        }
        {
            List<TaxTotalType> theTaxTotal;
            theTaxTotal = (((this.taxTotal!= null)&&(!this.taxTotal.isEmpty()))?this.getTaxTotal():null);
            strategy.appendField(locator, this, "taxTotal", buffer, theTaxTotal, ((this.taxTotal!= null)&&(!this.taxTotal.isEmpty())));
        }
        {
            UtilityItemType theUtilityItem;
            theUtilityItem = this.getUtilityItem();
            strategy.appendField(locator, this, "utilityItem", buffer, theUtilityItem, (this.utilityItem!= null));
        }
        {
            PriceType thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            UnstructuredPriceType theUnstructuredPrice;
            theUnstructuredPrice = this.getUnstructuredPrice();
            strategy.appendField(locator, this, "unstructuredPrice", buffer, theUnstructuredPrice, (this.unstructuredPrice!= null));
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
        final ConsumptionLineType that = ((ConsumptionLineType) object);
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
            ParentDocumentLineReferenceIDType lhsParentDocumentLineReferenceID;
            lhsParentDocumentLineReferenceID = this.getParentDocumentLineReferenceID();
            ParentDocumentLineReferenceIDType rhsParentDocumentLineReferenceID;
            rhsParentDocumentLineReferenceID = that.getParentDocumentLineReferenceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parentDocumentLineReferenceID", lhsParentDocumentLineReferenceID), LocatorUtils.property(thatLocator, "parentDocumentLineReferenceID", rhsParentDocumentLineReferenceID), lhsParentDocumentLineReferenceID, rhsParentDocumentLineReferenceID, (this.parentDocumentLineReferenceID!= null), (that.parentDocumentLineReferenceID!= null))) {
                return false;
            }
        }
        {
            InvoicedQuantityType lhsInvoicedQuantity;
            lhsInvoicedQuantity = this.getInvoicedQuantity();
            InvoicedQuantityType rhsInvoicedQuantity;
            rhsInvoicedQuantity = that.getInvoicedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoicedQuantity", lhsInvoicedQuantity), LocatorUtils.property(thatLocator, "invoicedQuantity", rhsInvoicedQuantity), lhsInvoicedQuantity, rhsInvoicedQuantity, (this.invoicedQuantity!= null), (that.invoicedQuantity!= null))) {
                return false;
            }
        }
        {
            LineExtensionAmountType lhsLineExtensionAmount;
            lhsLineExtensionAmount = this.getLineExtensionAmount();
            LineExtensionAmountType rhsLineExtensionAmount;
            rhsLineExtensionAmount = that.getLineExtensionAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineExtensionAmount", lhsLineExtensionAmount), LocatorUtils.property(thatLocator, "lineExtensionAmount", rhsLineExtensionAmount), lhsLineExtensionAmount, rhsLineExtensionAmount, (this.lineExtensionAmount!= null), (that.lineExtensionAmount!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsPeriod;
            lhsPeriod = this.getPeriod();
            PeriodType rhsPeriod;
            rhsPeriod = that.getPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "period", lhsPeriod), LocatorUtils.property(thatLocator, "period", rhsPeriod), lhsPeriod, rhsPeriod, (this.period!= null), (that.period!= null))) {
                return false;
            }
        }
        {
            List<DeliveryType> lhsDelivery;
            lhsDelivery = (((this.delivery!= null)&&(!this.delivery.isEmpty()))?this.getDelivery():null);
            List<DeliveryType> rhsDelivery;
            rhsDelivery = (((that.delivery!= null)&&(!that.delivery.isEmpty()))?that.getDelivery():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "delivery", lhsDelivery), LocatorUtils.property(thatLocator, "delivery", rhsDelivery), lhsDelivery, rhsDelivery, ((this.delivery!= null)&&(!this.delivery.isEmpty())), ((that.delivery!= null)&&(!that.delivery.isEmpty())))) {
                return false;
            }
        }
        {
            List<AllowanceChargeType> lhsAllowanceCharge;
            lhsAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            List<AllowanceChargeType> rhsAllowanceCharge;
            rhsAllowanceCharge = (((that.allowanceCharge!= null)&&(!that.allowanceCharge.isEmpty()))?that.getAllowanceCharge():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowanceCharge", lhsAllowanceCharge), LocatorUtils.property(thatLocator, "allowanceCharge", rhsAllowanceCharge), lhsAllowanceCharge, rhsAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())), ((that.allowanceCharge!= null)&&(!that.allowanceCharge.isEmpty())))) {
                return false;
            }
        }
        {
            List<TaxTotalType> lhsTaxTotal;
            lhsTaxTotal = (((this.taxTotal!= null)&&(!this.taxTotal.isEmpty()))?this.getTaxTotal():null);
            List<TaxTotalType> rhsTaxTotal;
            rhsTaxTotal = (((that.taxTotal!= null)&&(!that.taxTotal.isEmpty()))?that.getTaxTotal():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxTotal", lhsTaxTotal), LocatorUtils.property(thatLocator, "taxTotal", rhsTaxTotal), lhsTaxTotal, rhsTaxTotal, ((this.taxTotal!= null)&&(!this.taxTotal.isEmpty())), ((that.taxTotal!= null)&&(!that.taxTotal.isEmpty())))) {
                return false;
            }
        }
        {
            UtilityItemType lhsUtilityItem;
            lhsUtilityItem = this.getUtilityItem();
            UtilityItemType rhsUtilityItem;
            rhsUtilityItem = that.getUtilityItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "utilityItem", lhsUtilityItem), LocatorUtils.property(thatLocator, "utilityItem", rhsUtilityItem), lhsUtilityItem, rhsUtilityItem, (this.utilityItem!= null), (that.utilityItem!= null))) {
                return false;
            }
        }
        {
            PriceType lhsPrice;
            lhsPrice = this.getPrice();
            PriceType rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice, (this.price!= null), (that.price!= null))) {
                return false;
            }
        }
        {
            UnstructuredPriceType lhsUnstructuredPrice;
            lhsUnstructuredPrice = this.getUnstructuredPrice();
            UnstructuredPriceType rhsUnstructuredPrice;
            rhsUnstructuredPrice = that.getUnstructuredPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unstructuredPrice", lhsUnstructuredPrice), LocatorUtils.property(thatLocator, "unstructuredPrice", rhsUnstructuredPrice), lhsUnstructuredPrice, rhsUnstructuredPrice, (this.unstructuredPrice!= null), (that.unstructuredPrice!= null))) {
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
            ParentDocumentLineReferenceIDType theParentDocumentLineReferenceID;
            theParentDocumentLineReferenceID = this.getParentDocumentLineReferenceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parentDocumentLineReferenceID", theParentDocumentLineReferenceID), currentHashCode, theParentDocumentLineReferenceID, (this.parentDocumentLineReferenceID!= null));
        }
        {
            InvoicedQuantityType theInvoicedQuantity;
            theInvoicedQuantity = this.getInvoicedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoicedQuantity", theInvoicedQuantity), currentHashCode, theInvoicedQuantity, (this.invoicedQuantity!= null));
        }
        {
            LineExtensionAmountType theLineExtensionAmount;
            theLineExtensionAmount = this.getLineExtensionAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineExtensionAmount", theLineExtensionAmount), currentHashCode, theLineExtensionAmount, (this.lineExtensionAmount!= null));
        }
        {
            PeriodType thePeriod;
            thePeriod = this.getPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "period", thePeriod), currentHashCode, thePeriod, (this.period!= null));
        }
        {
            List<DeliveryType> theDelivery;
            theDelivery = (((this.delivery!= null)&&(!this.delivery.isEmpty()))?this.getDelivery():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "delivery", theDelivery), currentHashCode, theDelivery, ((this.delivery!= null)&&(!this.delivery.isEmpty())));
        }
        {
            List<AllowanceChargeType> theAllowanceCharge;
            theAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowanceCharge", theAllowanceCharge), currentHashCode, theAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())));
        }
        {
            List<TaxTotalType> theTaxTotal;
            theTaxTotal = (((this.taxTotal!= null)&&(!this.taxTotal.isEmpty()))?this.getTaxTotal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxTotal", theTaxTotal), currentHashCode, theTaxTotal, ((this.taxTotal!= null)&&(!this.taxTotal.isEmpty())));
        }
        {
            UtilityItemType theUtilityItem;
            theUtilityItem = this.getUtilityItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "utilityItem", theUtilityItem), currentHashCode, theUtilityItem, (this.utilityItem!= null));
        }
        {
            PriceType thePrice;
            thePrice = this.getPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "price", thePrice), currentHashCode, thePrice, (this.price!= null));
        }
        {
            UnstructuredPriceType theUnstructuredPrice;
            theUnstructuredPrice = this.getUnstructuredPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unstructuredPrice", theUnstructuredPrice), currentHashCode, theUnstructuredPrice, (this.unstructuredPrice!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
