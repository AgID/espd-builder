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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FreightRateClassCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NominationDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NominationTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PriorityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SequenceNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TariffClassCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportServiceCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportationServiceDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportationServiceDetailsURIType;
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
 * <p>Classe Java per TransportationServiceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransportationServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportServiceCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TariffClassCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Priority" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FreightRateClassCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportationServiceDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportationServiceDetailsURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NominationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NominationTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupportedTransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UnsupportedTransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupportedCommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UnsupportedCommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TotalCapacityDimension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ResponsibleTransportServiceProviderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnvironmentalEmission" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedDurationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ScheduledServiceFrequency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationServiceType", propOrder = {
    "transportServiceCode",
    "tariffClassCode",
    "priority",
    "freightRateClassCode",
    "transportationServiceDescription",
    "transportationServiceDetailsURI",
    "nominationDate",
    "nominationTime",
    "name",
    "sequenceNumeric",
    "transportEquipment",
    "supportedTransportEquipment",
    "unsupportedTransportEquipment",
    "commodityClassification",
    "supportedCommodityClassification",
    "unsupportedCommodityClassification",
    "totalCapacityDimension",
    "shipmentStage",
    "transportEvent",
    "responsibleTransportServiceProviderParty",
    "environmentalEmission",
    "estimatedDurationPeriod",
    "scheduledServiceFrequency"
})
public class TransportationServiceType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "TransportServiceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TransportServiceCodeType transportServiceCode;
    @XmlElement(name = "TariffClassCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TariffClassCodeType tariffClassCode;
    @XmlElement(name = "Priority", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PriorityType priority;
    @XmlElement(name = "FreightRateClassCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FreightRateClassCodeType freightRateClassCode;
    @XmlElement(name = "TransportationServiceDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TransportationServiceDescriptionType> transportationServiceDescription;
    @XmlElement(name = "TransportationServiceDetailsURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportationServiceDetailsURIType transportationServiceDetailsURI;
    @XmlElement(name = "NominationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NominationDateType nominationDate;
    @XmlElement(name = "NominationTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NominationTimeType nominationTime;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "SequenceNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SequenceNumericType sequenceNumeric;
    @XmlElement(name = "TransportEquipment")
    protected List<TransportEquipmentType> transportEquipment;
    @XmlElement(name = "SupportedTransportEquipment")
    protected List<TransportEquipmentType> supportedTransportEquipment;
    @XmlElement(name = "UnsupportedTransportEquipment")
    protected List<TransportEquipmentType> unsupportedTransportEquipment;
    @XmlElement(name = "CommodityClassification")
    protected List<CommodityClassificationType> commodityClassification;
    @XmlElement(name = "SupportedCommodityClassification")
    protected List<CommodityClassificationType> supportedCommodityClassification;
    @XmlElement(name = "UnsupportedCommodityClassification")
    protected List<CommodityClassificationType> unsupportedCommodityClassification;
    @XmlElement(name = "TotalCapacityDimension")
    protected DimensionType totalCapacityDimension;
    @XmlElement(name = "ShipmentStage")
    protected List<ShipmentStageType> shipmentStage;
    @XmlElement(name = "TransportEvent")
    protected List<TransportEventType> transportEvent;
    @XmlElement(name = "ResponsibleTransportServiceProviderParty")
    protected PartyType responsibleTransportServiceProviderParty;
    @XmlElement(name = "EnvironmentalEmission")
    protected List<EnvironmentalEmissionType> environmentalEmission;
    @XmlElement(name = "EstimatedDurationPeriod")
    protected PeriodType estimatedDurationPeriod;
    @XmlElement(name = "ScheduledServiceFrequency")
    protected List<ServiceFrequencyType> scheduledServiceFrequency;

    /**
     * Recupera il valore della proprietà transportServiceCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportServiceCodeType }
     *     
     */
    public TransportServiceCodeType getTransportServiceCode() {
        return transportServiceCode;
    }

    /**
     * Imposta il valore della proprietà transportServiceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportServiceCodeType }
     *     
     */
    public void setTransportServiceCode(TransportServiceCodeType value) {
        this.transportServiceCode = value;
    }

    /**
     * Recupera il valore della proprietà tariffClassCode.
     * 
     * @return
     *     possible object is
     *     {@link TariffClassCodeType }
     *     
     */
    public TariffClassCodeType getTariffClassCode() {
        return tariffClassCode;
    }

    /**
     * Imposta il valore della proprietà tariffClassCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffClassCodeType }
     *     
     */
    public void setTariffClassCode(TariffClassCodeType value) {
        this.tariffClassCode = value;
    }

    /**
     * Recupera il valore della proprietà priority.
     * 
     * @return
     *     possible object is
     *     {@link PriorityType }
     *     
     */
    public PriorityType getPriority() {
        return priority;
    }

    /**
     * Imposta il valore della proprietà priority.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityType }
     *     
     */
    public void setPriority(PriorityType value) {
        this.priority = value;
    }

    /**
     * Recupera il valore della proprietà freightRateClassCode.
     * 
     * @return
     *     possible object is
     *     {@link FreightRateClassCodeType }
     *     
     */
    public FreightRateClassCodeType getFreightRateClassCode() {
        return freightRateClassCode;
    }

    /**
     * Imposta il valore della proprietà freightRateClassCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightRateClassCodeType }
     *     
     */
    public void setFreightRateClassCode(FreightRateClassCodeType value) {
        this.freightRateClassCode = value;
    }

    /**
     * Gets the value of the transportationServiceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportationServiceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportationServiceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportationServiceDescriptionType }
     * 
     * 
     */
    public List<TransportationServiceDescriptionType> getTransportationServiceDescription() {
        if (transportationServiceDescription == null) {
            transportationServiceDescription = new ArrayList<TransportationServiceDescriptionType>();
        }
        return this.transportationServiceDescription;
    }

    /**
     * Recupera il valore della proprietà transportationServiceDetailsURI.
     * 
     * @return
     *     possible object is
     *     {@link TransportationServiceDetailsURIType }
     *     
     */
    public TransportationServiceDetailsURIType getTransportationServiceDetailsURI() {
        return transportationServiceDetailsURI;
    }

    /**
     * Imposta il valore della proprietà transportationServiceDetailsURI.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationServiceDetailsURIType }
     *     
     */
    public void setTransportationServiceDetailsURI(TransportationServiceDetailsURIType value) {
        this.transportationServiceDetailsURI = value;
    }

    /**
     * Recupera il valore della proprietà nominationDate.
     * 
     * @return
     *     possible object is
     *     {@link NominationDateType }
     *     
     */
    public NominationDateType getNominationDate() {
        return nominationDate;
    }

    /**
     * Imposta il valore della proprietà nominationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link NominationDateType }
     *     
     */
    public void setNominationDate(NominationDateType value) {
        this.nominationDate = value;
    }

    /**
     * Recupera il valore della proprietà nominationTime.
     * 
     * @return
     *     possible object is
     *     {@link NominationTimeType }
     *     
     */
    public NominationTimeType getNominationTime() {
        return nominationTime;
    }

    /**
     * Imposta il valore della proprietà nominationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link NominationTimeType }
     *     
     */
    public void setNominationTime(NominationTimeType value) {
        this.nominationTime = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

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
     * Gets the value of the transportEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getTransportEquipment() {
        if (transportEquipment == null) {
            transportEquipment = new ArrayList<TransportEquipmentType>();
        }
        return this.transportEquipment;
    }

    /**
     * Gets the value of the supportedTransportEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedTransportEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedTransportEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getSupportedTransportEquipment() {
        if (supportedTransportEquipment == null) {
            supportedTransportEquipment = new ArrayList<TransportEquipmentType>();
        }
        return this.supportedTransportEquipment;
    }

    /**
     * Gets the value of the unsupportedTransportEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unsupportedTransportEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnsupportedTransportEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getUnsupportedTransportEquipment() {
        if (unsupportedTransportEquipment == null) {
            unsupportedTransportEquipment = new ArrayList<TransportEquipmentType>();
        }
        return this.unsupportedTransportEquipment;
    }

    /**
     * Gets the value of the commodityClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commodityClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodityClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getCommodityClassification() {
        if (commodityClassification == null) {
            commodityClassification = new ArrayList<CommodityClassificationType>();
        }
        return this.commodityClassification;
    }

    /**
     * Gets the value of the supportedCommodityClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedCommodityClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedCommodityClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getSupportedCommodityClassification() {
        if (supportedCommodityClassification == null) {
            supportedCommodityClassification = new ArrayList<CommodityClassificationType>();
        }
        return this.supportedCommodityClassification;
    }

    /**
     * Gets the value of the unsupportedCommodityClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unsupportedCommodityClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnsupportedCommodityClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getUnsupportedCommodityClassification() {
        if (unsupportedCommodityClassification == null) {
            unsupportedCommodityClassification = new ArrayList<CommodityClassificationType>();
        }
        return this.unsupportedCommodityClassification;
    }

    /**
     * Recupera il valore della proprietà totalCapacityDimension.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getTotalCapacityDimension() {
        return totalCapacityDimension;
    }

    /**
     * Imposta il valore della proprietà totalCapacityDimension.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setTotalCapacityDimension(DimensionType value) {
        this.totalCapacityDimension = value;
    }

    /**
     * Gets the value of the shipmentStage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentStage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentStage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType }
     * 
     * 
     */
    public List<ShipmentStageType> getShipmentStage() {
        if (shipmentStage == null) {
            shipmentStage = new ArrayList<ShipmentStageType>();
        }
        return this.shipmentStage;
    }

    /**
     * Gets the value of the transportEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getTransportEvent() {
        if (transportEvent == null) {
            transportEvent = new ArrayList<TransportEventType>();
        }
        return this.transportEvent;
    }

    /**
     * Recupera il valore della proprietà responsibleTransportServiceProviderParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getResponsibleTransportServiceProviderParty() {
        return responsibleTransportServiceProviderParty;
    }

    /**
     * Imposta il valore della proprietà responsibleTransportServiceProviderParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setResponsibleTransportServiceProviderParty(PartyType value) {
        this.responsibleTransportServiceProviderParty = value;
    }

    /**
     * Gets the value of the environmentalEmission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentalEmission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentalEmission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvironmentalEmissionType }
     * 
     * 
     */
    public List<EnvironmentalEmissionType> getEnvironmentalEmission() {
        if (environmentalEmission == null) {
            environmentalEmission = new ArrayList<EnvironmentalEmissionType>();
        }
        return this.environmentalEmission;
    }

    /**
     * Recupera il valore della proprietà estimatedDurationPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEstimatedDurationPeriod() {
        return estimatedDurationPeriod;
    }

    /**
     * Imposta il valore della proprietà estimatedDurationPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEstimatedDurationPeriod(PeriodType value) {
        this.estimatedDurationPeriod = value;
    }

    /**
     * Gets the value of the scheduledServiceFrequency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduledServiceFrequency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduledServiceFrequency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFrequencyType }
     * 
     * 
     */
    public List<ServiceFrequencyType> getScheduledServiceFrequency() {
        if (scheduledServiceFrequency == null) {
            scheduledServiceFrequency = new ArrayList<ServiceFrequencyType>();
        }
        return this.scheduledServiceFrequency;
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
            TransportServiceCodeType theTransportServiceCode;
            theTransportServiceCode = this.getTransportServiceCode();
            strategy.appendField(locator, this, "transportServiceCode", buffer, theTransportServiceCode, (this.transportServiceCode!= null));
        }
        {
            TariffClassCodeType theTariffClassCode;
            theTariffClassCode = this.getTariffClassCode();
            strategy.appendField(locator, this, "tariffClassCode", buffer, theTariffClassCode, (this.tariffClassCode!= null));
        }
        {
            PriorityType thePriority;
            thePriority = this.getPriority();
            strategy.appendField(locator, this, "priority", buffer, thePriority, (this.priority!= null));
        }
        {
            FreightRateClassCodeType theFreightRateClassCode;
            theFreightRateClassCode = this.getFreightRateClassCode();
            strategy.appendField(locator, this, "freightRateClassCode", buffer, theFreightRateClassCode, (this.freightRateClassCode!= null));
        }
        {
            List<TransportationServiceDescriptionType> theTransportationServiceDescription;
            theTransportationServiceDescription = (((this.transportationServiceDescription!= null)&&(!this.transportationServiceDescription.isEmpty()))?this.getTransportationServiceDescription():null);
            strategy.appendField(locator, this, "transportationServiceDescription", buffer, theTransportationServiceDescription, ((this.transportationServiceDescription!= null)&&(!this.transportationServiceDescription.isEmpty())));
        }
        {
            TransportationServiceDetailsURIType theTransportationServiceDetailsURI;
            theTransportationServiceDetailsURI = this.getTransportationServiceDetailsURI();
            strategy.appendField(locator, this, "transportationServiceDetailsURI", buffer, theTransportationServiceDetailsURI, (this.transportationServiceDetailsURI!= null));
        }
        {
            NominationDateType theNominationDate;
            theNominationDate = this.getNominationDate();
            strategy.appendField(locator, this, "nominationDate", buffer, theNominationDate, (this.nominationDate!= null));
        }
        {
            NominationTimeType theNominationTime;
            theNominationTime = this.getNominationTime();
            strategy.appendField(locator, this, "nominationTime", buffer, theNominationTime, (this.nominationTime!= null));
        }
        {
            NameType theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            SequenceNumericType theSequenceNumeric;
            theSequenceNumeric = this.getSequenceNumeric();
            strategy.appendField(locator, this, "sequenceNumeric", buffer, theSequenceNumeric, (this.sequenceNumeric!= null));
        }
        {
            List<TransportEquipmentType> theTransportEquipment;
            theTransportEquipment = (((this.transportEquipment!= null)&&(!this.transportEquipment.isEmpty()))?this.getTransportEquipment():null);
            strategy.appendField(locator, this, "transportEquipment", buffer, theTransportEquipment, ((this.transportEquipment!= null)&&(!this.transportEquipment.isEmpty())));
        }
        {
            List<TransportEquipmentType> theSupportedTransportEquipment;
            theSupportedTransportEquipment = (((this.supportedTransportEquipment!= null)&&(!this.supportedTransportEquipment.isEmpty()))?this.getSupportedTransportEquipment():null);
            strategy.appendField(locator, this, "supportedTransportEquipment", buffer, theSupportedTransportEquipment, ((this.supportedTransportEquipment!= null)&&(!this.supportedTransportEquipment.isEmpty())));
        }
        {
            List<TransportEquipmentType> theUnsupportedTransportEquipment;
            theUnsupportedTransportEquipment = (((this.unsupportedTransportEquipment!= null)&&(!this.unsupportedTransportEquipment.isEmpty()))?this.getUnsupportedTransportEquipment():null);
            strategy.appendField(locator, this, "unsupportedTransportEquipment", buffer, theUnsupportedTransportEquipment, ((this.unsupportedTransportEquipment!= null)&&(!this.unsupportedTransportEquipment.isEmpty())));
        }
        {
            List<CommodityClassificationType> theCommodityClassification;
            theCommodityClassification = (((this.commodityClassification!= null)&&(!this.commodityClassification.isEmpty()))?this.getCommodityClassification():null);
            strategy.appendField(locator, this, "commodityClassification", buffer, theCommodityClassification, ((this.commodityClassification!= null)&&(!this.commodityClassification.isEmpty())));
        }
        {
            List<CommodityClassificationType> theSupportedCommodityClassification;
            theSupportedCommodityClassification = (((this.supportedCommodityClassification!= null)&&(!this.supportedCommodityClassification.isEmpty()))?this.getSupportedCommodityClassification():null);
            strategy.appendField(locator, this, "supportedCommodityClassification", buffer, theSupportedCommodityClassification, ((this.supportedCommodityClassification!= null)&&(!this.supportedCommodityClassification.isEmpty())));
        }
        {
            List<CommodityClassificationType> theUnsupportedCommodityClassification;
            theUnsupportedCommodityClassification = (((this.unsupportedCommodityClassification!= null)&&(!this.unsupportedCommodityClassification.isEmpty()))?this.getUnsupportedCommodityClassification():null);
            strategy.appendField(locator, this, "unsupportedCommodityClassification", buffer, theUnsupportedCommodityClassification, ((this.unsupportedCommodityClassification!= null)&&(!this.unsupportedCommodityClassification.isEmpty())));
        }
        {
            DimensionType theTotalCapacityDimension;
            theTotalCapacityDimension = this.getTotalCapacityDimension();
            strategy.appendField(locator, this, "totalCapacityDimension", buffer, theTotalCapacityDimension, (this.totalCapacityDimension!= null));
        }
        {
            List<ShipmentStageType> theShipmentStage;
            theShipmentStage = (((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty()))?this.getShipmentStage():null);
            strategy.appendField(locator, this, "shipmentStage", buffer, theShipmentStage, ((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty())));
        }
        {
            List<TransportEventType> theTransportEvent;
            theTransportEvent = (((this.transportEvent!= null)&&(!this.transportEvent.isEmpty()))?this.getTransportEvent():null);
            strategy.appendField(locator, this, "transportEvent", buffer, theTransportEvent, ((this.transportEvent!= null)&&(!this.transportEvent.isEmpty())));
        }
        {
            PartyType theResponsibleTransportServiceProviderParty;
            theResponsibleTransportServiceProviderParty = this.getResponsibleTransportServiceProviderParty();
            strategy.appendField(locator, this, "responsibleTransportServiceProviderParty", buffer, theResponsibleTransportServiceProviderParty, (this.responsibleTransportServiceProviderParty!= null));
        }
        {
            List<EnvironmentalEmissionType> theEnvironmentalEmission;
            theEnvironmentalEmission = (((this.environmentalEmission!= null)&&(!this.environmentalEmission.isEmpty()))?this.getEnvironmentalEmission():null);
            strategy.appendField(locator, this, "environmentalEmission", buffer, theEnvironmentalEmission, ((this.environmentalEmission!= null)&&(!this.environmentalEmission.isEmpty())));
        }
        {
            PeriodType theEstimatedDurationPeriod;
            theEstimatedDurationPeriod = this.getEstimatedDurationPeriod();
            strategy.appendField(locator, this, "estimatedDurationPeriod", buffer, theEstimatedDurationPeriod, (this.estimatedDurationPeriod!= null));
        }
        {
            List<ServiceFrequencyType> theScheduledServiceFrequency;
            theScheduledServiceFrequency = (((this.scheduledServiceFrequency!= null)&&(!this.scheduledServiceFrequency.isEmpty()))?this.getScheduledServiceFrequency():null);
            strategy.appendField(locator, this, "scheduledServiceFrequency", buffer, theScheduledServiceFrequency, ((this.scheduledServiceFrequency!= null)&&(!this.scheduledServiceFrequency.isEmpty())));
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
        final TransportationServiceType that = ((TransportationServiceType) object);
        {
            TransportServiceCodeType lhsTransportServiceCode;
            lhsTransportServiceCode = this.getTransportServiceCode();
            TransportServiceCodeType rhsTransportServiceCode;
            rhsTransportServiceCode = that.getTransportServiceCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportServiceCode", lhsTransportServiceCode), LocatorUtils.property(thatLocator, "transportServiceCode", rhsTransportServiceCode), lhsTransportServiceCode, rhsTransportServiceCode, (this.transportServiceCode!= null), (that.transportServiceCode!= null))) {
                return false;
            }
        }
        {
            TariffClassCodeType lhsTariffClassCode;
            lhsTariffClassCode = this.getTariffClassCode();
            TariffClassCodeType rhsTariffClassCode;
            rhsTariffClassCode = that.getTariffClassCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tariffClassCode", lhsTariffClassCode), LocatorUtils.property(thatLocator, "tariffClassCode", rhsTariffClassCode), lhsTariffClassCode, rhsTariffClassCode, (this.tariffClassCode!= null), (that.tariffClassCode!= null))) {
                return false;
            }
        }
        {
            PriorityType lhsPriority;
            lhsPriority = this.getPriority();
            PriorityType rhsPriority;
            rhsPriority = that.getPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priority", lhsPriority), LocatorUtils.property(thatLocator, "priority", rhsPriority), lhsPriority, rhsPriority, (this.priority!= null), (that.priority!= null))) {
                return false;
            }
        }
        {
            FreightRateClassCodeType lhsFreightRateClassCode;
            lhsFreightRateClassCode = this.getFreightRateClassCode();
            FreightRateClassCodeType rhsFreightRateClassCode;
            rhsFreightRateClassCode = that.getFreightRateClassCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightRateClassCode", lhsFreightRateClassCode), LocatorUtils.property(thatLocator, "freightRateClassCode", rhsFreightRateClassCode), lhsFreightRateClassCode, rhsFreightRateClassCode, (this.freightRateClassCode!= null), (that.freightRateClassCode!= null))) {
                return false;
            }
        }
        {
            List<TransportationServiceDescriptionType> lhsTransportationServiceDescription;
            lhsTransportationServiceDescription = (((this.transportationServiceDescription!= null)&&(!this.transportationServiceDescription.isEmpty()))?this.getTransportationServiceDescription():null);
            List<TransportationServiceDescriptionType> rhsTransportationServiceDescription;
            rhsTransportationServiceDescription = (((that.transportationServiceDescription!= null)&&(!that.transportationServiceDescription.isEmpty()))?that.getTransportationServiceDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportationServiceDescription", lhsTransportationServiceDescription), LocatorUtils.property(thatLocator, "transportationServiceDescription", rhsTransportationServiceDescription), lhsTransportationServiceDescription, rhsTransportationServiceDescription, ((this.transportationServiceDescription!= null)&&(!this.transportationServiceDescription.isEmpty())), ((that.transportationServiceDescription!= null)&&(!that.transportationServiceDescription.isEmpty())))) {
                return false;
            }
        }
        {
            TransportationServiceDetailsURIType lhsTransportationServiceDetailsURI;
            lhsTransportationServiceDetailsURI = this.getTransportationServiceDetailsURI();
            TransportationServiceDetailsURIType rhsTransportationServiceDetailsURI;
            rhsTransportationServiceDetailsURI = that.getTransportationServiceDetailsURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportationServiceDetailsURI", lhsTransportationServiceDetailsURI), LocatorUtils.property(thatLocator, "transportationServiceDetailsURI", rhsTransportationServiceDetailsURI), lhsTransportationServiceDetailsURI, rhsTransportationServiceDetailsURI, (this.transportationServiceDetailsURI!= null), (that.transportationServiceDetailsURI!= null))) {
                return false;
            }
        }
        {
            NominationDateType lhsNominationDate;
            lhsNominationDate = this.getNominationDate();
            NominationDateType rhsNominationDate;
            rhsNominationDate = that.getNominationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nominationDate", lhsNominationDate), LocatorUtils.property(thatLocator, "nominationDate", rhsNominationDate), lhsNominationDate, rhsNominationDate, (this.nominationDate!= null), (that.nominationDate!= null))) {
                return false;
            }
        }
        {
            NominationTimeType lhsNominationTime;
            lhsNominationTime = this.getNominationTime();
            NominationTimeType rhsNominationTime;
            rhsNominationTime = that.getNominationTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nominationTime", lhsNominationTime), LocatorUtils.property(thatLocator, "nominationTime", rhsNominationTime), lhsNominationTime, rhsNominationTime, (this.nominationTime!= null), (that.nominationTime!= null))) {
                return false;
            }
        }
        {
            NameType lhsName;
            lhsName = this.getName();
            NameType rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
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
            List<TransportEquipmentType> lhsTransportEquipment;
            lhsTransportEquipment = (((this.transportEquipment!= null)&&(!this.transportEquipment.isEmpty()))?this.getTransportEquipment():null);
            List<TransportEquipmentType> rhsTransportEquipment;
            rhsTransportEquipment = (((that.transportEquipment!= null)&&(!that.transportEquipment.isEmpty()))?that.getTransportEquipment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportEquipment", lhsTransportEquipment), LocatorUtils.property(thatLocator, "transportEquipment", rhsTransportEquipment), lhsTransportEquipment, rhsTransportEquipment, ((this.transportEquipment!= null)&&(!this.transportEquipment.isEmpty())), ((that.transportEquipment!= null)&&(!that.transportEquipment.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransportEquipmentType> lhsSupportedTransportEquipment;
            lhsSupportedTransportEquipment = (((this.supportedTransportEquipment!= null)&&(!this.supportedTransportEquipment.isEmpty()))?this.getSupportedTransportEquipment():null);
            List<TransportEquipmentType> rhsSupportedTransportEquipment;
            rhsSupportedTransportEquipment = (((that.supportedTransportEquipment!= null)&&(!that.supportedTransportEquipment.isEmpty()))?that.getSupportedTransportEquipment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supportedTransportEquipment", lhsSupportedTransportEquipment), LocatorUtils.property(thatLocator, "supportedTransportEquipment", rhsSupportedTransportEquipment), lhsSupportedTransportEquipment, rhsSupportedTransportEquipment, ((this.supportedTransportEquipment!= null)&&(!this.supportedTransportEquipment.isEmpty())), ((that.supportedTransportEquipment!= null)&&(!that.supportedTransportEquipment.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransportEquipmentType> lhsUnsupportedTransportEquipment;
            lhsUnsupportedTransportEquipment = (((this.unsupportedTransportEquipment!= null)&&(!this.unsupportedTransportEquipment.isEmpty()))?this.getUnsupportedTransportEquipment():null);
            List<TransportEquipmentType> rhsUnsupportedTransportEquipment;
            rhsUnsupportedTransportEquipment = (((that.unsupportedTransportEquipment!= null)&&(!that.unsupportedTransportEquipment.isEmpty()))?that.getUnsupportedTransportEquipment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unsupportedTransportEquipment", lhsUnsupportedTransportEquipment), LocatorUtils.property(thatLocator, "unsupportedTransportEquipment", rhsUnsupportedTransportEquipment), lhsUnsupportedTransportEquipment, rhsUnsupportedTransportEquipment, ((this.unsupportedTransportEquipment!= null)&&(!this.unsupportedTransportEquipment.isEmpty())), ((that.unsupportedTransportEquipment!= null)&&(!that.unsupportedTransportEquipment.isEmpty())))) {
                return false;
            }
        }
        {
            List<CommodityClassificationType> lhsCommodityClassification;
            lhsCommodityClassification = (((this.commodityClassification!= null)&&(!this.commodityClassification.isEmpty()))?this.getCommodityClassification():null);
            List<CommodityClassificationType> rhsCommodityClassification;
            rhsCommodityClassification = (((that.commodityClassification!= null)&&(!that.commodityClassification.isEmpty()))?that.getCommodityClassification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commodityClassification", lhsCommodityClassification), LocatorUtils.property(thatLocator, "commodityClassification", rhsCommodityClassification), lhsCommodityClassification, rhsCommodityClassification, ((this.commodityClassification!= null)&&(!this.commodityClassification.isEmpty())), ((that.commodityClassification!= null)&&(!that.commodityClassification.isEmpty())))) {
                return false;
            }
        }
        {
            List<CommodityClassificationType> lhsSupportedCommodityClassification;
            lhsSupportedCommodityClassification = (((this.supportedCommodityClassification!= null)&&(!this.supportedCommodityClassification.isEmpty()))?this.getSupportedCommodityClassification():null);
            List<CommodityClassificationType> rhsSupportedCommodityClassification;
            rhsSupportedCommodityClassification = (((that.supportedCommodityClassification!= null)&&(!that.supportedCommodityClassification.isEmpty()))?that.getSupportedCommodityClassification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supportedCommodityClassification", lhsSupportedCommodityClassification), LocatorUtils.property(thatLocator, "supportedCommodityClassification", rhsSupportedCommodityClassification), lhsSupportedCommodityClassification, rhsSupportedCommodityClassification, ((this.supportedCommodityClassification!= null)&&(!this.supportedCommodityClassification.isEmpty())), ((that.supportedCommodityClassification!= null)&&(!that.supportedCommodityClassification.isEmpty())))) {
                return false;
            }
        }
        {
            List<CommodityClassificationType> lhsUnsupportedCommodityClassification;
            lhsUnsupportedCommodityClassification = (((this.unsupportedCommodityClassification!= null)&&(!this.unsupportedCommodityClassification.isEmpty()))?this.getUnsupportedCommodityClassification():null);
            List<CommodityClassificationType> rhsUnsupportedCommodityClassification;
            rhsUnsupportedCommodityClassification = (((that.unsupportedCommodityClassification!= null)&&(!that.unsupportedCommodityClassification.isEmpty()))?that.getUnsupportedCommodityClassification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unsupportedCommodityClassification", lhsUnsupportedCommodityClassification), LocatorUtils.property(thatLocator, "unsupportedCommodityClassification", rhsUnsupportedCommodityClassification), lhsUnsupportedCommodityClassification, rhsUnsupportedCommodityClassification, ((this.unsupportedCommodityClassification!= null)&&(!this.unsupportedCommodityClassification.isEmpty())), ((that.unsupportedCommodityClassification!= null)&&(!that.unsupportedCommodityClassification.isEmpty())))) {
                return false;
            }
        }
        {
            DimensionType lhsTotalCapacityDimension;
            lhsTotalCapacityDimension = this.getTotalCapacityDimension();
            DimensionType rhsTotalCapacityDimension;
            rhsTotalCapacityDimension = that.getTotalCapacityDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalCapacityDimension", lhsTotalCapacityDimension), LocatorUtils.property(thatLocator, "totalCapacityDimension", rhsTotalCapacityDimension), lhsTotalCapacityDimension, rhsTotalCapacityDimension, (this.totalCapacityDimension!= null), (that.totalCapacityDimension!= null))) {
                return false;
            }
        }
        {
            List<ShipmentStageType> lhsShipmentStage;
            lhsShipmentStage = (((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty()))?this.getShipmentStage():null);
            List<ShipmentStageType> rhsShipmentStage;
            rhsShipmentStage = (((that.shipmentStage!= null)&&(!that.shipmentStage.isEmpty()))?that.getShipmentStage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentStage", lhsShipmentStage), LocatorUtils.property(thatLocator, "shipmentStage", rhsShipmentStage), lhsShipmentStage, rhsShipmentStage, ((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty())), ((that.shipmentStage!= null)&&(!that.shipmentStage.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransportEventType> lhsTransportEvent;
            lhsTransportEvent = (((this.transportEvent!= null)&&(!this.transportEvent.isEmpty()))?this.getTransportEvent():null);
            List<TransportEventType> rhsTransportEvent;
            rhsTransportEvent = (((that.transportEvent!= null)&&(!that.transportEvent.isEmpty()))?that.getTransportEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportEvent", lhsTransportEvent), LocatorUtils.property(thatLocator, "transportEvent", rhsTransportEvent), lhsTransportEvent, rhsTransportEvent, ((this.transportEvent!= null)&&(!this.transportEvent.isEmpty())), ((that.transportEvent!= null)&&(!that.transportEvent.isEmpty())))) {
                return false;
            }
        }
        {
            PartyType lhsResponsibleTransportServiceProviderParty;
            lhsResponsibleTransportServiceProviderParty = this.getResponsibleTransportServiceProviderParty();
            PartyType rhsResponsibleTransportServiceProviderParty;
            rhsResponsibleTransportServiceProviderParty = that.getResponsibleTransportServiceProviderParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responsibleTransportServiceProviderParty", lhsResponsibleTransportServiceProviderParty), LocatorUtils.property(thatLocator, "responsibleTransportServiceProviderParty", rhsResponsibleTransportServiceProviderParty), lhsResponsibleTransportServiceProviderParty, rhsResponsibleTransportServiceProviderParty, (this.responsibleTransportServiceProviderParty!= null), (that.responsibleTransportServiceProviderParty!= null))) {
                return false;
            }
        }
        {
            List<EnvironmentalEmissionType> lhsEnvironmentalEmission;
            lhsEnvironmentalEmission = (((this.environmentalEmission!= null)&&(!this.environmentalEmission.isEmpty()))?this.getEnvironmentalEmission():null);
            List<EnvironmentalEmissionType> rhsEnvironmentalEmission;
            rhsEnvironmentalEmission = (((that.environmentalEmission!= null)&&(!that.environmentalEmission.isEmpty()))?that.getEnvironmentalEmission():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "environmentalEmission", lhsEnvironmentalEmission), LocatorUtils.property(thatLocator, "environmentalEmission", rhsEnvironmentalEmission), lhsEnvironmentalEmission, rhsEnvironmentalEmission, ((this.environmentalEmission!= null)&&(!this.environmentalEmission.isEmpty())), ((that.environmentalEmission!= null)&&(!that.environmentalEmission.isEmpty())))) {
                return false;
            }
        }
        {
            PeriodType lhsEstimatedDurationPeriod;
            lhsEstimatedDurationPeriod = this.getEstimatedDurationPeriod();
            PeriodType rhsEstimatedDurationPeriod;
            rhsEstimatedDurationPeriod = that.getEstimatedDurationPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedDurationPeriod", lhsEstimatedDurationPeriod), LocatorUtils.property(thatLocator, "estimatedDurationPeriod", rhsEstimatedDurationPeriod), lhsEstimatedDurationPeriod, rhsEstimatedDurationPeriod, (this.estimatedDurationPeriod!= null), (that.estimatedDurationPeriod!= null))) {
                return false;
            }
        }
        {
            List<ServiceFrequencyType> lhsScheduledServiceFrequency;
            lhsScheduledServiceFrequency = (((this.scheduledServiceFrequency!= null)&&(!this.scheduledServiceFrequency.isEmpty()))?this.getScheduledServiceFrequency():null);
            List<ServiceFrequencyType> rhsScheduledServiceFrequency;
            rhsScheduledServiceFrequency = (((that.scheduledServiceFrequency!= null)&&(!that.scheduledServiceFrequency.isEmpty()))?that.getScheduledServiceFrequency():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduledServiceFrequency", lhsScheduledServiceFrequency), LocatorUtils.property(thatLocator, "scheduledServiceFrequency", rhsScheduledServiceFrequency), lhsScheduledServiceFrequency, rhsScheduledServiceFrequency, ((this.scheduledServiceFrequency!= null)&&(!this.scheduledServiceFrequency.isEmpty())), ((that.scheduledServiceFrequency!= null)&&(!that.scheduledServiceFrequency.isEmpty())))) {
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
            TransportServiceCodeType theTransportServiceCode;
            theTransportServiceCode = this.getTransportServiceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportServiceCode", theTransportServiceCode), currentHashCode, theTransportServiceCode, (this.transportServiceCode!= null));
        }
        {
            TariffClassCodeType theTariffClassCode;
            theTariffClassCode = this.getTariffClassCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tariffClassCode", theTariffClassCode), currentHashCode, theTariffClassCode, (this.tariffClassCode!= null));
        }
        {
            PriorityType thePriority;
            thePriority = this.getPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priority", thePriority), currentHashCode, thePriority, (this.priority!= null));
        }
        {
            FreightRateClassCodeType theFreightRateClassCode;
            theFreightRateClassCode = this.getFreightRateClassCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightRateClassCode", theFreightRateClassCode), currentHashCode, theFreightRateClassCode, (this.freightRateClassCode!= null));
        }
        {
            List<TransportationServiceDescriptionType> theTransportationServiceDescription;
            theTransportationServiceDescription = (((this.transportationServiceDescription!= null)&&(!this.transportationServiceDescription.isEmpty()))?this.getTransportationServiceDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportationServiceDescription", theTransportationServiceDescription), currentHashCode, theTransportationServiceDescription, ((this.transportationServiceDescription!= null)&&(!this.transportationServiceDescription.isEmpty())));
        }
        {
            TransportationServiceDetailsURIType theTransportationServiceDetailsURI;
            theTransportationServiceDetailsURI = this.getTransportationServiceDetailsURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportationServiceDetailsURI", theTransportationServiceDetailsURI), currentHashCode, theTransportationServiceDetailsURI, (this.transportationServiceDetailsURI!= null));
        }
        {
            NominationDateType theNominationDate;
            theNominationDate = this.getNominationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nominationDate", theNominationDate), currentHashCode, theNominationDate, (this.nominationDate!= null));
        }
        {
            NominationTimeType theNominationTime;
            theNominationTime = this.getNominationTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nominationTime", theNominationTime), currentHashCode, theNominationTime, (this.nominationTime!= null));
        }
        {
            NameType theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            SequenceNumericType theSequenceNumeric;
            theSequenceNumeric = this.getSequenceNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNumeric", theSequenceNumeric), currentHashCode, theSequenceNumeric, (this.sequenceNumeric!= null));
        }
        {
            List<TransportEquipmentType> theTransportEquipment;
            theTransportEquipment = (((this.transportEquipment!= null)&&(!this.transportEquipment.isEmpty()))?this.getTransportEquipment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportEquipment", theTransportEquipment), currentHashCode, theTransportEquipment, ((this.transportEquipment!= null)&&(!this.transportEquipment.isEmpty())));
        }
        {
            List<TransportEquipmentType> theSupportedTransportEquipment;
            theSupportedTransportEquipment = (((this.supportedTransportEquipment!= null)&&(!this.supportedTransportEquipment.isEmpty()))?this.getSupportedTransportEquipment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supportedTransportEquipment", theSupportedTransportEquipment), currentHashCode, theSupportedTransportEquipment, ((this.supportedTransportEquipment!= null)&&(!this.supportedTransportEquipment.isEmpty())));
        }
        {
            List<TransportEquipmentType> theUnsupportedTransportEquipment;
            theUnsupportedTransportEquipment = (((this.unsupportedTransportEquipment!= null)&&(!this.unsupportedTransportEquipment.isEmpty()))?this.getUnsupportedTransportEquipment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unsupportedTransportEquipment", theUnsupportedTransportEquipment), currentHashCode, theUnsupportedTransportEquipment, ((this.unsupportedTransportEquipment!= null)&&(!this.unsupportedTransportEquipment.isEmpty())));
        }
        {
            List<CommodityClassificationType> theCommodityClassification;
            theCommodityClassification = (((this.commodityClassification!= null)&&(!this.commodityClassification.isEmpty()))?this.getCommodityClassification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commodityClassification", theCommodityClassification), currentHashCode, theCommodityClassification, ((this.commodityClassification!= null)&&(!this.commodityClassification.isEmpty())));
        }
        {
            List<CommodityClassificationType> theSupportedCommodityClassification;
            theSupportedCommodityClassification = (((this.supportedCommodityClassification!= null)&&(!this.supportedCommodityClassification.isEmpty()))?this.getSupportedCommodityClassification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supportedCommodityClassification", theSupportedCommodityClassification), currentHashCode, theSupportedCommodityClassification, ((this.supportedCommodityClassification!= null)&&(!this.supportedCommodityClassification.isEmpty())));
        }
        {
            List<CommodityClassificationType> theUnsupportedCommodityClassification;
            theUnsupportedCommodityClassification = (((this.unsupportedCommodityClassification!= null)&&(!this.unsupportedCommodityClassification.isEmpty()))?this.getUnsupportedCommodityClassification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unsupportedCommodityClassification", theUnsupportedCommodityClassification), currentHashCode, theUnsupportedCommodityClassification, ((this.unsupportedCommodityClassification!= null)&&(!this.unsupportedCommodityClassification.isEmpty())));
        }
        {
            DimensionType theTotalCapacityDimension;
            theTotalCapacityDimension = this.getTotalCapacityDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalCapacityDimension", theTotalCapacityDimension), currentHashCode, theTotalCapacityDimension, (this.totalCapacityDimension!= null));
        }
        {
            List<ShipmentStageType> theShipmentStage;
            theShipmentStage = (((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty()))?this.getShipmentStage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentStage", theShipmentStage), currentHashCode, theShipmentStage, ((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty())));
        }
        {
            List<TransportEventType> theTransportEvent;
            theTransportEvent = (((this.transportEvent!= null)&&(!this.transportEvent.isEmpty()))?this.getTransportEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportEvent", theTransportEvent), currentHashCode, theTransportEvent, ((this.transportEvent!= null)&&(!this.transportEvent.isEmpty())));
        }
        {
            PartyType theResponsibleTransportServiceProviderParty;
            theResponsibleTransportServiceProviderParty = this.getResponsibleTransportServiceProviderParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responsibleTransportServiceProviderParty", theResponsibleTransportServiceProviderParty), currentHashCode, theResponsibleTransportServiceProviderParty, (this.responsibleTransportServiceProviderParty!= null));
        }
        {
            List<EnvironmentalEmissionType> theEnvironmentalEmission;
            theEnvironmentalEmission = (((this.environmentalEmission!= null)&&(!this.environmentalEmission.isEmpty()))?this.getEnvironmentalEmission():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "environmentalEmission", theEnvironmentalEmission), currentHashCode, theEnvironmentalEmission, ((this.environmentalEmission!= null)&&(!this.environmentalEmission.isEmpty())));
        }
        {
            PeriodType theEstimatedDurationPeriod;
            theEstimatedDurationPeriod = this.getEstimatedDurationPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedDurationPeriod", theEstimatedDurationPeriod), currentHashCode, theEstimatedDurationPeriod, (this.estimatedDurationPeriod!= null));
        }
        {
            List<ServiceFrequencyType> theScheduledServiceFrequency;
            theScheduledServiceFrequency = (((this.scheduledServiceFrequency!= null)&&(!this.scheduledServiceFrequency.isEmpty()))?this.getScheduledServiceFrequency():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduledServiceFrequency", theScheduledServiceFrequency), currentHashCode, theScheduledServiceFrequency, ((this.scheduledServiceFrequency!= null)&&(!this.scheduledServiceFrequency.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
