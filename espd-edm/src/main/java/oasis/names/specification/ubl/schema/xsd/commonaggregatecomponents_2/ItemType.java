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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AdditionalInformationType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BrandNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CatalogueIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HazardousRiskIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.KeywordType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ModelNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PackQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PackSizeNumericType;
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
 * <p>Classe Java per ItemType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackSizeNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CatalogueIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRiskIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Keyword" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BrandName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ModelName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BuyersItemIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellersItemIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ManufacturersItemIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}StandardItemIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CatalogueItemIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalItemIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CatalogueDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemSpecificationDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransactionConditions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HazardousItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ClassifiedTaxCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalItemProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ManufacturerParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InformationContentProviderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemInstance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Certificate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Dimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", propOrder = {
    "description",
    "packQuantity",
    "packSizeNumeric",
    "catalogueIndicator",
    "name",
    "hazardousRiskIndicator",
    "additionalInformation",
    "keyword",
    "brandName",
    "modelName",
    "buyersItemIdentification",
    "sellersItemIdentification",
    "manufacturersItemIdentification",
    "standardItemIdentification",
    "catalogueItemIdentification",
    "additionalItemIdentification",
    "catalogueDocumentReference",
    "itemSpecificationDocumentReference",
    "originCountry",
    "commodityClassification",
    "transactionConditions",
    "hazardousItem",
    "classifiedTaxCategory",
    "additionalItemProperty",
    "manufacturerParty",
    "informationContentProviderParty",
    "originAddress",
    "itemInstance",
    "certificate",
    "dimension"
})
public class ItemType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "PackQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackQuantityType packQuantity;
    @XmlElement(name = "PackSizeNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackSizeNumericType packSizeNumeric;
    @XmlElement(name = "CatalogueIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CatalogueIndicatorType catalogueIndicator;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "HazardousRiskIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardousRiskIndicatorType hazardousRiskIndicator;
    @XmlElement(name = "AdditionalInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<AdditionalInformationType> additionalInformation;
    @XmlElement(name = "Keyword", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<KeywordType> keyword;
    @XmlElement(name = "BrandName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<BrandNameType> brandName;
    @XmlElement(name = "ModelName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ModelNameType> modelName;
    @XmlElement(name = "BuyersItemIdentification")
    protected ItemIdentificationType buyersItemIdentification;
    @XmlElement(name = "SellersItemIdentification")
    protected ItemIdentificationType sellersItemIdentification;
    @XmlElement(name = "ManufacturersItemIdentification")
    protected List<ItemIdentificationType> manufacturersItemIdentification;
    @XmlElement(name = "StandardItemIdentification")
    protected ItemIdentificationType standardItemIdentification;
    @XmlElement(name = "CatalogueItemIdentification")
    protected ItemIdentificationType catalogueItemIdentification;
    @XmlElement(name = "AdditionalItemIdentification")
    protected List<ItemIdentificationType> additionalItemIdentification;
    @XmlElement(name = "CatalogueDocumentReference")
    protected DocumentReferenceType catalogueDocumentReference;
    @XmlElement(name = "ItemSpecificationDocumentReference")
    protected List<DocumentReferenceType> itemSpecificationDocumentReference;
    @XmlElement(name = "OriginCountry")
    protected CountryType originCountry;
    @XmlElement(name = "CommodityClassification")
    protected List<CommodityClassificationType> commodityClassification;
    @XmlElement(name = "TransactionConditions")
    protected List<TransactionConditionsType> transactionConditions;
    @XmlElement(name = "HazardousItem")
    protected List<HazardousItemType> hazardousItem;
    @XmlElement(name = "ClassifiedTaxCategory")
    protected List<TaxCategoryType> classifiedTaxCategory;
    @XmlElement(name = "AdditionalItemProperty")
    protected List<ItemPropertyType> additionalItemProperty;
    @XmlElement(name = "ManufacturerParty")
    protected List<PartyType> manufacturerParty;
    @XmlElement(name = "InformationContentProviderParty")
    protected PartyType informationContentProviderParty;
    @XmlElement(name = "OriginAddress")
    protected List<AddressType> originAddress;
    @XmlElement(name = "ItemInstance")
    protected List<ItemInstanceType> itemInstance;
    @XmlElement(name = "Certificate")
    protected List<CertificateType> certificate;
    @XmlElement(name = "Dimension")
    protected List<DimensionType> dimension;

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
     * Recupera il valore della proprietà catalogueIndicator.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueIndicatorType }
     *     
     */
    public CatalogueIndicatorType getCatalogueIndicator() {
        return catalogueIndicator;
    }

    /**
     * Imposta il valore della proprietà catalogueIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueIndicatorType }
     *     
     */
    public void setCatalogueIndicator(CatalogueIndicatorType value) {
        this.catalogueIndicator = value;
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
     * Recupera il valore della proprietà hazardousRiskIndicator.
     * 
     * @return
     *     possible object is
     *     {@link HazardousRiskIndicatorType }
     *     
     */
    public HazardousRiskIndicatorType getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Imposta il valore della proprietà hazardousRiskIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousRiskIndicatorType }
     *     
     */
    public void setHazardousRiskIndicator(HazardousRiskIndicatorType value) {
        this.hazardousRiskIndicator = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformationType }
     * 
     * 
     */
    public List<AdditionalInformationType> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<AdditionalInformationType>();
        }
        return this.additionalInformation;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordType }
     * 
     * 
     */
    public List<KeywordType> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<KeywordType>();
        }
        return this.keyword;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brandName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrandName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrandNameType }
     * 
     * 
     */
    public List<BrandNameType> getBrandName() {
        if (brandName == null) {
            brandName = new ArrayList<BrandNameType>();
        }
        return this.brandName;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelNameType }
     * 
     * 
     */
    public List<ModelNameType> getModelName() {
        if (modelName == null) {
            modelName = new ArrayList<ModelNameType>();
        }
        return this.modelName;
    }

    /**
     * Recupera il valore della proprietà buyersItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getBuyersItemIdentification() {
        return buyersItemIdentification;
    }

    /**
     * Imposta il valore della proprietà buyersItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setBuyersItemIdentification(ItemIdentificationType value) {
        this.buyersItemIdentification = value;
    }

    /**
     * Recupera il valore della proprietà sellersItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getSellersItemIdentification() {
        return sellersItemIdentification;
    }

    /**
     * Imposta il valore della proprietà sellersItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setSellersItemIdentification(ItemIdentificationType value) {
        this.sellersItemIdentification = value;
    }

    /**
     * Gets the value of the manufacturersItemIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturersItemIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturersItemIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemIdentificationType }
     * 
     * 
     */
    public List<ItemIdentificationType> getManufacturersItemIdentification() {
        if (manufacturersItemIdentification == null) {
            manufacturersItemIdentification = new ArrayList<ItemIdentificationType>();
        }
        return this.manufacturersItemIdentification;
    }

    /**
     * Recupera il valore della proprietà standardItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getStandardItemIdentification() {
        return standardItemIdentification;
    }

    /**
     * Imposta il valore della proprietà standardItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setStandardItemIdentification(ItemIdentificationType value) {
        this.standardItemIdentification = value;
    }

    /**
     * Recupera il valore della proprietà catalogueItemIdentification.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentificationType }
     *     
     */
    public ItemIdentificationType getCatalogueItemIdentification() {
        return catalogueItemIdentification;
    }

    /**
     * Imposta il valore della proprietà catalogueItemIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentificationType }
     *     
     */
    public void setCatalogueItemIdentification(ItemIdentificationType value) {
        this.catalogueItemIdentification = value;
    }

    /**
     * Gets the value of the additionalItemIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalItemIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalItemIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemIdentificationType }
     * 
     * 
     */
    public List<ItemIdentificationType> getAdditionalItemIdentification() {
        if (additionalItemIdentification == null) {
            additionalItemIdentification = new ArrayList<ItemIdentificationType>();
        }
        return this.additionalItemIdentification;
    }

    /**
     * Recupera il valore della proprietà catalogueDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getCatalogueDocumentReference() {
        return catalogueDocumentReference;
    }

    /**
     * Imposta il valore della proprietà catalogueDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setCatalogueDocumentReference(DocumentReferenceType value) {
        this.catalogueDocumentReference = value;
    }

    /**
     * Gets the value of the itemSpecificationDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemSpecificationDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemSpecificationDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getItemSpecificationDocumentReference() {
        if (itemSpecificationDocumentReference == null) {
            itemSpecificationDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.itemSpecificationDocumentReference;
    }

    /**
     * Recupera il valore della proprietà originCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getOriginCountry() {
        return originCountry;
    }

    /**
     * Imposta il valore della proprietà originCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setOriginCountry(CountryType value) {
        this.originCountry = value;
    }

    /**
     * Gets the value of the commodityClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commodityClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodityClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getCommodityClassification() {
        if (commodityClassification == null) {
            commodityClassification = new ArrayList<CommodityClassificationType>();
        }
        return this.commodityClassification;
    }

    /**
     * Gets the value of the transactionConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionConditionsType }
     * 
     * 
     */
    public List<TransactionConditionsType> getTransactionConditions() {
        if (transactionConditions == null) {
            transactionConditions = new ArrayList<TransactionConditionsType>();
        }
        return this.transactionConditions;
    }

    /**
     * Gets the value of the hazardousItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousItemType }
     * 
     * 
     */
    public List<HazardousItemType> getHazardousItem() {
        if (hazardousItem == null) {
            hazardousItem = new ArrayList<HazardousItemType>();
        }
        return this.hazardousItem;
    }

    /**
     * Gets the value of the classifiedTaxCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classifiedTaxCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassifiedTaxCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCategoryType }
     * 
     * 
     */
    public List<TaxCategoryType> getClassifiedTaxCategory() {
        if (classifiedTaxCategory == null) {
            classifiedTaxCategory = new ArrayList<TaxCategoryType>();
        }
        return this.classifiedTaxCategory;
    }

    /**
     * Gets the value of the additionalItemProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalItemProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalItemProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPropertyType }
     * 
     * 
     */
    public List<ItemPropertyType> getAdditionalItemProperty() {
        if (additionalItemProperty == null) {
            additionalItemProperty = new ArrayList<ItemPropertyType>();
        }
        return this.additionalItemProperty;
    }

    /**
     * Gets the value of the manufacturerParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getManufacturerParty() {
        if (manufacturerParty == null) {
            manufacturerParty = new ArrayList<PartyType>();
        }
        return this.manufacturerParty;
    }

    /**
     * Recupera il valore della proprietà informationContentProviderParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getInformationContentProviderParty() {
        return informationContentProviderParty;
    }

    /**
     * Imposta il valore della proprietà informationContentProviderParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setInformationContentProviderParty(PartyType value) {
        this.informationContentProviderParty = value;
    }

    /**
     * Gets the value of the originAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getOriginAddress() {
        if (originAddress == null) {
            originAddress = new ArrayList<AddressType>();
        }
        return this.originAddress;
    }

    /**
     * Gets the value of the itemInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemInstanceType }
     * 
     * 
     */
    public List<ItemInstanceType> getItemInstance() {
        if (itemInstance == null) {
            itemInstance = new ArrayList<ItemInstanceType>();
        }
        return this.itemInstance;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificateType }
     * 
     * 
     */
    public List<CertificateType> getCertificate() {
        if (certificate == null) {
            certificate = new ArrayList<CertificateType>();
        }
        return this.certificate;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionType }
     * 
     * 
     */
    public List<DimensionType> getDimension() {
        if (dimension == null) {
            dimension = new ArrayList<DimensionType>();
        }
        return this.dimension;
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
            CatalogueIndicatorType theCatalogueIndicator;
            theCatalogueIndicator = this.getCatalogueIndicator();
            strategy.appendField(locator, this, "catalogueIndicator", buffer, theCatalogueIndicator, (this.catalogueIndicator!= null));
        }
        {
            NameType theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            HazardousRiskIndicatorType theHazardousRiskIndicator;
            theHazardousRiskIndicator = this.getHazardousRiskIndicator();
            strategy.appendField(locator, this, "hazardousRiskIndicator", buffer, theHazardousRiskIndicator, (this.hazardousRiskIndicator!= null));
        }
        {
            List<AdditionalInformationType> theAdditionalInformation;
            theAdditionalInformation = (((this.additionalInformation!= null)&&(!this.additionalInformation.isEmpty()))?this.getAdditionalInformation():null);
            strategy.appendField(locator, this, "additionalInformation", buffer, theAdditionalInformation, ((this.additionalInformation!= null)&&(!this.additionalInformation.isEmpty())));
        }
        {
            List<KeywordType> theKeyword;
            theKeyword = (((this.keyword!= null)&&(!this.keyword.isEmpty()))?this.getKeyword():null);
            strategy.appendField(locator, this, "keyword", buffer, theKeyword, ((this.keyword!= null)&&(!this.keyword.isEmpty())));
        }
        {
            List<BrandNameType> theBrandName;
            theBrandName = (((this.brandName!= null)&&(!this.brandName.isEmpty()))?this.getBrandName():null);
            strategy.appendField(locator, this, "brandName", buffer, theBrandName, ((this.brandName!= null)&&(!this.brandName.isEmpty())));
        }
        {
            List<ModelNameType> theModelName;
            theModelName = (((this.modelName!= null)&&(!this.modelName.isEmpty()))?this.getModelName():null);
            strategy.appendField(locator, this, "modelName", buffer, theModelName, ((this.modelName!= null)&&(!this.modelName.isEmpty())));
        }
        {
            ItemIdentificationType theBuyersItemIdentification;
            theBuyersItemIdentification = this.getBuyersItemIdentification();
            strategy.appendField(locator, this, "buyersItemIdentification", buffer, theBuyersItemIdentification, (this.buyersItemIdentification!= null));
        }
        {
            ItemIdentificationType theSellersItemIdentification;
            theSellersItemIdentification = this.getSellersItemIdentification();
            strategy.appendField(locator, this, "sellersItemIdentification", buffer, theSellersItemIdentification, (this.sellersItemIdentification!= null));
        }
        {
            List<ItemIdentificationType> theManufacturersItemIdentification;
            theManufacturersItemIdentification = (((this.manufacturersItemIdentification!= null)&&(!this.manufacturersItemIdentification.isEmpty()))?this.getManufacturersItemIdentification():null);
            strategy.appendField(locator, this, "manufacturersItemIdentification", buffer, theManufacturersItemIdentification, ((this.manufacturersItemIdentification!= null)&&(!this.manufacturersItemIdentification.isEmpty())));
        }
        {
            ItemIdentificationType theStandardItemIdentification;
            theStandardItemIdentification = this.getStandardItemIdentification();
            strategy.appendField(locator, this, "standardItemIdentification", buffer, theStandardItemIdentification, (this.standardItemIdentification!= null));
        }
        {
            ItemIdentificationType theCatalogueItemIdentification;
            theCatalogueItemIdentification = this.getCatalogueItemIdentification();
            strategy.appendField(locator, this, "catalogueItemIdentification", buffer, theCatalogueItemIdentification, (this.catalogueItemIdentification!= null));
        }
        {
            List<ItemIdentificationType> theAdditionalItemIdentification;
            theAdditionalItemIdentification = (((this.additionalItemIdentification!= null)&&(!this.additionalItemIdentification.isEmpty()))?this.getAdditionalItemIdentification():null);
            strategy.appendField(locator, this, "additionalItemIdentification", buffer, theAdditionalItemIdentification, ((this.additionalItemIdentification!= null)&&(!this.additionalItemIdentification.isEmpty())));
        }
        {
            DocumentReferenceType theCatalogueDocumentReference;
            theCatalogueDocumentReference = this.getCatalogueDocumentReference();
            strategy.appendField(locator, this, "catalogueDocumentReference", buffer, theCatalogueDocumentReference, (this.catalogueDocumentReference!= null));
        }
        {
            List<DocumentReferenceType> theItemSpecificationDocumentReference;
            theItemSpecificationDocumentReference = (((this.itemSpecificationDocumentReference!= null)&&(!this.itemSpecificationDocumentReference.isEmpty()))?this.getItemSpecificationDocumentReference():null);
            strategy.appendField(locator, this, "itemSpecificationDocumentReference", buffer, theItemSpecificationDocumentReference, ((this.itemSpecificationDocumentReference!= null)&&(!this.itemSpecificationDocumentReference.isEmpty())));
        }
        {
            CountryType theOriginCountry;
            theOriginCountry = this.getOriginCountry();
            strategy.appendField(locator, this, "originCountry", buffer, theOriginCountry, (this.originCountry!= null));
        }
        {
            List<CommodityClassificationType> theCommodityClassification;
            theCommodityClassification = (((this.commodityClassification!= null)&&(!this.commodityClassification.isEmpty()))?this.getCommodityClassification():null);
            strategy.appendField(locator, this, "commodityClassification", buffer, theCommodityClassification, ((this.commodityClassification!= null)&&(!this.commodityClassification.isEmpty())));
        }
        {
            List<TransactionConditionsType> theTransactionConditions;
            theTransactionConditions = (((this.transactionConditions!= null)&&(!this.transactionConditions.isEmpty()))?this.getTransactionConditions():null);
            strategy.appendField(locator, this, "transactionConditions", buffer, theTransactionConditions, ((this.transactionConditions!= null)&&(!this.transactionConditions.isEmpty())));
        }
        {
            List<HazardousItemType> theHazardousItem;
            theHazardousItem = (((this.hazardousItem!= null)&&(!this.hazardousItem.isEmpty()))?this.getHazardousItem():null);
            strategy.appendField(locator, this, "hazardousItem", buffer, theHazardousItem, ((this.hazardousItem!= null)&&(!this.hazardousItem.isEmpty())));
        }
        {
            List<TaxCategoryType> theClassifiedTaxCategory;
            theClassifiedTaxCategory = (((this.classifiedTaxCategory!= null)&&(!this.classifiedTaxCategory.isEmpty()))?this.getClassifiedTaxCategory():null);
            strategy.appendField(locator, this, "classifiedTaxCategory", buffer, theClassifiedTaxCategory, ((this.classifiedTaxCategory!= null)&&(!this.classifiedTaxCategory.isEmpty())));
        }
        {
            List<ItemPropertyType> theAdditionalItemProperty;
            theAdditionalItemProperty = (((this.additionalItemProperty!= null)&&(!this.additionalItemProperty.isEmpty()))?this.getAdditionalItemProperty():null);
            strategy.appendField(locator, this, "additionalItemProperty", buffer, theAdditionalItemProperty, ((this.additionalItemProperty!= null)&&(!this.additionalItemProperty.isEmpty())));
        }
        {
            List<PartyType> theManufacturerParty;
            theManufacturerParty = (((this.manufacturerParty!= null)&&(!this.manufacturerParty.isEmpty()))?this.getManufacturerParty():null);
            strategy.appendField(locator, this, "manufacturerParty", buffer, theManufacturerParty, ((this.manufacturerParty!= null)&&(!this.manufacturerParty.isEmpty())));
        }
        {
            PartyType theInformationContentProviderParty;
            theInformationContentProviderParty = this.getInformationContentProviderParty();
            strategy.appendField(locator, this, "informationContentProviderParty", buffer, theInformationContentProviderParty, (this.informationContentProviderParty!= null));
        }
        {
            List<AddressType> theOriginAddress;
            theOriginAddress = (((this.originAddress!= null)&&(!this.originAddress.isEmpty()))?this.getOriginAddress():null);
            strategy.appendField(locator, this, "originAddress", buffer, theOriginAddress, ((this.originAddress!= null)&&(!this.originAddress.isEmpty())));
        }
        {
            List<ItemInstanceType> theItemInstance;
            theItemInstance = (((this.itemInstance!= null)&&(!this.itemInstance.isEmpty()))?this.getItemInstance():null);
            strategy.appendField(locator, this, "itemInstance", buffer, theItemInstance, ((this.itemInstance!= null)&&(!this.itemInstance.isEmpty())));
        }
        {
            List<CertificateType> theCertificate;
            theCertificate = (((this.certificate!= null)&&(!this.certificate.isEmpty()))?this.getCertificate():null);
            strategy.appendField(locator, this, "certificate", buffer, theCertificate, ((this.certificate!= null)&&(!this.certificate.isEmpty())));
        }
        {
            List<DimensionType> theDimension;
            theDimension = (((this.dimension!= null)&&(!this.dimension.isEmpty()))?this.getDimension():null);
            strategy.appendField(locator, this, "dimension", buffer, theDimension, ((this.dimension!= null)&&(!this.dimension.isEmpty())));
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
        final ItemType that = ((ItemType) object);
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
            CatalogueIndicatorType lhsCatalogueIndicator;
            lhsCatalogueIndicator = this.getCatalogueIndicator();
            CatalogueIndicatorType rhsCatalogueIndicator;
            rhsCatalogueIndicator = that.getCatalogueIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "catalogueIndicator", lhsCatalogueIndicator), LocatorUtils.property(thatLocator, "catalogueIndicator", rhsCatalogueIndicator), lhsCatalogueIndicator, rhsCatalogueIndicator, (this.catalogueIndicator!= null), (that.catalogueIndicator!= null))) {
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
            HazardousRiskIndicatorType lhsHazardousRiskIndicator;
            lhsHazardousRiskIndicator = this.getHazardousRiskIndicator();
            HazardousRiskIndicatorType rhsHazardousRiskIndicator;
            rhsHazardousRiskIndicator = that.getHazardousRiskIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hazardousRiskIndicator", lhsHazardousRiskIndicator), LocatorUtils.property(thatLocator, "hazardousRiskIndicator", rhsHazardousRiskIndicator), lhsHazardousRiskIndicator, rhsHazardousRiskIndicator, (this.hazardousRiskIndicator!= null), (that.hazardousRiskIndicator!= null))) {
                return false;
            }
        }
        {
            List<AdditionalInformationType> lhsAdditionalInformation;
            lhsAdditionalInformation = (((this.additionalInformation!= null)&&(!this.additionalInformation.isEmpty()))?this.getAdditionalInformation():null);
            List<AdditionalInformationType> rhsAdditionalInformation;
            rhsAdditionalInformation = (((that.additionalInformation!= null)&&(!that.additionalInformation.isEmpty()))?that.getAdditionalInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalInformation", lhsAdditionalInformation), LocatorUtils.property(thatLocator, "additionalInformation", rhsAdditionalInformation), lhsAdditionalInformation, rhsAdditionalInformation, ((this.additionalInformation!= null)&&(!this.additionalInformation.isEmpty())), ((that.additionalInformation!= null)&&(!that.additionalInformation.isEmpty())))) {
                return false;
            }
        }
        {
            List<KeywordType> lhsKeyword;
            lhsKeyword = (((this.keyword!= null)&&(!this.keyword.isEmpty()))?this.getKeyword():null);
            List<KeywordType> rhsKeyword;
            rhsKeyword = (((that.keyword!= null)&&(!that.keyword.isEmpty()))?that.getKeyword():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keyword", lhsKeyword), LocatorUtils.property(thatLocator, "keyword", rhsKeyword), lhsKeyword, rhsKeyword, ((this.keyword!= null)&&(!this.keyword.isEmpty())), ((that.keyword!= null)&&(!that.keyword.isEmpty())))) {
                return false;
            }
        }
        {
            List<BrandNameType> lhsBrandName;
            lhsBrandName = (((this.brandName!= null)&&(!this.brandName.isEmpty()))?this.getBrandName():null);
            List<BrandNameType> rhsBrandName;
            rhsBrandName = (((that.brandName!= null)&&(!that.brandName.isEmpty()))?that.getBrandName():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brandName", lhsBrandName), LocatorUtils.property(thatLocator, "brandName", rhsBrandName), lhsBrandName, rhsBrandName, ((this.brandName!= null)&&(!this.brandName.isEmpty())), ((that.brandName!= null)&&(!that.brandName.isEmpty())))) {
                return false;
            }
        }
        {
            List<ModelNameType> lhsModelName;
            lhsModelName = (((this.modelName!= null)&&(!this.modelName.isEmpty()))?this.getModelName():null);
            List<ModelNameType> rhsModelName;
            rhsModelName = (((that.modelName!= null)&&(!that.modelName.isEmpty()))?that.getModelName():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modelName", lhsModelName), LocatorUtils.property(thatLocator, "modelName", rhsModelName), lhsModelName, rhsModelName, ((this.modelName!= null)&&(!this.modelName.isEmpty())), ((that.modelName!= null)&&(!that.modelName.isEmpty())))) {
                return false;
            }
        }
        {
            ItemIdentificationType lhsBuyersItemIdentification;
            lhsBuyersItemIdentification = this.getBuyersItemIdentification();
            ItemIdentificationType rhsBuyersItemIdentification;
            rhsBuyersItemIdentification = that.getBuyersItemIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buyersItemIdentification", lhsBuyersItemIdentification), LocatorUtils.property(thatLocator, "buyersItemIdentification", rhsBuyersItemIdentification), lhsBuyersItemIdentification, rhsBuyersItemIdentification, (this.buyersItemIdentification!= null), (that.buyersItemIdentification!= null))) {
                return false;
            }
        }
        {
            ItemIdentificationType lhsSellersItemIdentification;
            lhsSellersItemIdentification = this.getSellersItemIdentification();
            ItemIdentificationType rhsSellersItemIdentification;
            rhsSellersItemIdentification = that.getSellersItemIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sellersItemIdentification", lhsSellersItemIdentification), LocatorUtils.property(thatLocator, "sellersItemIdentification", rhsSellersItemIdentification), lhsSellersItemIdentification, rhsSellersItemIdentification, (this.sellersItemIdentification!= null), (that.sellersItemIdentification!= null))) {
                return false;
            }
        }
        {
            List<ItemIdentificationType> lhsManufacturersItemIdentification;
            lhsManufacturersItemIdentification = (((this.manufacturersItemIdentification!= null)&&(!this.manufacturersItemIdentification.isEmpty()))?this.getManufacturersItemIdentification():null);
            List<ItemIdentificationType> rhsManufacturersItemIdentification;
            rhsManufacturersItemIdentification = (((that.manufacturersItemIdentification!= null)&&(!that.manufacturersItemIdentification.isEmpty()))?that.getManufacturersItemIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturersItemIdentification", lhsManufacturersItemIdentification), LocatorUtils.property(thatLocator, "manufacturersItemIdentification", rhsManufacturersItemIdentification), lhsManufacturersItemIdentification, rhsManufacturersItemIdentification, ((this.manufacturersItemIdentification!= null)&&(!this.manufacturersItemIdentification.isEmpty())), ((that.manufacturersItemIdentification!= null)&&(!that.manufacturersItemIdentification.isEmpty())))) {
                return false;
            }
        }
        {
            ItemIdentificationType lhsStandardItemIdentification;
            lhsStandardItemIdentification = this.getStandardItemIdentification();
            ItemIdentificationType rhsStandardItemIdentification;
            rhsStandardItemIdentification = that.getStandardItemIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "standardItemIdentification", lhsStandardItemIdentification), LocatorUtils.property(thatLocator, "standardItemIdentification", rhsStandardItemIdentification), lhsStandardItemIdentification, rhsStandardItemIdentification, (this.standardItemIdentification!= null), (that.standardItemIdentification!= null))) {
                return false;
            }
        }
        {
            ItemIdentificationType lhsCatalogueItemIdentification;
            lhsCatalogueItemIdentification = this.getCatalogueItemIdentification();
            ItemIdentificationType rhsCatalogueItemIdentification;
            rhsCatalogueItemIdentification = that.getCatalogueItemIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "catalogueItemIdentification", lhsCatalogueItemIdentification), LocatorUtils.property(thatLocator, "catalogueItemIdentification", rhsCatalogueItemIdentification), lhsCatalogueItemIdentification, rhsCatalogueItemIdentification, (this.catalogueItemIdentification!= null), (that.catalogueItemIdentification!= null))) {
                return false;
            }
        }
        {
            List<ItemIdentificationType> lhsAdditionalItemIdentification;
            lhsAdditionalItemIdentification = (((this.additionalItemIdentification!= null)&&(!this.additionalItemIdentification.isEmpty()))?this.getAdditionalItemIdentification():null);
            List<ItemIdentificationType> rhsAdditionalItemIdentification;
            rhsAdditionalItemIdentification = (((that.additionalItemIdentification!= null)&&(!that.additionalItemIdentification.isEmpty()))?that.getAdditionalItemIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalItemIdentification", lhsAdditionalItemIdentification), LocatorUtils.property(thatLocator, "additionalItemIdentification", rhsAdditionalItemIdentification), lhsAdditionalItemIdentification, rhsAdditionalItemIdentification, ((this.additionalItemIdentification!= null)&&(!this.additionalItemIdentification.isEmpty())), ((that.additionalItemIdentification!= null)&&(!that.additionalItemIdentification.isEmpty())))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsCatalogueDocumentReference;
            lhsCatalogueDocumentReference = this.getCatalogueDocumentReference();
            DocumentReferenceType rhsCatalogueDocumentReference;
            rhsCatalogueDocumentReference = that.getCatalogueDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "catalogueDocumentReference", lhsCatalogueDocumentReference), LocatorUtils.property(thatLocator, "catalogueDocumentReference", rhsCatalogueDocumentReference), lhsCatalogueDocumentReference, rhsCatalogueDocumentReference, (this.catalogueDocumentReference!= null), (that.catalogueDocumentReference!= null))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsItemSpecificationDocumentReference;
            lhsItemSpecificationDocumentReference = (((this.itemSpecificationDocumentReference!= null)&&(!this.itemSpecificationDocumentReference.isEmpty()))?this.getItemSpecificationDocumentReference():null);
            List<DocumentReferenceType> rhsItemSpecificationDocumentReference;
            rhsItemSpecificationDocumentReference = (((that.itemSpecificationDocumentReference!= null)&&(!that.itemSpecificationDocumentReference.isEmpty()))?that.getItemSpecificationDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemSpecificationDocumentReference", lhsItemSpecificationDocumentReference), LocatorUtils.property(thatLocator, "itemSpecificationDocumentReference", rhsItemSpecificationDocumentReference), lhsItemSpecificationDocumentReference, rhsItemSpecificationDocumentReference, ((this.itemSpecificationDocumentReference!= null)&&(!this.itemSpecificationDocumentReference.isEmpty())), ((that.itemSpecificationDocumentReference!= null)&&(!that.itemSpecificationDocumentReference.isEmpty())))) {
                return false;
            }
        }
        {
            CountryType lhsOriginCountry;
            lhsOriginCountry = this.getOriginCountry();
            CountryType rhsOriginCountry;
            rhsOriginCountry = that.getOriginCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originCountry", lhsOriginCountry), LocatorUtils.property(thatLocator, "originCountry", rhsOriginCountry), lhsOriginCountry, rhsOriginCountry, (this.originCountry!= null), (that.originCountry!= null))) {
                return false;
            }
        }
        {
            List<CommodityClassificationType> lhsCommodityClassification;
            lhsCommodityClassification = (((this.commodityClassification!= null)&&(!this.commodityClassification.isEmpty()))?this.getCommodityClassification():null);
            List<CommodityClassificationType> rhsCommodityClassification;
            rhsCommodityClassification = (((that.commodityClassification!= null)&&(!that.commodityClassification.isEmpty()))?that.getCommodityClassification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commodityClassification", lhsCommodityClassification), LocatorUtils.property(thatLocator, "commodityClassification", rhsCommodityClassification), lhsCommodityClassification, rhsCommodityClassification, ((this.commodityClassification!= null)&&(!this.commodityClassification.isEmpty())), ((that.commodityClassification!= null)&&(!that.commodityClassification.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransactionConditionsType> lhsTransactionConditions;
            lhsTransactionConditions = (((this.transactionConditions!= null)&&(!this.transactionConditions.isEmpty()))?this.getTransactionConditions():null);
            List<TransactionConditionsType> rhsTransactionConditions;
            rhsTransactionConditions = (((that.transactionConditions!= null)&&(!that.transactionConditions.isEmpty()))?that.getTransactionConditions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionConditions", lhsTransactionConditions), LocatorUtils.property(thatLocator, "transactionConditions", rhsTransactionConditions), lhsTransactionConditions, rhsTransactionConditions, ((this.transactionConditions!= null)&&(!this.transactionConditions.isEmpty())), ((that.transactionConditions!= null)&&(!that.transactionConditions.isEmpty())))) {
                return false;
            }
        }
        {
            List<HazardousItemType> lhsHazardousItem;
            lhsHazardousItem = (((this.hazardousItem!= null)&&(!this.hazardousItem.isEmpty()))?this.getHazardousItem():null);
            List<HazardousItemType> rhsHazardousItem;
            rhsHazardousItem = (((that.hazardousItem!= null)&&(!that.hazardousItem.isEmpty()))?that.getHazardousItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hazardousItem", lhsHazardousItem), LocatorUtils.property(thatLocator, "hazardousItem", rhsHazardousItem), lhsHazardousItem, rhsHazardousItem, ((this.hazardousItem!= null)&&(!this.hazardousItem.isEmpty())), ((that.hazardousItem!= null)&&(!that.hazardousItem.isEmpty())))) {
                return false;
            }
        }
        {
            List<TaxCategoryType> lhsClassifiedTaxCategory;
            lhsClassifiedTaxCategory = (((this.classifiedTaxCategory!= null)&&(!this.classifiedTaxCategory.isEmpty()))?this.getClassifiedTaxCategory():null);
            List<TaxCategoryType> rhsClassifiedTaxCategory;
            rhsClassifiedTaxCategory = (((that.classifiedTaxCategory!= null)&&(!that.classifiedTaxCategory.isEmpty()))?that.getClassifiedTaxCategory():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classifiedTaxCategory", lhsClassifiedTaxCategory), LocatorUtils.property(thatLocator, "classifiedTaxCategory", rhsClassifiedTaxCategory), lhsClassifiedTaxCategory, rhsClassifiedTaxCategory, ((this.classifiedTaxCategory!= null)&&(!this.classifiedTaxCategory.isEmpty())), ((that.classifiedTaxCategory!= null)&&(!that.classifiedTaxCategory.isEmpty())))) {
                return false;
            }
        }
        {
            List<ItemPropertyType> lhsAdditionalItemProperty;
            lhsAdditionalItemProperty = (((this.additionalItemProperty!= null)&&(!this.additionalItemProperty.isEmpty()))?this.getAdditionalItemProperty():null);
            List<ItemPropertyType> rhsAdditionalItemProperty;
            rhsAdditionalItemProperty = (((that.additionalItemProperty!= null)&&(!that.additionalItemProperty.isEmpty()))?that.getAdditionalItemProperty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalItemProperty", lhsAdditionalItemProperty), LocatorUtils.property(thatLocator, "additionalItemProperty", rhsAdditionalItemProperty), lhsAdditionalItemProperty, rhsAdditionalItemProperty, ((this.additionalItemProperty!= null)&&(!this.additionalItemProperty.isEmpty())), ((that.additionalItemProperty!= null)&&(!that.additionalItemProperty.isEmpty())))) {
                return false;
            }
        }
        {
            List<PartyType> lhsManufacturerParty;
            lhsManufacturerParty = (((this.manufacturerParty!= null)&&(!this.manufacturerParty.isEmpty()))?this.getManufacturerParty():null);
            List<PartyType> rhsManufacturerParty;
            rhsManufacturerParty = (((that.manufacturerParty!= null)&&(!that.manufacturerParty.isEmpty()))?that.getManufacturerParty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturerParty", lhsManufacturerParty), LocatorUtils.property(thatLocator, "manufacturerParty", rhsManufacturerParty), lhsManufacturerParty, rhsManufacturerParty, ((this.manufacturerParty!= null)&&(!this.manufacturerParty.isEmpty())), ((that.manufacturerParty!= null)&&(!that.manufacturerParty.isEmpty())))) {
                return false;
            }
        }
        {
            PartyType lhsInformationContentProviderParty;
            lhsInformationContentProviderParty = this.getInformationContentProviderParty();
            PartyType rhsInformationContentProviderParty;
            rhsInformationContentProviderParty = that.getInformationContentProviderParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "informationContentProviderParty", lhsInformationContentProviderParty), LocatorUtils.property(thatLocator, "informationContentProviderParty", rhsInformationContentProviderParty), lhsInformationContentProviderParty, rhsInformationContentProviderParty, (this.informationContentProviderParty!= null), (that.informationContentProviderParty!= null))) {
                return false;
            }
        }
        {
            List<AddressType> lhsOriginAddress;
            lhsOriginAddress = (((this.originAddress!= null)&&(!this.originAddress.isEmpty()))?this.getOriginAddress():null);
            List<AddressType> rhsOriginAddress;
            rhsOriginAddress = (((that.originAddress!= null)&&(!that.originAddress.isEmpty()))?that.getOriginAddress():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originAddress", lhsOriginAddress), LocatorUtils.property(thatLocator, "originAddress", rhsOriginAddress), lhsOriginAddress, rhsOriginAddress, ((this.originAddress!= null)&&(!this.originAddress.isEmpty())), ((that.originAddress!= null)&&(!that.originAddress.isEmpty())))) {
                return false;
            }
        }
        {
            List<ItemInstanceType> lhsItemInstance;
            lhsItemInstance = (((this.itemInstance!= null)&&(!this.itemInstance.isEmpty()))?this.getItemInstance():null);
            List<ItemInstanceType> rhsItemInstance;
            rhsItemInstance = (((that.itemInstance!= null)&&(!that.itemInstance.isEmpty()))?that.getItemInstance():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemInstance", lhsItemInstance), LocatorUtils.property(thatLocator, "itemInstance", rhsItemInstance), lhsItemInstance, rhsItemInstance, ((this.itemInstance!= null)&&(!this.itemInstance.isEmpty())), ((that.itemInstance!= null)&&(!that.itemInstance.isEmpty())))) {
                return false;
            }
        }
        {
            List<CertificateType> lhsCertificate;
            lhsCertificate = (((this.certificate!= null)&&(!this.certificate.isEmpty()))?this.getCertificate():null);
            List<CertificateType> rhsCertificate;
            rhsCertificate = (((that.certificate!= null)&&(!that.certificate.isEmpty()))?that.getCertificate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "certificate", lhsCertificate), LocatorUtils.property(thatLocator, "certificate", rhsCertificate), lhsCertificate, rhsCertificate, ((this.certificate!= null)&&(!this.certificate.isEmpty())), ((that.certificate!= null)&&(!that.certificate.isEmpty())))) {
                return false;
            }
        }
        {
            List<DimensionType> lhsDimension;
            lhsDimension = (((this.dimension!= null)&&(!this.dimension.isEmpty()))?this.getDimension():null);
            List<DimensionType> rhsDimension;
            rhsDimension = (((that.dimension!= null)&&(!that.dimension.isEmpty()))?that.getDimension():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dimension", lhsDimension), LocatorUtils.property(thatLocator, "dimension", rhsDimension), lhsDimension, rhsDimension, ((this.dimension!= null)&&(!this.dimension.isEmpty())), ((that.dimension!= null)&&(!that.dimension.isEmpty())))) {
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
            CatalogueIndicatorType theCatalogueIndicator;
            theCatalogueIndicator = this.getCatalogueIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "catalogueIndicator", theCatalogueIndicator), currentHashCode, theCatalogueIndicator, (this.catalogueIndicator!= null));
        }
        {
            NameType theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            HazardousRiskIndicatorType theHazardousRiskIndicator;
            theHazardousRiskIndicator = this.getHazardousRiskIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousRiskIndicator", theHazardousRiskIndicator), currentHashCode, theHazardousRiskIndicator, (this.hazardousRiskIndicator!= null));
        }
        {
            List<AdditionalInformationType> theAdditionalInformation;
            theAdditionalInformation = (((this.additionalInformation!= null)&&(!this.additionalInformation.isEmpty()))?this.getAdditionalInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalInformation", theAdditionalInformation), currentHashCode, theAdditionalInformation, ((this.additionalInformation!= null)&&(!this.additionalInformation.isEmpty())));
        }
        {
            List<KeywordType> theKeyword;
            theKeyword = (((this.keyword!= null)&&(!this.keyword.isEmpty()))?this.getKeyword():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keyword", theKeyword), currentHashCode, theKeyword, ((this.keyword!= null)&&(!this.keyword.isEmpty())));
        }
        {
            List<BrandNameType> theBrandName;
            theBrandName = (((this.brandName!= null)&&(!this.brandName.isEmpty()))?this.getBrandName():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brandName", theBrandName), currentHashCode, theBrandName, ((this.brandName!= null)&&(!this.brandName.isEmpty())));
        }
        {
            List<ModelNameType> theModelName;
            theModelName = (((this.modelName!= null)&&(!this.modelName.isEmpty()))?this.getModelName():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modelName", theModelName), currentHashCode, theModelName, ((this.modelName!= null)&&(!this.modelName.isEmpty())));
        }
        {
            ItemIdentificationType theBuyersItemIdentification;
            theBuyersItemIdentification = this.getBuyersItemIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "buyersItemIdentification", theBuyersItemIdentification), currentHashCode, theBuyersItemIdentification, (this.buyersItemIdentification!= null));
        }
        {
            ItemIdentificationType theSellersItemIdentification;
            theSellersItemIdentification = this.getSellersItemIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sellersItemIdentification", theSellersItemIdentification), currentHashCode, theSellersItemIdentification, (this.sellersItemIdentification!= null));
        }
        {
            List<ItemIdentificationType> theManufacturersItemIdentification;
            theManufacturersItemIdentification = (((this.manufacturersItemIdentification!= null)&&(!this.manufacturersItemIdentification.isEmpty()))?this.getManufacturersItemIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturersItemIdentification", theManufacturersItemIdentification), currentHashCode, theManufacturersItemIdentification, ((this.manufacturersItemIdentification!= null)&&(!this.manufacturersItemIdentification.isEmpty())));
        }
        {
            ItemIdentificationType theStandardItemIdentification;
            theStandardItemIdentification = this.getStandardItemIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "standardItemIdentification", theStandardItemIdentification), currentHashCode, theStandardItemIdentification, (this.standardItemIdentification!= null));
        }
        {
            ItemIdentificationType theCatalogueItemIdentification;
            theCatalogueItemIdentification = this.getCatalogueItemIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "catalogueItemIdentification", theCatalogueItemIdentification), currentHashCode, theCatalogueItemIdentification, (this.catalogueItemIdentification!= null));
        }
        {
            List<ItemIdentificationType> theAdditionalItemIdentification;
            theAdditionalItemIdentification = (((this.additionalItemIdentification!= null)&&(!this.additionalItemIdentification.isEmpty()))?this.getAdditionalItemIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalItemIdentification", theAdditionalItemIdentification), currentHashCode, theAdditionalItemIdentification, ((this.additionalItemIdentification!= null)&&(!this.additionalItemIdentification.isEmpty())));
        }
        {
            DocumentReferenceType theCatalogueDocumentReference;
            theCatalogueDocumentReference = this.getCatalogueDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "catalogueDocumentReference", theCatalogueDocumentReference), currentHashCode, theCatalogueDocumentReference, (this.catalogueDocumentReference!= null));
        }
        {
            List<DocumentReferenceType> theItemSpecificationDocumentReference;
            theItemSpecificationDocumentReference = (((this.itemSpecificationDocumentReference!= null)&&(!this.itemSpecificationDocumentReference.isEmpty()))?this.getItemSpecificationDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemSpecificationDocumentReference", theItemSpecificationDocumentReference), currentHashCode, theItemSpecificationDocumentReference, ((this.itemSpecificationDocumentReference!= null)&&(!this.itemSpecificationDocumentReference.isEmpty())));
        }
        {
            CountryType theOriginCountry;
            theOriginCountry = this.getOriginCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originCountry", theOriginCountry), currentHashCode, theOriginCountry, (this.originCountry!= null));
        }
        {
            List<CommodityClassificationType> theCommodityClassification;
            theCommodityClassification = (((this.commodityClassification!= null)&&(!this.commodityClassification.isEmpty()))?this.getCommodityClassification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commodityClassification", theCommodityClassification), currentHashCode, theCommodityClassification, ((this.commodityClassification!= null)&&(!this.commodityClassification.isEmpty())));
        }
        {
            List<TransactionConditionsType> theTransactionConditions;
            theTransactionConditions = (((this.transactionConditions!= null)&&(!this.transactionConditions.isEmpty()))?this.getTransactionConditions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionConditions", theTransactionConditions), currentHashCode, theTransactionConditions, ((this.transactionConditions!= null)&&(!this.transactionConditions.isEmpty())));
        }
        {
            List<HazardousItemType> theHazardousItem;
            theHazardousItem = (((this.hazardousItem!= null)&&(!this.hazardousItem.isEmpty()))?this.getHazardousItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousItem", theHazardousItem), currentHashCode, theHazardousItem, ((this.hazardousItem!= null)&&(!this.hazardousItem.isEmpty())));
        }
        {
            List<TaxCategoryType> theClassifiedTaxCategory;
            theClassifiedTaxCategory = (((this.classifiedTaxCategory!= null)&&(!this.classifiedTaxCategory.isEmpty()))?this.getClassifiedTaxCategory():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classifiedTaxCategory", theClassifiedTaxCategory), currentHashCode, theClassifiedTaxCategory, ((this.classifiedTaxCategory!= null)&&(!this.classifiedTaxCategory.isEmpty())));
        }
        {
            List<ItemPropertyType> theAdditionalItemProperty;
            theAdditionalItemProperty = (((this.additionalItemProperty!= null)&&(!this.additionalItemProperty.isEmpty()))?this.getAdditionalItemProperty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalItemProperty", theAdditionalItemProperty), currentHashCode, theAdditionalItemProperty, ((this.additionalItemProperty!= null)&&(!this.additionalItemProperty.isEmpty())));
        }
        {
            List<PartyType> theManufacturerParty;
            theManufacturerParty = (((this.manufacturerParty!= null)&&(!this.manufacturerParty.isEmpty()))?this.getManufacturerParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturerParty", theManufacturerParty), currentHashCode, theManufacturerParty, ((this.manufacturerParty!= null)&&(!this.manufacturerParty.isEmpty())));
        }
        {
            PartyType theInformationContentProviderParty;
            theInformationContentProviderParty = this.getInformationContentProviderParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "informationContentProviderParty", theInformationContentProviderParty), currentHashCode, theInformationContentProviderParty, (this.informationContentProviderParty!= null));
        }
        {
            List<AddressType> theOriginAddress;
            theOriginAddress = (((this.originAddress!= null)&&(!this.originAddress.isEmpty()))?this.getOriginAddress():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originAddress", theOriginAddress), currentHashCode, theOriginAddress, ((this.originAddress!= null)&&(!this.originAddress.isEmpty())));
        }
        {
            List<ItemInstanceType> theItemInstance;
            theItemInstance = (((this.itemInstance!= null)&&(!this.itemInstance.isEmpty()))?this.getItemInstance():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemInstance", theItemInstance), currentHashCode, theItemInstance, ((this.itemInstance!= null)&&(!this.itemInstance.isEmpty())));
        }
        {
            List<CertificateType> theCertificate;
            theCertificate = (((this.certificate!= null)&&(!this.certificate.isEmpty()))?this.getCertificate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "certificate", theCertificate), currentHashCode, theCertificate, ((this.certificate!= null)&&(!this.certificate.isEmpty())));
        }
        {
            List<DimensionType> theDimension;
            theDimension = (((this.dimension!= null)&&(!this.dimension.isEmpty()))?this.getDimension():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dimension", theDimension), currentHashCode, theDimension, ((this.dimension!= null)&&(!this.dimension.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
