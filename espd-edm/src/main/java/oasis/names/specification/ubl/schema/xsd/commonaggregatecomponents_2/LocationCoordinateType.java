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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AltitudeMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CoordinateSystemCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatitudeDegreesMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatitudeDirectionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatitudeMinutesMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LongitudeDegreesMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LongitudeDirectionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LongitudeMinutesMeasureType;
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
 * <p>Classe Java per LocationCoordinateType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LocationCoordinateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CoordinateSystemCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatitudeDegreesMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatitudeMinutesMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatitudeDirectionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LongitudeDegreesMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LongitudeMinutesMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LongitudeDirectionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AltitudeMeasure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCoordinateType", propOrder = {
    "coordinateSystemCode",
    "latitudeDegreesMeasure",
    "latitudeMinutesMeasure",
    "latitudeDirectionCode",
    "longitudeDegreesMeasure",
    "longitudeMinutesMeasure",
    "longitudeDirectionCode",
    "altitudeMeasure"
})
public class LocationCoordinateType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "CoordinateSystemCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CoordinateSystemCodeType coordinateSystemCode;
    @XmlElement(name = "LatitudeDegreesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatitudeDegreesMeasureType latitudeDegreesMeasure;
    @XmlElement(name = "LatitudeMinutesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatitudeMinutesMeasureType latitudeMinutesMeasure;
    @XmlElement(name = "LatitudeDirectionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatitudeDirectionCodeType latitudeDirectionCode;
    @XmlElement(name = "LongitudeDegreesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LongitudeDegreesMeasureType longitudeDegreesMeasure;
    @XmlElement(name = "LongitudeMinutesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LongitudeMinutesMeasureType longitudeMinutesMeasure;
    @XmlElement(name = "LongitudeDirectionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LongitudeDirectionCodeType longitudeDirectionCode;
    @XmlElement(name = "AltitudeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AltitudeMeasureType altitudeMeasure;

    /**
     * Recupera il valore della proprietà coordinateSystemCode.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateSystemCodeType }
     *     
     */
    public CoordinateSystemCodeType getCoordinateSystemCode() {
        return coordinateSystemCode;
    }

    /**
     * Imposta il valore della proprietà coordinateSystemCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateSystemCodeType }
     *     
     */
    public void setCoordinateSystemCode(CoordinateSystemCodeType value) {
        this.coordinateSystemCode = value;
    }

    /**
     * Recupera il valore della proprietà latitudeDegreesMeasure.
     * 
     * @return
     *     possible object is
     *     {@link LatitudeDegreesMeasureType }
     *     
     */
    public LatitudeDegreesMeasureType getLatitudeDegreesMeasure() {
        return latitudeDegreesMeasure;
    }

    /**
     * Imposta il valore della proprietà latitudeDegreesMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link LatitudeDegreesMeasureType }
     *     
     */
    public void setLatitudeDegreesMeasure(LatitudeDegreesMeasureType value) {
        this.latitudeDegreesMeasure = value;
    }

    /**
     * Recupera il valore della proprietà latitudeMinutesMeasure.
     * 
     * @return
     *     possible object is
     *     {@link LatitudeMinutesMeasureType }
     *     
     */
    public LatitudeMinutesMeasureType getLatitudeMinutesMeasure() {
        return latitudeMinutesMeasure;
    }

    /**
     * Imposta il valore della proprietà latitudeMinutesMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link LatitudeMinutesMeasureType }
     *     
     */
    public void setLatitudeMinutesMeasure(LatitudeMinutesMeasureType value) {
        this.latitudeMinutesMeasure = value;
    }

    /**
     * Recupera il valore della proprietà latitudeDirectionCode.
     * 
     * @return
     *     possible object is
     *     {@link LatitudeDirectionCodeType }
     *     
     */
    public LatitudeDirectionCodeType getLatitudeDirectionCode() {
        return latitudeDirectionCode;
    }

    /**
     * Imposta il valore della proprietà latitudeDirectionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LatitudeDirectionCodeType }
     *     
     */
    public void setLatitudeDirectionCode(LatitudeDirectionCodeType value) {
        this.latitudeDirectionCode = value;
    }

    /**
     * Recupera il valore della proprietà longitudeDegreesMeasure.
     * 
     * @return
     *     possible object is
     *     {@link LongitudeDegreesMeasureType }
     *     
     */
    public LongitudeDegreesMeasureType getLongitudeDegreesMeasure() {
        return longitudeDegreesMeasure;
    }

    /**
     * Imposta il valore della proprietà longitudeDegreesMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link LongitudeDegreesMeasureType }
     *     
     */
    public void setLongitudeDegreesMeasure(LongitudeDegreesMeasureType value) {
        this.longitudeDegreesMeasure = value;
    }

    /**
     * Recupera il valore della proprietà longitudeMinutesMeasure.
     * 
     * @return
     *     possible object is
     *     {@link LongitudeMinutesMeasureType }
     *     
     */
    public LongitudeMinutesMeasureType getLongitudeMinutesMeasure() {
        return longitudeMinutesMeasure;
    }

    /**
     * Imposta il valore della proprietà longitudeMinutesMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link LongitudeMinutesMeasureType }
     *     
     */
    public void setLongitudeMinutesMeasure(LongitudeMinutesMeasureType value) {
        this.longitudeMinutesMeasure = value;
    }

    /**
     * Recupera il valore della proprietà longitudeDirectionCode.
     * 
     * @return
     *     possible object is
     *     {@link LongitudeDirectionCodeType }
     *     
     */
    public LongitudeDirectionCodeType getLongitudeDirectionCode() {
        return longitudeDirectionCode;
    }

    /**
     * Imposta il valore della proprietà longitudeDirectionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LongitudeDirectionCodeType }
     *     
     */
    public void setLongitudeDirectionCode(LongitudeDirectionCodeType value) {
        this.longitudeDirectionCode = value;
    }

    /**
     * Recupera il valore della proprietà altitudeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeMeasureType }
     *     
     */
    public AltitudeMeasureType getAltitudeMeasure() {
        return altitudeMeasure;
    }

    /**
     * Imposta il valore della proprietà altitudeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeMeasureType }
     *     
     */
    public void setAltitudeMeasure(AltitudeMeasureType value) {
        this.altitudeMeasure = value;
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
            CoordinateSystemCodeType theCoordinateSystemCode;
            theCoordinateSystemCode = this.getCoordinateSystemCode();
            strategy.appendField(locator, this, "coordinateSystemCode", buffer, theCoordinateSystemCode, (this.coordinateSystemCode!= null));
        }
        {
            LatitudeDegreesMeasureType theLatitudeDegreesMeasure;
            theLatitudeDegreesMeasure = this.getLatitudeDegreesMeasure();
            strategy.appendField(locator, this, "latitudeDegreesMeasure", buffer, theLatitudeDegreesMeasure, (this.latitudeDegreesMeasure!= null));
        }
        {
            LatitudeMinutesMeasureType theLatitudeMinutesMeasure;
            theLatitudeMinutesMeasure = this.getLatitudeMinutesMeasure();
            strategy.appendField(locator, this, "latitudeMinutesMeasure", buffer, theLatitudeMinutesMeasure, (this.latitudeMinutesMeasure!= null));
        }
        {
            LatitudeDirectionCodeType theLatitudeDirectionCode;
            theLatitudeDirectionCode = this.getLatitudeDirectionCode();
            strategy.appendField(locator, this, "latitudeDirectionCode", buffer, theLatitudeDirectionCode, (this.latitudeDirectionCode!= null));
        }
        {
            LongitudeDegreesMeasureType theLongitudeDegreesMeasure;
            theLongitudeDegreesMeasure = this.getLongitudeDegreesMeasure();
            strategy.appendField(locator, this, "longitudeDegreesMeasure", buffer, theLongitudeDegreesMeasure, (this.longitudeDegreesMeasure!= null));
        }
        {
            LongitudeMinutesMeasureType theLongitudeMinutesMeasure;
            theLongitudeMinutesMeasure = this.getLongitudeMinutesMeasure();
            strategy.appendField(locator, this, "longitudeMinutesMeasure", buffer, theLongitudeMinutesMeasure, (this.longitudeMinutesMeasure!= null));
        }
        {
            LongitudeDirectionCodeType theLongitudeDirectionCode;
            theLongitudeDirectionCode = this.getLongitudeDirectionCode();
            strategy.appendField(locator, this, "longitudeDirectionCode", buffer, theLongitudeDirectionCode, (this.longitudeDirectionCode!= null));
        }
        {
            AltitudeMeasureType theAltitudeMeasure;
            theAltitudeMeasure = this.getAltitudeMeasure();
            strategy.appendField(locator, this, "altitudeMeasure", buffer, theAltitudeMeasure, (this.altitudeMeasure!= null));
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
        final LocationCoordinateType that = ((LocationCoordinateType) object);
        {
            CoordinateSystemCodeType lhsCoordinateSystemCode;
            lhsCoordinateSystemCode = this.getCoordinateSystemCode();
            CoordinateSystemCodeType rhsCoordinateSystemCode;
            rhsCoordinateSystemCode = that.getCoordinateSystemCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coordinateSystemCode", lhsCoordinateSystemCode), LocatorUtils.property(thatLocator, "coordinateSystemCode", rhsCoordinateSystemCode), lhsCoordinateSystemCode, rhsCoordinateSystemCode, (this.coordinateSystemCode!= null), (that.coordinateSystemCode!= null))) {
                return false;
            }
        }
        {
            LatitudeDegreesMeasureType lhsLatitudeDegreesMeasure;
            lhsLatitudeDegreesMeasure = this.getLatitudeDegreesMeasure();
            LatitudeDegreesMeasureType rhsLatitudeDegreesMeasure;
            rhsLatitudeDegreesMeasure = that.getLatitudeDegreesMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latitudeDegreesMeasure", lhsLatitudeDegreesMeasure), LocatorUtils.property(thatLocator, "latitudeDegreesMeasure", rhsLatitudeDegreesMeasure), lhsLatitudeDegreesMeasure, rhsLatitudeDegreesMeasure, (this.latitudeDegreesMeasure!= null), (that.latitudeDegreesMeasure!= null))) {
                return false;
            }
        }
        {
            LatitudeMinutesMeasureType lhsLatitudeMinutesMeasure;
            lhsLatitudeMinutesMeasure = this.getLatitudeMinutesMeasure();
            LatitudeMinutesMeasureType rhsLatitudeMinutesMeasure;
            rhsLatitudeMinutesMeasure = that.getLatitudeMinutesMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latitudeMinutesMeasure", lhsLatitudeMinutesMeasure), LocatorUtils.property(thatLocator, "latitudeMinutesMeasure", rhsLatitudeMinutesMeasure), lhsLatitudeMinutesMeasure, rhsLatitudeMinutesMeasure, (this.latitudeMinutesMeasure!= null), (that.latitudeMinutesMeasure!= null))) {
                return false;
            }
        }
        {
            LatitudeDirectionCodeType lhsLatitudeDirectionCode;
            lhsLatitudeDirectionCode = this.getLatitudeDirectionCode();
            LatitudeDirectionCodeType rhsLatitudeDirectionCode;
            rhsLatitudeDirectionCode = that.getLatitudeDirectionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latitudeDirectionCode", lhsLatitudeDirectionCode), LocatorUtils.property(thatLocator, "latitudeDirectionCode", rhsLatitudeDirectionCode), lhsLatitudeDirectionCode, rhsLatitudeDirectionCode, (this.latitudeDirectionCode!= null), (that.latitudeDirectionCode!= null))) {
                return false;
            }
        }
        {
            LongitudeDegreesMeasureType lhsLongitudeDegreesMeasure;
            lhsLongitudeDegreesMeasure = this.getLongitudeDegreesMeasure();
            LongitudeDegreesMeasureType rhsLongitudeDegreesMeasure;
            rhsLongitudeDegreesMeasure = that.getLongitudeDegreesMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "longitudeDegreesMeasure", lhsLongitudeDegreesMeasure), LocatorUtils.property(thatLocator, "longitudeDegreesMeasure", rhsLongitudeDegreesMeasure), lhsLongitudeDegreesMeasure, rhsLongitudeDegreesMeasure, (this.longitudeDegreesMeasure!= null), (that.longitudeDegreesMeasure!= null))) {
                return false;
            }
        }
        {
            LongitudeMinutesMeasureType lhsLongitudeMinutesMeasure;
            lhsLongitudeMinutesMeasure = this.getLongitudeMinutesMeasure();
            LongitudeMinutesMeasureType rhsLongitudeMinutesMeasure;
            rhsLongitudeMinutesMeasure = that.getLongitudeMinutesMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "longitudeMinutesMeasure", lhsLongitudeMinutesMeasure), LocatorUtils.property(thatLocator, "longitudeMinutesMeasure", rhsLongitudeMinutesMeasure), lhsLongitudeMinutesMeasure, rhsLongitudeMinutesMeasure, (this.longitudeMinutesMeasure!= null), (that.longitudeMinutesMeasure!= null))) {
                return false;
            }
        }
        {
            LongitudeDirectionCodeType lhsLongitudeDirectionCode;
            lhsLongitudeDirectionCode = this.getLongitudeDirectionCode();
            LongitudeDirectionCodeType rhsLongitudeDirectionCode;
            rhsLongitudeDirectionCode = that.getLongitudeDirectionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "longitudeDirectionCode", lhsLongitudeDirectionCode), LocatorUtils.property(thatLocator, "longitudeDirectionCode", rhsLongitudeDirectionCode), lhsLongitudeDirectionCode, rhsLongitudeDirectionCode, (this.longitudeDirectionCode!= null), (that.longitudeDirectionCode!= null))) {
                return false;
            }
        }
        {
            AltitudeMeasureType lhsAltitudeMeasure;
            lhsAltitudeMeasure = this.getAltitudeMeasure();
            AltitudeMeasureType rhsAltitudeMeasure;
            rhsAltitudeMeasure = that.getAltitudeMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "altitudeMeasure", lhsAltitudeMeasure), LocatorUtils.property(thatLocator, "altitudeMeasure", rhsAltitudeMeasure), lhsAltitudeMeasure, rhsAltitudeMeasure, (this.altitudeMeasure!= null), (that.altitudeMeasure!= null))) {
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
            CoordinateSystemCodeType theCoordinateSystemCode;
            theCoordinateSystemCode = this.getCoordinateSystemCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coordinateSystemCode", theCoordinateSystemCode), currentHashCode, theCoordinateSystemCode, (this.coordinateSystemCode!= null));
        }
        {
            LatitudeDegreesMeasureType theLatitudeDegreesMeasure;
            theLatitudeDegreesMeasure = this.getLatitudeDegreesMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latitudeDegreesMeasure", theLatitudeDegreesMeasure), currentHashCode, theLatitudeDegreesMeasure, (this.latitudeDegreesMeasure!= null));
        }
        {
            LatitudeMinutesMeasureType theLatitudeMinutesMeasure;
            theLatitudeMinutesMeasure = this.getLatitudeMinutesMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latitudeMinutesMeasure", theLatitudeMinutesMeasure), currentHashCode, theLatitudeMinutesMeasure, (this.latitudeMinutesMeasure!= null));
        }
        {
            LatitudeDirectionCodeType theLatitudeDirectionCode;
            theLatitudeDirectionCode = this.getLatitudeDirectionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latitudeDirectionCode", theLatitudeDirectionCode), currentHashCode, theLatitudeDirectionCode, (this.latitudeDirectionCode!= null));
        }
        {
            LongitudeDegreesMeasureType theLongitudeDegreesMeasure;
            theLongitudeDegreesMeasure = this.getLongitudeDegreesMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "longitudeDegreesMeasure", theLongitudeDegreesMeasure), currentHashCode, theLongitudeDegreesMeasure, (this.longitudeDegreesMeasure!= null));
        }
        {
            LongitudeMinutesMeasureType theLongitudeMinutesMeasure;
            theLongitudeMinutesMeasure = this.getLongitudeMinutesMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "longitudeMinutesMeasure", theLongitudeMinutesMeasure), currentHashCode, theLongitudeMinutesMeasure, (this.longitudeMinutesMeasure!= null));
        }
        {
            LongitudeDirectionCodeType theLongitudeDirectionCode;
            theLongitudeDirectionCode = this.getLongitudeDirectionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "longitudeDirectionCode", theLongitudeDirectionCode), currentHashCode, theLongitudeDirectionCode, (this.longitudeDirectionCode!= null));
        }
        {
            AltitudeMeasureType theAltitudeMeasure;
            theAltitudeMeasure = this.getAltitudeMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "altitudeMeasure", theAltitudeMeasure), currentHashCode, theAltitudeMeasure, (this.altitudeMeasure!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
