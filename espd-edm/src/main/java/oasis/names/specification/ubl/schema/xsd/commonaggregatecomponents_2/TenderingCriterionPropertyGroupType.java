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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FulfilmentIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FulfilmentIndicatorTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PropertyGroupTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TypeCodeType;
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
 * <p>Classe Java per TenderingCriterionPropertyGroupType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TenderingCriterionPropertyGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Cardinality" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PropertyGroupTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FulfilmentIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FulfilmentIndicatorTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderingCriterionProperty" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubsidiaryTenderingCriterionPropertyGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderingCriterionPropertyGroupType", propOrder = {
    "id",
    "name",
    "description",
    "cardinality",
    "typeCode",
    "propertyGroupTypeCode",
    "fulfilmentIndicator",
    "fulfilmentIndicatorTypeCode",
    "tenderingCriterionProperty",
    "subsidiaryTenderingCriterionPropertyGroup"
})
public class TenderingCriterionPropertyGroupType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "Cardinality", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CardinalityType cardinality;
    @XmlElement(name = "TypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TypeCodeType typeCode;
    @XmlElement(name = "PropertyGroupTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PropertyGroupTypeCodeType propertyGroupTypeCode;
    @XmlElement(name = "FulfilmentIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FulfilmentIndicatorType fulfilmentIndicator;
    @XmlElement(name = "FulfilmentIndicatorTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FulfilmentIndicatorTypeCodeType fulfilmentIndicatorTypeCode;
    @XmlElement(name = "TenderingCriterionProperty", required = true)
    protected List<TenderingCriterionPropertyType> tenderingCriterionProperty;
    @XmlElement(name = "SubsidiaryTenderingCriterionPropertyGroup")
    protected List<TenderingCriterionPropertyGroupType> subsidiaryTenderingCriterionPropertyGroup;

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
     * Recupera il valore della proprietà typeCode.
     * 
     * @return
     *     possible object is
     *     {@link TypeCodeType }
     *     
     */
    public TypeCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Imposta il valore della proprietà typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCodeType }
     *     
     */
    public void setTypeCode(TypeCodeType value) {
        this.typeCode = value;
    }

    /**
     * Recupera il valore della proprietà propertyGroupTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyGroupTypeCodeType }
     *     
     */
    public PropertyGroupTypeCodeType getPropertyGroupTypeCode() {
        return propertyGroupTypeCode;
    }

    /**
     * Imposta il valore della proprietà propertyGroupTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyGroupTypeCodeType }
     *     
     */
    public void setPropertyGroupTypeCode(PropertyGroupTypeCodeType value) {
        this.propertyGroupTypeCode = value;
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
     * Gets the value of the tenderingCriterionProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderingCriterionProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderingCriterionProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderingCriterionPropertyType }
     * 
     * 
     */
    public List<TenderingCriterionPropertyType> getTenderingCriterionProperty() {
        if (tenderingCriterionProperty == null) {
            tenderingCriterionProperty = new ArrayList<TenderingCriterionPropertyType>();
        }
        return this.tenderingCriterionProperty;
    }

    /**
     * Gets the value of the subsidiaryTenderingCriterionPropertyGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsidiaryTenderingCriterionPropertyGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsidiaryTenderingCriterionPropertyGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderingCriterionPropertyGroupType }
     * 
     * 
     */
    public List<TenderingCriterionPropertyGroupType> getSubsidiaryTenderingCriterionPropertyGroup() {
        if (subsidiaryTenderingCriterionPropertyGroup == null) {
            subsidiaryTenderingCriterionPropertyGroup = new ArrayList<TenderingCriterionPropertyGroupType>();
        }
        return this.subsidiaryTenderingCriterionPropertyGroup;
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
            TypeCodeType theTypeCode;
            theTypeCode = this.getTypeCode();
            strategy.appendField(locator, this, "typeCode", buffer, theTypeCode, (this.typeCode!= null));
        }
        {
            PropertyGroupTypeCodeType thePropertyGroupTypeCode;
            thePropertyGroupTypeCode = this.getPropertyGroupTypeCode();
            strategy.appendField(locator, this, "propertyGroupTypeCode", buffer, thePropertyGroupTypeCode, (this.propertyGroupTypeCode!= null));
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
            List<TenderingCriterionPropertyType> theTenderingCriterionProperty;
            theTenderingCriterionProperty = (((this.tenderingCriterionProperty!= null)&&(!this.tenderingCriterionProperty.isEmpty()))?this.getTenderingCriterionProperty():null);
            strategy.appendField(locator, this, "tenderingCriterionProperty", buffer, theTenderingCriterionProperty, ((this.tenderingCriterionProperty!= null)&&(!this.tenderingCriterionProperty.isEmpty())));
        }
        {
            List<TenderingCriterionPropertyGroupType> theSubsidiaryTenderingCriterionPropertyGroup;
            theSubsidiaryTenderingCriterionPropertyGroup = (((this.subsidiaryTenderingCriterionPropertyGroup!= null)&&(!this.subsidiaryTenderingCriterionPropertyGroup.isEmpty()))?this.getSubsidiaryTenderingCriterionPropertyGroup():null);
            strategy.appendField(locator, this, "subsidiaryTenderingCriterionPropertyGroup", buffer, theSubsidiaryTenderingCriterionPropertyGroup, ((this.subsidiaryTenderingCriterionPropertyGroup!= null)&&(!this.subsidiaryTenderingCriterionPropertyGroup.isEmpty())));
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
        final TenderingCriterionPropertyGroupType that = ((TenderingCriterionPropertyGroupType) object);
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
            TypeCodeType lhsTypeCode;
            lhsTypeCode = this.getTypeCode();
            TypeCodeType rhsTypeCode;
            rhsTypeCode = that.getTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typeCode", lhsTypeCode), LocatorUtils.property(thatLocator, "typeCode", rhsTypeCode), lhsTypeCode, rhsTypeCode, (this.typeCode!= null), (that.typeCode!= null))) {
                return false;
            }
        }
        {
            PropertyGroupTypeCodeType lhsPropertyGroupTypeCode;
            lhsPropertyGroupTypeCode = this.getPropertyGroupTypeCode();
            PropertyGroupTypeCodeType rhsPropertyGroupTypeCode;
            rhsPropertyGroupTypeCode = that.getPropertyGroupTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyGroupTypeCode", lhsPropertyGroupTypeCode), LocatorUtils.property(thatLocator, "propertyGroupTypeCode", rhsPropertyGroupTypeCode), lhsPropertyGroupTypeCode, rhsPropertyGroupTypeCode, (this.propertyGroupTypeCode!= null), (that.propertyGroupTypeCode!= null))) {
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
            List<TenderingCriterionPropertyType> lhsTenderingCriterionProperty;
            lhsTenderingCriterionProperty = (((this.tenderingCriterionProperty!= null)&&(!this.tenderingCriterionProperty.isEmpty()))?this.getTenderingCriterionProperty():null);
            List<TenderingCriterionPropertyType> rhsTenderingCriterionProperty;
            rhsTenderingCriterionProperty = (((that.tenderingCriterionProperty!= null)&&(!that.tenderingCriterionProperty.isEmpty()))?that.getTenderingCriterionProperty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderingCriterionProperty", lhsTenderingCriterionProperty), LocatorUtils.property(thatLocator, "tenderingCriterionProperty", rhsTenderingCriterionProperty), lhsTenderingCriterionProperty, rhsTenderingCriterionProperty, ((this.tenderingCriterionProperty!= null)&&(!this.tenderingCriterionProperty.isEmpty())), ((that.tenderingCriterionProperty!= null)&&(!that.tenderingCriterionProperty.isEmpty())))) {
                return false;
            }
        }
        {
            List<TenderingCriterionPropertyGroupType> lhsSubsidiaryTenderingCriterionPropertyGroup;
            lhsSubsidiaryTenderingCriterionPropertyGroup = (((this.subsidiaryTenderingCriterionPropertyGroup!= null)&&(!this.subsidiaryTenderingCriterionPropertyGroup.isEmpty()))?this.getSubsidiaryTenderingCriterionPropertyGroup():null);
            List<TenderingCriterionPropertyGroupType> rhsSubsidiaryTenderingCriterionPropertyGroup;
            rhsSubsidiaryTenderingCriterionPropertyGroup = (((that.subsidiaryTenderingCriterionPropertyGroup!= null)&&(!that.subsidiaryTenderingCriterionPropertyGroup.isEmpty()))?that.getSubsidiaryTenderingCriterionPropertyGroup():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subsidiaryTenderingCriterionPropertyGroup", lhsSubsidiaryTenderingCriterionPropertyGroup), LocatorUtils.property(thatLocator, "subsidiaryTenderingCriterionPropertyGroup", rhsSubsidiaryTenderingCriterionPropertyGroup), lhsSubsidiaryTenderingCriterionPropertyGroup, rhsSubsidiaryTenderingCriterionPropertyGroup, ((this.subsidiaryTenderingCriterionPropertyGroup!= null)&&(!this.subsidiaryTenderingCriterionPropertyGroup.isEmpty())), ((that.subsidiaryTenderingCriterionPropertyGroup!= null)&&(!that.subsidiaryTenderingCriterionPropertyGroup.isEmpty())))) {
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
            TypeCodeType theTypeCode;
            theTypeCode = this.getTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typeCode", theTypeCode), currentHashCode, theTypeCode, (this.typeCode!= null));
        }
        {
            PropertyGroupTypeCodeType thePropertyGroupTypeCode;
            thePropertyGroupTypeCode = this.getPropertyGroupTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "propertyGroupTypeCode", thePropertyGroupTypeCode), currentHashCode, thePropertyGroupTypeCode, (this.propertyGroupTypeCode!= null));
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
            List<TenderingCriterionPropertyType> theTenderingCriterionProperty;
            theTenderingCriterionProperty = (((this.tenderingCriterionProperty!= null)&&(!this.tenderingCriterionProperty.isEmpty()))?this.getTenderingCriterionProperty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderingCriterionProperty", theTenderingCriterionProperty), currentHashCode, theTenderingCriterionProperty, ((this.tenderingCriterionProperty!= null)&&(!this.tenderingCriterionProperty.isEmpty())));
        }
        {
            List<TenderingCriterionPropertyGroupType> theSubsidiaryTenderingCriterionPropertyGroup;
            theSubsidiaryTenderingCriterionPropertyGroup = (((this.subsidiaryTenderingCriterionPropertyGroup!= null)&&(!this.subsidiaryTenderingCriterionPropertyGroup.isEmpty()))?this.getSubsidiaryTenderingCriterionPropertyGroup():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subsidiaryTenderingCriterionPropertyGroup", theSubsidiaryTenderingCriterionPropertyGroup), currentHashCode, theSubsidiaryTenderingCriterionPropertyGroup, ((this.subsidiaryTenderingCriterionPropertyGroup!= null)&&(!this.subsidiaryTenderingCriterionPropertyGroup.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
