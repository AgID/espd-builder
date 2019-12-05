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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CardinalityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CriterionTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EvaluationMethodTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FulfilmentIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FulfilmentIndicatorTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IndexType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeightNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeightingConsiderationDescriptionType;
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
 * <p>Classe Java per TenderingCriterionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TenderingCriterionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Index" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CriterionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Cardinality" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeightNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FulfilmentIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FulfilmentIndicatorTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EvaluationMethodTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeightingConsiderationDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubTenderingCriterion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Legislation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderingCriterionPropertyGroup" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderingCriterionType", propOrder = {
    "index",
    "id",
    "criterionTypeCode",
    "name",
    "description",
    "cardinality",
    "weightNumeric",
    "fulfilmentIndicator",
    "fulfilmentIndicatorTypeCode",
    "evaluationMethodTypeCode",
    "weightingConsiderationDescription",
    "subTenderingCriterion",
    "legislation",
    "tenderingCriterionPropertyGroup"
})
public class TenderingCriterionType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Index", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IndexType index;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "CriterionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CriterionTypeCodeType criterionTypeCode;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "Cardinality", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CardinalityType cardinality;
    @XmlElement(name = "WeightNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected WeightNumericType weightNumeric;
    @XmlElement(name = "FulfilmentIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FulfilmentIndicatorType fulfilmentIndicator;
    @XmlElement(name = "FulfilmentIndicatorTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FulfilmentIndicatorTypeCodeType fulfilmentIndicatorTypeCode;
    @XmlElement(name = "EvaluationMethodTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EvaluationMethodTypeCodeType evaluationMethodTypeCode;
    @XmlElement(name = "WeightingConsiderationDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<WeightingConsiderationDescriptionType> weightingConsiderationDescription;
    @XmlElement(name = "SubTenderingCriterion")
    protected List<TenderingCriterionType> subTenderingCriterion;
    @XmlElement(name = "Legislation")
    protected List<LegislationType> legislation;
    @XmlElement(name = "TenderingCriterionPropertyGroup", required = true)
    protected List<TenderingCriterionPropertyGroupType> tenderingCriterionPropertyGroup;

    /**
     * Recupera il valore della proprietà index.
     * 
     * @return
     *     possible object is
     *     {@link IndexType }
     *     
     */
    public IndexType getIndex() {
        return index;
    }

    /**
     * Imposta il valore della proprietà index.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexType }
     *     
     */
    public void setIndex(IndexType value) {
        this.index = value;
    }

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
     * Recupera il valore della proprietà criterionTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CriterionTypeCodeType }
     *     
     */
    public CriterionTypeCodeType getCriterionTypeCode() {
        return criterionTypeCode;
    }

    /**
     * Imposta il valore della proprietà criterionTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionTypeCodeType }
     *     
     */
    public void setCriterionTypeCode(CriterionTypeCodeType value) {
        this.criterionTypeCode = value;
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
     * Recupera il valore della proprietà cardinality.
     * 
     * @return
     *     possible object is
     *     {@link CardinalityType }
     *     
     */
    public CardinalityType getCardinality() {
        return cardinality;
    }

    /**
     * Imposta il valore della proprietà cardinality.
     * 
     * @param value
     *     allowed object is
     *     {@link CardinalityType }
     *     
     */
    public void setCardinality(CardinalityType value) {
        this.cardinality = value;
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
     * Recupera il valore della proprietà fulfilmentIndicator.
     * 
     * @return
     *     possible object is
     *     {@link FulfilmentIndicatorType }
     *     
     */
    public FulfilmentIndicatorType getFulfilmentIndicator() {
        return fulfilmentIndicator;
    }

    /**
     * Imposta il valore della proprietà fulfilmentIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfilmentIndicatorType }
     *     
     */
    public void setFulfilmentIndicator(FulfilmentIndicatorType value) {
        this.fulfilmentIndicator = value;
    }

    /**
     * Recupera il valore della proprietà fulfilmentIndicatorTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link FulfilmentIndicatorTypeCodeType }
     *     
     */
    public FulfilmentIndicatorTypeCodeType getFulfilmentIndicatorTypeCode() {
        return fulfilmentIndicatorTypeCode;
    }

    /**
     * Imposta il valore della proprietà fulfilmentIndicatorTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfilmentIndicatorTypeCodeType }
     *     
     */
    public void setFulfilmentIndicatorTypeCode(FulfilmentIndicatorTypeCodeType value) {
        this.fulfilmentIndicatorTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà evaluationMethodTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationMethodTypeCodeType }
     *     
     */
    public EvaluationMethodTypeCodeType getEvaluationMethodTypeCode() {
        return evaluationMethodTypeCode;
    }

    /**
     * Imposta il valore della proprietà evaluationMethodTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationMethodTypeCodeType }
     *     
     */
    public void setEvaluationMethodTypeCode(EvaluationMethodTypeCodeType value) {
        this.evaluationMethodTypeCode = value;
    }

    /**
     * Gets the value of the weightingConsiderationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weightingConsiderationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeightingConsiderationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightingConsiderationDescriptionType }
     * 
     * 
     */
    public List<WeightingConsiderationDescriptionType> getWeightingConsiderationDescription() {
        if (weightingConsiderationDescription == null) {
            weightingConsiderationDescription = new ArrayList<WeightingConsiderationDescriptionType>();
        }
        return this.weightingConsiderationDescription;
    }

    /**
     * Gets the value of the subTenderingCriterion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subTenderingCriterion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubTenderingCriterion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderingCriterionType }
     * 
     * 
     */
    public List<TenderingCriterionType> getSubTenderingCriterion() {
        if (subTenderingCriterion == null) {
            subTenderingCriterion = new ArrayList<TenderingCriterionType>();
        }
        return this.subTenderingCriterion;
    }

    /**
     * Gets the value of the legislation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legislation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegislation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegislationType }
     * 
     * 
     */
    public List<LegislationType> getLegislation() {
        if (legislation == null) {
            legislation = new ArrayList<LegislationType>();
        }
        return this.legislation;
    }

    /**
     * Gets the value of the tenderingCriterionPropertyGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderingCriterionPropertyGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderingCriterionPropertyGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderingCriterionPropertyGroupType }
     * 
     * 
     */
    public List<TenderingCriterionPropertyGroupType> getTenderingCriterionPropertyGroup() {
        if (tenderingCriterionPropertyGroup == null) {
            tenderingCriterionPropertyGroup = new ArrayList<TenderingCriterionPropertyGroupType>();
        }
        return this.tenderingCriterionPropertyGroup;
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
            IndexType theIndex;
            theIndex = this.getIndex();
            strategy.appendField(locator, this, "index", buffer, theIndex, (this.index!= null));
        }
        {
            IDType theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID, (this.id!= null));
        }
        {
            CriterionTypeCodeType theCriterionTypeCode;
            theCriterionTypeCode = this.getCriterionTypeCode();
            strategy.appendField(locator, this, "criterionTypeCode", buffer, theCriterionTypeCode, (this.criterionTypeCode!= null));
        }
        {
            NameType theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            CardinalityType theCardinality;
            theCardinality = this.getCardinality();
            strategy.appendField(locator, this, "cardinality", buffer, theCardinality, (this.cardinality!= null));
        }
        {
            WeightNumericType theWeightNumeric;
            theWeightNumeric = this.getWeightNumeric();
            strategy.appendField(locator, this, "weightNumeric", buffer, theWeightNumeric, (this.weightNumeric!= null));
        }
        {
            FulfilmentIndicatorType theFulfilmentIndicator;
            theFulfilmentIndicator = this.getFulfilmentIndicator();
            strategy.appendField(locator, this, "fulfilmentIndicator", buffer, theFulfilmentIndicator, (this.fulfilmentIndicator!= null));
        }
        {
            FulfilmentIndicatorTypeCodeType theFulfilmentIndicatorTypeCode;
            theFulfilmentIndicatorTypeCode = this.getFulfilmentIndicatorTypeCode();
            strategy.appendField(locator, this, "fulfilmentIndicatorTypeCode", buffer, theFulfilmentIndicatorTypeCode, (this.fulfilmentIndicatorTypeCode!= null));
        }
        {
            EvaluationMethodTypeCodeType theEvaluationMethodTypeCode;
            theEvaluationMethodTypeCode = this.getEvaluationMethodTypeCode();
            strategy.appendField(locator, this, "evaluationMethodTypeCode", buffer, theEvaluationMethodTypeCode, (this.evaluationMethodTypeCode!= null));
        }
        {
            List<WeightingConsiderationDescriptionType> theWeightingConsiderationDescription;
            theWeightingConsiderationDescription = (((this.weightingConsiderationDescription!= null)&&(!this.weightingConsiderationDescription.isEmpty()))?this.getWeightingConsiderationDescription():null);
            strategy.appendField(locator, this, "weightingConsiderationDescription", buffer, theWeightingConsiderationDescription, ((this.weightingConsiderationDescription!= null)&&(!this.weightingConsiderationDescription.isEmpty())));
        }
        {
            List<TenderingCriterionType> theSubTenderingCriterion;
            theSubTenderingCriterion = (((this.subTenderingCriterion!= null)&&(!this.subTenderingCriterion.isEmpty()))?this.getSubTenderingCriterion():null);
            strategy.appendField(locator, this, "subTenderingCriterion", buffer, theSubTenderingCriterion, ((this.subTenderingCriterion!= null)&&(!this.subTenderingCriterion.isEmpty())));
        }
        {
            List<LegislationType> theLegislation;
            theLegislation = (((this.legislation!= null)&&(!this.legislation.isEmpty()))?this.getLegislation():null);
            strategy.appendField(locator, this, "legislation", buffer, theLegislation, ((this.legislation!= null)&&(!this.legislation.isEmpty())));
        }
        {
            List<TenderingCriterionPropertyGroupType> theTenderingCriterionPropertyGroup;
            theTenderingCriterionPropertyGroup = (((this.tenderingCriterionPropertyGroup!= null)&&(!this.tenderingCriterionPropertyGroup.isEmpty()))?this.getTenderingCriterionPropertyGroup():null);
            strategy.appendField(locator, this, "tenderingCriterionPropertyGroup", buffer, theTenderingCriterionPropertyGroup, ((this.tenderingCriterionPropertyGroup!= null)&&(!this.tenderingCriterionPropertyGroup.isEmpty())));
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
        final TenderingCriterionType that = ((TenderingCriterionType) object);
        {
            IndexType lhsIndex;
            lhsIndex = this.getIndex();
            IndexType rhsIndex;
            rhsIndex = that.getIndex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "index", lhsIndex), LocatorUtils.property(thatLocator, "index", rhsIndex), lhsIndex, rhsIndex, (this.index!= null), (that.index!= null))) {
                return false;
            }
        }
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
            CriterionTypeCodeType lhsCriterionTypeCode;
            lhsCriterionTypeCode = this.getCriterionTypeCode();
            CriterionTypeCodeType rhsCriterionTypeCode;
            rhsCriterionTypeCode = that.getCriterionTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "criterionTypeCode", lhsCriterionTypeCode), LocatorUtils.property(thatLocator, "criterionTypeCode", rhsCriterionTypeCode), lhsCriterionTypeCode, rhsCriterionTypeCode, (this.criterionTypeCode!= null), (that.criterionTypeCode!= null))) {
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
            List<DescriptionType> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<DescriptionType> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, ((this.description!= null)&&(!this.description.isEmpty())), ((that.description!= null)&&(!that.description.isEmpty())))) {
                return false;
            }
        }
        {
            CardinalityType lhsCardinality;
            lhsCardinality = this.getCardinality();
            CardinalityType rhsCardinality;
            rhsCardinality = that.getCardinality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardinality", lhsCardinality), LocatorUtils.property(thatLocator, "cardinality", rhsCardinality), lhsCardinality, rhsCardinality, (this.cardinality!= null), (that.cardinality!= null))) {
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
            FulfilmentIndicatorType lhsFulfilmentIndicator;
            lhsFulfilmentIndicator = this.getFulfilmentIndicator();
            FulfilmentIndicatorType rhsFulfilmentIndicator;
            rhsFulfilmentIndicator = that.getFulfilmentIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fulfilmentIndicator", lhsFulfilmentIndicator), LocatorUtils.property(thatLocator, "fulfilmentIndicator", rhsFulfilmentIndicator), lhsFulfilmentIndicator, rhsFulfilmentIndicator, (this.fulfilmentIndicator!= null), (that.fulfilmentIndicator!= null))) {
                return false;
            }
        }
        {
            FulfilmentIndicatorTypeCodeType lhsFulfilmentIndicatorTypeCode;
            lhsFulfilmentIndicatorTypeCode = this.getFulfilmentIndicatorTypeCode();
            FulfilmentIndicatorTypeCodeType rhsFulfilmentIndicatorTypeCode;
            rhsFulfilmentIndicatorTypeCode = that.getFulfilmentIndicatorTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fulfilmentIndicatorTypeCode", lhsFulfilmentIndicatorTypeCode), LocatorUtils.property(thatLocator, "fulfilmentIndicatorTypeCode", rhsFulfilmentIndicatorTypeCode), lhsFulfilmentIndicatorTypeCode, rhsFulfilmentIndicatorTypeCode, (this.fulfilmentIndicatorTypeCode!= null), (that.fulfilmentIndicatorTypeCode!= null))) {
                return false;
            }
        }
        {
            EvaluationMethodTypeCodeType lhsEvaluationMethodTypeCode;
            lhsEvaluationMethodTypeCode = this.getEvaluationMethodTypeCode();
            EvaluationMethodTypeCodeType rhsEvaluationMethodTypeCode;
            rhsEvaluationMethodTypeCode = that.getEvaluationMethodTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evaluationMethodTypeCode", lhsEvaluationMethodTypeCode), LocatorUtils.property(thatLocator, "evaluationMethodTypeCode", rhsEvaluationMethodTypeCode), lhsEvaluationMethodTypeCode, rhsEvaluationMethodTypeCode, (this.evaluationMethodTypeCode!= null), (that.evaluationMethodTypeCode!= null))) {
                return false;
            }
        }
        {
            List<WeightingConsiderationDescriptionType> lhsWeightingConsiderationDescription;
            lhsWeightingConsiderationDescription = (((this.weightingConsiderationDescription!= null)&&(!this.weightingConsiderationDescription.isEmpty()))?this.getWeightingConsiderationDescription():null);
            List<WeightingConsiderationDescriptionType> rhsWeightingConsiderationDescription;
            rhsWeightingConsiderationDescription = (((that.weightingConsiderationDescription!= null)&&(!that.weightingConsiderationDescription.isEmpty()))?that.getWeightingConsiderationDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weightingConsiderationDescription", lhsWeightingConsiderationDescription), LocatorUtils.property(thatLocator, "weightingConsiderationDescription", rhsWeightingConsiderationDescription), lhsWeightingConsiderationDescription, rhsWeightingConsiderationDescription, ((this.weightingConsiderationDescription!= null)&&(!this.weightingConsiderationDescription.isEmpty())), ((that.weightingConsiderationDescription!= null)&&(!that.weightingConsiderationDescription.isEmpty())))) {
                return false;
            }
        }
        {
            List<TenderingCriterionType> lhsSubTenderingCriterion;
            lhsSubTenderingCriterion = (((this.subTenderingCriterion!= null)&&(!this.subTenderingCriterion.isEmpty()))?this.getSubTenderingCriterion():null);
            List<TenderingCriterionType> rhsSubTenderingCriterion;
            rhsSubTenderingCriterion = (((that.subTenderingCriterion!= null)&&(!that.subTenderingCriterion.isEmpty()))?that.getSubTenderingCriterion():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subTenderingCriterion", lhsSubTenderingCriterion), LocatorUtils.property(thatLocator, "subTenderingCriterion", rhsSubTenderingCriterion), lhsSubTenderingCriterion, rhsSubTenderingCriterion, ((this.subTenderingCriterion!= null)&&(!this.subTenderingCriterion.isEmpty())), ((that.subTenderingCriterion!= null)&&(!that.subTenderingCriterion.isEmpty())))) {
                return false;
            }
        }
        {
            List<LegislationType> lhsLegislation;
            lhsLegislation = (((this.legislation!= null)&&(!this.legislation.isEmpty()))?this.getLegislation():null);
            List<LegislationType> rhsLegislation;
            rhsLegislation = (((that.legislation!= null)&&(!that.legislation.isEmpty()))?that.getLegislation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legislation", lhsLegislation), LocatorUtils.property(thatLocator, "legislation", rhsLegislation), lhsLegislation, rhsLegislation, ((this.legislation!= null)&&(!this.legislation.isEmpty())), ((that.legislation!= null)&&(!that.legislation.isEmpty())))) {
                return false;
            }
        }
        {
            List<TenderingCriterionPropertyGroupType> lhsTenderingCriterionPropertyGroup;
            lhsTenderingCriterionPropertyGroup = (((this.tenderingCriterionPropertyGroup!= null)&&(!this.tenderingCriterionPropertyGroup.isEmpty()))?this.getTenderingCriterionPropertyGroup():null);
            List<TenderingCriterionPropertyGroupType> rhsTenderingCriterionPropertyGroup;
            rhsTenderingCriterionPropertyGroup = (((that.tenderingCriterionPropertyGroup!= null)&&(!that.tenderingCriterionPropertyGroup.isEmpty()))?that.getTenderingCriterionPropertyGroup():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderingCriterionPropertyGroup", lhsTenderingCriterionPropertyGroup), LocatorUtils.property(thatLocator, "tenderingCriterionPropertyGroup", rhsTenderingCriterionPropertyGroup), lhsTenderingCriterionPropertyGroup, rhsTenderingCriterionPropertyGroup, ((this.tenderingCriterionPropertyGroup!= null)&&(!this.tenderingCriterionPropertyGroup.isEmpty())), ((that.tenderingCriterionPropertyGroup!= null)&&(!that.tenderingCriterionPropertyGroup.isEmpty())))) {
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
            IndexType theIndex;
            theIndex = this.getIndex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "index", theIndex), currentHashCode, theIndex, (this.index!= null));
        }
        {
            IDType theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID, (this.id!= null));
        }
        {
            CriterionTypeCodeType theCriterionTypeCode;
            theCriterionTypeCode = this.getCriterionTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "criterionTypeCode", theCriterionTypeCode), currentHashCode, theCriterionTypeCode, (this.criterionTypeCode!= null));
        }
        {
            NameType theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            CardinalityType theCardinality;
            theCardinality = this.getCardinality();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardinality", theCardinality), currentHashCode, theCardinality, (this.cardinality!= null));
        }
        {
            WeightNumericType theWeightNumeric;
            theWeightNumeric = this.getWeightNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weightNumeric", theWeightNumeric), currentHashCode, theWeightNumeric, (this.weightNumeric!= null));
        }
        {
            FulfilmentIndicatorType theFulfilmentIndicator;
            theFulfilmentIndicator = this.getFulfilmentIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fulfilmentIndicator", theFulfilmentIndicator), currentHashCode, theFulfilmentIndicator, (this.fulfilmentIndicator!= null));
        }
        {
            FulfilmentIndicatorTypeCodeType theFulfilmentIndicatorTypeCode;
            theFulfilmentIndicatorTypeCode = this.getFulfilmentIndicatorTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fulfilmentIndicatorTypeCode", theFulfilmentIndicatorTypeCode), currentHashCode, theFulfilmentIndicatorTypeCode, (this.fulfilmentIndicatorTypeCode!= null));
        }
        {
            EvaluationMethodTypeCodeType theEvaluationMethodTypeCode;
            theEvaluationMethodTypeCode = this.getEvaluationMethodTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evaluationMethodTypeCode", theEvaluationMethodTypeCode), currentHashCode, theEvaluationMethodTypeCode, (this.evaluationMethodTypeCode!= null));
        }
        {
            List<WeightingConsiderationDescriptionType> theWeightingConsiderationDescription;
            theWeightingConsiderationDescription = (((this.weightingConsiderationDescription!= null)&&(!this.weightingConsiderationDescription.isEmpty()))?this.getWeightingConsiderationDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weightingConsiderationDescription", theWeightingConsiderationDescription), currentHashCode, theWeightingConsiderationDescription, ((this.weightingConsiderationDescription!= null)&&(!this.weightingConsiderationDescription.isEmpty())));
        }
        {
            List<TenderingCriterionType> theSubTenderingCriterion;
            theSubTenderingCriterion = (((this.subTenderingCriterion!= null)&&(!this.subTenderingCriterion.isEmpty()))?this.getSubTenderingCriterion():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subTenderingCriterion", theSubTenderingCriterion), currentHashCode, theSubTenderingCriterion, ((this.subTenderingCriterion!= null)&&(!this.subTenderingCriterion.isEmpty())));
        }
        {
            List<LegislationType> theLegislation;
            theLegislation = (((this.legislation!= null)&&(!this.legislation.isEmpty()))?this.getLegislation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legislation", theLegislation), currentHashCode, theLegislation, ((this.legislation!= null)&&(!this.legislation.isEmpty())));
        }
        {
            List<TenderingCriterionPropertyGroupType> theTenderingCriterionPropertyGroup;
            theTenderingCriterionPropertyGroup = (((this.tenderingCriterionPropertyGroup!= null)&&(!this.tenderingCriterionPropertyGroup.isEmpty()))?this.getTenderingCriterionPropertyGroup():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderingCriterionPropertyGroup", theTenderingCriterionPropertyGroup), currentHashCode, theTenderingCriterionPropertyGroup, ((this.tenderingCriterionPropertyGroup!= null)&&(!this.tenderingCriterionPropertyGroup.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
