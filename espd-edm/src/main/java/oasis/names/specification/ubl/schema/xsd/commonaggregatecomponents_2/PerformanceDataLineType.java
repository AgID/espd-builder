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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PerformanceMetricTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PerformanceValueQuantityType;
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
 * <p>Classe Java per PerformanceDataLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PerformanceDataLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerformanceValueQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerformanceMetricTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceDataLineType", propOrder = {
    "id",
    "note",
    "performanceValueQuantity",
    "performanceMetricTypeCode",
    "period",
    "item"
})
public class PerformanceDataLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "PerformanceValueQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PerformanceValueQuantityType performanceValueQuantity;
    @XmlElement(name = "PerformanceMetricTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PerformanceMetricTypeCodeType performanceMetricTypeCode;
    @XmlElement(name = "Period")
    protected PeriodType period;
    @XmlElement(name = "Item")
    protected ItemType item;

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
     * Recupera il valore della proprietà performanceValueQuantity.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceValueQuantityType }
     *     
     */
    public PerformanceValueQuantityType getPerformanceValueQuantity() {
        return performanceValueQuantity;
    }

    /**
     * Imposta il valore della proprietà performanceValueQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceValueQuantityType }
     *     
     */
    public void setPerformanceValueQuantity(PerformanceValueQuantityType value) {
        this.performanceValueQuantity = value;
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
     * Recupera il valore della proprietà item.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Imposta il valore della proprietà item.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
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
            PerformanceValueQuantityType thePerformanceValueQuantity;
            thePerformanceValueQuantity = this.getPerformanceValueQuantity();
            strategy.appendField(locator, this, "performanceValueQuantity", buffer, thePerformanceValueQuantity, (this.performanceValueQuantity!= null));
        }
        {
            PerformanceMetricTypeCodeType thePerformanceMetricTypeCode;
            thePerformanceMetricTypeCode = this.getPerformanceMetricTypeCode();
            strategy.appendField(locator, this, "performanceMetricTypeCode", buffer, thePerformanceMetricTypeCode, (this.performanceMetricTypeCode!= null));
        }
        {
            PeriodType thePeriod;
            thePeriod = this.getPeriod();
            strategy.appendField(locator, this, "period", buffer, thePeriod, (this.period!= null));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            strategy.appendField(locator, this, "item", buffer, theItem, (this.item!= null));
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
        final PerformanceDataLineType that = ((PerformanceDataLineType) object);
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
            PerformanceValueQuantityType lhsPerformanceValueQuantity;
            lhsPerformanceValueQuantity = this.getPerformanceValueQuantity();
            PerformanceValueQuantityType rhsPerformanceValueQuantity;
            rhsPerformanceValueQuantity = that.getPerformanceValueQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "performanceValueQuantity", lhsPerformanceValueQuantity), LocatorUtils.property(thatLocator, "performanceValueQuantity", rhsPerformanceValueQuantity), lhsPerformanceValueQuantity, rhsPerformanceValueQuantity, (this.performanceValueQuantity!= null), (that.performanceValueQuantity!= null))) {
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
            PeriodType lhsPeriod;
            lhsPeriod = this.getPeriod();
            PeriodType rhsPeriod;
            rhsPeriod = that.getPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "period", lhsPeriod), LocatorUtils.property(thatLocator, "period", rhsPeriod), lhsPeriod, rhsPeriod, (this.period!= null), (that.period!= null))) {
                return false;
            }
        }
        {
            ItemType lhsItem;
            lhsItem = this.getItem();
            ItemType rhsItem;
            rhsItem = that.getItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "item", lhsItem), LocatorUtils.property(thatLocator, "item", rhsItem), lhsItem, rhsItem, (this.item!= null), (that.item!= null))) {
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
            PerformanceValueQuantityType thePerformanceValueQuantity;
            thePerformanceValueQuantity = this.getPerformanceValueQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "performanceValueQuantity", thePerformanceValueQuantity), currentHashCode, thePerformanceValueQuantity, (this.performanceValueQuantity!= null));
        }
        {
            PerformanceMetricTypeCodeType thePerformanceMetricTypeCode;
            thePerformanceMetricTypeCode = this.getPerformanceMetricTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "performanceMetricTypeCode", thePerformanceMetricTypeCode), currentHashCode, thePerformanceMetricTypeCode, (this.performanceMetricTypeCode!= null));
        }
        {
            PeriodType thePeriod;
            thePeriod = this.getPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "period", thePeriod), currentHashCode, thePeriod, (this.period!= null));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "item", theItem), currentHashCode, theItem, (this.item!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
