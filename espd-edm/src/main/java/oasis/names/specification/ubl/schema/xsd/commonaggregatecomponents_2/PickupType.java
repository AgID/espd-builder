//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActualPickupDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActualPickupTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EarliestPickupDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EarliestPickupTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestPickupDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestPickupTimeType;
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
 * <p>Classe Java per PickupType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PickupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualPickupDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualPickupTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EarliestPickupDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EarliestPickupTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestPickupDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestPickupTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PickupLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PickupParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupType", propOrder = {
    "id",
    "actualPickupDate",
    "actualPickupTime",
    "earliestPickupDate",
    "earliestPickupTime",
    "latestPickupDate",
    "latestPickupTime",
    "pickupLocation",
    "pickupParty"
})
public class PickupType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "ActualPickupDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActualPickupDateType actualPickupDate;
    @XmlElement(name = "ActualPickupTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActualPickupTimeType actualPickupTime;
    @XmlElement(name = "EarliestPickupDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EarliestPickupDateType earliestPickupDate;
    @XmlElement(name = "EarliestPickupTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EarliestPickupTimeType earliestPickupTime;
    @XmlElement(name = "LatestPickupDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestPickupDateType latestPickupDate;
    @XmlElement(name = "LatestPickupTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestPickupTimeType latestPickupTime;
    @XmlElement(name = "PickupLocation")
    protected LocationType pickupLocation;
    @XmlElement(name = "PickupParty")
    protected PartyType pickupParty;

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
     * Recupera il valore della proprietà actualPickupDate.
     * 
     * @return
     *     possible object is
     *     {@link ActualPickupDateType }
     *     
     */
    public ActualPickupDateType getActualPickupDate() {
        return actualPickupDate;
    }

    /**
     * Imposta il valore della proprietà actualPickupDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualPickupDateType }
     *     
     */
    public void setActualPickupDate(ActualPickupDateType value) {
        this.actualPickupDate = value;
    }

    /**
     * Recupera il valore della proprietà actualPickupTime.
     * 
     * @return
     *     possible object is
     *     {@link ActualPickupTimeType }
     *     
     */
    public ActualPickupTimeType getActualPickupTime() {
        return actualPickupTime;
    }

    /**
     * Imposta il valore della proprietà actualPickupTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualPickupTimeType }
     *     
     */
    public void setActualPickupTime(ActualPickupTimeType value) {
        this.actualPickupTime = value;
    }

    /**
     * Recupera il valore della proprietà earliestPickupDate.
     * 
     * @return
     *     possible object is
     *     {@link EarliestPickupDateType }
     *     
     */
    public EarliestPickupDateType getEarliestPickupDate() {
        return earliestPickupDate;
    }

    /**
     * Imposta il valore della proprietà earliestPickupDate.
     * 
     * @param value
     *     allowed object is
     *     {@link EarliestPickupDateType }
     *     
     */
    public void setEarliestPickupDate(EarliestPickupDateType value) {
        this.earliestPickupDate = value;
    }

    /**
     * Recupera il valore della proprietà earliestPickupTime.
     * 
     * @return
     *     possible object is
     *     {@link EarliestPickupTimeType }
     *     
     */
    public EarliestPickupTimeType getEarliestPickupTime() {
        return earliestPickupTime;
    }

    /**
     * Imposta il valore della proprietà earliestPickupTime.
     * 
     * @param value
     *     allowed object is
     *     {@link EarliestPickupTimeType }
     *     
     */
    public void setEarliestPickupTime(EarliestPickupTimeType value) {
        this.earliestPickupTime = value;
    }

    /**
     * Recupera il valore della proprietà latestPickupDate.
     * 
     * @return
     *     possible object is
     *     {@link LatestPickupDateType }
     *     
     */
    public LatestPickupDateType getLatestPickupDate() {
        return latestPickupDate;
    }

    /**
     * Imposta il valore della proprietà latestPickupDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestPickupDateType }
     *     
     */
    public void setLatestPickupDate(LatestPickupDateType value) {
        this.latestPickupDate = value;
    }

    /**
     * Recupera il valore della proprietà latestPickupTime.
     * 
     * @return
     *     possible object is
     *     {@link LatestPickupTimeType }
     *     
     */
    public LatestPickupTimeType getLatestPickupTime() {
        return latestPickupTime;
    }

    /**
     * Imposta il valore della proprietà latestPickupTime.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestPickupTimeType }
     *     
     */
    public void setLatestPickupTime(LatestPickupTimeType value) {
        this.latestPickupTime = value;
    }

    /**
     * Recupera il valore della proprietà pickupLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getPickupLocation() {
        return pickupLocation;
    }

    /**
     * Imposta il valore della proprietà pickupLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setPickupLocation(LocationType value) {
        this.pickupLocation = value;
    }

    /**
     * Recupera il valore della proprietà pickupParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPickupParty() {
        return pickupParty;
    }

    /**
     * Imposta il valore della proprietà pickupParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPickupParty(PartyType value) {
        this.pickupParty = value;
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
            ActualPickupDateType theActualPickupDate;
            theActualPickupDate = this.getActualPickupDate();
            strategy.appendField(locator, this, "actualPickupDate", buffer, theActualPickupDate, (this.actualPickupDate!= null));
        }
        {
            ActualPickupTimeType theActualPickupTime;
            theActualPickupTime = this.getActualPickupTime();
            strategy.appendField(locator, this, "actualPickupTime", buffer, theActualPickupTime, (this.actualPickupTime!= null));
        }
        {
            EarliestPickupDateType theEarliestPickupDate;
            theEarliestPickupDate = this.getEarliestPickupDate();
            strategy.appendField(locator, this, "earliestPickupDate", buffer, theEarliestPickupDate, (this.earliestPickupDate!= null));
        }
        {
            EarliestPickupTimeType theEarliestPickupTime;
            theEarliestPickupTime = this.getEarliestPickupTime();
            strategy.appendField(locator, this, "earliestPickupTime", buffer, theEarliestPickupTime, (this.earliestPickupTime!= null));
        }
        {
            LatestPickupDateType theLatestPickupDate;
            theLatestPickupDate = this.getLatestPickupDate();
            strategy.appendField(locator, this, "latestPickupDate", buffer, theLatestPickupDate, (this.latestPickupDate!= null));
        }
        {
            LatestPickupTimeType theLatestPickupTime;
            theLatestPickupTime = this.getLatestPickupTime();
            strategy.appendField(locator, this, "latestPickupTime", buffer, theLatestPickupTime, (this.latestPickupTime!= null));
        }
        {
            LocationType thePickupLocation;
            thePickupLocation = this.getPickupLocation();
            strategy.appendField(locator, this, "pickupLocation", buffer, thePickupLocation, (this.pickupLocation!= null));
        }
        {
            PartyType thePickupParty;
            thePickupParty = this.getPickupParty();
            strategy.appendField(locator, this, "pickupParty", buffer, thePickupParty, (this.pickupParty!= null));
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
        final PickupType that = ((PickupType) object);
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
            ActualPickupDateType lhsActualPickupDate;
            lhsActualPickupDate = this.getActualPickupDate();
            ActualPickupDateType rhsActualPickupDate;
            rhsActualPickupDate = that.getActualPickupDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualPickupDate", lhsActualPickupDate), LocatorUtils.property(thatLocator, "actualPickupDate", rhsActualPickupDate), lhsActualPickupDate, rhsActualPickupDate, (this.actualPickupDate!= null), (that.actualPickupDate!= null))) {
                return false;
            }
        }
        {
            ActualPickupTimeType lhsActualPickupTime;
            lhsActualPickupTime = this.getActualPickupTime();
            ActualPickupTimeType rhsActualPickupTime;
            rhsActualPickupTime = that.getActualPickupTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualPickupTime", lhsActualPickupTime), LocatorUtils.property(thatLocator, "actualPickupTime", rhsActualPickupTime), lhsActualPickupTime, rhsActualPickupTime, (this.actualPickupTime!= null), (that.actualPickupTime!= null))) {
                return false;
            }
        }
        {
            EarliestPickupDateType lhsEarliestPickupDate;
            lhsEarliestPickupDate = this.getEarliestPickupDate();
            EarliestPickupDateType rhsEarliestPickupDate;
            rhsEarliestPickupDate = that.getEarliestPickupDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "earliestPickupDate", lhsEarliestPickupDate), LocatorUtils.property(thatLocator, "earliestPickupDate", rhsEarliestPickupDate), lhsEarliestPickupDate, rhsEarliestPickupDate, (this.earliestPickupDate!= null), (that.earliestPickupDate!= null))) {
                return false;
            }
        }
        {
            EarliestPickupTimeType lhsEarliestPickupTime;
            lhsEarliestPickupTime = this.getEarliestPickupTime();
            EarliestPickupTimeType rhsEarliestPickupTime;
            rhsEarliestPickupTime = that.getEarliestPickupTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "earliestPickupTime", lhsEarliestPickupTime), LocatorUtils.property(thatLocator, "earliestPickupTime", rhsEarliestPickupTime), lhsEarliestPickupTime, rhsEarliestPickupTime, (this.earliestPickupTime!= null), (that.earliestPickupTime!= null))) {
                return false;
            }
        }
        {
            LatestPickupDateType lhsLatestPickupDate;
            lhsLatestPickupDate = this.getLatestPickupDate();
            LatestPickupDateType rhsLatestPickupDate;
            rhsLatestPickupDate = that.getLatestPickupDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestPickupDate", lhsLatestPickupDate), LocatorUtils.property(thatLocator, "latestPickupDate", rhsLatestPickupDate), lhsLatestPickupDate, rhsLatestPickupDate, (this.latestPickupDate!= null), (that.latestPickupDate!= null))) {
                return false;
            }
        }
        {
            LatestPickupTimeType lhsLatestPickupTime;
            lhsLatestPickupTime = this.getLatestPickupTime();
            LatestPickupTimeType rhsLatestPickupTime;
            rhsLatestPickupTime = that.getLatestPickupTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestPickupTime", lhsLatestPickupTime), LocatorUtils.property(thatLocator, "latestPickupTime", rhsLatestPickupTime), lhsLatestPickupTime, rhsLatestPickupTime, (this.latestPickupTime!= null), (that.latestPickupTime!= null))) {
                return false;
            }
        }
        {
            LocationType lhsPickupLocation;
            lhsPickupLocation = this.getPickupLocation();
            LocationType rhsPickupLocation;
            rhsPickupLocation = that.getPickupLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pickupLocation", lhsPickupLocation), LocatorUtils.property(thatLocator, "pickupLocation", rhsPickupLocation), lhsPickupLocation, rhsPickupLocation, (this.pickupLocation!= null), (that.pickupLocation!= null))) {
                return false;
            }
        }
        {
            PartyType lhsPickupParty;
            lhsPickupParty = this.getPickupParty();
            PartyType rhsPickupParty;
            rhsPickupParty = that.getPickupParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pickupParty", lhsPickupParty), LocatorUtils.property(thatLocator, "pickupParty", rhsPickupParty), lhsPickupParty, rhsPickupParty, (this.pickupParty!= null), (that.pickupParty!= null))) {
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
            ActualPickupDateType theActualPickupDate;
            theActualPickupDate = this.getActualPickupDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualPickupDate", theActualPickupDate), currentHashCode, theActualPickupDate, (this.actualPickupDate!= null));
        }
        {
            ActualPickupTimeType theActualPickupTime;
            theActualPickupTime = this.getActualPickupTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualPickupTime", theActualPickupTime), currentHashCode, theActualPickupTime, (this.actualPickupTime!= null));
        }
        {
            EarliestPickupDateType theEarliestPickupDate;
            theEarliestPickupDate = this.getEarliestPickupDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "earliestPickupDate", theEarliestPickupDate), currentHashCode, theEarliestPickupDate, (this.earliestPickupDate!= null));
        }
        {
            EarliestPickupTimeType theEarliestPickupTime;
            theEarliestPickupTime = this.getEarliestPickupTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "earliestPickupTime", theEarliestPickupTime), currentHashCode, theEarliestPickupTime, (this.earliestPickupTime!= null));
        }
        {
            LatestPickupDateType theLatestPickupDate;
            theLatestPickupDate = this.getLatestPickupDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestPickupDate", theLatestPickupDate), currentHashCode, theLatestPickupDate, (this.latestPickupDate!= null));
        }
        {
            LatestPickupTimeType theLatestPickupTime;
            theLatestPickupTime = this.getLatestPickupTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestPickupTime", theLatestPickupTime), currentHashCode, theLatestPickupTime, (this.latestPickupTime!= null));
        }
        {
            LocationType thePickupLocation;
            thePickupLocation = this.getPickupLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pickupLocation", thePickupLocation), currentHashCode, thePickupLocation, (this.pickupLocation!= null));
        }
        {
            PartyType thePickupParty;
            thePickupParty = this.getPickupParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pickupParty", thePickupParty), currentHashCode, thePickupParty, (this.pickupParty!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
