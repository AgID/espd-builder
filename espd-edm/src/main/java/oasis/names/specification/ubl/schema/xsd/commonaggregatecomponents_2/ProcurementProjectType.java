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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EstimatedOverallContractQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FeeDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProcurementSubTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProcurementTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QualityControlCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequestedDeliveryDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequiredFeeAmountType;
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
 * <p>Classe Java per ProcurementProjectType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ProcurementProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcurementTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcurementSubTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}QualityControlCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequiredFeeAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FeeDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequestedDeliveryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedOverallContractQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedTenderTotal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MainCommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalCommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RealizedLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractExtension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestForTenderLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcurementProjectType", propOrder = {
    "id",
    "name",
    "description",
    "procurementTypeCode",
    "procurementSubTypeCode",
    "qualityControlCode",
    "requiredFeeAmount",
    "feeDescription",
    "requestedDeliveryDate",
    "estimatedOverallContractQuantity",
    "note",
    "requestedTenderTotal",
    "mainCommodityClassification",
    "additionalCommodityClassification",
    "realizedLocation",
    "plannedPeriod",
    "contractExtension",
    "requestForTenderLine"
})
public class ProcurementProjectType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NameType> name;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "ProcurementTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProcurementTypeCodeType procurementTypeCode;
    @XmlElement(name = "ProcurementSubTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProcurementSubTypeCodeType procurementSubTypeCode;
    @XmlElement(name = "QualityControlCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QualityControlCodeType qualityControlCode;
    @XmlElement(name = "RequiredFeeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequiredFeeAmountType requiredFeeAmount;
    @XmlElement(name = "FeeDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<FeeDescriptionType> feeDescription;
    @XmlElement(name = "RequestedDeliveryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequestedDeliveryDateType requestedDeliveryDate;
    @XmlElement(name = "EstimatedOverallContractQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EstimatedOverallContractQuantityType estimatedOverallContractQuantity;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "RequestedTenderTotal")
    protected RequestedTenderTotalType requestedTenderTotal;
    @XmlElement(name = "MainCommodityClassification")
    protected List<CommodityClassificationType> mainCommodityClassification;
    @XmlElement(name = "AdditionalCommodityClassification")
    protected List<CommodityClassificationType> additionalCommodityClassification;
    @XmlElement(name = "RealizedLocation")
    protected List<LocationType> realizedLocation;
    @XmlElement(name = "PlannedPeriod")
    protected PeriodType plannedPeriod;
    @XmlElement(name = "ContractExtension")
    protected ContractExtensionType contractExtension;
    @XmlElement(name = "RequestForTenderLine")
    protected List<RequestForTenderLineType> requestForTenderLine;

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
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getName() {
        if (name == null) {
            name = new ArrayList<NameType>();
        }
        return this.name;
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
     * Recupera il valore della proprietà procurementTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ProcurementTypeCodeType }
     *     
     */
    public ProcurementTypeCodeType getProcurementTypeCode() {
        return procurementTypeCode;
    }

    /**
     * Imposta il valore della proprietà procurementTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcurementTypeCodeType }
     *     
     */
    public void setProcurementTypeCode(ProcurementTypeCodeType value) {
        this.procurementTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà procurementSubTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ProcurementSubTypeCodeType }
     *     
     */
    public ProcurementSubTypeCodeType getProcurementSubTypeCode() {
        return procurementSubTypeCode;
    }

    /**
     * Imposta il valore della proprietà procurementSubTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcurementSubTypeCodeType }
     *     
     */
    public void setProcurementSubTypeCode(ProcurementSubTypeCodeType value) {
        this.procurementSubTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà qualityControlCode.
     * 
     * @return
     *     possible object is
     *     {@link QualityControlCodeType }
     *     
     */
    public QualityControlCodeType getQualityControlCode() {
        return qualityControlCode;
    }

    /**
     * Imposta il valore della proprietà qualityControlCode.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityControlCodeType }
     *     
     */
    public void setQualityControlCode(QualityControlCodeType value) {
        this.qualityControlCode = value;
    }

    /**
     * Recupera il valore della proprietà requiredFeeAmount.
     * 
     * @return
     *     possible object is
     *     {@link RequiredFeeAmountType }
     *     
     */
    public RequiredFeeAmountType getRequiredFeeAmount() {
        return requiredFeeAmount;
    }

    /**
     * Imposta il valore della proprietà requiredFeeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredFeeAmountType }
     *     
     */
    public void setRequiredFeeAmount(RequiredFeeAmountType value) {
        this.requiredFeeAmount = value;
    }

    /**
     * Gets the value of the feeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeDescriptionType }
     * 
     * 
     */
    public List<FeeDescriptionType> getFeeDescription() {
        if (feeDescription == null) {
            feeDescription = new ArrayList<FeeDescriptionType>();
        }
        return this.feeDescription;
    }

    /**
     * Recupera il valore della proprietà requestedDeliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDeliveryDateType }
     *     
     */
    public RequestedDeliveryDateType getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    /**
     * Imposta il valore della proprietà requestedDeliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDeliveryDateType }
     *     
     */
    public void setRequestedDeliveryDate(RequestedDeliveryDateType value) {
        this.requestedDeliveryDate = value;
    }

    /**
     * Recupera il valore della proprietà estimatedOverallContractQuantity.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedOverallContractQuantityType }
     *     
     */
    public EstimatedOverallContractQuantityType getEstimatedOverallContractQuantity() {
        return estimatedOverallContractQuantity;
    }

    /**
     * Imposta il valore della proprietà estimatedOverallContractQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedOverallContractQuantityType }
     *     
     */
    public void setEstimatedOverallContractQuantity(EstimatedOverallContractQuantityType value) {
        this.estimatedOverallContractQuantity = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Recupera il valore della proprietà requestedTenderTotal.
     * 
     * @return
     *     possible object is
     *     {@link RequestedTenderTotalType }
     *     
     */
    public RequestedTenderTotalType getRequestedTenderTotal() {
        return requestedTenderTotal;
    }

    /**
     * Imposta il valore della proprietà requestedTenderTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedTenderTotalType }
     *     
     */
    public void setRequestedTenderTotal(RequestedTenderTotalType value) {
        this.requestedTenderTotal = value;
    }

    /**
     * Gets the value of the mainCommodityClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainCommodityClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainCommodityClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getMainCommodityClassification() {
        if (mainCommodityClassification == null) {
            mainCommodityClassification = new ArrayList<CommodityClassificationType>();
        }
        return this.mainCommodityClassification;
    }

    /**
     * Gets the value of the additionalCommodityClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalCommodityClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalCommodityClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getAdditionalCommodityClassification() {
        if (additionalCommodityClassification == null) {
            additionalCommodityClassification = new ArrayList<CommodityClassificationType>();
        }
        return this.additionalCommodityClassification;
    }

    /**
     * Gets the value of the realizedLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realizedLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealizedLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getRealizedLocation() {
        if (realizedLocation == null) {
            realizedLocation = new ArrayList<LocationType>();
        }
        return this.realizedLocation;
    }

    /**
     * Recupera il valore della proprietà plannedPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPlannedPeriod() {
        return plannedPeriod;
    }

    /**
     * Imposta il valore della proprietà plannedPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPlannedPeriod(PeriodType value) {
        this.plannedPeriod = value;
    }

    /**
     * Recupera il valore della proprietà contractExtension.
     * 
     * @return
     *     possible object is
     *     {@link ContractExtensionType }
     *     
     */
    public ContractExtensionType getContractExtension() {
        return contractExtension;
    }

    /**
     * Imposta il valore della proprietà contractExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractExtensionType }
     *     
     */
    public void setContractExtension(ContractExtensionType value) {
        this.contractExtension = value;
    }

    /**
     * Gets the value of the requestForTenderLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestForTenderLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestForTenderLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestForTenderLineType }
     * 
     * 
     */
    public List<RequestForTenderLineType> getRequestForTenderLine() {
        if (requestForTenderLine == null) {
            requestForTenderLine = new ArrayList<RequestForTenderLineType>();
        }
        return this.requestForTenderLine;
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
            List<NameType> theName;
            theName = (((this.name!= null)&&(!this.name.isEmpty()))?this.getName():null);
            strategy.appendField(locator, this, "name", buffer, theName, ((this.name!= null)&&(!this.name.isEmpty())));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            ProcurementTypeCodeType theProcurementTypeCode;
            theProcurementTypeCode = this.getProcurementTypeCode();
            strategy.appendField(locator, this, "procurementTypeCode", buffer, theProcurementTypeCode, (this.procurementTypeCode!= null));
        }
        {
            ProcurementSubTypeCodeType theProcurementSubTypeCode;
            theProcurementSubTypeCode = this.getProcurementSubTypeCode();
            strategy.appendField(locator, this, "procurementSubTypeCode", buffer, theProcurementSubTypeCode, (this.procurementSubTypeCode!= null));
        }
        {
            QualityControlCodeType theQualityControlCode;
            theQualityControlCode = this.getQualityControlCode();
            strategy.appendField(locator, this, "qualityControlCode", buffer, theQualityControlCode, (this.qualityControlCode!= null));
        }
        {
            RequiredFeeAmountType theRequiredFeeAmount;
            theRequiredFeeAmount = this.getRequiredFeeAmount();
            strategy.appendField(locator, this, "requiredFeeAmount", buffer, theRequiredFeeAmount, (this.requiredFeeAmount!= null));
        }
        {
            List<FeeDescriptionType> theFeeDescription;
            theFeeDescription = (((this.feeDescription!= null)&&(!this.feeDescription.isEmpty()))?this.getFeeDescription():null);
            strategy.appendField(locator, this, "feeDescription", buffer, theFeeDescription, ((this.feeDescription!= null)&&(!this.feeDescription.isEmpty())));
        }
        {
            RequestedDeliveryDateType theRequestedDeliveryDate;
            theRequestedDeliveryDate = this.getRequestedDeliveryDate();
            strategy.appendField(locator, this, "requestedDeliveryDate", buffer, theRequestedDeliveryDate, (this.requestedDeliveryDate!= null));
        }
        {
            EstimatedOverallContractQuantityType theEstimatedOverallContractQuantity;
            theEstimatedOverallContractQuantity = this.getEstimatedOverallContractQuantity();
            strategy.appendField(locator, this, "estimatedOverallContractQuantity", buffer, theEstimatedOverallContractQuantity, (this.estimatedOverallContractQuantity!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            strategy.appendField(locator, this, "note", buffer, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            RequestedTenderTotalType theRequestedTenderTotal;
            theRequestedTenderTotal = this.getRequestedTenderTotal();
            strategy.appendField(locator, this, "requestedTenderTotal", buffer, theRequestedTenderTotal, (this.requestedTenderTotal!= null));
        }
        {
            List<CommodityClassificationType> theMainCommodityClassification;
            theMainCommodityClassification = (((this.mainCommodityClassification!= null)&&(!this.mainCommodityClassification.isEmpty()))?this.getMainCommodityClassification():null);
            strategy.appendField(locator, this, "mainCommodityClassification", buffer, theMainCommodityClassification, ((this.mainCommodityClassification!= null)&&(!this.mainCommodityClassification.isEmpty())));
        }
        {
            List<CommodityClassificationType> theAdditionalCommodityClassification;
            theAdditionalCommodityClassification = (((this.additionalCommodityClassification!= null)&&(!this.additionalCommodityClassification.isEmpty()))?this.getAdditionalCommodityClassification():null);
            strategy.appendField(locator, this, "additionalCommodityClassification", buffer, theAdditionalCommodityClassification, ((this.additionalCommodityClassification!= null)&&(!this.additionalCommodityClassification.isEmpty())));
        }
        {
            List<LocationType> theRealizedLocation;
            theRealizedLocation = (((this.realizedLocation!= null)&&(!this.realizedLocation.isEmpty()))?this.getRealizedLocation():null);
            strategy.appendField(locator, this, "realizedLocation", buffer, theRealizedLocation, ((this.realizedLocation!= null)&&(!this.realizedLocation.isEmpty())));
        }
        {
            PeriodType thePlannedPeriod;
            thePlannedPeriod = this.getPlannedPeriod();
            strategy.appendField(locator, this, "plannedPeriod", buffer, thePlannedPeriod, (this.plannedPeriod!= null));
        }
        {
            ContractExtensionType theContractExtension;
            theContractExtension = this.getContractExtension();
            strategy.appendField(locator, this, "contractExtension", buffer, theContractExtension, (this.contractExtension!= null));
        }
        {
            List<RequestForTenderLineType> theRequestForTenderLine;
            theRequestForTenderLine = (((this.requestForTenderLine!= null)&&(!this.requestForTenderLine.isEmpty()))?this.getRequestForTenderLine():null);
            strategy.appendField(locator, this, "requestForTenderLine", buffer, theRequestForTenderLine, ((this.requestForTenderLine!= null)&&(!this.requestForTenderLine.isEmpty())));
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
        final ProcurementProjectType that = ((ProcurementProjectType) object);
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
            List<NameType> lhsName;
            lhsName = (((this.name!= null)&&(!this.name.isEmpty()))?this.getName():null);
            List<NameType> rhsName;
            rhsName = (((that.name!= null)&&(!that.name.isEmpty()))?that.getName():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, ((this.name!= null)&&(!this.name.isEmpty())), ((that.name!= null)&&(!that.name.isEmpty())))) {
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
            ProcurementTypeCodeType lhsProcurementTypeCode;
            lhsProcurementTypeCode = this.getProcurementTypeCode();
            ProcurementTypeCodeType rhsProcurementTypeCode;
            rhsProcurementTypeCode = that.getProcurementTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "procurementTypeCode", lhsProcurementTypeCode), LocatorUtils.property(thatLocator, "procurementTypeCode", rhsProcurementTypeCode), lhsProcurementTypeCode, rhsProcurementTypeCode, (this.procurementTypeCode!= null), (that.procurementTypeCode!= null))) {
                return false;
            }
        }
        {
            ProcurementSubTypeCodeType lhsProcurementSubTypeCode;
            lhsProcurementSubTypeCode = this.getProcurementSubTypeCode();
            ProcurementSubTypeCodeType rhsProcurementSubTypeCode;
            rhsProcurementSubTypeCode = that.getProcurementSubTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "procurementSubTypeCode", lhsProcurementSubTypeCode), LocatorUtils.property(thatLocator, "procurementSubTypeCode", rhsProcurementSubTypeCode), lhsProcurementSubTypeCode, rhsProcurementSubTypeCode, (this.procurementSubTypeCode!= null), (that.procurementSubTypeCode!= null))) {
                return false;
            }
        }
        {
            QualityControlCodeType lhsQualityControlCode;
            lhsQualityControlCode = this.getQualityControlCode();
            QualityControlCodeType rhsQualityControlCode;
            rhsQualityControlCode = that.getQualityControlCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qualityControlCode", lhsQualityControlCode), LocatorUtils.property(thatLocator, "qualityControlCode", rhsQualityControlCode), lhsQualityControlCode, rhsQualityControlCode, (this.qualityControlCode!= null), (that.qualityControlCode!= null))) {
                return false;
            }
        }
        {
            RequiredFeeAmountType lhsRequiredFeeAmount;
            lhsRequiredFeeAmount = this.getRequiredFeeAmount();
            RequiredFeeAmountType rhsRequiredFeeAmount;
            rhsRequiredFeeAmount = that.getRequiredFeeAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requiredFeeAmount", lhsRequiredFeeAmount), LocatorUtils.property(thatLocator, "requiredFeeAmount", rhsRequiredFeeAmount), lhsRequiredFeeAmount, rhsRequiredFeeAmount, (this.requiredFeeAmount!= null), (that.requiredFeeAmount!= null))) {
                return false;
            }
        }
        {
            List<FeeDescriptionType> lhsFeeDescription;
            lhsFeeDescription = (((this.feeDescription!= null)&&(!this.feeDescription.isEmpty()))?this.getFeeDescription():null);
            List<FeeDescriptionType> rhsFeeDescription;
            rhsFeeDescription = (((that.feeDescription!= null)&&(!that.feeDescription.isEmpty()))?that.getFeeDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feeDescription", lhsFeeDescription), LocatorUtils.property(thatLocator, "feeDescription", rhsFeeDescription), lhsFeeDescription, rhsFeeDescription, ((this.feeDescription!= null)&&(!this.feeDescription.isEmpty())), ((that.feeDescription!= null)&&(!that.feeDescription.isEmpty())))) {
                return false;
            }
        }
        {
            RequestedDeliveryDateType lhsRequestedDeliveryDate;
            lhsRequestedDeliveryDate = this.getRequestedDeliveryDate();
            RequestedDeliveryDateType rhsRequestedDeliveryDate;
            rhsRequestedDeliveryDate = that.getRequestedDeliveryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedDeliveryDate", lhsRequestedDeliveryDate), LocatorUtils.property(thatLocator, "requestedDeliveryDate", rhsRequestedDeliveryDate), lhsRequestedDeliveryDate, rhsRequestedDeliveryDate, (this.requestedDeliveryDate!= null), (that.requestedDeliveryDate!= null))) {
                return false;
            }
        }
        {
            EstimatedOverallContractQuantityType lhsEstimatedOverallContractQuantity;
            lhsEstimatedOverallContractQuantity = this.getEstimatedOverallContractQuantity();
            EstimatedOverallContractQuantityType rhsEstimatedOverallContractQuantity;
            rhsEstimatedOverallContractQuantity = that.getEstimatedOverallContractQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedOverallContractQuantity", lhsEstimatedOverallContractQuantity), LocatorUtils.property(thatLocator, "estimatedOverallContractQuantity", rhsEstimatedOverallContractQuantity), lhsEstimatedOverallContractQuantity, rhsEstimatedOverallContractQuantity, (this.estimatedOverallContractQuantity!= null), (that.estimatedOverallContractQuantity!= null))) {
                return false;
            }
        }
        {
            List<NoteType> lhsNote;
            lhsNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            List<NoteType> rhsNote;
            rhsNote = (((that.note!= null)&&(!that.note.isEmpty()))?that.getNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote, ((this.note!= null)&&(!this.note.isEmpty())), ((that.note!= null)&&(!that.note.isEmpty())))) {
                return false;
            }
        }
        {
            RequestedTenderTotalType lhsRequestedTenderTotal;
            lhsRequestedTenderTotal = this.getRequestedTenderTotal();
            RequestedTenderTotalType rhsRequestedTenderTotal;
            rhsRequestedTenderTotal = that.getRequestedTenderTotal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestedTenderTotal", lhsRequestedTenderTotal), LocatorUtils.property(thatLocator, "requestedTenderTotal", rhsRequestedTenderTotal), lhsRequestedTenderTotal, rhsRequestedTenderTotal, (this.requestedTenderTotal!= null), (that.requestedTenderTotal!= null))) {
                return false;
            }
        }
        {
            List<CommodityClassificationType> lhsMainCommodityClassification;
            lhsMainCommodityClassification = (((this.mainCommodityClassification!= null)&&(!this.mainCommodityClassification.isEmpty()))?this.getMainCommodityClassification():null);
            List<CommodityClassificationType> rhsMainCommodityClassification;
            rhsMainCommodityClassification = (((that.mainCommodityClassification!= null)&&(!that.mainCommodityClassification.isEmpty()))?that.getMainCommodityClassification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mainCommodityClassification", lhsMainCommodityClassification), LocatorUtils.property(thatLocator, "mainCommodityClassification", rhsMainCommodityClassification), lhsMainCommodityClassification, rhsMainCommodityClassification, ((this.mainCommodityClassification!= null)&&(!this.mainCommodityClassification.isEmpty())), ((that.mainCommodityClassification!= null)&&(!that.mainCommodityClassification.isEmpty())))) {
                return false;
            }
        }
        {
            List<CommodityClassificationType> lhsAdditionalCommodityClassification;
            lhsAdditionalCommodityClassification = (((this.additionalCommodityClassification!= null)&&(!this.additionalCommodityClassification.isEmpty()))?this.getAdditionalCommodityClassification():null);
            List<CommodityClassificationType> rhsAdditionalCommodityClassification;
            rhsAdditionalCommodityClassification = (((that.additionalCommodityClassification!= null)&&(!that.additionalCommodityClassification.isEmpty()))?that.getAdditionalCommodityClassification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalCommodityClassification", lhsAdditionalCommodityClassification), LocatorUtils.property(thatLocator, "additionalCommodityClassification", rhsAdditionalCommodityClassification), lhsAdditionalCommodityClassification, rhsAdditionalCommodityClassification, ((this.additionalCommodityClassification!= null)&&(!this.additionalCommodityClassification.isEmpty())), ((that.additionalCommodityClassification!= null)&&(!that.additionalCommodityClassification.isEmpty())))) {
                return false;
            }
        }
        {
            List<LocationType> lhsRealizedLocation;
            lhsRealizedLocation = (((this.realizedLocation!= null)&&(!this.realizedLocation.isEmpty()))?this.getRealizedLocation():null);
            List<LocationType> rhsRealizedLocation;
            rhsRealizedLocation = (((that.realizedLocation!= null)&&(!that.realizedLocation.isEmpty()))?that.getRealizedLocation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realizedLocation", lhsRealizedLocation), LocatorUtils.property(thatLocator, "realizedLocation", rhsRealizedLocation), lhsRealizedLocation, rhsRealizedLocation, ((this.realizedLocation!= null)&&(!this.realizedLocation.isEmpty())), ((that.realizedLocation!= null)&&(!that.realizedLocation.isEmpty())))) {
                return false;
            }
        }
        {
            PeriodType lhsPlannedPeriod;
            lhsPlannedPeriod = this.getPlannedPeriod();
            PeriodType rhsPlannedPeriod;
            rhsPlannedPeriod = that.getPlannedPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plannedPeriod", lhsPlannedPeriod), LocatorUtils.property(thatLocator, "plannedPeriod", rhsPlannedPeriod), lhsPlannedPeriod, rhsPlannedPeriod, (this.plannedPeriod!= null), (that.plannedPeriod!= null))) {
                return false;
            }
        }
        {
            ContractExtensionType lhsContractExtension;
            lhsContractExtension = this.getContractExtension();
            ContractExtensionType rhsContractExtension;
            rhsContractExtension = that.getContractExtension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractExtension", lhsContractExtension), LocatorUtils.property(thatLocator, "contractExtension", rhsContractExtension), lhsContractExtension, rhsContractExtension, (this.contractExtension!= null), (that.contractExtension!= null))) {
                return false;
            }
        }
        {
            List<RequestForTenderLineType> lhsRequestForTenderLine;
            lhsRequestForTenderLine = (((this.requestForTenderLine!= null)&&(!this.requestForTenderLine.isEmpty()))?this.getRequestForTenderLine():null);
            List<RequestForTenderLineType> rhsRequestForTenderLine;
            rhsRequestForTenderLine = (((that.requestForTenderLine!= null)&&(!that.requestForTenderLine.isEmpty()))?that.getRequestForTenderLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestForTenderLine", lhsRequestForTenderLine), LocatorUtils.property(thatLocator, "requestForTenderLine", rhsRequestForTenderLine), lhsRequestForTenderLine, rhsRequestForTenderLine, ((this.requestForTenderLine!= null)&&(!this.requestForTenderLine.isEmpty())), ((that.requestForTenderLine!= null)&&(!that.requestForTenderLine.isEmpty())))) {
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
            List<NameType> theName;
            theName = (((this.name!= null)&&(!this.name.isEmpty()))?this.getName():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, ((this.name!= null)&&(!this.name.isEmpty())));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            ProcurementTypeCodeType theProcurementTypeCode;
            theProcurementTypeCode = this.getProcurementTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "procurementTypeCode", theProcurementTypeCode), currentHashCode, theProcurementTypeCode, (this.procurementTypeCode!= null));
        }
        {
            ProcurementSubTypeCodeType theProcurementSubTypeCode;
            theProcurementSubTypeCode = this.getProcurementSubTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "procurementSubTypeCode", theProcurementSubTypeCode), currentHashCode, theProcurementSubTypeCode, (this.procurementSubTypeCode!= null));
        }
        {
            QualityControlCodeType theQualityControlCode;
            theQualityControlCode = this.getQualityControlCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qualityControlCode", theQualityControlCode), currentHashCode, theQualityControlCode, (this.qualityControlCode!= null));
        }
        {
            RequiredFeeAmountType theRequiredFeeAmount;
            theRequiredFeeAmount = this.getRequiredFeeAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requiredFeeAmount", theRequiredFeeAmount), currentHashCode, theRequiredFeeAmount, (this.requiredFeeAmount!= null));
        }
        {
            List<FeeDescriptionType> theFeeDescription;
            theFeeDescription = (((this.feeDescription!= null)&&(!this.feeDescription.isEmpty()))?this.getFeeDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feeDescription", theFeeDescription), currentHashCode, theFeeDescription, ((this.feeDescription!= null)&&(!this.feeDescription.isEmpty())));
        }
        {
            RequestedDeliveryDateType theRequestedDeliveryDate;
            theRequestedDeliveryDate = this.getRequestedDeliveryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedDeliveryDate", theRequestedDeliveryDate), currentHashCode, theRequestedDeliveryDate, (this.requestedDeliveryDate!= null));
        }
        {
            EstimatedOverallContractQuantityType theEstimatedOverallContractQuantity;
            theEstimatedOverallContractQuantity = this.getEstimatedOverallContractQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedOverallContractQuantity", theEstimatedOverallContractQuantity), currentHashCode, theEstimatedOverallContractQuantity, (this.estimatedOverallContractQuantity!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            RequestedTenderTotalType theRequestedTenderTotal;
            theRequestedTenderTotal = this.getRequestedTenderTotal();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestedTenderTotal", theRequestedTenderTotal), currentHashCode, theRequestedTenderTotal, (this.requestedTenderTotal!= null));
        }
        {
            List<CommodityClassificationType> theMainCommodityClassification;
            theMainCommodityClassification = (((this.mainCommodityClassification!= null)&&(!this.mainCommodityClassification.isEmpty()))?this.getMainCommodityClassification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mainCommodityClassification", theMainCommodityClassification), currentHashCode, theMainCommodityClassification, ((this.mainCommodityClassification!= null)&&(!this.mainCommodityClassification.isEmpty())));
        }
        {
            List<CommodityClassificationType> theAdditionalCommodityClassification;
            theAdditionalCommodityClassification = (((this.additionalCommodityClassification!= null)&&(!this.additionalCommodityClassification.isEmpty()))?this.getAdditionalCommodityClassification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalCommodityClassification", theAdditionalCommodityClassification), currentHashCode, theAdditionalCommodityClassification, ((this.additionalCommodityClassification!= null)&&(!this.additionalCommodityClassification.isEmpty())));
        }
        {
            List<LocationType> theRealizedLocation;
            theRealizedLocation = (((this.realizedLocation!= null)&&(!this.realizedLocation.isEmpty()))?this.getRealizedLocation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "realizedLocation", theRealizedLocation), currentHashCode, theRealizedLocation, ((this.realizedLocation!= null)&&(!this.realizedLocation.isEmpty())));
        }
        {
            PeriodType thePlannedPeriod;
            thePlannedPeriod = this.getPlannedPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "plannedPeriod", thePlannedPeriod), currentHashCode, thePlannedPeriod, (this.plannedPeriod!= null));
        }
        {
            ContractExtensionType theContractExtension;
            theContractExtension = this.getContractExtension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractExtension", theContractExtension), currentHashCode, theContractExtension, (this.contractExtension!= null));
        }
        {
            List<RequestForTenderLineType> theRequestForTenderLine;
            theRequestForTenderLine = (((this.requestForTenderLine!= null)&&(!this.requestForTenderLine.isEmpty()))?this.getRequestForTenderLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestForTenderLine", theRequestForTenderLine), currentHashCode, theRequestForTenderLine, ((this.requestForTenderLine!= null)&&(!this.requestForTenderLine.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
