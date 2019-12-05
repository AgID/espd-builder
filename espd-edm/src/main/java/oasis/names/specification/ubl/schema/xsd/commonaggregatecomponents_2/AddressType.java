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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AdditionalStreetNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AddressFormatCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AddressTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BlockNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BuildingNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BuildingNumberType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CityNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CitySubdivisionNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CountrySubentityCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CountrySubentityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DepartmentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DistrictType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FloorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InhouseMailType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MarkAttentionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MarkCareType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PlotIdentificationType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PostalZoneType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PostboxType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RoomType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StreetNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TimezoneOffsetType;
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
 * <p>Classe Java per AddressType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AddressTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AddressFormatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Postbox" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Floor" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Room" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StreetName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalStreetName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BlockName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BuildingName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BuildingNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InhouseMail" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Department" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkAttention" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkCare" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlotIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CitySubdivisionName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CityName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PostalZone" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CountrySubentity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CountrySubentityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Region" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}District" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimezoneOffset" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AddressLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Country" minOccurs="0"/&gt;
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
@XmlType(name = "AddressType", propOrder = {
    "id",
    "addressTypeCode",
    "addressFormatCode",
    "postbox",
    "floor",
    "room",
    "streetName",
    "additionalStreetName",
    "blockName",
    "buildingName",
    "buildingNumber",
    "inhouseMail",
    "department",
    "markAttention",
    "markCare",
    "plotIdentification",
    "citySubdivisionName",
    "cityName",
    "postalZone",
    "countrySubentity",
    "countrySubentityCode",
    "region",
    "district",
    "timezoneOffset",
    "addressLine",
    "country",
    "locationCoordinate"
})
public class AddressType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "AddressTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AddressTypeCodeType addressTypeCode;
    @XmlElement(name = "AddressFormatCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AddressFormatCodeType addressFormatCode;
    @XmlElement(name = "Postbox", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PostboxType postbox;
    @XmlElement(name = "Floor", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FloorType floor;
    @XmlElement(name = "Room", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RoomType room;
    @XmlElement(name = "StreetName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected StreetNameType streetName;
    @XmlElement(name = "AdditionalStreetName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AdditionalStreetNameType additionalStreetName;
    @XmlElement(name = "BlockName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BlockNameType blockName;
    @XmlElement(name = "BuildingName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BuildingNameType buildingName;
    @XmlElement(name = "BuildingNumber", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BuildingNumberType buildingNumber;
    @XmlElement(name = "InhouseMail", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InhouseMailType inhouseMail;
    @XmlElement(name = "Department", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DepartmentType department;
    @XmlElement(name = "MarkAttention", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MarkAttentionType markAttention;
    @XmlElement(name = "MarkCare", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MarkCareType markCare;
    @XmlElement(name = "PlotIdentification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PlotIdentificationType plotIdentification;
    @XmlElement(name = "CitySubdivisionName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CitySubdivisionNameType citySubdivisionName;
    @XmlElement(name = "CityName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CityNameType cityName;
    @XmlElement(name = "PostalZone", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PostalZoneType postalZone;
    @XmlElement(name = "CountrySubentity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CountrySubentityType countrySubentity;
    @XmlElement(name = "CountrySubentityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CountrySubentityCodeType countrySubentityCode;
    @XmlElement(name = "Region", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegionType region;
    @XmlElement(name = "District", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DistrictType district;
    @XmlElement(name = "TimezoneOffset", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TimezoneOffsetType timezoneOffset;
    @XmlElement(name = "AddressLine")
    protected List<AddressLineType> addressLine;
    @XmlElement(name = "Country")
    protected CountryType country;
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
     * Recupera il valore della proprietà addressTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link AddressTypeCodeType }
     *     
     */
    public AddressTypeCodeType getAddressTypeCode() {
        return addressTypeCode;
    }

    /**
     * Imposta il valore della proprietà addressTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressTypeCodeType }
     *     
     */
    public void setAddressTypeCode(AddressTypeCodeType value) {
        this.addressTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà addressFormatCode.
     * 
     * @return
     *     possible object is
     *     {@link AddressFormatCodeType }
     *     
     */
    public AddressFormatCodeType getAddressFormatCode() {
        return addressFormatCode;
    }

    /**
     * Imposta il valore della proprietà addressFormatCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressFormatCodeType }
     *     
     */
    public void setAddressFormatCode(AddressFormatCodeType value) {
        this.addressFormatCode = value;
    }

    /**
     * Recupera il valore della proprietà postbox.
     * 
     * @return
     *     possible object is
     *     {@link PostboxType }
     *     
     */
    public PostboxType getPostbox() {
        return postbox;
    }

    /**
     * Imposta il valore della proprietà postbox.
     * 
     * @param value
     *     allowed object is
     *     {@link PostboxType }
     *     
     */
    public void setPostbox(PostboxType value) {
        this.postbox = value;
    }

    /**
     * Recupera il valore della proprietà floor.
     * 
     * @return
     *     possible object is
     *     {@link FloorType }
     *     
     */
    public FloorType getFloor() {
        return floor;
    }

    /**
     * Imposta il valore della proprietà floor.
     * 
     * @param value
     *     allowed object is
     *     {@link FloorType }
     *     
     */
    public void setFloor(FloorType value) {
        this.floor = value;
    }

    /**
     * Recupera il valore della proprietà room.
     * 
     * @return
     *     possible object is
     *     {@link RoomType }
     *     
     */
    public RoomType getRoom() {
        return room;
    }

    /**
     * Imposta il valore della proprietà room.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomType }
     *     
     */
    public void setRoom(RoomType value) {
        this.room = value;
    }

    /**
     * Recupera il valore della proprietà streetName.
     * 
     * @return
     *     possible object is
     *     {@link StreetNameType }
     *     
     */
    public StreetNameType getStreetName() {
        return streetName;
    }

    /**
     * Imposta il valore della proprietà streetName.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetNameType }
     *     
     */
    public void setStreetName(StreetNameType value) {
        this.streetName = value;
    }

    /**
     * Recupera il valore della proprietà additionalStreetName.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalStreetNameType }
     *     
     */
    public AdditionalStreetNameType getAdditionalStreetName() {
        return additionalStreetName;
    }

    /**
     * Imposta il valore della proprietà additionalStreetName.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalStreetNameType }
     *     
     */
    public void setAdditionalStreetName(AdditionalStreetNameType value) {
        this.additionalStreetName = value;
    }

    /**
     * Recupera il valore della proprietà blockName.
     * 
     * @return
     *     possible object is
     *     {@link BlockNameType }
     *     
     */
    public BlockNameType getBlockName() {
        return blockName;
    }

    /**
     * Imposta il valore della proprietà blockName.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockNameType }
     *     
     */
    public void setBlockName(BlockNameType value) {
        this.blockName = value;
    }

    /**
     * Recupera il valore della proprietà buildingName.
     * 
     * @return
     *     possible object is
     *     {@link BuildingNameType }
     *     
     */
    public BuildingNameType getBuildingName() {
        return buildingName;
    }

    /**
     * Imposta il valore della proprietà buildingName.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingNameType }
     *     
     */
    public void setBuildingName(BuildingNameType value) {
        this.buildingName = value;
    }

    /**
     * Recupera il valore della proprietà buildingNumber.
     * 
     * @return
     *     possible object is
     *     {@link BuildingNumberType }
     *     
     */
    public BuildingNumberType getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Imposta il valore della proprietà buildingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingNumberType }
     *     
     */
    public void setBuildingNumber(BuildingNumberType value) {
        this.buildingNumber = value;
    }

    /**
     * Recupera il valore della proprietà inhouseMail.
     * 
     * @return
     *     possible object is
     *     {@link InhouseMailType }
     *     
     */
    public InhouseMailType getInhouseMail() {
        return inhouseMail;
    }

    /**
     * Imposta il valore della proprietà inhouseMail.
     * 
     * @param value
     *     allowed object is
     *     {@link InhouseMailType }
     *     
     */
    public void setInhouseMail(InhouseMailType value) {
        this.inhouseMail = value;
    }

    /**
     * Recupera il valore della proprietà department.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentType }
     *     
     */
    public DepartmentType getDepartment() {
        return department;
    }

    /**
     * Imposta il valore della proprietà department.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentType }
     *     
     */
    public void setDepartment(DepartmentType value) {
        this.department = value;
    }

    /**
     * Recupera il valore della proprietà markAttention.
     * 
     * @return
     *     possible object is
     *     {@link MarkAttentionType }
     *     
     */
    public MarkAttentionType getMarkAttention() {
        return markAttention;
    }

    /**
     * Imposta il valore della proprietà markAttention.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkAttentionType }
     *     
     */
    public void setMarkAttention(MarkAttentionType value) {
        this.markAttention = value;
    }

    /**
     * Recupera il valore della proprietà markCare.
     * 
     * @return
     *     possible object is
     *     {@link MarkCareType }
     *     
     */
    public MarkCareType getMarkCare() {
        return markCare;
    }

    /**
     * Imposta il valore della proprietà markCare.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkCareType }
     *     
     */
    public void setMarkCare(MarkCareType value) {
        this.markCare = value;
    }

    /**
     * Recupera il valore della proprietà plotIdentification.
     * 
     * @return
     *     possible object is
     *     {@link PlotIdentificationType }
     *     
     */
    public PlotIdentificationType getPlotIdentification() {
        return plotIdentification;
    }

    /**
     * Imposta il valore della proprietà plotIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link PlotIdentificationType }
     *     
     */
    public void setPlotIdentification(PlotIdentificationType value) {
        this.plotIdentification = value;
    }

    /**
     * Recupera il valore della proprietà citySubdivisionName.
     * 
     * @return
     *     possible object is
     *     {@link CitySubdivisionNameType }
     *     
     */
    public CitySubdivisionNameType getCitySubdivisionName() {
        return citySubdivisionName;
    }

    /**
     * Imposta il valore della proprietà citySubdivisionName.
     * 
     * @param value
     *     allowed object is
     *     {@link CitySubdivisionNameType }
     *     
     */
    public void setCitySubdivisionName(CitySubdivisionNameType value) {
        this.citySubdivisionName = value;
    }

    /**
     * Recupera il valore della proprietà cityName.
     * 
     * @return
     *     possible object is
     *     {@link CityNameType }
     *     
     */
    public CityNameType getCityName() {
        return cityName;
    }

    /**
     * Imposta il valore della proprietà cityName.
     * 
     * @param value
     *     allowed object is
     *     {@link CityNameType }
     *     
     */
    public void setCityName(CityNameType value) {
        this.cityName = value;
    }

    /**
     * Recupera il valore della proprietà postalZone.
     * 
     * @return
     *     possible object is
     *     {@link PostalZoneType }
     *     
     */
    public PostalZoneType getPostalZone() {
        return postalZone;
    }

    /**
     * Imposta il valore della proprietà postalZone.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalZoneType }
     *     
     */
    public void setPostalZone(PostalZoneType value) {
        this.postalZone = value;
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
     * Recupera il valore della proprietà region.
     * 
     * @return
     *     possible object is
     *     {@link RegionType }
     *     
     */
    public RegionType getRegion() {
        return region;
    }

    /**
     * Imposta il valore della proprietà region.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionType }
     *     
     */
    public void setRegion(RegionType value) {
        this.region = value;
    }

    /**
     * Recupera il valore della proprietà district.
     * 
     * @return
     *     possible object is
     *     {@link DistrictType }
     *     
     */
    public DistrictType getDistrict() {
        return district;
    }

    /**
     * Imposta il valore della proprietà district.
     * 
     * @param value
     *     allowed object is
     *     {@link DistrictType }
     *     
     */
    public void setDistrict(DistrictType value) {
        this.district = value;
    }

    /**
     * Recupera il valore della proprietà timezoneOffset.
     * 
     * @return
     *     possible object is
     *     {@link TimezoneOffsetType }
     *     
     */
    public TimezoneOffsetType getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * Imposta il valore della proprietà timezoneOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link TimezoneOffsetType }
     *     
     */
    public void setTimezoneOffset(TimezoneOffsetType value) {
        this.timezoneOffset = value;
    }

    /**
     * Gets the value of the addressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressLineType }
     * 
     * 
     */
    public List<AddressLineType> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<AddressLineType>();
        }
        return this.addressLine;
    }

    /**
     * Recupera il valore della proprietà country.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Imposta il valore della proprietà country.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
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
            AddressTypeCodeType theAddressTypeCode;
            theAddressTypeCode = this.getAddressTypeCode();
            strategy.appendField(locator, this, "addressTypeCode", buffer, theAddressTypeCode, (this.addressTypeCode!= null));
        }
        {
            AddressFormatCodeType theAddressFormatCode;
            theAddressFormatCode = this.getAddressFormatCode();
            strategy.appendField(locator, this, "addressFormatCode", buffer, theAddressFormatCode, (this.addressFormatCode!= null));
        }
        {
            PostboxType thePostbox;
            thePostbox = this.getPostbox();
            strategy.appendField(locator, this, "postbox", buffer, thePostbox, (this.postbox!= null));
        }
        {
            FloorType theFloor;
            theFloor = this.getFloor();
            strategy.appendField(locator, this, "floor", buffer, theFloor, (this.floor!= null));
        }
        {
            RoomType theRoom;
            theRoom = this.getRoom();
            strategy.appendField(locator, this, "room", buffer, theRoom, (this.room!= null));
        }
        {
            StreetNameType theStreetName;
            theStreetName = this.getStreetName();
            strategy.appendField(locator, this, "streetName", buffer, theStreetName, (this.streetName!= null));
        }
        {
            AdditionalStreetNameType theAdditionalStreetName;
            theAdditionalStreetName = this.getAdditionalStreetName();
            strategy.appendField(locator, this, "additionalStreetName", buffer, theAdditionalStreetName, (this.additionalStreetName!= null));
        }
        {
            BlockNameType theBlockName;
            theBlockName = this.getBlockName();
            strategy.appendField(locator, this, "blockName", buffer, theBlockName, (this.blockName!= null));
        }
        {
            BuildingNameType theBuildingName;
            theBuildingName = this.getBuildingName();
            strategy.appendField(locator, this, "buildingName", buffer, theBuildingName, (this.buildingName!= null));
        }
        {
            BuildingNumberType theBuildingNumber;
            theBuildingNumber = this.getBuildingNumber();
            strategy.appendField(locator, this, "buildingNumber", buffer, theBuildingNumber, (this.buildingNumber!= null));
        }
        {
            InhouseMailType theInhouseMail;
            theInhouseMail = this.getInhouseMail();
            strategy.appendField(locator, this, "inhouseMail", buffer, theInhouseMail, (this.inhouseMail!= null));
        }
        {
            DepartmentType theDepartment;
            theDepartment = this.getDepartment();
            strategy.appendField(locator, this, "department", buffer, theDepartment, (this.department!= null));
        }
        {
            MarkAttentionType theMarkAttention;
            theMarkAttention = this.getMarkAttention();
            strategy.appendField(locator, this, "markAttention", buffer, theMarkAttention, (this.markAttention!= null));
        }
        {
            MarkCareType theMarkCare;
            theMarkCare = this.getMarkCare();
            strategy.appendField(locator, this, "markCare", buffer, theMarkCare, (this.markCare!= null));
        }
        {
            PlotIdentificationType thePlotIdentification;
            thePlotIdentification = this.getPlotIdentification();
            strategy.appendField(locator, this, "plotIdentification", buffer, thePlotIdentification, (this.plotIdentification!= null));
        }
        {
            CitySubdivisionNameType theCitySubdivisionName;
            theCitySubdivisionName = this.getCitySubdivisionName();
            strategy.appendField(locator, this, "citySubdivisionName", buffer, theCitySubdivisionName, (this.citySubdivisionName!= null));
        }
        {
            CityNameType theCityName;
            theCityName = this.getCityName();
            strategy.appendField(locator, this, "cityName", buffer, theCityName, (this.cityName!= null));
        }
        {
            PostalZoneType thePostalZone;
            thePostalZone = this.getPostalZone();
            strategy.appendField(locator, this, "postalZone", buffer, thePostalZone, (this.postalZone!= null));
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
            RegionType theRegion;
            theRegion = this.getRegion();
            strategy.appendField(locator, this, "region", buffer, theRegion, (this.region!= null));
        }
        {
            DistrictType theDistrict;
            theDistrict = this.getDistrict();
            strategy.appendField(locator, this, "district", buffer, theDistrict, (this.district!= null));
        }
        {
            TimezoneOffsetType theTimezoneOffset;
            theTimezoneOffset = this.getTimezoneOffset();
            strategy.appendField(locator, this, "timezoneOffset", buffer, theTimezoneOffset, (this.timezoneOffset!= null));
        }
        {
            List<AddressLineType> theAddressLine;
            theAddressLine = (((this.addressLine!= null)&&(!this.addressLine.isEmpty()))?this.getAddressLine():null);
            strategy.appendField(locator, this, "addressLine", buffer, theAddressLine, ((this.addressLine!= null)&&(!this.addressLine.isEmpty())));
        }
        {
            CountryType theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry, (this.country!= null));
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
        final AddressType that = ((AddressType) object);
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
            AddressTypeCodeType lhsAddressTypeCode;
            lhsAddressTypeCode = this.getAddressTypeCode();
            AddressTypeCodeType rhsAddressTypeCode;
            rhsAddressTypeCode = that.getAddressTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addressTypeCode", lhsAddressTypeCode), LocatorUtils.property(thatLocator, "addressTypeCode", rhsAddressTypeCode), lhsAddressTypeCode, rhsAddressTypeCode, (this.addressTypeCode!= null), (that.addressTypeCode!= null))) {
                return false;
            }
        }
        {
            AddressFormatCodeType lhsAddressFormatCode;
            lhsAddressFormatCode = this.getAddressFormatCode();
            AddressFormatCodeType rhsAddressFormatCode;
            rhsAddressFormatCode = that.getAddressFormatCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addressFormatCode", lhsAddressFormatCode), LocatorUtils.property(thatLocator, "addressFormatCode", rhsAddressFormatCode), lhsAddressFormatCode, rhsAddressFormatCode, (this.addressFormatCode!= null), (that.addressFormatCode!= null))) {
                return false;
            }
        }
        {
            PostboxType lhsPostbox;
            lhsPostbox = this.getPostbox();
            PostboxType rhsPostbox;
            rhsPostbox = that.getPostbox();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postbox", lhsPostbox), LocatorUtils.property(thatLocator, "postbox", rhsPostbox), lhsPostbox, rhsPostbox, (this.postbox!= null), (that.postbox!= null))) {
                return false;
            }
        }
        {
            FloorType lhsFloor;
            lhsFloor = this.getFloor();
            FloorType rhsFloor;
            rhsFloor = that.getFloor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floor", lhsFloor), LocatorUtils.property(thatLocator, "floor", rhsFloor), lhsFloor, rhsFloor, (this.floor!= null), (that.floor!= null))) {
                return false;
            }
        }
        {
            RoomType lhsRoom;
            lhsRoom = this.getRoom();
            RoomType rhsRoom;
            rhsRoom = that.getRoom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "room", lhsRoom), LocatorUtils.property(thatLocator, "room", rhsRoom), lhsRoom, rhsRoom, (this.room!= null), (that.room!= null))) {
                return false;
            }
        }
        {
            StreetNameType lhsStreetName;
            lhsStreetName = this.getStreetName();
            StreetNameType rhsStreetName;
            rhsStreetName = that.getStreetName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "streetName", lhsStreetName), LocatorUtils.property(thatLocator, "streetName", rhsStreetName), lhsStreetName, rhsStreetName, (this.streetName!= null), (that.streetName!= null))) {
                return false;
            }
        }
        {
            AdditionalStreetNameType lhsAdditionalStreetName;
            lhsAdditionalStreetName = this.getAdditionalStreetName();
            AdditionalStreetNameType rhsAdditionalStreetName;
            rhsAdditionalStreetName = that.getAdditionalStreetName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalStreetName", lhsAdditionalStreetName), LocatorUtils.property(thatLocator, "additionalStreetName", rhsAdditionalStreetName), lhsAdditionalStreetName, rhsAdditionalStreetName, (this.additionalStreetName!= null), (that.additionalStreetName!= null))) {
                return false;
            }
        }
        {
            BlockNameType lhsBlockName;
            lhsBlockName = this.getBlockName();
            BlockNameType rhsBlockName;
            rhsBlockName = that.getBlockName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "blockName", lhsBlockName), LocatorUtils.property(thatLocator, "blockName", rhsBlockName), lhsBlockName, rhsBlockName, (this.blockName!= null), (that.blockName!= null))) {
                return false;
            }
        }
        {
            BuildingNameType lhsBuildingName;
            lhsBuildingName = this.getBuildingName();
            BuildingNameType rhsBuildingName;
            rhsBuildingName = that.getBuildingName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingName", lhsBuildingName), LocatorUtils.property(thatLocator, "buildingName", rhsBuildingName), lhsBuildingName, rhsBuildingName, (this.buildingName!= null), (that.buildingName!= null))) {
                return false;
            }
        }
        {
            BuildingNumberType lhsBuildingNumber;
            lhsBuildingNumber = this.getBuildingNumber();
            BuildingNumberType rhsBuildingNumber;
            rhsBuildingNumber = that.getBuildingNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingNumber", lhsBuildingNumber), LocatorUtils.property(thatLocator, "buildingNumber", rhsBuildingNumber), lhsBuildingNumber, rhsBuildingNumber, (this.buildingNumber!= null), (that.buildingNumber!= null))) {
                return false;
            }
        }
        {
            InhouseMailType lhsInhouseMail;
            lhsInhouseMail = this.getInhouseMail();
            InhouseMailType rhsInhouseMail;
            rhsInhouseMail = that.getInhouseMail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inhouseMail", lhsInhouseMail), LocatorUtils.property(thatLocator, "inhouseMail", rhsInhouseMail), lhsInhouseMail, rhsInhouseMail, (this.inhouseMail!= null), (that.inhouseMail!= null))) {
                return false;
            }
        }
        {
            DepartmentType lhsDepartment;
            lhsDepartment = this.getDepartment();
            DepartmentType rhsDepartment;
            rhsDepartment = that.getDepartment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "department", lhsDepartment), LocatorUtils.property(thatLocator, "department", rhsDepartment), lhsDepartment, rhsDepartment, (this.department!= null), (that.department!= null))) {
                return false;
            }
        }
        {
            MarkAttentionType lhsMarkAttention;
            lhsMarkAttention = this.getMarkAttention();
            MarkAttentionType rhsMarkAttention;
            rhsMarkAttention = that.getMarkAttention();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markAttention", lhsMarkAttention), LocatorUtils.property(thatLocator, "markAttention", rhsMarkAttention), lhsMarkAttention, rhsMarkAttention, (this.markAttention!= null), (that.markAttention!= null))) {
                return false;
            }
        }
        {
            MarkCareType lhsMarkCare;
            lhsMarkCare = this.getMarkCare();
            MarkCareType rhsMarkCare;
            rhsMarkCare = that.getMarkCare();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markCare", lhsMarkCare), LocatorUtils.property(thatLocator, "markCare", rhsMarkCare), lhsMarkCare, rhsMarkCare, (this.markCare!= null), (that.markCare!= null))) {
                return false;
            }
        }
        {
            PlotIdentificationType lhsPlotIdentification;
            lhsPlotIdentification = this.getPlotIdentification();
            PlotIdentificationType rhsPlotIdentification;
            rhsPlotIdentification = that.getPlotIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plotIdentification", lhsPlotIdentification), LocatorUtils.property(thatLocator, "plotIdentification", rhsPlotIdentification), lhsPlotIdentification, rhsPlotIdentification, (this.plotIdentification!= null), (that.plotIdentification!= null))) {
                return false;
            }
        }
        {
            CitySubdivisionNameType lhsCitySubdivisionName;
            lhsCitySubdivisionName = this.getCitySubdivisionName();
            CitySubdivisionNameType rhsCitySubdivisionName;
            rhsCitySubdivisionName = that.getCitySubdivisionName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "citySubdivisionName", lhsCitySubdivisionName), LocatorUtils.property(thatLocator, "citySubdivisionName", rhsCitySubdivisionName), lhsCitySubdivisionName, rhsCitySubdivisionName, (this.citySubdivisionName!= null), (that.citySubdivisionName!= null))) {
                return false;
            }
        }
        {
            CityNameType lhsCityName;
            lhsCityName = this.getCityName();
            CityNameType rhsCityName;
            rhsCityName = that.getCityName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cityName", lhsCityName), LocatorUtils.property(thatLocator, "cityName", rhsCityName), lhsCityName, rhsCityName, (this.cityName!= null), (that.cityName!= null))) {
                return false;
            }
        }
        {
            PostalZoneType lhsPostalZone;
            lhsPostalZone = this.getPostalZone();
            PostalZoneType rhsPostalZone;
            rhsPostalZone = that.getPostalZone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postalZone", lhsPostalZone), LocatorUtils.property(thatLocator, "postalZone", rhsPostalZone), lhsPostalZone, rhsPostalZone, (this.postalZone!= null), (that.postalZone!= null))) {
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
            RegionType lhsRegion;
            lhsRegion = this.getRegion();
            RegionType rhsRegion;
            rhsRegion = that.getRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "region", lhsRegion), LocatorUtils.property(thatLocator, "region", rhsRegion), lhsRegion, rhsRegion, (this.region!= null), (that.region!= null))) {
                return false;
            }
        }
        {
            DistrictType lhsDistrict;
            lhsDistrict = this.getDistrict();
            DistrictType rhsDistrict;
            rhsDistrict = that.getDistrict();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "district", lhsDistrict), LocatorUtils.property(thatLocator, "district", rhsDistrict), lhsDistrict, rhsDistrict, (this.district!= null), (that.district!= null))) {
                return false;
            }
        }
        {
            TimezoneOffsetType lhsTimezoneOffset;
            lhsTimezoneOffset = this.getTimezoneOffset();
            TimezoneOffsetType rhsTimezoneOffset;
            rhsTimezoneOffset = that.getTimezoneOffset();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timezoneOffset", lhsTimezoneOffset), LocatorUtils.property(thatLocator, "timezoneOffset", rhsTimezoneOffset), lhsTimezoneOffset, rhsTimezoneOffset, (this.timezoneOffset!= null), (that.timezoneOffset!= null))) {
                return false;
            }
        }
        {
            List<AddressLineType> lhsAddressLine;
            lhsAddressLine = (((this.addressLine!= null)&&(!this.addressLine.isEmpty()))?this.getAddressLine():null);
            List<AddressLineType> rhsAddressLine;
            rhsAddressLine = (((that.addressLine!= null)&&(!that.addressLine.isEmpty()))?that.getAddressLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addressLine", lhsAddressLine), LocatorUtils.property(thatLocator, "addressLine", rhsAddressLine), lhsAddressLine, rhsAddressLine, ((this.addressLine!= null)&&(!this.addressLine.isEmpty())), ((that.addressLine!= null)&&(!that.addressLine.isEmpty())))) {
                return false;
            }
        }
        {
            CountryType lhsCountry;
            lhsCountry = this.getCountry();
            CountryType rhsCountry;
            rhsCountry = that.getCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry, (this.country!= null), (that.country!= null))) {
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
            AddressTypeCodeType theAddressTypeCode;
            theAddressTypeCode = this.getAddressTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addressTypeCode", theAddressTypeCode), currentHashCode, theAddressTypeCode, (this.addressTypeCode!= null));
        }
        {
            AddressFormatCodeType theAddressFormatCode;
            theAddressFormatCode = this.getAddressFormatCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addressFormatCode", theAddressFormatCode), currentHashCode, theAddressFormatCode, (this.addressFormatCode!= null));
        }
        {
            PostboxType thePostbox;
            thePostbox = this.getPostbox();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postbox", thePostbox), currentHashCode, thePostbox, (this.postbox!= null));
        }
        {
            FloorType theFloor;
            theFloor = this.getFloor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "floor", theFloor), currentHashCode, theFloor, (this.floor!= null));
        }
        {
            RoomType theRoom;
            theRoom = this.getRoom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "room", theRoom), currentHashCode, theRoom, (this.room!= null));
        }
        {
            StreetNameType theStreetName;
            theStreetName = this.getStreetName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "streetName", theStreetName), currentHashCode, theStreetName, (this.streetName!= null));
        }
        {
            AdditionalStreetNameType theAdditionalStreetName;
            theAdditionalStreetName = this.getAdditionalStreetName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalStreetName", theAdditionalStreetName), currentHashCode, theAdditionalStreetName, (this.additionalStreetName!= null));
        }
        {
            BlockNameType theBlockName;
            theBlockName = this.getBlockName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "blockName", theBlockName), currentHashCode, theBlockName, (this.blockName!= null));
        }
        {
            BuildingNameType theBuildingName;
            theBuildingName = this.getBuildingName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "buildingName", theBuildingName), currentHashCode, theBuildingName, (this.buildingName!= null));
        }
        {
            BuildingNumberType theBuildingNumber;
            theBuildingNumber = this.getBuildingNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "buildingNumber", theBuildingNumber), currentHashCode, theBuildingNumber, (this.buildingNumber!= null));
        }
        {
            InhouseMailType theInhouseMail;
            theInhouseMail = this.getInhouseMail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inhouseMail", theInhouseMail), currentHashCode, theInhouseMail, (this.inhouseMail!= null));
        }
        {
            DepartmentType theDepartment;
            theDepartment = this.getDepartment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "department", theDepartment), currentHashCode, theDepartment, (this.department!= null));
        }
        {
            MarkAttentionType theMarkAttention;
            theMarkAttention = this.getMarkAttention();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markAttention", theMarkAttention), currentHashCode, theMarkAttention, (this.markAttention!= null));
        }
        {
            MarkCareType theMarkCare;
            theMarkCare = this.getMarkCare();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markCare", theMarkCare), currentHashCode, theMarkCare, (this.markCare!= null));
        }
        {
            PlotIdentificationType thePlotIdentification;
            thePlotIdentification = this.getPlotIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "plotIdentification", thePlotIdentification), currentHashCode, thePlotIdentification, (this.plotIdentification!= null));
        }
        {
            CitySubdivisionNameType theCitySubdivisionName;
            theCitySubdivisionName = this.getCitySubdivisionName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "citySubdivisionName", theCitySubdivisionName), currentHashCode, theCitySubdivisionName, (this.citySubdivisionName!= null));
        }
        {
            CityNameType theCityName;
            theCityName = this.getCityName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cityName", theCityName), currentHashCode, theCityName, (this.cityName!= null));
        }
        {
            PostalZoneType thePostalZone;
            thePostalZone = this.getPostalZone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postalZone", thePostalZone), currentHashCode, thePostalZone, (this.postalZone!= null));
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
            RegionType theRegion;
            theRegion = this.getRegion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "region", theRegion), currentHashCode, theRegion, (this.region!= null));
        }
        {
            DistrictType theDistrict;
            theDistrict = this.getDistrict();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "district", theDistrict), currentHashCode, theDistrict, (this.district!= null));
        }
        {
            TimezoneOffsetType theTimezoneOffset;
            theTimezoneOffset = this.getTimezoneOffset();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timezoneOffset", theTimezoneOffset), currentHashCode, theTimezoneOffset, (this.timezoneOffset!= null));
        }
        {
            List<AddressLineType> theAddressLine;
            theAddressLine = (((this.addressLine!= null)&&(!this.addressLine.isEmpty()))?this.getAddressLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addressLine", theAddressLine), currentHashCode, theAddressLine, ((this.addressLine!= null)&&(!this.addressLine.isEmpty())));
        }
        {
            CountryType theCountry;
            theCountry = this.getCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "country", theCountry), currentHashCode, theCountry, (this.country!= null));
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
