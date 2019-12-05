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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConditionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CountrySubentityCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CountrySubentityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InformationURIType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LocationTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
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
 * <p>Classe Java per LocationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Conditions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CountrySubentity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CountrySubentityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LocationTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InformationURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Address" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubsidiaryLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LocationCoordinate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationType", propOrder = {
    "id",
    "description",
    "conditions",
    "countrySubentity",
    "countrySubentityCode",
    "locationTypeCode",
    "informationURI",
    "name",
    "validityPeriod",
    "address",
    "subsidiaryLocation",
    "locationCoordinate"
})
public class LocationType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "Conditions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ConditionsType> conditions;
    @XmlElement(name = "CountrySubentity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CountrySubentityType countrySubentity;
    @XmlElement(name = "CountrySubentityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CountrySubentityCodeType countrySubentityCode;
    @XmlElement(name = "LocationTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LocationTypeCodeType locationTypeCode;
    @XmlElement(name = "InformationURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InformationURIType informationURI;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "ValidityPeriod")
    protected List<PeriodType> validityPeriod;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "SubsidiaryLocation")
    protected List<LocationType> subsidiaryLocation;
    @XmlElement(name = "LocationCoordinate")
    protected List<LocationCoordinateType> locationCoordinate;

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
     * Gets the value of the conditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionsType }
     * 
     * 
     */
    public List<ConditionsType> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<ConditionsType>();
        }
        return this.conditions;
    }

    /**
     * Recupera il valore della proprietà countrySubentity.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubentityType }
     *     
     */
    public CountrySubentityType getCountrySubentity() {
        return countrySubentity;
    }

    /**
     * Imposta il valore della proprietà countrySubentity.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubentityType }
     *     
     */
    public void setCountrySubentity(CountrySubentityType value) {
        this.countrySubentity = value;
    }

    /**
     * Recupera il valore della proprietà countrySubentityCode.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubentityCodeType }
     *     
     */
    public CountrySubentityCodeType getCountrySubentityCode() {
        return countrySubentityCode;
    }

    /**
     * Imposta il valore della proprietà countrySubentityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubentityCodeType }
     *     
     */
    public void setCountrySubentityCode(CountrySubentityCodeType value) {
        this.countrySubentityCode = value;
    }

    /**
     * Recupera il valore della proprietà locationTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeCodeType }
     *     
     */
    public LocationTypeCodeType getLocationTypeCode() {
        return locationTypeCode;
    }

    /**
     * Imposta il valore della proprietà locationTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeCodeType }
     *     
     */
    public void setLocationTypeCode(LocationTypeCodeType value) {
        this.locationTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà informationURI.
     * 
     * @return
     *     possible object is
     *     {@link InformationURIType }
     *     
     */
    public InformationURIType getInformationURI() {
        return informationURI;
    }

    /**
     * Imposta il valore della proprietà informationURI.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationURIType }
     *     
     */
    public void setInformationURI(InformationURIType value) {
        this.informationURI = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getValidityPeriod() {
        if (validityPeriod == null) {
            validityPeriod = new ArrayList<PeriodType>();
        }
        return this.validityPeriod;
    }

    /**
     * Recupera il valore della proprietà address.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Imposta il valore della proprietà address.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the subsidiaryLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsidiaryLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsidiaryLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getSubsidiaryLocation() {
        if (subsidiaryLocation == null) {
            subsidiaryLocation = new ArrayList<LocationType>();
        }
        return this.subsidiaryLocation;
    }

    /**
     * Gets the value of the locationCoordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationCoordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationCoordinateType }
     * 
     * 
     */
    public List<LocationCoordinateType> getLocationCoordinate() {
        if (locationCoordinate == null) {
            locationCoordinate = new ArrayList<LocationCoordinateType>();
        }
        return this.locationCoordinate;
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
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<ConditionsType> theConditions;
            theConditions = (((this.conditions!= null)&&(!this.conditions.isEmpty()))?this.getConditions():null);
            strategy.appendField(locator, this, "conditions", buffer, theConditions, ((this.conditions!= null)&&(!this.conditions.isEmpty())));
        }
        {
            CountrySubentityType theCountrySubentity;
            theCountrySubentity = this.getCountrySubentity();
            strategy.appendField(locator, this, "countrySubentity", buffer, theCountrySubentity, (this.countrySubentity!= null));
        }
        {
            CountrySubentityCodeType theCountrySubentityCode;
            theCountrySubentityCode = this.getCountrySubentityCode();
            strategy.appendField(locator, this, "countrySubentityCode", buffer, theCountrySubentityCode, (this.countrySubentityCode!= null));
        }
        {
            LocationTypeCodeType theLocationTypeCode;
            theLocationTypeCode = this.getLocationTypeCode();
            strategy.appendField(locator, this, "locationTypeCode", buffer, theLocationTypeCode, (this.locationTypeCode!= null));
        }
        {
            InformationURIType theInformationURI;
            theInformationURI = this.getInformationURI();
            strategy.appendField(locator, this, "informationURI", buffer, theInformationURI, (this.informationURI!= null));
        }
        {
            NameType theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            List<PeriodType> theValidityPeriod;
            theValidityPeriod = (((this.validityPeriod!= null)&&(!this.validityPeriod.isEmpty()))?this.getValidityPeriod():null);
            strategy.appendField(locator, this, "validityPeriod", buffer, theValidityPeriod, ((this.validityPeriod!= null)&&(!this.validityPeriod.isEmpty())));
        }
        {
            AddressType theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
        }
        {
            List<LocationType> theSubsidiaryLocation;
            theSubsidiaryLocation = (((this.subsidiaryLocation!= null)&&(!this.subsidiaryLocation.isEmpty()))?this.getSubsidiaryLocation():null);
            strategy.appendField(locator, this, "subsidiaryLocation", buffer, theSubsidiaryLocation, ((this.subsidiaryLocation!= null)&&(!this.subsidiaryLocation.isEmpty())));
        }
        {
            List<LocationCoordinateType> theLocationCoordinate;
            theLocationCoordinate = (((this.locationCoordinate!= null)&&(!this.locationCoordinate.isEmpty()))?this.getLocationCoordinate():null);
            strategy.appendField(locator, this, "locationCoordinate", buffer, theLocationCoordinate, ((this.locationCoordinate!= null)&&(!this.locationCoordinate.isEmpty())));
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
        final LocationType that = ((LocationType) object);
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
            List<DescriptionType> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<DescriptionType> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, ((this.description!= null)&&(!this.description.isEmpty())), ((that.description!= null)&&(!that.description.isEmpty())))) {
                return false;
            }
        }
        {
            List<ConditionsType> lhsConditions;
            lhsConditions = (((this.conditions!= null)&&(!this.conditions.isEmpty()))?this.getConditions():null);
            List<ConditionsType> rhsConditions;
            rhsConditions = (((that.conditions!= null)&&(!that.conditions.isEmpty()))?that.getConditions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conditions", lhsConditions), LocatorUtils.property(thatLocator, "conditions", rhsConditions), lhsConditions, rhsConditions, ((this.conditions!= null)&&(!this.conditions.isEmpty())), ((that.conditions!= null)&&(!that.conditions.isEmpty())))) {
                return false;
            }
        }
        {
            CountrySubentityType lhsCountrySubentity;
            lhsCountrySubentity = this.getCountrySubentity();
            CountrySubentityType rhsCountrySubentity;
            rhsCountrySubentity = that.getCountrySubentity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countrySubentity", lhsCountrySubentity), LocatorUtils.property(thatLocator, "countrySubentity", rhsCountrySubentity), lhsCountrySubentity, rhsCountrySubentity, (this.countrySubentity!= null), (that.countrySubentity!= null))) {
                return false;
            }
        }
        {
            CountrySubentityCodeType lhsCountrySubentityCode;
            lhsCountrySubentityCode = this.getCountrySubentityCode();
            CountrySubentityCodeType rhsCountrySubentityCode;
            rhsCountrySubentityCode = that.getCountrySubentityCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countrySubentityCode", lhsCountrySubentityCode), LocatorUtils.property(thatLocator, "countrySubentityCode", rhsCountrySubentityCode), lhsCountrySubentityCode, rhsCountrySubentityCode, (this.countrySubentityCode!= null), (that.countrySubentityCode!= null))) {
                return false;
            }
        }
        {
            LocationTypeCodeType lhsLocationTypeCode;
            lhsLocationTypeCode = this.getLocationTypeCode();
            LocationTypeCodeType rhsLocationTypeCode;
            rhsLocationTypeCode = that.getLocationTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationTypeCode", lhsLocationTypeCode), LocatorUtils.property(thatLocator, "locationTypeCode", rhsLocationTypeCode), lhsLocationTypeCode, rhsLocationTypeCode, (this.locationTypeCode!= null), (that.locationTypeCode!= null))) {
                return false;
            }
        }
        {
            InformationURIType lhsInformationURI;
            lhsInformationURI = this.getInformationURI();
            InformationURIType rhsInformationURI;
            rhsInformationURI = that.getInformationURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "informationURI", lhsInformationURI), LocatorUtils.property(thatLocator, "informationURI", rhsInformationURI), lhsInformationURI, rhsInformationURI, (this.informationURI!= null), (that.informationURI!= null))) {
                return false;
            }
        }
        {
            NameType lhsName;
            lhsName = this.getName();
            NameType rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            List<PeriodType> lhsValidityPeriod;
            lhsValidityPeriod = (((this.validityPeriod!= null)&&(!this.validityPeriod.isEmpty()))?this.getValidityPeriod():null);
            List<PeriodType> rhsValidityPeriod;
            rhsValidityPeriod = (((that.validityPeriod!= null)&&(!that.validityPeriod.isEmpty()))?that.getValidityPeriod():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validityPeriod", lhsValidityPeriod), LocatorUtils.property(thatLocator, "validityPeriod", rhsValidityPeriod), lhsValidityPeriod, rhsValidityPeriod, ((this.validityPeriod!= null)&&(!this.validityPeriod.isEmpty())), ((that.validityPeriod!= null)&&(!that.validityPeriod.isEmpty())))) {
                return false;
            }
        }
        {
            AddressType lhsAddress;
            lhsAddress = this.getAddress();
            AddressType rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress, (this.address!= null), (that.address!= null))) {
                return false;
            }
        }
        {
            List<LocationType> lhsSubsidiaryLocation;
            lhsSubsidiaryLocation = (((this.subsidiaryLocation!= null)&&(!this.subsidiaryLocation.isEmpty()))?this.getSubsidiaryLocation():null);
            List<LocationType> rhsSubsidiaryLocation;
            rhsSubsidiaryLocation = (((that.subsidiaryLocation!= null)&&(!that.subsidiaryLocation.isEmpty()))?that.getSubsidiaryLocation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subsidiaryLocation", lhsSubsidiaryLocation), LocatorUtils.property(thatLocator, "subsidiaryLocation", rhsSubsidiaryLocation), lhsSubsidiaryLocation, rhsSubsidiaryLocation, ((this.subsidiaryLocation!= null)&&(!this.subsidiaryLocation.isEmpty())), ((that.subsidiaryLocation!= null)&&(!that.subsidiaryLocation.isEmpty())))) {
                return false;
            }
        }
        {
            List<LocationCoordinateType> lhsLocationCoordinate;
            lhsLocationCoordinate = (((this.locationCoordinate!= null)&&(!this.locationCoordinate.isEmpty()))?this.getLocationCoordinate():null);
            List<LocationCoordinateType> rhsLocationCoordinate;
            rhsLocationCoordinate = (((that.locationCoordinate!= null)&&(!that.locationCoordinate.isEmpty()))?that.getLocationCoordinate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationCoordinate", lhsLocationCoordinate), LocatorUtils.property(thatLocator, "locationCoordinate", rhsLocationCoordinate), lhsLocationCoordinate, rhsLocationCoordinate, ((this.locationCoordinate!= null)&&(!this.locationCoordinate.isEmpty())), ((that.locationCoordinate!= null)&&(!that.locationCoordinate.isEmpty())))) {
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
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<ConditionsType> theConditions;
            theConditions = (((this.conditions!= null)&&(!this.conditions.isEmpty()))?this.getConditions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conditions", theConditions), currentHashCode, theConditions, ((this.conditions!= null)&&(!this.conditions.isEmpty())));
        }
        {
            CountrySubentityType theCountrySubentity;
            theCountrySubentity = this.getCountrySubentity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countrySubentity", theCountrySubentity), currentHashCode, theCountrySubentity, (this.countrySubentity!= null));
        }
        {
            CountrySubentityCodeType theCountrySubentityCode;
            theCountrySubentityCode = this.getCountrySubentityCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countrySubentityCode", theCountrySubentityCode), currentHashCode, theCountrySubentityCode, (this.countrySubentityCode!= null));
        }
        {
            LocationTypeCodeType theLocationTypeCode;
            theLocationTypeCode = this.getLocationTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locationTypeCode", theLocationTypeCode), currentHashCode, theLocationTypeCode, (this.locationTypeCode!= null));
        }
        {
            InformationURIType theInformationURI;
            theInformationURI = this.getInformationURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "informationURI", theInformationURI), currentHashCode, theInformationURI, (this.informationURI!= null));
        }
        {
            NameType theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            List<PeriodType> theValidityPeriod;
            theValidityPeriod = (((this.validityPeriod!= null)&&(!this.validityPeriod.isEmpty()))?this.getValidityPeriod():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validityPeriod", theValidityPeriod), currentHashCode, theValidityPeriod, ((this.validityPeriod!= null)&&(!this.validityPeriod.isEmpty())));
        }
        {
            AddressType theAddress;
            theAddress = this.getAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address", theAddress), currentHashCode, theAddress, (this.address!= null));
        }
        {
            List<LocationType> theSubsidiaryLocation;
            theSubsidiaryLocation = (((this.subsidiaryLocation!= null)&&(!this.subsidiaryLocation.isEmpty()))?this.getSubsidiaryLocation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subsidiaryLocation", theSubsidiaryLocation), currentHashCode, theSubsidiaryLocation, ((this.subsidiaryLocation!= null)&&(!this.subsidiaryLocation.isEmpty())));
        }
        {
            List<LocationCoordinateType> theLocationCoordinate;
            theLocationCoordinate = (((this.locationCoordinate!= null)&&(!this.locationCoordinate.isEmpty()))?this.getLocationCoordinate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locationCoordinate", theLocationCoordinate), currentHashCode, theLocationCoordinate, ((this.locationCoordinate!= null)&&(!this.locationCoordinate.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
