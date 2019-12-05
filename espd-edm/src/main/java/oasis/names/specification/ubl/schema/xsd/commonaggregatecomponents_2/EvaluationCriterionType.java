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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EvaluationCriterionTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpressionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpressionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ThresholdAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ThresholdQuantityType;
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
 * <p>Classe Java per EvaluationCriterionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EvaluationCriterionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EvaluationCriterionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThresholdAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThresholdQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpressionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Expression" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DurationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SuggestedEvidence" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvaluationCriterionType", propOrder = {
    "evaluationCriterionTypeCode",
    "description",
    "thresholdAmount",
    "thresholdQuantity",
    "expressionCode",
    "expression",
    "durationPeriod",
    "suggestedEvidence"
})
public class EvaluationCriterionType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "EvaluationCriterionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EvaluationCriterionTypeCodeType evaluationCriterionTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "ThresholdAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ThresholdAmountType thresholdAmount;
    @XmlElement(name = "ThresholdQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ThresholdQuantityType thresholdQuantity;
    @XmlElement(name = "ExpressionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpressionCodeType expressionCode;
    @XmlElement(name = "Expression", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ExpressionType> expression;
    @XmlElement(name = "DurationPeriod")
    protected PeriodType durationPeriod;
    @XmlElement(name = "SuggestedEvidence")
    protected List<EvidenceType> suggestedEvidence;

    /**
     * Recupera il valore della proprietà evaluationCriterionTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationCriterionTypeCodeType }
     *     
     */
    public EvaluationCriterionTypeCodeType getEvaluationCriterionTypeCode() {
        return evaluationCriterionTypeCode;
    }

    /**
     * Imposta il valore della proprietà evaluationCriterionTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationCriterionTypeCodeType }
     *     
     */
    public void setEvaluationCriterionTypeCode(EvaluationCriterionTypeCodeType value) {
        this.evaluationCriterionTypeCode = value;
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
     * Recupera il valore della proprietà thresholdAmount.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdAmountType }
     *     
     */
    public ThresholdAmountType getThresholdAmount() {
        return thresholdAmount;
    }

    /**
     * Imposta il valore della proprietà thresholdAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdAmountType }
     *     
     */
    public void setThresholdAmount(ThresholdAmountType value) {
        this.thresholdAmount = value;
    }

    /**
     * Recupera il valore della proprietà thresholdQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdQuantityType }
     *     
     */
    public ThresholdQuantityType getThresholdQuantity() {
        return thresholdQuantity;
    }

    /**
     * Imposta il valore della proprietà thresholdQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdQuantityType }
     *     
     */
    public void setThresholdQuantity(ThresholdQuantityType value) {
        this.thresholdQuantity = value;
    }

    /**
     * Recupera il valore della proprietà expressionCode.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionCodeType }
     *     
     */
    public ExpressionCodeType getExpressionCode() {
        return expressionCode;
    }

    /**
     * Imposta il valore della proprietà expressionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionCodeType }
     *     
     */
    public void setExpressionCode(ExpressionCodeType value) {
        this.expressionCode = value;
    }

    /**
     * Gets the value of the expression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpressionType }
     * 
     * 
     */
    public List<ExpressionType> getExpression() {
        if (expression == null) {
            expression = new ArrayList<ExpressionType>();
        }
        return this.expression;
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
     * Gets the value of the suggestedEvidence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestedEvidence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestedEvidence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvidenceType }
     * 
     * 
     */
    public List<EvidenceType> getSuggestedEvidence() {
        if (suggestedEvidence == null) {
            suggestedEvidence = new ArrayList<EvidenceType>();
        }
        return this.suggestedEvidence;
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
            EvaluationCriterionTypeCodeType theEvaluationCriterionTypeCode;
            theEvaluationCriterionTypeCode = this.getEvaluationCriterionTypeCode();
            strategy.appendField(locator, this, "evaluationCriterionTypeCode", buffer, theEvaluationCriterionTypeCode, (this.evaluationCriterionTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            ThresholdAmountType theThresholdAmount;
            theThresholdAmount = this.getThresholdAmount();
            strategy.appendField(locator, this, "thresholdAmount", buffer, theThresholdAmount, (this.thresholdAmount!= null));
        }
        {
            ThresholdQuantityType theThresholdQuantity;
            theThresholdQuantity = this.getThresholdQuantity();
            strategy.appendField(locator, this, "thresholdQuantity", buffer, theThresholdQuantity, (this.thresholdQuantity!= null));
        }
        {
            ExpressionCodeType theExpressionCode;
            theExpressionCode = this.getExpressionCode();
            strategy.appendField(locator, this, "expressionCode", buffer, theExpressionCode, (this.expressionCode!= null));
        }
        {
            List<ExpressionType> theExpression;
            theExpression = (((this.expression!= null)&&(!this.expression.isEmpty()))?this.getExpression():null);
            strategy.appendField(locator, this, "expression", buffer, theExpression, ((this.expression!= null)&&(!this.expression.isEmpty())));
        }
        {
            PeriodType theDurationPeriod;
            theDurationPeriod = this.getDurationPeriod();
            strategy.appendField(locator, this, "durationPeriod", buffer, theDurationPeriod, (this.durationPeriod!= null));
        }
        {
            List<EvidenceType> theSuggestedEvidence;
            theSuggestedEvidence = (((this.suggestedEvidence!= null)&&(!this.suggestedEvidence.isEmpty()))?this.getSuggestedEvidence():null);
            strategy.appendField(locator, this, "suggestedEvidence", buffer, theSuggestedEvidence, ((this.suggestedEvidence!= null)&&(!this.suggestedEvidence.isEmpty())));
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
        final EvaluationCriterionType that = ((EvaluationCriterionType) object);
        {
            EvaluationCriterionTypeCodeType lhsEvaluationCriterionTypeCode;
            lhsEvaluationCriterionTypeCode = this.getEvaluationCriterionTypeCode();
            EvaluationCriterionTypeCodeType rhsEvaluationCriterionTypeCode;
            rhsEvaluationCriterionTypeCode = that.getEvaluationCriterionTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evaluationCriterionTypeCode", lhsEvaluationCriterionTypeCode), LocatorUtils.property(thatLocator, "evaluationCriterionTypeCode", rhsEvaluationCriterionTypeCode), lhsEvaluationCriterionTypeCode, rhsEvaluationCriterionTypeCode, (this.evaluationCriterionTypeCode!= null), (that.evaluationCriterionTypeCode!= null))) {
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
            ThresholdAmountType lhsThresholdAmount;
            lhsThresholdAmount = this.getThresholdAmount();
            ThresholdAmountType rhsThresholdAmount;
            rhsThresholdAmount = that.getThresholdAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thresholdAmount", lhsThresholdAmount), LocatorUtils.property(thatLocator, "thresholdAmount", rhsThresholdAmount), lhsThresholdAmount, rhsThresholdAmount, (this.thresholdAmount!= null), (that.thresholdAmount!= null))) {
                return false;
            }
        }
        {
            ThresholdQuantityType lhsThresholdQuantity;
            lhsThresholdQuantity = this.getThresholdQuantity();
            ThresholdQuantityType rhsThresholdQuantity;
            rhsThresholdQuantity = that.getThresholdQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thresholdQuantity", lhsThresholdQuantity), LocatorUtils.property(thatLocator, "thresholdQuantity", rhsThresholdQuantity), lhsThresholdQuantity, rhsThresholdQuantity, (this.thresholdQuantity!= null), (that.thresholdQuantity!= null))) {
                return false;
            }
        }
        {
            ExpressionCodeType lhsExpressionCode;
            lhsExpressionCode = this.getExpressionCode();
            ExpressionCodeType rhsExpressionCode;
            rhsExpressionCode = that.getExpressionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expressionCode", lhsExpressionCode), LocatorUtils.property(thatLocator, "expressionCode", rhsExpressionCode), lhsExpressionCode, rhsExpressionCode, (this.expressionCode!= null), (that.expressionCode!= null))) {
                return false;
            }
        }
        {
            List<ExpressionType> lhsExpression;
            lhsExpression = (((this.expression!= null)&&(!this.expression.isEmpty()))?this.getExpression():null);
            List<ExpressionType> rhsExpression;
            rhsExpression = (((that.expression!= null)&&(!that.expression.isEmpty()))?that.getExpression():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expression", lhsExpression), LocatorUtils.property(thatLocator, "expression", rhsExpression), lhsExpression, rhsExpression, ((this.expression!= null)&&(!this.expression.isEmpty())), ((that.expression!= null)&&(!that.expression.isEmpty())))) {
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
            List<EvidenceType> lhsSuggestedEvidence;
            lhsSuggestedEvidence = (((this.suggestedEvidence!= null)&&(!this.suggestedEvidence.isEmpty()))?this.getSuggestedEvidence():null);
            List<EvidenceType> rhsSuggestedEvidence;
            rhsSuggestedEvidence = (((that.suggestedEvidence!= null)&&(!that.suggestedEvidence.isEmpty()))?that.getSuggestedEvidence():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suggestedEvidence", lhsSuggestedEvidence), LocatorUtils.property(thatLocator, "suggestedEvidence", rhsSuggestedEvidence), lhsSuggestedEvidence, rhsSuggestedEvidence, ((this.suggestedEvidence!= null)&&(!this.suggestedEvidence.isEmpty())), ((that.suggestedEvidence!= null)&&(!that.suggestedEvidence.isEmpty())))) {
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
            EvaluationCriterionTypeCodeType theEvaluationCriterionTypeCode;
            theEvaluationCriterionTypeCode = this.getEvaluationCriterionTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evaluationCriterionTypeCode", theEvaluationCriterionTypeCode), currentHashCode, theEvaluationCriterionTypeCode, (this.evaluationCriterionTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            ThresholdAmountType theThresholdAmount;
            theThresholdAmount = this.getThresholdAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "thresholdAmount", theThresholdAmount), currentHashCode, theThresholdAmount, (this.thresholdAmount!= null));
        }
        {
            ThresholdQuantityType theThresholdQuantity;
            theThresholdQuantity = this.getThresholdQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "thresholdQuantity", theThresholdQuantity), currentHashCode, theThresholdQuantity, (this.thresholdQuantity!= null));
        }
        {
            ExpressionCodeType theExpressionCode;
            theExpressionCode = this.getExpressionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expressionCode", theExpressionCode), currentHashCode, theExpressionCode, (this.expressionCode!= null));
        }
        {
            List<ExpressionType> theExpression;
            theExpression = (((this.expression!= null)&&(!this.expression.isEmpty()))?this.getExpression():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expression", theExpression), currentHashCode, theExpression, ((this.expression!= null)&&(!this.expression.isEmpty())));
        }
        {
            PeriodType theDurationPeriod;
            theDurationPeriod = this.getDurationPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "durationPeriod", theDurationPeriod), currentHashCode, theDurationPeriod, (this.durationPeriod!= null));
        }
        {
            List<EvidenceType> theSuggestedEvidence;
            theSuggestedEvidence = (((this.suggestedEvidence!= null)&&(!this.suggestedEvidence.isEmpty()))?this.getSuggestedEvidence():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "suggestedEvidence", theSuggestedEvidence), currentHashCode, theSuggestedEvidence, ((this.suggestedEvidence!= null)&&(!this.suggestedEvidence.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
