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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OptionalLineItemIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PrivacyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SecurityClassificationCodeType;
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
 * <p>Classe Java per RequestForQuotationLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RequestForQuotationLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OptionalLineItemIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrivacyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SecurityClassificationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LineItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestForQuotationLineType", propOrder = {
    "id",
    "uuid",
    "note",
    "optionalLineItemIndicator",
    "privacyCode",
    "securityClassificationCode",
    "documentReference",
    "lineItem"
})
public class RequestForQuotationLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUIDType uuid;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "OptionalLineItemIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OptionalLineItemIndicatorType optionalLineItemIndicator;
    @XmlElement(name = "PrivacyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PrivacyCodeType privacyCode;
    @XmlElement(name = "SecurityClassificationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SecurityClassificationCodeType securityClassificationCode;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "LineItem", required = true)
    protected LineItemType lineItem;

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
     * Recupera il valore della proprietà optionalLineItemIndicator.
     * 
     * @return
     *     possible object is
     *     {@link OptionalLineItemIndicatorType }
     *     
     */
    public OptionalLineItemIndicatorType getOptionalLineItemIndicator() {
        return optionalLineItemIndicator;
    }

    /**
     * Imposta il valore della proprietà optionalLineItemIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalLineItemIndicatorType }
     *     
     */
    public void setOptionalLineItemIndicator(OptionalLineItemIndicatorType value) {
        this.optionalLineItemIndicator = value;
    }

    /**
     * Recupera il valore della proprietà privacyCode.
     * 
     * @return
     *     possible object is
     *     {@link PrivacyCodeType }
     *     
     */
    public PrivacyCodeType getPrivacyCode() {
        return privacyCode;
    }

    /**
     * Imposta il valore della proprietà privacyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivacyCodeType }
     *     
     */
    public void setPrivacyCode(PrivacyCodeType value) {
        this.privacyCode = value;
    }

    /**
     * Recupera il valore della proprietà securityClassificationCode.
     * 
     * @return
     *     possible object is
     *     {@link SecurityClassificationCodeType }
     *     
     */
    public SecurityClassificationCodeType getSecurityClassificationCode() {
        return securityClassificationCode;
    }

    /**
     * Imposta il valore della proprietà securityClassificationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityClassificationCodeType }
     *     
     */
    public void setSecurityClassificationCode(SecurityClassificationCodeType value) {
        this.securityClassificationCode = value;
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
            OptionalLineItemIndicatorType theOptionalLineItemIndicator;
            theOptionalLineItemIndicator = this.getOptionalLineItemIndicator();
            strategy.appendField(locator, this, "optionalLineItemIndicator", buffer, theOptionalLineItemIndicator, (this.optionalLineItemIndicator!= null));
        }
        {
            PrivacyCodeType thePrivacyCode;
            thePrivacyCode = this.getPrivacyCode();
            strategy.appendField(locator, this, "privacyCode", buffer, thePrivacyCode, (this.privacyCode!= null));
        }
        {
            SecurityClassificationCodeType theSecurityClassificationCode;
            theSecurityClassificationCode = this.getSecurityClassificationCode();
            strategy.appendField(locator, this, "securityClassificationCode", buffer, theSecurityClassificationCode, (this.securityClassificationCode!= null));
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
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RequestForQuotationLineType that = ((RequestForQuotationLineType) object);
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
            OptionalLineItemIndicatorType lhsOptionalLineItemIndicator;
            lhsOptionalLineItemIndicator = this.getOptionalLineItemIndicator();
            OptionalLineItemIndicatorType rhsOptionalLineItemIndicator;
            rhsOptionalLineItemIndicator = that.getOptionalLineItemIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optionalLineItemIndicator", lhsOptionalLineItemIndicator), LocatorUtils.property(thatLocator, "optionalLineItemIndicator", rhsOptionalLineItemIndicator), lhsOptionalLineItemIndicator, rhsOptionalLineItemIndicator, (this.optionalLineItemIndicator!= null), (that.optionalLineItemIndicator!= null))) {
                return false;
            }
        }
        {
            PrivacyCodeType lhsPrivacyCode;
            lhsPrivacyCode = this.getPrivacyCode();
            PrivacyCodeType rhsPrivacyCode;
            rhsPrivacyCode = that.getPrivacyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "privacyCode", lhsPrivacyCode), LocatorUtils.property(thatLocator, "privacyCode", rhsPrivacyCode), lhsPrivacyCode, rhsPrivacyCode, (this.privacyCode!= null), (that.privacyCode!= null))) {
                return false;
            }
        }
        {
            SecurityClassificationCodeType lhsSecurityClassificationCode;
            lhsSecurityClassificationCode = this.getSecurityClassificationCode();
            SecurityClassificationCodeType rhsSecurityClassificationCode;
            rhsSecurityClassificationCode = that.getSecurityClassificationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "securityClassificationCode", lhsSecurityClassificationCode), LocatorUtils.property(thatLocator, "securityClassificationCode", rhsSecurityClassificationCode), lhsSecurityClassificationCode, rhsSecurityClassificationCode, (this.securityClassificationCode!= null), (that.securityClassificationCode!= null))) {
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
            OptionalLineItemIndicatorType theOptionalLineItemIndicator;
            theOptionalLineItemIndicator = this.getOptionalLineItemIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optionalLineItemIndicator", theOptionalLineItemIndicator), currentHashCode, theOptionalLineItemIndicator, (this.optionalLineItemIndicator!= null));
        }
        {
            PrivacyCodeType thePrivacyCode;
            thePrivacyCode = this.getPrivacyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "privacyCode", thePrivacyCode), currentHashCode, thePrivacyCode, (this.privacyCode!= null));
        }
        {
            SecurityClassificationCodeType theSecurityClassificationCode;
            theSecurityClassificationCode = this.getSecurityClassificationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "securityClassificationCode", theSecurityClassificationCode), currentHashCode, theSecurityClassificationCode, (this.securityClassificationCode!= null));
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
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
