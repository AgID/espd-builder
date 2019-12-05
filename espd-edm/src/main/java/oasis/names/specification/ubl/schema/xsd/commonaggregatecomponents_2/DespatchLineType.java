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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BackorderQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BackorderReasonType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DeliveredQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineStatusCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OutstandingQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OutstandingReasonType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OversupplyQuantityType;
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
 * <p>Classe Java per DespatchLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DespatchLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeliveredQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BackorderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BackorderReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OutstandingQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OutstandingReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OversupplyQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OrderLineReference" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Shipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DespatchLineType", propOrder = {
    "id",
    "uuid",
    "note",
    "lineStatusCode",
    "deliveredQuantity",
    "backorderQuantity",
    "backorderReason",
    "outstandingQuantity",
    "outstandingReason",
    "oversupplyQuantity",
    "orderLineReference",
    "documentReference",
    "item",
    "shipment"
})
public class DespatchLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUIDType uuid;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "LineStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LineStatusCodeType lineStatusCode;
    @XmlElement(name = "DeliveredQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeliveredQuantityType deliveredQuantity;
    @XmlElement(name = "BackorderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BackorderQuantityType backorderQuantity;
    @XmlElement(name = "BackorderReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<BackorderReasonType> backorderReason;
    @XmlElement(name = "OutstandingQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OutstandingQuantityType outstandingQuantity;
    @XmlElement(name = "OutstandingReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<OutstandingReasonType> outstandingReason;
    @XmlElement(name = "OversupplyQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OversupplyQuantityType oversupplyQuantity;
    @XmlElement(name = "OrderLineReference", required = true)
    protected List<OrderLineReferenceType> orderLineReference;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "Item", required = true)
    protected ItemType item;
    @XmlElement(name = "Shipment")
    protected List<ShipmentType> shipment;

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
     * Recupera il valore della proprietà lineStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link LineStatusCodeType }
     *     
     */
    public LineStatusCodeType getLineStatusCode() {
        return lineStatusCode;
    }

    /**
     * Imposta il valore della proprietà lineStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStatusCodeType }
     *     
     */
    public void setLineStatusCode(LineStatusCodeType value) {
        this.lineStatusCode = value;
    }

    /**
     * Recupera il valore della proprietà deliveredQuantity.
     * 
     * @return
     *     possible object is
     *     {@link DeliveredQuantityType }
     *     
     */
    public DeliveredQuantityType getDeliveredQuantity() {
        return deliveredQuantity;
    }

    /**
     * Imposta il valore della proprietà deliveredQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveredQuantityType }
     *     
     */
    public void setDeliveredQuantity(DeliveredQuantityType value) {
        this.deliveredQuantity = value;
    }

    /**
     * Recupera il valore della proprietà backorderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BackorderQuantityType }
     *     
     */
    public BackorderQuantityType getBackorderQuantity() {
        return backorderQuantity;
    }

    /**
     * Imposta il valore della proprietà backorderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BackorderQuantityType }
     *     
     */
    public void setBackorderQuantity(BackorderQuantityType value) {
        this.backorderQuantity = value;
    }

    /**
     * Gets the value of the backorderReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backorderReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackorderReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BackorderReasonType }
     * 
     * 
     */
    public List<BackorderReasonType> getBackorderReason() {
        if (backorderReason == null) {
            backorderReason = new ArrayList<BackorderReasonType>();
        }
        return this.backorderReason;
    }

    /**
     * Recupera il valore della proprietà outstandingQuantity.
     * 
     * @return
     *     possible object is
     *     {@link OutstandingQuantityType }
     *     
     */
    public OutstandingQuantityType getOutstandingQuantity() {
        return outstandingQuantity;
    }

    /**
     * Imposta il valore della proprietà outstandingQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link OutstandingQuantityType }
     *     
     */
    public void setOutstandingQuantity(OutstandingQuantityType value) {
        this.outstandingQuantity = value;
    }

    /**
     * Gets the value of the outstandingReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outstandingReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutstandingReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutstandingReasonType }
     * 
     * 
     */
    public List<OutstandingReasonType> getOutstandingReason() {
        if (outstandingReason == null) {
            outstandingReason = new ArrayList<OutstandingReasonType>();
        }
        return this.outstandingReason;
    }

    /**
     * Recupera il valore della proprietà oversupplyQuantity.
     * 
     * @return
     *     possible object is
     *     {@link OversupplyQuantityType }
     *     
     */
    public OversupplyQuantityType getOversupplyQuantity() {
        return oversupplyQuantity;
    }

    /**
     * Imposta il valore della proprietà oversupplyQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link OversupplyQuantityType }
     *     
     */
    public void setOversupplyQuantity(OversupplyQuantityType value) {
        this.oversupplyQuantity = value;
    }

    /**
     * Gets the value of the orderLineReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderLineReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderLineReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderLineReferenceType }
     * 
     * 
     */
    public List<OrderLineReferenceType> getOrderLineReference() {
        if (orderLineReference == null) {
            orderLineReference = new ArrayList<OrderLineReferenceType>();
        }
        return this.orderLineReference;
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
     * Gets the value of the shipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentType }
     * 
     * 
     */
    public List<ShipmentType> getShipment() {
        if (shipment == null) {
            shipment = new ArrayList<ShipmentType>();
        }
        return this.shipment;
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
            LineStatusCodeType theLineStatusCode;
            theLineStatusCode = this.getLineStatusCode();
            strategy.appendField(locator, this, "lineStatusCode", buffer, theLineStatusCode, (this.lineStatusCode!= null));
        }
        {
            DeliveredQuantityType theDeliveredQuantity;
            theDeliveredQuantity = this.getDeliveredQuantity();
            strategy.appendField(locator, this, "deliveredQuantity", buffer, theDeliveredQuantity, (this.deliveredQuantity!= null));
        }
        {
            BackorderQuantityType theBackorderQuantity;
            theBackorderQuantity = this.getBackorderQuantity();
            strategy.appendField(locator, this, "backorderQuantity", buffer, theBackorderQuantity, (this.backorderQuantity!= null));
        }
        {
            List<BackorderReasonType> theBackorderReason;
            theBackorderReason = (((this.backorderReason!= null)&&(!this.backorderReason.isEmpty()))?this.getBackorderReason():null);
            strategy.appendField(locator, this, "backorderReason", buffer, theBackorderReason, ((this.backorderReason!= null)&&(!this.backorderReason.isEmpty())));
        }
        {
            OutstandingQuantityType theOutstandingQuantity;
            theOutstandingQuantity = this.getOutstandingQuantity();
            strategy.appendField(locator, this, "outstandingQuantity", buffer, theOutstandingQuantity, (this.outstandingQuantity!= null));
        }
        {
            List<OutstandingReasonType> theOutstandingReason;
            theOutstandingReason = (((this.outstandingReason!= null)&&(!this.outstandingReason.isEmpty()))?this.getOutstandingReason():null);
            strategy.appendField(locator, this, "outstandingReason", buffer, theOutstandingReason, ((this.outstandingReason!= null)&&(!this.outstandingReason.isEmpty())));
        }
        {
            OversupplyQuantityType theOversupplyQuantity;
            theOversupplyQuantity = this.getOversupplyQuantity();
            strategy.appendField(locator, this, "oversupplyQuantity", buffer, theOversupplyQuantity, (this.oversupplyQuantity!= null));
        }
        {
            List<OrderLineReferenceType> theOrderLineReference;
            theOrderLineReference = (((this.orderLineReference!= null)&&(!this.orderLineReference.isEmpty()))?this.getOrderLineReference():null);
            strategy.appendField(locator, this, "orderLineReference", buffer, theOrderLineReference, ((this.orderLineReference!= null)&&(!this.orderLineReference.isEmpty())));
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
            List<ShipmentType> theShipment;
            theShipment = (((this.shipment!= null)&&(!this.shipment.isEmpty()))?this.getShipment():null);
            strategy.appendField(locator, this, "shipment", buffer, theShipment, ((this.shipment!= null)&&(!this.shipment.isEmpty())));
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
        final DespatchLineType that = ((DespatchLineType) object);
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
            LineStatusCodeType lhsLineStatusCode;
            lhsLineStatusCode = this.getLineStatusCode();
            LineStatusCodeType rhsLineStatusCode;
            rhsLineStatusCode = that.getLineStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineStatusCode", lhsLineStatusCode), LocatorUtils.property(thatLocator, "lineStatusCode", rhsLineStatusCode), lhsLineStatusCode, rhsLineStatusCode, (this.lineStatusCode!= null), (that.lineStatusCode!= null))) {
                return false;
            }
        }
        {
            DeliveredQuantityType lhsDeliveredQuantity;
            lhsDeliveredQuantity = this.getDeliveredQuantity();
            DeliveredQuantityType rhsDeliveredQuantity;
            rhsDeliveredQuantity = that.getDeliveredQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveredQuantity", lhsDeliveredQuantity), LocatorUtils.property(thatLocator, "deliveredQuantity", rhsDeliveredQuantity), lhsDeliveredQuantity, rhsDeliveredQuantity, (this.deliveredQuantity!= null), (that.deliveredQuantity!= null))) {
                return false;
            }
        }
        {
            BackorderQuantityType lhsBackorderQuantity;
            lhsBackorderQuantity = this.getBackorderQuantity();
            BackorderQuantityType rhsBackorderQuantity;
            rhsBackorderQuantity = that.getBackorderQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "backorderQuantity", lhsBackorderQuantity), LocatorUtils.property(thatLocator, "backorderQuantity", rhsBackorderQuantity), lhsBackorderQuantity, rhsBackorderQuantity, (this.backorderQuantity!= null), (that.backorderQuantity!= null))) {
                return false;
            }
        }
        {
            List<BackorderReasonType> lhsBackorderReason;
            lhsBackorderReason = (((this.backorderReason!= null)&&(!this.backorderReason.isEmpty()))?this.getBackorderReason():null);
            List<BackorderReasonType> rhsBackorderReason;
            rhsBackorderReason = (((that.backorderReason!= null)&&(!that.backorderReason.isEmpty()))?that.getBackorderReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "backorderReason", lhsBackorderReason), LocatorUtils.property(thatLocator, "backorderReason", rhsBackorderReason), lhsBackorderReason, rhsBackorderReason, ((this.backorderReason!= null)&&(!this.backorderReason.isEmpty())), ((that.backorderReason!= null)&&(!that.backorderReason.isEmpty())))) {
                return false;
            }
        }
        {
            OutstandingQuantityType lhsOutstandingQuantity;
            lhsOutstandingQuantity = this.getOutstandingQuantity();
            OutstandingQuantityType rhsOutstandingQuantity;
            rhsOutstandingQuantity = that.getOutstandingQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outstandingQuantity", lhsOutstandingQuantity), LocatorUtils.property(thatLocator, "outstandingQuantity", rhsOutstandingQuantity), lhsOutstandingQuantity, rhsOutstandingQuantity, (this.outstandingQuantity!= null), (that.outstandingQuantity!= null))) {
                return false;
            }
        }
        {
            List<OutstandingReasonType> lhsOutstandingReason;
            lhsOutstandingReason = (((this.outstandingReason!= null)&&(!this.outstandingReason.isEmpty()))?this.getOutstandingReason():null);
            List<OutstandingReasonType> rhsOutstandingReason;
            rhsOutstandingReason = (((that.outstandingReason!= null)&&(!that.outstandingReason.isEmpty()))?that.getOutstandingReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "outstandingReason", lhsOutstandingReason), LocatorUtils.property(thatLocator, "outstandingReason", rhsOutstandingReason), lhsOutstandingReason, rhsOutstandingReason, ((this.outstandingReason!= null)&&(!this.outstandingReason.isEmpty())), ((that.outstandingReason!= null)&&(!that.outstandingReason.isEmpty())))) {
                return false;
            }
        }
        {
            OversupplyQuantityType lhsOversupplyQuantity;
            lhsOversupplyQuantity = this.getOversupplyQuantity();
            OversupplyQuantityType rhsOversupplyQuantity;
            rhsOversupplyQuantity = that.getOversupplyQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oversupplyQuantity", lhsOversupplyQuantity), LocatorUtils.property(thatLocator, "oversupplyQuantity", rhsOversupplyQuantity), lhsOversupplyQuantity, rhsOversupplyQuantity, (this.oversupplyQuantity!= null), (that.oversupplyQuantity!= null))) {
                return false;
            }
        }
        {
            List<OrderLineReferenceType> lhsOrderLineReference;
            lhsOrderLineReference = (((this.orderLineReference!= null)&&(!this.orderLineReference.isEmpty()))?this.getOrderLineReference():null);
            List<OrderLineReferenceType> rhsOrderLineReference;
            rhsOrderLineReference = (((that.orderLineReference!= null)&&(!that.orderLineReference.isEmpty()))?that.getOrderLineReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderLineReference", lhsOrderLineReference), LocatorUtils.property(thatLocator, "orderLineReference", rhsOrderLineReference), lhsOrderLineReference, rhsOrderLineReference, ((this.orderLineReference!= null)&&(!this.orderLineReference.isEmpty())), ((that.orderLineReference!= null)&&(!that.orderLineReference.isEmpty())))) {
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
            List<ShipmentType> lhsShipment;
            lhsShipment = (((this.shipment!= null)&&(!this.shipment.isEmpty()))?this.getShipment():null);
            List<ShipmentType> rhsShipment;
            rhsShipment = (((that.shipment!= null)&&(!that.shipment.isEmpty()))?that.getShipment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipment", lhsShipment), LocatorUtils.property(thatLocator, "shipment", rhsShipment), lhsShipment, rhsShipment, ((this.shipment!= null)&&(!this.shipment.isEmpty())), ((that.shipment!= null)&&(!that.shipment.isEmpty())))) {
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
            LineStatusCodeType theLineStatusCode;
            theLineStatusCode = this.getLineStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineStatusCode", theLineStatusCode), currentHashCode, theLineStatusCode, (this.lineStatusCode!= null));
        }
        {
            DeliveredQuantityType theDeliveredQuantity;
            theDeliveredQuantity = this.getDeliveredQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveredQuantity", theDeliveredQuantity), currentHashCode, theDeliveredQuantity, (this.deliveredQuantity!= null));
        }
        {
            BackorderQuantityType theBackorderQuantity;
            theBackorderQuantity = this.getBackorderQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "backorderQuantity", theBackorderQuantity), currentHashCode, theBackorderQuantity, (this.backorderQuantity!= null));
        }
        {
            List<BackorderReasonType> theBackorderReason;
            theBackorderReason = (((this.backorderReason!= null)&&(!this.backorderReason.isEmpty()))?this.getBackorderReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "backorderReason", theBackorderReason), currentHashCode, theBackorderReason, ((this.backorderReason!= null)&&(!this.backorderReason.isEmpty())));
        }
        {
            OutstandingQuantityType theOutstandingQuantity;
            theOutstandingQuantity = this.getOutstandingQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outstandingQuantity", theOutstandingQuantity), currentHashCode, theOutstandingQuantity, (this.outstandingQuantity!= null));
        }
        {
            List<OutstandingReasonType> theOutstandingReason;
            theOutstandingReason = (((this.outstandingReason!= null)&&(!this.outstandingReason.isEmpty()))?this.getOutstandingReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outstandingReason", theOutstandingReason), currentHashCode, theOutstandingReason, ((this.outstandingReason!= null)&&(!this.outstandingReason.isEmpty())));
        }
        {
            OversupplyQuantityType theOversupplyQuantity;
            theOversupplyQuantity = this.getOversupplyQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oversupplyQuantity", theOversupplyQuantity), currentHashCode, theOversupplyQuantity, (this.oversupplyQuantity!= null));
        }
        {
            List<OrderLineReferenceType> theOrderLineReference;
            theOrderLineReference = (((this.orderLineReference!= null)&&(!this.orderLineReference.isEmpty()))?this.getOrderLineReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderLineReference", theOrderLineReference), currentHashCode, theOrderLineReference, ((this.orderLineReference!= null)&&(!this.orderLineReference.isEmpty())));
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
            List<ShipmentType> theShipment;
            theShipment = (((this.shipment!= null)&&(!this.shipment.isEmpty()))?this.getShipment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipment", theShipment), currentHashCode, theShipment, ((this.shipment!= null)&&(!this.shipment.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
