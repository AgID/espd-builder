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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CollaborationPriorityCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ComparedValueMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExceptionStatusCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PerformanceMetricTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResolutionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SourceValueMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SupplyChainActivityTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.VarianceQuantityType;
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
 * <p>Classe Java per ExceptionNotificationLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ExceptionNotificationLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExceptionStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CollaborationPriorityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResolutionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ComparedValueMeasure"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceValueMeasure"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VarianceQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SupplyChainActivityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerformanceMetricTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExceptionObservationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ForecastException" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplyItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionNotificationLineType", propOrder = {
    "id",
    "note",
    "description",
    "exceptionStatusCode",
    "collaborationPriorityCode",
    "resolutionCode",
    "comparedValueMeasure",
    "sourceValueMeasure",
    "varianceQuantity",
    "supplyChainActivityTypeCode",
    "performanceMetricTypeCode",
    "exceptionObservationPeriod",
    "documentReference",
    "forecastException",
    "supplyItem"
})
public class ExceptionNotificationLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "ExceptionStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExceptionStatusCodeType exceptionStatusCode;
    @XmlElement(name = "CollaborationPriorityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CollaborationPriorityCodeType collaborationPriorityCode;
    @XmlElement(name = "ResolutionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ResolutionCodeType resolutionCode;
    @XmlElement(name = "ComparedValueMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ComparedValueMeasureType comparedValueMeasure;
    @XmlElement(name = "SourceValueMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected SourceValueMeasureType sourceValueMeasure;
    @XmlElement(name = "VarianceQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VarianceQuantityType varianceQuantity;
    @XmlElement(name = "SupplyChainActivityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SupplyChainActivityTypeCodeType supplyChainActivityTypeCode;
    @XmlElement(name = "PerformanceMetricTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PerformanceMetricTypeCodeType performanceMetricTypeCode;
    @XmlElement(name = "ExceptionObservationPeriod")
    protected PeriodType exceptionObservationPeriod;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "ForecastException")
    protected ForecastExceptionType forecastException;
    @XmlElement(name = "SupplyItem", required = true)
    protected ItemType supplyItem;

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
     * Recupera il valore della proprietà exceptionStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionStatusCodeType }
     *     
     */
    public ExceptionStatusCodeType getExceptionStatusCode() {
        return exceptionStatusCode;
    }

    /**
     * Imposta il valore della proprietà exceptionStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionStatusCodeType }
     *     
     */
    public void setExceptionStatusCode(ExceptionStatusCodeType value) {
        this.exceptionStatusCode = value;
    }

    /**
     * Recupera il valore della proprietà collaborationPriorityCode.
     * 
     * @return
     *     possible object is
     *     {@link CollaborationPriorityCodeType }
     *     
     */
    public CollaborationPriorityCodeType getCollaborationPriorityCode() {
        return collaborationPriorityCode;
    }

    /**
     * Imposta il valore della proprietà collaborationPriorityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborationPriorityCodeType }
     *     
     */
    public void setCollaborationPriorityCode(CollaborationPriorityCodeType value) {
        this.collaborationPriorityCode = value;
    }

    /**
     * Recupera il valore della proprietà resolutionCode.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionCodeType }
     *     
     */
    public ResolutionCodeType getResolutionCode() {
        return resolutionCode;
    }

    /**
     * Imposta il valore della proprietà resolutionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionCodeType }
     *     
     */
    public void setResolutionCode(ResolutionCodeType value) {
        this.resolutionCode = value;
    }

    /**
     * Recupera il valore della proprietà comparedValueMeasure.
     * 
     * @return
     *     possible object is
     *     {@link ComparedValueMeasureType }
     *     
     */
    public ComparedValueMeasureType getComparedValueMeasure() {
        return comparedValueMeasure;
    }

    /**
     * Imposta il valore della proprietà comparedValueMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparedValueMeasureType }
     *     
     */
    public void setComparedValueMeasure(ComparedValueMeasureType value) {
        this.comparedValueMeasure = value;
    }

    /**
     * Recupera il valore della proprietà sourceValueMeasure.
     * 
     * @return
     *     possible object is
     *     {@link SourceValueMeasureType }
     *     
     */
    public SourceValueMeasureType getSourceValueMeasure() {
        return sourceValueMeasure;
    }

    /**
     * Imposta il valore della proprietà sourceValueMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceValueMeasureType }
     *     
     */
    public void setSourceValueMeasure(SourceValueMeasureType value) {
        this.sourceValueMeasure = value;
    }

    /**
     * Recupera il valore della proprietà varianceQuantity.
     * 
     * @return
     *     possible object is
     *     {@link VarianceQuantityType }
     *     
     */
    public VarianceQuantityType getVarianceQuantity() {
        return varianceQuantity;
    }

    /**
     * Imposta il valore della proprietà varianceQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link VarianceQuantityType }
     *     
     */
    public void setVarianceQuantity(VarianceQuantityType value) {
        this.varianceQuantity = value;
    }

    /**
     * Recupera il valore della proprietà supplyChainActivityTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link SupplyChainActivityTypeCodeType }
     *     
     */
    public SupplyChainActivityTypeCodeType getSupplyChainActivityTypeCode() {
        return supplyChainActivityTypeCode;
    }

    /**
     * Imposta il valore della proprietà supplyChainActivityTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyChainActivityTypeCodeType }
     *     
     */
    public void setSupplyChainActivityTypeCode(SupplyChainActivityTypeCodeType value) {
        this.supplyChainActivityTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà performanceMetricTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMetricTypeCodeType }
     *     
     */
    public PerformanceMetricTypeCodeType getPerformanceMetricTypeCode() {
        return performanceMetricTypeCode;
    }

    /**
     * Imposta il valore della proprietà performanceMetricTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMetricTypeCodeType }
     *     
     */
    public void setPerformanceMetricTypeCode(PerformanceMetricTypeCodeType value) {
        this.performanceMetricTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà exceptionObservationPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getExceptionObservationPeriod() {
        return exceptionObservationPeriod;
    }

    /**
     * Imposta il valore della proprietà exceptionObservationPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setExceptionObservationPeriod(PeriodType value) {
        this.exceptionObservationPeriod = value;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReference;
    }

    /**
     * Recupera il valore della proprietà forecastException.
     * 
     * @return
     *     possible object is
     *     {@link ForecastExceptionType }
     *     
     */
    public ForecastExceptionType getForecastException() {
        return forecastException;
    }

    /**
     * Imposta il valore della proprietà forecastException.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastExceptionType }
     *     
     */
    public void setForecastException(ForecastExceptionType value) {
        this.forecastException = value;
    }

    /**
     * Recupera il valore della proprietà supplyItem.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getSupplyItem() {
        return supplyItem;
    }

    /**
     * Imposta il valore della proprietà supplyItem.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setSupplyItem(ItemType value) {
        this.supplyItem = value;
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
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            strategy.appendField(locator, this, "note", buffer, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            ExceptionStatusCodeType theExceptionStatusCode;
            theExceptionStatusCode = this.getExceptionStatusCode();
            strategy.appendField(locator, this, "exceptionStatusCode", buffer, theExceptionStatusCode, (this.exceptionStatusCode!= null));
        }
        {
            CollaborationPriorityCodeType theCollaborationPriorityCode;
            theCollaborationPriorityCode = this.getCollaborationPriorityCode();
            strategy.appendField(locator, this, "collaborationPriorityCode", buffer, theCollaborationPriorityCode, (this.collaborationPriorityCode!= null));
        }
        {
            ResolutionCodeType theResolutionCode;
            theResolutionCode = this.getResolutionCode();
            strategy.appendField(locator, this, "resolutionCode", buffer, theResolutionCode, (this.resolutionCode!= null));
        }
        {
            ComparedValueMeasureType theComparedValueMeasure;
            theComparedValueMeasure = this.getComparedValueMeasure();
            strategy.appendField(locator, this, "comparedValueMeasure", buffer, theComparedValueMeasure, (this.comparedValueMeasure!= null));
        }
        {
            SourceValueMeasureType theSourceValueMeasure;
            theSourceValueMeasure = this.getSourceValueMeasure();
            strategy.appendField(locator, this, "sourceValueMeasure", buffer, theSourceValueMeasure, (this.sourceValueMeasure!= null));
        }
        {
            VarianceQuantityType theVarianceQuantity;
            theVarianceQuantity = this.getVarianceQuantity();
            strategy.appendField(locator, this, "varianceQuantity", buffer, theVarianceQuantity, (this.varianceQuantity!= null));
        }
        {
            SupplyChainActivityTypeCodeType theSupplyChainActivityTypeCode;
            theSupplyChainActivityTypeCode = this.getSupplyChainActivityTypeCode();
            strategy.appendField(locator, this, "supplyChainActivityTypeCode", buffer, theSupplyChainActivityTypeCode, (this.supplyChainActivityTypeCode!= null));
        }
        {
            PerformanceMetricTypeCodeType thePerformanceMetricTypeCode;
            thePerformanceMetricTypeCode = this.getPerformanceMetricTypeCode();
            strategy.appendField(locator, this, "performanceMetricTypeCode", buffer, thePerformanceMetricTypeCode, (this.performanceMetricTypeCode!= null));
        }
        {
            PeriodType theExceptionObservationPeriod;
            theExceptionObservationPeriod = this.getExceptionObservationPeriod();
            strategy.appendField(locator, this, "exceptionObservationPeriod", buffer, theExceptionObservationPeriod, (this.exceptionObservationPeriod!= null));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            strategy.appendField(locator, this, "documentReference", buffer, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            ForecastExceptionType theForecastException;
            theForecastException = this.getForecastException();
            strategy.appendField(locator, this, "forecastException", buffer, theForecastException, (this.forecastException!= null));
        }
        {
            ItemType theSupplyItem;
            theSupplyItem = this.getSupplyItem();
            strategy.appendField(locator, this, "supplyItem", buffer, theSupplyItem, (this.supplyItem!= null));
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
        final ExceptionNotificationLineType that = ((ExceptionNotificationLineType) object);
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
            List<NoteType> lhsNote;
            lhsNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            List<NoteType> rhsNote;
            rhsNote = (((that.note!= null)&&(!that.note.isEmpty()))?that.getNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote, ((this.note!= null)&&(!this.note.isEmpty())), ((that.note!= null)&&(!that.note.isEmpty())))) {
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
            ExceptionStatusCodeType lhsExceptionStatusCode;
            lhsExceptionStatusCode = this.getExceptionStatusCode();
            ExceptionStatusCodeType rhsExceptionStatusCode;
            rhsExceptionStatusCode = that.getExceptionStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exceptionStatusCode", lhsExceptionStatusCode), LocatorUtils.property(thatLocator, "exceptionStatusCode", rhsExceptionStatusCode), lhsExceptionStatusCode, rhsExceptionStatusCode, (this.exceptionStatusCode!= null), (that.exceptionStatusCode!= null))) {
                return false;
            }
        }
        {
            CollaborationPriorityCodeType lhsCollaborationPriorityCode;
            lhsCollaborationPriorityCode = this.getCollaborationPriorityCode();
            CollaborationPriorityCodeType rhsCollaborationPriorityCode;
            rhsCollaborationPriorityCode = that.getCollaborationPriorityCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "collaborationPriorityCode", lhsCollaborationPriorityCode), LocatorUtils.property(thatLocator, "collaborationPriorityCode", rhsCollaborationPriorityCode), lhsCollaborationPriorityCode, rhsCollaborationPriorityCode, (this.collaborationPriorityCode!= null), (that.collaborationPriorityCode!= null))) {
                return false;
            }
        }
        {
            ResolutionCodeType lhsResolutionCode;
            lhsResolutionCode = this.getResolutionCode();
            ResolutionCodeType rhsResolutionCode;
            rhsResolutionCode = that.getResolutionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resolutionCode", lhsResolutionCode), LocatorUtils.property(thatLocator, "resolutionCode", rhsResolutionCode), lhsResolutionCode, rhsResolutionCode, (this.resolutionCode!= null), (that.resolutionCode!= null))) {
                return false;
            }
        }
        {
            ComparedValueMeasureType lhsComparedValueMeasure;
            lhsComparedValueMeasure = this.getComparedValueMeasure();
            ComparedValueMeasureType rhsComparedValueMeasure;
            rhsComparedValueMeasure = that.getComparedValueMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comparedValueMeasure", lhsComparedValueMeasure), LocatorUtils.property(thatLocator, "comparedValueMeasure", rhsComparedValueMeasure), lhsComparedValueMeasure, rhsComparedValueMeasure, (this.comparedValueMeasure!= null), (that.comparedValueMeasure!= null))) {
                return false;
            }
        }
        {
            SourceValueMeasureType lhsSourceValueMeasure;
            lhsSourceValueMeasure = this.getSourceValueMeasure();
            SourceValueMeasureType rhsSourceValueMeasure;
            rhsSourceValueMeasure = that.getSourceValueMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceValueMeasure", lhsSourceValueMeasure), LocatorUtils.property(thatLocator, "sourceValueMeasure", rhsSourceValueMeasure), lhsSourceValueMeasure, rhsSourceValueMeasure, (this.sourceValueMeasure!= null), (that.sourceValueMeasure!= null))) {
                return false;
            }
        }
        {
            VarianceQuantityType lhsVarianceQuantity;
            lhsVarianceQuantity = this.getVarianceQuantity();
            VarianceQuantityType rhsVarianceQuantity;
            rhsVarianceQuantity = that.getVarianceQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "varianceQuantity", lhsVarianceQuantity), LocatorUtils.property(thatLocator, "varianceQuantity", rhsVarianceQuantity), lhsVarianceQuantity, rhsVarianceQuantity, (this.varianceQuantity!= null), (that.varianceQuantity!= null))) {
                return false;
            }
        }
        {
            SupplyChainActivityTypeCodeType lhsSupplyChainActivityTypeCode;
            lhsSupplyChainActivityTypeCode = this.getSupplyChainActivityTypeCode();
            SupplyChainActivityTypeCodeType rhsSupplyChainActivityTypeCode;
            rhsSupplyChainActivityTypeCode = that.getSupplyChainActivityTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplyChainActivityTypeCode", lhsSupplyChainActivityTypeCode), LocatorUtils.property(thatLocator, "supplyChainActivityTypeCode", rhsSupplyChainActivityTypeCode), lhsSupplyChainActivityTypeCode, rhsSupplyChainActivityTypeCode, (this.supplyChainActivityTypeCode!= null), (that.supplyChainActivityTypeCode!= null))) {
                return false;
            }
        }
        {
            PerformanceMetricTypeCodeType lhsPerformanceMetricTypeCode;
            lhsPerformanceMetricTypeCode = this.getPerformanceMetricTypeCode();
            PerformanceMetricTypeCodeType rhsPerformanceMetricTypeCode;
            rhsPerformanceMetricTypeCode = that.getPerformanceMetricTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "performanceMetricTypeCode", lhsPerformanceMetricTypeCode), LocatorUtils.property(thatLocator, "performanceMetricTypeCode", rhsPerformanceMetricTypeCode), lhsPerformanceMetricTypeCode, rhsPerformanceMetricTypeCode, (this.performanceMetricTypeCode!= null), (that.performanceMetricTypeCode!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsExceptionObservationPeriod;
            lhsExceptionObservationPeriod = this.getExceptionObservationPeriod();
            PeriodType rhsExceptionObservationPeriod;
            rhsExceptionObservationPeriod = that.getExceptionObservationPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exceptionObservationPeriod", lhsExceptionObservationPeriod), LocatorUtils.property(thatLocator, "exceptionObservationPeriod", rhsExceptionObservationPeriod), lhsExceptionObservationPeriod, rhsExceptionObservationPeriod, (this.exceptionObservationPeriod!= null), (that.exceptionObservationPeriod!= null))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsDocumentReference;
            lhsDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            List<DocumentReferenceType> rhsDocumentReference;
            rhsDocumentReference = (((that.documentReference!= null)&&(!that.documentReference.isEmpty()))?that.getDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentReference", lhsDocumentReference), LocatorUtils.property(thatLocator, "documentReference", rhsDocumentReference), lhsDocumentReference, rhsDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())), ((that.documentReference!= null)&&(!that.documentReference.isEmpty())))) {
                return false;
            }
        }
        {
            ForecastExceptionType lhsForecastException;
            lhsForecastException = this.getForecastException();
            ForecastExceptionType rhsForecastException;
            rhsForecastException = that.getForecastException();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastException", lhsForecastException), LocatorUtils.property(thatLocator, "forecastException", rhsForecastException), lhsForecastException, rhsForecastException, (this.forecastException!= null), (that.forecastException!= null))) {
                return false;
            }
        }
        {
            ItemType lhsSupplyItem;
            lhsSupplyItem = this.getSupplyItem();
            ItemType rhsSupplyItem;
            rhsSupplyItem = that.getSupplyItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplyItem", lhsSupplyItem), LocatorUtils.property(thatLocator, "supplyItem", rhsSupplyItem), lhsSupplyItem, rhsSupplyItem, (this.supplyItem!= null), (that.supplyItem!= null))) {
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
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            ExceptionStatusCodeType theExceptionStatusCode;
            theExceptionStatusCode = this.getExceptionStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exceptionStatusCode", theExceptionStatusCode), currentHashCode, theExceptionStatusCode, (this.exceptionStatusCode!= null));
        }
        {
            CollaborationPriorityCodeType theCollaborationPriorityCode;
            theCollaborationPriorityCode = this.getCollaborationPriorityCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "collaborationPriorityCode", theCollaborationPriorityCode), currentHashCode, theCollaborationPriorityCode, (this.collaborationPriorityCode!= null));
        }
        {
            ResolutionCodeType theResolutionCode;
            theResolutionCode = this.getResolutionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resolutionCode", theResolutionCode), currentHashCode, theResolutionCode, (this.resolutionCode!= null));
        }
        {
            ComparedValueMeasureType theComparedValueMeasure;
            theComparedValueMeasure = this.getComparedValueMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comparedValueMeasure", theComparedValueMeasure), currentHashCode, theComparedValueMeasure, (this.comparedValueMeasure!= null));
        }
        {
            SourceValueMeasureType theSourceValueMeasure;
            theSourceValueMeasure = this.getSourceValueMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceValueMeasure", theSourceValueMeasure), currentHashCode, theSourceValueMeasure, (this.sourceValueMeasure!= null));
        }
        {
            VarianceQuantityType theVarianceQuantity;
            theVarianceQuantity = this.getVarianceQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "varianceQuantity", theVarianceQuantity), currentHashCode, theVarianceQuantity, (this.varianceQuantity!= null));
        }
        {
            SupplyChainActivityTypeCodeType theSupplyChainActivityTypeCode;
            theSupplyChainActivityTypeCode = this.getSupplyChainActivityTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplyChainActivityTypeCode", theSupplyChainActivityTypeCode), currentHashCode, theSupplyChainActivityTypeCode, (this.supplyChainActivityTypeCode!= null));
        }
        {
            PerformanceMetricTypeCodeType thePerformanceMetricTypeCode;
            thePerformanceMetricTypeCode = this.getPerformanceMetricTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "performanceMetricTypeCode", thePerformanceMetricTypeCode), currentHashCode, thePerformanceMetricTypeCode, (this.performanceMetricTypeCode!= null));
        }
        {
            PeriodType theExceptionObservationPeriod;
            theExceptionObservationPeriod = this.getExceptionObservationPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exceptionObservationPeriod", theExceptionObservationPeriod), currentHashCode, theExceptionObservationPeriod, (this.exceptionObservationPeriod!= null));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentReference", theDocumentReference), currentHashCode, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            ForecastExceptionType theForecastException;
            theForecastException = this.getForecastException();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastException", theForecastException), currentHashCode, theForecastException, (this.forecastException!= null));
        }
        {
            ItemType theSupplyItem;
            theSupplyItem = this.getSupplyItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplyItem", theSupplyItem), currentHashCode, theSupplyItem, (this.supplyItem!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
