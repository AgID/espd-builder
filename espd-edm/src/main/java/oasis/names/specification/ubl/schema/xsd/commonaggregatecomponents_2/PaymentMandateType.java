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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MandateTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumPaidAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumPaymentInstructionsNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SignatureIDType;
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
 * <p>Classe Java per PaymentMandateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PaymentMandateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MandateTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumPaymentInstructionsNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumPaidAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SignatureID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PayerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PayerFinancialAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentReversalPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Clause" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMandateType", propOrder = {
    "id",
    "mandateTypeCode",
    "maximumPaymentInstructionsNumeric",
    "maximumPaidAmount",
    "signatureID",
    "payerParty",
    "payerFinancialAccount",
    "validityPeriod",
    "paymentReversalPeriod",
    "clause"
})
public class PaymentMandateType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "MandateTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MandateTypeCodeType mandateTypeCode;
    @XmlElement(name = "MaximumPaymentInstructionsNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumPaymentInstructionsNumericType maximumPaymentInstructionsNumeric;
    @XmlElement(name = "MaximumPaidAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumPaidAmountType maximumPaidAmount;
    @XmlElement(name = "SignatureID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SignatureIDType signatureID;
    @XmlElement(name = "PayerParty")
    protected PartyType payerParty;
    @XmlElement(name = "PayerFinancialAccount")
    protected FinancialAccountType payerFinancialAccount;
    @XmlElement(name = "ValidityPeriod")
    protected PeriodType validityPeriod;
    @XmlElement(name = "PaymentReversalPeriod")
    protected PeriodType paymentReversalPeriod;
    @XmlElement(name = "Clause")
    protected List<ClauseType> clause;

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
     * Recupera il valore della proprietà mandateTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link MandateTypeCodeType }
     *     
     */
    public MandateTypeCodeType getMandateTypeCode() {
        return mandateTypeCode;
    }

    /**
     * Imposta il valore della proprietà mandateTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateTypeCodeType }
     *     
     */
    public void setMandateTypeCode(MandateTypeCodeType value) {
        this.mandateTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà maximumPaymentInstructionsNumeric.
     * 
     * @return
     *     possible object is
     *     {@link MaximumPaymentInstructionsNumericType }
     *     
     */
    public MaximumPaymentInstructionsNumericType getMaximumPaymentInstructionsNumeric() {
        return maximumPaymentInstructionsNumeric;
    }

    /**
     * Imposta il valore della proprietà maximumPaymentInstructionsNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumPaymentInstructionsNumericType }
     *     
     */
    public void setMaximumPaymentInstructionsNumeric(MaximumPaymentInstructionsNumericType value) {
        this.maximumPaymentInstructionsNumeric = value;
    }

    /**
     * Recupera il valore della proprietà maximumPaidAmount.
     * 
     * @return
     *     possible object is
     *     {@link MaximumPaidAmountType }
     *     
     */
    public MaximumPaidAmountType getMaximumPaidAmount() {
        return maximumPaidAmount;
    }

    /**
     * Imposta il valore della proprietà maximumPaidAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumPaidAmountType }
     *     
     */
    public void setMaximumPaidAmount(MaximumPaidAmountType value) {
        this.maximumPaidAmount = value;
    }

    /**
     * Recupera il valore della proprietà signatureID.
     * 
     * @return
     *     possible object is
     *     {@link SignatureIDType }
     *     
     */
    public SignatureIDType getSignatureID() {
        return signatureID;
    }

    /**
     * Imposta il valore della proprietà signatureID.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureIDType }
     *     
     */
    public void setSignatureID(SignatureIDType value) {
        this.signatureID = value;
    }

    /**
     * Recupera il valore della proprietà payerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPayerParty() {
        return payerParty;
    }

    /**
     * Imposta il valore della proprietà payerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPayerParty(PartyType value) {
        this.payerParty = value;
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

    /**
     * Recupera il valore della proprietà paymentReversalPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPaymentReversalPeriod() {
        return paymentReversalPeriod;
    }

    /**
     * Imposta il valore della proprietà paymentReversalPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPaymentReversalPeriod(PeriodType value) {
        this.paymentReversalPeriod = value;
    }

    /**
     * Gets the value of the clause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClauseType }
     * 
     * 
     */
    public List<ClauseType> getClause() {
        if (clause == null) {
            clause = new ArrayList<ClauseType>();
        }
        return this.clause;
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
            MandateTypeCodeType theMandateTypeCode;
            theMandateTypeCode = this.getMandateTypeCode();
            strategy.appendField(locator, this, "mandateTypeCode", buffer, theMandateTypeCode, (this.mandateTypeCode!= null));
        }
        {
            MaximumPaymentInstructionsNumericType theMaximumPaymentInstructionsNumeric;
            theMaximumPaymentInstructionsNumeric = this.getMaximumPaymentInstructionsNumeric();
            strategy.appendField(locator, this, "maximumPaymentInstructionsNumeric", buffer, theMaximumPaymentInstructionsNumeric, (this.maximumPaymentInstructionsNumeric!= null));
        }
        {
            MaximumPaidAmountType theMaximumPaidAmount;
            theMaximumPaidAmount = this.getMaximumPaidAmount();
            strategy.appendField(locator, this, "maximumPaidAmount", buffer, theMaximumPaidAmount, (this.maximumPaidAmount!= null));
        }
        {
            SignatureIDType theSignatureID;
            theSignatureID = this.getSignatureID();
            strategy.appendField(locator, this, "signatureID", buffer, theSignatureID, (this.signatureID!= null));
        }
        {
            PartyType thePayerParty;
            thePayerParty = this.getPayerParty();
            strategy.appendField(locator, this, "payerParty", buffer, thePayerParty, (this.payerParty!= null));
        }
        {
            FinancialAccountType thePayerFinancialAccount;
            thePayerFinancialAccount = this.getPayerFinancialAccount();
            strategy.appendField(locator, this, "payerFinancialAccount", buffer, thePayerFinancialAccount, (this.payerFinancialAccount!= null));
        }
        {
            PeriodType theValidityPeriod;
            theValidityPeriod = this.getValidityPeriod();
            strategy.appendField(locator, this, "validityPeriod", buffer, theValidityPeriod, (this.validityPeriod!= null));
        }
        {
            PeriodType thePaymentReversalPeriod;
            thePaymentReversalPeriod = this.getPaymentReversalPeriod();
            strategy.appendField(locator, this, "paymentReversalPeriod", buffer, thePaymentReversalPeriod, (this.paymentReversalPeriod!= null));
        }
        {
            List<ClauseType> theClause;
            theClause = (((this.clause!= null)&&(!this.clause.isEmpty()))?this.getClause():null);
            strategy.appendField(locator, this, "clause", buffer, theClause, ((this.clause!= null)&&(!this.clause.isEmpty())));
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
        final PaymentMandateType that = ((PaymentMandateType) object);
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
            MandateTypeCodeType lhsMandateTypeCode;
            lhsMandateTypeCode = this.getMandateTypeCode();
            MandateTypeCodeType rhsMandateTypeCode;
            rhsMandateTypeCode = that.getMandateTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mandateTypeCode", lhsMandateTypeCode), LocatorUtils.property(thatLocator, "mandateTypeCode", rhsMandateTypeCode), lhsMandateTypeCode, rhsMandateTypeCode, (this.mandateTypeCode!= null), (that.mandateTypeCode!= null))) {
                return false;
            }
        }
        {
            MaximumPaymentInstructionsNumericType lhsMaximumPaymentInstructionsNumeric;
            lhsMaximumPaymentInstructionsNumeric = this.getMaximumPaymentInstructionsNumeric();
            MaximumPaymentInstructionsNumericType rhsMaximumPaymentInstructionsNumeric;
            rhsMaximumPaymentInstructionsNumeric = that.getMaximumPaymentInstructionsNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumPaymentInstructionsNumeric", lhsMaximumPaymentInstructionsNumeric), LocatorUtils.property(thatLocator, "maximumPaymentInstructionsNumeric", rhsMaximumPaymentInstructionsNumeric), lhsMaximumPaymentInstructionsNumeric, rhsMaximumPaymentInstructionsNumeric, (this.maximumPaymentInstructionsNumeric!= null), (that.maximumPaymentInstructionsNumeric!= null))) {
                return false;
            }
        }
        {
            MaximumPaidAmountType lhsMaximumPaidAmount;
            lhsMaximumPaidAmount = this.getMaximumPaidAmount();
            MaximumPaidAmountType rhsMaximumPaidAmount;
            rhsMaximumPaidAmount = that.getMaximumPaidAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumPaidAmount", lhsMaximumPaidAmount), LocatorUtils.property(thatLocator, "maximumPaidAmount", rhsMaximumPaidAmount), lhsMaximumPaidAmount, rhsMaximumPaidAmount, (this.maximumPaidAmount!= null), (that.maximumPaidAmount!= null))) {
                return false;
            }
        }
        {
            SignatureIDType lhsSignatureID;
            lhsSignatureID = this.getSignatureID();
            SignatureIDType rhsSignatureID;
            rhsSignatureID = that.getSignatureID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signatureID", lhsSignatureID), LocatorUtils.property(thatLocator, "signatureID", rhsSignatureID), lhsSignatureID, rhsSignatureID, (this.signatureID!= null), (that.signatureID!= null))) {
                return false;
            }
        }
        {
            PartyType lhsPayerParty;
            lhsPayerParty = this.getPayerParty();
            PartyType rhsPayerParty;
            rhsPayerParty = that.getPayerParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payerParty", lhsPayerParty), LocatorUtils.property(thatLocator, "payerParty", rhsPayerParty), lhsPayerParty, rhsPayerParty, (this.payerParty!= null), (that.payerParty!= null))) {
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
            PeriodType lhsValidityPeriod;
            lhsValidityPeriod = this.getValidityPeriod();
            PeriodType rhsValidityPeriod;
            rhsValidityPeriod = that.getValidityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validityPeriod", lhsValidityPeriod), LocatorUtils.property(thatLocator, "validityPeriod", rhsValidityPeriod), lhsValidityPeriod, rhsValidityPeriod, (this.validityPeriod!= null), (that.validityPeriod!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsPaymentReversalPeriod;
            lhsPaymentReversalPeriod = this.getPaymentReversalPeriod();
            PeriodType rhsPaymentReversalPeriod;
            rhsPaymentReversalPeriod = that.getPaymentReversalPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentReversalPeriod", lhsPaymentReversalPeriod), LocatorUtils.property(thatLocator, "paymentReversalPeriod", rhsPaymentReversalPeriod), lhsPaymentReversalPeriod, rhsPaymentReversalPeriod, (this.paymentReversalPeriod!= null), (that.paymentReversalPeriod!= null))) {
                return false;
            }
        }
        {
            List<ClauseType> lhsClause;
            lhsClause = (((this.clause!= null)&&(!this.clause.isEmpty()))?this.getClause():null);
            List<ClauseType> rhsClause;
            rhsClause = (((that.clause!= null)&&(!that.clause.isEmpty()))?that.getClause():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clause", lhsClause), LocatorUtils.property(thatLocator, "clause", rhsClause), lhsClause, rhsClause, ((this.clause!= null)&&(!this.clause.isEmpty())), ((that.clause!= null)&&(!that.clause.isEmpty())))) {
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
            MandateTypeCodeType theMandateTypeCode;
            theMandateTypeCode = this.getMandateTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mandateTypeCode", theMandateTypeCode), currentHashCode, theMandateTypeCode, (this.mandateTypeCode!= null));
        }
        {
            MaximumPaymentInstructionsNumericType theMaximumPaymentInstructionsNumeric;
            theMaximumPaymentInstructionsNumeric = this.getMaximumPaymentInstructionsNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumPaymentInstructionsNumeric", theMaximumPaymentInstructionsNumeric), currentHashCode, theMaximumPaymentInstructionsNumeric, (this.maximumPaymentInstructionsNumeric!= null));
        }
        {
            MaximumPaidAmountType theMaximumPaidAmount;
            theMaximumPaidAmount = this.getMaximumPaidAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumPaidAmount", theMaximumPaidAmount), currentHashCode, theMaximumPaidAmount, (this.maximumPaidAmount!= null));
        }
        {
            SignatureIDType theSignatureID;
            theSignatureID = this.getSignatureID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signatureID", theSignatureID), currentHashCode, theSignatureID, (this.signatureID!= null));
        }
        {
            PartyType thePayerParty;
            thePayerParty = this.getPayerParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payerParty", thePayerParty), currentHashCode, thePayerParty, (this.payerParty!= null));
        }
        {
            FinancialAccountType thePayerFinancialAccount;
            thePayerFinancialAccount = this.getPayerFinancialAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payerFinancialAccount", thePayerFinancialAccount), currentHashCode, thePayerFinancialAccount, (this.payerFinancialAccount!= null));
        }
        {
            PeriodType theValidityPeriod;
            theValidityPeriod = this.getValidityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validityPeriod", theValidityPeriod), currentHashCode, theValidityPeriod, (this.validityPeriod!= null));
        }
        {
            PeriodType thePaymentReversalPeriod;
            thePaymentReversalPeriod = this.getPaymentReversalPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentReversalPeriod", thePaymentReversalPeriod), currentHashCode, thePaymentReversalPeriod, (this.paymentReversalPeriod!= null));
        }
        {
            List<ClauseType> theClause;
            theClause = (((this.clause!= null)&&(!this.clause.isEmpty()))?this.getClause():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clause", theClause), currentHashCode, theClause, ((this.clause!= null)&&(!this.clause.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
