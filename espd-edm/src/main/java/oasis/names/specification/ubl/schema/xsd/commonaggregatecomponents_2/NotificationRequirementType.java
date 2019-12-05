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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NotificationTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PostEventNotificationDurationMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PreEventNotificationDurationMeasureType;
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
 * <p>Classe Java per NotificationRequirementType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="NotificationRequirementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NotificationTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PostEventNotificationDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreEventNotificationDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotifyParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotificationPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotificationLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationRequirementType", propOrder = {
    "notificationTypeCode",
    "postEventNotificationDurationMeasure",
    "preEventNotificationDurationMeasure",
    "notifyParty",
    "notificationPeriod",
    "notificationLocation"
})
public class NotificationRequirementType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "NotificationTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected NotificationTypeCodeType notificationTypeCode;
    @XmlElement(name = "PostEventNotificationDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PostEventNotificationDurationMeasureType postEventNotificationDurationMeasure;
    @XmlElement(name = "PreEventNotificationDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PreEventNotificationDurationMeasureType preEventNotificationDurationMeasure;
    @XmlElement(name = "NotifyParty")
    protected List<PartyType> notifyParty;
    @XmlElement(name = "NotificationPeriod")
    protected List<PeriodType> notificationPeriod;
    @XmlElement(name = "NotificationLocation")
    protected List<LocationType> notificationLocation;

    /**
     * Recupera il valore della proprietà notificationTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link NotificationTypeCodeType }
     *     
     */
    public NotificationTypeCodeType getNotificationTypeCode() {
        return notificationTypeCode;
    }

    /**
     * Imposta il valore della proprietà notificationTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationTypeCodeType }
     *     
     */
    public void setNotificationTypeCode(NotificationTypeCodeType value) {
        this.notificationTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà postEventNotificationDurationMeasure.
     * 
     * @return
     *     possible object is
     *     {@link PostEventNotificationDurationMeasureType }
     *     
     */
    public PostEventNotificationDurationMeasureType getPostEventNotificationDurationMeasure() {
        return postEventNotificationDurationMeasure;
    }

    /**
     * Imposta il valore della proprietà postEventNotificationDurationMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link PostEventNotificationDurationMeasureType }
     *     
     */
    public void setPostEventNotificationDurationMeasure(PostEventNotificationDurationMeasureType value) {
        this.postEventNotificationDurationMeasure = value;
    }

    /**
     * Recupera il valore della proprietà preEventNotificationDurationMeasure.
     * 
     * @return
     *     possible object is
     *     {@link PreEventNotificationDurationMeasureType }
     *     
     */
    public PreEventNotificationDurationMeasureType getPreEventNotificationDurationMeasure() {
        return preEventNotificationDurationMeasure;
    }

    /**
     * Imposta il valore della proprietà preEventNotificationDurationMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link PreEventNotificationDurationMeasureType }
     *     
     */
    public void setPreEventNotificationDurationMeasure(PreEventNotificationDurationMeasureType value) {
        this.preEventNotificationDurationMeasure = value;
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
     * Gets the value of the notificationPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getNotificationPeriod() {
        if (notificationPeriod == null) {
            notificationPeriod = new ArrayList<PeriodType>();
        }
        return this.notificationPeriod;
    }

    /**
     * Gets the value of the notificationLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getNotificationLocation() {
        if (notificationLocation == null) {
            notificationLocation = new ArrayList<LocationType>();
        }
        return this.notificationLocation;
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
            NotificationTypeCodeType theNotificationTypeCode;
            theNotificationTypeCode = this.getNotificationTypeCode();
            strategy.appendField(locator, this, "notificationTypeCode", buffer, theNotificationTypeCode, (this.notificationTypeCode!= null));
        }
        {
            PostEventNotificationDurationMeasureType thePostEventNotificationDurationMeasure;
            thePostEventNotificationDurationMeasure = this.getPostEventNotificationDurationMeasure();
            strategy.appendField(locator, this, "postEventNotificationDurationMeasure", buffer, thePostEventNotificationDurationMeasure, (this.postEventNotificationDurationMeasure!= null));
        }
        {
            PreEventNotificationDurationMeasureType thePreEventNotificationDurationMeasure;
            thePreEventNotificationDurationMeasure = this.getPreEventNotificationDurationMeasure();
            strategy.appendField(locator, this, "preEventNotificationDurationMeasure", buffer, thePreEventNotificationDurationMeasure, (this.preEventNotificationDurationMeasure!= null));
        }
        {
            List<PartyType> theNotifyParty;
            theNotifyParty = (((this.notifyParty!= null)&&(!this.notifyParty.isEmpty()))?this.getNotifyParty():null);
            strategy.appendField(locator, this, "notifyParty", buffer, theNotifyParty, ((this.notifyParty!= null)&&(!this.notifyParty.isEmpty())));
        }
        {
            List<PeriodType> theNotificationPeriod;
            theNotificationPeriod = (((this.notificationPeriod!= null)&&(!this.notificationPeriod.isEmpty()))?this.getNotificationPeriod():null);
            strategy.appendField(locator, this, "notificationPeriod", buffer, theNotificationPeriod, ((this.notificationPeriod!= null)&&(!this.notificationPeriod.isEmpty())));
        }
        {
            List<LocationType> theNotificationLocation;
            theNotificationLocation = (((this.notificationLocation!= null)&&(!this.notificationLocation.isEmpty()))?this.getNotificationLocation():null);
            strategy.appendField(locator, this, "notificationLocation", buffer, theNotificationLocation, ((this.notificationLocation!= null)&&(!this.notificationLocation.isEmpty())));
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
        final NotificationRequirementType that = ((NotificationRequirementType) object);
        {
            NotificationTypeCodeType lhsNotificationTypeCode;
            lhsNotificationTypeCode = this.getNotificationTypeCode();
            NotificationTypeCodeType rhsNotificationTypeCode;
            rhsNotificationTypeCode = that.getNotificationTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notificationTypeCode", lhsNotificationTypeCode), LocatorUtils.property(thatLocator, "notificationTypeCode", rhsNotificationTypeCode), lhsNotificationTypeCode, rhsNotificationTypeCode, (this.notificationTypeCode!= null), (that.notificationTypeCode!= null))) {
                return false;
            }
        }
        {
            PostEventNotificationDurationMeasureType lhsPostEventNotificationDurationMeasure;
            lhsPostEventNotificationDurationMeasure = this.getPostEventNotificationDurationMeasure();
            PostEventNotificationDurationMeasureType rhsPostEventNotificationDurationMeasure;
            rhsPostEventNotificationDurationMeasure = that.getPostEventNotificationDurationMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postEventNotificationDurationMeasure", lhsPostEventNotificationDurationMeasure), LocatorUtils.property(thatLocator, "postEventNotificationDurationMeasure", rhsPostEventNotificationDurationMeasure), lhsPostEventNotificationDurationMeasure, rhsPostEventNotificationDurationMeasure, (this.postEventNotificationDurationMeasure!= null), (that.postEventNotificationDurationMeasure!= null))) {
                return false;
            }
        }
        {
            PreEventNotificationDurationMeasureType lhsPreEventNotificationDurationMeasure;
            lhsPreEventNotificationDurationMeasure = this.getPreEventNotificationDurationMeasure();
            PreEventNotificationDurationMeasureType rhsPreEventNotificationDurationMeasure;
            rhsPreEventNotificationDurationMeasure = that.getPreEventNotificationDurationMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preEventNotificationDurationMeasure", lhsPreEventNotificationDurationMeasure), LocatorUtils.property(thatLocator, "preEventNotificationDurationMeasure", rhsPreEventNotificationDurationMeasure), lhsPreEventNotificationDurationMeasure, rhsPreEventNotificationDurationMeasure, (this.preEventNotificationDurationMeasure!= null), (that.preEventNotificationDurationMeasure!= null))) {
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
            List<PeriodType> lhsNotificationPeriod;
            lhsNotificationPeriod = (((this.notificationPeriod!= null)&&(!this.notificationPeriod.isEmpty()))?this.getNotificationPeriod():null);
            List<PeriodType> rhsNotificationPeriod;
            rhsNotificationPeriod = (((that.notificationPeriod!= null)&&(!that.notificationPeriod.isEmpty()))?that.getNotificationPeriod():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notificationPeriod", lhsNotificationPeriod), LocatorUtils.property(thatLocator, "notificationPeriod", rhsNotificationPeriod), lhsNotificationPeriod, rhsNotificationPeriod, ((this.notificationPeriod!= null)&&(!this.notificationPeriod.isEmpty())), ((that.notificationPeriod!= null)&&(!that.notificationPeriod.isEmpty())))) {
                return false;
            }
        }
        {
            List<LocationType> lhsNotificationLocation;
            lhsNotificationLocation = (((this.notificationLocation!= null)&&(!this.notificationLocation.isEmpty()))?this.getNotificationLocation():null);
            List<LocationType> rhsNotificationLocation;
            rhsNotificationLocation = (((that.notificationLocation!= null)&&(!that.notificationLocation.isEmpty()))?that.getNotificationLocation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notificationLocation", lhsNotificationLocation), LocatorUtils.property(thatLocator, "notificationLocation", rhsNotificationLocation), lhsNotificationLocation, rhsNotificationLocation, ((this.notificationLocation!= null)&&(!this.notificationLocation.isEmpty())), ((that.notificationLocation!= null)&&(!that.notificationLocation.isEmpty())))) {
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
            NotificationTypeCodeType theNotificationTypeCode;
            theNotificationTypeCode = this.getNotificationTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notificationTypeCode", theNotificationTypeCode), currentHashCode, theNotificationTypeCode, (this.notificationTypeCode!= null));
        }
        {
            PostEventNotificationDurationMeasureType thePostEventNotificationDurationMeasure;
            thePostEventNotificationDurationMeasure = this.getPostEventNotificationDurationMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postEventNotificationDurationMeasure", thePostEventNotificationDurationMeasure), currentHashCode, thePostEventNotificationDurationMeasure, (this.postEventNotificationDurationMeasure!= null));
        }
        {
            PreEventNotificationDurationMeasureType thePreEventNotificationDurationMeasure;
            thePreEventNotificationDurationMeasure = this.getPreEventNotificationDurationMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preEventNotificationDurationMeasure", thePreEventNotificationDurationMeasure), currentHashCode, thePreEventNotificationDurationMeasure, (this.preEventNotificationDurationMeasure!= null));
        }
        {
            List<PartyType> theNotifyParty;
            theNotifyParty = (((this.notifyParty!= null)&&(!this.notifyParty.isEmpty()))?this.getNotifyParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notifyParty", theNotifyParty), currentHashCode, theNotifyParty, ((this.notifyParty!= null)&&(!this.notifyParty.isEmpty())));
        }
        {
            List<PeriodType> theNotificationPeriod;
            theNotificationPeriod = (((this.notificationPeriod!= null)&&(!this.notificationPeriod.isEmpty()))?this.getNotificationPeriod():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notificationPeriod", theNotificationPeriod), currentHashCode, theNotificationPeriod, ((this.notificationPeriod!= null)&&(!this.notificationPeriod.isEmpty())));
        }
        {
            List<LocationType> theNotificationLocation;
            theNotificationLocation = (((this.notificationLocation!= null)&&(!this.notificationLocation.isEmpty()))?this.getNotificationLocation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notificationLocation", theNotificationLocation), currentHashCode, theNotificationLocation, ((this.notificationLocation!= null)&&(!this.notificationLocation.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
