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
 * <p>Classe Java per BillingReferenceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="BillingReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InvoiceDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SelfBilledInvoiceDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CreditNoteDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SelfBilledCreditNoteDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DebitNoteDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReminderDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BillingReferenceLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingReferenceType", propOrder = {
    "invoiceDocumentReference",
    "selfBilledInvoiceDocumentReference",
    "creditNoteDocumentReference",
    "selfBilledCreditNoteDocumentReference",
    "debitNoteDocumentReference",
    "reminderDocumentReference",
    "additionalDocumentReference",
    "billingReferenceLine"
})
public class BillingReferenceType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "InvoiceDocumentReference")
    protected DocumentReferenceType invoiceDocumentReference;
    @XmlElement(name = "SelfBilledInvoiceDocumentReference")
    protected DocumentReferenceType selfBilledInvoiceDocumentReference;
    @XmlElement(name = "CreditNoteDocumentReference")
    protected DocumentReferenceType creditNoteDocumentReference;
    @XmlElement(name = "SelfBilledCreditNoteDocumentReference")
    protected DocumentReferenceType selfBilledCreditNoteDocumentReference;
    @XmlElement(name = "DebitNoteDocumentReference")
    protected DocumentReferenceType debitNoteDocumentReference;
    @XmlElement(name = "ReminderDocumentReference")
    protected DocumentReferenceType reminderDocumentReference;
    @XmlElement(name = "AdditionalDocumentReference")
    protected DocumentReferenceType additionalDocumentReference;
    @XmlElement(name = "BillingReferenceLine")
    protected List<BillingReferenceLineType> billingReferenceLine;

    /**
     * Recupera il valore della proprietà invoiceDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getInvoiceDocumentReference() {
        return invoiceDocumentReference;
    }

    /**
     * Imposta il valore della proprietà invoiceDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setInvoiceDocumentReference(DocumentReferenceType value) {
        this.invoiceDocumentReference = value;
    }

    /**
     * Recupera il valore della proprietà selfBilledInvoiceDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getSelfBilledInvoiceDocumentReference() {
        return selfBilledInvoiceDocumentReference;
    }

    /**
     * Imposta il valore della proprietà selfBilledInvoiceDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setSelfBilledInvoiceDocumentReference(DocumentReferenceType value) {
        this.selfBilledInvoiceDocumentReference = value;
    }

    /**
     * Recupera il valore della proprietà creditNoteDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getCreditNoteDocumentReference() {
        return creditNoteDocumentReference;
    }

    /**
     * Imposta il valore della proprietà creditNoteDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setCreditNoteDocumentReference(DocumentReferenceType value) {
        this.creditNoteDocumentReference = value;
    }

    /**
     * Recupera il valore della proprietà selfBilledCreditNoteDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getSelfBilledCreditNoteDocumentReference() {
        return selfBilledCreditNoteDocumentReference;
    }

    /**
     * Imposta il valore della proprietà selfBilledCreditNoteDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setSelfBilledCreditNoteDocumentReference(DocumentReferenceType value) {
        this.selfBilledCreditNoteDocumentReference = value;
    }

    /**
     * Recupera il valore della proprietà debitNoteDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getDebitNoteDocumentReference() {
        return debitNoteDocumentReference;
    }

    /**
     * Imposta il valore della proprietà debitNoteDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setDebitNoteDocumentReference(DocumentReferenceType value) {
        this.debitNoteDocumentReference = value;
    }

    /**
     * Recupera il valore della proprietà reminderDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getReminderDocumentReference() {
        return reminderDocumentReference;
    }

    /**
     * Imposta il valore della proprietà reminderDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setReminderDocumentReference(DocumentReferenceType value) {
        this.reminderDocumentReference = value;
    }

    /**
     * Recupera il valore della proprietà additionalDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getAdditionalDocumentReference() {
        return additionalDocumentReference;
    }

    /**
     * Imposta il valore della proprietà additionalDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setAdditionalDocumentReference(DocumentReferenceType value) {
        this.additionalDocumentReference = value;
    }

    /**
     * Gets the value of the billingReferenceLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingReferenceLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingReferenceLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingReferenceLineType }
     * 
     * 
     */
    public List<BillingReferenceLineType> getBillingReferenceLine() {
        if (billingReferenceLine == null) {
            billingReferenceLine = new ArrayList<BillingReferenceLineType>();
        }
        return this.billingReferenceLine;
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
            DocumentReferenceType theInvoiceDocumentReference;
            theInvoiceDocumentReference = this.getInvoiceDocumentReference();
            strategy.appendField(locator, this, "invoiceDocumentReference", buffer, theInvoiceDocumentReference, (this.invoiceDocumentReference!= null));
        }
        {
            DocumentReferenceType theSelfBilledInvoiceDocumentReference;
            theSelfBilledInvoiceDocumentReference = this.getSelfBilledInvoiceDocumentReference();
            strategy.appendField(locator, this, "selfBilledInvoiceDocumentReference", buffer, theSelfBilledInvoiceDocumentReference, (this.selfBilledInvoiceDocumentReference!= null));
        }
        {
            DocumentReferenceType theCreditNoteDocumentReference;
            theCreditNoteDocumentReference = this.getCreditNoteDocumentReference();
            strategy.appendField(locator, this, "creditNoteDocumentReference", buffer, theCreditNoteDocumentReference, (this.creditNoteDocumentReference!= null));
        }
        {
            DocumentReferenceType theSelfBilledCreditNoteDocumentReference;
            theSelfBilledCreditNoteDocumentReference = this.getSelfBilledCreditNoteDocumentReference();
            strategy.appendField(locator, this, "selfBilledCreditNoteDocumentReference", buffer, theSelfBilledCreditNoteDocumentReference, (this.selfBilledCreditNoteDocumentReference!= null));
        }
        {
            DocumentReferenceType theDebitNoteDocumentReference;
            theDebitNoteDocumentReference = this.getDebitNoteDocumentReference();
            strategy.appendField(locator, this, "debitNoteDocumentReference", buffer, theDebitNoteDocumentReference, (this.debitNoteDocumentReference!= null));
        }
        {
            DocumentReferenceType theReminderDocumentReference;
            theReminderDocumentReference = this.getReminderDocumentReference();
            strategy.appendField(locator, this, "reminderDocumentReference", buffer, theReminderDocumentReference, (this.reminderDocumentReference!= null));
        }
        {
            DocumentReferenceType theAdditionalDocumentReference;
            theAdditionalDocumentReference = this.getAdditionalDocumentReference();
            strategy.appendField(locator, this, "additionalDocumentReference", buffer, theAdditionalDocumentReference, (this.additionalDocumentReference!= null));
        }
        {
            List<BillingReferenceLineType> theBillingReferenceLine;
            theBillingReferenceLine = (((this.billingReferenceLine!= null)&&(!this.billingReferenceLine.isEmpty()))?this.getBillingReferenceLine():null);
            strategy.appendField(locator, this, "billingReferenceLine", buffer, theBillingReferenceLine, ((this.billingReferenceLine!= null)&&(!this.billingReferenceLine.isEmpty())));
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
        final BillingReferenceType that = ((BillingReferenceType) object);
        {
            DocumentReferenceType lhsInvoiceDocumentReference;
            lhsInvoiceDocumentReference = this.getInvoiceDocumentReference();
            DocumentReferenceType rhsInvoiceDocumentReference;
            rhsInvoiceDocumentReference = that.getInvoiceDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoiceDocumentReference", lhsInvoiceDocumentReference), LocatorUtils.property(thatLocator, "invoiceDocumentReference", rhsInvoiceDocumentReference), lhsInvoiceDocumentReference, rhsInvoiceDocumentReference, (this.invoiceDocumentReference!= null), (that.invoiceDocumentReference!= null))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsSelfBilledInvoiceDocumentReference;
            lhsSelfBilledInvoiceDocumentReference = this.getSelfBilledInvoiceDocumentReference();
            DocumentReferenceType rhsSelfBilledInvoiceDocumentReference;
            rhsSelfBilledInvoiceDocumentReference = that.getSelfBilledInvoiceDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selfBilledInvoiceDocumentReference", lhsSelfBilledInvoiceDocumentReference), LocatorUtils.property(thatLocator, "selfBilledInvoiceDocumentReference", rhsSelfBilledInvoiceDocumentReference), lhsSelfBilledInvoiceDocumentReference, rhsSelfBilledInvoiceDocumentReference, (this.selfBilledInvoiceDocumentReference!= null), (that.selfBilledInvoiceDocumentReference!= null))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsCreditNoteDocumentReference;
            lhsCreditNoteDocumentReference = this.getCreditNoteDocumentReference();
            DocumentReferenceType rhsCreditNoteDocumentReference;
            rhsCreditNoteDocumentReference = that.getCreditNoteDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creditNoteDocumentReference", lhsCreditNoteDocumentReference), LocatorUtils.property(thatLocator, "creditNoteDocumentReference", rhsCreditNoteDocumentReference), lhsCreditNoteDocumentReference, rhsCreditNoteDocumentReference, (this.creditNoteDocumentReference!= null), (that.creditNoteDocumentReference!= null))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsSelfBilledCreditNoteDocumentReference;
            lhsSelfBilledCreditNoteDocumentReference = this.getSelfBilledCreditNoteDocumentReference();
            DocumentReferenceType rhsSelfBilledCreditNoteDocumentReference;
            rhsSelfBilledCreditNoteDocumentReference = that.getSelfBilledCreditNoteDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "selfBilledCreditNoteDocumentReference", lhsSelfBilledCreditNoteDocumentReference), LocatorUtils.property(thatLocator, "selfBilledCreditNoteDocumentReference", rhsSelfBilledCreditNoteDocumentReference), lhsSelfBilledCreditNoteDocumentReference, rhsSelfBilledCreditNoteDocumentReference, (this.selfBilledCreditNoteDocumentReference!= null), (that.selfBilledCreditNoteDocumentReference!= null))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsDebitNoteDocumentReference;
            lhsDebitNoteDocumentReference = this.getDebitNoteDocumentReference();
            DocumentReferenceType rhsDebitNoteDocumentReference;
            rhsDebitNoteDocumentReference = that.getDebitNoteDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "debitNoteDocumentReference", lhsDebitNoteDocumentReference), LocatorUtils.property(thatLocator, "debitNoteDocumentReference", rhsDebitNoteDocumentReference), lhsDebitNoteDocumentReference, rhsDebitNoteDocumentReference, (this.debitNoteDocumentReference!= null), (that.debitNoteDocumentReference!= null))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsReminderDocumentReference;
            lhsReminderDocumentReference = this.getReminderDocumentReference();
            DocumentReferenceType rhsReminderDocumentReference;
            rhsReminderDocumentReference = that.getReminderDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reminderDocumentReference", lhsReminderDocumentReference), LocatorUtils.property(thatLocator, "reminderDocumentReference", rhsReminderDocumentReference), lhsReminderDocumentReference, rhsReminderDocumentReference, (this.reminderDocumentReference!= null), (that.reminderDocumentReference!= null))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsAdditionalDocumentReference;
            lhsAdditionalDocumentReference = this.getAdditionalDocumentReference();
            DocumentReferenceType rhsAdditionalDocumentReference;
            rhsAdditionalDocumentReference = that.getAdditionalDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalDocumentReference", lhsAdditionalDocumentReference), LocatorUtils.property(thatLocator, "additionalDocumentReference", rhsAdditionalDocumentReference), lhsAdditionalDocumentReference, rhsAdditionalDocumentReference, (this.additionalDocumentReference!= null), (that.additionalDocumentReference!= null))) {
                return false;
            }
        }
        {
            List<BillingReferenceLineType> lhsBillingReferenceLine;
            lhsBillingReferenceLine = (((this.billingReferenceLine!= null)&&(!this.billingReferenceLine.isEmpty()))?this.getBillingReferenceLine():null);
            List<BillingReferenceLineType> rhsBillingReferenceLine;
            rhsBillingReferenceLine = (((that.billingReferenceLine!= null)&&(!that.billingReferenceLine.isEmpty()))?that.getBillingReferenceLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billingReferenceLine", lhsBillingReferenceLine), LocatorUtils.property(thatLocator, "billingReferenceLine", rhsBillingReferenceLine), lhsBillingReferenceLine, rhsBillingReferenceLine, ((this.billingReferenceLine!= null)&&(!this.billingReferenceLine.isEmpty())), ((that.billingReferenceLine!= null)&&(!that.billingReferenceLine.isEmpty())))) {
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
            DocumentReferenceType theInvoiceDocumentReference;
            theInvoiceDocumentReference = this.getInvoiceDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoiceDocumentReference", theInvoiceDocumentReference), currentHashCode, theInvoiceDocumentReference, (this.invoiceDocumentReference!= null));
        }
        {
            DocumentReferenceType theSelfBilledInvoiceDocumentReference;
            theSelfBilledInvoiceDocumentReference = this.getSelfBilledInvoiceDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selfBilledInvoiceDocumentReference", theSelfBilledInvoiceDocumentReference), currentHashCode, theSelfBilledInvoiceDocumentReference, (this.selfBilledInvoiceDocumentReference!= null));
        }
        {
            DocumentReferenceType theCreditNoteDocumentReference;
            theCreditNoteDocumentReference = this.getCreditNoteDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creditNoteDocumentReference", theCreditNoteDocumentReference), currentHashCode, theCreditNoteDocumentReference, (this.creditNoteDocumentReference!= null));
        }
        {
            DocumentReferenceType theSelfBilledCreditNoteDocumentReference;
            theSelfBilledCreditNoteDocumentReference = this.getSelfBilledCreditNoteDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "selfBilledCreditNoteDocumentReference", theSelfBilledCreditNoteDocumentReference), currentHashCode, theSelfBilledCreditNoteDocumentReference, (this.selfBilledCreditNoteDocumentReference!= null));
        }
        {
            DocumentReferenceType theDebitNoteDocumentReference;
            theDebitNoteDocumentReference = this.getDebitNoteDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "debitNoteDocumentReference", theDebitNoteDocumentReference), currentHashCode, theDebitNoteDocumentReference, (this.debitNoteDocumentReference!= null));
        }
        {
            DocumentReferenceType theReminderDocumentReference;
            theReminderDocumentReference = this.getReminderDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reminderDocumentReference", theReminderDocumentReference), currentHashCode, theReminderDocumentReference, (this.reminderDocumentReference!= null));
        }
        {
            DocumentReferenceType theAdditionalDocumentReference;
            theAdditionalDocumentReference = this.getAdditionalDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalDocumentReference", theAdditionalDocumentReference), currentHashCode, theAdditionalDocumentReference, (this.additionalDocumentReference!= null));
        }
        {
            List<BillingReferenceLineType> theBillingReferenceLine;
            theBillingReferenceLine = (((this.billingReferenceLine!= null)&&(!this.billingReferenceLine.isEmpty()))?this.getBillingReferenceLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billingReferenceLine", theBillingReferenceLine), currentHashCode, theBillingReferenceLine, ((this.billingReferenceLine!= null)&&(!this.billingReferenceLine.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
