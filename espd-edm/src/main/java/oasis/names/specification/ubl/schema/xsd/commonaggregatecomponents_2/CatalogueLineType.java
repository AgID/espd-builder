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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ContentUnitQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ContractSubdivisionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LifeCycleStatusCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumOrderQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumOrderQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OrderQuantityIncrementNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OrderableIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OrderableUnitType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PackLevelCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WarrantyInformationType;
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
 * <p>Classe Java per CatalogueLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CatalogueLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContractSubdivision" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderableIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderableUnit" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContentUnitQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderQuantityIncrementNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumOrderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumOrderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WarrantyInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractorCustomerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerSupplierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LineValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemComparison" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ComponentRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AccessoryRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReplacementRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ComplementaryRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReplacedRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredItemLocationQuantity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}KeywordItemProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CallForTendersLineReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CallForTendersDocumentReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueLineType", propOrder = {
    "id",
    "actionCode",
    "lifeCycleStatusCode",
    "contractSubdivision",
    "note",
    "orderableIndicator",
    "orderableUnit",
    "contentUnitQuantity",
    "orderQuantityIncrementNumeric",
    "minimumOrderQuantity",
    "maximumOrderQuantity",
    "warrantyInformation",
    "packLevelCode",
    "contractorCustomerParty",
    "sellerSupplierParty",
    "warrantyParty",
    "warrantyValidityPeriod",
    "lineValidityPeriod",
    "itemComparison",
    "componentRelatedItem",
    "accessoryRelatedItem",
    "requiredRelatedItem",
    "replacementRelatedItem",
    "complementaryRelatedItem",
    "replacedRelatedItem",
    "requiredItemLocationQuantity",
    "documentReference",
    "item",
    "keywordItemProperty",
    "callForTendersLineReference",
    "callForTendersDocumentReference"
})
public class CatalogueLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "ActionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActionCodeType actionCode;
    @XmlElement(name = "LifeCycleStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LifeCycleStatusCodeType lifeCycleStatusCode;
    @XmlElement(name = "ContractSubdivision", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ContractSubdivisionType contractSubdivision;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "OrderableIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OrderableIndicatorType orderableIndicator;
    @XmlElement(name = "OrderableUnit", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OrderableUnitType orderableUnit;
    @XmlElement(name = "ContentUnitQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ContentUnitQuantityType contentUnitQuantity;
    @XmlElement(name = "OrderQuantityIncrementNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OrderQuantityIncrementNumericType orderQuantityIncrementNumeric;
    @XmlElement(name = "MinimumOrderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumOrderQuantityType minimumOrderQuantity;
    @XmlElement(name = "MaximumOrderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumOrderQuantityType maximumOrderQuantity;
    @XmlElement(name = "WarrantyInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<WarrantyInformationType> warrantyInformation;
    @XmlElement(name = "PackLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackLevelCodeType packLevelCode;
    @XmlElement(name = "ContractorCustomerParty")
    protected CustomerPartyType contractorCustomerParty;
    @XmlElement(name = "SellerSupplierParty")
    protected SupplierPartyType sellerSupplierParty;
    @XmlElement(name = "WarrantyParty")
    protected PartyType warrantyParty;
    @XmlElement(name = "WarrantyValidityPeriod")
    protected PeriodType warrantyValidityPeriod;
    @XmlElement(name = "LineValidityPeriod")
    protected PeriodType lineValidityPeriod;
    @XmlElement(name = "ItemComparison")
    protected List<ItemComparisonType> itemComparison;
    @XmlElement(name = "ComponentRelatedItem")
    protected List<RelatedItemType> componentRelatedItem;
    @XmlElement(name = "AccessoryRelatedItem")
    protected List<RelatedItemType> accessoryRelatedItem;
    @XmlElement(name = "RequiredRelatedItem")
    protected List<RelatedItemType> requiredRelatedItem;
    @XmlElement(name = "ReplacementRelatedItem")
    protected List<RelatedItemType> replacementRelatedItem;
    @XmlElement(name = "ComplementaryRelatedItem")
    protected List<RelatedItemType> complementaryRelatedItem;
    @XmlElement(name = "ReplacedRelatedItem")
    protected List<RelatedItemType> replacedRelatedItem;
    @XmlElement(name = "RequiredItemLocationQuantity")
    protected List<ItemLocationQuantityType> requiredItemLocationQuantity;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "Item", required = true)
    protected ItemType item;
    @XmlElement(name = "KeywordItemProperty")
    protected List<ItemPropertyType> keywordItemProperty;
    @XmlElement(name = "CallForTendersLineReference")
    protected LineReferenceType callForTendersLineReference;
    @XmlElement(name = "CallForTendersDocumentReference")
    protected DocumentReferenceType callForTendersDocumentReference;

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
     * Recupera il valore della proprietà actionCode.
     * 
     * @return
     *     possible object is
     *     {@link ActionCodeType }
     *     
     */
    public ActionCodeType getActionCode() {
        return actionCode;
    }

    /**
     * Imposta il valore della proprietà actionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCodeType }
     *     
     */
    public void setActionCode(ActionCodeType value) {
        this.actionCode = value;
    }

    /**
     * Recupera il valore della proprietà lifeCycleStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleStatusCodeType }
     *     
     */
    public LifeCycleStatusCodeType getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * Imposta il valore della proprietà lifeCycleStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleStatusCodeType }
     *     
     */
    public void setLifeCycleStatusCode(LifeCycleStatusCodeType value) {
        this.lifeCycleStatusCode = value;
    }

    /**
     * Recupera il valore della proprietà contractSubdivision.
     * 
     * @return
     *     possible object is
     *     {@link ContractSubdivisionType }
     *     
     */
    public ContractSubdivisionType getContractSubdivision() {
        return contractSubdivision;
    }

    /**
     * Imposta il valore della proprietà contractSubdivision.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSubdivisionType }
     *     
     */
    public void setContractSubdivision(ContractSubdivisionType value) {
        this.contractSubdivision = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Recupera il valore della proprietà orderableIndicator.
     * 
     * @return
     *     possible object is
     *     {@link OrderableIndicatorType }
     *     
     */
    public OrderableIndicatorType getOrderableIndicator() {
        return orderableIndicator;
    }

    /**
     * Imposta il valore della proprietà orderableIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderableIndicatorType }
     *     
     */
    public void setOrderableIndicator(OrderableIndicatorType value) {
        this.orderableIndicator = value;
    }

    /**
     * Recupera il valore della proprietà orderableUnit.
     * 
     * @return
     *     possible object is
     *     {@link OrderableUnitType }
     *     
     */
    public OrderableUnitType getOrderableUnit() {
        return orderableUnit;
    }

    /**
     * Imposta il valore della proprietà orderableUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderableUnitType }
     *     
     */
    public void setOrderableUnit(OrderableUnitType value) {
        this.orderableUnit = value;
    }

    /**
     * Recupera il valore della proprietà contentUnitQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ContentUnitQuantityType }
     *     
     */
    public ContentUnitQuantityType getContentUnitQuantity() {
        return contentUnitQuantity;
    }

    /**
     * Imposta il valore della proprietà contentUnitQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentUnitQuantityType }
     *     
     */
    public void setContentUnitQuantity(ContentUnitQuantityType value) {
        this.contentUnitQuantity = value;
    }

    /**
     * Recupera il valore della proprietà orderQuantityIncrementNumeric.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantityIncrementNumericType }
     *     
     */
    public OrderQuantityIncrementNumericType getOrderQuantityIncrementNumeric() {
        return orderQuantityIncrementNumeric;
    }

    /**
     * Imposta il valore della proprietà orderQuantityIncrementNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantityIncrementNumericType }
     *     
     */
    public void setOrderQuantityIncrementNumeric(OrderQuantityIncrementNumericType value) {
        this.orderQuantityIncrementNumeric = value;
    }

    /**
     * Recupera il valore della proprietà minimumOrderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MinimumOrderQuantityType }
     *     
     */
    public MinimumOrderQuantityType getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    /**
     * Imposta il valore della proprietà minimumOrderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumOrderQuantityType }
     *     
     */
    public void setMinimumOrderQuantity(MinimumOrderQuantityType value) {
        this.minimumOrderQuantity = value;
    }

    /**
     * Recupera il valore della proprietà maximumOrderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MaximumOrderQuantityType }
     *     
     */
    public MaximumOrderQuantityType getMaximumOrderQuantity() {
        return maximumOrderQuantity;
    }

    /**
     * Imposta il valore della proprietà maximumOrderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumOrderQuantityType }
     *     
     */
    public void setMaximumOrderQuantity(MaximumOrderQuantityType value) {
        this.maximumOrderQuantity = value;
    }

    /**
     * Gets the value of the warrantyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warrantyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrantyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarrantyInformationType }
     * 
     * 
     */
    public List<WarrantyInformationType> getWarrantyInformation() {
        if (warrantyInformation == null) {
            warrantyInformation = new ArrayList<WarrantyInformationType>();
        }
        return this.warrantyInformation;
    }

    /**
     * Recupera il valore della proprietà packLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link PackLevelCodeType }
     *     
     */
    public PackLevelCodeType getPackLevelCode() {
        return packLevelCode;
    }

    /**
     * Imposta il valore della proprietà packLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PackLevelCodeType }
     *     
     */
    public void setPackLevelCode(PackLevelCodeType value) {
        this.packLevelCode = value;
    }

    /**
     * Recupera il valore della proprietà contractorCustomerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getContractorCustomerParty() {
        return contractorCustomerParty;
    }

    /**
     * Imposta il valore della proprietà contractorCustomerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setContractorCustomerParty(CustomerPartyType value) {
        this.contractorCustomerParty = value;
    }

    /**
     * Recupera il valore della proprietà sellerSupplierParty.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getSellerSupplierParty() {
        return sellerSupplierParty;
    }

    /**
     * Imposta il valore della proprietà sellerSupplierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setSellerSupplierParty(SupplierPartyType value) {
        this.sellerSupplierParty = value;
    }

    /**
     * Recupera il valore della proprietà warrantyParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getWarrantyParty() {
        return warrantyParty;
    }

    /**
     * Imposta il valore della proprietà warrantyParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setWarrantyParty(PartyType value) {
        this.warrantyParty = value;
    }

    /**
     * Recupera il valore della proprietà warrantyValidityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getWarrantyValidityPeriod() {
        return warrantyValidityPeriod;
    }

    /**
     * Imposta il valore della proprietà warrantyValidityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setWarrantyValidityPeriod(PeriodType value) {
        this.warrantyValidityPeriod = value;
    }

    /**
     * Recupera il valore della proprietà lineValidityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getLineValidityPeriod() {
        return lineValidityPeriod;
    }

    /**
     * Imposta il valore della proprietà lineValidityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setLineValidityPeriod(PeriodType value) {
        this.lineValidityPeriod = value;
    }

    /**
     * Gets the value of the itemComparison property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemComparison property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemComparison().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemComparisonType }
     * 
     * 
     */
    public List<ItemComparisonType> getItemComparison() {
        if (itemComparison == null) {
            itemComparison = new ArrayList<ItemComparisonType>();
        }
        return this.itemComparison;
    }

    /**
     * Gets the value of the componentRelatedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentRelatedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentRelatedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getComponentRelatedItem() {
        if (componentRelatedItem == null) {
            componentRelatedItem = new ArrayList<RelatedItemType>();
        }
        return this.componentRelatedItem;
    }

    /**
     * Gets the value of the accessoryRelatedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessoryRelatedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessoryRelatedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getAccessoryRelatedItem() {
        if (accessoryRelatedItem == null) {
            accessoryRelatedItem = new ArrayList<RelatedItemType>();
        }
        return this.accessoryRelatedItem;
    }

    /**
     * Gets the value of the requiredRelatedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredRelatedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredRelatedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getRequiredRelatedItem() {
        if (requiredRelatedItem == null) {
            requiredRelatedItem = new ArrayList<RelatedItemType>();
        }
        return this.requiredRelatedItem;
    }

    /**
     * Gets the value of the replacementRelatedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replacementRelatedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplacementRelatedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getReplacementRelatedItem() {
        if (replacementRelatedItem == null) {
            replacementRelatedItem = new ArrayList<RelatedItemType>();
        }
        return this.replacementRelatedItem;
    }

    /**
     * Gets the value of the complementaryRelatedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complementaryRelatedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplementaryRelatedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getComplementaryRelatedItem() {
        if (complementaryRelatedItem == null) {
            complementaryRelatedItem = new ArrayList<RelatedItemType>();
        }
        return this.complementaryRelatedItem;
    }

    /**
     * Gets the value of the replacedRelatedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replacedRelatedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplacedRelatedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getReplacedRelatedItem() {
        if (replacedRelatedItem == null) {
            replacedRelatedItem = new ArrayList<RelatedItemType>();
        }
        return this.replacedRelatedItem;
    }

    /**
     * Gets the value of the requiredItemLocationQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredItemLocationQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredItemLocationQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemLocationQuantityType }
     * 
     * 
     */
    public List<ItemLocationQuantityType> getRequiredItemLocationQuantity() {
        if (requiredItemLocationQuantity == null) {
            requiredItemLocationQuantity = new ArrayList<ItemLocationQuantityType>();
        }
        return this.requiredItemLocationQuantity;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReference;
    }

    /**
     * Recupera il valore della proprietà item.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Imposta il valore della proprietà item.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the keywordItemProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordItemProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordItemProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPropertyType }
     * 
     * 
     */
    public List<ItemPropertyType> getKeywordItemProperty() {
        if (keywordItemProperty == null) {
            keywordItemProperty = new ArrayList<ItemPropertyType>();
        }
        return this.keywordItemProperty;
    }

    /**
     * Recupera il valore della proprietà callForTendersLineReference.
     * 
     * @return
     *     possible object is
     *     {@link LineReferenceType }
     *     
     */
    public LineReferenceType getCallForTendersLineReference() {
        return callForTendersLineReference;
    }

    /**
     * Imposta il valore della proprietà callForTendersLineReference.
     * 
     * @param value
     *     allowed object is
     *     {@link LineReferenceType }
     *     
     */
    public void setCallForTendersLineReference(LineReferenceType value) {
        this.callForTendersLineReference = value;
    }

    /**
     * Recupera il valore della proprietà callForTendersDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getCallForTendersDocumentReference() {
        return callForTendersDocumentReference;
    }

    /**
     * Imposta il valore della proprietà callForTendersDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setCallForTendersDocumentReference(DocumentReferenceType value) {
        this.callForTendersDocumentReference = value;
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
            ActionCodeType theActionCode;
            theActionCode = this.getActionCode();
            strategy.appendField(locator, this, "actionCode", buffer, theActionCode, (this.actionCode!= null));
        }
        {
            LifeCycleStatusCodeType theLifeCycleStatusCode;
            theLifeCycleStatusCode = this.getLifeCycleStatusCode();
            strategy.appendField(locator, this, "lifeCycleStatusCode", buffer, theLifeCycleStatusCode, (this.lifeCycleStatusCode!= null));
        }
        {
            ContractSubdivisionType theContractSubdivision;
            theContractSubdivision = this.getContractSubdivision();
            strategy.appendField(locator, this, "contractSubdivision", buffer, theContractSubdivision, (this.contractSubdivision!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            strategy.appendField(locator, this, "note", buffer, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            OrderableIndicatorType theOrderableIndicator;
            theOrderableIndicator = this.getOrderableIndicator();
            strategy.appendField(locator, this, "orderableIndicator", buffer, theOrderableIndicator, (this.orderableIndicator!= null));
        }
        {
            OrderableUnitType theOrderableUnit;
            theOrderableUnit = this.getOrderableUnit();
            strategy.appendField(locator, this, "orderableUnit", buffer, theOrderableUnit, (this.orderableUnit!= null));
        }
        {
            ContentUnitQuantityType theContentUnitQuantity;
            theContentUnitQuantity = this.getContentUnitQuantity();
            strategy.appendField(locator, this, "contentUnitQuantity", buffer, theContentUnitQuantity, (this.contentUnitQuantity!= null));
        }
        {
            OrderQuantityIncrementNumericType theOrderQuantityIncrementNumeric;
            theOrderQuantityIncrementNumeric = this.getOrderQuantityIncrementNumeric();
            strategy.appendField(locator, this, "orderQuantityIncrementNumeric", buffer, theOrderQuantityIncrementNumeric, (this.orderQuantityIncrementNumeric!= null));
        }
        {
            MinimumOrderQuantityType theMinimumOrderQuantity;
            theMinimumOrderQuantity = this.getMinimumOrderQuantity();
            strategy.appendField(locator, this, "minimumOrderQuantity", buffer, theMinimumOrderQuantity, (this.minimumOrderQuantity!= null));
        }
        {
            MaximumOrderQuantityType theMaximumOrderQuantity;
            theMaximumOrderQuantity = this.getMaximumOrderQuantity();
            strategy.appendField(locator, this, "maximumOrderQuantity", buffer, theMaximumOrderQuantity, (this.maximumOrderQuantity!= null));
        }
        {
            List<WarrantyInformationType> theWarrantyInformation;
            theWarrantyInformation = (((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty()))?this.getWarrantyInformation():null);
            strategy.appendField(locator, this, "warrantyInformation", buffer, theWarrantyInformation, ((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty())));
        }
        {
            PackLevelCodeType thePackLevelCode;
            thePackLevelCode = this.getPackLevelCode();
            strategy.appendField(locator, this, "packLevelCode", buffer, thePackLevelCode, (this.packLevelCode!= null));
        }
        {
            CustomerPartyType theContractorCustomerParty;
            theContractorCustomerParty = this.getContractorCustomerParty();
            strategy.appendField(locator, this, "contractorCustomerParty", buffer, theContractorCustomerParty, (this.contractorCustomerParty!= null));
        }
        {
            SupplierPartyType theSellerSupplierParty;
            theSellerSupplierParty = this.getSellerSupplierParty();
            strategy.appendField(locator, this, "sellerSupplierParty", buffer, theSellerSupplierParty, (this.sellerSupplierParty!= null));
        }
        {
            PartyType theWarrantyParty;
            theWarrantyParty = this.getWarrantyParty();
            strategy.appendField(locator, this, "warrantyParty", buffer, theWarrantyParty, (this.warrantyParty!= null));
        }
        {
            PeriodType theWarrantyValidityPeriod;
            theWarrantyValidityPeriod = this.getWarrantyValidityPeriod();
            strategy.appendField(locator, this, "warrantyValidityPeriod", buffer, theWarrantyValidityPeriod, (this.warrantyValidityPeriod!= null));
        }
        {
            PeriodType theLineValidityPeriod;
            theLineValidityPeriod = this.getLineValidityPeriod();
            strategy.appendField(locator, this, "lineValidityPeriod", buffer, theLineValidityPeriod, (this.lineValidityPeriod!= null));
        }
        {
            List<ItemComparisonType> theItemComparison;
            theItemComparison = (((this.itemComparison!= null)&&(!this.itemComparison.isEmpty()))?this.getItemComparison():null);
            strategy.appendField(locator, this, "itemComparison", buffer, theItemComparison, ((this.itemComparison!= null)&&(!this.itemComparison.isEmpty())));
        }
        {
            List<RelatedItemType> theComponentRelatedItem;
            theComponentRelatedItem = (((this.componentRelatedItem!= null)&&(!this.componentRelatedItem.isEmpty()))?this.getComponentRelatedItem():null);
            strategy.appendField(locator, this, "componentRelatedItem", buffer, theComponentRelatedItem, ((this.componentRelatedItem!= null)&&(!this.componentRelatedItem.isEmpty())));
        }
        {
            List<RelatedItemType> theAccessoryRelatedItem;
            theAccessoryRelatedItem = (((this.accessoryRelatedItem!= null)&&(!this.accessoryRelatedItem.isEmpty()))?this.getAccessoryRelatedItem():null);
            strategy.appendField(locator, this, "accessoryRelatedItem", buffer, theAccessoryRelatedItem, ((this.accessoryRelatedItem!= null)&&(!this.accessoryRelatedItem.isEmpty())));
        }
        {
            List<RelatedItemType> theRequiredRelatedItem;
            theRequiredRelatedItem = (((this.requiredRelatedItem!= null)&&(!this.requiredRelatedItem.isEmpty()))?this.getRequiredRelatedItem():null);
            strategy.appendField(locator, this, "requiredRelatedItem", buffer, theRequiredRelatedItem, ((this.requiredRelatedItem!= null)&&(!this.requiredRelatedItem.isEmpty())));
        }
        {
            List<RelatedItemType> theReplacementRelatedItem;
            theReplacementRelatedItem = (((this.replacementRelatedItem!= null)&&(!this.replacementRelatedItem.isEmpty()))?this.getReplacementRelatedItem():null);
            strategy.appendField(locator, this, "replacementRelatedItem", buffer, theReplacementRelatedItem, ((this.replacementRelatedItem!= null)&&(!this.replacementRelatedItem.isEmpty())));
        }
        {
            List<RelatedItemType> theComplementaryRelatedItem;
            theComplementaryRelatedItem = (((this.complementaryRelatedItem!= null)&&(!this.complementaryRelatedItem.isEmpty()))?this.getComplementaryRelatedItem():null);
            strategy.appendField(locator, this, "complementaryRelatedItem", buffer, theComplementaryRelatedItem, ((this.complementaryRelatedItem!= null)&&(!this.complementaryRelatedItem.isEmpty())));
        }
        {
            List<RelatedItemType> theReplacedRelatedItem;
            theReplacedRelatedItem = (((this.replacedRelatedItem!= null)&&(!this.replacedRelatedItem.isEmpty()))?this.getReplacedRelatedItem():null);
            strategy.appendField(locator, this, "replacedRelatedItem", buffer, theReplacedRelatedItem, ((this.replacedRelatedItem!= null)&&(!this.replacedRelatedItem.isEmpty())));
        }
        {
            List<ItemLocationQuantityType> theRequiredItemLocationQuantity;
            theRequiredItemLocationQuantity = (((this.requiredItemLocationQuantity!= null)&&(!this.requiredItemLocationQuantity.isEmpty()))?this.getRequiredItemLocationQuantity():null);
            strategy.appendField(locator, this, "requiredItemLocationQuantity", buffer, theRequiredItemLocationQuantity, ((this.requiredItemLocationQuantity!= null)&&(!this.requiredItemLocationQuantity.isEmpty())));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            strategy.appendField(locator, this, "documentReference", buffer, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            strategy.appendField(locator, this, "item", buffer, theItem, (this.item!= null));
        }
        {
            List<ItemPropertyType> theKeywordItemProperty;
            theKeywordItemProperty = (((this.keywordItemProperty!= null)&&(!this.keywordItemProperty.isEmpty()))?this.getKeywordItemProperty():null);
            strategy.appendField(locator, this, "keywordItemProperty", buffer, theKeywordItemProperty, ((this.keywordItemProperty!= null)&&(!this.keywordItemProperty.isEmpty())));
        }
        {
            LineReferenceType theCallForTendersLineReference;
            theCallForTendersLineReference = this.getCallForTendersLineReference();
            strategy.appendField(locator, this, "callForTendersLineReference", buffer, theCallForTendersLineReference, (this.callForTendersLineReference!= null));
        }
        {
            DocumentReferenceType theCallForTendersDocumentReference;
            theCallForTendersDocumentReference = this.getCallForTendersDocumentReference();
            strategy.appendField(locator, this, "callForTendersDocumentReference", buffer, theCallForTendersDocumentReference, (this.callForTendersDocumentReference!= null));
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
        final CatalogueLineType that = ((CatalogueLineType) object);
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
            ActionCodeType lhsActionCode;
            lhsActionCode = this.getActionCode();
            ActionCodeType rhsActionCode;
            rhsActionCode = that.getActionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actionCode", lhsActionCode), LocatorUtils.property(thatLocator, "actionCode", rhsActionCode), lhsActionCode, rhsActionCode, (this.actionCode!= null), (that.actionCode!= null))) {
                return false;
            }
        }
        {
            LifeCycleStatusCodeType lhsLifeCycleStatusCode;
            lhsLifeCycleStatusCode = this.getLifeCycleStatusCode();
            LifeCycleStatusCodeType rhsLifeCycleStatusCode;
            rhsLifeCycleStatusCode = that.getLifeCycleStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lifeCycleStatusCode", lhsLifeCycleStatusCode), LocatorUtils.property(thatLocator, "lifeCycleStatusCode", rhsLifeCycleStatusCode), lhsLifeCycleStatusCode, rhsLifeCycleStatusCode, (this.lifeCycleStatusCode!= null), (that.lifeCycleStatusCode!= null))) {
                return false;
            }
        }
        {
            ContractSubdivisionType lhsContractSubdivision;
            lhsContractSubdivision = this.getContractSubdivision();
            ContractSubdivisionType rhsContractSubdivision;
            rhsContractSubdivision = that.getContractSubdivision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractSubdivision", lhsContractSubdivision), LocatorUtils.property(thatLocator, "contractSubdivision", rhsContractSubdivision), lhsContractSubdivision, rhsContractSubdivision, (this.contractSubdivision!= null), (that.contractSubdivision!= null))) {
                return false;
            }
        }
        {
            List<NoteType> lhsNote;
            lhsNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            List<NoteType> rhsNote;
            rhsNote = (((that.note!= null)&&(!that.note.isEmpty()))?that.getNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote, ((this.note!= null)&&(!this.note.isEmpty())), ((that.note!= null)&&(!that.note.isEmpty())))) {
                return false;
            }
        }
        {
            OrderableIndicatorType lhsOrderableIndicator;
            lhsOrderableIndicator = this.getOrderableIndicator();
            OrderableIndicatorType rhsOrderableIndicator;
            rhsOrderableIndicator = that.getOrderableIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderableIndicator", lhsOrderableIndicator), LocatorUtils.property(thatLocator, "orderableIndicator", rhsOrderableIndicator), lhsOrderableIndicator, rhsOrderableIndicator, (this.orderableIndicator!= null), (that.orderableIndicator!= null))) {
                return false;
            }
        }
        {
            OrderableUnitType lhsOrderableUnit;
            lhsOrderableUnit = this.getOrderableUnit();
            OrderableUnitType rhsOrderableUnit;
            rhsOrderableUnit = that.getOrderableUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderableUnit", lhsOrderableUnit), LocatorUtils.property(thatLocator, "orderableUnit", rhsOrderableUnit), lhsOrderableUnit, rhsOrderableUnit, (this.orderableUnit!= null), (that.orderableUnit!= null))) {
                return false;
            }
        }
        {
            ContentUnitQuantityType lhsContentUnitQuantity;
            lhsContentUnitQuantity = this.getContentUnitQuantity();
            ContentUnitQuantityType rhsContentUnitQuantity;
            rhsContentUnitQuantity = that.getContentUnitQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contentUnitQuantity", lhsContentUnitQuantity), LocatorUtils.property(thatLocator, "contentUnitQuantity", rhsContentUnitQuantity), lhsContentUnitQuantity, rhsContentUnitQuantity, (this.contentUnitQuantity!= null), (that.contentUnitQuantity!= null))) {
                return false;
            }
        }
        {
            OrderQuantityIncrementNumericType lhsOrderQuantityIncrementNumeric;
            lhsOrderQuantityIncrementNumeric = this.getOrderQuantityIncrementNumeric();
            OrderQuantityIncrementNumericType rhsOrderQuantityIncrementNumeric;
            rhsOrderQuantityIncrementNumeric = that.getOrderQuantityIncrementNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderQuantityIncrementNumeric", lhsOrderQuantityIncrementNumeric), LocatorUtils.property(thatLocator, "orderQuantityIncrementNumeric", rhsOrderQuantityIncrementNumeric), lhsOrderQuantityIncrementNumeric, rhsOrderQuantityIncrementNumeric, (this.orderQuantityIncrementNumeric!= null), (that.orderQuantityIncrementNumeric!= null))) {
                return false;
            }
        }
        {
            MinimumOrderQuantityType lhsMinimumOrderQuantity;
            lhsMinimumOrderQuantity = this.getMinimumOrderQuantity();
            MinimumOrderQuantityType rhsMinimumOrderQuantity;
            rhsMinimumOrderQuantity = that.getMinimumOrderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumOrderQuantity", lhsMinimumOrderQuantity), LocatorUtils.property(thatLocator, "minimumOrderQuantity", rhsMinimumOrderQuantity), lhsMinimumOrderQuantity, rhsMinimumOrderQuantity, (this.minimumOrderQuantity!= null), (that.minimumOrderQuantity!= null))) {
                return false;
            }
        }
        {
            MaximumOrderQuantityType lhsMaximumOrderQuantity;
            lhsMaximumOrderQuantity = this.getMaximumOrderQuantity();
            MaximumOrderQuantityType rhsMaximumOrderQuantity;
            rhsMaximumOrderQuantity = that.getMaximumOrderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumOrderQuantity", lhsMaximumOrderQuantity), LocatorUtils.property(thatLocator, "maximumOrderQuantity", rhsMaximumOrderQuantity), lhsMaximumOrderQuantity, rhsMaximumOrderQuantity, (this.maximumOrderQuantity!= null), (that.maximumOrderQuantity!= null))) {
                return false;
            }
        }
        {
            List<WarrantyInformationType> lhsWarrantyInformation;
            lhsWarrantyInformation = (((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty()))?this.getWarrantyInformation():null);
            List<WarrantyInformationType> rhsWarrantyInformation;
            rhsWarrantyInformation = (((that.warrantyInformation!= null)&&(!that.warrantyInformation.isEmpty()))?that.getWarrantyInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyInformation", lhsWarrantyInformation), LocatorUtils.property(thatLocator, "warrantyInformation", rhsWarrantyInformation), lhsWarrantyInformation, rhsWarrantyInformation, ((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty())), ((that.warrantyInformation!= null)&&(!that.warrantyInformation.isEmpty())))) {
                return false;
            }
        }
        {
            PackLevelCodeType lhsPackLevelCode;
            lhsPackLevelCode = this.getPackLevelCode();
            PackLevelCodeType rhsPackLevelCode;
            rhsPackLevelCode = that.getPackLevelCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packLevelCode", lhsPackLevelCode), LocatorUtils.property(thatLocator, "packLevelCode", rhsPackLevelCode), lhsPackLevelCode, rhsPackLevelCode, (this.packLevelCode!= null), (that.packLevelCode!= null))) {
                return false;
            }
        }
        {
            CustomerPartyType lhsContractorCustomerParty;
            lhsContractorCustomerParty = this.getContractorCustomerParty();
            CustomerPartyType rhsContractorCustomerParty;
            rhsContractorCustomerParty = that.getContractorCustomerParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractorCustomerParty", lhsContractorCustomerParty), LocatorUtils.property(thatLocator, "contractorCustomerParty", rhsContractorCustomerParty), lhsContractorCustomerParty, rhsContractorCustomerParty, (this.contractorCustomerParty!= null), (that.contractorCustomerParty!= null))) {
                return false;
            }
        }
        {
            SupplierPartyType lhsSellerSupplierParty;
            lhsSellerSupplierParty = this.getSellerSupplierParty();
            SupplierPartyType rhsSellerSupplierParty;
            rhsSellerSupplierParty = that.getSellerSupplierParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sellerSupplierParty", lhsSellerSupplierParty), LocatorUtils.property(thatLocator, "sellerSupplierParty", rhsSellerSupplierParty), lhsSellerSupplierParty, rhsSellerSupplierParty, (this.sellerSupplierParty!= null), (that.sellerSupplierParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsWarrantyParty;
            lhsWarrantyParty = this.getWarrantyParty();
            PartyType rhsWarrantyParty;
            rhsWarrantyParty = that.getWarrantyParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyParty", lhsWarrantyParty), LocatorUtils.property(thatLocator, "warrantyParty", rhsWarrantyParty), lhsWarrantyParty, rhsWarrantyParty, (this.warrantyParty!= null), (that.warrantyParty!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsWarrantyValidityPeriod;
            lhsWarrantyValidityPeriod = this.getWarrantyValidityPeriod();
            PeriodType rhsWarrantyValidityPeriod;
            rhsWarrantyValidityPeriod = that.getWarrantyValidityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyValidityPeriod", lhsWarrantyValidityPeriod), LocatorUtils.property(thatLocator, "warrantyValidityPeriod", rhsWarrantyValidityPeriod), lhsWarrantyValidityPeriod, rhsWarrantyValidityPeriod, (this.warrantyValidityPeriod!= null), (that.warrantyValidityPeriod!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsLineValidityPeriod;
            lhsLineValidityPeriod = this.getLineValidityPeriod();
            PeriodType rhsLineValidityPeriod;
            rhsLineValidityPeriod = that.getLineValidityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineValidityPeriod", lhsLineValidityPeriod), LocatorUtils.property(thatLocator, "lineValidityPeriod", rhsLineValidityPeriod), lhsLineValidityPeriod, rhsLineValidityPeriod, (this.lineValidityPeriod!= null), (that.lineValidityPeriod!= null))) {
                return false;
            }
        }
        {
            List<ItemComparisonType> lhsItemComparison;
            lhsItemComparison = (((this.itemComparison!= null)&&(!this.itemComparison.isEmpty()))?this.getItemComparison():null);
            List<ItemComparisonType> rhsItemComparison;
            rhsItemComparison = (((that.itemComparison!= null)&&(!that.itemComparison.isEmpty()))?that.getItemComparison():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemComparison", lhsItemComparison), LocatorUtils.property(thatLocator, "itemComparison", rhsItemComparison), lhsItemComparison, rhsItemComparison, ((this.itemComparison!= null)&&(!this.itemComparison.isEmpty())), ((that.itemComparison!= null)&&(!that.itemComparison.isEmpty())))) {
                return false;
            }
        }
        {
            List<RelatedItemType> lhsComponentRelatedItem;
            lhsComponentRelatedItem = (((this.componentRelatedItem!= null)&&(!this.componentRelatedItem.isEmpty()))?this.getComponentRelatedItem():null);
            List<RelatedItemType> rhsComponentRelatedItem;
            rhsComponentRelatedItem = (((that.componentRelatedItem!= null)&&(!that.componentRelatedItem.isEmpty()))?that.getComponentRelatedItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "componentRelatedItem", lhsComponentRelatedItem), LocatorUtils.property(thatLocator, "componentRelatedItem", rhsComponentRelatedItem), lhsComponentRelatedItem, rhsComponentRelatedItem, ((this.componentRelatedItem!= null)&&(!this.componentRelatedItem.isEmpty())), ((that.componentRelatedItem!= null)&&(!that.componentRelatedItem.isEmpty())))) {
                return false;
            }
        }
        {
            List<RelatedItemType> lhsAccessoryRelatedItem;
            lhsAccessoryRelatedItem = (((this.accessoryRelatedItem!= null)&&(!this.accessoryRelatedItem.isEmpty()))?this.getAccessoryRelatedItem():null);
            List<RelatedItemType> rhsAccessoryRelatedItem;
            rhsAccessoryRelatedItem = (((that.accessoryRelatedItem!= null)&&(!that.accessoryRelatedItem.isEmpty()))?that.getAccessoryRelatedItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accessoryRelatedItem", lhsAccessoryRelatedItem), LocatorUtils.property(thatLocator, "accessoryRelatedItem", rhsAccessoryRelatedItem), lhsAccessoryRelatedItem, rhsAccessoryRelatedItem, ((this.accessoryRelatedItem!= null)&&(!this.accessoryRelatedItem.isEmpty())), ((that.accessoryRelatedItem!= null)&&(!that.accessoryRelatedItem.isEmpty())))) {
                return false;
            }
        }
        {
            List<RelatedItemType> lhsRequiredRelatedItem;
            lhsRequiredRelatedItem = (((this.requiredRelatedItem!= null)&&(!this.requiredRelatedItem.isEmpty()))?this.getRequiredRelatedItem():null);
            List<RelatedItemType> rhsRequiredRelatedItem;
            rhsRequiredRelatedItem = (((that.requiredRelatedItem!= null)&&(!that.requiredRelatedItem.isEmpty()))?that.getRequiredRelatedItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requiredRelatedItem", lhsRequiredRelatedItem), LocatorUtils.property(thatLocator, "requiredRelatedItem", rhsRequiredRelatedItem), lhsRequiredRelatedItem, rhsRequiredRelatedItem, ((this.requiredRelatedItem!= null)&&(!this.requiredRelatedItem.isEmpty())), ((that.requiredRelatedItem!= null)&&(!that.requiredRelatedItem.isEmpty())))) {
                return false;
            }
        }
        {
            List<RelatedItemType> lhsReplacementRelatedItem;
            lhsReplacementRelatedItem = (((this.replacementRelatedItem!= null)&&(!this.replacementRelatedItem.isEmpty()))?this.getReplacementRelatedItem():null);
            List<RelatedItemType> rhsReplacementRelatedItem;
            rhsReplacementRelatedItem = (((that.replacementRelatedItem!= null)&&(!that.replacementRelatedItem.isEmpty()))?that.getReplacementRelatedItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "replacementRelatedItem", lhsReplacementRelatedItem), LocatorUtils.property(thatLocator, "replacementRelatedItem", rhsReplacementRelatedItem), lhsReplacementRelatedItem, rhsReplacementRelatedItem, ((this.replacementRelatedItem!= null)&&(!this.replacementRelatedItem.isEmpty())), ((that.replacementRelatedItem!= null)&&(!that.replacementRelatedItem.isEmpty())))) {
                return false;
            }
        }
        {
            List<RelatedItemType> lhsComplementaryRelatedItem;
            lhsComplementaryRelatedItem = (((this.complementaryRelatedItem!= null)&&(!this.complementaryRelatedItem.isEmpty()))?this.getComplementaryRelatedItem():null);
            List<RelatedItemType> rhsComplementaryRelatedItem;
            rhsComplementaryRelatedItem = (((that.complementaryRelatedItem!= null)&&(!that.complementaryRelatedItem.isEmpty()))?that.getComplementaryRelatedItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "complementaryRelatedItem", lhsComplementaryRelatedItem), LocatorUtils.property(thatLocator, "complementaryRelatedItem", rhsComplementaryRelatedItem), lhsComplementaryRelatedItem, rhsComplementaryRelatedItem, ((this.complementaryRelatedItem!= null)&&(!this.complementaryRelatedItem.isEmpty())), ((that.complementaryRelatedItem!= null)&&(!that.complementaryRelatedItem.isEmpty())))) {
                return false;
            }
        }
        {
            List<RelatedItemType> lhsReplacedRelatedItem;
            lhsReplacedRelatedItem = (((this.replacedRelatedItem!= null)&&(!this.replacedRelatedItem.isEmpty()))?this.getReplacedRelatedItem():null);
            List<RelatedItemType> rhsReplacedRelatedItem;
            rhsReplacedRelatedItem = (((that.replacedRelatedItem!= null)&&(!that.replacedRelatedItem.isEmpty()))?that.getReplacedRelatedItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "replacedRelatedItem", lhsReplacedRelatedItem), LocatorUtils.property(thatLocator, "replacedRelatedItem", rhsReplacedRelatedItem), lhsReplacedRelatedItem, rhsReplacedRelatedItem, ((this.replacedRelatedItem!= null)&&(!this.replacedRelatedItem.isEmpty())), ((that.replacedRelatedItem!= null)&&(!that.replacedRelatedItem.isEmpty())))) {
                return false;
            }
        }
        {
            List<ItemLocationQuantityType> lhsRequiredItemLocationQuantity;
            lhsRequiredItemLocationQuantity = (((this.requiredItemLocationQuantity!= null)&&(!this.requiredItemLocationQuantity.isEmpty()))?this.getRequiredItemLocationQuantity():null);
            List<ItemLocationQuantityType> rhsRequiredItemLocationQuantity;
            rhsRequiredItemLocationQuantity = (((that.requiredItemLocationQuantity!= null)&&(!that.requiredItemLocationQuantity.isEmpty()))?that.getRequiredItemLocationQuantity():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requiredItemLocationQuantity", lhsRequiredItemLocationQuantity), LocatorUtils.property(thatLocator, "requiredItemLocationQuantity", rhsRequiredItemLocationQuantity), lhsRequiredItemLocationQuantity, rhsRequiredItemLocationQuantity, ((this.requiredItemLocationQuantity!= null)&&(!this.requiredItemLocationQuantity.isEmpty())), ((that.requiredItemLocationQuantity!= null)&&(!that.requiredItemLocationQuantity.isEmpty())))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsDocumentReference;
            lhsDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            List<DocumentReferenceType> rhsDocumentReference;
            rhsDocumentReference = (((that.documentReference!= null)&&(!that.documentReference.isEmpty()))?that.getDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentReference", lhsDocumentReference), LocatorUtils.property(thatLocator, "documentReference", rhsDocumentReference), lhsDocumentReference, rhsDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())), ((that.documentReference!= null)&&(!that.documentReference.isEmpty())))) {
                return false;
            }
        }
        {
            ItemType lhsItem;
            lhsItem = this.getItem();
            ItemType rhsItem;
            rhsItem = that.getItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "item", lhsItem), LocatorUtils.property(thatLocator, "item", rhsItem), lhsItem, rhsItem, (this.item!= null), (that.item!= null))) {
                return false;
            }
        }
        {
            List<ItemPropertyType> lhsKeywordItemProperty;
            lhsKeywordItemProperty = (((this.keywordItemProperty!= null)&&(!this.keywordItemProperty.isEmpty()))?this.getKeywordItemProperty():null);
            List<ItemPropertyType> rhsKeywordItemProperty;
            rhsKeywordItemProperty = (((that.keywordItemProperty!= null)&&(!that.keywordItemProperty.isEmpty()))?that.getKeywordItemProperty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keywordItemProperty", lhsKeywordItemProperty), LocatorUtils.property(thatLocator, "keywordItemProperty", rhsKeywordItemProperty), lhsKeywordItemProperty, rhsKeywordItemProperty, ((this.keywordItemProperty!= null)&&(!this.keywordItemProperty.isEmpty())), ((that.keywordItemProperty!= null)&&(!that.keywordItemProperty.isEmpty())))) {
                return false;
            }
        }
        {
            LineReferenceType lhsCallForTendersLineReference;
            lhsCallForTendersLineReference = this.getCallForTendersLineReference();
            LineReferenceType rhsCallForTendersLineReference;
            rhsCallForTendersLineReference = that.getCallForTendersLineReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "callForTendersLineReference", lhsCallForTendersLineReference), LocatorUtils.property(thatLocator, "callForTendersLineReference", rhsCallForTendersLineReference), lhsCallForTendersLineReference, rhsCallForTendersLineReference, (this.callForTendersLineReference!= null), (that.callForTendersLineReference!= null))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsCallForTendersDocumentReference;
            lhsCallForTendersDocumentReference = this.getCallForTendersDocumentReference();
            DocumentReferenceType rhsCallForTendersDocumentReference;
            rhsCallForTendersDocumentReference = that.getCallForTendersDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "callForTendersDocumentReference", lhsCallForTendersDocumentReference), LocatorUtils.property(thatLocator, "callForTendersDocumentReference", rhsCallForTendersDocumentReference), lhsCallForTendersDocumentReference, rhsCallForTendersDocumentReference, (this.callForTendersDocumentReference!= null), (that.callForTendersDocumentReference!= null))) {
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
            ActionCodeType theActionCode;
            theActionCode = this.getActionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actionCode", theActionCode), currentHashCode, theActionCode, (this.actionCode!= null));
        }
        {
            LifeCycleStatusCodeType theLifeCycleStatusCode;
            theLifeCycleStatusCode = this.getLifeCycleStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lifeCycleStatusCode", theLifeCycleStatusCode), currentHashCode, theLifeCycleStatusCode, (this.lifeCycleStatusCode!= null));
        }
        {
            ContractSubdivisionType theContractSubdivision;
            theContractSubdivision = this.getContractSubdivision();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractSubdivision", theContractSubdivision), currentHashCode, theContractSubdivision, (this.contractSubdivision!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            OrderableIndicatorType theOrderableIndicator;
            theOrderableIndicator = this.getOrderableIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderableIndicator", theOrderableIndicator), currentHashCode, theOrderableIndicator, (this.orderableIndicator!= null));
        }
        {
            OrderableUnitType theOrderableUnit;
            theOrderableUnit = this.getOrderableUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderableUnit", theOrderableUnit), currentHashCode, theOrderableUnit, (this.orderableUnit!= null));
        }
        {
            ContentUnitQuantityType theContentUnitQuantity;
            theContentUnitQuantity = this.getContentUnitQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contentUnitQuantity", theContentUnitQuantity), currentHashCode, theContentUnitQuantity, (this.contentUnitQuantity!= null));
        }
        {
            OrderQuantityIncrementNumericType theOrderQuantityIncrementNumeric;
            theOrderQuantityIncrementNumeric = this.getOrderQuantityIncrementNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderQuantityIncrementNumeric", theOrderQuantityIncrementNumeric), currentHashCode, theOrderQuantityIncrementNumeric, (this.orderQuantityIncrementNumeric!= null));
        }
        {
            MinimumOrderQuantityType theMinimumOrderQuantity;
            theMinimumOrderQuantity = this.getMinimumOrderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumOrderQuantity", theMinimumOrderQuantity), currentHashCode, theMinimumOrderQuantity, (this.minimumOrderQuantity!= null));
        }
        {
            MaximumOrderQuantityType theMaximumOrderQuantity;
            theMaximumOrderQuantity = this.getMaximumOrderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumOrderQuantity", theMaximumOrderQuantity), currentHashCode, theMaximumOrderQuantity, (this.maximumOrderQuantity!= null));
        }
        {
            List<WarrantyInformationType> theWarrantyInformation;
            theWarrantyInformation = (((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty()))?this.getWarrantyInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyInformation", theWarrantyInformation), currentHashCode, theWarrantyInformation, ((this.warrantyInformation!= null)&&(!this.warrantyInformation.isEmpty())));
        }
        {
            PackLevelCodeType thePackLevelCode;
            thePackLevelCode = this.getPackLevelCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packLevelCode", thePackLevelCode), currentHashCode, thePackLevelCode, (this.packLevelCode!= null));
        }
        {
            CustomerPartyType theContractorCustomerParty;
            theContractorCustomerParty = this.getContractorCustomerParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractorCustomerParty", theContractorCustomerParty), currentHashCode, theContractorCustomerParty, (this.contractorCustomerParty!= null));
        }
        {
            SupplierPartyType theSellerSupplierParty;
            theSellerSupplierParty = this.getSellerSupplierParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sellerSupplierParty", theSellerSupplierParty), currentHashCode, theSellerSupplierParty, (this.sellerSupplierParty!= null));
        }
        {
            PartyType theWarrantyParty;
            theWarrantyParty = this.getWarrantyParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyParty", theWarrantyParty), currentHashCode, theWarrantyParty, (this.warrantyParty!= null));
        }
        {
            PeriodType theWarrantyValidityPeriod;
            theWarrantyValidityPeriod = this.getWarrantyValidityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyValidityPeriod", theWarrantyValidityPeriod), currentHashCode, theWarrantyValidityPeriod, (this.warrantyValidityPeriod!= null));
        }
        {
            PeriodType theLineValidityPeriod;
            theLineValidityPeriod = this.getLineValidityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineValidityPeriod", theLineValidityPeriod), currentHashCode, theLineValidityPeriod, (this.lineValidityPeriod!= null));
        }
        {
            List<ItemComparisonType> theItemComparison;
            theItemComparison = (((this.itemComparison!= null)&&(!this.itemComparison.isEmpty()))?this.getItemComparison():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemComparison", theItemComparison), currentHashCode, theItemComparison, ((this.itemComparison!= null)&&(!this.itemComparison.isEmpty())));
        }
        {
            List<RelatedItemType> theComponentRelatedItem;
            theComponentRelatedItem = (((this.componentRelatedItem!= null)&&(!this.componentRelatedItem.isEmpty()))?this.getComponentRelatedItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "componentRelatedItem", theComponentRelatedItem), currentHashCode, theComponentRelatedItem, ((this.componentRelatedItem!= null)&&(!this.componentRelatedItem.isEmpty())));
        }
        {
            List<RelatedItemType> theAccessoryRelatedItem;
            theAccessoryRelatedItem = (((this.accessoryRelatedItem!= null)&&(!this.accessoryRelatedItem.isEmpty()))?this.getAccessoryRelatedItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accessoryRelatedItem", theAccessoryRelatedItem), currentHashCode, theAccessoryRelatedItem, ((this.accessoryRelatedItem!= null)&&(!this.accessoryRelatedItem.isEmpty())));
        }
        {
            List<RelatedItemType> theRequiredRelatedItem;
            theRequiredRelatedItem = (((this.requiredRelatedItem!= null)&&(!this.requiredRelatedItem.isEmpty()))?this.getRequiredRelatedItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requiredRelatedItem", theRequiredRelatedItem), currentHashCode, theRequiredRelatedItem, ((this.requiredRelatedItem!= null)&&(!this.requiredRelatedItem.isEmpty())));
        }
        {
            List<RelatedItemType> theReplacementRelatedItem;
            theReplacementRelatedItem = (((this.replacementRelatedItem!= null)&&(!this.replacementRelatedItem.isEmpty()))?this.getReplacementRelatedItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replacementRelatedItem", theReplacementRelatedItem), currentHashCode, theReplacementRelatedItem, ((this.replacementRelatedItem!= null)&&(!this.replacementRelatedItem.isEmpty())));
        }
        {
            List<RelatedItemType> theComplementaryRelatedItem;
            theComplementaryRelatedItem = (((this.complementaryRelatedItem!= null)&&(!this.complementaryRelatedItem.isEmpty()))?this.getComplementaryRelatedItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "complementaryRelatedItem", theComplementaryRelatedItem), currentHashCode, theComplementaryRelatedItem, ((this.complementaryRelatedItem!= null)&&(!this.complementaryRelatedItem.isEmpty())));
        }
        {
            List<RelatedItemType> theReplacedRelatedItem;
            theReplacedRelatedItem = (((this.replacedRelatedItem!= null)&&(!this.replacedRelatedItem.isEmpty()))?this.getReplacedRelatedItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replacedRelatedItem", theReplacedRelatedItem), currentHashCode, theReplacedRelatedItem, ((this.replacedRelatedItem!= null)&&(!this.replacedRelatedItem.isEmpty())));
        }
        {
            List<ItemLocationQuantityType> theRequiredItemLocationQuantity;
            theRequiredItemLocationQuantity = (((this.requiredItemLocationQuantity!= null)&&(!this.requiredItemLocationQuantity.isEmpty()))?this.getRequiredItemLocationQuantity():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requiredItemLocationQuantity", theRequiredItemLocationQuantity), currentHashCode, theRequiredItemLocationQuantity, ((this.requiredItemLocationQuantity!= null)&&(!this.requiredItemLocationQuantity.isEmpty())));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentReference", theDocumentReference), currentHashCode, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "item", theItem), currentHashCode, theItem, (this.item!= null));
        }
        {
            List<ItemPropertyType> theKeywordItemProperty;
            theKeywordItemProperty = (((this.keywordItemProperty!= null)&&(!this.keywordItemProperty.isEmpty()))?this.getKeywordItemProperty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keywordItemProperty", theKeywordItemProperty), currentHashCode, theKeywordItemProperty, ((this.keywordItemProperty!= null)&&(!this.keywordItemProperty.isEmpty())));
        }
        {
            LineReferenceType theCallForTendersLineReference;
            theCallForTendersLineReference = this.getCallForTendersLineReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "callForTendersLineReference", theCallForTendersLineReference), currentHashCode, theCallForTendersLineReference, (this.callForTendersLineReference!= null));
        }
        {
            DocumentReferenceType theCallForTendersDocumentReference;
            theCallForTendersDocumentReference = this.getCallForTendersDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "callForTendersDocumentReference", theCallForTendersDocumentReference), currentHashCode, theCallForTendersDocumentReference, (this.callForTendersDocumentReference!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
