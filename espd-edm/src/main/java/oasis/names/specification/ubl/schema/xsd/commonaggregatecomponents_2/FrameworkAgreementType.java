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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedOperatorQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FrequencyType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.JustificationType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumOperatorQuantityType;
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
 * <p>Classe Java per FrameworkAgreementType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FrameworkAgreementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedOperatorQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumOperatorQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Justification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Frequency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DurationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubsequentProcessTenderRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrameworkAgreementType", propOrder = {
    "expectedOperatorQuantity",
    "maximumOperatorQuantity",
    "justification",
    "frequency",
    "durationPeriod",
    "subsequentProcessTenderRequirement"
})
public class FrameworkAgreementType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ExpectedOperatorQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpectedOperatorQuantityType expectedOperatorQuantity;
    @XmlElement(name = "MaximumOperatorQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumOperatorQuantityType maximumOperatorQuantity;
    @XmlElement(name = "Justification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<JustificationType> justification;
    @XmlElement(name = "Frequency", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<FrequencyType> frequency;
    @XmlElement(name = "DurationPeriod")
    protected PeriodType durationPeriod;
    @XmlElement(name = "SubsequentProcessTenderRequirement")
    protected List<TenderRequirementType> subsequentProcessTenderRequirement;

    /**
     * Recupera il valore della proprietà expectedOperatorQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedOperatorQuantityType }
     *     
     */
    public ExpectedOperatorQuantityType getExpectedOperatorQuantity() {
        return expectedOperatorQuantity;
    }

    /**
     * Imposta il valore della proprietà expectedOperatorQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedOperatorQuantityType }
     *     
     */
    public void setExpectedOperatorQuantity(ExpectedOperatorQuantityType value) {
        this.expectedOperatorQuantity = value;
    }

    /**
     * Recupera il valore della proprietà maximumOperatorQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MaximumOperatorQuantityType }
     *     
     */
    public MaximumOperatorQuantityType getMaximumOperatorQuantity() {
        return maximumOperatorQuantity;
    }

    /**
     * Imposta il valore della proprietà maximumOperatorQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumOperatorQuantityType }
     *     
     */
    public void setMaximumOperatorQuantity(MaximumOperatorQuantityType value) {
        this.maximumOperatorQuantity = value;
    }

    /**
     * Gets the value of the justification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the justification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJustification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JustificationType }
     * 
     * 
     */
    public List<JustificationType> getJustification() {
        if (justification == null) {
            justification = new ArrayList<JustificationType>();
        }
        return this.justification;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequencyType }
     * 
     * 
     */
    public List<FrequencyType> getFrequency() {
        if (frequency == null) {
            frequency = new ArrayList<FrequencyType>();
        }
        return this.frequency;
    }

    /**
     * Recupera il valore della proprietà durationPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getDurationPeriod() {
        return durationPeriod;
    }

    /**
     * Imposta il valore della proprietà durationPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setDurationPeriod(PeriodType value) {
        this.durationPeriod = value;
    }

    /**
     * Gets the value of the subsequentProcessTenderRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsequentProcessTenderRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsequentProcessTenderRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderRequirementType }
     * 
     * 
     */
    public List<TenderRequirementType> getSubsequentProcessTenderRequirement() {
        if (subsequentProcessTenderRequirement == null) {
            subsequentProcessTenderRequirement = new ArrayList<TenderRequirementType>();
        }
        return this.subsequentProcessTenderRequirement;
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
            ExpectedOperatorQuantityType theExpectedOperatorQuantity;
            theExpectedOperatorQuantity = this.getExpectedOperatorQuantity();
            strategy.appendField(locator, this, "expectedOperatorQuantity", buffer, theExpectedOperatorQuantity, (this.expectedOperatorQuantity!= null));
        }
        {
            MaximumOperatorQuantityType theMaximumOperatorQuantity;
            theMaximumOperatorQuantity = this.getMaximumOperatorQuantity();
            strategy.appendField(locator, this, "maximumOperatorQuantity", buffer, theMaximumOperatorQuantity, (this.maximumOperatorQuantity!= null));
        }
        {
            List<JustificationType> theJustification;
            theJustification = (((this.justification!= null)&&(!this.justification.isEmpty()))?this.getJustification():null);
            strategy.appendField(locator, this, "justification", buffer, theJustification, ((this.justification!= null)&&(!this.justification.isEmpty())));
        }
        {
            List<FrequencyType> theFrequency;
            theFrequency = (((this.frequency!= null)&&(!this.frequency.isEmpty()))?this.getFrequency():null);
            strategy.appendField(locator, this, "frequency", buffer, theFrequency, ((this.frequency!= null)&&(!this.frequency.isEmpty())));
        }
        {
            PeriodType theDurationPeriod;
            theDurationPeriod = this.getDurationPeriod();
            strategy.appendField(locator, this, "durationPeriod", buffer, theDurationPeriod, (this.durationPeriod!= null));
        }
        {
            List<TenderRequirementType> theSubsequentProcessTenderRequirement;
            theSubsequentProcessTenderRequirement = (((this.subsequentProcessTenderRequirement!= null)&&(!this.subsequentProcessTenderRequirement.isEmpty()))?this.getSubsequentProcessTenderRequirement():null);
            strategy.appendField(locator, this, "subsequentProcessTenderRequirement", buffer, theSubsequentProcessTenderRequirement, ((this.subsequentProcessTenderRequirement!= null)&&(!this.subsequentProcessTenderRequirement.isEmpty())));
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
        final FrameworkAgreementType that = ((FrameworkAgreementType) object);
        {
            ExpectedOperatorQuantityType lhsExpectedOperatorQuantity;
            lhsExpectedOperatorQuantity = this.getExpectedOperatorQuantity();
            ExpectedOperatorQuantityType rhsExpectedOperatorQuantity;
            rhsExpectedOperatorQuantity = that.getExpectedOperatorQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expectedOperatorQuantity", lhsExpectedOperatorQuantity), LocatorUtils.property(thatLocator, "expectedOperatorQuantity", rhsExpectedOperatorQuantity), lhsExpectedOperatorQuantity, rhsExpectedOperatorQuantity, (this.expectedOperatorQuantity!= null), (that.expectedOperatorQuantity!= null))) {
                return false;
            }
        }
        {
            MaximumOperatorQuantityType lhsMaximumOperatorQuantity;
            lhsMaximumOperatorQuantity = this.getMaximumOperatorQuantity();
            MaximumOperatorQuantityType rhsMaximumOperatorQuantity;
            rhsMaximumOperatorQuantity = that.getMaximumOperatorQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumOperatorQuantity", lhsMaximumOperatorQuantity), LocatorUtils.property(thatLocator, "maximumOperatorQuantity", rhsMaximumOperatorQuantity), lhsMaximumOperatorQuantity, rhsMaximumOperatorQuantity, (this.maximumOperatorQuantity!= null), (that.maximumOperatorQuantity!= null))) {
                return false;
            }
        }
        {
            List<JustificationType> lhsJustification;
            lhsJustification = (((this.justification!= null)&&(!this.justification.isEmpty()))?this.getJustification():null);
            List<JustificationType> rhsJustification;
            rhsJustification = (((that.justification!= null)&&(!that.justification.isEmpty()))?that.getJustification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "justification", lhsJustification), LocatorUtils.property(thatLocator, "justification", rhsJustification), lhsJustification, rhsJustification, ((this.justification!= null)&&(!this.justification.isEmpty())), ((that.justification!= null)&&(!that.justification.isEmpty())))) {
                return false;
            }
        }
        {
            List<FrequencyType> lhsFrequency;
            lhsFrequency = (((this.frequency!= null)&&(!this.frequency.isEmpty()))?this.getFrequency():null);
            List<FrequencyType> rhsFrequency;
            rhsFrequency = (((that.frequency!= null)&&(!that.frequency.isEmpty()))?that.getFrequency():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frequency", lhsFrequency), LocatorUtils.property(thatLocator, "frequency", rhsFrequency), lhsFrequency, rhsFrequency, ((this.frequency!= null)&&(!this.frequency.isEmpty())), ((that.frequency!= null)&&(!that.frequency.isEmpty())))) {
                return false;
            }
        }
        {
            PeriodType lhsDurationPeriod;
            lhsDurationPeriod = this.getDurationPeriod();
            PeriodType rhsDurationPeriod;
            rhsDurationPeriod = that.getDurationPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "durationPeriod", lhsDurationPeriod), LocatorUtils.property(thatLocator, "durationPeriod", rhsDurationPeriod), lhsDurationPeriod, rhsDurationPeriod, (this.durationPeriod!= null), (that.durationPeriod!= null))) {
                return false;
            }
        }
        {
            List<TenderRequirementType> lhsSubsequentProcessTenderRequirement;
            lhsSubsequentProcessTenderRequirement = (((this.subsequentProcessTenderRequirement!= null)&&(!this.subsequentProcessTenderRequirement.isEmpty()))?this.getSubsequentProcessTenderRequirement():null);
            List<TenderRequirementType> rhsSubsequentProcessTenderRequirement;
            rhsSubsequentProcessTenderRequirement = (((that.subsequentProcessTenderRequirement!= null)&&(!that.subsequentProcessTenderRequirement.isEmpty()))?that.getSubsequentProcessTenderRequirement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subsequentProcessTenderRequirement", lhsSubsequentProcessTenderRequirement), LocatorUtils.property(thatLocator, "subsequentProcessTenderRequirement", rhsSubsequentProcessTenderRequirement), lhsSubsequentProcessTenderRequirement, rhsSubsequentProcessTenderRequirement, ((this.subsequentProcessTenderRequirement!= null)&&(!this.subsequentProcessTenderRequirement.isEmpty())), ((that.subsequentProcessTenderRequirement!= null)&&(!that.subsequentProcessTenderRequirement.isEmpty())))) {
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
            ExpectedOperatorQuantityType theExpectedOperatorQuantity;
            theExpectedOperatorQuantity = this.getExpectedOperatorQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expectedOperatorQuantity", theExpectedOperatorQuantity), currentHashCode, theExpectedOperatorQuantity, (this.expectedOperatorQuantity!= null));
        }
        {
            MaximumOperatorQuantityType theMaximumOperatorQuantity;
            theMaximumOperatorQuantity = this.getMaximumOperatorQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumOperatorQuantity", theMaximumOperatorQuantity), currentHashCode, theMaximumOperatorQuantity, (this.maximumOperatorQuantity!= null));
        }
        {
            List<JustificationType> theJustification;
            theJustification = (((this.justification!= null)&&(!this.justification.isEmpty()))?this.getJustification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "justification", theJustification), currentHashCode, theJustification, ((this.justification!= null)&&(!this.justification.isEmpty())));
        }
        {
            List<FrequencyType> theFrequency;
            theFrequency = (((this.frequency!= null)&&(!this.frequency.isEmpty()))?this.getFrequency():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frequency", theFrequency), currentHashCode, theFrequency, ((this.frequency!= null)&&(!this.frequency.isEmpty())));
        }
        {
            PeriodType theDurationPeriod;
            theDurationPeriod = this.getDurationPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "durationPeriod", theDurationPeriod), currentHashCode, theDurationPeriod, (this.durationPeriod!= null));
        }
        {
            List<TenderRequirementType> theSubsequentProcessTenderRequirement;
            theSubsequentProcessTenderRequirement = (((this.subsequentProcessTenderRequirement!= null)&&(!this.subsequentProcessTenderRequirement.isEmpty()))?this.getSubsequentProcessTenderRequirement():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subsequentProcessTenderRequirement", theSubsequentProcessTenderRequirement), currentHashCode, theSubsequentProcessTenderRequirement, ((this.subsequentProcessTenderRequirement!= null)&&(!this.subsequentProcessTenderRequirement.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
