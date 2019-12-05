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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DebitedQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineExtensionAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentPurposeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxPointDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UUIDType;
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
 * <p>Classe Java per DebitNoteLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DebitNoteLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DebitedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineExtensionAmount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxPointDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCostCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCost" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentPurposeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DiscrepancyResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchLineReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReceiptLineReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BillingReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PricingReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Price" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubDebitNoteLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitNoteLineType", propOrder = {
    "id",
    "uuid",
    "note",
    "debitedQuantity",
    "lineExtensionAmount",
    "taxPointDate",
    "accountingCostCode",
    "accountingCost",
    "paymentPurposeCode",
    "discrepancyResponse",
    "despatchLineReference",
    "receiptLineReference",
    "billingReference",
    "documentReference",
    "pricingReference",
    "delivery",
    "taxTotal",
    "allowanceCharge",
    "item",
    "price",
    "subDebitNoteLine"
})
public class DebitNoteLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUIDType uuid;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "DebitedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DebitedQuantityType debitedQuantity;
    @XmlElement(name = "LineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected LineExtensionAmountType lineExtensionAmount;
    @XmlElement(name = "TaxPointDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxPointDateType taxPointDate;
    @XmlElement(name = "AccountingCostCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountingCostCodeType accountingCostCode;
    @XmlElement(name = "AccountingCost", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountingCostType accountingCost;
    @XmlElement(name = "PaymentPurposeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentPurposeCodeType paymentPurposeCode;
    @XmlElement(name = "DiscrepancyResponse")
    protected List<ResponseType> discrepancyResponse;
    @XmlElement(name = "DespatchLineReference")
    protected List<LineReferenceType> despatchLineReference;
    @XmlElement(name = "ReceiptLineReference")
    protected List<LineReferenceType> receiptLineReference;
    @XmlElement(name = "BillingReference")
    protected List<BillingReferenceType> billingReference;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "PricingReference")
    protected PricingReferenceType pricingReference;
    @XmlElement(name = "Delivery")
    protected List<DeliveryType> delivery;
    @XmlElement(name = "TaxTotal")
    protected List<TaxTotalType> taxTotal;
    @XmlElement(name = "AllowanceCharge")
    protected List<AllowanceChargeType> allowanceCharge;
    @XmlElement(name = "Item")
    protected ItemType item;
    @XmlElement(name = "Price")
    protected PriceType price;
    @XmlElement(name = "SubDebitNoteLine")
    protected List<DebitNoteLineType> subDebitNoteLine;

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
     * Recupera il valore della proprietà debitedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link DebitedQuantityType }
     *     
     */
    public DebitedQuantityType getDebitedQuantity() {
        return debitedQuantity;
    }

    /**
     * Imposta il valore della proprietà debitedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitedQuantityType }
     *     
     */
    public void setDebitedQuantity(DebitedQuantityType value) {
        this.debitedQuantity = value;
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
     * Recupera il valore della proprietà taxPointDate.
     * 
     * @return
     *     possible object is
     *     {@link TaxPointDateType }
     *     
     */
    public TaxPointDateType getTaxPointDate() {
        return taxPointDate;
    }

    /**
     * Imposta il valore della proprietà taxPointDate.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPointDateType }
     *     
     */
    public void setTaxPointDate(TaxPointDateType value) {
        this.taxPointDate = value;
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
     * Recupera il valore della proprietà paymentPurposeCode.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPurposeCodeType }
     *     
     */
    public PaymentPurposeCodeType getPaymentPurposeCode() {
        return paymentPurposeCode;
    }

    /**
     * Imposta il valore della proprietà paymentPurposeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPurposeCodeType }
     *     
     */
    public void setPaymentPurposeCode(PaymentPurposeCodeType value) {
        this.paymentPurposeCode = value;
    }

    /**
     * Gets the value of the discrepancyResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discrepancyResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscrepancyResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseType }
     * 
     * 
     */
    public List<ResponseType> getDiscrepancyResponse() {
        if (discrepancyResponse == null) {
            discrepancyResponse = new ArrayList<ResponseType>();
        }
        return this.discrepancyResponse;
    }

    /**
     * Gets the value of the despatchLineReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the despatchLineReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDespatchLineReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineReferenceType }
     * 
     * 
     */
    public List<LineReferenceType> getDespatchLineReference() {
        if (despatchLineReference == null) {
            despatchLineReference = new ArrayList<LineReferenceType>();
        }
        return this.despatchLineReference;
    }

    /**
     * Gets the value of the receiptLineReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiptLineReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiptLineReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineReferenceType }
     * 
     * 
     */
    public List<LineReferenceType> getReceiptLineReference() {
        if (receiptLineReference == null) {
            receiptLineReference = new ArrayList<LineReferenceType>();
        }
        return this.receiptLineReference;
    }

    /**
     * Gets the value of the billingReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingReferenceType }
     * 
     * 
     */
    public List<BillingReferenceType> getBillingReference() {
        if (billingReference == null) {
            billingReference = new ArrayList<BillingReferenceType>();
        }
        return this.billingReference;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReference;
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
     * Gets the value of the subDebitNoteLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subDebitNoteLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubDebitNoteLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DebitNoteLineType }
     * 
     * 
     */
    public List<DebitNoteLineType> getSubDebitNoteLine() {
        if (subDebitNoteLine == null) {
            subDebitNoteLine = new ArrayList<DebitNoteLineType>();
        }
        return this.subDebitNoteLine;
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
            DebitedQuantityType theDebitedQuantity;
            theDebitedQuantity = this.getDebitedQuantity();
            strategy.appendField(locator, this, "debitedQuantity", buffer, theDebitedQuantity, (this.debitedQuantity!= null));
        }
        {
            LineExtensionAmountType theLineExtensionAmount;
            theLineExtensionAmount = this.getLineExtensionAmount();
            strategy.appendField(locator, this, "lineExtensionAmount", buffer, theLineExtensionAmount, (this.lineExtensionAmount!= null));
        }
        {
            TaxPointDateType theTaxPointDate;
            theTaxPointDate = this.getTaxPointDate();
            strategy.appendField(locator, this, "taxPointDate", buffer, theTaxPointDate, (this.taxPointDate!= null));
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
            PaymentPurposeCodeType thePaymentPurposeCode;
            thePaymentPurposeCode = this.getPaymentPurposeCode();
            strategy.appendField(locator, this, "paymentPurposeCode", buffer, thePaymentPurposeCode, (this.paymentPurposeCode!= null));
        }
        {
            List<ResponseType> theDiscrepancyResponse;
            theDiscrepancyResponse = (((this.discrepancyResponse!= null)&&(!this.discrepancyResponse.isEmpty()))?this.getDiscrepancyResponse():null);
            strategy.appendField(locator, this, "discrepancyResponse", buffer, theDiscrepancyResponse, ((this.discrepancyResponse!= null)&&(!this.discrepancyResponse.isEmpty())));
        }
        {
            List<LineReferenceType> theDespatchLineReference;
            theDespatchLineReference = (((this.despatchLineReference!= null)&&(!this.despatchLineReference.isEmpty()))?this.getDespatchLineReference():null);
            strategy.appendField(locator, this, "despatchLineReference", buffer, theDespatchLineReference, ((this.despatchLineReference!= null)&&(!this.despatchLineReference.isEmpty())));
        }
        {
            List<LineReferenceType> theReceiptLineReference;
            theReceiptLineReference = (((this.receiptLineReference!= null)&&(!this.receiptLineReference.isEmpty()))?this.getReceiptLineReference():null);
            strategy.appendField(locator, this, "receiptLineReference", buffer, theReceiptLineReference, ((this.receiptLineReference!= null)&&(!this.receiptLineReference.isEmpty())));
        }
        {
            List<BillingReferenceType> theBillingReference;
            theBillingReference = (((this.billingReference!= null)&&(!this.billingReference.isEmpty()))?this.getBillingReference():null);
            strategy.appendField(locator, this, "billingReference", buffer, theBillingReference, ((this.billingReference!= null)&&(!this.billingReference.isEmpty())));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            strategy.appendField(locator, this, "documentReference", buffer, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            PricingReferenceType thePricingReference;
            thePricingReference = this.getPricingReference();
            strategy.appendField(locator, this, "pricingReference", buffer, thePricingReference, (this.pricingReference!= null));
        }
        {
            List<DeliveryType> theDelivery;
            theDelivery = (((this.delivery!= null)&&(!this.delivery.isEmpty()))?this.getDelivery():null);
            strategy.appendField(locator, this, "delivery", buffer, theDelivery, ((this.delivery!= null)&&(!this.delivery.isEmpty())));
        }
        {
            List<TaxTotalType> theTaxTotal;
            theTaxTotal = (((this.taxTotal!= null)&&(!this.taxTotal.isEmpty()))?this.getTaxTotal():null);
            strategy.appendField(locator, this, "taxTotal", buffer, theTaxTotal, ((this.taxTotal!= null)&&(!this.taxTotal.isEmpty())));
        }
        {
            List<AllowanceChargeType> theAllowanceCharge;
            theAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            strategy.appendField(locator, this, "allowanceCharge", buffer, theAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            strategy.appendField(locator, this, "item", buffer, theItem, (this.item!= null));
        }
        {
            PriceType thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            List<DebitNoteLineType> theSubDebitNoteLine;
            theSubDebitNoteLine = (((this.subDebitNoteLine!= null)&&(!this.subDebitNoteLine.isEmpty()))?this.getSubDebitNoteLine():null);
            strategy.appendField(locator, this, "subDebitNoteLine", buffer, theSubDebitNoteLine, ((this.subDebitNoteLine!= null)&&(!this.subDebitNoteLine.isEmpty())));
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
        final DebitNoteLineType that = ((DebitNoteLineType) object);
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
            DebitedQuantityType lhsDebitedQuantity;
            lhsDebitedQuantity = this.getDebitedQuantity();
            DebitedQuantityType rhsDebitedQuantity;
            rhsDebitedQuantity = that.getDebitedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "debitedQuantity", lhsDebitedQuantity), LocatorUtils.property(thatLocator, "debitedQuantity", rhsDebitedQuantity), lhsDebitedQuantity, rhsDebitedQuantity, (this.debitedQuantity!= null), (that.debitedQuantity!= null))) {
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
            TaxPointDateType lhsTaxPointDate;
            lhsTaxPointDate = this.getTaxPointDate();
            TaxPointDateType rhsTaxPointDate;
            rhsTaxPointDate = that.getTaxPointDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxPointDate", lhsTaxPointDate), LocatorUtils.property(thatLocator, "taxPointDate", rhsTaxPointDate), lhsTaxPointDate, rhsTaxPointDate, (this.taxPointDate!= null), (that.taxPointDate!= null))) {
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
            PaymentPurposeCodeType lhsPaymentPurposeCode;
            lhsPaymentPurposeCode = this.getPaymentPurposeCode();
            PaymentPurposeCodeType rhsPaymentPurposeCode;
            rhsPaymentPurposeCode = that.getPaymentPurposeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentPurposeCode", lhsPaymentPurposeCode), LocatorUtils.property(thatLocator, "paymentPurposeCode", rhsPaymentPurposeCode), lhsPaymentPurposeCode, rhsPaymentPurposeCode, (this.paymentPurposeCode!= null), (that.paymentPurposeCode!= null))) {
                return false;
            }
        }
        {
            List<ResponseType> lhsDiscrepancyResponse;
            lhsDiscrepancyResponse = (((this.discrepancyResponse!= null)&&(!this.discrepancyResponse.isEmpty()))?this.getDiscrepancyResponse():null);
            List<ResponseType> rhsDiscrepancyResponse;
            rhsDiscrepancyResponse = (((that.discrepancyResponse!= null)&&(!that.discrepancyResponse.isEmpty()))?that.getDiscrepancyResponse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discrepancyResponse", lhsDiscrepancyResponse), LocatorUtils.property(thatLocator, "discrepancyResponse", rhsDiscrepancyResponse), lhsDiscrepancyResponse, rhsDiscrepancyResponse, ((this.discrepancyResponse!= null)&&(!this.discrepancyResponse.isEmpty())), ((that.discrepancyResponse!= null)&&(!that.discrepancyResponse.isEmpty())))) {
                return false;
            }
        }
        {
            List<LineReferenceType> lhsDespatchLineReference;
            lhsDespatchLineReference = (((this.despatchLineReference!= null)&&(!this.despatchLineReference.isEmpty()))?this.getDespatchLineReference():null);
            List<LineReferenceType> rhsDespatchLineReference;
            rhsDespatchLineReference = (((that.despatchLineReference!= null)&&(!that.despatchLineReference.isEmpty()))?that.getDespatchLineReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "despatchLineReference", lhsDespatchLineReference), LocatorUtils.property(thatLocator, "despatchLineReference", rhsDespatchLineReference), lhsDespatchLineReference, rhsDespatchLineReference, ((this.despatchLineReference!= null)&&(!this.despatchLineReference.isEmpty())), ((that.despatchLineReference!= null)&&(!that.despatchLineReference.isEmpty())))) {
                return false;
            }
        }
        {
            List<LineReferenceType> lhsReceiptLineReference;
            lhsReceiptLineReference = (((this.receiptLineReference!= null)&&(!this.receiptLineReference.isEmpty()))?this.getReceiptLineReference():null);
            List<LineReferenceType> rhsReceiptLineReference;
            rhsReceiptLineReference = (((that.receiptLineReference!= null)&&(!that.receiptLineReference.isEmpty()))?that.getReceiptLineReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receiptLineReference", lhsReceiptLineReference), LocatorUtils.property(thatLocator, "receiptLineReference", rhsReceiptLineReference), lhsReceiptLineReference, rhsReceiptLineReference, ((this.receiptLineReference!= null)&&(!this.receiptLineReference.isEmpty())), ((that.receiptLineReference!= null)&&(!that.receiptLineReference.isEmpty())))) {
                return false;
            }
        }
        {
            List<BillingReferenceType> lhsBillingReference;
            lhsBillingReference = (((this.billingReference!= null)&&(!this.billingReference.isEmpty()))?this.getBillingReference():null);
            List<BillingReferenceType> rhsBillingReference;
            rhsBillingReference = (((that.billingReference!= null)&&(!that.billingReference.isEmpty()))?that.getBillingReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billingReference", lhsBillingReference), LocatorUtils.property(thatLocator, "billingReference", rhsBillingReference), lhsBillingReference, rhsBillingReference, ((this.billingReference!= null)&&(!this.billingReference.isEmpty())), ((that.billingReference!= null)&&(!that.billingReference.isEmpty())))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsDocumentReference;
            lhsDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            List<DocumentReferenceType> rhsDocumentReference;
            rhsDocumentReference = (((that.documentReference!= null)&&(!that.documentReference.isEmpty()))?that.getDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentReference", lhsDocumentReference), LocatorUtils.property(thatLocator, "documentReference", rhsDocumentReference), lhsDocumentReference, rhsDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())), ((that.documentReference!= null)&&(!that.documentReference.isEmpty())))) {
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
            List<DeliveryType> lhsDelivery;
            lhsDelivery = (((this.delivery!= null)&&(!this.delivery.isEmpty()))?this.getDelivery():null);
            List<DeliveryType> rhsDelivery;
            rhsDelivery = (((that.delivery!= null)&&(!that.delivery.isEmpty()))?that.getDelivery():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "delivery", lhsDelivery), LocatorUtils.property(thatLocator, "delivery", rhsDelivery), lhsDelivery, rhsDelivery, ((this.delivery!= null)&&(!this.delivery.isEmpty())), ((that.delivery!= null)&&(!that.delivery.isEmpty())))) {
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
            List<AllowanceChargeType> lhsAllowanceCharge;
            lhsAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            List<AllowanceChargeType> rhsAllowanceCharge;
            rhsAllowanceCharge = (((that.allowanceCharge!= null)&&(!that.allowanceCharge.isEmpty()))?that.getAllowanceCharge():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowanceCharge", lhsAllowanceCharge), LocatorUtils.property(thatLocator, "allowanceCharge", rhsAllowanceCharge), lhsAllowanceCharge, rhsAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())), ((that.allowanceCharge!= null)&&(!that.allowanceCharge.isEmpty())))) {
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
            PriceType lhsPrice;
            lhsPrice = this.getPrice();
            PriceType rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice, (this.price!= null), (that.price!= null))) {
                return false;
            }
        }
        {
            List<DebitNoteLineType> lhsSubDebitNoteLine;
            lhsSubDebitNoteLine = (((this.subDebitNoteLine!= null)&&(!this.subDebitNoteLine.isEmpty()))?this.getSubDebitNoteLine():null);
            List<DebitNoteLineType> rhsSubDebitNoteLine;
            rhsSubDebitNoteLine = (((that.subDebitNoteLine!= null)&&(!that.subDebitNoteLine.isEmpty()))?that.getSubDebitNoteLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subDebitNoteLine", lhsSubDebitNoteLine), LocatorUtils.property(thatLocator, "subDebitNoteLine", rhsSubDebitNoteLine), lhsSubDebitNoteLine, rhsSubDebitNoteLine, ((this.subDebitNoteLine!= null)&&(!this.subDebitNoteLine.isEmpty())), ((that.subDebitNoteLine!= null)&&(!that.subDebitNoteLine.isEmpty())))) {
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
            DebitedQuantityType theDebitedQuantity;
            theDebitedQuantity = this.getDebitedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "debitedQuantity", theDebitedQuantity), currentHashCode, theDebitedQuantity, (this.debitedQuantity!= null));
        }
        {
            LineExtensionAmountType theLineExtensionAmount;
            theLineExtensionAmount = this.getLineExtensionAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineExtensionAmount", theLineExtensionAmount), currentHashCode, theLineExtensionAmount, (this.lineExtensionAmount!= null));
        }
        {
            TaxPointDateType theTaxPointDate;
            theTaxPointDate = this.getTaxPointDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxPointDate", theTaxPointDate), currentHashCode, theTaxPointDate, (this.taxPointDate!= null));
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
            PaymentPurposeCodeType thePaymentPurposeCode;
            thePaymentPurposeCode = this.getPaymentPurposeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentPurposeCode", thePaymentPurposeCode), currentHashCode, thePaymentPurposeCode, (this.paymentPurposeCode!= null));
        }
        {
            List<ResponseType> theDiscrepancyResponse;
            theDiscrepancyResponse = (((this.discrepancyResponse!= null)&&(!this.discrepancyResponse.isEmpty()))?this.getDiscrepancyResponse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discrepancyResponse", theDiscrepancyResponse), currentHashCode, theDiscrepancyResponse, ((this.discrepancyResponse!= null)&&(!this.discrepancyResponse.isEmpty())));
        }
        {
            List<LineReferenceType> theDespatchLineReference;
            theDespatchLineReference = (((this.despatchLineReference!= null)&&(!this.despatchLineReference.isEmpty()))?this.getDespatchLineReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "despatchLineReference", theDespatchLineReference), currentHashCode, theDespatchLineReference, ((this.despatchLineReference!= null)&&(!this.despatchLineReference.isEmpty())));
        }
        {
            List<LineReferenceType> theReceiptLineReference;
            theReceiptLineReference = (((this.receiptLineReference!= null)&&(!this.receiptLineReference.isEmpty()))?this.getReceiptLineReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receiptLineReference", theReceiptLineReference), currentHashCode, theReceiptLineReference, ((this.receiptLineReference!= null)&&(!this.receiptLineReference.isEmpty())));
        }
        {
            List<BillingReferenceType> theBillingReference;
            theBillingReference = (((this.billingReference!= null)&&(!this.billingReference.isEmpty()))?this.getBillingReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billingReference", theBillingReference), currentHashCode, theBillingReference, ((this.billingReference!= null)&&(!this.billingReference.isEmpty())));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentReference", theDocumentReference), currentHashCode, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            PricingReferenceType thePricingReference;
            thePricingReference = this.getPricingReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pricingReference", thePricingReference), currentHashCode, thePricingReference, (this.pricingReference!= null));
        }
        {
            List<DeliveryType> theDelivery;
            theDelivery = (((this.delivery!= null)&&(!this.delivery.isEmpty()))?this.getDelivery():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "delivery", theDelivery), currentHashCode, theDelivery, ((this.delivery!= null)&&(!this.delivery.isEmpty())));
        }
        {
            List<TaxTotalType> theTaxTotal;
            theTaxTotal = (((this.taxTotal!= null)&&(!this.taxTotal.isEmpty()))?this.getTaxTotal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxTotal", theTaxTotal), currentHashCode, theTaxTotal, ((this.taxTotal!= null)&&(!this.taxTotal.isEmpty())));
        }
        {
            List<AllowanceChargeType> theAllowanceCharge;
            theAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowanceCharge", theAllowanceCharge), currentHashCode, theAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "item", theItem), currentHashCode, theItem, (this.item!= null));
        }
        {
            PriceType thePrice;
            thePrice = this.getPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "price", thePrice), currentHashCode, thePrice, (this.price!= null));
        }
        {
            List<DebitNoteLineType> theSubDebitNoteLine;
            theSubDebitNoteLine = (((this.subDebitNoteLine!= null)&&(!this.subDebitNoteLine.isEmpty()))?this.getSubDebitNoteLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subDebitNoteLine", theSubDebitNoteLine), currentHashCode, theSubDebitNoteLine, ((this.subDebitNoteLine!= null)&&(!this.subDebitNoteLine.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
