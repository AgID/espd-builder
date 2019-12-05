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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SequenceNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransportExecutionPlanReferenceIDType;
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
 * <p>Classe Java per TransportationSegmentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TransportationSegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceNumeric"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportExecutionPlanReferenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportationService"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportServiceProviderParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReferencedConsignment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationSegmentType", propOrder = {
    "sequenceNumeric",
    "transportExecutionPlanReferenceID",
    "transportationService",
    "transportServiceProviderParty",
    "referencedConsignment",
    "shipmentStage"
})
public class TransportationSegmentType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "SequenceNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected SequenceNumericType sequenceNumeric;
    @XmlElement(name = "TransportExecutionPlanReferenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransportExecutionPlanReferenceIDType transportExecutionPlanReferenceID;
    @XmlElement(name = "TransportationService", required = true)
    protected TransportationServiceType transportationService;
    @XmlElement(name = "TransportServiceProviderParty", required = true)
    protected PartyType transportServiceProviderParty;
    @XmlElement(name = "ReferencedConsignment")
    protected ConsignmentType referencedConsignment;
    @XmlElement(name = "ShipmentStage")
    protected List<ShipmentStageType> shipmentStage;

    /**
     * Recupera il valore della proprietà sequenceNumeric.
     * 
     * @return
     *     possible object is
     *     {@link SequenceNumericType }
     *     
     */
    public SequenceNumericType getSequenceNumeric() {
        return sequenceNumeric;
    }

    /**
     * Imposta il valore della proprietà sequenceNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceNumericType }
     *     
     */
    public void setSequenceNumeric(SequenceNumericType value) {
        this.sequenceNumeric = value;
    }

    /**
     * Recupera il valore della proprietà transportExecutionPlanReferenceID.
     * 
     * @return
     *     possible object is
     *     {@link TransportExecutionPlanReferenceIDType }
     *     
     */
    public TransportExecutionPlanReferenceIDType getTransportExecutionPlanReferenceID() {
        return transportExecutionPlanReferenceID;
    }

    /**
     * Imposta il valore della proprietà transportExecutionPlanReferenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportExecutionPlanReferenceIDType }
     *     
     */
    public void setTransportExecutionPlanReferenceID(TransportExecutionPlanReferenceIDType value) {
        this.transportExecutionPlanReferenceID = value;
    }

    /**
     * Recupera il valore della proprietà transportationService.
     * 
     * @return
     *     possible object is
     *     {@link TransportationServiceType }
     *     
     */
    public TransportationServiceType getTransportationService() {
        return transportationService;
    }

    /**
     * Imposta il valore della proprietà transportationService.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationServiceType }
     *     
     */
    public void setTransportationService(TransportationServiceType value) {
        this.transportationService = value;
    }

    /**
     * Recupera il valore della proprietà transportServiceProviderParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getTransportServiceProviderParty() {
        return transportServiceProviderParty;
    }

    /**
     * Imposta il valore della proprietà transportServiceProviderParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setTransportServiceProviderParty(PartyType value) {
        this.transportServiceProviderParty = value;
    }

    /**
     * Recupera il valore della proprietà referencedConsignment.
     * 
     * @return
     *     possible object is
     *     {@link ConsignmentType }
     *     
     */
    public ConsignmentType getReferencedConsignment() {
        return referencedConsignment;
    }

    /**
     * Imposta il valore della proprietà referencedConsignment.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignmentType }
     *     
     */
    public void setReferencedConsignment(ConsignmentType value) {
        this.referencedConsignment = value;
    }

    /**
     * Gets the value of the shipmentStage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentStage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentStage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType }
     * 
     * 
     */
    public List<ShipmentStageType> getShipmentStage() {
        if (shipmentStage == null) {
            shipmentStage = new ArrayList<ShipmentStageType>();
        }
        return this.shipmentStage;
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
            SequenceNumericType theSequenceNumeric;
            theSequenceNumeric = this.getSequenceNumeric();
            strategy.appendField(locator, this, "sequenceNumeric", buffer, theSequenceNumeric, (this.sequenceNumeric!= null));
        }
        {
            TransportExecutionPlanReferenceIDType theTransportExecutionPlanReferenceID;
            theTransportExecutionPlanReferenceID = this.getTransportExecutionPlanReferenceID();
            strategy.appendField(locator, this, "transportExecutionPlanReferenceID", buffer, theTransportExecutionPlanReferenceID, (this.transportExecutionPlanReferenceID!= null));
        }
        {
            TransportationServiceType theTransportationService;
            theTransportationService = this.getTransportationService();
            strategy.appendField(locator, this, "transportationService", buffer, theTransportationService, (this.transportationService!= null));
        }
        {
            PartyType theTransportServiceProviderParty;
            theTransportServiceProviderParty = this.getTransportServiceProviderParty();
            strategy.appendField(locator, this, "transportServiceProviderParty", buffer, theTransportServiceProviderParty, (this.transportServiceProviderParty!= null));
        }
        {
            ConsignmentType theReferencedConsignment;
            theReferencedConsignment = this.getReferencedConsignment();
            strategy.appendField(locator, this, "referencedConsignment", buffer, theReferencedConsignment, (this.referencedConsignment!= null));
        }
        {
            List<ShipmentStageType> theShipmentStage;
            theShipmentStage = (((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty()))?this.getShipmentStage():null);
            strategy.appendField(locator, this, "shipmentStage", buffer, theShipmentStage, ((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty())));
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
        final TransportationSegmentType that = ((TransportationSegmentType) object);
        {
            SequenceNumericType lhsSequenceNumeric;
            lhsSequenceNumeric = this.getSequenceNumeric();
            SequenceNumericType rhsSequenceNumeric;
            rhsSequenceNumeric = that.getSequenceNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceNumeric", lhsSequenceNumeric), LocatorUtils.property(thatLocator, "sequenceNumeric", rhsSequenceNumeric), lhsSequenceNumeric, rhsSequenceNumeric, (this.sequenceNumeric!= null), (that.sequenceNumeric!= null))) {
                return false;
            }
        }
        {
            TransportExecutionPlanReferenceIDType lhsTransportExecutionPlanReferenceID;
            lhsTransportExecutionPlanReferenceID = this.getTransportExecutionPlanReferenceID();
            TransportExecutionPlanReferenceIDType rhsTransportExecutionPlanReferenceID;
            rhsTransportExecutionPlanReferenceID = that.getTransportExecutionPlanReferenceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportExecutionPlanReferenceID", lhsTransportExecutionPlanReferenceID), LocatorUtils.property(thatLocator, "transportExecutionPlanReferenceID", rhsTransportExecutionPlanReferenceID), lhsTransportExecutionPlanReferenceID, rhsTransportExecutionPlanReferenceID, (this.transportExecutionPlanReferenceID!= null), (that.transportExecutionPlanReferenceID!= null))) {
                return false;
            }
        }
        {
            TransportationServiceType lhsTransportationService;
            lhsTransportationService = this.getTransportationService();
            TransportationServiceType rhsTransportationService;
            rhsTransportationService = that.getTransportationService();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportationService", lhsTransportationService), LocatorUtils.property(thatLocator, "transportationService", rhsTransportationService), lhsTransportationService, rhsTransportationService, (this.transportationService!= null), (that.transportationService!= null))) {
                return false;
            }
        }
        {
            PartyType lhsTransportServiceProviderParty;
            lhsTransportServiceProviderParty = this.getTransportServiceProviderParty();
            PartyType rhsTransportServiceProviderParty;
            rhsTransportServiceProviderParty = that.getTransportServiceProviderParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transportServiceProviderParty", lhsTransportServiceProviderParty), LocatorUtils.property(thatLocator, "transportServiceProviderParty", rhsTransportServiceProviderParty), lhsTransportServiceProviderParty, rhsTransportServiceProviderParty, (this.transportServiceProviderParty!= null), (that.transportServiceProviderParty!= null))) {
                return false;
            }
        }
        {
            ConsignmentType lhsReferencedConsignment;
            lhsReferencedConsignment = this.getReferencedConsignment();
            ConsignmentType rhsReferencedConsignment;
            rhsReferencedConsignment = that.getReferencedConsignment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referencedConsignment", lhsReferencedConsignment), LocatorUtils.property(thatLocator, "referencedConsignment", rhsReferencedConsignment), lhsReferencedConsignment, rhsReferencedConsignment, (this.referencedConsignment!= null), (that.referencedConsignment!= null))) {
                return false;
            }
        }
        {
            List<ShipmentStageType> lhsShipmentStage;
            lhsShipmentStage = (((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty()))?this.getShipmentStage():null);
            List<ShipmentStageType> rhsShipmentStage;
            rhsShipmentStage = (((that.shipmentStage!= null)&&(!that.shipmentStage.isEmpty()))?that.getShipmentStage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentStage", lhsShipmentStage), LocatorUtils.property(thatLocator, "shipmentStage", rhsShipmentStage), lhsShipmentStage, rhsShipmentStage, ((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty())), ((that.shipmentStage!= null)&&(!that.shipmentStage.isEmpty())))) {
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
            SequenceNumericType theSequenceNumeric;
            theSequenceNumeric = this.getSequenceNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNumeric", theSequenceNumeric), currentHashCode, theSequenceNumeric, (this.sequenceNumeric!= null));
        }
        {
            TransportExecutionPlanReferenceIDType theTransportExecutionPlanReferenceID;
            theTransportExecutionPlanReferenceID = this.getTransportExecutionPlanReferenceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportExecutionPlanReferenceID", theTransportExecutionPlanReferenceID), currentHashCode, theTransportExecutionPlanReferenceID, (this.transportExecutionPlanReferenceID!= null));
        }
        {
            TransportationServiceType theTransportationService;
            theTransportationService = this.getTransportationService();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportationService", theTransportationService), currentHashCode, theTransportationService, (this.transportationService!= null));
        }
        {
            PartyType theTransportServiceProviderParty;
            theTransportServiceProviderParty = this.getTransportServiceProviderParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transportServiceProviderParty", theTransportServiceProviderParty), currentHashCode, theTransportServiceProviderParty, (this.transportServiceProviderParty!= null));
        }
        {
            ConsignmentType theReferencedConsignment;
            theReferencedConsignment = this.getReferencedConsignment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referencedConsignment", theReferencedConsignment), currentHashCode, theReferencedConsignment, (this.referencedConsignment!= null));
        }
        {
            List<ShipmentStageType> theShipmentStage;
            theShipmentStage = (((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty()))?this.getShipmentStage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentStage", theShipmentStage), currentHashCode, theShipmentStage, ((this.shipmentStage!= null)&&(!this.shipmentStage.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
