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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HazardousRiskIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LeadTimeMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TradingRestrictionsType;
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
 * <p>Classe Java per ItemLocationQuantityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ItemLocationQuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LeadTimeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRiskIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TradingRestrictions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ApplicableTerritoryAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Price" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ApplicableTaxCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Package" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DependentPriceReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemLocationQuantityType", propOrder = {
    "leadTimeMeasure",
    "minimumQuantity",
    "maximumQuantity",
    "hazardousRiskIndicator",
    "tradingRestrictions",
    "applicableTerritoryAddress",
    "price",
    "deliveryUnit",
    "applicableTaxCategory",
    "_package",
    "allowanceCharge",
    "dependentPriceReference"
})
public class ItemLocationQuantityType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "LeadTimeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LeadTimeMeasureType leadTimeMeasure;
    @XmlElement(name = "MinimumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumQuantityType minimumQuantity;
    @XmlElement(name = "MaximumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumQuantityType maximumQuantity;
    @XmlElement(name = "HazardousRiskIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardousRiskIndicatorType hazardousRiskIndicator;
    @XmlElement(name = "TradingRestrictions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TradingRestrictionsType> tradingRestrictions;
    @XmlElement(name = "ApplicableTerritoryAddress")
    protected List<AddressType> applicableTerritoryAddress;
    @XmlElement(name = "Price")
    protected PriceType price;
    @XmlElement(name = "DeliveryUnit")
    protected List<DeliveryUnitType> deliveryUnit;
    @XmlElement(name = "ApplicableTaxCategory")
    protected List<TaxCategoryType> applicableTaxCategory;
    @XmlElement(name = "Package")
    protected PackageType _package;
    @XmlElement(name = "AllowanceCharge")
    protected List<AllowanceChargeType> allowanceCharge;
    @XmlElement(name = "DependentPriceReference")
    protected DependentPriceReferenceType dependentPriceReference;

    /**
     * Recupera il valore della proprietà leadTimeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link LeadTimeMeasureType }
     *     
     */
    public LeadTimeMeasureType getLeadTimeMeasure() {
        return leadTimeMeasure;
    }

    /**
     * Imposta il valore della proprietà leadTimeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadTimeMeasureType }
     *     
     */
    public void setLeadTimeMeasure(LeadTimeMeasureType value) {
        this.leadTimeMeasure = value;
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
     * Recupera il valore della proprietà hazardousRiskIndicator.
     * 
     * @return
     *     possible object is
     *     {@link HazardousRiskIndicatorType }
     *     
     */
    public HazardousRiskIndicatorType getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Imposta il valore della proprietà hazardousRiskIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousRiskIndicatorType }
     *     
     */
    public void setHazardousRiskIndicator(HazardousRiskIndicatorType value) {
        this.hazardousRiskIndicator = value;
    }

    /**
     * Gets the value of the tradingRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradingRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradingRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingRestrictionsType }
     * 
     * 
     */
    public List<TradingRestrictionsType> getTradingRestrictions() {
        if (tradingRestrictions == null) {
            tradingRestrictions = new ArrayList<TradingRestrictionsType>();
        }
        return this.tradingRestrictions;
    }

    /**
     * Gets the value of the applicableTerritoryAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableTerritoryAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableTerritoryAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getApplicableTerritoryAddress() {
        if (applicableTerritoryAddress == null) {
            applicableTerritoryAddress = new ArrayList<AddressType>();
        }
        return this.applicableTerritoryAddress;
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
     * Gets the value of the deliveryUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryUnitType }
     * 
     * 
     */
    public List<DeliveryUnitType> getDeliveryUnit() {
        if (deliveryUnit == null) {
            deliveryUnit = new ArrayList<DeliveryUnitType>();
        }
        return this.deliveryUnit;
    }

    /**
     * Gets the value of the applicableTaxCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableTaxCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableTaxCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCategoryType }
     * 
     * 
     */
    public List<TaxCategoryType> getApplicableTaxCategory() {
        if (applicableTaxCategory == null) {
            applicableTaxCategory = new ArrayList<TaxCategoryType>();
        }
        return this.applicableTaxCategory;
    }

    /**
     * Recupera il valore della proprietà package.
     * 
     * @return
     *     possible object is
     *     {@link PackageType }
     *     
     */
    public PackageType getPackage() {
        return _package;
    }

    /**
     * Imposta il valore della proprietà package.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType }
     *     
     */
    public void setPackage(PackageType value) {
        this._package = value;
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
     * Recupera il valore della proprietà dependentPriceReference.
     * 
     * @return
     *     possible object is
     *     {@link DependentPriceReferenceType }
     *     
     */
    public DependentPriceReferenceType getDependentPriceReference() {
        return dependentPriceReference;
    }

    /**
     * Imposta il valore della proprietà dependentPriceReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DependentPriceReferenceType }
     *     
     */
    public void setDependentPriceReference(DependentPriceReferenceType value) {
        this.dependentPriceReference = value;
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
            LeadTimeMeasureType theLeadTimeMeasure;
            theLeadTimeMeasure = this.getLeadTimeMeasure();
            strategy.appendField(locator, this, "leadTimeMeasure", buffer, theLeadTimeMeasure, (this.leadTimeMeasure!= null));
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
            HazardousRiskIndicatorType theHazardousRiskIndicator;
            theHazardousRiskIndicator = this.getHazardousRiskIndicator();
            strategy.appendField(locator, this, "hazardousRiskIndicator", buffer, theHazardousRiskIndicator, (this.hazardousRiskIndicator!= null));
        }
        {
            List<TradingRestrictionsType> theTradingRestrictions;
            theTradingRestrictions = (((this.tradingRestrictions!= null)&&(!this.tradingRestrictions.isEmpty()))?this.getTradingRestrictions():null);
            strategy.appendField(locator, this, "tradingRestrictions", buffer, theTradingRestrictions, ((this.tradingRestrictions!= null)&&(!this.tradingRestrictions.isEmpty())));
        }
        {
            List<AddressType> theApplicableTerritoryAddress;
            theApplicableTerritoryAddress = (((this.applicableTerritoryAddress!= null)&&(!this.applicableTerritoryAddress.isEmpty()))?this.getApplicableTerritoryAddress():null);
            strategy.appendField(locator, this, "applicableTerritoryAddress", buffer, theApplicableTerritoryAddress, ((this.applicableTerritoryAddress!= null)&&(!this.applicableTerritoryAddress.isEmpty())));
        }
        {
            PriceType thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            List<DeliveryUnitType> theDeliveryUnit;
            theDeliveryUnit = (((this.deliveryUnit!= null)&&(!this.deliveryUnit.isEmpty()))?this.getDeliveryUnit():null);
            strategy.appendField(locator, this, "deliveryUnit", buffer, theDeliveryUnit, ((this.deliveryUnit!= null)&&(!this.deliveryUnit.isEmpty())));
        }
        {
            List<TaxCategoryType> theApplicableTaxCategory;
            theApplicableTaxCategory = (((this.applicableTaxCategory!= null)&&(!this.applicableTaxCategory.isEmpty()))?this.getApplicableTaxCategory():null);
            strategy.appendField(locator, this, "applicableTaxCategory", buffer, theApplicableTaxCategory, ((this.applicableTaxCategory!= null)&&(!this.applicableTaxCategory.isEmpty())));
        }
        {
            PackageType thePackage;
            thePackage = this.getPackage();
            strategy.appendField(locator, this, "_package", buffer, thePackage, (this._package!= null));
        }
        {
            List<AllowanceChargeType> theAllowanceCharge;
            theAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            strategy.appendField(locator, this, "allowanceCharge", buffer, theAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())));
        }
        {
            DependentPriceReferenceType theDependentPriceReference;
            theDependentPriceReference = this.getDependentPriceReference();
            strategy.appendField(locator, this, "dependentPriceReference", buffer, theDependentPriceReference, (this.dependentPriceReference!= null));
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
        final ItemLocationQuantityType that = ((ItemLocationQuantityType) object);
        {
            LeadTimeMeasureType lhsLeadTimeMeasure;
            lhsLeadTimeMeasure = this.getLeadTimeMeasure();
            LeadTimeMeasureType rhsLeadTimeMeasure;
            rhsLeadTimeMeasure = that.getLeadTimeMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leadTimeMeasure", lhsLeadTimeMeasure), LocatorUtils.property(thatLocator, "leadTimeMeasure", rhsLeadTimeMeasure), lhsLeadTimeMeasure, rhsLeadTimeMeasure, (this.leadTimeMeasure!= null), (that.leadTimeMeasure!= null))) {
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
            HazardousRiskIndicatorType lhsHazardousRiskIndicator;
            lhsHazardousRiskIndicator = this.getHazardousRiskIndicator();
            HazardousRiskIndicatorType rhsHazardousRiskIndicator;
            rhsHazardousRiskIndicator = that.getHazardousRiskIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hazardousRiskIndicator", lhsHazardousRiskIndicator), LocatorUtils.property(thatLocator, "hazardousRiskIndicator", rhsHazardousRiskIndicator), lhsHazardousRiskIndicator, rhsHazardousRiskIndicator, (this.hazardousRiskIndicator!= null), (that.hazardousRiskIndicator!= null))) {
                return false;
            }
        }
        {
            List<TradingRestrictionsType> lhsTradingRestrictions;
            lhsTradingRestrictions = (((this.tradingRestrictions!= null)&&(!this.tradingRestrictions.isEmpty()))?this.getTradingRestrictions():null);
            List<TradingRestrictionsType> rhsTradingRestrictions;
            rhsTradingRestrictions = (((that.tradingRestrictions!= null)&&(!that.tradingRestrictions.isEmpty()))?that.getTradingRestrictions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tradingRestrictions", lhsTradingRestrictions), LocatorUtils.property(thatLocator, "tradingRestrictions", rhsTradingRestrictions), lhsTradingRestrictions, rhsTradingRestrictions, ((this.tradingRestrictions!= null)&&(!this.tradingRestrictions.isEmpty())), ((that.tradingRestrictions!= null)&&(!that.tradingRestrictions.isEmpty())))) {
                return false;
            }
        }
        {
            List<AddressType> lhsApplicableTerritoryAddress;
            lhsApplicableTerritoryAddress = (((this.applicableTerritoryAddress!= null)&&(!this.applicableTerritoryAddress.isEmpty()))?this.getApplicableTerritoryAddress():null);
            List<AddressType> rhsApplicableTerritoryAddress;
            rhsApplicableTerritoryAddress = (((that.applicableTerritoryAddress!= null)&&(!that.applicableTerritoryAddress.isEmpty()))?that.getApplicableTerritoryAddress():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applicableTerritoryAddress", lhsApplicableTerritoryAddress), LocatorUtils.property(thatLocator, "applicableTerritoryAddress", rhsApplicableTerritoryAddress), lhsApplicableTerritoryAddress, rhsApplicableTerritoryAddress, ((this.applicableTerritoryAddress!= null)&&(!this.applicableTerritoryAddress.isEmpty())), ((that.applicableTerritoryAddress!= null)&&(!that.applicableTerritoryAddress.isEmpty())))) {
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
            List<DeliveryUnitType> lhsDeliveryUnit;
            lhsDeliveryUnit = (((this.deliveryUnit!= null)&&(!this.deliveryUnit.isEmpty()))?this.getDeliveryUnit():null);
            List<DeliveryUnitType> rhsDeliveryUnit;
            rhsDeliveryUnit = (((that.deliveryUnit!= null)&&(!that.deliveryUnit.isEmpty()))?that.getDeliveryUnit():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryUnit", lhsDeliveryUnit), LocatorUtils.property(thatLocator, "deliveryUnit", rhsDeliveryUnit), lhsDeliveryUnit, rhsDeliveryUnit, ((this.deliveryUnit!= null)&&(!this.deliveryUnit.isEmpty())), ((that.deliveryUnit!= null)&&(!that.deliveryUnit.isEmpty())))) {
                return false;
            }
        }
        {
            List<TaxCategoryType> lhsApplicableTaxCategory;
            lhsApplicableTaxCategory = (((this.applicableTaxCategory!= null)&&(!this.applicableTaxCategory.isEmpty()))?this.getApplicableTaxCategory():null);
            List<TaxCategoryType> rhsApplicableTaxCategory;
            rhsApplicableTaxCategory = (((that.applicableTaxCategory!= null)&&(!that.applicableTaxCategory.isEmpty()))?that.getApplicableTaxCategory():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applicableTaxCategory", lhsApplicableTaxCategory), LocatorUtils.property(thatLocator, "applicableTaxCategory", rhsApplicableTaxCategory), lhsApplicableTaxCategory, rhsApplicableTaxCategory, ((this.applicableTaxCategory!= null)&&(!this.applicableTaxCategory.isEmpty())), ((that.applicableTaxCategory!= null)&&(!that.applicableTaxCategory.isEmpty())))) {
                return false;
            }
        }
        {
            PackageType lhsPackage;
            lhsPackage = this.getPackage();
            PackageType rhsPackage;
            rhsPackage = that.getPackage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_package", lhsPackage), LocatorUtils.property(thatLocator, "_package", rhsPackage), lhsPackage, rhsPackage, (this._package!= null), (that._package!= null))) {
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
            DependentPriceReferenceType lhsDependentPriceReference;
            lhsDependentPriceReference = this.getDependentPriceReference();
            DependentPriceReferenceType rhsDependentPriceReference;
            rhsDependentPriceReference = that.getDependentPriceReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dependentPriceReference", lhsDependentPriceReference), LocatorUtils.property(thatLocator, "dependentPriceReference", rhsDependentPriceReference), lhsDependentPriceReference, rhsDependentPriceReference, (this.dependentPriceReference!= null), (that.dependentPriceReference!= null))) {
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
            LeadTimeMeasureType theLeadTimeMeasure;
            theLeadTimeMeasure = this.getLeadTimeMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leadTimeMeasure", theLeadTimeMeasure), currentHashCode, theLeadTimeMeasure, (this.leadTimeMeasure!= null));
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
            HazardousRiskIndicatorType theHazardousRiskIndicator;
            theHazardousRiskIndicator = this.getHazardousRiskIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousRiskIndicator", theHazardousRiskIndicator), currentHashCode, theHazardousRiskIndicator, (this.hazardousRiskIndicator!= null));
        }
        {
            List<TradingRestrictionsType> theTradingRestrictions;
            theTradingRestrictions = (((this.tradingRestrictions!= null)&&(!this.tradingRestrictions.isEmpty()))?this.getTradingRestrictions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tradingRestrictions", theTradingRestrictions), currentHashCode, theTradingRestrictions, ((this.tradingRestrictions!= null)&&(!this.tradingRestrictions.isEmpty())));
        }
        {
            List<AddressType> theApplicableTerritoryAddress;
            theApplicableTerritoryAddress = (((this.applicableTerritoryAddress!= null)&&(!this.applicableTerritoryAddress.isEmpty()))?this.getApplicableTerritoryAddress():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applicableTerritoryAddress", theApplicableTerritoryAddress), currentHashCode, theApplicableTerritoryAddress, ((this.applicableTerritoryAddress!= null)&&(!this.applicableTerritoryAddress.isEmpty())));
        }
        {
            PriceType thePrice;
            thePrice = this.getPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "price", thePrice), currentHashCode, thePrice, (this.price!= null));
        }
        {
            List<DeliveryUnitType> theDeliveryUnit;
            theDeliveryUnit = (((this.deliveryUnit!= null)&&(!this.deliveryUnit.isEmpty()))?this.getDeliveryUnit():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryUnit", theDeliveryUnit), currentHashCode, theDeliveryUnit, ((this.deliveryUnit!= null)&&(!this.deliveryUnit.isEmpty())));
        }
        {
            List<TaxCategoryType> theApplicableTaxCategory;
            theApplicableTaxCategory = (((this.applicableTaxCategory!= null)&&(!this.applicableTaxCategory.isEmpty()))?this.getApplicableTaxCategory():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applicableTaxCategory", theApplicableTaxCategory), currentHashCode, theApplicableTaxCategory, ((this.applicableTaxCategory!= null)&&(!this.applicableTaxCategory.isEmpty())));
        }
        {
            PackageType thePackage;
            thePackage = this.getPackage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_package", thePackage), currentHashCode, thePackage, (this._package!= null));
        }
        {
            List<AllowanceChargeType> theAllowanceCharge;
            theAllowanceCharge = (((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty()))?this.getAllowanceCharge():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowanceCharge", theAllowanceCharge), currentHashCode, theAllowanceCharge, ((this.allowanceCharge!= null)&&(!this.allowanceCharge.isEmpty())));
        }
        {
            DependentPriceReferenceType theDependentPriceReference;
            theDependentPriceReference = this.getDependentPriceReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dependentPriceReference", theDependentPriceReference), currentHashCode, theDependentPriceReference, (this.dependentPriceReference!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
