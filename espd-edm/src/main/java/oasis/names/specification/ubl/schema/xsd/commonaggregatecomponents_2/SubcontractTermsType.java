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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SubcontractingConditionsCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UnknownPriceIndicatorType;
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
 * <p>Classe Java per SubcontractTermsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SubcontractTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Rate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UnknownPriceIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubcontractingConditionsCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumPercent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubcontractTermsType", propOrder = {
    "rate",
    "unknownPriceIndicator",
    "description",
    "amount",
    "subcontractingConditionsCode",
    "maximumPercent",
    "minimumPercent"
})
public class SubcontractTermsType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Rate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RateType rate;
    @XmlElement(name = "UnknownPriceIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UnknownPriceIndicatorType unknownPriceIndicator;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AmountType amount;
    @XmlElement(name = "SubcontractingConditionsCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubcontractingConditionsCodeType subcontractingConditionsCode;
    @XmlElement(name = "MaximumPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumPercentType maximumPercent;
    @XmlElement(name = "MinimumPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumPercentType minimumPercent;

    /**
     * Recupera il valore della proprietà rate.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getRate() {
        return rate;
    }

    /**
     * Imposta il valore della proprietà rate.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setRate(RateType value) {
        this.rate = value;
    }

    /**
     * Recupera il valore della proprietà unknownPriceIndicator.
     * 
     * @return
     *     possible object is
     *     {@link UnknownPriceIndicatorType }
     *     
     */
    public UnknownPriceIndicatorType getUnknownPriceIndicator() {
        return unknownPriceIndicator;
    }

    /**
     * Imposta il valore della proprietà unknownPriceIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownPriceIndicatorType }
     *     
     */
    public void setUnknownPriceIndicator(UnknownPriceIndicatorType value) {
        this.unknownPriceIndicator = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
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
     * Recupera il valore della proprietà subcontractingConditionsCode.
     * 
     * @return
     *     possible object is
     *     {@link SubcontractingConditionsCodeType }
     *     
     */
    public SubcontractingConditionsCodeType getSubcontractingConditionsCode() {
        return subcontractingConditionsCode;
    }

    /**
     * Imposta il valore della proprietà subcontractingConditionsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubcontractingConditionsCodeType }
     *     
     */
    public void setSubcontractingConditionsCode(SubcontractingConditionsCodeType value) {
        this.subcontractingConditionsCode = value;
    }

    /**
     * Recupera il valore della proprietà maximumPercent.
     * 
     * @return
     *     possible object is
     *     {@link MaximumPercentType }
     *     
     */
    public MaximumPercentType getMaximumPercent() {
        return maximumPercent;
    }

    /**
     * Imposta il valore della proprietà maximumPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumPercentType }
     *     
     */
    public void setMaximumPercent(MaximumPercentType value) {
        this.maximumPercent = value;
    }

    /**
     * Recupera il valore della proprietà minimumPercent.
     * 
     * @return
     *     possible object is
     *     {@link MinimumPercentType }
     *     
     */
    public MinimumPercentType getMinimumPercent() {
        return minimumPercent;
    }

    /**
     * Imposta il valore della proprietà minimumPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumPercentType }
     *     
     */
    public void setMinimumPercent(MinimumPercentType value) {
        this.minimumPercent = value;
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
            RateType theRate;
            theRate = this.getRate();
            strategy.appendField(locator, this, "rate", buffer, theRate, (this.rate!= null));
        }
        {
            UnknownPriceIndicatorType theUnknownPriceIndicator;
            theUnknownPriceIndicator = this.getUnknownPriceIndicator();
            strategy.appendField(locator, this, "unknownPriceIndicator", buffer, theUnknownPriceIndicator, (this.unknownPriceIndicator!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            AmountType theAmount;
            theAmount = this.getAmount();
            strategy.appendField(locator, this, "amount", buffer, theAmount, (this.amount!= null));
        }
        {
            SubcontractingConditionsCodeType theSubcontractingConditionsCode;
            theSubcontractingConditionsCode = this.getSubcontractingConditionsCode();
            strategy.appendField(locator, this, "subcontractingConditionsCode", buffer, theSubcontractingConditionsCode, (this.subcontractingConditionsCode!= null));
        }
        {
            MaximumPercentType theMaximumPercent;
            theMaximumPercent = this.getMaximumPercent();
            strategy.appendField(locator, this, "maximumPercent", buffer, theMaximumPercent, (this.maximumPercent!= null));
        }
        {
            MinimumPercentType theMinimumPercent;
            theMinimumPercent = this.getMinimumPercent();
            strategy.appendField(locator, this, "minimumPercent", buffer, theMinimumPercent, (this.minimumPercent!= null));
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
        final SubcontractTermsType that = ((SubcontractTermsType) object);
        {
            RateType lhsRate;
            lhsRate = this.getRate();
            RateType rhsRate;
            rhsRate = that.getRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rate", lhsRate), LocatorUtils.property(thatLocator, "rate", rhsRate), lhsRate, rhsRate, (this.rate!= null), (that.rate!= null))) {
                return false;
            }
        }
        {
            UnknownPriceIndicatorType lhsUnknownPriceIndicator;
            lhsUnknownPriceIndicator = this.getUnknownPriceIndicator();
            UnknownPriceIndicatorType rhsUnknownPriceIndicator;
            rhsUnknownPriceIndicator = that.getUnknownPriceIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unknownPriceIndicator", lhsUnknownPriceIndicator), LocatorUtils.property(thatLocator, "unknownPriceIndicator", rhsUnknownPriceIndicator), lhsUnknownPriceIndicator, rhsUnknownPriceIndicator, (this.unknownPriceIndicator!= null), (that.unknownPriceIndicator!= null))) {
                return false;
            }
        }
        {
            List<DescriptionType> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<DescriptionType> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, ((this.description!= null)&&(!this.description.isEmpty())), ((that.description!= null)&&(!that.description.isEmpty())))) {
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
            SubcontractingConditionsCodeType lhsSubcontractingConditionsCode;
            lhsSubcontractingConditionsCode = this.getSubcontractingConditionsCode();
            SubcontractingConditionsCodeType rhsSubcontractingConditionsCode;
            rhsSubcontractingConditionsCode = that.getSubcontractingConditionsCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subcontractingConditionsCode", lhsSubcontractingConditionsCode), LocatorUtils.property(thatLocator, "subcontractingConditionsCode", rhsSubcontractingConditionsCode), lhsSubcontractingConditionsCode, rhsSubcontractingConditionsCode, (this.subcontractingConditionsCode!= null), (that.subcontractingConditionsCode!= null))) {
                return false;
            }
        }
        {
            MaximumPercentType lhsMaximumPercent;
            lhsMaximumPercent = this.getMaximumPercent();
            MaximumPercentType rhsMaximumPercent;
            rhsMaximumPercent = that.getMaximumPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumPercent", lhsMaximumPercent), LocatorUtils.property(thatLocator, "maximumPercent", rhsMaximumPercent), lhsMaximumPercent, rhsMaximumPercent, (this.maximumPercent!= null), (that.maximumPercent!= null))) {
                return false;
            }
        }
        {
            MinimumPercentType lhsMinimumPercent;
            lhsMinimumPercent = this.getMinimumPercent();
            MinimumPercentType rhsMinimumPercent;
            rhsMinimumPercent = that.getMinimumPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumPercent", lhsMinimumPercent), LocatorUtils.property(thatLocator, "minimumPercent", rhsMinimumPercent), lhsMinimumPercent, rhsMinimumPercent, (this.minimumPercent!= null), (that.minimumPercent!= null))) {
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
            RateType theRate;
            theRate = this.getRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rate", theRate), currentHashCode, theRate, (this.rate!= null));
        }
        {
            UnknownPriceIndicatorType theUnknownPriceIndicator;
            theUnknownPriceIndicator = this.getUnknownPriceIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unknownPriceIndicator", theUnknownPriceIndicator), currentHashCode, theUnknownPriceIndicator, (this.unknownPriceIndicator!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            AmountType theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount, (this.amount!= null));
        }
        {
            SubcontractingConditionsCodeType theSubcontractingConditionsCode;
            theSubcontractingConditionsCode = this.getSubcontractingConditionsCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subcontractingConditionsCode", theSubcontractingConditionsCode), currentHashCode, theSubcontractingConditionsCode, (this.subcontractingConditionsCode!= null));
        }
        {
            MaximumPercentType theMaximumPercent;
            theMaximumPercent = this.getMaximumPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumPercent", theMaximumPercent), currentHashCode, theMaximumPercent, (this.maximumPercent!= null));
        }
        {
            MinimumPercentType theMinimumPercent;
            theMinimumPercent = this.getMinimumPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumPercent", theMinimumPercent), currentHashCode, theMinimumPercent, (this.minimumPercent!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
