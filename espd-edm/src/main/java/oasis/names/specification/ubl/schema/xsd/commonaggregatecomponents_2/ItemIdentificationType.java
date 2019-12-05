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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BarcodeSymbologyIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExtendedIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
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
 * <p>Classe Java per ItemIdentificationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ItemIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExtendedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BarcodeSymbologyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PhysicalAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}IssuerParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemIdentificationType", propOrder = {
    "id",
    "extendedID",
    "barcodeSymbologyID",
    "physicalAttribute",
    "measurementDimension",
    "issuerParty"
})
public class ItemIdentificationType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "ExtendedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExtendedIDType extendedID;
    @XmlElement(name = "BarcodeSymbologyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BarcodeSymbologyIDType barcodeSymbologyID;
    @XmlElement(name = "PhysicalAttribute")
    protected List<PhysicalAttributeType> physicalAttribute;
    @XmlElement(name = "MeasurementDimension")
    protected List<DimensionType> measurementDimension;
    @XmlElement(name = "IssuerParty")
    protected PartyType issuerParty;

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
     * Recupera il valore della proprietà extendedID.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedIDType }
     *     
     */
    public ExtendedIDType getExtendedID() {
        return extendedID;
    }

    /**
     * Imposta il valore della proprietà extendedID.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedIDType }
     *     
     */
    public void setExtendedID(ExtendedIDType value) {
        this.extendedID = value;
    }

    /**
     * Recupera il valore della proprietà barcodeSymbologyID.
     * 
     * @return
     *     possible object is
     *     {@link BarcodeSymbologyIDType }
     *     
     */
    public BarcodeSymbologyIDType getBarcodeSymbologyID() {
        return barcodeSymbologyID;
    }

    /**
     * Imposta il valore della proprietà barcodeSymbologyID.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeSymbologyIDType }
     *     
     */
    public void setBarcodeSymbologyID(BarcodeSymbologyIDType value) {
        this.barcodeSymbologyID = value;
    }

    /**
     * Gets the value of the physicalAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAttributeType }
     * 
     * 
     */
    public List<PhysicalAttributeType> getPhysicalAttribute() {
        if (physicalAttribute == null) {
            physicalAttribute = new ArrayList<PhysicalAttributeType>();
        }
        return this.physicalAttribute;
    }

    /**
     * Gets the value of the measurementDimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementDimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionType }
     * 
     * 
     */
    public List<DimensionType> getMeasurementDimension() {
        if (measurementDimension == null) {
            measurementDimension = new ArrayList<DimensionType>();
        }
        return this.measurementDimension;
    }

    /**
     * Recupera il valore della proprietà issuerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getIssuerParty() {
        return issuerParty;
    }

    /**
     * Imposta il valore della proprietà issuerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setIssuerParty(PartyType value) {
        this.issuerParty = value;
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
            ExtendedIDType theExtendedID;
            theExtendedID = this.getExtendedID();
            strategy.appendField(locator, this, "extendedID", buffer, theExtendedID, (this.extendedID!= null));
        }
        {
            BarcodeSymbologyIDType theBarcodeSymbologyID;
            theBarcodeSymbologyID = this.getBarcodeSymbologyID();
            strategy.appendField(locator, this, "barcodeSymbologyID", buffer, theBarcodeSymbologyID, (this.barcodeSymbologyID!= null));
        }
        {
            List<PhysicalAttributeType> thePhysicalAttribute;
            thePhysicalAttribute = (((this.physicalAttribute!= null)&&(!this.physicalAttribute.isEmpty()))?this.getPhysicalAttribute():null);
            strategy.appendField(locator, this, "physicalAttribute", buffer, thePhysicalAttribute, ((this.physicalAttribute!= null)&&(!this.physicalAttribute.isEmpty())));
        }
        {
            List<DimensionType> theMeasurementDimension;
            theMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            strategy.appendField(locator, this, "measurementDimension", buffer, theMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())));
        }
        {
            PartyType theIssuerParty;
            theIssuerParty = this.getIssuerParty();
            strategy.appendField(locator, this, "issuerParty", buffer, theIssuerParty, (this.issuerParty!= null));
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
        final ItemIdentificationType that = ((ItemIdentificationType) object);
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
            ExtendedIDType lhsExtendedID;
            lhsExtendedID = this.getExtendedID();
            ExtendedIDType rhsExtendedID;
            rhsExtendedID = that.getExtendedID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extendedID", lhsExtendedID), LocatorUtils.property(thatLocator, "extendedID", rhsExtendedID), lhsExtendedID, rhsExtendedID, (this.extendedID!= null), (that.extendedID!= null))) {
                return false;
            }
        }
        {
            BarcodeSymbologyIDType lhsBarcodeSymbologyID;
            lhsBarcodeSymbologyID = this.getBarcodeSymbologyID();
            BarcodeSymbologyIDType rhsBarcodeSymbologyID;
            rhsBarcodeSymbologyID = that.getBarcodeSymbologyID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barcodeSymbologyID", lhsBarcodeSymbologyID), LocatorUtils.property(thatLocator, "barcodeSymbologyID", rhsBarcodeSymbologyID), lhsBarcodeSymbologyID, rhsBarcodeSymbologyID, (this.barcodeSymbologyID!= null), (that.barcodeSymbologyID!= null))) {
                return false;
            }
        }
        {
            List<PhysicalAttributeType> lhsPhysicalAttribute;
            lhsPhysicalAttribute = (((this.physicalAttribute!= null)&&(!this.physicalAttribute.isEmpty()))?this.getPhysicalAttribute():null);
            List<PhysicalAttributeType> rhsPhysicalAttribute;
            rhsPhysicalAttribute = (((that.physicalAttribute!= null)&&(!that.physicalAttribute.isEmpty()))?that.getPhysicalAttribute():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "physicalAttribute", lhsPhysicalAttribute), LocatorUtils.property(thatLocator, "physicalAttribute", rhsPhysicalAttribute), lhsPhysicalAttribute, rhsPhysicalAttribute, ((this.physicalAttribute!= null)&&(!this.physicalAttribute.isEmpty())), ((that.physicalAttribute!= null)&&(!that.physicalAttribute.isEmpty())))) {
                return false;
            }
        }
        {
            List<DimensionType> lhsMeasurementDimension;
            lhsMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            List<DimensionType> rhsMeasurementDimension;
            rhsMeasurementDimension = (((that.measurementDimension!= null)&&(!that.measurementDimension.isEmpty()))?that.getMeasurementDimension():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "measurementDimension", lhsMeasurementDimension), LocatorUtils.property(thatLocator, "measurementDimension", rhsMeasurementDimension), lhsMeasurementDimension, rhsMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())), ((that.measurementDimension!= null)&&(!that.measurementDimension.isEmpty())))) {
                return false;
            }
        }
        {
            PartyType lhsIssuerParty;
            lhsIssuerParty = this.getIssuerParty();
            PartyType rhsIssuerParty;
            rhsIssuerParty = that.getIssuerParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issuerParty", lhsIssuerParty), LocatorUtils.property(thatLocator, "issuerParty", rhsIssuerParty), lhsIssuerParty, rhsIssuerParty, (this.issuerParty!= null), (that.issuerParty!= null))) {
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
            ExtendedIDType theExtendedID;
            theExtendedID = this.getExtendedID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extendedID", theExtendedID), currentHashCode, theExtendedID, (this.extendedID!= null));
        }
        {
            BarcodeSymbologyIDType theBarcodeSymbologyID;
            theBarcodeSymbologyID = this.getBarcodeSymbologyID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "barcodeSymbologyID", theBarcodeSymbologyID), currentHashCode, theBarcodeSymbologyID, (this.barcodeSymbologyID!= null));
        }
        {
            List<PhysicalAttributeType> thePhysicalAttribute;
            thePhysicalAttribute = (((this.physicalAttribute!= null)&&(!this.physicalAttribute.isEmpty()))?this.getPhysicalAttribute():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "physicalAttribute", thePhysicalAttribute), currentHashCode, thePhysicalAttribute, ((this.physicalAttribute!= null)&&(!this.physicalAttribute.isEmpty())));
        }
        {
            List<DimensionType> theMeasurementDimension;
            theMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurementDimension", theMeasurementDimension), currentHashCode, theMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())));
        }
        {
            PartyType theIssuerParty;
            theIssuerParty = this.getIssuerParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issuerParty", theIssuerParty), currentHashCode, theIssuerParty, (this.issuerParty!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
