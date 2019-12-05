//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CalculationMethodCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FullnessIndicationCodeType;
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
 * <p>Classe Java per EmissionCalculationMethodType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EmissionCalculationMethodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CalculationMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FullnessIndicationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementFromLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementToLocation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmissionCalculationMethodType", propOrder = {
    "calculationMethodCode",
    "fullnessIndicationCode",
    "measurementFromLocation",
    "measurementToLocation"
})
public class EmissionCalculationMethodType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "CalculationMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CalculationMethodCodeType calculationMethodCode;
    @XmlElement(name = "FullnessIndicationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FullnessIndicationCodeType fullnessIndicationCode;
    @XmlElement(name = "MeasurementFromLocation")
    protected LocationType measurementFromLocation;
    @XmlElement(name = "MeasurementToLocation")
    protected LocationType measurementToLocation;

    /**
     * Recupera il valore della proprietà calculationMethodCode.
     * 
     * @return
     *     possible object is
     *     {@link CalculationMethodCodeType }
     *     
     */
    public CalculationMethodCodeType getCalculationMethodCode() {
        return calculationMethodCode;
    }

    /**
     * Imposta il valore della proprietà calculationMethodCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationMethodCodeType }
     *     
     */
    public void setCalculationMethodCode(CalculationMethodCodeType value) {
        this.calculationMethodCode = value;
    }

    /**
     * Recupera il valore della proprietà fullnessIndicationCode.
     * 
     * @return
     *     possible object is
     *     {@link FullnessIndicationCodeType }
     *     
     */
    public FullnessIndicationCodeType getFullnessIndicationCode() {
        return fullnessIndicationCode;
    }

    /**
     * Imposta il valore della proprietà fullnessIndicationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FullnessIndicationCodeType }
     *     
     */
    public void setFullnessIndicationCode(FullnessIndicationCodeType value) {
        this.fullnessIndicationCode = value;
    }

    /**
     * Recupera il valore della proprietà measurementFromLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getMeasurementFromLocation() {
        return measurementFromLocation;
    }

    /**
     * Imposta il valore della proprietà measurementFromLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setMeasurementFromLocation(LocationType value) {
        this.measurementFromLocation = value;
    }

    /**
     * Recupera il valore della proprietà measurementToLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getMeasurementToLocation() {
        return measurementToLocation;
    }

    /**
     * Imposta il valore della proprietà measurementToLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setMeasurementToLocation(LocationType value) {
        this.measurementToLocation = value;
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
            CalculationMethodCodeType theCalculationMethodCode;
            theCalculationMethodCode = this.getCalculationMethodCode();
            strategy.appendField(locator, this, "calculationMethodCode", buffer, theCalculationMethodCode, (this.calculationMethodCode!= null));
        }
        {
            FullnessIndicationCodeType theFullnessIndicationCode;
            theFullnessIndicationCode = this.getFullnessIndicationCode();
            strategy.appendField(locator, this, "fullnessIndicationCode", buffer, theFullnessIndicationCode, (this.fullnessIndicationCode!= null));
        }
        {
            LocationType theMeasurementFromLocation;
            theMeasurementFromLocation = this.getMeasurementFromLocation();
            strategy.appendField(locator, this, "measurementFromLocation", buffer, theMeasurementFromLocation, (this.measurementFromLocation!= null));
        }
        {
            LocationType theMeasurementToLocation;
            theMeasurementToLocation = this.getMeasurementToLocation();
            strategy.appendField(locator, this, "measurementToLocation", buffer, theMeasurementToLocation, (this.measurementToLocation!= null));
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
        final EmissionCalculationMethodType that = ((EmissionCalculationMethodType) object);
        {
            CalculationMethodCodeType lhsCalculationMethodCode;
            lhsCalculationMethodCode = this.getCalculationMethodCode();
            CalculationMethodCodeType rhsCalculationMethodCode;
            rhsCalculationMethodCode = that.getCalculationMethodCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calculationMethodCode", lhsCalculationMethodCode), LocatorUtils.property(thatLocator, "calculationMethodCode", rhsCalculationMethodCode), lhsCalculationMethodCode, rhsCalculationMethodCode, (this.calculationMethodCode!= null), (that.calculationMethodCode!= null))) {
                return false;
            }
        }
        {
            FullnessIndicationCodeType lhsFullnessIndicationCode;
            lhsFullnessIndicationCode = this.getFullnessIndicationCode();
            FullnessIndicationCodeType rhsFullnessIndicationCode;
            rhsFullnessIndicationCode = that.getFullnessIndicationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fullnessIndicationCode", lhsFullnessIndicationCode), LocatorUtils.property(thatLocator, "fullnessIndicationCode", rhsFullnessIndicationCode), lhsFullnessIndicationCode, rhsFullnessIndicationCode, (this.fullnessIndicationCode!= null), (that.fullnessIndicationCode!= null))) {
                return false;
            }
        }
        {
            LocationType lhsMeasurementFromLocation;
            lhsMeasurementFromLocation = this.getMeasurementFromLocation();
            LocationType rhsMeasurementFromLocation;
            rhsMeasurementFromLocation = that.getMeasurementFromLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurementFromLocation", lhsMeasurementFromLocation), LocatorUtils.property(thatLocator, "measurementFromLocation", rhsMeasurementFromLocation), lhsMeasurementFromLocation, rhsMeasurementFromLocation, (this.measurementFromLocation!= null), (that.measurementFromLocation!= null))) {
                return false;
            }
        }
        {
            LocationType lhsMeasurementToLocation;
            lhsMeasurementToLocation = this.getMeasurementToLocation();
            LocationType rhsMeasurementToLocation;
            rhsMeasurementToLocation = that.getMeasurementToLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurementToLocation", lhsMeasurementToLocation), LocatorUtils.property(thatLocator, "measurementToLocation", rhsMeasurementToLocation), lhsMeasurementToLocation, rhsMeasurementToLocation, (this.measurementToLocation!= null), (that.measurementToLocation!= null))) {
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
            CalculationMethodCodeType theCalculationMethodCode;
            theCalculationMethodCode = this.getCalculationMethodCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calculationMethodCode", theCalculationMethodCode), currentHashCode, theCalculationMethodCode, (this.calculationMethodCode!= null));
        }
        {
            FullnessIndicationCodeType theFullnessIndicationCode;
            theFullnessIndicationCode = this.getFullnessIndicationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fullnessIndicationCode", theFullnessIndicationCode), currentHashCode, theFullnessIndicationCode, (this.fullnessIndicationCode!= null));
        }
        {
            LocationType theMeasurementFromLocation;
            theMeasurementFromLocation = this.getMeasurementFromLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurementFromLocation", theMeasurementFromLocation), currentHashCode, theMeasurementFromLocation, (this.measurementFromLocation!= null));
        }
        {
            LocationType theMeasurementToLocation;
            theMeasurementToLocation = this.getMeasurementToLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurementToLocation", theMeasurementToLocation), currentHashCode, theMeasurementToLocation, (this.measurementToLocation!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
