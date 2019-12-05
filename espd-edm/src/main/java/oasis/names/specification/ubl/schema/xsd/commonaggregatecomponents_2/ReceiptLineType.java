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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OversupplyQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityDiscrepancyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReceivedDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReceivedQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RejectActionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RejectReasonCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RejectReasonType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RejectedQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ShortQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ShortageActionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TimingComplaintCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TimingComplaintType;
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
 * <p>Classe Java per ReceiptLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ReceiptLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShortQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShortageActionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RejectedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RejectReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RejectReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RejectActionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}QuantityDiscrepancyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OversupplyQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimingComplaintCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimingComplaint" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OrderLineReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchLineReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ReceiptLineType", propOrder = {
    "id",
    "uuid",
    "note",
    "receivedQuantity",
    "shortQuantity",
    "shortageActionCode",
    "rejectedQuantity",
    "rejectReasonCode",
    "rejectReason",
    "rejectActionCode",
    "quantityDiscrepancyCode",
    "oversupplyQuantity",
    "receivedDate",
    "timingComplaintCode",
    "timingComplaint",
    "orderLineReference",
    "despatchLineReference",
    "documentReference",
    "item",
    "shipment"
})
public class ReceiptLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUIDType uuid;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "ReceivedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReceivedQuantityType receivedQuantity;
    @XmlElement(name = "ShortQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ShortQuantityType shortQuantity;
    @XmlElement(name = "ShortageActionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ShortageActionCodeType shortageActionCode;
    @XmlElement(name = "RejectedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RejectedQuantityType rejectedQuantity;
    @XmlElement(name = "RejectReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RejectReasonCodeType rejectReasonCode;
    @XmlElement(name = "RejectReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<RejectReasonType> rejectReason;
    @XmlElement(name = "RejectActionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RejectActionCodeType rejectActionCode;
    @XmlElement(name = "QuantityDiscrepancyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QuantityDiscrepancyCodeType quantityDiscrepancyCode;
    @XmlElement(name = "OversupplyQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OversupplyQuantityType oversupplyQuantity;
    @XmlElement(name = "ReceivedDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReceivedDateType receivedDate;
    @XmlElement(name = "TimingComplaintCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TimingComplaintCodeType timingComplaintCode;
    @XmlElement(name = "TimingComplaint", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TimingComplaintType timingComplaint;
    @XmlElement(name = "OrderLineReference")
    protected OrderLineReferenceType orderLineReference;
    @XmlElement(name = "DespatchLineReference")
    protected List<LineReferenceType> despatchLineReference;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "Item")
    protected List<ItemType> item;
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
     * Recupera il valore della proprietà receivedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedQuantityType }
     *     
     */
    public ReceivedQuantityType getReceivedQuantity() {
        return receivedQuantity;
    }

    /**
     * Imposta il valore della proprietà receivedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedQuantityType }
     *     
     */
    public void setReceivedQuantity(ReceivedQuantityType value) {
        this.receivedQuantity = value;
    }

    /**
     * Recupera il valore della proprietà shortQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ShortQuantityType }
     *     
     */
    public ShortQuantityType getShortQuantity() {
        return shortQuantity;
    }

    /**
     * Imposta il valore della proprietà shortQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortQuantityType }
     *     
     */
    public void setShortQuantity(ShortQuantityType value) {
        this.shortQuantity = value;
    }

    /**
     * Recupera il valore della proprietà shortageActionCode.
     * 
     * @return
     *     possible object is
     *     {@link ShortageActionCodeType }
     *     
     */
    public ShortageActionCodeType getShortageActionCode() {
        return shortageActionCode;
    }

    /**
     * Imposta il valore della proprietà shortageActionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortageActionCodeType }
     *     
     */
    public void setShortageActionCode(ShortageActionCodeType value) {
        this.shortageActionCode = value;
    }

    /**
     * Recupera il valore della proprietà rejectedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link RejectedQuantityType }
     *     
     */
    public RejectedQuantityType getRejectedQuantity() {
        return rejectedQuantity;
    }

    /**
     * Imposta il valore della proprietà rejectedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedQuantityType }
     *     
     */
    public void setRejectedQuantity(RejectedQuantityType value) {
        this.rejectedQuantity = value;
    }

    /**
     * Recupera il valore della proprietà rejectReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link RejectReasonCodeType }
     *     
     */
    public RejectReasonCodeType getRejectReasonCode() {
        return rejectReasonCode;
    }

    /**
     * Imposta il valore della proprietà rejectReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectReasonCodeType }
     *     
     */
    public void setRejectReasonCode(RejectReasonCodeType value) {
        this.rejectReasonCode = value;
    }

    /**
     * Gets the value of the rejectReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejectReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejectReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectReasonType }
     * 
     * 
     */
    public List<RejectReasonType> getRejectReason() {
        if (rejectReason == null) {
            rejectReason = new ArrayList<RejectReasonType>();
        }
        return this.rejectReason;
    }

    /**
     * Recupera il valore della proprietà rejectActionCode.
     * 
     * @return
     *     possible object is
     *     {@link RejectActionCodeType }
     *     
     */
    public RejectActionCodeType getRejectActionCode() {
        return rejectActionCode;
    }

    /**
     * Imposta il valore della proprietà rejectActionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectActionCodeType }
     *     
     */
    public void setRejectActionCode(RejectActionCodeType value) {
        this.rejectActionCode = value;
    }

    /**
     * Recupera il valore della proprietà quantityDiscrepancyCode.
     * 
     * @return
     *     possible object is
     *     {@link QuantityDiscrepancyCodeType }
     *     
     */
    public QuantityDiscrepancyCodeType getQuantityDiscrepancyCode() {
        return quantityDiscrepancyCode;
    }

    /**
     * Imposta il valore della proprietà quantityDiscrepancyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityDiscrepancyCodeType }
     *     
     */
    public void setQuantityDiscrepancyCode(QuantityDiscrepancyCodeType value) {
        this.quantityDiscrepancyCode = value;
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
     * Recupera il valore della proprietà receivedDate.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedDateType }
     *     
     */
    public ReceivedDateType getReceivedDate() {
        return receivedDate;
    }

    /**
     * Imposta il valore della proprietà receivedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedDateType }
     *     
     */
    public void setReceivedDate(ReceivedDateType value) {
        this.receivedDate = value;
    }

    /**
     * Recupera il valore della proprietà timingComplaintCode.
     * 
     * @return
     *     possible object is
     *     {@link TimingComplaintCodeType }
     *     
     */
    public TimingComplaintCodeType getTimingComplaintCode() {
        return timingComplaintCode;
    }

    /**
     * Imposta il valore della proprietà timingComplaintCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingComplaintCodeType }
     *     
     */
    public void setTimingComplaintCode(TimingComplaintCodeType value) {
        this.timingComplaintCode = value;
    }

    /**
     * Recupera il valore della proprietà timingComplaint.
     * 
     * @return
     *     possible object is
     *     {@link TimingComplaintType }
     *     
     */
    public TimingComplaintType getTimingComplaint() {
        return timingComplaint;
    }

    /**
     * Imposta il valore della proprietà timingComplaint.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingComplaintType }
     *     
     */
    public void setTimingComplaint(TimingComplaintType value) {
        this.timingComplaint = value;
    }

    /**
     * Recupera il valore della proprietà orderLineReference.
     * 
     * @return
     *     possible object is
     *     {@link OrderLineReferenceType }
     *     
     */
    public OrderLineReferenceType getOrderLineReference() {
        return orderLineReference;
    }

    /**
     * Imposta il valore della proprietà orderLineReference.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLineReferenceType }
     *     
     */
    public void setOrderLineReference(OrderLineReferenceType value) {
        this.orderLineReference = value;
    }

    /**
     * Gets the value of the despatchLineReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the despatchLineReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDespatchLineReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineReferenceType }
     * 
     * 
     */
    public List<LineReferenceType> getDespatchLineReference() {
        if (despatchLineReference == null) {
            despatchLineReference = new ArrayList<LineReferenceType>();
        }
        return this.despatchLineReference;
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
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType }
     * 
     * 
     */
    public List<ItemType> getItem() {
        if (item == null) {
            item = new ArrayList<ItemType>();
        }
        return this.item;
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
            ReceivedQuantityType theReceivedQuantity;
            theReceivedQuantity = this.getReceivedQuantity();
            strategy.appendField(locator, this, "receivedQuantity", buffer, theReceivedQuantity, (this.receivedQuantity!= null));
        }
        {
            ShortQuantityType theShortQuantity;
            theShortQuantity = this.getShortQuantity();
            strategy.appendField(locator, this, "shortQuantity", buffer, theShortQuantity, (this.shortQuantity!= null));
        }
        {
            ShortageActionCodeType theShortageActionCode;
            theShortageActionCode = this.getShortageActionCode();
            strategy.appendField(locator, this, "shortageActionCode", buffer, theShortageActionCode, (this.shortageActionCode!= null));
        }
        {
            RejectedQuantityType theRejectedQuantity;
            theRejectedQuantity = this.getRejectedQuantity();
            strategy.appendField(locator, this, "rejectedQuantity", buffer, theRejectedQuantity, (this.rejectedQuantity!= null));
        }
        {
            RejectReasonCodeType theRejectReasonCode;
            theRejectReasonCode = this.getRejectReasonCode();
            strategy.appendField(locator, this, "rejectReasonCode", buffer, theRejectReasonCode, (this.rejectReasonCode!= null));
        }
        {
            List<RejectReasonType> theRejectReason;
            theRejectReason = (((this.rejectReason!= null)&&(!this.rejectReason.isEmpty()))?this.getRejectReason():null);
            strategy.appendField(locator, this, "rejectReason", buffer, theRejectReason, ((this.rejectReason!= null)&&(!this.rejectReason.isEmpty())));
        }
        {
            RejectActionCodeType theRejectActionCode;
            theRejectActionCode = this.getRejectActionCode();
            strategy.appendField(locator, this, "rejectActionCode", buffer, theRejectActionCode, (this.rejectActionCode!= null));
        }
        {
            QuantityDiscrepancyCodeType theQuantityDiscrepancyCode;
            theQuantityDiscrepancyCode = this.getQuantityDiscrepancyCode();
            strategy.appendField(locator, this, "quantityDiscrepancyCode", buffer, theQuantityDiscrepancyCode, (this.quantityDiscrepancyCode!= null));
        }
        {
            OversupplyQuantityType theOversupplyQuantity;
            theOversupplyQuantity = this.getOversupplyQuantity();
            strategy.appendField(locator, this, "oversupplyQuantity", buffer, theOversupplyQuantity, (this.oversupplyQuantity!= null));
        }
        {
            ReceivedDateType theReceivedDate;
            theReceivedDate = this.getReceivedDate();
            strategy.appendField(locator, this, "receivedDate", buffer, theReceivedDate, (this.receivedDate!= null));
        }
        {
            TimingComplaintCodeType theTimingComplaintCode;
            theTimingComplaintCode = this.getTimingComplaintCode();
            strategy.appendField(locator, this, "timingComplaintCode", buffer, theTimingComplaintCode, (this.timingComplaintCode!= null));
        }
        {
            TimingComplaintType theTimingComplaint;
            theTimingComplaint = this.getTimingComplaint();
            strategy.appendField(locator, this, "timingComplaint", buffer, theTimingComplaint, (this.timingComplaint!= null));
        }
        {
            OrderLineReferenceType theOrderLineReference;
            theOrderLineReference = this.getOrderLineReference();
            strategy.appendField(locator, this, "orderLineReference", buffer, theOrderLineReference, (this.orderLineReference!= null));
        }
        {
            List<LineReferenceType> theDespatchLineReference;
            theDespatchLineReference = (((this.despatchLineReference!= null)&&(!this.despatchLineReference.isEmpty()))?this.getDespatchLineReference():null);
            strategy.appendField(locator, this, "despatchLineReference", buffer, theDespatchLineReference, ((this.despatchLineReference!= null)&&(!this.despatchLineReference.isEmpty())));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            strategy.appendField(locator, this, "documentReference", buffer, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            List<ItemType> theItem;
            theItem = (((this.item!= null)&&(!this.item.isEmpty()))?this.getItem():null);
            strategy.appendField(locator, this, "item", buffer, theItem, ((this.item!= null)&&(!this.item.isEmpty())));
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
        final ReceiptLineType that = ((ReceiptLineType) object);
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
            ReceivedQuantityType lhsReceivedQuantity;
            lhsReceivedQuantity = this.getReceivedQuantity();
            ReceivedQuantityType rhsReceivedQuantity;
            rhsReceivedQuantity = that.getReceivedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivedQuantity", lhsReceivedQuantity), LocatorUtils.property(thatLocator, "receivedQuantity", rhsReceivedQuantity), lhsReceivedQuantity, rhsReceivedQuantity, (this.receivedQuantity!= null), (that.receivedQuantity!= null))) {
                return false;
            }
        }
        {
            ShortQuantityType lhsShortQuantity;
            lhsShortQuantity = this.getShortQuantity();
            ShortQuantityType rhsShortQuantity;
            rhsShortQuantity = that.getShortQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shortQuantity", lhsShortQuantity), LocatorUtils.property(thatLocator, "shortQuantity", rhsShortQuantity), lhsShortQuantity, rhsShortQuantity, (this.shortQuantity!= null), (that.shortQuantity!= null))) {
                return false;
            }
        }
        {
            ShortageActionCodeType lhsShortageActionCode;
            lhsShortageActionCode = this.getShortageActionCode();
            ShortageActionCodeType rhsShortageActionCode;
            rhsShortageActionCode = that.getShortageActionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shortageActionCode", lhsShortageActionCode), LocatorUtils.property(thatLocator, "shortageActionCode", rhsShortageActionCode), lhsShortageActionCode, rhsShortageActionCode, (this.shortageActionCode!= null), (that.shortageActionCode!= null))) {
                return false;
            }
        }
        {
            RejectedQuantityType lhsRejectedQuantity;
            lhsRejectedQuantity = this.getRejectedQuantity();
            RejectedQuantityType rhsRejectedQuantity;
            rhsRejectedQuantity = that.getRejectedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rejectedQuantity", lhsRejectedQuantity), LocatorUtils.property(thatLocator, "rejectedQuantity", rhsRejectedQuantity), lhsRejectedQuantity, rhsRejectedQuantity, (this.rejectedQuantity!= null), (that.rejectedQuantity!= null))) {
                return false;
            }
        }
        {
            RejectReasonCodeType lhsRejectReasonCode;
            lhsRejectReasonCode = this.getRejectReasonCode();
            RejectReasonCodeType rhsRejectReasonCode;
            rhsRejectReasonCode = that.getRejectReasonCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rejectReasonCode", lhsRejectReasonCode), LocatorUtils.property(thatLocator, "rejectReasonCode", rhsRejectReasonCode), lhsRejectReasonCode, rhsRejectReasonCode, (this.rejectReasonCode!= null), (that.rejectReasonCode!= null))) {
                return false;
            }
        }
        {
            List<RejectReasonType> lhsRejectReason;
            lhsRejectReason = (((this.rejectReason!= null)&&(!this.rejectReason.isEmpty()))?this.getRejectReason():null);
            List<RejectReasonType> rhsRejectReason;
            rhsRejectReason = (((that.rejectReason!= null)&&(!that.rejectReason.isEmpty()))?that.getRejectReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rejectReason", lhsRejectReason), LocatorUtils.property(thatLocator, "rejectReason", rhsRejectReason), lhsRejectReason, rhsRejectReason, ((this.rejectReason!= null)&&(!this.rejectReason.isEmpty())), ((that.rejectReason!= null)&&(!that.rejectReason.isEmpty())))) {
                return false;
            }
        }
        {
            RejectActionCodeType lhsRejectActionCode;
            lhsRejectActionCode = this.getRejectActionCode();
            RejectActionCodeType rhsRejectActionCode;
            rhsRejectActionCode = that.getRejectActionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rejectActionCode", lhsRejectActionCode), LocatorUtils.property(thatLocator, "rejectActionCode", rhsRejectActionCode), lhsRejectActionCode, rhsRejectActionCode, (this.rejectActionCode!= null), (that.rejectActionCode!= null))) {
                return false;
            }
        }
        {
            QuantityDiscrepancyCodeType lhsQuantityDiscrepancyCode;
            lhsQuantityDiscrepancyCode = this.getQuantityDiscrepancyCode();
            QuantityDiscrepancyCodeType rhsQuantityDiscrepancyCode;
            rhsQuantityDiscrepancyCode = that.getQuantityDiscrepancyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantityDiscrepancyCode", lhsQuantityDiscrepancyCode), LocatorUtils.property(thatLocator, "quantityDiscrepancyCode", rhsQuantityDiscrepancyCode), lhsQuantityDiscrepancyCode, rhsQuantityDiscrepancyCode, (this.quantityDiscrepancyCode!= null), (that.quantityDiscrepancyCode!= null))) {
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
            ReceivedDateType lhsReceivedDate;
            lhsReceivedDate = this.getReceivedDate();
            ReceivedDateType rhsReceivedDate;
            rhsReceivedDate = that.getReceivedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivedDate", lhsReceivedDate), LocatorUtils.property(thatLocator, "receivedDate", rhsReceivedDate), lhsReceivedDate, rhsReceivedDate, (this.receivedDate!= null), (that.receivedDate!= null))) {
                return false;
            }
        }
        {
            TimingComplaintCodeType lhsTimingComplaintCode;
            lhsTimingComplaintCode = this.getTimingComplaintCode();
            TimingComplaintCodeType rhsTimingComplaintCode;
            rhsTimingComplaintCode = that.getTimingComplaintCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timingComplaintCode", lhsTimingComplaintCode), LocatorUtils.property(thatLocator, "timingComplaintCode", rhsTimingComplaintCode), lhsTimingComplaintCode, rhsTimingComplaintCode, (this.timingComplaintCode!= null), (that.timingComplaintCode!= null))) {
                return false;
            }
        }
        {
            TimingComplaintType lhsTimingComplaint;
            lhsTimingComplaint = this.getTimingComplaint();
            TimingComplaintType rhsTimingComplaint;
            rhsTimingComplaint = that.getTimingComplaint();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timingComplaint", lhsTimingComplaint), LocatorUtils.property(thatLocator, "timingComplaint", rhsTimingComplaint), lhsTimingComplaint, rhsTimingComplaint, (this.timingComplaint!= null), (that.timingComplaint!= null))) {
                return false;
            }
        }
        {
            OrderLineReferenceType lhsOrderLineReference;
            lhsOrderLineReference = this.getOrderLineReference();
            OrderLineReferenceType rhsOrderLineReference;
            rhsOrderLineReference = that.getOrderLineReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderLineReference", lhsOrderLineReference), LocatorUtils.property(thatLocator, "orderLineReference", rhsOrderLineReference), lhsOrderLineReference, rhsOrderLineReference, (this.orderLineReference!= null), (that.orderLineReference!= null))) {
                return false;
            }
        }
        {
            List<LineReferenceType> lhsDespatchLineReference;
            lhsDespatchLineReference = (((this.despatchLineReference!= null)&&(!this.despatchLineReference.isEmpty()))?this.getDespatchLineReference():null);
            List<LineReferenceType> rhsDespatchLineReference;
            rhsDespatchLineReference = (((that.despatchLineReference!= null)&&(!that.despatchLineReference.isEmpty()))?that.getDespatchLineReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "despatchLineReference", lhsDespatchLineReference), LocatorUtils.property(thatLocator, "despatchLineReference", rhsDespatchLineReference), lhsDespatchLineReference, rhsDespatchLineReference, ((this.despatchLineReference!= null)&&(!this.despatchLineReference.isEmpty())), ((that.despatchLineReference!= null)&&(!that.despatchLineReference.isEmpty())))) {
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
            List<ItemType> lhsItem;
            lhsItem = (((this.item!= null)&&(!this.item.isEmpty()))?this.getItem():null);
            List<ItemType> rhsItem;
            rhsItem = (((that.item!= null)&&(!that.item.isEmpty()))?that.getItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "item", lhsItem), LocatorUtils.property(thatLocator, "item", rhsItem), lhsItem, rhsItem, ((this.item!= null)&&(!this.item.isEmpty())), ((that.item!= null)&&(!that.item.isEmpty())))) {
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
            ReceivedQuantityType theReceivedQuantity;
            theReceivedQuantity = this.getReceivedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivedQuantity", theReceivedQuantity), currentHashCode, theReceivedQuantity, (this.receivedQuantity!= null));
        }
        {
            ShortQuantityType theShortQuantity;
            theShortQuantity = this.getShortQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shortQuantity", theShortQuantity), currentHashCode, theShortQuantity, (this.shortQuantity!= null));
        }
        {
            ShortageActionCodeType theShortageActionCode;
            theShortageActionCode = this.getShortageActionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shortageActionCode", theShortageActionCode), currentHashCode, theShortageActionCode, (this.shortageActionCode!= null));
        }
        {
            RejectedQuantityType theRejectedQuantity;
            theRejectedQuantity = this.getRejectedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rejectedQuantity", theRejectedQuantity), currentHashCode, theRejectedQuantity, (this.rejectedQuantity!= null));
        }
        {
            RejectReasonCodeType theRejectReasonCode;
            theRejectReasonCode = this.getRejectReasonCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rejectReasonCode", theRejectReasonCode), currentHashCode, theRejectReasonCode, (this.rejectReasonCode!= null));
        }
        {
            List<RejectReasonType> theRejectReason;
            theRejectReason = (((this.rejectReason!= null)&&(!this.rejectReason.isEmpty()))?this.getRejectReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rejectReason", theRejectReason), currentHashCode, theRejectReason, ((this.rejectReason!= null)&&(!this.rejectReason.isEmpty())));
        }
        {
            RejectActionCodeType theRejectActionCode;
            theRejectActionCode = this.getRejectActionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rejectActionCode", theRejectActionCode), currentHashCode, theRejectActionCode, (this.rejectActionCode!= null));
        }
        {
            QuantityDiscrepancyCodeType theQuantityDiscrepancyCode;
            theQuantityDiscrepancyCode = this.getQuantityDiscrepancyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantityDiscrepancyCode", theQuantityDiscrepancyCode), currentHashCode, theQuantityDiscrepancyCode, (this.quantityDiscrepancyCode!= null));
        }
        {
            OversupplyQuantityType theOversupplyQuantity;
            theOversupplyQuantity = this.getOversupplyQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oversupplyQuantity", theOversupplyQuantity), currentHashCode, theOversupplyQuantity, (this.oversupplyQuantity!= null));
        }
        {
            ReceivedDateType theReceivedDate;
            theReceivedDate = this.getReceivedDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivedDate", theReceivedDate), currentHashCode, theReceivedDate, (this.receivedDate!= null));
        }
        {
            TimingComplaintCodeType theTimingComplaintCode;
            theTimingComplaintCode = this.getTimingComplaintCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timingComplaintCode", theTimingComplaintCode), currentHashCode, theTimingComplaintCode, (this.timingComplaintCode!= null));
        }
        {
            TimingComplaintType theTimingComplaint;
            theTimingComplaint = this.getTimingComplaint();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timingComplaint", theTimingComplaint), currentHashCode, theTimingComplaint, (this.timingComplaint!= null));
        }
        {
            OrderLineReferenceType theOrderLineReference;
            theOrderLineReference = this.getOrderLineReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderLineReference", theOrderLineReference), currentHashCode, theOrderLineReference, (this.orderLineReference!= null));
        }
        {
            List<LineReferenceType> theDespatchLineReference;
            theDespatchLineReference = (((this.despatchLineReference!= null)&&(!this.despatchLineReference.isEmpty()))?this.getDespatchLineReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "despatchLineReference", theDespatchLineReference), currentHashCode, theDespatchLineReference, ((this.despatchLineReference!= null)&&(!this.despatchLineReference.isEmpty())));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentReference", theDocumentReference), currentHashCode, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            List<ItemType> theItem;
            theItem = (((this.item!= null)&&(!this.item.isEmpty()))?this.getItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "item", theItem), currentHashCode, theItem, ((this.item!= null)&&(!this.item.isEmpty())));
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
