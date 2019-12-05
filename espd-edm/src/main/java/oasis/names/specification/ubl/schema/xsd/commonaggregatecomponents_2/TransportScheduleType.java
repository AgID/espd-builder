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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReferenceDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReferenceTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReliabilityPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RemarksType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SequenceNumericType;
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
 * <p>Classe Java per TransportScheduleType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransportScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceNumeric"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReliabilityPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Remarks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}StatusLocation"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedArrivalTransportEvent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportScheduleType", propOrder = {
    "sequenceNumeric",
    "referenceDate",
    "referenceTime",
    "reliabilityPercent",
    "remarks",
    "statusLocation",
    "actualArrivalTransportEvent",
    "actualDepartureTransportEvent",
    "estimatedDepartureTransportEvent",
    "estimatedArrivalTransportEvent",
    "plannedDepartureTransportEvent",
    "plannedArrivalTransportEvent"
})
public class TransportScheduleType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SequenceNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected SequenceNumericType sequenceNumeric;
    @XmlElement(name = "ReferenceDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReferenceDateType referenceDate;
    @XmlElement(name = "ReferenceTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReferenceTimeType referenceTime;
    @XmlElement(name = "ReliabilityPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReliabilityPercentType reliabilityPercent;
    @XmlElement(name = "Remarks", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<RemarksType> remarks;
    @XmlElement(name = "StatusLocation", required = true)
    protected LocationType statusLocation;
    @XmlElement(name = "ActualArrivalTransportEvent")
    protected TransportEventType actualArrivalTransportEvent;
    @XmlElement(name = "ActualDepartureTransportEvent")
    protected TransportEventType actualDepartureTransportEvent;
    @XmlElement(name = "EstimatedDepartureTransportEvent")
    protected TransportEventType estimatedDepartureTransportEvent;
    @XmlElement(name = "EstimatedArrivalTransportEvent")
    protected TransportEventType estimatedArrivalTransportEvent;
    @XmlElement(name = "PlannedDepartureTransportEvent")
    protected TransportEventType plannedDepartureTransportEvent;
    @XmlElement(name = "PlannedArrivalTransportEvent")
    protected TransportEventType plannedArrivalTransportEvent;

    /**
     * Recupera il valore della proprietà sequenceNumeric.
     * 
     * @return
     *     possible object is
     *     {@link SequenceNumericType }
     *     
     */
    public SequenceNumericType getSequenceNumeric() {
        return sequenceNumeric;
    }

    /**
     * Imposta il valore della proprietà sequenceNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceNumericType }
     *     
     */
    public void setSequenceNumeric(SequenceNumericType value) {
        this.sequenceNumeric = value;
    }

    /**
     * Recupera il valore della proprietà referenceDate.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDateType }
     *     
     */
    public ReferenceDateType getReferenceDate() {
        return referenceDate;
    }

    /**
     * Imposta il valore della proprietà referenceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDateType }
     *     
     */
    public void setReferenceDate(ReferenceDateType value) {
        this.referenceDate = value;
    }

    /**
     * Recupera il valore della proprietà referenceTime.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceTimeType }
     *     
     */
    public ReferenceTimeType getReferenceTime() {
        return referenceTime;
    }

    /**
     * Imposta il valore della proprietà referenceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceTimeType }
     *     
     */
    public void setReferenceTime(ReferenceTimeType value) {
        this.referenceTime = value;
    }

    /**
     * Recupera il valore della proprietà reliabilityPercent.
     * 
     * @return
     *     possible object is
     *     {@link ReliabilityPercentType }
     *     
     */
    public ReliabilityPercentType getReliabilityPercent() {
        return reliabilityPercent;
    }

    /**
     * Imposta il valore della proprietà reliabilityPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link ReliabilityPercentType }
     *     
     */
    public void setReliabilityPercent(ReliabilityPercentType value) {
        this.reliabilityPercent = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarksType }
     * 
     * 
     */
    public List<RemarksType> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<RemarksType>();
        }
        return this.remarks;
    }

    /**
     * Recupera il valore della proprietà statusLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getStatusLocation() {
        return statusLocation;
    }

    /**
     * Imposta il valore della proprietà statusLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setStatusLocation(LocationType value) {
        this.statusLocation = value;
    }

    /**
     * Recupera il valore della proprietà actualArrivalTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getActualArrivalTransportEvent() {
        return actualArrivalTransportEvent;
    }

    /**
     * Imposta il valore della proprietà actualArrivalTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setActualArrivalTransportEvent(TransportEventType value) {
        this.actualArrivalTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà actualDepartureTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getActualDepartureTransportEvent() {
        return actualDepartureTransportEvent;
    }

    /**
     * Imposta il valore della proprietà actualDepartureTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setActualDepartureTransportEvent(TransportEventType value) {
        this.actualDepartureTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà estimatedDepartureTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getEstimatedDepartureTransportEvent() {
        return estimatedDepartureTransportEvent;
    }

    /**
     * Imposta il valore della proprietà estimatedDepartureTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setEstimatedDepartureTransportEvent(TransportEventType value) {
        this.estimatedDepartureTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà estimatedArrivalTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getEstimatedArrivalTransportEvent() {
        return estimatedArrivalTransportEvent;
    }

    /**
     * Imposta il valore della proprietà estimatedArrivalTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setEstimatedArrivalTransportEvent(TransportEventType value) {
        this.estimatedArrivalTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà plannedDepartureTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getPlannedDepartureTransportEvent() {
        return plannedDepartureTransportEvent;
    }

    /**
     * Imposta il valore della proprietà plannedDepartureTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setPlannedDepartureTransportEvent(TransportEventType value) {
        this.plannedDepartureTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà plannedArrivalTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getPlannedArrivalTransportEvent() {
        return plannedArrivalTransportEvent;
    }

    /**
     * Imposta il valore della proprietà plannedArrivalTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setPlannedArrivalTransportEvent(TransportEventType value) {
        this.plannedArrivalTransportEvent = value;
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
            SequenceNumericType theSequenceNumeric;
            theSequenceNumeric = this.getSequenceNumeric();
            strategy.appendField(locator, this, "sequenceNumeric", buffer, theSequenceNumeric, (this.sequenceNumeric!= null));
        }
        {
            ReferenceDateType theReferenceDate;
            theReferenceDate = this.getReferenceDate();
            strategy.appendField(locator, this, "referenceDate", buffer, theReferenceDate, (this.referenceDate!= null));
        }
        {
            ReferenceTimeType theReferenceTime;
            theReferenceTime = this.getReferenceTime();
            strategy.appendField(locator, this, "referenceTime", buffer, theReferenceTime, (this.referenceTime!= null));
        }
        {
            ReliabilityPercentType theReliabilityPercent;
            theReliabilityPercent = this.getReliabilityPercent();
            strategy.appendField(locator, this, "reliabilityPercent", buffer, theReliabilityPercent, (this.reliabilityPercent!= null));
        }
        {
            List<RemarksType> theRemarks;
            theRemarks = (((this.remarks!= null)&&(!this.remarks.isEmpty()))?this.getRemarks():null);
            strategy.appendField(locator, this, "remarks", buffer, theRemarks, ((this.remarks!= null)&&(!this.remarks.isEmpty())));
        }
        {
            LocationType theStatusLocation;
            theStatusLocation = this.getStatusLocation();
            strategy.appendField(locator, this, "statusLocation", buffer, theStatusLocation, (this.statusLocation!= null));
        }
        {
            TransportEventType theActualArrivalTransportEvent;
            theActualArrivalTransportEvent = this.getActualArrivalTransportEvent();
            strategy.appendField(locator, this, "actualArrivalTransportEvent", buffer, theActualArrivalTransportEvent, (this.actualArrivalTransportEvent!= null));
        }
        {
            TransportEventType theActualDepartureTransportEvent;
            theActualDepartureTransportEvent = this.getActualDepartureTransportEvent();
            strategy.appendField(locator, this, "actualDepartureTransportEvent", buffer, theActualDepartureTransportEvent, (this.actualDepartureTransportEvent!= null));
        }
        {
            TransportEventType theEstimatedDepartureTransportEvent;
            theEstimatedDepartureTransportEvent = this.getEstimatedDepartureTransportEvent();
            strategy.appendField(locator, this, "estimatedDepartureTransportEvent", buffer, theEstimatedDepartureTransportEvent, (this.estimatedDepartureTransportEvent!= null));
        }
        {
            TransportEventType theEstimatedArrivalTransportEvent;
            theEstimatedArrivalTransportEvent = this.getEstimatedArrivalTransportEvent();
            strategy.appendField(locator, this, "estimatedArrivalTransportEvent", buffer, theEstimatedArrivalTransportEvent, (this.estimatedArrivalTransportEvent!= null));
        }
        {
            TransportEventType thePlannedDepartureTransportEvent;
            thePlannedDepartureTransportEvent = this.getPlannedDepartureTransportEvent();
            strategy.appendField(locator, this, "plannedDepartureTransportEvent", buffer, thePlannedDepartureTransportEvent, (this.plannedDepartureTransportEvent!= null));
        }
        {
            TransportEventType thePlannedArrivalTransportEvent;
            thePlannedArrivalTransportEvent = this.getPlannedArrivalTransportEvent();
            strategy.appendField(locator, this, "plannedArrivalTransportEvent", buffer, thePlannedArrivalTransportEvent, (this.plannedArrivalTransportEvent!= null));
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
        final TransportScheduleType that = ((TransportScheduleType) object);
        {
            SequenceNumericType lhsSequenceNumeric;
            lhsSequenceNumeric = this.getSequenceNumeric();
            SequenceNumericType rhsSequenceNumeric;
            rhsSequenceNumeric = that.getSequenceNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceNumeric", lhsSequenceNumeric), LocatorUtils.property(thatLocator, "sequenceNumeric", rhsSequenceNumeric), lhsSequenceNumeric, rhsSequenceNumeric, (this.sequenceNumeric!= null), (that.sequenceNumeric!= null))) {
                return false;
            }
        }
        {
            ReferenceDateType lhsReferenceDate;
            lhsReferenceDate = this.getReferenceDate();
            ReferenceDateType rhsReferenceDate;
            rhsReferenceDate = that.getReferenceDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceDate", lhsReferenceDate), LocatorUtils.property(thatLocator, "referenceDate", rhsReferenceDate), lhsReferenceDate, rhsReferenceDate, (this.referenceDate!= null), (that.referenceDate!= null))) {
                return false;
            }
        }
        {
            ReferenceTimeType lhsReferenceTime;
            lhsReferenceTime = this.getReferenceTime();
            ReferenceTimeType rhsReferenceTime;
            rhsReferenceTime = that.getReferenceTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceTime", lhsReferenceTime), LocatorUtils.property(thatLocator, "referenceTime", rhsReferenceTime), lhsReferenceTime, rhsReferenceTime, (this.referenceTime!= null), (that.referenceTime!= null))) {
                return false;
            }
        }
        {
            ReliabilityPercentType lhsReliabilityPercent;
            lhsReliabilityPercent = this.getReliabilityPercent();
            ReliabilityPercentType rhsReliabilityPercent;
            rhsReliabilityPercent = that.getReliabilityPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reliabilityPercent", lhsReliabilityPercent), LocatorUtils.property(thatLocator, "reliabilityPercent", rhsReliabilityPercent), lhsReliabilityPercent, rhsReliabilityPercent, (this.reliabilityPercent!= null), (that.reliabilityPercent!= null))) {
                return false;
            }
        }
        {
            List<RemarksType> lhsRemarks;
            lhsRemarks = (((this.remarks!= null)&&(!this.remarks.isEmpty()))?this.getRemarks():null);
            List<RemarksType> rhsRemarks;
            rhsRemarks = (((that.remarks!= null)&&(!that.remarks.isEmpty()))?that.getRemarks():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remarks", lhsRemarks), LocatorUtils.property(thatLocator, "remarks", rhsRemarks), lhsRemarks, rhsRemarks, ((this.remarks!= null)&&(!this.remarks.isEmpty())), ((that.remarks!= null)&&(!that.remarks.isEmpty())))) {
                return false;
            }
        }
        {
            LocationType lhsStatusLocation;
            lhsStatusLocation = this.getStatusLocation();
            LocationType rhsStatusLocation;
            rhsStatusLocation = that.getStatusLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusLocation", lhsStatusLocation), LocatorUtils.property(thatLocator, "statusLocation", rhsStatusLocation), lhsStatusLocation, rhsStatusLocation, (this.statusLocation!= null), (that.statusLocation!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsActualArrivalTransportEvent;
            lhsActualArrivalTransportEvent = this.getActualArrivalTransportEvent();
            TransportEventType rhsActualArrivalTransportEvent;
            rhsActualArrivalTransportEvent = that.getActualArrivalTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualArrivalTransportEvent", lhsActualArrivalTransportEvent), LocatorUtils.property(thatLocator, "actualArrivalTransportEvent", rhsActualArrivalTransportEvent), lhsActualArrivalTransportEvent, rhsActualArrivalTransportEvent, (this.actualArrivalTransportEvent!= null), (that.actualArrivalTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsActualDepartureTransportEvent;
            lhsActualDepartureTransportEvent = this.getActualDepartureTransportEvent();
            TransportEventType rhsActualDepartureTransportEvent;
            rhsActualDepartureTransportEvent = that.getActualDepartureTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualDepartureTransportEvent", lhsActualDepartureTransportEvent), LocatorUtils.property(thatLocator, "actualDepartureTransportEvent", rhsActualDepartureTransportEvent), lhsActualDepartureTransportEvent, rhsActualDepartureTransportEvent, (this.actualDepartureTransportEvent!= null), (that.actualDepartureTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsEstimatedDepartureTransportEvent;
            lhsEstimatedDepartureTransportEvent = this.getEstimatedDepartureTransportEvent();
            TransportEventType rhsEstimatedDepartureTransportEvent;
            rhsEstimatedDepartureTransportEvent = that.getEstimatedDepartureTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedDepartureTransportEvent", lhsEstimatedDepartureTransportEvent), LocatorUtils.property(thatLocator, "estimatedDepartureTransportEvent", rhsEstimatedDepartureTransportEvent), lhsEstimatedDepartureTransportEvent, rhsEstimatedDepartureTransportEvent, (this.estimatedDepartureTransportEvent!= null), (that.estimatedDepartureTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsEstimatedArrivalTransportEvent;
            lhsEstimatedArrivalTransportEvent = this.getEstimatedArrivalTransportEvent();
            TransportEventType rhsEstimatedArrivalTransportEvent;
            rhsEstimatedArrivalTransportEvent = that.getEstimatedArrivalTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedArrivalTransportEvent", lhsEstimatedArrivalTransportEvent), LocatorUtils.property(thatLocator, "estimatedArrivalTransportEvent", rhsEstimatedArrivalTransportEvent), lhsEstimatedArrivalTransportEvent, rhsEstimatedArrivalTransportEvent, (this.estimatedArrivalTransportEvent!= null), (that.estimatedArrivalTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsPlannedDepartureTransportEvent;
            lhsPlannedDepartureTransportEvent = this.getPlannedDepartureTransportEvent();
            TransportEventType rhsPlannedDepartureTransportEvent;
            rhsPlannedDepartureTransportEvent = that.getPlannedDepartureTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plannedDepartureTransportEvent", lhsPlannedDepartureTransportEvent), LocatorUtils.property(thatLocator, "plannedDepartureTransportEvent", rhsPlannedDepartureTransportEvent), lhsPlannedDepartureTransportEvent, rhsPlannedDepartureTransportEvent, (this.plannedDepartureTransportEvent!= null), (that.plannedDepartureTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsPlannedArrivalTransportEvent;
            lhsPlannedArrivalTransportEvent = this.getPlannedArrivalTransportEvent();
            TransportEventType rhsPlannedArrivalTransportEvent;
            rhsPlannedArrivalTransportEvent = that.getPlannedArrivalTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plannedArrivalTransportEvent", lhsPlannedArrivalTransportEvent), LocatorUtils.property(thatLocator, "plannedArrivalTransportEvent", rhsPlannedArrivalTransportEvent), lhsPlannedArrivalTransportEvent, rhsPlannedArrivalTransportEvent, (this.plannedArrivalTransportEvent!= null), (that.plannedArrivalTransportEvent!= null))) {
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
            SequenceNumericType theSequenceNumeric;
            theSequenceNumeric = this.getSequenceNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNumeric", theSequenceNumeric), currentHashCode, theSequenceNumeric, (this.sequenceNumeric!= null));
        }
        {
            ReferenceDateType theReferenceDate;
            theReferenceDate = this.getReferenceDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceDate", theReferenceDate), currentHashCode, theReferenceDate, (this.referenceDate!= null));
        }
        {
            ReferenceTimeType theReferenceTime;
            theReferenceTime = this.getReferenceTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceTime", theReferenceTime), currentHashCode, theReferenceTime, (this.referenceTime!= null));
        }
        {
            ReliabilityPercentType theReliabilityPercent;
            theReliabilityPercent = this.getReliabilityPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reliabilityPercent", theReliabilityPercent), currentHashCode, theReliabilityPercent, (this.reliabilityPercent!= null));
        }
        {
            List<RemarksType> theRemarks;
            theRemarks = (((this.remarks!= null)&&(!this.remarks.isEmpty()))?this.getRemarks():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remarks", theRemarks), currentHashCode, theRemarks, ((this.remarks!= null)&&(!this.remarks.isEmpty())));
        }
        {
            LocationType theStatusLocation;
            theStatusLocation = this.getStatusLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statusLocation", theStatusLocation), currentHashCode, theStatusLocation, (this.statusLocation!= null));
        }
        {
            TransportEventType theActualArrivalTransportEvent;
            theActualArrivalTransportEvent = this.getActualArrivalTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualArrivalTransportEvent", theActualArrivalTransportEvent), currentHashCode, theActualArrivalTransportEvent, (this.actualArrivalTransportEvent!= null));
        }
        {
            TransportEventType theActualDepartureTransportEvent;
            theActualDepartureTransportEvent = this.getActualDepartureTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualDepartureTransportEvent", theActualDepartureTransportEvent), currentHashCode, theActualDepartureTransportEvent, (this.actualDepartureTransportEvent!= null));
        }
        {
            TransportEventType theEstimatedDepartureTransportEvent;
            theEstimatedDepartureTransportEvent = this.getEstimatedDepartureTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedDepartureTransportEvent", theEstimatedDepartureTransportEvent), currentHashCode, theEstimatedDepartureTransportEvent, (this.estimatedDepartureTransportEvent!= null));
        }
        {
            TransportEventType theEstimatedArrivalTransportEvent;
            theEstimatedArrivalTransportEvent = this.getEstimatedArrivalTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedArrivalTransportEvent", theEstimatedArrivalTransportEvent), currentHashCode, theEstimatedArrivalTransportEvent, (this.estimatedArrivalTransportEvent!= null));
        }
        {
            TransportEventType thePlannedDepartureTransportEvent;
            thePlannedDepartureTransportEvent = this.getPlannedDepartureTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "plannedDepartureTransportEvent", thePlannedDepartureTransportEvent), currentHashCode, thePlannedDepartureTransportEvent, (this.plannedDepartureTransportEvent!= null));
        }
        {
            TransportEventType thePlannedArrivalTransportEvent;
            thePlannedArrivalTransportEvent = this.getPlannedArrivalTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "plannedArrivalTransportEvent", thePlannedArrivalTransportEvent), currentHashCode, thePlannedArrivalTransportEvent, (this.plannedArrivalTransportEvent!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
