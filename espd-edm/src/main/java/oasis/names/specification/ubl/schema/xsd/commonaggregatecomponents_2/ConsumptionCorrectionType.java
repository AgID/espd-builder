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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActualTemperatureReductionQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsumptionEnergyQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsumptionWaterQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CorrectionAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CorrectionTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CorrectionTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CorrectionUnitAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DifferenceTemperatureReductionQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GasPressureQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MeterNumberType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NormalTemperatureReductionQuantityType;
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
 * <p>Classe Java per ConsumptionCorrectionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionCorrectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorrectionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorrectionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GasPressureQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualTemperatureReductionQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NormalTemperatureReductionQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DifferenceTemperatureReductionQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorrectionUnitAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionEnergyQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionWaterQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorrectionAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionCorrectionType", propOrder = {
    "correctionType",
    "correctionTypeCode",
    "meterNumber",
    "gasPressureQuantity",
    "actualTemperatureReductionQuantity",
    "normalTemperatureReductionQuantity",
    "differenceTemperatureReductionQuantity",
    "description",
    "correctionUnitAmount",
    "consumptionEnergyQuantity",
    "consumptionWaterQuantity",
    "correctionAmount"
})
public class ConsumptionCorrectionType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "CorrectionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CorrectionTypeType correctionType;
    @XmlElement(name = "CorrectionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CorrectionTypeCodeType correctionTypeCode;
    @XmlElement(name = "MeterNumber", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeterNumberType meterNumber;
    @XmlElement(name = "GasPressureQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GasPressureQuantityType gasPressureQuantity;
    @XmlElement(name = "ActualTemperatureReductionQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActualTemperatureReductionQuantityType actualTemperatureReductionQuantity;
    @XmlElement(name = "NormalTemperatureReductionQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NormalTemperatureReductionQuantityType normalTemperatureReductionQuantity;
    @XmlElement(name = "DifferenceTemperatureReductionQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DifferenceTemperatureReductionQuantityType differenceTemperatureReductionQuantity;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "CorrectionUnitAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CorrectionUnitAmountType correctionUnitAmount;
    @XmlElement(name = "ConsumptionEnergyQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionEnergyQuantityType consumptionEnergyQuantity;
    @XmlElement(name = "ConsumptionWaterQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionWaterQuantityType consumptionWaterQuantity;
    @XmlElement(name = "CorrectionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CorrectionAmountType correctionAmount;

    /**
     * Recupera il valore della proprietà correctionType.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionTypeType }
     *     
     */
    public CorrectionTypeType getCorrectionType() {
        return correctionType;
    }

    /**
     * Imposta il valore della proprietà correctionType.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionTypeType }
     *     
     */
    public void setCorrectionType(CorrectionTypeType value) {
        this.correctionType = value;
    }

    /**
     * Recupera il valore della proprietà correctionTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionTypeCodeType }
     *     
     */
    public CorrectionTypeCodeType getCorrectionTypeCode() {
        return correctionTypeCode;
    }

    /**
     * Imposta il valore della proprietà correctionTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionTypeCodeType }
     *     
     */
    public void setCorrectionTypeCode(CorrectionTypeCodeType value) {
        this.correctionTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà meterNumber.
     * 
     * @return
     *     possible object is
     *     {@link MeterNumberType }
     *     
     */
    public MeterNumberType getMeterNumber() {
        return meterNumber;
    }

    /**
     * Imposta il valore della proprietà meterNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterNumberType }
     *     
     */
    public void setMeterNumber(MeterNumberType value) {
        this.meterNumber = value;
    }

    /**
     * Recupera il valore della proprietà gasPressureQuantity.
     * 
     * @return
     *     possible object is
     *     {@link GasPressureQuantityType }
     *     
     */
    public GasPressureQuantityType getGasPressureQuantity() {
        return gasPressureQuantity;
    }

    /**
     * Imposta il valore della proprietà gasPressureQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link GasPressureQuantityType }
     *     
     */
    public void setGasPressureQuantity(GasPressureQuantityType value) {
        this.gasPressureQuantity = value;
    }

    /**
     * Recupera il valore della proprietà actualTemperatureReductionQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ActualTemperatureReductionQuantityType }
     *     
     */
    public ActualTemperatureReductionQuantityType getActualTemperatureReductionQuantity() {
        return actualTemperatureReductionQuantity;
    }

    /**
     * Imposta il valore della proprietà actualTemperatureReductionQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualTemperatureReductionQuantityType }
     *     
     */
    public void setActualTemperatureReductionQuantity(ActualTemperatureReductionQuantityType value) {
        this.actualTemperatureReductionQuantity = value;
    }

    /**
     * Recupera il valore della proprietà normalTemperatureReductionQuantity.
     * 
     * @return
     *     possible object is
     *     {@link NormalTemperatureReductionQuantityType }
     *     
     */
    public NormalTemperatureReductionQuantityType getNormalTemperatureReductionQuantity() {
        return normalTemperatureReductionQuantity;
    }

    /**
     * Imposta il valore della proprietà normalTemperatureReductionQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link NormalTemperatureReductionQuantityType }
     *     
     */
    public void setNormalTemperatureReductionQuantity(NormalTemperatureReductionQuantityType value) {
        this.normalTemperatureReductionQuantity = value;
    }

    /**
     * Recupera il valore della proprietà differenceTemperatureReductionQuantity.
     * 
     * @return
     *     possible object is
     *     {@link DifferenceTemperatureReductionQuantityType }
     *     
     */
    public DifferenceTemperatureReductionQuantityType getDifferenceTemperatureReductionQuantity() {
        return differenceTemperatureReductionQuantity;
    }

    /**
     * Imposta il valore della proprietà differenceTemperatureReductionQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link DifferenceTemperatureReductionQuantityType }
     *     
     */
    public void setDifferenceTemperatureReductionQuantity(DifferenceTemperatureReductionQuantityType value) {
        this.differenceTemperatureReductionQuantity = value;
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
     * Recupera il valore della proprietà correctionUnitAmount.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionUnitAmountType }
     *     
     */
    public CorrectionUnitAmountType getCorrectionUnitAmount() {
        return correctionUnitAmount;
    }

    /**
     * Imposta il valore della proprietà correctionUnitAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionUnitAmountType }
     *     
     */
    public void setCorrectionUnitAmount(CorrectionUnitAmountType value) {
        this.correctionUnitAmount = value;
    }

    /**
     * Recupera il valore della proprietà consumptionEnergyQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionEnergyQuantityType }
     *     
     */
    public ConsumptionEnergyQuantityType getConsumptionEnergyQuantity() {
        return consumptionEnergyQuantity;
    }

    /**
     * Imposta il valore della proprietà consumptionEnergyQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionEnergyQuantityType }
     *     
     */
    public void setConsumptionEnergyQuantity(ConsumptionEnergyQuantityType value) {
        this.consumptionEnergyQuantity = value;
    }

    /**
     * Recupera il valore della proprietà consumptionWaterQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionWaterQuantityType }
     *     
     */
    public ConsumptionWaterQuantityType getConsumptionWaterQuantity() {
        return consumptionWaterQuantity;
    }

    /**
     * Imposta il valore della proprietà consumptionWaterQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionWaterQuantityType }
     *     
     */
    public void setConsumptionWaterQuantity(ConsumptionWaterQuantityType value) {
        this.consumptionWaterQuantity = value;
    }

    /**
     * Recupera il valore della proprietà correctionAmount.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionAmountType }
     *     
     */
    public CorrectionAmountType getCorrectionAmount() {
        return correctionAmount;
    }

    /**
     * Imposta il valore della proprietà correctionAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionAmountType }
     *     
     */
    public void setCorrectionAmount(CorrectionAmountType value) {
        this.correctionAmount = value;
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
            CorrectionTypeType theCorrectionType;
            theCorrectionType = this.getCorrectionType();
            strategy.appendField(locator, this, "correctionType", buffer, theCorrectionType, (this.correctionType!= null));
        }
        {
            CorrectionTypeCodeType theCorrectionTypeCode;
            theCorrectionTypeCode = this.getCorrectionTypeCode();
            strategy.appendField(locator, this, "correctionTypeCode", buffer, theCorrectionTypeCode, (this.correctionTypeCode!= null));
        }
        {
            MeterNumberType theMeterNumber;
            theMeterNumber = this.getMeterNumber();
            strategy.appendField(locator, this, "meterNumber", buffer, theMeterNumber, (this.meterNumber!= null));
        }
        {
            GasPressureQuantityType theGasPressureQuantity;
            theGasPressureQuantity = this.getGasPressureQuantity();
            strategy.appendField(locator, this, "gasPressureQuantity", buffer, theGasPressureQuantity, (this.gasPressureQuantity!= null));
        }
        {
            ActualTemperatureReductionQuantityType theActualTemperatureReductionQuantity;
            theActualTemperatureReductionQuantity = this.getActualTemperatureReductionQuantity();
            strategy.appendField(locator, this, "actualTemperatureReductionQuantity", buffer, theActualTemperatureReductionQuantity, (this.actualTemperatureReductionQuantity!= null));
        }
        {
            NormalTemperatureReductionQuantityType theNormalTemperatureReductionQuantity;
            theNormalTemperatureReductionQuantity = this.getNormalTemperatureReductionQuantity();
            strategy.appendField(locator, this, "normalTemperatureReductionQuantity", buffer, theNormalTemperatureReductionQuantity, (this.normalTemperatureReductionQuantity!= null));
        }
        {
            DifferenceTemperatureReductionQuantityType theDifferenceTemperatureReductionQuantity;
            theDifferenceTemperatureReductionQuantity = this.getDifferenceTemperatureReductionQuantity();
            strategy.appendField(locator, this, "differenceTemperatureReductionQuantity", buffer, theDifferenceTemperatureReductionQuantity, (this.differenceTemperatureReductionQuantity!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            CorrectionUnitAmountType theCorrectionUnitAmount;
            theCorrectionUnitAmount = this.getCorrectionUnitAmount();
            strategy.appendField(locator, this, "correctionUnitAmount", buffer, theCorrectionUnitAmount, (this.correctionUnitAmount!= null));
        }
        {
            ConsumptionEnergyQuantityType theConsumptionEnergyQuantity;
            theConsumptionEnergyQuantity = this.getConsumptionEnergyQuantity();
            strategy.appendField(locator, this, "consumptionEnergyQuantity", buffer, theConsumptionEnergyQuantity, (this.consumptionEnergyQuantity!= null));
        }
        {
            ConsumptionWaterQuantityType theConsumptionWaterQuantity;
            theConsumptionWaterQuantity = this.getConsumptionWaterQuantity();
            strategy.appendField(locator, this, "consumptionWaterQuantity", buffer, theConsumptionWaterQuantity, (this.consumptionWaterQuantity!= null));
        }
        {
            CorrectionAmountType theCorrectionAmount;
            theCorrectionAmount = this.getCorrectionAmount();
            strategy.appendField(locator, this, "correctionAmount", buffer, theCorrectionAmount, (this.correctionAmount!= null));
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
        final ConsumptionCorrectionType that = ((ConsumptionCorrectionType) object);
        {
            CorrectionTypeType lhsCorrectionType;
            lhsCorrectionType = this.getCorrectionType();
            CorrectionTypeType rhsCorrectionType;
            rhsCorrectionType = that.getCorrectionType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "correctionType", lhsCorrectionType), LocatorUtils.property(thatLocator, "correctionType", rhsCorrectionType), lhsCorrectionType, rhsCorrectionType, (this.correctionType!= null), (that.correctionType!= null))) {
                return false;
            }
        }
        {
            CorrectionTypeCodeType lhsCorrectionTypeCode;
            lhsCorrectionTypeCode = this.getCorrectionTypeCode();
            CorrectionTypeCodeType rhsCorrectionTypeCode;
            rhsCorrectionTypeCode = that.getCorrectionTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "correctionTypeCode", lhsCorrectionTypeCode), LocatorUtils.property(thatLocator, "correctionTypeCode", rhsCorrectionTypeCode), lhsCorrectionTypeCode, rhsCorrectionTypeCode, (this.correctionTypeCode!= null), (that.correctionTypeCode!= null))) {
                return false;
            }
        }
        {
            MeterNumberType lhsMeterNumber;
            lhsMeterNumber = this.getMeterNumber();
            MeterNumberType rhsMeterNumber;
            rhsMeterNumber = that.getMeterNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meterNumber", lhsMeterNumber), LocatorUtils.property(thatLocator, "meterNumber", rhsMeterNumber), lhsMeterNumber, rhsMeterNumber, (this.meterNumber!= null), (that.meterNumber!= null))) {
                return false;
            }
        }
        {
            GasPressureQuantityType lhsGasPressureQuantity;
            lhsGasPressureQuantity = this.getGasPressureQuantity();
            GasPressureQuantityType rhsGasPressureQuantity;
            rhsGasPressureQuantity = that.getGasPressureQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gasPressureQuantity", lhsGasPressureQuantity), LocatorUtils.property(thatLocator, "gasPressureQuantity", rhsGasPressureQuantity), lhsGasPressureQuantity, rhsGasPressureQuantity, (this.gasPressureQuantity!= null), (that.gasPressureQuantity!= null))) {
                return false;
            }
        }
        {
            ActualTemperatureReductionQuantityType lhsActualTemperatureReductionQuantity;
            lhsActualTemperatureReductionQuantity = this.getActualTemperatureReductionQuantity();
            ActualTemperatureReductionQuantityType rhsActualTemperatureReductionQuantity;
            rhsActualTemperatureReductionQuantity = that.getActualTemperatureReductionQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualTemperatureReductionQuantity", lhsActualTemperatureReductionQuantity), LocatorUtils.property(thatLocator, "actualTemperatureReductionQuantity", rhsActualTemperatureReductionQuantity), lhsActualTemperatureReductionQuantity, rhsActualTemperatureReductionQuantity, (this.actualTemperatureReductionQuantity!= null), (that.actualTemperatureReductionQuantity!= null))) {
                return false;
            }
        }
        {
            NormalTemperatureReductionQuantityType lhsNormalTemperatureReductionQuantity;
            lhsNormalTemperatureReductionQuantity = this.getNormalTemperatureReductionQuantity();
            NormalTemperatureReductionQuantityType rhsNormalTemperatureReductionQuantity;
            rhsNormalTemperatureReductionQuantity = that.getNormalTemperatureReductionQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "normalTemperatureReductionQuantity", lhsNormalTemperatureReductionQuantity), LocatorUtils.property(thatLocator, "normalTemperatureReductionQuantity", rhsNormalTemperatureReductionQuantity), lhsNormalTemperatureReductionQuantity, rhsNormalTemperatureReductionQuantity, (this.normalTemperatureReductionQuantity!= null), (that.normalTemperatureReductionQuantity!= null))) {
                return false;
            }
        }
        {
            DifferenceTemperatureReductionQuantityType lhsDifferenceTemperatureReductionQuantity;
            lhsDifferenceTemperatureReductionQuantity = this.getDifferenceTemperatureReductionQuantity();
            DifferenceTemperatureReductionQuantityType rhsDifferenceTemperatureReductionQuantity;
            rhsDifferenceTemperatureReductionQuantity = that.getDifferenceTemperatureReductionQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "differenceTemperatureReductionQuantity", lhsDifferenceTemperatureReductionQuantity), LocatorUtils.property(thatLocator, "differenceTemperatureReductionQuantity", rhsDifferenceTemperatureReductionQuantity), lhsDifferenceTemperatureReductionQuantity, rhsDifferenceTemperatureReductionQuantity, (this.differenceTemperatureReductionQuantity!= null), (that.differenceTemperatureReductionQuantity!= null))) {
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
            CorrectionUnitAmountType lhsCorrectionUnitAmount;
            lhsCorrectionUnitAmount = this.getCorrectionUnitAmount();
            CorrectionUnitAmountType rhsCorrectionUnitAmount;
            rhsCorrectionUnitAmount = that.getCorrectionUnitAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "correctionUnitAmount", lhsCorrectionUnitAmount), LocatorUtils.property(thatLocator, "correctionUnitAmount", rhsCorrectionUnitAmount), lhsCorrectionUnitAmount, rhsCorrectionUnitAmount, (this.correctionUnitAmount!= null), (that.correctionUnitAmount!= null))) {
                return false;
            }
        }
        {
            ConsumptionEnergyQuantityType lhsConsumptionEnergyQuantity;
            lhsConsumptionEnergyQuantity = this.getConsumptionEnergyQuantity();
            ConsumptionEnergyQuantityType rhsConsumptionEnergyQuantity;
            rhsConsumptionEnergyQuantity = that.getConsumptionEnergyQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionEnergyQuantity", lhsConsumptionEnergyQuantity), LocatorUtils.property(thatLocator, "consumptionEnergyQuantity", rhsConsumptionEnergyQuantity), lhsConsumptionEnergyQuantity, rhsConsumptionEnergyQuantity, (this.consumptionEnergyQuantity!= null), (that.consumptionEnergyQuantity!= null))) {
                return false;
            }
        }
        {
            ConsumptionWaterQuantityType lhsConsumptionWaterQuantity;
            lhsConsumptionWaterQuantity = this.getConsumptionWaterQuantity();
            ConsumptionWaterQuantityType rhsConsumptionWaterQuantity;
            rhsConsumptionWaterQuantity = that.getConsumptionWaterQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionWaterQuantity", lhsConsumptionWaterQuantity), LocatorUtils.property(thatLocator, "consumptionWaterQuantity", rhsConsumptionWaterQuantity), lhsConsumptionWaterQuantity, rhsConsumptionWaterQuantity, (this.consumptionWaterQuantity!= null), (that.consumptionWaterQuantity!= null))) {
                return false;
            }
        }
        {
            CorrectionAmountType lhsCorrectionAmount;
            lhsCorrectionAmount = this.getCorrectionAmount();
            CorrectionAmountType rhsCorrectionAmount;
            rhsCorrectionAmount = that.getCorrectionAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "correctionAmount", lhsCorrectionAmount), LocatorUtils.property(thatLocator, "correctionAmount", rhsCorrectionAmount), lhsCorrectionAmount, rhsCorrectionAmount, (this.correctionAmount!= null), (that.correctionAmount!= null))) {
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
            CorrectionTypeType theCorrectionType;
            theCorrectionType = this.getCorrectionType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "correctionType", theCorrectionType), currentHashCode, theCorrectionType, (this.correctionType!= null));
        }
        {
            CorrectionTypeCodeType theCorrectionTypeCode;
            theCorrectionTypeCode = this.getCorrectionTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "correctionTypeCode", theCorrectionTypeCode), currentHashCode, theCorrectionTypeCode, (this.correctionTypeCode!= null));
        }
        {
            MeterNumberType theMeterNumber;
            theMeterNumber = this.getMeterNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meterNumber", theMeterNumber), currentHashCode, theMeterNumber, (this.meterNumber!= null));
        }
        {
            GasPressureQuantityType theGasPressureQuantity;
            theGasPressureQuantity = this.getGasPressureQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gasPressureQuantity", theGasPressureQuantity), currentHashCode, theGasPressureQuantity, (this.gasPressureQuantity!= null));
        }
        {
            ActualTemperatureReductionQuantityType theActualTemperatureReductionQuantity;
            theActualTemperatureReductionQuantity = this.getActualTemperatureReductionQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualTemperatureReductionQuantity", theActualTemperatureReductionQuantity), currentHashCode, theActualTemperatureReductionQuantity, (this.actualTemperatureReductionQuantity!= null));
        }
        {
            NormalTemperatureReductionQuantityType theNormalTemperatureReductionQuantity;
            theNormalTemperatureReductionQuantity = this.getNormalTemperatureReductionQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "normalTemperatureReductionQuantity", theNormalTemperatureReductionQuantity), currentHashCode, theNormalTemperatureReductionQuantity, (this.normalTemperatureReductionQuantity!= null));
        }
        {
            DifferenceTemperatureReductionQuantityType theDifferenceTemperatureReductionQuantity;
            theDifferenceTemperatureReductionQuantity = this.getDifferenceTemperatureReductionQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "differenceTemperatureReductionQuantity", theDifferenceTemperatureReductionQuantity), currentHashCode, theDifferenceTemperatureReductionQuantity, (this.differenceTemperatureReductionQuantity!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            CorrectionUnitAmountType theCorrectionUnitAmount;
            theCorrectionUnitAmount = this.getCorrectionUnitAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "correctionUnitAmount", theCorrectionUnitAmount), currentHashCode, theCorrectionUnitAmount, (this.correctionUnitAmount!= null));
        }
        {
            ConsumptionEnergyQuantityType theConsumptionEnergyQuantity;
            theConsumptionEnergyQuantity = this.getConsumptionEnergyQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionEnergyQuantity", theConsumptionEnergyQuantity), currentHashCode, theConsumptionEnergyQuantity, (this.consumptionEnergyQuantity!= null));
        }
        {
            ConsumptionWaterQuantityType theConsumptionWaterQuantity;
            theConsumptionWaterQuantity = this.getConsumptionWaterQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionWaterQuantity", theConsumptionWaterQuantity), currentHashCode, theConsumptionWaterQuantity, (this.consumptionWaterQuantity!= null));
        }
        {
            CorrectionAmountType theCorrectionAmount;
            theCorrectionAmount = this.getCorrectionAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "correctionAmount", theCorrectionAmount), currentHashCode, theCorrectionAmount, (this.correctionAmount!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
