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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InstallmentDueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InvoicingPartyReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentDueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentMeansIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentTermsDetailsURIType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PenaltyAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PenaltySurchargePercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PrepaidPaymentReferenceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReferenceEventCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SettlementDiscountAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SettlementDiscountPercentType;
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
 * <p>Classe Java per PaymentTermsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PaymentTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentMeansID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrepaidPaymentReferenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceEventCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SettlementDiscountPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PenaltySurchargePercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SettlementDiscountAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PenaltyAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentTermsDetailsURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentDueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InstallmentDueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InvoicingPartyReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SettlementPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PenaltyPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTermsType", propOrder = {
    "id",
    "paymentMeansID",
    "prepaidPaymentReferenceID",
    "note",
    "referenceEventCode",
    "settlementDiscountPercent",
    "penaltySurchargePercent",
    "paymentPercent",
    "amount",
    "settlementDiscountAmount",
    "penaltyAmount",
    "paymentTermsDetailsURI",
    "paymentDueDate",
    "installmentDueDate",
    "invoicingPartyReference",
    "settlementPeriod",
    "penaltyPeriod",
    "exchangeRate",
    "validityPeriod"
})
public class PaymentTermsType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "PaymentMeansID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PaymentMeansIDType> paymentMeansID;
    @XmlElement(name = "PrepaidPaymentReferenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PrepaidPaymentReferenceIDType prepaidPaymentReferenceID;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "ReferenceEventCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReferenceEventCodeType referenceEventCode;
    @XmlElement(name = "SettlementDiscountPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SettlementDiscountPercentType settlementDiscountPercent;
    @XmlElement(name = "PenaltySurchargePercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PenaltySurchargePercentType penaltySurchargePercent;
    @XmlElement(name = "PaymentPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentPercentType paymentPercent;
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AmountType amount;
    @XmlElement(name = "SettlementDiscountAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SettlementDiscountAmountType settlementDiscountAmount;
    @XmlElement(name = "PenaltyAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PenaltyAmountType penaltyAmount;
    @XmlElement(name = "PaymentTermsDetailsURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentTermsDetailsURIType paymentTermsDetailsURI;
    @XmlElement(name = "PaymentDueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentDueDateType paymentDueDate;
    @XmlElement(name = "InstallmentDueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InstallmentDueDateType installmentDueDate;
    @XmlElement(name = "InvoicingPartyReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InvoicingPartyReferenceType invoicingPartyReference;
    @XmlElement(name = "SettlementPeriod")
    protected PeriodType settlementPeriod;
    @XmlElement(name = "PenaltyPeriod")
    protected PeriodType penaltyPeriod;
    @XmlElement(name = "ExchangeRate")
    protected ExchangeRateType exchangeRate;
    @XmlElement(name = "ValidityPeriod")
    protected PeriodType validityPeriod;

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
     * Gets the value of the paymentMeansID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMeansID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMeansID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMeansIDType }
     * 
     * 
     */
    public List<PaymentMeansIDType> getPaymentMeansID() {
        if (paymentMeansID == null) {
            paymentMeansID = new ArrayList<PaymentMeansIDType>();
        }
        return this.paymentMeansID;
    }

    /**
     * Recupera il valore della proprietà prepaidPaymentReferenceID.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidPaymentReferenceIDType }
     *     
     */
    public PrepaidPaymentReferenceIDType getPrepaidPaymentReferenceID() {
        return prepaidPaymentReferenceID;
    }

    /**
     * Imposta il valore della proprietà prepaidPaymentReferenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidPaymentReferenceIDType }
     *     
     */
    public void setPrepaidPaymentReferenceID(PrepaidPaymentReferenceIDType value) {
        this.prepaidPaymentReferenceID = value;
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
     * Recupera il valore della proprietà referenceEventCode.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceEventCodeType }
     *     
     */
    public ReferenceEventCodeType getReferenceEventCode() {
        return referenceEventCode;
    }

    /**
     * Imposta il valore della proprietà referenceEventCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceEventCodeType }
     *     
     */
    public void setReferenceEventCode(ReferenceEventCodeType value) {
        this.referenceEventCode = value;
    }

    /**
     * Recupera il valore della proprietà settlementDiscountPercent.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDiscountPercentType }
     *     
     */
    public SettlementDiscountPercentType getSettlementDiscountPercent() {
        return settlementDiscountPercent;
    }

    /**
     * Imposta il valore della proprietà settlementDiscountPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDiscountPercentType }
     *     
     */
    public void setSettlementDiscountPercent(SettlementDiscountPercentType value) {
        this.settlementDiscountPercent = value;
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
     * Recupera il valore della proprietà paymentPercent.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPercentType }
     *     
     */
    public PaymentPercentType getPaymentPercent() {
        return paymentPercent;
    }

    /**
     * Imposta il valore della proprietà paymentPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPercentType }
     *     
     */
    public void setPaymentPercent(PaymentPercentType value) {
        this.paymentPercent = value;
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
     * Recupera il valore della proprietà settlementDiscountAmount.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDiscountAmountType }
     *     
     */
    public SettlementDiscountAmountType getSettlementDiscountAmount() {
        return settlementDiscountAmount;
    }

    /**
     * Imposta il valore della proprietà settlementDiscountAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDiscountAmountType }
     *     
     */
    public void setSettlementDiscountAmount(SettlementDiscountAmountType value) {
        this.settlementDiscountAmount = value;
    }

    /**
     * Recupera il valore della proprietà penaltyAmount.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyAmountType }
     *     
     */
    public PenaltyAmountType getPenaltyAmount() {
        return penaltyAmount;
    }

    /**
     * Imposta il valore della proprietà penaltyAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyAmountType }
     *     
     */
    public void setPenaltyAmount(PenaltyAmountType value) {
        this.penaltyAmount = value;
    }

    /**
     * Recupera il valore della proprietà paymentTermsDetailsURI.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsDetailsURIType }
     *     
     */
    public PaymentTermsDetailsURIType getPaymentTermsDetailsURI() {
        return paymentTermsDetailsURI;
    }

    /**
     * Imposta il valore della proprietà paymentTermsDetailsURI.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsDetailsURIType }
     *     
     */
    public void setPaymentTermsDetailsURI(PaymentTermsDetailsURIType value) {
        this.paymentTermsDetailsURI = value;
    }

    /**
     * Recupera il valore della proprietà paymentDueDate.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDueDateType }
     *     
     */
    public PaymentDueDateType getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * Imposta il valore della proprietà paymentDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDueDateType }
     *     
     */
    public void setPaymentDueDate(PaymentDueDateType value) {
        this.paymentDueDate = value;
    }

    /**
     * Recupera il valore della proprietà installmentDueDate.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentDueDateType }
     *     
     */
    public InstallmentDueDateType getInstallmentDueDate() {
        return installmentDueDate;
    }

    /**
     * Imposta il valore della proprietà installmentDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentDueDateType }
     *     
     */
    public void setInstallmentDueDate(InstallmentDueDateType value) {
        this.installmentDueDate = value;
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
     * Recupera il valore della proprietà settlementPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getSettlementPeriod() {
        return settlementPeriod;
    }

    /**
     * Imposta il valore della proprietà settlementPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setSettlementPeriod(PeriodType value) {
        this.settlementPeriod = value;
    }

    /**
     * Recupera il valore della proprietà penaltyPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPenaltyPeriod() {
        return penaltyPeriod;
    }

    /**
     * Imposta il valore della proprietà penaltyPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPenaltyPeriod(PeriodType value) {
        this.penaltyPeriod = value;
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

    /**
     * Recupera il valore della proprietà validityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Imposta il valore della proprietà validityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setValidityPeriod(PeriodType value) {
        this.validityPeriod = value;
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
            List<PaymentMeansIDType> thePaymentMeansID;
            thePaymentMeansID = (((this.paymentMeansID!= null)&&(!this.paymentMeansID.isEmpty()))?this.getPaymentMeansID():null);
            strategy.appendField(locator, this, "paymentMeansID", buffer, thePaymentMeansID, ((this.paymentMeansID!= null)&&(!this.paymentMeansID.isEmpty())));
        }
        {
            PrepaidPaymentReferenceIDType thePrepaidPaymentReferenceID;
            thePrepaidPaymentReferenceID = this.getPrepaidPaymentReferenceID();
            strategy.appendField(locator, this, "prepaidPaymentReferenceID", buffer, thePrepaidPaymentReferenceID, (this.prepaidPaymentReferenceID!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            strategy.appendField(locator, this, "note", buffer, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            ReferenceEventCodeType theReferenceEventCode;
            theReferenceEventCode = this.getReferenceEventCode();
            strategy.appendField(locator, this, "referenceEventCode", buffer, theReferenceEventCode, (this.referenceEventCode!= null));
        }
        {
            SettlementDiscountPercentType theSettlementDiscountPercent;
            theSettlementDiscountPercent = this.getSettlementDiscountPercent();
            strategy.appendField(locator, this, "settlementDiscountPercent", buffer, theSettlementDiscountPercent, (this.settlementDiscountPercent!= null));
        }
        {
            PenaltySurchargePercentType thePenaltySurchargePercent;
            thePenaltySurchargePercent = this.getPenaltySurchargePercent();
            strategy.appendField(locator, this, "penaltySurchargePercent", buffer, thePenaltySurchargePercent, (this.penaltySurchargePercent!= null));
        }
        {
            PaymentPercentType thePaymentPercent;
            thePaymentPercent = this.getPaymentPercent();
            strategy.appendField(locator, this, "paymentPercent", buffer, thePaymentPercent, (this.paymentPercent!= null));
        }
        {
            AmountType theAmount;
            theAmount = this.getAmount();
            strategy.appendField(locator, this, "amount", buffer, theAmount, (this.amount!= null));
        }
        {
            SettlementDiscountAmountType theSettlementDiscountAmount;
            theSettlementDiscountAmount = this.getSettlementDiscountAmount();
            strategy.appendField(locator, this, "settlementDiscountAmount", buffer, theSettlementDiscountAmount, (this.settlementDiscountAmount!= null));
        }
        {
            PenaltyAmountType thePenaltyAmount;
            thePenaltyAmount = this.getPenaltyAmount();
            strategy.appendField(locator, this, "penaltyAmount", buffer, thePenaltyAmount, (this.penaltyAmount!= null));
        }
        {
            PaymentTermsDetailsURIType thePaymentTermsDetailsURI;
            thePaymentTermsDetailsURI = this.getPaymentTermsDetailsURI();
            strategy.appendField(locator, this, "paymentTermsDetailsURI", buffer, thePaymentTermsDetailsURI, (this.paymentTermsDetailsURI!= null));
        }
        {
            PaymentDueDateType thePaymentDueDate;
            thePaymentDueDate = this.getPaymentDueDate();
            strategy.appendField(locator, this, "paymentDueDate", buffer, thePaymentDueDate, (this.paymentDueDate!= null));
        }
        {
            InstallmentDueDateType theInstallmentDueDate;
            theInstallmentDueDate = this.getInstallmentDueDate();
            strategy.appendField(locator, this, "installmentDueDate", buffer, theInstallmentDueDate, (this.installmentDueDate!= null));
        }
        {
            InvoicingPartyReferenceType theInvoicingPartyReference;
            theInvoicingPartyReference = this.getInvoicingPartyReference();
            strategy.appendField(locator, this, "invoicingPartyReference", buffer, theInvoicingPartyReference, (this.invoicingPartyReference!= null));
        }
        {
            PeriodType theSettlementPeriod;
            theSettlementPeriod = this.getSettlementPeriod();
            strategy.appendField(locator, this, "settlementPeriod", buffer, theSettlementPeriod, (this.settlementPeriod!= null));
        }
        {
            PeriodType thePenaltyPeriod;
            thePenaltyPeriod = this.getPenaltyPeriod();
            strategy.appendField(locator, this, "penaltyPeriod", buffer, thePenaltyPeriod, (this.penaltyPeriod!= null));
        }
        {
            ExchangeRateType theExchangeRate;
            theExchangeRate = this.getExchangeRate();
            strategy.appendField(locator, this, "exchangeRate", buffer, theExchangeRate, (this.exchangeRate!= null));
        }
        {
            PeriodType theValidityPeriod;
            theValidityPeriod = this.getValidityPeriod();
            strategy.appendField(locator, this, "validityPeriod", buffer, theValidityPeriod, (this.validityPeriod!= null));
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
        final PaymentTermsType that = ((PaymentTermsType) object);
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
            List<PaymentMeansIDType> lhsPaymentMeansID;
            lhsPaymentMeansID = (((this.paymentMeansID!= null)&&(!this.paymentMeansID.isEmpty()))?this.getPaymentMeansID():null);
            List<PaymentMeansIDType> rhsPaymentMeansID;
            rhsPaymentMeansID = (((that.paymentMeansID!= null)&&(!that.paymentMeansID.isEmpty()))?that.getPaymentMeansID():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentMeansID", lhsPaymentMeansID), LocatorUtils.property(thatLocator, "paymentMeansID", rhsPaymentMeansID), lhsPaymentMeansID, rhsPaymentMeansID, ((this.paymentMeansID!= null)&&(!this.paymentMeansID.isEmpty())), ((that.paymentMeansID!= null)&&(!that.paymentMeansID.isEmpty())))) {
                return false;
            }
        }
        {
            PrepaidPaymentReferenceIDType lhsPrepaidPaymentReferenceID;
            lhsPrepaidPaymentReferenceID = this.getPrepaidPaymentReferenceID();
            PrepaidPaymentReferenceIDType rhsPrepaidPaymentReferenceID;
            rhsPrepaidPaymentReferenceID = that.getPrepaidPaymentReferenceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prepaidPaymentReferenceID", lhsPrepaidPaymentReferenceID), LocatorUtils.property(thatLocator, "prepaidPaymentReferenceID", rhsPrepaidPaymentReferenceID), lhsPrepaidPaymentReferenceID, rhsPrepaidPaymentReferenceID, (this.prepaidPaymentReferenceID!= null), (that.prepaidPaymentReferenceID!= null))) {
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
            ReferenceEventCodeType lhsReferenceEventCode;
            lhsReferenceEventCode = this.getReferenceEventCode();
            ReferenceEventCodeType rhsReferenceEventCode;
            rhsReferenceEventCode = that.getReferenceEventCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceEventCode", lhsReferenceEventCode), LocatorUtils.property(thatLocator, "referenceEventCode", rhsReferenceEventCode), lhsReferenceEventCode, rhsReferenceEventCode, (this.referenceEventCode!= null), (that.referenceEventCode!= null))) {
                return false;
            }
        }
        {
            SettlementDiscountPercentType lhsSettlementDiscountPercent;
            lhsSettlementDiscountPercent = this.getSettlementDiscountPercent();
            SettlementDiscountPercentType rhsSettlementDiscountPercent;
            rhsSettlementDiscountPercent = that.getSettlementDiscountPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "settlementDiscountPercent", lhsSettlementDiscountPercent), LocatorUtils.property(thatLocator, "settlementDiscountPercent", rhsSettlementDiscountPercent), lhsSettlementDiscountPercent, rhsSettlementDiscountPercent, (this.settlementDiscountPercent!= null), (that.settlementDiscountPercent!= null))) {
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
            PaymentPercentType lhsPaymentPercent;
            lhsPaymentPercent = this.getPaymentPercent();
            PaymentPercentType rhsPaymentPercent;
            rhsPaymentPercent = that.getPaymentPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentPercent", lhsPaymentPercent), LocatorUtils.property(thatLocator, "paymentPercent", rhsPaymentPercent), lhsPaymentPercent, rhsPaymentPercent, (this.paymentPercent!= null), (that.paymentPercent!= null))) {
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
            SettlementDiscountAmountType lhsSettlementDiscountAmount;
            lhsSettlementDiscountAmount = this.getSettlementDiscountAmount();
            SettlementDiscountAmountType rhsSettlementDiscountAmount;
            rhsSettlementDiscountAmount = that.getSettlementDiscountAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "settlementDiscountAmount", lhsSettlementDiscountAmount), LocatorUtils.property(thatLocator, "settlementDiscountAmount", rhsSettlementDiscountAmount), lhsSettlementDiscountAmount, rhsSettlementDiscountAmount, (this.settlementDiscountAmount!= null), (that.settlementDiscountAmount!= null))) {
                return false;
            }
        }
        {
            PenaltyAmountType lhsPenaltyAmount;
            lhsPenaltyAmount = this.getPenaltyAmount();
            PenaltyAmountType rhsPenaltyAmount;
            rhsPenaltyAmount = that.getPenaltyAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "penaltyAmount", lhsPenaltyAmount), LocatorUtils.property(thatLocator, "penaltyAmount", rhsPenaltyAmount), lhsPenaltyAmount, rhsPenaltyAmount, (this.penaltyAmount!= null), (that.penaltyAmount!= null))) {
                return false;
            }
        }
        {
            PaymentTermsDetailsURIType lhsPaymentTermsDetailsURI;
            lhsPaymentTermsDetailsURI = this.getPaymentTermsDetailsURI();
            PaymentTermsDetailsURIType rhsPaymentTermsDetailsURI;
            rhsPaymentTermsDetailsURI = that.getPaymentTermsDetailsURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentTermsDetailsURI", lhsPaymentTermsDetailsURI), LocatorUtils.property(thatLocator, "paymentTermsDetailsURI", rhsPaymentTermsDetailsURI), lhsPaymentTermsDetailsURI, rhsPaymentTermsDetailsURI, (this.paymentTermsDetailsURI!= null), (that.paymentTermsDetailsURI!= null))) {
                return false;
            }
        }
        {
            PaymentDueDateType lhsPaymentDueDate;
            lhsPaymentDueDate = this.getPaymentDueDate();
            PaymentDueDateType rhsPaymentDueDate;
            rhsPaymentDueDate = that.getPaymentDueDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentDueDate", lhsPaymentDueDate), LocatorUtils.property(thatLocator, "paymentDueDate", rhsPaymentDueDate), lhsPaymentDueDate, rhsPaymentDueDate, (this.paymentDueDate!= null), (that.paymentDueDate!= null))) {
                return false;
            }
        }
        {
            InstallmentDueDateType lhsInstallmentDueDate;
            lhsInstallmentDueDate = this.getInstallmentDueDate();
            InstallmentDueDateType rhsInstallmentDueDate;
            rhsInstallmentDueDate = that.getInstallmentDueDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "installmentDueDate", lhsInstallmentDueDate), LocatorUtils.property(thatLocator, "installmentDueDate", rhsInstallmentDueDate), lhsInstallmentDueDate, rhsInstallmentDueDate, (this.installmentDueDate!= null), (that.installmentDueDate!= null))) {
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
            PeriodType lhsSettlementPeriod;
            lhsSettlementPeriod = this.getSettlementPeriod();
            PeriodType rhsSettlementPeriod;
            rhsSettlementPeriod = that.getSettlementPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "settlementPeriod", lhsSettlementPeriod), LocatorUtils.property(thatLocator, "settlementPeriod", rhsSettlementPeriod), lhsSettlementPeriod, rhsSettlementPeriod, (this.settlementPeriod!= null), (that.settlementPeriod!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsPenaltyPeriod;
            lhsPenaltyPeriod = this.getPenaltyPeriod();
            PeriodType rhsPenaltyPeriod;
            rhsPenaltyPeriod = that.getPenaltyPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "penaltyPeriod", lhsPenaltyPeriod), LocatorUtils.property(thatLocator, "penaltyPeriod", rhsPenaltyPeriod), lhsPenaltyPeriod, rhsPenaltyPeriod, (this.penaltyPeriod!= null), (that.penaltyPeriod!= null))) {
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
        {
            PeriodType lhsValidityPeriod;
            lhsValidityPeriod = this.getValidityPeriod();
            PeriodType rhsValidityPeriod;
            rhsValidityPeriod = that.getValidityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validityPeriod", lhsValidityPeriod), LocatorUtils.property(thatLocator, "validityPeriod", rhsValidityPeriod), lhsValidityPeriod, rhsValidityPeriod, (this.validityPeriod!= null), (that.validityPeriod!= null))) {
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
            List<PaymentMeansIDType> thePaymentMeansID;
            thePaymentMeansID = (((this.paymentMeansID!= null)&&(!this.paymentMeansID.isEmpty()))?this.getPaymentMeansID():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentMeansID", thePaymentMeansID), currentHashCode, thePaymentMeansID, ((this.paymentMeansID!= null)&&(!this.paymentMeansID.isEmpty())));
        }
        {
            PrepaidPaymentReferenceIDType thePrepaidPaymentReferenceID;
            thePrepaidPaymentReferenceID = this.getPrepaidPaymentReferenceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prepaidPaymentReferenceID", thePrepaidPaymentReferenceID), currentHashCode, thePrepaidPaymentReferenceID, (this.prepaidPaymentReferenceID!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            ReferenceEventCodeType theReferenceEventCode;
            theReferenceEventCode = this.getReferenceEventCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceEventCode", theReferenceEventCode), currentHashCode, theReferenceEventCode, (this.referenceEventCode!= null));
        }
        {
            SettlementDiscountPercentType theSettlementDiscountPercent;
            theSettlementDiscountPercent = this.getSettlementDiscountPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "settlementDiscountPercent", theSettlementDiscountPercent), currentHashCode, theSettlementDiscountPercent, (this.settlementDiscountPercent!= null));
        }
        {
            PenaltySurchargePercentType thePenaltySurchargePercent;
            thePenaltySurchargePercent = this.getPenaltySurchargePercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "penaltySurchargePercent", thePenaltySurchargePercent), currentHashCode, thePenaltySurchargePercent, (this.penaltySurchargePercent!= null));
        }
        {
            PaymentPercentType thePaymentPercent;
            thePaymentPercent = this.getPaymentPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentPercent", thePaymentPercent), currentHashCode, thePaymentPercent, (this.paymentPercent!= null));
        }
        {
            AmountType theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount, (this.amount!= null));
        }
        {
            SettlementDiscountAmountType theSettlementDiscountAmount;
            theSettlementDiscountAmount = this.getSettlementDiscountAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "settlementDiscountAmount", theSettlementDiscountAmount), currentHashCode, theSettlementDiscountAmount, (this.settlementDiscountAmount!= null));
        }
        {
            PenaltyAmountType thePenaltyAmount;
            thePenaltyAmount = this.getPenaltyAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "penaltyAmount", thePenaltyAmount), currentHashCode, thePenaltyAmount, (this.penaltyAmount!= null));
        }
        {
            PaymentTermsDetailsURIType thePaymentTermsDetailsURI;
            thePaymentTermsDetailsURI = this.getPaymentTermsDetailsURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentTermsDetailsURI", thePaymentTermsDetailsURI), currentHashCode, thePaymentTermsDetailsURI, (this.paymentTermsDetailsURI!= null));
        }
        {
            PaymentDueDateType thePaymentDueDate;
            thePaymentDueDate = this.getPaymentDueDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentDueDate", thePaymentDueDate), currentHashCode, thePaymentDueDate, (this.paymentDueDate!= null));
        }
        {
            InstallmentDueDateType theInstallmentDueDate;
            theInstallmentDueDate = this.getInstallmentDueDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "installmentDueDate", theInstallmentDueDate), currentHashCode, theInstallmentDueDate, (this.installmentDueDate!= null));
        }
        {
            InvoicingPartyReferenceType theInvoicingPartyReference;
            theInvoicingPartyReference = this.getInvoicingPartyReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoicingPartyReference", theInvoicingPartyReference), currentHashCode, theInvoicingPartyReference, (this.invoicingPartyReference!= null));
        }
        {
            PeriodType theSettlementPeriod;
            theSettlementPeriod = this.getSettlementPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "settlementPeriod", theSettlementPeriod), currentHashCode, theSettlementPeriod, (this.settlementPeriod!= null));
        }
        {
            PeriodType thePenaltyPeriod;
            thePenaltyPeriod = this.getPenaltyPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "penaltyPeriod", thePenaltyPeriod), currentHashCode, thePenaltyPeriod, (this.penaltyPeriod!= null));
        }
        {
            ExchangeRateType theExchangeRate;
            theExchangeRate = this.getExchangeRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exchangeRate", theExchangeRate), currentHashCode, theExchangeRate, (this.exchangeRate!= null));
        }
        {
            PeriodType theValidityPeriod;
            theValidityPeriod = this.getValidityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validityPeriod", theValidityPeriod), currentHashCode, theValidityPeriod, (this.validityPeriod!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
