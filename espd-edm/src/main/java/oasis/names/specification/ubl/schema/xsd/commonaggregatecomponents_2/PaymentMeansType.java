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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InstructionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InstructionNoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentChannelCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentDueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentMeansCodeType;
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
 * <p>Classe Java per PaymentMeansType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PaymentMeansType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentMeansCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentDueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentChannelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InstructionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InstructionNote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CardAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PayerFinancialAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PayeeFinancialAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CreditAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentMandate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TradeFinancing" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMeansType", propOrder = {
    "id",
    "paymentMeansCode",
    "paymentDueDate",
    "paymentChannelCode",
    "instructionID",
    "instructionNote",
    "paymentID",
    "cardAccount",
    "payerFinancialAccount",
    "payeeFinancialAccount",
    "creditAccount",
    "paymentMandate",
    "tradeFinancing"
})
public class PaymentMeansType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "PaymentMeansCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PaymentMeansCodeType paymentMeansCode;
    @XmlElement(name = "PaymentDueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentDueDateType paymentDueDate;
    @XmlElement(name = "PaymentChannelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentChannelCodeType paymentChannelCode;
    @XmlElement(name = "InstructionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InstructionIDType instructionID;
    @XmlElement(name = "InstructionNote", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<InstructionNoteType> instructionNote;
    @XmlElement(name = "PaymentID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PaymentIDType> paymentID;
    @XmlElement(name = "CardAccount")
    protected CardAccountType cardAccount;
    @XmlElement(name = "PayerFinancialAccount")
    protected FinancialAccountType payerFinancialAccount;
    @XmlElement(name = "PayeeFinancialAccount")
    protected FinancialAccountType payeeFinancialAccount;
    @XmlElement(name = "CreditAccount")
    protected CreditAccountType creditAccount;
    @XmlElement(name = "PaymentMandate")
    protected PaymentMandateType paymentMandate;
    @XmlElement(name = "TradeFinancing")
    protected TradeFinancingType tradeFinancing;

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
     * Recupera il valore della proprietà paymentMeansCode.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMeansCodeType }
     *     
     */
    public PaymentMeansCodeType getPaymentMeansCode() {
        return paymentMeansCode;
    }

    /**
     * Imposta il valore della proprietà paymentMeansCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMeansCodeType }
     *     
     */
    public void setPaymentMeansCode(PaymentMeansCodeType value) {
        this.paymentMeansCode = value;
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
     * Recupera il valore della proprietà paymentChannelCode.
     * 
     * @return
     *     possible object is
     *     {@link PaymentChannelCodeType }
     *     
     */
    public PaymentChannelCodeType getPaymentChannelCode() {
        return paymentChannelCode;
    }

    /**
     * Imposta il valore della proprietà paymentChannelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentChannelCodeType }
     *     
     */
    public void setPaymentChannelCode(PaymentChannelCodeType value) {
        this.paymentChannelCode = value;
    }

    /**
     * Recupera il valore della proprietà instructionID.
     * 
     * @return
     *     possible object is
     *     {@link InstructionIDType }
     *     
     */
    public InstructionIDType getInstructionID() {
        return instructionID;
    }

    /**
     * Imposta il valore della proprietà instructionID.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionIDType }
     *     
     */
    public void setInstructionID(InstructionIDType value) {
        this.instructionID = value;
    }

    /**
     * Gets the value of the instructionNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instructionNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstructionNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionNoteType }
     * 
     * 
     */
    public List<InstructionNoteType> getInstructionNote() {
        if (instructionNote == null) {
            instructionNote = new ArrayList<InstructionNoteType>();
        }
        return this.instructionNote;
    }

    /**
     * Gets the value of the paymentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentIDType }
     * 
     * 
     */
    public List<PaymentIDType> getPaymentID() {
        if (paymentID == null) {
            paymentID = new ArrayList<PaymentIDType>();
        }
        return this.paymentID;
    }

    /**
     * Recupera il valore della proprietà cardAccount.
     * 
     * @return
     *     possible object is
     *     {@link CardAccountType }
     *     
     */
    public CardAccountType getCardAccount() {
        return cardAccount;
    }

    /**
     * Imposta il valore della proprietà cardAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccountType }
     *     
     */
    public void setCardAccount(CardAccountType value) {
        this.cardAccount = value;
    }

    /**
     * Recupera il valore della proprietà payerFinancialAccount.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountType }
     *     
     */
    public FinancialAccountType getPayerFinancialAccount() {
        return payerFinancialAccount;
    }

    /**
     * Imposta il valore della proprietà payerFinancialAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountType }
     *     
     */
    public void setPayerFinancialAccount(FinancialAccountType value) {
        this.payerFinancialAccount = value;
    }

    /**
     * Recupera il valore della proprietà payeeFinancialAccount.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountType }
     *     
     */
    public FinancialAccountType getPayeeFinancialAccount() {
        return payeeFinancialAccount;
    }

    /**
     * Imposta il valore della proprietà payeeFinancialAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountType }
     *     
     */
    public void setPayeeFinancialAccount(FinancialAccountType value) {
        this.payeeFinancialAccount = value;
    }

    /**
     * Recupera il valore della proprietà creditAccount.
     * 
     * @return
     *     possible object is
     *     {@link CreditAccountType }
     *     
     */
    public CreditAccountType getCreditAccount() {
        return creditAccount;
    }

    /**
     * Imposta il valore della proprietà creditAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAccountType }
     *     
     */
    public void setCreditAccount(CreditAccountType value) {
        this.creditAccount = value;
    }

    /**
     * Recupera il valore della proprietà paymentMandate.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMandateType }
     *     
     */
    public PaymentMandateType getPaymentMandate() {
        return paymentMandate;
    }

    /**
     * Imposta il valore della proprietà paymentMandate.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMandateType }
     *     
     */
    public void setPaymentMandate(PaymentMandateType value) {
        this.paymentMandate = value;
    }

    /**
     * Recupera il valore della proprietà tradeFinancing.
     * 
     * @return
     *     possible object is
     *     {@link TradeFinancingType }
     *     
     */
    public TradeFinancingType getTradeFinancing() {
        return tradeFinancing;
    }

    /**
     * Imposta il valore della proprietà tradeFinancing.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeFinancingType }
     *     
     */
    public void setTradeFinancing(TradeFinancingType value) {
        this.tradeFinancing = value;
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
            PaymentMeansCodeType thePaymentMeansCode;
            thePaymentMeansCode = this.getPaymentMeansCode();
            strategy.appendField(locator, this, "paymentMeansCode", buffer, thePaymentMeansCode, (this.paymentMeansCode!= null));
        }
        {
            PaymentDueDateType thePaymentDueDate;
            thePaymentDueDate = this.getPaymentDueDate();
            strategy.appendField(locator, this, "paymentDueDate", buffer, thePaymentDueDate, (this.paymentDueDate!= null));
        }
        {
            PaymentChannelCodeType thePaymentChannelCode;
            thePaymentChannelCode = this.getPaymentChannelCode();
            strategy.appendField(locator, this, "paymentChannelCode", buffer, thePaymentChannelCode, (this.paymentChannelCode!= null));
        }
        {
            InstructionIDType theInstructionID;
            theInstructionID = this.getInstructionID();
            strategy.appendField(locator, this, "instructionID", buffer, theInstructionID, (this.instructionID!= null));
        }
        {
            List<InstructionNoteType> theInstructionNote;
            theInstructionNote = (((this.instructionNote!= null)&&(!this.instructionNote.isEmpty()))?this.getInstructionNote():null);
            strategy.appendField(locator, this, "instructionNote", buffer, theInstructionNote, ((this.instructionNote!= null)&&(!this.instructionNote.isEmpty())));
        }
        {
            List<PaymentIDType> thePaymentID;
            thePaymentID = (((this.paymentID!= null)&&(!this.paymentID.isEmpty()))?this.getPaymentID():null);
            strategy.appendField(locator, this, "paymentID", buffer, thePaymentID, ((this.paymentID!= null)&&(!this.paymentID.isEmpty())));
        }
        {
            CardAccountType theCardAccount;
            theCardAccount = this.getCardAccount();
            strategy.appendField(locator, this, "cardAccount", buffer, theCardAccount, (this.cardAccount!= null));
        }
        {
            FinancialAccountType thePayerFinancialAccount;
            thePayerFinancialAccount = this.getPayerFinancialAccount();
            strategy.appendField(locator, this, "payerFinancialAccount", buffer, thePayerFinancialAccount, (this.payerFinancialAccount!= null));
        }
        {
            FinancialAccountType thePayeeFinancialAccount;
            thePayeeFinancialAccount = this.getPayeeFinancialAccount();
            strategy.appendField(locator, this, "payeeFinancialAccount", buffer, thePayeeFinancialAccount, (this.payeeFinancialAccount!= null));
        }
        {
            CreditAccountType theCreditAccount;
            theCreditAccount = this.getCreditAccount();
            strategy.appendField(locator, this, "creditAccount", buffer, theCreditAccount, (this.creditAccount!= null));
        }
        {
            PaymentMandateType thePaymentMandate;
            thePaymentMandate = this.getPaymentMandate();
            strategy.appendField(locator, this, "paymentMandate", buffer, thePaymentMandate, (this.paymentMandate!= null));
        }
        {
            TradeFinancingType theTradeFinancing;
            theTradeFinancing = this.getTradeFinancing();
            strategy.appendField(locator, this, "tradeFinancing", buffer, theTradeFinancing, (this.tradeFinancing!= null));
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
        final PaymentMeansType that = ((PaymentMeansType) object);
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
            PaymentMeansCodeType lhsPaymentMeansCode;
            lhsPaymentMeansCode = this.getPaymentMeansCode();
            PaymentMeansCodeType rhsPaymentMeansCode;
            rhsPaymentMeansCode = that.getPaymentMeansCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentMeansCode", lhsPaymentMeansCode), LocatorUtils.property(thatLocator, "paymentMeansCode", rhsPaymentMeansCode), lhsPaymentMeansCode, rhsPaymentMeansCode, (this.paymentMeansCode!= null), (that.paymentMeansCode!= null))) {
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
            PaymentChannelCodeType lhsPaymentChannelCode;
            lhsPaymentChannelCode = this.getPaymentChannelCode();
            PaymentChannelCodeType rhsPaymentChannelCode;
            rhsPaymentChannelCode = that.getPaymentChannelCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentChannelCode", lhsPaymentChannelCode), LocatorUtils.property(thatLocator, "paymentChannelCode", rhsPaymentChannelCode), lhsPaymentChannelCode, rhsPaymentChannelCode, (this.paymentChannelCode!= null), (that.paymentChannelCode!= null))) {
                return false;
            }
        }
        {
            InstructionIDType lhsInstructionID;
            lhsInstructionID = this.getInstructionID();
            InstructionIDType rhsInstructionID;
            rhsInstructionID = that.getInstructionID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instructionID", lhsInstructionID), LocatorUtils.property(thatLocator, "instructionID", rhsInstructionID), lhsInstructionID, rhsInstructionID, (this.instructionID!= null), (that.instructionID!= null))) {
                return false;
            }
        }
        {
            List<InstructionNoteType> lhsInstructionNote;
            lhsInstructionNote = (((this.instructionNote!= null)&&(!this.instructionNote.isEmpty()))?this.getInstructionNote():null);
            List<InstructionNoteType> rhsInstructionNote;
            rhsInstructionNote = (((that.instructionNote!= null)&&(!that.instructionNote.isEmpty()))?that.getInstructionNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instructionNote", lhsInstructionNote), LocatorUtils.property(thatLocator, "instructionNote", rhsInstructionNote), lhsInstructionNote, rhsInstructionNote, ((this.instructionNote!= null)&&(!this.instructionNote.isEmpty())), ((that.instructionNote!= null)&&(!that.instructionNote.isEmpty())))) {
                return false;
            }
        }
        {
            List<PaymentIDType> lhsPaymentID;
            lhsPaymentID = (((this.paymentID!= null)&&(!this.paymentID.isEmpty()))?this.getPaymentID():null);
            List<PaymentIDType> rhsPaymentID;
            rhsPaymentID = (((that.paymentID!= null)&&(!that.paymentID.isEmpty()))?that.getPaymentID():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentID", lhsPaymentID), LocatorUtils.property(thatLocator, "paymentID", rhsPaymentID), lhsPaymentID, rhsPaymentID, ((this.paymentID!= null)&&(!this.paymentID.isEmpty())), ((that.paymentID!= null)&&(!that.paymentID.isEmpty())))) {
                return false;
            }
        }
        {
            CardAccountType lhsCardAccount;
            lhsCardAccount = this.getCardAccount();
            CardAccountType rhsCardAccount;
            rhsCardAccount = that.getCardAccount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardAccount", lhsCardAccount), LocatorUtils.property(thatLocator, "cardAccount", rhsCardAccount), lhsCardAccount, rhsCardAccount, (this.cardAccount!= null), (that.cardAccount!= null))) {
                return false;
            }
        }
        {
            FinancialAccountType lhsPayerFinancialAccount;
            lhsPayerFinancialAccount = this.getPayerFinancialAccount();
            FinancialAccountType rhsPayerFinancialAccount;
            rhsPayerFinancialAccount = that.getPayerFinancialAccount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payerFinancialAccount", lhsPayerFinancialAccount), LocatorUtils.property(thatLocator, "payerFinancialAccount", rhsPayerFinancialAccount), lhsPayerFinancialAccount, rhsPayerFinancialAccount, (this.payerFinancialAccount!= null), (that.payerFinancialAccount!= null))) {
                return false;
            }
        }
        {
            FinancialAccountType lhsPayeeFinancialAccount;
            lhsPayeeFinancialAccount = this.getPayeeFinancialAccount();
            FinancialAccountType rhsPayeeFinancialAccount;
            rhsPayeeFinancialAccount = that.getPayeeFinancialAccount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payeeFinancialAccount", lhsPayeeFinancialAccount), LocatorUtils.property(thatLocator, "payeeFinancialAccount", rhsPayeeFinancialAccount), lhsPayeeFinancialAccount, rhsPayeeFinancialAccount, (this.payeeFinancialAccount!= null), (that.payeeFinancialAccount!= null))) {
                return false;
            }
        }
        {
            CreditAccountType lhsCreditAccount;
            lhsCreditAccount = this.getCreditAccount();
            CreditAccountType rhsCreditAccount;
            rhsCreditAccount = that.getCreditAccount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creditAccount", lhsCreditAccount), LocatorUtils.property(thatLocator, "creditAccount", rhsCreditAccount), lhsCreditAccount, rhsCreditAccount, (this.creditAccount!= null), (that.creditAccount!= null))) {
                return false;
            }
        }
        {
            PaymentMandateType lhsPaymentMandate;
            lhsPaymentMandate = this.getPaymentMandate();
            PaymentMandateType rhsPaymentMandate;
            rhsPaymentMandate = that.getPaymentMandate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentMandate", lhsPaymentMandate), LocatorUtils.property(thatLocator, "paymentMandate", rhsPaymentMandate), lhsPaymentMandate, rhsPaymentMandate, (this.paymentMandate!= null), (that.paymentMandate!= null))) {
                return false;
            }
        }
        {
            TradeFinancingType lhsTradeFinancing;
            lhsTradeFinancing = this.getTradeFinancing();
            TradeFinancingType rhsTradeFinancing;
            rhsTradeFinancing = that.getTradeFinancing();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tradeFinancing", lhsTradeFinancing), LocatorUtils.property(thatLocator, "tradeFinancing", rhsTradeFinancing), lhsTradeFinancing, rhsTradeFinancing, (this.tradeFinancing!= null), (that.tradeFinancing!= null))) {
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
            PaymentMeansCodeType thePaymentMeansCode;
            thePaymentMeansCode = this.getPaymentMeansCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentMeansCode", thePaymentMeansCode), currentHashCode, thePaymentMeansCode, (this.paymentMeansCode!= null));
        }
        {
            PaymentDueDateType thePaymentDueDate;
            thePaymentDueDate = this.getPaymentDueDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentDueDate", thePaymentDueDate), currentHashCode, thePaymentDueDate, (this.paymentDueDate!= null));
        }
        {
            PaymentChannelCodeType thePaymentChannelCode;
            thePaymentChannelCode = this.getPaymentChannelCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentChannelCode", thePaymentChannelCode), currentHashCode, thePaymentChannelCode, (this.paymentChannelCode!= null));
        }
        {
            InstructionIDType theInstructionID;
            theInstructionID = this.getInstructionID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instructionID", theInstructionID), currentHashCode, theInstructionID, (this.instructionID!= null));
        }
        {
            List<InstructionNoteType> theInstructionNote;
            theInstructionNote = (((this.instructionNote!= null)&&(!this.instructionNote.isEmpty()))?this.getInstructionNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instructionNote", theInstructionNote), currentHashCode, theInstructionNote, ((this.instructionNote!= null)&&(!this.instructionNote.isEmpty())));
        }
        {
            List<PaymentIDType> thePaymentID;
            thePaymentID = (((this.paymentID!= null)&&(!this.paymentID.isEmpty()))?this.getPaymentID():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentID", thePaymentID), currentHashCode, thePaymentID, ((this.paymentID!= null)&&(!this.paymentID.isEmpty())));
        }
        {
            CardAccountType theCardAccount;
            theCardAccount = this.getCardAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardAccount", theCardAccount), currentHashCode, theCardAccount, (this.cardAccount!= null));
        }
        {
            FinancialAccountType thePayerFinancialAccount;
            thePayerFinancialAccount = this.getPayerFinancialAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payerFinancialAccount", thePayerFinancialAccount), currentHashCode, thePayerFinancialAccount, (this.payerFinancialAccount!= null));
        }
        {
            FinancialAccountType thePayeeFinancialAccount;
            thePayeeFinancialAccount = this.getPayeeFinancialAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payeeFinancialAccount", thePayeeFinancialAccount), currentHashCode, thePayeeFinancialAccount, (this.payeeFinancialAccount!= null));
        }
        {
            CreditAccountType theCreditAccount;
            theCreditAccount = this.getCreditAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creditAccount", theCreditAccount), currentHashCode, theCreditAccount, (this.creditAccount!= null));
        }
        {
            PaymentMandateType thePaymentMandate;
            thePaymentMandate = this.getPaymentMandate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentMandate", thePaymentMandate), currentHashCode, thePaymentMandate, (this.paymentMandate!= null));
        }
        {
            TradeFinancingType theTradeFinancing;
            theTradeFinancing = this.getTradeFinancing();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tradeFinancing", theTradeFinancing), currentHashCode, theTradeFinancing, (this.tradeFinancing!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
