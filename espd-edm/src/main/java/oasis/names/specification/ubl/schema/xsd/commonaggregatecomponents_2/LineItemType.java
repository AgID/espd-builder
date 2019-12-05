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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AccountingCostCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AccountingCostType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BackOrderAllowedIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InspectionMethodCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineExtensionAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineStatusCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumBackorderQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumBackorderQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PartialDeliveryIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SalesOrderIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalTaxAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UUIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WarrantyInformationType;
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
 * <p>Classe Java per LineItemType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SalesOrderID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineExtensionAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalTaxAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumBackorderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumBackorderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InspectionMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PartialDeliveryIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BackOrderAllowedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCostCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCost" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WarrantyInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginatorParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OrderedShipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PricingReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Price" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubLineItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemPriceExtension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LineReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemType", propOrder = {
    "id",
    "salesOrderID",
    "uuid",
    "note",
    "lineStatusCode",
    "quantity",
    "lineExtensionAmount",
    "totalTaxAmount",
    "minimumQuantity",
    "maximumQuantity",
    "minimumBackorderQuantity",
    "maximumBackorderQuantity",
    "inspectionMethodCode",
    "partialDeliveryIndicator",
    "backOrderAllowedIndicator",
    "accountingCostCode",
    "accountingCost",
    "warrantyInformation",
    "delivery",
    "deliveryTerms",
    "originatorParty",
    "orderedShipment",
    "pricingReference",
    "allowanceCharge",
    "price",
    "item",
    "subLineItem",
    "warrantyValidityPeriod",
    "warrantyParty",
    "taxTotal",
    "itemPriceExtension",
    "lineReference"
})
public class LineItemType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "SalesOrderID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SalesOrderIDType salesOrderID;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUIDType uuid;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "LineStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LineStatusCodeType lineStatusCode;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QuantityType quantity;
    @XmlElement(name = "LineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LineExtensionAmountType lineExtensionAmount;
    @XmlElement(name = "TotalTaxAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalTaxAmountType totalTaxAmount;
    @XmlElement(name = "MinimumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumQuantityType minimumQuantity;
    @XmlElement(name = "MaximumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumQuantityType maximumQuantity;
    @XmlElement(name = "MinimumBackorderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumBackorderQuantityType minimumBackorderQuantity;
    @XmlElement(name = "MaximumBackorderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumBackorderQuantityType maximumBackorderQuantity;
    @XmlElement(name = "InspectionMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InspectionMethodCodeType inspectionMethodCode;
    @XmlElement(name = "PartialDeliveryIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PartialDeliveryIndicatorType partialDeliveryIndicator;
    @XmlElement(name = "BackOrderAllowedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BackOrderAllowedIndicatorType backOrderAllowedIndicator;
    @XmlElement(name = "AccountingCostCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountingCostCodeType accountingCostCode;
    @XmlElement(name = "AccountingCost", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountingCostType accountingCost;
    @XmlElement(name = "WarrantyInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<WarrantyInformationType> warrantyInformation;
    @XmlElement(name = "Delivery")
    protected List<DeliveryType> delivery;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "OriginatorParty")
    protected PartyType originatorParty;
    @XmlElement(name = "OrderedShipment")
    protected List<OrderedShipmentType> orderedShipment;
    @XmlElement(name = "PricingReference")
    protected PricingReferenceType pricingReference;
    @XmlElement(name = "AllowanceCharge")
    protected List<AllowanceChargeType> allowanceCharge;
    @XmlElement(name = "Price")
    protected PriceType price;
    @XmlElement(name = "Item", required = true)
    protected ItemType item;
    @XmlElement(name = "SubLineItem")
    protected List<LineItemType> subLineItem;
    @XmlElement(name = "WarrantyValidityPeriod")
    protected PeriodType warrantyValidityPeriod;
    @XmlElement(name = "WarrantyParty")
    protected PartyType warrantyParty;
    @XmlElement(name = "TaxTotal")
    protected List<TaxTotalType> taxTotal;
    @XmlElement(name = "ItemPriceExtension")
    protected PriceExtensionType itemPriceExtension;
    @XmlElement(name = "LineReference")
    protected List<LineReferenceType> lineReference;

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
     * Recupera il valore della proprietà salesOrderID.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderIDType }
     *     
     */
    public SalesOrderIDType getSalesOrderID() {
        return salesOrderID;
    }

    /**
     * Imposta il valore della proprietà salesOrderID.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderIDType }
     *     
     */
    public void setSalesOrderID(SalesOrderIDType value) {
        this.salesOrderID = value;
    }

    /**
     * Recupera il valore della proprietà uuid.
     * 
     * @return
     *     possible object is
     *     {@link UUIDType }
     *     
     */
    public UUIDType getUUID() {
        return uuid;
    }

    /**
     * Imposta il valore della proprietà uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link UUIDType }
     *     
     */
    public void setUUID(UUIDType value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Recupera il valore della proprietà lineStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link LineStatusCodeType }
     *     
     */
    public LineStatusCodeType getLineStatusCode() {
        return lineStatusCode;
    }

    /**
     * Imposta il valore della proprietà lineStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStatusCodeType }
     *     
     */
    public void setLineStatusCode(LineStatusCodeType value) {
        this.lineStatusCode = value;
    }

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
     * Recupera il valore della proprietà totalTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link TotalTaxAmountType }
     *     
     */
    public TotalTaxAmountType getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Imposta il valore della proprietà totalTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTaxAmountType }
     *     
     */
    public void setTotalTaxAmount(TotalTaxAmountType value) {
        this.totalTaxAmount = value;
    }

    /**
     * Recupera il valore della proprietà minimumQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MinimumQuantityType }
     *     
     */
    public MinimumQuantityType getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Imposta il valore della proprietà minimumQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumQuantityType }
     *     
     */
    public void setMinimumQuantity(MinimumQuantityType value) {
        this.minimumQuantity = value;
    }

    /**
     * Recupera il valore della proprietà maximumQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MaximumQuantityType }
     *     
     */
    public MaximumQuantityType getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Imposta il valore della proprietà maximumQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumQuantityType }
     *     
     */
    public void setMaximumQuantity(MaximumQuantityType value) {
        this.maximumQuantity = value;
    }

    /**
     * Recupera il valore della proprietà minimumBackorderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MinimumBackorderQuantityType }
     *     
     */
    public MinimumBackorderQuantityType getMinimumBackorderQuantity() {
        return minimumBackorderQuantity;
    }

    /**
     * Imposta il valore della proprietà minimumBackorderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumBackorderQuantityType }
     *     
     */
    public void setMinimumBackorderQuantity(MinimumBackorderQuantityType value) {
        this.minimumBackorderQuantity = value;
    }

    /**
     * Recupera il valore della proprietà maximumBackorderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MaximumBackorderQuantityType }
     *     
     */
    public MaximumBackorderQuantityType getMaximumBackorderQuantity() {
        return maximumBackorderQuantity;
    }

    /**
     * Imposta il valore della proprietà maximumBackorderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumBackorderQuantityType }
     *     
     */
    public void setMaximumBackorderQuantity(MaximumBackorderQuantityType value) {
        this.maximumBackorderQuantity = value;
    }

    /**
     * Recupera il valore della proprietà inspectionMethodCode.
     * 
     * @return
     *     possible object is
     *     {@link InspectionMethodCodeType }
     *     
     */
    public InspectionMethodCodeType getInspectionMethodCode() {
        return inspectionMethodCode;
    }

    /**
     * Imposta il valore della proprietà inspectionMethodCode.
     * 
     * @param value
     *     allowed object is
     *     {@link InspectionMethodCodeType }
     *     
     */
    public void setInspectionMethodCode(InspectionMethodCodeType value) {
        this.inspectionMethodCode = value;
    }

    /**
     * Recupera il valore della proprietà partialDeliveryIndicator.
     * 
     * @return
     *     possible object is
     *     {@link PartialDeliveryIndicatorType }
     *     
     */
    public PartialDeliveryIndicatorType getPartialDeliveryIndicator() {
        return partialDeliveryIndicator;
    }

    /**
     * Imposta il valore della proprietà partialDeliveryIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialDeliveryIndicatorType }
     *     
     */
    public void setPartialDeliveryIndicator(PartialDeliveryIndicatorType value) {
        this.partialDeliveryIndicator = value;
    }

    /**
     * Recupera il valore della proprietà backOrderAllowedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link BackOrderAllowedIndicatorType }
     *     
     */
    public BackOrderAllowedIndicatorType getBackOrderAllowedIndicator() {
        return backOrderAllowedIndicator;
    }

    /**
     * Imposta il valore della proprietà backOrderAllowedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link BackOrderAllowedIndicatorType }
     *     
     */
    public void setBackOrderAllowedIndicator(BackOrderAllowedIndicatorType value) {
        this.backOrderAllowedIndicator = value;
    }

    /**
     * Recupera il valore della proprietà accountingCostCode.
     * 
     * @return
     *     possible object is
     *     {@link AccountingCostCodeType }
     *     
     */
    public AccountingCostCodeType getAccountingCostCode() {
        return accountingCostCode;
    }

    /**
     * Imposta il valore della proprietà accountingCostCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingCostCodeType }
     *     
     */
    public void setAccountingCostCode(AccountingCostCodeType value) {
        this.accountingCostCode = value;
    }

    /**
     * Recupera il valore della proprietà accountingCost.
     * 
     * @return
     *     possible object is
     *     {@link AccountingCostType }
     *     
     */
    public AccountingCostType getAccountingCost() {
        return accountingCost;
    }

    /**
     * Imposta il valore della proprietà accountingCost.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingCostType }
     *     
     */
    public void setAccountingCost(AccountingCostType value) {
        this.accountingCost = value;
    }

    /**
     * Gets the value of the warrantyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warrantyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrantyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarrantyInformationType }
     * 
     * 
     */
    public List<WarrantyInformationType> getWarrantyInformation() {
        if (warrantyInformation == null) {
            warrantyInformation = new ArrayList<WarrantyInformationType>();
        }
        return this.warrantyInformation;
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
     * Recupera il valore della proprietà deliveryTerms.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTermsType }
     *     
     */
    public DeliveryTermsType getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Imposta il valore della proprietà deliveryTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTermsType }
     *     
     */
    public void setDeliveryTerms(DeliveryTermsType value) {
        this.deliveryTerms = value;
    }

    /**
     * Recupera il valore della proprietà originatorParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getOriginatorParty() {
        return originatorParty;
    }

    /**
     * Imposta il valore della proprietà originatorParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setOriginatorParty(PartyType value) {
        this.originatorParty = value;
    }

    /**
     * Gets the value of the orderedShipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderedShipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderedShipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderedShipmentType }
     * 
     * 
     */
    public List<OrderedShipmentType> getOrderedShipment() {
        if (orderedShipment == null) {
            orderedShipment = new ArrayList<OrderedShipmentType>();
        }
        return this.orderedShipment;
    }

    /**
     * Recupera il valore della proprietà pricingReference.
     * 
     * @return
     *     possible object is
     *     {@link PricingReferenceType }
     *     
     */
    public PricingReferenceType getPricingReference() {
        return pricingReference;
    }

    /**
     * Imposta il valore della proprietà pricingReference.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingReferenceType }
     *     
     */
    public void setPricingReference(PricingReferenceType value) {
        this.pricingReference = value;
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
     * Gets the value of the subLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemType }
     * 
     * 
     */
    public List<LineItemType> getSubLineItem() {
        if (subLineItem == null) {
            subLineItem = new ArrayList<LineItemType>();
        }
        return this.subLineItem;
    }

    /**
     * Recupera il valore della proprietà warrantyValidityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getWarrantyValidityPeriod() {
        return warrantyValidityPeriod;
    }

    /**
     * Imposta il valore della proprietà warrantyValidityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setWarrantyValidityPeriod(PeriodType value) {
        this.warrantyValidityPeriod = value;
    }

    /**
     * Recupera il valore della proprietà warrantyParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getWarrantyParty() {
        return warrantyParty;
    }

    /**
     * Imposta il valore della proprietà warrantyParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setWarrantyParty(PartyType value) {
        this.warrantyParty = value;
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
     * Recupera il valore della proprietà itemPriceExtension.
     * 
     * @return
     *     possible object is
     *     {@link PriceExtensionType }
     *     
     */
    public PriceExtensionType getItemPriceExtension() {
        return itemPriceExtension;
    }

    /**
     * Imposta il valore della proprietà itemPriceExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceExtensionType }
     *     
     */
    public void setItemPriceExtension(PriceExtensionType value) {
        this.itemPriceExtension = value;
    }

    /**
     * Gets the value of the lineReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineReferenceType }
     * 
     * 
     */
    public List<LineReferenceType> getLineReference() {
        if (lineReference == null) {
            lineReference = new ArrayList<LineReferenceType>();
        }
        return this.lineReference;
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
            SalesOrderIDType theSalesOrderID;
            theSalesOrderID = this.getSalesOrderID();
            strategy.appendField(locator, this, "salesOrderID", buffer, theSalesOrderID, (this.salesOrderID!= null));
        }
        {
            UUIDType theUUID;
            theUUID = this.getUUID();
            strategy.appendField(locator, this, "uuid", buffer, theUUID, (this.uuid!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            strategy.appendField(locator, this, "note", buffer, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            LineStatusCodeType theLineStatusCode;
            theLineStatusCode = this.getLineStatusCode();
            strategy.appendField(locator, this, "lineStatusCode", buffer, theLineStatusCode, (this.lineStatusCode!= null));
        }
        {
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity, (this.quantity!= null));
        }
        {
            LineExtensionAmountType theLineExtensionAmount;
            theLineExtensionAmount = this.getLineExtensionAmount();
            strategy.appendField(locator, this, "lineExtensionAmount", buffer, theLineExtensionAmount, (this.lineExtensionAmount!= null));
        }
        {
            TotalTaxAmountType theTotalTaxAmount;
            theTotalTaxAmount = this.getTotalTaxAmount();
            strategy.appendField(locator, this, "totalTaxAmount", buffer, theTotalTaxAmount, (this.totalTaxAmount!= null));
        }
        {
            MinimumQuantityType theMinimumQuantity;
            theMinimumQuantity = this.getMinimumQuantity();
            strategy.appendField(locator, this, "minimumQuantity", buffer, theMinimumQuantity, (this.minimumQuantity!= null));
        }
        {
            MaximumQuantityType theMaximumQuantity;
            theMaximumQuantity = this.getMaximumQuantity();
            strategy.appendField(locator, this, "maximumQuantity", buffer, theMaximumQuantity, (this.maximumQuantity!= null));
        }
        {
            MinimumBackorderQuantityType theMinimumBackorderQuantity;
            theMinimumBackorderQuantity = this.getMinimumBackorderQuantity();
            strategy.appendField(locator, this, "minimumBackorderQuantity", buffer, theMinimumBackorderQuantity, (this.minimumBackorderQuantity!= null));
        }
        {
            MaximumBackorderQuantityType theMaximumBackorderQuantity;
            theMaximumBackorderQuantity = this.getMaximumBackorderQuantity();
            strategy.appendField(locator, this, "maximumBackorderQuantity", buffer, theMaximumBackorderQuantity, (this.maximumBackorderQuantity!= null));
        }
        {
            InspectionMethodCodeType theInspectionMethodCode;
            theInspectionMethodCode = this.getInspectionMethodCode();
            strategy.appendField(locator, this, "inspectionMethodCode", buffer, theInspectionMethodCode, (this.inspectionMethodCode!= null));
        }
        {
            PartialDeliveryIndicatorType thePartialDeliveryIndicator;
            thePartialDeliveryIndicator = this.getPartialDeliveryIndicator();
            strategy.appendField(locator, this, "partialDeliveryIndicator", buffer, thePartialDeliveryIndicator, (this.partialDeliveryIndicator!= null));
        }
        {
            BackOrderAllowedIndicatorType theBackOrderAllowedIndicator;
            theBackOrderAllowedIndicator = this.getBackOrderAllowedIndicator();
            strategy.appendField(locator, this, "backOrderAllowedIndicator", buffer, theBackOrderAllowedIndicator, (this.backOrderAllowedIndicator!= null));
        }
        {
            AccountingCostCodeType theAccountingCostCode;
            theAccountingCostCode = this.getAccountingCostCode();
            strategy.appendField(locator, this, "accountingCostCode", buffer, theAccountingCostCode, (this.accountingCostCode!= null));
        }
        {
            AccountingCostType theAccountingCost;
            theAccountingCost = this.getAccountingCost();
            strategy.appendField(locator, this, "accountingCost", buffer, theAccountingCost, (this.accountingCost!= null));
        }
        {
            List<WarrantyInformationType> theWarrantyInformation;
            theWarrantyInformation = (((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty()))?this.getWarrantyInformation():null);
            strategy.appendField(locator, this, "warrantyInformation", buffer, theWarrantyInformation, ((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty())));
        }
        {
            List<DeliveryType> theDelivery;
            theDelivery = (((this.delivery!= null)&&(!this.delivery.isEmpty()))?this.getDelivery():null);
            strategy.appendField(locator, this, "delivery", buffer, theDelivery, ((this.delivery!= null)&&(!this.delivery.isEmpty())));
        }
        {
            DeliveryTermsType theDeliveryTerms;
            theDeliveryTerms = this.getDeliveryTerms();
            strategy.appendField(locator, this, "deliveryTerms", buffer, theDeliveryTerms, (this.deliveryTerms!= null));
        }
        {
            PartyType theOriginatorParty;
            theOriginatorParty = this.getOriginatorParty();
            strategy.appendField(locator, this, "originatorParty", buffer, theOriginatorParty, (this.originatorParty!= null));
        }
        {
            List<OrderedShipmentType> theOrderedShipment;
            theOrderedShipment = (((this.orderedShipment!= null)&&(!this.orderedShipment.isEmpty()))?this.getOrderedShipment():null);
            strategy.appendField(locator, this, "orderedShipment", buffer, theOrderedShipment, ((this.orderedShipment!= null)&&(!this.orderedShipment.isEmpty())));
        }
        {
            PricingReferenceType thePricingReference;
            thePricingReference = this.getPricingReference();
            strategy.appendField(locator, this, "pricingReference", buffer, thePricingReference, (this.pricingReference!= null));
        }
        {
            List<AllowanceChargeType> theAllowanceCharge;
            theAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            strategy.appendField(locator, this, "allowanceCharge", buffer, theAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())));
        }
        {
            PriceType thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            strategy.appendField(locator, this, "item", buffer, theItem, (this.item!= null));
        }
        {
            List<LineItemType> theSubLineItem;
            theSubLineItem = (((this.subLineItem!= null)&&(!this.subLineItem.isEmpty()))?this.getSubLineItem():null);
            strategy.appendField(locator, this, "subLineItem", buffer, theSubLineItem, ((this.subLineItem!= null)&&(!this.subLineItem.isEmpty())));
        }
        {
            PeriodType theWarrantyValidityPeriod;
            theWarrantyValidityPeriod = this.getWarrantyValidityPeriod();
            strategy.appendField(locator, this, "warrantyValidityPeriod", buffer, theWarrantyValidityPeriod, (this.warrantyValidityPeriod!= null));
        }
        {
            PartyType theWarrantyParty;
            theWarrantyParty = this.getWarrantyParty();
            strategy.appendField(locator, this, "warrantyParty", buffer, theWarrantyParty, (this.warrantyParty!= null));
        }
        {
            List<TaxTotalType> theTaxTotal;
            theTaxTotal = (((this.taxTotal!= null)&&(!this.taxTotal.isEmpty()))?this.getTaxTotal():null);
            strategy.appendField(locator, this, "taxTotal", buffer, theTaxTotal, ((this.taxTotal!= null)&&(!this.taxTotal.isEmpty())));
        }
        {
            PriceExtensionType theItemPriceExtension;
            theItemPriceExtension = this.getItemPriceExtension();
            strategy.appendField(locator, this, "itemPriceExtension", buffer, theItemPriceExtension, (this.itemPriceExtension!= null));
        }
        {
            List<LineReferenceType> theLineReference;
            theLineReference = (((this.lineReference!= null)&&(!this.lineReference.isEmpty()))?this.getLineReference():null);
            strategy.appendField(locator, this, "lineReference", buffer, theLineReference, ((this.lineReference!= null)&&(!this.lineReference.isEmpty())));
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
        final LineItemType that = ((LineItemType) object);
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
            SalesOrderIDType lhsSalesOrderID;
            lhsSalesOrderID = this.getSalesOrderID();
            SalesOrderIDType rhsSalesOrderID;
            rhsSalesOrderID = that.getSalesOrderID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesOrderID", lhsSalesOrderID), LocatorUtils.property(thatLocator, "salesOrderID", rhsSalesOrderID), lhsSalesOrderID, rhsSalesOrderID, (this.salesOrderID!= null), (that.salesOrderID!= null))) {
                return false;
            }
        }
        {
            UUIDType lhsUUID;
            lhsUUID = this.getUUID();
            UUIDType rhsUUID;
            rhsUUID = that.getUUID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uuid", lhsUUID), LocatorUtils.property(thatLocator, "uuid", rhsUUID), lhsUUID, rhsUUID, (this.uuid!= null), (that.uuid!= null))) {
                return false;
            }
        }
        {
            List<NoteType> lhsNote;
            lhsNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            List<NoteType> rhsNote;
            rhsNote = (((that.note!= null)&&(!that.note.isEmpty()))?that.getNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote, ((this.note!= null)&&(!this.note.isEmpty())), ((that.note!= null)&&(!that.note.isEmpty())))) {
                return false;
            }
        }
        {
            LineStatusCodeType lhsLineStatusCode;
            lhsLineStatusCode = this.getLineStatusCode();
            LineStatusCodeType rhsLineStatusCode;
            rhsLineStatusCode = that.getLineStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineStatusCode", lhsLineStatusCode), LocatorUtils.property(thatLocator, "lineStatusCode", rhsLineStatusCode), lhsLineStatusCode, rhsLineStatusCode, (this.lineStatusCode!= null), (that.lineStatusCode!= null))) {
                return false;
            }
        }
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
            LineExtensionAmountType lhsLineExtensionAmount;
            lhsLineExtensionAmount = this.getLineExtensionAmount();
            LineExtensionAmountType rhsLineExtensionAmount;
            rhsLineExtensionAmount = that.getLineExtensionAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineExtensionAmount", lhsLineExtensionAmount), LocatorUtils.property(thatLocator, "lineExtensionAmount", rhsLineExtensionAmount), lhsLineExtensionAmount, rhsLineExtensionAmount, (this.lineExtensionAmount!= null), (that.lineExtensionAmount!= null))) {
                return false;
            }
        }
        {
            TotalTaxAmountType lhsTotalTaxAmount;
            lhsTotalTaxAmount = this.getTotalTaxAmount();
            TotalTaxAmountType rhsTotalTaxAmount;
            rhsTotalTaxAmount = that.getTotalTaxAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalTaxAmount", lhsTotalTaxAmount), LocatorUtils.property(thatLocator, "totalTaxAmount", rhsTotalTaxAmount), lhsTotalTaxAmount, rhsTotalTaxAmount, (this.totalTaxAmount!= null), (that.totalTaxAmount!= null))) {
                return false;
            }
        }
        {
            MinimumQuantityType lhsMinimumQuantity;
            lhsMinimumQuantity = this.getMinimumQuantity();
            MinimumQuantityType rhsMinimumQuantity;
            rhsMinimumQuantity = that.getMinimumQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumQuantity", lhsMinimumQuantity), LocatorUtils.property(thatLocator, "minimumQuantity", rhsMinimumQuantity), lhsMinimumQuantity, rhsMinimumQuantity, (this.minimumQuantity!= null), (that.minimumQuantity!= null))) {
                return false;
            }
        }
        {
            MaximumQuantityType lhsMaximumQuantity;
            lhsMaximumQuantity = this.getMaximumQuantity();
            MaximumQuantityType rhsMaximumQuantity;
            rhsMaximumQuantity = that.getMaximumQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumQuantity", lhsMaximumQuantity), LocatorUtils.property(thatLocator, "maximumQuantity", rhsMaximumQuantity), lhsMaximumQuantity, rhsMaximumQuantity, (this.maximumQuantity!= null), (that.maximumQuantity!= null))) {
                return false;
            }
        }
        {
            MinimumBackorderQuantityType lhsMinimumBackorderQuantity;
            lhsMinimumBackorderQuantity = this.getMinimumBackorderQuantity();
            MinimumBackorderQuantityType rhsMinimumBackorderQuantity;
            rhsMinimumBackorderQuantity = that.getMinimumBackorderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumBackorderQuantity", lhsMinimumBackorderQuantity), LocatorUtils.property(thatLocator, "minimumBackorderQuantity", rhsMinimumBackorderQuantity), lhsMinimumBackorderQuantity, rhsMinimumBackorderQuantity, (this.minimumBackorderQuantity!= null), (that.minimumBackorderQuantity!= null))) {
                return false;
            }
        }
        {
            MaximumBackorderQuantityType lhsMaximumBackorderQuantity;
            lhsMaximumBackorderQuantity = this.getMaximumBackorderQuantity();
            MaximumBackorderQuantityType rhsMaximumBackorderQuantity;
            rhsMaximumBackorderQuantity = that.getMaximumBackorderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumBackorderQuantity", lhsMaximumBackorderQuantity), LocatorUtils.property(thatLocator, "maximumBackorderQuantity", rhsMaximumBackorderQuantity), lhsMaximumBackorderQuantity, rhsMaximumBackorderQuantity, (this.maximumBackorderQuantity!= null), (that.maximumBackorderQuantity!= null))) {
                return false;
            }
        }
        {
            InspectionMethodCodeType lhsInspectionMethodCode;
            lhsInspectionMethodCode = this.getInspectionMethodCode();
            InspectionMethodCodeType rhsInspectionMethodCode;
            rhsInspectionMethodCode = that.getInspectionMethodCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inspectionMethodCode", lhsInspectionMethodCode), LocatorUtils.property(thatLocator, "inspectionMethodCode", rhsInspectionMethodCode), lhsInspectionMethodCode, rhsInspectionMethodCode, (this.inspectionMethodCode!= null), (that.inspectionMethodCode!= null))) {
                return false;
            }
        }
        {
            PartialDeliveryIndicatorType lhsPartialDeliveryIndicator;
            lhsPartialDeliveryIndicator = this.getPartialDeliveryIndicator();
            PartialDeliveryIndicatorType rhsPartialDeliveryIndicator;
            rhsPartialDeliveryIndicator = that.getPartialDeliveryIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partialDeliveryIndicator", lhsPartialDeliveryIndicator), LocatorUtils.property(thatLocator, "partialDeliveryIndicator", rhsPartialDeliveryIndicator), lhsPartialDeliveryIndicator, rhsPartialDeliveryIndicator, (this.partialDeliveryIndicator!= null), (that.partialDeliveryIndicator!= null))) {
                return false;
            }
        }
        {
            BackOrderAllowedIndicatorType lhsBackOrderAllowedIndicator;
            lhsBackOrderAllowedIndicator = this.getBackOrderAllowedIndicator();
            BackOrderAllowedIndicatorType rhsBackOrderAllowedIndicator;
            rhsBackOrderAllowedIndicator = that.getBackOrderAllowedIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "backOrderAllowedIndicator", lhsBackOrderAllowedIndicator), LocatorUtils.property(thatLocator, "backOrderAllowedIndicator", rhsBackOrderAllowedIndicator), lhsBackOrderAllowedIndicator, rhsBackOrderAllowedIndicator, (this.backOrderAllowedIndicator!= null), (that.backOrderAllowedIndicator!= null))) {
                return false;
            }
        }
        {
            AccountingCostCodeType lhsAccountingCostCode;
            lhsAccountingCostCode = this.getAccountingCostCode();
            AccountingCostCodeType rhsAccountingCostCode;
            rhsAccountingCostCode = that.getAccountingCostCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountingCostCode", lhsAccountingCostCode), LocatorUtils.property(thatLocator, "accountingCostCode", rhsAccountingCostCode), lhsAccountingCostCode, rhsAccountingCostCode, (this.accountingCostCode!= null), (that.accountingCostCode!= null))) {
                return false;
            }
        }
        {
            AccountingCostType lhsAccountingCost;
            lhsAccountingCost = this.getAccountingCost();
            AccountingCostType rhsAccountingCost;
            rhsAccountingCost = that.getAccountingCost();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountingCost", lhsAccountingCost), LocatorUtils.property(thatLocator, "accountingCost", rhsAccountingCost), lhsAccountingCost, rhsAccountingCost, (this.accountingCost!= null), (that.accountingCost!= null))) {
                return false;
            }
        }
        {
            List<WarrantyInformationType> lhsWarrantyInformation;
            lhsWarrantyInformation = (((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty()))?this.getWarrantyInformation():null);
            List<WarrantyInformationType> rhsWarrantyInformation;
            rhsWarrantyInformation = (((that.warrantyInformation!= null)&&(!that.warrantyInformation.isEmpty()))?that.getWarrantyInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyInformation", lhsWarrantyInformation), LocatorUtils.property(thatLocator, "warrantyInformation", rhsWarrantyInformation), lhsWarrantyInformation, rhsWarrantyInformation, ((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty())), ((that.warrantyInformation!= null)&&(!that.warrantyInformation.isEmpty())))) {
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
            DeliveryTermsType lhsDeliveryTerms;
            lhsDeliveryTerms = this.getDeliveryTerms();
            DeliveryTermsType rhsDeliveryTerms;
            rhsDeliveryTerms = that.getDeliveryTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryTerms", lhsDeliveryTerms), LocatorUtils.property(thatLocator, "deliveryTerms", rhsDeliveryTerms), lhsDeliveryTerms, rhsDeliveryTerms, (this.deliveryTerms!= null), (that.deliveryTerms!= null))) {
                return false;
            }
        }
        {
            PartyType lhsOriginatorParty;
            lhsOriginatorParty = this.getOriginatorParty();
            PartyType rhsOriginatorParty;
            rhsOriginatorParty = that.getOriginatorParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originatorParty", lhsOriginatorParty), LocatorUtils.property(thatLocator, "originatorParty", rhsOriginatorParty), lhsOriginatorParty, rhsOriginatorParty, (this.originatorParty!= null), (that.originatorParty!= null))) {
                return false;
            }
        }
        {
            List<OrderedShipmentType> lhsOrderedShipment;
            lhsOrderedShipment = (((this.orderedShipment!= null)&&(!this.orderedShipment.isEmpty()))?this.getOrderedShipment():null);
            List<OrderedShipmentType> rhsOrderedShipment;
            rhsOrderedShipment = (((that.orderedShipment!= null)&&(!that.orderedShipment.isEmpty()))?that.getOrderedShipment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderedShipment", lhsOrderedShipment), LocatorUtils.property(thatLocator, "orderedShipment", rhsOrderedShipment), lhsOrderedShipment, rhsOrderedShipment, ((this.orderedShipment!= null)&&(!this.orderedShipment.isEmpty())), ((that.orderedShipment!= null)&&(!that.orderedShipment.isEmpty())))) {
                return false;
            }
        }
        {
            PricingReferenceType lhsPricingReference;
            lhsPricingReference = this.getPricingReference();
            PricingReferenceType rhsPricingReference;
            rhsPricingReference = that.getPricingReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pricingReference", lhsPricingReference), LocatorUtils.property(thatLocator, "pricingReference", rhsPricingReference), lhsPricingReference, rhsPricingReference, (this.pricingReference!= null), (that.pricingReference!= null))) {
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
            PriceType lhsPrice;
            lhsPrice = this.getPrice();
            PriceType rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice, (this.price!= null), (that.price!= null))) {
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
            List<LineItemType> lhsSubLineItem;
            lhsSubLineItem = (((this.subLineItem!= null)&&(!this.subLineItem.isEmpty()))?this.getSubLineItem():null);
            List<LineItemType> rhsSubLineItem;
            rhsSubLineItem = (((that.subLineItem!= null)&&(!that.subLineItem.isEmpty()))?that.getSubLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subLineItem", lhsSubLineItem), LocatorUtils.property(thatLocator, "subLineItem", rhsSubLineItem), lhsSubLineItem, rhsSubLineItem, ((this.subLineItem!= null)&&(!this.subLineItem.isEmpty())), ((that.subLineItem!= null)&&(!that.subLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            PeriodType lhsWarrantyValidityPeriod;
            lhsWarrantyValidityPeriod = this.getWarrantyValidityPeriod();
            PeriodType rhsWarrantyValidityPeriod;
            rhsWarrantyValidityPeriod = that.getWarrantyValidityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyValidityPeriod", lhsWarrantyValidityPeriod), LocatorUtils.property(thatLocator, "warrantyValidityPeriod", rhsWarrantyValidityPeriod), lhsWarrantyValidityPeriod, rhsWarrantyValidityPeriod, (this.warrantyValidityPeriod!= null), (that.warrantyValidityPeriod!= null))) {
                return false;
            }
        }
        {
            PartyType lhsWarrantyParty;
            lhsWarrantyParty = this.getWarrantyParty();
            PartyType rhsWarrantyParty;
            rhsWarrantyParty = that.getWarrantyParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyParty", lhsWarrantyParty), LocatorUtils.property(thatLocator, "warrantyParty", rhsWarrantyParty), lhsWarrantyParty, rhsWarrantyParty, (this.warrantyParty!= null), (that.warrantyParty!= null))) {
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
            PriceExtensionType lhsItemPriceExtension;
            lhsItemPriceExtension = this.getItemPriceExtension();
            PriceExtensionType rhsItemPriceExtension;
            rhsItemPriceExtension = that.getItemPriceExtension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemPriceExtension", lhsItemPriceExtension), LocatorUtils.property(thatLocator, "itemPriceExtension", rhsItemPriceExtension), lhsItemPriceExtension, rhsItemPriceExtension, (this.itemPriceExtension!= null), (that.itemPriceExtension!= null))) {
                return false;
            }
        }
        {
            List<LineReferenceType> lhsLineReference;
            lhsLineReference = (((this.lineReference!= null)&&(!this.lineReference.isEmpty()))?this.getLineReference():null);
            List<LineReferenceType> rhsLineReference;
            rhsLineReference = (((that.lineReference!= null)&&(!that.lineReference.isEmpty()))?that.getLineReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineReference", lhsLineReference), LocatorUtils.property(thatLocator, "lineReference", rhsLineReference), lhsLineReference, rhsLineReference, ((this.lineReference!= null)&&(!this.lineReference.isEmpty())), ((that.lineReference!= null)&&(!that.lineReference.isEmpty())))) {
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
            SalesOrderIDType theSalesOrderID;
            theSalesOrderID = this.getSalesOrderID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesOrderID", theSalesOrderID), currentHashCode, theSalesOrderID, (this.salesOrderID!= null));
        }
        {
            UUIDType theUUID;
            theUUID = this.getUUID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uuid", theUUID), currentHashCode, theUUID, (this.uuid!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            LineStatusCodeType theLineStatusCode;
            theLineStatusCode = this.getLineStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineStatusCode", theLineStatusCode), currentHashCode, theLineStatusCode, (this.lineStatusCode!= null));
        }
        {
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, (this.quantity!= null));
        }
        {
            LineExtensionAmountType theLineExtensionAmount;
            theLineExtensionAmount = this.getLineExtensionAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineExtensionAmount", theLineExtensionAmount), currentHashCode, theLineExtensionAmount, (this.lineExtensionAmount!= null));
        }
        {
            TotalTaxAmountType theTotalTaxAmount;
            theTotalTaxAmount = this.getTotalTaxAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalTaxAmount", theTotalTaxAmount), currentHashCode, theTotalTaxAmount, (this.totalTaxAmount!= null));
        }
        {
            MinimumQuantityType theMinimumQuantity;
            theMinimumQuantity = this.getMinimumQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumQuantity", theMinimumQuantity), currentHashCode, theMinimumQuantity, (this.minimumQuantity!= null));
        }
        {
            MaximumQuantityType theMaximumQuantity;
            theMaximumQuantity = this.getMaximumQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumQuantity", theMaximumQuantity), currentHashCode, theMaximumQuantity, (this.maximumQuantity!= null));
        }
        {
            MinimumBackorderQuantityType theMinimumBackorderQuantity;
            theMinimumBackorderQuantity = this.getMinimumBackorderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumBackorderQuantity", theMinimumBackorderQuantity), currentHashCode, theMinimumBackorderQuantity, (this.minimumBackorderQuantity!= null));
        }
        {
            MaximumBackorderQuantityType theMaximumBackorderQuantity;
            theMaximumBackorderQuantity = this.getMaximumBackorderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumBackorderQuantity", theMaximumBackorderQuantity), currentHashCode, theMaximumBackorderQuantity, (this.maximumBackorderQuantity!= null));
        }
        {
            InspectionMethodCodeType theInspectionMethodCode;
            theInspectionMethodCode = this.getInspectionMethodCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inspectionMethodCode", theInspectionMethodCode), currentHashCode, theInspectionMethodCode, (this.inspectionMethodCode!= null));
        }
        {
            PartialDeliveryIndicatorType thePartialDeliveryIndicator;
            thePartialDeliveryIndicator = this.getPartialDeliveryIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partialDeliveryIndicator", thePartialDeliveryIndicator), currentHashCode, thePartialDeliveryIndicator, (this.partialDeliveryIndicator!= null));
        }
        {
            BackOrderAllowedIndicatorType theBackOrderAllowedIndicator;
            theBackOrderAllowedIndicator = this.getBackOrderAllowedIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "backOrderAllowedIndicator", theBackOrderAllowedIndicator), currentHashCode, theBackOrderAllowedIndicator, (this.backOrderAllowedIndicator!= null));
        }
        {
            AccountingCostCodeType theAccountingCostCode;
            theAccountingCostCode = this.getAccountingCostCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountingCostCode", theAccountingCostCode), currentHashCode, theAccountingCostCode, (this.accountingCostCode!= null));
        }
        {
            AccountingCostType theAccountingCost;
            theAccountingCost = this.getAccountingCost();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountingCost", theAccountingCost), currentHashCode, theAccountingCost, (this.accountingCost!= null));
        }
        {
            List<WarrantyInformationType> theWarrantyInformation;
            theWarrantyInformation = (((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty()))?this.getWarrantyInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyInformation", theWarrantyInformation), currentHashCode, theWarrantyInformation, ((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty())));
        }
        {
            List<DeliveryType> theDelivery;
            theDelivery = (((this.delivery!= null)&&(!this.delivery.isEmpty()))?this.getDelivery():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "delivery", theDelivery), currentHashCode, theDelivery, ((this.delivery!= null)&&(!this.delivery.isEmpty())));
        }
        {
            DeliveryTermsType theDeliveryTerms;
            theDeliveryTerms = this.getDeliveryTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryTerms", theDeliveryTerms), currentHashCode, theDeliveryTerms, (this.deliveryTerms!= null));
        }
        {
            PartyType theOriginatorParty;
            theOriginatorParty = this.getOriginatorParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originatorParty", theOriginatorParty), currentHashCode, theOriginatorParty, (this.originatorParty!= null));
        }
        {
            List<OrderedShipmentType> theOrderedShipment;
            theOrderedShipment = (((this.orderedShipment!= null)&&(!this.orderedShipment.isEmpty()))?this.getOrderedShipment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderedShipment", theOrderedShipment), currentHashCode, theOrderedShipment, ((this.orderedShipment!= null)&&(!this.orderedShipment.isEmpty())));
        }
        {
            PricingReferenceType thePricingReference;
            thePricingReference = this.getPricingReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pricingReference", thePricingReference), currentHashCode, thePricingReference, (this.pricingReference!= null));
        }
        {
            List<AllowanceChargeType> theAllowanceCharge;
            theAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowanceCharge", theAllowanceCharge), currentHashCode, theAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())));
        }
        {
            PriceType thePrice;
            thePrice = this.getPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "price", thePrice), currentHashCode, thePrice, (this.price!= null));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "item", theItem), currentHashCode, theItem, (this.item!= null));
        }
        {
            List<LineItemType> theSubLineItem;
            theSubLineItem = (((this.subLineItem!= null)&&(!this.subLineItem.isEmpty()))?this.getSubLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subLineItem", theSubLineItem), currentHashCode, theSubLineItem, ((this.subLineItem!= null)&&(!this.subLineItem.isEmpty())));
        }
        {
            PeriodType theWarrantyValidityPeriod;
            theWarrantyValidityPeriod = this.getWarrantyValidityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyValidityPeriod", theWarrantyValidityPeriod), currentHashCode, theWarrantyValidityPeriod, (this.warrantyValidityPeriod!= null));
        }
        {
            PartyType theWarrantyParty;
            theWarrantyParty = this.getWarrantyParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyParty", theWarrantyParty), currentHashCode, theWarrantyParty, (this.warrantyParty!= null));
        }
        {
            List<TaxTotalType> theTaxTotal;
            theTaxTotal = (((this.taxTotal!= null)&&(!this.taxTotal.isEmpty()))?this.getTaxTotal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxTotal", theTaxTotal), currentHashCode, theTaxTotal, ((this.taxTotal!= null)&&(!this.taxTotal.isEmpty())));
        }
        {
            PriceExtensionType theItemPriceExtension;
            theItemPriceExtension = this.getItemPriceExtension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemPriceExtension", theItemPriceExtension), currentHashCode, theItemPriceExtension, (this.itemPriceExtension!= null));
        }
        {
            List<LineReferenceType> theLineReference;
            theLineReference = (((this.lineReference!= null)&&(!this.lineReference.isEmpty()))?this.getLineReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineReference", theLineReference), currentHashCode, theLineReference, ((this.lineReference!= null)&&(!this.lineReference.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
