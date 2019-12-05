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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HazardousRegulationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InhalationToxicityZoneCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PackingCriteriaCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportAuthorizationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportEmergencyCardCodeType;
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
 * <p>Classe Java per HazardousGoodsTransitType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="HazardousGoodsTransitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportEmergencyCardCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackingCriteriaCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRegulationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InhalationToxicityZoneCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportAuthorizationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaximumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MinimumTemperature" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousGoodsTransitType", propOrder = {
    "transportEmergencyCardCode",
    "packingCriteriaCode",
    "hazardousRegulationCode",
    "inhalationToxicityZoneCode",
    "transportAuthorizationCode",
    "maximumTemperature",
    "minimumTemperature"
})
public class HazardousGoodsTransitType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "TransportEmergencyCardCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportEmergencyCardCodeType transportEmergencyCardCode;
    @XmlElement(name = "PackingCriteriaCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackingCriteriaCodeType packingCriteriaCode;
    @XmlElement(name = "HazardousRegulationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardousRegulationCodeType hazardousRegulationCode;
    @XmlElement(name = "InhalationToxicityZoneCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InhalationToxicityZoneCodeType inhalationToxicityZoneCode;
    @XmlElement(name = "TransportAuthorizationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportAuthorizationCodeType transportAuthorizationCode;
    @XmlElement(name = "MaximumTemperature")
    protected TemperatureType maximumTemperature;
    @XmlElement(name = "MinimumTemperature")
    protected TemperatureType minimumTemperature;

    /**
     * Recupera il valore della proprietà transportEmergencyCardCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportEmergencyCardCodeType }
     *     
     */
    public TransportEmergencyCardCodeType getTransportEmergencyCardCode() {
        return transportEmergencyCardCode;
    }

    /**
     * Imposta il valore della proprietà transportEmergencyCardCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEmergencyCardCodeType }
     *     
     */
    public void setTransportEmergencyCardCode(TransportEmergencyCardCodeType value) {
        this.transportEmergencyCardCode = value;
    }

    /**
     * Recupera il valore della proprietà packingCriteriaCode.
     * 
     * @return
     *     possible object is
     *     {@link PackingCriteriaCodeType }
     *     
     */
    public PackingCriteriaCodeType getPackingCriteriaCode() {
        return packingCriteriaCode;
    }

    /**
     * Imposta il valore della proprietà packingCriteriaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PackingCriteriaCodeType }
     *     
     */
    public void setPackingCriteriaCode(PackingCriteriaCodeType value) {
        this.packingCriteriaCode = value;
    }

    /**
     * Recupera il valore della proprietà hazardousRegulationCode.
     * 
     * @return
     *     possible object is
     *     {@link HazardousRegulationCodeType }
     *     
     */
    public HazardousRegulationCodeType getHazardousRegulationCode() {
        return hazardousRegulationCode;
    }

    /**
     * Imposta il valore della proprietà hazardousRegulationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousRegulationCodeType }
     *     
     */
    public void setHazardousRegulationCode(HazardousRegulationCodeType value) {
        this.hazardousRegulationCode = value;
    }

    /**
     * Recupera il valore della proprietà inhalationToxicityZoneCode.
     * 
     * @return
     *     possible object is
     *     {@link InhalationToxicityZoneCodeType }
     *     
     */
    public InhalationToxicityZoneCodeType getInhalationToxicityZoneCode() {
        return inhalationToxicityZoneCode;
    }

    /**
     * Imposta il valore della proprietà inhalationToxicityZoneCode.
     * 
     * @param value
     *     allowed object is
     *     {@link InhalationToxicityZoneCodeType }
     *     
     */
    public void setInhalationToxicityZoneCode(InhalationToxicityZoneCodeType value) {
        this.inhalationToxicityZoneCode = value;
    }

    /**
     * Recupera il valore della proprietà transportAuthorizationCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportAuthorizationCodeType }
     *     
     */
    public TransportAuthorizationCodeType getTransportAuthorizationCode() {
        return transportAuthorizationCode;
    }

    /**
     * Imposta il valore della proprietà transportAuthorizationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportAuthorizationCodeType }
     *     
     */
    public void setTransportAuthorizationCode(TransportAuthorizationCodeType value) {
        this.transportAuthorizationCode = value;
    }

    /**
     * Recupera il valore della proprietà maximumTemperature.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Imposta il valore della proprietà maximumTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setMaximumTemperature(TemperatureType value) {
        this.maximumTemperature = value;
    }

    /**
     * Recupera il valore della proprietà minimumTemperature.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Imposta il valore della proprietà minimumTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setMinimumTemperature(TemperatureType value) {
        this.minimumTemperature = value;
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
            TransportEmergencyCardCodeType theTransportEmergencyCardCode;
            theTransportEmergencyCardCode = this.getTransportEmergencyCardCode();
            strategy.appendField(locator, this, "transportEmergencyCardCode", buffer, theTransportEmergencyCardCode, (this.transportEmergencyCardCode!= null));
        }
        {
            PackingCriteriaCodeType thePackingCriteriaCode;
            thePackingCriteriaCode = this.getPackingCriteriaCode();
            strategy.appendField(locator, this, "packingCriteriaCode", buffer, thePackingCriteriaCode, (this.packingCriteriaCode!= null));
        }
        {
            HazardousRegulationCodeType theHazardousRegulationCode;
            theHazardousRegulationCode = this.getHazardousRegulationCode();
            strategy.appendField(locator, this, "hazardousRegulationCode", buffer, theHazardousRegulationCode, (this.hazardousRegulationCode!= null));
        }
        {
            InhalationToxicityZoneCodeType theInhalationToxicityZoneCode;
            theInhalationToxicityZoneCode = this.getInhalationToxicityZoneCode();
            strategy.appendField(locator, this, "inhalationToxicityZoneCode", buffer, theInhalationToxicityZoneCode, (this.inhalationToxicityZoneCode!= null));
        }
        {
            TransportAuthorizationCodeType theTransportAuthorizationCode;
            theTransportAuthorizationCode = this.getTransportAuthorizationCode();
            strategy.appendField(locator, this, "transportAuthorizationCode", buffer, theTransportAuthorizationCode, (this.transportAuthorizationCode!= null));
        }
        {
            TemperatureType theMaximumTemperature;
            theMaximumTemperature = this.getMaximumTemperature();
            strategy.appendField(locator, this, "maximumTemperature", buffer, theMaximumTemperature, (this.maximumTemperature!= null));
        }
        {
            TemperatureType theMinimumTemperature;
            theMinimumTemperature = this.getMinimumTemperature();
            strategy.appendField(locator, this, "minimumTemperature", buffer, theMinimumTemperature, (this.minimumTemperature!= null));
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
        final HazardousGoodsTransitType that = ((HazardousGoodsTransitType) object);
        {
            TransportEmergencyCardCodeType lhsTransportEmergencyCardCode;
            lhsTransportEmergencyCardCode = this.getTransportEmergencyCardCode();
            TransportEmergencyCardCodeType rhsTransportEmergencyCardCode;
            rhsTransportEmergencyCardCode = that.getTransportEmergencyCardCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportEmergencyCardCode", lhsTransportEmergencyCardCode), LocatorUtils.property(thatLocator, "transportEmergencyCardCode", rhsTransportEmergencyCardCode), lhsTransportEmergencyCardCode, rhsTransportEmergencyCardCode, (this.transportEmergencyCardCode!= null), (that.transportEmergencyCardCode!= null))) {
                return false;
            }
        }
        {
            PackingCriteriaCodeType lhsPackingCriteriaCode;
            lhsPackingCriteriaCode = this.getPackingCriteriaCode();
            PackingCriteriaCodeType rhsPackingCriteriaCode;
            rhsPackingCriteriaCode = that.getPackingCriteriaCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packingCriteriaCode", lhsPackingCriteriaCode), LocatorUtils.property(thatLocator, "packingCriteriaCode", rhsPackingCriteriaCode), lhsPackingCriteriaCode, rhsPackingCriteriaCode, (this.packingCriteriaCode!= null), (that.packingCriteriaCode!= null))) {
                return false;
            }
        }
        {
            HazardousRegulationCodeType lhsHazardousRegulationCode;
            lhsHazardousRegulationCode = this.getHazardousRegulationCode();
            HazardousRegulationCodeType rhsHazardousRegulationCode;
            rhsHazardousRegulationCode = that.getHazardousRegulationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hazardousRegulationCode", lhsHazardousRegulationCode), LocatorUtils.property(thatLocator, "hazardousRegulationCode", rhsHazardousRegulationCode), lhsHazardousRegulationCode, rhsHazardousRegulationCode, (this.hazardousRegulationCode!= null), (that.hazardousRegulationCode!= null))) {
                return false;
            }
        }
        {
            InhalationToxicityZoneCodeType lhsInhalationToxicityZoneCode;
            lhsInhalationToxicityZoneCode = this.getInhalationToxicityZoneCode();
            InhalationToxicityZoneCodeType rhsInhalationToxicityZoneCode;
            rhsInhalationToxicityZoneCode = that.getInhalationToxicityZoneCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inhalationToxicityZoneCode", lhsInhalationToxicityZoneCode), LocatorUtils.property(thatLocator, "inhalationToxicityZoneCode", rhsInhalationToxicityZoneCode), lhsInhalationToxicityZoneCode, rhsInhalationToxicityZoneCode, (this.inhalationToxicityZoneCode!= null), (that.inhalationToxicityZoneCode!= null))) {
                return false;
            }
        }
        {
            TransportAuthorizationCodeType lhsTransportAuthorizationCode;
            lhsTransportAuthorizationCode = this.getTransportAuthorizationCode();
            TransportAuthorizationCodeType rhsTransportAuthorizationCode;
            rhsTransportAuthorizationCode = that.getTransportAuthorizationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportAuthorizationCode", lhsTransportAuthorizationCode), LocatorUtils.property(thatLocator, "transportAuthorizationCode", rhsTransportAuthorizationCode), lhsTransportAuthorizationCode, rhsTransportAuthorizationCode, (this.transportAuthorizationCode!= null), (that.transportAuthorizationCode!= null))) {
                return false;
            }
        }
        {
            TemperatureType lhsMaximumTemperature;
            lhsMaximumTemperature = this.getMaximumTemperature();
            TemperatureType rhsMaximumTemperature;
            rhsMaximumTemperature = that.getMaximumTemperature();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumTemperature", lhsMaximumTemperature), LocatorUtils.property(thatLocator, "maximumTemperature", rhsMaximumTemperature), lhsMaximumTemperature, rhsMaximumTemperature, (this.maximumTemperature!= null), (that.maximumTemperature!= null))) {
                return false;
            }
        }
        {
            TemperatureType lhsMinimumTemperature;
            lhsMinimumTemperature = this.getMinimumTemperature();
            TemperatureType rhsMinimumTemperature;
            rhsMinimumTemperature = that.getMinimumTemperature();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimumTemperature", lhsMinimumTemperature), LocatorUtils.property(thatLocator, "minimumTemperature", rhsMinimumTemperature), lhsMinimumTemperature, rhsMinimumTemperature, (this.minimumTemperature!= null), (that.minimumTemperature!= null))) {
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
            TransportEmergencyCardCodeType theTransportEmergencyCardCode;
            theTransportEmergencyCardCode = this.getTransportEmergencyCardCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportEmergencyCardCode", theTransportEmergencyCardCode), currentHashCode, theTransportEmergencyCardCode, (this.transportEmergencyCardCode!= null));
        }
        {
            PackingCriteriaCodeType thePackingCriteriaCode;
            thePackingCriteriaCode = this.getPackingCriteriaCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packingCriteriaCode", thePackingCriteriaCode), currentHashCode, thePackingCriteriaCode, (this.packingCriteriaCode!= null));
        }
        {
            HazardousRegulationCodeType theHazardousRegulationCode;
            theHazardousRegulationCode = this.getHazardousRegulationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousRegulationCode", theHazardousRegulationCode), currentHashCode, theHazardousRegulationCode, (this.hazardousRegulationCode!= null));
        }
        {
            InhalationToxicityZoneCodeType theInhalationToxicityZoneCode;
            theInhalationToxicityZoneCode = this.getInhalationToxicityZoneCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inhalationToxicityZoneCode", theInhalationToxicityZoneCode), currentHashCode, theInhalationToxicityZoneCode, (this.inhalationToxicityZoneCode!= null));
        }
        {
            TransportAuthorizationCodeType theTransportAuthorizationCode;
            theTransportAuthorizationCode = this.getTransportAuthorizationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportAuthorizationCode", theTransportAuthorizationCode), currentHashCode, theTransportAuthorizationCode, (this.transportAuthorizationCode!= null));
        }
        {
            TemperatureType theMaximumTemperature;
            theMaximumTemperature = this.getMaximumTemperature();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumTemperature", theMaximumTemperature), currentHashCode, theMaximumTemperature, (this.maximumTemperature!= null));
        }
        {
            TemperatureType theMinimumTemperature;
            theMinimumTemperature = this.getMinimumTemperature();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimumTemperature", theMinimumTemperature), currentHashCode, theMinimumTemperature, (this.minimumTemperature!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
