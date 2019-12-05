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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineExtensionAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequestForQuotationLineIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalTaxAmountType;
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
 * <p>Classe Java per QuotationLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="QuotationLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineExtensionAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalTaxAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequestForQuotationLineID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LineItem"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerProposedSubstituteLineItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AlternativeLineItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestLineReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotationLineType", propOrder = {
    "id",
    "note",
    "quantity",
    "lineExtensionAmount",
    "totalTaxAmount",
    "requestForQuotationLineID",
    "documentReference",
    "lineItem",
    "sellerProposedSubstituteLineItem",
    "alternativeLineItem",
    "requestLineReference"
})
public class QuotationLineType implements Serializable, Equals2, HashCode2, ToString2
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
    @XmlElement(name = "RequestForQuotationLineID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequestForQuotationLineIDType requestForQuotationLineID;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "LineItem", required = true)
    protected LineItemType lineItem;
    @XmlElement(name = "SellerProposedSubstituteLineItem")
    protected List<LineItemType> sellerProposedSubstituteLineItem;
    @XmlElement(name = "AlternativeLineItem")
    protected List<LineItemType> alternativeLineItem;
    @XmlElement(name = "RequestLineReference")
    protected LineReferenceType requestLineReference;

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
     * Recupera il valore della proprietà requestForQuotationLineID.
     * 
     * @return
     *     possible object is
     *     {@link RequestForQuotationLineIDType }
     *     
     */
    public RequestForQuotationLineIDType getRequestForQuotationLineID() {
        return requestForQuotationLineID;
    }

    /**
     * Imposta il valore della proprietà requestForQuotationLineID.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForQuotationLineIDType }
     *     
     */
    public void setRequestForQuotationLineID(RequestForQuotationLineIDType value) {
        this.requestForQuotationLineID = value;
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
     * Recupera il valore della proprietà lineItem.
     * 
     * @return
     *     possible object is
     *     {@link LineItemType }
     *     
     */
    public LineItemType getLineItem() {
        return lineItem;
    }

    /**
     * Imposta il valore della proprietà lineItem.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemType }
     *     
     */
    public void setLineItem(LineItemType value) {
        this.lineItem = value;
    }

    /**
     * Gets the value of the sellerProposedSubstituteLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellerProposedSubstituteLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellerProposedSubstituteLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemType }
     * 
     * 
     */
    public List<LineItemType> getSellerProposedSubstituteLineItem() {
        if (sellerProposedSubstituteLineItem == null) {
            sellerProposedSubstituteLineItem = new ArrayList<LineItemType>();
        }
        return this.sellerProposedSubstituteLineItem;
    }

    /**
     * Gets the value of the alternativeLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemType }
     * 
     * 
     */
    public List<LineItemType> getAlternativeLineItem() {
        if (alternativeLineItem == null) {
            alternativeLineItem = new ArrayList<LineItemType>();
        }
        return this.alternativeLineItem;
    }

    /**
     * Recupera il valore della proprietà requestLineReference.
     * 
     * @return
     *     possible object is
     *     {@link LineReferenceType }
     *     
     */
    public LineReferenceType getRequestLineReference() {
        return requestLineReference;
    }

    /**
     * Imposta il valore della proprietà requestLineReference.
     * 
     * @param value
     *     allowed object is
     *     {@link LineReferenceType }
     *     
     */
    public void setRequestLineReference(LineReferenceType value) {
        this.requestLineReference = value;
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
            RequestForQuotationLineIDType theRequestForQuotationLineID;
            theRequestForQuotationLineID = this.getRequestForQuotationLineID();
            strategy.appendField(locator, this, "requestForQuotationLineID", buffer, theRequestForQuotationLineID, (this.requestForQuotationLineID!= null));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            strategy.appendField(locator, this, "documentReference", buffer, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            LineItemType theLineItem;
            theLineItem = this.getLineItem();
            strategy.appendField(locator, this, "lineItem", buffer, theLineItem, (this.lineItem!= null));
        }
        {
            List<LineItemType> theSellerProposedSubstituteLineItem;
            theSellerProposedSubstituteLineItem = (((this.sellerProposedSubstituteLineItem!= null)&&(!this.sellerProposedSubstituteLineItem.isEmpty()))?this.getSellerProposedSubstituteLineItem():null);
            strategy.appendField(locator, this, "sellerProposedSubstituteLineItem", buffer, theSellerProposedSubstituteLineItem, ((this.sellerProposedSubstituteLineItem!= null)&&(!this.sellerProposedSubstituteLineItem.isEmpty())));
        }
        {
            List<LineItemType> theAlternativeLineItem;
            theAlternativeLineItem = (((this.alternativeLineItem!= null)&&(!this.alternativeLineItem.isEmpty()))?this.getAlternativeLineItem():null);
            strategy.appendField(locator, this, "alternativeLineItem", buffer, theAlternativeLineItem, ((this.alternativeLineItem!= null)&&(!this.alternativeLineItem.isEmpty())));
        }
        {
            LineReferenceType theRequestLineReference;
            theRequestLineReference = this.getRequestLineReference();
            strategy.appendField(locator, this, "requestLineReference", buffer, theRequestLineReference, (this.requestLineReference!= null));
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
        final QuotationLineType that = ((QuotationLineType) object);
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
            RequestForQuotationLineIDType lhsRequestForQuotationLineID;
            lhsRequestForQuotationLineID = this.getRequestForQuotationLineID();
            RequestForQuotationLineIDType rhsRequestForQuotationLineID;
            rhsRequestForQuotationLineID = that.getRequestForQuotationLineID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestForQuotationLineID", lhsRequestForQuotationLineID), LocatorUtils.property(thatLocator, "requestForQuotationLineID", rhsRequestForQuotationLineID), lhsRequestForQuotationLineID, rhsRequestForQuotationLineID, (this.requestForQuotationLineID!= null), (that.requestForQuotationLineID!= null))) {
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
            LineItemType lhsLineItem;
            lhsLineItem = this.getLineItem();
            LineItemType rhsLineItem;
            rhsLineItem = that.getLineItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lineItem", lhsLineItem), LocatorUtils.property(thatLocator, "lineItem", rhsLineItem), lhsLineItem, rhsLineItem, (this.lineItem!= null), (that.lineItem!= null))) {
                return false;
            }
        }
        {
            List<LineItemType> lhsSellerProposedSubstituteLineItem;
            lhsSellerProposedSubstituteLineItem = (((this.sellerProposedSubstituteLineItem!= null)&&(!this.sellerProposedSubstituteLineItem.isEmpty()))?this.getSellerProposedSubstituteLineItem():null);
            List<LineItemType> rhsSellerProposedSubstituteLineItem;
            rhsSellerProposedSubstituteLineItem = (((that.sellerProposedSubstituteLineItem!= null)&&(!that.sellerProposedSubstituteLineItem.isEmpty()))?that.getSellerProposedSubstituteLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sellerProposedSubstituteLineItem", lhsSellerProposedSubstituteLineItem), LocatorUtils.property(thatLocator, "sellerProposedSubstituteLineItem", rhsSellerProposedSubstituteLineItem), lhsSellerProposedSubstituteLineItem, rhsSellerProposedSubstituteLineItem, ((this.sellerProposedSubstituteLineItem!= null)&&(!this.sellerProposedSubstituteLineItem.isEmpty())), ((that.sellerProposedSubstituteLineItem!= null)&&(!that.sellerProposedSubstituteLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            List<LineItemType> lhsAlternativeLineItem;
            lhsAlternativeLineItem = (((this.alternativeLineItem!= null)&&(!this.alternativeLineItem.isEmpty()))?this.getAlternativeLineItem():null);
            List<LineItemType> rhsAlternativeLineItem;
            rhsAlternativeLineItem = (((that.alternativeLineItem!= null)&&(!that.alternativeLineItem.isEmpty()))?that.getAlternativeLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternativeLineItem", lhsAlternativeLineItem), LocatorUtils.property(thatLocator, "alternativeLineItem", rhsAlternativeLineItem), lhsAlternativeLineItem, rhsAlternativeLineItem, ((this.alternativeLineItem!= null)&&(!this.alternativeLineItem.isEmpty())), ((that.alternativeLineItem!= null)&&(!that.alternativeLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            LineReferenceType lhsRequestLineReference;
            lhsRequestLineReference = this.getRequestLineReference();
            LineReferenceType rhsRequestLineReference;
            rhsRequestLineReference = that.getRequestLineReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestLineReference", lhsRequestLineReference), LocatorUtils.property(thatLocator, "requestLineReference", rhsRequestLineReference), lhsRequestLineReference, rhsRequestLineReference, (this.requestLineReference!= null), (that.requestLineReference!= null))) {
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
            RequestForQuotationLineIDType theRequestForQuotationLineID;
            theRequestForQuotationLineID = this.getRequestForQuotationLineID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestForQuotationLineID", theRequestForQuotationLineID), currentHashCode, theRequestForQuotationLineID, (this.requestForQuotationLineID!= null));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentReference", theDocumentReference), currentHashCode, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            LineItemType theLineItem;
            theLineItem = this.getLineItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lineItem", theLineItem), currentHashCode, theLineItem, (this.lineItem!= null));
        }
        {
            List<LineItemType> theSellerProposedSubstituteLineItem;
            theSellerProposedSubstituteLineItem = (((this.sellerProposedSubstituteLineItem!= null)&&(!this.sellerProposedSubstituteLineItem.isEmpty()))?this.getSellerProposedSubstituteLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sellerProposedSubstituteLineItem", theSellerProposedSubstituteLineItem), currentHashCode, theSellerProposedSubstituteLineItem, ((this.sellerProposedSubstituteLineItem!= null)&&(!this.sellerProposedSubstituteLineItem.isEmpty())));
        }
        {
            List<LineItemType> theAlternativeLineItem;
            theAlternativeLineItem = (((this.alternativeLineItem!= null)&&(!this.alternativeLineItem.isEmpty()))?this.getAlternativeLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternativeLineItem", theAlternativeLineItem), currentHashCode, theAlternativeLineItem, ((this.alternativeLineItem!= null)&&(!this.alternativeLineItem.isEmpty())));
        }
        {
            LineReferenceType theRequestLineReference;
            theRequestLineReference = this.getRequestLineReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestLineReference", theRequestLineReference), currentHashCode, theRequestLineReference, (this.requestLineReference!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
