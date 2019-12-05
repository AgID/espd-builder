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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CanonicalizationMethodType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SignatureMethodType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidationDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidationTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidatorIDType;
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
 * <p>Classe Java per SignatureType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SignatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidatorID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CanonicalizationMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SignatureMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SignatoryParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DigitalSignatureAttachment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginalDocumentReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureType", propOrder = {
    "id",
    "note",
    "validationDate",
    "validationTime",
    "validatorID",
    "canonicalizationMethod",
    "signatureMethod",
    "signatoryParty",
    "digitalSignatureAttachment",
    "originalDocumentReference"
})
public class SignatureType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "ValidationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidationDateType validationDate;
    @XmlElement(name = "ValidationTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidationTimeType validationTime;
    @XmlElement(name = "ValidatorID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidatorIDType validatorID;
    @XmlElement(name = "CanonicalizationMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CanonicalizationMethodType canonicalizationMethod;
    @XmlElement(name = "SignatureMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SignatureMethodType signatureMethod;
    @XmlElement(name = "SignatoryParty")
    protected PartyType signatoryParty;
    @XmlElement(name = "DigitalSignatureAttachment")
    protected AttachmentType digitalSignatureAttachment;
    @XmlElement(name = "OriginalDocumentReference")
    protected DocumentReferenceType originalDocumentReference;

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
     * Recupera il valore della proprietà validationDate.
     * 
     * @return
     *     possible object is
     *     {@link ValidationDateType }
     *     
     */
    public ValidationDateType getValidationDate() {
        return validationDate;
    }

    /**
     * Imposta il valore della proprietà validationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationDateType }
     *     
     */
    public void setValidationDate(ValidationDateType value) {
        this.validationDate = value;
    }

    /**
     * Recupera il valore della proprietà validationTime.
     * 
     * @return
     *     possible object is
     *     {@link ValidationTimeType }
     *     
     */
    public ValidationTimeType getValidationTime() {
        return validationTime;
    }

    /**
     * Imposta il valore della proprietà validationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationTimeType }
     *     
     */
    public void setValidationTime(ValidationTimeType value) {
        this.validationTime = value;
    }

    /**
     * Recupera il valore della proprietà validatorID.
     * 
     * @return
     *     possible object is
     *     {@link ValidatorIDType }
     *     
     */
    public ValidatorIDType getValidatorID() {
        return validatorID;
    }

    /**
     * Imposta il valore della proprietà validatorID.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatorIDType }
     *     
     */
    public void setValidatorID(ValidatorIDType value) {
        this.validatorID = value;
    }

    /**
     * Recupera il valore della proprietà canonicalizationMethod.
     * 
     * @return
     *     possible object is
     *     {@link CanonicalizationMethodType }
     *     
     */
    public CanonicalizationMethodType getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    /**
     * Imposta il valore della proprietà canonicalizationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link CanonicalizationMethodType }
     *     
     */
    public void setCanonicalizationMethod(CanonicalizationMethodType value) {
        this.canonicalizationMethod = value;
    }

    /**
     * Recupera il valore della proprietà signatureMethod.
     * 
     * @return
     *     possible object is
     *     {@link SignatureMethodType }
     *     
     */
    public SignatureMethodType getSignatureMethod() {
        return signatureMethod;
    }

    /**
     * Imposta il valore della proprietà signatureMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureMethodType }
     *     
     */
    public void setSignatureMethod(SignatureMethodType value) {
        this.signatureMethod = value;
    }

    /**
     * Recupera il valore della proprietà signatoryParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getSignatoryParty() {
        return signatoryParty;
    }

    /**
     * Imposta il valore della proprietà signatoryParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setSignatoryParty(PartyType value) {
        this.signatoryParty = value;
    }

    /**
     * Recupera il valore della proprietà digitalSignatureAttachment.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getDigitalSignatureAttachment() {
        return digitalSignatureAttachment;
    }

    /**
     * Imposta il valore della proprietà digitalSignatureAttachment.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     */
    public void setDigitalSignatureAttachment(AttachmentType value) {
        this.digitalSignatureAttachment = value;
    }

    /**
     * Recupera il valore della proprietà originalDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getOriginalDocumentReference() {
        return originalDocumentReference;
    }

    /**
     * Imposta il valore della proprietà originalDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setOriginalDocumentReference(DocumentReferenceType value) {
        this.originalDocumentReference = value;
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
            ValidationDateType theValidationDate;
            theValidationDate = this.getValidationDate();
            strategy.appendField(locator, this, "validationDate", buffer, theValidationDate, (this.validationDate!= null));
        }
        {
            ValidationTimeType theValidationTime;
            theValidationTime = this.getValidationTime();
            strategy.appendField(locator, this, "validationTime", buffer, theValidationTime, (this.validationTime!= null));
        }
        {
            ValidatorIDType theValidatorID;
            theValidatorID = this.getValidatorID();
            strategy.appendField(locator, this, "validatorID", buffer, theValidatorID, (this.validatorID!= null));
        }
        {
            CanonicalizationMethodType theCanonicalizationMethod;
            theCanonicalizationMethod = this.getCanonicalizationMethod();
            strategy.appendField(locator, this, "canonicalizationMethod", buffer, theCanonicalizationMethod, (this.canonicalizationMethod!= null));
        }
        {
            SignatureMethodType theSignatureMethod;
            theSignatureMethod = this.getSignatureMethod();
            strategy.appendField(locator, this, "signatureMethod", buffer, theSignatureMethod, (this.signatureMethod!= null));
        }
        {
            PartyType theSignatoryParty;
            theSignatoryParty = this.getSignatoryParty();
            strategy.appendField(locator, this, "signatoryParty", buffer, theSignatoryParty, (this.signatoryParty!= null));
        }
        {
            AttachmentType theDigitalSignatureAttachment;
            theDigitalSignatureAttachment = this.getDigitalSignatureAttachment();
            strategy.appendField(locator, this, "digitalSignatureAttachment", buffer, theDigitalSignatureAttachment, (this.digitalSignatureAttachment!= null));
        }
        {
            DocumentReferenceType theOriginalDocumentReference;
            theOriginalDocumentReference = this.getOriginalDocumentReference();
            strategy.appendField(locator, this, "originalDocumentReference", buffer, theOriginalDocumentReference, (this.originalDocumentReference!= null));
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
        final SignatureType that = ((SignatureType) object);
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
            ValidationDateType lhsValidationDate;
            lhsValidationDate = this.getValidationDate();
            ValidationDateType rhsValidationDate;
            rhsValidationDate = that.getValidationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validationDate", lhsValidationDate), LocatorUtils.property(thatLocator, "validationDate", rhsValidationDate), lhsValidationDate, rhsValidationDate, (this.validationDate!= null), (that.validationDate!= null))) {
                return false;
            }
        }
        {
            ValidationTimeType lhsValidationTime;
            lhsValidationTime = this.getValidationTime();
            ValidationTimeType rhsValidationTime;
            rhsValidationTime = that.getValidationTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validationTime", lhsValidationTime), LocatorUtils.property(thatLocator, "validationTime", rhsValidationTime), lhsValidationTime, rhsValidationTime, (this.validationTime!= null), (that.validationTime!= null))) {
                return false;
            }
        }
        {
            ValidatorIDType lhsValidatorID;
            lhsValidatorID = this.getValidatorID();
            ValidatorIDType rhsValidatorID;
            rhsValidatorID = that.getValidatorID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validatorID", lhsValidatorID), LocatorUtils.property(thatLocator, "validatorID", rhsValidatorID), lhsValidatorID, rhsValidatorID, (this.validatorID!= null), (that.validatorID!= null))) {
                return false;
            }
        }
        {
            CanonicalizationMethodType lhsCanonicalizationMethod;
            lhsCanonicalizationMethod = this.getCanonicalizationMethod();
            CanonicalizationMethodType rhsCanonicalizationMethod;
            rhsCanonicalizationMethod = that.getCanonicalizationMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "canonicalizationMethod", lhsCanonicalizationMethod), LocatorUtils.property(thatLocator, "canonicalizationMethod", rhsCanonicalizationMethod), lhsCanonicalizationMethod, rhsCanonicalizationMethod, (this.canonicalizationMethod!= null), (that.canonicalizationMethod!= null))) {
                return false;
            }
        }
        {
            SignatureMethodType lhsSignatureMethod;
            lhsSignatureMethod = this.getSignatureMethod();
            SignatureMethodType rhsSignatureMethod;
            rhsSignatureMethod = that.getSignatureMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signatureMethod", lhsSignatureMethod), LocatorUtils.property(thatLocator, "signatureMethod", rhsSignatureMethod), lhsSignatureMethod, rhsSignatureMethod, (this.signatureMethod!= null), (that.signatureMethod!= null))) {
                return false;
            }
        }
        {
            PartyType lhsSignatoryParty;
            lhsSignatoryParty = this.getSignatoryParty();
            PartyType rhsSignatoryParty;
            rhsSignatoryParty = that.getSignatoryParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signatoryParty", lhsSignatoryParty), LocatorUtils.property(thatLocator, "signatoryParty", rhsSignatoryParty), lhsSignatoryParty, rhsSignatoryParty, (this.signatoryParty!= null), (that.signatoryParty!= null))) {
                return false;
            }
        }
        {
            AttachmentType lhsDigitalSignatureAttachment;
            lhsDigitalSignatureAttachment = this.getDigitalSignatureAttachment();
            AttachmentType rhsDigitalSignatureAttachment;
            rhsDigitalSignatureAttachment = that.getDigitalSignatureAttachment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "digitalSignatureAttachment", lhsDigitalSignatureAttachment), LocatorUtils.property(thatLocator, "digitalSignatureAttachment", rhsDigitalSignatureAttachment), lhsDigitalSignatureAttachment, rhsDigitalSignatureAttachment, (this.digitalSignatureAttachment!= null), (that.digitalSignatureAttachment!= null))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsOriginalDocumentReference;
            lhsOriginalDocumentReference = this.getOriginalDocumentReference();
            DocumentReferenceType rhsOriginalDocumentReference;
            rhsOriginalDocumentReference = that.getOriginalDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalDocumentReference", lhsOriginalDocumentReference), LocatorUtils.property(thatLocator, "originalDocumentReference", rhsOriginalDocumentReference), lhsOriginalDocumentReference, rhsOriginalDocumentReference, (this.originalDocumentReference!= null), (that.originalDocumentReference!= null))) {
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
            ValidationDateType theValidationDate;
            theValidationDate = this.getValidationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validationDate", theValidationDate), currentHashCode, theValidationDate, (this.validationDate!= null));
        }
        {
            ValidationTimeType theValidationTime;
            theValidationTime = this.getValidationTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validationTime", theValidationTime), currentHashCode, theValidationTime, (this.validationTime!= null));
        }
        {
            ValidatorIDType theValidatorID;
            theValidatorID = this.getValidatorID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validatorID", theValidatorID), currentHashCode, theValidatorID, (this.validatorID!= null));
        }
        {
            CanonicalizationMethodType theCanonicalizationMethod;
            theCanonicalizationMethod = this.getCanonicalizationMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "canonicalizationMethod", theCanonicalizationMethod), currentHashCode, theCanonicalizationMethod, (this.canonicalizationMethod!= null));
        }
        {
            SignatureMethodType theSignatureMethod;
            theSignatureMethod = this.getSignatureMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signatureMethod", theSignatureMethod), currentHashCode, theSignatureMethod, (this.signatureMethod!= null));
        }
        {
            PartyType theSignatoryParty;
            theSignatoryParty = this.getSignatoryParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signatoryParty", theSignatoryParty), currentHashCode, theSignatoryParty, (this.signatoryParty!= null));
        }
        {
            AttachmentType theDigitalSignatureAttachment;
            theDigitalSignatureAttachment = this.getDigitalSignatureAttachment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "digitalSignatureAttachment", theDigitalSignatureAttachment), currentHashCode, theDigitalSignatureAttachment, (this.digitalSignatureAttachment!= null));
        }
        {
            DocumentReferenceType theOriginalDocumentReference;
            theOriginalDocumentReference = this.getOriginalDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalDocumentReference", theOriginalDocumentReference), currentHashCode, theOriginalDocumentReference, (this.originalDocumentReference!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
