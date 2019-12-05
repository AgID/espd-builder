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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumNumberNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumNumberNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OptionsDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RenewalsIndicatorType;
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
 * <p>Classe Java per ContractExtensionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ContractExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OptionsDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumNumberNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumNumberNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RenewalsIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OptionValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Renewal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractExtensionType", propOrder = {
    "optionsDescription",
    "minimumNumberNumeric",
    "maximumNumberNumeric",
    "renewalsIndicator",
    "optionValidityPeriod",
    "renewal"
})
public class ContractExtensionType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "OptionsDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<OptionsDescriptionType> optionsDescription;
    @XmlElement(name = "MinimumNumberNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumNumberNumericType minimumNumberNumeric;
    @XmlElement(name = "MaximumNumberNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumNumberNumericType maximumNumberNumeric;
    @XmlElement(name = "RenewalsIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RenewalsIndicatorType renewalsIndicator;
    @XmlElement(name = "OptionValidityPeriod")
    protected PeriodType optionValidityPeriod;
    @XmlElement(name = "Renewal")
    protected List<RenewalType> renewal;

    /**
     * Gets the value of the optionsDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionsDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionsDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionsDescriptionType }
     * 
     * 
     */
    public List<OptionsDescriptionType> getOptionsDescription() {
        if (optionsDescription == null) {
            optionsDescription = new ArrayList<OptionsDescriptionType>();
        }
        return this.optionsDescription;
    }

    /**
     * Recupera il valore della proprietà minimumNumberNumeric.
     * 
     * @return
     *     possible object is
     *     {@link MinimumNumberNumericType }
     *     
     */
    public MinimumNumberNumericType getMinimumNumberNumeric() {
        return minimumNumberNumeric;
    }

    /**
     * Imposta il valore della proprietà minimumNumberNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumNumberNumericType }
     *     
     */
    public void setMinimumNumberNumeric(MinimumNumberNumericType value) {
        this.minimumNumberNumeric = value;
    }

    /**
     * Recupera il valore della proprietà maximumNumberNumeric.
     * 
     * @return
     *     possible object is
     *     {@link MaximumNumberNumericType }
     *     
     */
    public MaximumNumberNumericType getMaximumNumberNumeric() {
        return maximumNumberNumeric;
    }

    /**
     * Imposta il valore della proprietà maximumNumberNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumNumberNumericType }
     *     
     */
    public void setMaximumNumberNumeric(MaximumNumberNumericType value) {
        this.maximumNumberNumeric = value;
    }

    /**
     * Recupera il valore della proprietà renewalsIndicator.
     * 
     * @return
     *     possible object is
     *     {@link RenewalsIndicatorType }
     *     
     */
    public RenewalsIndicatorType getRenewalsIndicator() {
        return renewalsIndicator;
    }

    /**
     * Imposta il valore della proprietà renewalsIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link RenewalsIndicatorType }
     *     
     */
    public void setRenewalsIndicator(RenewalsIndicatorType value) {
        this.renewalsIndicator = value;
    }

    /**
     * Recupera il valore della proprietà optionValidityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getOptionValidityPeriod() {
        return optionValidityPeriod;
    }

    /**
     * Imposta il valore della proprietà optionValidityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setOptionValidityPeriod(PeriodType value) {
        this.optionValidityPeriod = value;
    }

    /**
     * Gets the value of the renewal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the renewal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRenewal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RenewalType }
     * 
     * 
     */
    public List<RenewalType> getRenewal() {
        if (renewal == null) {
            renewal = new ArrayList<RenewalType>();
        }
        return this.renewal;
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
            List<OptionsDescriptionType> theOptionsDescription;
            theOptionsDescription = (((this.optionsDescription!= null)&&(!this.optionsDescription.isEmpty()))?this.getOptionsDescription():null);
            strategy.appendField(locator, this, "optionsDescription", buffer, theOptionsDescription, ((this.optionsDescription!= null)&&(!this.optionsDescription.isEmpty())));
        }
        {
            MinimumNumberNumericType theMinimumNumberNumeric;
            theMinimumNumberNumeric = this.getMinimumNumberNumeric();
            strategy.appendField(locator, this, "minimumNumberNumeric", buffer, theMinimumNumberNumeric, (this.minimumNumberNumeric!= null));
        }
        {
            MaximumNumberNumericType theMaximumNumberNumeric;
            theMaximumNumberNumeric = this.getMaximumNumberNumeric();
            strategy.appendField(locator, this, "maximumNumberNumeric", buffer, theMaximumNumberNumeric, (this.maximumNumberNumeric!= null));
        }
        {
            RenewalsIndicatorType theRenewalsIndicator;
            theRenewalsIndicator = this.getRenewalsIndicator();
            strategy.appendField(locator, this, "renewalsIndicator", buffer, theRenewalsIndicator, (this.renewalsIndicator!= null));
        }
        {
            PeriodType theOptionValidityPeriod;
            theOptionValidityPeriod = this.getOptionValidityPeriod();
            strategy.appendField(locator, this, "optionValidityPeriod", buffer, theOptionValidityPeriod, (this.optionValidityPeriod!= null));
        }
        {
            List<RenewalType> theRenewal;
            theRenewal = (((this.renewal!= null)&&(!this.renewal.isEmpty()))?this.getRenewal():null);
            strategy.appendField(locator, this, "renewal", buffer, theRenewal, ((this.renewal!= null)&&(!this.renewal.isEmpty())));
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
        final ContractExtensionType that = ((ContractExtensionType) object);
        {
            List<OptionsDescriptionType> lhsOptionsDescription;
            lhsOptionsDescription = (((this.optionsDescription!= null)&&(!this.optionsDescription.isEmpty()))?this.getOptionsDescription():null);
            List<OptionsDescriptionType> rhsOptionsDescription;
            rhsOptionsDescription = (((that.optionsDescription!= null)&&(!that.optionsDescription.isEmpty()))?that.getOptionsDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optionsDescription", lhsOptionsDescription), LocatorUtils.property(thatLocator, "optionsDescription", rhsOptionsDescription), lhsOptionsDescription, rhsOptionsDescription, ((this.optionsDescription!= null)&&(!this.optionsDescription.isEmpty())), ((that.optionsDescription!= null)&&(!that.optionsDescription.isEmpty())))) {
                return false;
            }
        }
        {
            MinimumNumberNumericType lhsMinimumNumberNumeric;
            lhsMinimumNumberNumeric = this.getMinimumNumberNumeric();
            MinimumNumberNumericType rhsMinimumNumberNumeric;
            rhsMinimumNumberNumeric = that.getMinimumNumberNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumNumberNumeric", lhsMinimumNumberNumeric), LocatorUtils.property(thatLocator, "minimumNumberNumeric", rhsMinimumNumberNumeric), lhsMinimumNumberNumeric, rhsMinimumNumberNumeric, (this.minimumNumberNumeric!= null), (that.minimumNumberNumeric!= null))) {
                return false;
            }
        }
        {
            MaximumNumberNumericType lhsMaximumNumberNumeric;
            lhsMaximumNumberNumeric = this.getMaximumNumberNumeric();
            MaximumNumberNumericType rhsMaximumNumberNumeric;
            rhsMaximumNumberNumeric = that.getMaximumNumberNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumNumberNumeric", lhsMaximumNumberNumeric), LocatorUtils.property(thatLocator, "maximumNumberNumeric", rhsMaximumNumberNumeric), lhsMaximumNumberNumeric, rhsMaximumNumberNumeric, (this.maximumNumberNumeric!= null), (that.maximumNumberNumeric!= null))) {
                return false;
            }
        }
        {
            RenewalsIndicatorType lhsRenewalsIndicator;
            lhsRenewalsIndicator = this.getRenewalsIndicator();
            RenewalsIndicatorType rhsRenewalsIndicator;
            rhsRenewalsIndicator = that.getRenewalsIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "renewalsIndicator", lhsRenewalsIndicator), LocatorUtils.property(thatLocator, "renewalsIndicator", rhsRenewalsIndicator), lhsRenewalsIndicator, rhsRenewalsIndicator, (this.renewalsIndicator!= null), (that.renewalsIndicator!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsOptionValidityPeriod;
            lhsOptionValidityPeriod = this.getOptionValidityPeriod();
            PeriodType rhsOptionValidityPeriod;
            rhsOptionValidityPeriod = that.getOptionValidityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optionValidityPeriod", lhsOptionValidityPeriod), LocatorUtils.property(thatLocator, "optionValidityPeriod", rhsOptionValidityPeriod), lhsOptionValidityPeriod, rhsOptionValidityPeriod, (this.optionValidityPeriod!= null), (that.optionValidityPeriod!= null))) {
                return false;
            }
        }
        {
            List<RenewalType> lhsRenewal;
            lhsRenewal = (((this.renewal!= null)&&(!this.renewal.isEmpty()))?this.getRenewal():null);
            List<RenewalType> rhsRenewal;
            rhsRenewal = (((that.renewal!= null)&&(!that.renewal.isEmpty()))?that.getRenewal():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "renewal", lhsRenewal), LocatorUtils.property(thatLocator, "renewal", rhsRenewal), lhsRenewal, rhsRenewal, ((this.renewal!= null)&&(!this.renewal.isEmpty())), ((that.renewal!= null)&&(!that.renewal.isEmpty())))) {
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
            List<OptionsDescriptionType> theOptionsDescription;
            theOptionsDescription = (((this.optionsDescription!= null)&&(!this.optionsDescription.isEmpty()))?this.getOptionsDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optionsDescription", theOptionsDescription), currentHashCode, theOptionsDescription, ((this.optionsDescription!= null)&&(!this.optionsDescription.isEmpty())));
        }
        {
            MinimumNumberNumericType theMinimumNumberNumeric;
            theMinimumNumberNumeric = this.getMinimumNumberNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumNumberNumeric", theMinimumNumberNumeric), currentHashCode, theMinimumNumberNumeric, (this.minimumNumberNumeric!= null));
        }
        {
            MaximumNumberNumericType theMaximumNumberNumeric;
            theMaximumNumberNumeric = this.getMaximumNumberNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumNumberNumeric", theMaximumNumberNumeric), currentHashCode, theMaximumNumberNumeric, (this.maximumNumberNumeric!= null));
        }
        {
            RenewalsIndicatorType theRenewalsIndicator;
            theRenewalsIndicator = this.getRenewalsIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "renewalsIndicator", theRenewalsIndicator), currentHashCode, theRenewalsIndicator, (this.renewalsIndicator!= null));
        }
        {
            PeriodType theOptionValidityPeriod;
            theOptionValidityPeriod = this.getOptionValidityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optionValidityPeriod", theOptionValidityPeriod), currentHashCode, theOptionValidityPeriod, (this.optionValidityPeriod!= null));
        }
        {
            List<RenewalType> theRenewal;
            theRenewal = (((this.renewal!= null)&&(!this.renewal.isEmpty()))?this.getRenewal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "renewal", theRenewal), currentHashCode, theRenewal, ((this.renewal!= null)&&(!this.renewal.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
