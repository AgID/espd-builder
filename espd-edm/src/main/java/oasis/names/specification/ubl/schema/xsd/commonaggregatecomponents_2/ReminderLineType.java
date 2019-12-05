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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BalanceBroughtForwardIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CreditLineAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DebitLineAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentPurposeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PenaltySurchargePercentType;
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
 * <p>Classe Java per ReminderLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ReminderLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BalanceBroughtForwardIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DebitLineAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CreditLineAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCostCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCost" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PenaltySurchargePercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentPurposeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReminderPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BillingReference" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ReminderLineType", propOrder = {
    "id",
    "note",
    "uuid",
    "balanceBroughtForwardIndicator",
    "debitLineAmount",
    "creditLineAmount",
    "accountingCostCode",
    "accountingCost",
    "penaltySurchargePercent",
    "amount",
    "paymentPurposeCode",
    "reminderPeriod",
    "billingReference",
    "exchangeRate"
})
public class ReminderLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUIDType uuid;
    @XmlElement(name = "BalanceBroughtForwardIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BalanceBroughtForwardIndicatorType balanceBroughtForwardIndicator;
    @XmlElement(name = "DebitLineAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DebitLineAmountType debitLineAmount;
    @XmlElement(name = "CreditLineAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CreditLineAmountType creditLineAmount;
    @XmlElement(name = "AccountingCostCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountingCostCodeType accountingCostCode;
    @XmlElement(name = "AccountingCost", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountingCostType accountingCost;
    @XmlElement(name = "PenaltySurchargePercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PenaltySurchargePercentType penaltySurchargePercent;
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AmountType amount;
    @XmlElement(name = "PaymentPurposeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentPurposeCodeType paymentPurposeCode;
    @XmlElement(name = "ReminderPeriod")
    protected List<PeriodType> reminderPeriod;
    @XmlElement(name = "BillingReference")
    protected List<BillingReferenceType> billingReference;
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
     * Recupera il valore della proprietà balanceBroughtForwardIndicator.
     * 
     * @return
     *     possible object is
     *     {@link BalanceBroughtForwardIndicatorType }
     *     
     */
    public BalanceBroughtForwardIndicatorType getBalanceBroughtForwardIndicator() {
        return balanceBroughtForwardIndicator;
    }

    /**
     * Imposta il valore della proprietà balanceBroughtForwardIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceBroughtForwardIndicatorType }
     *     
     */
    public void setBalanceBroughtForwardIndicator(BalanceBroughtForwardIndicatorType value) {
        this.balanceBroughtForwardIndicator = value;
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
     * Recupera il valore della proprietà penaltySurchargePercent.
     * 
     * @return
     *     possible object is
     *     {@link PenaltySurchargePercentType }
     *     
     */
    public PenaltySurchargePercentType getPenaltySurchargePercent() {
        return penaltySurchargePercent;
    }

    /**
     * Imposta il valore della proprietà penaltySurchargePercent.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltySurchargePercentType }
     *     
     */
    public void setPenaltySurchargePercent(PenaltySurchargePercentType value) {
        this.penaltySurchargePercent = value;
    }

    /**
     * Recupera il valore della proprietà amount.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Imposta il valore della proprietà amount.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
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
     * Gets the value of the reminderPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reminderPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReminderPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getReminderPeriod() {
        if (reminderPeriod == null) {
            reminderPeriod = new ArrayList<PeriodType>();
        }
        return this.reminderPeriod;
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
            BalanceBroughtForwardIndicatorType theBalanceBroughtForwardIndicator;
            theBalanceBroughtForwardIndicator = this.getBalanceBroughtForwardIndicator();
            strategy.appendField(locator, this, "balanceBroughtForwardIndicator", buffer, theBalanceBroughtForwardIndicator, (this.balanceBroughtForwardIndicator!= null));
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
            PenaltySurchargePercentType thePenaltySurchargePercent;
            thePenaltySurchargePercent = this.getPenaltySurchargePercent();
            strategy.appendField(locator, this, "penaltySurchargePercent", buffer, thePenaltySurchargePercent, (this.penaltySurchargePercent!= null));
        }
        {
            AmountType theAmount;
            theAmount = this.getAmount();
            strategy.appendField(locator, this, "amount", buffer, theAmount, (this.amount!= null));
        }
        {
            PaymentPurposeCodeType thePaymentPurposeCode;
            thePaymentPurposeCode = this.getPaymentPurposeCode();
            strategy.appendField(locator, this, "paymentPurposeCode", buffer, thePaymentPurposeCode, (this.paymentPurposeCode!= null));
        }
        {
            List<PeriodType> theReminderPeriod;
            theReminderPeriod = (((this.reminderPeriod!= null)&&(!this.reminderPeriod.isEmpty()))?this.getReminderPeriod():null);
            strategy.appendField(locator, this, "reminderPeriod", buffer, theReminderPeriod, ((this.reminderPeriod!= null)&&(!this.reminderPeriod.isEmpty())));
        }
        {
            List<BillingReferenceType> theBillingReference;
            theBillingReference = (((this.billingReference!= null)&&(!this.billingReference.isEmpty()))?this.getBillingReference():null);
            strategy.appendField(locator, this, "billingReference", buffer, theBillingReference, ((this.billingReference!= null)&&(!this.billingReference.isEmpty())));
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
        final ReminderLineType that = ((ReminderLineType) object);
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
            BalanceBroughtForwardIndicatorType lhsBalanceBroughtForwardIndicator;
            lhsBalanceBroughtForwardIndicator = this.getBalanceBroughtForwardIndicator();
            BalanceBroughtForwardIndicatorType rhsBalanceBroughtForwardIndicator;
            rhsBalanceBroughtForwardIndicator = that.getBalanceBroughtForwardIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balanceBroughtForwardIndicator", lhsBalanceBroughtForwardIndicator), LocatorUtils.property(thatLocator, "balanceBroughtForwardIndicator", rhsBalanceBroughtForwardIndicator), lhsBalanceBroughtForwardIndicator, rhsBalanceBroughtForwardIndicator, (this.balanceBroughtForwardIndicator!= null), (that.balanceBroughtForwardIndicator!= null))) {
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
            PenaltySurchargePercentType lhsPenaltySurchargePercent;
            lhsPenaltySurchargePercent = this.getPenaltySurchargePercent();
            PenaltySurchargePercentType rhsPenaltySurchargePercent;
            rhsPenaltySurchargePercent = that.getPenaltySurchargePercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "penaltySurchargePercent", lhsPenaltySurchargePercent), LocatorUtils.property(thatLocator, "penaltySurchargePercent", rhsPenaltySurchargePercent), lhsPenaltySurchargePercent, rhsPenaltySurchargePercent, (this.penaltySurchargePercent!= null), (that.penaltySurchargePercent!= null))) {
                return false;
            }
        }
        {
            AmountType lhsAmount;
            lhsAmount = this.getAmount();
            AmountType rhsAmount;
            rhsAmount = that.getAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amount", lhsAmount), LocatorUtils.property(thatLocator, "amount", rhsAmount), lhsAmount, rhsAmount, (this.amount!= null), (that.amount!= null))) {
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
            List<PeriodType> lhsReminderPeriod;
            lhsReminderPeriod = (((this.reminderPeriod!= null)&&(!this.reminderPeriod.isEmpty()))?this.getReminderPeriod():null);
            List<PeriodType> rhsReminderPeriod;
            rhsReminderPeriod = (((that.reminderPeriod!= null)&&(!that.reminderPeriod.isEmpty()))?that.getReminderPeriod():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reminderPeriod", lhsReminderPeriod), LocatorUtils.property(thatLocator, "reminderPeriod", rhsReminderPeriod), lhsReminderPeriod, rhsReminderPeriod, ((this.reminderPeriod!= null)&&(!this.reminderPeriod.isEmpty())), ((that.reminderPeriod!= null)&&(!that.reminderPeriod.isEmpty())))) {
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
            BalanceBroughtForwardIndicatorType theBalanceBroughtForwardIndicator;
            theBalanceBroughtForwardIndicator = this.getBalanceBroughtForwardIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "balanceBroughtForwardIndicator", theBalanceBroughtForwardIndicator), currentHashCode, theBalanceBroughtForwardIndicator, (this.balanceBroughtForwardIndicator!= null));
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
            PenaltySurchargePercentType thePenaltySurchargePercent;
            thePenaltySurchargePercent = this.getPenaltySurchargePercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "penaltySurchargePercent", thePenaltySurchargePercent), currentHashCode, thePenaltySurchargePercent, (this.penaltySurchargePercent!= null));
        }
        {
            AmountType theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount, (this.amount!= null));
        }
        {
            PaymentPurposeCodeType thePaymentPurposeCode;
            thePaymentPurposeCode = this.getPaymentPurposeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentPurposeCode", thePaymentPurposeCode), currentHashCode, thePaymentPurposeCode, (this.paymentPurposeCode!= null));
        }
        {
            List<PeriodType> theReminderPeriod;
            theReminderPeriod = (((this.reminderPeriod!= null)&&(!this.reminderPeriod.isEmpty()))?this.getReminderPeriod():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reminderPeriod", theReminderPeriod), currentHashCode, theReminderPeriod, ((this.reminderPeriod!= null)&&(!this.reminderPeriod.isEmpty())));
        }
        {
            List<BillingReferenceType> theBillingReference;
            theBillingReference = (((this.billingReference!= null)&&(!this.billingReference.isEmpty()))?this.getBillingReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billingReference", theBillingReference), currentHashCode, theBillingReference, ((this.billingReference!= null)&&(!this.billingReference.isEmpty())));
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
