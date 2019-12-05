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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AwardingCriterionTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CalculationExpressionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CalculationExpressionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumImprovementBidType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeightNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeightType;
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
 * <p>Classe Java per AwardingCriterionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AwardingCriterionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardingCriterionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeightNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Weight" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CalculationExpression" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CalculationExpressionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumImprovementBid" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubordinateAwardingCriterion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwardingCriterionType", propOrder = {
    "id",
    "awardingCriterionTypeCode",
    "description",
    "weightNumeric",
    "weight",
    "calculationExpression",
    "calculationExpressionCode",
    "minimumQuantity",
    "maximumQuantity",
    "minimumAmount",
    "maximumAmount",
    "minimumImprovementBid",
    "subordinateAwardingCriterion"
})
public class AwardingCriterionType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "AwardingCriterionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AwardingCriterionTypeCodeType awardingCriterionTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "WeightNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected WeightNumericType weightNumeric;
    @XmlElement(name = "Weight", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<WeightType> weight;
    @XmlElement(name = "CalculationExpression", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<CalculationExpressionType> calculationExpression;
    @XmlElement(name = "CalculationExpressionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CalculationExpressionCodeType calculationExpressionCode;
    @XmlElement(name = "MinimumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumQuantityType minimumQuantity;
    @XmlElement(name = "MaximumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumQuantityType maximumQuantity;
    @XmlElement(name = "MinimumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumAmountType minimumAmount;
    @XmlElement(name = "MaximumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumAmountType maximumAmount;
    @XmlElement(name = "MinimumImprovementBid", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<MinimumImprovementBidType> minimumImprovementBid;
    @XmlElement(name = "SubordinateAwardingCriterion")
    protected List<AwardingCriterionType> subordinateAwardingCriterion;

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
     * Recupera il valore della proprietà awardingCriterionTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link AwardingCriterionTypeCodeType }
     *     
     */
    public AwardingCriterionTypeCodeType getAwardingCriterionTypeCode() {
        return awardingCriterionTypeCode;
    }

    /**
     * Imposta il valore della proprietà awardingCriterionTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardingCriterionTypeCodeType }
     *     
     */
    public void setAwardingCriterionTypeCode(AwardingCriterionTypeCodeType value) {
        this.awardingCriterionTypeCode = value;
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
     * Recupera il valore della proprietà weightNumeric.
     * 
     * @return
     *     possible object is
     *     {@link WeightNumericType }
     *     
     */
    public WeightNumericType getWeightNumeric() {
        return weightNumeric;
    }

    /**
     * Imposta il valore della proprietà weightNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightNumericType }
     *     
     */
    public void setWeightNumeric(WeightNumericType value) {
        this.weightNumeric = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightType }
     * 
     * 
     */
    public List<WeightType> getWeight() {
        if (weight == null) {
            weight = new ArrayList<WeightType>();
        }
        return this.weight;
    }

    /**
     * Gets the value of the calculationExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculationExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculationExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalculationExpressionType }
     * 
     * 
     */
    public List<CalculationExpressionType> getCalculationExpression() {
        if (calculationExpression == null) {
            calculationExpression = new ArrayList<CalculationExpressionType>();
        }
        return this.calculationExpression;
    }

    /**
     * Recupera il valore della proprietà calculationExpressionCode.
     * 
     * @return
     *     possible object is
     *     {@link CalculationExpressionCodeType }
     *     
     */
    public CalculationExpressionCodeType getCalculationExpressionCode() {
        return calculationExpressionCode;
    }

    /**
     * Imposta il valore della proprietà calculationExpressionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationExpressionCodeType }
     *     
     */
    public void setCalculationExpressionCode(CalculationExpressionCodeType value) {
        this.calculationExpressionCode = value;
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
     * Recupera il valore della proprietà minimumAmount.
     * 
     * @return
     *     possible object is
     *     {@link MinimumAmountType }
     *     
     */
    public MinimumAmountType getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * Imposta il valore della proprietà minimumAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumAmountType }
     *     
     */
    public void setMinimumAmount(MinimumAmountType value) {
        this.minimumAmount = value;
    }

    /**
     * Recupera il valore della proprietà maximumAmount.
     * 
     * @return
     *     possible object is
     *     {@link MaximumAmountType }
     *     
     */
    public MaximumAmountType getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * Imposta il valore della proprietà maximumAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumAmountType }
     *     
     */
    public void setMaximumAmount(MaximumAmountType value) {
        this.maximumAmount = value;
    }

    /**
     * Gets the value of the minimumImprovementBid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimumImprovementBid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumImprovementBid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MinimumImprovementBidType }
     * 
     * 
     */
    public List<MinimumImprovementBidType> getMinimumImprovementBid() {
        if (minimumImprovementBid == null) {
            minimumImprovementBid = new ArrayList<MinimumImprovementBidType>();
        }
        return this.minimumImprovementBid;
    }

    /**
     * Gets the value of the subordinateAwardingCriterion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subordinateAwardingCriterion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubordinateAwardingCriterion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardingCriterionType }
     * 
     * 
     */
    public List<AwardingCriterionType> getSubordinateAwardingCriterion() {
        if (subordinateAwardingCriterion == null) {
            subordinateAwardingCriterion = new ArrayList<AwardingCriterionType>();
        }
        return this.subordinateAwardingCriterion;
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
            AwardingCriterionTypeCodeType theAwardingCriterionTypeCode;
            theAwardingCriterionTypeCode = this.getAwardingCriterionTypeCode();
            strategy.appendField(locator, this, "awardingCriterionTypeCode", buffer, theAwardingCriterionTypeCode, (this.awardingCriterionTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            WeightNumericType theWeightNumeric;
            theWeightNumeric = this.getWeightNumeric();
            strategy.appendField(locator, this, "weightNumeric", buffer, theWeightNumeric, (this.weightNumeric!= null));
        }
        {
            List<WeightType> theWeight;
            theWeight = (((this.weight!= null)&&(!this.weight.isEmpty()))?this.getWeight():null);
            strategy.appendField(locator, this, "weight", buffer, theWeight, ((this.weight!= null)&&(!this.weight.isEmpty())));
        }
        {
            List<CalculationExpressionType> theCalculationExpression;
            theCalculationExpression = (((this.calculationExpression!= null)&&(!this.calculationExpression.isEmpty()))?this.getCalculationExpression():null);
            strategy.appendField(locator, this, "calculationExpression", buffer, theCalculationExpression, ((this.calculationExpression!= null)&&(!this.calculationExpression.isEmpty())));
        }
        {
            CalculationExpressionCodeType theCalculationExpressionCode;
            theCalculationExpressionCode = this.getCalculationExpressionCode();
            strategy.appendField(locator, this, "calculationExpressionCode", buffer, theCalculationExpressionCode, (this.calculationExpressionCode!= null));
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
            MinimumAmountType theMinimumAmount;
            theMinimumAmount = this.getMinimumAmount();
            strategy.appendField(locator, this, "minimumAmount", buffer, theMinimumAmount, (this.minimumAmount!= null));
        }
        {
            MaximumAmountType theMaximumAmount;
            theMaximumAmount = this.getMaximumAmount();
            strategy.appendField(locator, this, "maximumAmount", buffer, theMaximumAmount, (this.maximumAmount!= null));
        }
        {
            List<MinimumImprovementBidType> theMinimumImprovementBid;
            theMinimumImprovementBid = (((this.minimumImprovementBid!= null)&&(!this.minimumImprovementBid.isEmpty()))?this.getMinimumImprovementBid():null);
            strategy.appendField(locator, this, "minimumImprovementBid", buffer, theMinimumImprovementBid, ((this.minimumImprovementBid!= null)&&(!this.minimumImprovementBid.isEmpty())));
        }
        {
            List<AwardingCriterionType> theSubordinateAwardingCriterion;
            theSubordinateAwardingCriterion = (((this.subordinateAwardingCriterion!= null)&&(!this.subordinateAwardingCriterion.isEmpty()))?this.getSubordinateAwardingCriterion():null);
            strategy.appendField(locator, this, "subordinateAwardingCriterion", buffer, theSubordinateAwardingCriterion, ((this.subordinateAwardingCriterion!= null)&&(!this.subordinateAwardingCriterion.isEmpty())));
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
        final AwardingCriterionType that = ((AwardingCriterionType) object);
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
            AwardingCriterionTypeCodeType lhsAwardingCriterionTypeCode;
            lhsAwardingCriterionTypeCode = this.getAwardingCriterionTypeCode();
            AwardingCriterionTypeCodeType rhsAwardingCriterionTypeCode;
            rhsAwardingCriterionTypeCode = that.getAwardingCriterionTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "awardingCriterionTypeCode", lhsAwardingCriterionTypeCode), LocatorUtils.property(thatLocator, "awardingCriterionTypeCode", rhsAwardingCriterionTypeCode), lhsAwardingCriterionTypeCode, rhsAwardingCriterionTypeCode, (this.awardingCriterionTypeCode!= null), (that.awardingCriterionTypeCode!= null))) {
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
            WeightNumericType lhsWeightNumeric;
            lhsWeightNumeric = this.getWeightNumeric();
            WeightNumericType rhsWeightNumeric;
            rhsWeightNumeric = that.getWeightNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weightNumeric", lhsWeightNumeric), LocatorUtils.property(thatLocator, "weightNumeric", rhsWeightNumeric), lhsWeightNumeric, rhsWeightNumeric, (this.weightNumeric!= null), (that.weightNumeric!= null))) {
                return false;
            }
        }
        {
            List<WeightType> lhsWeight;
            lhsWeight = (((this.weight!= null)&&(!this.weight.isEmpty()))?this.getWeight():null);
            List<WeightType> rhsWeight;
            rhsWeight = (((that.weight!= null)&&(!that.weight.isEmpty()))?that.getWeight():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weight", lhsWeight), LocatorUtils.property(thatLocator, "weight", rhsWeight), lhsWeight, rhsWeight, ((this.weight!= null)&&(!this.weight.isEmpty())), ((that.weight!= null)&&(!that.weight.isEmpty())))) {
                return false;
            }
        }
        {
            List<CalculationExpressionType> lhsCalculationExpression;
            lhsCalculationExpression = (((this.calculationExpression!= null)&&(!this.calculationExpression.isEmpty()))?this.getCalculationExpression():null);
            List<CalculationExpressionType> rhsCalculationExpression;
            rhsCalculationExpression = (((that.calculationExpression!= null)&&(!that.calculationExpression.isEmpty()))?that.getCalculationExpression():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calculationExpression", lhsCalculationExpression), LocatorUtils.property(thatLocator, "calculationExpression", rhsCalculationExpression), lhsCalculationExpression, rhsCalculationExpression, ((this.calculationExpression!= null)&&(!this.calculationExpression.isEmpty())), ((that.calculationExpression!= null)&&(!that.calculationExpression.isEmpty())))) {
                return false;
            }
        }
        {
            CalculationExpressionCodeType lhsCalculationExpressionCode;
            lhsCalculationExpressionCode = this.getCalculationExpressionCode();
            CalculationExpressionCodeType rhsCalculationExpressionCode;
            rhsCalculationExpressionCode = that.getCalculationExpressionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calculationExpressionCode", lhsCalculationExpressionCode), LocatorUtils.property(thatLocator, "calculationExpressionCode", rhsCalculationExpressionCode), lhsCalculationExpressionCode, rhsCalculationExpressionCode, (this.calculationExpressionCode!= null), (that.calculationExpressionCode!= null))) {
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
            MinimumAmountType lhsMinimumAmount;
            lhsMinimumAmount = this.getMinimumAmount();
            MinimumAmountType rhsMinimumAmount;
            rhsMinimumAmount = that.getMinimumAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumAmount", lhsMinimumAmount), LocatorUtils.property(thatLocator, "minimumAmount", rhsMinimumAmount), lhsMinimumAmount, rhsMinimumAmount, (this.minimumAmount!= null), (that.minimumAmount!= null))) {
                return false;
            }
        }
        {
            MaximumAmountType lhsMaximumAmount;
            lhsMaximumAmount = this.getMaximumAmount();
            MaximumAmountType rhsMaximumAmount;
            rhsMaximumAmount = that.getMaximumAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumAmount", lhsMaximumAmount), LocatorUtils.property(thatLocator, "maximumAmount", rhsMaximumAmount), lhsMaximumAmount, rhsMaximumAmount, (this.maximumAmount!= null), (that.maximumAmount!= null))) {
                return false;
            }
        }
        {
            List<MinimumImprovementBidType> lhsMinimumImprovementBid;
            lhsMinimumImprovementBid = (((this.minimumImprovementBid!= null)&&(!this.minimumImprovementBid.isEmpty()))?this.getMinimumImprovementBid():null);
            List<MinimumImprovementBidType> rhsMinimumImprovementBid;
            rhsMinimumImprovementBid = (((that.minimumImprovementBid!= null)&&(!that.minimumImprovementBid.isEmpty()))?that.getMinimumImprovementBid():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumImprovementBid", lhsMinimumImprovementBid), LocatorUtils.property(thatLocator, "minimumImprovementBid", rhsMinimumImprovementBid), lhsMinimumImprovementBid, rhsMinimumImprovementBid, ((this.minimumImprovementBid!= null)&&(!this.minimumImprovementBid.isEmpty())), ((that.minimumImprovementBid!= null)&&(!that.minimumImprovementBid.isEmpty())))) {
                return false;
            }
        }
        {
            List<AwardingCriterionType> lhsSubordinateAwardingCriterion;
            lhsSubordinateAwardingCriterion = (((this.subordinateAwardingCriterion!= null)&&(!this.subordinateAwardingCriterion.isEmpty()))?this.getSubordinateAwardingCriterion():null);
            List<AwardingCriterionType> rhsSubordinateAwardingCriterion;
            rhsSubordinateAwardingCriterion = (((that.subordinateAwardingCriterion!= null)&&(!that.subordinateAwardingCriterion.isEmpty()))?that.getSubordinateAwardingCriterion():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subordinateAwardingCriterion", lhsSubordinateAwardingCriterion), LocatorUtils.property(thatLocator, "subordinateAwardingCriterion", rhsSubordinateAwardingCriterion), lhsSubordinateAwardingCriterion, rhsSubordinateAwardingCriterion, ((this.subordinateAwardingCriterion!= null)&&(!this.subordinateAwardingCriterion.isEmpty())), ((that.subordinateAwardingCriterion!= null)&&(!that.subordinateAwardingCriterion.isEmpty())))) {
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
            AwardingCriterionTypeCodeType theAwardingCriterionTypeCode;
            theAwardingCriterionTypeCode = this.getAwardingCriterionTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "awardingCriterionTypeCode", theAwardingCriterionTypeCode), currentHashCode, theAwardingCriterionTypeCode, (this.awardingCriterionTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            WeightNumericType theWeightNumeric;
            theWeightNumeric = this.getWeightNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weightNumeric", theWeightNumeric), currentHashCode, theWeightNumeric, (this.weightNumeric!= null));
        }
        {
            List<WeightType> theWeight;
            theWeight = (((this.weight!= null)&&(!this.weight.isEmpty()))?this.getWeight():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weight", theWeight), currentHashCode, theWeight, ((this.weight!= null)&&(!this.weight.isEmpty())));
        }
        {
            List<CalculationExpressionType> theCalculationExpression;
            theCalculationExpression = (((this.calculationExpression!= null)&&(!this.calculationExpression.isEmpty()))?this.getCalculationExpression():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calculationExpression", theCalculationExpression), currentHashCode, theCalculationExpression, ((this.calculationExpression!= null)&&(!this.calculationExpression.isEmpty())));
        }
        {
            CalculationExpressionCodeType theCalculationExpressionCode;
            theCalculationExpressionCode = this.getCalculationExpressionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calculationExpressionCode", theCalculationExpressionCode), currentHashCode, theCalculationExpressionCode, (this.calculationExpressionCode!= null));
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
            MinimumAmountType theMinimumAmount;
            theMinimumAmount = this.getMinimumAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumAmount", theMinimumAmount), currentHashCode, theMinimumAmount, (this.minimumAmount!= null));
        }
        {
            MaximumAmountType theMaximumAmount;
            theMaximumAmount = this.getMaximumAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumAmount", theMaximumAmount), currentHashCode, theMaximumAmount, (this.maximumAmount!= null));
        }
        {
            List<MinimumImprovementBidType> theMinimumImprovementBid;
            theMinimumImprovementBid = (((this.minimumImprovementBid!= null)&&(!this.minimumImprovementBid.isEmpty()))?this.getMinimumImprovementBid():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumImprovementBid", theMinimumImprovementBid), currentHashCode, theMinimumImprovementBid, ((this.minimumImprovementBid!= null)&&(!this.minimumImprovementBid.isEmpty())));
        }
        {
            List<AwardingCriterionType> theSubordinateAwardingCriterion;
            theSubordinateAwardingCriterion = (((this.subordinateAwardingCriterion!= null)&&(!this.subordinateAwardingCriterion.isEmpty()))?this.getSubordinateAwardingCriterion():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subordinateAwardingCriterion", theSubordinateAwardingCriterion), currentHashCode, theSubordinateAwardingCriterion, ((this.subordinateAwardingCriterion!= null)&&(!this.subordinateAwardingCriterion.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
