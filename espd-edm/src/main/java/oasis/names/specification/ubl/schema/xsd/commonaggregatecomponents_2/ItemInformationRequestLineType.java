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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PerformanceMetricTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SupplyChainActivityTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TimeFrequencyCodeType;
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
 * <p>Classe Java per ItemInformationRequestLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ItemInformationRequestLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimeFrequencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SupplyChainActivityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForecastTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerformanceMetricTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SalesItem" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemInformationRequestLineType", propOrder = {
    "timeFrequencyCode",
    "supplyChainActivityTypeCode",
    "forecastTypeCode",
    "performanceMetricTypeCode",
    "period",
    "salesItem"
})
public class ItemInformationRequestLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "TimeFrequencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TimeFrequencyCodeType timeFrequencyCode;
    @XmlElement(name = "SupplyChainActivityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SupplyChainActivityTypeCodeType supplyChainActivityTypeCode;
    @XmlElement(name = "ForecastTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ForecastTypeCodeType forecastTypeCode;
    @XmlElement(name = "PerformanceMetricTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PerformanceMetricTypeCodeType performanceMetricTypeCode;
    @XmlElement(name = "Period", required = true)
    protected List<PeriodType> period;
    @XmlElement(name = "SalesItem", required = true)
    protected List<SalesItemType> salesItem;

    /**
     * Recupera il valore della proprietà timeFrequencyCode.
     * 
     * @return
     *     possible object is
     *     {@link TimeFrequencyCodeType }
     *     
     */
    public TimeFrequencyCodeType getTimeFrequencyCode() {
        return timeFrequencyCode;
    }

    /**
     * Imposta il valore della proprietà timeFrequencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrequencyCodeType }
     *     
     */
    public void setTimeFrequencyCode(TimeFrequencyCodeType value) {
        this.timeFrequencyCode = value;
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
     * Gets the value of the period property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the period property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getPeriod() {
        if (period == null) {
            period = new ArrayList<PeriodType>();
        }
        return this.period;
    }

    /**
     * Gets the value of the salesItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesItemType }
     * 
     * 
     */
    public List<SalesItemType> getSalesItem() {
        if (salesItem == null) {
            salesItem = new ArrayList<SalesItemType>();
        }
        return this.salesItem;
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
            TimeFrequencyCodeType theTimeFrequencyCode;
            theTimeFrequencyCode = this.getTimeFrequencyCode();
            strategy.appendField(locator, this, "timeFrequencyCode", buffer, theTimeFrequencyCode, (this.timeFrequencyCode!= null));
        }
        {
            SupplyChainActivityTypeCodeType theSupplyChainActivityTypeCode;
            theSupplyChainActivityTypeCode = this.getSupplyChainActivityTypeCode();
            strategy.appendField(locator, this, "supplyChainActivityTypeCode", buffer, theSupplyChainActivityTypeCode, (this.supplyChainActivityTypeCode!= null));
        }
        {
            ForecastTypeCodeType theForecastTypeCode;
            theForecastTypeCode = this.getForecastTypeCode();
            strategy.appendField(locator, this, "forecastTypeCode", buffer, theForecastTypeCode, (this.forecastTypeCode!= null));
        }
        {
            PerformanceMetricTypeCodeType thePerformanceMetricTypeCode;
            thePerformanceMetricTypeCode = this.getPerformanceMetricTypeCode();
            strategy.appendField(locator, this, "performanceMetricTypeCode", buffer, thePerformanceMetricTypeCode, (this.performanceMetricTypeCode!= null));
        }
        {
            List<PeriodType> thePeriod;
            thePeriod = (((this.period!= null)&&(!this.period.isEmpty()))?this.getPeriod():null);
            strategy.appendField(locator, this, "period", buffer, thePeriod, ((this.period!= null)&&(!this.period.isEmpty())));
        }
        {
            List<SalesItemType> theSalesItem;
            theSalesItem = (((this.salesItem!= null)&&(!this.salesItem.isEmpty()))?this.getSalesItem():null);
            strategy.appendField(locator, this, "salesItem", buffer, theSalesItem, ((this.salesItem!= null)&&(!this.salesItem.isEmpty())));
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
        final ItemInformationRequestLineType that = ((ItemInformationRequestLineType) object);
        {
            TimeFrequencyCodeType lhsTimeFrequencyCode;
            lhsTimeFrequencyCode = this.getTimeFrequencyCode();
            TimeFrequencyCodeType rhsTimeFrequencyCode;
            rhsTimeFrequencyCode = that.getTimeFrequencyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeFrequencyCode", lhsTimeFrequencyCode), LocatorUtils.property(thatLocator, "timeFrequencyCode", rhsTimeFrequencyCode), lhsTimeFrequencyCode, rhsTimeFrequencyCode, (this.timeFrequencyCode!= null), (that.timeFrequencyCode!= null))) {
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
            ForecastTypeCodeType lhsForecastTypeCode;
            lhsForecastTypeCode = this.getForecastTypeCode();
            ForecastTypeCodeType rhsForecastTypeCode;
            rhsForecastTypeCode = that.getForecastTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "forecastTypeCode", lhsForecastTypeCode), LocatorUtils.property(thatLocator, "forecastTypeCode", rhsForecastTypeCode), lhsForecastTypeCode, rhsForecastTypeCode, (this.forecastTypeCode!= null), (that.forecastTypeCode!= null))) {
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
            List<PeriodType> lhsPeriod;
            lhsPeriod = (((this.period!= null)&&(!this.period.isEmpty()))?this.getPeriod():null);
            List<PeriodType> rhsPeriod;
            rhsPeriod = (((that.period!= null)&&(!that.period.isEmpty()))?that.getPeriod():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "period", lhsPeriod), LocatorUtils.property(thatLocator, "period", rhsPeriod), lhsPeriod, rhsPeriod, ((this.period!= null)&&(!this.period.isEmpty())), ((that.period!= null)&&(!that.period.isEmpty())))) {
                return false;
            }
        }
        {
            List<SalesItemType> lhsSalesItem;
            lhsSalesItem = (((this.salesItem!= null)&&(!this.salesItem.isEmpty()))?this.getSalesItem():null);
            List<SalesItemType> rhsSalesItem;
            rhsSalesItem = (((that.salesItem!= null)&&(!that.salesItem.isEmpty()))?that.getSalesItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesItem", lhsSalesItem), LocatorUtils.property(thatLocator, "salesItem", rhsSalesItem), lhsSalesItem, rhsSalesItem, ((this.salesItem!= null)&&(!this.salesItem.isEmpty())), ((that.salesItem!= null)&&(!that.salesItem.isEmpty())))) {
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
            TimeFrequencyCodeType theTimeFrequencyCode;
            theTimeFrequencyCode = this.getTimeFrequencyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeFrequencyCode", theTimeFrequencyCode), currentHashCode, theTimeFrequencyCode, (this.timeFrequencyCode!= null));
        }
        {
            SupplyChainActivityTypeCodeType theSupplyChainActivityTypeCode;
            theSupplyChainActivityTypeCode = this.getSupplyChainActivityTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplyChainActivityTypeCode", theSupplyChainActivityTypeCode), currentHashCode, theSupplyChainActivityTypeCode, (this.supplyChainActivityTypeCode!= null));
        }
        {
            ForecastTypeCodeType theForecastTypeCode;
            theForecastTypeCode = this.getForecastTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "forecastTypeCode", theForecastTypeCode), currentHashCode, theForecastTypeCode, (this.forecastTypeCode!= null));
        }
        {
            PerformanceMetricTypeCodeType thePerformanceMetricTypeCode;
            thePerformanceMetricTypeCode = this.getPerformanceMetricTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "performanceMetricTypeCode", thePerformanceMetricTypeCode), currentHashCode, thePerformanceMetricTypeCode, (this.performanceMetricTypeCode!= null));
        }
        {
            List<PeriodType> thePeriod;
            thePeriod = (((this.period!= null)&&(!this.period.isEmpty()))?this.getPeriod():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "period", thePeriod), currentHashCode, thePeriod, ((this.period!= null)&&(!this.period.isEmpty())));
        }
        {
            List<SalesItemType> theSalesItem;
            theSalesItem = (((this.salesItem!= null)&&(!this.salesItem.isEmpty()))?this.getSalesItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesItem", theSalesItem), currentHashCode, theSalesItem, ((this.salesItem!= null)&&(!this.salesItem.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
