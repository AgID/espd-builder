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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ImportanceCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ListValueType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TestMethodType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueQualifierType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueType;
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
 * <p>Classe Java per ItemPropertyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ItemPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NameCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TestMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Value" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueQualifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ImportanceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ListValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UsabilityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemPropertyGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RangeDimension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemPropertyRange" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPropertyType", propOrder = {
    "id",
    "name",
    "nameCode",
    "testMethod",
    "value",
    "valueQuantity",
    "valueQualifier",
    "importanceCode",
    "listValue",
    "usabilityPeriod",
    "itemPropertyGroup",
    "rangeDimension",
    "itemPropertyRange"
})
public class ItemPropertyType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected NameType name;
    @XmlElement(name = "NameCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameCodeType nameCode;
    @XmlElement(name = "TestMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TestMethodType testMethod;
    @XmlElement(name = "Value", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValueType value;
    @XmlElement(name = "ValueQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValueQuantityType valueQuantity;
    @XmlElement(name = "ValueQualifier", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ValueQualifierType> valueQualifier;
    @XmlElement(name = "ImportanceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ImportanceCodeType importanceCode;
    @XmlElement(name = "ListValue", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ListValueType> listValue;
    @XmlElement(name = "UsabilityPeriod")
    protected PeriodType usabilityPeriod;
    @XmlElement(name = "ItemPropertyGroup")
    protected List<ItemPropertyGroupType> itemPropertyGroup;
    @XmlElement(name = "RangeDimension")
    protected DimensionType rangeDimension;
    @XmlElement(name = "ItemPropertyRange")
    protected ItemPropertyRangeType itemPropertyRange;

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
     * Recupera il valore della proprietà nameCode.
     * 
     * @return
     *     possible object is
     *     {@link NameCodeType }
     *     
     */
    public NameCodeType getNameCode() {
        return nameCode;
    }

    /**
     * Imposta il valore della proprietà nameCode.
     * 
     * @param value
     *     allowed object is
     *     {@link NameCodeType }
     *     
     */
    public void setNameCode(NameCodeType value) {
        this.nameCode = value;
    }

    /**
     * Recupera il valore della proprietà testMethod.
     * 
     * @return
     *     possible object is
     *     {@link TestMethodType }
     *     
     */
    public TestMethodType getTestMethod() {
        return testMethod;
    }

    /**
     * Imposta il valore della proprietà testMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link TestMethodType }
     *     
     */
    public void setTestMethod(TestMethodType value) {
        this.testMethod = value;
    }

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setValue(ValueType value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà valueQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ValueQuantityType }
     *     
     */
    public ValueQuantityType getValueQuantity() {
        return valueQuantity;
    }

    /**
     * Imposta il valore della proprietà valueQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueQuantityType }
     *     
     */
    public void setValueQuantity(ValueQuantityType value) {
        this.valueQuantity = value;
    }

    /**
     * Gets the value of the valueQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueQualifierType }
     * 
     * 
     */
    public List<ValueQualifierType> getValueQualifier() {
        if (valueQualifier == null) {
            valueQualifier = new ArrayList<ValueQualifierType>();
        }
        return this.valueQualifier;
    }

    /**
     * Recupera il valore della proprietà importanceCode.
     * 
     * @return
     *     possible object is
     *     {@link ImportanceCodeType }
     *     
     */
    public ImportanceCodeType getImportanceCode() {
        return importanceCode;
    }

    /**
     * Imposta il valore della proprietà importanceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportanceCodeType }
     *     
     */
    public void setImportanceCode(ImportanceCodeType value) {
        this.importanceCode = value;
    }

    /**
     * Gets the value of the listValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListValueType }
     * 
     * 
     */
    public List<ListValueType> getListValue() {
        if (listValue == null) {
            listValue = new ArrayList<ListValueType>();
        }
        return this.listValue;
    }

    /**
     * Recupera il valore della proprietà usabilityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getUsabilityPeriod() {
        return usabilityPeriod;
    }

    /**
     * Imposta il valore della proprietà usabilityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setUsabilityPeriod(PeriodType value) {
        this.usabilityPeriod = value;
    }

    /**
     * Gets the value of the itemPropertyGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPropertyGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPropertyGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPropertyGroupType }
     * 
     * 
     */
    public List<ItemPropertyGroupType> getItemPropertyGroup() {
        if (itemPropertyGroup == null) {
            itemPropertyGroup = new ArrayList<ItemPropertyGroupType>();
        }
        return this.itemPropertyGroup;
    }

    /**
     * Recupera il valore della proprietà rangeDimension.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getRangeDimension() {
        return rangeDimension;
    }

    /**
     * Imposta il valore della proprietà rangeDimension.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setRangeDimension(DimensionType value) {
        this.rangeDimension = value;
    }

    /**
     * Recupera il valore della proprietà itemPropertyRange.
     * 
     * @return
     *     possible object is
     *     {@link ItemPropertyRangeType }
     *     
     */
    public ItemPropertyRangeType getItemPropertyRange() {
        return itemPropertyRange;
    }

    /**
     * Imposta il valore della proprietà itemPropertyRange.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPropertyRangeType }
     *     
     */
    public void setItemPropertyRange(ItemPropertyRangeType value) {
        this.itemPropertyRange = value;
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
            NameCodeType theNameCode;
            theNameCode = this.getNameCode();
            strategy.appendField(locator, this, "nameCode", buffer, theNameCode, (this.nameCode!= null));
        }
        {
            TestMethodType theTestMethod;
            theTestMethod = this.getTestMethod();
            strategy.appendField(locator, this, "testMethod", buffer, theTestMethod, (this.testMethod!= null));
        }
        {
            ValueType theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            ValueQuantityType theValueQuantity;
            theValueQuantity = this.getValueQuantity();
            strategy.appendField(locator, this, "valueQuantity", buffer, theValueQuantity, (this.valueQuantity!= null));
        }
        {
            List<ValueQualifierType> theValueQualifier;
            theValueQualifier = (((this.valueQualifier!= null)&&(!this.valueQualifier.isEmpty()))?this.getValueQualifier():null);
            strategy.appendField(locator, this, "valueQualifier", buffer, theValueQualifier, ((this.valueQualifier!= null)&&(!this.valueQualifier.isEmpty())));
        }
        {
            ImportanceCodeType theImportanceCode;
            theImportanceCode = this.getImportanceCode();
            strategy.appendField(locator, this, "importanceCode", buffer, theImportanceCode, (this.importanceCode!= null));
        }
        {
            List<ListValueType> theListValue;
            theListValue = (((this.listValue!= null)&&(!this.listValue.isEmpty()))?this.getListValue():null);
            strategy.appendField(locator, this, "listValue", buffer, theListValue, ((this.listValue!= null)&&(!this.listValue.isEmpty())));
        }
        {
            PeriodType theUsabilityPeriod;
            theUsabilityPeriod = this.getUsabilityPeriod();
            strategy.appendField(locator, this, "usabilityPeriod", buffer, theUsabilityPeriod, (this.usabilityPeriod!= null));
        }
        {
            List<ItemPropertyGroupType> theItemPropertyGroup;
            theItemPropertyGroup = (((this.itemPropertyGroup!= null)&&(!this.itemPropertyGroup.isEmpty()))?this.getItemPropertyGroup():null);
            strategy.appendField(locator, this, "itemPropertyGroup", buffer, theItemPropertyGroup, ((this.itemPropertyGroup!= null)&&(!this.itemPropertyGroup.isEmpty())));
        }
        {
            DimensionType theRangeDimension;
            theRangeDimension = this.getRangeDimension();
            strategy.appendField(locator, this, "rangeDimension", buffer, theRangeDimension, (this.rangeDimension!= null));
        }
        {
            ItemPropertyRangeType theItemPropertyRange;
            theItemPropertyRange = this.getItemPropertyRange();
            strategy.appendField(locator, this, "itemPropertyRange", buffer, theItemPropertyRange, (this.itemPropertyRange!= null));
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
        final ItemPropertyType that = ((ItemPropertyType) object);
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
            NameCodeType lhsNameCode;
            lhsNameCode = this.getNameCode();
            NameCodeType rhsNameCode;
            rhsNameCode = that.getNameCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameCode", lhsNameCode), LocatorUtils.property(thatLocator, "nameCode", rhsNameCode), lhsNameCode, rhsNameCode, (this.nameCode!= null), (that.nameCode!= null))) {
                return false;
            }
        }
        {
            TestMethodType lhsTestMethod;
            lhsTestMethod = this.getTestMethod();
            TestMethodType rhsTestMethod;
            rhsTestMethod = that.getTestMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testMethod", lhsTestMethod), LocatorUtils.property(thatLocator, "testMethod", rhsTestMethod), lhsTestMethod, rhsTestMethod, (this.testMethod!= null), (that.testMethod!= null))) {
                return false;
            }
        }
        {
            ValueType lhsValue;
            lhsValue = this.getValue();
            ValueType rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        {
            ValueQuantityType lhsValueQuantity;
            lhsValueQuantity = this.getValueQuantity();
            ValueQuantityType rhsValueQuantity;
            rhsValueQuantity = that.getValueQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueQuantity", lhsValueQuantity), LocatorUtils.property(thatLocator, "valueQuantity", rhsValueQuantity), lhsValueQuantity, rhsValueQuantity, (this.valueQuantity!= null), (that.valueQuantity!= null))) {
                return false;
            }
        }
        {
            List<ValueQualifierType> lhsValueQualifier;
            lhsValueQualifier = (((this.valueQualifier!= null)&&(!this.valueQualifier.isEmpty()))?this.getValueQualifier():null);
            List<ValueQualifierType> rhsValueQualifier;
            rhsValueQualifier = (((that.valueQualifier!= null)&&(!that.valueQualifier.isEmpty()))?that.getValueQualifier():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueQualifier", lhsValueQualifier), LocatorUtils.property(thatLocator, "valueQualifier", rhsValueQualifier), lhsValueQualifier, rhsValueQualifier, ((this.valueQualifier!= null)&&(!this.valueQualifier.isEmpty())), ((that.valueQualifier!= null)&&(!that.valueQualifier.isEmpty())))) {
                return false;
            }
        }
        {
            ImportanceCodeType lhsImportanceCode;
            lhsImportanceCode = this.getImportanceCode();
            ImportanceCodeType rhsImportanceCode;
            rhsImportanceCode = that.getImportanceCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "importanceCode", lhsImportanceCode), LocatorUtils.property(thatLocator, "importanceCode", rhsImportanceCode), lhsImportanceCode, rhsImportanceCode, (this.importanceCode!= null), (that.importanceCode!= null))) {
                return false;
            }
        }
        {
            List<ListValueType> lhsListValue;
            lhsListValue = (((this.listValue!= null)&&(!this.listValue.isEmpty()))?this.getListValue():null);
            List<ListValueType> rhsListValue;
            rhsListValue = (((that.listValue!= null)&&(!that.listValue.isEmpty()))?that.getListValue():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "listValue", lhsListValue), LocatorUtils.property(thatLocator, "listValue", rhsListValue), lhsListValue, rhsListValue, ((this.listValue!= null)&&(!this.listValue.isEmpty())), ((that.listValue!= null)&&(!that.listValue.isEmpty())))) {
                return false;
            }
        }
        {
            PeriodType lhsUsabilityPeriod;
            lhsUsabilityPeriod = this.getUsabilityPeriod();
            PeriodType rhsUsabilityPeriod;
            rhsUsabilityPeriod = that.getUsabilityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usabilityPeriod", lhsUsabilityPeriod), LocatorUtils.property(thatLocator, "usabilityPeriod", rhsUsabilityPeriod), lhsUsabilityPeriod, rhsUsabilityPeriod, (this.usabilityPeriod!= null), (that.usabilityPeriod!= null))) {
                return false;
            }
        }
        {
            List<ItemPropertyGroupType> lhsItemPropertyGroup;
            lhsItemPropertyGroup = (((this.itemPropertyGroup!= null)&&(!this.itemPropertyGroup.isEmpty()))?this.getItemPropertyGroup():null);
            List<ItemPropertyGroupType> rhsItemPropertyGroup;
            rhsItemPropertyGroup = (((that.itemPropertyGroup!= null)&&(!that.itemPropertyGroup.isEmpty()))?that.getItemPropertyGroup():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemPropertyGroup", lhsItemPropertyGroup), LocatorUtils.property(thatLocator, "itemPropertyGroup", rhsItemPropertyGroup), lhsItemPropertyGroup, rhsItemPropertyGroup, ((this.itemPropertyGroup!= null)&&(!this.itemPropertyGroup.isEmpty())), ((that.itemPropertyGroup!= null)&&(!that.itemPropertyGroup.isEmpty())))) {
                return false;
            }
        }
        {
            DimensionType lhsRangeDimension;
            lhsRangeDimension = this.getRangeDimension();
            DimensionType rhsRangeDimension;
            rhsRangeDimension = that.getRangeDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rangeDimension", lhsRangeDimension), LocatorUtils.property(thatLocator, "rangeDimension", rhsRangeDimension), lhsRangeDimension, rhsRangeDimension, (this.rangeDimension!= null), (that.rangeDimension!= null))) {
                return false;
            }
        }
        {
            ItemPropertyRangeType lhsItemPropertyRange;
            lhsItemPropertyRange = this.getItemPropertyRange();
            ItemPropertyRangeType rhsItemPropertyRange;
            rhsItemPropertyRange = that.getItemPropertyRange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemPropertyRange", lhsItemPropertyRange), LocatorUtils.property(thatLocator, "itemPropertyRange", rhsItemPropertyRange), lhsItemPropertyRange, rhsItemPropertyRange, (this.itemPropertyRange!= null), (that.itemPropertyRange!= null))) {
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
            NameCodeType theNameCode;
            theNameCode = this.getNameCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameCode", theNameCode), currentHashCode, theNameCode, (this.nameCode!= null));
        }
        {
            TestMethodType theTestMethod;
            theTestMethod = this.getTestMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testMethod", theTestMethod), currentHashCode, theTestMethod, (this.testMethod!= null));
        }
        {
            ValueType theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue, (this.value!= null));
        }
        {
            ValueQuantityType theValueQuantity;
            theValueQuantity = this.getValueQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueQuantity", theValueQuantity), currentHashCode, theValueQuantity, (this.valueQuantity!= null));
        }
        {
            List<ValueQualifierType> theValueQualifier;
            theValueQualifier = (((this.valueQualifier!= null)&&(!this.valueQualifier.isEmpty()))?this.getValueQualifier():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueQualifier", theValueQualifier), currentHashCode, theValueQualifier, ((this.valueQualifier!= null)&&(!this.valueQualifier.isEmpty())));
        }
        {
            ImportanceCodeType theImportanceCode;
            theImportanceCode = this.getImportanceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "importanceCode", theImportanceCode), currentHashCode, theImportanceCode, (this.importanceCode!= null));
        }
        {
            List<ListValueType> theListValue;
            theListValue = (((this.listValue!= null)&&(!this.listValue.isEmpty()))?this.getListValue():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "listValue", theListValue), currentHashCode, theListValue, ((this.listValue!= null)&&(!this.listValue.isEmpty())));
        }
        {
            PeriodType theUsabilityPeriod;
            theUsabilityPeriod = this.getUsabilityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usabilityPeriod", theUsabilityPeriod), currentHashCode, theUsabilityPeriod, (this.usabilityPeriod!= null));
        }
        {
            List<ItemPropertyGroupType> theItemPropertyGroup;
            theItemPropertyGroup = (((this.itemPropertyGroup!= null)&&(!this.itemPropertyGroup.isEmpty()))?this.getItemPropertyGroup():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemPropertyGroup", theItemPropertyGroup), currentHashCode, theItemPropertyGroup, ((this.itemPropertyGroup!= null)&&(!this.itemPropertyGroup.isEmpty())));
        }
        {
            DimensionType theRangeDimension;
            theRangeDimension = this.getRangeDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rangeDimension", theRangeDimension), currentHashCode, theRangeDimension, (this.rangeDimension!= null));
        }
        {
            ItemPropertyRangeType theItemPropertyRange;
            theItemPropertyRange = this.getItemPropertyRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemPropertyRange", theItemPropertyRange), currentHashCode, theItemPropertyRange, (this.itemPropertyRange!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
