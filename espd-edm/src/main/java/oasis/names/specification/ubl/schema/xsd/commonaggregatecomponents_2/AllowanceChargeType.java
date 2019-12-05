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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AllowanceChargeReasonCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AllowanceChargeReasonType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BaseAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ChargeIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MultiplierFactorNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PerUnitAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PrepaidIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SequenceNumericType;
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
 * <p>Classe Java per AllowanceChargeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AllowanceChargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChargeIndicator"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AllowanceChargeReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AllowanceChargeReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MultiplierFactorNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrepaidIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BaseAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCostCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCost" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerUnitAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentMeans" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowanceChargeType", propOrder = {
    "id",
    "chargeIndicator",
    "allowanceChargeReasonCode",
    "allowanceChargeReason",
    "multiplierFactorNumeric",
    "prepaidIndicator",
    "sequenceNumeric",
    "amount",
    "baseAmount",
    "accountingCostCode",
    "accountingCost",
    "perUnitAmount",
    "taxCategory",
    "taxTotal",
    "paymentMeans"
})
public class AllowanceChargeType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "ChargeIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ChargeIndicatorType chargeIndicator;
    @XmlElement(name = "AllowanceChargeReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AllowanceChargeReasonCodeType allowanceChargeReasonCode;
    @XmlElement(name = "AllowanceChargeReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<AllowanceChargeReasonType> allowanceChargeReason;
    @XmlElement(name = "MultiplierFactorNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MultiplierFactorNumericType multiplierFactorNumeric;
    @XmlElement(name = "PrepaidIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PrepaidIndicatorType prepaidIndicator;
    @XmlElement(name = "SequenceNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SequenceNumericType sequenceNumeric;
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected AmountType amount;
    @XmlElement(name = "BaseAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BaseAmountType baseAmount;
    @XmlElement(name = "AccountingCostCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountingCostCodeType accountingCostCode;
    @XmlElement(name = "AccountingCost", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountingCostType accountingCost;
    @XmlElement(name = "PerUnitAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PerUnitAmountType perUnitAmount;
    @XmlElement(name = "TaxCategory")
    protected List<TaxCategoryType> taxCategory;
    @XmlElement(name = "TaxTotal")
    protected TaxTotalType taxTotal;
    @XmlElement(name = "PaymentMeans")
    protected List<PaymentMeansType> paymentMeans;

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
     * Recupera il valore della proprietà chargeIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ChargeIndicatorType }
     *     
     */
    public ChargeIndicatorType getChargeIndicator() {
        return chargeIndicator;
    }

    /**
     * Imposta il valore della proprietà chargeIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeIndicatorType }
     *     
     */
    public void setChargeIndicator(ChargeIndicatorType value) {
        this.chargeIndicator = value;
    }

    /**
     * Recupera il valore della proprietà allowanceChargeReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceChargeReasonCodeType }
     *     
     */
    public AllowanceChargeReasonCodeType getAllowanceChargeReasonCode() {
        return allowanceChargeReasonCode;
    }

    /**
     * Imposta il valore della proprietà allowanceChargeReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceChargeReasonCodeType }
     *     
     */
    public void setAllowanceChargeReasonCode(AllowanceChargeReasonCodeType value) {
        this.allowanceChargeReasonCode = value;
    }

    /**
     * Gets the value of the allowanceChargeReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceChargeReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceChargeReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeReasonType }
     * 
     * 
     */
    public List<AllowanceChargeReasonType> getAllowanceChargeReason() {
        if (allowanceChargeReason == null) {
            allowanceChargeReason = new ArrayList<AllowanceChargeReasonType>();
        }
        return this.allowanceChargeReason;
    }

    /**
     * Recupera il valore della proprietà multiplierFactorNumeric.
     * 
     * @return
     *     possible object is
     *     {@link MultiplierFactorNumericType }
     *     
     */
    public MultiplierFactorNumericType getMultiplierFactorNumeric() {
        return multiplierFactorNumeric;
    }

    /**
     * Imposta il valore della proprietà multiplierFactorNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiplierFactorNumericType }
     *     
     */
    public void setMultiplierFactorNumeric(MultiplierFactorNumericType value) {
        this.multiplierFactorNumeric = value;
    }

    /**
     * Recupera il valore della proprietà prepaidIndicator.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidIndicatorType }
     *     
     */
    public PrepaidIndicatorType getPrepaidIndicator() {
        return prepaidIndicator;
    }

    /**
     * Imposta il valore della proprietà prepaidIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidIndicatorType }
     *     
     */
    public void setPrepaidIndicator(PrepaidIndicatorType value) {
        this.prepaidIndicator = value;
    }

    /**
     * Recupera il valore della proprietà sequenceNumeric.
     * 
     * @return
     *     possible object is
     *     {@link SequenceNumericType }
     *     
     */
    public SequenceNumericType getSequenceNumeric() {
        return sequenceNumeric;
    }

    /**
     * Imposta il valore della proprietà sequenceNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceNumericType }
     *     
     */
    public void setSequenceNumeric(SequenceNumericType value) {
        this.sequenceNumeric = value;
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
     * Recupera il valore della proprietà baseAmount.
     * 
     * @return
     *     possible object is
     *     {@link BaseAmountType }
     *     
     */
    public BaseAmountType getBaseAmount() {
        return baseAmount;
    }

    /**
     * Imposta il valore della proprietà baseAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAmountType }
     *     
     */
    public void setBaseAmount(BaseAmountType value) {
        this.baseAmount = value;
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
     * Recupera il valore della proprietà perUnitAmount.
     * 
     * @return
     *     possible object is
     *     {@link PerUnitAmountType }
     *     
     */
    public PerUnitAmountType getPerUnitAmount() {
        return perUnitAmount;
    }

    /**
     * Imposta il valore della proprietà perUnitAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PerUnitAmountType }
     *     
     */
    public void setPerUnitAmount(PerUnitAmountType value) {
        this.perUnitAmount = value;
    }

    /**
     * Gets the value of the taxCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCategoryType }
     * 
     * 
     */
    public List<TaxCategoryType> getTaxCategory() {
        if (taxCategory == null) {
            taxCategory = new ArrayList<TaxCategoryType>();
        }
        return this.taxCategory;
    }

    /**
     * Recupera il valore della proprietà taxTotal.
     * 
     * @return
     *     possible object is
     *     {@link TaxTotalType }
     *     
     */
    public TaxTotalType getTaxTotal() {
        return taxTotal;
    }

    /**
     * Imposta il valore della proprietà taxTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTotalType }
     *     
     */
    public void setTaxTotal(TaxTotalType value) {
        this.taxTotal = value;
    }

    /**
     * Gets the value of the paymentMeans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMeans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMeansType }
     * 
     * 
     */
    public List<PaymentMeansType> getPaymentMeans() {
        if (paymentMeans == null) {
            paymentMeans = new ArrayList<PaymentMeansType>();
        }
        return this.paymentMeans;
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
            ChargeIndicatorType theChargeIndicator;
            theChargeIndicator = this.getChargeIndicator();
            strategy.appendField(locator, this, "chargeIndicator", buffer, theChargeIndicator, (this.chargeIndicator!= null));
        }
        {
            AllowanceChargeReasonCodeType theAllowanceChargeReasonCode;
            theAllowanceChargeReasonCode = this.getAllowanceChargeReasonCode();
            strategy.appendField(locator, this, "allowanceChargeReasonCode", buffer, theAllowanceChargeReasonCode, (this.allowanceChargeReasonCode!= null));
        }
        {
            List<AllowanceChargeReasonType> theAllowanceChargeReason;
            theAllowanceChargeReason = (((this.allowanceChargeReason!= null)&&(!this.allowanceChargeReason.isEmpty()))?this.getAllowanceChargeReason():null);
            strategy.appendField(locator, this, "allowanceChargeReason", buffer, theAllowanceChargeReason, ((this.allowanceChargeReason!= null)&&(!this.allowanceChargeReason.isEmpty())));
        }
        {
            MultiplierFactorNumericType theMultiplierFactorNumeric;
            theMultiplierFactorNumeric = this.getMultiplierFactorNumeric();
            strategy.appendField(locator, this, "multiplierFactorNumeric", buffer, theMultiplierFactorNumeric, (this.multiplierFactorNumeric!= null));
        }
        {
            PrepaidIndicatorType thePrepaidIndicator;
            thePrepaidIndicator = this.getPrepaidIndicator();
            strategy.appendField(locator, this, "prepaidIndicator", buffer, thePrepaidIndicator, (this.prepaidIndicator!= null));
        }
        {
            SequenceNumericType theSequenceNumeric;
            theSequenceNumeric = this.getSequenceNumeric();
            strategy.appendField(locator, this, "sequenceNumeric", buffer, theSequenceNumeric, (this.sequenceNumeric!= null));
        }
        {
            AmountType theAmount;
            theAmount = this.getAmount();
            strategy.appendField(locator, this, "amount", buffer, theAmount, (this.amount!= null));
        }
        {
            BaseAmountType theBaseAmount;
            theBaseAmount = this.getBaseAmount();
            strategy.appendField(locator, this, "baseAmount", buffer, theBaseAmount, (this.baseAmount!= null));
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
            PerUnitAmountType thePerUnitAmount;
            thePerUnitAmount = this.getPerUnitAmount();
            strategy.appendField(locator, this, "perUnitAmount", buffer, thePerUnitAmount, (this.perUnitAmount!= null));
        }
        {
            List<TaxCategoryType> theTaxCategory;
            theTaxCategory = (((this.taxCategory!= null)&&(!this.taxCategory.isEmpty()))?this.getTaxCategory():null);
            strategy.appendField(locator, this, "taxCategory", buffer, theTaxCategory, ((this.taxCategory!= null)&&(!this.taxCategory.isEmpty())));
        }
        {
            TaxTotalType theTaxTotal;
            theTaxTotal = this.getTaxTotal();
            strategy.appendField(locator, this, "taxTotal", buffer, theTaxTotal, (this.taxTotal!= null));
        }
        {
            List<PaymentMeansType> thePaymentMeans;
            thePaymentMeans = (((this.paymentMeans!= null)&&(!this.paymentMeans.isEmpty()))?this.getPaymentMeans():null);
            strategy.appendField(locator, this, "paymentMeans", buffer, thePaymentMeans, ((this.paymentMeans!= null)&&(!this.paymentMeans.isEmpty())));
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
        final AllowanceChargeType that = ((AllowanceChargeType) object);
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
            ChargeIndicatorType lhsChargeIndicator;
            lhsChargeIndicator = this.getChargeIndicator();
            ChargeIndicatorType rhsChargeIndicator;
            rhsChargeIndicator = that.getChargeIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chargeIndicator", lhsChargeIndicator), LocatorUtils.property(thatLocator, "chargeIndicator", rhsChargeIndicator), lhsChargeIndicator, rhsChargeIndicator, (this.chargeIndicator!= null), (that.chargeIndicator!= null))) {
                return false;
            }
        }
        {
            AllowanceChargeReasonCodeType lhsAllowanceChargeReasonCode;
            lhsAllowanceChargeReasonCode = this.getAllowanceChargeReasonCode();
            AllowanceChargeReasonCodeType rhsAllowanceChargeReasonCode;
            rhsAllowanceChargeReasonCode = that.getAllowanceChargeReasonCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowanceChargeReasonCode", lhsAllowanceChargeReasonCode), LocatorUtils.property(thatLocator, "allowanceChargeReasonCode", rhsAllowanceChargeReasonCode), lhsAllowanceChargeReasonCode, rhsAllowanceChargeReasonCode, (this.allowanceChargeReasonCode!= null), (that.allowanceChargeReasonCode!= null))) {
                return false;
            }
        }
        {
            List<AllowanceChargeReasonType> lhsAllowanceChargeReason;
            lhsAllowanceChargeReason = (((this.allowanceChargeReason!= null)&&(!this.allowanceChargeReason.isEmpty()))?this.getAllowanceChargeReason():null);
            List<AllowanceChargeReasonType> rhsAllowanceChargeReason;
            rhsAllowanceChargeReason = (((that.allowanceChargeReason!= null)&&(!that.allowanceChargeReason.isEmpty()))?that.getAllowanceChargeReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowanceChargeReason", lhsAllowanceChargeReason), LocatorUtils.property(thatLocator, "allowanceChargeReason", rhsAllowanceChargeReason), lhsAllowanceChargeReason, rhsAllowanceChargeReason, ((this.allowanceChargeReason!= null)&&(!this.allowanceChargeReason.isEmpty())), ((that.allowanceChargeReason!= null)&&(!that.allowanceChargeReason.isEmpty())))) {
                return false;
            }
        }
        {
            MultiplierFactorNumericType lhsMultiplierFactorNumeric;
            lhsMultiplierFactorNumeric = this.getMultiplierFactorNumeric();
            MultiplierFactorNumericType rhsMultiplierFactorNumeric;
            rhsMultiplierFactorNumeric = that.getMultiplierFactorNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multiplierFactorNumeric", lhsMultiplierFactorNumeric), LocatorUtils.property(thatLocator, "multiplierFactorNumeric", rhsMultiplierFactorNumeric), lhsMultiplierFactorNumeric, rhsMultiplierFactorNumeric, (this.multiplierFactorNumeric!= null), (that.multiplierFactorNumeric!= null))) {
                return false;
            }
        }
        {
            PrepaidIndicatorType lhsPrepaidIndicator;
            lhsPrepaidIndicator = this.getPrepaidIndicator();
            PrepaidIndicatorType rhsPrepaidIndicator;
            rhsPrepaidIndicator = that.getPrepaidIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prepaidIndicator", lhsPrepaidIndicator), LocatorUtils.property(thatLocator, "prepaidIndicator", rhsPrepaidIndicator), lhsPrepaidIndicator, rhsPrepaidIndicator, (this.prepaidIndicator!= null), (that.prepaidIndicator!= null))) {
                return false;
            }
        }
        {
            SequenceNumericType lhsSequenceNumeric;
            lhsSequenceNumeric = this.getSequenceNumeric();
            SequenceNumericType rhsSequenceNumeric;
            rhsSequenceNumeric = that.getSequenceNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceNumeric", lhsSequenceNumeric), LocatorUtils.property(thatLocator, "sequenceNumeric", rhsSequenceNumeric), lhsSequenceNumeric, rhsSequenceNumeric, (this.sequenceNumeric!= null), (that.sequenceNumeric!= null))) {
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
            BaseAmountType lhsBaseAmount;
            lhsBaseAmount = this.getBaseAmount();
            BaseAmountType rhsBaseAmount;
            rhsBaseAmount = that.getBaseAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseAmount", lhsBaseAmount), LocatorUtils.property(thatLocator, "baseAmount", rhsBaseAmount), lhsBaseAmount, rhsBaseAmount, (this.baseAmount!= null), (that.baseAmount!= null))) {
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
            PerUnitAmountType lhsPerUnitAmount;
            lhsPerUnitAmount = this.getPerUnitAmount();
            PerUnitAmountType rhsPerUnitAmount;
            rhsPerUnitAmount = that.getPerUnitAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "perUnitAmount", lhsPerUnitAmount), LocatorUtils.property(thatLocator, "perUnitAmount", rhsPerUnitAmount), lhsPerUnitAmount, rhsPerUnitAmount, (this.perUnitAmount!= null), (that.perUnitAmount!= null))) {
                return false;
            }
        }
        {
            List<TaxCategoryType> lhsTaxCategory;
            lhsTaxCategory = (((this.taxCategory!= null)&&(!this.taxCategory.isEmpty()))?this.getTaxCategory():null);
            List<TaxCategoryType> rhsTaxCategory;
            rhsTaxCategory = (((that.taxCategory!= null)&&(!that.taxCategory.isEmpty()))?that.getTaxCategory():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxCategory", lhsTaxCategory), LocatorUtils.property(thatLocator, "taxCategory", rhsTaxCategory), lhsTaxCategory, rhsTaxCategory, ((this.taxCategory!= null)&&(!this.taxCategory.isEmpty())), ((that.taxCategory!= null)&&(!that.taxCategory.isEmpty())))) {
                return false;
            }
        }
        {
            TaxTotalType lhsTaxTotal;
            lhsTaxTotal = this.getTaxTotal();
            TaxTotalType rhsTaxTotal;
            rhsTaxTotal = that.getTaxTotal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxTotal", lhsTaxTotal), LocatorUtils.property(thatLocator, "taxTotal", rhsTaxTotal), lhsTaxTotal, rhsTaxTotal, (this.taxTotal!= null), (that.taxTotal!= null))) {
                return false;
            }
        }
        {
            List<PaymentMeansType> lhsPaymentMeans;
            lhsPaymentMeans = (((this.paymentMeans!= null)&&(!this.paymentMeans.isEmpty()))?this.getPaymentMeans():null);
            List<PaymentMeansType> rhsPaymentMeans;
            rhsPaymentMeans = (((that.paymentMeans!= null)&&(!that.paymentMeans.isEmpty()))?that.getPaymentMeans():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentMeans", lhsPaymentMeans), LocatorUtils.property(thatLocator, "paymentMeans", rhsPaymentMeans), lhsPaymentMeans, rhsPaymentMeans, ((this.paymentMeans!= null)&&(!this.paymentMeans.isEmpty())), ((that.paymentMeans!= null)&&(!that.paymentMeans.isEmpty())))) {
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
            ChargeIndicatorType theChargeIndicator;
            theChargeIndicator = this.getChargeIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chargeIndicator", theChargeIndicator), currentHashCode, theChargeIndicator, (this.chargeIndicator!= null));
        }
        {
            AllowanceChargeReasonCodeType theAllowanceChargeReasonCode;
            theAllowanceChargeReasonCode = this.getAllowanceChargeReasonCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowanceChargeReasonCode", theAllowanceChargeReasonCode), currentHashCode, theAllowanceChargeReasonCode, (this.allowanceChargeReasonCode!= null));
        }
        {
            List<AllowanceChargeReasonType> theAllowanceChargeReason;
            theAllowanceChargeReason = (((this.allowanceChargeReason!= null)&&(!this.allowanceChargeReason.isEmpty()))?this.getAllowanceChargeReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowanceChargeReason", theAllowanceChargeReason), currentHashCode, theAllowanceChargeReason, ((this.allowanceChargeReason!= null)&&(!this.allowanceChargeReason.isEmpty())));
        }
        {
            MultiplierFactorNumericType theMultiplierFactorNumeric;
            theMultiplierFactorNumeric = this.getMultiplierFactorNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multiplierFactorNumeric", theMultiplierFactorNumeric), currentHashCode, theMultiplierFactorNumeric, (this.multiplierFactorNumeric!= null));
        }
        {
            PrepaidIndicatorType thePrepaidIndicator;
            thePrepaidIndicator = this.getPrepaidIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prepaidIndicator", thePrepaidIndicator), currentHashCode, thePrepaidIndicator, (this.prepaidIndicator!= null));
        }
        {
            SequenceNumericType theSequenceNumeric;
            theSequenceNumeric = this.getSequenceNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNumeric", theSequenceNumeric), currentHashCode, theSequenceNumeric, (this.sequenceNumeric!= null));
        }
        {
            AmountType theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount, (this.amount!= null));
        }
        {
            BaseAmountType theBaseAmount;
            theBaseAmount = this.getBaseAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baseAmount", theBaseAmount), currentHashCode, theBaseAmount, (this.baseAmount!= null));
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
            PerUnitAmountType thePerUnitAmount;
            thePerUnitAmount = this.getPerUnitAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "perUnitAmount", thePerUnitAmount), currentHashCode, thePerUnitAmount, (this.perUnitAmount!= null));
        }
        {
            List<TaxCategoryType> theTaxCategory;
            theTaxCategory = (((this.taxCategory!= null)&&(!this.taxCategory.isEmpty()))?this.getTaxCategory():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxCategory", theTaxCategory), currentHashCode, theTaxCategory, ((this.taxCategory!= null)&&(!this.taxCategory.isEmpty())));
        }
        {
            TaxTotalType theTaxTotal;
            theTaxTotal = this.getTaxTotal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxTotal", theTaxTotal), currentHashCode, theTaxTotal, (this.taxTotal!= null));
        }
        {
            List<PaymentMeansType> thePaymentMeans;
            thePaymentMeans = (((this.paymentMeans!= null)&&(!this.paymentMeans.isEmpty()))?this.getPaymentMeans():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentMeans", thePaymentMeans), currentHashCode, thePaymentMeans, ((this.paymentMeans!= null)&&(!this.paymentMeans.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
