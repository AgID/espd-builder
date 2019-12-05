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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DirectionCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.JourneyIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationNationalityIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationNationalityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TradeServiceCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportMeansTypeCodeType;
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
 * <p>Classe Java per TransportMeansType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransportMeansType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}JourneyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationNationalityID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationNationality" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DirectionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportMeansTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TradeServiceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Stowage" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AirTransport" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RoadTransport" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RailTransport" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaritimeTransport" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OwnerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMeansType", propOrder = {
    "journeyID",
    "registrationNationalityID",
    "registrationNationality",
    "directionCode",
    "transportMeansTypeCode",
    "tradeServiceCode",
    "stowage",
    "airTransport",
    "roadTransport",
    "railTransport",
    "maritimeTransport",
    "ownerParty",
    "measurementDimension"
})
public class TransportMeansType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "JourneyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected JourneyIDType journeyID;
    @XmlElement(name = "RegistrationNationalityID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegistrationNationalityIDType registrationNationalityID;
    @XmlElement(name = "RegistrationNationality", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<RegistrationNationalityType> registrationNationality;
    @XmlElement(name = "DirectionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DirectionCodeType directionCode;
    @XmlElement(name = "TransportMeansTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportMeansTypeCodeType transportMeansTypeCode;
    @XmlElement(name = "TradeServiceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TradeServiceCodeType tradeServiceCode;
    @XmlElement(name = "Stowage")
    protected StowageType stowage;
    @XmlElement(name = "AirTransport")
    protected AirTransportType airTransport;
    @XmlElement(name = "RoadTransport")
    protected RoadTransportType roadTransport;
    @XmlElement(name = "RailTransport")
    protected RailTransportType railTransport;
    @XmlElement(name = "MaritimeTransport")
    protected MaritimeTransportType maritimeTransport;
    @XmlElement(name = "OwnerParty")
    protected PartyType ownerParty;
    @XmlElement(name = "MeasurementDimension")
    protected List<DimensionType> measurementDimension;

    /**
     * Recupera il valore della proprietà journeyID.
     * 
     * @return
     *     possible object is
     *     {@link JourneyIDType }
     *     
     */
    public JourneyIDType getJourneyID() {
        return journeyID;
    }

    /**
     * Imposta il valore della proprietà journeyID.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyIDType }
     *     
     */
    public void setJourneyID(JourneyIDType value) {
        this.journeyID = value;
    }

    /**
     * Recupera il valore della proprietà registrationNationalityID.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationNationalityIDType }
     *     
     */
    public RegistrationNationalityIDType getRegistrationNationalityID() {
        return registrationNationalityID;
    }

    /**
     * Imposta il valore della proprietà registrationNationalityID.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationNationalityIDType }
     *     
     */
    public void setRegistrationNationalityID(RegistrationNationalityIDType value) {
        this.registrationNationalityID = value;
    }

    /**
     * Gets the value of the registrationNationality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationNationality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationNationality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationNationalityType }
     * 
     * 
     */
    public List<RegistrationNationalityType> getRegistrationNationality() {
        if (registrationNationality == null) {
            registrationNationality = new ArrayList<RegistrationNationalityType>();
        }
        return this.registrationNationality;
    }

    /**
     * Recupera il valore della proprietà directionCode.
     * 
     * @return
     *     possible object is
     *     {@link DirectionCodeType }
     *     
     */
    public DirectionCodeType getDirectionCode() {
        return directionCode;
    }

    /**
     * Imposta il valore della proprietà directionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionCodeType }
     *     
     */
    public void setDirectionCode(DirectionCodeType value) {
        this.directionCode = value;
    }

    /**
     * Recupera il valore della proprietà transportMeansTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansTypeCodeType }
     *     
     */
    public TransportMeansTypeCodeType getTransportMeansTypeCode() {
        return transportMeansTypeCode;
    }

    /**
     * Imposta il valore della proprietà transportMeansTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansTypeCodeType }
     *     
     */
    public void setTransportMeansTypeCode(TransportMeansTypeCodeType value) {
        this.transportMeansTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà tradeServiceCode.
     * 
     * @return
     *     possible object is
     *     {@link TradeServiceCodeType }
     *     
     */
    public TradeServiceCodeType getTradeServiceCode() {
        return tradeServiceCode;
    }

    /**
     * Imposta il valore della proprietà tradeServiceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeServiceCodeType }
     *     
     */
    public void setTradeServiceCode(TradeServiceCodeType value) {
        this.tradeServiceCode = value;
    }

    /**
     * Recupera il valore della proprietà stowage.
     * 
     * @return
     *     possible object is
     *     {@link StowageType }
     *     
     */
    public StowageType getStowage() {
        return stowage;
    }

    /**
     * Imposta il valore della proprietà stowage.
     * 
     * @param value
     *     allowed object is
     *     {@link StowageType }
     *     
     */
    public void setStowage(StowageType value) {
        this.stowage = value;
    }

    /**
     * Recupera il valore della proprietà airTransport.
     * 
     * @return
     *     possible object is
     *     {@link AirTransportType }
     *     
     */
    public AirTransportType getAirTransport() {
        return airTransport;
    }

    /**
     * Imposta il valore della proprietà airTransport.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTransportType }
     *     
     */
    public void setAirTransport(AirTransportType value) {
        this.airTransport = value;
    }

    /**
     * Recupera il valore della proprietà roadTransport.
     * 
     * @return
     *     possible object is
     *     {@link RoadTransportType }
     *     
     */
    public RoadTransportType getRoadTransport() {
        return roadTransport;
    }

    /**
     * Imposta il valore della proprietà roadTransport.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadTransportType }
     *     
     */
    public void setRoadTransport(RoadTransportType value) {
        this.roadTransport = value;
    }

    /**
     * Recupera il valore della proprietà railTransport.
     * 
     * @return
     *     possible object is
     *     {@link RailTransportType }
     *     
     */
    public RailTransportType getRailTransport() {
        return railTransport;
    }

    /**
     * Imposta il valore della proprietà railTransport.
     * 
     * @param value
     *     allowed object is
     *     {@link RailTransportType }
     *     
     */
    public void setRailTransport(RailTransportType value) {
        this.railTransport = value;
    }

    /**
     * Recupera il valore della proprietà maritimeTransport.
     * 
     * @return
     *     possible object is
     *     {@link MaritimeTransportType }
     *     
     */
    public MaritimeTransportType getMaritimeTransport() {
        return maritimeTransport;
    }

    /**
     * Imposta il valore della proprietà maritimeTransport.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritimeTransportType }
     *     
     */
    public void setMaritimeTransport(MaritimeTransportType value) {
        this.maritimeTransport = value;
    }

    /**
     * Recupera il valore della proprietà ownerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getOwnerParty() {
        return ownerParty;
    }

    /**
     * Imposta il valore della proprietà ownerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setOwnerParty(PartyType value) {
        this.ownerParty = value;
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
            JourneyIDType theJourneyID;
            theJourneyID = this.getJourneyID();
            strategy.appendField(locator, this, "journeyID", buffer, theJourneyID, (this.journeyID!= null));
        }
        {
            RegistrationNationalityIDType theRegistrationNationalityID;
            theRegistrationNationalityID = this.getRegistrationNationalityID();
            strategy.appendField(locator, this, "registrationNationalityID", buffer, theRegistrationNationalityID, (this.registrationNationalityID!= null));
        }
        {
            List<RegistrationNationalityType> theRegistrationNationality;
            theRegistrationNationality = (((this.registrationNationality!= null)&&(!this.registrationNationality.isEmpty()))?this.getRegistrationNationality():null);
            strategy.appendField(locator, this, "registrationNationality", buffer, theRegistrationNationality, ((this.registrationNationality!= null)&&(!this.registrationNationality.isEmpty())));
        }
        {
            DirectionCodeType theDirectionCode;
            theDirectionCode = this.getDirectionCode();
            strategy.appendField(locator, this, "directionCode", buffer, theDirectionCode, (this.directionCode!= null));
        }
        {
            TransportMeansTypeCodeType theTransportMeansTypeCode;
            theTransportMeansTypeCode = this.getTransportMeansTypeCode();
            strategy.appendField(locator, this, "transportMeansTypeCode", buffer, theTransportMeansTypeCode, (this.transportMeansTypeCode!= null));
        }
        {
            TradeServiceCodeType theTradeServiceCode;
            theTradeServiceCode = this.getTradeServiceCode();
            strategy.appendField(locator, this, "tradeServiceCode", buffer, theTradeServiceCode, (this.tradeServiceCode!= null));
        }
        {
            StowageType theStowage;
            theStowage = this.getStowage();
            strategy.appendField(locator, this, "stowage", buffer, theStowage, (this.stowage!= null));
        }
        {
            AirTransportType theAirTransport;
            theAirTransport = this.getAirTransport();
            strategy.appendField(locator, this, "airTransport", buffer, theAirTransport, (this.airTransport!= null));
        }
        {
            RoadTransportType theRoadTransport;
            theRoadTransport = this.getRoadTransport();
            strategy.appendField(locator, this, "roadTransport", buffer, theRoadTransport, (this.roadTransport!= null));
        }
        {
            RailTransportType theRailTransport;
            theRailTransport = this.getRailTransport();
            strategy.appendField(locator, this, "railTransport", buffer, theRailTransport, (this.railTransport!= null));
        }
        {
            MaritimeTransportType theMaritimeTransport;
            theMaritimeTransport = this.getMaritimeTransport();
            strategy.appendField(locator, this, "maritimeTransport", buffer, theMaritimeTransport, (this.maritimeTransport!= null));
        }
        {
            PartyType theOwnerParty;
            theOwnerParty = this.getOwnerParty();
            strategy.appendField(locator, this, "ownerParty", buffer, theOwnerParty, (this.ownerParty!= null));
        }
        {
            List<DimensionType> theMeasurementDimension;
            theMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            strategy.appendField(locator, this, "measurementDimension", buffer, theMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())));
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
        final TransportMeansType that = ((TransportMeansType) object);
        {
            JourneyIDType lhsJourneyID;
            lhsJourneyID = this.getJourneyID();
            JourneyIDType rhsJourneyID;
            rhsJourneyID = that.getJourneyID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "journeyID", lhsJourneyID), LocatorUtils.property(thatLocator, "journeyID", rhsJourneyID), lhsJourneyID, rhsJourneyID, (this.journeyID!= null), (that.journeyID!= null))) {
                return false;
            }
        }
        {
            RegistrationNationalityIDType lhsRegistrationNationalityID;
            lhsRegistrationNationalityID = this.getRegistrationNationalityID();
            RegistrationNationalityIDType rhsRegistrationNationalityID;
            rhsRegistrationNationalityID = that.getRegistrationNationalityID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationNationalityID", lhsRegistrationNationalityID), LocatorUtils.property(thatLocator, "registrationNationalityID", rhsRegistrationNationalityID), lhsRegistrationNationalityID, rhsRegistrationNationalityID, (this.registrationNationalityID!= null), (that.registrationNationalityID!= null))) {
                return false;
            }
        }
        {
            List<RegistrationNationalityType> lhsRegistrationNationality;
            lhsRegistrationNationality = (((this.registrationNationality!= null)&&(!this.registrationNationality.isEmpty()))?this.getRegistrationNationality():null);
            List<RegistrationNationalityType> rhsRegistrationNationality;
            rhsRegistrationNationality = (((that.registrationNationality!= null)&&(!that.registrationNationality.isEmpty()))?that.getRegistrationNationality():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationNationality", lhsRegistrationNationality), LocatorUtils.property(thatLocator, "registrationNationality", rhsRegistrationNationality), lhsRegistrationNationality, rhsRegistrationNationality, ((this.registrationNationality!= null)&&(!this.registrationNationality.isEmpty())), ((that.registrationNationality!= null)&&(!that.registrationNationality.isEmpty())))) {
                return false;
            }
        }
        {
            DirectionCodeType lhsDirectionCode;
            lhsDirectionCode = this.getDirectionCode();
            DirectionCodeType rhsDirectionCode;
            rhsDirectionCode = that.getDirectionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "directionCode", lhsDirectionCode), LocatorUtils.property(thatLocator, "directionCode", rhsDirectionCode), lhsDirectionCode, rhsDirectionCode, (this.directionCode!= null), (that.directionCode!= null))) {
                return false;
            }
        }
        {
            TransportMeansTypeCodeType lhsTransportMeansTypeCode;
            lhsTransportMeansTypeCode = this.getTransportMeansTypeCode();
            TransportMeansTypeCodeType rhsTransportMeansTypeCode;
            rhsTransportMeansTypeCode = that.getTransportMeansTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportMeansTypeCode", lhsTransportMeansTypeCode), LocatorUtils.property(thatLocator, "transportMeansTypeCode", rhsTransportMeansTypeCode), lhsTransportMeansTypeCode, rhsTransportMeansTypeCode, (this.transportMeansTypeCode!= null), (that.transportMeansTypeCode!= null))) {
                return false;
            }
        }
        {
            TradeServiceCodeType lhsTradeServiceCode;
            lhsTradeServiceCode = this.getTradeServiceCode();
            TradeServiceCodeType rhsTradeServiceCode;
            rhsTradeServiceCode = that.getTradeServiceCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tradeServiceCode", lhsTradeServiceCode), LocatorUtils.property(thatLocator, "tradeServiceCode", rhsTradeServiceCode), lhsTradeServiceCode, rhsTradeServiceCode, (this.tradeServiceCode!= null), (that.tradeServiceCode!= null))) {
                return false;
            }
        }
        {
            StowageType lhsStowage;
            lhsStowage = this.getStowage();
            StowageType rhsStowage;
            rhsStowage = that.getStowage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stowage", lhsStowage), LocatorUtils.property(thatLocator, "stowage", rhsStowage), lhsStowage, rhsStowage, (this.stowage!= null), (that.stowage!= null))) {
                return false;
            }
        }
        {
            AirTransportType lhsAirTransport;
            lhsAirTransport = this.getAirTransport();
            AirTransportType rhsAirTransport;
            rhsAirTransport = that.getAirTransport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airTransport", lhsAirTransport), LocatorUtils.property(thatLocator, "airTransport", rhsAirTransport), lhsAirTransport, rhsAirTransport, (this.airTransport!= null), (that.airTransport!= null))) {
                return false;
            }
        }
        {
            RoadTransportType lhsRoadTransport;
            lhsRoadTransport = this.getRoadTransport();
            RoadTransportType rhsRoadTransport;
            rhsRoadTransport = that.getRoadTransport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roadTransport", lhsRoadTransport), LocatorUtils.property(thatLocator, "roadTransport", rhsRoadTransport), lhsRoadTransport, rhsRoadTransport, (this.roadTransport!= null), (that.roadTransport!= null))) {
                return false;
            }
        }
        {
            RailTransportType lhsRailTransport;
            lhsRailTransport = this.getRailTransport();
            RailTransportType rhsRailTransport;
            rhsRailTransport = that.getRailTransport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "railTransport", lhsRailTransport), LocatorUtils.property(thatLocator, "railTransport", rhsRailTransport), lhsRailTransport, rhsRailTransport, (this.railTransport!= null), (that.railTransport!= null))) {
                return false;
            }
        }
        {
            MaritimeTransportType lhsMaritimeTransport;
            lhsMaritimeTransport = this.getMaritimeTransport();
            MaritimeTransportType rhsMaritimeTransport;
            rhsMaritimeTransport = that.getMaritimeTransport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maritimeTransport", lhsMaritimeTransport), LocatorUtils.property(thatLocator, "maritimeTransport", rhsMaritimeTransport), lhsMaritimeTransport, rhsMaritimeTransport, (this.maritimeTransport!= null), (that.maritimeTransport!= null))) {
                return false;
            }
        }
        {
            PartyType lhsOwnerParty;
            lhsOwnerParty = this.getOwnerParty();
            PartyType rhsOwnerParty;
            rhsOwnerParty = that.getOwnerParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ownerParty", lhsOwnerParty), LocatorUtils.property(thatLocator, "ownerParty", rhsOwnerParty), lhsOwnerParty, rhsOwnerParty, (this.ownerParty!= null), (that.ownerParty!= null))) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            JourneyIDType theJourneyID;
            theJourneyID = this.getJourneyID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "journeyID", theJourneyID), currentHashCode, theJourneyID, (this.journeyID!= null));
        }
        {
            RegistrationNationalityIDType theRegistrationNationalityID;
            theRegistrationNationalityID = this.getRegistrationNationalityID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationNationalityID", theRegistrationNationalityID), currentHashCode, theRegistrationNationalityID, (this.registrationNationalityID!= null));
        }
        {
            List<RegistrationNationalityType> theRegistrationNationality;
            theRegistrationNationality = (((this.registrationNationality!= null)&&(!this.registrationNationality.isEmpty()))?this.getRegistrationNationality():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationNationality", theRegistrationNationality), currentHashCode, theRegistrationNationality, ((this.registrationNationality!= null)&&(!this.registrationNationality.isEmpty())));
        }
        {
            DirectionCodeType theDirectionCode;
            theDirectionCode = this.getDirectionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "directionCode", theDirectionCode), currentHashCode, theDirectionCode, (this.directionCode!= null));
        }
        {
            TransportMeansTypeCodeType theTransportMeansTypeCode;
            theTransportMeansTypeCode = this.getTransportMeansTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportMeansTypeCode", theTransportMeansTypeCode), currentHashCode, theTransportMeansTypeCode, (this.transportMeansTypeCode!= null));
        }
        {
            TradeServiceCodeType theTradeServiceCode;
            theTradeServiceCode = this.getTradeServiceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tradeServiceCode", theTradeServiceCode), currentHashCode, theTradeServiceCode, (this.tradeServiceCode!= null));
        }
        {
            StowageType theStowage;
            theStowage = this.getStowage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stowage", theStowage), currentHashCode, theStowage, (this.stowage!= null));
        }
        {
            AirTransportType theAirTransport;
            theAirTransport = this.getAirTransport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airTransport", theAirTransport), currentHashCode, theAirTransport, (this.airTransport!= null));
        }
        {
            RoadTransportType theRoadTransport;
            theRoadTransport = this.getRoadTransport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roadTransport", theRoadTransport), currentHashCode, theRoadTransport, (this.roadTransport!= null));
        }
        {
            RailTransportType theRailTransport;
            theRailTransport = this.getRailTransport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "railTransport", theRailTransport), currentHashCode, theRailTransport, (this.railTransport!= null));
        }
        {
            MaritimeTransportType theMaritimeTransport;
            theMaritimeTransport = this.getMaritimeTransport();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maritimeTransport", theMaritimeTransport), currentHashCode, theMaritimeTransport, (this.maritimeTransport!= null));
        }
        {
            PartyType theOwnerParty;
            theOwnerParty = this.getOwnerParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ownerParty", theOwnerParty), currentHashCode, theOwnerParty, (this.ownerParty!= null));
        }
        {
            List<DimensionType> theMeasurementDimension;
            theMeasurementDimension = (((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty()))?this.getMeasurementDimension():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "measurementDimension", theMeasurementDimension), currentHashCode, theMeasurementDimension, ((this.measurementDimension!= null)&&(!this.measurementDimension.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
