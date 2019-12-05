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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ForecastTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FrozenDocumentIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
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
 * <p>Classe Java per ForecastLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ForecastLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FrozenDocumentIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForecastTypeCode"/&gt;
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
@XmlType(name = "ForecastLineType", propOrder = {
    "id",
    "note",
    "frozenDocumentIndicator",
    "forecastTypeCode",
    "forecastPeriod",
    "salesItem"
})
public class ForecastLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "FrozenDocumentIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FrozenDocumentIndicatorType frozenDocumentIndicator;
    @XmlElement(name = "ForecastTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ForecastTypeCodeType forecastTypeCode;
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
     * Recupera il valore della proprietà frozenDocumentIndicator.
     * 
     * @return
     *     possible object is
     *     {@link FrozenDocumentIndicatorType }
     *     
     */
    public FrozenDocumentIndicatorType getFrozenDocumentIndicator() {
        return frozenDocumentIndicator;
    }

    /**
     * Imposta il valore della proprietà frozenDocumentIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link FrozenDocumentIndicatorType }
     *     
     */
    public void setFrozenDocumentIndicator(FrozenDocumentIndicatorType value) {
        this.frozenDocumentIndicator = value;
    }

    /**
     * Recupera il valore della proprietà forecastTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ForecastTypeCodeType }
     *     
     */
    public ForecastTypeCodeType getForecastTypeCode() {
        return forecastTypeCode;
    }

    /**
     * Imposta il valore della proprietà forecastTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastTypeCodeType }
     *     
     */
    public void setForecastTypeCode(ForecastTypeCodeType value) {
        this.forecastTypeCode = value;
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
            FrozenDocumentIndicatorType theFrozenDocumentIndicator;
            theFrozenDocumentIndicator = this.getFrozenDocumentIndicator();
            strategy.appendField(locator, this, "frozenDocumentIndicator", buffer, theFrozenDocumentIndicator, (this.frozenDocumentIndicator!= null));
        }
        {
            ForecastTypeCodeType theForecastTypeCode;
            theForecastTypeCode = this.getForecastTypeCode();
            strategy.appendField(locator, this, "forecastTypeCode", buffer, theForecastTypeCode, (this.forecastTypeCode!= null));
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
        final ForecastLineType that = ((ForecastLineType) object);
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
            FrozenDocumentIndicatorType lhsFrozenDocumentIndicator;
            lhsFrozenDocumentIndicator = this.getFrozenDocumentIndicator();
            FrozenDocumentIndicatorType rhsFrozenDocumentIndicator;
            rhsFrozenDocumentIndicator = that.getFrozenDocumentIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frozenDocumentIndicator", lhsFrozenDocumentIndicator), LocatorUtils.property(thatLocator, "frozenDocumentIndicator", rhsFrozenDocumentIndicator), lhsFrozenDocumentIndicator, rhsFrozenDocumentIndicator, (this.frozenDocumentIndicator!= null), (that.frozenDocumentIndicator!= null))) {
                return false;
            }
        }
        {
            ForecastTypeCodeType lhsForecastTypeCode;
            lhsForecastTypeCode = this.getForecastTypeCode();
            ForecastTypeCodeType rhsForecastTypeCode;
            rhsForecastTypeCode = that.getForecastTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastTypeCode", lhsForecastTypeCode), LocatorUtils.property(thatLocator, "forecastTypeCode", rhsForecastTypeCode), lhsForecastTypeCode, rhsForecastTypeCode, (this.forecastTypeCode!= null), (that.forecastTypeCode!= null))) {
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
            FrozenDocumentIndicatorType theFrozenDocumentIndicator;
            theFrozenDocumentIndicator = this.getFrozenDocumentIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frozenDocumentIndicator", theFrozenDocumentIndicator), currentHashCode, theFrozenDocumentIndicator, (this.frozenDocumentIndicator!= null));
        }
        {
            ForecastTypeCodeType theForecastTypeCode;
            theForecastTypeCode = this.getForecastTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastTypeCode", theForecastTypeCode), currentHashCode, theForecastTypeCode, (this.forecastTypeCode!= null));
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
