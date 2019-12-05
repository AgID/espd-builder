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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GrossMassMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeighingDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeighingDeviceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeighingDeviceTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeighingMethodCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeighingTimeType;
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
 * <p>Classe Java per VerifiedGrossMassType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VerifiedGrossMassType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeighingDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeighingTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeighingMethodCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeighingDeviceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeighingDeviceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossMassMeasure"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WeighingParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipperParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ResponsibleParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifiedGrossMassType", propOrder = {
    "id",
    "weighingDate",
    "weighingTime",
    "weighingMethodCode",
    "weighingDeviceID",
    "weighingDeviceType",
    "grossMassMeasure",
    "weighingParty",
    "shipperParty",
    "responsibleParty",
    "documentReference"
})
public class VerifiedGrossMassType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "WeighingDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected WeighingDateType weighingDate;
    @XmlElement(name = "WeighingTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected WeighingTimeType weighingTime;
    @XmlElement(name = "WeighingMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected WeighingMethodCodeType weighingMethodCode;
    @XmlElement(name = "WeighingDeviceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected WeighingDeviceIDType weighingDeviceID;
    @XmlElement(name = "WeighingDeviceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected WeighingDeviceTypeType weighingDeviceType;
    @XmlElement(name = "GrossMassMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected GrossMassMeasureType grossMassMeasure;
    @XmlElement(name = "WeighingParty")
    protected PartyType weighingParty;
    @XmlElement(name = "ShipperParty")
    protected PartyType shipperParty;
    @XmlElement(name = "ResponsibleParty")
    protected PartyType responsibleParty;
    @XmlElement(name = "DocumentReference", required = true)
    protected List<DocumentReferenceType> documentReference;

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
     * Recupera il valore della proprietà weighingDate.
     * 
     * @return
     *     possible object is
     *     {@link WeighingDateType }
     *     
     */
    public WeighingDateType getWeighingDate() {
        return weighingDate;
    }

    /**
     * Imposta il valore della proprietà weighingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link WeighingDateType }
     *     
     */
    public void setWeighingDate(WeighingDateType value) {
        this.weighingDate = value;
    }

    /**
     * Recupera il valore della proprietà weighingTime.
     * 
     * @return
     *     possible object is
     *     {@link WeighingTimeType }
     *     
     */
    public WeighingTimeType getWeighingTime() {
        return weighingTime;
    }

    /**
     * Imposta il valore della proprietà weighingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link WeighingTimeType }
     *     
     */
    public void setWeighingTime(WeighingTimeType value) {
        this.weighingTime = value;
    }

    /**
     * Recupera il valore della proprietà weighingMethodCode.
     * 
     * @return
     *     possible object is
     *     {@link WeighingMethodCodeType }
     *     
     */
    public WeighingMethodCodeType getWeighingMethodCode() {
        return weighingMethodCode;
    }

    /**
     * Imposta il valore della proprietà weighingMethodCode.
     * 
     * @param value
     *     allowed object is
     *     {@link WeighingMethodCodeType }
     *     
     */
    public void setWeighingMethodCode(WeighingMethodCodeType value) {
        this.weighingMethodCode = value;
    }

    /**
     * Recupera il valore della proprietà weighingDeviceID.
     * 
     * @return
     *     possible object is
     *     {@link WeighingDeviceIDType }
     *     
     */
    public WeighingDeviceIDType getWeighingDeviceID() {
        return weighingDeviceID;
    }

    /**
     * Imposta il valore della proprietà weighingDeviceID.
     * 
     * @param value
     *     allowed object is
     *     {@link WeighingDeviceIDType }
     *     
     */
    public void setWeighingDeviceID(WeighingDeviceIDType value) {
        this.weighingDeviceID = value;
    }

    /**
     * Recupera il valore della proprietà weighingDeviceType.
     * 
     * @return
     *     possible object is
     *     {@link WeighingDeviceTypeType }
     *     
     */
    public WeighingDeviceTypeType getWeighingDeviceType() {
        return weighingDeviceType;
    }

    /**
     * Imposta il valore della proprietà weighingDeviceType.
     * 
     * @param value
     *     allowed object is
     *     {@link WeighingDeviceTypeType }
     *     
     */
    public void setWeighingDeviceType(WeighingDeviceTypeType value) {
        this.weighingDeviceType = value;
    }

    /**
     * Recupera il valore della proprietà grossMassMeasure.
     * 
     * @return
     *     possible object is
     *     {@link GrossMassMeasureType }
     *     
     */
    public GrossMassMeasureType getGrossMassMeasure() {
        return grossMassMeasure;
    }

    /**
     * Imposta il valore della proprietà grossMassMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossMassMeasureType }
     *     
     */
    public void setGrossMassMeasure(GrossMassMeasureType value) {
        this.grossMassMeasure = value;
    }

    /**
     * Recupera il valore della proprietà weighingParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getWeighingParty() {
        return weighingParty;
    }

    /**
     * Imposta il valore della proprietà weighingParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setWeighingParty(PartyType value) {
        this.weighingParty = value;
    }

    /**
     * Recupera il valore della proprietà shipperParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getShipperParty() {
        return shipperParty;
    }

    /**
     * Imposta il valore della proprietà shipperParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setShipperParty(PartyType value) {
        this.shipperParty = value;
    }

    /**
     * Recupera il valore della proprietà responsibleParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getResponsibleParty() {
        return responsibleParty;
    }

    /**
     * Imposta il valore della proprietà responsibleParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setResponsibleParty(PartyType value) {
        this.responsibleParty = value;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReference;
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
            WeighingDateType theWeighingDate;
            theWeighingDate = this.getWeighingDate();
            strategy.appendField(locator, this, "weighingDate", buffer, theWeighingDate, (this.weighingDate!= null));
        }
        {
            WeighingTimeType theWeighingTime;
            theWeighingTime = this.getWeighingTime();
            strategy.appendField(locator, this, "weighingTime", buffer, theWeighingTime, (this.weighingTime!= null));
        }
        {
            WeighingMethodCodeType theWeighingMethodCode;
            theWeighingMethodCode = this.getWeighingMethodCode();
            strategy.appendField(locator, this, "weighingMethodCode", buffer, theWeighingMethodCode, (this.weighingMethodCode!= null));
        }
        {
            WeighingDeviceIDType theWeighingDeviceID;
            theWeighingDeviceID = this.getWeighingDeviceID();
            strategy.appendField(locator, this, "weighingDeviceID", buffer, theWeighingDeviceID, (this.weighingDeviceID!= null));
        }
        {
            WeighingDeviceTypeType theWeighingDeviceType;
            theWeighingDeviceType = this.getWeighingDeviceType();
            strategy.appendField(locator, this, "weighingDeviceType", buffer, theWeighingDeviceType, (this.weighingDeviceType!= null));
        }
        {
            GrossMassMeasureType theGrossMassMeasure;
            theGrossMassMeasure = this.getGrossMassMeasure();
            strategy.appendField(locator, this, "grossMassMeasure", buffer, theGrossMassMeasure, (this.grossMassMeasure!= null));
        }
        {
            PartyType theWeighingParty;
            theWeighingParty = this.getWeighingParty();
            strategy.appendField(locator, this, "weighingParty", buffer, theWeighingParty, (this.weighingParty!= null));
        }
        {
            PartyType theShipperParty;
            theShipperParty = this.getShipperParty();
            strategy.appendField(locator, this, "shipperParty", buffer, theShipperParty, (this.shipperParty!= null));
        }
        {
            PartyType theResponsibleParty;
            theResponsibleParty = this.getResponsibleParty();
            strategy.appendField(locator, this, "responsibleParty", buffer, theResponsibleParty, (this.responsibleParty!= null));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            strategy.appendField(locator, this, "documentReference", buffer, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
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
        final VerifiedGrossMassType that = ((VerifiedGrossMassType) object);
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
            WeighingDateType lhsWeighingDate;
            lhsWeighingDate = this.getWeighingDate();
            WeighingDateType rhsWeighingDate;
            rhsWeighingDate = that.getWeighingDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weighingDate", lhsWeighingDate), LocatorUtils.property(thatLocator, "weighingDate", rhsWeighingDate), lhsWeighingDate, rhsWeighingDate, (this.weighingDate!= null), (that.weighingDate!= null))) {
                return false;
            }
        }
        {
            WeighingTimeType lhsWeighingTime;
            lhsWeighingTime = this.getWeighingTime();
            WeighingTimeType rhsWeighingTime;
            rhsWeighingTime = that.getWeighingTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weighingTime", lhsWeighingTime), LocatorUtils.property(thatLocator, "weighingTime", rhsWeighingTime), lhsWeighingTime, rhsWeighingTime, (this.weighingTime!= null), (that.weighingTime!= null))) {
                return false;
            }
        }
        {
            WeighingMethodCodeType lhsWeighingMethodCode;
            lhsWeighingMethodCode = this.getWeighingMethodCode();
            WeighingMethodCodeType rhsWeighingMethodCode;
            rhsWeighingMethodCode = that.getWeighingMethodCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weighingMethodCode", lhsWeighingMethodCode), LocatorUtils.property(thatLocator, "weighingMethodCode", rhsWeighingMethodCode), lhsWeighingMethodCode, rhsWeighingMethodCode, (this.weighingMethodCode!= null), (that.weighingMethodCode!= null))) {
                return false;
            }
        }
        {
            WeighingDeviceIDType lhsWeighingDeviceID;
            lhsWeighingDeviceID = this.getWeighingDeviceID();
            WeighingDeviceIDType rhsWeighingDeviceID;
            rhsWeighingDeviceID = that.getWeighingDeviceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weighingDeviceID", lhsWeighingDeviceID), LocatorUtils.property(thatLocator, "weighingDeviceID", rhsWeighingDeviceID), lhsWeighingDeviceID, rhsWeighingDeviceID, (this.weighingDeviceID!= null), (that.weighingDeviceID!= null))) {
                return false;
            }
        }
        {
            WeighingDeviceTypeType lhsWeighingDeviceType;
            lhsWeighingDeviceType = this.getWeighingDeviceType();
            WeighingDeviceTypeType rhsWeighingDeviceType;
            rhsWeighingDeviceType = that.getWeighingDeviceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weighingDeviceType", lhsWeighingDeviceType), LocatorUtils.property(thatLocator, "weighingDeviceType", rhsWeighingDeviceType), lhsWeighingDeviceType, rhsWeighingDeviceType, (this.weighingDeviceType!= null), (that.weighingDeviceType!= null))) {
                return false;
            }
        }
        {
            GrossMassMeasureType lhsGrossMassMeasure;
            lhsGrossMassMeasure = this.getGrossMassMeasure();
            GrossMassMeasureType rhsGrossMassMeasure;
            rhsGrossMassMeasure = that.getGrossMassMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grossMassMeasure", lhsGrossMassMeasure), LocatorUtils.property(thatLocator, "grossMassMeasure", rhsGrossMassMeasure), lhsGrossMassMeasure, rhsGrossMassMeasure, (this.grossMassMeasure!= null), (that.grossMassMeasure!= null))) {
                return false;
            }
        }
        {
            PartyType lhsWeighingParty;
            lhsWeighingParty = this.getWeighingParty();
            PartyType rhsWeighingParty;
            rhsWeighingParty = that.getWeighingParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weighingParty", lhsWeighingParty), LocatorUtils.property(thatLocator, "weighingParty", rhsWeighingParty), lhsWeighingParty, rhsWeighingParty, (this.weighingParty!= null), (that.weighingParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsShipperParty;
            lhsShipperParty = this.getShipperParty();
            PartyType rhsShipperParty;
            rhsShipperParty = that.getShipperParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipperParty", lhsShipperParty), LocatorUtils.property(thatLocator, "shipperParty", rhsShipperParty), lhsShipperParty, rhsShipperParty, (this.shipperParty!= null), (that.shipperParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsResponsibleParty;
            lhsResponsibleParty = this.getResponsibleParty();
            PartyType rhsResponsibleParty;
            rhsResponsibleParty = that.getResponsibleParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responsibleParty", lhsResponsibleParty), LocatorUtils.property(thatLocator, "responsibleParty", rhsResponsibleParty), lhsResponsibleParty, rhsResponsibleParty, (this.responsibleParty!= null), (that.responsibleParty!= null))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsDocumentReference;
            lhsDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            List<DocumentReferenceType> rhsDocumentReference;
            rhsDocumentReference = (((that.documentReference!= null)&&(!that.documentReference.isEmpty()))?that.getDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentReference", lhsDocumentReference), LocatorUtils.property(thatLocator, "documentReference", rhsDocumentReference), lhsDocumentReference, rhsDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())), ((that.documentReference!= null)&&(!that.documentReference.isEmpty())))) {
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
            WeighingDateType theWeighingDate;
            theWeighingDate = this.getWeighingDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weighingDate", theWeighingDate), currentHashCode, theWeighingDate, (this.weighingDate!= null));
        }
        {
            WeighingTimeType theWeighingTime;
            theWeighingTime = this.getWeighingTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weighingTime", theWeighingTime), currentHashCode, theWeighingTime, (this.weighingTime!= null));
        }
        {
            WeighingMethodCodeType theWeighingMethodCode;
            theWeighingMethodCode = this.getWeighingMethodCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weighingMethodCode", theWeighingMethodCode), currentHashCode, theWeighingMethodCode, (this.weighingMethodCode!= null));
        }
        {
            WeighingDeviceIDType theWeighingDeviceID;
            theWeighingDeviceID = this.getWeighingDeviceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weighingDeviceID", theWeighingDeviceID), currentHashCode, theWeighingDeviceID, (this.weighingDeviceID!= null));
        }
        {
            WeighingDeviceTypeType theWeighingDeviceType;
            theWeighingDeviceType = this.getWeighingDeviceType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weighingDeviceType", theWeighingDeviceType), currentHashCode, theWeighingDeviceType, (this.weighingDeviceType!= null));
        }
        {
            GrossMassMeasureType theGrossMassMeasure;
            theGrossMassMeasure = this.getGrossMassMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grossMassMeasure", theGrossMassMeasure), currentHashCode, theGrossMassMeasure, (this.grossMassMeasure!= null));
        }
        {
            PartyType theWeighingParty;
            theWeighingParty = this.getWeighingParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weighingParty", theWeighingParty), currentHashCode, theWeighingParty, (this.weighingParty!= null));
        }
        {
            PartyType theShipperParty;
            theShipperParty = this.getShipperParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipperParty", theShipperParty), currentHashCode, theShipperParty, (this.shipperParty!= null));
        }
        {
            PartyType theResponsibleParty;
            theResponsibleParty = this.getResponsibleParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responsibleParty", theResponsibleParty), currentHashCode, theResponsibleParty, (this.responsibleParty!= null));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentReference", theDocumentReference), currentHashCode, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
