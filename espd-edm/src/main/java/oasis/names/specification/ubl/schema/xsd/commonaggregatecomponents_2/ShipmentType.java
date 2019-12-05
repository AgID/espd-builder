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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsignmentQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DeclaredCustomsValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DeclaredForCarriageValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DeclaredStatisticsValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DeliveryInstructionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FreeOnBoardValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GrossVolumeMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GrossWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HandlingCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HandlingInstructionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InformationType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InsuranceValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetNetWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetVolumeMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetWeightMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ShippingPriorityLevelCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SpecialInstructionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SplitConsignmentIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalGoodsItemQuantityType;
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
 * <p>Classe Java per ShipmentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ShipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShippingPriorityLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HandlingCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HandlingInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Information" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetNetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalGoodsItemQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalTransportHandlingUnitQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InsuranceValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredCustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredForCarriageValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredStatisticsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FreeOnBoardValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeliveryInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SplitConsignmentIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsignmentQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Consignment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GoodsItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportHandlingUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReturnAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FirstArrivalPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LastExitPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExportCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentType", propOrder = {
    "id",
    "shippingPriorityLevelCode",
    "handlingCode",
    "handlingInstructions",
    "information",
    "grossWeightMeasure",
    "netWeightMeasure",
    "netNetWeightMeasure",
    "grossVolumeMeasure",
    "netVolumeMeasure",
    "totalGoodsItemQuantity",
    "totalTransportHandlingUnitQuantity",
    "insuranceValueAmount",
    "declaredCustomsValueAmount",
    "declaredForCarriageValueAmount",
    "declaredStatisticsValueAmount",
    "freeOnBoardValueAmount",
    "specialInstructions",
    "deliveryInstructions",
    "splitConsignmentIndicator",
    "consignmentQuantity",
    "consignment",
    "goodsItem",
    "shipmentStage",
    "delivery",
    "transportHandlingUnit",
    "returnAddress",
    "originAddress",
    "firstArrivalPortLocation",
    "lastExitPortLocation",
    "exportCountry",
    "freightAllowanceCharge"
})
public class ShipmentType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "ShippingPriorityLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ShippingPriorityLevelCodeType shippingPriorityLevelCode;
    @XmlElement(name = "HandlingCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HandlingCodeType handlingCode;
    @XmlElement(name = "HandlingInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<HandlingInstructionsType> handlingInstructions;
    @XmlElement(name = "Information", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<InformationType> information;
    @XmlElement(name = "GrossWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GrossWeightMeasureType grossWeightMeasure;
    @XmlElement(name = "NetWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetWeightMeasureType netWeightMeasure;
    @XmlElement(name = "NetNetWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetNetWeightMeasureType netNetWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GrossVolumeMeasureType grossVolumeMeasure;
    @XmlElement(name = "NetVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetVolumeMeasureType netVolumeMeasure;
    @XmlElement(name = "TotalGoodsItemQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalGoodsItemQuantityType totalGoodsItemQuantity;
    @XmlElement(name = "TotalTransportHandlingUnitQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalTransportHandlingUnitQuantityType totalTransportHandlingUnitQuantity;
    @XmlElement(name = "InsuranceValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InsuranceValueAmountType insuranceValueAmount;
    @XmlElement(name = "DeclaredCustomsValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclaredCustomsValueAmountType declaredCustomsValueAmount;
    @XmlElement(name = "DeclaredForCarriageValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclaredForCarriageValueAmountType declaredForCarriageValueAmount;
    @XmlElement(name = "DeclaredStatisticsValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DeclaredStatisticsValueAmountType declaredStatisticsValueAmount;
    @XmlElement(name = "FreeOnBoardValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FreeOnBoardValueAmountType freeOnBoardValueAmount;
    @XmlElement(name = "SpecialInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<SpecialInstructionsType> specialInstructions;
    @XmlElement(name = "DeliveryInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DeliveryInstructionsType> deliveryInstructions;
    @XmlElement(name = "SplitConsignmentIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SplitConsignmentIndicatorType splitConsignmentIndicator;
    @XmlElement(name = "ConsignmentQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsignmentQuantityType consignmentQuantity;
    @XmlElement(name = "Consignment")
    protected List<ConsignmentType> consignment;
    @XmlElement(name = "GoodsItem")
    protected List<GoodsItemType> goodsItem;
    @XmlElement(name = "ShipmentStage")
    protected List<ShipmentStageType> shipmentStage;
    @XmlElement(name = "Delivery")
    protected DeliveryType delivery;
    @XmlElement(name = "TransportHandlingUnit")
    protected List<TransportHandlingUnitType> transportHandlingUnit;
    @XmlElement(name = "ReturnAddress")
    protected AddressType returnAddress;
    @XmlElement(name = "OriginAddress")
    protected AddressType originAddress;
    @XmlElement(name = "FirstArrivalPortLocation")
    protected LocationType firstArrivalPortLocation;
    @XmlElement(name = "LastExitPortLocation")
    protected LocationType lastExitPortLocation;
    @XmlElement(name = "ExportCountry")
    protected CountryType exportCountry;
    @XmlElement(name = "FreightAllowanceCharge")
    protected List<AllowanceChargeType> freightAllowanceCharge;

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
     * Gets the value of the consignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsignmentType }
     * 
     * 
     */
    public List<ConsignmentType> getConsignment() {
        if (consignment == null) {
            consignment = new ArrayList<ConsignmentType>();
        }
        return this.consignment;
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
     * Recupera il valore della proprietà returnAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getReturnAddress() {
        return returnAddress;
    }

    /**
     * Imposta il valore della proprietà returnAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setReturnAddress(AddressType value) {
        this.returnAddress = value;
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

    /**
     * Recupera il valore della proprietà exportCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getExportCountry() {
        return exportCountry;
    }

    /**
     * Imposta il valore della proprietà exportCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setExportCountry(CountryType value) {
        this.exportCountry = value;
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
            List<SpecialInstructionsType> theSpecialInstructions;
            theSpecialInstructions = (((this.specialInstructions!= null)&&(!this.specialInstructions.isEmpty()))?this.getSpecialInstructions():null);
            strategy.appendField(locator, this, "specialInstructions", buffer, theSpecialInstructions, ((this.specialInstructions!= null)&&(!this.specialInstructions.isEmpty())));
        }
        {
            List<DeliveryInstructionsType> theDeliveryInstructions;
            theDeliveryInstructions = (((this.deliveryInstructions!= null)&&(!this.deliveryInstructions.isEmpty()))?this.getDeliveryInstructions():null);
            strategy.appendField(locator, this, "deliveryInstructions", buffer, theDeliveryInstructions, ((this.deliveryInstructions!= null)&&(!this.deliveryInstructions.isEmpty())));
        }
        {
            SplitConsignmentIndicatorType theSplitConsignmentIndicator;
            theSplitConsignmentIndicator = this.getSplitConsignmentIndicator();
            strategy.appendField(locator, this, "splitConsignmentIndicator", buffer, theSplitConsignmentIndicator, (this.splitConsignmentIndicator!= null));
        }
        {
            ConsignmentQuantityType theConsignmentQuantity;
            theConsignmentQuantity = this.getConsignmentQuantity();
            strategy.appendField(locator, this, "consignmentQuantity", buffer, theConsignmentQuantity, (this.consignmentQuantity!= null));
        }
        {
            List<ConsignmentType> theConsignment;
            theConsignment = (((this.consignment!= null)&&(!this.consignment.isEmpty()))?this.getConsignment():null);
            strategy.appendField(locator, this, "consignment", buffer, theConsignment, ((this.consignment!= null)&&(!this.consignment.isEmpty())));
        }
        {
            List<GoodsItemType> theGoodsItem;
            theGoodsItem = (((this.goodsItem!= null)&&(!this.goodsItem.isEmpty()))?this.getGoodsItem():null);
            strategy.appendField(locator, this, "goodsItem", buffer, theGoodsItem, ((this.goodsItem!= null)&&(!this.goodsItem.isEmpty())));
        }
        {
            List<ShipmentStageType> theShipmentStage;
            theShipmentStage = (((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty()))?this.getShipmentStage():null);
            strategy.appendField(locator, this, "shipmentStage", buffer, theShipmentStage, ((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty())));
        }
        {
            DeliveryType theDelivery;
            theDelivery = this.getDelivery();
            strategy.appendField(locator, this, "delivery", buffer, theDelivery, (this.delivery!= null));
        }
        {
            List<TransportHandlingUnitType> theTransportHandlingUnit;
            theTransportHandlingUnit = (((this.transportHandlingUnit!= null)&&(!this.transportHandlingUnit.isEmpty()))?this.getTransportHandlingUnit():null);
            strategy.appendField(locator, this, "transportHandlingUnit", buffer, theTransportHandlingUnit, ((this.transportHandlingUnit!= null)&&(!this.transportHandlingUnit.isEmpty())));
        }
        {
            AddressType theReturnAddress;
            theReturnAddress = this.getReturnAddress();
            strategy.appendField(locator, this, "returnAddress", buffer, theReturnAddress, (this.returnAddress!= null));
        }
        {
            AddressType theOriginAddress;
            theOriginAddress = this.getOriginAddress();
            strategy.appendField(locator, this, "originAddress", buffer, theOriginAddress, (this.originAddress!= null));
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
        {
            CountryType theExportCountry;
            theExportCountry = this.getExportCountry();
            strategy.appendField(locator, this, "exportCountry", buffer, theExportCountry, (this.exportCountry!= null));
        }
        {
            List<AllowanceChargeType> theFreightAllowanceCharge;
            theFreightAllowanceCharge = (((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty()))?this.getFreightAllowanceCharge():null);
            strategy.appendField(locator, this, "freightAllowanceCharge", buffer, theFreightAllowanceCharge, ((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty())));
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
        final ShipmentType that = ((ShipmentType) object);
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
            List<SpecialInstructionsType> lhsSpecialInstructions;
            lhsSpecialInstructions = (((this.specialInstructions!= null)&&(!this.specialInstructions.isEmpty()))?this.getSpecialInstructions():null);
            List<SpecialInstructionsType> rhsSpecialInstructions;
            rhsSpecialInstructions = (((that.specialInstructions!= null)&&(!that.specialInstructions.isEmpty()))?that.getSpecialInstructions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialInstructions", lhsSpecialInstructions), LocatorUtils.property(thatLocator, "specialInstructions", rhsSpecialInstructions), lhsSpecialInstructions, rhsSpecialInstructions, ((this.specialInstructions!= null)&&(!this.specialInstructions.isEmpty())), ((that.specialInstructions!= null)&&(!that.specialInstructions.isEmpty())))) {
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
            SplitConsignmentIndicatorType lhsSplitConsignmentIndicator;
            lhsSplitConsignmentIndicator = this.getSplitConsignmentIndicator();
            SplitConsignmentIndicatorType rhsSplitConsignmentIndicator;
            rhsSplitConsignmentIndicator = that.getSplitConsignmentIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "splitConsignmentIndicator", lhsSplitConsignmentIndicator), LocatorUtils.property(thatLocator, "splitConsignmentIndicator", rhsSplitConsignmentIndicator), lhsSplitConsignmentIndicator, rhsSplitConsignmentIndicator, (this.splitConsignmentIndicator!= null), (that.splitConsignmentIndicator!= null))) {
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
            List<ConsignmentType> lhsConsignment;
            lhsConsignment = (((this.consignment!= null)&&(!this.consignment.isEmpty()))?this.getConsignment():null);
            List<ConsignmentType> rhsConsignment;
            rhsConsignment = (((that.consignment!= null)&&(!that.consignment.isEmpty()))?that.getConsignment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consignment", lhsConsignment), LocatorUtils.property(thatLocator, "consignment", rhsConsignment), lhsConsignment, rhsConsignment, ((this.consignment!= null)&&(!this.consignment.isEmpty())), ((that.consignment!= null)&&(!that.consignment.isEmpty())))) {
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
            List<ShipmentStageType> lhsShipmentStage;
            lhsShipmentStage = (((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty()))?this.getShipmentStage():null);
            List<ShipmentStageType> rhsShipmentStage;
            rhsShipmentStage = (((that.shipmentStage!= null)&&(!that.shipmentStage.isEmpty()))?that.getShipmentStage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentStage", lhsShipmentStage), LocatorUtils.property(thatLocator, "shipmentStage", rhsShipmentStage), lhsShipmentStage, rhsShipmentStage, ((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty())), ((that.shipmentStage!= null)&&(!that.shipmentStage.isEmpty())))) {
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
            List<TransportHandlingUnitType> lhsTransportHandlingUnit;
            lhsTransportHandlingUnit = (((this.transportHandlingUnit!= null)&&(!this.transportHandlingUnit.isEmpty()))?this.getTransportHandlingUnit():null);
            List<TransportHandlingUnitType> rhsTransportHandlingUnit;
            rhsTransportHandlingUnit = (((that.transportHandlingUnit!= null)&&(!that.transportHandlingUnit.isEmpty()))?that.getTransportHandlingUnit():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportHandlingUnit", lhsTransportHandlingUnit), LocatorUtils.property(thatLocator, "transportHandlingUnit", rhsTransportHandlingUnit), lhsTransportHandlingUnit, rhsTransportHandlingUnit, ((this.transportHandlingUnit!= null)&&(!this.transportHandlingUnit.isEmpty())), ((that.transportHandlingUnit!= null)&&(!that.transportHandlingUnit.isEmpty())))) {
                return false;
            }
        }
        {
            AddressType lhsReturnAddress;
            lhsReturnAddress = this.getReturnAddress();
            AddressType rhsReturnAddress;
            rhsReturnAddress = that.getReturnAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "returnAddress", lhsReturnAddress), LocatorUtils.property(thatLocator, "returnAddress", rhsReturnAddress), lhsReturnAddress, rhsReturnAddress, (this.returnAddress!= null), (that.returnAddress!= null))) {
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
        {
            CountryType lhsExportCountry;
            lhsExportCountry = this.getExportCountry();
            CountryType rhsExportCountry;
            rhsExportCountry = that.getExportCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exportCountry", lhsExportCountry), LocatorUtils.property(thatLocator, "exportCountry", rhsExportCountry), lhsExportCountry, rhsExportCountry, (this.exportCountry!= null), (that.exportCountry!= null))) {
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
            List<SpecialInstructionsType> theSpecialInstructions;
            theSpecialInstructions = (((this.specialInstructions!= null)&&(!this.specialInstructions.isEmpty()))?this.getSpecialInstructions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialInstructions", theSpecialInstructions), currentHashCode, theSpecialInstructions, ((this.specialInstructions!= null)&&(!this.specialInstructions.isEmpty())));
        }
        {
            List<DeliveryInstructionsType> theDeliveryInstructions;
            theDeliveryInstructions = (((this.deliveryInstructions!= null)&&(!this.deliveryInstructions.isEmpty()))?this.getDeliveryInstructions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryInstructions", theDeliveryInstructions), currentHashCode, theDeliveryInstructions, ((this.deliveryInstructions!= null)&&(!this.deliveryInstructions.isEmpty())));
        }
        {
            SplitConsignmentIndicatorType theSplitConsignmentIndicator;
            theSplitConsignmentIndicator = this.getSplitConsignmentIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "splitConsignmentIndicator", theSplitConsignmentIndicator), currentHashCode, theSplitConsignmentIndicator, (this.splitConsignmentIndicator!= null));
        }
        {
            ConsignmentQuantityType theConsignmentQuantity;
            theConsignmentQuantity = this.getConsignmentQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consignmentQuantity", theConsignmentQuantity), currentHashCode, theConsignmentQuantity, (this.consignmentQuantity!= null));
        }
        {
            List<ConsignmentType> theConsignment;
            theConsignment = (((this.consignment!= null)&&(!this.consignment.isEmpty()))?this.getConsignment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consignment", theConsignment), currentHashCode, theConsignment, ((this.consignment!= null)&&(!this.consignment.isEmpty())));
        }
        {
            List<GoodsItemType> theGoodsItem;
            theGoodsItem = (((this.goodsItem!= null)&&(!this.goodsItem.isEmpty()))?this.getGoodsItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "goodsItem", theGoodsItem), currentHashCode, theGoodsItem, ((this.goodsItem!= null)&&(!this.goodsItem.isEmpty())));
        }
        {
            List<ShipmentStageType> theShipmentStage;
            theShipmentStage = (((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty()))?this.getShipmentStage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentStage", theShipmentStage), currentHashCode, theShipmentStage, ((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty())));
        }
        {
            DeliveryType theDelivery;
            theDelivery = this.getDelivery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "delivery", theDelivery), currentHashCode, theDelivery, (this.delivery!= null));
        }
        {
            List<TransportHandlingUnitType> theTransportHandlingUnit;
            theTransportHandlingUnit = (((this.transportHandlingUnit!= null)&&(!this.transportHandlingUnit.isEmpty()))?this.getTransportHandlingUnit():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportHandlingUnit", theTransportHandlingUnit), currentHashCode, theTransportHandlingUnit, ((this.transportHandlingUnit!= null)&&(!this.transportHandlingUnit.isEmpty())));
        }
        {
            AddressType theReturnAddress;
            theReturnAddress = this.getReturnAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "returnAddress", theReturnAddress), currentHashCode, theReturnAddress, (this.returnAddress!= null));
        }
        {
            AddressType theOriginAddress;
            theOriginAddress = this.getOriginAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originAddress", theOriginAddress), currentHashCode, theOriginAddress, (this.originAddress!= null));
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
        {
            CountryType theExportCountry;
            theExportCountry = this.getExportCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exportCountry", theExportCountry), currentHashCode, theExportCountry, (this.exportCountry!= null));
        }
        {
            List<AllowanceChargeType> theFreightAllowanceCharge;
            theFreightAllowanceCharge = (((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty()))?this.getFreightAllowanceCharge():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freightAllowanceCharge", theFreightAllowanceCharge), currentHashCode, theFreightAllowanceCharge, ((this.freightAllowanceCharge!= null)&&(!this.freightAllowanceCharge.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
