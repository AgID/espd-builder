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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AnimalFoodIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BrokerAssignedIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BulkCargoIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CarrierAssignedIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CarrierServiceInstructionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ChargeableWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ChildConsignmentQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsigneeAssignedIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsignmentQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsignorAssignedIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsolidatableIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ContainerizedIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ContractedCarrierAssignedIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CustomsClearanceServiceInstructionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DeclaredCustomsValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DeclaredForCarriageValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DeclaredStatisticsValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DeliveryInstructionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ForwarderServiceInstructionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FreeOnBoardValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FreightForwarderAssignedIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GeneralCargoIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GrossVolumeMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GrossWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HandlingCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HandlingInstructionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HaulageInstructionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HazardousRiskIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HumanFoodIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InformationType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InsurancePremiumAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InsuranceValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LivestockIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LoadingLengthMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LoadingSequenceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetNetWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetVolumeMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PerformingCarrierAssignedIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RemarksType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SequenceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ShippingPriorityLevelCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SpecialInstructionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SpecialSecurityIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SpecialServiceInstructionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SplitConsignmentIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SummaryDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TariffCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TariffDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ThirdPartyPayerIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalGoodsItemQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalInvoiceAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalPackagesQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalTransportHandlingUnitQuantityType;
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
 * <p>Classe Java per ConsignmentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConsignmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CarrierAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsigneeAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsignorAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FreightForwarderAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BrokerAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContractedCarrierAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerformingCarrierAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SummaryDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalInvoiceAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredCustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TariffDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TariffCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InsurancePremiumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetNetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChargeableWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LoadingLengthMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Remarks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRiskIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AnimalFoodIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HumanFoodIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LivestockIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BulkCargoIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContainerizedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GeneralCargoIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialSecurityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThirdPartyPayerIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CarrierServiceInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomsClearanceServiceInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForwarderServiceInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialServiceInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShippingPriorityLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HandlingCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HandlingInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Information" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalGoodsItemQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalTransportHandlingUnitQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InsuranceValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredForCarriageValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredStatisticsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FreeOnBoardValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SplitConsignmentIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeliveryInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsignmentQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsolidatableIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HaulageInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LoadingSequenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChildConsignmentQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalPackagesQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsolidatedShipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CustomsDeclaration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedPickupTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedDeliveryTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedPickupTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedDeliveryTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualPickupTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualDeliveryTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Status" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ChildConsignment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsigneeParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExporterParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsignorParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ImporterParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CarrierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightForwarderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotifyParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginalDespatchParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinalDeliveryParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PerformingCarrierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubstituteCarrierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LogisticsOperatorParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportAdvisorParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HazardousItemNotificationParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InsuranceParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MortgageHolderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BillOfLadingHolderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginalDepartureCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinalDestinationCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransitCountry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportContract" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginalDespatchTransportationService" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinalDeliveryTransportationService" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CollectPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DisbursementPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PrepaidPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExtraAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MainCarriageShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PreCarriageShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OnCarriageShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportHandlingUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FirstArrivalPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LastExitPortLocation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsignmentType", propOrder = {
    "id",
    "carrierAssignedID",
    "consigneeAssignedID",
    "consignorAssignedID",
    "freightForwarderAssignedID",
    "brokerAssignedID",
    "contractedCarrierAssignedID",
    "performingCarrierAssignedID",
    "summaryDescription",
    "totalInvoiceAmount",
    "declaredCustomsValueAmount",
    "tariffDescription",
    "tariffCode",
    "insurancePremiumAmount",
    "grossWeightMeasure",
    "netWeightMeasure",
    "netNetWeightMeasure",
    "chargeableWeightMeasure",
    "grossVolumeMeasure",
    "netVolumeMeasure",
    "loadingLengthMeasure",
    "remarks",
    "hazardousRiskIndicator",
    "animalFoodIndicator",
    "humanFoodIndicator",
    "livestockIndicator",
    "bulkCargoIndicator",
    "containerizedIndicator",
    "generalCargoIndicator",
    "specialSecurityIndicator",
    "thirdPartyPayerIndicator",
    "carrierServiceInstructions",
    "customsClearanceServiceInstructions",
    "forwarderServiceInstructions",
    "specialServiceInstructions",
    "sequenceID",
    "shippingPriorityLevelCode",
    "handlingCode",
    "handlingInstructions",
    "information",
    "totalGoodsItemQuantity",
    "totalTransportHandlingUnitQuantity",
    "insuranceValueAmount",
    "declaredForCarriageValueAmount",
    "declaredStatisticsValueAmount",
    "freeOnBoardValueAmount",
    "specialInstructions",
    "splitConsignmentIndicator",
    "deliveryInstructions",
    "consignmentQuantity",
    "consolidatableIndicator",
    "haulageInstructions",
    "loadingSequenceID",
    "childConsignmentQuantity",
    "totalPackagesQuantity",
    "consolidatedShipment",
    "customsDeclaration",
    "requestedPickupTransportEvent",
    "requestedDeliveryTransportEvent",
    "plannedPickupTransportEvent",
    "plannedDeliveryTransportEvent",
    "actualPickupTransportEvent",
    "actualDeliveryTransportEvent",
    "status",
    "childConsignment",
    "consigneeParty",
    "exporterParty",
    "consignorParty",
    "importerParty",
    "carrierParty",
    "freightForwarderParty",
    "notifyParty",
    "originalDespatchParty",
    "finalDeliveryParty",
    "performingCarrierParty",
    "substituteCarrierParty",
    "logisticsOperatorParty",
    "transportAdvisorParty",
    "hazardousItemNotificationParty",
    "insuranceParty",
    "mortgageHolderParty",
    "billOfLadingHolderParty",
    "originalDepartureCountry",
    "finalDestinationCountry",
    "transitCountry",
    "transportContract",
    "transportEvent",
    "originalDespatchTransportationService",
    "finalDeliveryTransportationService",
    "deliveryTerms",
    "paymentTerms",
    "collectPaymentTerms",
    "disbursementPaymentTerms",
    "prepaidPaymentTerms",
    "freightAllowanceCharge",
    "extraAllowanceCharge",
    "mainCarriageShipmentStage",
    "preCarriageShipmentStage",
    "onCarriageShipmentStage",
    "transportHandlingUnit",
    "firstArrivalPortLocation",
    "lastExitPortLocation"
})
public class ConsignmentType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "CarrierAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CarrierAssignedIDType carrierAssignedID;
    @XmlElement(name = "ConsigneeAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsigneeAssignedIDType consigneeAssignedID;
    @XmlElement(name = "ConsignorAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsignorAssignedIDType consignorAssignedID;
    @XmlElement(name = "FreightForwarderAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FreightForwarderAssignedIDType freightForwarderAssignedID;
    @XmlElement(name = "BrokerAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BrokerAssignedIDType brokerAssignedID;
    @XmlElement(name = "ContractedCarrierAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ContractedCarrierAssignedIDType contractedCarrierAssignedID;
    @XmlElement(name = "PerformingCarrierAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PerformingCarrierAssignedIDType performingCarrierAssignedID;
    @XmlElement(name = "SummaryDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<SummaryDescriptionType> summaryDescription;
    @XmlElement(name = "TotalInvoiceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalInvoiceAmountType totalInvoiceAmount;
    @XmlElement(name = "DeclaredCustomsValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclaredCustomsValueAmountType declaredCustomsValueAmount;
    @XmlElement(name = "TariffDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<TariffDescriptionType> tariffDescription;
    @XmlElement(name = "TariffCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TariffCodeType tariffCode;
    @XmlElement(name = "InsurancePremiumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InsurancePremiumAmountType insurancePremiumAmount;
    @XmlElement(name = "GrossWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GrossWeightMeasureType grossWeightMeasure;
    @XmlElement(name = "NetWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetWeightMeasureType netWeightMeasure;
    @XmlElement(name = "NetNetWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetNetWeightMeasureType netNetWeightMeasure;
    @XmlElement(name = "ChargeableWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ChargeableWeightMeasureType chargeableWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GrossVolumeMeasureType grossVolumeMeasure;
    @XmlElement(name = "NetVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetVolumeMeasureType netVolumeMeasure;
    @XmlElement(name = "LoadingLengthMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LoadingLengthMeasureType loadingLengthMeasure;
    @XmlElement(name = "Remarks", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<RemarksType> remarks;
    @XmlElement(name = "HazardousRiskIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardousRiskIndicatorType hazardousRiskIndicator;
    @XmlElement(name = "AnimalFoodIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AnimalFoodIndicatorType animalFoodIndicator;
    @XmlElement(name = "HumanFoodIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HumanFoodIndicatorType humanFoodIndicator;
    @XmlElement(name = "LivestockIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LivestockIndicatorType livestockIndicator;
    @XmlElement(name = "BulkCargoIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BulkCargoIndicatorType bulkCargoIndicator;
    @XmlElement(name = "ContainerizedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ContainerizedIndicatorType containerizedIndicator;
    @XmlElement(name = "GeneralCargoIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GeneralCargoIndicatorType generalCargoIndicator;
    @XmlElement(name = "SpecialSecurityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SpecialSecurityIndicatorType specialSecurityIndicator;
    @XmlElement(name = "ThirdPartyPayerIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ThirdPartyPayerIndicatorType thirdPartyPayerIndicator;
    @XmlElement(name = "CarrierServiceInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<CarrierServiceInstructionsType> carrierServiceInstructions;
    @XmlElement(name = "CustomsClearanceServiceInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<CustomsClearanceServiceInstructionsType> customsClearanceServiceInstructions;
    @XmlElement(name = "ForwarderServiceInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ForwarderServiceInstructionsType> forwarderServiceInstructions;
    @XmlElement(name = "SpecialServiceInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<SpecialServiceInstructionsType> specialServiceInstructions;
    @XmlElement(name = "SequenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SequenceIDType sequenceID;
    @XmlElement(name = "ShippingPriorityLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ShippingPriorityLevelCodeType shippingPriorityLevelCode;
    @XmlElement(name = "HandlingCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HandlingCodeType handlingCode;
    @XmlElement(name = "HandlingInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<HandlingInstructionsType> handlingInstructions;
    @XmlElement(name = "Information", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<InformationType> information;
    @XmlElement(name = "TotalGoodsItemQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalGoodsItemQuantityType totalGoodsItemQuantity;
    @XmlElement(name = "TotalTransportHandlingUnitQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalTransportHandlingUnitQuantityType totalTransportHandlingUnitQuantity;
    @XmlElement(name = "InsuranceValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InsuranceValueAmountType insuranceValueAmount;
    @XmlElement(name = "DeclaredForCarriageValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclaredForCarriageValueAmountType declaredForCarriageValueAmount;
    @XmlElement(name = "DeclaredStatisticsValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclaredStatisticsValueAmountType declaredStatisticsValueAmount;
    @XmlElement(name = "FreeOnBoardValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FreeOnBoardValueAmountType freeOnBoardValueAmount;
    @XmlElement(name = "SpecialInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "SplitConsignmentIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SplitConsignmentIndicatorType splitConsignmentIndicator;
    @XmlElement(name = "DeliveryInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DeliveryInstructionsType> deliveryInstructions;
    @XmlElement(name = "ConsignmentQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsignmentQuantityType consignmentQuantity;
    @XmlElement(name = "ConsolidatableIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsolidatableIndicatorType consolidatableIndicator;
    @XmlElement(name = "HaulageInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<HaulageInstructionsType> haulageInstructions;
    @XmlElement(name = "LoadingSequenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LoadingSequenceIDType loadingSequenceID;
    @XmlElement(name = "ChildConsignmentQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ChildConsignmentQuantityType childConsignmentQuantity;
    @XmlElement(name = "TotalPackagesQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalPackagesQuantityType totalPackagesQuantity;
    @XmlElement(name = "ConsolidatedShipment")
    protected List<ShipmentType> consolidatedShipment;
    @XmlElement(name = "CustomsDeclaration")
    protected List<CustomsDeclarationType> customsDeclaration;
    @XmlElement(name = "RequestedPickupTransportEvent")
    protected TransportEventType requestedPickupTransportEvent;
    @XmlElement(name = "RequestedDeliveryTransportEvent")
    protected TransportEventType requestedDeliveryTransportEvent;
    @XmlElement(name = "PlannedPickupTransportEvent")
    protected TransportEventType plannedPickupTransportEvent;
    @XmlElement(name = "PlannedDeliveryTransportEvent")
    protected TransportEventType plannedDeliveryTransportEvent;
    @XmlElement(name = "ActualPickupTransportEvent")
    protected TransportEventType actualPickupTransportEvent;
    @XmlElement(name = "ActualDeliveryTransportEvent")
    protected TransportEventType actualDeliveryTransportEvent;
    @XmlElement(name = "Status")
    protected List<StatusType> status;
    @XmlElement(name = "ChildConsignment")
    protected List<ConsignmentType> childConsignment;
    @XmlElement(name = "ConsigneeParty")
    protected PartyType consigneeParty;
    @XmlElement(name = "ExporterParty")
    protected PartyType exporterParty;
    @XmlElement(name = "ConsignorParty")
    protected PartyType consignorParty;
    @XmlElement(name = "ImporterParty")
    protected PartyType importerParty;
    @XmlElement(name = "CarrierParty")
    protected PartyType carrierParty;
    @XmlElement(name = "FreightForwarderParty")
    protected PartyType freightForwarderParty;
    @XmlElement(name = "NotifyParty")
    protected PartyType notifyParty;
    @XmlElement(name = "OriginalDespatchParty")
    protected PartyType originalDespatchParty;
    @XmlElement(name = "FinalDeliveryParty")
    protected PartyType finalDeliveryParty;
    @XmlElement(name = "PerformingCarrierParty")
    protected PartyType performingCarrierParty;
    @XmlElement(name = "SubstituteCarrierParty")
    protected PartyType substituteCarrierParty;
    @XmlElement(name = "LogisticsOperatorParty")
    protected PartyType logisticsOperatorParty;
    @XmlElement(name = "TransportAdvisorParty")
    protected PartyType transportAdvisorParty;
    @XmlElement(name = "HazardousItemNotificationParty")
    protected PartyType hazardousItemNotificationParty;
    @XmlElement(name = "InsuranceParty")
    protected PartyType insuranceParty;
    @XmlElement(name = "MortgageHolderParty")
    protected PartyType mortgageHolderParty;
    @XmlElement(name = "BillOfLadingHolderParty")
    protected PartyType billOfLadingHolderParty;
    @XmlElement(name = "OriginalDepartureCountry")
    protected CountryType originalDepartureCountry;
    @XmlElement(name = "FinalDestinationCountry")
    protected CountryType finalDestinationCountry;
    @XmlElement(name = "TransitCountry")
    protected List<CountryType> transitCountry;
    @XmlElement(name = "TransportContract")
    protected ContractType transportContract;
    @XmlElement(name = "TransportEvent")
    protected List<TransportEventType> transportEvent;
    @XmlElement(name = "OriginalDespatchTransportationService")
    protected TransportationServiceType originalDespatchTransportationService;
    @XmlElement(name = "FinalDeliveryTransportationService")
    protected TransportationServiceType finalDeliveryTransportationService;
    @XmlElement(name = "DeliveryTerms")
    protected DeliveryTermsType deliveryTerms;
    @XmlElement(name = "PaymentTerms")
    protected PaymentTermsType paymentTerms;
    @XmlElement(name = "CollectPaymentTerms")
    protected PaymentTermsType collectPaymentTerms;
    @XmlElement(name = "DisbursementPaymentTerms")
    protected PaymentTermsType disbursementPaymentTerms;
    @XmlElement(name = "PrepaidPaymentTerms")
    protected PaymentTermsType prepaidPaymentTerms;
    @XmlElement(name = "FreightAllowanceCharge")
    protected List<AllowanceChargeType> freightAllowanceCharge;
    @XmlElement(name = "ExtraAllowanceCharge")
    protected List<AllowanceChargeType> extraAllowanceCharge;
    @XmlElement(name = "MainCarriageShipmentStage")
    protected List<ShipmentStageType> mainCarriageShipmentStage;
    @XmlElement(name = "PreCarriageShipmentStage")
    protected List<ShipmentStageType> preCarriageShipmentStage;
    @XmlElement(name = "OnCarriageShipmentStage")
    protected List<ShipmentStageType> onCarriageShipmentStage;
    @XmlElement(name = "TransportHandlingUnit")
    protected List<TransportHandlingUnitType> transportHandlingUnit;
    @XmlElement(name = "FirstArrivalPortLocation")
    protected LocationType firstArrivalPortLocation;
    @XmlElement(name = "LastExitPortLocation")
    protected LocationType lastExitPortLocation;

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
     * Recupera il valore della proprietà carrierAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link CarrierAssignedIDType }
     *     
     */
    public CarrierAssignedIDType getCarrierAssignedID() {
        return carrierAssignedID;
    }

    /**
     * Imposta il valore della proprietà carrierAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierAssignedIDType }
     *     
     */
    public void setCarrierAssignedID(CarrierAssignedIDType value) {
        this.carrierAssignedID = value;
    }

    /**
     * Recupera il valore della proprietà consigneeAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link ConsigneeAssignedIDType }
     *     
     */
    public ConsigneeAssignedIDType getConsigneeAssignedID() {
        return consigneeAssignedID;
    }

    /**
     * Imposta il valore della proprietà consigneeAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsigneeAssignedIDType }
     *     
     */
    public void setConsigneeAssignedID(ConsigneeAssignedIDType value) {
        this.consigneeAssignedID = value;
    }

    /**
     * Recupera il valore della proprietà consignorAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link ConsignorAssignedIDType }
     *     
     */
    public ConsignorAssignedIDType getConsignorAssignedID() {
        return consignorAssignedID;
    }

    /**
     * Imposta il valore della proprietà consignorAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignorAssignedIDType }
     *     
     */
    public void setConsignorAssignedID(ConsignorAssignedIDType value) {
        this.consignorAssignedID = value;
    }

    /**
     * Recupera il valore della proprietà freightForwarderAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link FreightForwarderAssignedIDType }
     *     
     */
    public FreightForwarderAssignedIDType getFreightForwarderAssignedID() {
        return freightForwarderAssignedID;
    }

    /**
     * Imposta il valore della proprietà freightForwarderAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightForwarderAssignedIDType }
     *     
     */
    public void setFreightForwarderAssignedID(FreightForwarderAssignedIDType value) {
        this.freightForwarderAssignedID = value;
    }

    /**
     * Recupera il valore della proprietà brokerAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link BrokerAssignedIDType }
     *     
     */
    public BrokerAssignedIDType getBrokerAssignedID() {
        return brokerAssignedID;
    }

    /**
     * Imposta il valore della proprietà brokerAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerAssignedIDType }
     *     
     */
    public void setBrokerAssignedID(BrokerAssignedIDType value) {
        this.brokerAssignedID = value;
    }

    /**
     * Recupera il valore della proprietà contractedCarrierAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link ContractedCarrierAssignedIDType }
     *     
     */
    public ContractedCarrierAssignedIDType getContractedCarrierAssignedID() {
        return contractedCarrierAssignedID;
    }

    /**
     * Imposta il valore della proprietà contractedCarrierAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractedCarrierAssignedIDType }
     *     
     */
    public void setContractedCarrierAssignedID(ContractedCarrierAssignedIDType value) {
        this.contractedCarrierAssignedID = value;
    }

    /**
     * Recupera il valore della proprietà performingCarrierAssignedID.
     * 
     * @return
     *     possible object is
     *     {@link PerformingCarrierAssignedIDType }
     *     
     */
    public PerformingCarrierAssignedIDType getPerformingCarrierAssignedID() {
        return performingCarrierAssignedID;
    }

    /**
     * Imposta il valore della proprietà performingCarrierAssignedID.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformingCarrierAssignedIDType }
     *     
     */
    public void setPerformingCarrierAssignedID(PerformingCarrierAssignedIDType value) {
        this.performingCarrierAssignedID = value;
    }

    /**
     * Gets the value of the summaryDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummaryDescriptionType }
     * 
     * 
     */
    public List<SummaryDescriptionType> getSummaryDescription() {
        if (summaryDescription == null) {
            summaryDescription = new ArrayList<SummaryDescriptionType>();
        }
        return this.summaryDescription;
    }

    /**
     * Recupera il valore della proprietà totalInvoiceAmount.
     * 
     * @return
     *     possible object is
     *     {@link TotalInvoiceAmountType }
     *     
     */
    public TotalInvoiceAmountType getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    /**
     * Imposta il valore della proprietà totalInvoiceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalInvoiceAmountType }
     *     
     */
    public void setTotalInvoiceAmount(TotalInvoiceAmountType value) {
        this.totalInvoiceAmount = value;
    }

    /**
     * Recupera il valore della proprietà declaredCustomsValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredCustomsValueAmountType }
     *     
     */
    public DeclaredCustomsValueAmountType getDeclaredCustomsValueAmount() {
        return declaredCustomsValueAmount;
    }

    /**
     * Imposta il valore della proprietà declaredCustomsValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredCustomsValueAmountType }
     *     
     */
    public void setDeclaredCustomsValueAmount(DeclaredCustomsValueAmountType value) {
        this.declaredCustomsValueAmount = value;
    }

    /**
     * Gets the value of the tariffDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffDescriptionType }
     * 
     * 
     */
    public List<TariffDescriptionType> getTariffDescription() {
        if (tariffDescription == null) {
            tariffDescription = new ArrayList<TariffDescriptionType>();
        }
        return this.tariffDescription;
    }

    /**
     * Recupera il valore della proprietà tariffCode.
     * 
     * @return
     *     possible object is
     *     {@link TariffCodeType }
     *     
     */
    public TariffCodeType getTariffCode() {
        return tariffCode;
    }

    /**
     * Imposta il valore della proprietà tariffCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffCodeType }
     *     
     */
    public void setTariffCode(TariffCodeType value) {
        this.tariffCode = value;
    }

    /**
     * Recupera il valore della proprietà insurancePremiumAmount.
     * 
     * @return
     *     possible object is
     *     {@link InsurancePremiumAmountType }
     *     
     */
    public InsurancePremiumAmountType getInsurancePremiumAmount() {
        return insurancePremiumAmount;
    }

    /**
     * Imposta il valore della proprietà insurancePremiumAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurancePremiumAmountType }
     *     
     */
    public void setInsurancePremiumAmount(InsurancePremiumAmountType value) {
        this.insurancePremiumAmount = value;
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
     * Recupera il valore della proprietà netWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link NetWeightMeasureType }
     *     
     */
    public NetWeightMeasureType getNetWeightMeasure() {
        return netWeightMeasure;
    }

    /**
     * Imposta il valore della proprietà netWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link NetWeightMeasureType }
     *     
     */
    public void setNetWeightMeasure(NetWeightMeasureType value) {
        this.netWeightMeasure = value;
    }

    /**
     * Recupera il valore della proprietà netNetWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link NetNetWeightMeasureType }
     *     
     */
    public NetNetWeightMeasureType getNetNetWeightMeasure() {
        return netNetWeightMeasure;
    }

    /**
     * Imposta il valore della proprietà netNetWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link NetNetWeightMeasureType }
     *     
     */
    public void setNetNetWeightMeasure(NetNetWeightMeasureType value) {
        this.netNetWeightMeasure = value;
    }

    /**
     * Recupera il valore della proprietà chargeableWeightMeasure.
     * 
     * @return
     *     possible object is
     *     {@link ChargeableWeightMeasureType }
     *     
     */
    public ChargeableWeightMeasureType getChargeableWeightMeasure() {
        return chargeableWeightMeasure;
    }

    /**
     * Imposta il valore della proprietà chargeableWeightMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeableWeightMeasureType }
     *     
     */
    public void setChargeableWeightMeasure(ChargeableWeightMeasureType value) {
        this.chargeableWeightMeasure = value;
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
     * Recupera il valore della proprietà netVolumeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link NetVolumeMeasureType }
     *     
     */
    public NetVolumeMeasureType getNetVolumeMeasure() {
        return netVolumeMeasure;
    }

    /**
     * Imposta il valore della proprietà netVolumeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link NetVolumeMeasureType }
     *     
     */
    public void setNetVolumeMeasure(NetVolumeMeasureType value) {
        this.netVolumeMeasure = value;
    }

    /**
     * Recupera il valore della proprietà loadingLengthMeasure.
     * 
     * @return
     *     possible object is
     *     {@link LoadingLengthMeasureType }
     *     
     */
    public LoadingLengthMeasureType getLoadingLengthMeasure() {
        return loadingLengthMeasure;
    }

    /**
     * Imposta il valore della proprietà loadingLengthMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadingLengthMeasureType }
     *     
     */
    public void setLoadingLengthMeasure(LoadingLengthMeasureType value) {
        this.loadingLengthMeasure = value;
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
     * Recupera il valore della proprietà hazardousRiskIndicator.
     * 
     * @return
     *     possible object is
     *     {@link HazardousRiskIndicatorType }
     *     
     */
    public HazardousRiskIndicatorType getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Imposta il valore della proprietà hazardousRiskIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousRiskIndicatorType }
     *     
     */
    public void setHazardousRiskIndicator(HazardousRiskIndicatorType value) {
        this.hazardousRiskIndicator = value;
    }

    /**
     * Recupera il valore della proprietà animalFoodIndicator.
     * 
     * @return
     *     possible object is
     *     {@link AnimalFoodIndicatorType }
     *     
     */
    public AnimalFoodIndicatorType getAnimalFoodIndicator() {
        return animalFoodIndicator;
    }

    /**
     * Imposta il valore della proprietà animalFoodIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalFoodIndicatorType }
     *     
     */
    public void setAnimalFoodIndicator(AnimalFoodIndicatorType value) {
        this.animalFoodIndicator = value;
    }

    /**
     * Recupera il valore della proprietà humanFoodIndicator.
     * 
     * @return
     *     possible object is
     *     {@link HumanFoodIndicatorType }
     *     
     */
    public HumanFoodIndicatorType getHumanFoodIndicator() {
        return humanFoodIndicator;
    }

    /**
     * Imposta il valore della proprietà humanFoodIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanFoodIndicatorType }
     *     
     */
    public void setHumanFoodIndicator(HumanFoodIndicatorType value) {
        this.humanFoodIndicator = value;
    }

    /**
     * Recupera il valore della proprietà livestockIndicator.
     * 
     * @return
     *     possible object is
     *     {@link LivestockIndicatorType }
     *     
     */
    public LivestockIndicatorType getLivestockIndicator() {
        return livestockIndicator;
    }

    /**
     * Imposta il valore della proprietà livestockIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link LivestockIndicatorType }
     *     
     */
    public void setLivestockIndicator(LivestockIndicatorType value) {
        this.livestockIndicator = value;
    }

    /**
     * Recupera il valore della proprietà bulkCargoIndicator.
     * 
     * @return
     *     possible object is
     *     {@link BulkCargoIndicatorType }
     *     
     */
    public BulkCargoIndicatorType getBulkCargoIndicator() {
        return bulkCargoIndicator;
    }

    /**
     * Imposta il valore della proprietà bulkCargoIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkCargoIndicatorType }
     *     
     */
    public void setBulkCargoIndicator(BulkCargoIndicatorType value) {
        this.bulkCargoIndicator = value;
    }

    /**
     * Recupera il valore della proprietà containerizedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ContainerizedIndicatorType }
     *     
     */
    public ContainerizedIndicatorType getContainerizedIndicator() {
        return containerizedIndicator;
    }

    /**
     * Imposta il valore della proprietà containerizedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerizedIndicatorType }
     *     
     */
    public void setContainerizedIndicator(ContainerizedIndicatorType value) {
        this.containerizedIndicator = value;
    }

    /**
     * Recupera il valore della proprietà generalCargoIndicator.
     * 
     * @return
     *     possible object is
     *     {@link GeneralCargoIndicatorType }
     *     
     */
    public GeneralCargoIndicatorType getGeneralCargoIndicator() {
        return generalCargoIndicator;
    }

    /**
     * Imposta il valore della proprietà generalCargoIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralCargoIndicatorType }
     *     
     */
    public void setGeneralCargoIndicator(GeneralCargoIndicatorType value) {
        this.generalCargoIndicator = value;
    }

    /**
     * Recupera il valore della proprietà specialSecurityIndicator.
     * 
     * @return
     *     possible object is
     *     {@link SpecialSecurityIndicatorType }
     *     
     */
    public SpecialSecurityIndicatorType getSpecialSecurityIndicator() {
        return specialSecurityIndicator;
    }

    /**
     * Imposta il valore della proprietà specialSecurityIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialSecurityIndicatorType }
     *     
     */
    public void setSpecialSecurityIndicator(SpecialSecurityIndicatorType value) {
        this.specialSecurityIndicator = value;
    }

    /**
     * Recupera il valore della proprietà thirdPartyPayerIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyPayerIndicatorType }
     *     
     */
    public ThirdPartyPayerIndicatorType getThirdPartyPayerIndicator() {
        return thirdPartyPayerIndicator;
    }

    /**
     * Imposta il valore della proprietà thirdPartyPayerIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyPayerIndicatorType }
     *     
     */
    public void setThirdPartyPayerIndicator(ThirdPartyPayerIndicatorType value) {
        this.thirdPartyPayerIndicator = value;
    }

    /**
     * Gets the value of the carrierServiceInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierServiceInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierServiceInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierServiceInstructionsType }
     * 
     * 
     */
    public List<CarrierServiceInstructionsType> getCarrierServiceInstructions() {
        if (carrierServiceInstructions == null) {
            carrierServiceInstructions = new ArrayList<CarrierServiceInstructionsType>();
        }
        return this.carrierServiceInstructions;
    }

    /**
     * Gets the value of the customsClearanceServiceInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsClearanceServiceInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsClearanceServiceInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsClearanceServiceInstructionsType }
     * 
     * 
     */
    public List<CustomsClearanceServiceInstructionsType> getCustomsClearanceServiceInstructions() {
        if (customsClearanceServiceInstructions == null) {
            customsClearanceServiceInstructions = new ArrayList<CustomsClearanceServiceInstructionsType>();
        }
        return this.customsClearanceServiceInstructions;
    }

    /**
     * Gets the value of the forwarderServiceInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forwarderServiceInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForwarderServiceInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForwarderServiceInstructionsType }
     * 
     * 
     */
    public List<ForwarderServiceInstructionsType> getForwarderServiceInstructions() {
        if (forwarderServiceInstructions == null) {
            forwarderServiceInstructions = new ArrayList<ForwarderServiceInstructionsType>();
        }
        return this.forwarderServiceInstructions;
    }

    /**
     * Gets the value of the specialServiceInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialServiceInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialServiceInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialServiceInstructionsType }
     * 
     * 
     */
    public List<SpecialServiceInstructionsType> getSpecialServiceInstructions() {
        if (specialServiceInstructions == null) {
            specialServiceInstructions = new ArrayList<SpecialServiceInstructionsType>();
        }
        return this.specialServiceInstructions;
    }

    /**
     * Recupera il valore della proprietà sequenceID.
     * 
     * @return
     *     possible object is
     *     {@link SequenceIDType }
     *     
     */
    public SequenceIDType getSequenceID() {
        return sequenceID;
    }

    /**
     * Imposta il valore della proprietà sequenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceIDType }
     *     
     */
    public void setSequenceID(SequenceIDType value) {
        this.sequenceID = value;
    }

    /**
     * Recupera il valore della proprietà shippingPriorityLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link ShippingPriorityLevelCodeType }
     *     
     */
    public ShippingPriorityLevelCodeType getShippingPriorityLevelCode() {
        return shippingPriorityLevelCode;
    }

    /**
     * Imposta il valore della proprietà shippingPriorityLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPriorityLevelCodeType }
     *     
     */
    public void setShippingPriorityLevelCode(ShippingPriorityLevelCodeType value) {
        this.shippingPriorityLevelCode = value;
    }

    /**
     * Recupera il valore della proprietà handlingCode.
     * 
     * @return
     *     possible object is
     *     {@link HandlingCodeType }
     *     
     */
    public HandlingCodeType getHandlingCode() {
        return handlingCode;
    }

    /**
     * Imposta il valore della proprietà handlingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingCodeType }
     *     
     */
    public void setHandlingCode(HandlingCodeType value) {
        this.handlingCode = value;
    }

    /**
     * Gets the value of the handlingInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandlingInstructionsType }
     * 
     * 
     */
    public List<HandlingInstructionsType> getHandlingInstructions() {
        if (handlingInstructions == null) {
            handlingInstructions = new ArrayList<HandlingInstructionsType>();
        }
        return this.handlingInstructions;
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
     * Recupera il valore della proprietà totalGoodsItemQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalGoodsItemQuantityType }
     *     
     */
    public TotalGoodsItemQuantityType getTotalGoodsItemQuantity() {
        return totalGoodsItemQuantity;
    }

    /**
     * Imposta il valore della proprietà totalGoodsItemQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalGoodsItemQuantityType }
     *     
     */
    public void setTotalGoodsItemQuantity(TotalGoodsItemQuantityType value) {
        this.totalGoodsItemQuantity = value;
    }

    /**
     * Recupera il valore della proprietà totalTransportHandlingUnitQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalTransportHandlingUnitQuantityType }
     *     
     */
    public TotalTransportHandlingUnitQuantityType getTotalTransportHandlingUnitQuantity() {
        return totalTransportHandlingUnitQuantity;
    }

    /**
     * Imposta il valore della proprietà totalTransportHandlingUnitQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTransportHandlingUnitQuantityType }
     *     
     */
    public void setTotalTransportHandlingUnitQuantity(TotalTransportHandlingUnitQuantityType value) {
        this.totalTransportHandlingUnitQuantity = value;
    }

    /**
     * Recupera il valore della proprietà insuranceValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceValueAmountType }
     *     
     */
    public InsuranceValueAmountType getInsuranceValueAmount() {
        return insuranceValueAmount;
    }

    /**
     * Imposta il valore della proprietà insuranceValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceValueAmountType }
     *     
     */
    public void setInsuranceValueAmount(InsuranceValueAmountType value) {
        this.insuranceValueAmount = value;
    }

    /**
     * Recupera il valore della proprietà declaredForCarriageValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredForCarriageValueAmountType }
     *     
     */
    public DeclaredForCarriageValueAmountType getDeclaredForCarriageValueAmount() {
        return declaredForCarriageValueAmount;
    }

    /**
     * Imposta il valore della proprietà declaredForCarriageValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredForCarriageValueAmountType }
     *     
     */
    public void setDeclaredForCarriageValueAmount(DeclaredForCarriageValueAmountType value) {
        this.declaredForCarriageValueAmount = value;
    }

    /**
     * Recupera il valore della proprietà declaredStatisticsValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredStatisticsValueAmountType }
     *     
     */
    public DeclaredStatisticsValueAmountType getDeclaredStatisticsValueAmount() {
        return declaredStatisticsValueAmount;
    }

    /**
     * Imposta il valore della proprietà declaredStatisticsValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredStatisticsValueAmountType }
     *     
     */
    public void setDeclaredStatisticsValueAmount(DeclaredStatisticsValueAmountType value) {
        this.declaredStatisticsValueAmount = value;
    }

    /**
     * Recupera il valore della proprietà freeOnBoardValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link FreeOnBoardValueAmountType }
     *     
     */
    public FreeOnBoardValueAmountType getFreeOnBoardValueAmount() {
        return freeOnBoardValueAmount;
    }

    /**
     * Imposta il valore della proprietà freeOnBoardValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeOnBoardValueAmountType }
     *     
     */
    public void setFreeOnBoardValueAmount(FreeOnBoardValueAmountType value) {
        this.freeOnBoardValueAmount = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialInstructionsType }
     * 
     * 
     */
    public List<SpecialInstructionsType> getSpecialInstructions() {
        if (specialInstructions == null) {
            specialInstructions = new ArrayList<SpecialInstructionsType>();
        }
        return this.specialInstructions;
    }

    /**
     * Recupera il valore della proprietà splitConsignmentIndicator.
     * 
     * @return
     *     possible object is
     *     {@link SplitConsignmentIndicatorType }
     *     
     */
    public SplitConsignmentIndicatorType getSplitConsignmentIndicator() {
        return splitConsignmentIndicator;
    }

    /**
     * Imposta il valore della proprietà splitConsignmentIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitConsignmentIndicatorType }
     *     
     */
    public void setSplitConsignmentIndicator(SplitConsignmentIndicatorType value) {
        this.splitConsignmentIndicator = value;
    }

    /**
     * Gets the value of the deliveryInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryInstructionsType }
     * 
     * 
     */
    public List<DeliveryInstructionsType> getDeliveryInstructions() {
        if (deliveryInstructions == null) {
            deliveryInstructions = new ArrayList<DeliveryInstructionsType>();
        }
        return this.deliveryInstructions;
    }

    /**
     * Recupera il valore della proprietà consignmentQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ConsignmentQuantityType }
     *     
     */
    public ConsignmentQuantityType getConsignmentQuantity() {
        return consignmentQuantity;
    }

    /**
     * Imposta il valore della proprietà consignmentQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignmentQuantityType }
     *     
     */
    public void setConsignmentQuantity(ConsignmentQuantityType value) {
        this.consignmentQuantity = value;
    }

    /**
     * Recupera il valore della proprietà consolidatableIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatableIndicatorType }
     *     
     */
    public ConsolidatableIndicatorType getConsolidatableIndicator() {
        return consolidatableIndicator;
    }

    /**
     * Imposta il valore della proprietà consolidatableIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatableIndicatorType }
     *     
     */
    public void setConsolidatableIndicator(ConsolidatableIndicatorType value) {
        this.consolidatableIndicator = value;
    }

    /**
     * Gets the value of the haulageInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the haulageInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHaulageInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HaulageInstructionsType }
     * 
     * 
     */
    public List<HaulageInstructionsType> getHaulageInstructions() {
        if (haulageInstructions == null) {
            haulageInstructions = new ArrayList<HaulageInstructionsType>();
        }
        return this.haulageInstructions;
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
     * Recupera il valore della proprietà childConsignmentQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ChildConsignmentQuantityType }
     *     
     */
    public ChildConsignmentQuantityType getChildConsignmentQuantity() {
        return childConsignmentQuantity;
    }

    /**
     * Imposta il valore della proprietà childConsignmentQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildConsignmentQuantityType }
     *     
     */
    public void setChildConsignmentQuantity(ChildConsignmentQuantityType value) {
        this.childConsignmentQuantity = value;
    }

    /**
     * Recupera il valore della proprietà totalPackagesQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalPackagesQuantityType }
     *     
     */
    public TotalPackagesQuantityType getTotalPackagesQuantity() {
        return totalPackagesQuantity;
    }

    /**
     * Imposta il valore della proprietà totalPackagesQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPackagesQuantityType }
     *     
     */
    public void setTotalPackagesQuantity(TotalPackagesQuantityType value) {
        this.totalPackagesQuantity = value;
    }

    /**
     * Gets the value of the consolidatedShipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consolidatedShipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsolidatedShipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentType }
     * 
     * 
     */
    public List<ShipmentType> getConsolidatedShipment() {
        if (consolidatedShipment == null) {
            consolidatedShipment = new ArrayList<ShipmentType>();
        }
        return this.consolidatedShipment;
    }

    /**
     * Gets the value of the customsDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsDeclarationType }
     * 
     * 
     */
    public List<CustomsDeclarationType> getCustomsDeclaration() {
        if (customsDeclaration == null) {
            customsDeclaration = new ArrayList<CustomsDeclarationType>();
        }
        return this.customsDeclaration;
    }

    /**
     * Recupera il valore della proprietà requestedPickupTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getRequestedPickupTransportEvent() {
        return requestedPickupTransportEvent;
    }

    /**
     * Imposta il valore della proprietà requestedPickupTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setRequestedPickupTransportEvent(TransportEventType value) {
        this.requestedPickupTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà requestedDeliveryTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getRequestedDeliveryTransportEvent() {
        return requestedDeliveryTransportEvent;
    }

    /**
     * Imposta il valore della proprietà requestedDeliveryTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setRequestedDeliveryTransportEvent(TransportEventType value) {
        this.requestedDeliveryTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà plannedPickupTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getPlannedPickupTransportEvent() {
        return plannedPickupTransportEvent;
    }

    /**
     * Imposta il valore della proprietà plannedPickupTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setPlannedPickupTransportEvent(TransportEventType value) {
        this.plannedPickupTransportEvent = value;
    }

    /**
     * Recupera il valore della proprietà plannedDeliveryTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getPlannedDeliveryTransportEvent() {
        return plannedDeliveryTransportEvent;
    }

    /**
     * Imposta il valore della proprietà plannedDeliveryTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setPlannedDeliveryTransportEvent(TransportEventType value) {
        this.plannedDeliveryTransportEvent = value;
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
     * Recupera il valore della proprietà actualDeliveryTransportEvent.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getActualDeliveryTransportEvent() {
        return actualDeliveryTransportEvent;
    }

    /**
     * Imposta il valore della proprietà actualDeliveryTransportEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setActualDeliveryTransportEvent(TransportEventType value) {
        this.actualDeliveryTransportEvent = value;
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

    /**
     * Gets the value of the childConsignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childConsignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildConsignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsignmentType }
     * 
     * 
     */
    public List<ConsignmentType> getChildConsignment() {
        if (childConsignment == null) {
            childConsignment = new ArrayList<ConsignmentType>();
        }
        return this.childConsignment;
    }

    /**
     * Recupera il valore della proprietà consigneeParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getConsigneeParty() {
        return consigneeParty;
    }

    /**
     * Imposta il valore della proprietà consigneeParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setConsigneeParty(PartyType value) {
        this.consigneeParty = value;
    }

    /**
     * Recupera il valore della proprietà exporterParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getExporterParty() {
        return exporterParty;
    }

    /**
     * Imposta il valore della proprietà exporterParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setExporterParty(PartyType value) {
        this.exporterParty = value;
    }

    /**
     * Recupera il valore della proprietà consignorParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getConsignorParty() {
        return consignorParty;
    }

    /**
     * Imposta il valore della proprietà consignorParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setConsignorParty(PartyType value) {
        this.consignorParty = value;
    }

    /**
     * Recupera il valore della proprietà importerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getImporterParty() {
        return importerParty;
    }

    /**
     * Imposta il valore della proprietà importerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setImporterParty(PartyType value) {
        this.importerParty = value;
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
     * Recupera il valore della proprietà freightForwarderParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getFreightForwarderParty() {
        return freightForwarderParty;
    }

    /**
     * Imposta il valore della proprietà freightForwarderParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setFreightForwarderParty(PartyType value) {
        this.freightForwarderParty = value;
    }

    /**
     * Recupera il valore della proprietà notifyParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getNotifyParty() {
        return notifyParty;
    }

    /**
     * Imposta il valore della proprietà notifyParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setNotifyParty(PartyType value) {
        this.notifyParty = value;
    }

    /**
     * Recupera il valore della proprietà originalDespatchParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getOriginalDespatchParty() {
        return originalDespatchParty;
    }

    /**
     * Imposta il valore della proprietà originalDespatchParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setOriginalDespatchParty(PartyType value) {
        this.originalDespatchParty = value;
    }

    /**
     * Recupera il valore della proprietà finalDeliveryParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getFinalDeliveryParty() {
        return finalDeliveryParty;
    }

    /**
     * Imposta il valore della proprietà finalDeliveryParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setFinalDeliveryParty(PartyType value) {
        this.finalDeliveryParty = value;
    }

    /**
     * Recupera il valore della proprietà performingCarrierParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPerformingCarrierParty() {
        return performingCarrierParty;
    }

    /**
     * Imposta il valore della proprietà performingCarrierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPerformingCarrierParty(PartyType value) {
        this.performingCarrierParty = value;
    }

    /**
     * Recupera il valore della proprietà substituteCarrierParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getSubstituteCarrierParty() {
        return substituteCarrierParty;
    }

    /**
     * Imposta il valore della proprietà substituteCarrierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setSubstituteCarrierParty(PartyType value) {
        this.substituteCarrierParty = value;
    }

    /**
     * Recupera il valore della proprietà logisticsOperatorParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getLogisticsOperatorParty() {
        return logisticsOperatorParty;
    }

    /**
     * Imposta il valore della proprietà logisticsOperatorParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setLogisticsOperatorParty(PartyType value) {
        this.logisticsOperatorParty = value;
    }

    /**
     * Recupera il valore della proprietà transportAdvisorParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getTransportAdvisorParty() {
        return transportAdvisorParty;
    }

    /**
     * Imposta il valore della proprietà transportAdvisorParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setTransportAdvisorParty(PartyType value) {
        this.transportAdvisorParty = value;
    }

    /**
     * Recupera il valore della proprietà hazardousItemNotificationParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getHazardousItemNotificationParty() {
        return hazardousItemNotificationParty;
    }

    /**
     * Imposta il valore della proprietà hazardousItemNotificationParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setHazardousItemNotificationParty(PartyType value) {
        this.hazardousItemNotificationParty = value;
    }

    /**
     * Recupera il valore della proprietà insuranceParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getInsuranceParty() {
        return insuranceParty;
    }

    /**
     * Imposta il valore della proprietà insuranceParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setInsuranceParty(PartyType value) {
        this.insuranceParty = value;
    }

    /**
     * Recupera il valore della proprietà mortgageHolderParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getMortgageHolderParty() {
        return mortgageHolderParty;
    }

    /**
     * Imposta il valore della proprietà mortgageHolderParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setMortgageHolderParty(PartyType value) {
        this.mortgageHolderParty = value;
    }

    /**
     * Recupera il valore della proprietà billOfLadingHolderParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getBillOfLadingHolderParty() {
        return billOfLadingHolderParty;
    }

    /**
     * Imposta il valore della proprietà billOfLadingHolderParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setBillOfLadingHolderParty(PartyType value) {
        this.billOfLadingHolderParty = value;
    }

    /**
     * Recupera il valore della proprietà originalDepartureCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getOriginalDepartureCountry() {
        return originalDepartureCountry;
    }

    /**
     * Imposta il valore della proprietà originalDepartureCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setOriginalDepartureCountry(CountryType value) {
        this.originalDepartureCountry = value;
    }

    /**
     * Recupera il valore della proprietà finalDestinationCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getFinalDestinationCountry() {
        return finalDestinationCountry;
    }

    /**
     * Imposta il valore della proprietà finalDestinationCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setFinalDestinationCountry(CountryType value) {
        this.finalDestinationCountry = value;
    }

    /**
     * Gets the value of the transitCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transitCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getTransitCountry() {
        if (transitCountry == null) {
            transitCountry = new ArrayList<CountryType>();
        }
        return this.transitCountry;
    }

    /**
     * Recupera il valore della proprietà transportContract.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getTransportContract() {
        return transportContract;
    }

    /**
     * Imposta il valore della proprietà transportContract.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setTransportContract(ContractType value) {
        this.transportContract = value;
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
     * Recupera il valore della proprietà originalDespatchTransportationService.
     * 
     * @return
     *     possible object is
     *     {@link TransportationServiceType }
     *     
     */
    public TransportationServiceType getOriginalDespatchTransportationService() {
        return originalDespatchTransportationService;
    }

    /**
     * Imposta il valore della proprietà originalDespatchTransportationService.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationServiceType }
     *     
     */
    public void setOriginalDespatchTransportationService(TransportationServiceType value) {
        this.originalDespatchTransportationService = value;
    }

    /**
     * Recupera il valore della proprietà finalDeliveryTransportationService.
     * 
     * @return
     *     possible object is
     *     {@link TransportationServiceType }
     *     
     */
    public TransportationServiceType getFinalDeliveryTransportationService() {
        return finalDeliveryTransportationService;
    }

    /**
     * Imposta il valore della proprietà finalDeliveryTransportationService.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationServiceType }
     *     
     */
    public void setFinalDeliveryTransportationService(TransportationServiceType value) {
        this.finalDeliveryTransportationService = value;
    }

    /**
     * Recupera il valore della proprietà deliveryTerms.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTermsType }
     *     
     */
    public DeliveryTermsType getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Imposta il valore della proprietà deliveryTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTermsType }
     *     
     */
    public void setDeliveryTerms(DeliveryTermsType value) {
        this.deliveryTerms = value;
    }

    /**
     * Recupera il valore della proprietà paymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Imposta il valore della proprietà paymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setPaymentTerms(PaymentTermsType value) {
        this.paymentTerms = value;
    }

    /**
     * Recupera il valore della proprietà collectPaymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getCollectPaymentTerms() {
        return collectPaymentTerms;
    }

    /**
     * Imposta il valore della proprietà collectPaymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setCollectPaymentTerms(PaymentTermsType value) {
        this.collectPaymentTerms = value;
    }

    /**
     * Recupera il valore della proprietà disbursementPaymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getDisbursementPaymentTerms() {
        return disbursementPaymentTerms;
    }

    /**
     * Imposta il valore della proprietà disbursementPaymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setDisbursementPaymentTerms(PaymentTermsType value) {
        this.disbursementPaymentTerms = value;
    }

    /**
     * Recupera il valore della proprietà prepaidPaymentTerms.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getPrepaidPaymentTerms() {
        return prepaidPaymentTerms;
    }

    /**
     * Imposta il valore della proprietà prepaidPaymentTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setPrepaidPaymentTerms(PaymentTermsType value) {
        this.prepaidPaymentTerms = value;
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
     * Gets the value of the extraAllowanceCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraAllowanceCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraAllowanceCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getExtraAllowanceCharge() {
        if (extraAllowanceCharge == null) {
            extraAllowanceCharge = new ArrayList<AllowanceChargeType>();
        }
        return this.extraAllowanceCharge;
    }

    /**
     * Gets the value of the mainCarriageShipmentStage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainCarriageShipmentStage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainCarriageShipmentStage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType }
     * 
     * 
     */
    public List<ShipmentStageType> getMainCarriageShipmentStage() {
        if (mainCarriageShipmentStage == null) {
            mainCarriageShipmentStage = new ArrayList<ShipmentStageType>();
        }
        return this.mainCarriageShipmentStage;
    }

    /**
     * Gets the value of the preCarriageShipmentStage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preCarriageShipmentStage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreCarriageShipmentStage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType }
     * 
     * 
     */
    public List<ShipmentStageType> getPreCarriageShipmentStage() {
        if (preCarriageShipmentStage == null) {
            preCarriageShipmentStage = new ArrayList<ShipmentStageType>();
        }
        return this.preCarriageShipmentStage;
    }

    /**
     * Gets the value of the onCarriageShipmentStage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onCarriageShipmentStage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnCarriageShipmentStage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType }
     * 
     * 
     */
    public List<ShipmentStageType> getOnCarriageShipmentStage() {
        if (onCarriageShipmentStage == null) {
            onCarriageShipmentStage = new ArrayList<ShipmentStageType>();
        }
        return this.onCarriageShipmentStage;
    }

    /**
     * Gets the value of the transportHandlingUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportHandlingUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportHandlingUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportHandlingUnitType }
     * 
     * 
     */
    public List<TransportHandlingUnitType> getTransportHandlingUnit() {
        if (transportHandlingUnit == null) {
            transportHandlingUnit = new ArrayList<TransportHandlingUnitType>();
        }
        return this.transportHandlingUnit;
    }

    /**
     * Recupera il valore della proprietà firstArrivalPortLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getFirstArrivalPortLocation() {
        return firstArrivalPortLocation;
    }

    /**
     * Imposta il valore della proprietà firstArrivalPortLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setFirstArrivalPortLocation(LocationType value) {
        this.firstArrivalPortLocation = value;
    }

    /**
     * Recupera il valore della proprietà lastExitPortLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLastExitPortLocation() {
        return lastExitPortLocation;
    }

    /**
     * Imposta il valore della proprietà lastExitPortLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLastExitPortLocation(LocationType value) {
        this.lastExitPortLocation = value;
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
            CarrierAssignedIDType theCarrierAssignedID;
            theCarrierAssignedID = this.getCarrierAssignedID();
            strategy.appendField(locator, this, "carrierAssignedID", buffer, theCarrierAssignedID, (this.carrierAssignedID!= null));
        }
        {
            ConsigneeAssignedIDType theConsigneeAssignedID;
            theConsigneeAssignedID = this.getConsigneeAssignedID();
            strategy.appendField(locator, this, "consigneeAssignedID", buffer, theConsigneeAssignedID, (this.consigneeAssignedID!= null));
        }
        {
            ConsignorAssignedIDType theConsignorAssignedID;
            theConsignorAssignedID = this.getConsignorAssignedID();
            strategy.appendField(locator, this, "consignorAssignedID", buffer, theConsignorAssignedID, (this.consignorAssignedID!= null));
        }
        {
            FreightForwarderAssignedIDType theFreightForwarderAssignedID;
            theFreightForwarderAssignedID = this.getFreightForwarderAssignedID();
            strategy.appendField(locator, this, "freightForwarderAssignedID", buffer, theFreightForwarderAssignedID, (this.freightForwarderAssignedID!= null));
        }
        {
            BrokerAssignedIDType theBrokerAssignedID;
            theBrokerAssignedID = this.getBrokerAssignedID();
            strategy.appendField(locator, this, "brokerAssignedID", buffer, theBrokerAssignedID, (this.brokerAssignedID!= null));
        }
        {
            ContractedCarrierAssignedIDType theContractedCarrierAssignedID;
            theContractedCarrierAssignedID = this.getContractedCarrierAssignedID();
            strategy.appendField(locator, this, "contractedCarrierAssignedID", buffer, theContractedCarrierAssignedID, (this.contractedCarrierAssignedID!= null));
        }
        {
            PerformingCarrierAssignedIDType thePerformingCarrierAssignedID;
            thePerformingCarrierAssignedID = this.getPerformingCarrierAssignedID();
            strategy.appendField(locator, this, "performingCarrierAssignedID", buffer, thePerformingCarrierAssignedID, (this.performingCarrierAssignedID!= null));
        }
        {
            List<SummaryDescriptionType> theSummaryDescription;
            theSummaryDescription = (((this.summaryDescription!= null)&&(!this.summaryDescription.isEmpty()))?this.getSummaryDescription():null);
            strategy.appendField(locator, this, "summaryDescription", buffer, theSummaryDescription, ((this.summaryDescription!= null)&&(!this.summaryDescription.isEmpty())));
        }
        {
            TotalInvoiceAmountType theTotalInvoiceAmount;
            theTotalInvoiceAmount = this.getTotalInvoiceAmount();
            strategy.appendField(locator, this, "totalInvoiceAmount", buffer, theTotalInvoiceAmount, (this.totalInvoiceAmount!= null));
        }
        {
            DeclaredCustomsValueAmountType theDeclaredCustomsValueAmount;
            theDeclaredCustomsValueAmount = this.getDeclaredCustomsValueAmount();
            strategy.appendField(locator, this, "declaredCustomsValueAmount", buffer, theDeclaredCustomsValueAmount, (this.declaredCustomsValueAmount!= null));
        }
        {
            List<TariffDescriptionType> theTariffDescription;
            theTariffDescription = (((this.tariffDescription!= null)&&(!this.tariffDescription.isEmpty()))?this.getTariffDescription():null);
            strategy.appendField(locator, this, "tariffDescription", buffer, theTariffDescription, ((this.tariffDescription!= null)&&(!this.tariffDescription.isEmpty())));
        }
        {
            TariffCodeType theTariffCode;
            theTariffCode = this.getTariffCode();
            strategy.appendField(locator, this, "tariffCode", buffer, theTariffCode, (this.tariffCode!= null));
        }
        {
            InsurancePremiumAmountType theInsurancePremiumAmount;
            theInsurancePremiumAmount = this.getInsurancePremiumAmount();
            strategy.appendField(locator, this, "insurancePremiumAmount", buffer, theInsurancePremiumAmount, (this.insurancePremiumAmount!= null));
        }
        {
            GrossWeightMeasureType theGrossWeightMeasure;
            theGrossWeightMeasure = this.getGrossWeightMeasure();
            strategy.appendField(locator, this, "grossWeightMeasure", buffer, theGrossWeightMeasure, (this.grossWeightMeasure!= null));
        }
        {
            NetWeightMeasureType theNetWeightMeasure;
            theNetWeightMeasure = this.getNetWeightMeasure();
            strategy.appendField(locator, this, "netWeightMeasure", buffer, theNetWeightMeasure, (this.netWeightMeasure!= null));
        }
        {
            NetNetWeightMeasureType theNetNetWeightMeasure;
            theNetNetWeightMeasure = this.getNetNetWeightMeasure();
            strategy.appendField(locator, this, "netNetWeightMeasure", buffer, theNetNetWeightMeasure, (this.netNetWeightMeasure!= null));
        }
        {
            ChargeableWeightMeasureType theChargeableWeightMeasure;
            theChargeableWeightMeasure = this.getChargeableWeightMeasure();
            strategy.appendField(locator, this, "chargeableWeightMeasure", buffer, theChargeableWeightMeasure, (this.chargeableWeightMeasure!= null));
        }
        {
            GrossVolumeMeasureType theGrossVolumeMeasure;
            theGrossVolumeMeasure = this.getGrossVolumeMeasure();
            strategy.appendField(locator, this, "grossVolumeMeasure", buffer, theGrossVolumeMeasure, (this.grossVolumeMeasure!= null));
        }
        {
            NetVolumeMeasureType theNetVolumeMeasure;
            theNetVolumeMeasure = this.getNetVolumeMeasure();
            strategy.appendField(locator, this, "netVolumeMeasure", buffer, theNetVolumeMeasure, (this.netVolumeMeasure!= null));
        }
        {
            LoadingLengthMeasureType theLoadingLengthMeasure;
            theLoadingLengthMeasure = this.getLoadingLengthMeasure();
            strategy.appendField(locator, this, "loadingLengthMeasure", buffer, theLoadingLengthMeasure, (this.loadingLengthMeasure!= null));
        }
        {
            List<RemarksType> theRemarks;
            theRemarks = (((this.remarks!= null)&&(!this.remarks.isEmpty()))?this.getRemarks():null);
            strategy.appendField(locator, this, "remarks", buffer, theRemarks, ((this.remarks!= null)&&(!this.remarks.isEmpty())));
        }
        {
            HazardousRiskIndicatorType theHazardousRiskIndicator;
            theHazardousRiskIndicator = this.getHazardousRiskIndicator();
            strategy.appendField(locator, this, "hazardousRiskIndicator", buffer, theHazardousRiskIndicator, (this.hazardousRiskIndicator!= null));
        }
        {
            AnimalFoodIndicatorType theAnimalFoodIndicator;
            theAnimalFoodIndicator = this.getAnimalFoodIndicator();
            strategy.appendField(locator, this, "animalFoodIndicator", buffer, theAnimalFoodIndicator, (this.animalFoodIndicator!= null));
        }
        {
            HumanFoodIndicatorType theHumanFoodIndicator;
            theHumanFoodIndicator = this.getHumanFoodIndicator();
            strategy.appendField(locator, this, "humanFoodIndicator", buffer, theHumanFoodIndicator, (this.humanFoodIndicator!= null));
        }
        {
            LivestockIndicatorType theLivestockIndicator;
            theLivestockIndicator = this.getLivestockIndicator();
            strategy.appendField(locator, this, "livestockIndicator", buffer, theLivestockIndicator, (this.livestockIndicator!= null));
        }
        {
            BulkCargoIndicatorType theBulkCargoIndicator;
            theBulkCargoIndicator = this.getBulkCargoIndicator();
            strategy.appendField(locator, this, "bulkCargoIndicator", buffer, theBulkCargoIndicator, (this.bulkCargoIndicator!= null));
        }
        {
            ContainerizedIndicatorType theContainerizedIndicator;
            theContainerizedIndicator = this.getContainerizedIndicator();
            strategy.appendField(locator, this, "containerizedIndicator", buffer, theContainerizedIndicator, (this.containerizedIndicator!= null));
        }
        {
            GeneralCargoIndicatorType theGeneralCargoIndicator;
            theGeneralCargoIndicator = this.getGeneralCargoIndicator();
            strategy.appendField(locator, this, "generalCargoIndicator", buffer, theGeneralCargoIndicator, (this.generalCargoIndicator!= null));
        }
        {
            SpecialSecurityIndicatorType theSpecialSecurityIndicator;
            theSpecialSecurityIndicator = this.getSpecialSecurityIndicator();
            strategy.appendField(locator, this, "specialSecurityIndicator", buffer, theSpecialSecurityIndicator, (this.specialSecurityIndicator!= null));
        }
        {
            ThirdPartyPayerIndicatorType theThirdPartyPayerIndicator;
            theThirdPartyPayerIndicator = this.getThirdPartyPayerIndicator();
            strategy.appendField(locator, this, "thirdPartyPayerIndicator", buffer, theThirdPartyPayerIndicator, (this.thirdPartyPayerIndicator!= null));
        }
        {
            List<CarrierServiceInstructionsType> theCarrierServiceInstructions;
            theCarrierServiceInstructions = (((this.carrierServiceInstructions!= null)&&(!this.carrierServiceInstructions.isEmpty()))?this.getCarrierServiceInstructions():null);
            strategy.appendField(locator, this, "carrierServiceInstructions", buffer, theCarrierServiceInstructions, ((this.carrierServiceInstructions!= null)&&(!this.carrierServiceInstructions.isEmpty())));
        }
        {
            List<CustomsClearanceServiceInstructionsType> theCustomsClearanceServiceInstructions;
            theCustomsClearanceServiceInstructions = (((this.customsClearanceServiceInstructions!= null)&&(!this.customsClearanceServiceInstructions.isEmpty()))?this.getCustomsClearanceServiceInstructions():null);
            strategy.appendField(locator, this, "customsClearanceServiceInstructions", buffer, theCustomsClearanceServiceInstructions, ((this.customsClearanceServiceInstructions!= null)&&(!this.customsClearanceServiceInstructions.isEmpty())));
        }
        {
            List<ForwarderServiceInstructionsType> theForwarderServiceInstructions;
            theForwarderServiceInstructions = (((this.forwarderServiceInstructions!= null)&&(!this.forwarderServiceInstructions.isEmpty()))?this.getForwarderServiceInstructions():null);
            strategy.appendField(locator, this, "forwarderServiceInstructions", buffer, theForwarderServiceInstructions, ((this.forwarderServiceInstructions!= null)&&(!this.forwarderServiceInstructions.isEmpty())));
        }
        {
            List<SpecialServiceInstructionsType> theSpecialServiceInstructions;
            theSpecialServiceInstructions = (((this.specialServiceInstructions!= null)&&(!this.specialServiceInstructions.isEmpty()))?this.getSpecialServiceInstructions():null);
            strategy.appendField(locator, this, "specialServiceInstructions", buffer, theSpecialServiceInstructions, ((this.specialServiceInstructions!= null)&&(!this.specialServiceInstructions.isEmpty())));
        }
        {
            SequenceIDType theSequenceID;
            theSequenceID = this.getSequenceID();
            strategy.appendField(locator, this, "sequenceID", buffer, theSequenceID, (this.sequenceID!= null));
        }
        {
            ShippingPriorityLevelCodeType theShippingPriorityLevelCode;
            theShippingPriorityLevelCode = this.getShippingPriorityLevelCode();
            strategy.appendField(locator, this, "shippingPriorityLevelCode", buffer, theShippingPriorityLevelCode, (this.shippingPriorityLevelCode!= null));
        }
        {
            HandlingCodeType theHandlingCode;
            theHandlingCode = this.getHandlingCode();
            strategy.appendField(locator, this, "handlingCode", buffer, theHandlingCode, (this.handlingCode!= null));
        }
        {
            List<HandlingInstructionsType> theHandlingInstructions;
            theHandlingInstructions = (((this.handlingInstructions!= null)&&(!this.handlingInstructions.isEmpty()))?this.getHandlingInstructions():null);
            strategy.appendField(locator, this, "handlingInstructions", buffer, theHandlingInstructions, ((this.handlingInstructions!= null)&&(!this.handlingInstructions.isEmpty())));
        }
        {
            List<InformationType> theInformation;
            theInformation = (((this.information!= null)&&(!this.information.isEmpty()))?this.getInformation():null);
            strategy.appendField(locator, this, "information", buffer, theInformation, ((this.information!= null)&&(!this.information.isEmpty())));
        }
        {
            TotalGoodsItemQuantityType theTotalGoodsItemQuantity;
            theTotalGoodsItemQuantity = this.getTotalGoodsItemQuantity();
            strategy.appendField(locator, this, "totalGoodsItemQuantity", buffer, theTotalGoodsItemQuantity, (this.totalGoodsItemQuantity!= null));
        }
        {
            TotalTransportHandlingUnitQuantityType theTotalTransportHandlingUnitQuantity;
            theTotalTransportHandlingUnitQuantity = this.getTotalTransportHandlingUnitQuantity();
            strategy.appendField(locator, this, "totalTransportHandlingUnitQuantity", buffer, theTotalTransportHandlingUnitQuantity, (this.totalTransportHandlingUnitQuantity!= null));
        }
        {
            InsuranceValueAmountType theInsuranceValueAmount;
            theInsuranceValueAmount = this.getInsuranceValueAmount();
            strategy.appendField(locator, this, "insuranceValueAmount", buffer, theInsuranceValueAmount, (this.insuranceValueAmount!= null));
        }
        {
            DeclaredForCarriageValueAmountType theDeclaredForCarriageValueAmount;
            theDeclaredForCarriageValueAmount = this.getDeclaredForCarriageValueAmount();
            strategy.appendField(locator, this, "declaredForCarriageValueAmount", buffer, theDeclaredForCarriageValueAmount, (this.declaredForCarriageValueAmount!= null));
        }
        {
            DeclaredStatisticsValueAmountType theDeclaredStatisticsValueAmount;
            theDeclaredStatisticsValueAmount = this.getDeclaredStatisticsValueAmount();
            strategy.appendField(locator, this, "declaredStatisticsValueAmount", buffer, theDeclaredStatisticsValueAmount, (this.declaredStatisticsValueAmount!= null));
        }
        {
            FreeOnBoardValueAmountType theFreeOnBoardValueAmount;
            theFreeOnBoardValueAmount = this.getFreeOnBoardValueAmount();
            strategy.appendField(locator, this, "freeOnBoardValueAmount", buffer, theFreeOnBoardValueAmount, (this.freeOnBoardValueAmount!= null));
        }
        {
            List<SpecialInstructionsType> theSpecialInstructions;
            theSpecialInstructions = (((this.specialInstructions!= null)&&(!this.specialInstructions.isEmpty()))?this.getSpecialInstructions():null);
            strategy.appendField(locator, this, "specialInstructions", buffer, theSpecialInstructions, ((this.specialInstructions!= null)&&(!this.specialInstructions.isEmpty())));
        }
        {
            SplitConsignmentIndicatorType theSplitConsignmentIndicator;
            theSplitConsignmentIndicator = this.getSplitConsignmentIndicator();
            strategy.appendField(locator, this, "splitConsignmentIndicator", buffer, theSplitConsignmentIndicator, (this.splitConsignmentIndicator!= null));
        }
        {
            List<DeliveryInstructionsType> theDeliveryInstructions;
            theDeliveryInstructions = (((this.deliveryInstructions!= null)&&(!this.deliveryInstructions.isEmpty()))?this.getDeliveryInstructions():null);
            strategy.appendField(locator, this, "deliveryInstructions", buffer, theDeliveryInstructions, ((this.deliveryInstructions!= null)&&(!this.deliveryInstructions.isEmpty())));
        }
        {
            ConsignmentQuantityType theConsignmentQuantity;
            theConsignmentQuantity = this.getConsignmentQuantity();
            strategy.appendField(locator, this, "consignmentQuantity", buffer, theConsignmentQuantity, (this.consignmentQuantity!= null));
        }
        {
            ConsolidatableIndicatorType theConsolidatableIndicator;
            theConsolidatableIndicator = this.getConsolidatableIndicator();
            strategy.appendField(locator, this, "consolidatableIndicator", buffer, theConsolidatableIndicator, (this.consolidatableIndicator!= null));
        }
        {
            List<HaulageInstructionsType> theHaulageInstructions;
            theHaulageInstructions = (((this.haulageInstructions!= null)&&(!this.haulageInstructions.isEmpty()))?this.getHaulageInstructions():null);
            strategy.appendField(locator, this, "haulageInstructions", buffer, theHaulageInstructions, ((this.haulageInstructions!= null)&&(!this.haulageInstructions.isEmpty())));
        }
        {
            LoadingSequenceIDType theLoadingSequenceID;
            theLoadingSequenceID = this.getLoadingSequenceID();
            strategy.appendField(locator, this, "loadingSequenceID", buffer, theLoadingSequenceID, (this.loadingSequenceID!= null));
        }
        {
            ChildConsignmentQuantityType theChildConsignmentQuantity;
            theChildConsignmentQuantity = this.getChildConsignmentQuantity();
            strategy.appendField(locator, this, "childConsignmentQuantity", buffer, theChildConsignmentQuantity, (this.childConsignmentQuantity!= null));
        }
        {
            TotalPackagesQuantityType theTotalPackagesQuantity;
            theTotalPackagesQuantity = this.getTotalPackagesQuantity();
            strategy.appendField(locator, this, "totalPackagesQuantity", buffer, theTotalPackagesQuantity, (this.totalPackagesQuantity!= null));
        }
        {
            List<ShipmentType> theConsolidatedShipment;
            theConsolidatedShipment = (((this.consolidatedShipment!= null)&&(!this.consolidatedShipment.isEmpty()))?this.getConsolidatedShipment():null);
            strategy.appendField(locator, this, "consolidatedShipment", buffer, theConsolidatedShipment, ((this.consolidatedShipment!= null)&&(!this.consolidatedShipment.isEmpty())));
        }
        {
            List<CustomsDeclarationType> theCustomsDeclaration;
            theCustomsDeclaration = (((this.customsDeclaration!= null)&&(!this.customsDeclaration.isEmpty()))?this.getCustomsDeclaration():null);
            strategy.appendField(locator, this, "customsDeclaration", buffer, theCustomsDeclaration, ((this.customsDeclaration!= null)&&(!this.customsDeclaration.isEmpty())));
        }
        {
            TransportEventType theRequestedPickupTransportEvent;
            theRequestedPickupTransportEvent = this.getRequestedPickupTransportEvent();
            strategy.appendField(locator, this, "requestedPickupTransportEvent", buffer, theRequestedPickupTransportEvent, (this.requestedPickupTransportEvent!= null));
        }
        {
            TransportEventType theRequestedDeliveryTransportEvent;
            theRequestedDeliveryTransportEvent = this.getRequestedDeliveryTransportEvent();
            strategy.appendField(locator, this, "requestedDeliveryTransportEvent", buffer, theRequestedDeliveryTransportEvent, (this.requestedDeliveryTransportEvent!= null));
        }
        {
            TransportEventType thePlannedPickupTransportEvent;
            thePlannedPickupTransportEvent = this.getPlannedPickupTransportEvent();
            strategy.appendField(locator, this, "plannedPickupTransportEvent", buffer, thePlannedPickupTransportEvent, (this.plannedPickupTransportEvent!= null));
        }
        {
            TransportEventType thePlannedDeliveryTransportEvent;
            thePlannedDeliveryTransportEvent = this.getPlannedDeliveryTransportEvent();
            strategy.appendField(locator, this, "plannedDeliveryTransportEvent", buffer, thePlannedDeliveryTransportEvent, (this.plannedDeliveryTransportEvent!= null));
        }
        {
            TransportEventType theActualPickupTransportEvent;
            theActualPickupTransportEvent = this.getActualPickupTransportEvent();
            strategy.appendField(locator, this, "actualPickupTransportEvent", buffer, theActualPickupTransportEvent, (this.actualPickupTransportEvent!= null));
        }
        {
            TransportEventType theActualDeliveryTransportEvent;
            theActualDeliveryTransportEvent = this.getActualDeliveryTransportEvent();
            strategy.appendField(locator, this, "actualDeliveryTransportEvent", buffer, theActualDeliveryTransportEvent, (this.actualDeliveryTransportEvent!= null));
        }
        {
            List<StatusType> theStatus;
            theStatus = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            strategy.appendField(locator, this, "status", buffer, theStatus, ((this.status!= null)&&(!this.status.isEmpty())));
        }
        {
            List<ConsignmentType> theChildConsignment;
            theChildConsignment = (((this.childConsignment!= null)&&(!this.childConsignment.isEmpty()))?this.getChildConsignment():null);
            strategy.appendField(locator, this, "childConsignment", buffer, theChildConsignment, ((this.childConsignment!= null)&&(!this.childConsignment.isEmpty())));
        }
        {
            PartyType theConsigneeParty;
            theConsigneeParty = this.getConsigneeParty();
            strategy.appendField(locator, this, "consigneeParty", buffer, theConsigneeParty, (this.consigneeParty!= null));
        }
        {
            PartyType theExporterParty;
            theExporterParty = this.getExporterParty();
            strategy.appendField(locator, this, "exporterParty", buffer, theExporterParty, (this.exporterParty!= null));
        }
        {
            PartyType theConsignorParty;
            theConsignorParty = this.getConsignorParty();
            strategy.appendField(locator, this, "consignorParty", buffer, theConsignorParty, (this.consignorParty!= null));
        }
        {
            PartyType theImporterParty;
            theImporterParty = this.getImporterParty();
            strategy.appendField(locator, this, "importerParty", buffer, theImporterParty, (this.importerParty!= null));
        }
        {
            PartyType theCarrierParty;
            theCarrierParty = this.getCarrierParty();
            strategy.appendField(locator, this, "carrierParty", buffer, theCarrierParty, (this.carrierParty!= null));
        }
        {
            PartyType theFreightForwarderParty;
            theFreightForwarderParty = this.getFreightForwarderParty();
            strategy.appendField(locator, this, "freightForwarderParty", buffer, theFreightForwarderParty, (this.freightForwarderParty!= null));
        }
        {
            PartyType theNotifyParty;
            theNotifyParty = this.getNotifyParty();
            strategy.appendField(locator, this, "notifyParty", buffer, theNotifyParty, (this.notifyParty!= null));
        }
        {
            PartyType theOriginalDespatchParty;
            theOriginalDespatchParty = this.getOriginalDespatchParty();
            strategy.appendField(locator, this, "originalDespatchParty", buffer, theOriginalDespatchParty, (this.originalDespatchParty!= null));
        }
        {
            PartyType theFinalDeliveryParty;
            theFinalDeliveryParty = this.getFinalDeliveryParty();
            strategy.appendField(locator, this, "finalDeliveryParty", buffer, theFinalDeliveryParty, (this.finalDeliveryParty!= null));
        }
        {
            PartyType thePerformingCarrierParty;
            thePerformingCarrierParty = this.getPerformingCarrierParty();
            strategy.appendField(locator, this, "performingCarrierParty", buffer, thePerformingCarrierParty, (this.performingCarrierParty!= null));
        }
        {
            PartyType theSubstituteCarrierParty;
            theSubstituteCarrierParty = this.getSubstituteCarrierParty();
            strategy.appendField(locator, this, "substituteCarrierParty", buffer, theSubstituteCarrierParty, (this.substituteCarrierParty!= null));
        }
        {
            PartyType theLogisticsOperatorParty;
            theLogisticsOperatorParty = this.getLogisticsOperatorParty();
            strategy.appendField(locator, this, "logisticsOperatorParty", buffer, theLogisticsOperatorParty, (this.logisticsOperatorParty!= null));
        }
        {
            PartyType theTransportAdvisorParty;
            theTransportAdvisorParty = this.getTransportAdvisorParty();
            strategy.appendField(locator, this, "transportAdvisorParty", buffer, theTransportAdvisorParty, (this.transportAdvisorParty!= null));
        }
        {
            PartyType theHazardousItemNotificationParty;
            theHazardousItemNotificationParty = this.getHazardousItemNotificationParty();
            strategy.appendField(locator, this, "hazardousItemNotificationParty", buffer, theHazardousItemNotificationParty, (this.hazardousItemNotificationParty!= null));
        }
        {
            PartyType theInsuranceParty;
            theInsuranceParty = this.getInsuranceParty();
            strategy.appendField(locator, this, "insuranceParty", buffer, theInsuranceParty, (this.insuranceParty!= null));
        }
        {
            PartyType theMortgageHolderParty;
            theMortgageHolderParty = this.getMortgageHolderParty();
            strategy.appendField(locator, this, "mortgageHolderParty", buffer, theMortgageHolderParty, (this.mortgageHolderParty!= null));
        }
        {
            PartyType theBillOfLadingHolderParty;
            theBillOfLadingHolderParty = this.getBillOfLadingHolderParty();
            strategy.appendField(locator, this, "billOfLadingHolderParty", buffer, theBillOfLadingHolderParty, (this.billOfLadingHolderParty!= null));
        }
        {
            CountryType theOriginalDepartureCountry;
            theOriginalDepartureCountry = this.getOriginalDepartureCountry();
            strategy.appendField(locator, this, "originalDepartureCountry", buffer, theOriginalDepartureCountry, (this.originalDepartureCountry!= null));
        }
        {
            CountryType theFinalDestinationCountry;
            theFinalDestinationCountry = this.getFinalDestinationCountry();
            strategy.appendField(locator, this, "finalDestinationCountry", buffer, theFinalDestinationCountry, (this.finalDestinationCountry!= null));
        }
        {
            List<CountryType> theTransitCountry;
            theTransitCountry = (((this.transitCountry!= null)&&(!this.transitCountry.isEmpty()))?this.getTransitCountry():null);
            strategy.appendField(locator, this, "transitCountry", buffer, theTransitCountry, ((this.transitCountry!= null)&&(!this.transitCountry.isEmpty())));
        }
        {
            ContractType theTransportContract;
            theTransportContract = this.getTransportContract();
            strategy.appendField(locator, this, "transportContract", buffer, theTransportContract, (this.transportContract!= null));
        }
        {
            List<TransportEventType> theTransportEvent;
            theTransportEvent = (((this.transportEvent!= null)&&(!this.transportEvent.isEmpty()))?this.getTransportEvent():null);
            strategy.appendField(locator, this, "transportEvent", buffer, theTransportEvent, ((this.transportEvent!= null)&&(!this.transportEvent.isEmpty())));
        }
        {
            TransportationServiceType theOriginalDespatchTransportationService;
            theOriginalDespatchTransportationService = this.getOriginalDespatchTransportationService();
            strategy.appendField(locator, this, "originalDespatchTransportationService", buffer, theOriginalDespatchTransportationService, (this.originalDespatchTransportationService!= null));
        }
        {
            TransportationServiceType theFinalDeliveryTransportationService;
            theFinalDeliveryTransportationService = this.getFinalDeliveryTransportationService();
            strategy.appendField(locator, this, "finalDeliveryTransportationService", buffer, theFinalDeliveryTransportationService, (this.finalDeliveryTransportationService!= null));
        }
        {
            DeliveryTermsType theDeliveryTerms;
            theDeliveryTerms = this.getDeliveryTerms();
            strategy.appendField(locator, this, "deliveryTerms", buffer, theDeliveryTerms, (this.deliveryTerms!= null));
        }
        {
            PaymentTermsType thePaymentTerms;
            thePaymentTerms = this.getPaymentTerms();
            strategy.appendField(locator, this, "paymentTerms", buffer, thePaymentTerms, (this.paymentTerms!= null));
        }
        {
            PaymentTermsType theCollectPaymentTerms;
            theCollectPaymentTerms = this.getCollectPaymentTerms();
            strategy.appendField(locator, this, "collectPaymentTerms", buffer, theCollectPaymentTerms, (this.collectPaymentTerms!= null));
        }
        {
            PaymentTermsType theDisbursementPaymentTerms;
            theDisbursementPaymentTerms = this.getDisbursementPaymentTerms();
            strategy.appendField(locator, this, "disbursementPaymentTerms", buffer, theDisbursementPaymentTerms, (this.disbursementPaymentTerms!= null));
        }
        {
            PaymentTermsType thePrepaidPaymentTerms;
            thePrepaidPaymentTerms = this.getPrepaidPaymentTerms();
            strategy.appendField(locator, this, "prepaidPaymentTerms", buffer, thePrepaidPaymentTerms, (this.prepaidPaymentTerms!= null));
        }
        {
            List<AllowanceChargeType> theFreightAllowanceCharge;
            theFreightAllowanceCharge = (((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty()))?this.getFreightAllowanceCharge():null);
            strategy.appendField(locator, this, "freightAllowanceCharge", buffer, theFreightAllowanceCharge, ((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty())));
        }
        {
            List<AllowanceChargeType> theExtraAllowanceCharge;
            theExtraAllowanceCharge = (((this.extraAllowanceCharge!= null)&&(!this.extraAllowanceCharge.isEmpty()))?this.getExtraAllowanceCharge():null);
            strategy.appendField(locator, this, "extraAllowanceCharge", buffer, theExtraAllowanceCharge, ((this.extraAllowanceCharge!= null)&&(!this.extraAllowanceCharge.isEmpty())));
        }
        {
            List<ShipmentStageType> theMainCarriageShipmentStage;
            theMainCarriageShipmentStage = (((this.mainCarriageShipmentStage!= null)&&(!this.mainCarriageShipmentStage.isEmpty()))?this.getMainCarriageShipmentStage():null);
            strategy.appendField(locator, this, "mainCarriageShipmentStage", buffer, theMainCarriageShipmentStage, ((this.mainCarriageShipmentStage!= null)&&(!this.mainCarriageShipmentStage.isEmpty())));
        }
        {
            List<ShipmentStageType> thePreCarriageShipmentStage;
            thePreCarriageShipmentStage = (((this.preCarriageShipmentStage!= null)&&(!this.preCarriageShipmentStage.isEmpty()))?this.getPreCarriageShipmentStage():null);
            strategy.appendField(locator, this, "preCarriageShipmentStage", buffer, thePreCarriageShipmentStage, ((this.preCarriageShipmentStage!= null)&&(!this.preCarriageShipmentStage.isEmpty())));
        }
        {
            List<ShipmentStageType> theOnCarriageShipmentStage;
            theOnCarriageShipmentStage = (((this.onCarriageShipmentStage!= null)&&(!this.onCarriageShipmentStage.isEmpty()))?this.getOnCarriageShipmentStage():null);
            strategy.appendField(locator, this, "onCarriageShipmentStage", buffer, theOnCarriageShipmentStage, ((this.onCarriageShipmentStage!= null)&&(!this.onCarriageShipmentStage.isEmpty())));
        }
        {
            List<TransportHandlingUnitType> theTransportHandlingUnit;
            theTransportHandlingUnit = (((this.transportHandlingUnit!= null)&&(!this.transportHandlingUnit.isEmpty()))?this.getTransportHandlingUnit():null);
            strategy.appendField(locator, this, "transportHandlingUnit", buffer, theTransportHandlingUnit, ((this.transportHandlingUnit!= null)&&(!this.transportHandlingUnit.isEmpty())));
        }
        {
            LocationType theFirstArrivalPortLocation;
            theFirstArrivalPortLocation = this.getFirstArrivalPortLocation();
            strategy.appendField(locator, this, "firstArrivalPortLocation", buffer, theFirstArrivalPortLocation, (this.firstArrivalPortLocation!= null));
        }
        {
            LocationType theLastExitPortLocation;
            theLastExitPortLocation = this.getLastExitPortLocation();
            strategy.appendField(locator, this, "lastExitPortLocation", buffer, theLastExitPortLocation, (this.lastExitPortLocation!= null));
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
        final ConsignmentType that = ((ConsignmentType) object);
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
            CarrierAssignedIDType lhsCarrierAssignedID;
            lhsCarrierAssignedID = this.getCarrierAssignedID();
            CarrierAssignedIDType rhsCarrierAssignedID;
            rhsCarrierAssignedID = that.getCarrierAssignedID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "carrierAssignedID", lhsCarrierAssignedID), LocatorUtils.property(thatLocator, "carrierAssignedID", rhsCarrierAssignedID), lhsCarrierAssignedID, rhsCarrierAssignedID, (this.carrierAssignedID!= null), (that.carrierAssignedID!= null))) {
                return false;
            }
        }
        {
            ConsigneeAssignedIDType lhsConsigneeAssignedID;
            lhsConsigneeAssignedID = this.getConsigneeAssignedID();
            ConsigneeAssignedIDType rhsConsigneeAssignedID;
            rhsConsigneeAssignedID = that.getConsigneeAssignedID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consigneeAssignedID", lhsConsigneeAssignedID), LocatorUtils.property(thatLocator, "consigneeAssignedID", rhsConsigneeAssignedID), lhsConsigneeAssignedID, rhsConsigneeAssignedID, (this.consigneeAssignedID!= null), (that.consigneeAssignedID!= null))) {
                return false;
            }
        }
        {
            ConsignorAssignedIDType lhsConsignorAssignedID;
            lhsConsignorAssignedID = this.getConsignorAssignedID();
            ConsignorAssignedIDType rhsConsignorAssignedID;
            rhsConsignorAssignedID = that.getConsignorAssignedID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consignorAssignedID", lhsConsignorAssignedID), LocatorUtils.property(thatLocator, "consignorAssignedID", rhsConsignorAssignedID), lhsConsignorAssignedID, rhsConsignorAssignedID, (this.consignorAssignedID!= null), (that.consignorAssignedID!= null))) {
                return false;
            }
        }
        {
            FreightForwarderAssignedIDType lhsFreightForwarderAssignedID;
            lhsFreightForwarderAssignedID = this.getFreightForwarderAssignedID();
            FreightForwarderAssignedIDType rhsFreightForwarderAssignedID;
            rhsFreightForwarderAssignedID = that.getFreightForwarderAssignedID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightForwarderAssignedID", lhsFreightForwarderAssignedID), LocatorUtils.property(thatLocator, "freightForwarderAssignedID", rhsFreightForwarderAssignedID), lhsFreightForwarderAssignedID, rhsFreightForwarderAssignedID, (this.freightForwarderAssignedID!= null), (that.freightForwarderAssignedID!= null))) {
                return false;
            }
        }
        {
            BrokerAssignedIDType lhsBrokerAssignedID;
            lhsBrokerAssignedID = this.getBrokerAssignedID();
            BrokerAssignedIDType rhsBrokerAssignedID;
            rhsBrokerAssignedID = that.getBrokerAssignedID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "brokerAssignedID", lhsBrokerAssignedID), LocatorUtils.property(thatLocator, "brokerAssignedID", rhsBrokerAssignedID), lhsBrokerAssignedID, rhsBrokerAssignedID, (this.brokerAssignedID!= null), (that.brokerAssignedID!= null))) {
                return false;
            }
        }
        {
            ContractedCarrierAssignedIDType lhsContractedCarrierAssignedID;
            lhsContractedCarrierAssignedID = this.getContractedCarrierAssignedID();
            ContractedCarrierAssignedIDType rhsContractedCarrierAssignedID;
            rhsContractedCarrierAssignedID = that.getContractedCarrierAssignedID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractedCarrierAssignedID", lhsContractedCarrierAssignedID), LocatorUtils.property(thatLocator, "contractedCarrierAssignedID", rhsContractedCarrierAssignedID), lhsContractedCarrierAssignedID, rhsContractedCarrierAssignedID, (this.contractedCarrierAssignedID!= null), (that.contractedCarrierAssignedID!= null))) {
                return false;
            }
        }
        {
            PerformingCarrierAssignedIDType lhsPerformingCarrierAssignedID;
            lhsPerformingCarrierAssignedID = this.getPerformingCarrierAssignedID();
            PerformingCarrierAssignedIDType rhsPerformingCarrierAssignedID;
            rhsPerformingCarrierAssignedID = that.getPerformingCarrierAssignedID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "performingCarrierAssignedID", lhsPerformingCarrierAssignedID), LocatorUtils.property(thatLocator, "performingCarrierAssignedID", rhsPerformingCarrierAssignedID), lhsPerformingCarrierAssignedID, rhsPerformingCarrierAssignedID, (this.performingCarrierAssignedID!= null), (that.performingCarrierAssignedID!= null))) {
                return false;
            }
        }
        {
            List<SummaryDescriptionType> lhsSummaryDescription;
            lhsSummaryDescription = (((this.summaryDescription!= null)&&(!this.summaryDescription.isEmpty()))?this.getSummaryDescription():null);
            List<SummaryDescriptionType> rhsSummaryDescription;
            rhsSummaryDescription = (((that.summaryDescription!= null)&&(!that.summaryDescription.isEmpty()))?that.getSummaryDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "summaryDescription", lhsSummaryDescription), LocatorUtils.property(thatLocator, "summaryDescription", rhsSummaryDescription), lhsSummaryDescription, rhsSummaryDescription, ((this.summaryDescription!= null)&&(!this.summaryDescription.isEmpty())), ((that.summaryDescription!= null)&&(!that.summaryDescription.isEmpty())))) {
                return false;
            }
        }
        {
            TotalInvoiceAmountType lhsTotalInvoiceAmount;
            lhsTotalInvoiceAmount = this.getTotalInvoiceAmount();
            TotalInvoiceAmountType rhsTotalInvoiceAmount;
            rhsTotalInvoiceAmount = that.getTotalInvoiceAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalInvoiceAmount", lhsTotalInvoiceAmount), LocatorUtils.property(thatLocator, "totalInvoiceAmount", rhsTotalInvoiceAmount), lhsTotalInvoiceAmount, rhsTotalInvoiceAmount, (this.totalInvoiceAmount!= null), (that.totalInvoiceAmount!= null))) {
                return false;
            }
        }
        {
            DeclaredCustomsValueAmountType lhsDeclaredCustomsValueAmount;
            lhsDeclaredCustomsValueAmount = this.getDeclaredCustomsValueAmount();
            DeclaredCustomsValueAmountType rhsDeclaredCustomsValueAmount;
            rhsDeclaredCustomsValueAmount = that.getDeclaredCustomsValueAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "declaredCustomsValueAmount", lhsDeclaredCustomsValueAmount), LocatorUtils.property(thatLocator, "declaredCustomsValueAmount", rhsDeclaredCustomsValueAmount), lhsDeclaredCustomsValueAmount, rhsDeclaredCustomsValueAmount, (this.declaredCustomsValueAmount!= null), (that.declaredCustomsValueAmount!= null))) {
                return false;
            }
        }
        {
            List<TariffDescriptionType> lhsTariffDescription;
            lhsTariffDescription = (((this.tariffDescription!= null)&&(!this.tariffDescription.isEmpty()))?this.getTariffDescription():null);
            List<TariffDescriptionType> rhsTariffDescription;
            rhsTariffDescription = (((that.tariffDescription!= null)&&(!that.tariffDescription.isEmpty()))?that.getTariffDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tariffDescription", lhsTariffDescription), LocatorUtils.property(thatLocator, "tariffDescription", rhsTariffDescription), lhsTariffDescription, rhsTariffDescription, ((this.tariffDescription!= null)&&(!this.tariffDescription.isEmpty())), ((that.tariffDescription!= null)&&(!that.tariffDescription.isEmpty())))) {
                return false;
            }
        }
        {
            TariffCodeType lhsTariffCode;
            lhsTariffCode = this.getTariffCode();
            TariffCodeType rhsTariffCode;
            rhsTariffCode = that.getTariffCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tariffCode", lhsTariffCode), LocatorUtils.property(thatLocator, "tariffCode", rhsTariffCode), lhsTariffCode, rhsTariffCode, (this.tariffCode!= null), (that.tariffCode!= null))) {
                return false;
            }
        }
        {
            InsurancePremiumAmountType lhsInsurancePremiumAmount;
            lhsInsurancePremiumAmount = this.getInsurancePremiumAmount();
            InsurancePremiumAmountType rhsInsurancePremiumAmount;
            rhsInsurancePremiumAmount = that.getInsurancePremiumAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "insurancePremiumAmount", lhsInsurancePremiumAmount), LocatorUtils.property(thatLocator, "insurancePremiumAmount", rhsInsurancePremiumAmount), lhsInsurancePremiumAmount, rhsInsurancePremiumAmount, (this.insurancePremiumAmount!= null), (that.insurancePremiumAmount!= null))) {
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
            NetWeightMeasureType lhsNetWeightMeasure;
            lhsNetWeightMeasure = this.getNetWeightMeasure();
            NetWeightMeasureType rhsNetWeightMeasure;
            rhsNetWeightMeasure = that.getNetWeightMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "netWeightMeasure", lhsNetWeightMeasure), LocatorUtils.property(thatLocator, "netWeightMeasure", rhsNetWeightMeasure), lhsNetWeightMeasure, rhsNetWeightMeasure, (this.netWeightMeasure!= null), (that.netWeightMeasure!= null))) {
                return false;
            }
        }
        {
            NetNetWeightMeasureType lhsNetNetWeightMeasure;
            lhsNetNetWeightMeasure = this.getNetNetWeightMeasure();
            NetNetWeightMeasureType rhsNetNetWeightMeasure;
            rhsNetNetWeightMeasure = that.getNetNetWeightMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "netNetWeightMeasure", lhsNetNetWeightMeasure), LocatorUtils.property(thatLocator, "netNetWeightMeasure", rhsNetNetWeightMeasure), lhsNetNetWeightMeasure, rhsNetNetWeightMeasure, (this.netNetWeightMeasure!= null), (that.netNetWeightMeasure!= null))) {
                return false;
            }
        }
        {
            ChargeableWeightMeasureType lhsChargeableWeightMeasure;
            lhsChargeableWeightMeasure = this.getChargeableWeightMeasure();
            ChargeableWeightMeasureType rhsChargeableWeightMeasure;
            rhsChargeableWeightMeasure = that.getChargeableWeightMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chargeableWeightMeasure", lhsChargeableWeightMeasure), LocatorUtils.property(thatLocator, "chargeableWeightMeasure", rhsChargeableWeightMeasure), lhsChargeableWeightMeasure, rhsChargeableWeightMeasure, (this.chargeableWeightMeasure!= null), (that.chargeableWeightMeasure!= null))) {
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
            NetVolumeMeasureType lhsNetVolumeMeasure;
            lhsNetVolumeMeasure = this.getNetVolumeMeasure();
            NetVolumeMeasureType rhsNetVolumeMeasure;
            rhsNetVolumeMeasure = that.getNetVolumeMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "netVolumeMeasure", lhsNetVolumeMeasure), LocatorUtils.property(thatLocator, "netVolumeMeasure", rhsNetVolumeMeasure), lhsNetVolumeMeasure, rhsNetVolumeMeasure, (this.netVolumeMeasure!= null), (that.netVolumeMeasure!= null))) {
                return false;
            }
        }
        {
            LoadingLengthMeasureType lhsLoadingLengthMeasure;
            lhsLoadingLengthMeasure = this.getLoadingLengthMeasure();
            LoadingLengthMeasureType rhsLoadingLengthMeasure;
            rhsLoadingLengthMeasure = that.getLoadingLengthMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loadingLengthMeasure", lhsLoadingLengthMeasure), LocatorUtils.property(thatLocator, "loadingLengthMeasure", rhsLoadingLengthMeasure), lhsLoadingLengthMeasure, rhsLoadingLengthMeasure, (this.loadingLengthMeasure!= null), (that.loadingLengthMeasure!= null))) {
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
            HazardousRiskIndicatorType lhsHazardousRiskIndicator;
            lhsHazardousRiskIndicator = this.getHazardousRiskIndicator();
            HazardousRiskIndicatorType rhsHazardousRiskIndicator;
            rhsHazardousRiskIndicator = that.getHazardousRiskIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hazardousRiskIndicator", lhsHazardousRiskIndicator), LocatorUtils.property(thatLocator, "hazardousRiskIndicator", rhsHazardousRiskIndicator), lhsHazardousRiskIndicator, rhsHazardousRiskIndicator, (this.hazardousRiskIndicator!= null), (that.hazardousRiskIndicator!= null))) {
                return false;
            }
        }
        {
            AnimalFoodIndicatorType lhsAnimalFoodIndicator;
            lhsAnimalFoodIndicator = this.getAnimalFoodIndicator();
            AnimalFoodIndicatorType rhsAnimalFoodIndicator;
            rhsAnimalFoodIndicator = that.getAnimalFoodIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "animalFoodIndicator", lhsAnimalFoodIndicator), LocatorUtils.property(thatLocator, "animalFoodIndicator", rhsAnimalFoodIndicator), lhsAnimalFoodIndicator, rhsAnimalFoodIndicator, (this.animalFoodIndicator!= null), (that.animalFoodIndicator!= null))) {
                return false;
            }
        }
        {
            HumanFoodIndicatorType lhsHumanFoodIndicator;
            lhsHumanFoodIndicator = this.getHumanFoodIndicator();
            HumanFoodIndicatorType rhsHumanFoodIndicator;
            rhsHumanFoodIndicator = that.getHumanFoodIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "humanFoodIndicator", lhsHumanFoodIndicator), LocatorUtils.property(thatLocator, "humanFoodIndicator", rhsHumanFoodIndicator), lhsHumanFoodIndicator, rhsHumanFoodIndicator, (this.humanFoodIndicator!= null), (that.humanFoodIndicator!= null))) {
                return false;
            }
        }
        {
            LivestockIndicatorType lhsLivestockIndicator;
            lhsLivestockIndicator = this.getLivestockIndicator();
            LivestockIndicatorType rhsLivestockIndicator;
            rhsLivestockIndicator = that.getLivestockIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "livestockIndicator", lhsLivestockIndicator), LocatorUtils.property(thatLocator, "livestockIndicator", rhsLivestockIndicator), lhsLivestockIndicator, rhsLivestockIndicator, (this.livestockIndicator!= null), (that.livestockIndicator!= null))) {
                return false;
            }
        }
        {
            BulkCargoIndicatorType lhsBulkCargoIndicator;
            lhsBulkCargoIndicator = this.getBulkCargoIndicator();
            BulkCargoIndicatorType rhsBulkCargoIndicator;
            rhsBulkCargoIndicator = that.getBulkCargoIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bulkCargoIndicator", lhsBulkCargoIndicator), LocatorUtils.property(thatLocator, "bulkCargoIndicator", rhsBulkCargoIndicator), lhsBulkCargoIndicator, rhsBulkCargoIndicator, (this.bulkCargoIndicator!= null), (that.bulkCargoIndicator!= null))) {
                return false;
            }
        }
        {
            ContainerizedIndicatorType lhsContainerizedIndicator;
            lhsContainerizedIndicator = this.getContainerizedIndicator();
            ContainerizedIndicatorType rhsContainerizedIndicator;
            rhsContainerizedIndicator = that.getContainerizedIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "containerizedIndicator", lhsContainerizedIndicator), LocatorUtils.property(thatLocator, "containerizedIndicator", rhsContainerizedIndicator), lhsContainerizedIndicator, rhsContainerizedIndicator, (this.containerizedIndicator!= null), (that.containerizedIndicator!= null))) {
                return false;
            }
        }
        {
            GeneralCargoIndicatorType lhsGeneralCargoIndicator;
            lhsGeneralCargoIndicator = this.getGeneralCargoIndicator();
            GeneralCargoIndicatorType rhsGeneralCargoIndicator;
            rhsGeneralCargoIndicator = that.getGeneralCargoIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "generalCargoIndicator", lhsGeneralCargoIndicator), LocatorUtils.property(thatLocator, "generalCargoIndicator", rhsGeneralCargoIndicator), lhsGeneralCargoIndicator, rhsGeneralCargoIndicator, (this.generalCargoIndicator!= null), (that.generalCargoIndicator!= null))) {
                return false;
            }
        }
        {
            SpecialSecurityIndicatorType lhsSpecialSecurityIndicator;
            lhsSpecialSecurityIndicator = this.getSpecialSecurityIndicator();
            SpecialSecurityIndicatorType rhsSpecialSecurityIndicator;
            rhsSpecialSecurityIndicator = that.getSpecialSecurityIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialSecurityIndicator", lhsSpecialSecurityIndicator), LocatorUtils.property(thatLocator, "specialSecurityIndicator", rhsSpecialSecurityIndicator), lhsSpecialSecurityIndicator, rhsSpecialSecurityIndicator, (this.specialSecurityIndicator!= null), (that.specialSecurityIndicator!= null))) {
                return false;
            }
        }
        {
            ThirdPartyPayerIndicatorType lhsThirdPartyPayerIndicator;
            lhsThirdPartyPayerIndicator = this.getThirdPartyPayerIndicator();
            ThirdPartyPayerIndicatorType rhsThirdPartyPayerIndicator;
            rhsThirdPartyPayerIndicator = that.getThirdPartyPayerIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thirdPartyPayerIndicator", lhsThirdPartyPayerIndicator), LocatorUtils.property(thatLocator, "thirdPartyPayerIndicator", rhsThirdPartyPayerIndicator), lhsThirdPartyPayerIndicator, rhsThirdPartyPayerIndicator, (this.thirdPartyPayerIndicator!= null), (that.thirdPartyPayerIndicator!= null))) {
                return false;
            }
        }
        {
            List<CarrierServiceInstructionsType> lhsCarrierServiceInstructions;
            lhsCarrierServiceInstructions = (((this.carrierServiceInstructions!= null)&&(!this.carrierServiceInstructions.isEmpty()))?this.getCarrierServiceInstructions():null);
            List<CarrierServiceInstructionsType> rhsCarrierServiceInstructions;
            rhsCarrierServiceInstructions = (((that.carrierServiceInstructions!= null)&&(!that.carrierServiceInstructions.isEmpty()))?that.getCarrierServiceInstructions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "carrierServiceInstructions", lhsCarrierServiceInstructions), LocatorUtils.property(thatLocator, "carrierServiceInstructions", rhsCarrierServiceInstructions), lhsCarrierServiceInstructions, rhsCarrierServiceInstructions, ((this.carrierServiceInstructions!= null)&&(!this.carrierServiceInstructions.isEmpty())), ((that.carrierServiceInstructions!= null)&&(!that.carrierServiceInstructions.isEmpty())))) {
                return false;
            }
        }
        {
            List<CustomsClearanceServiceInstructionsType> lhsCustomsClearanceServiceInstructions;
            lhsCustomsClearanceServiceInstructions = (((this.customsClearanceServiceInstructions!= null)&&(!this.customsClearanceServiceInstructions.isEmpty()))?this.getCustomsClearanceServiceInstructions():null);
            List<CustomsClearanceServiceInstructionsType> rhsCustomsClearanceServiceInstructions;
            rhsCustomsClearanceServiceInstructions = (((that.customsClearanceServiceInstructions!= null)&&(!that.customsClearanceServiceInstructions.isEmpty()))?that.getCustomsClearanceServiceInstructions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customsClearanceServiceInstructions", lhsCustomsClearanceServiceInstructions), LocatorUtils.property(thatLocator, "customsClearanceServiceInstructions", rhsCustomsClearanceServiceInstructions), lhsCustomsClearanceServiceInstructions, rhsCustomsClearanceServiceInstructions, ((this.customsClearanceServiceInstructions!= null)&&(!this.customsClearanceServiceInstructions.isEmpty())), ((that.customsClearanceServiceInstructions!= null)&&(!that.customsClearanceServiceInstructions.isEmpty())))) {
                return false;
            }
        }
        {
            List<ForwarderServiceInstructionsType> lhsForwarderServiceInstructions;
            lhsForwarderServiceInstructions = (((this.forwarderServiceInstructions!= null)&&(!this.forwarderServiceInstructions.isEmpty()))?this.getForwarderServiceInstructions():null);
            List<ForwarderServiceInstructionsType> rhsForwarderServiceInstructions;
            rhsForwarderServiceInstructions = (((that.forwarderServiceInstructions!= null)&&(!that.forwarderServiceInstructions.isEmpty()))?that.getForwarderServiceInstructions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forwarderServiceInstructions", lhsForwarderServiceInstructions), LocatorUtils.property(thatLocator, "forwarderServiceInstructions", rhsForwarderServiceInstructions), lhsForwarderServiceInstructions, rhsForwarderServiceInstructions, ((this.forwarderServiceInstructions!= null)&&(!this.forwarderServiceInstructions.isEmpty())), ((that.forwarderServiceInstructions!= null)&&(!that.forwarderServiceInstructions.isEmpty())))) {
                return false;
            }
        }
        {
            List<SpecialServiceInstructionsType> lhsSpecialServiceInstructions;
            lhsSpecialServiceInstructions = (((this.specialServiceInstructions!= null)&&(!this.specialServiceInstructions.isEmpty()))?this.getSpecialServiceInstructions():null);
            List<SpecialServiceInstructionsType> rhsSpecialServiceInstructions;
            rhsSpecialServiceInstructions = (((that.specialServiceInstructions!= null)&&(!that.specialServiceInstructions.isEmpty()))?that.getSpecialServiceInstructions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialServiceInstructions", lhsSpecialServiceInstructions), LocatorUtils.property(thatLocator, "specialServiceInstructions", rhsSpecialServiceInstructions), lhsSpecialServiceInstructions, rhsSpecialServiceInstructions, ((this.specialServiceInstructions!= null)&&(!this.specialServiceInstructions.isEmpty())), ((that.specialServiceInstructions!= null)&&(!that.specialServiceInstructions.isEmpty())))) {
                return false;
            }
        }
        {
            SequenceIDType lhsSequenceID;
            lhsSequenceID = this.getSequenceID();
            SequenceIDType rhsSequenceID;
            rhsSequenceID = that.getSequenceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceID", lhsSequenceID), LocatorUtils.property(thatLocator, "sequenceID", rhsSequenceID), lhsSequenceID, rhsSequenceID, (this.sequenceID!= null), (that.sequenceID!= null))) {
                return false;
            }
        }
        {
            ShippingPriorityLevelCodeType lhsShippingPriorityLevelCode;
            lhsShippingPriorityLevelCode = this.getShippingPriorityLevelCode();
            ShippingPriorityLevelCodeType rhsShippingPriorityLevelCode;
            rhsShippingPriorityLevelCode = that.getShippingPriorityLevelCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingPriorityLevelCode", lhsShippingPriorityLevelCode), LocatorUtils.property(thatLocator, "shippingPriorityLevelCode", rhsShippingPriorityLevelCode), lhsShippingPriorityLevelCode, rhsShippingPriorityLevelCode, (this.shippingPriorityLevelCode!= null), (that.shippingPriorityLevelCode!= null))) {
                return false;
            }
        }
        {
            HandlingCodeType lhsHandlingCode;
            lhsHandlingCode = this.getHandlingCode();
            HandlingCodeType rhsHandlingCode;
            rhsHandlingCode = that.getHandlingCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handlingCode", lhsHandlingCode), LocatorUtils.property(thatLocator, "handlingCode", rhsHandlingCode), lhsHandlingCode, rhsHandlingCode, (this.handlingCode!= null), (that.handlingCode!= null))) {
                return false;
            }
        }
        {
            List<HandlingInstructionsType> lhsHandlingInstructions;
            lhsHandlingInstructions = (((this.handlingInstructions!= null)&&(!this.handlingInstructions.isEmpty()))?this.getHandlingInstructions():null);
            List<HandlingInstructionsType> rhsHandlingInstructions;
            rhsHandlingInstructions = (((that.handlingInstructions!= null)&&(!that.handlingInstructions.isEmpty()))?that.getHandlingInstructions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handlingInstructions", lhsHandlingInstructions), LocatorUtils.property(thatLocator, "handlingInstructions", rhsHandlingInstructions), lhsHandlingInstructions, rhsHandlingInstructions, ((this.handlingInstructions!= null)&&(!this.handlingInstructions.isEmpty())), ((that.handlingInstructions!= null)&&(!that.handlingInstructions.isEmpty())))) {
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
            TotalGoodsItemQuantityType lhsTotalGoodsItemQuantity;
            lhsTotalGoodsItemQuantity = this.getTotalGoodsItemQuantity();
            TotalGoodsItemQuantityType rhsTotalGoodsItemQuantity;
            rhsTotalGoodsItemQuantity = that.getTotalGoodsItemQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalGoodsItemQuantity", lhsTotalGoodsItemQuantity), LocatorUtils.property(thatLocator, "totalGoodsItemQuantity", rhsTotalGoodsItemQuantity), lhsTotalGoodsItemQuantity, rhsTotalGoodsItemQuantity, (this.totalGoodsItemQuantity!= null), (that.totalGoodsItemQuantity!= null))) {
                return false;
            }
        }
        {
            TotalTransportHandlingUnitQuantityType lhsTotalTransportHandlingUnitQuantity;
            lhsTotalTransportHandlingUnitQuantity = this.getTotalTransportHandlingUnitQuantity();
            TotalTransportHandlingUnitQuantityType rhsTotalTransportHandlingUnitQuantity;
            rhsTotalTransportHandlingUnitQuantity = that.getTotalTransportHandlingUnitQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalTransportHandlingUnitQuantity", lhsTotalTransportHandlingUnitQuantity), LocatorUtils.property(thatLocator, "totalTransportHandlingUnitQuantity", rhsTotalTransportHandlingUnitQuantity), lhsTotalTransportHandlingUnitQuantity, rhsTotalTransportHandlingUnitQuantity, (this.totalTransportHandlingUnitQuantity!= null), (that.totalTransportHandlingUnitQuantity!= null))) {
                return false;
            }
        }
        {
            InsuranceValueAmountType lhsInsuranceValueAmount;
            lhsInsuranceValueAmount = this.getInsuranceValueAmount();
            InsuranceValueAmountType rhsInsuranceValueAmount;
            rhsInsuranceValueAmount = that.getInsuranceValueAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "insuranceValueAmount", lhsInsuranceValueAmount), LocatorUtils.property(thatLocator, "insuranceValueAmount", rhsInsuranceValueAmount), lhsInsuranceValueAmount, rhsInsuranceValueAmount, (this.insuranceValueAmount!= null), (that.insuranceValueAmount!= null))) {
                return false;
            }
        }
        {
            DeclaredForCarriageValueAmountType lhsDeclaredForCarriageValueAmount;
            lhsDeclaredForCarriageValueAmount = this.getDeclaredForCarriageValueAmount();
            DeclaredForCarriageValueAmountType rhsDeclaredForCarriageValueAmount;
            rhsDeclaredForCarriageValueAmount = that.getDeclaredForCarriageValueAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "declaredForCarriageValueAmount", lhsDeclaredForCarriageValueAmount), LocatorUtils.property(thatLocator, "declaredForCarriageValueAmount", rhsDeclaredForCarriageValueAmount), lhsDeclaredForCarriageValueAmount, rhsDeclaredForCarriageValueAmount, (this.declaredForCarriageValueAmount!= null), (that.declaredForCarriageValueAmount!= null))) {
                return false;
            }
        }
        {
            DeclaredStatisticsValueAmountType lhsDeclaredStatisticsValueAmount;
            lhsDeclaredStatisticsValueAmount = this.getDeclaredStatisticsValueAmount();
            DeclaredStatisticsValueAmountType rhsDeclaredStatisticsValueAmount;
            rhsDeclaredStatisticsValueAmount = that.getDeclaredStatisticsValueAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "declaredStatisticsValueAmount", lhsDeclaredStatisticsValueAmount), LocatorUtils.property(thatLocator, "declaredStatisticsValueAmount", rhsDeclaredStatisticsValueAmount), lhsDeclaredStatisticsValueAmount, rhsDeclaredStatisticsValueAmount, (this.declaredStatisticsValueAmount!= null), (that.declaredStatisticsValueAmount!= null))) {
                return false;
            }
        }
        {
            FreeOnBoardValueAmountType lhsFreeOnBoardValueAmount;
            lhsFreeOnBoardValueAmount = this.getFreeOnBoardValueAmount();
            FreeOnBoardValueAmountType rhsFreeOnBoardValueAmount;
            rhsFreeOnBoardValueAmount = that.getFreeOnBoardValueAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeOnBoardValueAmount", lhsFreeOnBoardValueAmount), LocatorUtils.property(thatLocator, "freeOnBoardValueAmount", rhsFreeOnBoardValueAmount), lhsFreeOnBoardValueAmount, rhsFreeOnBoardValueAmount, (this.freeOnBoardValueAmount!= null), (that.freeOnBoardValueAmount!= null))) {
                return false;
            }
        }
        {
            List<SpecialInstructionsType> lhsSpecialInstructions;
            lhsSpecialInstructions = (((this.specialInstructions!= null)&&(!this.specialInstructions.isEmpty()))?this.getSpecialInstructions():null);
            List<SpecialInstructionsType> rhsSpecialInstructions;
            rhsSpecialInstructions = (((that.specialInstructions!= null)&&(!that.specialInstructions.isEmpty()))?that.getSpecialInstructions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialInstructions", lhsSpecialInstructions), LocatorUtils.property(thatLocator, "specialInstructions", rhsSpecialInstructions), lhsSpecialInstructions, rhsSpecialInstructions, ((this.specialInstructions!= null)&&(!this.specialInstructions.isEmpty())), ((that.specialInstructions!= null)&&(!that.specialInstructions.isEmpty())))) {
                return false;
            }
        }
        {
            SplitConsignmentIndicatorType lhsSplitConsignmentIndicator;
            lhsSplitConsignmentIndicator = this.getSplitConsignmentIndicator();
            SplitConsignmentIndicatorType rhsSplitConsignmentIndicator;
            rhsSplitConsignmentIndicator = that.getSplitConsignmentIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "splitConsignmentIndicator", lhsSplitConsignmentIndicator), LocatorUtils.property(thatLocator, "splitConsignmentIndicator", rhsSplitConsignmentIndicator), lhsSplitConsignmentIndicator, rhsSplitConsignmentIndicator, (this.splitConsignmentIndicator!= null), (that.splitConsignmentIndicator!= null))) {
                return false;
            }
        }
        {
            List<DeliveryInstructionsType> lhsDeliveryInstructions;
            lhsDeliveryInstructions = (((this.deliveryInstructions!= null)&&(!this.deliveryInstructions.isEmpty()))?this.getDeliveryInstructions():null);
            List<DeliveryInstructionsType> rhsDeliveryInstructions;
            rhsDeliveryInstructions = (((that.deliveryInstructions!= null)&&(!that.deliveryInstructions.isEmpty()))?that.getDeliveryInstructions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryInstructions", lhsDeliveryInstructions), LocatorUtils.property(thatLocator, "deliveryInstructions", rhsDeliveryInstructions), lhsDeliveryInstructions, rhsDeliveryInstructions, ((this.deliveryInstructions!= null)&&(!this.deliveryInstructions.isEmpty())), ((that.deliveryInstructions!= null)&&(!that.deliveryInstructions.isEmpty())))) {
                return false;
            }
        }
        {
            ConsignmentQuantityType lhsConsignmentQuantity;
            lhsConsignmentQuantity = this.getConsignmentQuantity();
            ConsignmentQuantityType rhsConsignmentQuantity;
            rhsConsignmentQuantity = that.getConsignmentQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consignmentQuantity", lhsConsignmentQuantity), LocatorUtils.property(thatLocator, "consignmentQuantity", rhsConsignmentQuantity), lhsConsignmentQuantity, rhsConsignmentQuantity, (this.consignmentQuantity!= null), (that.consignmentQuantity!= null))) {
                return false;
            }
        }
        {
            ConsolidatableIndicatorType lhsConsolidatableIndicator;
            lhsConsolidatableIndicator = this.getConsolidatableIndicator();
            ConsolidatableIndicatorType rhsConsolidatableIndicator;
            rhsConsolidatableIndicator = that.getConsolidatableIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consolidatableIndicator", lhsConsolidatableIndicator), LocatorUtils.property(thatLocator, "consolidatableIndicator", rhsConsolidatableIndicator), lhsConsolidatableIndicator, rhsConsolidatableIndicator, (this.consolidatableIndicator!= null), (that.consolidatableIndicator!= null))) {
                return false;
            }
        }
        {
            List<HaulageInstructionsType> lhsHaulageInstructions;
            lhsHaulageInstructions = (((this.haulageInstructions!= null)&&(!this.haulageInstructions.isEmpty()))?this.getHaulageInstructions():null);
            List<HaulageInstructionsType> rhsHaulageInstructions;
            rhsHaulageInstructions = (((that.haulageInstructions!= null)&&(!that.haulageInstructions.isEmpty()))?that.getHaulageInstructions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "haulageInstructions", lhsHaulageInstructions), LocatorUtils.property(thatLocator, "haulageInstructions", rhsHaulageInstructions), lhsHaulageInstructions, rhsHaulageInstructions, ((this.haulageInstructions!= null)&&(!this.haulageInstructions.isEmpty())), ((that.haulageInstructions!= null)&&(!that.haulageInstructions.isEmpty())))) {
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
            ChildConsignmentQuantityType lhsChildConsignmentQuantity;
            lhsChildConsignmentQuantity = this.getChildConsignmentQuantity();
            ChildConsignmentQuantityType rhsChildConsignmentQuantity;
            rhsChildConsignmentQuantity = that.getChildConsignmentQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "childConsignmentQuantity", lhsChildConsignmentQuantity), LocatorUtils.property(thatLocator, "childConsignmentQuantity", rhsChildConsignmentQuantity), lhsChildConsignmentQuantity, rhsChildConsignmentQuantity, (this.childConsignmentQuantity!= null), (that.childConsignmentQuantity!= null))) {
                return false;
            }
        }
        {
            TotalPackagesQuantityType lhsTotalPackagesQuantity;
            lhsTotalPackagesQuantity = this.getTotalPackagesQuantity();
            TotalPackagesQuantityType rhsTotalPackagesQuantity;
            rhsTotalPackagesQuantity = that.getTotalPackagesQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalPackagesQuantity", lhsTotalPackagesQuantity), LocatorUtils.property(thatLocator, "totalPackagesQuantity", rhsTotalPackagesQuantity), lhsTotalPackagesQuantity, rhsTotalPackagesQuantity, (this.totalPackagesQuantity!= null), (that.totalPackagesQuantity!= null))) {
                return false;
            }
        }
        {
            List<ShipmentType> lhsConsolidatedShipment;
            lhsConsolidatedShipment = (((this.consolidatedShipment!= null)&&(!this.consolidatedShipment.isEmpty()))?this.getConsolidatedShipment():null);
            List<ShipmentType> rhsConsolidatedShipment;
            rhsConsolidatedShipment = (((that.consolidatedShipment!= null)&&(!that.consolidatedShipment.isEmpty()))?that.getConsolidatedShipment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consolidatedShipment", lhsConsolidatedShipment), LocatorUtils.property(thatLocator, "consolidatedShipment", rhsConsolidatedShipment), lhsConsolidatedShipment, rhsConsolidatedShipment, ((this.consolidatedShipment!= null)&&(!this.consolidatedShipment.isEmpty())), ((that.consolidatedShipment!= null)&&(!that.consolidatedShipment.isEmpty())))) {
                return false;
            }
        }
        {
            List<CustomsDeclarationType> lhsCustomsDeclaration;
            lhsCustomsDeclaration = (((this.customsDeclaration!= null)&&(!this.customsDeclaration.isEmpty()))?this.getCustomsDeclaration():null);
            List<CustomsDeclarationType> rhsCustomsDeclaration;
            rhsCustomsDeclaration = (((that.customsDeclaration!= null)&&(!that.customsDeclaration.isEmpty()))?that.getCustomsDeclaration():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customsDeclaration", lhsCustomsDeclaration), LocatorUtils.property(thatLocator, "customsDeclaration", rhsCustomsDeclaration), lhsCustomsDeclaration, rhsCustomsDeclaration, ((this.customsDeclaration!= null)&&(!this.customsDeclaration.isEmpty())), ((that.customsDeclaration!= null)&&(!that.customsDeclaration.isEmpty())))) {
                return false;
            }
        }
        {
            TransportEventType lhsRequestedPickupTransportEvent;
            lhsRequestedPickupTransportEvent = this.getRequestedPickupTransportEvent();
            TransportEventType rhsRequestedPickupTransportEvent;
            rhsRequestedPickupTransportEvent = that.getRequestedPickupTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedPickupTransportEvent", lhsRequestedPickupTransportEvent), LocatorUtils.property(thatLocator, "requestedPickupTransportEvent", rhsRequestedPickupTransportEvent), lhsRequestedPickupTransportEvent, rhsRequestedPickupTransportEvent, (this.requestedPickupTransportEvent!= null), (that.requestedPickupTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsRequestedDeliveryTransportEvent;
            lhsRequestedDeliveryTransportEvent = this.getRequestedDeliveryTransportEvent();
            TransportEventType rhsRequestedDeliveryTransportEvent;
            rhsRequestedDeliveryTransportEvent = that.getRequestedDeliveryTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedDeliveryTransportEvent", lhsRequestedDeliveryTransportEvent), LocatorUtils.property(thatLocator, "requestedDeliveryTransportEvent", rhsRequestedDeliveryTransportEvent), lhsRequestedDeliveryTransportEvent, rhsRequestedDeliveryTransportEvent, (this.requestedDeliveryTransportEvent!= null), (that.requestedDeliveryTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsPlannedPickupTransportEvent;
            lhsPlannedPickupTransportEvent = this.getPlannedPickupTransportEvent();
            TransportEventType rhsPlannedPickupTransportEvent;
            rhsPlannedPickupTransportEvent = that.getPlannedPickupTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plannedPickupTransportEvent", lhsPlannedPickupTransportEvent), LocatorUtils.property(thatLocator, "plannedPickupTransportEvent", rhsPlannedPickupTransportEvent), lhsPlannedPickupTransportEvent, rhsPlannedPickupTransportEvent, (this.plannedPickupTransportEvent!= null), (that.plannedPickupTransportEvent!= null))) {
                return false;
            }
        }
        {
            TransportEventType lhsPlannedDeliveryTransportEvent;
            lhsPlannedDeliveryTransportEvent = this.getPlannedDeliveryTransportEvent();
            TransportEventType rhsPlannedDeliveryTransportEvent;
            rhsPlannedDeliveryTransportEvent = that.getPlannedDeliveryTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plannedDeliveryTransportEvent", lhsPlannedDeliveryTransportEvent), LocatorUtils.property(thatLocator, "plannedDeliveryTransportEvent", rhsPlannedDeliveryTransportEvent), lhsPlannedDeliveryTransportEvent, rhsPlannedDeliveryTransportEvent, (this.plannedDeliveryTransportEvent!= null), (that.plannedDeliveryTransportEvent!= null))) {
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
            TransportEventType lhsActualDeliveryTransportEvent;
            lhsActualDeliveryTransportEvent = this.getActualDeliveryTransportEvent();
            TransportEventType rhsActualDeliveryTransportEvent;
            rhsActualDeliveryTransportEvent = that.getActualDeliveryTransportEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualDeliveryTransportEvent", lhsActualDeliveryTransportEvent), LocatorUtils.property(thatLocator, "actualDeliveryTransportEvent", rhsActualDeliveryTransportEvent), lhsActualDeliveryTransportEvent, rhsActualDeliveryTransportEvent, (this.actualDeliveryTransportEvent!= null), (that.actualDeliveryTransportEvent!= null))) {
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
        {
            List<ConsignmentType> lhsChildConsignment;
            lhsChildConsignment = (((this.childConsignment!= null)&&(!this.childConsignment.isEmpty()))?this.getChildConsignment():null);
            List<ConsignmentType> rhsChildConsignment;
            rhsChildConsignment = (((that.childConsignment!= null)&&(!that.childConsignment.isEmpty()))?that.getChildConsignment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "childConsignment", lhsChildConsignment), LocatorUtils.property(thatLocator, "childConsignment", rhsChildConsignment), lhsChildConsignment, rhsChildConsignment, ((this.childConsignment!= null)&&(!this.childConsignment.isEmpty())), ((that.childConsignment!= null)&&(!that.childConsignment.isEmpty())))) {
                return false;
            }
        }
        {
            PartyType lhsConsigneeParty;
            lhsConsigneeParty = this.getConsigneeParty();
            PartyType rhsConsigneeParty;
            rhsConsigneeParty = that.getConsigneeParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consigneeParty", lhsConsigneeParty), LocatorUtils.property(thatLocator, "consigneeParty", rhsConsigneeParty), lhsConsigneeParty, rhsConsigneeParty, (this.consigneeParty!= null), (that.consigneeParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsExporterParty;
            lhsExporterParty = this.getExporterParty();
            PartyType rhsExporterParty;
            rhsExporterParty = that.getExporterParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exporterParty", lhsExporterParty), LocatorUtils.property(thatLocator, "exporterParty", rhsExporterParty), lhsExporterParty, rhsExporterParty, (this.exporterParty!= null), (that.exporterParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsConsignorParty;
            lhsConsignorParty = this.getConsignorParty();
            PartyType rhsConsignorParty;
            rhsConsignorParty = that.getConsignorParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consignorParty", lhsConsignorParty), LocatorUtils.property(thatLocator, "consignorParty", rhsConsignorParty), lhsConsignorParty, rhsConsignorParty, (this.consignorParty!= null), (that.consignorParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsImporterParty;
            lhsImporterParty = this.getImporterParty();
            PartyType rhsImporterParty;
            rhsImporterParty = that.getImporterParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "importerParty", lhsImporterParty), LocatorUtils.property(thatLocator, "importerParty", rhsImporterParty), lhsImporterParty, rhsImporterParty, (this.importerParty!= null), (that.importerParty!= null))) {
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
            PartyType lhsFreightForwarderParty;
            lhsFreightForwarderParty = this.getFreightForwarderParty();
            PartyType rhsFreightForwarderParty;
            rhsFreightForwarderParty = that.getFreightForwarderParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freightForwarderParty", lhsFreightForwarderParty), LocatorUtils.property(thatLocator, "freightForwarderParty", rhsFreightForwarderParty), lhsFreightForwarderParty, rhsFreightForwarderParty, (this.freightForwarderParty!= null), (that.freightForwarderParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsNotifyParty;
            lhsNotifyParty = this.getNotifyParty();
            PartyType rhsNotifyParty;
            rhsNotifyParty = that.getNotifyParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notifyParty", lhsNotifyParty), LocatorUtils.property(thatLocator, "notifyParty", rhsNotifyParty), lhsNotifyParty, rhsNotifyParty, (this.notifyParty!= null), (that.notifyParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsOriginalDespatchParty;
            lhsOriginalDespatchParty = this.getOriginalDespatchParty();
            PartyType rhsOriginalDespatchParty;
            rhsOriginalDespatchParty = that.getOriginalDespatchParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalDespatchParty", lhsOriginalDespatchParty), LocatorUtils.property(thatLocator, "originalDespatchParty", rhsOriginalDespatchParty), lhsOriginalDespatchParty, rhsOriginalDespatchParty, (this.originalDespatchParty!= null), (that.originalDespatchParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsFinalDeliveryParty;
            lhsFinalDeliveryParty = this.getFinalDeliveryParty();
            PartyType rhsFinalDeliveryParty;
            rhsFinalDeliveryParty = that.getFinalDeliveryParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finalDeliveryParty", lhsFinalDeliveryParty), LocatorUtils.property(thatLocator, "finalDeliveryParty", rhsFinalDeliveryParty), lhsFinalDeliveryParty, rhsFinalDeliveryParty, (this.finalDeliveryParty!= null), (that.finalDeliveryParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsPerformingCarrierParty;
            lhsPerformingCarrierParty = this.getPerformingCarrierParty();
            PartyType rhsPerformingCarrierParty;
            rhsPerformingCarrierParty = that.getPerformingCarrierParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "performingCarrierParty", lhsPerformingCarrierParty), LocatorUtils.property(thatLocator, "performingCarrierParty", rhsPerformingCarrierParty), lhsPerformingCarrierParty, rhsPerformingCarrierParty, (this.performingCarrierParty!= null), (that.performingCarrierParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsSubstituteCarrierParty;
            lhsSubstituteCarrierParty = this.getSubstituteCarrierParty();
            PartyType rhsSubstituteCarrierParty;
            rhsSubstituteCarrierParty = that.getSubstituteCarrierParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substituteCarrierParty", lhsSubstituteCarrierParty), LocatorUtils.property(thatLocator, "substituteCarrierParty", rhsSubstituteCarrierParty), lhsSubstituteCarrierParty, rhsSubstituteCarrierParty, (this.substituteCarrierParty!= null), (that.substituteCarrierParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsLogisticsOperatorParty;
            lhsLogisticsOperatorParty = this.getLogisticsOperatorParty();
            PartyType rhsLogisticsOperatorParty;
            rhsLogisticsOperatorParty = that.getLogisticsOperatorParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logisticsOperatorParty", lhsLogisticsOperatorParty), LocatorUtils.property(thatLocator, "logisticsOperatorParty", rhsLogisticsOperatorParty), lhsLogisticsOperatorParty, rhsLogisticsOperatorParty, (this.logisticsOperatorParty!= null), (that.logisticsOperatorParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsTransportAdvisorParty;
            lhsTransportAdvisorParty = this.getTransportAdvisorParty();
            PartyType rhsTransportAdvisorParty;
            rhsTransportAdvisorParty = that.getTransportAdvisorParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportAdvisorParty", lhsTransportAdvisorParty), LocatorUtils.property(thatLocator, "transportAdvisorParty", rhsTransportAdvisorParty), lhsTransportAdvisorParty, rhsTransportAdvisorParty, (this.transportAdvisorParty!= null), (that.transportAdvisorParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsHazardousItemNotificationParty;
            lhsHazardousItemNotificationParty = this.getHazardousItemNotificationParty();
            PartyType rhsHazardousItemNotificationParty;
            rhsHazardousItemNotificationParty = that.getHazardousItemNotificationParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hazardousItemNotificationParty", lhsHazardousItemNotificationParty), LocatorUtils.property(thatLocator, "hazardousItemNotificationParty", rhsHazardousItemNotificationParty), lhsHazardousItemNotificationParty, rhsHazardousItemNotificationParty, (this.hazardousItemNotificationParty!= null), (that.hazardousItemNotificationParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsInsuranceParty;
            lhsInsuranceParty = this.getInsuranceParty();
            PartyType rhsInsuranceParty;
            rhsInsuranceParty = that.getInsuranceParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "insuranceParty", lhsInsuranceParty), LocatorUtils.property(thatLocator, "insuranceParty", rhsInsuranceParty), lhsInsuranceParty, rhsInsuranceParty, (this.insuranceParty!= null), (that.insuranceParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsMortgageHolderParty;
            lhsMortgageHolderParty = this.getMortgageHolderParty();
            PartyType rhsMortgageHolderParty;
            rhsMortgageHolderParty = that.getMortgageHolderParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mortgageHolderParty", lhsMortgageHolderParty), LocatorUtils.property(thatLocator, "mortgageHolderParty", rhsMortgageHolderParty), lhsMortgageHolderParty, rhsMortgageHolderParty, (this.mortgageHolderParty!= null), (that.mortgageHolderParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsBillOfLadingHolderParty;
            lhsBillOfLadingHolderParty = this.getBillOfLadingHolderParty();
            PartyType rhsBillOfLadingHolderParty;
            rhsBillOfLadingHolderParty = that.getBillOfLadingHolderParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billOfLadingHolderParty", lhsBillOfLadingHolderParty), LocatorUtils.property(thatLocator, "billOfLadingHolderParty", rhsBillOfLadingHolderParty), lhsBillOfLadingHolderParty, rhsBillOfLadingHolderParty, (this.billOfLadingHolderParty!= null), (that.billOfLadingHolderParty!= null))) {
                return false;
            }
        }
        {
            CountryType lhsOriginalDepartureCountry;
            lhsOriginalDepartureCountry = this.getOriginalDepartureCountry();
            CountryType rhsOriginalDepartureCountry;
            rhsOriginalDepartureCountry = that.getOriginalDepartureCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalDepartureCountry", lhsOriginalDepartureCountry), LocatorUtils.property(thatLocator, "originalDepartureCountry", rhsOriginalDepartureCountry), lhsOriginalDepartureCountry, rhsOriginalDepartureCountry, (this.originalDepartureCountry!= null), (that.originalDepartureCountry!= null))) {
                return false;
            }
        }
        {
            CountryType lhsFinalDestinationCountry;
            lhsFinalDestinationCountry = this.getFinalDestinationCountry();
            CountryType rhsFinalDestinationCountry;
            rhsFinalDestinationCountry = that.getFinalDestinationCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finalDestinationCountry", lhsFinalDestinationCountry), LocatorUtils.property(thatLocator, "finalDestinationCountry", rhsFinalDestinationCountry), lhsFinalDestinationCountry, rhsFinalDestinationCountry, (this.finalDestinationCountry!= null), (that.finalDestinationCountry!= null))) {
                return false;
            }
        }
        {
            List<CountryType> lhsTransitCountry;
            lhsTransitCountry = (((this.transitCountry!= null)&&(!this.transitCountry.isEmpty()))?this.getTransitCountry():null);
            List<CountryType> rhsTransitCountry;
            rhsTransitCountry = (((that.transitCountry!= null)&&(!that.transitCountry.isEmpty()))?that.getTransitCountry():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transitCountry", lhsTransitCountry), LocatorUtils.property(thatLocator, "transitCountry", rhsTransitCountry), lhsTransitCountry, rhsTransitCountry, ((this.transitCountry!= null)&&(!this.transitCountry.isEmpty())), ((that.transitCountry!= null)&&(!that.transitCountry.isEmpty())))) {
                return false;
            }
        }
        {
            ContractType lhsTransportContract;
            lhsTransportContract = this.getTransportContract();
            ContractType rhsTransportContract;
            rhsTransportContract = that.getTransportContract();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportContract", lhsTransportContract), LocatorUtils.property(thatLocator, "transportContract", rhsTransportContract), lhsTransportContract, rhsTransportContract, (this.transportContract!= null), (that.transportContract!= null))) {
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
            TransportationServiceType lhsOriginalDespatchTransportationService;
            lhsOriginalDespatchTransportationService = this.getOriginalDespatchTransportationService();
            TransportationServiceType rhsOriginalDespatchTransportationService;
            rhsOriginalDespatchTransportationService = that.getOriginalDespatchTransportationService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalDespatchTransportationService", lhsOriginalDespatchTransportationService), LocatorUtils.property(thatLocator, "originalDespatchTransportationService", rhsOriginalDespatchTransportationService), lhsOriginalDespatchTransportationService, rhsOriginalDespatchTransportationService, (this.originalDespatchTransportationService!= null), (that.originalDespatchTransportationService!= null))) {
                return false;
            }
        }
        {
            TransportationServiceType lhsFinalDeliveryTransportationService;
            lhsFinalDeliveryTransportationService = this.getFinalDeliveryTransportationService();
            TransportationServiceType rhsFinalDeliveryTransportationService;
            rhsFinalDeliveryTransportationService = that.getFinalDeliveryTransportationService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finalDeliveryTransportationService", lhsFinalDeliveryTransportationService), LocatorUtils.property(thatLocator, "finalDeliveryTransportationService", rhsFinalDeliveryTransportationService), lhsFinalDeliveryTransportationService, rhsFinalDeliveryTransportationService, (this.finalDeliveryTransportationService!= null), (that.finalDeliveryTransportationService!= null))) {
                return false;
            }
        }
        {
            DeliveryTermsType lhsDeliveryTerms;
            lhsDeliveryTerms = this.getDeliveryTerms();
            DeliveryTermsType rhsDeliveryTerms;
            rhsDeliveryTerms = that.getDeliveryTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryTerms", lhsDeliveryTerms), LocatorUtils.property(thatLocator, "deliveryTerms", rhsDeliveryTerms), lhsDeliveryTerms, rhsDeliveryTerms, (this.deliveryTerms!= null), (that.deliveryTerms!= null))) {
                return false;
            }
        }
        {
            PaymentTermsType lhsPaymentTerms;
            lhsPaymentTerms = this.getPaymentTerms();
            PaymentTermsType rhsPaymentTerms;
            rhsPaymentTerms = that.getPaymentTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentTerms", lhsPaymentTerms), LocatorUtils.property(thatLocator, "paymentTerms", rhsPaymentTerms), lhsPaymentTerms, rhsPaymentTerms, (this.paymentTerms!= null), (that.paymentTerms!= null))) {
                return false;
            }
        }
        {
            PaymentTermsType lhsCollectPaymentTerms;
            lhsCollectPaymentTerms = this.getCollectPaymentTerms();
            PaymentTermsType rhsCollectPaymentTerms;
            rhsCollectPaymentTerms = that.getCollectPaymentTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "collectPaymentTerms", lhsCollectPaymentTerms), LocatorUtils.property(thatLocator, "collectPaymentTerms", rhsCollectPaymentTerms), lhsCollectPaymentTerms, rhsCollectPaymentTerms, (this.collectPaymentTerms!= null), (that.collectPaymentTerms!= null))) {
                return false;
            }
        }
        {
            PaymentTermsType lhsDisbursementPaymentTerms;
            lhsDisbursementPaymentTerms = this.getDisbursementPaymentTerms();
            PaymentTermsType rhsDisbursementPaymentTerms;
            rhsDisbursementPaymentTerms = that.getDisbursementPaymentTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "disbursementPaymentTerms", lhsDisbursementPaymentTerms), LocatorUtils.property(thatLocator, "disbursementPaymentTerms", rhsDisbursementPaymentTerms), lhsDisbursementPaymentTerms, rhsDisbursementPaymentTerms, (this.disbursementPaymentTerms!= null), (that.disbursementPaymentTerms!= null))) {
                return false;
            }
        }
        {
            PaymentTermsType lhsPrepaidPaymentTerms;
            lhsPrepaidPaymentTerms = this.getPrepaidPaymentTerms();
            PaymentTermsType rhsPrepaidPaymentTerms;
            rhsPrepaidPaymentTerms = that.getPrepaidPaymentTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prepaidPaymentTerms", lhsPrepaidPaymentTerms), LocatorUtils.property(thatLocator, "prepaidPaymentTerms", rhsPrepaidPaymentTerms), lhsPrepaidPaymentTerms, rhsPrepaidPaymentTerms, (this.prepaidPaymentTerms!= null), (that.prepaidPaymentTerms!= null))) {
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
            List<AllowanceChargeType> lhsExtraAllowanceCharge;
            lhsExtraAllowanceCharge = (((this.extraAllowanceCharge!= null)&&(!this.extraAllowanceCharge.isEmpty()))?this.getExtraAllowanceCharge():null);
            List<AllowanceChargeType> rhsExtraAllowanceCharge;
            rhsExtraAllowanceCharge = (((that.extraAllowanceCharge!= null)&&(!that.extraAllowanceCharge.isEmpty()))?that.getExtraAllowanceCharge():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extraAllowanceCharge", lhsExtraAllowanceCharge), LocatorUtils.property(thatLocator, "extraAllowanceCharge", rhsExtraAllowanceCharge), lhsExtraAllowanceCharge, rhsExtraAllowanceCharge, ((this.extraAllowanceCharge!= null)&&(!this.extraAllowanceCharge.isEmpty())), ((that.extraAllowanceCharge!= null)&&(!that.extraAllowanceCharge.isEmpty())))) {
                return false;
            }
        }
        {
            List<ShipmentStageType> lhsMainCarriageShipmentStage;
            lhsMainCarriageShipmentStage = (((this.mainCarriageShipmentStage!= null)&&(!this.mainCarriageShipmentStage.isEmpty()))?this.getMainCarriageShipmentStage():null);
            List<ShipmentStageType> rhsMainCarriageShipmentStage;
            rhsMainCarriageShipmentStage = (((that.mainCarriageShipmentStage!= null)&&(!that.mainCarriageShipmentStage.isEmpty()))?that.getMainCarriageShipmentStage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mainCarriageShipmentStage", lhsMainCarriageShipmentStage), LocatorUtils.property(thatLocator, "mainCarriageShipmentStage", rhsMainCarriageShipmentStage), lhsMainCarriageShipmentStage, rhsMainCarriageShipmentStage, ((this.mainCarriageShipmentStage!= null)&&(!this.mainCarriageShipmentStage.isEmpty())), ((that.mainCarriageShipmentStage!= null)&&(!that.mainCarriageShipmentStage.isEmpty())))) {
                return false;
            }
        }
        {
            List<ShipmentStageType> lhsPreCarriageShipmentStage;
            lhsPreCarriageShipmentStage = (((this.preCarriageShipmentStage!= null)&&(!this.preCarriageShipmentStage.isEmpty()))?this.getPreCarriageShipmentStage():null);
            List<ShipmentStageType> rhsPreCarriageShipmentStage;
            rhsPreCarriageShipmentStage = (((that.preCarriageShipmentStage!= null)&&(!that.preCarriageShipmentStage.isEmpty()))?that.getPreCarriageShipmentStage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preCarriageShipmentStage", lhsPreCarriageShipmentStage), LocatorUtils.property(thatLocator, "preCarriageShipmentStage", rhsPreCarriageShipmentStage), lhsPreCarriageShipmentStage, rhsPreCarriageShipmentStage, ((this.preCarriageShipmentStage!= null)&&(!this.preCarriageShipmentStage.isEmpty())), ((that.preCarriageShipmentStage!= null)&&(!that.preCarriageShipmentStage.isEmpty())))) {
                return false;
            }
        }
        {
            List<ShipmentStageType> lhsOnCarriageShipmentStage;
            lhsOnCarriageShipmentStage = (((this.onCarriageShipmentStage!= null)&&(!this.onCarriageShipmentStage.isEmpty()))?this.getOnCarriageShipmentStage():null);
            List<ShipmentStageType> rhsOnCarriageShipmentStage;
            rhsOnCarriageShipmentStage = (((that.onCarriageShipmentStage!= null)&&(!that.onCarriageShipmentStage.isEmpty()))?that.getOnCarriageShipmentStage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "onCarriageShipmentStage", lhsOnCarriageShipmentStage), LocatorUtils.property(thatLocator, "onCarriageShipmentStage", rhsOnCarriageShipmentStage), lhsOnCarriageShipmentStage, rhsOnCarriageShipmentStage, ((this.onCarriageShipmentStage!= null)&&(!this.onCarriageShipmentStage.isEmpty())), ((that.onCarriageShipmentStage!= null)&&(!that.onCarriageShipmentStage.isEmpty())))) {
                return false;
            }
        }
        {
            List<TransportHandlingUnitType> lhsTransportHandlingUnit;
            lhsTransportHandlingUnit = (((this.transportHandlingUnit!= null)&&(!this.transportHandlingUnit.isEmpty()))?this.getTransportHandlingUnit():null);
            List<TransportHandlingUnitType> rhsTransportHandlingUnit;
            rhsTransportHandlingUnit = (((that.transportHandlingUnit!= null)&&(!that.transportHandlingUnit.isEmpty()))?that.getTransportHandlingUnit():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportHandlingUnit", lhsTransportHandlingUnit), LocatorUtils.property(thatLocator, "transportHandlingUnit", rhsTransportHandlingUnit), lhsTransportHandlingUnit, rhsTransportHandlingUnit, ((this.transportHandlingUnit!= null)&&(!this.transportHandlingUnit.isEmpty())), ((that.transportHandlingUnit!= null)&&(!that.transportHandlingUnit.isEmpty())))) {
                return false;
            }
        }
        {
            LocationType lhsFirstArrivalPortLocation;
            lhsFirstArrivalPortLocation = this.getFirstArrivalPortLocation();
            LocationType rhsFirstArrivalPortLocation;
            rhsFirstArrivalPortLocation = that.getFirstArrivalPortLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstArrivalPortLocation", lhsFirstArrivalPortLocation), LocatorUtils.property(thatLocator, "firstArrivalPortLocation", rhsFirstArrivalPortLocation), lhsFirstArrivalPortLocation, rhsFirstArrivalPortLocation, (this.firstArrivalPortLocation!= null), (that.firstArrivalPortLocation!= null))) {
                return false;
            }
        }
        {
            LocationType lhsLastExitPortLocation;
            lhsLastExitPortLocation = this.getLastExitPortLocation();
            LocationType rhsLastExitPortLocation;
            rhsLastExitPortLocation = that.getLastExitPortLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastExitPortLocation", lhsLastExitPortLocation), LocatorUtils.property(thatLocator, "lastExitPortLocation", rhsLastExitPortLocation), lhsLastExitPortLocation, rhsLastExitPortLocation, (this.lastExitPortLocation!= null), (that.lastExitPortLocation!= null))) {
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
            CarrierAssignedIDType theCarrierAssignedID;
            theCarrierAssignedID = this.getCarrierAssignedID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "carrierAssignedID", theCarrierAssignedID), currentHashCode, theCarrierAssignedID, (this.carrierAssignedID!= null));
        }
        {
            ConsigneeAssignedIDType theConsigneeAssignedID;
            theConsigneeAssignedID = this.getConsigneeAssignedID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consigneeAssignedID", theConsigneeAssignedID), currentHashCode, theConsigneeAssignedID, (this.consigneeAssignedID!= null));
        }
        {
            ConsignorAssignedIDType theConsignorAssignedID;
            theConsignorAssignedID = this.getConsignorAssignedID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consignorAssignedID", theConsignorAssignedID), currentHashCode, theConsignorAssignedID, (this.consignorAssignedID!= null));
        }
        {
            FreightForwarderAssignedIDType theFreightForwarderAssignedID;
            theFreightForwarderAssignedID = this.getFreightForwarderAssignedID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightForwarderAssignedID", theFreightForwarderAssignedID), currentHashCode, theFreightForwarderAssignedID, (this.freightForwarderAssignedID!= null));
        }
        {
            BrokerAssignedIDType theBrokerAssignedID;
            theBrokerAssignedID = this.getBrokerAssignedID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "brokerAssignedID", theBrokerAssignedID), currentHashCode, theBrokerAssignedID, (this.brokerAssignedID!= null));
        }
        {
            ContractedCarrierAssignedIDType theContractedCarrierAssignedID;
            theContractedCarrierAssignedID = this.getContractedCarrierAssignedID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractedCarrierAssignedID", theContractedCarrierAssignedID), currentHashCode, theContractedCarrierAssignedID, (this.contractedCarrierAssignedID!= null));
        }
        {
            PerformingCarrierAssignedIDType thePerformingCarrierAssignedID;
            thePerformingCarrierAssignedID = this.getPerformingCarrierAssignedID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "performingCarrierAssignedID", thePerformingCarrierAssignedID), currentHashCode, thePerformingCarrierAssignedID, (this.performingCarrierAssignedID!= null));
        }
        {
            List<SummaryDescriptionType> theSummaryDescription;
            theSummaryDescription = (((this.summaryDescription!= null)&&(!this.summaryDescription.isEmpty()))?this.getSummaryDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "summaryDescription", theSummaryDescription), currentHashCode, theSummaryDescription, ((this.summaryDescription!= null)&&(!this.summaryDescription.isEmpty())));
        }
        {
            TotalInvoiceAmountType theTotalInvoiceAmount;
            theTotalInvoiceAmount = this.getTotalInvoiceAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalInvoiceAmount", theTotalInvoiceAmount), currentHashCode, theTotalInvoiceAmount, (this.totalInvoiceAmount!= null));
        }
        {
            DeclaredCustomsValueAmountType theDeclaredCustomsValueAmount;
            theDeclaredCustomsValueAmount = this.getDeclaredCustomsValueAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "declaredCustomsValueAmount", theDeclaredCustomsValueAmount), currentHashCode, theDeclaredCustomsValueAmount, (this.declaredCustomsValueAmount!= null));
        }
        {
            List<TariffDescriptionType> theTariffDescription;
            theTariffDescription = (((this.tariffDescription!= null)&&(!this.tariffDescription.isEmpty()))?this.getTariffDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tariffDescription", theTariffDescription), currentHashCode, theTariffDescription, ((this.tariffDescription!= null)&&(!this.tariffDescription.isEmpty())));
        }
        {
            TariffCodeType theTariffCode;
            theTariffCode = this.getTariffCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tariffCode", theTariffCode), currentHashCode, theTariffCode, (this.tariffCode!= null));
        }
        {
            InsurancePremiumAmountType theInsurancePremiumAmount;
            theInsurancePremiumAmount = this.getInsurancePremiumAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "insurancePremiumAmount", theInsurancePremiumAmount), currentHashCode, theInsurancePremiumAmount, (this.insurancePremiumAmount!= null));
        }
        {
            GrossWeightMeasureType theGrossWeightMeasure;
            theGrossWeightMeasure = this.getGrossWeightMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grossWeightMeasure", theGrossWeightMeasure), currentHashCode, theGrossWeightMeasure, (this.grossWeightMeasure!= null));
        }
        {
            NetWeightMeasureType theNetWeightMeasure;
            theNetWeightMeasure = this.getNetWeightMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "netWeightMeasure", theNetWeightMeasure), currentHashCode, theNetWeightMeasure, (this.netWeightMeasure!= null));
        }
        {
            NetNetWeightMeasureType theNetNetWeightMeasure;
            theNetNetWeightMeasure = this.getNetNetWeightMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "netNetWeightMeasure", theNetNetWeightMeasure), currentHashCode, theNetNetWeightMeasure, (this.netNetWeightMeasure!= null));
        }
        {
            ChargeableWeightMeasureType theChargeableWeightMeasure;
            theChargeableWeightMeasure = this.getChargeableWeightMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chargeableWeightMeasure", theChargeableWeightMeasure), currentHashCode, theChargeableWeightMeasure, (this.chargeableWeightMeasure!= null));
        }
        {
            GrossVolumeMeasureType theGrossVolumeMeasure;
            theGrossVolumeMeasure = this.getGrossVolumeMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grossVolumeMeasure", theGrossVolumeMeasure), currentHashCode, theGrossVolumeMeasure, (this.grossVolumeMeasure!= null));
        }
        {
            NetVolumeMeasureType theNetVolumeMeasure;
            theNetVolumeMeasure = this.getNetVolumeMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "netVolumeMeasure", theNetVolumeMeasure), currentHashCode, theNetVolumeMeasure, (this.netVolumeMeasure!= null));
        }
        {
            LoadingLengthMeasureType theLoadingLengthMeasure;
            theLoadingLengthMeasure = this.getLoadingLengthMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loadingLengthMeasure", theLoadingLengthMeasure), currentHashCode, theLoadingLengthMeasure, (this.loadingLengthMeasure!= null));
        }
        {
            List<RemarksType> theRemarks;
            theRemarks = (((this.remarks!= null)&&(!this.remarks.isEmpty()))?this.getRemarks():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remarks", theRemarks), currentHashCode, theRemarks, ((this.remarks!= null)&&(!this.remarks.isEmpty())));
        }
        {
            HazardousRiskIndicatorType theHazardousRiskIndicator;
            theHazardousRiskIndicator = this.getHazardousRiskIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousRiskIndicator", theHazardousRiskIndicator), currentHashCode, theHazardousRiskIndicator, (this.hazardousRiskIndicator!= null));
        }
        {
            AnimalFoodIndicatorType theAnimalFoodIndicator;
            theAnimalFoodIndicator = this.getAnimalFoodIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "animalFoodIndicator", theAnimalFoodIndicator), currentHashCode, theAnimalFoodIndicator, (this.animalFoodIndicator!= null));
        }
        {
            HumanFoodIndicatorType theHumanFoodIndicator;
            theHumanFoodIndicator = this.getHumanFoodIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "humanFoodIndicator", theHumanFoodIndicator), currentHashCode, theHumanFoodIndicator, (this.humanFoodIndicator!= null));
        }
        {
            LivestockIndicatorType theLivestockIndicator;
            theLivestockIndicator = this.getLivestockIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "livestockIndicator", theLivestockIndicator), currentHashCode, theLivestockIndicator, (this.livestockIndicator!= null));
        }
        {
            BulkCargoIndicatorType theBulkCargoIndicator;
            theBulkCargoIndicator = this.getBulkCargoIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bulkCargoIndicator", theBulkCargoIndicator), currentHashCode, theBulkCargoIndicator, (this.bulkCargoIndicator!= null));
        }
        {
            ContainerizedIndicatorType theContainerizedIndicator;
            theContainerizedIndicator = this.getContainerizedIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containerizedIndicator", theContainerizedIndicator), currentHashCode, theContainerizedIndicator, (this.containerizedIndicator!= null));
        }
        {
            GeneralCargoIndicatorType theGeneralCargoIndicator;
            theGeneralCargoIndicator = this.getGeneralCargoIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "generalCargoIndicator", theGeneralCargoIndicator), currentHashCode, theGeneralCargoIndicator, (this.generalCargoIndicator!= null));
        }
        {
            SpecialSecurityIndicatorType theSpecialSecurityIndicator;
            theSpecialSecurityIndicator = this.getSpecialSecurityIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialSecurityIndicator", theSpecialSecurityIndicator), currentHashCode, theSpecialSecurityIndicator, (this.specialSecurityIndicator!= null));
        }
        {
            ThirdPartyPayerIndicatorType theThirdPartyPayerIndicator;
            theThirdPartyPayerIndicator = this.getThirdPartyPayerIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "thirdPartyPayerIndicator", theThirdPartyPayerIndicator), currentHashCode, theThirdPartyPayerIndicator, (this.thirdPartyPayerIndicator!= null));
        }
        {
            List<CarrierServiceInstructionsType> theCarrierServiceInstructions;
            theCarrierServiceInstructions = (((this.carrierServiceInstructions!= null)&&(!this.carrierServiceInstructions.isEmpty()))?this.getCarrierServiceInstructions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "carrierServiceInstructions", theCarrierServiceInstructions), currentHashCode, theCarrierServiceInstructions, ((this.carrierServiceInstructions!= null)&&(!this.carrierServiceInstructions.isEmpty())));
        }
        {
            List<CustomsClearanceServiceInstructionsType> theCustomsClearanceServiceInstructions;
            theCustomsClearanceServiceInstructions = (((this.customsClearanceServiceInstructions!= null)&&(!this.customsClearanceServiceInstructions.isEmpty()))?this.getCustomsClearanceServiceInstructions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customsClearanceServiceInstructions", theCustomsClearanceServiceInstructions), currentHashCode, theCustomsClearanceServiceInstructions, ((this.customsClearanceServiceInstructions!= null)&&(!this.customsClearanceServiceInstructions.isEmpty())));
        }
        {
            List<ForwarderServiceInstructionsType> theForwarderServiceInstructions;
            theForwarderServiceInstructions = (((this.forwarderServiceInstructions!= null)&&(!this.forwarderServiceInstructions.isEmpty()))?this.getForwarderServiceInstructions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forwarderServiceInstructions", theForwarderServiceInstructions), currentHashCode, theForwarderServiceInstructions, ((this.forwarderServiceInstructions!= null)&&(!this.forwarderServiceInstructions.isEmpty())));
        }
        {
            List<SpecialServiceInstructionsType> theSpecialServiceInstructions;
            theSpecialServiceInstructions = (((this.specialServiceInstructions!= null)&&(!this.specialServiceInstructions.isEmpty()))?this.getSpecialServiceInstructions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialServiceInstructions", theSpecialServiceInstructions), currentHashCode, theSpecialServiceInstructions, ((this.specialServiceInstructions!= null)&&(!this.specialServiceInstructions.isEmpty())));
        }
        {
            SequenceIDType theSequenceID;
            theSequenceID = this.getSequenceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceID", theSequenceID), currentHashCode, theSequenceID, (this.sequenceID!= null));
        }
        {
            ShippingPriorityLevelCodeType theShippingPriorityLevelCode;
            theShippingPriorityLevelCode = this.getShippingPriorityLevelCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingPriorityLevelCode", theShippingPriorityLevelCode), currentHashCode, theShippingPriorityLevelCode, (this.shippingPriorityLevelCode!= null));
        }
        {
            HandlingCodeType theHandlingCode;
            theHandlingCode = this.getHandlingCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handlingCode", theHandlingCode), currentHashCode, theHandlingCode, (this.handlingCode!= null));
        }
        {
            List<HandlingInstructionsType> theHandlingInstructions;
            theHandlingInstructions = (((this.handlingInstructions!= null)&&(!this.handlingInstructions.isEmpty()))?this.getHandlingInstructions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handlingInstructions", theHandlingInstructions), currentHashCode, theHandlingInstructions, ((this.handlingInstructions!= null)&&(!this.handlingInstructions.isEmpty())));
        }
        {
            List<InformationType> theInformation;
            theInformation = (((this.information!= null)&&(!this.information.isEmpty()))?this.getInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "information", theInformation), currentHashCode, theInformation, ((this.information!= null)&&(!this.information.isEmpty())));
        }
        {
            TotalGoodsItemQuantityType theTotalGoodsItemQuantity;
            theTotalGoodsItemQuantity = this.getTotalGoodsItemQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalGoodsItemQuantity", theTotalGoodsItemQuantity), currentHashCode, theTotalGoodsItemQuantity, (this.totalGoodsItemQuantity!= null));
        }
        {
            TotalTransportHandlingUnitQuantityType theTotalTransportHandlingUnitQuantity;
            theTotalTransportHandlingUnitQuantity = this.getTotalTransportHandlingUnitQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalTransportHandlingUnitQuantity", theTotalTransportHandlingUnitQuantity), currentHashCode, theTotalTransportHandlingUnitQuantity, (this.totalTransportHandlingUnitQuantity!= null));
        }
        {
            InsuranceValueAmountType theInsuranceValueAmount;
            theInsuranceValueAmount = this.getInsuranceValueAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "insuranceValueAmount", theInsuranceValueAmount), currentHashCode, theInsuranceValueAmount, (this.insuranceValueAmount!= null));
        }
        {
            DeclaredForCarriageValueAmountType theDeclaredForCarriageValueAmount;
            theDeclaredForCarriageValueAmount = this.getDeclaredForCarriageValueAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "declaredForCarriageValueAmount", theDeclaredForCarriageValueAmount), currentHashCode, theDeclaredForCarriageValueAmount, (this.declaredForCarriageValueAmount!= null));
        }
        {
            DeclaredStatisticsValueAmountType theDeclaredStatisticsValueAmount;
            theDeclaredStatisticsValueAmount = this.getDeclaredStatisticsValueAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "declaredStatisticsValueAmount", theDeclaredStatisticsValueAmount), currentHashCode, theDeclaredStatisticsValueAmount, (this.declaredStatisticsValueAmount!= null));
        }
        {
            FreeOnBoardValueAmountType theFreeOnBoardValueAmount;
            theFreeOnBoardValueAmount = this.getFreeOnBoardValueAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freeOnBoardValueAmount", theFreeOnBoardValueAmount), currentHashCode, theFreeOnBoardValueAmount, (this.freeOnBoardValueAmount!= null));
        }
        {
            List<SpecialInstructionsType> theSpecialInstructions;
            theSpecialInstructions = (((this.specialInstructions!= null)&&(!this.specialInstructions.isEmpty()))?this.getSpecialInstructions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialInstructions", theSpecialInstructions), currentHashCode, theSpecialInstructions, ((this.specialInstructions!= null)&&(!this.specialInstructions.isEmpty())));
        }
        {
            SplitConsignmentIndicatorType theSplitConsignmentIndicator;
            theSplitConsignmentIndicator = this.getSplitConsignmentIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "splitConsignmentIndicator", theSplitConsignmentIndicator), currentHashCode, theSplitConsignmentIndicator, (this.splitConsignmentIndicator!= null));
        }
        {
            List<DeliveryInstructionsType> theDeliveryInstructions;
            theDeliveryInstructions = (((this.deliveryInstructions!= null)&&(!this.deliveryInstructions.isEmpty()))?this.getDeliveryInstructions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryInstructions", theDeliveryInstructions), currentHashCode, theDeliveryInstructions, ((this.deliveryInstructions!= null)&&(!this.deliveryInstructions.isEmpty())));
        }
        {
            ConsignmentQuantityType theConsignmentQuantity;
            theConsignmentQuantity = this.getConsignmentQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consignmentQuantity", theConsignmentQuantity), currentHashCode, theConsignmentQuantity, (this.consignmentQuantity!= null));
        }
        {
            ConsolidatableIndicatorType theConsolidatableIndicator;
            theConsolidatableIndicator = this.getConsolidatableIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consolidatableIndicator", theConsolidatableIndicator), currentHashCode, theConsolidatableIndicator, (this.consolidatableIndicator!= null));
        }
        {
            List<HaulageInstructionsType> theHaulageInstructions;
            theHaulageInstructions = (((this.haulageInstructions!= null)&&(!this.haulageInstructions.isEmpty()))?this.getHaulageInstructions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "haulageInstructions", theHaulageInstructions), currentHashCode, theHaulageInstructions, ((this.haulageInstructions!= null)&&(!this.haulageInstructions.isEmpty())));
        }
        {
            LoadingSequenceIDType theLoadingSequenceID;
            theLoadingSequenceID = this.getLoadingSequenceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loadingSequenceID", theLoadingSequenceID), currentHashCode, theLoadingSequenceID, (this.loadingSequenceID!= null));
        }
        {
            ChildConsignmentQuantityType theChildConsignmentQuantity;
            theChildConsignmentQuantity = this.getChildConsignmentQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "childConsignmentQuantity", theChildConsignmentQuantity), currentHashCode, theChildConsignmentQuantity, (this.childConsignmentQuantity!= null));
        }
        {
            TotalPackagesQuantityType theTotalPackagesQuantity;
            theTotalPackagesQuantity = this.getTotalPackagesQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalPackagesQuantity", theTotalPackagesQuantity), currentHashCode, theTotalPackagesQuantity, (this.totalPackagesQuantity!= null));
        }
        {
            List<ShipmentType> theConsolidatedShipment;
            theConsolidatedShipment = (((this.consolidatedShipment!= null)&&(!this.consolidatedShipment.isEmpty()))?this.getConsolidatedShipment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consolidatedShipment", theConsolidatedShipment), currentHashCode, theConsolidatedShipment, ((this.consolidatedShipment!= null)&&(!this.consolidatedShipment.isEmpty())));
        }
        {
            List<CustomsDeclarationType> theCustomsDeclaration;
            theCustomsDeclaration = (((this.customsDeclaration!= null)&&(!this.customsDeclaration.isEmpty()))?this.getCustomsDeclaration():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customsDeclaration", theCustomsDeclaration), currentHashCode, theCustomsDeclaration, ((this.customsDeclaration!= null)&&(!this.customsDeclaration.isEmpty())));
        }
        {
            TransportEventType theRequestedPickupTransportEvent;
            theRequestedPickupTransportEvent = this.getRequestedPickupTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedPickupTransportEvent", theRequestedPickupTransportEvent), currentHashCode, theRequestedPickupTransportEvent, (this.requestedPickupTransportEvent!= null));
        }
        {
            TransportEventType theRequestedDeliveryTransportEvent;
            theRequestedDeliveryTransportEvent = this.getRequestedDeliveryTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedDeliveryTransportEvent", theRequestedDeliveryTransportEvent), currentHashCode, theRequestedDeliveryTransportEvent, (this.requestedDeliveryTransportEvent!= null));
        }
        {
            TransportEventType thePlannedPickupTransportEvent;
            thePlannedPickupTransportEvent = this.getPlannedPickupTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "plannedPickupTransportEvent", thePlannedPickupTransportEvent), currentHashCode, thePlannedPickupTransportEvent, (this.plannedPickupTransportEvent!= null));
        }
        {
            TransportEventType thePlannedDeliveryTransportEvent;
            thePlannedDeliveryTransportEvent = this.getPlannedDeliveryTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "plannedDeliveryTransportEvent", thePlannedDeliveryTransportEvent), currentHashCode, thePlannedDeliveryTransportEvent, (this.plannedDeliveryTransportEvent!= null));
        }
        {
            TransportEventType theActualPickupTransportEvent;
            theActualPickupTransportEvent = this.getActualPickupTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualPickupTransportEvent", theActualPickupTransportEvent), currentHashCode, theActualPickupTransportEvent, (this.actualPickupTransportEvent!= null));
        }
        {
            TransportEventType theActualDeliveryTransportEvent;
            theActualDeliveryTransportEvent = this.getActualDeliveryTransportEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualDeliveryTransportEvent", theActualDeliveryTransportEvent), currentHashCode, theActualDeliveryTransportEvent, (this.actualDeliveryTransportEvent!= null));
        }
        {
            List<StatusType> theStatus;
            theStatus = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, ((this.status!= null)&&(!this.status.isEmpty())));
        }
        {
            List<ConsignmentType> theChildConsignment;
            theChildConsignment = (((this.childConsignment!= null)&&(!this.childConsignment.isEmpty()))?this.getChildConsignment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "childConsignment", theChildConsignment), currentHashCode, theChildConsignment, ((this.childConsignment!= null)&&(!this.childConsignment.isEmpty())));
        }
        {
            PartyType theConsigneeParty;
            theConsigneeParty = this.getConsigneeParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consigneeParty", theConsigneeParty), currentHashCode, theConsigneeParty, (this.consigneeParty!= null));
        }
        {
            PartyType theExporterParty;
            theExporterParty = this.getExporterParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exporterParty", theExporterParty), currentHashCode, theExporterParty, (this.exporterParty!= null));
        }
        {
            PartyType theConsignorParty;
            theConsignorParty = this.getConsignorParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consignorParty", theConsignorParty), currentHashCode, theConsignorParty, (this.consignorParty!= null));
        }
        {
            PartyType theImporterParty;
            theImporterParty = this.getImporterParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "importerParty", theImporterParty), currentHashCode, theImporterParty, (this.importerParty!= null));
        }
        {
            PartyType theCarrierParty;
            theCarrierParty = this.getCarrierParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "carrierParty", theCarrierParty), currentHashCode, theCarrierParty, (this.carrierParty!= null));
        }
        {
            PartyType theFreightForwarderParty;
            theFreightForwarderParty = this.getFreightForwarderParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightForwarderParty", theFreightForwarderParty), currentHashCode, theFreightForwarderParty, (this.freightForwarderParty!= null));
        }
        {
            PartyType theNotifyParty;
            theNotifyParty = this.getNotifyParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notifyParty", theNotifyParty), currentHashCode, theNotifyParty, (this.notifyParty!= null));
        }
        {
            PartyType theOriginalDespatchParty;
            theOriginalDespatchParty = this.getOriginalDespatchParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalDespatchParty", theOriginalDespatchParty), currentHashCode, theOriginalDespatchParty, (this.originalDespatchParty!= null));
        }
        {
            PartyType theFinalDeliveryParty;
            theFinalDeliveryParty = this.getFinalDeliveryParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finalDeliveryParty", theFinalDeliveryParty), currentHashCode, theFinalDeliveryParty, (this.finalDeliveryParty!= null));
        }
        {
            PartyType thePerformingCarrierParty;
            thePerformingCarrierParty = this.getPerformingCarrierParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "performingCarrierParty", thePerformingCarrierParty), currentHashCode, thePerformingCarrierParty, (this.performingCarrierParty!= null));
        }
        {
            PartyType theSubstituteCarrierParty;
            theSubstituteCarrierParty = this.getSubstituteCarrierParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substituteCarrierParty", theSubstituteCarrierParty), currentHashCode, theSubstituteCarrierParty, (this.substituteCarrierParty!= null));
        }
        {
            PartyType theLogisticsOperatorParty;
            theLogisticsOperatorParty = this.getLogisticsOperatorParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logisticsOperatorParty", theLogisticsOperatorParty), currentHashCode, theLogisticsOperatorParty, (this.logisticsOperatorParty!= null));
        }
        {
            PartyType theTransportAdvisorParty;
            theTransportAdvisorParty = this.getTransportAdvisorParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportAdvisorParty", theTransportAdvisorParty), currentHashCode, theTransportAdvisorParty, (this.transportAdvisorParty!= null));
        }
        {
            PartyType theHazardousItemNotificationParty;
            theHazardousItemNotificationParty = this.getHazardousItemNotificationParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousItemNotificationParty", theHazardousItemNotificationParty), currentHashCode, theHazardousItemNotificationParty, (this.hazardousItemNotificationParty!= null));
        }
        {
            PartyType theInsuranceParty;
            theInsuranceParty = this.getInsuranceParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "insuranceParty", theInsuranceParty), currentHashCode, theInsuranceParty, (this.insuranceParty!= null));
        }
        {
            PartyType theMortgageHolderParty;
            theMortgageHolderParty = this.getMortgageHolderParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mortgageHolderParty", theMortgageHolderParty), currentHashCode, theMortgageHolderParty, (this.mortgageHolderParty!= null));
        }
        {
            PartyType theBillOfLadingHolderParty;
            theBillOfLadingHolderParty = this.getBillOfLadingHolderParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billOfLadingHolderParty", theBillOfLadingHolderParty), currentHashCode, theBillOfLadingHolderParty, (this.billOfLadingHolderParty!= null));
        }
        {
            CountryType theOriginalDepartureCountry;
            theOriginalDepartureCountry = this.getOriginalDepartureCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalDepartureCountry", theOriginalDepartureCountry), currentHashCode, theOriginalDepartureCountry, (this.originalDepartureCountry!= null));
        }
        {
            CountryType theFinalDestinationCountry;
            theFinalDestinationCountry = this.getFinalDestinationCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finalDestinationCountry", theFinalDestinationCountry), currentHashCode, theFinalDestinationCountry, (this.finalDestinationCountry!= null));
        }
        {
            List<CountryType> theTransitCountry;
            theTransitCountry = (((this.transitCountry!= null)&&(!this.transitCountry.isEmpty()))?this.getTransitCountry():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transitCountry", theTransitCountry), currentHashCode, theTransitCountry, ((this.transitCountry!= null)&&(!this.transitCountry.isEmpty())));
        }
        {
            ContractType theTransportContract;
            theTransportContract = this.getTransportContract();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportContract", theTransportContract), currentHashCode, theTransportContract, (this.transportContract!= null));
        }
        {
            List<TransportEventType> theTransportEvent;
            theTransportEvent = (((this.transportEvent!= null)&&(!this.transportEvent.isEmpty()))?this.getTransportEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportEvent", theTransportEvent), currentHashCode, theTransportEvent, ((this.transportEvent!= null)&&(!this.transportEvent.isEmpty())));
        }
        {
            TransportationServiceType theOriginalDespatchTransportationService;
            theOriginalDespatchTransportationService = this.getOriginalDespatchTransportationService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalDespatchTransportationService", theOriginalDespatchTransportationService), currentHashCode, theOriginalDespatchTransportationService, (this.originalDespatchTransportationService!= null));
        }
        {
            TransportationServiceType theFinalDeliveryTransportationService;
            theFinalDeliveryTransportationService = this.getFinalDeliveryTransportationService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finalDeliveryTransportationService", theFinalDeliveryTransportationService), currentHashCode, theFinalDeliveryTransportationService, (this.finalDeliveryTransportationService!= null));
        }
        {
            DeliveryTermsType theDeliveryTerms;
            theDeliveryTerms = this.getDeliveryTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryTerms", theDeliveryTerms), currentHashCode, theDeliveryTerms, (this.deliveryTerms!= null));
        }
        {
            PaymentTermsType thePaymentTerms;
            thePaymentTerms = this.getPaymentTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentTerms", thePaymentTerms), currentHashCode, thePaymentTerms, (this.paymentTerms!= null));
        }
        {
            PaymentTermsType theCollectPaymentTerms;
            theCollectPaymentTerms = this.getCollectPaymentTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "collectPaymentTerms", theCollectPaymentTerms), currentHashCode, theCollectPaymentTerms, (this.collectPaymentTerms!= null));
        }
        {
            PaymentTermsType theDisbursementPaymentTerms;
            theDisbursementPaymentTerms = this.getDisbursementPaymentTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "disbursementPaymentTerms", theDisbursementPaymentTerms), currentHashCode, theDisbursementPaymentTerms, (this.disbursementPaymentTerms!= null));
        }
        {
            PaymentTermsType thePrepaidPaymentTerms;
            thePrepaidPaymentTerms = this.getPrepaidPaymentTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prepaidPaymentTerms", thePrepaidPaymentTerms), currentHashCode, thePrepaidPaymentTerms, (this.prepaidPaymentTerms!= null));
        }
        {
            List<AllowanceChargeType> theFreightAllowanceCharge;
            theFreightAllowanceCharge = (((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty()))?this.getFreightAllowanceCharge():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightAllowanceCharge", theFreightAllowanceCharge), currentHashCode, theFreightAllowanceCharge, ((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty())));
        }
        {
            List<AllowanceChargeType> theExtraAllowanceCharge;
            theExtraAllowanceCharge = (((this.extraAllowanceCharge!= null)&&(!this.extraAllowanceCharge.isEmpty()))?this.getExtraAllowanceCharge():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extraAllowanceCharge", theExtraAllowanceCharge), currentHashCode, theExtraAllowanceCharge, ((this.extraAllowanceCharge!= null)&&(!this.extraAllowanceCharge.isEmpty())));
        }
        {
            List<ShipmentStageType> theMainCarriageShipmentStage;
            theMainCarriageShipmentStage = (((this.mainCarriageShipmentStage!= null)&&(!this.mainCarriageShipmentStage.isEmpty()))?this.getMainCarriageShipmentStage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mainCarriageShipmentStage", theMainCarriageShipmentStage), currentHashCode, theMainCarriageShipmentStage, ((this.mainCarriageShipmentStage!= null)&&(!this.mainCarriageShipmentStage.isEmpty())));
        }
        {
            List<ShipmentStageType> thePreCarriageShipmentStage;
            thePreCarriageShipmentStage = (((this.preCarriageShipmentStage!= null)&&(!this.preCarriageShipmentStage.isEmpty()))?this.getPreCarriageShipmentStage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preCarriageShipmentStage", thePreCarriageShipmentStage), currentHashCode, thePreCarriageShipmentStage, ((this.preCarriageShipmentStage!= null)&&(!this.preCarriageShipmentStage.isEmpty())));
        }
        {
            List<ShipmentStageType> theOnCarriageShipmentStage;
            theOnCarriageShipmentStage = (((this.onCarriageShipmentStage!= null)&&(!this.onCarriageShipmentStage.isEmpty()))?this.getOnCarriageShipmentStage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "onCarriageShipmentStage", theOnCarriageShipmentStage), currentHashCode, theOnCarriageShipmentStage, ((this.onCarriageShipmentStage!= null)&&(!this.onCarriageShipmentStage.isEmpty())));
        }
        {
            List<TransportHandlingUnitType> theTransportHandlingUnit;
            theTransportHandlingUnit = (((this.transportHandlingUnit!= null)&&(!this.transportHandlingUnit.isEmpty()))?this.getTransportHandlingUnit():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportHandlingUnit", theTransportHandlingUnit), currentHashCode, theTransportHandlingUnit, ((this.transportHandlingUnit!= null)&&(!this.transportHandlingUnit.isEmpty())));
        }
        {
            LocationType theFirstArrivalPortLocation;
            theFirstArrivalPortLocation = this.getFirstArrivalPortLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firstArrivalPortLocation", theFirstArrivalPortLocation), currentHashCode, theFirstArrivalPortLocation, (this.firstArrivalPortLocation!= null));
        }
        {
            LocationType theLastExitPortLocation;
            theLastExitPortLocation = this.getLastExitPortLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastExitPortLocation", theLastExitPortLocation), currentHashCode, theLastExitPortLocation, (this.lastExitPortLocation!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
