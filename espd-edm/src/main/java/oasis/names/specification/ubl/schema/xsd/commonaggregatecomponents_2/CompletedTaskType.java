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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AnnualAverageAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PartyCapacityAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalTaskAmountType;
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
 * <p>Classe Java per CompletedTaskType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CompletedTaskType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AnnualAverageAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalTaskAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PartyCapacityAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EvidenceSupplied" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RecipientCustomerParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedTaskType", propOrder = {
    "annualAverageAmount",
    "totalTaskAmount",
    "partyCapacityAmount",
    "description",
    "evidenceSupplied",
    "period",
    "recipientCustomerParty"
})
public class CompletedTaskType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "AnnualAverageAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AnnualAverageAmountType annualAverageAmount;
    @XmlElement(name = "TotalTaskAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalTaskAmountType totalTaskAmount;
    @XmlElement(name = "PartyCapacityAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PartyCapacityAmountType partyCapacityAmount;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "EvidenceSupplied")
    protected List<EvidenceSuppliedType> evidenceSupplied;
    @XmlElement(name = "Period")
    protected PeriodType period;
    @XmlElement(name = "RecipientCustomerParty")
    protected CustomerPartyType recipientCustomerParty;

    /**
     * Recupera il valore della proprietà annualAverageAmount.
     * 
     * @return
     *     possible object is
     *     {@link AnnualAverageAmountType }
     *     
     */
    public AnnualAverageAmountType getAnnualAverageAmount() {
        return annualAverageAmount;
    }

    /**
     * Imposta il valore della proprietà annualAverageAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnualAverageAmountType }
     *     
     */
    public void setAnnualAverageAmount(AnnualAverageAmountType value) {
        this.annualAverageAmount = value;
    }

    /**
     * Recupera il valore della proprietà totalTaskAmount.
     * 
     * @return
     *     possible object is
     *     {@link TotalTaskAmountType }
     *     
     */
    public TotalTaskAmountType getTotalTaskAmount() {
        return totalTaskAmount;
    }

    /**
     * Imposta il valore della proprietà totalTaskAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTaskAmountType }
     *     
     */
    public void setTotalTaskAmount(TotalTaskAmountType value) {
        this.totalTaskAmount = value;
    }

    /**
     * Recupera il valore della proprietà partyCapacityAmount.
     * 
     * @return
     *     possible object is
     *     {@link PartyCapacityAmountType }
     *     
     */
    public PartyCapacityAmountType getPartyCapacityAmount() {
        return partyCapacityAmount;
    }

    /**
     * Imposta il valore della proprietà partyCapacityAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyCapacityAmountType }
     *     
     */
    public void setPartyCapacityAmount(PartyCapacityAmountType value) {
        this.partyCapacityAmount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the evidenceSupplied property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evidenceSupplied property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidenceSupplied().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvidenceSuppliedType }
     * 
     * 
     */
    public List<EvidenceSuppliedType> getEvidenceSupplied() {
        if (evidenceSupplied == null) {
            evidenceSupplied = new ArrayList<EvidenceSuppliedType>();
        }
        return this.evidenceSupplied;
    }

    /**
     * Recupera il valore della proprietà period.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPeriod() {
        return period;
    }

    /**
     * Imposta il valore della proprietà period.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPeriod(PeriodType value) {
        this.period = value;
    }

    /**
     * Recupera il valore della proprietà recipientCustomerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getRecipientCustomerParty() {
        return recipientCustomerParty;
    }

    /**
     * Imposta il valore della proprietà recipientCustomerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setRecipientCustomerParty(CustomerPartyType value) {
        this.recipientCustomerParty = value;
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
            AnnualAverageAmountType theAnnualAverageAmount;
            theAnnualAverageAmount = this.getAnnualAverageAmount();
            strategy.appendField(locator, this, "annualAverageAmount", buffer, theAnnualAverageAmount, (this.annualAverageAmount!= null));
        }
        {
            TotalTaskAmountType theTotalTaskAmount;
            theTotalTaskAmount = this.getTotalTaskAmount();
            strategy.appendField(locator, this, "totalTaskAmount", buffer, theTotalTaskAmount, (this.totalTaskAmount!= null));
        }
        {
            PartyCapacityAmountType thePartyCapacityAmount;
            thePartyCapacityAmount = this.getPartyCapacityAmount();
            strategy.appendField(locator, this, "partyCapacityAmount", buffer, thePartyCapacityAmount, (this.partyCapacityAmount!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<EvidenceSuppliedType> theEvidenceSupplied;
            theEvidenceSupplied = (((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty()))?this.getEvidenceSupplied():null);
            strategy.appendField(locator, this, "evidenceSupplied", buffer, theEvidenceSupplied, ((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty())));
        }
        {
            PeriodType thePeriod;
            thePeriod = this.getPeriod();
            strategy.appendField(locator, this, "period", buffer, thePeriod, (this.period!= null));
        }
        {
            CustomerPartyType theRecipientCustomerParty;
            theRecipientCustomerParty = this.getRecipientCustomerParty();
            strategy.appendField(locator, this, "recipientCustomerParty", buffer, theRecipientCustomerParty, (this.recipientCustomerParty!= null));
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
        final CompletedTaskType that = ((CompletedTaskType) object);
        {
            AnnualAverageAmountType lhsAnnualAverageAmount;
            lhsAnnualAverageAmount = this.getAnnualAverageAmount();
            AnnualAverageAmountType rhsAnnualAverageAmount;
            rhsAnnualAverageAmount = that.getAnnualAverageAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "annualAverageAmount", lhsAnnualAverageAmount), LocatorUtils.property(thatLocator, "annualAverageAmount", rhsAnnualAverageAmount), lhsAnnualAverageAmount, rhsAnnualAverageAmount, (this.annualAverageAmount!= null), (that.annualAverageAmount!= null))) {
                return false;
            }
        }
        {
            TotalTaskAmountType lhsTotalTaskAmount;
            lhsTotalTaskAmount = this.getTotalTaskAmount();
            TotalTaskAmountType rhsTotalTaskAmount;
            rhsTotalTaskAmount = that.getTotalTaskAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalTaskAmount", lhsTotalTaskAmount), LocatorUtils.property(thatLocator, "totalTaskAmount", rhsTotalTaskAmount), lhsTotalTaskAmount, rhsTotalTaskAmount, (this.totalTaskAmount!= null), (that.totalTaskAmount!= null))) {
                return false;
            }
        }
        {
            PartyCapacityAmountType lhsPartyCapacityAmount;
            lhsPartyCapacityAmount = this.getPartyCapacityAmount();
            PartyCapacityAmountType rhsPartyCapacityAmount;
            rhsPartyCapacityAmount = that.getPartyCapacityAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partyCapacityAmount", lhsPartyCapacityAmount), LocatorUtils.property(thatLocator, "partyCapacityAmount", rhsPartyCapacityAmount), lhsPartyCapacityAmount, rhsPartyCapacityAmount, (this.partyCapacityAmount!= null), (that.partyCapacityAmount!= null))) {
                return false;
            }
        }
        {
            List<DescriptionType> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<DescriptionType> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, ((this.description!= null)&&(!this.description.isEmpty())), ((that.description!= null)&&(!that.description.isEmpty())))) {
                return false;
            }
        }
        {
            List<EvidenceSuppliedType> lhsEvidenceSupplied;
            lhsEvidenceSupplied = (((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty()))?this.getEvidenceSupplied():null);
            List<EvidenceSuppliedType> rhsEvidenceSupplied;
            rhsEvidenceSupplied = (((that.evidenceSupplied!= null)&&(!that.evidenceSupplied.isEmpty()))?that.getEvidenceSupplied():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evidenceSupplied", lhsEvidenceSupplied), LocatorUtils.property(thatLocator, "evidenceSupplied", rhsEvidenceSupplied), lhsEvidenceSupplied, rhsEvidenceSupplied, ((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty())), ((that.evidenceSupplied!= null)&&(!that.evidenceSupplied.isEmpty())))) {
                return false;
            }
        }
        {
            PeriodType lhsPeriod;
            lhsPeriod = this.getPeriod();
            PeriodType rhsPeriod;
            rhsPeriod = that.getPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "period", lhsPeriod), LocatorUtils.property(thatLocator, "period", rhsPeriod), lhsPeriod, rhsPeriod, (this.period!= null), (that.period!= null))) {
                return false;
            }
        }
        {
            CustomerPartyType lhsRecipientCustomerParty;
            lhsRecipientCustomerParty = this.getRecipientCustomerParty();
            CustomerPartyType rhsRecipientCustomerParty;
            rhsRecipientCustomerParty = that.getRecipientCustomerParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recipientCustomerParty", lhsRecipientCustomerParty), LocatorUtils.property(thatLocator, "recipientCustomerParty", rhsRecipientCustomerParty), lhsRecipientCustomerParty, rhsRecipientCustomerParty, (this.recipientCustomerParty!= null), (that.recipientCustomerParty!= null))) {
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
            AnnualAverageAmountType theAnnualAverageAmount;
            theAnnualAverageAmount = this.getAnnualAverageAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "annualAverageAmount", theAnnualAverageAmount), currentHashCode, theAnnualAverageAmount, (this.annualAverageAmount!= null));
        }
        {
            TotalTaskAmountType theTotalTaskAmount;
            theTotalTaskAmount = this.getTotalTaskAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalTaskAmount", theTotalTaskAmount), currentHashCode, theTotalTaskAmount, (this.totalTaskAmount!= null));
        }
        {
            PartyCapacityAmountType thePartyCapacityAmount;
            thePartyCapacityAmount = this.getPartyCapacityAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyCapacityAmount", thePartyCapacityAmount), currentHashCode, thePartyCapacityAmount, (this.partyCapacityAmount!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<EvidenceSuppliedType> theEvidenceSupplied;
            theEvidenceSupplied = (((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty()))?this.getEvidenceSupplied():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evidenceSupplied", theEvidenceSupplied), currentHashCode, theEvidenceSupplied, ((this.evidenceSupplied!= null)&&(!this.evidenceSupplied.isEmpty())));
        }
        {
            PeriodType thePeriod;
            thePeriod = this.getPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "period", thePeriod), currentHashCode, thePeriod, (this.period!= null));
        }
        {
            CustomerPartyType theRecipientCustomerParty;
            theRecipientCustomerParty = this.getRecipientCustomerParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recipientCustomerParty", theRecipientCustomerParty), currentHashCode, theRecipientCustomerParty, (this.recipientCustomerParty!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
