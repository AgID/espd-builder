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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActualDeliveryDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActualDeliveryTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestDeliveryDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestDeliveryTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReleaseIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TrackingIDType;
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
 * <p>Classe Java per DeliveryType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualDeliveryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualDeliveryTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestDeliveryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestDeliveryTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReleaseID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TrackingID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AlternativeDeliveryLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedDeliveryPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PromisedDeliveryPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedDeliveryPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CarrierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotifyParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Despatch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MinimumDeliveryUnit" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaximumDeliveryUnit" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Shipment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryType", propOrder = {
    "id",
    "quantity",
    "minimumQuantity",
    "maximumQuantity",
    "actualDeliveryDate",
    "actualDeliveryTime",
    "latestDeliveryDate",
    "latestDeliveryTime",
    "releaseID",
    "trackingID",
    "deliveryAddress",
    "deliveryLocation",
    "alternativeDeliveryLocation",
    "requestedDeliveryPeriod",
    "promisedDeliveryPeriod",
    "estimatedDeliveryPeriod",
    "carrierParty",
    "deliveryParty",
    "notifyParty",
    "despatch",
    "deliveryTerms",
    "minimumDeliveryUnit",
    "maximumDeliveryUnit",
    "shipment"
})
public class DeliveryType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QuantityType quantity;
    @XmlElement(name = "MinimumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MinimumQuantityType minimumQuantity;
    @XmlElement(name = "MaximumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumQuantityType maximumQuantity;
    @XmlElement(name = "ActualDeliveryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActualDeliveryDateType actualDeliveryDate;
    @XmlElement(name = "ActualDeliveryTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActualDeliveryTimeType actualDeliveryTime;
    @XmlElement(name = "LatestDeliveryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestDeliveryDateType latestDeliveryDate;
    @XmlElement(name = "LatestDeliveryTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestDeliveryTimeType latestDeliveryTime;
    @XmlElement(name = "ReleaseID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReleaseIDType releaseID;
    @XmlElement(name = "TrackingID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TrackingIDType trackingID;
    @XmlElement(name = "DeliveryAddress")
    protected AddressType deliveryAddress;
    @XmlElement(name = "DeliveryLocation")
    protected LocationType deliveryLocation;
    @XmlElement(name = "AlternativeDeliveryLocation")
    protected LocationType alternativeDeliveryLocation;
    @XmlElement(name = "RequestedDeliveryPeriod")
    protected PeriodType requestedDeliveryPeriod;
    @XmlElement(name = "PromisedDeliveryPeriod")
    protected PeriodType promisedDeliveryPeriod;
    @XmlElement(name = "EstimatedDeliveryPeriod")
    protected PeriodType estimatedDeliveryPeriod;
    @XmlElement(name = "CarrierParty")
    protected PartyType carrierParty;
    @XmlElement(name = "DeliveryParty")
    protected PartyType deliveryParty;
    @XmlElement(name = "NotifyParty")
    protected List<PartyType> notifyParty;
    @XmlElement(name = "Despatch")
    protected DespatchType despatch;
    @XmlElement(name = "DeliveryTerms")
    protected List<DeliveryTermsType> deliveryTerms;
    @XmlElement(name = "MinimumDeliveryUnit")
    protected DeliveryUnitType minimumDeliveryUnit;
    @XmlElement(name = "MaximumDeliveryUnit")
    protected DeliveryUnitType maximumDeliveryUnit;
    @XmlElement(name = "Shipment")
    protected ShipmentType shipment;

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
     * Recupera il valore della proprietà quantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantity() {
        return quantity;
    }

    /**
     * Imposta il valore della proprietà quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantity(QuantityType value) {
        this.quantity = value;
    }

    /**
     * Recupera il valore della proprietà minimumQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MinimumQuantityType }
     *     
     */
    public MinimumQuantityType getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Imposta il valore della proprietà minimumQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumQuantityType }
     *     
     */
    public void setMinimumQuantity(MinimumQuantityType value) {
        this.minimumQuantity = value;
    }

    /**
     * Recupera il valore della proprietà maximumQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MaximumQuantityType }
     *     
     */
    public MaximumQuantityType getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Imposta il valore della proprietà maximumQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumQuantityType }
     *     
     */
    public void setMaximumQuantity(MaximumQuantityType value) {
        this.maximumQuantity = value;
    }

    /**
     * Recupera il valore della proprietà actualDeliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link ActualDeliveryDateType }
     *     
     */
    public ActualDeliveryDateType getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    /**
     * Imposta il valore della proprietà actualDeliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualDeliveryDateType }
     *     
     */
    public void setActualDeliveryDate(ActualDeliveryDateType value) {
        this.actualDeliveryDate = value;
    }

    /**
     * Recupera il valore della proprietà actualDeliveryTime.
     * 
     * @return
     *     possible object is
     *     {@link ActualDeliveryTimeType }
     *     
     */
    public ActualDeliveryTimeType getActualDeliveryTime() {
        return actualDeliveryTime;
    }

    /**
     * Imposta il valore della proprietà actualDeliveryTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualDeliveryTimeType }
     *     
     */
    public void setActualDeliveryTime(ActualDeliveryTimeType value) {
        this.actualDeliveryTime = value;
    }

    /**
     * Recupera il valore della proprietà latestDeliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link LatestDeliveryDateType }
     *     
     */
    public LatestDeliveryDateType getLatestDeliveryDate() {
        return latestDeliveryDate;
    }

    /**
     * Imposta il valore della proprietà latestDeliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestDeliveryDateType }
     *     
     */
    public void setLatestDeliveryDate(LatestDeliveryDateType value) {
        this.latestDeliveryDate = value;
    }

    /**
     * Recupera il valore della proprietà latestDeliveryTime.
     * 
     * @return
     *     possible object is
     *     {@link LatestDeliveryTimeType }
     *     
     */
    public LatestDeliveryTimeType getLatestDeliveryTime() {
        return latestDeliveryTime;
    }

    /**
     * Imposta il valore della proprietà latestDeliveryTime.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestDeliveryTimeType }
     *     
     */
    public void setLatestDeliveryTime(LatestDeliveryTimeType value) {
        this.latestDeliveryTime = value;
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
     * Recupera il valore della proprietà trackingID.
     * 
     * @return
     *     possible object is
     *     {@link TrackingIDType }
     *     
     */
    public TrackingIDType getTrackingID() {
        return trackingID;
    }

    /**
     * Imposta il valore della proprietà trackingID.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingIDType }
     *     
     */
    public void setTrackingID(TrackingIDType value) {
        this.trackingID = value;
    }

    /**
     * Recupera il valore della proprietà deliveryAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Imposta il valore della proprietà deliveryAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setDeliveryAddress(AddressType value) {
        this.deliveryAddress = value;
    }

    /**
     * Recupera il valore della proprietà deliveryLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDeliveryLocation() {
        return deliveryLocation;
    }

    /**
     * Imposta il valore della proprietà deliveryLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDeliveryLocation(LocationType value) {
        this.deliveryLocation = value;
    }

    /**
     * Recupera il valore della proprietà alternativeDeliveryLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getAlternativeDeliveryLocation() {
        return alternativeDeliveryLocation;
    }

    /**
     * Imposta il valore della proprietà alternativeDeliveryLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setAlternativeDeliveryLocation(LocationType value) {
        this.alternativeDeliveryLocation = value;
    }

    /**
     * Recupera il valore della proprietà requestedDeliveryPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getRequestedDeliveryPeriod() {
        return requestedDeliveryPeriod;
    }

    /**
     * Imposta il valore della proprietà requestedDeliveryPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setRequestedDeliveryPeriod(PeriodType value) {
        this.requestedDeliveryPeriod = value;
    }

    /**
     * Recupera il valore della proprietà promisedDeliveryPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPromisedDeliveryPeriod() {
        return promisedDeliveryPeriod;
    }

    /**
     * Imposta il valore della proprietà promisedDeliveryPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPromisedDeliveryPeriod(PeriodType value) {
        this.promisedDeliveryPeriod = value;
    }

    /**
     * Recupera il valore della proprietà estimatedDeliveryPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEstimatedDeliveryPeriod() {
        return estimatedDeliveryPeriod;
    }

    /**
     * Imposta il valore della proprietà estimatedDeliveryPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEstimatedDeliveryPeriod(PeriodType value) {
        this.estimatedDeliveryPeriod = value;
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
     * Recupera il valore della proprietà deliveryParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getDeliveryParty() {
        return deliveryParty;
    }

    /**
     * Imposta il valore della proprietà deliveryParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setDeliveryParty(PartyType value) {
        this.deliveryParty = value;
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
     * Recupera il valore della proprietà despatch.
     * 
     * @return
     *     possible object is
     *     {@link DespatchType }
     *     
     */
    public DespatchType getDespatch() {
        return despatch;
    }

    /**
     * Imposta il valore della proprietà despatch.
     * 
     * @param value
     *     allowed object is
     *     {@link DespatchType }
     *     
     */
    public void setDespatch(DespatchType value) {
        this.despatch = value;
    }

    /**
     * Gets the value of the deliveryTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryTermsType }
     * 
     * 
     */
    public List<DeliveryTermsType> getDeliveryTerms() {
        if (deliveryTerms == null) {
            deliveryTerms = new ArrayList<DeliveryTermsType>();
        }
        return this.deliveryTerms;
    }

    /**
     * Recupera il valore della proprietà minimumDeliveryUnit.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryUnitType }
     *     
     */
    public DeliveryUnitType getMinimumDeliveryUnit() {
        return minimumDeliveryUnit;
    }

    /**
     * Imposta il valore della proprietà minimumDeliveryUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryUnitType }
     *     
     */
    public void setMinimumDeliveryUnit(DeliveryUnitType value) {
        this.minimumDeliveryUnit = value;
    }

    /**
     * Recupera il valore della proprietà maximumDeliveryUnit.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryUnitType }
     *     
     */
    public DeliveryUnitType getMaximumDeliveryUnit() {
        return maximumDeliveryUnit;
    }

    /**
     * Imposta il valore della proprietà maximumDeliveryUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryUnitType }
     *     
     */
    public void setMaximumDeliveryUnit(DeliveryUnitType value) {
        this.maximumDeliveryUnit = value;
    }

    /**
     * Recupera il valore della proprietà shipment.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentType }
     *     
     */
    public ShipmentType getShipment() {
        return shipment;
    }

    /**
     * Imposta il valore della proprietà shipment.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentType }
     *     
     */
    public void setShipment(ShipmentType value) {
        this.shipment = value;
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
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity, (this.quantity!= null));
        }
        {
            MinimumQuantityType theMinimumQuantity;
            theMinimumQuantity = this.getMinimumQuantity();
            strategy.appendField(locator, this, "minimumQuantity", buffer, theMinimumQuantity, (this.minimumQuantity!= null));
        }
        {
            MaximumQuantityType theMaximumQuantity;
            theMaximumQuantity = this.getMaximumQuantity();
            strategy.appendField(locator, this, "maximumQuantity", buffer, theMaximumQuantity, (this.maximumQuantity!= null));
        }
        {
            ActualDeliveryDateType theActualDeliveryDate;
            theActualDeliveryDate = this.getActualDeliveryDate();
            strategy.appendField(locator, this, "actualDeliveryDate", buffer, theActualDeliveryDate, (this.actualDeliveryDate!= null));
        }
        {
            ActualDeliveryTimeType theActualDeliveryTime;
            theActualDeliveryTime = this.getActualDeliveryTime();
            strategy.appendField(locator, this, "actualDeliveryTime", buffer, theActualDeliveryTime, (this.actualDeliveryTime!= null));
        }
        {
            LatestDeliveryDateType theLatestDeliveryDate;
            theLatestDeliveryDate = this.getLatestDeliveryDate();
            strategy.appendField(locator, this, "latestDeliveryDate", buffer, theLatestDeliveryDate, (this.latestDeliveryDate!= null));
        }
        {
            LatestDeliveryTimeType theLatestDeliveryTime;
            theLatestDeliveryTime = this.getLatestDeliveryTime();
            strategy.appendField(locator, this, "latestDeliveryTime", buffer, theLatestDeliveryTime, (this.latestDeliveryTime!= null));
        }
        {
            ReleaseIDType theReleaseID;
            theReleaseID = this.getReleaseID();
            strategy.appendField(locator, this, "releaseID", buffer, theReleaseID, (this.releaseID!= null));
        }
        {
            TrackingIDType theTrackingID;
            theTrackingID = this.getTrackingID();
            strategy.appendField(locator, this, "trackingID", buffer, theTrackingID, (this.trackingID!= null));
        }
        {
            AddressType theDeliveryAddress;
            theDeliveryAddress = this.getDeliveryAddress();
            strategy.appendField(locator, this, "deliveryAddress", buffer, theDeliveryAddress, (this.deliveryAddress!= null));
        }
        {
            LocationType theDeliveryLocation;
            theDeliveryLocation = this.getDeliveryLocation();
            strategy.appendField(locator, this, "deliveryLocation", buffer, theDeliveryLocation, (this.deliveryLocation!= null));
        }
        {
            LocationType theAlternativeDeliveryLocation;
            theAlternativeDeliveryLocation = this.getAlternativeDeliveryLocation();
            strategy.appendField(locator, this, "alternativeDeliveryLocation", buffer, theAlternativeDeliveryLocation, (this.alternativeDeliveryLocation!= null));
        }
        {
            PeriodType theRequestedDeliveryPeriod;
            theRequestedDeliveryPeriod = this.getRequestedDeliveryPeriod();
            strategy.appendField(locator, this, "requestedDeliveryPeriod", buffer, theRequestedDeliveryPeriod, (this.requestedDeliveryPeriod!= null));
        }
        {
            PeriodType thePromisedDeliveryPeriod;
            thePromisedDeliveryPeriod = this.getPromisedDeliveryPeriod();
            strategy.appendField(locator, this, "promisedDeliveryPeriod", buffer, thePromisedDeliveryPeriod, (this.promisedDeliveryPeriod!= null));
        }
        {
            PeriodType theEstimatedDeliveryPeriod;
            theEstimatedDeliveryPeriod = this.getEstimatedDeliveryPeriod();
            strategy.appendField(locator, this, "estimatedDeliveryPeriod", buffer, theEstimatedDeliveryPeriod, (this.estimatedDeliveryPeriod!= null));
        }
        {
            PartyType theCarrierParty;
            theCarrierParty = this.getCarrierParty();
            strategy.appendField(locator, this, "carrierParty", buffer, theCarrierParty, (this.carrierParty!= null));
        }
        {
            PartyType theDeliveryParty;
            theDeliveryParty = this.getDeliveryParty();
            strategy.appendField(locator, this, "deliveryParty", buffer, theDeliveryParty, (this.deliveryParty!= null));
        }
        {
            List<PartyType> theNotifyParty;
            theNotifyParty = (((this.notifyParty!= null)&&(!this.notifyParty.isEmpty()))?this.getNotifyParty():null);
            strategy.appendField(locator, this, "notifyParty", buffer, theNotifyParty, ((this.notifyParty!= null)&&(!this.notifyParty.isEmpty())));
        }
        {
            DespatchType theDespatch;
            theDespatch = this.getDespatch();
            strategy.appendField(locator, this, "despatch", buffer, theDespatch, (this.despatch!= null));
        }
        {
            List<DeliveryTermsType> theDeliveryTerms;
            theDeliveryTerms = (((this.deliveryTerms!= null)&&(!this.deliveryTerms.isEmpty()))?this.getDeliveryTerms():null);
            strategy.appendField(locator, this, "deliveryTerms", buffer, theDeliveryTerms, ((this.deliveryTerms!= null)&&(!this.deliveryTerms.isEmpty())));
        }
        {
            DeliveryUnitType theMinimumDeliveryUnit;
            theMinimumDeliveryUnit = this.getMinimumDeliveryUnit();
            strategy.appendField(locator, this, "minimumDeliveryUnit", buffer, theMinimumDeliveryUnit, (this.minimumDeliveryUnit!= null));
        }
        {
            DeliveryUnitType theMaximumDeliveryUnit;
            theMaximumDeliveryUnit = this.getMaximumDeliveryUnit();
            strategy.appendField(locator, this, "maximumDeliveryUnit", buffer, theMaximumDeliveryUnit, (this.maximumDeliveryUnit!= null));
        }
        {
            ShipmentType theShipment;
            theShipment = this.getShipment();
            strategy.appendField(locator, this, "shipment", buffer, theShipment, (this.shipment!= null));
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
        final DeliveryType that = ((DeliveryType) object);
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
            QuantityType lhsQuantity;
            lhsQuantity = this.getQuantity();
            QuantityType rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity, (this.quantity!= null), (that.quantity!= null))) {
                return false;
            }
        }
        {
            MinimumQuantityType lhsMinimumQuantity;
            lhsMinimumQuantity = this.getMinimumQuantity();
            MinimumQuantityType rhsMinimumQuantity;
            rhsMinimumQuantity = that.getMinimumQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumQuantity", lhsMinimumQuantity), LocatorUtils.property(thatLocator, "minimumQuantity", rhsMinimumQuantity), lhsMinimumQuantity, rhsMinimumQuantity, (this.minimumQuantity!= null), (that.minimumQuantity!= null))) {
                return false;
            }
        }
        {
            MaximumQuantityType lhsMaximumQuantity;
            lhsMaximumQuantity = this.getMaximumQuantity();
            MaximumQuantityType rhsMaximumQuantity;
            rhsMaximumQuantity = that.getMaximumQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumQuantity", lhsMaximumQuantity), LocatorUtils.property(thatLocator, "maximumQuantity", rhsMaximumQuantity), lhsMaximumQuantity, rhsMaximumQuantity, (this.maximumQuantity!= null), (that.maximumQuantity!= null))) {
                return false;
            }
        }
        {
            ActualDeliveryDateType lhsActualDeliveryDate;
            lhsActualDeliveryDate = this.getActualDeliveryDate();
            ActualDeliveryDateType rhsActualDeliveryDate;
            rhsActualDeliveryDate = that.getActualDeliveryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualDeliveryDate", lhsActualDeliveryDate), LocatorUtils.property(thatLocator, "actualDeliveryDate", rhsActualDeliveryDate), lhsActualDeliveryDate, rhsActualDeliveryDate, (this.actualDeliveryDate!= null), (that.actualDeliveryDate!= null))) {
                return false;
            }
        }
        {
            ActualDeliveryTimeType lhsActualDeliveryTime;
            lhsActualDeliveryTime = this.getActualDeliveryTime();
            ActualDeliveryTimeType rhsActualDeliveryTime;
            rhsActualDeliveryTime = that.getActualDeliveryTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualDeliveryTime", lhsActualDeliveryTime), LocatorUtils.property(thatLocator, "actualDeliveryTime", rhsActualDeliveryTime), lhsActualDeliveryTime, rhsActualDeliveryTime, (this.actualDeliveryTime!= null), (that.actualDeliveryTime!= null))) {
                return false;
            }
        }
        {
            LatestDeliveryDateType lhsLatestDeliveryDate;
            lhsLatestDeliveryDate = this.getLatestDeliveryDate();
            LatestDeliveryDateType rhsLatestDeliveryDate;
            rhsLatestDeliveryDate = that.getLatestDeliveryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestDeliveryDate", lhsLatestDeliveryDate), LocatorUtils.property(thatLocator, "latestDeliveryDate", rhsLatestDeliveryDate), lhsLatestDeliveryDate, rhsLatestDeliveryDate, (this.latestDeliveryDate!= null), (that.latestDeliveryDate!= null))) {
                return false;
            }
        }
        {
            LatestDeliveryTimeType lhsLatestDeliveryTime;
            lhsLatestDeliveryTime = this.getLatestDeliveryTime();
            LatestDeliveryTimeType rhsLatestDeliveryTime;
            rhsLatestDeliveryTime = that.getLatestDeliveryTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestDeliveryTime", lhsLatestDeliveryTime), LocatorUtils.property(thatLocator, "latestDeliveryTime", rhsLatestDeliveryTime), lhsLatestDeliveryTime, rhsLatestDeliveryTime, (this.latestDeliveryTime!= null), (that.latestDeliveryTime!= null))) {
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
            TrackingIDType lhsTrackingID;
            lhsTrackingID = this.getTrackingID();
            TrackingIDType rhsTrackingID;
            rhsTrackingID = that.getTrackingID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackingID", lhsTrackingID), LocatorUtils.property(thatLocator, "trackingID", rhsTrackingID), lhsTrackingID, rhsTrackingID, (this.trackingID!= null), (that.trackingID!= null))) {
                return false;
            }
        }
        {
            AddressType lhsDeliveryAddress;
            lhsDeliveryAddress = this.getDeliveryAddress();
            AddressType rhsDeliveryAddress;
            rhsDeliveryAddress = that.getDeliveryAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryAddress", lhsDeliveryAddress), LocatorUtils.property(thatLocator, "deliveryAddress", rhsDeliveryAddress), lhsDeliveryAddress, rhsDeliveryAddress, (this.deliveryAddress!= null), (that.deliveryAddress!= null))) {
                return false;
            }
        }
        {
            LocationType lhsDeliveryLocation;
            lhsDeliveryLocation = this.getDeliveryLocation();
            LocationType rhsDeliveryLocation;
            rhsDeliveryLocation = that.getDeliveryLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryLocation", lhsDeliveryLocation), LocatorUtils.property(thatLocator, "deliveryLocation", rhsDeliveryLocation), lhsDeliveryLocation, rhsDeliveryLocation, (this.deliveryLocation!= null), (that.deliveryLocation!= null))) {
                return false;
            }
        }
        {
            LocationType lhsAlternativeDeliveryLocation;
            lhsAlternativeDeliveryLocation = this.getAlternativeDeliveryLocation();
            LocationType rhsAlternativeDeliveryLocation;
            rhsAlternativeDeliveryLocation = that.getAlternativeDeliveryLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternativeDeliveryLocation", lhsAlternativeDeliveryLocation), LocatorUtils.property(thatLocator, "alternativeDeliveryLocation", rhsAlternativeDeliveryLocation), lhsAlternativeDeliveryLocation, rhsAlternativeDeliveryLocation, (this.alternativeDeliveryLocation!= null), (that.alternativeDeliveryLocation!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsRequestedDeliveryPeriod;
            lhsRequestedDeliveryPeriod = this.getRequestedDeliveryPeriod();
            PeriodType rhsRequestedDeliveryPeriod;
            rhsRequestedDeliveryPeriod = that.getRequestedDeliveryPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedDeliveryPeriod", lhsRequestedDeliveryPeriod), LocatorUtils.property(thatLocator, "requestedDeliveryPeriod", rhsRequestedDeliveryPeriod), lhsRequestedDeliveryPeriod, rhsRequestedDeliveryPeriod, (this.requestedDeliveryPeriod!= null), (that.requestedDeliveryPeriod!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsPromisedDeliveryPeriod;
            lhsPromisedDeliveryPeriod = this.getPromisedDeliveryPeriod();
            PeriodType rhsPromisedDeliveryPeriod;
            rhsPromisedDeliveryPeriod = that.getPromisedDeliveryPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "promisedDeliveryPeriod", lhsPromisedDeliveryPeriod), LocatorUtils.property(thatLocator, "promisedDeliveryPeriod", rhsPromisedDeliveryPeriod), lhsPromisedDeliveryPeriod, rhsPromisedDeliveryPeriod, (this.promisedDeliveryPeriod!= null), (that.promisedDeliveryPeriod!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsEstimatedDeliveryPeriod;
            lhsEstimatedDeliveryPeriod = this.getEstimatedDeliveryPeriod();
            PeriodType rhsEstimatedDeliveryPeriod;
            rhsEstimatedDeliveryPeriod = that.getEstimatedDeliveryPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedDeliveryPeriod", lhsEstimatedDeliveryPeriod), LocatorUtils.property(thatLocator, "estimatedDeliveryPeriod", rhsEstimatedDeliveryPeriod), lhsEstimatedDeliveryPeriod, rhsEstimatedDeliveryPeriod, (this.estimatedDeliveryPeriod!= null), (that.estimatedDeliveryPeriod!= null))) {
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
            PartyType lhsDeliveryParty;
            lhsDeliveryParty = this.getDeliveryParty();
            PartyType rhsDeliveryParty;
            rhsDeliveryParty = that.getDeliveryParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryParty", lhsDeliveryParty), LocatorUtils.property(thatLocator, "deliveryParty", rhsDeliveryParty), lhsDeliveryParty, rhsDeliveryParty, (this.deliveryParty!= null), (that.deliveryParty!= null))) {
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
            DespatchType lhsDespatch;
            lhsDespatch = this.getDespatch();
            DespatchType rhsDespatch;
            rhsDespatch = that.getDespatch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "despatch", lhsDespatch), LocatorUtils.property(thatLocator, "despatch", rhsDespatch), lhsDespatch, rhsDespatch, (this.despatch!= null), (that.despatch!= null))) {
                return false;
            }
        }
        {
            List<DeliveryTermsType> lhsDeliveryTerms;
            lhsDeliveryTerms = (((this.deliveryTerms!= null)&&(!this.deliveryTerms.isEmpty()))?this.getDeliveryTerms():null);
            List<DeliveryTermsType> rhsDeliveryTerms;
            rhsDeliveryTerms = (((that.deliveryTerms!= null)&&(!that.deliveryTerms.isEmpty()))?that.getDeliveryTerms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryTerms", lhsDeliveryTerms), LocatorUtils.property(thatLocator, "deliveryTerms", rhsDeliveryTerms), lhsDeliveryTerms, rhsDeliveryTerms, ((this.deliveryTerms!= null)&&(!this.deliveryTerms.isEmpty())), ((that.deliveryTerms!= null)&&(!that.deliveryTerms.isEmpty())))) {
                return false;
            }
        }
        {
            DeliveryUnitType lhsMinimumDeliveryUnit;
            lhsMinimumDeliveryUnit = this.getMinimumDeliveryUnit();
            DeliveryUnitType rhsMinimumDeliveryUnit;
            rhsMinimumDeliveryUnit = that.getMinimumDeliveryUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumDeliveryUnit", lhsMinimumDeliveryUnit), LocatorUtils.property(thatLocator, "minimumDeliveryUnit", rhsMinimumDeliveryUnit), lhsMinimumDeliveryUnit, rhsMinimumDeliveryUnit, (this.minimumDeliveryUnit!= null), (that.minimumDeliveryUnit!= null))) {
                return false;
            }
        }
        {
            DeliveryUnitType lhsMaximumDeliveryUnit;
            lhsMaximumDeliveryUnit = this.getMaximumDeliveryUnit();
            DeliveryUnitType rhsMaximumDeliveryUnit;
            rhsMaximumDeliveryUnit = that.getMaximumDeliveryUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumDeliveryUnit", lhsMaximumDeliveryUnit), LocatorUtils.property(thatLocator, "maximumDeliveryUnit", rhsMaximumDeliveryUnit), lhsMaximumDeliveryUnit, rhsMaximumDeliveryUnit, (this.maximumDeliveryUnit!= null), (that.maximumDeliveryUnit!= null))) {
                return false;
            }
        }
        {
            ShipmentType lhsShipment;
            lhsShipment = this.getShipment();
            ShipmentType rhsShipment;
            rhsShipment = that.getShipment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipment", lhsShipment), LocatorUtils.property(thatLocator, "shipment", rhsShipment), lhsShipment, rhsShipment, (this.shipment!= null), (that.shipment!= null))) {
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
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, (this.quantity!= null));
        }
        {
            MinimumQuantityType theMinimumQuantity;
            theMinimumQuantity = this.getMinimumQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumQuantity", theMinimumQuantity), currentHashCode, theMinimumQuantity, (this.minimumQuantity!= null));
        }
        {
            MaximumQuantityType theMaximumQuantity;
            theMaximumQuantity = this.getMaximumQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumQuantity", theMaximumQuantity), currentHashCode, theMaximumQuantity, (this.maximumQuantity!= null));
        }
        {
            ActualDeliveryDateType theActualDeliveryDate;
            theActualDeliveryDate = this.getActualDeliveryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualDeliveryDate", theActualDeliveryDate), currentHashCode, theActualDeliveryDate, (this.actualDeliveryDate!= null));
        }
        {
            ActualDeliveryTimeType theActualDeliveryTime;
            theActualDeliveryTime = this.getActualDeliveryTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualDeliveryTime", theActualDeliveryTime), currentHashCode, theActualDeliveryTime, (this.actualDeliveryTime!= null));
        }
        {
            LatestDeliveryDateType theLatestDeliveryDate;
            theLatestDeliveryDate = this.getLatestDeliveryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestDeliveryDate", theLatestDeliveryDate), currentHashCode, theLatestDeliveryDate, (this.latestDeliveryDate!= null));
        }
        {
            LatestDeliveryTimeType theLatestDeliveryTime;
            theLatestDeliveryTime = this.getLatestDeliveryTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestDeliveryTime", theLatestDeliveryTime), currentHashCode, theLatestDeliveryTime, (this.latestDeliveryTime!= null));
        }
        {
            ReleaseIDType theReleaseID;
            theReleaseID = this.getReleaseID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "releaseID", theReleaseID), currentHashCode, theReleaseID, (this.releaseID!= null));
        }
        {
            TrackingIDType theTrackingID;
            theTrackingID = this.getTrackingID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackingID", theTrackingID), currentHashCode, theTrackingID, (this.trackingID!= null));
        }
        {
            AddressType theDeliveryAddress;
            theDeliveryAddress = this.getDeliveryAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryAddress", theDeliveryAddress), currentHashCode, theDeliveryAddress, (this.deliveryAddress!= null));
        }
        {
            LocationType theDeliveryLocation;
            theDeliveryLocation = this.getDeliveryLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryLocation", theDeliveryLocation), currentHashCode, theDeliveryLocation, (this.deliveryLocation!= null));
        }
        {
            LocationType theAlternativeDeliveryLocation;
            theAlternativeDeliveryLocation = this.getAlternativeDeliveryLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternativeDeliveryLocation", theAlternativeDeliveryLocation), currentHashCode, theAlternativeDeliveryLocation, (this.alternativeDeliveryLocation!= null));
        }
        {
            PeriodType theRequestedDeliveryPeriod;
            theRequestedDeliveryPeriod = this.getRequestedDeliveryPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedDeliveryPeriod", theRequestedDeliveryPeriod), currentHashCode, theRequestedDeliveryPeriod, (this.requestedDeliveryPeriod!= null));
        }
        {
            PeriodType thePromisedDeliveryPeriod;
            thePromisedDeliveryPeriod = this.getPromisedDeliveryPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "promisedDeliveryPeriod", thePromisedDeliveryPeriod), currentHashCode, thePromisedDeliveryPeriod, (this.promisedDeliveryPeriod!= null));
        }
        {
            PeriodType theEstimatedDeliveryPeriod;
            theEstimatedDeliveryPeriod = this.getEstimatedDeliveryPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedDeliveryPeriod", theEstimatedDeliveryPeriod), currentHashCode, theEstimatedDeliveryPeriod, (this.estimatedDeliveryPeriod!= null));
        }
        {
            PartyType theCarrierParty;
            theCarrierParty = this.getCarrierParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "carrierParty", theCarrierParty), currentHashCode, theCarrierParty, (this.carrierParty!= null));
        }
        {
            PartyType theDeliveryParty;
            theDeliveryParty = this.getDeliveryParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryParty", theDeliveryParty), currentHashCode, theDeliveryParty, (this.deliveryParty!= null));
        }
        {
            List<PartyType> theNotifyParty;
            theNotifyParty = (((this.notifyParty!= null)&&(!this.notifyParty.isEmpty()))?this.getNotifyParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notifyParty", theNotifyParty), currentHashCode, theNotifyParty, ((this.notifyParty!= null)&&(!this.notifyParty.isEmpty())));
        }
        {
            DespatchType theDespatch;
            theDespatch = this.getDespatch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "despatch", theDespatch), currentHashCode, theDespatch, (this.despatch!= null));
        }
        {
            List<DeliveryTermsType> theDeliveryTerms;
            theDeliveryTerms = (((this.deliveryTerms!= null)&&(!this.deliveryTerms.isEmpty()))?this.getDeliveryTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryTerms", theDeliveryTerms), currentHashCode, theDeliveryTerms, ((this.deliveryTerms!= null)&&(!this.deliveryTerms.isEmpty())));
        }
        {
            DeliveryUnitType theMinimumDeliveryUnit;
            theMinimumDeliveryUnit = this.getMinimumDeliveryUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumDeliveryUnit", theMinimumDeliveryUnit), currentHashCode, theMinimumDeliveryUnit, (this.minimumDeliveryUnit!= null));
        }
        {
            DeliveryUnitType theMaximumDeliveryUnit;
            theMaximumDeliveryUnit = this.getMaximumDeliveryUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumDeliveryUnit", theMaximumDeliveryUnit), currentHashCode, theMaximumDeliveryUnit, (this.maximumDeliveryUnit!= null));
        }
        {
            ShipmentType theShipment;
            theShipment = this.getShipment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipment", theShipment), currentHashCode, theShipment, (this.shipment!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
