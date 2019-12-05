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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActualDespatchDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActualDespatchTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EstimatedDespatchDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EstimatedDespatchTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GuaranteedDespatchDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GuaranteedDespatchTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InstructionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReleaseIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequestedDespatchDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequestedDespatchTimeType;
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
 * <p>Classe Java per DespatchType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DespatchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequestedDespatchDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequestedDespatchTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedDespatchDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedDespatchTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualDespatchDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualDespatchTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GuaranteedDespatchDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GuaranteedDespatchTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReleaseID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Instructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CarrierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotifyParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedDespatchPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedDespatchPeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DespatchType", propOrder = {
    "id",
    "requestedDespatchDate",
    "requestedDespatchTime",
    "estimatedDespatchDate",
    "estimatedDespatchTime",
    "actualDespatchDate",
    "actualDespatchTime",
    "guaranteedDespatchDate",
    "guaranteedDespatchTime",
    "releaseID",
    "instructions",
    "despatchAddress",
    "despatchLocation",
    "despatchParty",
    "carrierParty",
    "notifyParty",
    "contact",
    "estimatedDespatchPeriod",
    "requestedDespatchPeriod"
})
public class DespatchType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "RequestedDespatchDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequestedDespatchDateType requestedDespatchDate;
    @XmlElement(name = "RequestedDespatchTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequestedDespatchTimeType requestedDespatchTime;
    @XmlElement(name = "EstimatedDespatchDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EstimatedDespatchDateType estimatedDespatchDate;
    @XmlElement(name = "EstimatedDespatchTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EstimatedDespatchTimeType estimatedDespatchTime;
    @XmlElement(name = "ActualDespatchDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActualDespatchDateType actualDespatchDate;
    @XmlElement(name = "ActualDespatchTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActualDespatchTimeType actualDespatchTime;
    @XmlElement(name = "GuaranteedDespatchDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GuaranteedDespatchDateType guaranteedDespatchDate;
    @XmlElement(name = "GuaranteedDespatchTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GuaranteedDespatchTimeType guaranteedDespatchTime;
    @XmlElement(name = "ReleaseID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReleaseIDType releaseID;
    @XmlElement(name = "Instructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<InstructionsType> instructions;
    @XmlElement(name = "DespatchAddress")
    protected AddressType despatchAddress;
    @XmlElement(name = "DespatchLocation")
    protected LocationType despatchLocation;
    @XmlElement(name = "DespatchParty")
    protected PartyType despatchParty;
    @XmlElement(name = "CarrierParty")
    protected PartyType carrierParty;
    @XmlElement(name = "NotifyParty")
    protected List<PartyType> notifyParty;
    @XmlElement(name = "Contact")
    protected ContactType contact;
    @XmlElement(name = "EstimatedDespatchPeriod")
    protected PeriodType estimatedDespatchPeriod;
    @XmlElement(name = "RequestedDespatchPeriod")
    protected PeriodType requestedDespatchPeriod;

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
     * Recupera il valore della proprietà requestedDespatchDate.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDespatchDateType }
     *     
     */
    public RequestedDespatchDateType getRequestedDespatchDate() {
        return requestedDespatchDate;
    }

    /**
     * Imposta il valore della proprietà requestedDespatchDate.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDespatchDateType }
     *     
     */
    public void setRequestedDespatchDate(RequestedDespatchDateType value) {
        this.requestedDespatchDate = value;
    }

    /**
     * Recupera il valore della proprietà requestedDespatchTime.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDespatchTimeType }
     *     
     */
    public RequestedDespatchTimeType getRequestedDespatchTime() {
        return requestedDespatchTime;
    }

    /**
     * Imposta il valore della proprietà requestedDespatchTime.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDespatchTimeType }
     *     
     */
    public void setRequestedDespatchTime(RequestedDespatchTimeType value) {
        this.requestedDespatchTime = value;
    }

    /**
     * Recupera il valore della proprietà estimatedDespatchDate.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedDespatchDateType }
     *     
     */
    public EstimatedDespatchDateType getEstimatedDespatchDate() {
        return estimatedDespatchDate;
    }

    /**
     * Imposta il valore della proprietà estimatedDespatchDate.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedDespatchDateType }
     *     
     */
    public void setEstimatedDespatchDate(EstimatedDespatchDateType value) {
        this.estimatedDespatchDate = value;
    }

    /**
     * Recupera il valore della proprietà estimatedDespatchTime.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedDespatchTimeType }
     *     
     */
    public EstimatedDespatchTimeType getEstimatedDespatchTime() {
        return estimatedDespatchTime;
    }

    /**
     * Imposta il valore della proprietà estimatedDespatchTime.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedDespatchTimeType }
     *     
     */
    public void setEstimatedDespatchTime(EstimatedDespatchTimeType value) {
        this.estimatedDespatchTime = value;
    }

    /**
     * Recupera il valore della proprietà actualDespatchDate.
     * 
     * @return
     *     possible object is
     *     {@link ActualDespatchDateType }
     *     
     */
    public ActualDespatchDateType getActualDespatchDate() {
        return actualDespatchDate;
    }

    /**
     * Imposta il valore della proprietà actualDespatchDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualDespatchDateType }
     *     
     */
    public void setActualDespatchDate(ActualDespatchDateType value) {
        this.actualDespatchDate = value;
    }

    /**
     * Recupera il valore della proprietà actualDespatchTime.
     * 
     * @return
     *     possible object is
     *     {@link ActualDespatchTimeType }
     *     
     */
    public ActualDespatchTimeType getActualDespatchTime() {
        return actualDespatchTime;
    }

    /**
     * Imposta il valore della proprietà actualDespatchTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualDespatchTimeType }
     *     
     */
    public void setActualDespatchTime(ActualDespatchTimeType value) {
        this.actualDespatchTime = value;
    }

    /**
     * Recupera il valore della proprietà guaranteedDespatchDate.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteedDespatchDateType }
     *     
     */
    public GuaranteedDespatchDateType getGuaranteedDespatchDate() {
        return guaranteedDespatchDate;
    }

    /**
     * Imposta il valore della proprietà guaranteedDespatchDate.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteedDespatchDateType }
     *     
     */
    public void setGuaranteedDespatchDate(GuaranteedDespatchDateType value) {
        this.guaranteedDespatchDate = value;
    }

    /**
     * Recupera il valore della proprietà guaranteedDespatchTime.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteedDespatchTimeType }
     *     
     */
    public GuaranteedDespatchTimeType getGuaranteedDespatchTime() {
        return guaranteedDespatchTime;
    }

    /**
     * Imposta il valore della proprietà guaranteedDespatchTime.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteedDespatchTimeType }
     *     
     */
    public void setGuaranteedDespatchTime(GuaranteedDespatchTimeType value) {
        this.guaranteedDespatchTime = value;
    }

    /**
     * Recupera il valore della proprietà releaseID.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseIDType }
     *     
     */
    public ReleaseIDType getReleaseID() {
        return releaseID;
    }

    /**
     * Imposta il valore della proprietà releaseID.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseIDType }
     *     
     */
    public void setReleaseID(ReleaseIDType value) {
        this.releaseID = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionsType }
     * 
     * 
     */
    public List<InstructionsType> getInstructions() {
        if (instructions == null) {
            instructions = new ArrayList<InstructionsType>();
        }
        return this.instructions;
    }

    /**
     * Recupera il valore della proprietà despatchAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getDespatchAddress() {
        return despatchAddress;
    }

    /**
     * Imposta il valore della proprietà despatchAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setDespatchAddress(AddressType value) {
        this.despatchAddress = value;
    }

    /**
     * Recupera il valore della proprietà despatchLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDespatchLocation() {
        return despatchLocation;
    }

    /**
     * Imposta il valore della proprietà despatchLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDespatchLocation(LocationType value) {
        this.despatchLocation = value;
    }

    /**
     * Recupera il valore della proprietà despatchParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getDespatchParty() {
        return despatchParty;
    }

    /**
     * Imposta il valore della proprietà despatchParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setDespatchParty(PartyType value) {
        this.despatchParty = value;
    }

    /**
     * Recupera il valore della proprietà carrierParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getCarrierParty() {
        return carrierParty;
    }

    /**
     * Imposta il valore della proprietà carrierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setCarrierParty(PartyType value) {
        this.carrierParty = value;
    }

    /**
     * Gets the value of the notifyParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getNotifyParty() {
        if (notifyParty == null) {
            notifyParty = new ArrayList<PartyType>();
        }
        return this.notifyParty;
    }

    /**
     * Recupera il valore della proprietà contact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContact() {
        return contact;
    }

    /**
     * Imposta il valore della proprietà contact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContact(ContactType value) {
        this.contact = value;
    }

    /**
     * Recupera il valore della proprietà estimatedDespatchPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEstimatedDespatchPeriod() {
        return estimatedDespatchPeriod;
    }

    /**
     * Imposta il valore della proprietà estimatedDespatchPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEstimatedDespatchPeriod(PeriodType value) {
        this.estimatedDespatchPeriod = value;
    }

    /**
     * Recupera il valore della proprietà requestedDespatchPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getRequestedDespatchPeriod() {
        return requestedDespatchPeriod;
    }

    /**
     * Imposta il valore della proprietà requestedDespatchPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setRequestedDespatchPeriod(PeriodType value) {
        this.requestedDespatchPeriod = value;
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
            RequestedDespatchDateType theRequestedDespatchDate;
            theRequestedDespatchDate = this.getRequestedDespatchDate();
            strategy.appendField(locator, this, "requestedDespatchDate", buffer, theRequestedDespatchDate, (this.requestedDespatchDate!= null));
        }
        {
            RequestedDespatchTimeType theRequestedDespatchTime;
            theRequestedDespatchTime = this.getRequestedDespatchTime();
            strategy.appendField(locator, this, "requestedDespatchTime", buffer, theRequestedDespatchTime, (this.requestedDespatchTime!= null));
        }
        {
            EstimatedDespatchDateType theEstimatedDespatchDate;
            theEstimatedDespatchDate = this.getEstimatedDespatchDate();
            strategy.appendField(locator, this, "estimatedDespatchDate", buffer, theEstimatedDespatchDate, (this.estimatedDespatchDate!= null));
        }
        {
            EstimatedDespatchTimeType theEstimatedDespatchTime;
            theEstimatedDespatchTime = this.getEstimatedDespatchTime();
            strategy.appendField(locator, this, "estimatedDespatchTime", buffer, theEstimatedDespatchTime, (this.estimatedDespatchTime!= null));
        }
        {
            ActualDespatchDateType theActualDespatchDate;
            theActualDespatchDate = this.getActualDespatchDate();
            strategy.appendField(locator, this, "actualDespatchDate", buffer, theActualDespatchDate, (this.actualDespatchDate!= null));
        }
        {
            ActualDespatchTimeType theActualDespatchTime;
            theActualDespatchTime = this.getActualDespatchTime();
            strategy.appendField(locator, this, "actualDespatchTime", buffer, theActualDespatchTime, (this.actualDespatchTime!= null));
        }
        {
            GuaranteedDespatchDateType theGuaranteedDespatchDate;
            theGuaranteedDespatchDate = this.getGuaranteedDespatchDate();
            strategy.appendField(locator, this, "guaranteedDespatchDate", buffer, theGuaranteedDespatchDate, (this.guaranteedDespatchDate!= null));
        }
        {
            GuaranteedDespatchTimeType theGuaranteedDespatchTime;
            theGuaranteedDespatchTime = this.getGuaranteedDespatchTime();
            strategy.appendField(locator, this, "guaranteedDespatchTime", buffer, theGuaranteedDespatchTime, (this.guaranteedDespatchTime!= null));
        }
        {
            ReleaseIDType theReleaseID;
            theReleaseID = this.getReleaseID();
            strategy.appendField(locator, this, "releaseID", buffer, theReleaseID, (this.releaseID!= null));
        }
        {
            List<InstructionsType> theInstructions;
            theInstructions = (((this.instructions!= null)&&(!this.instructions.isEmpty()))?this.getInstructions():null);
            strategy.appendField(locator, this, "instructions", buffer, theInstructions, ((this.instructions!= null)&&(!this.instructions.isEmpty())));
        }
        {
            AddressType theDespatchAddress;
            theDespatchAddress = this.getDespatchAddress();
            strategy.appendField(locator, this, "despatchAddress", buffer, theDespatchAddress, (this.despatchAddress!= null));
        }
        {
            LocationType theDespatchLocation;
            theDespatchLocation = this.getDespatchLocation();
            strategy.appendField(locator, this, "despatchLocation", buffer, theDespatchLocation, (this.despatchLocation!= null));
        }
        {
            PartyType theDespatchParty;
            theDespatchParty = this.getDespatchParty();
            strategy.appendField(locator, this, "despatchParty", buffer, theDespatchParty, (this.despatchParty!= null));
        }
        {
            PartyType theCarrierParty;
            theCarrierParty = this.getCarrierParty();
            strategy.appendField(locator, this, "carrierParty", buffer, theCarrierParty, (this.carrierParty!= null));
        }
        {
            List<PartyType> theNotifyParty;
            theNotifyParty = (((this.notifyParty!= null)&&(!this.notifyParty.isEmpty()))?this.getNotifyParty():null);
            strategy.appendField(locator, this, "notifyParty", buffer, theNotifyParty, ((this.notifyParty!= null)&&(!this.notifyParty.isEmpty())));
        }
        {
            ContactType theContact;
            theContact = this.getContact();
            strategy.appendField(locator, this, "contact", buffer, theContact, (this.contact!= null));
        }
        {
            PeriodType theEstimatedDespatchPeriod;
            theEstimatedDespatchPeriod = this.getEstimatedDespatchPeriod();
            strategy.appendField(locator, this, "estimatedDespatchPeriod", buffer, theEstimatedDespatchPeriod, (this.estimatedDespatchPeriod!= null));
        }
        {
            PeriodType theRequestedDespatchPeriod;
            theRequestedDespatchPeriod = this.getRequestedDespatchPeriod();
            strategy.appendField(locator, this, "requestedDespatchPeriod", buffer, theRequestedDespatchPeriod, (this.requestedDespatchPeriod!= null));
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
        final DespatchType that = ((DespatchType) object);
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
            RequestedDespatchDateType lhsRequestedDespatchDate;
            lhsRequestedDespatchDate = this.getRequestedDespatchDate();
            RequestedDespatchDateType rhsRequestedDespatchDate;
            rhsRequestedDespatchDate = that.getRequestedDespatchDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedDespatchDate", lhsRequestedDespatchDate), LocatorUtils.property(thatLocator, "requestedDespatchDate", rhsRequestedDespatchDate), lhsRequestedDespatchDate, rhsRequestedDespatchDate, (this.requestedDespatchDate!= null), (that.requestedDespatchDate!= null))) {
                return false;
            }
        }
        {
            RequestedDespatchTimeType lhsRequestedDespatchTime;
            lhsRequestedDespatchTime = this.getRequestedDespatchTime();
            RequestedDespatchTimeType rhsRequestedDespatchTime;
            rhsRequestedDespatchTime = that.getRequestedDespatchTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedDespatchTime", lhsRequestedDespatchTime), LocatorUtils.property(thatLocator, "requestedDespatchTime", rhsRequestedDespatchTime), lhsRequestedDespatchTime, rhsRequestedDespatchTime, (this.requestedDespatchTime!= null), (that.requestedDespatchTime!= null))) {
                return false;
            }
        }
        {
            EstimatedDespatchDateType lhsEstimatedDespatchDate;
            lhsEstimatedDespatchDate = this.getEstimatedDespatchDate();
            EstimatedDespatchDateType rhsEstimatedDespatchDate;
            rhsEstimatedDespatchDate = that.getEstimatedDespatchDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedDespatchDate", lhsEstimatedDespatchDate), LocatorUtils.property(thatLocator, "estimatedDespatchDate", rhsEstimatedDespatchDate), lhsEstimatedDespatchDate, rhsEstimatedDespatchDate, (this.estimatedDespatchDate!= null), (that.estimatedDespatchDate!= null))) {
                return false;
            }
        }
        {
            EstimatedDespatchTimeType lhsEstimatedDespatchTime;
            lhsEstimatedDespatchTime = this.getEstimatedDespatchTime();
            EstimatedDespatchTimeType rhsEstimatedDespatchTime;
            rhsEstimatedDespatchTime = that.getEstimatedDespatchTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedDespatchTime", lhsEstimatedDespatchTime), LocatorUtils.property(thatLocator, "estimatedDespatchTime", rhsEstimatedDespatchTime), lhsEstimatedDespatchTime, rhsEstimatedDespatchTime, (this.estimatedDespatchTime!= null), (that.estimatedDespatchTime!= null))) {
                return false;
            }
        }
        {
            ActualDespatchDateType lhsActualDespatchDate;
            lhsActualDespatchDate = this.getActualDespatchDate();
            ActualDespatchDateType rhsActualDespatchDate;
            rhsActualDespatchDate = that.getActualDespatchDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualDespatchDate", lhsActualDespatchDate), LocatorUtils.property(thatLocator, "actualDespatchDate", rhsActualDespatchDate), lhsActualDespatchDate, rhsActualDespatchDate, (this.actualDespatchDate!= null), (that.actualDespatchDate!= null))) {
                return false;
            }
        }
        {
            ActualDespatchTimeType lhsActualDespatchTime;
            lhsActualDespatchTime = this.getActualDespatchTime();
            ActualDespatchTimeType rhsActualDespatchTime;
            rhsActualDespatchTime = that.getActualDespatchTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualDespatchTime", lhsActualDespatchTime), LocatorUtils.property(thatLocator, "actualDespatchTime", rhsActualDespatchTime), lhsActualDespatchTime, rhsActualDespatchTime, (this.actualDespatchTime!= null), (that.actualDespatchTime!= null))) {
                return false;
            }
        }
        {
            GuaranteedDespatchDateType lhsGuaranteedDespatchDate;
            lhsGuaranteedDespatchDate = this.getGuaranteedDespatchDate();
            GuaranteedDespatchDateType rhsGuaranteedDespatchDate;
            rhsGuaranteedDespatchDate = that.getGuaranteedDespatchDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "guaranteedDespatchDate", lhsGuaranteedDespatchDate), LocatorUtils.property(thatLocator, "guaranteedDespatchDate", rhsGuaranteedDespatchDate), lhsGuaranteedDespatchDate, rhsGuaranteedDespatchDate, (this.guaranteedDespatchDate!= null), (that.guaranteedDespatchDate!= null))) {
                return false;
            }
        }
        {
            GuaranteedDespatchTimeType lhsGuaranteedDespatchTime;
            lhsGuaranteedDespatchTime = this.getGuaranteedDespatchTime();
            GuaranteedDespatchTimeType rhsGuaranteedDespatchTime;
            rhsGuaranteedDespatchTime = that.getGuaranteedDespatchTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "guaranteedDespatchTime", lhsGuaranteedDespatchTime), LocatorUtils.property(thatLocator, "guaranteedDespatchTime", rhsGuaranteedDespatchTime), lhsGuaranteedDespatchTime, rhsGuaranteedDespatchTime, (this.guaranteedDespatchTime!= null), (that.guaranteedDespatchTime!= null))) {
                return false;
            }
        }
        {
            ReleaseIDType lhsReleaseID;
            lhsReleaseID = this.getReleaseID();
            ReleaseIDType rhsReleaseID;
            rhsReleaseID = that.getReleaseID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "releaseID", lhsReleaseID), LocatorUtils.property(thatLocator, "releaseID", rhsReleaseID), lhsReleaseID, rhsReleaseID, (this.releaseID!= null), (that.releaseID!= null))) {
                return false;
            }
        }
        {
            List<InstructionsType> lhsInstructions;
            lhsInstructions = (((this.instructions!= null)&&(!this.instructions.isEmpty()))?this.getInstructions():null);
            List<InstructionsType> rhsInstructions;
            rhsInstructions = (((that.instructions!= null)&&(!that.instructions.isEmpty()))?that.getInstructions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "instructions", lhsInstructions), LocatorUtils.property(thatLocator, "instructions", rhsInstructions), lhsInstructions, rhsInstructions, ((this.instructions!= null)&&(!this.instructions.isEmpty())), ((that.instructions!= null)&&(!that.instructions.isEmpty())))) {
                return false;
            }
        }
        {
            AddressType lhsDespatchAddress;
            lhsDespatchAddress = this.getDespatchAddress();
            AddressType rhsDespatchAddress;
            rhsDespatchAddress = that.getDespatchAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "despatchAddress", lhsDespatchAddress), LocatorUtils.property(thatLocator, "despatchAddress", rhsDespatchAddress), lhsDespatchAddress, rhsDespatchAddress, (this.despatchAddress!= null), (that.despatchAddress!= null))) {
                return false;
            }
        }
        {
            LocationType lhsDespatchLocation;
            lhsDespatchLocation = this.getDespatchLocation();
            LocationType rhsDespatchLocation;
            rhsDespatchLocation = that.getDespatchLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "despatchLocation", lhsDespatchLocation), LocatorUtils.property(thatLocator, "despatchLocation", rhsDespatchLocation), lhsDespatchLocation, rhsDespatchLocation, (this.despatchLocation!= null), (that.despatchLocation!= null))) {
                return false;
            }
        }
        {
            PartyType lhsDespatchParty;
            lhsDespatchParty = this.getDespatchParty();
            PartyType rhsDespatchParty;
            rhsDespatchParty = that.getDespatchParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "despatchParty", lhsDespatchParty), LocatorUtils.property(thatLocator, "despatchParty", rhsDespatchParty), lhsDespatchParty, rhsDespatchParty, (this.despatchParty!= null), (that.despatchParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsCarrierParty;
            lhsCarrierParty = this.getCarrierParty();
            PartyType rhsCarrierParty;
            rhsCarrierParty = that.getCarrierParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "carrierParty", lhsCarrierParty), LocatorUtils.property(thatLocator, "carrierParty", rhsCarrierParty), lhsCarrierParty, rhsCarrierParty, (this.carrierParty!= null), (that.carrierParty!= null))) {
                return false;
            }
        }
        {
            List<PartyType> lhsNotifyParty;
            lhsNotifyParty = (((this.notifyParty!= null)&&(!this.notifyParty.isEmpty()))?this.getNotifyParty():null);
            List<PartyType> rhsNotifyParty;
            rhsNotifyParty = (((that.notifyParty!= null)&&(!that.notifyParty.isEmpty()))?that.getNotifyParty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notifyParty", lhsNotifyParty), LocatorUtils.property(thatLocator, "notifyParty", rhsNotifyParty), lhsNotifyParty, rhsNotifyParty, ((this.notifyParty!= null)&&(!this.notifyParty.isEmpty())), ((that.notifyParty!= null)&&(!that.notifyParty.isEmpty())))) {
                return false;
            }
        }
        {
            ContactType lhsContact;
            lhsContact = this.getContact();
            ContactType rhsContact;
            rhsContact = that.getContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contact", lhsContact), LocatorUtils.property(thatLocator, "contact", rhsContact), lhsContact, rhsContact, (this.contact!= null), (that.contact!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsEstimatedDespatchPeriod;
            lhsEstimatedDespatchPeriod = this.getEstimatedDespatchPeriod();
            PeriodType rhsEstimatedDespatchPeriod;
            rhsEstimatedDespatchPeriod = that.getEstimatedDespatchPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedDespatchPeriod", lhsEstimatedDespatchPeriod), LocatorUtils.property(thatLocator, "estimatedDespatchPeriod", rhsEstimatedDespatchPeriod), lhsEstimatedDespatchPeriod, rhsEstimatedDespatchPeriod, (this.estimatedDespatchPeriod!= null), (that.estimatedDespatchPeriod!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsRequestedDespatchPeriod;
            lhsRequestedDespatchPeriod = this.getRequestedDespatchPeriod();
            PeriodType rhsRequestedDespatchPeriod;
            rhsRequestedDespatchPeriod = that.getRequestedDespatchPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedDespatchPeriod", lhsRequestedDespatchPeriod), LocatorUtils.property(thatLocator, "requestedDespatchPeriod", rhsRequestedDespatchPeriod), lhsRequestedDespatchPeriod, rhsRequestedDespatchPeriod, (this.requestedDespatchPeriod!= null), (that.requestedDespatchPeriod!= null))) {
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
            RequestedDespatchDateType theRequestedDespatchDate;
            theRequestedDespatchDate = this.getRequestedDespatchDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedDespatchDate", theRequestedDespatchDate), currentHashCode, theRequestedDespatchDate, (this.requestedDespatchDate!= null));
        }
        {
            RequestedDespatchTimeType theRequestedDespatchTime;
            theRequestedDespatchTime = this.getRequestedDespatchTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedDespatchTime", theRequestedDespatchTime), currentHashCode, theRequestedDespatchTime, (this.requestedDespatchTime!= null));
        }
        {
            EstimatedDespatchDateType theEstimatedDespatchDate;
            theEstimatedDespatchDate = this.getEstimatedDespatchDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedDespatchDate", theEstimatedDespatchDate), currentHashCode, theEstimatedDespatchDate, (this.estimatedDespatchDate!= null));
        }
        {
            EstimatedDespatchTimeType theEstimatedDespatchTime;
            theEstimatedDespatchTime = this.getEstimatedDespatchTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedDespatchTime", theEstimatedDespatchTime), currentHashCode, theEstimatedDespatchTime, (this.estimatedDespatchTime!= null));
        }
        {
            ActualDespatchDateType theActualDespatchDate;
            theActualDespatchDate = this.getActualDespatchDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualDespatchDate", theActualDespatchDate), currentHashCode, theActualDespatchDate, (this.actualDespatchDate!= null));
        }
        {
            ActualDespatchTimeType theActualDespatchTime;
            theActualDespatchTime = this.getActualDespatchTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualDespatchTime", theActualDespatchTime), currentHashCode, theActualDespatchTime, (this.actualDespatchTime!= null));
        }
        {
            GuaranteedDespatchDateType theGuaranteedDespatchDate;
            theGuaranteedDespatchDate = this.getGuaranteedDespatchDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "guaranteedDespatchDate", theGuaranteedDespatchDate), currentHashCode, theGuaranteedDespatchDate, (this.guaranteedDespatchDate!= null));
        }
        {
            GuaranteedDespatchTimeType theGuaranteedDespatchTime;
            theGuaranteedDespatchTime = this.getGuaranteedDespatchTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "guaranteedDespatchTime", theGuaranteedDespatchTime), currentHashCode, theGuaranteedDespatchTime, (this.guaranteedDespatchTime!= null));
        }
        {
            ReleaseIDType theReleaseID;
            theReleaseID = this.getReleaseID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "releaseID", theReleaseID), currentHashCode, theReleaseID, (this.releaseID!= null));
        }
        {
            List<InstructionsType> theInstructions;
            theInstructions = (((this.instructions!= null)&&(!this.instructions.isEmpty()))?this.getInstructions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instructions", theInstructions), currentHashCode, theInstructions, ((this.instructions!= null)&&(!this.instructions.isEmpty())));
        }
        {
            AddressType theDespatchAddress;
            theDespatchAddress = this.getDespatchAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "despatchAddress", theDespatchAddress), currentHashCode, theDespatchAddress, (this.despatchAddress!= null));
        }
        {
            LocationType theDespatchLocation;
            theDespatchLocation = this.getDespatchLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "despatchLocation", theDespatchLocation), currentHashCode, theDespatchLocation, (this.despatchLocation!= null));
        }
        {
            PartyType theDespatchParty;
            theDespatchParty = this.getDespatchParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "despatchParty", theDespatchParty), currentHashCode, theDespatchParty, (this.despatchParty!= null));
        }
        {
            PartyType theCarrierParty;
            theCarrierParty = this.getCarrierParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "carrierParty", theCarrierParty), currentHashCode, theCarrierParty, (this.carrierParty!= null));
        }
        {
            List<PartyType> theNotifyParty;
            theNotifyParty = (((this.notifyParty!= null)&&(!this.notifyParty.isEmpty()))?this.getNotifyParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notifyParty", theNotifyParty), currentHashCode, theNotifyParty, ((this.notifyParty!= null)&&(!this.notifyParty.isEmpty())));
        }
        {
            ContactType theContact;
            theContact = this.getContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contact", theContact), currentHashCode, theContact, (this.contact!= null));
        }
        {
            PeriodType theEstimatedDespatchPeriod;
            theEstimatedDespatchPeriod = this.getEstimatedDespatchPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedDespatchPeriod", theEstimatedDespatchPeriod), currentHashCode, theEstimatedDespatchPeriod, (this.estimatedDespatchPeriod!= null));
        }
        {
            PeriodType theRequestedDespatchPeriod;
            theRequestedDespatchPeriod = this.getRequestedDespatchPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedDespatchPeriod", theRequestedDespatchPeriod), currentHashCode, theRequestedDespatchPeriod, (this.requestedDespatchPeriod!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
