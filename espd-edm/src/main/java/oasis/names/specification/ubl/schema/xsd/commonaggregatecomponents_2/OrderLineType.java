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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SubstitutionStatusCodeType;
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
 * <p>Classe Java per OrderLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OrderLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubstitutionStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LineItem"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerProposedSubstituteLineItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerSubstitutedLineItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BuyerProposedSubstituteLineItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CatalogueLineReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}QuotationLineReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OrderLineReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderLineType", propOrder = {
    "substitutionStatusCode",
    "note",
    "lineItem",
    "sellerProposedSubstituteLineItem",
    "sellerSubstitutedLineItem",
    "buyerProposedSubstituteLineItem",
    "catalogueLineReference",
    "quotationLineReference",
    "orderLineReference",
    "documentReference"
})
public class OrderLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SubstitutionStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubstitutionStatusCodeType substitutionStatusCode;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "LineItem", required = true)
    protected LineItemType lineItem;
    @XmlElement(name = "SellerProposedSubstituteLineItem")
    protected List<LineItemType> sellerProposedSubstituteLineItem;
    @XmlElement(name = "SellerSubstitutedLineItem")
    protected List<LineItemType> sellerSubstitutedLineItem;
    @XmlElement(name = "BuyerProposedSubstituteLineItem")
    protected List<LineItemType> buyerProposedSubstituteLineItem;
    @XmlElement(name = "CatalogueLineReference")
    protected LineReferenceType catalogueLineReference;
    @XmlElement(name = "QuotationLineReference")
    protected LineReferenceType quotationLineReference;
    @XmlElement(name = "OrderLineReference")
    protected List<OrderLineReferenceType> orderLineReference;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;

    /**
     * Recupera il valore della proprietà substitutionStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link SubstitutionStatusCodeType }
     *     
     */
    public SubstitutionStatusCodeType getSubstitutionStatusCode() {
        return substitutionStatusCode;
    }

    /**
     * Imposta il valore della proprietà substitutionStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstitutionStatusCodeType }
     *     
     */
    public void setSubstitutionStatusCode(SubstitutionStatusCodeType value) {
        this.substitutionStatusCode = value;
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
     * Gets the value of the sellerSubstitutedLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellerSubstitutedLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellerSubstitutedLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemType }
     * 
     * 
     */
    public List<LineItemType> getSellerSubstitutedLineItem() {
        if (sellerSubstitutedLineItem == null) {
            sellerSubstitutedLineItem = new ArrayList<LineItemType>();
        }
        return this.sellerSubstitutedLineItem;
    }

    /**
     * Gets the value of the buyerProposedSubstituteLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyerProposedSubstituteLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyerProposedSubstituteLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemType }
     * 
     * 
     */
    public List<LineItemType> getBuyerProposedSubstituteLineItem() {
        if (buyerProposedSubstituteLineItem == null) {
            buyerProposedSubstituteLineItem = new ArrayList<LineItemType>();
        }
        return this.buyerProposedSubstituteLineItem;
    }

    /**
     * Recupera il valore della proprietà catalogueLineReference.
     * 
     * @return
     *     possible object is
     *     {@link LineReferenceType }
     *     
     */
    public LineReferenceType getCatalogueLineReference() {
        return catalogueLineReference;
    }

    /**
     * Imposta il valore della proprietà catalogueLineReference.
     * 
     * @param value
     *     allowed object is
     *     {@link LineReferenceType }
     *     
     */
    public void setCatalogueLineReference(LineReferenceType value) {
        this.catalogueLineReference = value;
    }

    /**
     * Recupera il valore della proprietà quotationLineReference.
     * 
     * @return
     *     possible object is
     *     {@link LineReferenceType }
     *     
     */
    public LineReferenceType getQuotationLineReference() {
        return quotationLineReference;
    }

    /**
     * Imposta il valore della proprietà quotationLineReference.
     * 
     * @param value
     *     allowed object is
     *     {@link LineReferenceType }
     *     
     */
    public void setQuotationLineReference(LineReferenceType value) {
        this.quotationLineReference = value;
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
            SubstitutionStatusCodeType theSubstitutionStatusCode;
            theSubstitutionStatusCode = this.getSubstitutionStatusCode();
            strategy.appendField(locator, this, "substitutionStatusCode", buffer, theSubstitutionStatusCode, (this.substitutionStatusCode!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            strategy.appendField(locator, this, "note", buffer, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
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
            List<LineItemType> theSellerSubstitutedLineItem;
            theSellerSubstitutedLineItem = (((this.sellerSubstitutedLineItem!= null)&&(!this.sellerSubstitutedLineItem.isEmpty()))?this.getSellerSubstitutedLineItem():null);
            strategy.appendField(locator, this, "sellerSubstitutedLineItem", buffer, theSellerSubstitutedLineItem, ((this.sellerSubstitutedLineItem!= null)&&(!this.sellerSubstitutedLineItem.isEmpty())));
        }
        {
            List<LineItemType> theBuyerProposedSubstituteLineItem;
            theBuyerProposedSubstituteLineItem = (((this.buyerProposedSubstituteLineItem!= null)&&(!this.buyerProposedSubstituteLineItem.isEmpty()))?this.getBuyerProposedSubstituteLineItem():null);
            strategy.appendField(locator, this, "buyerProposedSubstituteLineItem", buffer, theBuyerProposedSubstituteLineItem, ((this.buyerProposedSubstituteLineItem!= null)&&(!this.buyerProposedSubstituteLineItem.isEmpty())));
        }
        {
            LineReferenceType theCatalogueLineReference;
            theCatalogueLineReference = this.getCatalogueLineReference();
            strategy.appendField(locator, this, "catalogueLineReference", buffer, theCatalogueLineReference, (this.catalogueLineReference!= null));
        }
        {
            LineReferenceType theQuotationLineReference;
            theQuotationLineReference = this.getQuotationLineReference();
            strategy.appendField(locator, this, "quotationLineReference", buffer, theQuotationLineReference, (this.quotationLineReference!= null));
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
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OrderLineType that = ((OrderLineType) object);
        {
            SubstitutionStatusCodeType lhsSubstitutionStatusCode;
            lhsSubstitutionStatusCode = this.getSubstitutionStatusCode();
            SubstitutionStatusCodeType rhsSubstitutionStatusCode;
            rhsSubstitutionStatusCode = that.getSubstitutionStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substitutionStatusCode", lhsSubstitutionStatusCode), LocatorUtils.property(thatLocator, "substitutionStatusCode", rhsSubstitutionStatusCode), lhsSubstitutionStatusCode, rhsSubstitutionStatusCode, (this.substitutionStatusCode!= null), (that.substitutionStatusCode!= null))) {
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
            List<LineItemType> lhsSellerSubstitutedLineItem;
            lhsSellerSubstitutedLineItem = (((this.sellerSubstitutedLineItem!= null)&&(!this.sellerSubstitutedLineItem.isEmpty()))?this.getSellerSubstitutedLineItem():null);
            List<LineItemType> rhsSellerSubstitutedLineItem;
            rhsSellerSubstitutedLineItem = (((that.sellerSubstitutedLineItem!= null)&&(!that.sellerSubstitutedLineItem.isEmpty()))?that.getSellerSubstitutedLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sellerSubstitutedLineItem", lhsSellerSubstitutedLineItem), LocatorUtils.property(thatLocator, "sellerSubstitutedLineItem", rhsSellerSubstitutedLineItem), lhsSellerSubstitutedLineItem, rhsSellerSubstitutedLineItem, ((this.sellerSubstitutedLineItem!= null)&&(!this.sellerSubstitutedLineItem.isEmpty())), ((that.sellerSubstitutedLineItem!= null)&&(!that.sellerSubstitutedLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            List<LineItemType> lhsBuyerProposedSubstituteLineItem;
            lhsBuyerProposedSubstituteLineItem = (((this.buyerProposedSubstituteLineItem!= null)&&(!this.buyerProposedSubstituteLineItem.isEmpty()))?this.getBuyerProposedSubstituteLineItem():null);
            List<LineItemType> rhsBuyerProposedSubstituteLineItem;
            rhsBuyerProposedSubstituteLineItem = (((that.buyerProposedSubstituteLineItem!= null)&&(!that.buyerProposedSubstituteLineItem.isEmpty()))?that.getBuyerProposedSubstituteLineItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buyerProposedSubstituteLineItem", lhsBuyerProposedSubstituteLineItem), LocatorUtils.property(thatLocator, "buyerProposedSubstituteLineItem", rhsBuyerProposedSubstituteLineItem), lhsBuyerProposedSubstituteLineItem, rhsBuyerProposedSubstituteLineItem, ((this.buyerProposedSubstituteLineItem!= null)&&(!this.buyerProposedSubstituteLineItem.isEmpty())), ((that.buyerProposedSubstituteLineItem!= null)&&(!that.buyerProposedSubstituteLineItem.isEmpty())))) {
                return false;
            }
        }
        {
            LineReferenceType lhsCatalogueLineReference;
            lhsCatalogueLineReference = this.getCatalogueLineReference();
            LineReferenceType rhsCatalogueLineReference;
            rhsCatalogueLineReference = that.getCatalogueLineReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "catalogueLineReference", lhsCatalogueLineReference), LocatorUtils.property(thatLocator, "catalogueLineReference", rhsCatalogueLineReference), lhsCatalogueLineReference, rhsCatalogueLineReference, (this.catalogueLineReference!= null), (that.catalogueLineReference!= null))) {
                return false;
            }
        }
        {
            LineReferenceType lhsQuotationLineReference;
            lhsQuotationLineReference = this.getQuotationLineReference();
            LineReferenceType rhsQuotationLineReference;
            rhsQuotationLineReference = that.getQuotationLineReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quotationLineReference", lhsQuotationLineReference), LocatorUtils.property(thatLocator, "quotationLineReference", rhsQuotationLineReference), lhsQuotationLineReference, rhsQuotationLineReference, (this.quotationLineReference!= null), (that.quotationLineReference!= null))) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            SubstitutionStatusCodeType theSubstitutionStatusCode;
            theSubstitutionStatusCode = this.getSubstitutionStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substitutionStatusCode", theSubstitutionStatusCode), currentHashCode, theSubstitutionStatusCode, (this.substitutionStatusCode!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
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
            List<LineItemType> theSellerSubstitutedLineItem;
            theSellerSubstitutedLineItem = (((this.sellerSubstitutedLineItem!= null)&&(!this.sellerSubstitutedLineItem.isEmpty()))?this.getSellerSubstitutedLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sellerSubstitutedLineItem", theSellerSubstitutedLineItem), currentHashCode, theSellerSubstitutedLineItem, ((this.sellerSubstitutedLineItem!= null)&&(!this.sellerSubstitutedLineItem.isEmpty())));
        }
        {
            List<LineItemType> theBuyerProposedSubstituteLineItem;
            theBuyerProposedSubstituteLineItem = (((this.buyerProposedSubstituteLineItem!= null)&&(!this.buyerProposedSubstituteLineItem.isEmpty()))?this.getBuyerProposedSubstituteLineItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "buyerProposedSubstituteLineItem", theBuyerProposedSubstituteLineItem), currentHashCode, theBuyerProposedSubstituteLineItem, ((this.buyerProposedSubstituteLineItem!= null)&&(!this.buyerProposedSubstituteLineItem.isEmpty())));
        }
        {
            LineReferenceType theCatalogueLineReference;
            theCatalogueLineReference = this.getCatalogueLineReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "catalogueLineReference", theCatalogueLineReference), currentHashCode, theCatalogueLineReference, (this.catalogueLineReference!= null));
        }
        {
            LineReferenceType theQuotationLineReference;
            theQuotationLineReference = this.getQuotationLineReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quotationLineReference", theQuotationLineReference), currentHashCode, theQuotationLineReference, (this.quotationLineReference!= null));
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
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
