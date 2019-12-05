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
 * <p>Classe Java per EnergyWaterSupplyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EnergyWaterSupplyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsumptionReport" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnergyTaxReport" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsumptionAverage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnergyWaterConsumptionCorrection" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyWaterSupplyType", propOrder = {
    "consumptionReport",
    "energyTaxReport",
    "consumptionAverage",
    "energyWaterConsumptionCorrection"
})
public class EnergyWaterSupplyType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ConsumptionReport")
    protected List<ConsumptionReportType> consumptionReport;
    @XmlElement(name = "EnergyTaxReport")
    protected List<EnergyTaxReportType> energyTaxReport;
    @XmlElement(name = "ConsumptionAverage")
    protected List<ConsumptionAverageType> consumptionAverage;
    @XmlElement(name = "EnergyWaterConsumptionCorrection")
    protected List<ConsumptionCorrectionType> energyWaterConsumptionCorrection;

    /**
     * Gets the value of the consumptionReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionReportType }
     * 
     * 
     */
    public List<ConsumptionReportType> getConsumptionReport() {
        if (consumptionReport == null) {
            consumptionReport = new ArrayList<ConsumptionReportType>();
        }
        return this.consumptionReport;
    }

    /**
     * Gets the value of the energyTaxReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energyTaxReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergyTaxReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnergyTaxReportType }
     * 
     * 
     */
    public List<EnergyTaxReportType> getEnergyTaxReport() {
        if (energyTaxReport == null) {
            energyTaxReport = new ArrayList<EnergyTaxReportType>();
        }
        return this.energyTaxReport;
    }

    /**
     * Gets the value of the consumptionAverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionAverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionAverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionAverageType }
     * 
     * 
     */
    public List<ConsumptionAverageType> getConsumptionAverage() {
        if (consumptionAverage == null) {
            consumptionAverage = new ArrayList<ConsumptionAverageType>();
        }
        return this.consumptionAverage;
    }

    /**
     * Gets the value of the energyWaterConsumptionCorrection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the energyWaterConsumptionCorrection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnergyWaterConsumptionCorrection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCorrectionType }
     * 
     * 
     */
    public List<ConsumptionCorrectionType> getEnergyWaterConsumptionCorrection() {
        if (energyWaterConsumptionCorrection == null) {
            energyWaterConsumptionCorrection = new ArrayList<ConsumptionCorrectionType>();
        }
        return this.energyWaterConsumptionCorrection;
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
            List<ConsumptionReportType> theConsumptionReport;
            theConsumptionReport = (((this.consumptionReport!= null)&&(!this.consumptionReport.isEmpty()))?this.getConsumptionReport():null);
            strategy.appendField(locator, this, "consumptionReport", buffer, theConsumptionReport, ((this.consumptionReport!= null)&&(!this.consumptionReport.isEmpty())));
        }
        {
            List<EnergyTaxReportType> theEnergyTaxReport;
            theEnergyTaxReport = (((this.energyTaxReport!= null)&&(!this.energyTaxReport.isEmpty()))?this.getEnergyTaxReport():null);
            strategy.appendField(locator, this, "energyTaxReport", buffer, theEnergyTaxReport, ((this.energyTaxReport!= null)&&(!this.energyTaxReport.isEmpty())));
        }
        {
            List<ConsumptionAverageType> theConsumptionAverage;
            theConsumptionAverage = (((this.consumptionAverage!= null)&&(!this.consumptionAverage.isEmpty()))?this.getConsumptionAverage():null);
            strategy.appendField(locator, this, "consumptionAverage", buffer, theConsumptionAverage, ((this.consumptionAverage!= null)&&(!this.consumptionAverage.isEmpty())));
        }
        {
            List<ConsumptionCorrectionType> theEnergyWaterConsumptionCorrection;
            theEnergyWaterConsumptionCorrection = (((this.energyWaterConsumptionCorrection!= null)&&(!this.energyWaterConsumptionCorrection.isEmpty()))?this.getEnergyWaterConsumptionCorrection():null);
            strategy.appendField(locator, this, "energyWaterConsumptionCorrection", buffer, theEnergyWaterConsumptionCorrection, ((this.energyWaterConsumptionCorrection!= null)&&(!this.energyWaterConsumptionCorrection.isEmpty())));
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
        final EnergyWaterSupplyType that = ((EnergyWaterSupplyType) object);
        {
            List<ConsumptionReportType> lhsConsumptionReport;
            lhsConsumptionReport = (((this.consumptionReport!= null)&&(!this.consumptionReport.isEmpty()))?this.getConsumptionReport():null);
            List<ConsumptionReportType> rhsConsumptionReport;
            rhsConsumptionReport = (((that.consumptionReport!= null)&&(!that.consumptionReport.isEmpty()))?that.getConsumptionReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionReport", lhsConsumptionReport), LocatorUtils.property(thatLocator, "consumptionReport", rhsConsumptionReport), lhsConsumptionReport, rhsConsumptionReport, ((this.consumptionReport!= null)&&(!this.consumptionReport.isEmpty())), ((that.consumptionReport!= null)&&(!that.consumptionReport.isEmpty())))) {
                return false;
            }
        }
        {
            List<EnergyTaxReportType> lhsEnergyTaxReport;
            lhsEnergyTaxReport = (((this.energyTaxReport!= null)&&(!this.energyTaxReport.isEmpty()))?this.getEnergyTaxReport():null);
            List<EnergyTaxReportType> rhsEnergyTaxReport;
            rhsEnergyTaxReport = (((that.energyTaxReport!= null)&&(!that.energyTaxReport.isEmpty()))?that.getEnergyTaxReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyTaxReport", lhsEnergyTaxReport), LocatorUtils.property(thatLocator, "energyTaxReport", rhsEnergyTaxReport), lhsEnergyTaxReport, rhsEnergyTaxReport, ((this.energyTaxReport!= null)&&(!this.energyTaxReport.isEmpty())), ((that.energyTaxReport!= null)&&(!that.energyTaxReport.isEmpty())))) {
                return false;
            }
        }
        {
            List<ConsumptionAverageType> lhsConsumptionAverage;
            lhsConsumptionAverage = (((this.consumptionAverage!= null)&&(!this.consumptionAverage.isEmpty()))?this.getConsumptionAverage():null);
            List<ConsumptionAverageType> rhsConsumptionAverage;
            rhsConsumptionAverage = (((that.consumptionAverage!= null)&&(!that.consumptionAverage.isEmpty()))?that.getConsumptionAverage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionAverage", lhsConsumptionAverage), LocatorUtils.property(thatLocator, "consumptionAverage", rhsConsumptionAverage), lhsConsumptionAverage, rhsConsumptionAverage, ((this.consumptionAverage!= null)&&(!this.consumptionAverage.isEmpty())), ((that.consumptionAverage!= null)&&(!that.consumptionAverage.isEmpty())))) {
                return false;
            }
        }
        {
            List<ConsumptionCorrectionType> lhsEnergyWaterConsumptionCorrection;
            lhsEnergyWaterConsumptionCorrection = (((this.energyWaterConsumptionCorrection!= null)&&(!this.energyWaterConsumptionCorrection.isEmpty()))?this.getEnergyWaterConsumptionCorrection():null);
            List<ConsumptionCorrectionType> rhsEnergyWaterConsumptionCorrection;
            rhsEnergyWaterConsumptionCorrection = (((that.energyWaterConsumptionCorrection!= null)&&(!that.energyWaterConsumptionCorrection.isEmpty()))?that.getEnergyWaterConsumptionCorrection():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyWaterConsumptionCorrection", lhsEnergyWaterConsumptionCorrection), LocatorUtils.property(thatLocator, "energyWaterConsumptionCorrection", rhsEnergyWaterConsumptionCorrection), lhsEnergyWaterConsumptionCorrection, rhsEnergyWaterConsumptionCorrection, ((this.energyWaterConsumptionCorrection!= null)&&(!this.energyWaterConsumptionCorrection.isEmpty())), ((that.energyWaterConsumptionCorrection!= null)&&(!that.energyWaterConsumptionCorrection.isEmpty())))) {
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
            List<ConsumptionReportType> theConsumptionReport;
            theConsumptionReport = (((this.consumptionReport!= null)&&(!this.consumptionReport.isEmpty()))?this.getConsumptionReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionReport", theConsumptionReport), currentHashCode, theConsumptionReport, ((this.consumptionReport!= null)&&(!this.consumptionReport.isEmpty())));
        }
        {
            List<EnergyTaxReportType> theEnergyTaxReport;
            theEnergyTaxReport = (((this.energyTaxReport!= null)&&(!this.energyTaxReport.isEmpty()))?this.getEnergyTaxReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "energyTaxReport", theEnergyTaxReport), currentHashCode, theEnergyTaxReport, ((this.energyTaxReport!= null)&&(!this.energyTaxReport.isEmpty())));
        }
        {
            List<ConsumptionAverageType> theConsumptionAverage;
            theConsumptionAverage = (((this.consumptionAverage!= null)&&(!this.consumptionAverage.isEmpty()))?this.getConsumptionAverage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionAverage", theConsumptionAverage), currentHashCode, theConsumptionAverage, ((this.consumptionAverage!= null)&&(!this.consumptionAverage.isEmpty())));
        }
        {
            List<ConsumptionCorrectionType> theEnergyWaterConsumptionCorrection;
            theEnergyWaterConsumptionCorrection = (((this.energyWaterConsumptionCorrection!= null)&&(!this.energyWaterConsumptionCorrection.isEmpty()))?this.getEnergyWaterConsumptionCorrection():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "energyWaterConsumptionCorrection", theEnergyWaterConsumptionCorrection), currentHashCode, theEnergyWaterConsumptionCorrection, ((this.energyWaterConsumptionCorrection!= null)&&(!this.energyWaterConsumptionCorrection.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
