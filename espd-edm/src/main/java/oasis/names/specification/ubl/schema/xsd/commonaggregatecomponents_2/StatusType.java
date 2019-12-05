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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConditionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IndicationIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReferenceDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReferenceTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReliabilityPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SequenceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StatusReasonCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StatusReasonType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TextType;
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
 * <p>Classe Java per StatusType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConditionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StatusReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StatusReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IndicationIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Percent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReliabilityPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Condition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusType", propOrder = {
    "conditionCode",
    "referenceDate",
    "referenceTime",
    "description",
    "statusReasonCode",
    "statusReason",
    "sequenceID",
    "text",
    "indicationIndicator",
    "percent",
    "reliabilityPercent",
    "condition"
})
public class StatusType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ConditionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConditionCodeType conditionCode;
    @XmlElement(name = "ReferenceDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReferenceDateType referenceDate;
    @XmlElement(name = "ReferenceTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReferenceTimeType referenceTime;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "StatusReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected StatusReasonCodeType statusReasonCode;
    @XmlElement(name = "StatusReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<StatusReasonType> statusReason;
    @XmlElement(name = "SequenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SequenceIDType sequenceID;
    @XmlElement(name = "Text", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TextType> text;
    @XmlElement(name = "IndicationIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IndicationIndicatorType indicationIndicator;
    @XmlElement(name = "Percent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PercentType percent;
    @XmlElement(name = "ReliabilityPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReliabilityPercentType reliabilityPercent;
    @XmlElement(name = "Condition")
    protected List<ConditionType> condition;

    /**
     * Recupera il valore della proprietà conditionCode.
     * 
     * @return
     *     possible object is
     *     {@link ConditionCodeType }
     *     
     */
    public ConditionCodeType getConditionCode() {
        return conditionCode;
    }

    /**
     * Imposta il valore della proprietà conditionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionCodeType }
     *     
     */
    public void setConditionCode(ConditionCodeType value) {
        this.conditionCode = value;
    }

    /**
     * Recupera il valore della proprietà referenceDate.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDateType }
     *     
     */
    public ReferenceDateType getReferenceDate() {
        return referenceDate;
    }

    /**
     * Imposta il valore della proprietà referenceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDateType }
     *     
     */
    public void setReferenceDate(ReferenceDateType value) {
        this.referenceDate = value;
    }

    /**
     * Recupera il valore della proprietà referenceTime.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceTimeType }
     *     
     */
    public ReferenceTimeType getReferenceTime() {
        return referenceTime;
    }

    /**
     * Imposta il valore della proprietà referenceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceTimeType }
     *     
     */
    public void setReferenceTime(ReferenceTimeType value) {
        this.referenceTime = value;
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
     * Recupera il valore della proprietà statusReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link StatusReasonCodeType }
     *     
     */
    public StatusReasonCodeType getStatusReasonCode() {
        return statusReasonCode;
    }

    /**
     * Imposta il valore della proprietà statusReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReasonCodeType }
     *     
     */
    public void setStatusReasonCode(StatusReasonCodeType value) {
        this.statusReasonCode = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReasonType }
     * 
     * 
     */
    public List<StatusReasonType> getStatusReason() {
        if (statusReason == null) {
            statusReason = new ArrayList<StatusReasonType>();
        }
        return this.statusReason;
    }

    /**
     * Recupera il valore della proprietà sequenceID.
     * 
     * @return
     *     possible object is
     *     {@link SequenceIDType }
     *     
     */
    public SequenceIDType getSequenceID() {
        return sequenceID;
    }

    /**
     * Imposta il valore della proprietà sequenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceIDType }
     *     
     */
    public void setSequenceID(SequenceIDType value) {
        this.sequenceID = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getText() {
        if (text == null) {
            text = new ArrayList<TextType>();
        }
        return this.text;
    }

    /**
     * Recupera il valore della proprietà indicationIndicator.
     * 
     * @return
     *     possible object is
     *     {@link IndicationIndicatorType }
     *     
     */
    public IndicationIndicatorType getIndicationIndicator() {
        return indicationIndicator;
    }

    /**
     * Imposta il valore della proprietà indicationIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicationIndicatorType }
     *     
     */
    public void setIndicationIndicator(IndicationIndicatorType value) {
        this.indicationIndicator = value;
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
     * Recupera il valore della proprietà reliabilityPercent.
     * 
     * @return
     *     possible object is
     *     {@link ReliabilityPercentType }
     *     
     */
    public ReliabilityPercentType getReliabilityPercent() {
        return reliabilityPercent;
    }

    /**
     * Imposta il valore della proprietà reliabilityPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link ReliabilityPercentType }
     *     
     */
    public void setReliabilityPercent(ReliabilityPercentType value) {
        this.reliabilityPercent = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionType }
     * 
     * 
     */
    public List<ConditionType> getCondition() {
        if (condition == null) {
            condition = new ArrayList<ConditionType>();
        }
        return this.condition;
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
            ConditionCodeType theConditionCode;
            theConditionCode = this.getConditionCode();
            strategy.appendField(locator, this, "conditionCode", buffer, theConditionCode, (this.conditionCode!= null));
        }
        {
            ReferenceDateType theReferenceDate;
            theReferenceDate = this.getReferenceDate();
            strategy.appendField(locator, this, "referenceDate", buffer, theReferenceDate, (this.referenceDate!= null));
        }
        {
            ReferenceTimeType theReferenceTime;
            theReferenceTime = this.getReferenceTime();
            strategy.appendField(locator, this, "referenceTime", buffer, theReferenceTime, (this.referenceTime!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            StatusReasonCodeType theStatusReasonCode;
            theStatusReasonCode = this.getStatusReasonCode();
            strategy.appendField(locator, this, "statusReasonCode", buffer, theStatusReasonCode, (this.statusReasonCode!= null));
        }
        {
            List<StatusReasonType> theStatusReason;
            theStatusReason = (((this.statusReason!= null)&&(!this.statusReason.isEmpty()))?this.getStatusReason():null);
            strategy.appendField(locator, this, "statusReason", buffer, theStatusReason, ((this.statusReason!= null)&&(!this.statusReason.isEmpty())));
        }
        {
            SequenceIDType theSequenceID;
            theSequenceID = this.getSequenceID();
            strategy.appendField(locator, this, "sequenceID", buffer, theSequenceID, (this.sequenceID!= null));
        }
        {
            List<TextType> theText;
            theText = (((this.text!= null)&&(!this.text.isEmpty()))?this.getText():null);
            strategy.appendField(locator, this, "text", buffer, theText, ((this.text!= null)&&(!this.text.isEmpty())));
        }
        {
            IndicationIndicatorType theIndicationIndicator;
            theIndicationIndicator = this.getIndicationIndicator();
            strategy.appendField(locator, this, "indicationIndicator", buffer, theIndicationIndicator, (this.indicationIndicator!= null));
        }
        {
            PercentType thePercent;
            thePercent = this.getPercent();
            strategy.appendField(locator, this, "percent", buffer, thePercent, (this.percent!= null));
        }
        {
            ReliabilityPercentType theReliabilityPercent;
            theReliabilityPercent = this.getReliabilityPercent();
            strategy.appendField(locator, this, "reliabilityPercent", buffer, theReliabilityPercent, (this.reliabilityPercent!= null));
        }
        {
            List<ConditionType> theCondition;
            theCondition = (((this.condition!= null)&&(!this.condition.isEmpty()))?this.getCondition():null);
            strategy.appendField(locator, this, "condition", buffer, theCondition, ((this.condition!= null)&&(!this.condition.isEmpty())));
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
        final StatusType that = ((StatusType) object);
        {
            ConditionCodeType lhsConditionCode;
            lhsConditionCode = this.getConditionCode();
            ConditionCodeType rhsConditionCode;
            rhsConditionCode = that.getConditionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conditionCode", lhsConditionCode), LocatorUtils.property(thatLocator, "conditionCode", rhsConditionCode), lhsConditionCode, rhsConditionCode, (this.conditionCode!= null), (that.conditionCode!= null))) {
                return false;
            }
        }
        {
            ReferenceDateType lhsReferenceDate;
            lhsReferenceDate = this.getReferenceDate();
            ReferenceDateType rhsReferenceDate;
            rhsReferenceDate = that.getReferenceDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceDate", lhsReferenceDate), LocatorUtils.property(thatLocator, "referenceDate", rhsReferenceDate), lhsReferenceDate, rhsReferenceDate, (this.referenceDate!= null), (that.referenceDate!= null))) {
                return false;
            }
        }
        {
            ReferenceTimeType lhsReferenceTime;
            lhsReferenceTime = this.getReferenceTime();
            ReferenceTimeType rhsReferenceTime;
            rhsReferenceTime = that.getReferenceTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceTime", lhsReferenceTime), LocatorUtils.property(thatLocator, "referenceTime", rhsReferenceTime), lhsReferenceTime, rhsReferenceTime, (this.referenceTime!= null), (that.referenceTime!= null))) {
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
            StatusReasonCodeType lhsStatusReasonCode;
            lhsStatusReasonCode = this.getStatusReasonCode();
            StatusReasonCodeType rhsStatusReasonCode;
            rhsStatusReasonCode = that.getStatusReasonCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusReasonCode", lhsStatusReasonCode), LocatorUtils.property(thatLocator, "statusReasonCode", rhsStatusReasonCode), lhsStatusReasonCode, rhsStatusReasonCode, (this.statusReasonCode!= null), (that.statusReasonCode!= null))) {
                return false;
            }
        }
        {
            List<StatusReasonType> lhsStatusReason;
            lhsStatusReason = (((this.statusReason!= null)&&(!this.statusReason.isEmpty()))?this.getStatusReason():null);
            List<StatusReasonType> rhsStatusReason;
            rhsStatusReason = (((that.statusReason!= null)&&(!that.statusReason.isEmpty()))?that.getStatusReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusReason", lhsStatusReason), LocatorUtils.property(thatLocator, "statusReason", rhsStatusReason), lhsStatusReason, rhsStatusReason, ((this.statusReason!= null)&&(!this.statusReason.isEmpty())), ((that.statusReason!= null)&&(!that.statusReason.isEmpty())))) {
                return false;
            }
        }
        {
            SequenceIDType lhsSequenceID;
            lhsSequenceID = this.getSequenceID();
            SequenceIDType rhsSequenceID;
            rhsSequenceID = that.getSequenceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceID", lhsSequenceID), LocatorUtils.property(thatLocator, "sequenceID", rhsSequenceID), lhsSequenceID, rhsSequenceID, (this.sequenceID!= null), (that.sequenceID!= null))) {
                return false;
            }
        }
        {
            List<TextType> lhsText;
            lhsText = (((this.text!= null)&&(!this.text.isEmpty()))?this.getText():null);
            List<TextType> rhsText;
            rhsText = (((that.text!= null)&&(!that.text.isEmpty()))?that.getText():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "text", lhsText), LocatorUtils.property(thatLocator, "text", rhsText), lhsText, rhsText, ((this.text!= null)&&(!this.text.isEmpty())), ((that.text!= null)&&(!that.text.isEmpty())))) {
                return false;
            }
        }
        {
            IndicationIndicatorType lhsIndicationIndicator;
            lhsIndicationIndicator = this.getIndicationIndicator();
            IndicationIndicatorType rhsIndicationIndicator;
            rhsIndicationIndicator = that.getIndicationIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "indicationIndicator", lhsIndicationIndicator), LocatorUtils.property(thatLocator, "indicationIndicator", rhsIndicationIndicator), lhsIndicationIndicator, rhsIndicationIndicator, (this.indicationIndicator!= null), (that.indicationIndicator!= null))) {
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
            ReliabilityPercentType lhsReliabilityPercent;
            lhsReliabilityPercent = this.getReliabilityPercent();
            ReliabilityPercentType rhsReliabilityPercent;
            rhsReliabilityPercent = that.getReliabilityPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reliabilityPercent", lhsReliabilityPercent), LocatorUtils.property(thatLocator, "reliabilityPercent", rhsReliabilityPercent), lhsReliabilityPercent, rhsReliabilityPercent, (this.reliabilityPercent!= null), (that.reliabilityPercent!= null))) {
                return false;
            }
        }
        {
            List<ConditionType> lhsCondition;
            lhsCondition = (((this.condition!= null)&&(!this.condition.isEmpty()))?this.getCondition():null);
            List<ConditionType> rhsCondition;
            rhsCondition = (((that.condition!= null)&&(!that.condition.isEmpty()))?that.getCondition():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "condition", lhsCondition), LocatorUtils.property(thatLocator, "condition", rhsCondition), lhsCondition, rhsCondition, ((this.condition!= null)&&(!this.condition.isEmpty())), ((that.condition!= null)&&(!that.condition.isEmpty())))) {
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
            ConditionCodeType theConditionCode;
            theConditionCode = this.getConditionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conditionCode", theConditionCode), currentHashCode, theConditionCode, (this.conditionCode!= null));
        }
        {
            ReferenceDateType theReferenceDate;
            theReferenceDate = this.getReferenceDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceDate", theReferenceDate), currentHashCode, theReferenceDate, (this.referenceDate!= null));
        }
        {
            ReferenceTimeType theReferenceTime;
            theReferenceTime = this.getReferenceTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceTime", theReferenceTime), currentHashCode, theReferenceTime, (this.referenceTime!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            StatusReasonCodeType theStatusReasonCode;
            theStatusReasonCode = this.getStatusReasonCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statusReasonCode", theStatusReasonCode), currentHashCode, theStatusReasonCode, (this.statusReasonCode!= null));
        }
        {
            List<StatusReasonType> theStatusReason;
            theStatusReason = (((this.statusReason!= null)&&(!this.statusReason.isEmpty()))?this.getStatusReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statusReason", theStatusReason), currentHashCode, theStatusReason, ((this.statusReason!= null)&&(!this.statusReason.isEmpty())));
        }
        {
            SequenceIDType theSequenceID;
            theSequenceID = this.getSequenceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceID", theSequenceID), currentHashCode, theSequenceID, (this.sequenceID!= null));
        }
        {
            List<TextType> theText;
            theText = (((this.text!= null)&&(!this.text.isEmpty()))?this.getText():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "text", theText), currentHashCode, theText, ((this.text!= null)&&(!this.text.isEmpty())));
        }
        {
            IndicationIndicatorType theIndicationIndicator;
            theIndicationIndicator = this.getIndicationIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "indicationIndicator", theIndicationIndicator), currentHashCode, theIndicationIndicator, (this.indicationIndicator!= null));
        }
        {
            PercentType thePercent;
            thePercent = this.getPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percent", thePercent), currentHashCode, thePercent, (this.percent!= null));
        }
        {
            ReliabilityPercentType theReliabilityPercent;
            theReliabilityPercent = this.getReliabilityPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reliabilityPercent", theReliabilityPercent), currentHashCode, theReliabilityPercent, (this.reliabilityPercent!= null));
        }
        {
            List<ConditionType> theCondition;
            theCondition = (((this.condition!= null)&&(!this.condition.isEmpty()))?this.getCondition():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "condition", theCondition), currentHashCode, theCondition, ((this.condition!= null)&&(!this.condition.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
