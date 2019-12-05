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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AdjustmentReasonCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RevisedForecastLineIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SourceForecastIssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SourceForecastIssueTimeType;
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
 * <p>Classe Java per ForecastRevisionLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ForecastRevisionLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RevisedForecastLineID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceForecastIssueDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceForecastIssueTime"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdjustmentReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ForecastPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SalesItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastRevisionLineType", propOrder = {
    "id",
    "note",
    "description",
    "revisedForecastLineID",
    "sourceForecastIssueDate",
    "sourceForecastIssueTime",
    "adjustmentReasonCode",
    "forecastPeriod",
    "salesItem"
})
public class ForecastRevisionLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "RevisedForecastLineID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected RevisedForecastLineIDType revisedForecastLineID;
    @XmlElement(name = "SourceForecastIssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected SourceForecastIssueDateType sourceForecastIssueDate;
    @XmlElement(name = "SourceForecastIssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected SourceForecastIssueTimeType sourceForecastIssueTime;
    @XmlElement(name = "AdjustmentReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AdjustmentReasonCodeType adjustmentReasonCode;
    @XmlElement(name = "ForecastPeriod")
    protected PeriodType forecastPeriod;
    @XmlElement(name = "SalesItem")
    protected SalesItemType salesItem;

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
     * Recupera il valore della proprietà revisedForecastLineID.
     * 
     * @return
     *     possible object is
     *     {@link RevisedForecastLineIDType }
     *     
     */
    public RevisedForecastLineIDType getRevisedForecastLineID() {
        return revisedForecastLineID;
    }

    /**
     * Imposta il valore della proprietà revisedForecastLineID.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisedForecastLineIDType }
     *     
     */
    public void setRevisedForecastLineID(RevisedForecastLineIDType value) {
        this.revisedForecastLineID = value;
    }

    /**
     * Recupera il valore della proprietà sourceForecastIssueDate.
     * 
     * @return
     *     possible object is
     *     {@link SourceForecastIssueDateType }
     *     
     */
    public SourceForecastIssueDateType getSourceForecastIssueDate() {
        return sourceForecastIssueDate;
    }

    /**
     * Imposta il valore della proprietà sourceForecastIssueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceForecastIssueDateType }
     *     
     */
    public void setSourceForecastIssueDate(SourceForecastIssueDateType value) {
        this.sourceForecastIssueDate = value;
    }

    /**
     * Recupera il valore della proprietà sourceForecastIssueTime.
     * 
     * @return
     *     possible object is
     *     {@link SourceForecastIssueTimeType }
     *     
     */
    public SourceForecastIssueTimeType getSourceForecastIssueTime() {
        return sourceForecastIssueTime;
    }

    /**
     * Imposta il valore della proprietà sourceForecastIssueTime.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceForecastIssueTimeType }
     *     
     */
    public void setSourceForecastIssueTime(SourceForecastIssueTimeType value) {
        this.sourceForecastIssueTime = value;
    }

    /**
     * Recupera il valore della proprietà adjustmentReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentReasonCodeType }
     *     
     */
    public AdjustmentReasonCodeType getAdjustmentReasonCode() {
        return adjustmentReasonCode;
    }

    /**
     * Imposta il valore della proprietà adjustmentReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentReasonCodeType }
     *     
     */
    public void setAdjustmentReasonCode(AdjustmentReasonCodeType value) {
        this.adjustmentReasonCode = value;
    }

    /**
     * Recupera il valore della proprietà forecastPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getForecastPeriod() {
        return forecastPeriod;
    }

    /**
     * Imposta il valore della proprietà forecastPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setForecastPeriod(PeriodType value) {
        this.forecastPeriod = value;
    }

    /**
     * Recupera il valore della proprietà salesItem.
     * 
     * @return
     *     possible object is
     *     {@link SalesItemType }
     *     
     */
    public SalesItemType getSalesItem() {
        return salesItem;
    }

    /**
     * Imposta il valore della proprietà salesItem.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesItemType }
     *     
     */
    public void setSalesItem(SalesItemType value) {
        this.salesItem = value;
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
            RevisedForecastLineIDType theRevisedForecastLineID;
            theRevisedForecastLineID = this.getRevisedForecastLineID();
            strategy.appendField(locator, this, "revisedForecastLineID", buffer, theRevisedForecastLineID, (this.revisedForecastLineID!= null));
        }
        {
            SourceForecastIssueDateType theSourceForecastIssueDate;
            theSourceForecastIssueDate = this.getSourceForecastIssueDate();
            strategy.appendField(locator, this, "sourceForecastIssueDate", buffer, theSourceForecastIssueDate, (this.sourceForecastIssueDate!= null));
        }
        {
            SourceForecastIssueTimeType theSourceForecastIssueTime;
            theSourceForecastIssueTime = this.getSourceForecastIssueTime();
            strategy.appendField(locator, this, "sourceForecastIssueTime", buffer, theSourceForecastIssueTime, (this.sourceForecastIssueTime!= null));
        }
        {
            AdjustmentReasonCodeType theAdjustmentReasonCode;
            theAdjustmentReasonCode = this.getAdjustmentReasonCode();
            strategy.appendField(locator, this, "adjustmentReasonCode", buffer, theAdjustmentReasonCode, (this.adjustmentReasonCode!= null));
        }
        {
            PeriodType theForecastPeriod;
            theForecastPeriod = this.getForecastPeriod();
            strategy.appendField(locator, this, "forecastPeriod", buffer, theForecastPeriod, (this.forecastPeriod!= null));
        }
        {
            SalesItemType theSalesItem;
            theSalesItem = this.getSalesItem();
            strategy.appendField(locator, this, "salesItem", buffer, theSalesItem, (this.salesItem!= null));
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
        final ForecastRevisionLineType that = ((ForecastRevisionLineType) object);
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
            RevisedForecastLineIDType lhsRevisedForecastLineID;
            lhsRevisedForecastLineID = this.getRevisedForecastLineID();
            RevisedForecastLineIDType rhsRevisedForecastLineID;
            rhsRevisedForecastLineID = that.getRevisedForecastLineID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revisedForecastLineID", lhsRevisedForecastLineID), LocatorUtils.property(thatLocator, "revisedForecastLineID", rhsRevisedForecastLineID), lhsRevisedForecastLineID, rhsRevisedForecastLineID, (this.revisedForecastLineID!= null), (that.revisedForecastLineID!= null))) {
                return false;
            }
        }
        {
            SourceForecastIssueDateType lhsSourceForecastIssueDate;
            lhsSourceForecastIssueDate = this.getSourceForecastIssueDate();
            SourceForecastIssueDateType rhsSourceForecastIssueDate;
            rhsSourceForecastIssueDate = that.getSourceForecastIssueDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceForecastIssueDate", lhsSourceForecastIssueDate), LocatorUtils.property(thatLocator, "sourceForecastIssueDate", rhsSourceForecastIssueDate), lhsSourceForecastIssueDate, rhsSourceForecastIssueDate, (this.sourceForecastIssueDate!= null), (that.sourceForecastIssueDate!= null))) {
                return false;
            }
        }
        {
            SourceForecastIssueTimeType lhsSourceForecastIssueTime;
            lhsSourceForecastIssueTime = this.getSourceForecastIssueTime();
            SourceForecastIssueTimeType rhsSourceForecastIssueTime;
            rhsSourceForecastIssueTime = that.getSourceForecastIssueTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceForecastIssueTime", lhsSourceForecastIssueTime), LocatorUtils.property(thatLocator, "sourceForecastIssueTime", rhsSourceForecastIssueTime), lhsSourceForecastIssueTime, rhsSourceForecastIssueTime, (this.sourceForecastIssueTime!= null), (that.sourceForecastIssueTime!= null))) {
                return false;
            }
        }
        {
            AdjustmentReasonCodeType lhsAdjustmentReasonCode;
            lhsAdjustmentReasonCode = this.getAdjustmentReasonCode();
            AdjustmentReasonCodeType rhsAdjustmentReasonCode;
            rhsAdjustmentReasonCode = that.getAdjustmentReasonCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "adjustmentReasonCode", lhsAdjustmentReasonCode), LocatorUtils.property(thatLocator, "adjustmentReasonCode", rhsAdjustmentReasonCode), lhsAdjustmentReasonCode, rhsAdjustmentReasonCode, (this.adjustmentReasonCode!= null), (that.adjustmentReasonCode!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsForecastPeriod;
            lhsForecastPeriod = this.getForecastPeriod();
            PeriodType rhsForecastPeriod;
            rhsForecastPeriod = that.getForecastPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastPeriod", lhsForecastPeriod), LocatorUtils.property(thatLocator, "forecastPeriod", rhsForecastPeriod), lhsForecastPeriod, rhsForecastPeriod, (this.forecastPeriod!= null), (that.forecastPeriod!= null))) {
                return false;
            }
        }
        {
            SalesItemType lhsSalesItem;
            lhsSalesItem = this.getSalesItem();
            SalesItemType rhsSalesItem;
            rhsSalesItem = that.getSalesItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesItem", lhsSalesItem), LocatorUtils.property(thatLocator, "salesItem", rhsSalesItem), lhsSalesItem, rhsSalesItem, (this.salesItem!= null), (that.salesItem!= null))) {
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
            RevisedForecastLineIDType theRevisedForecastLineID;
            theRevisedForecastLineID = this.getRevisedForecastLineID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revisedForecastLineID", theRevisedForecastLineID), currentHashCode, theRevisedForecastLineID, (this.revisedForecastLineID!= null));
        }
        {
            SourceForecastIssueDateType theSourceForecastIssueDate;
            theSourceForecastIssueDate = this.getSourceForecastIssueDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceForecastIssueDate", theSourceForecastIssueDate), currentHashCode, theSourceForecastIssueDate, (this.sourceForecastIssueDate!= null));
        }
        {
            SourceForecastIssueTimeType theSourceForecastIssueTime;
            theSourceForecastIssueTime = this.getSourceForecastIssueTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceForecastIssueTime", theSourceForecastIssueTime), currentHashCode, theSourceForecastIssueTime, (this.sourceForecastIssueTime!= null));
        }
        {
            AdjustmentReasonCodeType theAdjustmentReasonCode;
            theAdjustmentReasonCode = this.getAdjustmentReasonCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "adjustmentReasonCode", theAdjustmentReasonCode), currentHashCode, theAdjustmentReasonCode, (this.adjustmentReasonCode!= null));
        }
        {
            PeriodType theForecastPeriod;
            theForecastPeriod = this.getForecastPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastPeriod", theForecastPeriod), currentHashCode, theForecastPeriod, (this.forecastPeriod!= null));
        }
        {
            SalesItemType theSalesItem;
            theSalesItem = this.getSalesItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesItem", theSalesItem), currentHashCode, theSalesItem, (this.salesItem!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
