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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CrewQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DemurrageInstructionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EstimatedDeliveryDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EstimatedDeliveryTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InstructionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LoadingSequenceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OnCarriageIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PassengerQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PreCarriageIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequiredDeliveryDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequiredDeliveryTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SuccessiveSequenceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransitDirectionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportMeansTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportModeCodeType;
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
 * <p>Classe Java per ShipmentStageType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ShipmentStageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportModeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportMeansTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransitDirectionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreCarriageIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OnCarriageIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedDeliveryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedDeliveryTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequiredDeliveryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequiredDeliveryTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LoadingSequenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SuccessiveSequenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Instructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DemurrageInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CrewQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PassengerQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransitPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CarrierParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportMeans" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LoadingPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UnloadingPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransshipPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LoadingTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExaminationTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AvailabilityTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExportationTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DischargeTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarehousingTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TakeoverTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OptionalTakeoverTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DropoffTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualPickupTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReceiptTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}StorageTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AcceptanceTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TerminalOperatorParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CustomsAgentParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedTransitPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightChargeLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DetentionTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedWaypointTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedWaypointTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualWaypointTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PassengerPerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DriverPerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReportingPerson" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CrewMemberPerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SecurityOfficerPerson" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MasterPerson" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipsSurgeonPerson" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentStageType", propOrder = {
    "id",
    "transportModeCode",
    "transportMeansTypeCode",
    "transitDirectionCode",
    "preCarriageIndicator",
    "onCarriageIndicator",
    "estimatedDeliveryDate",
    "estimatedDeliveryTime",
    "requiredDeliveryDate",
    "requiredDeliveryTime",
    "loadingSequenceID",
    "successiveSequenceID",
    "instructions",
    "demurrageInstructions",
    "crewQuantity",
    "passengerQuantity",
    "transitPeriod",
    "carrierParty",
    "transportMeans",
    "loadingPortLocation",
    "unloadingPortLocation",
    "transshipPortLocation",
    "loadingTransportEvent",
    "examinationTransportEvent",
    "availabilityTransportEvent",
    "exportationTransportEvent",
    "dischargeTransportEvent",
    "warehousingTransportEvent",
    "takeoverTransportEvent",
    "optionalTakeoverTransportEvent",
    "dropoffTransportEvent",
    "actualPickupTransportEvent",
    "deliveryTransportEvent",
    "receiptTransportEvent",
    "storageTransportEvent",
    "acceptanceTransportEvent",
    "terminalOperatorParty",
    "customsAgentParty",
    "estimatedTransitPeriod",
    "freightAllowanceCharge",
    "freightChargeLocation",
    "detentionTransportEvent",
    "requestedDepartureTransportEvent",
    "requestedArrivalTransportEvent",
    "requestedWaypointTransportEvent",
    "plannedDepartureTransportEvent",
    "plannedArrivalTransportEvent",
    "plannedWaypointTransportEvent",
    "actualDepartureTransportEvent",
    "actualWaypointTransportEvent",
    "actualArrivalTransportEvent",
    "transportEvent",
    "estimatedDepartureTransportEvent",
    "estimatedArrivalTransportEvent",
    "passengerPerson",
    "driverPerson",
    "reportingPerson",
    "crewMemberPerson",
    "securityOfficerPerson",
    "masterPerson",
    "shipsSurgeonPerson"
})
public class ShipmentStageType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "TransportModeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportModeCodeType transportModeCode;
    @XmlElement(name = "TransportMeansTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportMeansTypeCodeType transportMeansTypeCode;
    @XmlElement(name = "TransitDirectionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransitDirectionCodeType transitDirectionCode;
    @XmlElement(name = "PreCarriageIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PreCarriageIndicatorType preCarriageIndicator;
    @XmlElement(name = "OnCarriageIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OnCarriageIndicatorType onCarriageIndicator;
    @XmlElement(name = "EstimatedDeliveryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EstimatedDeliveryDateType estimatedDeliveryDate;
    @XmlElement(name = "EstimatedDeliveryTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EstimatedDeliveryTimeType estimatedDeliveryTime;
    @XmlElement(name = "RequiredDeliveryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequiredDeliveryDateType requiredDeliveryDate;
    @XmlElement(name = "RequiredDeliveryTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequiredDeliveryTimeType requiredDeliveryTime;
    @XmlElement(name = "LoadingSequenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LoadingSequenceIDType loadingSequenceID;
    @XmlElement(name = "SuccessiveSequenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SuccessiveSequenceIDType successiveSequenceID;
    @XmlElement(name = "Instructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<InstructionsType> instructions;
    @XmlElement(name = "DemurrageInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DemurrageInstructionsType> demurrageInstructions;
    @XmlElement(name = "CrewQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CrewQuantityType crewQuantity;
    @XmlElement(name = "PassengerQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PassengerQuantityType passengerQuantity;
    @XmlElement(name = "TransitPeriod")
    protected PeriodType transitPeriod;
    @XmlElement(name = "CarrierParty")
    protected List<PartyType> carrierParty;
    @XmlElement(name = "TransportMeans")
    protected TransportMeansType transportMeans;
    @XmlElement(name = "LoadingPortLocation")
    protected LocationType loadingPortLocation;
    @XmlElement(name = "UnloadingPortLocation")
    protected LocationType unloadingPortLocation;
    @XmlElement(name = "TransshipPortLocation")
    protected LocationType transshipPortLocation;
    @XmlElement(name = "LoadingTransportEvent")
    protected TransportEventType loadingTransportEvent;
    @XmlElement(name = "ExaminationTransportEvent")
    protected TransportEventType examinationTransportEvent;
    @XmlElement(name = "AvailabilityTransportEvent")
    protected TransportEventType availabilityTransportEvent;
    @XmlElement(name = "ExportationTransportEvent")
    protected TransportEventType exportationTransportEvent;
    @XmlElement(name = "DischargeTransportEvent")
    protected TransportEventType dischargeTransportEvent;
    @XmlElement(name = "WarehousingTransportEvent")
    protected TransportEventType warehousingTransportEvent;
    @XmlElement(name = "TakeoverTransportEvent")
    protected TransportEventType takeoverTransportEvent;
    @XmlElement(name = "OptionalTakeoverTransportEvent")
    protected TransportEventType optionalTakeoverTransportEvent;
    @XmlElement(name = "DropoffTransportEvent")
    protected TransportEventType dropoffTransportEvent;
    @XmlElement(name = "ActualPickupTransportEvent")
    protected TransportEventType actualPickupTransportEvent;
    @XmlElement(name = "DeliveryTransportEvent")
    protected TransportEventType deliveryTransportEvent;
    @XmlElement(name = "ReceiptTransportEvent")
    protected TransportEventType receiptTransportEvent;
    @XmlElement(name = "StorageTransportEvent")
    protected TransportEventType storageTransportEvent;
    @XmlElement(name = "AcceptanceTransportEvent")
    protected TransportEventType acceptanceTransportEvent;
    @XmlElement(name = "TerminalOperatorParty")
    protected PartyType terminalOperatorParty;
    @XmlElement(name = "CustomsAgentParty")
    protected PartyType customsAgentParty;
    @XmlElement(name = "EstimatedTransitPeriod")
    protected PeriodType estimatedTransitPeriod;
    @XmlElement(name = "FreightAllowanceCharge")
    protected List<AllowanceChargeType> freightAllowanceCharge;
    @XmlElement(name = "FreightChargeLocation")
    protected LocationType freightChargeLocation;
    @XmlElement(name = "DetentionTransportEvent")
    protected List<TransportEventType> detentionTransportEvent;
    @XmlElement(name = "RequestedDepartureTransportEvent")
    protected TransportEventType requestedDepartureTransportEvent;
    @XmlElement(name = "RequestedArrivalTransportEvent")
    protected TransportEventType requestedArrivalTransportEvent;
    @XmlElement(name = "RequestedWaypointTransportEvent")
    protected List<TransportEventType> requestedWaypointTransportEvent;
    @XmlElement(name = "PlannedDepartureTransportEvent")
    protected TransportEventType plannedDepartureTransportEvent;
    @XmlElement(name = "PlannedArrivalTransportEvent")
    protected TransportEventType plannedArrivalTransportEvent;
    @XmlElement(name = "PlannedWaypointTransportEvent")
    protected List<TransportEventType> plannedWaypointTransportEvent;
    @XmlElement(name = "ActualDepartureTransportEvent")
    protected TransportEventType actualDepartureTransportEvent;
    @XmlElement(name = "ActualWaypointTransportEvent")
    protected TransportEventType actualWaypointTransportEvent;
    @XmlElement(name = "ActualArrivalTransportEvent")
    protected TransportEventType actualArrivalTransportEvent;
    @XmlElement(name = "TransportEvent")
    protected List<TransportEventType> transportEvent;
    @XmlElement(name = "EstimatedDepartureTransportEvent")
    protected TransportEventType estimatedDepartureTransportEvent;
    @XmlElement(name = "EstimatedArrivalTransportEvent")
    protected TransportEventType estimatedArrivalTransportEvent;
    @XmlElement(name = "PassengerPerson")
    protected List<PersonType> passengerPerson;
    @XmlElement(name = "DriverPerson")
    protected List<PersonType> driverPerson;
    @XmlElement(name = "ReportingPerson")
    protected PersonType reportingPerson;
    @XmlElement(name = "CrewMemberPerson")
    protected List<PersonType> crewMemberPerson;
    @XmlElement(name = "SecurityOfficerPerson")
    protected PersonType securityOfficerPerson;
    @XmlElement(name = "MasterPerson")
    protected PersonType masterPerson;
    @XmlElement(name = "ShipsSurgeonPerson")
    protected PersonType shipsSurgeonPerson;

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
     * Recupera il valore della proprietà transportModeCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportModeCodeType }
     *     
     */
    public TransportModeCodeType getTransportModeCode() {
        return transportModeCode;
    }

    /**
     * Imposta il valore della proprietà transportModeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportModeCodeType }
     *     
     */
    public void setTransportModeCode(TransportModeCodeType value) {
        this.transportModeCode = value;
    }

    /**
     * Recupera il valore della proprietà transportMeansTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansTypeCodeType }
     *     
     */
    public TransportMeansTypeCodeType getTransportMeansTypeCode() {
        return transportMeansTypeCode;
    }

    /**
     * Imposta il valore della proprietà transportMeansTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansTypeCodeType }
     *     
     */
    public void setTransportMeansTypeCode(TransportMeansTypeCodeType value) {
        this.transportMeansTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà transitDirectionCode.
     * 
     * @return
     *     possible object is
     *     {@link TransitDirectionCodeType }
     *     
     */
    public TransitDirectionCodeType getTransitDirectionCode() {
        return transitDirectionCode;
    }

    /**
     * Imposta il valore della proprietà transitDirectionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitDirectionCodeType }
     *     
     */
    public void setTransitDirectionCode(TransitDirectionCodeType value) {
        this.transitDirectionCode = value;
    }

    /**
     * Recupera il valore della proprietà preCarriageIndicator.
     * 
     * @return
     *     possible object is
     *     {@link PreCarriageIndicatorType }
     *     
     */
    public PreCarriageIndicatorType getPreCarriageIndicator() {
        return preCarriageIndicator;
    }

    /**
     * Imposta il valore della proprietà preCarriageIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link PreCarriageIndicatorType }
     *     
     */
    public void setPreCarriageIndicator(PreCarriageIndicatorType value) {
        this.preCarriageIndicator = value;
    }

    /**
     * Recupera il valore della proprietà onCarriageIndicator.
     * 
     * @return
     *     possible object is
     *     {@link OnCarriageIndicatorType }
     *     
     */
    public OnCarriageIndicatorType getOnCarriageIndicator() {
        return onCarriageIndicator;
    }

    /**
     * Imposta il valore della proprietà onCarriageIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link OnCarriageIndicatorType }
     *     
     */
    public void setOnCarriageIndicator(OnCarriageIndicatorType value) {
        this.onCarriageIndicator = value;
    }

    /**
     * Recupera il valore della proprietà estimatedDeliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedDeliveryDateType }
     *     
     */
    public EstimatedDeliveryDateType getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    /**
     * Imposta il valore della proprietà estimatedDeliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedDeliveryDateType }
     *     
     */
    public void setEstimatedDeliveryDate(EstimatedDeliveryDateType value) {
        this.estimatedDeliveryDate = value;
    }

    /**
     * Recupera il valore della proprietà estimatedDeliveryTime.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedDeliveryTimeType }
     *     
     */
    public EstimatedDeliveryTimeType getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    /**
     * Imposta il valore della proprietà estimatedDeliveryTime.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedDeliveryTimeType }
     *     
     */
    public void setEstimatedDeliveryTime(EstimatedDeliveryTimeType value) {
        this.estimatedDeliveryTime = value;
    }

    /**
     * Recupera il valore della proprietà requiredDeliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link RequiredDeliveryDateType }
     *     
     */
    public RequiredDeliveryDateType getRequiredDeliveryDate() {
        return requiredDeliveryDate;
    }

    /**
     * Imposta il valore della proprietà requiredDeliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredDeliveryDateType }
     *     
     */
    public void setRequiredDeliveryDate(RequiredDeliveryDateType value) {
        this.requiredDeliveryDate = value;
    }

    /**
     * Recupera il valore della proprietà requiredDeliveryTime.
     * 
     * @return
     *     possible object is
     *     {@link RequiredDeliveryTimeType }
     *     
     */
    public RequiredDeliveryTimeType getRequiredDeliveryTime() {
        return requiredDeliveryTime;
    }

    /**
     * Imposta il valore della proprietà requiredDeliveryTime.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredDeliveryTimeType }
     *     
     */
    public void setRequiredDeliveryTime(RequiredDeliveryTimeType value) {
        this.requiredDeliveryTime = value;
    }

    /**
     * Recupera il valore della proprietà loadingSequenceID.
     * 
     * @return
     *     possible object is
     *     {@link LoadingSequenceIDType }
     *     
     */
    public LoadingSequenceIDType getLoadingSequenceID() {
        return loadingSequenceID;
    }

    /**
     * Imposta il valore della proprietà loadingSequenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadingSequenceIDType }
     *     
     */
    public void setLoadingSequenceID(LoadingSequenceIDType value) {
        this.loadingSequenceID = value;
    }

    /**
     * Recupera il valore della proprietà successiveSequenceID.
     * 
     * @return
     *     possible object is
     *     {@link SuccessiveSequenceIDType }
     *     
     */
    public SuccessiveSequenceIDType getSuccessiveSequenceID() {
        return successiveSequenceID;
    }

    /**
     * Imposta il valore della proprietà successiveSequenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessiveSequenceIDType }
     *     
     */
    public void setSuccessiveSequenceID(SuccessiveSequenceIDType value) {
        this.successiveSequenceID = value;
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
     * Gets the value of the demurrageInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demurrageInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemurrageInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DemurrageInstructionsType }
     * 
     * 
     */
    public List<DemurrageInstructionsType> getDemurrageInstructions() {
        if (demurrageInstructions == null) {
            demurrageInstructions = new ArrayList<DemurrageInstructionsType>();
        }
        return this.demurrageInstructions;
    }

    /**
     * Recupera il valore della proprietà crewQuantity.
     * 
     * @return
     *     possible object is
     *     {@link CrewQuantityType }
     *     
     */
    public CrewQuantityType getCrewQuantity() {
        return crewQuantity;
    }

    /**
     * Imposta il valore della proprietà crewQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link CrewQuantityType }
     *     
     */
    public void setCrewQuantity(CrewQuantityType value) {
        this.crewQuantity = value;
    }

    /**
     * Recupera il valore della proprietà passengerQuantity.
     * 
     * @return
     *     possible object is
     *     {@link PassengerQuantityType }
     *     
     */
    public PassengerQuantityType getPassengerQuantity() {
        return passengerQuantity;
    }

    /**
     * Imposta il valore della proprietà passengerQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerQuantityType }
     *     
     */
    public void setPassengerQuantity(PassengerQuantityType value) {
        this.passengerQuantity = value;
    }

    /**
     * Recupera il valore della proprietà transitPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getTransitPeriod() {
        return transitPeriod;
    }

    /**
     * Imposta il valore della proprietà transitPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setTransitPeriod(PeriodType value) {
        this.transitPeriod = value;
    }

    /**
     * Gets the value of the carrierParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getCarrierParty() {
        if (carrierParty == null) {
            carrierParty = new ArrayList<PartyType>();
        }
        return this.carrierParty;
    }

    /**
     * Recupera il valore della proprietà transportMeans.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansType }
     *     
     */
    public TransportMeansType getTransportMeans() {
        return transportMeans;
    }

    /**
     * Imposta il valore della proprietà transportMeans.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansType }
     *     
     */
    public void setTransportMeans(TransportMeansType value) {
        this.transportMeans = value;
    }

    /**
     * Recupera il valore della proprietà loadingPortLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLoadingPortLocation() {
        return loadingPortLocation;
    }

    /**
     * Imposta il valore della proprietà loadingPortLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLoadingPortLocation(LocationType value) {
        this.loadingPortLocation = value;
    }

    /**
     * Recupera il valore della proprietà unloadingPortLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getUnloadingPortLocation() {
        return unloadingPortLocation;
    }

    /**
     * Imposta il valore della proprietà unloadingPortLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setUnloadingPortLocation(LocationType value) {
        this.unloadingPortLocation = value;
    }

    /**
     * Recupera il valore della proprietà transshipPortLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getTransshipPortLocation() {
        return transshipPortLocation;
    }

    /**
     * Imposta il valore della proprietà transshipPortLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setTransshipPortLocation(LocationType value) {
        this.transshipPortLocation = value;
    }

    /**
     * Recupera il valore della proprietà loadingTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getLoadingTransportEvent() {
        return loadingTransportEvent;
    }

    /**
     * Imposta il valore della proprietà loadingTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setLoadingTransportEvent(TransportEventType value) {
        this.loadingTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà examinationTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getExaminationTransportEvent() {
        return examinationTransportEvent;
    }

    /**
     * Imposta il valore della proprietà examinationTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setExaminationTransportEvent(TransportEventType value) {
        this.examinationTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà availabilityTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getAvailabilityTransportEvent() {
        return availabilityTransportEvent;
    }

    /**
     * Imposta il valore della proprietà availabilityTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setAvailabilityTransportEvent(TransportEventType value) {
        this.availabilityTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà exportationTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getExportationTransportEvent() {
        return exportationTransportEvent;
    }

    /**
     * Imposta il valore della proprietà exportationTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setExportationTransportEvent(TransportEventType value) {
        this.exportationTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà dischargeTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getDischargeTransportEvent() {
        return dischargeTransportEvent;
    }

    /**
     * Imposta il valore della proprietà dischargeTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setDischargeTransportEvent(TransportEventType value) {
        this.dischargeTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà warehousingTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getWarehousingTransportEvent() {
        return warehousingTransportEvent;
    }

    /**
     * Imposta il valore della proprietà warehousingTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setWarehousingTransportEvent(TransportEventType value) {
        this.warehousingTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà takeoverTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getTakeoverTransportEvent() {
        return takeoverTransportEvent;
    }

    /**
     * Imposta il valore della proprietà takeoverTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setTakeoverTransportEvent(TransportEventType value) {
        this.takeoverTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà optionalTakeoverTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getOptionalTakeoverTransportEvent() {
        return optionalTakeoverTransportEvent;
    }

    /**
     * Imposta il valore della proprietà optionalTakeoverTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setOptionalTakeoverTransportEvent(TransportEventType value) {
        this.optionalTakeoverTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà dropoffTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getDropoffTransportEvent() {
        return dropoffTransportEvent;
    }

    /**
     * Imposta il valore della proprietà dropoffTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setDropoffTransportEvent(TransportEventType value) {
        this.dropoffTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà actualPickupTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getActualPickupTransportEvent() {
        return actualPickupTransportEvent;
    }

    /**
     * Imposta il valore della proprietà actualPickupTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setActualPickupTransportEvent(TransportEventType value) {
        this.actualPickupTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà deliveryTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getDeliveryTransportEvent() {
        return deliveryTransportEvent;
    }

    /**
     * Imposta il valore della proprietà deliveryTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setDeliveryTransportEvent(TransportEventType value) {
        this.deliveryTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà receiptTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getReceiptTransportEvent() {
        return receiptTransportEvent;
    }

    /**
     * Imposta il valore della proprietà receiptTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setReceiptTransportEvent(TransportEventType value) {
        this.receiptTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà storageTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getStorageTransportEvent() {
        return storageTransportEvent;
    }

    /**
     * Imposta il valore della proprietà storageTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setStorageTransportEvent(TransportEventType value) {
        this.storageTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà acceptanceTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getAcceptanceTransportEvent() {
        return acceptanceTransportEvent;
    }

    /**
     * Imposta il valore della proprietà acceptanceTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setAcceptanceTransportEvent(TransportEventType value) {
        this.acceptanceTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà terminalOperatorParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getTerminalOperatorParty() {
        return terminalOperatorParty;
    }

    /**
     * Imposta il valore della proprietà terminalOperatorParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setTerminalOperatorParty(PartyType value) {
        this.terminalOperatorParty = value;
    }

    /**
     * Recupera il valore della proprietà customsAgentParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getCustomsAgentParty() {
        return customsAgentParty;
    }

    /**
     * Imposta il valore della proprietà customsAgentParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setCustomsAgentParty(PartyType value) {
        this.customsAgentParty = value;
    }

    /**
     * Recupera il valore della proprietà estimatedTransitPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEstimatedTransitPeriod() {
        return estimatedTransitPeriod;
    }

    /**
     * Imposta il valore della proprietà estimatedTransitPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEstimatedTransitPeriod(PeriodType value) {
        this.estimatedTransitPeriod = value;
    }

    /**
     * Gets the value of the freightAllowanceCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freightAllowanceCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreightAllowanceCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getFreightAllowanceCharge() {
        if (freightAllowanceCharge == null) {
            freightAllowanceCharge = new ArrayList<AllowanceChargeType>();
        }
        return this.freightAllowanceCharge;
    }

    /**
     * Recupera il valore della proprietà freightChargeLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getFreightChargeLocation() {
        return freightChargeLocation;
    }

    /**
     * Imposta il valore della proprietà freightChargeLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setFreightChargeLocation(LocationType value) {
        this.freightChargeLocation = value;
    }

    /**
     * Gets the value of the detentionTransportEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detentionTransportEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetentionTransportEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getDetentionTransportEvent() {
        if (detentionTransportEvent == null) {
            detentionTransportEvent = new ArrayList<TransportEventType>();
        }
        return this.detentionTransportEvent;
    }

    /**
     * Recupera il valore della proprietà requestedDepartureTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getRequestedDepartureTransportEvent() {
        return requestedDepartureTransportEvent;
    }

    /**
     * Imposta il valore della proprietà requestedDepartureTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setRequestedDepartureTransportEvent(TransportEventType value) {
        this.requestedDepartureTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà requestedArrivalTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getRequestedArrivalTransportEvent() {
        return requestedArrivalTransportEvent;
    }

    /**
     * Imposta il valore della proprietà requestedArrivalTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setRequestedArrivalTransportEvent(TransportEventType value) {
        this.requestedArrivalTransportEvent = value;
    }

    /**
     * Gets the value of the requestedWaypointTransportEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedWaypointTransportEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedWaypointTransportEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getRequestedWaypointTransportEvent() {
        if (requestedWaypointTransportEvent == null) {
            requestedWaypointTransportEvent = new ArrayList<TransportEventType>();
        }
        return this.requestedWaypointTransportEvent;
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

    /**
     * Gets the value of the plannedWaypointTransportEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plannedWaypointTransportEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlannedWaypointTransportEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getPlannedWaypointTransportEvent() {
        if (plannedWaypointTransportEvent == null) {
            plannedWaypointTransportEvent = new ArrayList<TransportEventType>();
        }
        return this.plannedWaypointTransportEvent;
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
     * Recupera il valore della proprietà actualWaypointTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getActualWaypointTransportEvent() {
        return actualWaypointTransportEvent;
    }

    /**
     * Imposta il valore della proprietà actualWaypointTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setActualWaypointTransportEvent(TransportEventType value) {
        this.actualWaypointTransportEvent = value;
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
     * Gets the value of the passengerPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getPassengerPerson() {
        if (passengerPerson == null) {
            passengerPerson = new ArrayList<PersonType>();
        }
        return this.passengerPerson;
    }

    /**
     * Gets the value of the driverPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getDriverPerson() {
        if (driverPerson == null) {
            driverPerson = new ArrayList<PersonType>();
        }
        return this.driverPerson;
    }

    /**
     * Recupera il valore della proprietà reportingPerson.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getReportingPerson() {
        return reportingPerson;
    }

    /**
     * Imposta il valore della proprietà reportingPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setReportingPerson(PersonType value) {
        this.reportingPerson = value;
    }

    /**
     * Gets the value of the crewMemberPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crewMemberPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrewMemberPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getCrewMemberPerson() {
        if (crewMemberPerson == null) {
            crewMemberPerson = new ArrayList<PersonType>();
        }
        return this.crewMemberPerson;
    }

    /**
     * Recupera il valore della proprietà securityOfficerPerson.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getSecurityOfficerPerson() {
        return securityOfficerPerson;
    }

    /**
     * Imposta il valore della proprietà securityOfficerPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setSecurityOfficerPerson(PersonType value) {
        this.securityOfficerPerson = value;
    }

    /**
     * Recupera il valore della proprietà masterPerson.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getMasterPerson() {
        return masterPerson;
    }

    /**
     * Imposta il valore della proprietà masterPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setMasterPerson(PersonType value) {
        this.masterPerson = value;
    }

    /**
     * Recupera il valore della proprietà shipsSurgeonPerson.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getShipsSurgeonPerson() {
        return shipsSurgeonPerson;
    }

    /**
     * Imposta il valore della proprietà shipsSurgeonPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setShipsSurgeonPerson(PersonType value) {
        this.shipsSurgeonPerson = value;
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
            TransportModeCodeType theTransportModeCode;
            theTransportModeCode = this.getTransportModeCode();
            strategy.appendField(locator, this, "transportModeCode", buffer, theTransportModeCode, (this.transportModeCode!= null));
        }
        {
            TransportMeansTypeCodeType theTransportMeansTypeCode;
            theTransportMeansTypeCode = this.getTransportMeansTypeCode();
            strategy.appendField(locator, this, "transportMeansTypeCode", buffer, theTransportMeansTypeCode, (this.transportMeansTypeCode!= null));
        }
        {
            TransitDirectionCodeType theTransitDirectionCode;
            theTransitDirectionCode = this.getTransitDirectionCode();
            strategy.appendField(locator, this, "transitDirectionCode", buffer, theTransitDirectionCode, (this.transitDirectionCode!= null));
        }
        {
            PreCarriageIndicatorType thePreCarriageIndicator;
            thePreCarriageIndicator = this.getPreCarriageIndicator();
            strategy.appendField(locator, this, "preCarriageIndicator", buffer, thePreCarriageIndicator, (this.preCarriageIndicator!= null));
        }
        {
            OnCarriageIndicatorType theOnCarriageIndicator;
            theOnCarriageIndicator = this.getOnCarriageIndicator();
            strategy.appendField(locator, this, "onCarriageIndicator", buffer, theOnCarriageIndicator, (this.onCarriageIndicator!= null));
        }
        {
            EstimatedDeliveryDateType theEstimatedDeliveryDate;
            theEstimatedDeliveryDate = this.getEstimatedDeliveryDate();
            strategy.appendField(locator, this, "estimatedDeliveryDate", buffer, theEstimatedDeliveryDate, (this.estimatedDeliveryDate!= null));
        }
        {
            EstimatedDeliveryTimeType theEstimatedDeliveryTime;
            theEstimatedDeliveryTime = this.getEstimatedDeliveryTime();
            strategy.appendField(locator, this, "estimatedDeliveryTime", buffer, theEstimatedDeliveryTime, (this.estimatedDeliveryTime!= null));
        }
        {
            RequiredDeliveryDateType theRequiredDeliveryDate;
            theRequiredDeliveryDate = this.getRequiredDeliveryDate();
            strategy.appendField(locator, this, "requiredDeliveryDate", buffer, theRequiredDeliveryDate, (this.requiredDeliveryDate!= null));
        }
        {
            RequiredDeliveryTimeType theRequiredDeliveryTime;
            theRequiredDeliveryTime = this.getRequiredDeliveryTime();
            strategy.appendField(locator, this, "requiredDeliveryTime", buffer, theRequiredDeliveryTime, (this.requiredDeliveryTime!= null));
        }
        {
            LoadingSequenceIDType theLoadingSequenceID;
            theLoadingSequenceID = this.getLoadingSequenceID();
            strategy.appendField(locator, this, "loadingSequenceID", buffer, theLoadingSequenceID, (this.loadingSequenceID!= null));
        }
        {
            SuccessiveSequenceIDType theSuccessiveSequenceID;
            theSuccessiveSequenceID = this.getSuccessiveSequenceID();
            strategy.appendField(locator, this, "successiveSequenceID", buffer, theSuccessiveSequenceID, (this.successiveSequenceID!= null));
        }
        {
            List<InstructionsType> theInstructions;
            theInstructions = (((this.instructions!= null)&&(!this.instructions.isEmpty()))?this.getInstructions():null);
            strategy.appendField(locator, this, "instructions", buffer, theInstructions, ((this.instructions!= null)&&(!this.instructions.isEmpty())));
        }
        {
            List<DemurrageInstructionsType> theDemurrageInstructions;
            theDemurrageInstructions = (((this.demurrageInstructions!= null)&&(!this.demurrageInstructions.isEmpty()))?this.getDemurrageInstructions():null);
            strategy.appendField(locator, this, "demurrageInstructions", buffer, theDemurrageInstructions, ((this.demurrageInstructions!= null)&&(!this.demurrageInstructions.isEmpty())));
        }
        {
            CrewQuantityType theCrewQuantity;
            theCrewQuantity = this.getCrewQuantity();
            strategy.appendField(locator, this, "crewQuantity", buffer, theCrewQuantity, (this.crewQuantity!= null));
        }
        {
            PassengerQuantityType thePassengerQuantity;
            thePassengerQuantity = this.getPassengerQuantity();
            strategy.appendField(locator, this, "passengerQuantity", buffer, thePassengerQuantity, (this.passengerQuantity!= null));
        }
        {
            PeriodType theTransitPeriod;
            theTransitPeriod = this.getTransitPeriod();
            strategy.appendField(locator, this, "transitPeriod", buffer, theTransitPeriod, (this.transitPeriod!= null));
        }
        {
            List<PartyType> theCarrierParty;
            theCarrierParty = (((this.carrierParty!= null)&&(!this.carrierParty.isEmpty()))?this.getCarrierParty():null);
            strategy.appendField(locator, this, "carrierParty", buffer, theCarrierParty, ((this.carrierParty!= null)&&(!this.carrierParty.isEmpty())));
        }
        {
            TransportMeansType theTransportMeans;
            theTransportMeans = this.getTransportMeans();
            strategy.appendField(locator, this, "transportMeans", buffer, theTransportMeans, (this.transportMeans!= null));
        }
        {
            LocationType theLoadingPortLocation;
            theLoadingPortLocation = this.getLoadingPortLocation();
            strategy.appendField(locator, this, "loadingPortLocation", buffer, theLoadingPortLocation, (this.loadingPortLocation!= null));
        }
        {
            LocationType theUnloadingPortLocation;
            theUnloadingPortLocation = this.getUnloadingPortLocation();
            strategy.appendField(locator, this, "unloadingPortLocation", buffer, theUnloadingPortLocation, (this.unloadingPortLocation!= null));
        }
        {
            LocationType theTransshipPortLocation;
            theTransshipPortLocation = this.getTransshipPortLocation();
            strategy.appendField(locator, this, "transshipPortLocation", buffer, theTransshipPortLocation, (this.transshipPortLocation!= null));
        }
        {
            TransportEventType theLoadingTransportEvent;
            theLoadingTransportEvent = this.getLoadingTransportEvent();
            strategy.appendField(locator, this, "loadingTransportEvent", buffer, theLoadingTransportEvent, (this.loadingTransportEvent!= null));
        }
        {
            TransportEventType theExaminationTransportEvent;
            theExaminationTransportEvent = this.getExaminationTransportEvent();
            strategy.appendField(locator, this, "examinationTransportEvent", buffer, theExaminationTransportEvent, (this.examinationTransportEvent!= null));
        }
        {
            TransportEventType theAvailabilityTransportEvent;
            theAvailabilityTransportEvent = this.getAvailabilityTransportEvent();
            strategy.appendField(locator, this, "availabilityTransportEvent", buffer, theAvailabilityTransportEvent, (this.availabilityTransportEvent!= null));
        }
        {
            TransportEventType theExportationTransportEvent;
            theExportationTransportEvent = this.getExportationTransportEvent();
            strategy.appendField(locator, this, "exportationTransportEvent", buffer, theExportationTransportEvent, (this.exportationTransportEvent!= null));
        }
        {
            TransportEventType theDischargeTransportEvent;
            theDischargeTransportEvent = this.getDischargeTransportEvent();
            strategy.appendField(locator, this, "dischargeTransportEvent", buffer, theDischargeTransportEvent, (this.dischargeTransportEvent!= null));
        }
        {
            TransportEventType theWarehousingTransportEvent;
            theWarehousingTransportEvent = this.getWarehousingTransportEvent();
            strategy.appendField(locator, this, "warehousingTransportEvent", buffer, theWarehousingTransportEvent, (this.warehousingTransportEvent!= null));
        }
        {
            TransportEventType theTakeoverTransportEvent;
            theTakeoverTransportEvent = this.getTakeoverTransportEvent();
            strategy.appendField(locator, this, "takeoverTransportEvent", buffer, theTakeoverTransportEvent, (this.takeoverTransportEvent!= null));
        }
        {
            TransportEventType theOptionalTakeoverTransportEvent;
            theOptionalTakeoverTransportEvent = this.getOptionalTakeoverTransportEvent();
            strategy.appendField(locator, this, "optionalTakeoverTransportEvent", buffer, theOptionalTakeoverTransportEvent, (this.optionalTakeoverTransportEvent!= null));
        }
        {
            TransportEventType theDropoffTransportEvent;
            theDropoffTransportEvent = this.getDropoffTransportEvent();
            strategy.appendField(locator, this, "dropoffTransportEvent", buffer, theDropoffTransportEvent, (this.dropoffTransportEvent!= null));
        }
        {
            TransportEventType theActualPickupTransportEvent;
            theActualPickupTransportEvent = this.getActualPickupTransportEvent();
            strategy.appendField(locator, this, "actualPickupTransportEvent", buffer, theActualPickupTransportEvent, (this.actualPickupTransportEvent!= null));
        }
        {
            TransportEventType theDeliveryTransportEvent;
            theDeliveryTransportEvent = this.getDeliveryTransportEvent();
            strategy.appendField(locator, this, "deliveryTransportEvent", buffer, theDeliveryTransportEvent, (this.deliveryTransportEvent!= null));
        }
        {
            TransportEventType theReceiptTransportEvent;
            theReceiptTransportEvent = this.getReceiptTransportEvent();
            strategy.appendField(locator, this, "receiptTransportEvent", buffer, theReceiptTransportEvent, (this.receiptTransportEvent!= null));
        }
        {
            TransportEventType theStorageTransportEvent;
            theStorageTransportEvent = this.getStorageTransportEvent();
            strategy.appendField(locator, this, "storageTransportEvent", buffer, theStorageTransportEvent, (this.storageTransportEvent!= null));
        }
        {
            TransportEventType theAcceptanceTransportEvent;
            theAcceptanceTransportEvent = this.getAcceptanceTransportEvent();
            strategy.appendField(locator, this, "acceptanceTransportEvent", buffer, theAcceptanceTransportEvent, (this.acceptanceTransportEvent!= null));
        }
        {
            PartyType theTerminalOperatorParty;
            theTerminalOperatorParty = this.getTerminalOperatorParty();
            strategy.appendField(locator, this, "terminalOperatorParty", buffer, theTerminalOperatorParty, (this.terminalOperatorParty!= null));
        }
        {
            PartyType theCustomsAgentParty;
            theCustomsAgentParty = this.getCustomsAgentParty();
            strategy.appendField(locator, this, "customsAgentParty", buffer, theCustomsAgentParty, (this.customsAgentParty!= null));
        }
        {
            PeriodType theEstimatedTransitPeriod;
            theEstimatedTransitPeriod = this.getEstimatedTransitPeriod();
            strategy.appendField(locator, this, "estimatedTransitPeriod", buffer, theEstimatedTransitPeriod, (this.estimatedTransitPeriod!= null));
        }
        {
            List<AllowanceChargeType> theFreightAllowanceCharge;
            theFreightAllowanceCharge = (((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty()))?this.getFreightAllowanceCharge():null);
            strategy.appendField(locator, this, "freightAllowanceCharge", buffer, theFreightAllowanceCharge, ((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty())));
        }
        {
            LocationType theFreightChargeLocation;
            theFreightChargeLocation = this.getFreightChargeLocation();
            strategy.appendField(locator, this, "freightChargeLocation", buffer, theFreightChargeLocation, (this.freightChargeLocation!= null));
        }
        {
            List<TransportEventType> theDetentionTransportEvent;
            theDetentionTransportEvent = (((this.detentionTransportEvent!= null)&&(!this.detentionTransportEvent.isEmpty()))?this.getDetentionTransportEvent():null);
            strategy.appendField(locator, this, "detentionTransportEvent", buffer, theDetentionTransportEvent, ((this.detentionTransportEvent!= null)&&(!this.detentionTransportEvent.isEmpty())));
        }
        {
            TransportEventType theRequestedDepartureTransportEvent;
            theRequestedDepartureTransportEvent = this.getRequestedDepartureTransportEvent();
            strategy.appendField(locator, this, "requestedDepartureTransportEvent", buffer, theRequestedDepartureTransportEvent, (this.requestedDepartureTransportEvent!= null));
        }
        {
            TransportEventType theRequestedArrivalTransportEvent;
            theRequestedArrivalTransportEvent = this.getRequestedArrivalTransportEvent();
            strategy.appendField(locator, this, "requestedArrivalTransportEvent", buffer, theRequestedArrivalTransportEvent, (this.requestedArrivalTransportEvent!= null));
        }
        {
            List<TransportEventType> theRequestedWaypointTransportEvent;
            theRequestedWaypointTransportEvent = (((this.requestedWaypointTransportEvent!= null)&&(!this.requestedWaypointTransportEvent.isEmpty()))?this.getRequestedWaypointTransportEvent():null);
            strategy.appendField(locator, this, "requestedWaypointTransportEvent", buffer, theRequestedWaypointTransportEvent, ((this.requestedWaypointTransportEvent!= null)&&(!this.requestedWaypointTransportEvent.isEmpty())));
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
        {
            List<TransportEventType> thePlannedWaypointTransportEvent;
            thePlannedWaypointTransportEvent = (((this.plannedWaypointTransportEvent!= null)&&(!this.plannedWaypointTransportEvent.isEmpty()))?this.getPlannedWaypointTransportEvent():null);
            strategy.appendField(locator, this, "plannedWaypointTransportEvent", buffer, thePlannedWaypointTransportEvent, ((this.plannedWaypointTransportEvent!= null)&&(!this.plannedWaypointTransportEvent.isEmpty())));
        }
        {
            TransportEventType theActualDepartureTransportEvent;
            theActualDepartureTransportEvent = this.getActualDepartureTransportEvent();
            strategy.appendField(locator, this, "actualDepartureTransportEvent", buffer, theActualDepartureTransportEvent, (this.actualDepartureTransportEvent!= null));
        }
        {
            TransportEventType theActualWaypointTransportEvent;
            theActualWaypointTransportEvent = this.getActualWaypointTransportEvent();
            strategy.appendField(locator, this, "actualWaypointTransportEvent", buffer, theActualWaypointTransportEvent, (this.actualWaypointTransportEvent!= null));
        }
        {
            TransportEventType theActualArrivalTransportEvent;
            theActualArrivalTransportEvent = this.getActualArrivalTransportEvent();
            strategy.appendField(locator, this, "actualArrivalTransportEvent", buffer, theActualArrivalTransportEvent, (this.actualArrivalTransportEvent!= null));
        }
        {
            List<TransportEventType> theTransportEvent;
            theTransportEvent = (((this.transportEvent!= null)&&(!this.transportEvent.isEmpty()))?this.getTransportEvent():null);
            strategy.appendField(locator, this, "transportEvent", buffer, theTransportEvent, ((this.transportEvent!= null)&&(!this.transportEvent.isEmpty())));
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
            List<PersonType> thePassengerPerson;
            thePassengerPerson = (((this.passengerPerson!= null)&&(!this.passengerPerson.isEmpty()))?this.getPassengerPerson():null);
            strategy.appendField(locator, this, "passengerPerson", buffer, thePassengerPerson, ((this.passengerPerson!= null)&&(!this.passengerPerson.isEmpty())));
        }
        {
            List<PersonType> theDriverPerson;
            theDriverPerson = (((this.driverPerson!= null)&&(!this.driverPerson.isEmpty()))?this.getDriverPerson():null);
            strategy.appendField(locator, this, "driverPerson", buffer, theDriverPerson, ((this.driverPerson!= null)&&(!this.driverPerson.isEmpty())));
        }
        {
            PersonType theReportingPerson;
            theReportingPerson = this.getReportingPerson();
            strategy.appendField(locator, this, "reportingPerson", buffer, theReportingPerson, (this.reportingPerson!= null));
        }
        {
            List<PersonType> theCrewMemberPerson;
            theCrewMemberPerson = (((this.crewMemberPerson!= null)&&(!this.crewMemberPerson.isEmpty()))?this.getCrewMemberPerson():null);
            strategy.appendField(locator, this, "crewMemberPerson", buffer, theCrewMemberPerson, ((this.crewMemberPerson!= null)&&(!this.crewMemberPerson.isEmpty())));
        }
        {
            PersonType theSecurityOfficerPerson;
            theSecurityOfficerPerson = this.getSecurityOfficerPerson();
            strategy.appendField(locator, this, "securityOfficerPerson", buffer, theSecurityOfficerPerson, (this.securityOfficerPerson!= null));
        }
        {
            PersonType theMasterPerson;
            theMasterPerson = this.getMasterPerson();
            strategy.appendField(locator, this, "masterPerson", buffer, theMasterPerson, (this.masterPerson!= null));
        }
        {
            PersonType theShipsSurgeonPerson;
            theShipsSurgeonPerson = this.getShipsSurgeonPerson();
            strategy.appendField(locator, this, "shipsSurgeonPerson", buffer, theShipsSurgeonPerson, (this.shipsSurgeonPerson!= null));
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
        final ShipmentStageType that = ((ShipmentStageType) object);
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
            TransportModeCodeType lhsTransportModeCode;
            lhsTransportModeCode = this.getTransportModeCode();
            TransportModeCodeType rhsTransportModeCode;
            rhsTransportModeCode = that.getTransportModeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportModeCode", lhsTransportModeCode), LocatorUtils.property(thatLocator, "transportModeCode", rhsTransportModeCode), lhsTransportModeCode, rhsTransportModeCode, (this.transportModeCode!= null), (that.transportModeCode!= null))) {
                return false;
            }
        }
        {
            TransportMeansTypeCodeType lhsTransportMeansTypeCode;
            lhsTransportMeansTypeCode = this.getTransportMeansTypeCode();
            TransportMeansTypeCodeType rhsTransportMeansTypeCode;
            rhsTransportMeansTypeCode = that.getTransportMeansTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportMeansTypeCode", lhsTransportMeansTypeCode), LocatorUtils.property(thatLocator, "transportMeansTypeCode", rhsTransportMeansTypeCode), lhsTransportMeansTypeCode, rhsTransportMeansTypeCode, (this.transportMeansTypeCode!= null), (that.transportMeansTypeCode!= null))) {
                return false;
            }
        }
        {
            TransitDirectionCodeType lhsTransitDirectionCode;
            lhsTransitDirectionCode = this.getTransitDirectionCode();
            TransitDirectionCodeType rhsTransitDirectionCode;
            rhsTransitDirectionCode = that.getTransitDirectionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transitDirectionCode", lhsTransitDirectionCode), LocatorUtils.property(thatLocator, "transitDirectionCode", rhsTransitDirectionCode), lhsTransitDirectionCode, rhsTransitDirectionCode, (this.transitDirectionCode!= null), (that.transitDirectionCode!= null))) {
                return false;
            }
        }
        {
            PreCarriageIndicatorType lhsPreCarriageIndicator;
            lhsPreCarriageIndicator = this.getPreCarriageIndicator();
            PreCarriageIndicatorType rhsPreCarriageIndicator;
            rhsPreCarriageIndicator = that.getPreCarriageIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preCarriageIndicator", lhsPreCarriageIndicator), LocatorUtils.property(thatLocator, "preCarriageIndicator", rhsPreCarriageIndicator), lhsPreCarriageIndicator, rhsPreCarriageIndicator, (this.preCarriageIndicator!= null), (that.preCarriageIndicator!= null))) {
                return false;
            }
        }
        {
            OnCarriageIndicatorType lhsOnCarriageIndicator;
            lhsOnCarriageIndicator = this.getOnCarriageIndicator();
            OnCarriageIndicatorType rhsOnCarriageIndicator;
            rhsOnCarriageIndicator = that.getOnCarriageIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "onCarriageIndicator", lhsOnCarriageIndicator), LocatorUtils.property(thatLocator, "onCarriageIndicator", rhsOnCarriageIndicator), lhsOnCarriageIndicator, rhsOnCarriageIndicator, (this.onCarriageIndicator!= null), (that.onCarriageIndicator!= null))) {
                return false;
            }
        }
        {
            EstimatedDeliveryDateType lhsEstimatedDeliveryDate;
            lhsEstimatedDeliveryDate = this.getEstimatedDeliveryDate();
            EstimatedDeliveryDateType rhsEstimatedDeliveryDate;
            rhsEstimatedDeliveryDate = that.getEstimatedDeliveryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedDeliveryDate", lhsEstimatedDeliveryDate), LocatorUtils.property(thatLocator, "estimatedDeliveryDate", rhsEstimatedDeliveryDate), lhsEstimatedDeliveryDate, rhsEstimatedDeliveryDate, (this.estimatedDeliveryDate!= null), (that.estimatedDeliveryDate!= null))) {
                return false;
            }
        }
        {
            EstimatedDeliveryTimeType lhsEstimatedDeliveryTime;
            lhsEstimatedDeliveryTime = this.getEstimatedDeliveryTime();
            EstimatedDeliveryTimeType rhsEstimatedDeliveryTime;
            rhsEstimatedDeliveryTime = that.getEstimatedDeliveryTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedDeliveryTime", lhsEstimatedDeliveryTime), LocatorUtils.property(thatLocator, "estimatedDeliveryTime", rhsEstimatedDeliveryTime), lhsEstimatedDeliveryTime, rhsEstimatedDeliveryTime, (this.estimatedDeliveryTime!= null), (that.estimatedDeliveryTime!= null))) {
                return false;
            }
        }
        {
            RequiredDeliveryDateType lhsRequiredDeliveryDate;
            lhsRequiredDeliveryDate = this.getRequiredDeliveryDate();
            RequiredDeliveryDateType rhsRequiredDeliveryDate;
            rhsRequiredDeliveryDate = that.getRequiredDeliveryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requiredDeliveryDate", lhsRequiredDeliveryDate), LocatorUtils.property(thatLocator, "requiredDeliveryDate", rhsRequiredDeliveryDate), lhsRequiredDeliveryDate, rhsRequiredDeliveryDate, (this.requiredDeliveryDate!= null), (that.requiredDeliveryDate!= null))) {
                return false;
            }
        }
        {
            RequiredDeliveryTimeType lhsRequiredDeliveryTime;
            lhsRequiredDeliveryTime = this.getRequiredDeliveryTime();
            RequiredDeliveryTimeType rhsRequiredDeliveryTime;
            rhsRequiredDeliveryTime = that.getRequiredDeliveryTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requiredDeliveryTime", lhsRequiredDeliveryTime), LocatorUtils.property(thatLocator, "requiredDeliveryTime", rhsRequiredDeliveryTime), lhsRequiredDeliveryTime, rhsRequiredDeliveryTime, (this.requiredDeliveryTime!= null), (that.requiredDeliveryTime!= null))) {
                return false;
            }
        }
        {
            LoadingSequenceIDType lhsLoadingSequenceID;
            lhsLoadingSequenceID = this.getLoadingSequenceID();
            LoadingSequenceIDType rhsLoadingSequenceID;
            rhsLoadingSequenceID = that.getLoadingSequenceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loadingSequenceID", lhsLoadingSequenceID), LocatorUtils.property(thatLocator, "loadingSequenceID", rhsLoadingSequenceID), lhsLoadingSequenceID, rhsLoadingSequenceID, (this.loadingSequenceID!= null), (that.loadingSequenceID!= null))) {
                return false;
            }
        }
        {
            SuccessiveSequenceIDType lhsSuccessiveSequenceID;
            lhsSuccessiveSequenceID = this.getSuccessiveSequenceID();
            SuccessiveSequenceIDType rhsSuccessiveSequenceID;
            rhsSuccessiveSequenceID = that.getSuccessiveSequenceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "successiveSequenceID", lhsSuccessiveSequenceID), LocatorUtils.property(thatLocator, "successiveSequenceID", rhsSuccessiveSequenceID), lhsSuccessiveSequenceID, rhsSuccessiveSequenceID, (this.successiveSequenceID!= null), (that.successiveSequenceID!= null))) {
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
            List<DemurrageInstructionsType> lhsDemurrageInstructions;
            lhsDemurrageInstructions = (((this.demurrageInstructions!= null)&&(!this.demurrageInstructions.isEmpty()))?this.getDemurrageInstructions():null);
            List<DemurrageInstructionsType> rhsDemurrageInstructions;
            rhsDemurrageInstructions = (((that.demurrageInstructions!= null)&&(!that.demurrageInstructions.isEmpty()))?that.getDemurrageInstructions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "demurrageInstructions", lhsDemurrageInstructions), LocatorUtils.property(thatLocator, "demurrageInstructions", rhsDemurrageInstructions), lhsDemurrageInstructions, rhsDemurrageInstructions, ((this.demurrageInstructions!= null)&&(!this.demurrageInstructions.isEmpty())), ((that.demurrageInstructions!= null)&&(!that.demurrageInstructions.isEmpty())))) {
                return false;
            }
        }
        {
            CrewQuantityType lhsCrewQuantity;
            lhsCrewQuantity = this.getCrewQuantity();
            CrewQuantityType rhsCrewQuantity;
            rhsCrewQuantity = that.getCrewQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "crewQuantity", lhsCrewQuantity), LocatorUtils.property(thatLocator, "crewQuantity", rhsCrewQuantity), lhsCrewQuantity, rhsCrewQuantity, (this.crewQuantity!= null), (that.crewQuantity!= null))) {
                return false;
            }
        }
        {
            PassengerQuantityType lhsPassengerQuantity;
            lhsPassengerQuantity = this.getPassengerQuantity();
            PassengerQuantityType rhsPassengerQuantity;
            rhsPassengerQuantity = that.getPassengerQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "passengerQuantity", lhsPassengerQuantity), LocatorUtils.property(thatLocator, "passengerQuantity", rhsPassengerQuantity), lhsPassengerQuantity, rhsPassengerQuantity, (this.passengerQuantity!= null), (that.passengerQuantity!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsTransitPeriod;
            lhsTransitPeriod = this.getTransitPeriod();
            PeriodType rhsTransitPeriod;
            rhsTransitPeriod = that.getTransitPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transitPeriod", lhsTransitPeriod), LocatorUtils.property(thatLocator, "transitPeriod", rhsTransitPeriod), lhsTransitPeriod, rhsTransitPeriod, (this.transitPeriod!= null), (that.transitPeriod!= null))) {
                return false;
            }
        }
        {
            List<PartyType> lhsCarrierParty;
            lhsCarrierParty = (((this.carrierParty!= null)&&(!this.carrierParty.isEmpty()))?this.getCarrierParty():null);
            List<PartyType> rhsCarrierParty;
            rhsCarrierParty = (((that.carrierParty!= null)&&(!that.carrierParty.isEmpty()))?that.getCarrierParty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "carrierParty", lhsCarrierParty), LocatorUtils.property(thatLocator, "carrierParty", rhsCarrierParty), lhsCarrierParty, rhsCarrierParty, ((this.carrierParty!= null)&&(!this.carrierParty.isEmpty())), ((that.carrierParty!= null)&&(!that.carrierParty.isEmpty())))) {
                return false;
            }
        }
        {
            TransportMeansType lhsTransportMeans;
            lhsTransportMeans = this.getTransportMeans();
            TransportMeansType rhsTransportMeans;
            rhsTransportMeans = that.getTransportMeans();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportMeans", lhsTransportMeans), LocatorUtils.property(thatLocator, "transportMeans", rhsTransportMeans), lhsTransportMeans, rhsTransportMeans, (this.transportMeans!= null), (that.transportMeans!= null))) {
                return false;
            }
        }
        {
            LocationType lhsLoadingPortLocation;
            lhsLoadingPortLocation = this.getLoadingPortLocation();
            LocationType rhsLoadingPortLocation;
            rhsLoadingPortLocation = that.getLoadingPortLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loadingPortLocation", lhsLoadingPortLocation), LocatorUtils.property(thatLocator, "loadingPortLocation", rhsLoadingPortLocation), lhsLoadingPortLocation, rhsLoadingPortLocation, (this.loadingPortLocation!= null), (that.loadingPortLocation!= null))) {
                return false;
            }
        }
        {
            LocationType lhsUnloadingPortLocation;
            lhsUnloadingPortLocation = this.getUnloadingPortLocation();
            LocationType rhsUnloadingPortLocation;
            rhsUnloadingPortLocation = that.getUnloadingPortLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unloadingPortLocation", lhsUnloadingPortLocation), LocatorUtils.property(thatLocator, "unloadingPortLocation", rhsUnloadingPortLocation), lhsUnloadingPortLocation, rhsUnloadingPortLocation, (this.unloadingPortLocation!= null), (that.unloadingPortLocation!= null))) {
                return false;
            }
        }
        {
            LocationType lhsTransshipPortLocation;
            lhsTransshipPortLocation = this.getTransshipPortLocation();
            LocationType rhsTransshipPortLocation;
            rhsTransshipPortLocation = that.getTransshipPortLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transshipPortLocation", lhsTransshipPortLocation), LocatorUtils.property(thatLocator, "transshipPortLocation", rhsTransshipPortLocation), lhsTransshipPortLocation, rhsTransshipPortLocation, (this.transshipPortLocation!= null), (that.transshipPortLocation!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsLoadingTransportEvent;
            lhsLoadingTransportEvent = this.getLoadingTransportEvent();
            TransportEventType rhsLoadingTransportEvent;
            rhsLoadingTransportEvent = that.getLoadingTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loadingTransportEvent", lhsLoadingTransportEvent), LocatorUtils.property(thatLocator, "loadingTransportEvent", rhsLoadingTransportEvent), lhsLoadingTransportEvent, rhsLoadingTransportEvent, (this.loadingTransportEvent!= null), (that.loadingTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsExaminationTransportEvent;
            lhsExaminationTransportEvent = this.getExaminationTransportEvent();
            TransportEventType rhsExaminationTransportEvent;
            rhsExaminationTransportEvent = that.getExaminationTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "examinationTransportEvent", lhsExaminationTransportEvent), LocatorUtils.property(thatLocator, "examinationTransportEvent", rhsExaminationTransportEvent), lhsExaminationTransportEvent, rhsExaminationTransportEvent, (this.examinationTransportEvent!= null), (that.examinationTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsAvailabilityTransportEvent;
            lhsAvailabilityTransportEvent = this.getAvailabilityTransportEvent();
            TransportEventType rhsAvailabilityTransportEvent;
            rhsAvailabilityTransportEvent = that.getAvailabilityTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "availabilityTransportEvent", lhsAvailabilityTransportEvent), LocatorUtils.property(thatLocator, "availabilityTransportEvent", rhsAvailabilityTransportEvent), lhsAvailabilityTransportEvent, rhsAvailabilityTransportEvent, (this.availabilityTransportEvent!= null), (that.availabilityTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsExportationTransportEvent;
            lhsExportationTransportEvent = this.getExportationTransportEvent();
            TransportEventType rhsExportationTransportEvent;
            rhsExportationTransportEvent = that.getExportationTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exportationTransportEvent", lhsExportationTransportEvent), LocatorUtils.property(thatLocator, "exportationTransportEvent", rhsExportationTransportEvent), lhsExportationTransportEvent, rhsExportationTransportEvent, (this.exportationTransportEvent!= null), (that.exportationTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsDischargeTransportEvent;
            lhsDischargeTransportEvent = this.getDischargeTransportEvent();
            TransportEventType rhsDischargeTransportEvent;
            rhsDischargeTransportEvent = that.getDischargeTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dischargeTransportEvent", lhsDischargeTransportEvent), LocatorUtils.property(thatLocator, "dischargeTransportEvent", rhsDischargeTransportEvent), lhsDischargeTransportEvent, rhsDischargeTransportEvent, (this.dischargeTransportEvent!= null), (that.dischargeTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsWarehousingTransportEvent;
            lhsWarehousingTransportEvent = this.getWarehousingTransportEvent();
            TransportEventType rhsWarehousingTransportEvent;
            rhsWarehousingTransportEvent = that.getWarehousingTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warehousingTransportEvent", lhsWarehousingTransportEvent), LocatorUtils.property(thatLocator, "warehousingTransportEvent", rhsWarehousingTransportEvent), lhsWarehousingTransportEvent, rhsWarehousingTransportEvent, (this.warehousingTransportEvent!= null), (that.warehousingTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsTakeoverTransportEvent;
            lhsTakeoverTransportEvent = this.getTakeoverTransportEvent();
            TransportEventType rhsTakeoverTransportEvent;
            rhsTakeoverTransportEvent = that.getTakeoverTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "takeoverTransportEvent", lhsTakeoverTransportEvent), LocatorUtils.property(thatLocator, "takeoverTransportEvent", rhsTakeoverTransportEvent), lhsTakeoverTransportEvent, rhsTakeoverTransportEvent, (this.takeoverTransportEvent!= null), (that.takeoverTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsOptionalTakeoverTransportEvent;
            lhsOptionalTakeoverTransportEvent = this.getOptionalTakeoverTransportEvent();
            TransportEventType rhsOptionalTakeoverTransportEvent;
            rhsOptionalTakeoverTransportEvent = that.getOptionalTakeoverTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "optionalTakeoverTransportEvent", lhsOptionalTakeoverTransportEvent), LocatorUtils.property(thatLocator, "optionalTakeoverTransportEvent", rhsOptionalTakeoverTransportEvent), lhsOptionalTakeoverTransportEvent, rhsOptionalTakeoverTransportEvent, (this.optionalTakeoverTransportEvent!= null), (that.optionalTakeoverTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsDropoffTransportEvent;
            lhsDropoffTransportEvent = this.getDropoffTransportEvent();
            TransportEventType rhsDropoffTransportEvent;
            rhsDropoffTransportEvent = that.getDropoffTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dropoffTransportEvent", lhsDropoffTransportEvent), LocatorUtils.property(thatLocator, "dropoffTransportEvent", rhsDropoffTransportEvent), lhsDropoffTransportEvent, rhsDropoffTransportEvent, (this.dropoffTransportEvent!= null), (that.dropoffTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsActualPickupTransportEvent;
            lhsActualPickupTransportEvent = this.getActualPickupTransportEvent();
            TransportEventType rhsActualPickupTransportEvent;
            rhsActualPickupTransportEvent = that.getActualPickupTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualPickupTransportEvent", lhsActualPickupTransportEvent), LocatorUtils.property(thatLocator, "actualPickupTransportEvent", rhsActualPickupTransportEvent), lhsActualPickupTransportEvent, rhsActualPickupTransportEvent, (this.actualPickupTransportEvent!= null), (that.actualPickupTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsDeliveryTransportEvent;
            lhsDeliveryTransportEvent = this.getDeliveryTransportEvent();
            TransportEventType rhsDeliveryTransportEvent;
            rhsDeliveryTransportEvent = that.getDeliveryTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryTransportEvent", lhsDeliveryTransportEvent), LocatorUtils.property(thatLocator, "deliveryTransportEvent", rhsDeliveryTransportEvent), lhsDeliveryTransportEvent, rhsDeliveryTransportEvent, (this.deliveryTransportEvent!= null), (that.deliveryTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsReceiptTransportEvent;
            lhsReceiptTransportEvent = this.getReceiptTransportEvent();
            TransportEventType rhsReceiptTransportEvent;
            rhsReceiptTransportEvent = that.getReceiptTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receiptTransportEvent", lhsReceiptTransportEvent), LocatorUtils.property(thatLocator, "receiptTransportEvent", rhsReceiptTransportEvent), lhsReceiptTransportEvent, rhsReceiptTransportEvent, (this.receiptTransportEvent!= null), (that.receiptTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsStorageTransportEvent;
            lhsStorageTransportEvent = this.getStorageTransportEvent();
            TransportEventType rhsStorageTransportEvent;
            rhsStorageTransportEvent = that.getStorageTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "storageTransportEvent", lhsStorageTransportEvent), LocatorUtils.property(thatLocator, "storageTransportEvent", rhsStorageTransportEvent), lhsStorageTransportEvent, rhsStorageTransportEvent, (this.storageTransportEvent!= null), (that.storageTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsAcceptanceTransportEvent;
            lhsAcceptanceTransportEvent = this.getAcceptanceTransportEvent();
            TransportEventType rhsAcceptanceTransportEvent;
            rhsAcceptanceTransportEvent = that.getAcceptanceTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acceptanceTransportEvent", lhsAcceptanceTransportEvent), LocatorUtils.property(thatLocator, "acceptanceTransportEvent", rhsAcceptanceTransportEvent), lhsAcceptanceTransportEvent, rhsAcceptanceTransportEvent, (this.acceptanceTransportEvent!= null), (that.acceptanceTransportEvent!= null))) {
                return false;
            }
        }
        {
            PartyType lhsTerminalOperatorParty;
            lhsTerminalOperatorParty = this.getTerminalOperatorParty();
            PartyType rhsTerminalOperatorParty;
            rhsTerminalOperatorParty = that.getTerminalOperatorParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terminalOperatorParty", lhsTerminalOperatorParty), LocatorUtils.property(thatLocator, "terminalOperatorParty", rhsTerminalOperatorParty), lhsTerminalOperatorParty, rhsTerminalOperatorParty, (this.terminalOperatorParty!= null), (that.terminalOperatorParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsCustomsAgentParty;
            lhsCustomsAgentParty = this.getCustomsAgentParty();
            PartyType rhsCustomsAgentParty;
            rhsCustomsAgentParty = that.getCustomsAgentParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customsAgentParty", lhsCustomsAgentParty), LocatorUtils.property(thatLocator, "customsAgentParty", rhsCustomsAgentParty), lhsCustomsAgentParty, rhsCustomsAgentParty, (this.customsAgentParty!= null), (that.customsAgentParty!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsEstimatedTransitPeriod;
            lhsEstimatedTransitPeriod = this.getEstimatedTransitPeriod();
            PeriodType rhsEstimatedTransitPeriod;
            rhsEstimatedTransitPeriod = that.getEstimatedTransitPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedTransitPeriod", lhsEstimatedTransitPeriod), LocatorUtils.property(thatLocator, "estimatedTransitPeriod", rhsEstimatedTransitPeriod), lhsEstimatedTransitPeriod, rhsEstimatedTransitPeriod, (this.estimatedTransitPeriod!= null), (that.estimatedTransitPeriod!= null))) {
                return false;
            }
        }
        {
            List<AllowanceChargeType> lhsFreightAllowanceCharge;
            lhsFreightAllowanceCharge = (((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty()))?this.getFreightAllowanceCharge():null);
            List<AllowanceChargeType> rhsFreightAllowanceCharge;
            rhsFreightAllowanceCharge = (((that.freightAllowanceCharge!= null)&&(!that.freightAllowanceCharge.isEmpty()))?that.getFreightAllowanceCharge():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightAllowanceCharge", lhsFreightAllowanceCharge), LocatorUtils.property(thatLocator, "freightAllowanceCharge", rhsFreightAllowanceCharge), lhsFreightAllowanceCharge, rhsFreightAllowanceCharge, ((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty())), ((that.freightAllowanceCharge!= null)&&(!that.freightAllowanceCharge.isEmpty())))) {
                return false;
            }
        }
        {
            LocationType lhsFreightChargeLocation;
            lhsFreightChargeLocation = this.getFreightChargeLocation();
            LocationType rhsFreightChargeLocation;
            rhsFreightChargeLocation = that.getFreightChargeLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightChargeLocation", lhsFreightChargeLocation), LocatorUtils.property(thatLocator, "freightChargeLocation", rhsFreightChargeLocation), lhsFreightChargeLocation, rhsFreightChargeLocation, (this.freightChargeLocation!= null), (that.freightChargeLocation!= null))) {
                return false;
            }
        }
        {
            List<TransportEventType> lhsDetentionTransportEvent;
            lhsDetentionTransportEvent = (((this.detentionTransportEvent!= null)&&(!this.detentionTransportEvent.isEmpty()))?this.getDetentionTransportEvent():null);
            List<TransportEventType> rhsDetentionTransportEvent;
            rhsDetentionTransportEvent = (((that.detentionTransportEvent!= null)&&(!that.detentionTransportEvent.isEmpty()))?that.getDetentionTransportEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "detentionTransportEvent", lhsDetentionTransportEvent), LocatorUtils.property(thatLocator, "detentionTransportEvent", rhsDetentionTransportEvent), lhsDetentionTransportEvent, rhsDetentionTransportEvent, ((this.detentionTransportEvent!= null)&&(!this.detentionTransportEvent.isEmpty())), ((that.detentionTransportEvent!= null)&&(!that.detentionTransportEvent.isEmpty())))) {
                return false;
            }
        }
        {
            TransportEventType lhsRequestedDepartureTransportEvent;
            lhsRequestedDepartureTransportEvent = this.getRequestedDepartureTransportEvent();
            TransportEventType rhsRequestedDepartureTransportEvent;
            rhsRequestedDepartureTransportEvent = that.getRequestedDepartureTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedDepartureTransportEvent", lhsRequestedDepartureTransportEvent), LocatorUtils.property(thatLocator, "requestedDepartureTransportEvent", rhsRequestedDepartureTransportEvent), lhsRequestedDepartureTransportEvent, rhsRequestedDepartureTransportEvent, (this.requestedDepartureTransportEvent!= null), (that.requestedDepartureTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsRequestedArrivalTransportEvent;
            lhsRequestedArrivalTransportEvent = this.getRequestedArrivalTransportEvent();
            TransportEventType rhsRequestedArrivalTransportEvent;
            rhsRequestedArrivalTransportEvent = that.getRequestedArrivalTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedArrivalTransportEvent", lhsRequestedArrivalTransportEvent), LocatorUtils.property(thatLocator, "requestedArrivalTransportEvent", rhsRequestedArrivalTransportEvent), lhsRequestedArrivalTransportEvent, rhsRequestedArrivalTransportEvent, (this.requestedArrivalTransportEvent!= null), (that.requestedArrivalTransportEvent!= null))) {
                return false;
            }
        }
        {
            List<TransportEventType> lhsRequestedWaypointTransportEvent;
            lhsRequestedWaypointTransportEvent = (((this.requestedWaypointTransportEvent!= null)&&(!this.requestedWaypointTransportEvent.isEmpty()))?this.getRequestedWaypointTransportEvent():null);
            List<TransportEventType> rhsRequestedWaypointTransportEvent;
            rhsRequestedWaypointTransportEvent = (((that.requestedWaypointTransportEvent!= null)&&(!that.requestedWaypointTransportEvent.isEmpty()))?that.getRequestedWaypointTransportEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedWaypointTransportEvent", lhsRequestedWaypointTransportEvent), LocatorUtils.property(thatLocator, "requestedWaypointTransportEvent", rhsRequestedWaypointTransportEvent), lhsRequestedWaypointTransportEvent, rhsRequestedWaypointTransportEvent, ((this.requestedWaypointTransportEvent!= null)&&(!this.requestedWaypointTransportEvent.isEmpty())), ((that.requestedWaypointTransportEvent!= null)&&(!that.requestedWaypointTransportEvent.isEmpty())))) {
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
        {
            List<TransportEventType> lhsPlannedWaypointTransportEvent;
            lhsPlannedWaypointTransportEvent = (((this.plannedWaypointTransportEvent!= null)&&(!this.plannedWaypointTransportEvent.isEmpty()))?this.getPlannedWaypointTransportEvent():null);
            List<TransportEventType> rhsPlannedWaypointTransportEvent;
            rhsPlannedWaypointTransportEvent = (((that.plannedWaypointTransportEvent!= null)&&(!that.plannedWaypointTransportEvent.isEmpty()))?that.getPlannedWaypointTransportEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plannedWaypointTransportEvent", lhsPlannedWaypointTransportEvent), LocatorUtils.property(thatLocator, "plannedWaypointTransportEvent", rhsPlannedWaypointTransportEvent), lhsPlannedWaypointTransportEvent, rhsPlannedWaypointTransportEvent, ((this.plannedWaypointTransportEvent!= null)&&(!this.plannedWaypointTransportEvent.isEmpty())), ((that.plannedWaypointTransportEvent!= null)&&(!that.plannedWaypointTransportEvent.isEmpty())))) {
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
            TransportEventType lhsActualWaypointTransportEvent;
            lhsActualWaypointTransportEvent = this.getActualWaypointTransportEvent();
            TransportEventType rhsActualWaypointTransportEvent;
            rhsActualWaypointTransportEvent = that.getActualWaypointTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualWaypointTransportEvent", lhsActualWaypointTransportEvent), LocatorUtils.property(thatLocator, "actualWaypointTransportEvent", rhsActualWaypointTransportEvent), lhsActualWaypointTransportEvent, rhsActualWaypointTransportEvent, (this.actualWaypointTransportEvent!= null), (that.actualWaypointTransportEvent!= null))) {
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
            List<TransportEventType> lhsTransportEvent;
            lhsTransportEvent = (((this.transportEvent!= null)&&(!this.transportEvent.isEmpty()))?this.getTransportEvent():null);
            List<TransportEventType> rhsTransportEvent;
            rhsTransportEvent = (((that.transportEvent!= null)&&(!that.transportEvent.isEmpty()))?that.getTransportEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportEvent", lhsTransportEvent), LocatorUtils.property(thatLocator, "transportEvent", rhsTransportEvent), lhsTransportEvent, rhsTransportEvent, ((this.transportEvent!= null)&&(!this.transportEvent.isEmpty())), ((that.transportEvent!= null)&&(!that.transportEvent.isEmpty())))) {
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
            List<PersonType> lhsPassengerPerson;
            lhsPassengerPerson = (((this.passengerPerson!= null)&&(!this.passengerPerson.isEmpty()))?this.getPassengerPerson():null);
            List<PersonType> rhsPassengerPerson;
            rhsPassengerPerson = (((that.passengerPerson!= null)&&(!that.passengerPerson.isEmpty()))?that.getPassengerPerson():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "passengerPerson", lhsPassengerPerson), LocatorUtils.property(thatLocator, "passengerPerson", rhsPassengerPerson), lhsPassengerPerson, rhsPassengerPerson, ((this.passengerPerson!= null)&&(!this.passengerPerson.isEmpty())), ((that.passengerPerson!= null)&&(!that.passengerPerson.isEmpty())))) {
                return false;
            }
        }
        {
            List<PersonType> lhsDriverPerson;
            lhsDriverPerson = (((this.driverPerson!= null)&&(!this.driverPerson.isEmpty()))?this.getDriverPerson():null);
            List<PersonType> rhsDriverPerson;
            rhsDriverPerson = (((that.driverPerson!= null)&&(!that.driverPerson.isEmpty()))?that.getDriverPerson():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "driverPerson", lhsDriverPerson), LocatorUtils.property(thatLocator, "driverPerson", rhsDriverPerson), lhsDriverPerson, rhsDriverPerson, ((this.driverPerson!= null)&&(!this.driverPerson.isEmpty())), ((that.driverPerson!= null)&&(!that.driverPerson.isEmpty())))) {
                return false;
            }
        }
        {
            PersonType lhsReportingPerson;
            lhsReportingPerson = this.getReportingPerson();
            PersonType rhsReportingPerson;
            rhsReportingPerson = that.getReportingPerson();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportingPerson", lhsReportingPerson), LocatorUtils.property(thatLocator, "reportingPerson", rhsReportingPerson), lhsReportingPerson, rhsReportingPerson, (this.reportingPerson!= null), (that.reportingPerson!= null))) {
                return false;
            }
        }
        {
            List<PersonType> lhsCrewMemberPerson;
            lhsCrewMemberPerson = (((this.crewMemberPerson!= null)&&(!this.crewMemberPerson.isEmpty()))?this.getCrewMemberPerson():null);
            List<PersonType> rhsCrewMemberPerson;
            rhsCrewMemberPerson = (((that.crewMemberPerson!= null)&&(!that.crewMemberPerson.isEmpty()))?that.getCrewMemberPerson():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "crewMemberPerson", lhsCrewMemberPerson), LocatorUtils.property(thatLocator, "crewMemberPerson", rhsCrewMemberPerson), lhsCrewMemberPerson, rhsCrewMemberPerson, ((this.crewMemberPerson!= null)&&(!this.crewMemberPerson.isEmpty())), ((that.crewMemberPerson!= null)&&(!that.crewMemberPerson.isEmpty())))) {
                return false;
            }
        }
        {
            PersonType lhsSecurityOfficerPerson;
            lhsSecurityOfficerPerson = this.getSecurityOfficerPerson();
            PersonType rhsSecurityOfficerPerson;
            rhsSecurityOfficerPerson = that.getSecurityOfficerPerson();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "securityOfficerPerson", lhsSecurityOfficerPerson), LocatorUtils.property(thatLocator, "securityOfficerPerson", rhsSecurityOfficerPerson), lhsSecurityOfficerPerson, rhsSecurityOfficerPerson, (this.securityOfficerPerson!= null), (that.securityOfficerPerson!= null))) {
                return false;
            }
        }
        {
            PersonType lhsMasterPerson;
            lhsMasterPerson = this.getMasterPerson();
            PersonType rhsMasterPerson;
            rhsMasterPerson = that.getMasterPerson();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "masterPerson", lhsMasterPerson), LocatorUtils.property(thatLocator, "masterPerson", rhsMasterPerson), lhsMasterPerson, rhsMasterPerson, (this.masterPerson!= null), (that.masterPerson!= null))) {
                return false;
            }
        }
        {
            PersonType lhsShipsSurgeonPerson;
            lhsShipsSurgeonPerson = this.getShipsSurgeonPerson();
            PersonType rhsShipsSurgeonPerson;
            rhsShipsSurgeonPerson = that.getShipsSurgeonPerson();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipsSurgeonPerson", lhsShipsSurgeonPerson), LocatorUtils.property(thatLocator, "shipsSurgeonPerson", rhsShipsSurgeonPerson), lhsShipsSurgeonPerson, rhsShipsSurgeonPerson, (this.shipsSurgeonPerson!= null), (that.shipsSurgeonPerson!= null))) {
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
            TransportModeCodeType theTransportModeCode;
            theTransportModeCode = this.getTransportModeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportModeCode", theTransportModeCode), currentHashCode, theTransportModeCode, (this.transportModeCode!= null));
        }
        {
            TransportMeansTypeCodeType theTransportMeansTypeCode;
            theTransportMeansTypeCode = this.getTransportMeansTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportMeansTypeCode", theTransportMeansTypeCode), currentHashCode, theTransportMeansTypeCode, (this.transportMeansTypeCode!= null));
        }
        {
            TransitDirectionCodeType theTransitDirectionCode;
            theTransitDirectionCode = this.getTransitDirectionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transitDirectionCode", theTransitDirectionCode), currentHashCode, theTransitDirectionCode, (this.transitDirectionCode!= null));
        }
        {
            PreCarriageIndicatorType thePreCarriageIndicator;
            thePreCarriageIndicator = this.getPreCarriageIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preCarriageIndicator", thePreCarriageIndicator), currentHashCode, thePreCarriageIndicator, (this.preCarriageIndicator!= null));
        }
        {
            OnCarriageIndicatorType theOnCarriageIndicator;
            theOnCarriageIndicator = this.getOnCarriageIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "onCarriageIndicator", theOnCarriageIndicator), currentHashCode, theOnCarriageIndicator, (this.onCarriageIndicator!= null));
        }
        {
            EstimatedDeliveryDateType theEstimatedDeliveryDate;
            theEstimatedDeliveryDate = this.getEstimatedDeliveryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedDeliveryDate", theEstimatedDeliveryDate), currentHashCode, theEstimatedDeliveryDate, (this.estimatedDeliveryDate!= null));
        }
        {
            EstimatedDeliveryTimeType theEstimatedDeliveryTime;
            theEstimatedDeliveryTime = this.getEstimatedDeliveryTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedDeliveryTime", theEstimatedDeliveryTime), currentHashCode, theEstimatedDeliveryTime, (this.estimatedDeliveryTime!= null));
        }
        {
            RequiredDeliveryDateType theRequiredDeliveryDate;
            theRequiredDeliveryDate = this.getRequiredDeliveryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requiredDeliveryDate", theRequiredDeliveryDate), currentHashCode, theRequiredDeliveryDate, (this.requiredDeliveryDate!= null));
        }
        {
            RequiredDeliveryTimeType theRequiredDeliveryTime;
            theRequiredDeliveryTime = this.getRequiredDeliveryTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requiredDeliveryTime", theRequiredDeliveryTime), currentHashCode, theRequiredDeliveryTime, (this.requiredDeliveryTime!= null));
        }
        {
            LoadingSequenceIDType theLoadingSequenceID;
            theLoadingSequenceID = this.getLoadingSequenceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loadingSequenceID", theLoadingSequenceID), currentHashCode, theLoadingSequenceID, (this.loadingSequenceID!= null));
        }
        {
            SuccessiveSequenceIDType theSuccessiveSequenceID;
            theSuccessiveSequenceID = this.getSuccessiveSequenceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "successiveSequenceID", theSuccessiveSequenceID), currentHashCode, theSuccessiveSequenceID, (this.successiveSequenceID!= null));
        }
        {
            List<InstructionsType> theInstructions;
            theInstructions = (((this.instructions!= null)&&(!this.instructions.isEmpty()))?this.getInstructions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "instructions", theInstructions), currentHashCode, theInstructions, ((this.instructions!= null)&&(!this.instructions.isEmpty())));
        }
        {
            List<DemurrageInstructionsType> theDemurrageInstructions;
            theDemurrageInstructions = (((this.demurrageInstructions!= null)&&(!this.demurrageInstructions.isEmpty()))?this.getDemurrageInstructions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "demurrageInstructions", theDemurrageInstructions), currentHashCode, theDemurrageInstructions, ((this.demurrageInstructions!= null)&&(!this.demurrageInstructions.isEmpty())));
        }
        {
            CrewQuantityType theCrewQuantity;
            theCrewQuantity = this.getCrewQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "crewQuantity", theCrewQuantity), currentHashCode, theCrewQuantity, (this.crewQuantity!= null));
        }
        {
            PassengerQuantityType thePassengerQuantity;
            thePassengerQuantity = this.getPassengerQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "passengerQuantity", thePassengerQuantity), currentHashCode, thePassengerQuantity, (this.passengerQuantity!= null));
        }
        {
            PeriodType theTransitPeriod;
            theTransitPeriod = this.getTransitPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transitPeriod", theTransitPeriod), currentHashCode, theTransitPeriod, (this.transitPeriod!= null));
        }
        {
            List<PartyType> theCarrierParty;
            theCarrierParty = (((this.carrierParty!= null)&&(!this.carrierParty.isEmpty()))?this.getCarrierParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "carrierParty", theCarrierParty), currentHashCode, theCarrierParty, ((this.carrierParty!= null)&&(!this.carrierParty.isEmpty())));
        }
        {
            TransportMeansType theTransportMeans;
            theTransportMeans = this.getTransportMeans();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportMeans", theTransportMeans), currentHashCode, theTransportMeans, (this.transportMeans!= null));
        }
        {
            LocationType theLoadingPortLocation;
            theLoadingPortLocation = this.getLoadingPortLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loadingPortLocation", theLoadingPortLocation), currentHashCode, theLoadingPortLocation, (this.loadingPortLocation!= null));
        }
        {
            LocationType theUnloadingPortLocation;
            theUnloadingPortLocation = this.getUnloadingPortLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unloadingPortLocation", theUnloadingPortLocation), currentHashCode, theUnloadingPortLocation, (this.unloadingPortLocation!= null));
        }
        {
            LocationType theTransshipPortLocation;
            theTransshipPortLocation = this.getTransshipPortLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transshipPortLocation", theTransshipPortLocation), currentHashCode, theTransshipPortLocation, (this.transshipPortLocation!= null));
        }
        {
            TransportEventType theLoadingTransportEvent;
            theLoadingTransportEvent = this.getLoadingTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loadingTransportEvent", theLoadingTransportEvent), currentHashCode, theLoadingTransportEvent, (this.loadingTransportEvent!= null));
        }
        {
            TransportEventType theExaminationTransportEvent;
            theExaminationTransportEvent = this.getExaminationTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "examinationTransportEvent", theExaminationTransportEvent), currentHashCode, theExaminationTransportEvent, (this.examinationTransportEvent!= null));
        }
        {
            TransportEventType theAvailabilityTransportEvent;
            theAvailabilityTransportEvent = this.getAvailabilityTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "availabilityTransportEvent", theAvailabilityTransportEvent), currentHashCode, theAvailabilityTransportEvent, (this.availabilityTransportEvent!= null));
        }
        {
            TransportEventType theExportationTransportEvent;
            theExportationTransportEvent = this.getExportationTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exportationTransportEvent", theExportationTransportEvent), currentHashCode, theExportationTransportEvent, (this.exportationTransportEvent!= null));
        }
        {
            TransportEventType theDischargeTransportEvent;
            theDischargeTransportEvent = this.getDischargeTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dischargeTransportEvent", theDischargeTransportEvent), currentHashCode, theDischargeTransportEvent, (this.dischargeTransportEvent!= null));
        }
        {
            TransportEventType theWarehousingTransportEvent;
            theWarehousingTransportEvent = this.getWarehousingTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warehousingTransportEvent", theWarehousingTransportEvent), currentHashCode, theWarehousingTransportEvent, (this.warehousingTransportEvent!= null));
        }
        {
            TransportEventType theTakeoverTransportEvent;
            theTakeoverTransportEvent = this.getTakeoverTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "takeoverTransportEvent", theTakeoverTransportEvent), currentHashCode, theTakeoverTransportEvent, (this.takeoverTransportEvent!= null));
        }
        {
            TransportEventType theOptionalTakeoverTransportEvent;
            theOptionalTakeoverTransportEvent = this.getOptionalTakeoverTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "optionalTakeoverTransportEvent", theOptionalTakeoverTransportEvent), currentHashCode, theOptionalTakeoverTransportEvent, (this.optionalTakeoverTransportEvent!= null));
        }
        {
            TransportEventType theDropoffTransportEvent;
            theDropoffTransportEvent = this.getDropoffTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dropoffTransportEvent", theDropoffTransportEvent), currentHashCode, theDropoffTransportEvent, (this.dropoffTransportEvent!= null));
        }
        {
            TransportEventType theActualPickupTransportEvent;
            theActualPickupTransportEvent = this.getActualPickupTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualPickupTransportEvent", theActualPickupTransportEvent), currentHashCode, theActualPickupTransportEvent, (this.actualPickupTransportEvent!= null));
        }
        {
            TransportEventType theDeliveryTransportEvent;
            theDeliveryTransportEvent = this.getDeliveryTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryTransportEvent", theDeliveryTransportEvent), currentHashCode, theDeliveryTransportEvent, (this.deliveryTransportEvent!= null));
        }
        {
            TransportEventType theReceiptTransportEvent;
            theReceiptTransportEvent = this.getReceiptTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receiptTransportEvent", theReceiptTransportEvent), currentHashCode, theReceiptTransportEvent, (this.receiptTransportEvent!= null));
        }
        {
            TransportEventType theStorageTransportEvent;
            theStorageTransportEvent = this.getStorageTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "storageTransportEvent", theStorageTransportEvent), currentHashCode, theStorageTransportEvent, (this.storageTransportEvent!= null));
        }
        {
            TransportEventType theAcceptanceTransportEvent;
            theAcceptanceTransportEvent = this.getAcceptanceTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acceptanceTransportEvent", theAcceptanceTransportEvent), currentHashCode, theAcceptanceTransportEvent, (this.acceptanceTransportEvent!= null));
        }
        {
            PartyType theTerminalOperatorParty;
            theTerminalOperatorParty = this.getTerminalOperatorParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "terminalOperatorParty", theTerminalOperatorParty), currentHashCode, theTerminalOperatorParty, (this.terminalOperatorParty!= null));
        }
        {
            PartyType theCustomsAgentParty;
            theCustomsAgentParty = this.getCustomsAgentParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customsAgentParty", theCustomsAgentParty), currentHashCode, theCustomsAgentParty, (this.customsAgentParty!= null));
        }
        {
            PeriodType theEstimatedTransitPeriod;
            theEstimatedTransitPeriod = this.getEstimatedTransitPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedTransitPeriod", theEstimatedTransitPeriod), currentHashCode, theEstimatedTransitPeriod, (this.estimatedTransitPeriod!= null));
        }
        {
            List<AllowanceChargeType> theFreightAllowanceCharge;
            theFreightAllowanceCharge = (((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty()))?this.getFreightAllowanceCharge():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightAllowanceCharge", theFreightAllowanceCharge), currentHashCode, theFreightAllowanceCharge, ((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty())));
        }
        {
            LocationType theFreightChargeLocation;
            theFreightChargeLocation = this.getFreightChargeLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightChargeLocation", theFreightChargeLocation), currentHashCode, theFreightChargeLocation, (this.freightChargeLocation!= null));
        }
        {
            List<TransportEventType> theDetentionTransportEvent;
            theDetentionTransportEvent = (((this.detentionTransportEvent!= null)&&(!this.detentionTransportEvent.isEmpty()))?this.getDetentionTransportEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "detentionTransportEvent", theDetentionTransportEvent), currentHashCode, theDetentionTransportEvent, ((this.detentionTransportEvent!= null)&&(!this.detentionTransportEvent.isEmpty())));
        }
        {
            TransportEventType theRequestedDepartureTransportEvent;
            theRequestedDepartureTransportEvent = this.getRequestedDepartureTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedDepartureTransportEvent", theRequestedDepartureTransportEvent), currentHashCode, theRequestedDepartureTransportEvent, (this.requestedDepartureTransportEvent!= null));
        }
        {
            TransportEventType theRequestedArrivalTransportEvent;
            theRequestedArrivalTransportEvent = this.getRequestedArrivalTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedArrivalTransportEvent", theRequestedArrivalTransportEvent), currentHashCode, theRequestedArrivalTransportEvent, (this.requestedArrivalTransportEvent!= null));
        }
        {
            List<TransportEventType> theRequestedWaypointTransportEvent;
            theRequestedWaypointTransportEvent = (((this.requestedWaypointTransportEvent!= null)&&(!this.requestedWaypointTransportEvent.isEmpty()))?this.getRequestedWaypointTransportEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedWaypointTransportEvent", theRequestedWaypointTransportEvent), currentHashCode, theRequestedWaypointTransportEvent, ((this.requestedWaypointTransportEvent!= null)&&(!this.requestedWaypointTransportEvent.isEmpty())));
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
        {
            List<TransportEventType> thePlannedWaypointTransportEvent;
            thePlannedWaypointTransportEvent = (((this.plannedWaypointTransportEvent!= null)&&(!this.plannedWaypointTransportEvent.isEmpty()))?this.getPlannedWaypointTransportEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "plannedWaypointTransportEvent", thePlannedWaypointTransportEvent), currentHashCode, thePlannedWaypointTransportEvent, ((this.plannedWaypointTransportEvent!= null)&&(!this.plannedWaypointTransportEvent.isEmpty())));
        }
        {
            TransportEventType theActualDepartureTransportEvent;
            theActualDepartureTransportEvent = this.getActualDepartureTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualDepartureTransportEvent", theActualDepartureTransportEvent), currentHashCode, theActualDepartureTransportEvent, (this.actualDepartureTransportEvent!= null));
        }
        {
            TransportEventType theActualWaypointTransportEvent;
            theActualWaypointTransportEvent = this.getActualWaypointTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualWaypointTransportEvent", theActualWaypointTransportEvent), currentHashCode, theActualWaypointTransportEvent, (this.actualWaypointTransportEvent!= null));
        }
        {
            TransportEventType theActualArrivalTransportEvent;
            theActualArrivalTransportEvent = this.getActualArrivalTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualArrivalTransportEvent", theActualArrivalTransportEvent), currentHashCode, theActualArrivalTransportEvent, (this.actualArrivalTransportEvent!= null));
        }
        {
            List<TransportEventType> theTransportEvent;
            theTransportEvent = (((this.transportEvent!= null)&&(!this.transportEvent.isEmpty()))?this.getTransportEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportEvent", theTransportEvent), currentHashCode, theTransportEvent, ((this.transportEvent!= null)&&(!this.transportEvent.isEmpty())));
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
            List<PersonType> thePassengerPerson;
            thePassengerPerson = (((this.passengerPerson!= null)&&(!this.passengerPerson.isEmpty()))?this.getPassengerPerson():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "passengerPerson", thePassengerPerson), currentHashCode, thePassengerPerson, ((this.passengerPerson!= null)&&(!this.passengerPerson.isEmpty())));
        }
        {
            List<PersonType> theDriverPerson;
            theDriverPerson = (((this.driverPerson!= null)&&(!this.driverPerson.isEmpty()))?this.getDriverPerson():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "driverPerson", theDriverPerson), currentHashCode, theDriverPerson, ((this.driverPerson!= null)&&(!this.driverPerson.isEmpty())));
        }
        {
            PersonType theReportingPerson;
            theReportingPerson = this.getReportingPerson();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportingPerson", theReportingPerson), currentHashCode, theReportingPerson, (this.reportingPerson!= null));
        }
        {
            List<PersonType> theCrewMemberPerson;
            theCrewMemberPerson = (((this.crewMemberPerson!= null)&&(!this.crewMemberPerson.isEmpty()))?this.getCrewMemberPerson():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "crewMemberPerson", theCrewMemberPerson), currentHashCode, theCrewMemberPerson, ((this.crewMemberPerson!= null)&&(!this.crewMemberPerson.isEmpty())));
        }
        {
            PersonType theSecurityOfficerPerson;
            theSecurityOfficerPerson = this.getSecurityOfficerPerson();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "securityOfficerPerson", theSecurityOfficerPerson), currentHashCode, theSecurityOfficerPerson, (this.securityOfficerPerson!= null));
        }
        {
            PersonType theMasterPerson;
            theMasterPerson = this.getMasterPerson();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "masterPerson", theMasterPerson), currentHashCode, theMasterPerson, (this.masterPerson!= null));
        }
        {
            PersonType theShipsSurgeonPerson;
            theShipsSurgeonPerson = this.getShipsSurgeonPerson();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipsSurgeonPerson", theShipsSurgeonPerson), currentHashCode, theShipsSurgeonPerson, (this.shipsSurgeonPerson!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
