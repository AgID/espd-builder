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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BaseQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OrderableUnitFactorRateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PriceAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PriceChangeReasonType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PriceTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PriceTypeType;
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
 * <p>Classe Java per PriceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceAmount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BaseQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceChangeReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderableUnitFactorRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PriceList" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PricingExchangeRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType", propOrder = {
    "priceAmount",
    "baseQuantity",
    "priceChangeReason",
    "priceTypeCode",
    "priceType",
    "orderableUnitFactorRate",
    "validityPeriod",
    "priceList",
    "allowanceCharge",
    "pricingExchangeRate"
})
public class PriceType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "PriceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PriceAmountType priceAmount;
    @XmlElement(name = "BaseQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BaseQuantityType baseQuantity;
    @XmlElement(name = "PriceChangeReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PriceChangeReasonType> priceChangeReason;
    @XmlElement(name = "PriceTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PriceTypeCodeType priceTypeCode;
    @XmlElement(name = "PriceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PriceTypeType priceType;
    @XmlElement(name = "OrderableUnitFactorRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OrderableUnitFactorRateType orderableUnitFactorRate;
    @XmlElement(name = "ValidityPeriod")
    protected List<PeriodType> validityPeriod;
    @XmlElement(name = "PriceList")
    protected PriceListType priceList;
    @XmlElement(name = "AllowanceCharge")
    protected List<AllowanceChargeType> allowanceCharge;
    @XmlElement(name = "PricingExchangeRate")
    protected ExchangeRateType pricingExchangeRate;

    /**
     * Recupera il valore della proprietà priceAmount.
     * 
     * @return
     *     possible object is
     *     {@link PriceAmountType }
     *     
     */
    public PriceAmountType getPriceAmount() {
        return priceAmount;
    }

    /**
     * Imposta il valore della proprietà priceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAmountType }
     *     
     */
    public void setPriceAmount(PriceAmountType value) {
        this.priceAmount = value;
    }

    /**
     * Recupera il valore della proprietà baseQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BaseQuantityType }
     *     
     */
    public BaseQuantityType getBaseQuantity() {
        return baseQuantity;
    }

    /**
     * Imposta il valore della proprietà baseQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseQuantityType }
     *     
     */
    public void setBaseQuantity(BaseQuantityType value) {
        this.baseQuantity = value;
    }

    /**
     * Gets the value of the priceChangeReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceChangeReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceChangeReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceChangeReasonType }
     * 
     * 
     */
    public List<PriceChangeReasonType> getPriceChangeReason() {
        if (priceChangeReason == null) {
            priceChangeReason = new ArrayList<PriceChangeReasonType>();
        }
        return this.priceChangeReason;
    }

    /**
     * Recupera il valore della proprietà priceTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PriceTypeCodeType }
     *     
     */
    public PriceTypeCodeType getPriceTypeCode() {
        return priceTypeCode;
    }

    /**
     * Imposta il valore della proprietà priceTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceTypeCodeType }
     *     
     */
    public void setPriceTypeCode(PriceTypeCodeType value) {
        this.priceTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà priceType.
     * 
     * @return
     *     possible object is
     *     {@link PriceTypeType }
     *     
     */
    public PriceTypeType getPriceType() {
        return priceType;
    }

    /**
     * Imposta il valore della proprietà priceType.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceTypeType }
     *     
     */
    public void setPriceType(PriceTypeType value) {
        this.priceType = value;
    }

    /**
     * Recupera il valore della proprietà orderableUnitFactorRate.
     * 
     * @return
     *     possible object is
     *     {@link OrderableUnitFactorRateType }
     *     
     */
    public OrderableUnitFactorRateType getOrderableUnitFactorRate() {
        return orderableUnitFactorRate;
    }

    /**
     * Imposta il valore della proprietà orderableUnitFactorRate.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderableUnitFactorRateType }
     *     
     */
    public void setOrderableUnitFactorRate(OrderableUnitFactorRateType value) {
        this.orderableUnitFactorRate = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getValidityPeriod() {
        if (validityPeriod == null) {
            validityPeriod = new ArrayList<PeriodType>();
        }
        return this.validityPeriod;
    }

    /**
     * Recupera il valore della proprietà priceList.
     * 
     * @return
     *     possible object is
     *     {@link PriceListType }
     *     
     */
    public PriceListType getPriceList() {
        return priceList;
    }

    /**
     * Imposta il valore della proprietà priceList.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceListType }
     *     
     */
    public void setPriceList(PriceListType value) {
        this.priceList = value;
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
     * Recupera il valore della proprietà pricingExchangeRate.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getPricingExchangeRate() {
        return pricingExchangeRate;
    }

    /**
     * Imposta il valore della proprietà pricingExchangeRate.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setPricingExchangeRate(ExchangeRateType value) {
        this.pricingExchangeRate = value;
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
            PriceAmountType thePriceAmount;
            thePriceAmount = this.getPriceAmount();
            strategy.appendField(locator, this, "priceAmount", buffer, thePriceAmount, (this.priceAmount!= null));
        }
        {
            BaseQuantityType theBaseQuantity;
            theBaseQuantity = this.getBaseQuantity();
            strategy.appendField(locator, this, "baseQuantity", buffer, theBaseQuantity, (this.baseQuantity!= null));
        }
        {
            List<PriceChangeReasonType> thePriceChangeReason;
            thePriceChangeReason = (((this.priceChangeReason!= null)&&(!this.priceChangeReason.isEmpty()))?this.getPriceChangeReason():null);
            strategy.appendField(locator, this, "priceChangeReason", buffer, thePriceChangeReason, ((this.priceChangeReason!= null)&&(!this.priceChangeReason.isEmpty())));
        }
        {
            PriceTypeCodeType thePriceTypeCode;
            thePriceTypeCode = this.getPriceTypeCode();
            strategy.appendField(locator, this, "priceTypeCode", buffer, thePriceTypeCode, (this.priceTypeCode!= null));
        }
        {
            PriceTypeType thePriceType;
            thePriceType = this.getPriceType();
            strategy.appendField(locator, this, "priceType", buffer, thePriceType, (this.priceType!= null));
        }
        {
            OrderableUnitFactorRateType theOrderableUnitFactorRate;
            theOrderableUnitFactorRate = this.getOrderableUnitFactorRate();
            strategy.appendField(locator, this, "orderableUnitFactorRate", buffer, theOrderableUnitFactorRate, (this.orderableUnitFactorRate!= null));
        }
        {
            List<PeriodType> theValidityPeriod;
            theValidityPeriod = (((this.validityPeriod!= null)&&(!this.validityPeriod.isEmpty()))?this.getValidityPeriod():null);
            strategy.appendField(locator, this, "validityPeriod", buffer, theValidityPeriod, ((this.validityPeriod!= null)&&(!this.validityPeriod.isEmpty())));
        }
        {
            PriceListType thePriceList;
            thePriceList = this.getPriceList();
            strategy.appendField(locator, this, "priceList", buffer, thePriceList, (this.priceList!= null));
        }
        {
            List<AllowanceChargeType> theAllowanceCharge;
            theAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            strategy.appendField(locator, this, "allowanceCharge", buffer, theAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())));
        }
        {
            ExchangeRateType thePricingExchangeRate;
            thePricingExchangeRate = this.getPricingExchangeRate();
            strategy.appendField(locator, this, "pricingExchangeRate", buffer, thePricingExchangeRate, (this.pricingExchangeRate!= null));
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
        final PriceType that = ((PriceType) object);
        {
            PriceAmountType lhsPriceAmount;
            lhsPriceAmount = this.getPriceAmount();
            PriceAmountType rhsPriceAmount;
            rhsPriceAmount = that.getPriceAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceAmount", lhsPriceAmount), LocatorUtils.property(thatLocator, "priceAmount", rhsPriceAmount), lhsPriceAmount, rhsPriceAmount, (this.priceAmount!= null), (that.priceAmount!= null))) {
                return false;
            }
        }
        {
            BaseQuantityType lhsBaseQuantity;
            lhsBaseQuantity = this.getBaseQuantity();
            BaseQuantityType rhsBaseQuantity;
            rhsBaseQuantity = that.getBaseQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseQuantity", lhsBaseQuantity), LocatorUtils.property(thatLocator, "baseQuantity", rhsBaseQuantity), lhsBaseQuantity, rhsBaseQuantity, (this.baseQuantity!= null), (that.baseQuantity!= null))) {
                return false;
            }
        }
        {
            List<PriceChangeReasonType> lhsPriceChangeReason;
            lhsPriceChangeReason = (((this.priceChangeReason!= null)&&(!this.priceChangeReason.isEmpty()))?this.getPriceChangeReason():null);
            List<PriceChangeReasonType> rhsPriceChangeReason;
            rhsPriceChangeReason = (((that.priceChangeReason!= null)&&(!that.priceChangeReason.isEmpty()))?that.getPriceChangeReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceChangeReason", lhsPriceChangeReason), LocatorUtils.property(thatLocator, "priceChangeReason", rhsPriceChangeReason), lhsPriceChangeReason, rhsPriceChangeReason, ((this.priceChangeReason!= null)&&(!this.priceChangeReason.isEmpty())), ((that.priceChangeReason!= null)&&(!that.priceChangeReason.isEmpty())))) {
                return false;
            }
        }
        {
            PriceTypeCodeType lhsPriceTypeCode;
            lhsPriceTypeCode = this.getPriceTypeCode();
            PriceTypeCodeType rhsPriceTypeCode;
            rhsPriceTypeCode = that.getPriceTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceTypeCode", lhsPriceTypeCode), LocatorUtils.property(thatLocator, "priceTypeCode", rhsPriceTypeCode), lhsPriceTypeCode, rhsPriceTypeCode, (this.priceTypeCode!= null), (that.priceTypeCode!= null))) {
                return false;
            }
        }
        {
            PriceTypeType lhsPriceType;
            lhsPriceType = this.getPriceType();
            PriceTypeType rhsPriceType;
            rhsPriceType = that.getPriceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceType", lhsPriceType), LocatorUtils.property(thatLocator, "priceType", rhsPriceType), lhsPriceType, rhsPriceType, (this.priceType!= null), (that.priceType!= null))) {
                return false;
            }
        }
        {
            OrderableUnitFactorRateType lhsOrderableUnitFactorRate;
            lhsOrderableUnitFactorRate = this.getOrderableUnitFactorRate();
            OrderableUnitFactorRateType rhsOrderableUnitFactorRate;
            rhsOrderableUnitFactorRate = that.getOrderableUnitFactorRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderableUnitFactorRate", lhsOrderableUnitFactorRate), LocatorUtils.property(thatLocator, "orderableUnitFactorRate", rhsOrderableUnitFactorRate), lhsOrderableUnitFactorRate, rhsOrderableUnitFactorRate, (this.orderableUnitFactorRate!= null), (that.orderableUnitFactorRate!= null))) {
                return false;
            }
        }
        {
            List<PeriodType> lhsValidityPeriod;
            lhsValidityPeriod = (((this.validityPeriod!= null)&&(!this.validityPeriod.isEmpty()))?this.getValidityPeriod():null);
            List<PeriodType> rhsValidityPeriod;
            rhsValidityPeriod = (((that.validityPeriod!= null)&&(!that.validityPeriod.isEmpty()))?that.getValidityPeriod():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validityPeriod", lhsValidityPeriod), LocatorUtils.property(thatLocator, "validityPeriod", rhsValidityPeriod), lhsValidityPeriod, rhsValidityPeriod, ((this.validityPeriod!= null)&&(!this.validityPeriod.isEmpty())), ((that.validityPeriod!= null)&&(!that.validityPeriod.isEmpty())))) {
                return false;
            }
        }
        {
            PriceListType lhsPriceList;
            lhsPriceList = this.getPriceList();
            PriceListType rhsPriceList;
            rhsPriceList = that.getPriceList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceList", lhsPriceList), LocatorUtils.property(thatLocator, "priceList", rhsPriceList), lhsPriceList, rhsPriceList, (this.priceList!= null), (that.priceList!= null))) {
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
            ExchangeRateType lhsPricingExchangeRate;
            lhsPricingExchangeRate = this.getPricingExchangeRate();
            ExchangeRateType rhsPricingExchangeRate;
            rhsPricingExchangeRate = that.getPricingExchangeRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pricingExchangeRate", lhsPricingExchangeRate), LocatorUtils.property(thatLocator, "pricingExchangeRate", rhsPricingExchangeRate), lhsPricingExchangeRate, rhsPricingExchangeRate, (this.pricingExchangeRate!= null), (that.pricingExchangeRate!= null))) {
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
            PriceAmountType thePriceAmount;
            thePriceAmount = this.getPriceAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceAmount", thePriceAmount), currentHashCode, thePriceAmount, (this.priceAmount!= null));
        }
        {
            BaseQuantityType theBaseQuantity;
            theBaseQuantity = this.getBaseQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baseQuantity", theBaseQuantity), currentHashCode, theBaseQuantity, (this.baseQuantity!= null));
        }
        {
            List<PriceChangeReasonType> thePriceChangeReason;
            thePriceChangeReason = (((this.priceChangeReason!= null)&&(!this.priceChangeReason.isEmpty()))?this.getPriceChangeReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceChangeReason", thePriceChangeReason), currentHashCode, thePriceChangeReason, ((this.priceChangeReason!= null)&&(!this.priceChangeReason.isEmpty())));
        }
        {
            PriceTypeCodeType thePriceTypeCode;
            thePriceTypeCode = this.getPriceTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceTypeCode", thePriceTypeCode), currentHashCode, thePriceTypeCode, (this.priceTypeCode!= null));
        }
        {
            PriceTypeType thePriceType;
            thePriceType = this.getPriceType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceType", thePriceType), currentHashCode, thePriceType, (this.priceType!= null));
        }
        {
            OrderableUnitFactorRateType theOrderableUnitFactorRate;
            theOrderableUnitFactorRate = this.getOrderableUnitFactorRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderableUnitFactorRate", theOrderableUnitFactorRate), currentHashCode, theOrderableUnitFactorRate, (this.orderableUnitFactorRate!= null));
        }
        {
            List<PeriodType> theValidityPeriod;
            theValidityPeriod = (((this.validityPeriod!= null)&&(!this.validityPeriod.isEmpty()))?this.getValidityPeriod():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validityPeriod", theValidityPeriod), currentHashCode, theValidityPeriod, ((this.validityPeriod!= null)&&(!this.validityPeriod.isEmpty())));
        }
        {
            PriceListType thePriceList;
            thePriceList = this.getPriceList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceList", thePriceList), currentHashCode, thePriceList, (this.priceList!= null));
        }
        {
            List<AllowanceChargeType> theAllowanceCharge;
            theAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowanceCharge", theAllowanceCharge), currentHashCode, theAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())));
        }
        {
            ExchangeRateType thePricingExchangeRate;
            thePricingExchangeRate = this.getPricingExchangeRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pricingExchangeRate", thePricingExchangeRate), currentHashCode, thePricingExchangeRate, (this.pricingExchangeRate!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
