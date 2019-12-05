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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BaseUnitMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PerUnitAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxExemptionReasonCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxExemptionReasonType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TierRangeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TierRatePercentType;
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
 * <p>Classe Java per TaxCategoryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TaxCategoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Percent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BaseUnitMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerUnitAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxExemptionReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxExemptionReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TierRange" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TierRatePercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxScheme"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCategoryType", propOrder = {
    "id",
    "name",
    "percent",
    "baseUnitMeasure",
    "perUnitAmount",
    "taxExemptionReasonCode",
    "taxExemptionReason",
    "tierRange",
    "tierRatePercent",
    "taxScheme"
})
public class TaxCategoryType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "Percent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PercentType percent;
    @XmlElement(name = "BaseUnitMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BaseUnitMeasureType baseUnitMeasure;
    @XmlElement(name = "PerUnitAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PerUnitAmountType perUnitAmount;
    @XmlElement(name = "TaxExemptionReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxExemptionReasonCodeType taxExemptionReasonCode;
    @XmlElement(name = "TaxExemptionReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TaxExemptionReasonType> taxExemptionReason;
    @XmlElement(name = "TierRange", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TierRangeType tierRange;
    @XmlElement(name = "TierRatePercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TierRatePercentType tierRatePercent;
    @XmlElement(name = "TaxScheme", required = true)
    protected TaxSchemeType taxScheme;

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
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà percent.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getPercent() {
        return percent;
    }

    /**
     * Imposta il valore della proprietà percent.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setPercent(PercentType value) {
        this.percent = value;
    }

    /**
     * Recupera il valore della proprietà baseUnitMeasure.
     * 
     * @return
     *     possible object is
     *     {@link BaseUnitMeasureType }
     *     
     */
    public BaseUnitMeasureType getBaseUnitMeasure() {
        return baseUnitMeasure;
    }

    /**
     * Imposta il valore della proprietà baseUnitMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseUnitMeasureType }
     *     
     */
    public void setBaseUnitMeasure(BaseUnitMeasureType value) {
        this.baseUnitMeasure = value;
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
     * Recupera il valore della proprietà taxExemptionReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionReasonCodeType }
     *     
     */
    public TaxExemptionReasonCodeType getTaxExemptionReasonCode() {
        return taxExemptionReasonCode;
    }

    /**
     * Imposta il valore della proprietà taxExemptionReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionReasonCodeType }
     *     
     */
    public void setTaxExemptionReasonCode(TaxExemptionReasonCodeType value) {
        this.taxExemptionReasonCode = value;
    }

    /**
     * Gets the value of the taxExemptionReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxExemptionReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxExemptionReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxExemptionReasonType }
     * 
     * 
     */
    public List<TaxExemptionReasonType> getTaxExemptionReason() {
        if (taxExemptionReason == null) {
            taxExemptionReason = new ArrayList<TaxExemptionReasonType>();
        }
        return this.taxExemptionReason;
    }

    /**
     * Recupera il valore della proprietà tierRange.
     * 
     * @return
     *     possible object is
     *     {@link TierRangeType }
     *     
     */
    public TierRangeType getTierRange() {
        return tierRange;
    }

    /**
     * Imposta il valore della proprietà tierRange.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRangeType }
     *     
     */
    public void setTierRange(TierRangeType value) {
        this.tierRange = value;
    }

    /**
     * Recupera il valore della proprietà tierRatePercent.
     * 
     * @return
     *     possible object is
     *     {@link TierRatePercentType }
     *     
     */
    public TierRatePercentType getTierRatePercent() {
        return tierRatePercent;
    }

    /**
     * Imposta il valore della proprietà tierRatePercent.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRatePercentType }
     *     
     */
    public void setTierRatePercent(TierRatePercentType value) {
        this.tierRatePercent = value;
    }

    /**
     * Recupera il valore della proprietà taxScheme.
     * 
     * @return
     *     possible object is
     *     {@link TaxSchemeType }
     *     
     */
    public TaxSchemeType getTaxScheme() {
        return taxScheme;
    }

    /**
     * Imposta il valore della proprietà taxScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSchemeType }
     *     
     */
    public void setTaxScheme(TaxSchemeType value) {
        this.taxScheme = value;
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
            NameType theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            PercentType thePercent;
            thePercent = this.getPercent();
            strategy.appendField(locator, this, "percent", buffer, thePercent, (this.percent!= null));
        }
        {
            BaseUnitMeasureType theBaseUnitMeasure;
            theBaseUnitMeasure = this.getBaseUnitMeasure();
            strategy.appendField(locator, this, "baseUnitMeasure", buffer, theBaseUnitMeasure, (this.baseUnitMeasure!= null));
        }
        {
            PerUnitAmountType thePerUnitAmount;
            thePerUnitAmount = this.getPerUnitAmount();
            strategy.appendField(locator, this, "perUnitAmount", buffer, thePerUnitAmount, (this.perUnitAmount!= null));
        }
        {
            TaxExemptionReasonCodeType theTaxExemptionReasonCode;
            theTaxExemptionReasonCode = this.getTaxExemptionReasonCode();
            strategy.appendField(locator, this, "taxExemptionReasonCode", buffer, theTaxExemptionReasonCode, (this.taxExemptionReasonCode!= null));
        }
        {
            List<TaxExemptionReasonType> theTaxExemptionReason;
            theTaxExemptionReason = (((this.taxExemptionReason!= null)&&(!this.taxExemptionReason.isEmpty()))?this.getTaxExemptionReason():null);
            strategy.appendField(locator, this, "taxExemptionReason", buffer, theTaxExemptionReason, ((this.taxExemptionReason!= null)&&(!this.taxExemptionReason.isEmpty())));
        }
        {
            TierRangeType theTierRange;
            theTierRange = this.getTierRange();
            strategy.appendField(locator, this, "tierRange", buffer, theTierRange, (this.tierRange!= null));
        }
        {
            TierRatePercentType theTierRatePercent;
            theTierRatePercent = this.getTierRatePercent();
            strategy.appendField(locator, this, "tierRatePercent", buffer, theTierRatePercent, (this.tierRatePercent!= null));
        }
        {
            TaxSchemeType theTaxScheme;
            theTaxScheme = this.getTaxScheme();
            strategy.appendField(locator, this, "taxScheme", buffer, theTaxScheme, (this.taxScheme!= null));
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
        final TaxCategoryType that = ((TaxCategoryType) object);
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
            NameType lhsName;
            lhsName = this.getName();
            NameType rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            PercentType lhsPercent;
            lhsPercent = this.getPercent();
            PercentType rhsPercent;
            rhsPercent = that.getPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percent", lhsPercent), LocatorUtils.property(thatLocator, "percent", rhsPercent), lhsPercent, rhsPercent, (this.percent!= null), (that.percent!= null))) {
                return false;
            }
        }
        {
            BaseUnitMeasureType lhsBaseUnitMeasure;
            lhsBaseUnitMeasure = this.getBaseUnitMeasure();
            BaseUnitMeasureType rhsBaseUnitMeasure;
            rhsBaseUnitMeasure = that.getBaseUnitMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseUnitMeasure", lhsBaseUnitMeasure), LocatorUtils.property(thatLocator, "baseUnitMeasure", rhsBaseUnitMeasure), lhsBaseUnitMeasure, rhsBaseUnitMeasure, (this.baseUnitMeasure!= null), (that.baseUnitMeasure!= null))) {
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
            TaxExemptionReasonCodeType lhsTaxExemptionReasonCode;
            lhsTaxExemptionReasonCode = this.getTaxExemptionReasonCode();
            TaxExemptionReasonCodeType rhsTaxExemptionReasonCode;
            rhsTaxExemptionReasonCode = that.getTaxExemptionReasonCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxExemptionReasonCode", lhsTaxExemptionReasonCode), LocatorUtils.property(thatLocator, "taxExemptionReasonCode", rhsTaxExemptionReasonCode), lhsTaxExemptionReasonCode, rhsTaxExemptionReasonCode, (this.taxExemptionReasonCode!= null), (that.taxExemptionReasonCode!= null))) {
                return false;
            }
        }
        {
            List<TaxExemptionReasonType> lhsTaxExemptionReason;
            lhsTaxExemptionReason = (((this.taxExemptionReason!= null)&&(!this.taxExemptionReason.isEmpty()))?this.getTaxExemptionReason():null);
            List<TaxExemptionReasonType> rhsTaxExemptionReason;
            rhsTaxExemptionReason = (((that.taxExemptionReason!= null)&&(!that.taxExemptionReason.isEmpty()))?that.getTaxExemptionReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxExemptionReason", lhsTaxExemptionReason), LocatorUtils.property(thatLocator, "taxExemptionReason", rhsTaxExemptionReason), lhsTaxExemptionReason, rhsTaxExemptionReason, ((this.taxExemptionReason!= null)&&(!this.taxExemptionReason.isEmpty())), ((that.taxExemptionReason!= null)&&(!that.taxExemptionReason.isEmpty())))) {
                return false;
            }
        }
        {
            TierRangeType lhsTierRange;
            lhsTierRange = this.getTierRange();
            TierRangeType rhsTierRange;
            rhsTierRange = that.getTierRange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tierRange", lhsTierRange), LocatorUtils.property(thatLocator, "tierRange", rhsTierRange), lhsTierRange, rhsTierRange, (this.tierRange!= null), (that.tierRange!= null))) {
                return false;
            }
        }
        {
            TierRatePercentType lhsTierRatePercent;
            lhsTierRatePercent = this.getTierRatePercent();
            TierRatePercentType rhsTierRatePercent;
            rhsTierRatePercent = that.getTierRatePercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tierRatePercent", lhsTierRatePercent), LocatorUtils.property(thatLocator, "tierRatePercent", rhsTierRatePercent), lhsTierRatePercent, rhsTierRatePercent, (this.tierRatePercent!= null), (that.tierRatePercent!= null))) {
                return false;
            }
        }
        {
            TaxSchemeType lhsTaxScheme;
            lhsTaxScheme = this.getTaxScheme();
            TaxSchemeType rhsTaxScheme;
            rhsTaxScheme = that.getTaxScheme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxScheme", lhsTaxScheme), LocatorUtils.property(thatLocator, "taxScheme", rhsTaxScheme), lhsTaxScheme, rhsTaxScheme, (this.taxScheme!= null), (that.taxScheme!= null))) {
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
            NameType theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            PercentType thePercent;
            thePercent = this.getPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percent", thePercent), currentHashCode, thePercent, (this.percent!= null));
        }
        {
            BaseUnitMeasureType theBaseUnitMeasure;
            theBaseUnitMeasure = this.getBaseUnitMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baseUnitMeasure", theBaseUnitMeasure), currentHashCode, theBaseUnitMeasure, (this.baseUnitMeasure!= null));
        }
        {
            PerUnitAmountType thePerUnitAmount;
            thePerUnitAmount = this.getPerUnitAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "perUnitAmount", thePerUnitAmount), currentHashCode, thePerUnitAmount, (this.perUnitAmount!= null));
        }
        {
            TaxExemptionReasonCodeType theTaxExemptionReasonCode;
            theTaxExemptionReasonCode = this.getTaxExemptionReasonCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxExemptionReasonCode", theTaxExemptionReasonCode), currentHashCode, theTaxExemptionReasonCode, (this.taxExemptionReasonCode!= null));
        }
        {
            List<TaxExemptionReasonType> theTaxExemptionReason;
            theTaxExemptionReason = (((this.taxExemptionReason!= null)&&(!this.taxExemptionReason.isEmpty()))?this.getTaxExemptionReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxExemptionReason", theTaxExemptionReason), currentHashCode, theTaxExemptionReason, ((this.taxExemptionReason!= null)&&(!this.taxExemptionReason.isEmpty())));
        }
        {
            TierRangeType theTierRange;
            theTierRange = this.getTierRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tierRange", theTierRange), currentHashCode, theTierRange, (this.tierRange!= null));
        }
        {
            TierRatePercentType theTierRatePercent;
            theTierRatePercent = this.getTierRatePercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tierRatePercent", theTierRatePercent), currentHashCode, theTierRatePercent, (this.tierRatePercent!= null));
        }
        {
            TaxSchemeType theTaxScheme;
            theTaxScheme = this.getTaxScheme();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxScheme", theTaxScheme), currentHashCode, theTaxScheme, (this.taxScheme!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
