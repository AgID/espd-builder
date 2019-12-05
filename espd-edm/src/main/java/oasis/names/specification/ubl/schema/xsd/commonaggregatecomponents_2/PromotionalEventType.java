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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FirstShipmentAvailibilityDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestProposalAcceptanceDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PromotionalEventTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SubmissionDateType;
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
 * <p>Classe Java per PromotionalEventType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PromotionalEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PromotionalEventTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubmissionDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FirstShipmentAvailibilityDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestProposalAcceptanceDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PromotionalSpecification" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionalEventType", propOrder = {
    "promotionalEventTypeCode",
    "submissionDate",
    "firstShipmentAvailibilityDate",
    "latestProposalAcceptanceDate",
    "promotionalSpecification"
})
public class PromotionalEventType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "PromotionalEventTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PromotionalEventTypeCodeType promotionalEventTypeCode;
    @XmlElement(name = "SubmissionDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubmissionDateType submissionDate;
    @XmlElement(name = "FirstShipmentAvailibilityDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FirstShipmentAvailibilityDateType firstShipmentAvailibilityDate;
    @XmlElement(name = "LatestProposalAcceptanceDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestProposalAcceptanceDateType latestProposalAcceptanceDate;
    @XmlElement(name = "PromotionalSpecification", required = true)
    protected List<PromotionalSpecificationType> promotionalSpecification;

    /**
     * Recupera il valore della proprietà promotionalEventTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalEventTypeCodeType }
     *     
     */
    public PromotionalEventTypeCodeType getPromotionalEventTypeCode() {
        return promotionalEventTypeCode;
    }

    /**
     * Imposta il valore della proprietà promotionalEventTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalEventTypeCodeType }
     *     
     */
    public void setPromotionalEventTypeCode(PromotionalEventTypeCodeType value) {
        this.promotionalEventTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà submissionDate.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionDateType }
     *     
     */
    public SubmissionDateType getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Imposta il valore della proprietà submissionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionDateType }
     *     
     */
    public void setSubmissionDate(SubmissionDateType value) {
        this.submissionDate = value;
    }

    /**
     * Recupera il valore della proprietà firstShipmentAvailibilityDate.
     * 
     * @return
     *     possible object is
     *     {@link FirstShipmentAvailibilityDateType }
     *     
     */
    public FirstShipmentAvailibilityDateType getFirstShipmentAvailibilityDate() {
        return firstShipmentAvailibilityDate;
    }

    /**
     * Imposta il valore della proprietà firstShipmentAvailibilityDate.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstShipmentAvailibilityDateType }
     *     
     */
    public void setFirstShipmentAvailibilityDate(FirstShipmentAvailibilityDateType value) {
        this.firstShipmentAvailibilityDate = value;
    }

    /**
     * Recupera il valore della proprietà latestProposalAcceptanceDate.
     * 
     * @return
     *     possible object is
     *     {@link LatestProposalAcceptanceDateType }
     *     
     */
    public LatestProposalAcceptanceDateType getLatestProposalAcceptanceDate() {
        return latestProposalAcceptanceDate;
    }

    /**
     * Imposta il valore della proprietà latestProposalAcceptanceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestProposalAcceptanceDateType }
     *     
     */
    public void setLatestProposalAcceptanceDate(LatestProposalAcceptanceDateType value) {
        this.latestProposalAcceptanceDate = value;
    }

    /**
     * Gets the value of the promotionalSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionalSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionalSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionalSpecificationType }
     * 
     * 
     */
    public List<PromotionalSpecificationType> getPromotionalSpecification() {
        if (promotionalSpecification == null) {
            promotionalSpecification = new ArrayList<PromotionalSpecificationType>();
        }
        return this.promotionalSpecification;
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
            PromotionalEventTypeCodeType thePromotionalEventTypeCode;
            thePromotionalEventTypeCode = this.getPromotionalEventTypeCode();
            strategy.appendField(locator, this, "promotionalEventTypeCode", buffer, thePromotionalEventTypeCode, (this.promotionalEventTypeCode!= null));
        }
        {
            SubmissionDateType theSubmissionDate;
            theSubmissionDate = this.getSubmissionDate();
            strategy.appendField(locator, this, "submissionDate", buffer, theSubmissionDate, (this.submissionDate!= null));
        }
        {
            FirstShipmentAvailibilityDateType theFirstShipmentAvailibilityDate;
            theFirstShipmentAvailibilityDate = this.getFirstShipmentAvailibilityDate();
            strategy.appendField(locator, this, "firstShipmentAvailibilityDate", buffer, theFirstShipmentAvailibilityDate, (this.firstShipmentAvailibilityDate!= null));
        }
        {
            LatestProposalAcceptanceDateType theLatestProposalAcceptanceDate;
            theLatestProposalAcceptanceDate = this.getLatestProposalAcceptanceDate();
            strategy.appendField(locator, this, "latestProposalAcceptanceDate", buffer, theLatestProposalAcceptanceDate, (this.latestProposalAcceptanceDate!= null));
        }
        {
            List<PromotionalSpecificationType> thePromotionalSpecification;
            thePromotionalSpecification = (((this.promotionalSpecification!= null)&&(!this.promotionalSpecification.isEmpty()))?this.getPromotionalSpecification():null);
            strategy.appendField(locator, this, "promotionalSpecification", buffer, thePromotionalSpecification, ((this.promotionalSpecification!= null)&&(!this.promotionalSpecification.isEmpty())));
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
        final PromotionalEventType that = ((PromotionalEventType) object);
        {
            PromotionalEventTypeCodeType lhsPromotionalEventTypeCode;
            lhsPromotionalEventTypeCode = this.getPromotionalEventTypeCode();
            PromotionalEventTypeCodeType rhsPromotionalEventTypeCode;
            rhsPromotionalEventTypeCode = that.getPromotionalEventTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "promotionalEventTypeCode", lhsPromotionalEventTypeCode), LocatorUtils.property(thatLocator, "promotionalEventTypeCode", rhsPromotionalEventTypeCode), lhsPromotionalEventTypeCode, rhsPromotionalEventTypeCode, (this.promotionalEventTypeCode!= null), (that.promotionalEventTypeCode!= null))) {
                return false;
            }
        }
        {
            SubmissionDateType lhsSubmissionDate;
            lhsSubmissionDate = this.getSubmissionDate();
            SubmissionDateType rhsSubmissionDate;
            rhsSubmissionDate = that.getSubmissionDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "submissionDate", lhsSubmissionDate), LocatorUtils.property(thatLocator, "submissionDate", rhsSubmissionDate), lhsSubmissionDate, rhsSubmissionDate, (this.submissionDate!= null), (that.submissionDate!= null))) {
                return false;
            }
        }
        {
            FirstShipmentAvailibilityDateType lhsFirstShipmentAvailibilityDate;
            lhsFirstShipmentAvailibilityDate = this.getFirstShipmentAvailibilityDate();
            FirstShipmentAvailibilityDateType rhsFirstShipmentAvailibilityDate;
            rhsFirstShipmentAvailibilityDate = that.getFirstShipmentAvailibilityDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstShipmentAvailibilityDate", lhsFirstShipmentAvailibilityDate), LocatorUtils.property(thatLocator, "firstShipmentAvailibilityDate", rhsFirstShipmentAvailibilityDate), lhsFirstShipmentAvailibilityDate, rhsFirstShipmentAvailibilityDate, (this.firstShipmentAvailibilityDate!= null), (that.firstShipmentAvailibilityDate!= null))) {
                return false;
            }
        }
        {
            LatestProposalAcceptanceDateType lhsLatestProposalAcceptanceDate;
            lhsLatestProposalAcceptanceDate = this.getLatestProposalAcceptanceDate();
            LatestProposalAcceptanceDateType rhsLatestProposalAcceptanceDate;
            rhsLatestProposalAcceptanceDate = that.getLatestProposalAcceptanceDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestProposalAcceptanceDate", lhsLatestProposalAcceptanceDate), LocatorUtils.property(thatLocator, "latestProposalAcceptanceDate", rhsLatestProposalAcceptanceDate), lhsLatestProposalAcceptanceDate, rhsLatestProposalAcceptanceDate, (this.latestProposalAcceptanceDate!= null), (that.latestProposalAcceptanceDate!= null))) {
                return false;
            }
        }
        {
            List<PromotionalSpecificationType> lhsPromotionalSpecification;
            lhsPromotionalSpecification = (((this.promotionalSpecification!= null)&&(!this.promotionalSpecification.isEmpty()))?this.getPromotionalSpecification():null);
            List<PromotionalSpecificationType> rhsPromotionalSpecification;
            rhsPromotionalSpecification = (((that.promotionalSpecification!= null)&&(!that.promotionalSpecification.isEmpty()))?that.getPromotionalSpecification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "promotionalSpecification", lhsPromotionalSpecification), LocatorUtils.property(thatLocator, "promotionalSpecification", rhsPromotionalSpecification), lhsPromotionalSpecification, rhsPromotionalSpecification, ((this.promotionalSpecification!= null)&&(!this.promotionalSpecification.isEmpty())), ((that.promotionalSpecification!= null)&&(!that.promotionalSpecification.isEmpty())))) {
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
            PromotionalEventTypeCodeType thePromotionalEventTypeCode;
            thePromotionalEventTypeCode = this.getPromotionalEventTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "promotionalEventTypeCode", thePromotionalEventTypeCode), currentHashCode, thePromotionalEventTypeCode, (this.promotionalEventTypeCode!= null));
        }
        {
            SubmissionDateType theSubmissionDate;
            theSubmissionDate = this.getSubmissionDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "submissionDate", theSubmissionDate), currentHashCode, theSubmissionDate, (this.submissionDate!= null));
        }
        {
            FirstShipmentAvailibilityDateType theFirstShipmentAvailibilityDate;
            theFirstShipmentAvailibilityDate = this.getFirstShipmentAvailibilityDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firstShipmentAvailibilityDate", theFirstShipmentAvailibilityDate), currentHashCode, theFirstShipmentAvailibilityDate, (this.firstShipmentAvailibilityDate!= null));
        }
        {
            LatestProposalAcceptanceDateType theLatestProposalAcceptanceDate;
            theLatestProposalAcceptanceDate = this.getLatestProposalAcceptanceDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestProposalAcceptanceDate", theLatestProposalAcceptanceDate), currentHashCode, theLatestProposalAcceptanceDate, (this.latestProposalAcceptanceDate!= null));
        }
        {
            List<PromotionalSpecificationType> thePromotionalSpecification;
            thePromotionalSpecification = (((this.promotionalSpecification!= null)&&(!this.promotionalSpecification.isEmpty()))?this.getPromotionalSpecification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "promotionalSpecification", thePromotionalSpecification), currentHashCode, thePromotionalSpecification, ((this.promotionalSpecification!= null)&&(!this.promotionalSpecification.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
