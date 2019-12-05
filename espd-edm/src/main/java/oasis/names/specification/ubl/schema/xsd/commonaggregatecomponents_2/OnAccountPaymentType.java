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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EstimatedConsumedQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
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
 * <p>Classe Java per OnAccountPaymentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OnAccountPaymentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedConsumedQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentTerms" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnAccountPaymentType", propOrder = {
    "estimatedConsumedQuantity",
    "note",
    "paymentTerms"
})
public class OnAccountPaymentType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "EstimatedConsumedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected EstimatedConsumedQuantityType estimatedConsumedQuantity;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "PaymentTerms", required = true)
    protected List<PaymentTermsType> paymentTerms;

    /**
     * Recupera il valore della proprietà estimatedConsumedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedConsumedQuantityType }
     *     
     */
    public EstimatedConsumedQuantityType getEstimatedConsumedQuantity() {
        return estimatedConsumedQuantity;
    }

    /**
     * Imposta il valore della proprietà estimatedConsumedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedConsumedQuantityType }
     *     
     */
    public void setEstimatedConsumedQuantity(EstimatedConsumedQuantityType value) {
        this.estimatedConsumedQuantity = value;
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
     * Gets the value of the paymentTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTermsType }
     * 
     * 
     */
    public List<PaymentTermsType> getPaymentTerms() {
        if (paymentTerms == null) {
            paymentTerms = new ArrayList<PaymentTermsType>();
        }
        return this.paymentTerms;
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
            EstimatedConsumedQuantityType theEstimatedConsumedQuantity;
            theEstimatedConsumedQuantity = this.getEstimatedConsumedQuantity();
            strategy.appendField(locator, this, "estimatedConsumedQuantity", buffer, theEstimatedConsumedQuantity, (this.estimatedConsumedQuantity!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            strategy.appendField(locator, this, "note", buffer, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            List<PaymentTermsType> thePaymentTerms;
            thePaymentTerms = (((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty()))?this.getPaymentTerms():null);
            strategy.appendField(locator, this, "paymentTerms", buffer, thePaymentTerms, ((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty())));
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
        final OnAccountPaymentType that = ((OnAccountPaymentType) object);
        {
            EstimatedConsumedQuantityType lhsEstimatedConsumedQuantity;
            lhsEstimatedConsumedQuantity = this.getEstimatedConsumedQuantity();
            EstimatedConsumedQuantityType rhsEstimatedConsumedQuantity;
            rhsEstimatedConsumedQuantity = that.getEstimatedConsumedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedConsumedQuantity", lhsEstimatedConsumedQuantity), LocatorUtils.property(thatLocator, "estimatedConsumedQuantity", rhsEstimatedConsumedQuantity), lhsEstimatedConsumedQuantity, rhsEstimatedConsumedQuantity, (this.estimatedConsumedQuantity!= null), (that.estimatedConsumedQuantity!= null))) {
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
            List<PaymentTermsType> lhsPaymentTerms;
            lhsPaymentTerms = (((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty()))?this.getPaymentTerms():null);
            List<PaymentTermsType> rhsPaymentTerms;
            rhsPaymentTerms = (((that.paymentTerms!= null)&&(!that.paymentTerms.isEmpty()))?that.getPaymentTerms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentTerms", lhsPaymentTerms), LocatorUtils.property(thatLocator, "paymentTerms", rhsPaymentTerms), lhsPaymentTerms, rhsPaymentTerms, ((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty())), ((that.paymentTerms!= null)&&(!that.paymentTerms.isEmpty())))) {
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
            EstimatedConsumedQuantityType theEstimatedConsumedQuantity;
            theEstimatedConsumedQuantity = this.getEstimatedConsumedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedConsumedQuantity", theEstimatedConsumedQuantity), currentHashCode, theEstimatedConsumedQuantity, (this.estimatedConsumedQuantity!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            List<PaymentTermsType> thePaymentTerms;
            thePaymentTerms = (((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty()))?this.getPaymentTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentTerms", thePaymentTerms), currentHashCode, thePaymentTerms, ((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
