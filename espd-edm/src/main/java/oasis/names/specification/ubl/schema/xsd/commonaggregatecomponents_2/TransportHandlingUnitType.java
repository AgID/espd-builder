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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DamageRemarksType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HandlingCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HandlingInstructionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HazardousRiskIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ShippingMarksType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalGoodsItemQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalPackageQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TraceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportHandlingUnitTypeCodeType;
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
 * <p>Classe Java per TransportHandlingUnitType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransportHandlingUnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportHandlingUnitTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HandlingCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HandlingInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRiskIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalGoodsItemQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalPackageQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DamageRemarks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShippingMarks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TraceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HandlingUnitDespatchLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualPackage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReceivedHandlingUnitReceiptLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportMeans" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HazardousGoodsTransit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MinimumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaximumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GoodsItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FloorSpaceMeasurementDimension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PalletSpaceMeasurementDimension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipmentDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Status" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CustomsDeclaration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReferencedShipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Package" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportHandlingUnitType", propOrder = {
    "id",
    "transportHandlingUnitTypeCode",
    "handlingCode",
    "handlingInstructions",
    "hazardousRiskIndicator",
    "totalGoodsItemQuantity",
    "totalPackageQuantity",
    "damageRemarks",
    "shippingMarks",
    "traceID",
    "handlingUnitDespatchLine",
    "actualPackage",
    "receivedHandlingUnitReceiptLine",
    "transportEquipment",
    "transportMeans",
    "hazardousGoodsTransit",
    "measurementDimension",
    "minimumTemperature",
    "maximumTemperature",
    "goodsItem",
    "floorSpaceMeasurementDimension",
    "palletSpaceMeasurementDimension",
    "shipmentDocumentReference",
    "status",
    "customsDeclaration",
    "referencedShipment",
    "_package"
})
public class TransportHandlingUnitType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "TransportHandlingUnitTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportHandlingUnitTypeCodeType transportHandlingUnitTypeCode;
    @XmlElement(name = "HandlingCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HandlingCodeType handlingCode;
    @XmlElement(name = "HandlingInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<HandlingInstructionsType> handlingInstructions;
    @XmlElement(name = "HazardousRiskIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardousRiskIndicatorType hazardousRiskIndicator;
    @XmlElement(name = "TotalGoodsItemQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalGoodsItemQuantityType totalGoodsItemQuantity;
    @XmlElement(name = "TotalPackageQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalPackageQuantityType totalPackageQuantity;
    @XmlElement(name = "DamageRemarks", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DamageRemarksType> damageRemarks;
    @XmlElement(name = "ShippingMarks", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ShippingMarksType> shippingMarks;
    @XmlElement(name = "TraceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TraceIDType traceID;
    @XmlElement(name = "HandlingUnitDespatchLine")
    protected List<DespatchLineType> handlingUnitDespatchLine;
    @XmlElement(name = "ActualPackage")
    protected List<PackageType> actualPackage;
    @XmlElement(name = "ReceivedHandlingUnitReceiptLine")
    protected List<ReceiptLineType> receivedHandlingUnitReceiptLine;
    @XmlElement(name = "TransportEquipment")
    protected List<TransportEquipmentType> transportEquipment;
    @XmlElement(name = "TransportMeans")
    protected List<TransportMeansType> transportMeans;
    @XmlElement(name = "HazardousGoodsTransit")
    protected List<HazardousGoodsTransitType> hazardousGoodsTransit;
    @XmlElement(name = "MeasurementDimension")
    protected List<DimensionType> measurementDimension;
    @XmlElement(name = "MinimumTemperature")
    protected TemperatureType minimumTemperature;
    @XmlElement(name = "MaximumTemperature")
    protected TemperatureType maximumTemperature;
    @XmlElement(name = "GoodsItem")
    protected List<GoodsItemType> goodsItem;
    @XmlElement(name = "FloorSpaceMeasurementDimension")
    protected DimensionType floorSpaceMeasurementDimension;
    @XmlElement(name = "PalletSpaceMeasurementDimension")
    protected DimensionType palletSpaceMeasurementDimension;
    @XmlElement(name = "ShipmentDocumentReference")
    protected List<DocumentReferenceType> shipmentDocumentReference;
    @XmlElement(name = "Status")
    protected List<StatusType> status;
    @XmlElement(name = "CustomsDeclaration")
    protected List<CustomsDeclarationType> customsDeclaration;
    @XmlElement(name = "ReferencedShipment")
    protected List<ShipmentType> referencedShipment;
    @XmlElement(name = "Package")
    protected List<PackageType> _package;

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
     * Recupera il valore della proprietà transportHandlingUnitTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportHandlingUnitTypeCodeType }
     *     
     */
    public TransportHandlingUnitTypeCodeType getTransportHandlingUnitTypeCode() {
        return transportHandlingUnitTypeCode;
    }

    /**
     * Imposta il valore della proprietà transportHandlingUnitTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportHandlingUnitTypeCodeType }
     *     
     */
    public void setTransportHandlingUnitTypeCode(TransportHandlingUnitTypeCodeType value) {
        this.transportHandlingUnitTypeCode = value;
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
     * Recupera il valore della proprietà totalPackageQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalPackageQuantityType }
     *     
     */
    public TotalPackageQuantityType getTotalPackageQuantity() {
        return totalPackageQuantity;
    }

    /**
     * Imposta il valore della proprietà totalPackageQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPackageQuantityType }
     *     
     */
    public void setTotalPackageQuantity(TotalPackageQuantityType value) {
        this.totalPackageQuantity = value;
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
     * Gets the value of the shippingMarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingMarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingMarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingMarksType }
     * 
     * 
     */
    public List<ShippingMarksType> getShippingMarks() {
        if (shippingMarks == null) {
            shippingMarks = new ArrayList<ShippingMarksType>();
        }
        return this.shippingMarks;
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
     * Gets the value of the handlingUnitDespatchLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingUnitDespatchLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingUnitDespatchLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DespatchLineType }
     * 
     * 
     */
    public List<DespatchLineType> getHandlingUnitDespatchLine() {
        if (handlingUnitDespatchLine == null) {
            handlingUnitDespatchLine = new ArrayList<DespatchLineType>();
        }
        return this.handlingUnitDespatchLine;
    }

    /**
     * Gets the value of the actualPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actualPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getActualPackage() {
        if (actualPackage == null) {
            actualPackage = new ArrayList<PackageType>();
        }
        return this.actualPackage;
    }

    /**
     * Gets the value of the receivedHandlingUnitReceiptLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivedHandlingUnitReceiptLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivedHandlingUnitReceiptLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiptLineType }
     * 
     * 
     */
    public List<ReceiptLineType> getReceivedHandlingUnitReceiptLine() {
        if (receivedHandlingUnitReceiptLine == null) {
            receivedHandlingUnitReceiptLine = new ArrayList<ReceiptLineType>();
        }
        return this.receivedHandlingUnitReceiptLine;
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
     * Gets the value of the transportMeans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportMeans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportMeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportMeansType }
     * 
     * 
     */
    public List<TransportMeansType> getTransportMeans() {
        if (transportMeans == null) {
            transportMeans = new ArrayList<TransportMeansType>();
        }
        return this.transportMeans;
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
     * Recupera il valore della proprietà floorSpaceMeasurementDimension.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getFloorSpaceMeasurementDimension() {
        return floorSpaceMeasurementDimension;
    }

    /**
     * Imposta il valore della proprietà floorSpaceMeasurementDimension.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setFloorSpaceMeasurementDimension(DimensionType value) {
        this.floorSpaceMeasurementDimension = value;
    }

    /**
     * Recupera il valore della proprietà palletSpaceMeasurementDimension.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getPalletSpaceMeasurementDimension() {
        return palletSpaceMeasurementDimension;
    }

    /**
     * Imposta il valore della proprietà palletSpaceMeasurementDimension.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setPalletSpaceMeasurementDimension(DimensionType value) {
        this.palletSpaceMeasurementDimension = value;
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
     * Gets the value of the referencedShipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedShipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedShipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentType }
     * 
     * 
     */
    public List<ShipmentType> getReferencedShipment() {
        if (referencedShipment == null) {
            referencedShipment = new ArrayList<ShipmentType>();
        }
        return this.referencedShipment;
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
            TransportHandlingUnitTypeCodeType theTransportHandlingUnitTypeCode;
            theTransportHandlingUnitTypeCode = this.getTransportHandlingUnitTypeCode();
            strategy.appendField(locator, this, "transportHandlingUnitTypeCode", buffer, theTransportHandlingUnitTypeCode, (this.transportHandlingUnitTypeCode!= null));
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
            HazardousRiskIndicatorType theHazardousRiskIndicator;
            theHazardousRiskIndicator = this.getHazardousRiskIndicator();
            strategy.appendField(locator, this, "hazardousRiskIndicator", buffer, theHazardousRiskIndicator, (this.hazardousRiskIndicator!= null));
        }
        {
            TotalGoodsItemQuantityType theTotalGoodsItemQuantity;
            theTotalGoodsItemQuantity = this.getTotalGoodsItemQuantity();
            strategy.appendField(locator, this, "totalGoodsItemQuantity", buffer, theTotalGoodsItemQuantity, (this.totalGoodsItemQuantity!= null));
        }
        {
            TotalPackageQuantityType theTotalPackageQuantity;
            theTotalPackageQuantity = this.getTotalPackageQuantity();
            strategy.appendField(locator, this, "totalPackageQuantity", buffer, theTotalPackageQuantity, (this.totalPackageQuantity!= null));
        }
        {
            List<DamageRemarksType> theDamageRemarks;
            theDamageRemarks = (((this.damageRemarks!= null)&&(!this.damageRemarks.isEmpty()))?this.getDamageRemarks():null);
            strategy.appendField(locator, this, "damageRemarks", buffer, theDamageRemarks, ((this.damageRemarks!= null)&&(!this.damageRemarks.isEmpty())));
        }
        {
            List<ShippingMarksType> theShippingMarks;
            theShippingMarks = (((this.shippingMarks!= null)&&(!this.shippingMarks.isEmpty()))?this.getShippingMarks():null);
            strategy.appendField(locator, this, "shippingMarks", buffer, theShippingMarks, ((this.shippingMarks!= null)&&(!this.shippingMarks.isEmpty())));
        }
        {
            TraceIDType theTraceID;
            theTraceID = this.getTraceID();
            strategy.appendField(locator, this, "traceID", buffer, theTraceID, (this.traceID!= null));
        }
        {
            List<DespatchLineType> theHandlingUnitDespatchLine;
            theHandlingUnitDespatchLine = (((this.handlingUnitDespatchLine!= null)&&(!this.handlingUnitDespatchLine.isEmpty()))?this.getHandlingUnitDespatchLine():null);
            strategy.appendField(locator, this, "handlingUnitDespatchLine", buffer, theHandlingUnitDespatchLine, ((this.handlingUnitDespatchLine!= null)&&(!this.handlingUnitDespatchLine.isEmpty())));
        }
        {
            List<PackageType> theActualPackage;
            theActualPackage = (((this.actualPackage!= null)&&(!this.actualPackage.isEmpty()))?this.getActualPackage():null);
            strategy.appendField(locator, this, "actualPackage", buffer, theActualPackage, ((this.actualPackage!= null)&&(!this.actualPackage.isEmpty())));
        }
        {
            List<ReceiptLineType> theReceivedHandlingUnitReceiptLine;
            theReceivedHandlingUnitReceiptLine = (((this.receivedHandlingUnitReceiptLine!= null)&&(!this.receivedHandlingUnitReceiptLine.isEmpty()))?this.getReceivedHandlingUnitReceiptLine():null);
            strategy.appendField(locator, this, "receivedHandlingUnitReceiptLine", buffer, theReceivedHandlingUnitReceiptLine, ((this.receivedHandlingUnitReceiptLine!= null)&&(!this.receivedHandlingUnitReceiptLine.isEmpty())));
        }
        {
            List<TransportEquipmentType> theTransportEquipment;
            theTransportEquipment = (((this.transportEquipment!= null)&&(!this.transportEquipment.isEmpty()))?this.getTransportEquipment():null);
            strategy.appendField(locator, this, "transportEquipment", buffer, theTransportEquipment, ((this.transportEquipment!= null)&&(!this.transportEquipment.isEmpty())));
        }
        {
            List<TransportMeansType> theTransportMeans;
            theTransportMeans = (((this.transportMeans!= null)&&(!this.transportMeans.isEmpty()))?this.getTransportMeans():null);
            strategy.appendField(locator, this, "transportMeans", buffer, theTransportMeans, ((this.transportMeans!= null)&&(!this.transportMeans.isEmpty())));
        }
        {
            List<HazardousGoodsTransitType> theHazardousGoodsTransit;
            theHazardousGoodsTransit = (((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty()))?this.getHazardousGoodsTransit():null);
            strategy.appendField(locator, this, "hazardousGoodsTransit", buffer, theHazardousGoodsTransit, ((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty())));
        }
        {
            List<DimensionType> theMeasurementDimension;
            theMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            strategy.appendField(locator, this, "measurementDimension", buffer, theMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())));
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
            List<GoodsItemType> theGoodsItem;
            theGoodsItem = (((this.goodsItem!= null)&&(!this.goodsItem.isEmpty()))?this.getGoodsItem():null);
            strategy.appendField(locator, this, "goodsItem", buffer, theGoodsItem, ((this.goodsItem!= null)&&(!this.goodsItem.isEmpty())));
        }
        {
            DimensionType theFloorSpaceMeasurementDimension;
            theFloorSpaceMeasurementDimension = this.getFloorSpaceMeasurementDimension();
            strategy.appendField(locator, this, "floorSpaceMeasurementDimension", buffer, theFloorSpaceMeasurementDimension, (this.floorSpaceMeasurementDimension!= null));
        }
        {
            DimensionType thePalletSpaceMeasurementDimension;
            thePalletSpaceMeasurementDimension = this.getPalletSpaceMeasurementDimension();
            strategy.appendField(locator, this, "palletSpaceMeasurementDimension", buffer, thePalletSpaceMeasurementDimension, (this.palletSpaceMeasurementDimension!= null));
        }
        {
            List<DocumentReferenceType> theShipmentDocumentReference;
            theShipmentDocumentReference = (((this.shipmentDocumentReference!= null)&&(!this.shipmentDocumentReference.isEmpty()))?this.getShipmentDocumentReference():null);
            strategy.appendField(locator, this, "shipmentDocumentReference", buffer, theShipmentDocumentReference, ((this.shipmentDocumentReference!= null)&&(!this.shipmentDocumentReference.isEmpty())));
        }
        {
            List<StatusType> theStatus;
            theStatus = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            strategy.appendField(locator, this, "status", buffer, theStatus, ((this.status!= null)&&(!this.status.isEmpty())));
        }
        {
            List<CustomsDeclarationType> theCustomsDeclaration;
            theCustomsDeclaration = (((this.customsDeclaration!= null)&&(!this.customsDeclaration.isEmpty()))?this.getCustomsDeclaration():null);
            strategy.appendField(locator, this, "customsDeclaration", buffer, theCustomsDeclaration, ((this.customsDeclaration!= null)&&(!this.customsDeclaration.isEmpty())));
        }
        {
            List<ShipmentType> theReferencedShipment;
            theReferencedShipment = (((this.referencedShipment!= null)&&(!this.referencedShipment.isEmpty()))?this.getReferencedShipment():null);
            strategy.appendField(locator, this, "referencedShipment", buffer, theReferencedShipment, ((this.referencedShipment!= null)&&(!this.referencedShipment.isEmpty())));
        }
        {
            List<PackageType> thePackage;
            thePackage = (((this._package!= null)&&(!this._package.isEmpty()))?this.getPackage():null);
            strategy.appendField(locator, this, "_package", buffer, thePackage, ((this._package!= null)&&(!this._package.isEmpty())));
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
        final TransportHandlingUnitType that = ((TransportHandlingUnitType) object);
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
            TransportHandlingUnitTypeCodeType lhsTransportHandlingUnitTypeCode;
            lhsTransportHandlingUnitTypeCode = this.getTransportHandlingUnitTypeCode();
            TransportHandlingUnitTypeCodeType rhsTransportHandlingUnitTypeCode;
            rhsTransportHandlingUnitTypeCode = that.getTransportHandlingUnitTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportHandlingUnitTypeCode", lhsTransportHandlingUnitTypeCode), LocatorUtils.property(thatLocator, "transportHandlingUnitTypeCode", rhsTransportHandlingUnitTypeCode), lhsTransportHandlingUnitTypeCode, rhsTransportHandlingUnitTypeCode, (this.transportHandlingUnitTypeCode!= null), (that.transportHandlingUnitTypeCode!= null))) {
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
            HazardousRiskIndicatorType lhsHazardousRiskIndicator;
            lhsHazardousRiskIndicator = this.getHazardousRiskIndicator();
            HazardousRiskIndicatorType rhsHazardousRiskIndicator;
            rhsHazardousRiskIndicator = that.getHazardousRiskIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hazardousRiskIndicator", lhsHazardousRiskIndicator), LocatorUtils.property(thatLocator, "hazardousRiskIndicator", rhsHazardousRiskIndicator), lhsHazardousRiskIndicator, rhsHazardousRiskIndicator, (this.hazardousRiskIndicator!= null), (that.hazardousRiskIndicator!= null))) {
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
            TotalPackageQuantityType lhsTotalPackageQuantity;
            lhsTotalPackageQuantity = this.getTotalPackageQuantity();
            TotalPackageQuantityType rhsTotalPackageQuantity;
            rhsTotalPackageQuantity = that.getTotalPackageQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalPackageQuantity", lhsTotalPackageQuantity), LocatorUtils.property(thatLocator, "totalPackageQuantity", rhsTotalPackageQuantity), lhsTotalPackageQuantity, rhsTotalPackageQuantity, (this.totalPackageQuantity!= null), (that.totalPackageQuantity!= null))) {
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
            List<ShippingMarksType> lhsShippingMarks;
            lhsShippingMarks = (((this.shippingMarks!= null)&&(!this.shippingMarks.isEmpty()))?this.getShippingMarks():null);
            List<ShippingMarksType> rhsShippingMarks;
            rhsShippingMarks = (((that.shippingMarks!= null)&&(!that.shippingMarks.isEmpty()))?that.getShippingMarks():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shippingMarks", lhsShippingMarks), LocatorUtils.property(thatLocator, "shippingMarks", rhsShippingMarks), lhsShippingMarks, rhsShippingMarks, ((this.shippingMarks!= null)&&(!this.shippingMarks.isEmpty())), ((that.shippingMarks!= null)&&(!that.shippingMarks.isEmpty())))) {
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
            List<DespatchLineType> lhsHandlingUnitDespatchLine;
            lhsHandlingUnitDespatchLine = (((this.handlingUnitDespatchLine!= null)&&(!this.handlingUnitDespatchLine.isEmpty()))?this.getHandlingUnitDespatchLine():null);
            List<DespatchLineType> rhsHandlingUnitDespatchLine;
            rhsHandlingUnitDespatchLine = (((that.handlingUnitDespatchLine!= null)&&(!that.handlingUnitDespatchLine.isEmpty()))?that.getHandlingUnitDespatchLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handlingUnitDespatchLine", lhsHandlingUnitDespatchLine), LocatorUtils.property(thatLocator, "handlingUnitDespatchLine", rhsHandlingUnitDespatchLine), lhsHandlingUnitDespatchLine, rhsHandlingUnitDespatchLine, ((this.handlingUnitDespatchLine!= null)&&(!this.handlingUnitDespatchLine.isEmpty())), ((that.handlingUnitDespatchLine!= null)&&(!that.handlingUnitDespatchLine.isEmpty())))) {
                return false;
            }
        }
        {
            List<PackageType> lhsActualPackage;
            lhsActualPackage = (((this.actualPackage!= null)&&(!this.actualPackage.isEmpty()))?this.getActualPackage():null);
            List<PackageType> rhsActualPackage;
            rhsActualPackage = (((that.actualPackage!= null)&&(!that.actualPackage.isEmpty()))?that.getActualPackage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualPackage", lhsActualPackage), LocatorUtils.property(thatLocator, "actualPackage", rhsActualPackage), lhsActualPackage, rhsActualPackage, ((this.actualPackage!= null)&&(!this.actualPackage.isEmpty())), ((that.actualPackage!= null)&&(!that.actualPackage.isEmpty())))) {
                return false;
            }
        }
        {
            List<ReceiptLineType> lhsReceivedHandlingUnitReceiptLine;
            lhsReceivedHandlingUnitReceiptLine = (((this.receivedHandlingUnitReceiptLine!= null)&&(!this.receivedHandlingUnitReceiptLine.isEmpty()))?this.getReceivedHandlingUnitReceiptLine():null);
            List<ReceiptLineType> rhsReceivedHandlingUnitReceiptLine;
            rhsReceivedHandlingUnitReceiptLine = (((that.receivedHandlingUnitReceiptLine!= null)&&(!that.receivedHandlingUnitReceiptLine.isEmpty()))?that.getReceivedHandlingUnitReceiptLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivedHandlingUnitReceiptLine", lhsReceivedHandlingUnitReceiptLine), LocatorUtils.property(thatLocator, "receivedHandlingUnitReceiptLine", rhsReceivedHandlingUnitReceiptLine), lhsReceivedHandlingUnitReceiptLine, rhsReceivedHandlingUnitReceiptLine, ((this.receivedHandlingUnitReceiptLine!= null)&&(!this.receivedHandlingUnitReceiptLine.isEmpty())), ((that.receivedHandlingUnitReceiptLine!= null)&&(!that.receivedHandlingUnitReceiptLine.isEmpty())))) {
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
            List<TransportMeansType> lhsTransportMeans;
            lhsTransportMeans = (((this.transportMeans!= null)&&(!this.transportMeans.isEmpty()))?this.getTransportMeans():null);
            List<TransportMeansType> rhsTransportMeans;
            rhsTransportMeans = (((that.transportMeans!= null)&&(!that.transportMeans.isEmpty()))?that.getTransportMeans():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportMeans", lhsTransportMeans), LocatorUtils.property(thatLocator, "transportMeans", rhsTransportMeans), lhsTransportMeans, rhsTransportMeans, ((this.transportMeans!= null)&&(!this.transportMeans.isEmpty())), ((that.transportMeans!= null)&&(!that.transportMeans.isEmpty())))) {
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
            List<DimensionType> lhsMeasurementDimension;
            lhsMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            List<DimensionType> rhsMeasurementDimension;
            rhsMeasurementDimension = (((that.measurementDimension!= null)&&(!that.measurementDimension.isEmpty()))?that.getMeasurementDimension():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurementDimension", lhsMeasurementDimension), LocatorUtils.property(thatLocator, "measurementDimension", rhsMeasurementDimension), lhsMeasurementDimension, rhsMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())), ((that.measurementDimension!= null)&&(!that.measurementDimension.isEmpty())))) {
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
            List<GoodsItemType> lhsGoodsItem;
            lhsGoodsItem = (((this.goodsItem!= null)&&(!this.goodsItem.isEmpty()))?this.getGoodsItem():null);
            List<GoodsItemType> rhsGoodsItem;
            rhsGoodsItem = (((that.goodsItem!= null)&&(!that.goodsItem.isEmpty()))?that.getGoodsItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "goodsItem", lhsGoodsItem), LocatorUtils.property(thatLocator, "goodsItem", rhsGoodsItem), lhsGoodsItem, rhsGoodsItem, ((this.goodsItem!= null)&&(!this.goodsItem.isEmpty())), ((that.goodsItem!= null)&&(!that.goodsItem.isEmpty())))) {
                return false;
            }
        }
        {
            DimensionType lhsFloorSpaceMeasurementDimension;
            lhsFloorSpaceMeasurementDimension = this.getFloorSpaceMeasurementDimension();
            DimensionType rhsFloorSpaceMeasurementDimension;
            rhsFloorSpaceMeasurementDimension = that.getFloorSpaceMeasurementDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floorSpaceMeasurementDimension", lhsFloorSpaceMeasurementDimension), LocatorUtils.property(thatLocator, "floorSpaceMeasurementDimension", rhsFloorSpaceMeasurementDimension), lhsFloorSpaceMeasurementDimension, rhsFloorSpaceMeasurementDimension, (this.floorSpaceMeasurementDimension!= null), (that.floorSpaceMeasurementDimension!= null))) {
                return false;
            }
        }
        {
            DimensionType lhsPalletSpaceMeasurementDimension;
            lhsPalletSpaceMeasurementDimension = this.getPalletSpaceMeasurementDimension();
            DimensionType rhsPalletSpaceMeasurementDimension;
            rhsPalletSpaceMeasurementDimension = that.getPalletSpaceMeasurementDimension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "palletSpaceMeasurementDimension", lhsPalletSpaceMeasurementDimension), LocatorUtils.property(thatLocator, "palletSpaceMeasurementDimension", rhsPalletSpaceMeasurementDimension), lhsPalletSpaceMeasurementDimension, rhsPalletSpaceMeasurementDimension, (this.palletSpaceMeasurementDimension!= null), (that.palletSpaceMeasurementDimension!= null))) {
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
            List<StatusType> lhsStatus;
            lhsStatus = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            List<StatusType> rhsStatus;
            rhsStatus = (((that.status!= null)&&(!that.status.isEmpty()))?that.getStatus():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, ((this.status!= null)&&(!this.status.isEmpty())), ((that.status!= null)&&(!that.status.isEmpty())))) {
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
            List<ShipmentType> lhsReferencedShipment;
            lhsReferencedShipment = (((this.referencedShipment!= null)&&(!this.referencedShipment.isEmpty()))?this.getReferencedShipment():null);
            List<ShipmentType> rhsReferencedShipment;
            rhsReferencedShipment = (((that.referencedShipment!= null)&&(!that.referencedShipment.isEmpty()))?that.getReferencedShipment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referencedShipment", lhsReferencedShipment), LocatorUtils.property(thatLocator, "referencedShipment", rhsReferencedShipment), lhsReferencedShipment, rhsReferencedShipment, ((this.referencedShipment!= null)&&(!this.referencedShipment.isEmpty())), ((that.referencedShipment!= null)&&(!that.referencedShipment.isEmpty())))) {
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
            TransportHandlingUnitTypeCodeType theTransportHandlingUnitTypeCode;
            theTransportHandlingUnitTypeCode = this.getTransportHandlingUnitTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportHandlingUnitTypeCode", theTransportHandlingUnitTypeCode), currentHashCode, theTransportHandlingUnitTypeCode, (this.transportHandlingUnitTypeCode!= null));
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
            HazardousRiskIndicatorType theHazardousRiskIndicator;
            theHazardousRiskIndicator = this.getHazardousRiskIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousRiskIndicator", theHazardousRiskIndicator), currentHashCode, theHazardousRiskIndicator, (this.hazardousRiskIndicator!= null));
        }
        {
            TotalGoodsItemQuantityType theTotalGoodsItemQuantity;
            theTotalGoodsItemQuantity = this.getTotalGoodsItemQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalGoodsItemQuantity", theTotalGoodsItemQuantity), currentHashCode, theTotalGoodsItemQuantity, (this.totalGoodsItemQuantity!= null));
        }
        {
            TotalPackageQuantityType theTotalPackageQuantity;
            theTotalPackageQuantity = this.getTotalPackageQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalPackageQuantity", theTotalPackageQuantity), currentHashCode, theTotalPackageQuantity, (this.totalPackageQuantity!= null));
        }
        {
            List<DamageRemarksType> theDamageRemarks;
            theDamageRemarks = (((this.damageRemarks!= null)&&(!this.damageRemarks.isEmpty()))?this.getDamageRemarks():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "damageRemarks", theDamageRemarks), currentHashCode, theDamageRemarks, ((this.damageRemarks!= null)&&(!this.damageRemarks.isEmpty())));
        }
        {
            List<ShippingMarksType> theShippingMarks;
            theShippingMarks = (((this.shippingMarks!= null)&&(!this.shippingMarks.isEmpty()))?this.getShippingMarks():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shippingMarks", theShippingMarks), currentHashCode, theShippingMarks, ((this.shippingMarks!= null)&&(!this.shippingMarks.isEmpty())));
        }
        {
            TraceIDType theTraceID;
            theTraceID = this.getTraceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "traceID", theTraceID), currentHashCode, theTraceID, (this.traceID!= null));
        }
        {
            List<DespatchLineType> theHandlingUnitDespatchLine;
            theHandlingUnitDespatchLine = (((this.handlingUnitDespatchLine!= null)&&(!this.handlingUnitDespatchLine.isEmpty()))?this.getHandlingUnitDespatchLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handlingUnitDespatchLine", theHandlingUnitDespatchLine), currentHashCode, theHandlingUnitDespatchLine, ((this.handlingUnitDespatchLine!= null)&&(!this.handlingUnitDespatchLine.isEmpty())));
        }
        {
            List<PackageType> theActualPackage;
            theActualPackage = (((this.actualPackage!= null)&&(!this.actualPackage.isEmpty()))?this.getActualPackage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualPackage", theActualPackage), currentHashCode, theActualPackage, ((this.actualPackage!= null)&&(!this.actualPackage.isEmpty())));
        }
        {
            List<ReceiptLineType> theReceivedHandlingUnitReceiptLine;
            theReceivedHandlingUnitReceiptLine = (((this.receivedHandlingUnitReceiptLine!= null)&&(!this.receivedHandlingUnitReceiptLine.isEmpty()))?this.getReceivedHandlingUnitReceiptLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivedHandlingUnitReceiptLine", theReceivedHandlingUnitReceiptLine), currentHashCode, theReceivedHandlingUnitReceiptLine, ((this.receivedHandlingUnitReceiptLine!= null)&&(!this.receivedHandlingUnitReceiptLine.isEmpty())));
        }
        {
            List<TransportEquipmentType> theTransportEquipment;
            theTransportEquipment = (((this.transportEquipment!= null)&&(!this.transportEquipment.isEmpty()))?this.getTransportEquipment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportEquipment", theTransportEquipment), currentHashCode, theTransportEquipment, ((this.transportEquipment!= null)&&(!this.transportEquipment.isEmpty())));
        }
        {
            List<TransportMeansType> theTransportMeans;
            theTransportMeans = (((this.transportMeans!= null)&&(!this.transportMeans.isEmpty()))?this.getTransportMeans():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportMeans", theTransportMeans), currentHashCode, theTransportMeans, ((this.transportMeans!= null)&&(!this.transportMeans.isEmpty())));
        }
        {
            List<HazardousGoodsTransitType> theHazardousGoodsTransit;
            theHazardousGoodsTransit = (((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty()))?this.getHazardousGoodsTransit():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousGoodsTransit", theHazardousGoodsTransit), currentHashCode, theHazardousGoodsTransit, ((this.hazardousGoodsTransit!= null)&&(!this.hazardousGoodsTransit.isEmpty())));
        }
        {
            List<DimensionType> theMeasurementDimension;
            theMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurementDimension", theMeasurementDimension), currentHashCode, theMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())));
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
            List<GoodsItemType> theGoodsItem;
            theGoodsItem = (((this.goodsItem!= null)&&(!this.goodsItem.isEmpty()))?this.getGoodsItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "goodsItem", theGoodsItem), currentHashCode, theGoodsItem, ((this.goodsItem!= null)&&(!this.goodsItem.isEmpty())));
        }
        {
            DimensionType theFloorSpaceMeasurementDimension;
            theFloorSpaceMeasurementDimension = this.getFloorSpaceMeasurementDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "floorSpaceMeasurementDimension", theFloorSpaceMeasurementDimension), currentHashCode, theFloorSpaceMeasurementDimension, (this.floorSpaceMeasurementDimension!= null));
        }
        {
            DimensionType thePalletSpaceMeasurementDimension;
            thePalletSpaceMeasurementDimension = this.getPalletSpaceMeasurementDimension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "palletSpaceMeasurementDimension", thePalletSpaceMeasurementDimension), currentHashCode, thePalletSpaceMeasurementDimension, (this.palletSpaceMeasurementDimension!= null));
        }
        {
            List<DocumentReferenceType> theShipmentDocumentReference;
            theShipmentDocumentReference = (((this.shipmentDocumentReference!= null)&&(!this.shipmentDocumentReference.isEmpty()))?this.getShipmentDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentDocumentReference", theShipmentDocumentReference), currentHashCode, theShipmentDocumentReference, ((this.shipmentDocumentReference!= null)&&(!this.shipmentDocumentReference.isEmpty())));
        }
        {
            List<StatusType> theStatus;
            theStatus = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, ((this.status!= null)&&(!this.status.isEmpty())));
        }
        {
            List<CustomsDeclarationType> theCustomsDeclaration;
            theCustomsDeclaration = (((this.customsDeclaration!= null)&&(!this.customsDeclaration.isEmpty()))?this.getCustomsDeclaration():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customsDeclaration", theCustomsDeclaration), currentHashCode, theCustomsDeclaration, ((this.customsDeclaration!= null)&&(!this.customsDeclaration.isEmpty())));
        }
        {
            List<ShipmentType> theReferencedShipment;
            theReferencedShipment = (((this.referencedShipment!= null)&&(!this.referencedShipment.isEmpty()))?this.getReferencedShipment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referencedShipment", theReferencedShipment), currentHashCode, theReferencedShipment, ((this.referencedShipment!= null)&&(!this.referencedShipment.isEmpty())));
        }
        {
            List<PackageType> thePackage;
            thePackage = (((this._package!= null)&&(!this._package.isEmpty()))?this.getPackage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_package", thePackage), currentHashCode, thePackage, ((this._package!= null)&&(!this._package.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
