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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AuctionConstraintIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AuctionURIType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConditionsDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ElectronicDeviceDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.JustificationDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProcessDescriptionType;
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
 * <p>Classe Java per AuctionTermsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AuctionTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AuctionConstraintIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}JustificationDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcessDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConditionsDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ElectronicDeviceDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AuctionURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionTermsType", propOrder = {
    "auctionConstraintIndicator",
    "justificationDescription",
    "description",
    "processDescription",
    "conditionsDescription",
    "electronicDeviceDescription",
    "auctionURI"
})
public class AuctionTermsType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "AuctionConstraintIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AuctionConstraintIndicatorType auctionConstraintIndicator;
    @XmlElement(name = "JustificationDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<JustificationDescriptionType> justificationDescription;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "ProcessDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ProcessDescriptionType> processDescription;
    @XmlElement(name = "ConditionsDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ConditionsDescriptionType> conditionsDescription;
    @XmlElement(name = "ElectronicDeviceDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ElectronicDeviceDescriptionType> electronicDeviceDescription;
    @XmlElement(name = "AuctionURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AuctionURIType auctionURI;

    /**
     * Recupera il valore della proprietà auctionConstraintIndicator.
     * 
     * @return
     *     possible object is
     *     {@link AuctionConstraintIndicatorType }
     *     
     */
    public AuctionConstraintIndicatorType getAuctionConstraintIndicator() {
        return auctionConstraintIndicator;
    }

    /**
     * Imposta il valore della proprietà auctionConstraintIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionConstraintIndicatorType }
     *     
     */
    public void setAuctionConstraintIndicator(AuctionConstraintIndicatorType value) {
        this.auctionConstraintIndicator = value;
    }

    /**
     * Gets the value of the justificationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the justificationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJustificationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JustificationDescriptionType }
     * 
     * 
     */
    public List<JustificationDescriptionType> getJustificationDescription() {
        if (justificationDescription == null) {
            justificationDescription = new ArrayList<JustificationDescriptionType>();
        }
        return this.justificationDescription;
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
     * Gets the value of the processDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessDescriptionType }
     * 
     * 
     */
    public List<ProcessDescriptionType> getProcessDescription() {
        if (processDescription == null) {
            processDescription = new ArrayList<ProcessDescriptionType>();
        }
        return this.processDescription;
    }

    /**
     * Gets the value of the conditionsDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionsDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionsDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionsDescriptionType }
     * 
     * 
     */
    public List<ConditionsDescriptionType> getConditionsDescription() {
        if (conditionsDescription == null) {
            conditionsDescription = new ArrayList<ConditionsDescriptionType>();
        }
        return this.conditionsDescription;
    }

    /**
     * Gets the value of the electronicDeviceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicDeviceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicDeviceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicDeviceDescriptionType }
     * 
     * 
     */
    public List<ElectronicDeviceDescriptionType> getElectronicDeviceDescription() {
        if (electronicDeviceDescription == null) {
            electronicDeviceDescription = new ArrayList<ElectronicDeviceDescriptionType>();
        }
        return this.electronicDeviceDescription;
    }

    /**
     * Recupera il valore della proprietà auctionURI.
     * 
     * @return
     *     possible object is
     *     {@link AuctionURIType }
     *     
     */
    public AuctionURIType getAuctionURI() {
        return auctionURI;
    }

    /**
     * Imposta il valore della proprietà auctionURI.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionURIType }
     *     
     */
    public void setAuctionURI(AuctionURIType value) {
        this.auctionURI = value;
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
            AuctionConstraintIndicatorType theAuctionConstraintIndicator;
            theAuctionConstraintIndicator = this.getAuctionConstraintIndicator();
            strategy.appendField(locator, this, "auctionConstraintIndicator", buffer, theAuctionConstraintIndicator, (this.auctionConstraintIndicator!= null));
        }
        {
            List<JustificationDescriptionType> theJustificationDescription;
            theJustificationDescription = (((this.justificationDescription!= null)&&(!this.justificationDescription.isEmpty()))?this.getJustificationDescription():null);
            strategy.appendField(locator, this, "justificationDescription", buffer, theJustificationDescription, ((this.justificationDescription!= null)&&(!this.justificationDescription.isEmpty())));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<ProcessDescriptionType> theProcessDescription;
            theProcessDescription = (((this.processDescription!= null)&&(!this.processDescription.isEmpty()))?this.getProcessDescription():null);
            strategy.appendField(locator, this, "processDescription", buffer, theProcessDescription, ((this.processDescription!= null)&&(!this.processDescription.isEmpty())));
        }
        {
            List<ConditionsDescriptionType> theConditionsDescription;
            theConditionsDescription = (((this.conditionsDescription!= null)&&(!this.conditionsDescription.isEmpty()))?this.getConditionsDescription():null);
            strategy.appendField(locator, this, "conditionsDescription", buffer, theConditionsDescription, ((this.conditionsDescription!= null)&&(!this.conditionsDescription.isEmpty())));
        }
        {
            List<ElectronicDeviceDescriptionType> theElectronicDeviceDescription;
            theElectronicDeviceDescription = (((this.electronicDeviceDescription!= null)&&(!this.electronicDeviceDescription.isEmpty()))?this.getElectronicDeviceDescription():null);
            strategy.appendField(locator, this, "electronicDeviceDescription", buffer, theElectronicDeviceDescription, ((this.electronicDeviceDescription!= null)&&(!this.electronicDeviceDescription.isEmpty())));
        }
        {
            AuctionURIType theAuctionURI;
            theAuctionURI = this.getAuctionURI();
            strategy.appendField(locator, this, "auctionURI", buffer, theAuctionURI, (this.auctionURI!= null));
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
        final AuctionTermsType that = ((AuctionTermsType) object);
        {
            AuctionConstraintIndicatorType lhsAuctionConstraintIndicator;
            lhsAuctionConstraintIndicator = this.getAuctionConstraintIndicator();
            AuctionConstraintIndicatorType rhsAuctionConstraintIndicator;
            rhsAuctionConstraintIndicator = that.getAuctionConstraintIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auctionConstraintIndicator", lhsAuctionConstraintIndicator), LocatorUtils.property(thatLocator, "auctionConstraintIndicator", rhsAuctionConstraintIndicator), lhsAuctionConstraintIndicator, rhsAuctionConstraintIndicator, (this.auctionConstraintIndicator!= null), (that.auctionConstraintIndicator!= null))) {
                return false;
            }
        }
        {
            List<JustificationDescriptionType> lhsJustificationDescription;
            lhsJustificationDescription = (((this.justificationDescription!= null)&&(!this.justificationDescription.isEmpty()))?this.getJustificationDescription():null);
            List<JustificationDescriptionType> rhsJustificationDescription;
            rhsJustificationDescription = (((that.justificationDescription!= null)&&(!that.justificationDescription.isEmpty()))?that.getJustificationDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "justificationDescription", lhsJustificationDescription), LocatorUtils.property(thatLocator, "justificationDescription", rhsJustificationDescription), lhsJustificationDescription, rhsJustificationDescription, ((this.justificationDescription!= null)&&(!this.justificationDescription.isEmpty())), ((that.justificationDescription!= null)&&(!that.justificationDescription.isEmpty())))) {
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
            List<ProcessDescriptionType> lhsProcessDescription;
            lhsProcessDescription = (((this.processDescription!= null)&&(!this.processDescription.isEmpty()))?this.getProcessDescription():null);
            List<ProcessDescriptionType> rhsProcessDescription;
            rhsProcessDescription = (((that.processDescription!= null)&&(!that.processDescription.isEmpty()))?that.getProcessDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processDescription", lhsProcessDescription), LocatorUtils.property(thatLocator, "processDescription", rhsProcessDescription), lhsProcessDescription, rhsProcessDescription, ((this.processDescription!= null)&&(!this.processDescription.isEmpty())), ((that.processDescription!= null)&&(!that.processDescription.isEmpty())))) {
                return false;
            }
        }
        {
            List<ConditionsDescriptionType> lhsConditionsDescription;
            lhsConditionsDescription = (((this.conditionsDescription!= null)&&(!this.conditionsDescription.isEmpty()))?this.getConditionsDescription():null);
            List<ConditionsDescriptionType> rhsConditionsDescription;
            rhsConditionsDescription = (((that.conditionsDescription!= null)&&(!that.conditionsDescription.isEmpty()))?that.getConditionsDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conditionsDescription", lhsConditionsDescription), LocatorUtils.property(thatLocator, "conditionsDescription", rhsConditionsDescription), lhsConditionsDescription, rhsConditionsDescription, ((this.conditionsDescription!= null)&&(!this.conditionsDescription.isEmpty())), ((that.conditionsDescription!= null)&&(!that.conditionsDescription.isEmpty())))) {
                return false;
            }
        }
        {
            List<ElectronicDeviceDescriptionType> lhsElectronicDeviceDescription;
            lhsElectronicDeviceDescription = (((this.electronicDeviceDescription!= null)&&(!this.electronicDeviceDescription.isEmpty()))?this.getElectronicDeviceDescription():null);
            List<ElectronicDeviceDescriptionType> rhsElectronicDeviceDescription;
            rhsElectronicDeviceDescription = (((that.electronicDeviceDescription!= null)&&(!that.electronicDeviceDescription.isEmpty()))?that.getElectronicDeviceDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "electronicDeviceDescription", lhsElectronicDeviceDescription), LocatorUtils.property(thatLocator, "electronicDeviceDescription", rhsElectronicDeviceDescription), lhsElectronicDeviceDescription, rhsElectronicDeviceDescription, ((this.electronicDeviceDescription!= null)&&(!this.electronicDeviceDescription.isEmpty())), ((that.electronicDeviceDescription!= null)&&(!that.electronicDeviceDescription.isEmpty())))) {
                return false;
            }
        }
        {
            AuctionURIType lhsAuctionURI;
            lhsAuctionURI = this.getAuctionURI();
            AuctionURIType rhsAuctionURI;
            rhsAuctionURI = that.getAuctionURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auctionURI", lhsAuctionURI), LocatorUtils.property(thatLocator, "auctionURI", rhsAuctionURI), lhsAuctionURI, rhsAuctionURI, (this.auctionURI!= null), (that.auctionURI!= null))) {
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
            AuctionConstraintIndicatorType theAuctionConstraintIndicator;
            theAuctionConstraintIndicator = this.getAuctionConstraintIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "auctionConstraintIndicator", theAuctionConstraintIndicator), currentHashCode, theAuctionConstraintIndicator, (this.auctionConstraintIndicator!= null));
        }
        {
            List<JustificationDescriptionType> theJustificationDescription;
            theJustificationDescription = (((this.justificationDescription!= null)&&(!this.justificationDescription.isEmpty()))?this.getJustificationDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "justificationDescription", theJustificationDescription), currentHashCode, theJustificationDescription, ((this.justificationDescription!= null)&&(!this.justificationDescription.isEmpty())));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<ProcessDescriptionType> theProcessDescription;
            theProcessDescription = (((this.processDescription!= null)&&(!this.processDescription.isEmpty()))?this.getProcessDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processDescription", theProcessDescription), currentHashCode, theProcessDescription, ((this.processDescription!= null)&&(!this.processDescription.isEmpty())));
        }
        {
            List<ConditionsDescriptionType> theConditionsDescription;
            theConditionsDescription = (((this.conditionsDescription!= null)&&(!this.conditionsDescription.isEmpty()))?this.getConditionsDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conditionsDescription", theConditionsDescription), currentHashCode, theConditionsDescription, ((this.conditionsDescription!= null)&&(!this.conditionsDescription.isEmpty())));
        }
        {
            List<ElectronicDeviceDescriptionType> theElectronicDeviceDescription;
            theElectronicDeviceDescription = (((this.electronicDeviceDescription!= null)&&(!this.electronicDeviceDescription.isEmpty()))?this.getElectronicDeviceDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "electronicDeviceDescription", theElectronicDeviceDescription), currentHashCode, theElectronicDeviceDescription, ((this.electronicDeviceDescription!= null)&&(!this.electronicDeviceDescription.isEmpty())));
        }
        {
            AuctionURIType theAuctionURI;
            theAuctionURI = this.getAuctionURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "auctionURI", theAuctionURI), currentHashCode, theAuctionURI, (this.auctionURI!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
