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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CompletionIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IdentificationIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OccurrenceDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OccurrenceTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TypeCodeType;
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
 * <p>Classe Java per EventType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IdentificationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OccurrenceDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OccurrenceTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompletionIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CurrentStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OccurenceLocation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventType", propOrder = {
    "identificationID",
    "occurrenceDate",
    "occurrenceTime",
    "typeCode",
    "description",
    "completionIndicator",
    "currentStatus",
    "contact",
    "occurenceLocation"
})
public class EventType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "IdentificationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IdentificationIDType identificationID;
    @XmlElement(name = "OccurrenceDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OccurrenceDateType occurrenceDate;
    @XmlElement(name = "OccurrenceTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OccurrenceTimeType occurrenceTime;
    @XmlElement(name = "TypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TypeCodeType typeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "CompletionIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompletionIndicatorType completionIndicator;
    @XmlElement(name = "CurrentStatus")
    protected List<StatusType> currentStatus;
    @XmlElement(name = "Contact")
    protected List<ContactType> contact;
    @XmlElement(name = "OccurenceLocation")
    protected LocationType occurenceLocation;

    /**
     * Recupera il valore della proprietà identificationID.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationIDType }
     *     
     */
    public IdentificationIDType getIdentificationID() {
        return identificationID;
    }

    /**
     * Imposta il valore della proprietà identificationID.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationIDType }
     *     
     */
    public void setIdentificationID(IdentificationIDType value) {
        this.identificationID = value;
    }

    /**
     * Recupera il valore della proprietà occurrenceDate.
     * 
     * @return
     *     possible object is
     *     {@link OccurrenceDateType }
     *     
     */
    public OccurrenceDateType getOccurrenceDate() {
        return occurrenceDate;
    }

    /**
     * Imposta il valore della proprietà occurrenceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link OccurrenceDateType }
     *     
     */
    public void setOccurrenceDate(OccurrenceDateType value) {
        this.occurrenceDate = value;
    }

    /**
     * Recupera il valore della proprietà occurrenceTime.
     * 
     * @return
     *     possible object is
     *     {@link OccurrenceTimeType }
     *     
     */
    public OccurrenceTimeType getOccurrenceTime() {
        return occurrenceTime;
    }

    /**
     * Imposta il valore della proprietà occurrenceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link OccurrenceTimeType }
     *     
     */
    public void setOccurrenceTime(OccurrenceTimeType value) {
        this.occurrenceTime = value;
    }

    /**
     * Recupera il valore della proprietà typeCode.
     * 
     * @return
     *     possible object is
     *     {@link TypeCodeType }
     *     
     */
    public TypeCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Imposta il valore della proprietà typeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCodeType }
     *     
     */
    public void setTypeCode(TypeCodeType value) {
        this.typeCode = value;
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
     * Recupera il valore della proprietà completionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link CompletionIndicatorType }
     *     
     */
    public CompletionIndicatorType getCompletionIndicator() {
        return completionIndicator;
    }

    /**
     * Imposta il valore della proprietà completionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletionIndicatorType }
     *     
     */
    public void setCompletionIndicator(CompletionIndicatorType value) {
        this.completionIndicator = value;
    }

    /**
     * Gets the value of the currentStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType }
     * 
     * 
     */
    public List<StatusType> getCurrentStatus() {
        if (currentStatus == null) {
            currentStatus = new ArrayList<StatusType>();
        }
        return this.currentStatus;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactType }
     * 
     * 
     */
    public List<ContactType> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactType>();
        }
        return this.contact;
    }

    /**
     * Recupera il valore della proprietà occurenceLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getOccurenceLocation() {
        return occurenceLocation;
    }

    /**
     * Imposta il valore della proprietà occurenceLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setOccurenceLocation(LocationType value) {
        this.occurenceLocation = value;
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
            IdentificationIDType theIdentificationID;
            theIdentificationID = this.getIdentificationID();
            strategy.appendField(locator, this, "identificationID", buffer, theIdentificationID, (this.identificationID!= null));
        }
        {
            OccurrenceDateType theOccurrenceDate;
            theOccurrenceDate = this.getOccurrenceDate();
            strategy.appendField(locator, this, "occurrenceDate", buffer, theOccurrenceDate, (this.occurrenceDate!= null));
        }
        {
            OccurrenceTimeType theOccurrenceTime;
            theOccurrenceTime = this.getOccurrenceTime();
            strategy.appendField(locator, this, "occurrenceTime", buffer, theOccurrenceTime, (this.occurrenceTime!= null));
        }
        {
            TypeCodeType theTypeCode;
            theTypeCode = this.getTypeCode();
            strategy.appendField(locator, this, "typeCode", buffer, theTypeCode, (this.typeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            CompletionIndicatorType theCompletionIndicator;
            theCompletionIndicator = this.getCompletionIndicator();
            strategy.appendField(locator, this, "completionIndicator", buffer, theCompletionIndicator, (this.completionIndicator!= null));
        }
        {
            List<StatusType> theCurrentStatus;
            theCurrentStatus = (((this.currentStatus!= null)&&(!this.currentStatus.isEmpty()))?this.getCurrentStatus():null);
            strategy.appendField(locator, this, "currentStatus", buffer, theCurrentStatus, ((this.currentStatus!= null)&&(!this.currentStatus.isEmpty())));
        }
        {
            List<ContactType> theContact;
            theContact = (((this.contact!= null)&&(!this.contact.isEmpty()))?this.getContact():null);
            strategy.appendField(locator, this, "contact", buffer, theContact, ((this.contact!= null)&&(!this.contact.isEmpty())));
        }
        {
            LocationType theOccurenceLocation;
            theOccurenceLocation = this.getOccurenceLocation();
            strategy.appendField(locator, this, "occurenceLocation", buffer, theOccurenceLocation, (this.occurenceLocation!= null));
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
        final EventType that = ((EventType) object);
        {
            IdentificationIDType lhsIdentificationID;
            lhsIdentificationID = this.getIdentificationID();
            IdentificationIDType rhsIdentificationID;
            rhsIdentificationID = that.getIdentificationID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identificationID", lhsIdentificationID), LocatorUtils.property(thatLocator, "identificationID", rhsIdentificationID), lhsIdentificationID, rhsIdentificationID, (this.identificationID!= null), (that.identificationID!= null))) {
                return false;
            }
        }
        {
            OccurrenceDateType lhsOccurrenceDate;
            lhsOccurrenceDate = this.getOccurrenceDate();
            OccurrenceDateType rhsOccurrenceDate;
            rhsOccurrenceDate = that.getOccurrenceDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "occurrenceDate", lhsOccurrenceDate), LocatorUtils.property(thatLocator, "occurrenceDate", rhsOccurrenceDate), lhsOccurrenceDate, rhsOccurrenceDate, (this.occurrenceDate!= null), (that.occurrenceDate!= null))) {
                return false;
            }
        }
        {
            OccurrenceTimeType lhsOccurrenceTime;
            lhsOccurrenceTime = this.getOccurrenceTime();
            OccurrenceTimeType rhsOccurrenceTime;
            rhsOccurrenceTime = that.getOccurrenceTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "occurrenceTime", lhsOccurrenceTime), LocatorUtils.property(thatLocator, "occurrenceTime", rhsOccurrenceTime), lhsOccurrenceTime, rhsOccurrenceTime, (this.occurrenceTime!= null), (that.occurrenceTime!= null))) {
                return false;
            }
        }
        {
            TypeCodeType lhsTypeCode;
            lhsTypeCode = this.getTypeCode();
            TypeCodeType rhsTypeCode;
            rhsTypeCode = that.getTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typeCode", lhsTypeCode), LocatorUtils.property(thatLocator, "typeCode", rhsTypeCode), lhsTypeCode, rhsTypeCode, (this.typeCode!= null), (that.typeCode!= null))) {
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
            CompletionIndicatorType lhsCompletionIndicator;
            lhsCompletionIndicator = this.getCompletionIndicator();
            CompletionIndicatorType rhsCompletionIndicator;
            rhsCompletionIndicator = that.getCompletionIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "completionIndicator", lhsCompletionIndicator), LocatorUtils.property(thatLocator, "completionIndicator", rhsCompletionIndicator), lhsCompletionIndicator, rhsCompletionIndicator, (this.completionIndicator!= null), (that.completionIndicator!= null))) {
                return false;
            }
        }
        {
            List<StatusType> lhsCurrentStatus;
            lhsCurrentStatus = (((this.currentStatus!= null)&&(!this.currentStatus.isEmpty()))?this.getCurrentStatus():null);
            List<StatusType> rhsCurrentStatus;
            rhsCurrentStatus = (((that.currentStatus!= null)&&(!that.currentStatus.isEmpty()))?that.getCurrentStatus():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currentStatus", lhsCurrentStatus), LocatorUtils.property(thatLocator, "currentStatus", rhsCurrentStatus), lhsCurrentStatus, rhsCurrentStatus, ((this.currentStatus!= null)&&(!this.currentStatus.isEmpty())), ((that.currentStatus!= null)&&(!that.currentStatus.isEmpty())))) {
                return false;
            }
        }
        {
            List<ContactType> lhsContact;
            lhsContact = (((this.contact!= null)&&(!this.contact.isEmpty()))?this.getContact():null);
            List<ContactType> rhsContact;
            rhsContact = (((that.contact!= null)&&(!that.contact.isEmpty()))?that.getContact():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contact", lhsContact), LocatorUtils.property(thatLocator, "contact", rhsContact), lhsContact, rhsContact, ((this.contact!= null)&&(!this.contact.isEmpty())), ((that.contact!= null)&&(!that.contact.isEmpty())))) {
                return false;
            }
        }
        {
            LocationType lhsOccurenceLocation;
            lhsOccurenceLocation = this.getOccurenceLocation();
            LocationType rhsOccurenceLocation;
            rhsOccurenceLocation = that.getOccurenceLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "occurenceLocation", lhsOccurenceLocation), LocatorUtils.property(thatLocator, "occurenceLocation", rhsOccurenceLocation), lhsOccurenceLocation, rhsOccurenceLocation, (this.occurenceLocation!= null), (that.occurenceLocation!= null))) {
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
            IdentificationIDType theIdentificationID;
            theIdentificationID = this.getIdentificationID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identificationID", theIdentificationID), currentHashCode, theIdentificationID, (this.identificationID!= null));
        }
        {
            OccurrenceDateType theOccurrenceDate;
            theOccurrenceDate = this.getOccurrenceDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "occurrenceDate", theOccurrenceDate), currentHashCode, theOccurrenceDate, (this.occurrenceDate!= null));
        }
        {
            OccurrenceTimeType theOccurrenceTime;
            theOccurrenceTime = this.getOccurrenceTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "occurrenceTime", theOccurrenceTime), currentHashCode, theOccurrenceTime, (this.occurrenceTime!= null));
        }
        {
            TypeCodeType theTypeCode;
            theTypeCode = this.getTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "typeCode", theTypeCode), currentHashCode, theTypeCode, (this.typeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            CompletionIndicatorType theCompletionIndicator;
            theCompletionIndicator = this.getCompletionIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "completionIndicator", theCompletionIndicator), currentHashCode, theCompletionIndicator, (this.completionIndicator!= null));
        }
        {
            List<StatusType> theCurrentStatus;
            theCurrentStatus = (((this.currentStatus!= null)&&(!this.currentStatus.isEmpty()))?this.getCurrentStatus():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentStatus", theCurrentStatus), currentHashCode, theCurrentStatus, ((this.currentStatus!= null)&&(!this.currentStatus.isEmpty())));
        }
        {
            List<ContactType> theContact;
            theContact = (((this.contact!= null)&&(!this.contact.isEmpty()))?this.getContact():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contact", theContact), currentHashCode, theContact, ((this.contact!= null)&&(!this.contact.isEmpty())));
        }
        {
            LocationType theOccurenceLocation;
            theOccurenceLocation = this.getOccurenceLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "occurenceLocation", theOccurenceLocation), currentHashCode, theOccurenceLocation, (this.occurenceLocation!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
