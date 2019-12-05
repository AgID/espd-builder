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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EstimatedAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxIncludedIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UUIDType;
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
 * <p>Classe Java per RequestForTenderLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RequestForTenderLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxIncludedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredItemLocationQuantity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubRequestForTenderLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestForTenderLineType", propOrder = {
    "id",
    "uuid",
    "note",
    "quantity",
    "minimumQuantity",
    "maximumQuantity",
    "taxIncludedIndicator",
    "minimumAmount",
    "maximumAmount",
    "estimatedAmount",
    "documentReference",
    "deliveryPeriod",
    "requiredItemLocationQuantity",
    "warrantyValidityPeriod",
    "item",
    "subRequestForTenderLine"
})
public class RequestForTenderLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUIDType uuid;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QuantityType quantity;
    @XmlElement(name = "MinimumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumQuantityType minimumQuantity;
    @XmlElement(name = "MaximumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumQuantityType maximumQuantity;
    @XmlElement(name = "TaxIncludedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxIncludedIndicatorType taxIncludedIndicator;
    @XmlElement(name = "MinimumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumAmountType minimumAmount;
    @XmlElement(name = "MaximumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumAmountType maximumAmount;
    @XmlElement(name = "EstimatedAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EstimatedAmountType estimatedAmount;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "DeliveryPeriod")
    protected List<PeriodType> deliveryPeriod;
    @XmlElement(name = "RequiredItemLocationQuantity")
    protected List<ItemLocationQuantityType> requiredItemLocationQuantity;
    @XmlElement(name = "WarrantyValidityPeriod")
    protected PeriodType warrantyValidityPeriod;
    @XmlElement(name = "Item", required = true)
    protected ItemType item;
    @XmlElement(name = "SubRequestForTenderLine")
    protected List<RequestForTenderLineType> subRequestForTenderLine;

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
     * Recupera il valore della proprietà uuid.
     * 
     * @return
     *     possible object is
     *     {@link UUIDType }
     *     
     */
    public UUIDType getUUID() {
        return uuid;
    }

    /**
     * Imposta il valore della proprietà uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link UUIDType }
     *     
     */
    public void setUUID(UUIDType value) {
        this.uuid = value;
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
     * Recupera il valore della proprietà taxIncludedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncludedIndicatorType }
     *     
     */
    public TaxIncludedIndicatorType getTaxIncludedIndicator() {
        return taxIncludedIndicator;
    }

    /**
     * Imposta il valore della proprietà taxIncludedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncludedIndicatorType }
     *     
     */
    public void setTaxIncludedIndicator(TaxIncludedIndicatorType value) {
        this.taxIncludedIndicator = value;
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
     * Recupera il valore della proprietà estimatedAmount.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedAmountType }
     *     
     */
    public EstimatedAmountType getEstimatedAmount() {
        return estimatedAmount;
    }

    /**
     * Imposta il valore della proprietà estimatedAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedAmountType }
     *     
     */
    public void setEstimatedAmount(EstimatedAmountType value) {
        this.estimatedAmount = value;
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
     * Gets the value of the deliveryPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getDeliveryPeriod() {
        if (deliveryPeriod == null) {
            deliveryPeriod = new ArrayList<PeriodType>();
        }
        return this.deliveryPeriod;
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
     * Gets the value of the subRequestForTenderLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subRequestForTenderLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubRequestForTenderLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestForTenderLineType }
     * 
     * 
     */
    public List<RequestForTenderLineType> getSubRequestForTenderLine() {
        if (subRequestForTenderLine == null) {
            subRequestForTenderLine = new ArrayList<RequestForTenderLineType>();
        }
        return this.subRequestForTenderLine;
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
            UUIDType theUUID;
            theUUID = this.getUUID();
            strategy.appendField(locator, this, "uuid", buffer, theUUID, (this.uuid!= null));
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
            TaxIncludedIndicatorType theTaxIncludedIndicator;
            theTaxIncludedIndicator = this.getTaxIncludedIndicator();
            strategy.appendField(locator, this, "taxIncludedIndicator", buffer, theTaxIncludedIndicator, (this.taxIncludedIndicator!= null));
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
            EstimatedAmountType theEstimatedAmount;
            theEstimatedAmount = this.getEstimatedAmount();
            strategy.appendField(locator, this, "estimatedAmount", buffer, theEstimatedAmount, (this.estimatedAmount!= null));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            strategy.appendField(locator, this, "documentReference", buffer, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            List<PeriodType> theDeliveryPeriod;
            theDeliveryPeriod = (((this.deliveryPeriod!= null)&&(!this.deliveryPeriod.isEmpty()))?this.getDeliveryPeriod():null);
            strategy.appendField(locator, this, "deliveryPeriod", buffer, theDeliveryPeriod, ((this.deliveryPeriod!= null)&&(!this.deliveryPeriod.isEmpty())));
        }
        {
            List<ItemLocationQuantityType> theRequiredItemLocationQuantity;
            theRequiredItemLocationQuantity = (((this.requiredItemLocationQuantity!= null)&&(!this.requiredItemLocationQuantity.isEmpty()))?this.getRequiredItemLocationQuantity():null);
            strategy.appendField(locator, this, "requiredItemLocationQuantity", buffer, theRequiredItemLocationQuantity, ((this.requiredItemLocationQuantity!= null)&&(!this.requiredItemLocationQuantity.isEmpty())));
        }
        {
            PeriodType theWarrantyValidityPeriod;
            theWarrantyValidityPeriod = this.getWarrantyValidityPeriod();
            strategy.appendField(locator, this, "warrantyValidityPeriod", buffer, theWarrantyValidityPeriod, (this.warrantyValidityPeriod!= null));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            strategy.appendField(locator, this, "item", buffer, theItem, (this.item!= null));
        }
        {
            List<RequestForTenderLineType> theSubRequestForTenderLine;
            theSubRequestForTenderLine = (((this.subRequestForTenderLine!= null)&&(!this.subRequestForTenderLine.isEmpty()))?this.getSubRequestForTenderLine():null);
            strategy.appendField(locator, this, "subRequestForTenderLine", buffer, theSubRequestForTenderLine, ((this.subRequestForTenderLine!= null)&&(!this.subRequestForTenderLine.isEmpty())));
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
        final RequestForTenderLineType that = ((RequestForTenderLineType) object);
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
            UUIDType lhsUUID;
            lhsUUID = this.getUUID();
            UUIDType rhsUUID;
            rhsUUID = that.getUUID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uuid", lhsUUID), LocatorUtils.property(thatLocator, "uuid", rhsUUID), lhsUUID, rhsUUID, (this.uuid!= null), (that.uuid!= null))) {
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
            TaxIncludedIndicatorType lhsTaxIncludedIndicator;
            lhsTaxIncludedIndicator = this.getTaxIncludedIndicator();
            TaxIncludedIndicatorType rhsTaxIncludedIndicator;
            rhsTaxIncludedIndicator = that.getTaxIncludedIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxIncludedIndicator", lhsTaxIncludedIndicator), LocatorUtils.property(thatLocator, "taxIncludedIndicator", rhsTaxIncludedIndicator), lhsTaxIncludedIndicator, rhsTaxIncludedIndicator, (this.taxIncludedIndicator!= null), (that.taxIncludedIndicator!= null))) {
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
            EstimatedAmountType lhsEstimatedAmount;
            lhsEstimatedAmount = this.getEstimatedAmount();
            EstimatedAmountType rhsEstimatedAmount;
            rhsEstimatedAmount = that.getEstimatedAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedAmount", lhsEstimatedAmount), LocatorUtils.property(thatLocator, "estimatedAmount", rhsEstimatedAmount), lhsEstimatedAmount, rhsEstimatedAmount, (this.estimatedAmount!= null), (that.estimatedAmount!= null))) {
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
            List<PeriodType> lhsDeliveryPeriod;
            lhsDeliveryPeriod = (((this.deliveryPeriod!= null)&&(!this.deliveryPeriod.isEmpty()))?this.getDeliveryPeriod():null);
            List<PeriodType> rhsDeliveryPeriod;
            rhsDeliveryPeriod = (((that.deliveryPeriod!= null)&&(!that.deliveryPeriod.isEmpty()))?that.getDeliveryPeriod():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryPeriod", lhsDeliveryPeriod), LocatorUtils.property(thatLocator, "deliveryPeriod", rhsDeliveryPeriod), lhsDeliveryPeriod, rhsDeliveryPeriod, ((this.deliveryPeriod!= null)&&(!this.deliveryPeriod.isEmpty())), ((that.deliveryPeriod!= null)&&(!that.deliveryPeriod.isEmpty())))) {
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
            PeriodType lhsWarrantyValidityPeriod;
            lhsWarrantyValidityPeriod = this.getWarrantyValidityPeriod();
            PeriodType rhsWarrantyValidityPeriod;
            rhsWarrantyValidityPeriod = that.getWarrantyValidityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyValidityPeriod", lhsWarrantyValidityPeriod), LocatorUtils.property(thatLocator, "warrantyValidityPeriod", rhsWarrantyValidityPeriod), lhsWarrantyValidityPeriod, rhsWarrantyValidityPeriod, (this.warrantyValidityPeriod!= null), (that.warrantyValidityPeriod!= null))) {
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
            List<RequestForTenderLineType> lhsSubRequestForTenderLine;
            lhsSubRequestForTenderLine = (((this.subRequestForTenderLine!= null)&&(!this.subRequestForTenderLine.isEmpty()))?this.getSubRequestForTenderLine():null);
            List<RequestForTenderLineType> rhsSubRequestForTenderLine;
            rhsSubRequestForTenderLine = (((that.subRequestForTenderLine!= null)&&(!that.subRequestForTenderLine.isEmpty()))?that.getSubRequestForTenderLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subRequestForTenderLine", lhsSubRequestForTenderLine), LocatorUtils.property(thatLocator, "subRequestForTenderLine", rhsSubRequestForTenderLine), lhsSubRequestForTenderLine, rhsSubRequestForTenderLine, ((this.subRequestForTenderLine!= null)&&(!this.subRequestForTenderLine.isEmpty())), ((that.subRequestForTenderLine!= null)&&(!that.subRequestForTenderLine.isEmpty())))) {
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
            UUIDType theUUID;
            theUUID = this.getUUID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uuid", theUUID), currentHashCode, theUUID, (this.uuid!= null));
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
            TaxIncludedIndicatorType theTaxIncludedIndicator;
            theTaxIncludedIndicator = this.getTaxIncludedIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxIncludedIndicator", theTaxIncludedIndicator), currentHashCode, theTaxIncludedIndicator, (this.taxIncludedIndicator!= null));
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
            EstimatedAmountType theEstimatedAmount;
            theEstimatedAmount = this.getEstimatedAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedAmount", theEstimatedAmount), currentHashCode, theEstimatedAmount, (this.estimatedAmount!= null));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentReference", theDocumentReference), currentHashCode, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            List<PeriodType> theDeliveryPeriod;
            theDeliveryPeriod = (((this.deliveryPeriod!= null)&&(!this.deliveryPeriod.isEmpty()))?this.getDeliveryPeriod():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryPeriod", theDeliveryPeriod), currentHashCode, theDeliveryPeriod, ((this.deliveryPeriod!= null)&&(!this.deliveryPeriod.isEmpty())));
        }
        {
            List<ItemLocationQuantityType> theRequiredItemLocationQuantity;
            theRequiredItemLocationQuantity = (((this.requiredItemLocationQuantity!= null)&&(!this.requiredItemLocationQuantity.isEmpty()))?this.getRequiredItemLocationQuantity():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requiredItemLocationQuantity", theRequiredItemLocationQuantity), currentHashCode, theRequiredItemLocationQuantity, ((this.requiredItemLocationQuantity!= null)&&(!this.requiredItemLocationQuantity.isEmpty())));
        }
        {
            PeriodType theWarrantyValidityPeriod;
            theWarrantyValidityPeriod = this.getWarrantyValidityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyValidityPeriod", theWarrantyValidityPeriod), currentHashCode, theWarrantyValidityPeriod, (this.warrantyValidityPeriod!= null));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "item", theItem), currentHashCode, theItem, (this.item!= null));
        }
        {
            List<RequestForTenderLineType> theSubRequestForTenderLine;
            theSubRequestForTenderLine = (((this.subRequestForTenderLine!= null)&&(!this.subRequestForTenderLine.isEmpty()))?this.getSubRequestForTenderLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subRequestForTenderLine", theSubRequestForTenderLine), currentHashCode, theSubRequestForTenderLine, ((this.subRequestForTenderLine!= null)&&(!this.subRequestForTenderLine.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
