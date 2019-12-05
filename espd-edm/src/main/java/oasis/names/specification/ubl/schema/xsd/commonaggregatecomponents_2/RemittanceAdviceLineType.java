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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BalanceAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CreditLineAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DebitLineAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InvoicingPartyReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentPurposeCodeType;
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
 * <p>Classe Java per RemittanceAdviceLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RemittanceAdviceLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DebitLineAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CreditLineAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BalanceAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentPurposeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InvoicingPartyReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AccountingSupplierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AccountingCustomerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BuyerCustomerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerSupplierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginatorCustomerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PayeeParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InvoicePeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BillingReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExchangeRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceAdviceLineType", propOrder = {
    "id",
    "note",
    "uuid",
    "debitLineAmount",
    "creditLineAmount",
    "balanceAmount",
    "paymentPurposeCode",
    "invoicingPartyReference",
    "accountingSupplierParty",
    "accountingCustomerParty",
    "buyerCustomerParty",
    "sellerSupplierParty",
    "originatorCustomerParty",
    "payeeParty",
    "invoicePeriod",
    "billingReference",
    "documentReference",
    "exchangeRate"
})
public class RemittanceAdviceLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUIDType uuid;
    @XmlElement(name = "DebitLineAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DebitLineAmountType debitLineAmount;
    @XmlElement(name = "CreditLineAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CreditLineAmountType creditLineAmount;
    @XmlElement(name = "BalanceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BalanceAmountType balanceAmount;
    @XmlElement(name = "PaymentPurposeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentPurposeCodeType paymentPurposeCode;
    @XmlElement(name = "InvoicingPartyReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InvoicingPartyReferenceType invoicingPartyReference;
    @XmlElement(name = "AccountingSupplierParty")
    protected SupplierPartyType accountingSupplierParty;
    @XmlElement(name = "AccountingCustomerParty")
    protected CustomerPartyType accountingCustomerParty;
    @XmlElement(name = "BuyerCustomerParty")
    protected CustomerPartyType buyerCustomerParty;
    @XmlElement(name = "SellerSupplierParty")
    protected SupplierPartyType sellerSupplierParty;
    @XmlElement(name = "OriginatorCustomerParty")
    protected CustomerPartyType originatorCustomerParty;
    @XmlElement(name = "PayeeParty")
    protected PartyType payeeParty;
    @XmlElement(name = "InvoicePeriod")
    protected List<PeriodType> invoicePeriod;
    @XmlElement(name = "BillingReference")
    protected List<BillingReferenceType> billingReference;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "ExchangeRate")
    protected ExchangeRateType exchangeRate;

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
     * Recupera il valore della proprietà debitLineAmount.
     * 
     * @return
     *     possible object is
     *     {@link DebitLineAmountType }
     *     
     */
    public DebitLineAmountType getDebitLineAmount() {
        return debitLineAmount;
    }

    /**
     * Imposta il valore della proprietà debitLineAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitLineAmountType }
     *     
     */
    public void setDebitLineAmount(DebitLineAmountType value) {
        this.debitLineAmount = value;
    }

    /**
     * Recupera il valore della proprietà creditLineAmount.
     * 
     * @return
     *     possible object is
     *     {@link CreditLineAmountType }
     *     
     */
    public CreditLineAmountType getCreditLineAmount() {
        return creditLineAmount;
    }

    /**
     * Imposta il valore della proprietà creditLineAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditLineAmountType }
     *     
     */
    public void setCreditLineAmount(CreditLineAmountType value) {
        this.creditLineAmount = value;
    }

    /**
     * Recupera il valore della proprietà balanceAmount.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmountType }
     *     
     */
    public BalanceAmountType getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * Imposta il valore della proprietà balanceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmountType }
     *     
     */
    public void setBalanceAmount(BalanceAmountType value) {
        this.balanceAmount = value;
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
     * Recupera il valore della proprietà invoicingPartyReference.
     * 
     * @return
     *     possible object is
     *     {@link InvoicingPartyReferenceType }
     *     
     */
    public InvoicingPartyReferenceType getInvoicingPartyReference() {
        return invoicingPartyReference;
    }

    /**
     * Imposta il valore della proprietà invoicingPartyReference.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicingPartyReferenceType }
     *     
     */
    public void setInvoicingPartyReference(InvoicingPartyReferenceType value) {
        this.invoicingPartyReference = value;
    }

    /**
     * Recupera il valore della proprietà accountingSupplierParty.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getAccountingSupplierParty() {
        return accountingSupplierParty;
    }

    /**
     * Imposta il valore della proprietà accountingSupplierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setAccountingSupplierParty(SupplierPartyType value) {
        this.accountingSupplierParty = value;
    }

    /**
     * Recupera il valore della proprietà accountingCustomerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getAccountingCustomerParty() {
        return accountingCustomerParty;
    }

    /**
     * Imposta il valore della proprietà accountingCustomerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setAccountingCustomerParty(CustomerPartyType value) {
        this.accountingCustomerParty = value;
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
     * Recupera il valore della proprietà originatorCustomerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getOriginatorCustomerParty() {
        return originatorCustomerParty;
    }

    /**
     * Imposta il valore della proprietà originatorCustomerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setOriginatorCustomerParty(CustomerPartyType value) {
        this.originatorCustomerParty = value;
    }

    /**
     * Recupera il valore della proprietà payeeParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPayeeParty() {
        return payeeParty;
    }

    /**
     * Imposta il valore della proprietà payeeParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPayeeParty(PartyType value) {
        this.payeeParty = value;
    }

    /**
     * Gets the value of the invoicePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoicePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoicePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getInvoicePeriod() {
        if (invoicePeriod == null) {
            invoicePeriod = new ArrayList<PeriodType>();
        }
        return this.invoicePeriod;
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
     * Recupera il valore della proprietà exchangeRate.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Imposta il valore della proprietà exchangeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setExchangeRate(ExchangeRateType value) {
        this.exchangeRate = value;
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
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            strategy.appendField(locator, this, "note", buffer, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            UUIDType theUUID;
            theUUID = this.getUUID();
            strategy.appendField(locator, this, "uuid", buffer, theUUID, (this.uuid!= null));
        }
        {
            DebitLineAmountType theDebitLineAmount;
            theDebitLineAmount = this.getDebitLineAmount();
            strategy.appendField(locator, this, "debitLineAmount", buffer, theDebitLineAmount, (this.debitLineAmount!= null));
        }
        {
            CreditLineAmountType theCreditLineAmount;
            theCreditLineAmount = this.getCreditLineAmount();
            strategy.appendField(locator, this, "creditLineAmount", buffer, theCreditLineAmount, (this.creditLineAmount!= null));
        }
        {
            BalanceAmountType theBalanceAmount;
            theBalanceAmount = this.getBalanceAmount();
            strategy.appendField(locator, this, "balanceAmount", buffer, theBalanceAmount, (this.balanceAmount!= null));
        }
        {
            PaymentPurposeCodeType thePaymentPurposeCode;
            thePaymentPurposeCode = this.getPaymentPurposeCode();
            strategy.appendField(locator, this, "paymentPurposeCode", buffer, thePaymentPurposeCode, (this.paymentPurposeCode!= null));
        }
        {
            InvoicingPartyReferenceType theInvoicingPartyReference;
            theInvoicingPartyReference = this.getInvoicingPartyReference();
            strategy.appendField(locator, this, "invoicingPartyReference", buffer, theInvoicingPartyReference, (this.invoicingPartyReference!= null));
        }
        {
            SupplierPartyType theAccountingSupplierParty;
            theAccountingSupplierParty = this.getAccountingSupplierParty();
            strategy.appendField(locator, this, "accountingSupplierParty", buffer, theAccountingSupplierParty, (this.accountingSupplierParty!= null));
        }
        {
            CustomerPartyType theAccountingCustomerParty;
            theAccountingCustomerParty = this.getAccountingCustomerParty();
            strategy.appendField(locator, this, "accountingCustomerParty", buffer, theAccountingCustomerParty, (this.accountingCustomerParty!= null));
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
            CustomerPartyType theOriginatorCustomerParty;
            theOriginatorCustomerParty = this.getOriginatorCustomerParty();
            strategy.appendField(locator, this, "originatorCustomerParty", buffer, theOriginatorCustomerParty, (this.originatorCustomerParty!= null));
        }
        {
            PartyType thePayeeParty;
            thePayeeParty = this.getPayeeParty();
            strategy.appendField(locator, this, "payeeParty", buffer, thePayeeParty, (this.payeeParty!= null));
        }
        {
            List<PeriodType> theInvoicePeriod;
            theInvoicePeriod = (((this.invoicePeriod!= null)&&(!this.invoicePeriod.isEmpty()))?this.getInvoicePeriod():null);
            strategy.appendField(locator, this, "invoicePeriod", buffer, theInvoicePeriod, ((this.invoicePeriod!= null)&&(!this.invoicePeriod.isEmpty())));
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
            ExchangeRateType theExchangeRate;
            theExchangeRate = this.getExchangeRate();
            strategy.appendField(locator, this, "exchangeRate", buffer, theExchangeRate, (this.exchangeRate!= null));
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
        final RemittanceAdviceLineType that = ((RemittanceAdviceLineType) object);
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
            List<NoteType> lhsNote;
            lhsNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            List<NoteType> rhsNote;
            rhsNote = (((that.note!= null)&&(!that.note.isEmpty()))?that.getNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote, ((this.note!= null)&&(!this.note.isEmpty())), ((that.note!= null)&&(!that.note.isEmpty())))) {
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
            DebitLineAmountType lhsDebitLineAmount;
            lhsDebitLineAmount = this.getDebitLineAmount();
            DebitLineAmountType rhsDebitLineAmount;
            rhsDebitLineAmount = that.getDebitLineAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "debitLineAmount", lhsDebitLineAmount), LocatorUtils.property(thatLocator, "debitLineAmount", rhsDebitLineAmount), lhsDebitLineAmount, rhsDebitLineAmount, (this.debitLineAmount!= null), (that.debitLineAmount!= null))) {
                return false;
            }
        }
        {
            CreditLineAmountType lhsCreditLineAmount;
            lhsCreditLineAmount = this.getCreditLineAmount();
            CreditLineAmountType rhsCreditLineAmount;
            rhsCreditLineAmount = that.getCreditLineAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creditLineAmount", lhsCreditLineAmount), LocatorUtils.property(thatLocator, "creditLineAmount", rhsCreditLineAmount), lhsCreditLineAmount, rhsCreditLineAmount, (this.creditLineAmount!= null), (that.creditLineAmount!= null))) {
                return false;
            }
        }
        {
            BalanceAmountType lhsBalanceAmount;
            lhsBalanceAmount = this.getBalanceAmount();
            BalanceAmountType rhsBalanceAmount;
            rhsBalanceAmount = that.getBalanceAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balanceAmount", lhsBalanceAmount), LocatorUtils.property(thatLocator, "balanceAmount", rhsBalanceAmount), lhsBalanceAmount, rhsBalanceAmount, (this.balanceAmount!= null), (that.balanceAmount!= null))) {
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
            InvoicingPartyReferenceType lhsInvoicingPartyReference;
            lhsInvoicingPartyReference = this.getInvoicingPartyReference();
            InvoicingPartyReferenceType rhsInvoicingPartyReference;
            rhsInvoicingPartyReference = that.getInvoicingPartyReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoicingPartyReference", lhsInvoicingPartyReference), LocatorUtils.property(thatLocator, "invoicingPartyReference", rhsInvoicingPartyReference), lhsInvoicingPartyReference, rhsInvoicingPartyReference, (this.invoicingPartyReference!= null), (that.invoicingPartyReference!= null))) {
                return false;
            }
        }
        {
            SupplierPartyType lhsAccountingSupplierParty;
            lhsAccountingSupplierParty = this.getAccountingSupplierParty();
            SupplierPartyType rhsAccountingSupplierParty;
            rhsAccountingSupplierParty = that.getAccountingSupplierParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountingSupplierParty", lhsAccountingSupplierParty), LocatorUtils.property(thatLocator, "accountingSupplierParty", rhsAccountingSupplierParty), lhsAccountingSupplierParty, rhsAccountingSupplierParty, (this.accountingSupplierParty!= null), (that.accountingSupplierParty!= null))) {
                return false;
            }
        }
        {
            CustomerPartyType lhsAccountingCustomerParty;
            lhsAccountingCustomerParty = this.getAccountingCustomerParty();
            CustomerPartyType rhsAccountingCustomerParty;
            rhsAccountingCustomerParty = that.getAccountingCustomerParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountingCustomerParty", lhsAccountingCustomerParty), LocatorUtils.property(thatLocator, "accountingCustomerParty", rhsAccountingCustomerParty), lhsAccountingCustomerParty, rhsAccountingCustomerParty, (this.accountingCustomerParty!= null), (that.accountingCustomerParty!= null))) {
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
            CustomerPartyType lhsOriginatorCustomerParty;
            lhsOriginatorCustomerParty = this.getOriginatorCustomerParty();
            CustomerPartyType rhsOriginatorCustomerParty;
            rhsOriginatorCustomerParty = that.getOriginatorCustomerParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originatorCustomerParty", lhsOriginatorCustomerParty), LocatorUtils.property(thatLocator, "originatorCustomerParty", rhsOriginatorCustomerParty), lhsOriginatorCustomerParty, rhsOriginatorCustomerParty, (this.originatorCustomerParty!= null), (that.originatorCustomerParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsPayeeParty;
            lhsPayeeParty = this.getPayeeParty();
            PartyType rhsPayeeParty;
            rhsPayeeParty = that.getPayeeParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payeeParty", lhsPayeeParty), LocatorUtils.property(thatLocator, "payeeParty", rhsPayeeParty), lhsPayeeParty, rhsPayeeParty, (this.payeeParty!= null), (that.payeeParty!= null))) {
                return false;
            }
        }
        {
            List<PeriodType> lhsInvoicePeriod;
            lhsInvoicePeriod = (((this.invoicePeriod!= null)&&(!this.invoicePeriod.isEmpty()))?this.getInvoicePeriod():null);
            List<PeriodType> rhsInvoicePeriod;
            rhsInvoicePeriod = (((that.invoicePeriod!= null)&&(!that.invoicePeriod.isEmpty()))?that.getInvoicePeriod():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoicePeriod", lhsInvoicePeriod), LocatorUtils.property(thatLocator, "invoicePeriod", rhsInvoicePeriod), lhsInvoicePeriod, rhsInvoicePeriod, ((this.invoicePeriod!= null)&&(!this.invoicePeriod.isEmpty())), ((that.invoicePeriod!= null)&&(!that.invoicePeriod.isEmpty())))) {
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
            ExchangeRateType lhsExchangeRate;
            lhsExchangeRate = this.getExchangeRate();
            ExchangeRateType rhsExchangeRate;
            rhsExchangeRate = that.getExchangeRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exchangeRate", lhsExchangeRate), LocatorUtils.property(thatLocator, "exchangeRate", rhsExchangeRate), lhsExchangeRate, rhsExchangeRate, (this.exchangeRate!= null), (that.exchangeRate!= null))) {
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
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            UUIDType theUUID;
            theUUID = this.getUUID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uuid", theUUID), currentHashCode, theUUID, (this.uuid!= null));
        }
        {
            DebitLineAmountType theDebitLineAmount;
            theDebitLineAmount = this.getDebitLineAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "debitLineAmount", theDebitLineAmount), currentHashCode, theDebitLineAmount, (this.debitLineAmount!= null));
        }
        {
            CreditLineAmountType theCreditLineAmount;
            theCreditLineAmount = this.getCreditLineAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creditLineAmount", theCreditLineAmount), currentHashCode, theCreditLineAmount, (this.creditLineAmount!= null));
        }
        {
            BalanceAmountType theBalanceAmount;
            theBalanceAmount = this.getBalanceAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "balanceAmount", theBalanceAmount), currentHashCode, theBalanceAmount, (this.balanceAmount!= null));
        }
        {
            PaymentPurposeCodeType thePaymentPurposeCode;
            thePaymentPurposeCode = this.getPaymentPurposeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentPurposeCode", thePaymentPurposeCode), currentHashCode, thePaymentPurposeCode, (this.paymentPurposeCode!= null));
        }
        {
            InvoicingPartyReferenceType theInvoicingPartyReference;
            theInvoicingPartyReference = this.getInvoicingPartyReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoicingPartyReference", theInvoicingPartyReference), currentHashCode, theInvoicingPartyReference, (this.invoicingPartyReference!= null));
        }
        {
            SupplierPartyType theAccountingSupplierParty;
            theAccountingSupplierParty = this.getAccountingSupplierParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountingSupplierParty", theAccountingSupplierParty), currentHashCode, theAccountingSupplierParty, (this.accountingSupplierParty!= null));
        }
        {
            CustomerPartyType theAccountingCustomerParty;
            theAccountingCustomerParty = this.getAccountingCustomerParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountingCustomerParty", theAccountingCustomerParty), currentHashCode, theAccountingCustomerParty, (this.accountingCustomerParty!= null));
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
            CustomerPartyType theOriginatorCustomerParty;
            theOriginatorCustomerParty = this.getOriginatorCustomerParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originatorCustomerParty", theOriginatorCustomerParty), currentHashCode, theOriginatorCustomerParty, (this.originatorCustomerParty!= null));
        }
        {
            PartyType thePayeeParty;
            thePayeeParty = this.getPayeeParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payeeParty", thePayeeParty), currentHashCode, thePayeeParty, (this.payeeParty!= null));
        }
        {
            List<PeriodType> theInvoicePeriod;
            theInvoicePeriod = (((this.invoicePeriod!= null)&&(!this.invoicePeriod.isEmpty()))?this.getInvoicePeriod():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoicePeriod", theInvoicePeriod), currentHashCode, theInvoicePeriod, ((this.invoicePeriod!= null)&&(!this.invoicePeriod.isEmpty())));
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
            ExchangeRateType theExchangeRate;
            theExchangeRate = this.getExchangeRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exchangeRate", theExchangeRate), currentHashCode, theExchangeRate, (this.exchangeRate!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
