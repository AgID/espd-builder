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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EffectiveDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EffectiveTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReferenceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseCodeType;
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
 * <p>Classe Java per ResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EffectiveDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EffectiveTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Status" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "referenceID",
    "responseCode",
    "description",
    "effectiveDate",
    "effectiveTime",
    "status"
})
public class ResponseType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ReferenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReferenceIDType referenceID;
    @XmlElement(name = "ResponseCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResponseCodeType responseCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "EffectiveDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EffectiveDateType effectiveDate;
    @XmlElement(name = "EffectiveTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EffectiveTimeType effectiveTime;
    @XmlElement(name = "Status")
    protected List<StatusType> status;

    /**
     * Recupera il valore della proprietà referenceID.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceIDType }
     *     
     */
    public ReferenceIDType getReferenceID() {
        return referenceID;
    }

    /**
     * Imposta il valore della proprietà referenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceIDType }
     *     
     */
    public void setReferenceID(ReferenceIDType value) {
        this.referenceID = value;
    }

    /**
     * Recupera il valore della proprietà responseCode.
     * 
     * @return
     *     possible object is
     *     {@link ResponseCodeType }
     *     
     */
    public ResponseCodeType getResponseCode() {
        return responseCode;
    }

    /**
     * Imposta il valore della proprietà responseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseCodeType }
     *     
     */
    public void setResponseCode(ResponseCodeType value) {
        this.responseCode = value;
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
     * Recupera il valore della proprietà effectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveDateType }
     *     
     */
    public EffectiveDateType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Imposta il valore della proprietà effectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveDateType }
     *     
     */
    public void setEffectiveDate(EffectiveDateType value) {
        this.effectiveDate = value;
    }

    /**
     * Recupera il valore della proprietà effectiveTime.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveTimeType }
     *     
     */
    public EffectiveTimeType getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * Imposta il valore della proprietà effectiveTime.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveTimeType }
     *     
     */
    public void setEffectiveTime(EffectiveTimeType value) {
        this.effectiveTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType }
     * 
     * 
     */
    public List<StatusType> getStatus() {
        if (status == null) {
            status = new ArrayList<StatusType>();
        }
        return this.status;
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
            ReferenceIDType theReferenceID;
            theReferenceID = this.getReferenceID();
            strategy.appendField(locator, this, "referenceID", buffer, theReferenceID, (this.referenceID!= null));
        }
        {
            ResponseCodeType theResponseCode;
            theResponseCode = this.getResponseCode();
            strategy.appendField(locator, this, "responseCode", buffer, theResponseCode, (this.responseCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            EffectiveDateType theEffectiveDate;
            theEffectiveDate = this.getEffectiveDate();
            strategy.appendField(locator, this, "effectiveDate", buffer, theEffectiveDate, (this.effectiveDate!= null));
        }
        {
            EffectiveTimeType theEffectiveTime;
            theEffectiveTime = this.getEffectiveTime();
            strategy.appendField(locator, this, "effectiveTime", buffer, theEffectiveTime, (this.effectiveTime!= null));
        }
        {
            List<StatusType> theStatus;
            theStatus = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            strategy.appendField(locator, this, "status", buffer, theStatus, ((this.status!= null)&&(!this.status.isEmpty())));
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
        final ResponseType that = ((ResponseType) object);
        {
            ReferenceIDType lhsReferenceID;
            lhsReferenceID = this.getReferenceID();
            ReferenceIDType rhsReferenceID;
            rhsReferenceID = that.getReferenceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referenceID", lhsReferenceID), LocatorUtils.property(thatLocator, "referenceID", rhsReferenceID), lhsReferenceID, rhsReferenceID, (this.referenceID!= null), (that.referenceID!= null))) {
                return false;
            }
        }
        {
            ResponseCodeType lhsResponseCode;
            lhsResponseCode = this.getResponseCode();
            ResponseCodeType rhsResponseCode;
            rhsResponseCode = that.getResponseCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseCode", lhsResponseCode), LocatorUtils.property(thatLocator, "responseCode", rhsResponseCode), lhsResponseCode, rhsResponseCode, (this.responseCode!= null), (that.responseCode!= null))) {
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
            EffectiveDateType lhsEffectiveDate;
            lhsEffectiveDate = this.getEffectiveDate();
            EffectiveDateType rhsEffectiveDate;
            rhsEffectiveDate = that.getEffectiveDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectiveDate", lhsEffectiveDate), LocatorUtils.property(thatLocator, "effectiveDate", rhsEffectiveDate), lhsEffectiveDate, rhsEffectiveDate, (this.effectiveDate!= null), (that.effectiveDate!= null))) {
                return false;
            }
        }
        {
            EffectiveTimeType lhsEffectiveTime;
            lhsEffectiveTime = this.getEffectiveTime();
            EffectiveTimeType rhsEffectiveTime;
            rhsEffectiveTime = that.getEffectiveTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectiveTime", lhsEffectiveTime), LocatorUtils.property(thatLocator, "effectiveTime", rhsEffectiveTime), lhsEffectiveTime, rhsEffectiveTime, (this.effectiveTime!= null), (that.effectiveTime!= null))) {
                return false;
            }
        }
        {
            List<StatusType> lhsStatus;
            lhsStatus = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            List<StatusType> rhsStatus;
            rhsStatus = (((that.status!= null)&&(!that.status.isEmpty()))?that.getStatus():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, ((this.status!= null)&&(!this.status.isEmpty())), ((that.status!= null)&&(!that.status.isEmpty())))) {
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
            ReferenceIDType theReferenceID;
            theReferenceID = this.getReferenceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referenceID", theReferenceID), currentHashCode, theReferenceID, (this.referenceID!= null));
        }
        {
            ResponseCodeType theResponseCode;
            theResponseCode = this.getResponseCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseCode", theResponseCode), currentHashCode, theResponseCode, (this.responseCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            EffectiveDateType theEffectiveDate;
            theEffectiveDate = this.getEffectiveDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectiveDate", theEffectiveDate), currentHashCode, theEffectiveDate, (this.effectiveDate!= null));
        }
        {
            EffectiveTimeType theEffectiveTime;
            theEffectiveTime = this.getEffectiveTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectiveTime", theEffectiveTime), currentHashCode, theEffectiveTime, (this.effectiveTime!= null));
        }
        {
            List<StatusType> theStatus;
            theStatus = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, ((this.status!= null)&&(!this.status.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
