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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsumptionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SpecificationTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalMeteredQuantityType;
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
 * <p>Classe Java per SubscriberConsumptionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SubscriberConsumptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecificationTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalMeteredQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubscriberParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UtilityConsumptionPoint"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OnAccountPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Consumption" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplierConsumption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberConsumptionType", propOrder = {
    "consumptionID",
    "specificationTypeCode",
    "note",
    "totalMeteredQuantity",
    "subscriberParty",
    "utilityConsumptionPoint",
    "onAccountPayment",
    "consumption",
    "supplierConsumption"
})
public class SubscriberConsumptionType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ConsumptionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionIDType consumptionID;
    @XmlElement(name = "SpecificationTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SpecificationTypeCodeType specificationTypeCode;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "TotalMeteredQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalMeteredQuantityType totalMeteredQuantity;
    @XmlElement(name = "SubscriberParty")
    protected PartyType subscriberParty;
    @XmlElement(name = "UtilityConsumptionPoint", required = true)
    protected ConsumptionPointType utilityConsumptionPoint;
    @XmlElement(name = "OnAccountPayment")
    protected List<OnAccountPaymentType> onAccountPayment;
    @XmlElement(name = "Consumption")
    protected ConsumptionType consumption;
    @XmlElement(name = "SupplierConsumption")
    protected List<SupplierConsumptionType> supplierConsumption;

    /**
     * Recupera il valore della proprietà consumptionID.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionIDType }
     *     
     */
    public ConsumptionIDType getConsumptionID() {
        return consumptionID;
    }

    /**
     * Imposta il valore della proprietà consumptionID.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionIDType }
     *     
     */
    public void setConsumptionID(ConsumptionIDType value) {
        this.consumptionID = value;
    }

    /**
     * Recupera il valore della proprietà specificationTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link SpecificationTypeCodeType }
     *     
     */
    public SpecificationTypeCodeType getSpecificationTypeCode() {
        return specificationTypeCode;
    }

    /**
     * Imposta il valore della proprietà specificationTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificationTypeCodeType }
     *     
     */
    public void setSpecificationTypeCode(SpecificationTypeCodeType value) {
        this.specificationTypeCode = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Recupera il valore della proprietà totalMeteredQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalMeteredQuantityType }
     *     
     */
    public TotalMeteredQuantityType getTotalMeteredQuantity() {
        return totalMeteredQuantity;
    }

    /**
     * Imposta il valore della proprietà totalMeteredQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalMeteredQuantityType }
     *     
     */
    public void setTotalMeteredQuantity(TotalMeteredQuantityType value) {
        this.totalMeteredQuantity = value;
    }

    /**
     * Recupera il valore della proprietà subscriberParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getSubscriberParty() {
        return subscriberParty;
    }

    /**
     * Imposta il valore della proprietà subscriberParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setSubscriberParty(PartyType value) {
        this.subscriberParty = value;
    }

    /**
     * Recupera il valore della proprietà utilityConsumptionPoint.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionPointType }
     *     
     */
    public ConsumptionPointType getUtilityConsumptionPoint() {
        return utilityConsumptionPoint;
    }

    /**
     * Imposta il valore della proprietà utilityConsumptionPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionPointType }
     *     
     */
    public void setUtilityConsumptionPoint(ConsumptionPointType value) {
        this.utilityConsumptionPoint = value;
    }

    /**
     * Gets the value of the onAccountPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onAccountPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnAccountPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnAccountPaymentType }
     * 
     * 
     */
    public List<OnAccountPaymentType> getOnAccountPayment() {
        if (onAccountPayment == null) {
            onAccountPayment = new ArrayList<OnAccountPaymentType>();
        }
        return this.onAccountPayment;
    }

    /**
     * Recupera il valore della proprietà consumption.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionType }
     *     
     */
    public ConsumptionType getConsumption() {
        return consumption;
    }

    /**
     * Imposta il valore della proprietà consumption.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionType }
     *     
     */
    public void setConsumption(ConsumptionType value) {
        this.consumption = value;
    }

    /**
     * Gets the value of the supplierConsumption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierConsumption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierConsumption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierConsumptionType }
     * 
     * 
     */
    public List<SupplierConsumptionType> getSupplierConsumption() {
        if (supplierConsumption == null) {
            supplierConsumption = new ArrayList<SupplierConsumptionType>();
        }
        return this.supplierConsumption;
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
            ConsumptionIDType theConsumptionID;
            theConsumptionID = this.getConsumptionID();
            strategy.appendField(locator, this, "consumptionID", buffer, theConsumptionID, (this.consumptionID!= null));
        }
        {
            SpecificationTypeCodeType theSpecificationTypeCode;
            theSpecificationTypeCode = this.getSpecificationTypeCode();
            strategy.appendField(locator, this, "specificationTypeCode", buffer, theSpecificationTypeCode, (this.specificationTypeCode!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            strategy.appendField(locator, this, "note", buffer, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            TotalMeteredQuantityType theTotalMeteredQuantity;
            theTotalMeteredQuantity = this.getTotalMeteredQuantity();
            strategy.appendField(locator, this, "totalMeteredQuantity", buffer, theTotalMeteredQuantity, (this.totalMeteredQuantity!= null));
        }
        {
            PartyType theSubscriberParty;
            theSubscriberParty = this.getSubscriberParty();
            strategy.appendField(locator, this, "subscriberParty", buffer, theSubscriberParty, (this.subscriberParty!= null));
        }
        {
            ConsumptionPointType theUtilityConsumptionPoint;
            theUtilityConsumptionPoint = this.getUtilityConsumptionPoint();
            strategy.appendField(locator, this, "utilityConsumptionPoint", buffer, theUtilityConsumptionPoint, (this.utilityConsumptionPoint!= null));
        }
        {
            List<OnAccountPaymentType> theOnAccountPayment;
            theOnAccountPayment = (((this.onAccountPayment!= null)&&(!this.onAccountPayment.isEmpty()))?this.getOnAccountPayment():null);
            strategy.appendField(locator, this, "onAccountPayment", buffer, theOnAccountPayment, ((this.onAccountPayment!= null)&&(!this.onAccountPayment.isEmpty())));
        }
        {
            ConsumptionType theConsumption;
            theConsumption = this.getConsumption();
            strategy.appendField(locator, this, "consumption", buffer, theConsumption, (this.consumption!= null));
        }
        {
            List<SupplierConsumptionType> theSupplierConsumption;
            theSupplierConsumption = (((this.supplierConsumption!= null)&&(!this.supplierConsumption.isEmpty()))?this.getSupplierConsumption():null);
            strategy.appendField(locator, this, "supplierConsumption", buffer, theSupplierConsumption, ((this.supplierConsumption!= null)&&(!this.supplierConsumption.isEmpty())));
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
        final SubscriberConsumptionType that = ((SubscriberConsumptionType) object);
        {
            ConsumptionIDType lhsConsumptionID;
            lhsConsumptionID = this.getConsumptionID();
            ConsumptionIDType rhsConsumptionID;
            rhsConsumptionID = that.getConsumptionID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionID", lhsConsumptionID), LocatorUtils.property(thatLocator, "consumptionID", rhsConsumptionID), lhsConsumptionID, rhsConsumptionID, (this.consumptionID!= null), (that.consumptionID!= null))) {
                return false;
            }
        }
        {
            SpecificationTypeCodeType lhsSpecificationTypeCode;
            lhsSpecificationTypeCode = this.getSpecificationTypeCode();
            SpecificationTypeCodeType rhsSpecificationTypeCode;
            rhsSpecificationTypeCode = that.getSpecificationTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specificationTypeCode", lhsSpecificationTypeCode), LocatorUtils.property(thatLocator, "specificationTypeCode", rhsSpecificationTypeCode), lhsSpecificationTypeCode, rhsSpecificationTypeCode, (this.specificationTypeCode!= null), (that.specificationTypeCode!= null))) {
                return false;
            }
        }
        {
            List<NoteType> lhsNote;
            lhsNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            List<NoteType> rhsNote;
            rhsNote = (((that.note!= null)&&(!that.note.isEmpty()))?that.getNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote, ((this.note!= null)&&(!this.note.isEmpty())), ((that.note!= null)&&(!that.note.isEmpty())))) {
                return false;
            }
        }
        {
            TotalMeteredQuantityType lhsTotalMeteredQuantity;
            lhsTotalMeteredQuantity = this.getTotalMeteredQuantity();
            TotalMeteredQuantityType rhsTotalMeteredQuantity;
            rhsTotalMeteredQuantity = that.getTotalMeteredQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalMeteredQuantity", lhsTotalMeteredQuantity), LocatorUtils.property(thatLocator, "totalMeteredQuantity", rhsTotalMeteredQuantity), lhsTotalMeteredQuantity, rhsTotalMeteredQuantity, (this.totalMeteredQuantity!= null), (that.totalMeteredQuantity!= null))) {
                return false;
            }
        }
        {
            PartyType lhsSubscriberParty;
            lhsSubscriberParty = this.getSubscriberParty();
            PartyType rhsSubscriberParty;
            rhsSubscriberParty = that.getSubscriberParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subscriberParty", lhsSubscriberParty), LocatorUtils.property(thatLocator, "subscriberParty", rhsSubscriberParty), lhsSubscriberParty, rhsSubscriberParty, (this.subscriberParty!= null), (that.subscriberParty!= null))) {
                return false;
            }
        }
        {
            ConsumptionPointType lhsUtilityConsumptionPoint;
            lhsUtilityConsumptionPoint = this.getUtilityConsumptionPoint();
            ConsumptionPointType rhsUtilityConsumptionPoint;
            rhsUtilityConsumptionPoint = that.getUtilityConsumptionPoint();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "utilityConsumptionPoint", lhsUtilityConsumptionPoint), LocatorUtils.property(thatLocator, "utilityConsumptionPoint", rhsUtilityConsumptionPoint), lhsUtilityConsumptionPoint, rhsUtilityConsumptionPoint, (this.utilityConsumptionPoint!= null), (that.utilityConsumptionPoint!= null))) {
                return false;
            }
        }
        {
            List<OnAccountPaymentType> lhsOnAccountPayment;
            lhsOnAccountPayment = (((this.onAccountPayment!= null)&&(!this.onAccountPayment.isEmpty()))?this.getOnAccountPayment():null);
            List<OnAccountPaymentType> rhsOnAccountPayment;
            rhsOnAccountPayment = (((that.onAccountPayment!= null)&&(!that.onAccountPayment.isEmpty()))?that.getOnAccountPayment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "onAccountPayment", lhsOnAccountPayment), LocatorUtils.property(thatLocator, "onAccountPayment", rhsOnAccountPayment), lhsOnAccountPayment, rhsOnAccountPayment, ((this.onAccountPayment!= null)&&(!this.onAccountPayment.isEmpty())), ((that.onAccountPayment!= null)&&(!that.onAccountPayment.isEmpty())))) {
                return false;
            }
        }
        {
            ConsumptionType lhsConsumption;
            lhsConsumption = this.getConsumption();
            ConsumptionType rhsConsumption;
            rhsConsumption = that.getConsumption();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumption", lhsConsumption), LocatorUtils.property(thatLocator, "consumption", rhsConsumption), lhsConsumption, rhsConsumption, (this.consumption!= null), (that.consumption!= null))) {
                return false;
            }
        }
        {
            List<SupplierConsumptionType> lhsSupplierConsumption;
            lhsSupplierConsumption = (((this.supplierConsumption!= null)&&(!this.supplierConsumption.isEmpty()))?this.getSupplierConsumption():null);
            List<SupplierConsumptionType> rhsSupplierConsumption;
            rhsSupplierConsumption = (((that.supplierConsumption!= null)&&(!that.supplierConsumption.isEmpty()))?that.getSupplierConsumption():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplierConsumption", lhsSupplierConsumption), LocatorUtils.property(thatLocator, "supplierConsumption", rhsSupplierConsumption), lhsSupplierConsumption, rhsSupplierConsumption, ((this.supplierConsumption!= null)&&(!this.supplierConsumption.isEmpty())), ((that.supplierConsumption!= null)&&(!that.supplierConsumption.isEmpty())))) {
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
            ConsumptionIDType theConsumptionID;
            theConsumptionID = this.getConsumptionID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionID", theConsumptionID), currentHashCode, theConsumptionID, (this.consumptionID!= null));
        }
        {
            SpecificationTypeCodeType theSpecificationTypeCode;
            theSpecificationTypeCode = this.getSpecificationTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specificationTypeCode", theSpecificationTypeCode), currentHashCode, theSpecificationTypeCode, (this.specificationTypeCode!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            TotalMeteredQuantityType theTotalMeteredQuantity;
            theTotalMeteredQuantity = this.getTotalMeteredQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalMeteredQuantity", theTotalMeteredQuantity), currentHashCode, theTotalMeteredQuantity, (this.totalMeteredQuantity!= null));
        }
        {
            PartyType theSubscriberParty;
            theSubscriberParty = this.getSubscriberParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subscriberParty", theSubscriberParty), currentHashCode, theSubscriberParty, (this.subscriberParty!= null));
        }
        {
            ConsumptionPointType theUtilityConsumptionPoint;
            theUtilityConsumptionPoint = this.getUtilityConsumptionPoint();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "utilityConsumptionPoint", theUtilityConsumptionPoint), currentHashCode, theUtilityConsumptionPoint, (this.utilityConsumptionPoint!= null));
        }
        {
            List<OnAccountPaymentType> theOnAccountPayment;
            theOnAccountPayment = (((this.onAccountPayment!= null)&&(!this.onAccountPayment.isEmpty()))?this.getOnAccountPayment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "onAccountPayment", theOnAccountPayment), currentHashCode, theOnAccountPayment, ((this.onAccountPayment!= null)&&(!this.onAccountPayment.isEmpty())));
        }
        {
            ConsumptionType theConsumption;
            theConsumption = this.getConsumption();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumption", theConsumption), currentHashCode, theConsumption, (this.consumption!= null));
        }
        {
            List<SupplierConsumptionType> theSupplierConsumption;
            theSupplierConsumption = (((this.supplierConsumption!= null)&&(!this.supplierConsumption.isEmpty()))?this.getSupplierConsumption():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplierConsumption", theSupplierConsumption), currentHashCode, theSupplierConsumption, ((this.supplierConsumption!= null)&&(!this.supplierConsumption.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
