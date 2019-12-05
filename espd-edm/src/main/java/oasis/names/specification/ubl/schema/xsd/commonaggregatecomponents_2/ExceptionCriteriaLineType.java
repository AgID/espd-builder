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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExceptionResolutionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExceptionStatusCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PerformanceMetricTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SupplyChainActivityTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ThresholdQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ThresholdValueComparisonCodeType;
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
 * <p>Classe Java per ExceptionCriteriaLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ExceptionCriteriaLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThresholdValueComparisonCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThresholdQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExceptionStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CollaborationPriorityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExceptionResolutionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SupplyChainActivityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerformanceMetricTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EffectivePeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplyItem" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ForecastExceptionCriterionLine" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionCriteriaLineType", propOrder = {
    "id",
    "note",
    "thresholdValueComparisonCode",
    "thresholdQuantity",
    "exceptionStatusCode",
    "collaborationPriorityCode",
    "exceptionResolutionCode",
    "supplyChainActivityTypeCode",
    "performanceMetricTypeCode",
    "effectivePeriod",
    "supplyItem",
    "forecastExceptionCriterionLine"
})
public class ExceptionCriteriaLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "ThresholdValueComparisonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ThresholdValueComparisonCodeType thresholdValueComparisonCode;
    @XmlElement(name = "ThresholdQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ThresholdQuantityType thresholdQuantity;
    @XmlElement(name = "ExceptionStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExceptionStatusCodeType exceptionStatusCode;
    @XmlElement(name = "CollaborationPriorityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CollaborationPriorityCodeType collaborationPriorityCode;
    @XmlElement(name = "ExceptionResolutionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExceptionResolutionCodeType exceptionResolutionCode;
    @XmlElement(name = "SupplyChainActivityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SupplyChainActivityTypeCodeType supplyChainActivityTypeCode;
    @XmlElement(name = "PerformanceMetricTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PerformanceMetricTypeCodeType performanceMetricTypeCode;
    @XmlElement(name = "EffectivePeriod")
    protected PeriodType effectivePeriod;
    @XmlElement(name = "SupplyItem", required = true)
    protected List<ItemType> supplyItem;
    @XmlElement(name = "ForecastExceptionCriterionLine")
    protected ForecastExceptionCriterionLineType forecastExceptionCriterionLine;

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
     * Recupera il valore della proprietà thresholdValueComparisonCode.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdValueComparisonCodeType }
     *     
     */
    public ThresholdValueComparisonCodeType getThresholdValueComparisonCode() {
        return thresholdValueComparisonCode;
    }

    /**
     * Imposta il valore della proprietà thresholdValueComparisonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdValueComparisonCodeType }
     *     
     */
    public void setThresholdValueComparisonCode(ThresholdValueComparisonCodeType value) {
        this.thresholdValueComparisonCode = value;
    }

    /**
     * Recupera il valore della proprietà thresholdQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdQuantityType }
     *     
     */
    public ThresholdQuantityType getThresholdQuantity() {
        return thresholdQuantity;
    }

    /**
     * Imposta il valore della proprietà thresholdQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdQuantityType }
     *     
     */
    public void setThresholdQuantity(ThresholdQuantityType value) {
        this.thresholdQuantity = value;
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
     * Recupera il valore della proprietà exceptionResolutionCode.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionResolutionCodeType }
     *     
     */
    public ExceptionResolutionCodeType getExceptionResolutionCode() {
        return exceptionResolutionCode;
    }

    /**
     * Imposta il valore della proprietà exceptionResolutionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionResolutionCodeType }
     *     
     */
    public void setExceptionResolutionCode(ExceptionResolutionCodeType value) {
        this.exceptionResolutionCode = value;
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
     * Recupera il valore della proprietà effectivePeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Imposta il valore della proprietà effectivePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEffectivePeriod(PeriodType value) {
        this.effectivePeriod = value;
    }

    /**
     * Gets the value of the supplyItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplyItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplyItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType }
     * 
     * 
     */
    public List<ItemType> getSupplyItem() {
        if (supplyItem == null) {
            supplyItem = new ArrayList<ItemType>();
        }
        return this.supplyItem;
    }

    /**
     * Recupera il valore della proprietà forecastExceptionCriterionLine.
     * 
     * @return
     *     possible object is
     *     {@link ForecastExceptionCriterionLineType }
     *     
     */
    public ForecastExceptionCriterionLineType getForecastExceptionCriterionLine() {
        return forecastExceptionCriterionLine;
    }

    /**
     * Imposta il valore della proprietà forecastExceptionCriterionLine.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastExceptionCriterionLineType }
     *     
     */
    public void setForecastExceptionCriterionLine(ForecastExceptionCriterionLineType value) {
        this.forecastExceptionCriterionLine = value;
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
            ThresholdValueComparisonCodeType theThresholdValueComparisonCode;
            theThresholdValueComparisonCode = this.getThresholdValueComparisonCode();
            strategy.appendField(locator, this, "thresholdValueComparisonCode", buffer, theThresholdValueComparisonCode, (this.thresholdValueComparisonCode!= null));
        }
        {
            ThresholdQuantityType theThresholdQuantity;
            theThresholdQuantity = this.getThresholdQuantity();
            strategy.appendField(locator, this, "thresholdQuantity", buffer, theThresholdQuantity, (this.thresholdQuantity!= null));
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
            ExceptionResolutionCodeType theExceptionResolutionCode;
            theExceptionResolutionCode = this.getExceptionResolutionCode();
            strategy.appendField(locator, this, "exceptionResolutionCode", buffer, theExceptionResolutionCode, (this.exceptionResolutionCode!= null));
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
            PeriodType theEffectivePeriod;
            theEffectivePeriod = this.getEffectivePeriod();
            strategy.appendField(locator, this, "effectivePeriod", buffer, theEffectivePeriod, (this.effectivePeriod!= null));
        }
        {
            List<ItemType> theSupplyItem;
            theSupplyItem = (((this.supplyItem!= null)&&(!this.supplyItem.isEmpty()))?this.getSupplyItem():null);
            strategy.appendField(locator, this, "supplyItem", buffer, theSupplyItem, ((this.supplyItem!= null)&&(!this.supplyItem.isEmpty())));
        }
        {
            ForecastExceptionCriterionLineType theForecastExceptionCriterionLine;
            theForecastExceptionCriterionLine = this.getForecastExceptionCriterionLine();
            strategy.appendField(locator, this, "forecastExceptionCriterionLine", buffer, theForecastExceptionCriterionLine, (this.forecastExceptionCriterionLine!= null));
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
        final ExceptionCriteriaLineType that = ((ExceptionCriteriaLineType) object);
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
            ThresholdValueComparisonCodeType lhsThresholdValueComparisonCode;
            lhsThresholdValueComparisonCode = this.getThresholdValueComparisonCode();
            ThresholdValueComparisonCodeType rhsThresholdValueComparisonCode;
            rhsThresholdValueComparisonCode = that.getThresholdValueComparisonCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thresholdValueComparisonCode", lhsThresholdValueComparisonCode), LocatorUtils.property(thatLocator, "thresholdValueComparisonCode", rhsThresholdValueComparisonCode), lhsThresholdValueComparisonCode, rhsThresholdValueComparisonCode, (this.thresholdValueComparisonCode!= null), (that.thresholdValueComparisonCode!= null))) {
                return false;
            }
        }
        {
            ThresholdQuantityType lhsThresholdQuantity;
            lhsThresholdQuantity = this.getThresholdQuantity();
            ThresholdQuantityType rhsThresholdQuantity;
            rhsThresholdQuantity = that.getThresholdQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thresholdQuantity", lhsThresholdQuantity), LocatorUtils.property(thatLocator, "thresholdQuantity", rhsThresholdQuantity), lhsThresholdQuantity, rhsThresholdQuantity, (this.thresholdQuantity!= null), (that.thresholdQuantity!= null))) {
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
            ExceptionResolutionCodeType lhsExceptionResolutionCode;
            lhsExceptionResolutionCode = this.getExceptionResolutionCode();
            ExceptionResolutionCodeType rhsExceptionResolutionCode;
            rhsExceptionResolutionCode = that.getExceptionResolutionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exceptionResolutionCode", lhsExceptionResolutionCode), LocatorUtils.property(thatLocator, "exceptionResolutionCode", rhsExceptionResolutionCode), lhsExceptionResolutionCode, rhsExceptionResolutionCode, (this.exceptionResolutionCode!= null), (that.exceptionResolutionCode!= null))) {
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
            PeriodType lhsEffectivePeriod;
            lhsEffectivePeriod = this.getEffectivePeriod();
            PeriodType rhsEffectivePeriod;
            rhsEffectivePeriod = that.getEffectivePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "effectivePeriod", lhsEffectivePeriod), LocatorUtils.property(thatLocator, "effectivePeriod", rhsEffectivePeriod), lhsEffectivePeriod, rhsEffectivePeriod, (this.effectivePeriod!= null), (that.effectivePeriod!= null))) {
                return false;
            }
        }
        {
            List<ItemType> lhsSupplyItem;
            lhsSupplyItem = (((this.supplyItem!= null)&&(!this.supplyItem.isEmpty()))?this.getSupplyItem():null);
            List<ItemType> rhsSupplyItem;
            rhsSupplyItem = (((that.supplyItem!= null)&&(!that.supplyItem.isEmpty()))?that.getSupplyItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplyItem", lhsSupplyItem), LocatorUtils.property(thatLocator, "supplyItem", rhsSupplyItem), lhsSupplyItem, rhsSupplyItem, ((this.supplyItem!= null)&&(!this.supplyItem.isEmpty())), ((that.supplyItem!= null)&&(!that.supplyItem.isEmpty())))) {
                return false;
            }
        }
        {
            ForecastExceptionCriterionLineType lhsForecastExceptionCriterionLine;
            lhsForecastExceptionCriterionLine = this.getForecastExceptionCriterionLine();
            ForecastExceptionCriterionLineType rhsForecastExceptionCriterionLine;
            rhsForecastExceptionCriterionLine = that.getForecastExceptionCriterionLine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastExceptionCriterionLine", lhsForecastExceptionCriterionLine), LocatorUtils.property(thatLocator, "forecastExceptionCriterionLine", rhsForecastExceptionCriterionLine), lhsForecastExceptionCriterionLine, rhsForecastExceptionCriterionLine, (this.forecastExceptionCriterionLine!= null), (that.forecastExceptionCriterionLine!= null))) {
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
            ThresholdValueComparisonCodeType theThresholdValueComparisonCode;
            theThresholdValueComparisonCode = this.getThresholdValueComparisonCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "thresholdValueComparisonCode", theThresholdValueComparisonCode), currentHashCode, theThresholdValueComparisonCode, (this.thresholdValueComparisonCode!= null));
        }
        {
            ThresholdQuantityType theThresholdQuantity;
            theThresholdQuantity = this.getThresholdQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "thresholdQuantity", theThresholdQuantity), currentHashCode, theThresholdQuantity, (this.thresholdQuantity!= null));
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
            ExceptionResolutionCodeType theExceptionResolutionCode;
            theExceptionResolutionCode = this.getExceptionResolutionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exceptionResolutionCode", theExceptionResolutionCode), currentHashCode, theExceptionResolutionCode, (this.exceptionResolutionCode!= null));
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
            PeriodType theEffectivePeriod;
            theEffectivePeriod = this.getEffectivePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "effectivePeriod", theEffectivePeriod), currentHashCode, theEffectivePeriod, (this.effectivePeriod!= null));
        }
        {
            List<ItemType> theSupplyItem;
            theSupplyItem = (((this.supplyItem!= null)&&(!this.supplyItem.isEmpty()))?this.getSupplyItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplyItem", theSupplyItem), currentHashCode, theSupplyItem, ((this.supplyItem!= null)&&(!this.supplyItem.isEmpty())));
        }
        {
            ForecastExceptionCriterionLineType theForecastExceptionCriterionLine;
            theForecastExceptionCriterionLine = this.getForecastExceptionCriterionLine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastExceptionCriterionLine", theForecastExceptionCriterionLine), currentHashCode, theForecastExceptionCriterionLine, (this.forecastExceptionCriterionLine!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
