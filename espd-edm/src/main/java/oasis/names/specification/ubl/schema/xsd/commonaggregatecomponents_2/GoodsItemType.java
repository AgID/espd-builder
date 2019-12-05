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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ChargeableQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ChargeableWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CustomsImportClassifiedIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CustomsStatusCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CustomsTariffQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DeclaredCustomsValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DeclaredForCarriageValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DeclaredStatisticsValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FreeOnBoardValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GrossVolumeMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GrossWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HazardousRiskIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InsuranceValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetNetWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetVolumeMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PreferenceCriterionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequiredCustomsIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReturnableQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SequenceNumberIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TraceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueAmountType;
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
 * <p>Classe Java per GoodsItemType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GoodsItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceNumberID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRiskIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredCustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredForCarriageValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredStatisticsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FreeOnBoardValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InsuranceValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetNetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChargeableWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreferenceCriterionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequiredCustomsID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomsStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomsTariffQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomsImportClassifiedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChargeableQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReturnableQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TraceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GoodsItemContainer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InvoiceLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Temperature" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContainedGoodsItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Pickup" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Despatch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContainingPackage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipmentDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MinimumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaximumTemperature" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsItemType", propOrder = {
    "id",
    "sequenceNumberID",
    "description",
    "hazardousRiskIndicator",
    "declaredCustomsValueAmount",
    "declaredForCarriageValueAmount",
    "declaredStatisticsValueAmount",
    "freeOnBoardValueAmount",
    "insuranceValueAmount",
    "valueAmount",
    "grossWeightMeasure",
    "netWeightMeasure",
    "netNetWeightMeasure",
    "chargeableWeightMeasure",
    "grossVolumeMeasure",
    "netVolumeMeasure",
    "quantity",
    "preferenceCriterionCode",
    "requiredCustomsID",
    "customsStatusCode",
    "customsTariffQuantity",
    "customsImportClassifiedIndicator",
    "chargeableQuantity",
    "returnableQuantity",
    "traceID",
    "item",
    "goodsItemContainer",
    "freightAllowanceCharge",
    "invoiceLine",
    "temperature",
    "containedGoodsItem",
    "originAddress",
    "delivery",
    "pickup",
    "despatch",
    "measurementDimension",
    "containingPackage",
    "shipmentDocumentReference",
    "minimumTemperature",
    "maximumTemperature"
})
public class GoodsItemType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "SequenceNumberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SequenceNumberIDType sequenceNumberID;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "HazardousRiskIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardousRiskIndicatorType hazardousRiskIndicator;
    @XmlElement(name = "DeclaredCustomsValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclaredCustomsValueAmountType declaredCustomsValueAmount;
    @XmlElement(name = "DeclaredForCarriageValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclaredForCarriageValueAmountType declaredForCarriageValueAmount;
    @XmlElement(name = "DeclaredStatisticsValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclaredStatisticsValueAmountType declaredStatisticsValueAmount;
    @XmlElement(name = "FreeOnBoardValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FreeOnBoardValueAmountType freeOnBoardValueAmount;
    @XmlElement(name = "InsuranceValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InsuranceValueAmountType insuranceValueAmount;
    @XmlElement(name = "ValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValueAmountType valueAmount;
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
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QuantityType quantity;
    @XmlElement(name = "PreferenceCriterionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PreferenceCriterionCodeType preferenceCriterionCode;
    @XmlElement(name = "RequiredCustomsID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequiredCustomsIDType requiredCustomsID;
    @XmlElement(name = "CustomsStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CustomsStatusCodeType customsStatusCode;
    @XmlElement(name = "CustomsTariffQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CustomsTariffQuantityType customsTariffQuantity;
    @XmlElement(name = "CustomsImportClassifiedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CustomsImportClassifiedIndicatorType customsImportClassifiedIndicator;
    @XmlElement(name = "ChargeableQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ChargeableQuantityType chargeableQuantity;
    @XmlElement(name = "ReturnableQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReturnableQuantityType returnableQuantity;
    @XmlElement(name = "TraceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TraceIDType traceID;
    @XmlElement(name = "Item")
    protected List<ItemType> item;
    @XmlElement(name = "GoodsItemContainer")
    protected List<GoodsItemContainerType> goodsItemContainer;
    @XmlElement(name = "FreightAllowanceCharge")
    protected List<AllowanceChargeType> freightAllowanceCharge;
    @XmlElement(name = "InvoiceLine")
    protected List<InvoiceLineType> invoiceLine;
    @XmlElement(name = "Temperature")
    protected List<TemperatureType> temperature;
    @XmlElement(name = "ContainedGoodsItem")
    protected List<GoodsItemType> containedGoodsItem;
    @XmlElement(name = "OriginAddress")
    protected AddressType originAddress;
    @XmlElement(name = "Delivery")
    protected DeliveryType delivery;
    @XmlElement(name = "Pickup")
    protected PickupType pickup;
    @XmlElement(name = "Despatch")
    protected DespatchType despatch;
    @XmlElement(name = "MeasurementDimension")
    protected List<DimensionType> measurementDimension;
    @XmlElement(name = "ContainingPackage")
    protected List<PackageType> containingPackage;
    @XmlElement(name = "ShipmentDocumentReference")
    protected DocumentReferenceType shipmentDocumentReference;
    @XmlElement(name = "MinimumTemperature")
    protected TemperatureType minimumTemperature;
    @XmlElement(name = "MaximumTemperature")
    protected TemperatureType maximumTemperature;

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
     * Recupera il valore della proprietà sequenceNumberID.
     * 
     * @return
     *     possible object is
     *     {@link SequenceNumberIDType }
     *     
     */
    public SequenceNumberIDType getSequenceNumberID() {
        return sequenceNumberID;
    }

    /**
     * Imposta il valore della proprietà sequenceNumberID.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceNumberIDType }
     *     
     */
    public void setSequenceNumberID(SequenceNumberIDType value) {
        this.sequenceNumberID = value;
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
     * Recupera il valore della proprietà valueAmount.
     * 
     * @return
     *     possible object is
     *     {@link ValueAmountType }
     *     
     */
    public ValueAmountType getValueAmount() {
        return valueAmount;
    }

    /**
     * Imposta il valore della proprietà valueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueAmountType }
     *     
     */
    public void setValueAmount(ValueAmountType value) {
        this.valueAmount = value;
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
     * Recupera il valore della proprietà preferenceCriterionCode.
     * 
     * @return
     *     possible object is
     *     {@link PreferenceCriterionCodeType }
     *     
     */
    public PreferenceCriterionCodeType getPreferenceCriterionCode() {
        return preferenceCriterionCode;
    }

    /**
     * Imposta il valore della proprietà preferenceCriterionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceCriterionCodeType }
     *     
     */
    public void setPreferenceCriterionCode(PreferenceCriterionCodeType value) {
        this.preferenceCriterionCode = value;
    }

    /**
     * Recupera il valore della proprietà requiredCustomsID.
     * 
     * @return
     *     possible object is
     *     {@link RequiredCustomsIDType }
     *     
     */
    public RequiredCustomsIDType getRequiredCustomsID() {
        return requiredCustomsID;
    }

    /**
     * Imposta il valore della proprietà requiredCustomsID.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredCustomsIDType }
     *     
     */
    public void setRequiredCustomsID(RequiredCustomsIDType value) {
        this.requiredCustomsID = value;
    }

    /**
     * Recupera il valore della proprietà customsStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link CustomsStatusCodeType }
     *     
     */
    public CustomsStatusCodeType getCustomsStatusCode() {
        return customsStatusCode;
    }

    /**
     * Imposta il valore della proprietà customsStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsStatusCodeType }
     *     
     */
    public void setCustomsStatusCode(CustomsStatusCodeType value) {
        this.customsStatusCode = value;
    }

    /**
     * Recupera il valore della proprietà customsTariffQuantity.
     * 
     * @return
     *     possible object is
     *     {@link CustomsTariffQuantityType }
     *     
     */
    public CustomsTariffQuantityType getCustomsTariffQuantity() {
        return customsTariffQuantity;
    }

    /**
     * Imposta il valore della proprietà customsTariffQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsTariffQuantityType }
     *     
     */
    public void setCustomsTariffQuantity(CustomsTariffQuantityType value) {
        this.customsTariffQuantity = value;
    }

    /**
     * Recupera il valore della proprietà customsImportClassifiedIndicator.
     * 
     * @return
     *     possible object is
     *     {@link CustomsImportClassifiedIndicatorType }
     *     
     */
    public CustomsImportClassifiedIndicatorType getCustomsImportClassifiedIndicator() {
        return customsImportClassifiedIndicator;
    }

    /**
     * Imposta il valore della proprietà customsImportClassifiedIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsImportClassifiedIndicatorType }
     *     
     */
    public void setCustomsImportClassifiedIndicator(CustomsImportClassifiedIndicatorType value) {
        this.customsImportClassifiedIndicator = value;
    }

    /**
     * Recupera il valore della proprietà chargeableQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ChargeableQuantityType }
     *     
     */
    public ChargeableQuantityType getChargeableQuantity() {
        return chargeableQuantity;
    }

    /**
     * Imposta il valore della proprietà chargeableQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeableQuantityType }
     *     
     */
    public void setChargeableQuantity(ChargeableQuantityType value) {
        this.chargeableQuantity = value;
    }

    /**
     * Recupera il valore della proprietà returnableQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ReturnableQuantityType }
     *     
     */
    public ReturnableQuantityType getReturnableQuantity() {
        return returnableQuantity;
    }

    /**
     * Imposta il valore della proprietà returnableQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnableQuantityType }
     *     
     */
    public void setReturnableQuantity(ReturnableQuantityType value) {
        this.returnableQuantity = value;
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
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType }
     * 
     * 
     */
    public List<ItemType> getItem() {
        if (item == null) {
            item = new ArrayList<ItemType>();
        }
        return this.item;
    }

    /**
     * Gets the value of the goodsItemContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsItemContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsItemContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsItemContainerType }
     * 
     * 
     */
    public List<GoodsItemContainerType> getGoodsItemContainer() {
        if (goodsItemContainer == null) {
            goodsItemContainer = new ArrayList<GoodsItemContainerType>();
        }
        return this.goodsItemContainer;
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
     * Gets the value of the invoiceLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceLineType }
     * 
     * 
     */
    public List<InvoiceLineType> getInvoiceLine() {
        if (invoiceLine == null) {
            invoiceLine = new ArrayList<InvoiceLineType>();
        }
        return this.invoiceLine;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureType }
     * 
     * 
     */
    public List<TemperatureType> getTemperature() {
        if (temperature == null) {
            temperature = new ArrayList<TemperatureType>();
        }
        return this.temperature;
    }

    /**
     * Gets the value of the containedGoodsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containedGoodsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainedGoodsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsItemType }
     * 
     * 
     */
    public List<GoodsItemType> getContainedGoodsItem() {
        if (containedGoodsItem == null) {
            containedGoodsItem = new ArrayList<GoodsItemType>();
        }
        return this.containedGoodsItem;
    }

    /**
     * Recupera il valore della proprietà originAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getOriginAddress() {
        return originAddress;
    }

    /**
     * Imposta il valore della proprietà originAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setOriginAddress(AddressType value) {
        this.originAddress = value;
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
     * Gets the value of the containingPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containingPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainingPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getContainingPackage() {
        if (containingPackage == null) {
            containingPackage = new ArrayList<PackageType>();
        }
        return this.containingPackage;
    }

    /**
     * Recupera il valore della proprietà shipmentDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getShipmentDocumentReference() {
        return shipmentDocumentReference;
    }

    /**
     * Imposta il valore della proprietà shipmentDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setShipmentDocumentReference(DocumentReferenceType value) {
        this.shipmentDocumentReference = value;
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
            SequenceNumberIDType theSequenceNumberID;
            theSequenceNumberID = this.getSequenceNumberID();
            strategy.appendField(locator, this, "sequenceNumberID", buffer, theSequenceNumberID, (this.sequenceNumberID!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            HazardousRiskIndicatorType theHazardousRiskIndicator;
            theHazardousRiskIndicator = this.getHazardousRiskIndicator();
            strategy.appendField(locator, this, "hazardousRiskIndicator", buffer, theHazardousRiskIndicator, (this.hazardousRiskIndicator!= null));
        }
        {
            DeclaredCustomsValueAmountType theDeclaredCustomsValueAmount;
            theDeclaredCustomsValueAmount = this.getDeclaredCustomsValueAmount();
            strategy.appendField(locator, this, "declaredCustomsValueAmount", buffer, theDeclaredCustomsValueAmount, (this.declaredCustomsValueAmount!= null));
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
            InsuranceValueAmountType theInsuranceValueAmount;
            theInsuranceValueAmount = this.getInsuranceValueAmount();
            strategy.appendField(locator, this, "insuranceValueAmount", buffer, theInsuranceValueAmount, (this.insuranceValueAmount!= null));
        }
        {
            ValueAmountType theValueAmount;
            theValueAmount = this.getValueAmount();
            strategy.appendField(locator, this, "valueAmount", buffer, theValueAmount, (this.valueAmount!= null));
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
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity, (this.quantity!= null));
        }
        {
            PreferenceCriterionCodeType thePreferenceCriterionCode;
            thePreferenceCriterionCode = this.getPreferenceCriterionCode();
            strategy.appendField(locator, this, "preferenceCriterionCode", buffer, thePreferenceCriterionCode, (this.preferenceCriterionCode!= null));
        }
        {
            RequiredCustomsIDType theRequiredCustomsID;
            theRequiredCustomsID = this.getRequiredCustomsID();
            strategy.appendField(locator, this, "requiredCustomsID", buffer, theRequiredCustomsID, (this.requiredCustomsID!= null));
        }
        {
            CustomsStatusCodeType theCustomsStatusCode;
            theCustomsStatusCode = this.getCustomsStatusCode();
            strategy.appendField(locator, this, "customsStatusCode", buffer, theCustomsStatusCode, (this.customsStatusCode!= null));
        }
        {
            CustomsTariffQuantityType theCustomsTariffQuantity;
            theCustomsTariffQuantity = this.getCustomsTariffQuantity();
            strategy.appendField(locator, this, "customsTariffQuantity", buffer, theCustomsTariffQuantity, (this.customsTariffQuantity!= null));
        }
        {
            CustomsImportClassifiedIndicatorType theCustomsImportClassifiedIndicator;
            theCustomsImportClassifiedIndicator = this.getCustomsImportClassifiedIndicator();
            strategy.appendField(locator, this, "customsImportClassifiedIndicator", buffer, theCustomsImportClassifiedIndicator, (this.customsImportClassifiedIndicator!= null));
        }
        {
            ChargeableQuantityType theChargeableQuantity;
            theChargeableQuantity = this.getChargeableQuantity();
            strategy.appendField(locator, this, "chargeableQuantity", buffer, theChargeableQuantity, (this.chargeableQuantity!= null));
        }
        {
            ReturnableQuantityType theReturnableQuantity;
            theReturnableQuantity = this.getReturnableQuantity();
            strategy.appendField(locator, this, "returnableQuantity", buffer, theReturnableQuantity, (this.returnableQuantity!= null));
        }
        {
            TraceIDType theTraceID;
            theTraceID = this.getTraceID();
            strategy.appendField(locator, this, "traceID", buffer, theTraceID, (this.traceID!= null));
        }
        {
            List<ItemType> theItem;
            theItem = (((this.item!= null)&&(!this.item.isEmpty()))?this.getItem():null);
            strategy.appendField(locator, this, "item", buffer, theItem, ((this.item!= null)&&(!this.item.isEmpty())));
        }
        {
            List<GoodsItemContainerType> theGoodsItemContainer;
            theGoodsItemContainer = (((this.goodsItemContainer!= null)&&(!this.goodsItemContainer.isEmpty()))?this.getGoodsItemContainer():null);
            strategy.appendField(locator, this, "goodsItemContainer", buffer, theGoodsItemContainer, ((this.goodsItemContainer!= null)&&(!this.goodsItemContainer.isEmpty())));
        }
        {
            List<AllowanceChargeType> theFreightAllowanceCharge;
            theFreightAllowanceCharge = (((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty()))?this.getFreightAllowanceCharge():null);
            strategy.appendField(locator, this, "freightAllowanceCharge", buffer, theFreightAllowanceCharge, ((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty())));
        }
        {
            List<InvoiceLineType> theInvoiceLine;
            theInvoiceLine = (((this.invoiceLine!= null)&&(!this.invoiceLine.isEmpty()))?this.getInvoiceLine():null);
            strategy.appendField(locator, this, "invoiceLine", buffer, theInvoiceLine, ((this.invoiceLine!= null)&&(!this.invoiceLine.isEmpty())));
        }
        {
            List<TemperatureType> theTemperature;
            theTemperature = (((this.temperature!= null)&&(!this.temperature.isEmpty()))?this.getTemperature():null);
            strategy.appendField(locator, this, "temperature", buffer, theTemperature, ((this.temperature!= null)&&(!this.temperature.isEmpty())));
        }
        {
            List<GoodsItemType> theContainedGoodsItem;
            theContainedGoodsItem = (((this.containedGoodsItem!= null)&&(!this.containedGoodsItem.isEmpty()))?this.getContainedGoodsItem():null);
            strategy.appendField(locator, this, "containedGoodsItem", buffer, theContainedGoodsItem, ((this.containedGoodsItem!= null)&&(!this.containedGoodsItem.isEmpty())));
        }
        {
            AddressType theOriginAddress;
            theOriginAddress = this.getOriginAddress();
            strategy.appendField(locator, this, "originAddress", buffer, theOriginAddress, (this.originAddress!= null));
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
            List<DimensionType> theMeasurementDimension;
            theMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            strategy.appendField(locator, this, "measurementDimension", buffer, theMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())));
        }
        {
            List<PackageType> theContainingPackage;
            theContainingPackage = (((this.containingPackage!= null)&&(!this.containingPackage.isEmpty()))?this.getContainingPackage():null);
            strategy.appendField(locator, this, "containingPackage", buffer, theContainingPackage, ((this.containingPackage!= null)&&(!this.containingPackage.isEmpty())));
        }
        {
            DocumentReferenceType theShipmentDocumentReference;
            theShipmentDocumentReference = this.getShipmentDocumentReference();
            strategy.appendField(locator, this, "shipmentDocumentReference", buffer, theShipmentDocumentReference, (this.shipmentDocumentReference!= null));
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
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GoodsItemType that = ((GoodsItemType) object);
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
            SequenceNumberIDType lhsSequenceNumberID;
            lhsSequenceNumberID = this.getSequenceNumberID();
            SequenceNumberIDType rhsSequenceNumberID;
            rhsSequenceNumberID = that.getSequenceNumberID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceNumberID", lhsSequenceNumberID), LocatorUtils.property(thatLocator, "sequenceNumberID", rhsSequenceNumberID), lhsSequenceNumberID, rhsSequenceNumberID, (this.sequenceNumberID!= null), (that.sequenceNumberID!= null))) {
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
            HazardousRiskIndicatorType lhsHazardousRiskIndicator;
            lhsHazardousRiskIndicator = this.getHazardousRiskIndicator();
            HazardousRiskIndicatorType rhsHazardousRiskIndicator;
            rhsHazardousRiskIndicator = that.getHazardousRiskIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hazardousRiskIndicator", lhsHazardousRiskIndicator), LocatorUtils.property(thatLocator, "hazardousRiskIndicator", rhsHazardousRiskIndicator), lhsHazardousRiskIndicator, rhsHazardousRiskIndicator, (this.hazardousRiskIndicator!= null), (that.hazardousRiskIndicator!= null))) {
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
            InsuranceValueAmountType lhsInsuranceValueAmount;
            lhsInsuranceValueAmount = this.getInsuranceValueAmount();
            InsuranceValueAmountType rhsInsuranceValueAmount;
            rhsInsuranceValueAmount = that.getInsuranceValueAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "insuranceValueAmount", lhsInsuranceValueAmount), LocatorUtils.property(thatLocator, "insuranceValueAmount", rhsInsuranceValueAmount), lhsInsuranceValueAmount, rhsInsuranceValueAmount, (this.insuranceValueAmount!= null), (that.insuranceValueAmount!= null))) {
                return false;
            }
        }
        {
            ValueAmountType lhsValueAmount;
            lhsValueAmount = this.getValueAmount();
            ValueAmountType rhsValueAmount;
            rhsValueAmount = that.getValueAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueAmount", lhsValueAmount), LocatorUtils.property(thatLocator, "valueAmount", rhsValueAmount), lhsValueAmount, rhsValueAmount, (this.valueAmount!= null), (that.valueAmount!= null))) {
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
            QuantityType lhsQuantity;
            lhsQuantity = this.getQuantity();
            QuantityType rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity, (this.quantity!= null), (that.quantity!= null))) {
                return false;
            }
        }
        {
            PreferenceCriterionCodeType lhsPreferenceCriterionCode;
            lhsPreferenceCriterionCode = this.getPreferenceCriterionCode();
            PreferenceCriterionCodeType rhsPreferenceCriterionCode;
            rhsPreferenceCriterionCode = that.getPreferenceCriterionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preferenceCriterionCode", lhsPreferenceCriterionCode), LocatorUtils.property(thatLocator, "preferenceCriterionCode", rhsPreferenceCriterionCode), lhsPreferenceCriterionCode, rhsPreferenceCriterionCode, (this.preferenceCriterionCode!= null), (that.preferenceCriterionCode!= null))) {
                return false;
            }
        }
        {
            RequiredCustomsIDType lhsRequiredCustomsID;
            lhsRequiredCustomsID = this.getRequiredCustomsID();
            RequiredCustomsIDType rhsRequiredCustomsID;
            rhsRequiredCustomsID = that.getRequiredCustomsID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requiredCustomsID", lhsRequiredCustomsID), LocatorUtils.property(thatLocator, "requiredCustomsID", rhsRequiredCustomsID), lhsRequiredCustomsID, rhsRequiredCustomsID, (this.requiredCustomsID!= null), (that.requiredCustomsID!= null))) {
                return false;
            }
        }
        {
            CustomsStatusCodeType lhsCustomsStatusCode;
            lhsCustomsStatusCode = this.getCustomsStatusCode();
            CustomsStatusCodeType rhsCustomsStatusCode;
            rhsCustomsStatusCode = that.getCustomsStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customsStatusCode", lhsCustomsStatusCode), LocatorUtils.property(thatLocator, "customsStatusCode", rhsCustomsStatusCode), lhsCustomsStatusCode, rhsCustomsStatusCode, (this.customsStatusCode!= null), (that.customsStatusCode!= null))) {
                return false;
            }
        }
        {
            CustomsTariffQuantityType lhsCustomsTariffQuantity;
            lhsCustomsTariffQuantity = this.getCustomsTariffQuantity();
            CustomsTariffQuantityType rhsCustomsTariffQuantity;
            rhsCustomsTariffQuantity = that.getCustomsTariffQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customsTariffQuantity", lhsCustomsTariffQuantity), LocatorUtils.property(thatLocator, "customsTariffQuantity", rhsCustomsTariffQuantity), lhsCustomsTariffQuantity, rhsCustomsTariffQuantity, (this.customsTariffQuantity!= null), (that.customsTariffQuantity!= null))) {
                return false;
            }
        }
        {
            CustomsImportClassifiedIndicatorType lhsCustomsImportClassifiedIndicator;
            lhsCustomsImportClassifiedIndicator = this.getCustomsImportClassifiedIndicator();
            CustomsImportClassifiedIndicatorType rhsCustomsImportClassifiedIndicator;
            rhsCustomsImportClassifiedIndicator = that.getCustomsImportClassifiedIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customsImportClassifiedIndicator", lhsCustomsImportClassifiedIndicator), LocatorUtils.property(thatLocator, "customsImportClassifiedIndicator", rhsCustomsImportClassifiedIndicator), lhsCustomsImportClassifiedIndicator, rhsCustomsImportClassifiedIndicator, (this.customsImportClassifiedIndicator!= null), (that.customsImportClassifiedIndicator!= null))) {
                return false;
            }
        }
        {
            ChargeableQuantityType lhsChargeableQuantity;
            lhsChargeableQuantity = this.getChargeableQuantity();
            ChargeableQuantityType rhsChargeableQuantity;
            rhsChargeableQuantity = that.getChargeableQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chargeableQuantity", lhsChargeableQuantity), LocatorUtils.property(thatLocator, "chargeableQuantity", rhsChargeableQuantity), lhsChargeableQuantity, rhsChargeableQuantity, (this.chargeableQuantity!= null), (that.chargeableQuantity!= null))) {
                return false;
            }
        }
        {
            ReturnableQuantityType lhsReturnableQuantity;
            lhsReturnableQuantity = this.getReturnableQuantity();
            ReturnableQuantityType rhsReturnableQuantity;
            rhsReturnableQuantity = that.getReturnableQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "returnableQuantity", lhsReturnableQuantity), LocatorUtils.property(thatLocator, "returnableQuantity", rhsReturnableQuantity), lhsReturnableQuantity, rhsReturnableQuantity, (this.returnableQuantity!= null), (that.returnableQuantity!= null))) {
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
            List<ItemType> lhsItem;
            lhsItem = (((this.item!= null)&&(!this.item.isEmpty()))?this.getItem():null);
            List<ItemType> rhsItem;
            rhsItem = (((that.item!= null)&&(!that.item.isEmpty()))?that.getItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "item", lhsItem), LocatorUtils.property(thatLocator, "item", rhsItem), lhsItem, rhsItem, ((this.item!= null)&&(!this.item.isEmpty())), ((that.item!= null)&&(!that.item.isEmpty())))) {
                return false;
            }
        }
        {
            List<GoodsItemContainerType> lhsGoodsItemContainer;
            lhsGoodsItemContainer = (((this.goodsItemContainer!= null)&&(!this.goodsItemContainer.isEmpty()))?this.getGoodsItemContainer():null);
            List<GoodsItemContainerType> rhsGoodsItemContainer;
            rhsGoodsItemContainer = (((that.goodsItemContainer!= null)&&(!that.goodsItemContainer.isEmpty()))?that.getGoodsItemContainer():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "goodsItemContainer", lhsGoodsItemContainer), LocatorUtils.property(thatLocator, "goodsItemContainer", rhsGoodsItemContainer), lhsGoodsItemContainer, rhsGoodsItemContainer, ((this.goodsItemContainer!= null)&&(!this.goodsItemContainer.isEmpty())), ((that.goodsItemContainer!= null)&&(!that.goodsItemContainer.isEmpty())))) {
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
            List<InvoiceLineType> lhsInvoiceLine;
            lhsInvoiceLine = (((this.invoiceLine!= null)&&(!this.invoiceLine.isEmpty()))?this.getInvoiceLine():null);
            List<InvoiceLineType> rhsInvoiceLine;
            rhsInvoiceLine = (((that.invoiceLine!= null)&&(!that.invoiceLine.isEmpty()))?that.getInvoiceLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoiceLine", lhsInvoiceLine), LocatorUtils.property(thatLocator, "invoiceLine", rhsInvoiceLine), lhsInvoiceLine, rhsInvoiceLine, ((this.invoiceLine!= null)&&(!this.invoiceLine.isEmpty())), ((that.invoiceLine!= null)&&(!that.invoiceLine.isEmpty())))) {
                return false;
            }
        }
        {
            List<TemperatureType> lhsTemperature;
            lhsTemperature = (((this.temperature!= null)&&(!this.temperature.isEmpty()))?this.getTemperature():null);
            List<TemperatureType> rhsTemperature;
            rhsTemperature = (((that.temperature!= null)&&(!that.temperature.isEmpty()))?that.getTemperature():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "temperature", lhsTemperature), LocatorUtils.property(thatLocator, "temperature", rhsTemperature), lhsTemperature, rhsTemperature, ((this.temperature!= null)&&(!this.temperature.isEmpty())), ((that.temperature!= null)&&(!that.temperature.isEmpty())))) {
                return false;
            }
        }
        {
            List<GoodsItemType> lhsContainedGoodsItem;
            lhsContainedGoodsItem = (((this.containedGoodsItem!= null)&&(!this.containedGoodsItem.isEmpty()))?this.getContainedGoodsItem():null);
            List<GoodsItemType> rhsContainedGoodsItem;
            rhsContainedGoodsItem = (((that.containedGoodsItem!= null)&&(!that.containedGoodsItem.isEmpty()))?that.getContainedGoodsItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "containedGoodsItem", lhsContainedGoodsItem), LocatorUtils.property(thatLocator, "containedGoodsItem", rhsContainedGoodsItem), lhsContainedGoodsItem, rhsContainedGoodsItem, ((this.containedGoodsItem!= null)&&(!this.containedGoodsItem.isEmpty())), ((that.containedGoodsItem!= null)&&(!that.containedGoodsItem.isEmpty())))) {
                return false;
            }
        }
        {
            AddressType lhsOriginAddress;
            lhsOriginAddress = this.getOriginAddress();
            AddressType rhsOriginAddress;
            rhsOriginAddress = that.getOriginAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originAddress", lhsOriginAddress), LocatorUtils.property(thatLocator, "originAddress", rhsOriginAddress), lhsOriginAddress, rhsOriginAddress, (this.originAddress!= null), (that.originAddress!= null))) {
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
            List<DimensionType> lhsMeasurementDimension;
            lhsMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            List<DimensionType> rhsMeasurementDimension;
            rhsMeasurementDimension = (((that.measurementDimension!= null)&&(!that.measurementDimension.isEmpty()))?that.getMeasurementDimension():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurementDimension", lhsMeasurementDimension), LocatorUtils.property(thatLocator, "measurementDimension", rhsMeasurementDimension), lhsMeasurementDimension, rhsMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())), ((that.measurementDimension!= null)&&(!that.measurementDimension.isEmpty())))) {
                return false;
            }
        }
        {
            List<PackageType> lhsContainingPackage;
            lhsContainingPackage = (((this.containingPackage!= null)&&(!this.containingPackage.isEmpty()))?this.getContainingPackage():null);
            List<PackageType> rhsContainingPackage;
            rhsContainingPackage = (((that.containingPackage!= null)&&(!that.containingPackage.isEmpty()))?that.getContainingPackage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "containingPackage", lhsContainingPackage), LocatorUtils.property(thatLocator, "containingPackage", rhsContainingPackage), lhsContainingPackage, rhsContainingPackage, ((this.containingPackage!= null)&&(!this.containingPackage.isEmpty())), ((that.containingPackage!= null)&&(!that.containingPackage.isEmpty())))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsShipmentDocumentReference;
            lhsShipmentDocumentReference = this.getShipmentDocumentReference();
            DocumentReferenceType rhsShipmentDocumentReference;
            rhsShipmentDocumentReference = that.getShipmentDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentDocumentReference", lhsShipmentDocumentReference), LocatorUtils.property(thatLocator, "shipmentDocumentReference", rhsShipmentDocumentReference), lhsShipmentDocumentReference, rhsShipmentDocumentReference, (this.shipmentDocumentReference!= null), (that.shipmentDocumentReference!= null))) {
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
            SequenceNumberIDType theSequenceNumberID;
            theSequenceNumberID = this.getSequenceNumberID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNumberID", theSequenceNumberID), currentHashCode, theSequenceNumberID, (this.sequenceNumberID!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            HazardousRiskIndicatorType theHazardousRiskIndicator;
            theHazardousRiskIndicator = this.getHazardousRiskIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousRiskIndicator", theHazardousRiskIndicator), currentHashCode, theHazardousRiskIndicator, (this.hazardousRiskIndicator!= null));
        }
        {
            DeclaredCustomsValueAmountType theDeclaredCustomsValueAmount;
            theDeclaredCustomsValueAmount = this.getDeclaredCustomsValueAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "declaredCustomsValueAmount", theDeclaredCustomsValueAmount), currentHashCode, theDeclaredCustomsValueAmount, (this.declaredCustomsValueAmount!= null));
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
            InsuranceValueAmountType theInsuranceValueAmount;
            theInsuranceValueAmount = this.getInsuranceValueAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "insuranceValueAmount", theInsuranceValueAmount), currentHashCode, theInsuranceValueAmount, (this.insuranceValueAmount!= null));
        }
        {
            ValueAmountType theValueAmount;
            theValueAmount = this.getValueAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueAmount", theValueAmount), currentHashCode, theValueAmount, (this.valueAmount!= null));
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
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, (this.quantity!= null));
        }
        {
            PreferenceCriterionCodeType thePreferenceCriterionCode;
            thePreferenceCriterionCode = this.getPreferenceCriterionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preferenceCriterionCode", thePreferenceCriterionCode), currentHashCode, thePreferenceCriterionCode, (this.preferenceCriterionCode!= null));
        }
        {
            RequiredCustomsIDType theRequiredCustomsID;
            theRequiredCustomsID = this.getRequiredCustomsID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requiredCustomsID", theRequiredCustomsID), currentHashCode, theRequiredCustomsID, (this.requiredCustomsID!= null));
        }
        {
            CustomsStatusCodeType theCustomsStatusCode;
            theCustomsStatusCode = this.getCustomsStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customsStatusCode", theCustomsStatusCode), currentHashCode, theCustomsStatusCode, (this.customsStatusCode!= null));
        }
        {
            CustomsTariffQuantityType theCustomsTariffQuantity;
            theCustomsTariffQuantity = this.getCustomsTariffQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customsTariffQuantity", theCustomsTariffQuantity), currentHashCode, theCustomsTariffQuantity, (this.customsTariffQuantity!= null));
        }
        {
            CustomsImportClassifiedIndicatorType theCustomsImportClassifiedIndicator;
            theCustomsImportClassifiedIndicator = this.getCustomsImportClassifiedIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customsImportClassifiedIndicator", theCustomsImportClassifiedIndicator), currentHashCode, theCustomsImportClassifiedIndicator, (this.customsImportClassifiedIndicator!= null));
        }
        {
            ChargeableQuantityType theChargeableQuantity;
            theChargeableQuantity = this.getChargeableQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chargeableQuantity", theChargeableQuantity), currentHashCode, theChargeableQuantity, (this.chargeableQuantity!= null));
        }
        {
            ReturnableQuantityType theReturnableQuantity;
            theReturnableQuantity = this.getReturnableQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "returnableQuantity", theReturnableQuantity), currentHashCode, theReturnableQuantity, (this.returnableQuantity!= null));
        }
        {
            TraceIDType theTraceID;
            theTraceID = this.getTraceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "traceID", theTraceID), currentHashCode, theTraceID, (this.traceID!= null));
        }
        {
            List<ItemType> theItem;
            theItem = (((this.item!= null)&&(!this.item.isEmpty()))?this.getItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "item", theItem), currentHashCode, theItem, ((this.item!= null)&&(!this.item.isEmpty())));
        }
        {
            List<GoodsItemContainerType> theGoodsItemContainer;
            theGoodsItemContainer = (((this.goodsItemContainer!= null)&&(!this.goodsItemContainer.isEmpty()))?this.getGoodsItemContainer():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "goodsItemContainer", theGoodsItemContainer), currentHashCode, theGoodsItemContainer, ((this.goodsItemContainer!= null)&&(!this.goodsItemContainer.isEmpty())));
        }
        {
            List<AllowanceChargeType> theFreightAllowanceCharge;
            theFreightAllowanceCharge = (((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty()))?this.getFreightAllowanceCharge():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightAllowanceCharge", theFreightAllowanceCharge), currentHashCode, theFreightAllowanceCharge, ((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty())));
        }
        {
            List<InvoiceLineType> theInvoiceLine;
            theInvoiceLine = (((this.invoiceLine!= null)&&(!this.invoiceLine.isEmpty()))?this.getInvoiceLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoiceLine", theInvoiceLine), currentHashCode, theInvoiceLine, ((this.invoiceLine!= null)&&(!this.invoiceLine.isEmpty())));
        }
        {
            List<TemperatureType> theTemperature;
            theTemperature = (((this.temperature!= null)&&(!this.temperature.isEmpty()))?this.getTemperature():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "temperature", theTemperature), currentHashCode, theTemperature, ((this.temperature!= null)&&(!this.temperature.isEmpty())));
        }
        {
            List<GoodsItemType> theContainedGoodsItem;
            theContainedGoodsItem = (((this.containedGoodsItem!= null)&&(!this.containedGoodsItem.isEmpty()))?this.getContainedGoodsItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containedGoodsItem", theContainedGoodsItem), currentHashCode, theContainedGoodsItem, ((this.containedGoodsItem!= null)&&(!this.containedGoodsItem.isEmpty())));
        }
        {
            AddressType theOriginAddress;
            theOriginAddress = this.getOriginAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originAddress", theOriginAddress), currentHashCode, theOriginAddress, (this.originAddress!= null));
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
            List<DimensionType> theMeasurementDimension;
            theMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurementDimension", theMeasurementDimension), currentHashCode, theMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())));
        }
        {
            List<PackageType> theContainingPackage;
            theContainingPackage = (((this.containingPackage!= null)&&(!this.containingPackage.isEmpty()))?this.getContainingPackage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containingPackage", theContainingPackage), currentHashCode, theContainingPackage, ((this.containingPackage!= null)&&(!this.containingPackage.isEmpty())));
        }
        {
            DocumentReferenceType theShipmentDocumentReference;
            theShipmentDocumentReference = this.getShipmentDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentDocumentReference", theShipmentDocumentReference), currentHashCode, theShipmentDocumentReference, (this.shipmentDocumentReference!= null));
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
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
