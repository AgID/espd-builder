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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ContentUnitQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineExtensionAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumOrderQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumOrderQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OrderQuantityIncrementNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OrderableUnitType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PackLevelCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalTaxAmountType;
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
 * <p>Classe Java per TenderLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TenderLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineExtensionAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalTaxAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderableUnit" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContentUnitQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderQuantityIncrementNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumOrderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumOrderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WarrantyInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OfferedItemLocationQuantity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReplacementRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubTenderLine" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TenderLineType", propOrder = {
    "id",
    "note",
    "quantity",
    "lineExtensionAmount",
    "totalTaxAmount",
    "orderableUnit",
    "contentUnitQuantity",
    "orderQuantityIncrementNumeric",
    "minimumOrderQuantity",
    "maximumOrderQuantity",
    "warrantyInformation",
    "packLevelCode",
    "documentReference",
    "item",
    "offeredItemLocationQuantity",
    "replacementRelatedItem",
    "warrantyParty",
    "warrantyValidityPeriod",
    "subTenderLine",
    "callForTendersLineReference",
    "callForTendersDocumentReference"
})
public class TenderLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QuantityType quantity;
    @XmlElement(name = "LineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LineExtensionAmountType lineExtensionAmount;
    @XmlElement(name = "TotalTaxAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalTaxAmountType totalTaxAmount;
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
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "Item")
    protected ItemType item;
    @XmlElement(name = "OfferedItemLocationQuantity")
    protected List<ItemLocationQuantityType> offeredItemLocationQuantity;
    @XmlElement(name = "ReplacementRelatedItem")
    protected List<RelatedItemType> replacementRelatedItem;
    @XmlElement(name = "WarrantyParty")
    protected PartyType warrantyParty;
    @XmlElement(name = "WarrantyValidityPeriod")
    protected PeriodType warrantyValidityPeriod;
    @XmlElement(name = "SubTenderLine")
    protected List<TenderLineType> subTenderLine;
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
     * Recupera il valore della proprietà quantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantity() {
        return quantity;
    }

    /**
     * Imposta il valore della proprietà quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantity(QuantityType value) {
        this.quantity = value;
    }

    /**
     * Recupera il valore della proprietà lineExtensionAmount.
     * 
     * @return
     *     possible object is
     *     {@link LineExtensionAmountType }
     *     
     */
    public LineExtensionAmountType getLineExtensionAmount() {
        return lineExtensionAmount;
    }

    /**
     * Imposta il valore della proprietà lineExtensionAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link LineExtensionAmountType }
     *     
     */
    public void setLineExtensionAmount(LineExtensionAmountType value) {
        this.lineExtensionAmount = value;
    }

    /**
     * Recupera il valore della proprietà totalTaxAmount.
     * 
     * @return
     *     possible object is
     *     {@link TotalTaxAmountType }
     *     
     */
    public TotalTaxAmountType getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Imposta il valore della proprietà totalTaxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTaxAmountType }
     *     
     */
    public void setTotalTaxAmount(TotalTaxAmountType value) {
        this.totalTaxAmount = value;
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
     * Gets the value of the offeredItemLocationQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offeredItemLocationQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferedItemLocationQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemLocationQuantityType }
     * 
     * 
     */
    public List<ItemLocationQuantityType> getOfferedItemLocationQuantity() {
        if (offeredItemLocationQuantity == null) {
            offeredItemLocationQuantity = new ArrayList<ItemLocationQuantityType>();
        }
        return this.offeredItemLocationQuantity;
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
     * Gets the value of the subTenderLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subTenderLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubTenderLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderLineType }
     * 
     * 
     */
    public List<TenderLineType> getSubTenderLine() {
        if (subTenderLine == null) {
            subTenderLine = new ArrayList<TenderLineType>();
        }
        return this.subTenderLine;
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
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            strategy.appendField(locator, this, "note", buffer, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity, (this.quantity!= null));
        }
        {
            LineExtensionAmountType theLineExtensionAmount;
            theLineExtensionAmount = this.getLineExtensionAmount();
            strategy.appendField(locator, this, "lineExtensionAmount", buffer, theLineExtensionAmount, (this.lineExtensionAmount!= null));
        }
        {
            TotalTaxAmountType theTotalTaxAmount;
            theTotalTaxAmount = this.getTotalTaxAmount();
            strategy.appendField(locator, this, "totalTaxAmount", buffer, theTotalTaxAmount, (this.totalTaxAmount!= null));
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
            List<ItemLocationQuantityType> theOfferedItemLocationQuantity;
            theOfferedItemLocationQuantity = (((this.offeredItemLocationQuantity!= null)&&(!this.offeredItemLocationQuantity.isEmpty()))?this.getOfferedItemLocationQuantity():null);
            strategy.appendField(locator, this, "offeredItemLocationQuantity", buffer, theOfferedItemLocationQuantity, ((this.offeredItemLocationQuantity!= null)&&(!this.offeredItemLocationQuantity.isEmpty())));
        }
        {
            List<RelatedItemType> theReplacementRelatedItem;
            theReplacementRelatedItem = (((this.replacementRelatedItem!= null)&&(!this.replacementRelatedItem.isEmpty()))?this.getReplacementRelatedItem():null);
            strategy.appendField(locator, this, "replacementRelatedItem", buffer, theReplacementRelatedItem, ((this.replacementRelatedItem!= null)&&(!this.replacementRelatedItem.isEmpty())));
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
            List<TenderLineType> theSubTenderLine;
            theSubTenderLine = (((this.subTenderLine!= null)&&(!this.subTenderLine.isEmpty()))?this.getSubTenderLine():null);
            strategy.appendField(locator, this, "subTenderLine", buffer, theSubTenderLine, ((this.subTenderLine!= null)&&(!this.subTenderLine.isEmpty())));
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
        final TenderLineType that = ((TenderLineType) object);
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
            List<NoteType> lhsNote;
            lhsNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            List<NoteType> rhsNote;
            rhsNote = (((that.note!= null)&&(!that.note.isEmpty()))?that.getNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote, ((this.note!= null)&&(!this.note.isEmpty())), ((that.note!= null)&&(!that.note.isEmpty())))) {
                return false;
            }
        }
        {
            QuantityType lhsQuantity;
            lhsQuantity = this.getQuantity();
            QuantityType rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity, (this.quantity!= null), (that.quantity!= null))) {
                return false;
            }
        }
        {
            LineExtensionAmountType lhsLineExtensionAmount;
            lhsLineExtensionAmount = this.getLineExtensionAmount();
            LineExtensionAmountType rhsLineExtensionAmount;
            rhsLineExtensionAmount = that.getLineExtensionAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineExtensionAmount", lhsLineExtensionAmount), LocatorUtils.property(thatLocator, "lineExtensionAmount", rhsLineExtensionAmount), lhsLineExtensionAmount, rhsLineExtensionAmount, (this.lineExtensionAmount!= null), (that.lineExtensionAmount!= null))) {
                return false;
            }
        }
        {
            TotalTaxAmountType lhsTotalTaxAmount;
            lhsTotalTaxAmount = this.getTotalTaxAmount();
            TotalTaxAmountType rhsTotalTaxAmount;
            rhsTotalTaxAmount = that.getTotalTaxAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalTaxAmount", lhsTotalTaxAmount), LocatorUtils.property(thatLocator, "totalTaxAmount", rhsTotalTaxAmount), lhsTotalTaxAmount, rhsTotalTaxAmount, (this.totalTaxAmount!= null), (that.totalTaxAmount!= null))) {
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
            List<ItemLocationQuantityType> lhsOfferedItemLocationQuantity;
            lhsOfferedItemLocationQuantity = (((this.offeredItemLocationQuantity!= null)&&(!this.offeredItemLocationQuantity.isEmpty()))?this.getOfferedItemLocationQuantity():null);
            List<ItemLocationQuantityType> rhsOfferedItemLocationQuantity;
            rhsOfferedItemLocationQuantity = (((that.offeredItemLocationQuantity!= null)&&(!that.offeredItemLocationQuantity.isEmpty()))?that.getOfferedItemLocationQuantity():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "offeredItemLocationQuantity", lhsOfferedItemLocationQuantity), LocatorUtils.property(thatLocator, "offeredItemLocationQuantity", rhsOfferedItemLocationQuantity), lhsOfferedItemLocationQuantity, rhsOfferedItemLocationQuantity, ((this.offeredItemLocationQuantity!= null)&&(!this.offeredItemLocationQuantity.isEmpty())), ((that.offeredItemLocationQuantity!= null)&&(!that.offeredItemLocationQuantity.isEmpty())))) {
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
            List<TenderLineType> lhsSubTenderLine;
            lhsSubTenderLine = (((this.subTenderLine!= null)&&(!this.subTenderLine.isEmpty()))?this.getSubTenderLine():null);
            List<TenderLineType> rhsSubTenderLine;
            rhsSubTenderLine = (((that.subTenderLine!= null)&&(!that.subTenderLine.isEmpty()))?that.getSubTenderLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subTenderLine", lhsSubTenderLine), LocatorUtils.property(thatLocator, "subTenderLine", rhsSubTenderLine), lhsSubTenderLine, rhsSubTenderLine, ((this.subTenderLine!= null)&&(!this.subTenderLine.isEmpty())), ((that.subTenderLine!= null)&&(!that.subTenderLine.isEmpty())))) {
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
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, (this.quantity!= null));
        }
        {
            LineExtensionAmountType theLineExtensionAmount;
            theLineExtensionAmount = this.getLineExtensionAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineExtensionAmount", theLineExtensionAmount), currentHashCode, theLineExtensionAmount, (this.lineExtensionAmount!= null));
        }
        {
            TotalTaxAmountType theTotalTaxAmount;
            theTotalTaxAmount = this.getTotalTaxAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalTaxAmount", theTotalTaxAmount), currentHashCode, theTotalTaxAmount, (this.totalTaxAmount!= null));
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
            List<ItemLocationQuantityType> theOfferedItemLocationQuantity;
            theOfferedItemLocationQuantity = (((this.offeredItemLocationQuantity!= null)&&(!this.offeredItemLocationQuantity.isEmpty()))?this.getOfferedItemLocationQuantity():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "offeredItemLocationQuantity", theOfferedItemLocationQuantity), currentHashCode, theOfferedItemLocationQuantity, ((this.offeredItemLocationQuantity!= null)&&(!this.offeredItemLocationQuantity.isEmpty())));
        }
        {
            List<RelatedItemType> theReplacementRelatedItem;
            theReplacementRelatedItem = (((this.replacementRelatedItem!= null)&&(!this.replacementRelatedItem.isEmpty()))?this.getReplacementRelatedItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replacementRelatedItem", theReplacementRelatedItem), currentHashCode, theReplacementRelatedItem, ((this.replacementRelatedItem!= null)&&(!this.replacementRelatedItem.isEmpty())));
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
            List<TenderLineType> theSubTenderLine;
            theSubTenderLine = (((this.subTenderLine!= null)&&(!this.subTenderLine.isEmpty()))?this.getSubTenderLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subTenderLine", theSubTenderLine), currentHashCode, theSubTenderLine, ((this.subTenderLine!= null)&&(!this.subTenderLine.isEmpty())));
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
