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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AirFlowPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AnimalFoodApprovedIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CharacteristicsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DamageRemarksType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DangerousGoodsApprovedIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DispositionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FullnessIndicationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GrossVolumeMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GrossWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HumanFoodApprovedIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HumidityPercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InformationType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LegalStatusIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OwnerTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PowerIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProviderTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReferencedConsignmentIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RefrigeratedIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RefrigerationOnIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReturnabilityIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SizeTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SpecialTransportRequirementsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TareWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TraceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TrackingDeviceCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportEquipmentTypeCodeType;
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
 * <p>Classe Java per TransportEquipmentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransportEquipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferencedConsignmentID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportEquipmentTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProviderTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OwnerTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SizeTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DispositionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FullnessIndicationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RefrigerationOnIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Information" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReturnabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LegalStatusIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AirFlowPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HumidityPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AnimalFoodApprovedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HumanFoodApprovedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DangerousGoodsApprovedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RefrigeratedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Characteristics" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DamageRemarks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialTransportRequirements" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TareWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TrackingDeviceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PowerIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TraceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEquipmentSeal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MinimumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaximumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProviderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LoadingProofParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OwnerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OperatingParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LoadingLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UnloadingLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}StorageLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PositioningTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}QuarantineTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PickupTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HandlingTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LoadingTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ApplicableTransportMeans" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HaulageTradingTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HazardousGoodsTransit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PackagedTransportHandlingUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ServiceAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AttachedTransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Pickup" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Despatch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipmentDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContainedInTransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Package" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GoodsItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}VerifiedGrossMass" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportEquipmentType", propOrder = {
    "id",
    "referencedConsignmentID",
    "transportEquipmentTypeCode",
    "providerTypeCode",
    "ownerTypeCode",
    "sizeTypeCode",
    "dispositionCode",
    "fullnessIndicationCode",
    "refrigerationOnIndicator",
    "information",
    "returnabilityIndicator",
    "legalStatusIndicator",
    "airFlowPercent",
    "humidityPercent",
    "animalFoodApprovedIndicator",
    "humanFoodApprovedIndicator",
    "dangerousGoodsApprovedIndicator",
    "refrigeratedIndicator",
    "characteristics",
    "damageRemarks",
    "description",
    "specialTransportRequirements",
    "grossWeightMeasure",
    "grossVolumeMeasure",
    "tareWeightMeasure",
    "trackingDeviceCode",
    "powerIndicator",
    "traceID",
    "measurementDimension",
    "transportEquipmentSeal",
    "minimumTemperature",
    "maximumTemperature",
    "providerParty",
    "loadingProofParty",
    "supplierParty",
    "ownerParty",
    "operatingParty",
    "loadingLocation",
    "unloadingLocation",
    "storageLocation",
    "positioningTransportEvent",
    "quarantineTransportEvent",
    "deliveryTransportEvent",
    "pickupTransportEvent",
    "handlingTransportEvent",
    "loadingTransportEvent",
    "transportEvent",
    "applicableTransportMeans",
    "haulageTradingTerms",
    "hazardousGoodsTransit",
    "packagedTransportHandlingUnit",
    "serviceAllowanceCharge",
    "freightAllowanceCharge",
    "attachedTransportEquipment",
    "delivery",
    "pickup",
    "despatch",
    "shipmentDocumentReference",
    "containedInTransportEquipment",
    "_package",
    "goodsItem",
    "verifiedGrossMass"
})
public class TransportEquipmentType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "ReferencedConsignmentID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ReferencedConsignmentIDType> referencedConsignmentID;
    @XmlElement(name = "TransportEquipmentTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportEquipmentTypeCodeType transportEquipmentTypeCode;
    @XmlElement(name = "ProviderTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProviderTypeCodeType providerTypeCode;
    @XmlElement(name = "OwnerTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OwnerTypeCodeType ownerTypeCode;
    @XmlElement(name = "SizeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SizeTypeCodeType sizeTypeCode;
    @XmlElement(name = "DispositionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DispositionCodeType dispositionCode;
    @XmlElement(name = "FullnessIndicationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FullnessIndicationCodeType fullnessIndicationCode;
    @XmlElement(name = "RefrigerationOnIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RefrigerationOnIndicatorType refrigerationOnIndicator;
    @XmlElement(name = "Information", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<InformationType> information;
    @XmlElement(name = "ReturnabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReturnabilityIndicatorType returnabilityIndicator;
    @XmlElement(name = "LegalStatusIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LegalStatusIndicatorType legalStatusIndicator;
    @XmlElement(name = "AirFlowPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AirFlowPercentType airFlowPercent;
    @XmlElement(name = "HumidityPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HumidityPercentType humidityPercent;
    @XmlElement(name = "AnimalFoodApprovedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AnimalFoodApprovedIndicatorType animalFoodApprovedIndicator;
    @XmlElement(name = "HumanFoodApprovedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HumanFoodApprovedIndicatorType humanFoodApprovedIndicator;
    @XmlElement(name = "DangerousGoodsApprovedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DangerousGoodsApprovedIndicatorType dangerousGoodsApprovedIndicator;
    @XmlElement(name = "RefrigeratedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RefrigeratedIndicatorType refrigeratedIndicator;
    @XmlElement(name = "Characteristics", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CharacteristicsType characteristics;
    @XmlElement(name = "DamageRemarks", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DamageRemarksType> damageRemarks;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "SpecialTransportRequirements", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<SpecialTransportRequirementsType> specialTransportRequirements;
    @XmlElement(name = "GrossWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GrossWeightMeasureType grossWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GrossVolumeMeasureType grossVolumeMeasure;
    @XmlElement(name = "TareWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TareWeightMeasureType tareWeightMeasure;
    @XmlElement(name = "TrackingDeviceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TrackingDeviceCodeType trackingDeviceCode;
    @XmlElement(name = "PowerIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PowerIndicatorType powerIndicator;
    @XmlElement(name = "TraceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TraceIDType traceID;
    @XmlElement(name = "MeasurementDimension")
    protected List<DimensionType> measurementDimension;
    @XmlElement(name = "TransportEquipmentSeal")
    protected List<TransportEquipmentSealType> transportEquipmentSeal;
    @XmlElement(name = "MinimumTemperature")
    protected TemperatureType minimumTemperature;
    @XmlElement(name = "MaximumTemperature")
    protected TemperatureType maximumTemperature;
    @XmlElement(name = "ProviderParty")
    protected PartyType providerParty;
    @XmlElement(name = "LoadingProofParty")
    protected PartyType loadingProofParty;
    @XmlElement(name = "SupplierParty")
    protected SupplierPartyType supplierParty;
    @XmlElement(name = "OwnerParty")
    protected PartyType ownerParty;
    @XmlElement(name = "OperatingParty")
    protected PartyType operatingParty;
    @XmlElement(name = "LoadingLocation")
    protected LocationType loadingLocation;
    @XmlElement(name = "UnloadingLocation")
    protected LocationType unloadingLocation;
    @XmlElement(name = "StorageLocation")
    protected LocationType storageLocation;
    @XmlElement(name = "PositioningTransportEvent")
    protected List<TransportEventType> positioningTransportEvent;
    @XmlElement(name = "QuarantineTransportEvent")
    protected List<TransportEventType> quarantineTransportEvent;
    @XmlElement(name = "DeliveryTransportEvent")
    protected List<TransportEventType> deliveryTransportEvent;
    @XmlElement(name = "PickupTransportEvent")
    protected List<TransportEventType> pickupTransportEvent;
    @XmlElement(name = "HandlingTransportEvent")
    protected List<TransportEventType> handlingTransportEvent;
    @XmlElement(name = "LoadingTransportEvent")
    protected List<TransportEventType> loadingTransportEvent;
    @XmlElement(name = "TransportEvent")
    protected List<TransportEventType> transportEvent;
    @XmlElement(name = "ApplicableTransportMeans")
    protected TransportMeansType applicableTransportMeans;
    @XmlElement(name = "HaulageTradingTerms")
    protected List<TradingTermsType> haulageTradingTerms;
    @XmlElement(name = "HazardousGoodsTransit")
    protected List<HazardousGoodsTransitType> hazardousGoodsTransit;
    @XmlElement(name = "PackagedTransportHandlingUnit")
    protected List<TransportHandlingUnitType> packagedTransportHandlingUnit;
    @XmlElement(name = "ServiceAllowanceCharge")
    protected List<AllowanceChargeType> serviceAllowanceCharge;
    @XmlElement(name = "FreightAllowanceCharge")
    protected List<AllowanceChargeType> freightAllowanceCharge;
    @XmlElement(name = "AttachedTransportEquipment")
    protected List<TransportEquipmentType> attachedTransportEquipment;
    @XmlElement(name = "Delivery")
    protected DeliveryType delivery;
    @XmlElement(name = "Pickup")
    protected PickupType pickup;
    @XmlElement(name = "Despatch")
    protected DespatchType despatch;
    @XmlElement(name = "ShipmentDocumentReference")
    protected List<DocumentReferenceType> shipmentDocumentReference;
    @XmlElement(name = "ContainedInTransportEquipment")
    protected List<TransportEquipmentType> containedInTransportEquipment;
    @XmlElement(name = "Package")
    protected List<PackageType> _package;
    @XmlElement(name = "GoodsItem")
    protected List<GoodsItemType> goodsItem;
    @XmlElement(name = "VerifiedGrossMass")
    protected VerifiedGrossMassType verifiedGrossMass;

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
     * Gets the value of the referencedConsignmentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedConsignmentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedConsignmentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencedConsignmentIDType }
     * 
     * 
     */
    public List<ReferencedConsignmentIDType> getReferencedConsignmentID() {
        if (referencedConsignmentID == null) {
            referencedConsignmentID = new ArrayList<ReferencedConsignmentIDType>();
        }
        return this.referencedConsignmentID;
    }

    /**
     * Recupera il valore della proprietà transportEquipmentTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportEquipmentTypeCodeType }
     *     
     */
    public TransportEquipmentTypeCodeType getTransportEquipmentTypeCode() {
        return transportEquipmentTypeCode;
    }

    /**
     * Imposta il valore della proprietà transportEquipmentTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEquipmentTypeCodeType }
     *     
     */
    public void setTransportEquipmentTypeCode(TransportEquipmentTypeCodeType value) {
        this.transportEquipmentTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà providerTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ProviderTypeCodeType }
     *     
     */
    public ProviderTypeCodeType getProviderTypeCode() {
        return providerTypeCode;
    }

    /**
     * Imposta il valore della proprietà providerTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderTypeCodeType }
     *     
     */
    public void setProviderTypeCode(ProviderTypeCodeType value) {
        this.providerTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà ownerTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link OwnerTypeCodeType }
     *     
     */
    public OwnerTypeCodeType getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * Imposta il valore della proprietà ownerTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerTypeCodeType }
     *     
     */
    public void setOwnerTypeCode(OwnerTypeCodeType value) {
        this.ownerTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà sizeTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link SizeTypeCodeType }
     *     
     */
    public SizeTypeCodeType getSizeTypeCode() {
        return sizeTypeCode;
    }

    /**
     * Imposta il valore della proprietà sizeTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeTypeCodeType }
     *     
     */
    public void setSizeTypeCode(SizeTypeCodeType value) {
        this.sizeTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà dispositionCode.
     * 
     * @return
     *     possible object is
     *     {@link DispositionCodeType }
     *     
     */
    public DispositionCodeType getDispositionCode() {
        return dispositionCode;
    }

    /**
     * Imposta il valore della proprietà dispositionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DispositionCodeType }
     *     
     */
    public void setDispositionCode(DispositionCodeType value) {
        this.dispositionCode = value;
    }

    /**
     * Recupera il valore della proprietà fullnessIndicationCode.
     * 
     * @return
     *     possible object is
     *     {@link FullnessIndicationCodeType }
     *     
     */
    public FullnessIndicationCodeType getFullnessIndicationCode() {
        return fullnessIndicationCode;
    }

    /**
     * Imposta il valore della proprietà fullnessIndicationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FullnessIndicationCodeType }
     *     
     */
    public void setFullnessIndicationCode(FullnessIndicationCodeType value) {
        this.fullnessIndicationCode = value;
    }

    /**
     * Recupera il valore della proprietà refrigerationOnIndicator.
     * 
     * @return
     *     possible object is
     *     {@link RefrigerationOnIndicatorType }
     *     
     */
    public RefrigerationOnIndicatorType getRefrigerationOnIndicator() {
        return refrigerationOnIndicator;
    }

    /**
     * Imposta il valore della proprietà refrigerationOnIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link RefrigerationOnIndicatorType }
     *     
     */
    public void setRefrigerationOnIndicator(RefrigerationOnIndicatorType value) {
        this.refrigerationOnIndicator = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the information property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationType }
     * 
     * 
     */
    public List<InformationType> getInformation() {
        if (information == null) {
            information = new ArrayList<InformationType>();
        }
        return this.information;
    }

    /**
     * Recupera il valore della proprietà returnabilityIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ReturnabilityIndicatorType }
     *     
     */
    public ReturnabilityIndicatorType getReturnabilityIndicator() {
        return returnabilityIndicator;
    }

    /**
     * Imposta il valore della proprietà returnabilityIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnabilityIndicatorType }
     *     
     */
    public void setReturnabilityIndicator(ReturnabilityIndicatorType value) {
        this.returnabilityIndicator = value;
    }

    /**
     * Recupera il valore della proprietà legalStatusIndicator.
     * 
     * @return
     *     possible object is
     *     {@link LegalStatusIndicatorType }
     *     
     */
    public LegalStatusIndicatorType getLegalStatusIndicator() {
        return legalStatusIndicator;
    }

    /**
     * Imposta il valore della proprietà legalStatusIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalStatusIndicatorType }
     *     
     */
    public void setLegalStatusIndicator(LegalStatusIndicatorType value) {
        this.legalStatusIndicator = value;
    }

    /**
     * Recupera il valore della proprietà airFlowPercent.
     * 
     * @return
     *     possible object is
     *     {@link AirFlowPercentType }
     *     
     */
    public AirFlowPercentType getAirFlowPercent() {
        return airFlowPercent;
    }

    /**
     * Imposta il valore della proprietà airFlowPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFlowPercentType }
     *     
     */
    public void setAirFlowPercent(AirFlowPercentType value) {
        this.airFlowPercent = value;
    }

    /**
     * Recupera il valore della proprietà humidityPercent.
     * 
     * @return
     *     possible object is
     *     {@link HumidityPercentType }
     *     
     */
    public HumidityPercentType getHumidityPercent() {
        return humidityPercent;
    }

    /**
     * Imposta il valore della proprietà humidityPercent.
     * 
     * @param value
     *     allowed object is
     *     {@link HumidityPercentType }
     *     
     */
    public void setHumidityPercent(HumidityPercentType value) {
        this.humidityPercent = value;
    }

    /**
     * Recupera il valore della proprietà animalFoodApprovedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link AnimalFoodApprovedIndicatorType }
     *     
     */
    public AnimalFoodApprovedIndicatorType getAnimalFoodApprovedIndicator() {
        return animalFoodApprovedIndicator;
    }

    /**
     * Imposta il valore della proprietà animalFoodApprovedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalFoodApprovedIndicatorType }
     *     
     */
    public void setAnimalFoodApprovedIndicator(AnimalFoodApprovedIndicatorType value) {
        this.animalFoodApprovedIndicator = value;
    }

    /**
     * Recupera il valore della proprietà humanFoodApprovedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link HumanFoodApprovedIndicatorType }
     *     
     */
    public HumanFoodApprovedIndicatorType getHumanFoodApprovedIndicator() {
        return humanFoodApprovedIndicator;
    }

    /**
     * Imposta il valore della proprietà humanFoodApprovedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanFoodApprovedIndicatorType }
     *     
     */
    public void setHumanFoodApprovedIndicator(HumanFoodApprovedIndicatorType value) {
        this.humanFoodApprovedIndicator = value;
    }

    /**
     * Recupera il valore della proprietà dangerousGoodsApprovedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsApprovedIndicatorType }
     *     
     */
    public DangerousGoodsApprovedIndicatorType getDangerousGoodsApprovedIndicator() {
        return dangerousGoodsApprovedIndicator;
    }

    /**
     * Imposta il valore della proprietà dangerousGoodsApprovedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsApprovedIndicatorType }
     *     
     */
    public void setDangerousGoodsApprovedIndicator(DangerousGoodsApprovedIndicatorType value) {
        this.dangerousGoodsApprovedIndicator = value;
    }

    /**
     * Recupera il valore della proprietà refrigeratedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link RefrigeratedIndicatorType }
     *     
     */
    public RefrigeratedIndicatorType getRefrigeratedIndicator() {
        return refrigeratedIndicator;
    }

    /**
     * Imposta il valore della proprietà refrigeratedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link RefrigeratedIndicatorType }
     *     
     */
    public void setRefrigeratedIndicator(RefrigeratedIndicatorType value) {
        this.refrigeratedIndicator = value;
    }

    /**
     * Recupera il valore della proprietà characteristics.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsType }
     *     
     */
    public CharacteristicsType getCharacteristics() {
        return characteristics;
    }

    /**
     * Imposta il valore della proprietà characteristics.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsType }
     *     
     */
    public void setCharacteristics(CharacteristicsType value) {
        this.characteristics = value;
    }

    /**
     * Gets the value of the damageRemarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the damageRemarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDamageRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DamageRemarksType }
     * 
     * 
     */
    public List<DamageRemarksType> getDamageRemarks() {
        if (damageRemarks == null) {
            damageRemarks = new ArrayList<DamageRemarksType>();
        }
        return this.damageRemarks;
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
     * Gets the value of the specialTransportRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialTransportRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialTransportRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialTransportRequirementsType }
     * 
     * 
     */
    public List<SpecialTransportRequirementsType> getSpecialTransportRequirements() {
        if (specialTransportRequirements == null) {
            specialTransportRequirements = new ArrayList<SpecialTransportRequirementsType>();
        }
        return this.specialTransportRequirements;
    }

    /**
     * Recupera il valore della proprietà grossWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link GrossWeightMeasureType }
     *     
     */
    public GrossWeightMeasureType getGrossWeightMeasure() {
        return grossWeightMeasure;
    }

    /**
     * Imposta il valore della proprietà grossWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossWeightMeasureType }
     *     
     */
    public void setGrossWeightMeasure(GrossWeightMeasureType value) {
        this.grossWeightMeasure = value;
    }

    /**
     * Recupera il valore della proprietà grossVolumeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link GrossVolumeMeasureType }
     *     
     */
    public GrossVolumeMeasureType getGrossVolumeMeasure() {
        return grossVolumeMeasure;
    }

    /**
     * Imposta il valore della proprietà grossVolumeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossVolumeMeasureType }
     *     
     */
    public void setGrossVolumeMeasure(GrossVolumeMeasureType value) {
        this.grossVolumeMeasure = value;
    }

    /**
     * Recupera il valore della proprietà tareWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link TareWeightMeasureType }
     *     
     */
    public TareWeightMeasureType getTareWeightMeasure() {
        return tareWeightMeasure;
    }

    /**
     * Imposta il valore della proprietà tareWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link TareWeightMeasureType }
     *     
     */
    public void setTareWeightMeasure(TareWeightMeasureType value) {
        this.tareWeightMeasure = value;
    }

    /**
     * Recupera il valore della proprietà trackingDeviceCode.
     * 
     * @return
     *     possible object is
     *     {@link TrackingDeviceCodeType }
     *     
     */
    public TrackingDeviceCodeType getTrackingDeviceCode() {
        return trackingDeviceCode;
    }

    /**
     * Imposta il valore della proprietà trackingDeviceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingDeviceCodeType }
     *     
     */
    public void setTrackingDeviceCode(TrackingDeviceCodeType value) {
        this.trackingDeviceCode = value;
    }

    /**
     * Recupera il valore della proprietà powerIndicator.
     * 
     * @return
     *     possible object is
     *     {@link PowerIndicatorType }
     *     
     */
    public PowerIndicatorType getPowerIndicator() {
        return powerIndicator;
    }

    /**
     * Imposta il valore della proprietà powerIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerIndicatorType }
     *     
     */
    public void setPowerIndicator(PowerIndicatorType value) {
        this.powerIndicator = value;
    }

    /**
     * Recupera il valore della proprietà traceID.
     * 
     * @return
     *     possible object is
     *     {@link TraceIDType }
     *     
     */
    public TraceIDType getTraceID() {
        return traceID;
    }

    /**
     * Imposta il valore della proprietà traceID.
     * 
     * @param value
     *     allowed object is
     *     {@link TraceIDType }
     *     
     */
    public void setTraceID(TraceIDType value) {
        this.traceID = value;
    }

    /**
     * Gets the value of the measurementDimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementDimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionType }
     * 
     * 
     */
    public List<DimensionType> getMeasurementDimension() {
        if (measurementDimension == null) {
            measurementDimension = new ArrayList<DimensionType>();
        }
        return this.measurementDimension;
    }

    /**
     * Gets the value of the transportEquipmentSeal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportEquipmentSeal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportEquipmentSeal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentSealType }
     * 
     * 
     */
    public List<TransportEquipmentSealType> getTransportEquipmentSeal() {
        if (transportEquipmentSeal == null) {
            transportEquipmentSeal = new ArrayList<TransportEquipmentSealType>();
        }
        return this.transportEquipmentSeal;
    }

    /**
     * Recupera il valore della proprietà minimumTemperature.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Imposta il valore della proprietà minimumTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setMinimumTemperature(TemperatureType value) {
        this.minimumTemperature = value;
    }

    /**
     * Recupera il valore della proprietà maximumTemperature.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Imposta il valore della proprietà maximumTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setMaximumTemperature(TemperatureType value) {
        this.maximumTemperature = value;
    }

    /**
     * Recupera il valore della proprietà providerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getProviderParty() {
        return providerParty;
    }

    /**
     * Imposta il valore della proprietà providerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setProviderParty(PartyType value) {
        this.providerParty = value;
    }

    /**
     * Recupera il valore della proprietà loadingProofParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getLoadingProofParty() {
        return loadingProofParty;
    }

    /**
     * Imposta il valore della proprietà loadingProofParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setLoadingProofParty(PartyType value) {
        this.loadingProofParty = value;
    }

    /**
     * Recupera il valore della proprietà supplierParty.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getSupplierParty() {
        return supplierParty;
    }

    /**
     * Imposta il valore della proprietà supplierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setSupplierParty(SupplierPartyType value) {
        this.supplierParty = value;
    }

    /**
     * Recupera il valore della proprietà ownerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getOwnerParty() {
        return ownerParty;
    }

    /**
     * Imposta il valore della proprietà ownerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setOwnerParty(PartyType value) {
        this.ownerParty = value;
    }

    /**
     * Recupera il valore della proprietà operatingParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getOperatingParty() {
        return operatingParty;
    }

    /**
     * Imposta il valore della proprietà operatingParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setOperatingParty(PartyType value) {
        this.operatingParty = value;
    }

    /**
     * Recupera il valore della proprietà loadingLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLoadingLocation() {
        return loadingLocation;
    }

    /**
     * Imposta il valore della proprietà loadingLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLoadingLocation(LocationType value) {
        this.loadingLocation = value;
    }

    /**
     * Recupera il valore della proprietà unloadingLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getUnloadingLocation() {
        return unloadingLocation;
    }

    /**
     * Imposta il valore della proprietà unloadingLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setUnloadingLocation(LocationType value) {
        this.unloadingLocation = value;
    }

    /**
     * Recupera il valore della proprietà storageLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getStorageLocation() {
        return storageLocation;
    }

    /**
     * Imposta il valore della proprietà storageLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setStorageLocation(LocationType value) {
        this.storageLocation = value;
    }

    /**
     * Gets the value of the positioningTransportEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positioningTransportEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositioningTransportEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getPositioningTransportEvent() {
        if (positioningTransportEvent == null) {
            positioningTransportEvent = new ArrayList<TransportEventType>();
        }
        return this.positioningTransportEvent;
    }

    /**
     * Gets the value of the quarantineTransportEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quarantineTransportEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuarantineTransportEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getQuarantineTransportEvent() {
        if (quarantineTransportEvent == null) {
            quarantineTransportEvent = new ArrayList<TransportEventType>();
        }
        return this.quarantineTransportEvent;
    }

    /**
     * Gets the value of the deliveryTransportEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryTransportEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryTransportEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getDeliveryTransportEvent() {
        if (deliveryTransportEvent == null) {
            deliveryTransportEvent = new ArrayList<TransportEventType>();
        }
        return this.deliveryTransportEvent;
    }

    /**
     * Gets the value of the pickupTransportEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickupTransportEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickupTransportEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getPickupTransportEvent() {
        if (pickupTransportEvent == null) {
            pickupTransportEvent = new ArrayList<TransportEventType>();
        }
        return this.pickupTransportEvent;
    }

    /**
     * Gets the value of the handlingTransportEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingTransportEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingTransportEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getHandlingTransportEvent() {
        if (handlingTransportEvent == null) {
            handlingTransportEvent = new ArrayList<TransportEventType>();
        }
        return this.handlingTransportEvent;
    }

    /**
     * Gets the value of the loadingTransportEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loadingTransportEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadingTransportEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getLoadingTransportEvent() {
        if (loadingTransportEvent == null) {
            loadingTransportEvent = new ArrayList<TransportEventType>();
        }
        return this.loadingTransportEvent;
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
     * Recupera il valore della proprietà applicableTransportMeans.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansType }
     *     
     */
    public TransportMeansType getApplicableTransportMeans() {
        return applicableTransportMeans;
    }

    /**
     * Imposta il valore della proprietà applicableTransportMeans.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansType }
     *     
     */
    public void setApplicableTransportMeans(TransportMeansType value) {
        this.applicableTransportMeans = value;
    }

    /**
     * Gets the value of the haulageTradingTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the haulageTradingTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHaulageTradingTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingTermsType }
     * 
     * 
     */
    public List<TradingTermsType> getHaulageTradingTerms() {
        if (haulageTradingTerms == null) {
            haulageTradingTerms = new ArrayList<TradingTermsType>();
        }
        return this.haulageTradingTerms;
    }

    /**
     * Gets the value of the hazardousGoodsTransit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousGoodsTransit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousGoodsTransit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousGoodsTransitType }
     * 
     * 
     */
    public List<HazardousGoodsTransitType> getHazardousGoodsTransit() {
        if (hazardousGoodsTransit == null) {
            hazardousGoodsTransit = new ArrayList<HazardousGoodsTransitType>();
        }
        return this.hazardousGoodsTransit;
    }

    /**
     * Gets the value of the packagedTransportHandlingUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagedTransportHandlingUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagedTransportHandlingUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportHandlingUnitType }
     * 
     * 
     */
    public List<TransportHandlingUnitType> getPackagedTransportHandlingUnit() {
        if (packagedTransportHandlingUnit == null) {
            packagedTransportHandlingUnit = new ArrayList<TransportHandlingUnitType>();
        }
        return this.packagedTransportHandlingUnit;
    }

    /**
     * Gets the value of the serviceAllowanceCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceAllowanceCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceAllowanceCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getServiceAllowanceCharge() {
        if (serviceAllowanceCharge == null) {
            serviceAllowanceCharge = new ArrayList<AllowanceChargeType>();
        }
        return this.serviceAllowanceCharge;
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
     * Gets the value of the attachedTransportEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedTransportEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedTransportEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getAttachedTransportEquipment() {
        if (attachedTransportEquipment == null) {
            attachedTransportEquipment = new ArrayList<TransportEquipmentType>();
        }
        return this.attachedTransportEquipment;
    }

    /**
     * Recupera il valore della proprietà delivery.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryType }
     *     
     */
    public DeliveryType getDelivery() {
        return delivery;
    }

    /**
     * Imposta il valore della proprietà delivery.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryType }
     *     
     */
    public void setDelivery(DeliveryType value) {
        this.delivery = value;
    }

    /**
     * Recupera il valore della proprietà pickup.
     * 
     * @return
     *     possible object is
     *     {@link PickupType }
     *     
     */
    public PickupType getPickup() {
        return pickup;
    }

    /**
     * Imposta il valore della proprietà pickup.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupType }
     *     
     */
    public void setPickup(PickupType value) {
        this.pickup = value;
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
     * Gets the value of the shipmentDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getShipmentDocumentReference() {
        if (shipmentDocumentReference == null) {
            shipmentDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.shipmentDocumentReference;
    }

    /**
     * Gets the value of the containedInTransportEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containedInTransportEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainedInTransportEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getContainedInTransportEquipment() {
        if (containedInTransportEquipment == null) {
            containedInTransportEquipment = new ArrayList<TransportEquipmentType>();
        }
        return this.containedInTransportEquipment;
    }

    /**
     * Gets the value of the package property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the package property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getPackage() {
        if (_package == null) {
            _package = new ArrayList<PackageType>();
        }
        return this._package;
    }

    /**
     * Gets the value of the goodsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsItemType }
     * 
     * 
     */
    public List<GoodsItemType> getGoodsItem() {
        if (goodsItem == null) {
            goodsItem = new ArrayList<GoodsItemType>();
        }
        return this.goodsItem;
    }

    /**
     * Recupera il valore della proprietà verifiedGrossMass.
     * 
     * @return
     *     possible object is
     *     {@link VerifiedGrossMassType }
     *     
     */
    public VerifiedGrossMassType getVerifiedGrossMass() {
        return verifiedGrossMass;
    }

    /**
     * Imposta il valore della proprietà verifiedGrossMass.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifiedGrossMassType }
     *     
     */
    public void setVerifiedGrossMass(VerifiedGrossMassType value) {
        this.verifiedGrossMass = value;
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
            List<ReferencedConsignmentIDType> theReferencedConsignmentID;
            theReferencedConsignmentID = (((this.referencedConsignmentID!= null)&&(!this.referencedConsignmentID.isEmpty()))?this.getReferencedConsignmentID():null);
            strategy.appendField(locator, this, "referencedConsignmentID", buffer, theReferencedConsignmentID, ((this.referencedConsignmentID!= null)&&(!this.referencedConsignmentID.isEmpty())));
        }
        {
            TransportEquipmentTypeCodeType theTransportEquipmentTypeCode;
            theTransportEquipmentTypeCode = this.getTransportEquipmentTypeCode();
            strategy.appendField(locator, this, "transportEquipmentTypeCode", buffer, theTransportEquipmentTypeCode, (this.transportEquipmentTypeCode!= null));
        }
        {
            ProviderTypeCodeType theProviderTypeCode;
            theProviderTypeCode = this.getProviderTypeCode();
            strategy.appendField(locator, this, "providerTypeCode", buffer, theProviderTypeCode, (this.providerTypeCode!= null));
        }
        {
            OwnerTypeCodeType theOwnerTypeCode;
            theOwnerTypeCode = this.getOwnerTypeCode();
            strategy.appendField(locator, this, "ownerTypeCode", buffer, theOwnerTypeCode, (this.ownerTypeCode!= null));
        }
        {
            SizeTypeCodeType theSizeTypeCode;
            theSizeTypeCode = this.getSizeTypeCode();
            strategy.appendField(locator, this, "sizeTypeCode", buffer, theSizeTypeCode, (this.sizeTypeCode!= null));
        }
        {
            DispositionCodeType theDispositionCode;
            theDispositionCode = this.getDispositionCode();
            strategy.appendField(locator, this, "dispositionCode", buffer, theDispositionCode, (this.dispositionCode!= null));
        }
        {
            FullnessIndicationCodeType theFullnessIndicationCode;
            theFullnessIndicationCode = this.getFullnessIndicationCode();
            strategy.appendField(locator, this, "fullnessIndicationCode", buffer, theFullnessIndicationCode, (this.fullnessIndicationCode!= null));
        }
        {
            RefrigerationOnIndicatorType theRefrigerationOnIndicator;
            theRefrigerationOnIndicator = this.getRefrigerationOnIndicator();
            strategy.appendField(locator, this, "refrigerationOnIndicator", buffer, theRefrigerationOnIndicator, (this.refrigerationOnIndicator!= null));
        }
        {
            List<InformationType> theInformation;
            theInformation = (((this.information!= null)&&(!this.information.isEmpty()))?this.getInformation():null);
            strategy.appendField(locator, this, "information", buffer, theInformation, ((this.information!= null)&&(!this.information.isEmpty())));
        }
        {
            ReturnabilityIndicatorType theReturnabilityIndicator;
            theReturnabilityIndicator = this.getReturnabilityIndicator();
            strategy.appendField(locator, this, "returnabilityIndicator", buffer, theReturnabilityIndicator, (this.returnabilityIndicator!= null));
        }
        {
            LegalStatusIndicatorType theLegalStatusIndicator;
            theLegalStatusIndicator = this.getLegalStatusIndicator();
            strategy.appendField(locator, this, "legalStatusIndicator", buffer, theLegalStatusIndicator, (this.legalStatusIndicator!= null));
        }
        {
            AirFlowPercentType theAirFlowPercent;
            theAirFlowPercent = this.getAirFlowPercent();
            strategy.appendField(locator, this, "airFlowPercent", buffer, theAirFlowPercent, (this.airFlowPercent!= null));
        }
        {
            HumidityPercentType theHumidityPercent;
            theHumidityPercent = this.getHumidityPercent();
            strategy.appendField(locator, this, "humidityPercent", buffer, theHumidityPercent, (this.humidityPercent!= null));
        }
        {
            AnimalFoodApprovedIndicatorType theAnimalFoodApprovedIndicator;
            theAnimalFoodApprovedIndicator = this.getAnimalFoodApprovedIndicator();
            strategy.appendField(locator, this, "animalFoodApprovedIndicator", buffer, theAnimalFoodApprovedIndicator, (this.animalFoodApprovedIndicator!= null));
        }
        {
            HumanFoodApprovedIndicatorType theHumanFoodApprovedIndicator;
            theHumanFoodApprovedIndicator = this.getHumanFoodApprovedIndicator();
            strategy.appendField(locator, this, "humanFoodApprovedIndicator", buffer, theHumanFoodApprovedIndicator, (this.humanFoodApprovedIndicator!= null));
        }
        {
            DangerousGoodsApprovedIndicatorType theDangerousGoodsApprovedIndicator;
            theDangerousGoodsApprovedIndicator = this.getDangerousGoodsApprovedIndicator();
            strategy.appendField(locator, this, "dangerousGoodsApprovedIndicator", buffer, theDangerousGoodsApprovedIndicator, (this.dangerousGoodsApprovedIndicator!= null));
        }
        {
            RefrigeratedIndicatorType theRefrigeratedIndicator;
            theRefrigeratedIndicator = this.getRefrigeratedIndicator();
            strategy.appendField(locator, this, "refrigeratedIndicator", buffer, theRefrigeratedIndicator, (this.refrigeratedIndicator!= null));
        }
        {
            CharacteristicsType theCharacteristics;
            theCharacteristics = this.getCharacteristics();
            strategy.appendField(locator, this, "characteristics", buffer, theCharacteristics, (this.characteristics!= null));
        }
        {
            List<DamageRemarksType> theDamageRemarks;
            theDamageRemarks = (((this.damageRemarks!= null)&&(!this.damageRemarks.isEmpty()))?this.getDamageRemarks():null);
            strategy.appendField(locator, this, "damageRemarks", buffer, theDamageRemarks, ((this.damageRemarks!= null)&&(!this.damageRemarks.isEmpty())));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<SpecialTransportRequirementsType> theSpecialTransportRequirements;
            theSpecialTransportRequirements = (((this.specialTransportRequirements!= null)&&(!this.specialTransportRequirements.isEmpty()))?this.getSpecialTransportRequirements():null);
            strategy.appendField(locator, this, "specialTransportRequirements", buffer, theSpecialTransportRequirements, ((this.specialTransportRequirements!= null)&&(!this.specialTransportRequirements.isEmpty())));
        }
        {
            GrossWeightMeasureType theGrossWeightMeasure;
            theGrossWeightMeasure = this.getGrossWeightMeasure();
            strategy.appendField(locator, this, "grossWeightMeasure", buffer, theGrossWeightMeasure, (this.grossWeightMeasure!= null));
        }
        {
            GrossVolumeMeasureType theGrossVolumeMeasure;
            theGrossVolumeMeasure = this.getGrossVolumeMeasure();
            strategy.appendField(locator, this, "grossVolumeMeasure", buffer, theGrossVolumeMeasure, (this.grossVolumeMeasure!= null));
        }
        {
            TareWeightMeasureType theTareWeightMeasure;
            theTareWeightMeasure = this.getTareWeightMeasure();
            strategy.appendField(locator, this, "tareWeightMeasure", buffer, theTareWeightMeasure, (this.tareWeightMeasure!= null));
        }
        {
            TrackingDeviceCodeType theTrackingDeviceCode;
            theTrackingDeviceCode = this.getTrackingDeviceCode();
            strategy.appendField(locator, this, "trackingDeviceCode", buffer, theTrackingDeviceCode, (this.trackingDeviceCode!= null));
        }
        {
            PowerIndicatorType thePowerIndicator;
            thePowerIndicator = this.getPowerIndicator();
            strategy.appendField(locator, this, "powerIndicator", buffer, thePowerIndicator, (this.powerIndicator!= null));
        }
        {
            TraceIDType theTraceID;
            theTraceID = this.getTraceID();
            strategy.appendField(locator, this, "traceID", buffer, theTraceID, (this.traceID!= null));
        }
        {
            List<DimensionType> theMeasurementDimension;
            theMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            strategy.appendField(locator, this, "measurementDimension", buffer, theMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())));
        }
        {
            List<TransportEquipmentSealType> theTransportEquipmentSeal;
            theTransportEquipmentSeal = (((this.transportEquipmentSeal!= null)&&(!this.transportEquipmentSeal.isEmpty()))?this.getTransportEquipmentSeal():null);
            strategy.appendField(locator, this, "transportEquipmentSeal", buffer, theTransportEquipmentSeal, ((this.transportEquipmentSeal!= null)&&(!this.transportEquipmentSeal.isEmpty())));
        }
        {
            TemperatureType theMinimumTemperature;
            theMinimumTemperature = this.getMinimumTemperature();
            strategy.appendField(locator, this, "minimumTemperature", buffer, theMinimumTemperature, (this.minimumTemperature!= null));
        }
        {
            TemperatureType theMaximumTemperature;
            theMaximumTemperature = this.getMaximumTemperature();
            strategy.appendField(locator, this, "maximumTemperature", buffer, theMaximumTemperature, (this.maximumTemperature!= null));
        }
        {
            PartyType theProviderParty;
            theProviderParty = this.getProviderParty();
            strategy.appendField(locator, this, "providerParty", buffer, theProviderParty, (this.providerParty!= null));
        }
        {
            PartyType theLoadingProofParty;
            theLoadingProofParty = this.getLoadingProofParty();
            strategy.appendField(locator, this, "loadingProofParty", buffer, theLoadingProofParty, (this.loadingProofParty!= null));
        }
        {
            SupplierPartyType theSupplierParty;
            theSupplierParty = this.getSupplierParty();
            strategy.appendField(locator, this, "supplierParty", buffer, theSupplierParty, (this.supplierParty!= null));
        }
        {
            PartyType theOwnerParty;
            theOwnerParty = this.getOwnerParty();
            strategy.appendField(locator, this, "ownerParty", buffer, theOwnerParty, (this.ownerParty!= null));
        }
        {
            PartyType theOperatingParty;
            theOperatingParty = this.getOperatingParty();
            strategy.appendField(locator, this, "operatingParty", buffer, theOperatingParty, (this.operatingParty!= null));
        }
        {
            LocationType theLoadingLocation;
            theLoadingLocation = this.getLoadingLocation();
            strategy.appendField(locator, this, "loadingLocation", buffer, theLoadingLocation, (this.loadingLocation!= null));
        }
        {
            LocationType theUnloadingLocation;
            theUnloadingLocation = this.getUnloadingLocation();
            strategy.appendField(locator, this, "unloadingLocation", buffer, theUnloadingLocation, (this.unloadingLocation!= null));
        }
        {
            LocationType theStorageLocation;
            theStorageLocation = this.getStorageLocation();
            strategy.appendField(locator, this, "storageLocation", buffer, theStorageLocation, (this.storageLocation!= null));
        }
        {
            List<TransportEventType> thePositioningTransportEvent;
            thePositioningTransportEvent = (((this.positioningTransportEvent!= null)&&(!this.positioningTransportEvent.isEmpty()))?this.getPositioningTransportEvent():null);
            strategy.appendField(locator, this, "positioningTransportEvent", buffer, thePositioningTransportEvent, ((this.positioningTransportEvent!= null)&&(!this.positioningTransportEvent.isEmpty())));
        }
        {
            List<TransportEventType> theQuarantineTransportEvent;
            theQuarantineTransportEvent = (((this.quarantineTransportEvent!= null)&&(!this.quarantineTransportEvent.isEmpty()))?this.getQuarantineTransportEvent():null);
            strategy.appendField(locator, this, "quarantineTransportEvent", buffer, theQuarantineTransportEvent, ((this.quarantineTransportEvent!= null)&&(!this.quarantineTransportEvent.isEmpty())));
        }
        {
            List<TransportEventType> theDeliveryTransportEvent;
            theDeliveryTransportEvent = (((this.deliveryTransportEvent!= null)&&(!this.deliveryTransportEvent.isEmpty()))?this.getDeliveryTransportEvent():null);
            strategy.appendField(locator, this, "deliveryTransportEvent", buffer, theDeliveryTransportEvent, ((this.deliveryTransportEvent!= null)&&(!this.deliveryTransportEvent.isEmpty())));
        }
        {
            List<TransportEventType> thePickupTransportEvent;
            thePickupTransportEvent = (((this.pickupTransportEvent!= null)&&(!this.pickupTransportEvent.isEmpty()))?this.getPickupTransportEvent():null);
            strategy.appendField(locator, this, "pickupTransportEvent", buffer, thePickupTransportEvent, ((this.pickupTransportEvent!= null)&&(!this.pickupTransportEvent.isEmpty())));
        }
        {
            List<TransportEventType> theHandlingTransportEvent;
            theHandlingTransportEvent = (((this.handlingTransportEvent!= null)&&(!this.handlingTransportEvent.isEmpty()))?this.getHandlingTransportEvent():null);
            strategy.appendField(locator, this, "handlingTransportEvent", buffer, theHandlingTransportEvent, ((this.handlingTransportEvent!= null)&&(!this.handlingTransportEvent.isEmpty())));
        }
        {
            List<TransportEventType> theLoadingTransportEvent;
            theLoadingTransportEvent = (((this.loadingTransportEvent!= null)&&(!this.loadingTransportEvent.isEmpty()))?this.getLoadingTransportEvent():null);
            strategy.appendField(locator, this, "loadingTransportEvent", buffer, theLoadingTransportEvent, ((this.loadingTransportEvent!= null)&&(!this.loadingTransportEvent.isEmpty())));
        }
        {
            List<TransportEventType> theTransportEvent;
            theTransportEvent = (((this.transportEvent!= null)&&(!this.transportEvent.isEmpty()))?this.getTransportEvent():null);
            strategy.appendField(locator, this, "transportEvent", buffer, theTransportEvent, ((this.transportEvent!= null)&&(!this.transportEvent.isEmpty())));
        }
        {
            TransportMeansType theApplicableTransportMeans;
            theApplicableTransportMeans = this.getApplicableTransportMeans();
            strategy.appendField(locator, this, "applicableTransportMeans", buffer, theApplicableTransportMeans, (this.applicableTransportMeans!= null));
        }
        {
            List<TradingTermsType> theHaulageTradingTerms;
            theHaulageTradingTerms = (((this.haulageTradingTerms!= null)&&(!this.haulageTradingTerms.isEmpty()))?this.getHaulageTradingTerms():null);
            strategy.appendField(locator, this, "haulageTradingTerms", buffer, theHaulageTradingTerms, ((this.haulageTradingTerms!= null)&&(!this.haulageTradingTerms.isEmpty())));
        }
        {
            List<HazardousGoodsTransitType> theHazardousGoodsTransit;
            theHazardousGoodsTransit = (((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty()))?this.getHazardousGoodsTransit():null);
            strategy.appendField(locator, this, "hazardousGoodsTransit", buffer, theHazardousGoodsTransit, ((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty())));
        }
        {
            List<TransportHandlingUnitType> thePackagedTransportHandlingUnit;
            thePackagedTransportHandlingUnit = (((this.packagedTransportHandlingUnit!= null)&&(!this.packagedTransportHandlingUnit.isEmpty()))?this.getPackagedTransportHandlingUnit():null);
            strategy.appendField(locator, this, "packagedTransportHandlingUnit", buffer, thePackagedTransportHandlingUnit, ((this.packagedTransportHandlingUnit!= null)&&(!this.packagedTransportHandlingUnit.isEmpty())));
        }
        {
            List<AllowanceChargeType> theServiceAllowanceCharge;
            theServiceAllowanceCharge = (((this.serviceAllowanceCharge!= null)&&(!this.serviceAllowanceCharge.isEmpty()))?this.getServiceAllowanceCharge():null);
            strategy.appendField(locator, this, "serviceAllowanceCharge", buffer, theServiceAllowanceCharge, ((this.serviceAllowanceCharge!= null)&&(!this.serviceAllowanceCharge.isEmpty())));
        }
        {
            List<AllowanceChargeType> theFreightAllowanceCharge;
            theFreightAllowanceCharge = (((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty()))?this.getFreightAllowanceCharge():null);
            strategy.appendField(locator, this, "freightAllowanceCharge", buffer, theFreightAllowanceCharge, ((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty())));
        }
        {
            List<TransportEquipmentType> theAttachedTransportEquipment;
            theAttachedTransportEquipment = (((this.attachedTransportEquipment!= null)&&(!this.attachedTransportEquipment.isEmpty()))?this.getAttachedTransportEquipment():null);
            strategy.appendField(locator, this, "attachedTransportEquipment", buffer, theAttachedTransportEquipment, ((this.attachedTransportEquipment!= null)&&(!this.attachedTransportEquipment.isEmpty())));
        }
        {
            DeliveryType theDelivery;
            theDelivery = this.getDelivery();
            strategy.appendField(locator, this, "delivery", buffer, theDelivery, (this.delivery!= null));
        }
        {
            PickupType thePickup;
            thePickup = this.getPickup();
            strategy.appendField(locator, this, "pickup", buffer, thePickup, (this.pickup!= null));
        }
        {
            DespatchType theDespatch;
            theDespatch = this.getDespatch();
            strategy.appendField(locator, this, "despatch", buffer, theDespatch, (this.despatch!= null));
        }
        {
            List<DocumentReferenceType> theShipmentDocumentReference;
            theShipmentDocumentReference = (((this.shipmentDocumentReference!= null)&&(!this.shipmentDocumentReference.isEmpty()))?this.getShipmentDocumentReference():null);
            strategy.appendField(locator, this, "shipmentDocumentReference", buffer, theShipmentDocumentReference, ((this.shipmentDocumentReference!= null)&&(!this.shipmentDocumentReference.isEmpty())));
        }
        {
            List<TransportEquipmentType> theContainedInTransportEquipment;
            theContainedInTransportEquipment = (((this.containedInTransportEquipment!= null)&&(!this.containedInTransportEquipment.isEmpty()))?this.getContainedInTransportEquipment():null);
            strategy.appendField(locator, this, "containedInTransportEquipment", buffer, theContainedInTransportEquipment, ((this.containedInTransportEquipment!= null)&&(!this.containedInTransportEquipment.isEmpty())));
        }
        {
            List<PackageType> thePackage;
            thePackage = (((this._package!= null)&&(!this._package.isEmpty()))?this.getPackage():null);
            strategy.appendField(locator, this, "_package", buffer, thePackage, ((this._package!= null)&&(!this._package.isEmpty())));
        }
        {
            List<GoodsItemType> theGoodsItem;
            theGoodsItem = (((this.goodsItem!= null)&&(!this.goodsItem.isEmpty()))?this.getGoodsItem():null);
            strategy.appendField(locator, this, "goodsItem", buffer, theGoodsItem, ((this.goodsItem!= null)&&(!this.goodsItem.isEmpty())));
        }
        {
            VerifiedGrossMassType theVerifiedGrossMass;
            theVerifiedGrossMass = this.getVerifiedGrossMass();
            strategy.appendField(locator, this, "verifiedGrossMass", buffer, theVerifiedGrossMass, (this.verifiedGrossMass!= null));
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
        final TransportEquipmentType that = ((TransportEquipmentType) object);
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
            List<ReferencedConsignmentIDType> lhsReferencedConsignmentID;
            lhsReferencedConsignmentID = (((this.referencedConsignmentID!= null)&&(!this.referencedConsignmentID.isEmpty()))?this.getReferencedConsignmentID():null);
            List<ReferencedConsignmentIDType> rhsReferencedConsignmentID;
            rhsReferencedConsignmentID = (((that.referencedConsignmentID!= null)&&(!that.referencedConsignmentID.isEmpty()))?that.getReferencedConsignmentID():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referencedConsignmentID", lhsReferencedConsignmentID), LocatorUtils.property(thatLocator, "referencedConsignmentID", rhsReferencedConsignmentID), lhsReferencedConsignmentID, rhsReferencedConsignmentID, ((this.referencedConsignmentID!= null)&&(!this.referencedConsignmentID.isEmpty())), ((that.referencedConsignmentID!= null)&&(!that.referencedConsignmentID.isEmpty())))) {
                return false;
            }
        }
        {
            TransportEquipmentTypeCodeType lhsTransportEquipmentTypeCode;
            lhsTransportEquipmentTypeCode = this.getTransportEquipmentTypeCode();
            TransportEquipmentTypeCodeType rhsTransportEquipmentTypeCode;
            rhsTransportEquipmentTypeCode = that.getTransportEquipmentTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportEquipmentTypeCode", lhsTransportEquipmentTypeCode), LocatorUtils.property(thatLocator, "transportEquipmentTypeCode", rhsTransportEquipmentTypeCode), lhsTransportEquipmentTypeCode, rhsTransportEquipmentTypeCode, (this.transportEquipmentTypeCode!= null), (that.transportEquipmentTypeCode!= null))) {
                return false;
            }
        }
        {
            ProviderTypeCodeType lhsProviderTypeCode;
            lhsProviderTypeCode = this.getProviderTypeCode();
            ProviderTypeCodeType rhsProviderTypeCode;
            rhsProviderTypeCode = that.getProviderTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "providerTypeCode", lhsProviderTypeCode), LocatorUtils.property(thatLocator, "providerTypeCode", rhsProviderTypeCode), lhsProviderTypeCode, rhsProviderTypeCode, (this.providerTypeCode!= null), (that.providerTypeCode!= null))) {
                return false;
            }
        }
        {
            OwnerTypeCodeType lhsOwnerTypeCode;
            lhsOwnerTypeCode = this.getOwnerTypeCode();
            OwnerTypeCodeType rhsOwnerTypeCode;
            rhsOwnerTypeCode = that.getOwnerTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ownerTypeCode", lhsOwnerTypeCode), LocatorUtils.property(thatLocator, "ownerTypeCode", rhsOwnerTypeCode), lhsOwnerTypeCode, rhsOwnerTypeCode, (this.ownerTypeCode!= null), (that.ownerTypeCode!= null))) {
                return false;
            }
        }
        {
            SizeTypeCodeType lhsSizeTypeCode;
            lhsSizeTypeCode = this.getSizeTypeCode();
            SizeTypeCodeType rhsSizeTypeCode;
            rhsSizeTypeCode = that.getSizeTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sizeTypeCode", lhsSizeTypeCode), LocatorUtils.property(thatLocator, "sizeTypeCode", rhsSizeTypeCode), lhsSizeTypeCode, rhsSizeTypeCode, (this.sizeTypeCode!= null), (that.sizeTypeCode!= null))) {
                return false;
            }
        }
        {
            DispositionCodeType lhsDispositionCode;
            lhsDispositionCode = this.getDispositionCode();
            DispositionCodeType rhsDispositionCode;
            rhsDispositionCode = that.getDispositionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dispositionCode", lhsDispositionCode), LocatorUtils.property(thatLocator, "dispositionCode", rhsDispositionCode), lhsDispositionCode, rhsDispositionCode, (this.dispositionCode!= null), (that.dispositionCode!= null))) {
                return false;
            }
        }
        {
            FullnessIndicationCodeType lhsFullnessIndicationCode;
            lhsFullnessIndicationCode = this.getFullnessIndicationCode();
            FullnessIndicationCodeType rhsFullnessIndicationCode;
            rhsFullnessIndicationCode = that.getFullnessIndicationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fullnessIndicationCode", lhsFullnessIndicationCode), LocatorUtils.property(thatLocator, "fullnessIndicationCode", rhsFullnessIndicationCode), lhsFullnessIndicationCode, rhsFullnessIndicationCode, (this.fullnessIndicationCode!= null), (that.fullnessIndicationCode!= null))) {
                return false;
            }
        }
        {
            RefrigerationOnIndicatorType lhsRefrigerationOnIndicator;
            lhsRefrigerationOnIndicator = this.getRefrigerationOnIndicator();
            RefrigerationOnIndicatorType rhsRefrigerationOnIndicator;
            rhsRefrigerationOnIndicator = that.getRefrigerationOnIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refrigerationOnIndicator", lhsRefrigerationOnIndicator), LocatorUtils.property(thatLocator, "refrigerationOnIndicator", rhsRefrigerationOnIndicator), lhsRefrigerationOnIndicator, rhsRefrigerationOnIndicator, (this.refrigerationOnIndicator!= null), (that.refrigerationOnIndicator!= null))) {
                return false;
            }
        }
        {
            List<InformationType> lhsInformation;
            lhsInformation = (((this.information!= null)&&(!this.information.isEmpty()))?this.getInformation():null);
            List<InformationType> rhsInformation;
            rhsInformation = (((that.information!= null)&&(!that.information.isEmpty()))?that.getInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "information", lhsInformation), LocatorUtils.property(thatLocator, "information", rhsInformation), lhsInformation, rhsInformation, ((this.information!= null)&&(!this.information.isEmpty())), ((that.information!= null)&&(!that.information.isEmpty())))) {
                return false;
            }
        }
        {
            ReturnabilityIndicatorType lhsReturnabilityIndicator;
            lhsReturnabilityIndicator = this.getReturnabilityIndicator();
            ReturnabilityIndicatorType rhsReturnabilityIndicator;
            rhsReturnabilityIndicator = that.getReturnabilityIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "returnabilityIndicator", lhsReturnabilityIndicator), LocatorUtils.property(thatLocator, "returnabilityIndicator", rhsReturnabilityIndicator), lhsReturnabilityIndicator, rhsReturnabilityIndicator, (this.returnabilityIndicator!= null), (that.returnabilityIndicator!= null))) {
                return false;
            }
        }
        {
            LegalStatusIndicatorType lhsLegalStatusIndicator;
            lhsLegalStatusIndicator = this.getLegalStatusIndicator();
            LegalStatusIndicatorType rhsLegalStatusIndicator;
            rhsLegalStatusIndicator = that.getLegalStatusIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legalStatusIndicator", lhsLegalStatusIndicator), LocatorUtils.property(thatLocator, "legalStatusIndicator", rhsLegalStatusIndicator), lhsLegalStatusIndicator, rhsLegalStatusIndicator, (this.legalStatusIndicator!= null), (that.legalStatusIndicator!= null))) {
                return false;
            }
        }
        {
            AirFlowPercentType lhsAirFlowPercent;
            lhsAirFlowPercent = this.getAirFlowPercent();
            AirFlowPercentType rhsAirFlowPercent;
            rhsAirFlowPercent = that.getAirFlowPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airFlowPercent", lhsAirFlowPercent), LocatorUtils.property(thatLocator, "airFlowPercent", rhsAirFlowPercent), lhsAirFlowPercent, rhsAirFlowPercent, (this.airFlowPercent!= null), (that.airFlowPercent!= null))) {
                return false;
            }
        }
        {
            HumidityPercentType lhsHumidityPercent;
            lhsHumidityPercent = this.getHumidityPercent();
            HumidityPercentType rhsHumidityPercent;
            rhsHumidityPercent = that.getHumidityPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "humidityPercent", lhsHumidityPercent), LocatorUtils.property(thatLocator, "humidityPercent", rhsHumidityPercent), lhsHumidityPercent, rhsHumidityPercent, (this.humidityPercent!= null), (that.humidityPercent!= null))) {
                return false;
            }
        }
        {
            AnimalFoodApprovedIndicatorType lhsAnimalFoodApprovedIndicator;
            lhsAnimalFoodApprovedIndicator = this.getAnimalFoodApprovedIndicator();
            AnimalFoodApprovedIndicatorType rhsAnimalFoodApprovedIndicator;
            rhsAnimalFoodApprovedIndicator = that.getAnimalFoodApprovedIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "animalFoodApprovedIndicator", lhsAnimalFoodApprovedIndicator), LocatorUtils.property(thatLocator, "animalFoodApprovedIndicator", rhsAnimalFoodApprovedIndicator), lhsAnimalFoodApprovedIndicator, rhsAnimalFoodApprovedIndicator, (this.animalFoodApprovedIndicator!= null), (that.animalFoodApprovedIndicator!= null))) {
                return false;
            }
        }
        {
            HumanFoodApprovedIndicatorType lhsHumanFoodApprovedIndicator;
            lhsHumanFoodApprovedIndicator = this.getHumanFoodApprovedIndicator();
            HumanFoodApprovedIndicatorType rhsHumanFoodApprovedIndicator;
            rhsHumanFoodApprovedIndicator = that.getHumanFoodApprovedIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "humanFoodApprovedIndicator", lhsHumanFoodApprovedIndicator), LocatorUtils.property(thatLocator, "humanFoodApprovedIndicator", rhsHumanFoodApprovedIndicator), lhsHumanFoodApprovedIndicator, rhsHumanFoodApprovedIndicator, (this.humanFoodApprovedIndicator!= null), (that.humanFoodApprovedIndicator!= null))) {
                return false;
            }
        }
        {
            DangerousGoodsApprovedIndicatorType lhsDangerousGoodsApprovedIndicator;
            lhsDangerousGoodsApprovedIndicator = this.getDangerousGoodsApprovedIndicator();
            DangerousGoodsApprovedIndicatorType rhsDangerousGoodsApprovedIndicator;
            rhsDangerousGoodsApprovedIndicator = that.getDangerousGoodsApprovedIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dangerousGoodsApprovedIndicator", lhsDangerousGoodsApprovedIndicator), LocatorUtils.property(thatLocator, "dangerousGoodsApprovedIndicator", rhsDangerousGoodsApprovedIndicator), lhsDangerousGoodsApprovedIndicator, rhsDangerousGoodsApprovedIndicator, (this.dangerousGoodsApprovedIndicator!= null), (that.dangerousGoodsApprovedIndicator!= null))) {
                return false;
            }
        }
        {
            RefrigeratedIndicatorType lhsRefrigeratedIndicator;
            lhsRefrigeratedIndicator = this.getRefrigeratedIndicator();
            RefrigeratedIndicatorType rhsRefrigeratedIndicator;
            rhsRefrigeratedIndicator = that.getRefrigeratedIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refrigeratedIndicator", lhsRefrigeratedIndicator), LocatorUtils.property(thatLocator, "refrigeratedIndicator", rhsRefrigeratedIndicator), lhsRefrigeratedIndicator, rhsRefrigeratedIndicator, (this.refrigeratedIndicator!= null), (that.refrigeratedIndicator!= null))) {
                return false;
            }
        }
        {
            CharacteristicsType lhsCharacteristics;
            lhsCharacteristics = this.getCharacteristics();
            CharacteristicsType rhsCharacteristics;
            rhsCharacteristics = that.getCharacteristics();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "characteristics", lhsCharacteristics), LocatorUtils.property(thatLocator, "characteristics", rhsCharacteristics), lhsCharacteristics, rhsCharacteristics, (this.characteristics!= null), (that.characteristics!= null))) {
                return false;
            }
        }
        {
            List<DamageRemarksType> lhsDamageRemarks;
            lhsDamageRemarks = (((this.damageRemarks!= null)&&(!this.damageRemarks.isEmpty()))?this.getDamageRemarks():null);
            List<DamageRemarksType> rhsDamageRemarks;
            rhsDamageRemarks = (((that.damageRemarks!= null)&&(!that.damageRemarks.isEmpty()))?that.getDamageRemarks():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "damageRemarks", lhsDamageRemarks), LocatorUtils.property(thatLocator, "damageRemarks", rhsDamageRemarks), lhsDamageRemarks, rhsDamageRemarks, ((this.damageRemarks!= null)&&(!this.damageRemarks.isEmpty())), ((that.damageRemarks!= null)&&(!that.damageRemarks.isEmpty())))) {
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
            List<SpecialTransportRequirementsType> lhsSpecialTransportRequirements;
            lhsSpecialTransportRequirements = (((this.specialTransportRequirements!= null)&&(!this.specialTransportRequirements.isEmpty()))?this.getSpecialTransportRequirements():null);
            List<SpecialTransportRequirementsType> rhsSpecialTransportRequirements;
            rhsSpecialTransportRequirements = (((that.specialTransportRequirements!= null)&&(!that.specialTransportRequirements.isEmpty()))?that.getSpecialTransportRequirements():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialTransportRequirements", lhsSpecialTransportRequirements), LocatorUtils.property(thatLocator, "specialTransportRequirements", rhsSpecialTransportRequirements), lhsSpecialTransportRequirements, rhsSpecialTransportRequirements, ((this.specialTransportRequirements!= null)&&(!this.specialTransportRequirements.isEmpty())), ((that.specialTransportRequirements!= null)&&(!that.specialTransportRequirements.isEmpty())))) {
                return false;
            }
        }
        {
            GrossWeightMeasureType lhsGrossWeightMeasure;
            lhsGrossWeightMeasure = this.getGrossWeightMeasure();
            GrossWeightMeasureType rhsGrossWeightMeasure;
            rhsGrossWeightMeasure = that.getGrossWeightMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grossWeightMeasure", lhsGrossWeightMeasure), LocatorUtils.property(thatLocator, "grossWeightMeasure", rhsGrossWeightMeasure), lhsGrossWeightMeasure, rhsGrossWeightMeasure, (this.grossWeightMeasure!= null), (that.grossWeightMeasure!= null))) {
                return false;
            }
        }
        {
            GrossVolumeMeasureType lhsGrossVolumeMeasure;
            lhsGrossVolumeMeasure = this.getGrossVolumeMeasure();
            GrossVolumeMeasureType rhsGrossVolumeMeasure;
            rhsGrossVolumeMeasure = that.getGrossVolumeMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grossVolumeMeasure", lhsGrossVolumeMeasure), LocatorUtils.property(thatLocator, "grossVolumeMeasure", rhsGrossVolumeMeasure), lhsGrossVolumeMeasure, rhsGrossVolumeMeasure, (this.grossVolumeMeasure!= null), (that.grossVolumeMeasure!= null))) {
                return false;
            }
        }
        {
            TareWeightMeasureType lhsTareWeightMeasure;
            lhsTareWeightMeasure = this.getTareWeightMeasure();
            TareWeightMeasureType rhsTareWeightMeasure;
            rhsTareWeightMeasure = that.getTareWeightMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tareWeightMeasure", lhsTareWeightMeasure), LocatorUtils.property(thatLocator, "tareWeightMeasure", rhsTareWeightMeasure), lhsTareWeightMeasure, rhsTareWeightMeasure, (this.tareWeightMeasure!= null), (that.tareWeightMeasure!= null))) {
                return false;
            }
        }
        {
            TrackingDeviceCodeType lhsTrackingDeviceCode;
            lhsTrackingDeviceCode = this.getTrackingDeviceCode();
            TrackingDeviceCodeType rhsTrackingDeviceCode;
            rhsTrackingDeviceCode = that.getTrackingDeviceCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackingDeviceCode", lhsTrackingDeviceCode), LocatorUtils.property(thatLocator, "trackingDeviceCode", rhsTrackingDeviceCode), lhsTrackingDeviceCode, rhsTrackingDeviceCode, (this.trackingDeviceCode!= null), (that.trackingDeviceCode!= null))) {
                return false;
            }
        }
        {
            PowerIndicatorType lhsPowerIndicator;
            lhsPowerIndicator = this.getPowerIndicator();
            PowerIndicatorType rhsPowerIndicator;
            rhsPowerIndicator = that.getPowerIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "powerIndicator", lhsPowerIndicator), LocatorUtils.property(thatLocator, "powerIndicator", rhsPowerIndicator), lhsPowerIndicator, rhsPowerIndicator, (this.powerIndicator!= null), (that.powerIndicator!= null))) {
                return false;
            }
        }
        {
            TraceIDType lhsTraceID;
            lhsTraceID = this.getTraceID();
            TraceIDType rhsTraceID;
            rhsTraceID = that.getTraceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "traceID", lhsTraceID), LocatorUtils.property(thatLocator, "traceID", rhsTraceID), lhsTraceID, rhsTraceID, (this.traceID!= null), (that.traceID!= null))) {
                return false;
            }
        }
        {
            List<DimensionType> lhsMeasurementDimension;
            lhsMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            List<DimensionType> rhsMeasurementDimension;
            rhsMeasurementDimension = (((that.measurementDimension!= null)&&(!that.measurementDimension.isEmpty()))?that.getMeasurementDimension():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurementDimension", lhsMeasurementDimension), LocatorUtils.property(thatLocator, "measurementDimension", rhsMeasurementDimension), lhsMeasurementDimension, rhsMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())), ((that.measurementDimension!= null)&&(!that.measurementDimension.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransportEquipmentSealType> lhsTransportEquipmentSeal;
            lhsTransportEquipmentSeal = (((this.transportEquipmentSeal!= null)&&(!this.transportEquipmentSeal.isEmpty()))?this.getTransportEquipmentSeal():null);
            List<TransportEquipmentSealType> rhsTransportEquipmentSeal;
            rhsTransportEquipmentSeal = (((that.transportEquipmentSeal!= null)&&(!that.transportEquipmentSeal.isEmpty()))?that.getTransportEquipmentSeal():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportEquipmentSeal", lhsTransportEquipmentSeal), LocatorUtils.property(thatLocator, "transportEquipmentSeal", rhsTransportEquipmentSeal), lhsTransportEquipmentSeal, rhsTransportEquipmentSeal, ((this.transportEquipmentSeal!= null)&&(!this.transportEquipmentSeal.isEmpty())), ((that.transportEquipmentSeal!= null)&&(!that.transportEquipmentSeal.isEmpty())))) {
                return false;
            }
        }
        {
            TemperatureType lhsMinimumTemperature;
            lhsMinimumTemperature = this.getMinimumTemperature();
            TemperatureType rhsMinimumTemperature;
            rhsMinimumTemperature = that.getMinimumTemperature();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumTemperature", lhsMinimumTemperature), LocatorUtils.property(thatLocator, "minimumTemperature", rhsMinimumTemperature), lhsMinimumTemperature, rhsMinimumTemperature, (this.minimumTemperature!= null), (that.minimumTemperature!= null))) {
                return false;
            }
        }
        {
            TemperatureType lhsMaximumTemperature;
            lhsMaximumTemperature = this.getMaximumTemperature();
            TemperatureType rhsMaximumTemperature;
            rhsMaximumTemperature = that.getMaximumTemperature();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumTemperature", lhsMaximumTemperature), LocatorUtils.property(thatLocator, "maximumTemperature", rhsMaximumTemperature), lhsMaximumTemperature, rhsMaximumTemperature, (this.maximumTemperature!= null), (that.maximumTemperature!= null))) {
                return false;
            }
        }
        {
            PartyType lhsProviderParty;
            lhsProviderParty = this.getProviderParty();
            PartyType rhsProviderParty;
            rhsProviderParty = that.getProviderParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "providerParty", lhsProviderParty), LocatorUtils.property(thatLocator, "providerParty", rhsProviderParty), lhsProviderParty, rhsProviderParty, (this.providerParty!= null), (that.providerParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsLoadingProofParty;
            lhsLoadingProofParty = this.getLoadingProofParty();
            PartyType rhsLoadingProofParty;
            rhsLoadingProofParty = that.getLoadingProofParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loadingProofParty", lhsLoadingProofParty), LocatorUtils.property(thatLocator, "loadingProofParty", rhsLoadingProofParty), lhsLoadingProofParty, rhsLoadingProofParty, (this.loadingProofParty!= null), (that.loadingProofParty!= null))) {
                return false;
            }
        }
        {
            SupplierPartyType lhsSupplierParty;
            lhsSupplierParty = this.getSupplierParty();
            SupplierPartyType rhsSupplierParty;
            rhsSupplierParty = that.getSupplierParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplierParty", lhsSupplierParty), LocatorUtils.property(thatLocator, "supplierParty", rhsSupplierParty), lhsSupplierParty, rhsSupplierParty, (this.supplierParty!= null), (that.supplierParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsOwnerParty;
            lhsOwnerParty = this.getOwnerParty();
            PartyType rhsOwnerParty;
            rhsOwnerParty = that.getOwnerParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ownerParty", lhsOwnerParty), LocatorUtils.property(thatLocator, "ownerParty", rhsOwnerParty), lhsOwnerParty, rhsOwnerParty, (this.ownerParty!= null), (that.ownerParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsOperatingParty;
            lhsOperatingParty = this.getOperatingParty();
            PartyType rhsOperatingParty;
            rhsOperatingParty = that.getOperatingParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operatingParty", lhsOperatingParty), LocatorUtils.property(thatLocator, "operatingParty", rhsOperatingParty), lhsOperatingParty, rhsOperatingParty, (this.operatingParty!= null), (that.operatingParty!= null))) {
                return false;
            }
        }
        {
            LocationType lhsLoadingLocation;
            lhsLoadingLocation = this.getLoadingLocation();
            LocationType rhsLoadingLocation;
            rhsLoadingLocation = that.getLoadingLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loadingLocation", lhsLoadingLocation), LocatorUtils.property(thatLocator, "loadingLocation", rhsLoadingLocation), lhsLoadingLocation, rhsLoadingLocation, (this.loadingLocation!= null), (that.loadingLocation!= null))) {
                return false;
            }
        }
        {
            LocationType lhsUnloadingLocation;
            lhsUnloadingLocation = this.getUnloadingLocation();
            LocationType rhsUnloadingLocation;
            rhsUnloadingLocation = that.getUnloadingLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unloadingLocation", lhsUnloadingLocation), LocatorUtils.property(thatLocator, "unloadingLocation", rhsUnloadingLocation), lhsUnloadingLocation, rhsUnloadingLocation, (this.unloadingLocation!= null), (that.unloadingLocation!= null))) {
                return false;
            }
        }
        {
            LocationType lhsStorageLocation;
            lhsStorageLocation = this.getStorageLocation();
            LocationType rhsStorageLocation;
            rhsStorageLocation = that.getStorageLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "storageLocation", lhsStorageLocation), LocatorUtils.property(thatLocator, "storageLocation", rhsStorageLocation), lhsStorageLocation, rhsStorageLocation, (this.storageLocation!= null), (that.storageLocation!= null))) {
                return false;
            }
        }
        {
            List<TransportEventType> lhsPositioningTransportEvent;
            lhsPositioningTransportEvent = (((this.positioningTransportEvent!= null)&&(!this.positioningTransportEvent.isEmpty()))?this.getPositioningTransportEvent():null);
            List<TransportEventType> rhsPositioningTransportEvent;
            rhsPositioningTransportEvent = (((that.positioningTransportEvent!= null)&&(!that.positioningTransportEvent.isEmpty()))?that.getPositioningTransportEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "positioningTransportEvent", lhsPositioningTransportEvent), LocatorUtils.property(thatLocator, "positioningTransportEvent", rhsPositioningTransportEvent), lhsPositioningTransportEvent, rhsPositioningTransportEvent, ((this.positioningTransportEvent!= null)&&(!this.positioningTransportEvent.isEmpty())), ((that.positioningTransportEvent!= null)&&(!that.positioningTransportEvent.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransportEventType> lhsQuarantineTransportEvent;
            lhsQuarantineTransportEvent = (((this.quarantineTransportEvent!= null)&&(!this.quarantineTransportEvent.isEmpty()))?this.getQuarantineTransportEvent():null);
            List<TransportEventType> rhsQuarantineTransportEvent;
            rhsQuarantineTransportEvent = (((that.quarantineTransportEvent!= null)&&(!that.quarantineTransportEvent.isEmpty()))?that.getQuarantineTransportEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quarantineTransportEvent", lhsQuarantineTransportEvent), LocatorUtils.property(thatLocator, "quarantineTransportEvent", rhsQuarantineTransportEvent), lhsQuarantineTransportEvent, rhsQuarantineTransportEvent, ((this.quarantineTransportEvent!= null)&&(!this.quarantineTransportEvent.isEmpty())), ((that.quarantineTransportEvent!= null)&&(!that.quarantineTransportEvent.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransportEventType> lhsDeliveryTransportEvent;
            lhsDeliveryTransportEvent = (((this.deliveryTransportEvent!= null)&&(!this.deliveryTransportEvent.isEmpty()))?this.getDeliveryTransportEvent():null);
            List<TransportEventType> rhsDeliveryTransportEvent;
            rhsDeliveryTransportEvent = (((that.deliveryTransportEvent!= null)&&(!that.deliveryTransportEvent.isEmpty()))?that.getDeliveryTransportEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryTransportEvent", lhsDeliveryTransportEvent), LocatorUtils.property(thatLocator, "deliveryTransportEvent", rhsDeliveryTransportEvent), lhsDeliveryTransportEvent, rhsDeliveryTransportEvent, ((this.deliveryTransportEvent!= null)&&(!this.deliveryTransportEvent.isEmpty())), ((that.deliveryTransportEvent!= null)&&(!that.deliveryTransportEvent.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransportEventType> lhsPickupTransportEvent;
            lhsPickupTransportEvent = (((this.pickupTransportEvent!= null)&&(!this.pickupTransportEvent.isEmpty()))?this.getPickupTransportEvent():null);
            List<TransportEventType> rhsPickupTransportEvent;
            rhsPickupTransportEvent = (((that.pickupTransportEvent!= null)&&(!that.pickupTransportEvent.isEmpty()))?that.getPickupTransportEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pickupTransportEvent", lhsPickupTransportEvent), LocatorUtils.property(thatLocator, "pickupTransportEvent", rhsPickupTransportEvent), lhsPickupTransportEvent, rhsPickupTransportEvent, ((this.pickupTransportEvent!= null)&&(!this.pickupTransportEvent.isEmpty())), ((that.pickupTransportEvent!= null)&&(!that.pickupTransportEvent.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransportEventType> lhsHandlingTransportEvent;
            lhsHandlingTransportEvent = (((this.handlingTransportEvent!= null)&&(!this.handlingTransportEvent.isEmpty()))?this.getHandlingTransportEvent():null);
            List<TransportEventType> rhsHandlingTransportEvent;
            rhsHandlingTransportEvent = (((that.handlingTransportEvent!= null)&&(!that.handlingTransportEvent.isEmpty()))?that.getHandlingTransportEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handlingTransportEvent", lhsHandlingTransportEvent), LocatorUtils.property(thatLocator, "handlingTransportEvent", rhsHandlingTransportEvent), lhsHandlingTransportEvent, rhsHandlingTransportEvent, ((this.handlingTransportEvent!= null)&&(!this.handlingTransportEvent.isEmpty())), ((that.handlingTransportEvent!= null)&&(!that.handlingTransportEvent.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransportEventType> lhsLoadingTransportEvent;
            lhsLoadingTransportEvent = (((this.loadingTransportEvent!= null)&&(!this.loadingTransportEvent.isEmpty()))?this.getLoadingTransportEvent():null);
            List<TransportEventType> rhsLoadingTransportEvent;
            rhsLoadingTransportEvent = (((that.loadingTransportEvent!= null)&&(!that.loadingTransportEvent.isEmpty()))?that.getLoadingTransportEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loadingTransportEvent", lhsLoadingTransportEvent), LocatorUtils.property(thatLocator, "loadingTransportEvent", rhsLoadingTransportEvent), lhsLoadingTransportEvent, rhsLoadingTransportEvent, ((this.loadingTransportEvent!= null)&&(!this.loadingTransportEvent.isEmpty())), ((that.loadingTransportEvent!= null)&&(!that.loadingTransportEvent.isEmpty())))) {
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
            TransportMeansType lhsApplicableTransportMeans;
            lhsApplicableTransportMeans = this.getApplicableTransportMeans();
            TransportMeansType rhsApplicableTransportMeans;
            rhsApplicableTransportMeans = that.getApplicableTransportMeans();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applicableTransportMeans", lhsApplicableTransportMeans), LocatorUtils.property(thatLocator, "applicableTransportMeans", rhsApplicableTransportMeans), lhsApplicableTransportMeans, rhsApplicableTransportMeans, (this.applicableTransportMeans!= null), (that.applicableTransportMeans!= null))) {
                return false;
            }
        }
        {
            List<TradingTermsType> lhsHaulageTradingTerms;
            lhsHaulageTradingTerms = (((this.haulageTradingTerms!= null)&&(!this.haulageTradingTerms.isEmpty()))?this.getHaulageTradingTerms():null);
            List<TradingTermsType> rhsHaulageTradingTerms;
            rhsHaulageTradingTerms = (((that.haulageTradingTerms!= null)&&(!that.haulageTradingTerms.isEmpty()))?that.getHaulageTradingTerms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haulageTradingTerms", lhsHaulageTradingTerms), LocatorUtils.property(thatLocator, "haulageTradingTerms", rhsHaulageTradingTerms), lhsHaulageTradingTerms, rhsHaulageTradingTerms, ((this.haulageTradingTerms!= null)&&(!this.haulageTradingTerms.isEmpty())), ((that.haulageTradingTerms!= null)&&(!that.haulageTradingTerms.isEmpty())))) {
                return false;
            }
        }
        {
            List<HazardousGoodsTransitType> lhsHazardousGoodsTransit;
            lhsHazardousGoodsTransit = (((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty()))?this.getHazardousGoodsTransit():null);
            List<HazardousGoodsTransitType> rhsHazardousGoodsTransit;
            rhsHazardousGoodsTransit = (((that.hazardousGoodsTransit!= null)&&(!that.hazardousGoodsTransit.isEmpty()))?that.getHazardousGoodsTransit():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hazardousGoodsTransit", lhsHazardousGoodsTransit), LocatorUtils.property(thatLocator, "hazardousGoodsTransit", rhsHazardousGoodsTransit), lhsHazardousGoodsTransit, rhsHazardousGoodsTransit, ((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty())), ((that.hazardousGoodsTransit!= null)&&(!that.hazardousGoodsTransit.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransportHandlingUnitType> lhsPackagedTransportHandlingUnit;
            lhsPackagedTransportHandlingUnit = (((this.packagedTransportHandlingUnit!= null)&&(!this.packagedTransportHandlingUnit.isEmpty()))?this.getPackagedTransportHandlingUnit():null);
            List<TransportHandlingUnitType> rhsPackagedTransportHandlingUnit;
            rhsPackagedTransportHandlingUnit = (((that.packagedTransportHandlingUnit!= null)&&(!that.packagedTransportHandlingUnit.isEmpty()))?that.getPackagedTransportHandlingUnit():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packagedTransportHandlingUnit", lhsPackagedTransportHandlingUnit), LocatorUtils.property(thatLocator, "packagedTransportHandlingUnit", rhsPackagedTransportHandlingUnit), lhsPackagedTransportHandlingUnit, rhsPackagedTransportHandlingUnit, ((this.packagedTransportHandlingUnit!= null)&&(!this.packagedTransportHandlingUnit.isEmpty())), ((that.packagedTransportHandlingUnit!= null)&&(!that.packagedTransportHandlingUnit.isEmpty())))) {
                return false;
            }
        }
        {
            List<AllowanceChargeType> lhsServiceAllowanceCharge;
            lhsServiceAllowanceCharge = (((this.serviceAllowanceCharge!= null)&&(!this.serviceAllowanceCharge.isEmpty()))?this.getServiceAllowanceCharge():null);
            List<AllowanceChargeType> rhsServiceAllowanceCharge;
            rhsServiceAllowanceCharge = (((that.serviceAllowanceCharge!= null)&&(!that.serviceAllowanceCharge.isEmpty()))?that.getServiceAllowanceCharge():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceAllowanceCharge", lhsServiceAllowanceCharge), LocatorUtils.property(thatLocator, "serviceAllowanceCharge", rhsServiceAllowanceCharge), lhsServiceAllowanceCharge, rhsServiceAllowanceCharge, ((this.serviceAllowanceCharge!= null)&&(!this.serviceAllowanceCharge.isEmpty())), ((that.serviceAllowanceCharge!= null)&&(!that.serviceAllowanceCharge.isEmpty())))) {
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
            List<TransportEquipmentType> lhsAttachedTransportEquipment;
            lhsAttachedTransportEquipment = (((this.attachedTransportEquipment!= null)&&(!this.attachedTransportEquipment.isEmpty()))?this.getAttachedTransportEquipment():null);
            List<TransportEquipmentType> rhsAttachedTransportEquipment;
            rhsAttachedTransportEquipment = (((that.attachedTransportEquipment!= null)&&(!that.attachedTransportEquipment.isEmpty()))?that.getAttachedTransportEquipment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachedTransportEquipment", lhsAttachedTransportEquipment), LocatorUtils.property(thatLocator, "attachedTransportEquipment", rhsAttachedTransportEquipment), lhsAttachedTransportEquipment, rhsAttachedTransportEquipment, ((this.attachedTransportEquipment!= null)&&(!this.attachedTransportEquipment.isEmpty())), ((that.attachedTransportEquipment!= null)&&(!that.attachedTransportEquipment.isEmpty())))) {
                return false;
            }
        }
        {
            DeliveryType lhsDelivery;
            lhsDelivery = this.getDelivery();
            DeliveryType rhsDelivery;
            rhsDelivery = that.getDelivery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "delivery", lhsDelivery), LocatorUtils.property(thatLocator, "delivery", rhsDelivery), lhsDelivery, rhsDelivery, (this.delivery!= null), (that.delivery!= null))) {
                return false;
            }
        }
        {
            PickupType lhsPickup;
            lhsPickup = this.getPickup();
            PickupType rhsPickup;
            rhsPickup = that.getPickup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pickup", lhsPickup), LocatorUtils.property(thatLocator, "pickup", rhsPickup), lhsPickup, rhsPickup, (this.pickup!= null), (that.pickup!= null))) {
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
            List<DocumentReferenceType> lhsShipmentDocumentReference;
            lhsShipmentDocumentReference = (((this.shipmentDocumentReference!= null)&&(!this.shipmentDocumentReference.isEmpty()))?this.getShipmentDocumentReference():null);
            List<DocumentReferenceType> rhsShipmentDocumentReference;
            rhsShipmentDocumentReference = (((that.shipmentDocumentReference!= null)&&(!that.shipmentDocumentReference.isEmpty()))?that.getShipmentDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentDocumentReference", lhsShipmentDocumentReference), LocatorUtils.property(thatLocator, "shipmentDocumentReference", rhsShipmentDocumentReference), lhsShipmentDocumentReference, rhsShipmentDocumentReference, ((this.shipmentDocumentReference!= null)&&(!this.shipmentDocumentReference.isEmpty())), ((that.shipmentDocumentReference!= null)&&(!that.shipmentDocumentReference.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransportEquipmentType> lhsContainedInTransportEquipment;
            lhsContainedInTransportEquipment = (((this.containedInTransportEquipment!= null)&&(!this.containedInTransportEquipment.isEmpty()))?this.getContainedInTransportEquipment():null);
            List<TransportEquipmentType> rhsContainedInTransportEquipment;
            rhsContainedInTransportEquipment = (((that.containedInTransportEquipment!= null)&&(!that.containedInTransportEquipment.isEmpty()))?that.getContainedInTransportEquipment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "containedInTransportEquipment", lhsContainedInTransportEquipment), LocatorUtils.property(thatLocator, "containedInTransportEquipment", rhsContainedInTransportEquipment), lhsContainedInTransportEquipment, rhsContainedInTransportEquipment, ((this.containedInTransportEquipment!= null)&&(!this.containedInTransportEquipment.isEmpty())), ((that.containedInTransportEquipment!= null)&&(!that.containedInTransportEquipment.isEmpty())))) {
                return false;
            }
        }
        {
            List<PackageType> lhsPackage;
            lhsPackage = (((this._package!= null)&&(!this._package.isEmpty()))?this.getPackage():null);
            List<PackageType> rhsPackage;
            rhsPackage = (((that._package!= null)&&(!that._package.isEmpty()))?that.getPackage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_package", lhsPackage), LocatorUtils.property(thatLocator, "_package", rhsPackage), lhsPackage, rhsPackage, ((this._package!= null)&&(!this._package.isEmpty())), ((that._package!= null)&&(!that._package.isEmpty())))) {
                return false;
            }
        }
        {
            List<GoodsItemType> lhsGoodsItem;
            lhsGoodsItem = (((this.goodsItem!= null)&&(!this.goodsItem.isEmpty()))?this.getGoodsItem():null);
            List<GoodsItemType> rhsGoodsItem;
            rhsGoodsItem = (((that.goodsItem!= null)&&(!that.goodsItem.isEmpty()))?that.getGoodsItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "goodsItem", lhsGoodsItem), LocatorUtils.property(thatLocator, "goodsItem", rhsGoodsItem), lhsGoodsItem, rhsGoodsItem, ((this.goodsItem!= null)&&(!this.goodsItem.isEmpty())), ((that.goodsItem!= null)&&(!that.goodsItem.isEmpty())))) {
                return false;
            }
        }
        {
            VerifiedGrossMassType lhsVerifiedGrossMass;
            lhsVerifiedGrossMass = this.getVerifiedGrossMass();
            VerifiedGrossMassType rhsVerifiedGrossMass;
            rhsVerifiedGrossMass = that.getVerifiedGrossMass();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verifiedGrossMass", lhsVerifiedGrossMass), LocatorUtils.property(thatLocator, "verifiedGrossMass", rhsVerifiedGrossMass), lhsVerifiedGrossMass, rhsVerifiedGrossMass, (this.verifiedGrossMass!= null), (that.verifiedGrossMass!= null))) {
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
            List<ReferencedConsignmentIDType> theReferencedConsignmentID;
            theReferencedConsignmentID = (((this.referencedConsignmentID!= null)&&(!this.referencedConsignmentID.isEmpty()))?this.getReferencedConsignmentID():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referencedConsignmentID", theReferencedConsignmentID), currentHashCode, theReferencedConsignmentID, ((this.referencedConsignmentID!= null)&&(!this.referencedConsignmentID.isEmpty())));
        }
        {
            TransportEquipmentTypeCodeType theTransportEquipmentTypeCode;
            theTransportEquipmentTypeCode = this.getTransportEquipmentTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportEquipmentTypeCode", theTransportEquipmentTypeCode), currentHashCode, theTransportEquipmentTypeCode, (this.transportEquipmentTypeCode!= null));
        }
        {
            ProviderTypeCodeType theProviderTypeCode;
            theProviderTypeCode = this.getProviderTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "providerTypeCode", theProviderTypeCode), currentHashCode, theProviderTypeCode, (this.providerTypeCode!= null));
        }
        {
            OwnerTypeCodeType theOwnerTypeCode;
            theOwnerTypeCode = this.getOwnerTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ownerTypeCode", theOwnerTypeCode), currentHashCode, theOwnerTypeCode, (this.ownerTypeCode!= null));
        }
        {
            SizeTypeCodeType theSizeTypeCode;
            theSizeTypeCode = this.getSizeTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sizeTypeCode", theSizeTypeCode), currentHashCode, theSizeTypeCode, (this.sizeTypeCode!= null));
        }
        {
            DispositionCodeType theDispositionCode;
            theDispositionCode = this.getDispositionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dispositionCode", theDispositionCode), currentHashCode, theDispositionCode, (this.dispositionCode!= null));
        }
        {
            FullnessIndicationCodeType theFullnessIndicationCode;
            theFullnessIndicationCode = this.getFullnessIndicationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fullnessIndicationCode", theFullnessIndicationCode), currentHashCode, theFullnessIndicationCode, (this.fullnessIndicationCode!= null));
        }
        {
            RefrigerationOnIndicatorType theRefrigerationOnIndicator;
            theRefrigerationOnIndicator = this.getRefrigerationOnIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refrigerationOnIndicator", theRefrigerationOnIndicator), currentHashCode, theRefrigerationOnIndicator, (this.refrigerationOnIndicator!= null));
        }
        {
            List<InformationType> theInformation;
            theInformation = (((this.information!= null)&&(!this.information.isEmpty()))?this.getInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "information", theInformation), currentHashCode, theInformation, ((this.information!= null)&&(!this.information.isEmpty())));
        }
        {
            ReturnabilityIndicatorType theReturnabilityIndicator;
            theReturnabilityIndicator = this.getReturnabilityIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "returnabilityIndicator", theReturnabilityIndicator), currentHashCode, theReturnabilityIndicator, (this.returnabilityIndicator!= null));
        }
        {
            LegalStatusIndicatorType theLegalStatusIndicator;
            theLegalStatusIndicator = this.getLegalStatusIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legalStatusIndicator", theLegalStatusIndicator), currentHashCode, theLegalStatusIndicator, (this.legalStatusIndicator!= null));
        }
        {
            AirFlowPercentType theAirFlowPercent;
            theAirFlowPercent = this.getAirFlowPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airFlowPercent", theAirFlowPercent), currentHashCode, theAirFlowPercent, (this.airFlowPercent!= null));
        }
        {
            HumidityPercentType theHumidityPercent;
            theHumidityPercent = this.getHumidityPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "humidityPercent", theHumidityPercent), currentHashCode, theHumidityPercent, (this.humidityPercent!= null));
        }
        {
            AnimalFoodApprovedIndicatorType theAnimalFoodApprovedIndicator;
            theAnimalFoodApprovedIndicator = this.getAnimalFoodApprovedIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "animalFoodApprovedIndicator", theAnimalFoodApprovedIndicator), currentHashCode, theAnimalFoodApprovedIndicator, (this.animalFoodApprovedIndicator!= null));
        }
        {
            HumanFoodApprovedIndicatorType theHumanFoodApprovedIndicator;
            theHumanFoodApprovedIndicator = this.getHumanFoodApprovedIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "humanFoodApprovedIndicator", theHumanFoodApprovedIndicator), currentHashCode, theHumanFoodApprovedIndicator, (this.humanFoodApprovedIndicator!= null));
        }
        {
            DangerousGoodsApprovedIndicatorType theDangerousGoodsApprovedIndicator;
            theDangerousGoodsApprovedIndicator = this.getDangerousGoodsApprovedIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dangerousGoodsApprovedIndicator", theDangerousGoodsApprovedIndicator), currentHashCode, theDangerousGoodsApprovedIndicator, (this.dangerousGoodsApprovedIndicator!= null));
        }
        {
            RefrigeratedIndicatorType theRefrigeratedIndicator;
            theRefrigeratedIndicator = this.getRefrigeratedIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refrigeratedIndicator", theRefrigeratedIndicator), currentHashCode, theRefrigeratedIndicator, (this.refrigeratedIndicator!= null));
        }
        {
            CharacteristicsType theCharacteristics;
            theCharacteristics = this.getCharacteristics();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "characteristics", theCharacteristics), currentHashCode, theCharacteristics, (this.characteristics!= null));
        }
        {
            List<DamageRemarksType> theDamageRemarks;
            theDamageRemarks = (((this.damageRemarks!= null)&&(!this.damageRemarks.isEmpty()))?this.getDamageRemarks():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "damageRemarks", theDamageRemarks), currentHashCode, theDamageRemarks, ((this.damageRemarks!= null)&&(!this.damageRemarks.isEmpty())));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<SpecialTransportRequirementsType> theSpecialTransportRequirements;
            theSpecialTransportRequirements = (((this.specialTransportRequirements!= null)&&(!this.specialTransportRequirements.isEmpty()))?this.getSpecialTransportRequirements():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialTransportRequirements", theSpecialTransportRequirements), currentHashCode, theSpecialTransportRequirements, ((this.specialTransportRequirements!= null)&&(!this.specialTransportRequirements.isEmpty())));
        }
        {
            GrossWeightMeasureType theGrossWeightMeasure;
            theGrossWeightMeasure = this.getGrossWeightMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grossWeightMeasure", theGrossWeightMeasure), currentHashCode, theGrossWeightMeasure, (this.grossWeightMeasure!= null));
        }
        {
            GrossVolumeMeasureType theGrossVolumeMeasure;
            theGrossVolumeMeasure = this.getGrossVolumeMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grossVolumeMeasure", theGrossVolumeMeasure), currentHashCode, theGrossVolumeMeasure, (this.grossVolumeMeasure!= null));
        }
        {
            TareWeightMeasureType theTareWeightMeasure;
            theTareWeightMeasure = this.getTareWeightMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tareWeightMeasure", theTareWeightMeasure), currentHashCode, theTareWeightMeasure, (this.tareWeightMeasure!= null));
        }
        {
            TrackingDeviceCodeType theTrackingDeviceCode;
            theTrackingDeviceCode = this.getTrackingDeviceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackingDeviceCode", theTrackingDeviceCode), currentHashCode, theTrackingDeviceCode, (this.trackingDeviceCode!= null));
        }
        {
            PowerIndicatorType thePowerIndicator;
            thePowerIndicator = this.getPowerIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "powerIndicator", thePowerIndicator), currentHashCode, thePowerIndicator, (this.powerIndicator!= null));
        }
        {
            TraceIDType theTraceID;
            theTraceID = this.getTraceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "traceID", theTraceID), currentHashCode, theTraceID, (this.traceID!= null));
        }
        {
            List<DimensionType> theMeasurementDimension;
            theMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurementDimension", theMeasurementDimension), currentHashCode, theMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())));
        }
        {
            List<TransportEquipmentSealType> theTransportEquipmentSeal;
            theTransportEquipmentSeal = (((this.transportEquipmentSeal!= null)&&(!this.transportEquipmentSeal.isEmpty()))?this.getTransportEquipmentSeal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportEquipmentSeal", theTransportEquipmentSeal), currentHashCode, theTransportEquipmentSeal, ((this.transportEquipmentSeal!= null)&&(!this.transportEquipmentSeal.isEmpty())));
        }
        {
            TemperatureType theMinimumTemperature;
            theMinimumTemperature = this.getMinimumTemperature();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumTemperature", theMinimumTemperature), currentHashCode, theMinimumTemperature, (this.minimumTemperature!= null));
        }
        {
            TemperatureType theMaximumTemperature;
            theMaximumTemperature = this.getMaximumTemperature();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumTemperature", theMaximumTemperature), currentHashCode, theMaximumTemperature, (this.maximumTemperature!= null));
        }
        {
            PartyType theProviderParty;
            theProviderParty = this.getProviderParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "providerParty", theProviderParty), currentHashCode, theProviderParty, (this.providerParty!= null));
        }
        {
            PartyType theLoadingProofParty;
            theLoadingProofParty = this.getLoadingProofParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loadingProofParty", theLoadingProofParty), currentHashCode, theLoadingProofParty, (this.loadingProofParty!= null));
        }
        {
            SupplierPartyType theSupplierParty;
            theSupplierParty = this.getSupplierParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplierParty", theSupplierParty), currentHashCode, theSupplierParty, (this.supplierParty!= null));
        }
        {
            PartyType theOwnerParty;
            theOwnerParty = this.getOwnerParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ownerParty", theOwnerParty), currentHashCode, theOwnerParty, (this.ownerParty!= null));
        }
        {
            PartyType theOperatingParty;
            theOperatingParty = this.getOperatingParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operatingParty", theOperatingParty), currentHashCode, theOperatingParty, (this.operatingParty!= null));
        }
        {
            LocationType theLoadingLocation;
            theLoadingLocation = this.getLoadingLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loadingLocation", theLoadingLocation), currentHashCode, theLoadingLocation, (this.loadingLocation!= null));
        }
        {
            LocationType theUnloadingLocation;
            theUnloadingLocation = this.getUnloadingLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unloadingLocation", theUnloadingLocation), currentHashCode, theUnloadingLocation, (this.unloadingLocation!= null));
        }
        {
            LocationType theStorageLocation;
            theStorageLocation = this.getStorageLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "storageLocation", theStorageLocation), currentHashCode, theStorageLocation, (this.storageLocation!= null));
        }
        {
            List<TransportEventType> thePositioningTransportEvent;
            thePositioningTransportEvent = (((this.positioningTransportEvent!= null)&&(!this.positioningTransportEvent.isEmpty()))?this.getPositioningTransportEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "positioningTransportEvent", thePositioningTransportEvent), currentHashCode, thePositioningTransportEvent, ((this.positioningTransportEvent!= null)&&(!this.positioningTransportEvent.isEmpty())));
        }
        {
            List<TransportEventType> theQuarantineTransportEvent;
            theQuarantineTransportEvent = (((this.quarantineTransportEvent!= null)&&(!this.quarantineTransportEvent.isEmpty()))?this.getQuarantineTransportEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quarantineTransportEvent", theQuarantineTransportEvent), currentHashCode, theQuarantineTransportEvent, ((this.quarantineTransportEvent!= null)&&(!this.quarantineTransportEvent.isEmpty())));
        }
        {
            List<TransportEventType> theDeliveryTransportEvent;
            theDeliveryTransportEvent = (((this.deliveryTransportEvent!= null)&&(!this.deliveryTransportEvent.isEmpty()))?this.getDeliveryTransportEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryTransportEvent", theDeliveryTransportEvent), currentHashCode, theDeliveryTransportEvent, ((this.deliveryTransportEvent!= null)&&(!this.deliveryTransportEvent.isEmpty())));
        }
        {
            List<TransportEventType> thePickupTransportEvent;
            thePickupTransportEvent = (((this.pickupTransportEvent!= null)&&(!this.pickupTransportEvent.isEmpty()))?this.getPickupTransportEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pickupTransportEvent", thePickupTransportEvent), currentHashCode, thePickupTransportEvent, ((this.pickupTransportEvent!= null)&&(!this.pickupTransportEvent.isEmpty())));
        }
        {
            List<TransportEventType> theHandlingTransportEvent;
            theHandlingTransportEvent = (((this.handlingTransportEvent!= null)&&(!this.handlingTransportEvent.isEmpty()))?this.getHandlingTransportEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handlingTransportEvent", theHandlingTransportEvent), currentHashCode, theHandlingTransportEvent, ((this.handlingTransportEvent!= null)&&(!this.handlingTransportEvent.isEmpty())));
        }
        {
            List<TransportEventType> theLoadingTransportEvent;
            theLoadingTransportEvent = (((this.loadingTransportEvent!= null)&&(!this.loadingTransportEvent.isEmpty()))?this.getLoadingTransportEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loadingTransportEvent", theLoadingTransportEvent), currentHashCode, theLoadingTransportEvent, ((this.loadingTransportEvent!= null)&&(!this.loadingTransportEvent.isEmpty())));
        }
        {
            List<TransportEventType> theTransportEvent;
            theTransportEvent = (((this.transportEvent!= null)&&(!this.transportEvent.isEmpty()))?this.getTransportEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportEvent", theTransportEvent), currentHashCode, theTransportEvent, ((this.transportEvent!= null)&&(!this.transportEvent.isEmpty())));
        }
        {
            TransportMeansType theApplicableTransportMeans;
            theApplicableTransportMeans = this.getApplicableTransportMeans();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applicableTransportMeans", theApplicableTransportMeans), currentHashCode, theApplicableTransportMeans, (this.applicableTransportMeans!= null));
        }
        {
            List<TradingTermsType> theHaulageTradingTerms;
            theHaulageTradingTerms = (((this.haulageTradingTerms!= null)&&(!this.haulageTradingTerms.isEmpty()))?this.getHaulageTradingTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "haulageTradingTerms", theHaulageTradingTerms), currentHashCode, theHaulageTradingTerms, ((this.haulageTradingTerms!= null)&&(!this.haulageTradingTerms.isEmpty())));
        }
        {
            List<HazardousGoodsTransitType> theHazardousGoodsTransit;
            theHazardousGoodsTransit = (((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty()))?this.getHazardousGoodsTransit():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousGoodsTransit", theHazardousGoodsTransit), currentHashCode, theHazardousGoodsTransit, ((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty())));
        }
        {
            List<TransportHandlingUnitType> thePackagedTransportHandlingUnit;
            thePackagedTransportHandlingUnit = (((this.packagedTransportHandlingUnit!= null)&&(!this.packagedTransportHandlingUnit.isEmpty()))?this.getPackagedTransportHandlingUnit():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packagedTransportHandlingUnit", thePackagedTransportHandlingUnit), currentHashCode, thePackagedTransportHandlingUnit, ((this.packagedTransportHandlingUnit!= null)&&(!this.packagedTransportHandlingUnit.isEmpty())));
        }
        {
            List<AllowanceChargeType> theServiceAllowanceCharge;
            theServiceAllowanceCharge = (((this.serviceAllowanceCharge!= null)&&(!this.serviceAllowanceCharge.isEmpty()))?this.getServiceAllowanceCharge():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceAllowanceCharge", theServiceAllowanceCharge), currentHashCode, theServiceAllowanceCharge, ((this.serviceAllowanceCharge!= null)&&(!this.serviceAllowanceCharge.isEmpty())));
        }
        {
            List<AllowanceChargeType> theFreightAllowanceCharge;
            theFreightAllowanceCharge = (((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty()))?this.getFreightAllowanceCharge():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightAllowanceCharge", theFreightAllowanceCharge), currentHashCode, theFreightAllowanceCharge, ((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty())));
        }
        {
            List<TransportEquipmentType> theAttachedTransportEquipment;
            theAttachedTransportEquipment = (((this.attachedTransportEquipment!= null)&&(!this.attachedTransportEquipment.isEmpty()))?this.getAttachedTransportEquipment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachedTransportEquipment", theAttachedTransportEquipment), currentHashCode, theAttachedTransportEquipment, ((this.attachedTransportEquipment!= null)&&(!this.attachedTransportEquipment.isEmpty())));
        }
        {
            DeliveryType theDelivery;
            theDelivery = this.getDelivery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "delivery", theDelivery), currentHashCode, theDelivery, (this.delivery!= null));
        }
        {
            PickupType thePickup;
            thePickup = this.getPickup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pickup", thePickup), currentHashCode, thePickup, (this.pickup!= null));
        }
        {
            DespatchType theDespatch;
            theDespatch = this.getDespatch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "despatch", theDespatch), currentHashCode, theDespatch, (this.despatch!= null));
        }
        {
            List<DocumentReferenceType> theShipmentDocumentReference;
            theShipmentDocumentReference = (((this.shipmentDocumentReference!= null)&&(!this.shipmentDocumentReference.isEmpty()))?this.getShipmentDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentDocumentReference", theShipmentDocumentReference), currentHashCode, theShipmentDocumentReference, ((this.shipmentDocumentReference!= null)&&(!this.shipmentDocumentReference.isEmpty())));
        }
        {
            List<TransportEquipmentType> theContainedInTransportEquipment;
            theContainedInTransportEquipment = (((this.containedInTransportEquipment!= null)&&(!this.containedInTransportEquipment.isEmpty()))?this.getContainedInTransportEquipment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containedInTransportEquipment", theContainedInTransportEquipment), currentHashCode, theContainedInTransportEquipment, ((this.containedInTransportEquipment!= null)&&(!this.containedInTransportEquipment.isEmpty())));
        }
        {
            List<PackageType> thePackage;
            thePackage = (((this._package!= null)&&(!this._package.isEmpty()))?this.getPackage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_package", thePackage), currentHashCode, thePackage, ((this._package!= null)&&(!this._package.isEmpty())));
        }
        {
            List<GoodsItemType> theGoodsItem;
            theGoodsItem = (((this.goodsItem!= null)&&(!this.goodsItem.isEmpty()))?this.getGoodsItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "goodsItem", theGoodsItem), currentHashCode, theGoodsItem, ((this.goodsItem!= null)&&(!this.goodsItem.isEmpty())));
        }
        {
            VerifiedGrossMassType theVerifiedGrossMass;
            theVerifiedGrossMass = this.getVerifiedGrossMass();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verifiedGrossMass", theVerifiedGrossMass), currentHashCode, theVerifiedGrossMass, (this.verifiedGrossMass!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
