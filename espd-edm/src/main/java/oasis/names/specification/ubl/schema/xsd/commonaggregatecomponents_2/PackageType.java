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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PackageLevelCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PackagingTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PackingMaterialType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ReturnableMaterialIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TraceIDType;
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
 * <p>Classe Java per PackageType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReturnableMaterialIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackageLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackagingTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackingMaterial" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TraceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContainedPackage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContainingTransportEquipment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GoodsItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Pickup" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Despatch" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType", propOrder = {
    "id",
    "quantity",
    "returnableMaterialIndicator",
    "packageLevelCode",
    "packagingTypeCode",
    "packingMaterial",
    "traceID",
    "containedPackage",
    "containingTransportEquipment",
    "goodsItem",
    "measurementDimension",
    "deliveryUnit",
    "delivery",
    "pickup",
    "despatch"
})
public class PackageType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QuantityType quantity;
    @XmlElement(name = "ReturnableMaterialIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ReturnableMaterialIndicatorType returnableMaterialIndicator;
    @XmlElement(name = "PackageLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackageLevelCodeType packageLevelCode;
    @XmlElement(name = "PackagingTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackagingTypeCodeType packagingTypeCode;
    @XmlElement(name = "PackingMaterial", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PackingMaterialType> packingMaterial;
    @XmlElement(name = "TraceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TraceIDType traceID;
    @XmlElement(name = "ContainedPackage")
    protected List<PackageType> containedPackage;
    @XmlElement(name = "ContainingTransportEquipment")
    protected TransportEquipmentType containingTransportEquipment;
    @XmlElement(name = "GoodsItem")
    protected List<GoodsItemType> goodsItem;
    @XmlElement(name = "MeasurementDimension")
    protected List<DimensionType> measurementDimension;
    @XmlElement(name = "DeliveryUnit")
    protected List<DeliveryUnitType> deliveryUnit;
    @XmlElement(name = "Delivery")
    protected DeliveryType delivery;
    @XmlElement(name = "Pickup")
    protected PickupType pickup;
    @XmlElement(name = "Despatch")
    protected DespatchType despatch;

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
     * Recupera il valore della proprietà returnableMaterialIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ReturnableMaterialIndicatorType }
     *     
     */
    public ReturnableMaterialIndicatorType getReturnableMaterialIndicator() {
        return returnableMaterialIndicator;
    }

    /**
     * Imposta il valore della proprietà returnableMaterialIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnableMaterialIndicatorType }
     *     
     */
    public void setReturnableMaterialIndicator(ReturnableMaterialIndicatorType value) {
        this.returnableMaterialIndicator = value;
    }

    /**
     * Recupera il valore della proprietà packageLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link PackageLevelCodeType }
     *     
     */
    public PackageLevelCodeType getPackageLevelCode() {
        return packageLevelCode;
    }

    /**
     * Imposta il valore della proprietà packageLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageLevelCodeType }
     *     
     */
    public void setPackageLevelCode(PackageLevelCodeType value) {
        this.packageLevelCode = value;
    }

    /**
     * Recupera il valore della proprietà packagingTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PackagingTypeCodeType }
     *     
     */
    public PackagingTypeCodeType getPackagingTypeCode() {
        return packagingTypeCode;
    }

    /**
     * Imposta il valore della proprietà packagingTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingTypeCodeType }
     *     
     */
    public void setPackagingTypeCode(PackagingTypeCodeType value) {
        this.packagingTypeCode = value;
    }

    /**
     * Gets the value of the packingMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packingMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackingMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackingMaterialType }
     * 
     * 
     */
    public List<PackingMaterialType> getPackingMaterial() {
        if (packingMaterial == null) {
            packingMaterial = new ArrayList<PackingMaterialType>();
        }
        return this.packingMaterial;
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
     * Gets the value of the containedPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containedPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainedPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getContainedPackage() {
        if (containedPackage == null) {
            containedPackage = new ArrayList<PackageType>();
        }
        return this.containedPackage;
    }

    /**
     * Recupera il valore della proprietà containingTransportEquipment.
     * 
     * @return
     *     possible object is
     *     {@link TransportEquipmentType }
     *     
     */
    public TransportEquipmentType getContainingTransportEquipment() {
        return containingTransportEquipment;
    }

    /**
     * Imposta il valore della proprietà containingTransportEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEquipmentType }
     *     
     */
    public void setContainingTransportEquipment(TransportEquipmentType value) {
        this.containingTransportEquipment = value;
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
     * Gets the value of the deliveryUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryUnitType }
     * 
     * 
     */
    public List<DeliveryUnitType> getDeliveryUnit() {
        if (deliveryUnit == null) {
            deliveryUnit = new ArrayList<DeliveryUnitType>();
        }
        return this.deliveryUnit;
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
            ReturnableMaterialIndicatorType theReturnableMaterialIndicator;
            theReturnableMaterialIndicator = this.getReturnableMaterialIndicator();
            strategy.appendField(locator, this, "returnableMaterialIndicator", buffer, theReturnableMaterialIndicator, (this.returnableMaterialIndicator!= null));
        }
        {
            PackageLevelCodeType thePackageLevelCode;
            thePackageLevelCode = this.getPackageLevelCode();
            strategy.appendField(locator, this, "packageLevelCode", buffer, thePackageLevelCode, (this.packageLevelCode!= null));
        }
        {
            PackagingTypeCodeType thePackagingTypeCode;
            thePackagingTypeCode = this.getPackagingTypeCode();
            strategy.appendField(locator, this, "packagingTypeCode", buffer, thePackagingTypeCode, (this.packagingTypeCode!= null));
        }
        {
            List<PackingMaterialType> thePackingMaterial;
            thePackingMaterial = (((this.packingMaterial!= null)&&(!this.packingMaterial.isEmpty()))?this.getPackingMaterial():null);
            strategy.appendField(locator, this, "packingMaterial", buffer, thePackingMaterial, ((this.packingMaterial!= null)&&(!this.packingMaterial.isEmpty())));
        }
        {
            TraceIDType theTraceID;
            theTraceID = this.getTraceID();
            strategy.appendField(locator, this, "traceID", buffer, theTraceID, (this.traceID!= null));
        }
        {
            List<PackageType> theContainedPackage;
            theContainedPackage = (((this.containedPackage!= null)&&(!this.containedPackage.isEmpty()))?this.getContainedPackage():null);
            strategy.appendField(locator, this, "containedPackage", buffer, theContainedPackage, ((this.containedPackage!= null)&&(!this.containedPackage.isEmpty())));
        }
        {
            TransportEquipmentType theContainingTransportEquipment;
            theContainingTransportEquipment = this.getContainingTransportEquipment();
            strategy.appendField(locator, this, "containingTransportEquipment", buffer, theContainingTransportEquipment, (this.containingTransportEquipment!= null));
        }
        {
            List<GoodsItemType> theGoodsItem;
            theGoodsItem = (((this.goodsItem!= null)&&(!this.goodsItem.isEmpty()))?this.getGoodsItem():null);
            strategy.appendField(locator, this, "goodsItem", buffer, theGoodsItem, ((this.goodsItem!= null)&&(!this.goodsItem.isEmpty())));
        }
        {
            List<DimensionType> theMeasurementDimension;
            theMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            strategy.appendField(locator, this, "measurementDimension", buffer, theMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())));
        }
        {
            List<DeliveryUnitType> theDeliveryUnit;
            theDeliveryUnit = (((this.deliveryUnit!= null)&&(!this.deliveryUnit.isEmpty()))?this.getDeliveryUnit():null);
            strategy.appendField(locator, this, "deliveryUnit", buffer, theDeliveryUnit, ((this.deliveryUnit!= null)&&(!this.deliveryUnit.isEmpty())));
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
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PackageType that = ((PackageType) object);
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
            ReturnableMaterialIndicatorType lhsReturnableMaterialIndicator;
            lhsReturnableMaterialIndicator = this.getReturnableMaterialIndicator();
            ReturnableMaterialIndicatorType rhsReturnableMaterialIndicator;
            rhsReturnableMaterialIndicator = that.getReturnableMaterialIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "returnableMaterialIndicator", lhsReturnableMaterialIndicator), LocatorUtils.property(thatLocator, "returnableMaterialIndicator", rhsReturnableMaterialIndicator), lhsReturnableMaterialIndicator, rhsReturnableMaterialIndicator, (this.returnableMaterialIndicator!= null), (that.returnableMaterialIndicator!= null))) {
                return false;
            }
        }
        {
            PackageLevelCodeType lhsPackageLevelCode;
            lhsPackageLevelCode = this.getPackageLevelCode();
            PackageLevelCodeType rhsPackageLevelCode;
            rhsPackageLevelCode = that.getPackageLevelCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageLevelCode", lhsPackageLevelCode), LocatorUtils.property(thatLocator, "packageLevelCode", rhsPackageLevelCode), lhsPackageLevelCode, rhsPackageLevelCode, (this.packageLevelCode!= null), (that.packageLevelCode!= null))) {
                return false;
            }
        }
        {
            PackagingTypeCodeType lhsPackagingTypeCode;
            lhsPackagingTypeCode = this.getPackagingTypeCode();
            PackagingTypeCodeType rhsPackagingTypeCode;
            rhsPackagingTypeCode = that.getPackagingTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packagingTypeCode", lhsPackagingTypeCode), LocatorUtils.property(thatLocator, "packagingTypeCode", rhsPackagingTypeCode), lhsPackagingTypeCode, rhsPackagingTypeCode, (this.packagingTypeCode!= null), (that.packagingTypeCode!= null))) {
                return false;
            }
        }
        {
            List<PackingMaterialType> lhsPackingMaterial;
            lhsPackingMaterial = (((this.packingMaterial!= null)&&(!this.packingMaterial.isEmpty()))?this.getPackingMaterial():null);
            List<PackingMaterialType> rhsPackingMaterial;
            rhsPackingMaterial = (((that.packingMaterial!= null)&&(!that.packingMaterial.isEmpty()))?that.getPackingMaterial():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packingMaterial", lhsPackingMaterial), LocatorUtils.property(thatLocator, "packingMaterial", rhsPackingMaterial), lhsPackingMaterial, rhsPackingMaterial, ((this.packingMaterial!= null)&&(!this.packingMaterial.isEmpty())), ((that.packingMaterial!= null)&&(!that.packingMaterial.isEmpty())))) {
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
            List<PackageType> lhsContainedPackage;
            lhsContainedPackage = (((this.containedPackage!= null)&&(!this.containedPackage.isEmpty()))?this.getContainedPackage():null);
            List<PackageType> rhsContainedPackage;
            rhsContainedPackage = (((that.containedPackage!= null)&&(!that.containedPackage.isEmpty()))?that.getContainedPackage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "containedPackage", lhsContainedPackage), LocatorUtils.property(thatLocator, "containedPackage", rhsContainedPackage), lhsContainedPackage, rhsContainedPackage, ((this.containedPackage!= null)&&(!this.containedPackage.isEmpty())), ((that.containedPackage!= null)&&(!that.containedPackage.isEmpty())))) {
                return false;
            }
        }
        {
            TransportEquipmentType lhsContainingTransportEquipment;
            lhsContainingTransportEquipment = this.getContainingTransportEquipment();
            TransportEquipmentType rhsContainingTransportEquipment;
            rhsContainingTransportEquipment = that.getContainingTransportEquipment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "containingTransportEquipment", lhsContainingTransportEquipment), LocatorUtils.property(thatLocator, "containingTransportEquipment", rhsContainingTransportEquipment), lhsContainingTransportEquipment, rhsContainingTransportEquipment, (this.containingTransportEquipment!= null), (that.containingTransportEquipment!= null))) {
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
            List<DimensionType> lhsMeasurementDimension;
            lhsMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            List<DimensionType> rhsMeasurementDimension;
            rhsMeasurementDimension = (((that.measurementDimension!= null)&&(!that.measurementDimension.isEmpty()))?that.getMeasurementDimension():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurementDimension", lhsMeasurementDimension), LocatorUtils.property(thatLocator, "measurementDimension", rhsMeasurementDimension), lhsMeasurementDimension, rhsMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())), ((that.measurementDimension!= null)&&(!that.measurementDimension.isEmpty())))) {
                return false;
            }
        }
        {
            List<DeliveryUnitType> lhsDeliveryUnit;
            lhsDeliveryUnit = (((this.deliveryUnit!= null)&&(!this.deliveryUnit.isEmpty()))?this.getDeliveryUnit():null);
            List<DeliveryUnitType> rhsDeliveryUnit;
            rhsDeliveryUnit = (((that.deliveryUnit!= null)&&(!that.deliveryUnit.isEmpty()))?that.getDeliveryUnit():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryUnit", lhsDeliveryUnit), LocatorUtils.property(thatLocator, "deliveryUnit", rhsDeliveryUnit), lhsDeliveryUnit, rhsDeliveryUnit, ((this.deliveryUnit!= null)&&(!this.deliveryUnit.isEmpty())), ((that.deliveryUnit!= null)&&(!that.deliveryUnit.isEmpty())))) {
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
            ReturnableMaterialIndicatorType theReturnableMaterialIndicator;
            theReturnableMaterialIndicator = this.getReturnableMaterialIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "returnableMaterialIndicator", theReturnableMaterialIndicator), currentHashCode, theReturnableMaterialIndicator, (this.returnableMaterialIndicator!= null));
        }
        {
            PackageLevelCodeType thePackageLevelCode;
            thePackageLevelCode = this.getPackageLevelCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageLevelCode", thePackageLevelCode), currentHashCode, thePackageLevelCode, (this.packageLevelCode!= null));
        }
        {
            PackagingTypeCodeType thePackagingTypeCode;
            thePackagingTypeCode = this.getPackagingTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packagingTypeCode", thePackagingTypeCode), currentHashCode, thePackagingTypeCode, (this.packagingTypeCode!= null));
        }
        {
            List<PackingMaterialType> thePackingMaterial;
            thePackingMaterial = (((this.packingMaterial!= null)&&(!this.packingMaterial.isEmpty()))?this.getPackingMaterial():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packingMaterial", thePackingMaterial), currentHashCode, thePackingMaterial, ((this.packingMaterial!= null)&&(!this.packingMaterial.isEmpty())));
        }
        {
            TraceIDType theTraceID;
            theTraceID = this.getTraceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "traceID", theTraceID), currentHashCode, theTraceID, (this.traceID!= null));
        }
        {
            List<PackageType> theContainedPackage;
            theContainedPackage = (((this.containedPackage!= null)&&(!this.containedPackage.isEmpty()))?this.getContainedPackage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containedPackage", theContainedPackage), currentHashCode, theContainedPackage, ((this.containedPackage!= null)&&(!this.containedPackage.isEmpty())));
        }
        {
            TransportEquipmentType theContainingTransportEquipment;
            theContainingTransportEquipment = this.getContainingTransportEquipment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "containingTransportEquipment", theContainingTransportEquipment), currentHashCode, theContainingTransportEquipment, (this.containingTransportEquipment!= null));
        }
        {
            List<GoodsItemType> theGoodsItem;
            theGoodsItem = (((this.goodsItem!= null)&&(!this.goodsItem.isEmpty()))?this.getGoodsItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "goodsItem", theGoodsItem), currentHashCode, theGoodsItem, ((this.goodsItem!= null)&&(!this.goodsItem.isEmpty())));
        }
        {
            List<DimensionType> theMeasurementDimension;
            theMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurementDimension", theMeasurementDimension), currentHashCode, theMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())));
        }
        {
            List<DeliveryUnitType> theDeliveryUnit;
            theDeliveryUnit = (((this.deliveryUnit!= null)&&(!this.deliveryUnit.isEmpty()))?this.getDeliveryUnit():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryUnit", theDeliveryUnit), currentHashCode, theDeliveryUnit, ((this.deliveryUnit!= null)&&(!this.deliveryUnit.isEmpty())));
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
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
