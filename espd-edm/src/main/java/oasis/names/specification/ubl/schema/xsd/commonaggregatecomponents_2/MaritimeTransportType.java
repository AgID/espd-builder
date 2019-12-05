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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GrossTonnageMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetTonnageMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RadioCallSignIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ShipsRequirementsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.VesselIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.VesselNameType;
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
 * <p>Classe Java per MaritimeTransportType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MaritimeTransportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VesselID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VesselName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RadioCallSignID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShipsRequirements" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossTonnageMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetTonnageMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistryCertificateDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistryPortLocation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaritimeTransportType", propOrder = {
    "vesselID",
    "vesselName",
    "radioCallSignID",
    "shipsRequirements",
    "grossTonnageMeasure",
    "netTonnageMeasure",
    "registryCertificateDocumentReference",
    "registryPortLocation"
})
public class MaritimeTransportType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "VesselID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VesselIDType vesselID;
    @XmlElement(name = "VesselName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VesselNameType vesselName;
    @XmlElement(name = "RadioCallSignID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RadioCallSignIDType radioCallSignID;
    @XmlElement(name = "ShipsRequirements", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ShipsRequirementsType> shipsRequirements;
    @XmlElement(name = "GrossTonnageMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GrossTonnageMeasureType grossTonnageMeasure;
    @XmlElement(name = "NetTonnageMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NetTonnageMeasureType netTonnageMeasure;
    @XmlElement(name = "RegistryCertificateDocumentReference")
    protected DocumentReferenceType registryCertificateDocumentReference;
    @XmlElement(name = "RegistryPortLocation")
    protected LocationType registryPortLocation;

    /**
     * Recupera il valore della proprietà vesselID.
     * 
     * @return
     *     possible object is
     *     {@link VesselIDType }
     *     
     */
    public VesselIDType getVesselID() {
        return vesselID;
    }

    /**
     * Imposta il valore della proprietà vesselID.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselIDType }
     *     
     */
    public void setVesselID(VesselIDType value) {
        this.vesselID = value;
    }

    /**
     * Recupera il valore della proprietà vesselName.
     * 
     * @return
     *     possible object is
     *     {@link VesselNameType }
     *     
     */
    public VesselNameType getVesselName() {
        return vesselName;
    }

    /**
     * Imposta il valore della proprietà vesselName.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselNameType }
     *     
     */
    public void setVesselName(VesselNameType value) {
        this.vesselName = value;
    }

    /**
     * Recupera il valore della proprietà radioCallSignID.
     * 
     * @return
     *     possible object is
     *     {@link RadioCallSignIDType }
     *     
     */
    public RadioCallSignIDType getRadioCallSignID() {
        return radioCallSignID;
    }

    /**
     * Imposta il valore della proprietà radioCallSignID.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioCallSignIDType }
     *     
     */
    public void setRadioCallSignID(RadioCallSignIDType value) {
        this.radioCallSignID = value;
    }

    /**
     * Gets the value of the shipsRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipsRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipsRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipsRequirementsType }
     * 
     * 
     */
    public List<ShipsRequirementsType> getShipsRequirements() {
        if (shipsRequirements == null) {
            shipsRequirements = new ArrayList<ShipsRequirementsType>();
        }
        return this.shipsRequirements;
    }

    /**
     * Recupera il valore della proprietà grossTonnageMeasure.
     * 
     * @return
     *     possible object is
     *     {@link GrossTonnageMeasureType }
     *     
     */
    public GrossTonnageMeasureType getGrossTonnageMeasure() {
        return grossTonnageMeasure;
    }

    /**
     * Imposta il valore della proprietà grossTonnageMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossTonnageMeasureType }
     *     
     */
    public void setGrossTonnageMeasure(GrossTonnageMeasureType value) {
        this.grossTonnageMeasure = value;
    }

    /**
     * Recupera il valore della proprietà netTonnageMeasure.
     * 
     * @return
     *     possible object is
     *     {@link NetTonnageMeasureType }
     *     
     */
    public NetTonnageMeasureType getNetTonnageMeasure() {
        return netTonnageMeasure;
    }

    /**
     * Imposta il valore della proprietà netTonnageMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link NetTonnageMeasureType }
     *     
     */
    public void setNetTonnageMeasure(NetTonnageMeasureType value) {
        this.netTonnageMeasure = value;
    }

    /**
     * Recupera il valore della proprietà registryCertificateDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getRegistryCertificateDocumentReference() {
        return registryCertificateDocumentReference;
    }

    /**
     * Imposta il valore della proprietà registryCertificateDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setRegistryCertificateDocumentReference(DocumentReferenceType value) {
        this.registryCertificateDocumentReference = value;
    }

    /**
     * Recupera il valore della proprietà registryPortLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getRegistryPortLocation() {
        return registryPortLocation;
    }

    /**
     * Imposta il valore della proprietà registryPortLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setRegistryPortLocation(LocationType value) {
        this.registryPortLocation = value;
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
            VesselIDType theVesselID;
            theVesselID = this.getVesselID();
            strategy.appendField(locator, this, "vesselID", buffer, theVesselID, (this.vesselID!= null));
        }
        {
            VesselNameType theVesselName;
            theVesselName = this.getVesselName();
            strategy.appendField(locator, this, "vesselName", buffer, theVesselName, (this.vesselName!= null));
        }
        {
            RadioCallSignIDType theRadioCallSignID;
            theRadioCallSignID = this.getRadioCallSignID();
            strategy.appendField(locator, this, "radioCallSignID", buffer, theRadioCallSignID, (this.radioCallSignID!= null));
        }
        {
            List<ShipsRequirementsType> theShipsRequirements;
            theShipsRequirements = (((this.shipsRequirements!= null)&&(!this.shipsRequirements.isEmpty()))?this.getShipsRequirements():null);
            strategy.appendField(locator, this, "shipsRequirements", buffer, theShipsRequirements, ((this.shipsRequirements!= null)&&(!this.shipsRequirements.isEmpty())));
        }
        {
            GrossTonnageMeasureType theGrossTonnageMeasure;
            theGrossTonnageMeasure = this.getGrossTonnageMeasure();
            strategy.appendField(locator, this, "grossTonnageMeasure", buffer, theGrossTonnageMeasure, (this.grossTonnageMeasure!= null));
        }
        {
            NetTonnageMeasureType theNetTonnageMeasure;
            theNetTonnageMeasure = this.getNetTonnageMeasure();
            strategy.appendField(locator, this, "netTonnageMeasure", buffer, theNetTonnageMeasure, (this.netTonnageMeasure!= null));
        }
        {
            DocumentReferenceType theRegistryCertificateDocumentReference;
            theRegistryCertificateDocumentReference = this.getRegistryCertificateDocumentReference();
            strategy.appendField(locator, this, "registryCertificateDocumentReference", buffer, theRegistryCertificateDocumentReference, (this.registryCertificateDocumentReference!= null));
        }
        {
            LocationType theRegistryPortLocation;
            theRegistryPortLocation = this.getRegistryPortLocation();
            strategy.appendField(locator, this, "registryPortLocation", buffer, theRegistryPortLocation, (this.registryPortLocation!= null));
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
        final MaritimeTransportType that = ((MaritimeTransportType) object);
        {
            VesselIDType lhsVesselID;
            lhsVesselID = this.getVesselID();
            VesselIDType rhsVesselID;
            rhsVesselID = that.getVesselID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vesselID", lhsVesselID), LocatorUtils.property(thatLocator, "vesselID", rhsVesselID), lhsVesselID, rhsVesselID, (this.vesselID!= null), (that.vesselID!= null))) {
                return false;
            }
        }
        {
            VesselNameType lhsVesselName;
            lhsVesselName = this.getVesselName();
            VesselNameType rhsVesselName;
            rhsVesselName = that.getVesselName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vesselName", lhsVesselName), LocatorUtils.property(thatLocator, "vesselName", rhsVesselName), lhsVesselName, rhsVesselName, (this.vesselName!= null), (that.vesselName!= null))) {
                return false;
            }
        }
        {
            RadioCallSignIDType lhsRadioCallSignID;
            lhsRadioCallSignID = this.getRadioCallSignID();
            RadioCallSignIDType rhsRadioCallSignID;
            rhsRadioCallSignID = that.getRadioCallSignID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "radioCallSignID", lhsRadioCallSignID), LocatorUtils.property(thatLocator, "radioCallSignID", rhsRadioCallSignID), lhsRadioCallSignID, rhsRadioCallSignID, (this.radioCallSignID!= null), (that.radioCallSignID!= null))) {
                return false;
            }
        }
        {
            List<ShipsRequirementsType> lhsShipsRequirements;
            lhsShipsRequirements = (((this.shipsRequirements!= null)&&(!this.shipsRequirements.isEmpty()))?this.getShipsRequirements():null);
            List<ShipsRequirementsType> rhsShipsRequirements;
            rhsShipsRequirements = (((that.shipsRequirements!= null)&&(!that.shipsRequirements.isEmpty()))?that.getShipsRequirements():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipsRequirements", lhsShipsRequirements), LocatorUtils.property(thatLocator, "shipsRequirements", rhsShipsRequirements), lhsShipsRequirements, rhsShipsRequirements, ((this.shipsRequirements!= null)&&(!this.shipsRequirements.isEmpty())), ((that.shipsRequirements!= null)&&(!that.shipsRequirements.isEmpty())))) {
                return false;
            }
        }
        {
            GrossTonnageMeasureType lhsGrossTonnageMeasure;
            lhsGrossTonnageMeasure = this.getGrossTonnageMeasure();
            GrossTonnageMeasureType rhsGrossTonnageMeasure;
            rhsGrossTonnageMeasure = that.getGrossTonnageMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grossTonnageMeasure", lhsGrossTonnageMeasure), LocatorUtils.property(thatLocator, "grossTonnageMeasure", rhsGrossTonnageMeasure), lhsGrossTonnageMeasure, rhsGrossTonnageMeasure, (this.grossTonnageMeasure!= null), (that.grossTonnageMeasure!= null))) {
                return false;
            }
        }
        {
            NetTonnageMeasureType lhsNetTonnageMeasure;
            lhsNetTonnageMeasure = this.getNetTonnageMeasure();
            NetTonnageMeasureType rhsNetTonnageMeasure;
            rhsNetTonnageMeasure = that.getNetTonnageMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "netTonnageMeasure", lhsNetTonnageMeasure), LocatorUtils.property(thatLocator, "netTonnageMeasure", rhsNetTonnageMeasure), lhsNetTonnageMeasure, rhsNetTonnageMeasure, (this.netTonnageMeasure!= null), (that.netTonnageMeasure!= null))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsRegistryCertificateDocumentReference;
            lhsRegistryCertificateDocumentReference = this.getRegistryCertificateDocumentReference();
            DocumentReferenceType rhsRegistryCertificateDocumentReference;
            rhsRegistryCertificateDocumentReference = that.getRegistryCertificateDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registryCertificateDocumentReference", lhsRegistryCertificateDocumentReference), LocatorUtils.property(thatLocator, "registryCertificateDocumentReference", rhsRegistryCertificateDocumentReference), lhsRegistryCertificateDocumentReference, rhsRegistryCertificateDocumentReference, (this.registryCertificateDocumentReference!= null), (that.registryCertificateDocumentReference!= null))) {
                return false;
            }
        }
        {
            LocationType lhsRegistryPortLocation;
            lhsRegistryPortLocation = this.getRegistryPortLocation();
            LocationType rhsRegistryPortLocation;
            rhsRegistryPortLocation = that.getRegistryPortLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registryPortLocation", lhsRegistryPortLocation), LocatorUtils.property(thatLocator, "registryPortLocation", rhsRegistryPortLocation), lhsRegistryPortLocation, rhsRegistryPortLocation, (this.registryPortLocation!= null), (that.registryPortLocation!= null))) {
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
            VesselIDType theVesselID;
            theVesselID = this.getVesselID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vesselID", theVesselID), currentHashCode, theVesselID, (this.vesselID!= null));
        }
        {
            VesselNameType theVesselName;
            theVesselName = this.getVesselName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vesselName", theVesselName), currentHashCode, theVesselName, (this.vesselName!= null));
        }
        {
            RadioCallSignIDType theRadioCallSignID;
            theRadioCallSignID = this.getRadioCallSignID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "radioCallSignID", theRadioCallSignID), currentHashCode, theRadioCallSignID, (this.radioCallSignID!= null));
        }
        {
            List<ShipsRequirementsType> theShipsRequirements;
            theShipsRequirements = (((this.shipsRequirements!= null)&&(!this.shipsRequirements.isEmpty()))?this.getShipsRequirements():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipsRequirements", theShipsRequirements), currentHashCode, theShipsRequirements, ((this.shipsRequirements!= null)&&(!this.shipsRequirements.isEmpty())));
        }
        {
            GrossTonnageMeasureType theGrossTonnageMeasure;
            theGrossTonnageMeasure = this.getGrossTonnageMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grossTonnageMeasure", theGrossTonnageMeasure), currentHashCode, theGrossTonnageMeasure, (this.grossTonnageMeasure!= null));
        }
        {
            NetTonnageMeasureType theNetTonnageMeasure;
            theNetTonnageMeasure = this.getNetTonnageMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "netTonnageMeasure", theNetTonnageMeasure), currentHashCode, theNetTonnageMeasure, (this.netTonnageMeasure!= null));
        }
        {
            DocumentReferenceType theRegistryCertificateDocumentReference;
            theRegistryCertificateDocumentReference = this.getRegistryCertificateDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registryCertificateDocumentReference", theRegistryCertificateDocumentReference), currentHashCode, theRegistryCertificateDocumentReference, (this.registryCertificateDocumentReference!= null));
        }
        {
            LocationType theRegistryPortLocation;
            theRegistryPortLocation = this.getRegistryPortLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registryPortLocation", theRegistryPortLocation), currentHashCode, theRegistryPortLocation, (this.registryPortLocation!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
