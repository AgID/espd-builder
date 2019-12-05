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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SubscriberIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SubscriberTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SubscriberTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalDeliveredQuantityType;
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
 * <p>Classe Java per ConsumptionPointType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionPointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubscriberID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubscriberType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubscriberTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalDeliveredQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Address" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WebSiteAccess" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UtilityMeter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionPointType", propOrder = {
    "id",
    "description",
    "subscriberID",
    "subscriberType",
    "subscriberTypeCode",
    "totalDeliveredQuantity",
    "address",
    "webSiteAccess",
    "utilityMeter"
})
public class ConsumptionPointType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "SubscriberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubscriberIDType subscriberID;
    @XmlElement(name = "SubscriberType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubscriberTypeType subscriberType;
    @XmlElement(name = "SubscriberTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubscriberTypeCodeType subscriberTypeCode;
    @XmlElement(name = "TotalDeliveredQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalDeliveredQuantityType totalDeliveredQuantity;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "WebSiteAccess")
    protected WebSiteAccessType webSiteAccess;
    @XmlElement(name = "UtilityMeter")
    protected List<MeterType> utilityMeter;

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
     * Recupera il valore della proprietà subscriberID.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberIDType }
     *     
     */
    public SubscriberIDType getSubscriberID() {
        return subscriberID;
    }

    /**
     * Imposta il valore della proprietà subscriberID.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberIDType }
     *     
     */
    public void setSubscriberID(SubscriberIDType value) {
        this.subscriberID = value;
    }

    /**
     * Recupera il valore della proprietà subscriberType.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberTypeType }
     *     
     */
    public SubscriberTypeType getSubscriberType() {
        return subscriberType;
    }

    /**
     * Imposta il valore della proprietà subscriberType.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberTypeType }
     *     
     */
    public void setSubscriberType(SubscriberTypeType value) {
        this.subscriberType = value;
    }

    /**
     * Recupera il valore della proprietà subscriberTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberTypeCodeType }
     *     
     */
    public SubscriberTypeCodeType getSubscriberTypeCode() {
        return subscriberTypeCode;
    }

    /**
     * Imposta il valore della proprietà subscriberTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberTypeCodeType }
     *     
     */
    public void setSubscriberTypeCode(SubscriberTypeCodeType value) {
        this.subscriberTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà totalDeliveredQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalDeliveredQuantityType }
     *     
     */
    public TotalDeliveredQuantityType getTotalDeliveredQuantity() {
        return totalDeliveredQuantity;
    }

    /**
     * Imposta il valore della proprietà totalDeliveredQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalDeliveredQuantityType }
     *     
     */
    public void setTotalDeliveredQuantity(TotalDeliveredQuantityType value) {
        this.totalDeliveredQuantity = value;
    }

    /**
     * Recupera il valore della proprietà address.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Imposta il valore della proprietà address.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Recupera il valore della proprietà webSiteAccess.
     * 
     * @return
     *     possible object is
     *     {@link WebSiteAccessType }
     *     
     */
    public WebSiteAccessType getWebSiteAccess() {
        return webSiteAccess;
    }

    /**
     * Imposta il valore della proprietà webSiteAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link WebSiteAccessType }
     *     
     */
    public void setWebSiteAccess(WebSiteAccessType value) {
        this.webSiteAccess = value;
    }

    /**
     * Gets the value of the utilityMeter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utilityMeter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUtilityMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterType }
     * 
     * 
     */
    public List<MeterType> getUtilityMeter() {
        if (utilityMeter == null) {
            utilityMeter = new ArrayList<MeterType>();
        }
        return this.utilityMeter;
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
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            SubscriberIDType theSubscriberID;
            theSubscriberID = this.getSubscriberID();
            strategy.appendField(locator, this, "subscriberID", buffer, theSubscriberID, (this.subscriberID!= null));
        }
        {
            SubscriberTypeType theSubscriberType;
            theSubscriberType = this.getSubscriberType();
            strategy.appendField(locator, this, "subscriberType", buffer, theSubscriberType, (this.subscriberType!= null));
        }
        {
            SubscriberTypeCodeType theSubscriberTypeCode;
            theSubscriberTypeCode = this.getSubscriberTypeCode();
            strategy.appendField(locator, this, "subscriberTypeCode", buffer, theSubscriberTypeCode, (this.subscriberTypeCode!= null));
        }
        {
            TotalDeliveredQuantityType theTotalDeliveredQuantity;
            theTotalDeliveredQuantity = this.getTotalDeliveredQuantity();
            strategy.appendField(locator, this, "totalDeliveredQuantity", buffer, theTotalDeliveredQuantity, (this.totalDeliveredQuantity!= null));
        }
        {
            AddressType theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
        }
        {
            WebSiteAccessType theWebSiteAccess;
            theWebSiteAccess = this.getWebSiteAccess();
            strategy.appendField(locator, this, "webSiteAccess", buffer, theWebSiteAccess, (this.webSiteAccess!= null));
        }
        {
            List<MeterType> theUtilityMeter;
            theUtilityMeter = (((this.utilityMeter!= null)&&(!this.utilityMeter.isEmpty()))?this.getUtilityMeter():null);
            strategy.appendField(locator, this, "utilityMeter", buffer, theUtilityMeter, ((this.utilityMeter!= null)&&(!this.utilityMeter.isEmpty())));
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
        final ConsumptionPointType that = ((ConsumptionPointType) object);
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
            List<DescriptionType> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<DescriptionType> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, ((this.description!= null)&&(!this.description.isEmpty())), ((that.description!= null)&&(!that.description.isEmpty())))) {
                return false;
            }
        }
        {
            SubscriberIDType lhsSubscriberID;
            lhsSubscriberID = this.getSubscriberID();
            SubscriberIDType rhsSubscriberID;
            rhsSubscriberID = that.getSubscriberID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subscriberID", lhsSubscriberID), LocatorUtils.property(thatLocator, "subscriberID", rhsSubscriberID), lhsSubscriberID, rhsSubscriberID, (this.subscriberID!= null), (that.subscriberID!= null))) {
                return false;
            }
        }
        {
            SubscriberTypeType lhsSubscriberType;
            lhsSubscriberType = this.getSubscriberType();
            SubscriberTypeType rhsSubscriberType;
            rhsSubscriberType = that.getSubscriberType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subscriberType", lhsSubscriberType), LocatorUtils.property(thatLocator, "subscriberType", rhsSubscriberType), lhsSubscriberType, rhsSubscriberType, (this.subscriberType!= null), (that.subscriberType!= null))) {
                return false;
            }
        }
        {
            SubscriberTypeCodeType lhsSubscriberTypeCode;
            lhsSubscriberTypeCode = this.getSubscriberTypeCode();
            SubscriberTypeCodeType rhsSubscriberTypeCode;
            rhsSubscriberTypeCode = that.getSubscriberTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subscriberTypeCode", lhsSubscriberTypeCode), LocatorUtils.property(thatLocator, "subscriberTypeCode", rhsSubscriberTypeCode), lhsSubscriberTypeCode, rhsSubscriberTypeCode, (this.subscriberTypeCode!= null), (that.subscriberTypeCode!= null))) {
                return false;
            }
        }
        {
            TotalDeliveredQuantityType lhsTotalDeliveredQuantity;
            lhsTotalDeliveredQuantity = this.getTotalDeliveredQuantity();
            TotalDeliveredQuantityType rhsTotalDeliveredQuantity;
            rhsTotalDeliveredQuantity = that.getTotalDeliveredQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalDeliveredQuantity", lhsTotalDeliveredQuantity), LocatorUtils.property(thatLocator, "totalDeliveredQuantity", rhsTotalDeliveredQuantity), lhsTotalDeliveredQuantity, rhsTotalDeliveredQuantity, (this.totalDeliveredQuantity!= null), (that.totalDeliveredQuantity!= null))) {
                return false;
            }
        }
        {
            AddressType lhsAddress;
            lhsAddress = this.getAddress();
            AddressType rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress, (this.address!= null), (that.address!= null))) {
                return false;
            }
        }
        {
            WebSiteAccessType lhsWebSiteAccess;
            lhsWebSiteAccess = this.getWebSiteAccess();
            WebSiteAccessType rhsWebSiteAccess;
            rhsWebSiteAccess = that.getWebSiteAccess();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "webSiteAccess", lhsWebSiteAccess), LocatorUtils.property(thatLocator, "webSiteAccess", rhsWebSiteAccess), lhsWebSiteAccess, rhsWebSiteAccess, (this.webSiteAccess!= null), (that.webSiteAccess!= null))) {
                return false;
            }
        }
        {
            List<MeterType> lhsUtilityMeter;
            lhsUtilityMeter = (((this.utilityMeter!= null)&&(!this.utilityMeter.isEmpty()))?this.getUtilityMeter():null);
            List<MeterType> rhsUtilityMeter;
            rhsUtilityMeter = (((that.utilityMeter!= null)&&(!that.utilityMeter.isEmpty()))?that.getUtilityMeter():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "utilityMeter", lhsUtilityMeter), LocatorUtils.property(thatLocator, "utilityMeter", rhsUtilityMeter), lhsUtilityMeter, rhsUtilityMeter, ((this.utilityMeter!= null)&&(!this.utilityMeter.isEmpty())), ((that.utilityMeter!= null)&&(!that.utilityMeter.isEmpty())))) {
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
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            SubscriberIDType theSubscriberID;
            theSubscriberID = this.getSubscriberID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subscriberID", theSubscriberID), currentHashCode, theSubscriberID, (this.subscriberID!= null));
        }
        {
            SubscriberTypeType theSubscriberType;
            theSubscriberType = this.getSubscriberType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subscriberType", theSubscriberType), currentHashCode, theSubscriberType, (this.subscriberType!= null));
        }
        {
            SubscriberTypeCodeType theSubscriberTypeCode;
            theSubscriberTypeCode = this.getSubscriberTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subscriberTypeCode", theSubscriberTypeCode), currentHashCode, theSubscriberTypeCode, (this.subscriberTypeCode!= null));
        }
        {
            TotalDeliveredQuantityType theTotalDeliveredQuantity;
            theTotalDeliveredQuantity = this.getTotalDeliveredQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalDeliveredQuantity", theTotalDeliveredQuantity), currentHashCode, theTotalDeliveredQuantity, (this.totalDeliveredQuantity!= null));
        }
        {
            AddressType theAddress;
            theAddress = this.getAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address", theAddress), currentHashCode, theAddress, (this.address!= null));
        }
        {
            WebSiteAccessType theWebSiteAccess;
            theWebSiteAccess = this.getWebSiteAccess();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "webSiteAccess", theWebSiteAccess), currentHashCode, theWebSiteAccess, (this.webSiteAccess!= null));
        }
        {
            List<MeterType> theUtilityMeter;
            theUtilityMeter = (((this.utilityMeter!= null)&&(!this.utilityMeter.isEmpty()))?this.getUtilityMeter():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "utilityMeter", theUtilityMeter), currentHashCode, theUtilityMeter, ((this.utilityMeter!= null)&&(!this.utilityMeter.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
