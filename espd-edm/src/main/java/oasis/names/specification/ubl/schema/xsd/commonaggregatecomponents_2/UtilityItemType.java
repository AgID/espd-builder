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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsumptionTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsumptionTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CurrentChargeTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CurrentChargeTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OneTimeChargeTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OneTimeChargeTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PackQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PackSizeNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SubscriberIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SubscriberTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SubscriberTypeType;
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
 * <p>Classe Java per UtilityItemType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UtilityItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubscriberID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubscriberType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubscriberTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackSizeNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CurrentChargeType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CurrentChargeTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OneTimeChargeType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OneTimeChargeTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contract" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityItemType", propOrder = {
    "id",
    "subscriberID",
    "subscriberType",
    "subscriberTypeCode",
    "description",
    "packQuantity",
    "packSizeNumeric",
    "consumptionType",
    "consumptionTypeCode",
    "currentChargeType",
    "currentChargeTypeCode",
    "oneTimeChargeType",
    "oneTimeChargeTypeCode",
    "taxCategory",
    "contract"
})
public class UtilityItemType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "SubscriberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubscriberIDType subscriberID;
    @XmlElement(name = "SubscriberType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubscriberTypeType subscriberType;
    @XmlElement(name = "SubscriberTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubscriberTypeCodeType subscriberTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "PackQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackQuantityType packQuantity;
    @XmlElement(name = "PackSizeNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackSizeNumericType packSizeNumeric;
    @XmlElement(name = "ConsumptionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionTypeType consumptionType;
    @XmlElement(name = "ConsumptionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionTypeCodeType consumptionTypeCode;
    @XmlElement(name = "CurrentChargeType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CurrentChargeTypeType currentChargeType;
    @XmlElement(name = "CurrentChargeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CurrentChargeTypeCodeType currentChargeTypeCode;
    @XmlElement(name = "OneTimeChargeType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OneTimeChargeTypeType oneTimeChargeType;
    @XmlElement(name = "OneTimeChargeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OneTimeChargeTypeCodeType oneTimeChargeTypeCode;
    @XmlElement(name = "TaxCategory")
    protected TaxCategoryType taxCategory;
    @XmlElement(name = "Contract")
    protected ContractType contract;

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
     * Recupera il valore della proprietà subscriberID.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberIDType }
     *     
     */
    public SubscriberIDType getSubscriberID() {
        return subscriberID;
    }

    /**
     * Imposta il valore della proprietà subscriberID.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberIDType }
     *     
     */
    public void setSubscriberID(SubscriberIDType value) {
        this.subscriberID = value;
    }

    /**
     * Recupera il valore della proprietà subscriberType.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberTypeType }
     *     
     */
    public SubscriberTypeType getSubscriberType() {
        return subscriberType;
    }

    /**
     * Imposta il valore della proprietà subscriberType.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberTypeType }
     *     
     */
    public void setSubscriberType(SubscriberTypeType value) {
        this.subscriberType = value;
    }

    /**
     * Recupera il valore della proprietà subscriberTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberTypeCodeType }
     *     
     */
    public SubscriberTypeCodeType getSubscriberTypeCode() {
        return subscriberTypeCode;
    }

    /**
     * Imposta il valore della proprietà subscriberTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberTypeCodeType }
     *     
     */
    public void setSubscriberTypeCode(SubscriberTypeCodeType value) {
        this.subscriberTypeCode = value;
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
     * Recupera il valore della proprietà packQuantity.
     * 
     * @return
     *     possible object is
     *     {@link PackQuantityType }
     *     
     */
    public PackQuantityType getPackQuantity() {
        return packQuantity;
    }

    /**
     * Imposta il valore della proprietà packQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link PackQuantityType }
     *     
     */
    public void setPackQuantity(PackQuantityType value) {
        this.packQuantity = value;
    }

    /**
     * Recupera il valore della proprietà packSizeNumeric.
     * 
     * @return
     *     possible object is
     *     {@link PackSizeNumericType }
     *     
     */
    public PackSizeNumericType getPackSizeNumeric() {
        return packSizeNumeric;
    }

    /**
     * Imposta il valore della proprietà packSizeNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link PackSizeNumericType }
     *     
     */
    public void setPackSizeNumeric(PackSizeNumericType value) {
        this.packSizeNumeric = value;
    }

    /**
     * Recupera il valore della proprietà consumptionType.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionTypeType }
     *     
     */
    public ConsumptionTypeType getConsumptionType() {
        return consumptionType;
    }

    /**
     * Imposta il valore della proprietà consumptionType.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionTypeType }
     *     
     */
    public void setConsumptionType(ConsumptionTypeType value) {
        this.consumptionType = value;
    }

    /**
     * Recupera il valore della proprietà consumptionTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionTypeCodeType }
     *     
     */
    public ConsumptionTypeCodeType getConsumptionTypeCode() {
        return consumptionTypeCode;
    }

    /**
     * Imposta il valore della proprietà consumptionTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionTypeCodeType }
     *     
     */
    public void setConsumptionTypeCode(ConsumptionTypeCodeType value) {
        this.consumptionTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà currentChargeType.
     * 
     * @return
     *     possible object is
     *     {@link CurrentChargeTypeType }
     *     
     */
    public CurrentChargeTypeType getCurrentChargeType() {
        return currentChargeType;
    }

    /**
     * Imposta il valore della proprietà currentChargeType.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentChargeTypeType }
     *     
     */
    public void setCurrentChargeType(CurrentChargeTypeType value) {
        this.currentChargeType = value;
    }

    /**
     * Recupera il valore della proprietà currentChargeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CurrentChargeTypeCodeType }
     *     
     */
    public CurrentChargeTypeCodeType getCurrentChargeTypeCode() {
        return currentChargeTypeCode;
    }

    /**
     * Imposta il valore della proprietà currentChargeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentChargeTypeCodeType }
     *     
     */
    public void setCurrentChargeTypeCode(CurrentChargeTypeCodeType value) {
        this.currentChargeTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà oneTimeChargeType.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeChargeTypeType }
     *     
     */
    public OneTimeChargeTypeType getOneTimeChargeType() {
        return oneTimeChargeType;
    }

    /**
     * Imposta il valore della proprietà oneTimeChargeType.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeChargeTypeType }
     *     
     */
    public void setOneTimeChargeType(OneTimeChargeTypeType value) {
        this.oneTimeChargeType = value;
    }

    /**
     * Recupera il valore della proprietà oneTimeChargeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeChargeTypeCodeType }
     *     
     */
    public OneTimeChargeTypeCodeType getOneTimeChargeTypeCode() {
        return oneTimeChargeTypeCode;
    }

    /**
     * Imposta il valore della proprietà oneTimeChargeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeChargeTypeCodeType }
     *     
     */
    public void setOneTimeChargeTypeCode(OneTimeChargeTypeCodeType value) {
        this.oneTimeChargeTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà taxCategory.
     * 
     * @return
     *     possible object is
     *     {@link TaxCategoryType }
     *     
     */
    public TaxCategoryType getTaxCategory() {
        return taxCategory;
    }

    /**
     * Imposta il valore della proprietà taxCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCategoryType }
     *     
     */
    public void setTaxCategory(TaxCategoryType value) {
        this.taxCategory = value;
    }

    /**
     * Recupera il valore della proprietà contract.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getContract() {
        return contract;
    }

    /**
     * Imposta il valore della proprietà contract.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setContract(ContractType value) {
        this.contract = value;
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
            SubscriberIDType theSubscriberID;
            theSubscriberID = this.getSubscriberID();
            strategy.appendField(locator, this, "subscriberID", buffer, theSubscriberID, (this.subscriberID!= null));
        }
        {
            SubscriberTypeType theSubscriberType;
            theSubscriberType = this.getSubscriberType();
            strategy.appendField(locator, this, "subscriberType", buffer, theSubscriberType, (this.subscriberType!= null));
        }
        {
            SubscriberTypeCodeType theSubscriberTypeCode;
            theSubscriberTypeCode = this.getSubscriberTypeCode();
            strategy.appendField(locator, this, "subscriberTypeCode", buffer, theSubscriberTypeCode, (this.subscriberTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            PackQuantityType thePackQuantity;
            thePackQuantity = this.getPackQuantity();
            strategy.appendField(locator, this, "packQuantity", buffer, thePackQuantity, (this.packQuantity!= null));
        }
        {
            PackSizeNumericType thePackSizeNumeric;
            thePackSizeNumeric = this.getPackSizeNumeric();
            strategy.appendField(locator, this, "packSizeNumeric", buffer, thePackSizeNumeric, (this.packSizeNumeric!= null));
        }
        {
            ConsumptionTypeType theConsumptionType;
            theConsumptionType = this.getConsumptionType();
            strategy.appendField(locator, this, "consumptionType", buffer, theConsumptionType, (this.consumptionType!= null));
        }
        {
            ConsumptionTypeCodeType theConsumptionTypeCode;
            theConsumptionTypeCode = this.getConsumptionTypeCode();
            strategy.appendField(locator, this, "consumptionTypeCode", buffer, theConsumptionTypeCode, (this.consumptionTypeCode!= null));
        }
        {
            CurrentChargeTypeType theCurrentChargeType;
            theCurrentChargeType = this.getCurrentChargeType();
            strategy.appendField(locator, this, "currentChargeType", buffer, theCurrentChargeType, (this.currentChargeType!= null));
        }
        {
            CurrentChargeTypeCodeType theCurrentChargeTypeCode;
            theCurrentChargeTypeCode = this.getCurrentChargeTypeCode();
            strategy.appendField(locator, this, "currentChargeTypeCode", buffer, theCurrentChargeTypeCode, (this.currentChargeTypeCode!= null));
        }
        {
            OneTimeChargeTypeType theOneTimeChargeType;
            theOneTimeChargeType = this.getOneTimeChargeType();
            strategy.appendField(locator, this, "oneTimeChargeType", buffer, theOneTimeChargeType, (this.oneTimeChargeType!= null));
        }
        {
            OneTimeChargeTypeCodeType theOneTimeChargeTypeCode;
            theOneTimeChargeTypeCode = this.getOneTimeChargeTypeCode();
            strategy.appendField(locator, this, "oneTimeChargeTypeCode", buffer, theOneTimeChargeTypeCode, (this.oneTimeChargeTypeCode!= null));
        }
        {
            TaxCategoryType theTaxCategory;
            theTaxCategory = this.getTaxCategory();
            strategy.appendField(locator, this, "taxCategory", buffer, theTaxCategory, (this.taxCategory!= null));
        }
        {
            ContractType theContract;
            theContract = this.getContract();
            strategy.appendField(locator, this, "contract", buffer, theContract, (this.contract!= null));
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
        final UtilityItemType that = ((UtilityItemType) object);
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
            SubscriberIDType lhsSubscriberID;
            lhsSubscriberID = this.getSubscriberID();
            SubscriberIDType rhsSubscriberID;
            rhsSubscriberID = that.getSubscriberID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subscriberID", lhsSubscriberID), LocatorUtils.property(thatLocator, "subscriberID", rhsSubscriberID), lhsSubscriberID, rhsSubscriberID, (this.subscriberID!= null), (that.subscriberID!= null))) {
                return false;
            }
        }
        {
            SubscriberTypeType lhsSubscriberType;
            lhsSubscriberType = this.getSubscriberType();
            SubscriberTypeType rhsSubscriberType;
            rhsSubscriberType = that.getSubscriberType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subscriberType", lhsSubscriberType), LocatorUtils.property(thatLocator, "subscriberType", rhsSubscriberType), lhsSubscriberType, rhsSubscriberType, (this.subscriberType!= null), (that.subscriberType!= null))) {
                return false;
            }
        }
        {
            SubscriberTypeCodeType lhsSubscriberTypeCode;
            lhsSubscriberTypeCode = this.getSubscriberTypeCode();
            SubscriberTypeCodeType rhsSubscriberTypeCode;
            rhsSubscriberTypeCode = that.getSubscriberTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subscriberTypeCode", lhsSubscriberTypeCode), LocatorUtils.property(thatLocator, "subscriberTypeCode", rhsSubscriberTypeCode), lhsSubscriberTypeCode, rhsSubscriberTypeCode, (this.subscriberTypeCode!= null), (that.subscriberTypeCode!= null))) {
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
            PackQuantityType lhsPackQuantity;
            lhsPackQuantity = this.getPackQuantity();
            PackQuantityType rhsPackQuantity;
            rhsPackQuantity = that.getPackQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packQuantity", lhsPackQuantity), LocatorUtils.property(thatLocator, "packQuantity", rhsPackQuantity), lhsPackQuantity, rhsPackQuantity, (this.packQuantity!= null), (that.packQuantity!= null))) {
                return false;
            }
        }
        {
            PackSizeNumericType lhsPackSizeNumeric;
            lhsPackSizeNumeric = this.getPackSizeNumeric();
            PackSizeNumericType rhsPackSizeNumeric;
            rhsPackSizeNumeric = that.getPackSizeNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packSizeNumeric", lhsPackSizeNumeric), LocatorUtils.property(thatLocator, "packSizeNumeric", rhsPackSizeNumeric), lhsPackSizeNumeric, rhsPackSizeNumeric, (this.packSizeNumeric!= null), (that.packSizeNumeric!= null))) {
                return false;
            }
        }
        {
            ConsumptionTypeType lhsConsumptionType;
            lhsConsumptionType = this.getConsumptionType();
            ConsumptionTypeType rhsConsumptionType;
            rhsConsumptionType = that.getConsumptionType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionType", lhsConsumptionType), LocatorUtils.property(thatLocator, "consumptionType", rhsConsumptionType), lhsConsumptionType, rhsConsumptionType, (this.consumptionType!= null), (that.consumptionType!= null))) {
                return false;
            }
        }
        {
            ConsumptionTypeCodeType lhsConsumptionTypeCode;
            lhsConsumptionTypeCode = this.getConsumptionTypeCode();
            ConsumptionTypeCodeType rhsConsumptionTypeCode;
            rhsConsumptionTypeCode = that.getConsumptionTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionTypeCode", lhsConsumptionTypeCode), LocatorUtils.property(thatLocator, "consumptionTypeCode", rhsConsumptionTypeCode), lhsConsumptionTypeCode, rhsConsumptionTypeCode, (this.consumptionTypeCode!= null), (that.consumptionTypeCode!= null))) {
                return false;
            }
        }
        {
            CurrentChargeTypeType lhsCurrentChargeType;
            lhsCurrentChargeType = this.getCurrentChargeType();
            CurrentChargeTypeType rhsCurrentChargeType;
            rhsCurrentChargeType = that.getCurrentChargeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentChargeType", lhsCurrentChargeType), LocatorUtils.property(thatLocator, "currentChargeType", rhsCurrentChargeType), lhsCurrentChargeType, rhsCurrentChargeType, (this.currentChargeType!= null), (that.currentChargeType!= null))) {
                return false;
            }
        }
        {
            CurrentChargeTypeCodeType lhsCurrentChargeTypeCode;
            lhsCurrentChargeTypeCode = this.getCurrentChargeTypeCode();
            CurrentChargeTypeCodeType rhsCurrentChargeTypeCode;
            rhsCurrentChargeTypeCode = that.getCurrentChargeTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentChargeTypeCode", lhsCurrentChargeTypeCode), LocatorUtils.property(thatLocator, "currentChargeTypeCode", rhsCurrentChargeTypeCode), lhsCurrentChargeTypeCode, rhsCurrentChargeTypeCode, (this.currentChargeTypeCode!= null), (that.currentChargeTypeCode!= null))) {
                return false;
            }
        }
        {
            OneTimeChargeTypeType lhsOneTimeChargeType;
            lhsOneTimeChargeType = this.getOneTimeChargeType();
            OneTimeChargeTypeType rhsOneTimeChargeType;
            rhsOneTimeChargeType = that.getOneTimeChargeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oneTimeChargeType", lhsOneTimeChargeType), LocatorUtils.property(thatLocator, "oneTimeChargeType", rhsOneTimeChargeType), lhsOneTimeChargeType, rhsOneTimeChargeType, (this.oneTimeChargeType!= null), (that.oneTimeChargeType!= null))) {
                return false;
            }
        }
        {
            OneTimeChargeTypeCodeType lhsOneTimeChargeTypeCode;
            lhsOneTimeChargeTypeCode = this.getOneTimeChargeTypeCode();
            OneTimeChargeTypeCodeType rhsOneTimeChargeTypeCode;
            rhsOneTimeChargeTypeCode = that.getOneTimeChargeTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oneTimeChargeTypeCode", lhsOneTimeChargeTypeCode), LocatorUtils.property(thatLocator, "oneTimeChargeTypeCode", rhsOneTimeChargeTypeCode), lhsOneTimeChargeTypeCode, rhsOneTimeChargeTypeCode, (this.oneTimeChargeTypeCode!= null), (that.oneTimeChargeTypeCode!= null))) {
                return false;
            }
        }
        {
            TaxCategoryType lhsTaxCategory;
            lhsTaxCategory = this.getTaxCategory();
            TaxCategoryType rhsTaxCategory;
            rhsTaxCategory = that.getTaxCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxCategory", lhsTaxCategory), LocatorUtils.property(thatLocator, "taxCategory", rhsTaxCategory), lhsTaxCategory, rhsTaxCategory, (this.taxCategory!= null), (that.taxCategory!= null))) {
                return false;
            }
        }
        {
            ContractType lhsContract;
            lhsContract = this.getContract();
            ContractType rhsContract;
            rhsContract = that.getContract();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contract", lhsContract), LocatorUtils.property(thatLocator, "contract", rhsContract), lhsContract, rhsContract, (this.contract!= null), (that.contract!= null))) {
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
            SubscriberIDType theSubscriberID;
            theSubscriberID = this.getSubscriberID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subscriberID", theSubscriberID), currentHashCode, theSubscriberID, (this.subscriberID!= null));
        }
        {
            SubscriberTypeType theSubscriberType;
            theSubscriberType = this.getSubscriberType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subscriberType", theSubscriberType), currentHashCode, theSubscriberType, (this.subscriberType!= null));
        }
        {
            SubscriberTypeCodeType theSubscriberTypeCode;
            theSubscriberTypeCode = this.getSubscriberTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subscriberTypeCode", theSubscriberTypeCode), currentHashCode, theSubscriberTypeCode, (this.subscriberTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            PackQuantityType thePackQuantity;
            thePackQuantity = this.getPackQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packQuantity", thePackQuantity), currentHashCode, thePackQuantity, (this.packQuantity!= null));
        }
        {
            PackSizeNumericType thePackSizeNumeric;
            thePackSizeNumeric = this.getPackSizeNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packSizeNumeric", thePackSizeNumeric), currentHashCode, thePackSizeNumeric, (this.packSizeNumeric!= null));
        }
        {
            ConsumptionTypeType theConsumptionType;
            theConsumptionType = this.getConsumptionType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionType", theConsumptionType), currentHashCode, theConsumptionType, (this.consumptionType!= null));
        }
        {
            ConsumptionTypeCodeType theConsumptionTypeCode;
            theConsumptionTypeCode = this.getConsumptionTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionTypeCode", theConsumptionTypeCode), currentHashCode, theConsumptionTypeCode, (this.consumptionTypeCode!= null));
        }
        {
            CurrentChargeTypeType theCurrentChargeType;
            theCurrentChargeType = this.getCurrentChargeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentChargeType", theCurrentChargeType), currentHashCode, theCurrentChargeType, (this.currentChargeType!= null));
        }
        {
            CurrentChargeTypeCodeType theCurrentChargeTypeCode;
            theCurrentChargeTypeCode = this.getCurrentChargeTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentChargeTypeCode", theCurrentChargeTypeCode), currentHashCode, theCurrentChargeTypeCode, (this.currentChargeTypeCode!= null));
        }
        {
            OneTimeChargeTypeType theOneTimeChargeType;
            theOneTimeChargeType = this.getOneTimeChargeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oneTimeChargeType", theOneTimeChargeType), currentHashCode, theOneTimeChargeType, (this.oneTimeChargeType!= null));
        }
        {
            OneTimeChargeTypeCodeType theOneTimeChargeTypeCode;
            theOneTimeChargeTypeCode = this.getOneTimeChargeTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oneTimeChargeTypeCode", theOneTimeChargeTypeCode), currentHashCode, theOneTimeChargeTypeCode, (this.oneTimeChargeTypeCode!= null));
        }
        {
            TaxCategoryType theTaxCategory;
            theTaxCategory = this.getTaxCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxCategory", theTaxCategory), currentHashCode, theTaxCategory, (this.taxCategory!= null));
        }
        {
            ContractType theContract;
            theContract = this.getContract();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contract", theContract), currentHashCode, theContract, (this.contract!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
