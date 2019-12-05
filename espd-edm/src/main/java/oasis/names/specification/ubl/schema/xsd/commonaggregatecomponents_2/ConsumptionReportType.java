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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BasicConsumedQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsumersEnergyLevelCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsumersEnergyLevelType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsumptionTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsumptionTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HeatingTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HeatingTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResidenceTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResidenceTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResidentOccupantsNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalConsumedQuantityType;
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
 * <p>Classe Java per ConsumptionReportType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalConsumedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BasicConsumedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResidentOccupantsNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumersEnergyLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumersEnergyLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResidenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResidenceTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HeatingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HeatingTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GuidanceDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsumptionReportReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsumptionHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionReportType", propOrder = {
    "id",
    "consumptionType",
    "consumptionTypeCode",
    "description",
    "totalConsumedQuantity",
    "basicConsumedQuantity",
    "residentOccupantsNumeric",
    "consumersEnergyLevelCode",
    "consumersEnergyLevel",
    "residenceType",
    "residenceTypeCode",
    "heatingType",
    "heatingTypeCode",
    "period",
    "guidanceDocumentReference",
    "documentReference",
    "consumptionReportReference",
    "consumptionHistory"
})
public class ConsumptionReportType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "ConsumptionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionTypeType consumptionType;
    @XmlElement(name = "ConsumptionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionTypeCodeType consumptionTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "TotalConsumedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalConsumedQuantityType totalConsumedQuantity;
    @XmlElement(name = "BasicConsumedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BasicConsumedQuantityType basicConsumedQuantity;
    @XmlElement(name = "ResidentOccupantsNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResidentOccupantsNumericType residentOccupantsNumeric;
    @XmlElement(name = "ConsumersEnergyLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumersEnergyLevelCodeType consumersEnergyLevelCode;
    @XmlElement(name = "ConsumersEnergyLevel", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumersEnergyLevelType consumersEnergyLevel;
    @XmlElement(name = "ResidenceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResidenceTypeType residenceType;
    @XmlElement(name = "ResidenceTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResidenceTypeCodeType residenceTypeCode;
    @XmlElement(name = "HeatingType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HeatingTypeType heatingType;
    @XmlElement(name = "HeatingTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HeatingTypeCodeType heatingTypeCode;
    @XmlElement(name = "Period")
    protected PeriodType period;
    @XmlElement(name = "GuidanceDocumentReference")
    protected DocumentReferenceType guidanceDocumentReference;
    @XmlElement(name = "DocumentReference")
    protected DocumentReferenceType documentReference;
    @XmlElement(name = "ConsumptionReportReference")
    protected List<ConsumptionReportReferenceType> consumptionReportReference;
    @XmlElement(name = "ConsumptionHistory")
    protected List<ConsumptionHistoryType> consumptionHistory;

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
     * Recupera il valore della proprietà consumptionType.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionTypeType }
     *     
     */
    public ConsumptionTypeType getConsumptionType() {
        return consumptionType;
    }

    /**
     * Imposta il valore della proprietà consumptionType.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionTypeType }
     *     
     */
    public void setConsumptionType(ConsumptionTypeType value) {
        this.consumptionType = value;
    }

    /**
     * Recupera il valore della proprietà consumptionTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionTypeCodeType }
     *     
     */
    public ConsumptionTypeCodeType getConsumptionTypeCode() {
        return consumptionTypeCode;
    }

    /**
     * Imposta il valore della proprietà consumptionTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionTypeCodeType }
     *     
     */
    public void setConsumptionTypeCode(ConsumptionTypeCodeType value) {
        this.consumptionTypeCode = value;
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
     * Recupera il valore della proprietà totalConsumedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalConsumedQuantityType }
     *     
     */
    public TotalConsumedQuantityType getTotalConsumedQuantity() {
        return totalConsumedQuantity;
    }

    /**
     * Imposta il valore della proprietà totalConsumedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalConsumedQuantityType }
     *     
     */
    public void setTotalConsumedQuantity(TotalConsumedQuantityType value) {
        this.totalConsumedQuantity = value;
    }

    /**
     * Recupera il valore della proprietà basicConsumedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BasicConsumedQuantityType }
     *     
     */
    public BasicConsumedQuantityType getBasicConsumedQuantity() {
        return basicConsumedQuantity;
    }

    /**
     * Imposta il valore della proprietà basicConsumedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicConsumedQuantityType }
     *     
     */
    public void setBasicConsumedQuantity(BasicConsumedQuantityType value) {
        this.basicConsumedQuantity = value;
    }

    /**
     * Recupera il valore della proprietà residentOccupantsNumeric.
     * 
     * @return
     *     possible object is
     *     {@link ResidentOccupantsNumericType }
     *     
     */
    public ResidentOccupantsNumericType getResidentOccupantsNumeric() {
        return residentOccupantsNumeric;
    }

    /**
     * Imposta il valore della proprietà residentOccupantsNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidentOccupantsNumericType }
     *     
     */
    public void setResidentOccupantsNumeric(ResidentOccupantsNumericType value) {
        this.residentOccupantsNumeric = value;
    }

    /**
     * Recupera il valore della proprietà consumersEnergyLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link ConsumersEnergyLevelCodeType }
     *     
     */
    public ConsumersEnergyLevelCodeType getConsumersEnergyLevelCode() {
        return consumersEnergyLevelCode;
    }

    /**
     * Imposta il valore della proprietà consumersEnergyLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumersEnergyLevelCodeType }
     *     
     */
    public void setConsumersEnergyLevelCode(ConsumersEnergyLevelCodeType value) {
        this.consumersEnergyLevelCode = value;
    }

    /**
     * Recupera il valore della proprietà consumersEnergyLevel.
     * 
     * @return
     *     possible object is
     *     {@link ConsumersEnergyLevelType }
     *     
     */
    public ConsumersEnergyLevelType getConsumersEnergyLevel() {
        return consumersEnergyLevel;
    }

    /**
     * Imposta il valore della proprietà consumersEnergyLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumersEnergyLevelType }
     *     
     */
    public void setConsumersEnergyLevel(ConsumersEnergyLevelType value) {
        this.consumersEnergyLevel = value;
    }

    /**
     * Recupera il valore della proprietà residenceType.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceTypeType }
     *     
     */
    public ResidenceTypeType getResidenceType() {
        return residenceType;
    }

    /**
     * Imposta il valore della proprietà residenceType.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceTypeType }
     *     
     */
    public void setResidenceType(ResidenceTypeType value) {
        this.residenceType = value;
    }

    /**
     * Recupera il valore della proprietà residenceTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceTypeCodeType }
     *     
     */
    public ResidenceTypeCodeType getResidenceTypeCode() {
        return residenceTypeCode;
    }

    /**
     * Imposta il valore della proprietà residenceTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceTypeCodeType }
     *     
     */
    public void setResidenceTypeCode(ResidenceTypeCodeType value) {
        this.residenceTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà heatingType.
     * 
     * @return
     *     possible object is
     *     {@link HeatingTypeType }
     *     
     */
    public HeatingTypeType getHeatingType() {
        return heatingType;
    }

    /**
     * Imposta il valore della proprietà heatingType.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingTypeType }
     *     
     */
    public void setHeatingType(HeatingTypeType value) {
        this.heatingType = value;
    }

    /**
     * Recupera il valore della proprietà heatingTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link HeatingTypeCodeType }
     *     
     */
    public HeatingTypeCodeType getHeatingTypeCode() {
        return heatingTypeCode;
    }

    /**
     * Imposta il valore della proprietà heatingTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingTypeCodeType }
     *     
     */
    public void setHeatingTypeCode(HeatingTypeCodeType value) {
        this.heatingTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà period.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPeriod() {
        return period;
    }

    /**
     * Imposta il valore della proprietà period.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPeriod(PeriodType value) {
        this.period = value;
    }

    /**
     * Recupera il valore della proprietà guidanceDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getGuidanceDocumentReference() {
        return guidanceDocumentReference;
    }

    /**
     * Imposta il valore della proprietà guidanceDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setGuidanceDocumentReference(DocumentReferenceType value) {
        this.guidanceDocumentReference = value;
    }

    /**
     * Recupera il valore della proprietà documentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getDocumentReference() {
        return documentReference;
    }

    /**
     * Imposta il valore della proprietà documentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setDocumentReference(DocumentReferenceType value) {
        this.documentReference = value;
    }

    /**
     * Gets the value of the consumptionReportReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionReportReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionReportReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionReportReferenceType }
     * 
     * 
     */
    public List<ConsumptionReportReferenceType> getConsumptionReportReference() {
        if (consumptionReportReference == null) {
            consumptionReportReference = new ArrayList<ConsumptionReportReferenceType>();
        }
        return this.consumptionReportReference;
    }

    /**
     * Gets the value of the consumptionHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionHistoryType }
     * 
     * 
     */
    public List<ConsumptionHistoryType> getConsumptionHistory() {
        if (consumptionHistory == null) {
            consumptionHistory = new ArrayList<ConsumptionHistoryType>();
        }
        return this.consumptionHistory;
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
            ConsumptionTypeType theConsumptionType;
            theConsumptionType = this.getConsumptionType();
            strategy.appendField(locator, this, "consumptionType", buffer, theConsumptionType, (this.consumptionType!= null));
        }
        {
            ConsumptionTypeCodeType theConsumptionTypeCode;
            theConsumptionTypeCode = this.getConsumptionTypeCode();
            strategy.appendField(locator, this, "consumptionTypeCode", buffer, theConsumptionTypeCode, (this.consumptionTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            TotalConsumedQuantityType theTotalConsumedQuantity;
            theTotalConsumedQuantity = this.getTotalConsumedQuantity();
            strategy.appendField(locator, this, "totalConsumedQuantity", buffer, theTotalConsumedQuantity, (this.totalConsumedQuantity!= null));
        }
        {
            BasicConsumedQuantityType theBasicConsumedQuantity;
            theBasicConsumedQuantity = this.getBasicConsumedQuantity();
            strategy.appendField(locator, this, "basicConsumedQuantity", buffer, theBasicConsumedQuantity, (this.basicConsumedQuantity!= null));
        }
        {
            ResidentOccupantsNumericType theResidentOccupantsNumeric;
            theResidentOccupantsNumeric = this.getResidentOccupantsNumeric();
            strategy.appendField(locator, this, "residentOccupantsNumeric", buffer, theResidentOccupantsNumeric, (this.residentOccupantsNumeric!= null));
        }
        {
            ConsumersEnergyLevelCodeType theConsumersEnergyLevelCode;
            theConsumersEnergyLevelCode = this.getConsumersEnergyLevelCode();
            strategy.appendField(locator, this, "consumersEnergyLevelCode", buffer, theConsumersEnergyLevelCode, (this.consumersEnergyLevelCode!= null));
        }
        {
            ConsumersEnergyLevelType theConsumersEnergyLevel;
            theConsumersEnergyLevel = this.getConsumersEnergyLevel();
            strategy.appendField(locator, this, "consumersEnergyLevel", buffer, theConsumersEnergyLevel, (this.consumersEnergyLevel!= null));
        }
        {
            ResidenceTypeType theResidenceType;
            theResidenceType = this.getResidenceType();
            strategy.appendField(locator, this, "residenceType", buffer, theResidenceType, (this.residenceType!= null));
        }
        {
            ResidenceTypeCodeType theResidenceTypeCode;
            theResidenceTypeCode = this.getResidenceTypeCode();
            strategy.appendField(locator, this, "residenceTypeCode", buffer, theResidenceTypeCode, (this.residenceTypeCode!= null));
        }
        {
            HeatingTypeType theHeatingType;
            theHeatingType = this.getHeatingType();
            strategy.appendField(locator, this, "heatingType", buffer, theHeatingType, (this.heatingType!= null));
        }
        {
            HeatingTypeCodeType theHeatingTypeCode;
            theHeatingTypeCode = this.getHeatingTypeCode();
            strategy.appendField(locator, this, "heatingTypeCode", buffer, theHeatingTypeCode, (this.heatingTypeCode!= null));
        }
        {
            PeriodType thePeriod;
            thePeriod = this.getPeriod();
            strategy.appendField(locator, this, "period", buffer, thePeriod, (this.period!= null));
        }
        {
            DocumentReferenceType theGuidanceDocumentReference;
            theGuidanceDocumentReference = this.getGuidanceDocumentReference();
            strategy.appendField(locator, this, "guidanceDocumentReference", buffer, theGuidanceDocumentReference, (this.guidanceDocumentReference!= null));
        }
        {
            DocumentReferenceType theDocumentReference;
            theDocumentReference = this.getDocumentReference();
            strategy.appendField(locator, this, "documentReference", buffer, theDocumentReference, (this.documentReference!= null));
        }
        {
            List<ConsumptionReportReferenceType> theConsumptionReportReference;
            theConsumptionReportReference = (((this.consumptionReportReference!= null)&&(!this.consumptionReportReference.isEmpty()))?this.getConsumptionReportReference():null);
            strategy.appendField(locator, this, "consumptionReportReference", buffer, theConsumptionReportReference, ((this.consumptionReportReference!= null)&&(!this.consumptionReportReference.isEmpty())));
        }
        {
            List<ConsumptionHistoryType> theConsumptionHistory;
            theConsumptionHistory = (((this.consumptionHistory!= null)&&(!this.consumptionHistory.isEmpty()))?this.getConsumptionHistory():null);
            strategy.appendField(locator, this, "consumptionHistory", buffer, theConsumptionHistory, ((this.consumptionHistory!= null)&&(!this.consumptionHistory.isEmpty())));
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
        final ConsumptionReportType that = ((ConsumptionReportType) object);
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
            ConsumptionTypeType lhsConsumptionType;
            lhsConsumptionType = this.getConsumptionType();
            ConsumptionTypeType rhsConsumptionType;
            rhsConsumptionType = that.getConsumptionType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionType", lhsConsumptionType), LocatorUtils.property(thatLocator, "consumptionType", rhsConsumptionType), lhsConsumptionType, rhsConsumptionType, (this.consumptionType!= null), (that.consumptionType!= null))) {
                return false;
            }
        }
        {
            ConsumptionTypeCodeType lhsConsumptionTypeCode;
            lhsConsumptionTypeCode = this.getConsumptionTypeCode();
            ConsumptionTypeCodeType rhsConsumptionTypeCode;
            rhsConsumptionTypeCode = that.getConsumptionTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionTypeCode", lhsConsumptionTypeCode), LocatorUtils.property(thatLocator, "consumptionTypeCode", rhsConsumptionTypeCode), lhsConsumptionTypeCode, rhsConsumptionTypeCode, (this.consumptionTypeCode!= null), (that.consumptionTypeCode!= null))) {
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
            TotalConsumedQuantityType lhsTotalConsumedQuantity;
            lhsTotalConsumedQuantity = this.getTotalConsumedQuantity();
            TotalConsumedQuantityType rhsTotalConsumedQuantity;
            rhsTotalConsumedQuantity = that.getTotalConsumedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalConsumedQuantity", lhsTotalConsumedQuantity), LocatorUtils.property(thatLocator, "totalConsumedQuantity", rhsTotalConsumedQuantity), lhsTotalConsumedQuantity, rhsTotalConsumedQuantity, (this.totalConsumedQuantity!= null), (that.totalConsumedQuantity!= null))) {
                return false;
            }
        }
        {
            BasicConsumedQuantityType lhsBasicConsumedQuantity;
            lhsBasicConsumedQuantity = this.getBasicConsumedQuantity();
            BasicConsumedQuantityType rhsBasicConsumedQuantity;
            rhsBasicConsumedQuantity = that.getBasicConsumedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "basicConsumedQuantity", lhsBasicConsumedQuantity), LocatorUtils.property(thatLocator, "basicConsumedQuantity", rhsBasicConsumedQuantity), lhsBasicConsumedQuantity, rhsBasicConsumedQuantity, (this.basicConsumedQuantity!= null), (that.basicConsumedQuantity!= null))) {
                return false;
            }
        }
        {
            ResidentOccupantsNumericType lhsResidentOccupantsNumeric;
            lhsResidentOccupantsNumeric = this.getResidentOccupantsNumeric();
            ResidentOccupantsNumericType rhsResidentOccupantsNumeric;
            rhsResidentOccupantsNumeric = that.getResidentOccupantsNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "residentOccupantsNumeric", lhsResidentOccupantsNumeric), LocatorUtils.property(thatLocator, "residentOccupantsNumeric", rhsResidentOccupantsNumeric), lhsResidentOccupantsNumeric, rhsResidentOccupantsNumeric, (this.residentOccupantsNumeric!= null), (that.residentOccupantsNumeric!= null))) {
                return false;
            }
        }
        {
            ConsumersEnergyLevelCodeType lhsConsumersEnergyLevelCode;
            lhsConsumersEnergyLevelCode = this.getConsumersEnergyLevelCode();
            ConsumersEnergyLevelCodeType rhsConsumersEnergyLevelCode;
            rhsConsumersEnergyLevelCode = that.getConsumersEnergyLevelCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumersEnergyLevelCode", lhsConsumersEnergyLevelCode), LocatorUtils.property(thatLocator, "consumersEnergyLevelCode", rhsConsumersEnergyLevelCode), lhsConsumersEnergyLevelCode, rhsConsumersEnergyLevelCode, (this.consumersEnergyLevelCode!= null), (that.consumersEnergyLevelCode!= null))) {
                return false;
            }
        }
        {
            ConsumersEnergyLevelType lhsConsumersEnergyLevel;
            lhsConsumersEnergyLevel = this.getConsumersEnergyLevel();
            ConsumersEnergyLevelType rhsConsumersEnergyLevel;
            rhsConsumersEnergyLevel = that.getConsumersEnergyLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumersEnergyLevel", lhsConsumersEnergyLevel), LocatorUtils.property(thatLocator, "consumersEnergyLevel", rhsConsumersEnergyLevel), lhsConsumersEnergyLevel, rhsConsumersEnergyLevel, (this.consumersEnergyLevel!= null), (that.consumersEnergyLevel!= null))) {
                return false;
            }
        }
        {
            ResidenceTypeType lhsResidenceType;
            lhsResidenceType = this.getResidenceType();
            ResidenceTypeType rhsResidenceType;
            rhsResidenceType = that.getResidenceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "residenceType", lhsResidenceType), LocatorUtils.property(thatLocator, "residenceType", rhsResidenceType), lhsResidenceType, rhsResidenceType, (this.residenceType!= null), (that.residenceType!= null))) {
                return false;
            }
        }
        {
            ResidenceTypeCodeType lhsResidenceTypeCode;
            lhsResidenceTypeCode = this.getResidenceTypeCode();
            ResidenceTypeCodeType rhsResidenceTypeCode;
            rhsResidenceTypeCode = that.getResidenceTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "residenceTypeCode", lhsResidenceTypeCode), LocatorUtils.property(thatLocator, "residenceTypeCode", rhsResidenceTypeCode), lhsResidenceTypeCode, rhsResidenceTypeCode, (this.residenceTypeCode!= null), (that.residenceTypeCode!= null))) {
                return false;
            }
        }
        {
            HeatingTypeType lhsHeatingType;
            lhsHeatingType = this.getHeatingType();
            HeatingTypeType rhsHeatingType;
            rhsHeatingType = that.getHeatingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingType", lhsHeatingType), LocatorUtils.property(thatLocator, "heatingType", rhsHeatingType), lhsHeatingType, rhsHeatingType, (this.heatingType!= null), (that.heatingType!= null))) {
                return false;
            }
        }
        {
            HeatingTypeCodeType lhsHeatingTypeCode;
            lhsHeatingTypeCode = this.getHeatingTypeCode();
            HeatingTypeCodeType rhsHeatingTypeCode;
            rhsHeatingTypeCode = that.getHeatingTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingTypeCode", lhsHeatingTypeCode), LocatorUtils.property(thatLocator, "heatingTypeCode", rhsHeatingTypeCode), lhsHeatingTypeCode, rhsHeatingTypeCode, (this.heatingTypeCode!= null), (that.heatingTypeCode!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsPeriod;
            lhsPeriod = this.getPeriod();
            PeriodType rhsPeriod;
            rhsPeriod = that.getPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "period", lhsPeriod), LocatorUtils.property(thatLocator, "period", rhsPeriod), lhsPeriod, rhsPeriod, (this.period!= null), (that.period!= null))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsGuidanceDocumentReference;
            lhsGuidanceDocumentReference = this.getGuidanceDocumentReference();
            DocumentReferenceType rhsGuidanceDocumentReference;
            rhsGuidanceDocumentReference = that.getGuidanceDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "guidanceDocumentReference", lhsGuidanceDocumentReference), LocatorUtils.property(thatLocator, "guidanceDocumentReference", rhsGuidanceDocumentReference), lhsGuidanceDocumentReference, rhsGuidanceDocumentReference, (this.guidanceDocumentReference!= null), (that.guidanceDocumentReference!= null))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsDocumentReference;
            lhsDocumentReference = this.getDocumentReference();
            DocumentReferenceType rhsDocumentReference;
            rhsDocumentReference = that.getDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentReference", lhsDocumentReference), LocatorUtils.property(thatLocator, "documentReference", rhsDocumentReference), lhsDocumentReference, rhsDocumentReference, (this.documentReference!= null), (that.documentReference!= null))) {
                return false;
            }
        }
        {
            List<ConsumptionReportReferenceType> lhsConsumptionReportReference;
            lhsConsumptionReportReference = (((this.consumptionReportReference!= null)&&(!this.consumptionReportReference.isEmpty()))?this.getConsumptionReportReference():null);
            List<ConsumptionReportReferenceType> rhsConsumptionReportReference;
            rhsConsumptionReportReference = (((that.consumptionReportReference!= null)&&(!that.consumptionReportReference.isEmpty()))?that.getConsumptionReportReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionReportReference", lhsConsumptionReportReference), LocatorUtils.property(thatLocator, "consumptionReportReference", rhsConsumptionReportReference), lhsConsumptionReportReference, rhsConsumptionReportReference, ((this.consumptionReportReference!= null)&&(!this.consumptionReportReference.isEmpty())), ((that.consumptionReportReference!= null)&&(!that.consumptionReportReference.isEmpty())))) {
                return false;
            }
        }
        {
            List<ConsumptionHistoryType> lhsConsumptionHistory;
            lhsConsumptionHistory = (((this.consumptionHistory!= null)&&(!this.consumptionHistory.isEmpty()))?this.getConsumptionHistory():null);
            List<ConsumptionHistoryType> rhsConsumptionHistory;
            rhsConsumptionHistory = (((that.consumptionHistory!= null)&&(!that.consumptionHistory.isEmpty()))?that.getConsumptionHistory():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionHistory", lhsConsumptionHistory), LocatorUtils.property(thatLocator, "consumptionHistory", rhsConsumptionHistory), lhsConsumptionHistory, rhsConsumptionHistory, ((this.consumptionHistory!= null)&&(!this.consumptionHistory.isEmpty())), ((that.consumptionHistory!= null)&&(!that.consumptionHistory.isEmpty())))) {
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
            ConsumptionTypeType theConsumptionType;
            theConsumptionType = this.getConsumptionType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionType", theConsumptionType), currentHashCode, theConsumptionType, (this.consumptionType!= null));
        }
        {
            ConsumptionTypeCodeType theConsumptionTypeCode;
            theConsumptionTypeCode = this.getConsumptionTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionTypeCode", theConsumptionTypeCode), currentHashCode, theConsumptionTypeCode, (this.consumptionTypeCode!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            TotalConsumedQuantityType theTotalConsumedQuantity;
            theTotalConsumedQuantity = this.getTotalConsumedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalConsumedQuantity", theTotalConsumedQuantity), currentHashCode, theTotalConsumedQuantity, (this.totalConsumedQuantity!= null));
        }
        {
            BasicConsumedQuantityType theBasicConsumedQuantity;
            theBasicConsumedQuantity = this.getBasicConsumedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "basicConsumedQuantity", theBasicConsumedQuantity), currentHashCode, theBasicConsumedQuantity, (this.basicConsumedQuantity!= null));
        }
        {
            ResidentOccupantsNumericType theResidentOccupantsNumeric;
            theResidentOccupantsNumeric = this.getResidentOccupantsNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "residentOccupantsNumeric", theResidentOccupantsNumeric), currentHashCode, theResidentOccupantsNumeric, (this.residentOccupantsNumeric!= null));
        }
        {
            ConsumersEnergyLevelCodeType theConsumersEnergyLevelCode;
            theConsumersEnergyLevelCode = this.getConsumersEnergyLevelCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumersEnergyLevelCode", theConsumersEnergyLevelCode), currentHashCode, theConsumersEnergyLevelCode, (this.consumersEnergyLevelCode!= null));
        }
        {
            ConsumersEnergyLevelType theConsumersEnergyLevel;
            theConsumersEnergyLevel = this.getConsumersEnergyLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumersEnergyLevel", theConsumersEnergyLevel), currentHashCode, theConsumersEnergyLevel, (this.consumersEnergyLevel!= null));
        }
        {
            ResidenceTypeType theResidenceType;
            theResidenceType = this.getResidenceType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "residenceType", theResidenceType), currentHashCode, theResidenceType, (this.residenceType!= null));
        }
        {
            ResidenceTypeCodeType theResidenceTypeCode;
            theResidenceTypeCode = this.getResidenceTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "residenceTypeCode", theResidenceTypeCode), currentHashCode, theResidenceTypeCode, (this.residenceTypeCode!= null));
        }
        {
            HeatingTypeType theHeatingType;
            theHeatingType = this.getHeatingType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "heatingType", theHeatingType), currentHashCode, theHeatingType, (this.heatingType!= null));
        }
        {
            HeatingTypeCodeType theHeatingTypeCode;
            theHeatingTypeCode = this.getHeatingTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "heatingTypeCode", theHeatingTypeCode), currentHashCode, theHeatingTypeCode, (this.heatingTypeCode!= null));
        }
        {
            PeriodType thePeriod;
            thePeriod = this.getPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "period", thePeriod), currentHashCode, thePeriod, (this.period!= null));
        }
        {
            DocumentReferenceType theGuidanceDocumentReference;
            theGuidanceDocumentReference = this.getGuidanceDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "guidanceDocumentReference", theGuidanceDocumentReference), currentHashCode, theGuidanceDocumentReference, (this.guidanceDocumentReference!= null));
        }
        {
            DocumentReferenceType theDocumentReference;
            theDocumentReference = this.getDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentReference", theDocumentReference), currentHashCode, theDocumentReference, (this.documentReference!= null));
        }
        {
            List<ConsumptionReportReferenceType> theConsumptionReportReference;
            theConsumptionReportReference = (((this.consumptionReportReference!= null)&&(!this.consumptionReportReference.isEmpty()))?this.getConsumptionReportReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionReportReference", theConsumptionReportReference), currentHashCode, theConsumptionReportReference, ((this.consumptionReportReference!= null)&&(!this.consumptionReportReference.isEmpty())));
        }
        {
            List<ConsumptionHistoryType> theConsumptionHistory;
            theConsumptionHistory = (((this.consumptionHistory!= null)&&(!this.consumptionHistory.isEmpty()))?this.getConsumptionHistory():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionHistory", theConsumptionHistory), currentHashCode, theConsumptionHistory, ((this.consumptionHistory!= null)&&(!this.consumptionHistory.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
