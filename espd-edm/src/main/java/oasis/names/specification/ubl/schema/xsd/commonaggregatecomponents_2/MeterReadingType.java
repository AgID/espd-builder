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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DeliveredQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestMeterQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestMeterReadingDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestMeterReadingMethodCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestMeterReadingMethodType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MeterReadingCommentsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MeterReadingTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MeterReadingTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PreviousMeterQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PreviousMeterReadingDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PreviousMeterReadingMethodCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PreviousMeterReadingMethodType;
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
 * <p>Classe Java per MeterReadingType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MeterReadingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterReadingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterReadingTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousMeterReadingDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousMeterQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestMeterReadingDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestMeterQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousMeterReadingMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousMeterReadingMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestMeterReadingMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestMeterReadingMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterReadingComments" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeliveredQuantity"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterReadingType", propOrder = {
    "id",
    "meterReadingType",
    "meterReadingTypeCode",
    "previousMeterReadingDate",
    "previousMeterQuantity",
    "latestMeterReadingDate",
    "latestMeterQuantity",
    "previousMeterReadingMethod",
    "previousMeterReadingMethodCode",
    "latestMeterReadingMethod",
    "latestMeterReadingMethodCode",
    "meterReadingComments",
    "deliveredQuantity"
})
public class MeterReadingType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "MeterReadingType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeterReadingTypeType meterReadingType;
    @XmlElement(name = "MeterReadingTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeterReadingTypeCodeType meterReadingTypeCode;
    @XmlElement(name = "PreviousMeterReadingDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PreviousMeterReadingDateType previousMeterReadingDate;
    @XmlElement(name = "PreviousMeterQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PreviousMeterQuantityType previousMeterQuantity;
    @XmlElement(name = "LatestMeterReadingDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected LatestMeterReadingDateType latestMeterReadingDate;
    @XmlElement(name = "LatestMeterQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected LatestMeterQuantityType latestMeterQuantity;
    @XmlElement(name = "PreviousMeterReadingMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PreviousMeterReadingMethodType previousMeterReadingMethod;
    @XmlElement(name = "PreviousMeterReadingMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PreviousMeterReadingMethodCodeType previousMeterReadingMethodCode;
    @XmlElement(name = "LatestMeterReadingMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestMeterReadingMethodType latestMeterReadingMethod;
    @XmlElement(name = "LatestMeterReadingMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestMeterReadingMethodCodeType latestMeterReadingMethodCode;
    @XmlElement(name = "MeterReadingComments", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<MeterReadingCommentsType> meterReadingComments;
    @XmlElement(name = "DeliveredQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected DeliveredQuantityType deliveredQuantity;

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
     * Recupera il valore della proprietà meterReadingType.
     * 
     * @return
     *     possible object is
     *     {@link MeterReadingTypeType }
     *     
     */
    public MeterReadingTypeType getMeterReadingType() {
        return meterReadingType;
    }

    /**
     * Imposta il valore della proprietà meterReadingType.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReadingTypeType }
     *     
     */
    public void setMeterReadingType(MeterReadingTypeType value) {
        this.meterReadingType = value;
    }

    /**
     * Recupera il valore della proprietà meterReadingTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link MeterReadingTypeCodeType }
     *     
     */
    public MeterReadingTypeCodeType getMeterReadingTypeCode() {
        return meterReadingTypeCode;
    }

    /**
     * Imposta il valore della proprietà meterReadingTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReadingTypeCodeType }
     *     
     */
    public void setMeterReadingTypeCode(MeterReadingTypeCodeType value) {
        this.meterReadingTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà previousMeterReadingDate.
     * 
     * @return
     *     possible object is
     *     {@link PreviousMeterReadingDateType }
     *     
     */
    public PreviousMeterReadingDateType getPreviousMeterReadingDate() {
        return previousMeterReadingDate;
    }

    /**
     * Imposta il valore della proprietà previousMeterReadingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousMeterReadingDateType }
     *     
     */
    public void setPreviousMeterReadingDate(PreviousMeterReadingDateType value) {
        this.previousMeterReadingDate = value;
    }

    /**
     * Recupera il valore della proprietà previousMeterQuantity.
     * 
     * @return
     *     possible object is
     *     {@link PreviousMeterQuantityType }
     *     
     */
    public PreviousMeterQuantityType getPreviousMeterQuantity() {
        return previousMeterQuantity;
    }

    /**
     * Imposta il valore della proprietà previousMeterQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousMeterQuantityType }
     *     
     */
    public void setPreviousMeterQuantity(PreviousMeterQuantityType value) {
        this.previousMeterQuantity = value;
    }

    /**
     * Recupera il valore della proprietà latestMeterReadingDate.
     * 
     * @return
     *     possible object is
     *     {@link LatestMeterReadingDateType }
     *     
     */
    public LatestMeterReadingDateType getLatestMeterReadingDate() {
        return latestMeterReadingDate;
    }

    /**
     * Imposta il valore della proprietà latestMeterReadingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestMeterReadingDateType }
     *     
     */
    public void setLatestMeterReadingDate(LatestMeterReadingDateType value) {
        this.latestMeterReadingDate = value;
    }

    /**
     * Recupera il valore della proprietà latestMeterQuantity.
     * 
     * @return
     *     possible object is
     *     {@link LatestMeterQuantityType }
     *     
     */
    public LatestMeterQuantityType getLatestMeterQuantity() {
        return latestMeterQuantity;
    }

    /**
     * Imposta il valore della proprietà latestMeterQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestMeterQuantityType }
     *     
     */
    public void setLatestMeterQuantity(LatestMeterQuantityType value) {
        this.latestMeterQuantity = value;
    }

    /**
     * Recupera il valore della proprietà previousMeterReadingMethod.
     * 
     * @return
     *     possible object is
     *     {@link PreviousMeterReadingMethodType }
     *     
     */
    public PreviousMeterReadingMethodType getPreviousMeterReadingMethod() {
        return previousMeterReadingMethod;
    }

    /**
     * Imposta il valore della proprietà previousMeterReadingMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousMeterReadingMethodType }
     *     
     */
    public void setPreviousMeterReadingMethod(PreviousMeterReadingMethodType value) {
        this.previousMeterReadingMethod = value;
    }

    /**
     * Recupera il valore della proprietà previousMeterReadingMethodCode.
     * 
     * @return
     *     possible object is
     *     {@link PreviousMeterReadingMethodCodeType }
     *     
     */
    public PreviousMeterReadingMethodCodeType getPreviousMeterReadingMethodCode() {
        return previousMeterReadingMethodCode;
    }

    /**
     * Imposta il valore della proprietà previousMeterReadingMethodCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousMeterReadingMethodCodeType }
     *     
     */
    public void setPreviousMeterReadingMethodCode(PreviousMeterReadingMethodCodeType value) {
        this.previousMeterReadingMethodCode = value;
    }

    /**
     * Recupera il valore della proprietà latestMeterReadingMethod.
     * 
     * @return
     *     possible object is
     *     {@link LatestMeterReadingMethodType }
     *     
     */
    public LatestMeterReadingMethodType getLatestMeterReadingMethod() {
        return latestMeterReadingMethod;
    }

    /**
     * Imposta il valore della proprietà latestMeterReadingMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestMeterReadingMethodType }
     *     
     */
    public void setLatestMeterReadingMethod(LatestMeterReadingMethodType value) {
        this.latestMeterReadingMethod = value;
    }

    /**
     * Recupera il valore della proprietà latestMeterReadingMethodCode.
     * 
     * @return
     *     possible object is
     *     {@link LatestMeterReadingMethodCodeType }
     *     
     */
    public LatestMeterReadingMethodCodeType getLatestMeterReadingMethodCode() {
        return latestMeterReadingMethodCode;
    }

    /**
     * Imposta il valore della proprietà latestMeterReadingMethodCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestMeterReadingMethodCodeType }
     *     
     */
    public void setLatestMeterReadingMethodCode(LatestMeterReadingMethodCodeType value) {
        this.latestMeterReadingMethodCode = value;
    }

    /**
     * Gets the value of the meterReadingComments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterReadingComments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterReadingComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterReadingCommentsType }
     * 
     * 
     */
    public List<MeterReadingCommentsType> getMeterReadingComments() {
        if (meterReadingComments == null) {
            meterReadingComments = new ArrayList<MeterReadingCommentsType>();
        }
        return this.meterReadingComments;
    }

    /**
     * Recupera il valore della proprietà deliveredQuantity.
     * 
     * @return
     *     possible object is
     *     {@link DeliveredQuantityType }
     *     
     */
    public DeliveredQuantityType getDeliveredQuantity() {
        return deliveredQuantity;
    }

    /**
     * Imposta il valore della proprietà deliveredQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveredQuantityType }
     *     
     */
    public void setDeliveredQuantity(DeliveredQuantityType value) {
        this.deliveredQuantity = value;
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
            MeterReadingTypeType theMeterReadingType;
            theMeterReadingType = this.getMeterReadingType();
            strategy.appendField(locator, this, "meterReadingType", buffer, theMeterReadingType, (this.meterReadingType!= null));
        }
        {
            MeterReadingTypeCodeType theMeterReadingTypeCode;
            theMeterReadingTypeCode = this.getMeterReadingTypeCode();
            strategy.appendField(locator, this, "meterReadingTypeCode", buffer, theMeterReadingTypeCode, (this.meterReadingTypeCode!= null));
        }
        {
            PreviousMeterReadingDateType thePreviousMeterReadingDate;
            thePreviousMeterReadingDate = this.getPreviousMeterReadingDate();
            strategy.appendField(locator, this, "previousMeterReadingDate", buffer, thePreviousMeterReadingDate, (this.previousMeterReadingDate!= null));
        }
        {
            PreviousMeterQuantityType thePreviousMeterQuantity;
            thePreviousMeterQuantity = this.getPreviousMeterQuantity();
            strategy.appendField(locator, this, "previousMeterQuantity", buffer, thePreviousMeterQuantity, (this.previousMeterQuantity!= null));
        }
        {
            LatestMeterReadingDateType theLatestMeterReadingDate;
            theLatestMeterReadingDate = this.getLatestMeterReadingDate();
            strategy.appendField(locator, this, "latestMeterReadingDate", buffer, theLatestMeterReadingDate, (this.latestMeterReadingDate!= null));
        }
        {
            LatestMeterQuantityType theLatestMeterQuantity;
            theLatestMeterQuantity = this.getLatestMeterQuantity();
            strategy.appendField(locator, this, "latestMeterQuantity", buffer, theLatestMeterQuantity, (this.latestMeterQuantity!= null));
        }
        {
            PreviousMeterReadingMethodType thePreviousMeterReadingMethod;
            thePreviousMeterReadingMethod = this.getPreviousMeterReadingMethod();
            strategy.appendField(locator, this, "previousMeterReadingMethod", buffer, thePreviousMeterReadingMethod, (this.previousMeterReadingMethod!= null));
        }
        {
            PreviousMeterReadingMethodCodeType thePreviousMeterReadingMethodCode;
            thePreviousMeterReadingMethodCode = this.getPreviousMeterReadingMethodCode();
            strategy.appendField(locator, this, "previousMeterReadingMethodCode", buffer, thePreviousMeterReadingMethodCode, (this.previousMeterReadingMethodCode!= null));
        }
        {
            LatestMeterReadingMethodType theLatestMeterReadingMethod;
            theLatestMeterReadingMethod = this.getLatestMeterReadingMethod();
            strategy.appendField(locator, this, "latestMeterReadingMethod", buffer, theLatestMeterReadingMethod, (this.latestMeterReadingMethod!= null));
        }
        {
            LatestMeterReadingMethodCodeType theLatestMeterReadingMethodCode;
            theLatestMeterReadingMethodCode = this.getLatestMeterReadingMethodCode();
            strategy.appendField(locator, this, "latestMeterReadingMethodCode", buffer, theLatestMeterReadingMethodCode, (this.latestMeterReadingMethodCode!= null));
        }
        {
            List<MeterReadingCommentsType> theMeterReadingComments;
            theMeterReadingComments = (((this.meterReadingComments!= null)&&(!this.meterReadingComments.isEmpty()))?this.getMeterReadingComments():null);
            strategy.appendField(locator, this, "meterReadingComments", buffer, theMeterReadingComments, ((this.meterReadingComments!= null)&&(!this.meterReadingComments.isEmpty())));
        }
        {
            DeliveredQuantityType theDeliveredQuantity;
            theDeliveredQuantity = this.getDeliveredQuantity();
            strategy.appendField(locator, this, "deliveredQuantity", buffer, theDeliveredQuantity, (this.deliveredQuantity!= null));
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
        final MeterReadingType that = ((MeterReadingType) object);
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
            MeterReadingTypeType lhsMeterReadingType;
            lhsMeterReadingType = this.getMeterReadingType();
            MeterReadingTypeType rhsMeterReadingType;
            rhsMeterReadingType = that.getMeterReadingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meterReadingType", lhsMeterReadingType), LocatorUtils.property(thatLocator, "meterReadingType", rhsMeterReadingType), lhsMeterReadingType, rhsMeterReadingType, (this.meterReadingType!= null), (that.meterReadingType!= null))) {
                return false;
            }
        }
        {
            MeterReadingTypeCodeType lhsMeterReadingTypeCode;
            lhsMeterReadingTypeCode = this.getMeterReadingTypeCode();
            MeterReadingTypeCodeType rhsMeterReadingTypeCode;
            rhsMeterReadingTypeCode = that.getMeterReadingTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meterReadingTypeCode", lhsMeterReadingTypeCode), LocatorUtils.property(thatLocator, "meterReadingTypeCode", rhsMeterReadingTypeCode), lhsMeterReadingTypeCode, rhsMeterReadingTypeCode, (this.meterReadingTypeCode!= null), (that.meterReadingTypeCode!= null))) {
                return false;
            }
        }
        {
            PreviousMeterReadingDateType lhsPreviousMeterReadingDate;
            lhsPreviousMeterReadingDate = this.getPreviousMeterReadingDate();
            PreviousMeterReadingDateType rhsPreviousMeterReadingDate;
            rhsPreviousMeterReadingDate = that.getPreviousMeterReadingDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousMeterReadingDate", lhsPreviousMeterReadingDate), LocatorUtils.property(thatLocator, "previousMeterReadingDate", rhsPreviousMeterReadingDate), lhsPreviousMeterReadingDate, rhsPreviousMeterReadingDate, (this.previousMeterReadingDate!= null), (that.previousMeterReadingDate!= null))) {
                return false;
            }
        }
        {
            PreviousMeterQuantityType lhsPreviousMeterQuantity;
            lhsPreviousMeterQuantity = this.getPreviousMeterQuantity();
            PreviousMeterQuantityType rhsPreviousMeterQuantity;
            rhsPreviousMeterQuantity = that.getPreviousMeterQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousMeterQuantity", lhsPreviousMeterQuantity), LocatorUtils.property(thatLocator, "previousMeterQuantity", rhsPreviousMeterQuantity), lhsPreviousMeterQuantity, rhsPreviousMeterQuantity, (this.previousMeterQuantity!= null), (that.previousMeterQuantity!= null))) {
                return false;
            }
        }
        {
            LatestMeterReadingDateType lhsLatestMeterReadingDate;
            lhsLatestMeterReadingDate = this.getLatestMeterReadingDate();
            LatestMeterReadingDateType rhsLatestMeterReadingDate;
            rhsLatestMeterReadingDate = that.getLatestMeterReadingDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestMeterReadingDate", lhsLatestMeterReadingDate), LocatorUtils.property(thatLocator, "latestMeterReadingDate", rhsLatestMeterReadingDate), lhsLatestMeterReadingDate, rhsLatestMeterReadingDate, (this.latestMeterReadingDate!= null), (that.latestMeterReadingDate!= null))) {
                return false;
            }
        }
        {
            LatestMeterQuantityType lhsLatestMeterQuantity;
            lhsLatestMeterQuantity = this.getLatestMeterQuantity();
            LatestMeterQuantityType rhsLatestMeterQuantity;
            rhsLatestMeterQuantity = that.getLatestMeterQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestMeterQuantity", lhsLatestMeterQuantity), LocatorUtils.property(thatLocator, "latestMeterQuantity", rhsLatestMeterQuantity), lhsLatestMeterQuantity, rhsLatestMeterQuantity, (this.latestMeterQuantity!= null), (that.latestMeterQuantity!= null))) {
                return false;
            }
        }
        {
            PreviousMeterReadingMethodType lhsPreviousMeterReadingMethod;
            lhsPreviousMeterReadingMethod = this.getPreviousMeterReadingMethod();
            PreviousMeterReadingMethodType rhsPreviousMeterReadingMethod;
            rhsPreviousMeterReadingMethod = that.getPreviousMeterReadingMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousMeterReadingMethod", lhsPreviousMeterReadingMethod), LocatorUtils.property(thatLocator, "previousMeterReadingMethod", rhsPreviousMeterReadingMethod), lhsPreviousMeterReadingMethod, rhsPreviousMeterReadingMethod, (this.previousMeterReadingMethod!= null), (that.previousMeterReadingMethod!= null))) {
                return false;
            }
        }
        {
            PreviousMeterReadingMethodCodeType lhsPreviousMeterReadingMethodCode;
            lhsPreviousMeterReadingMethodCode = this.getPreviousMeterReadingMethodCode();
            PreviousMeterReadingMethodCodeType rhsPreviousMeterReadingMethodCode;
            rhsPreviousMeterReadingMethodCode = that.getPreviousMeterReadingMethodCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousMeterReadingMethodCode", lhsPreviousMeterReadingMethodCode), LocatorUtils.property(thatLocator, "previousMeterReadingMethodCode", rhsPreviousMeterReadingMethodCode), lhsPreviousMeterReadingMethodCode, rhsPreviousMeterReadingMethodCode, (this.previousMeterReadingMethodCode!= null), (that.previousMeterReadingMethodCode!= null))) {
                return false;
            }
        }
        {
            LatestMeterReadingMethodType lhsLatestMeterReadingMethod;
            lhsLatestMeterReadingMethod = this.getLatestMeterReadingMethod();
            LatestMeterReadingMethodType rhsLatestMeterReadingMethod;
            rhsLatestMeterReadingMethod = that.getLatestMeterReadingMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestMeterReadingMethod", lhsLatestMeterReadingMethod), LocatorUtils.property(thatLocator, "latestMeterReadingMethod", rhsLatestMeterReadingMethod), lhsLatestMeterReadingMethod, rhsLatestMeterReadingMethod, (this.latestMeterReadingMethod!= null), (that.latestMeterReadingMethod!= null))) {
                return false;
            }
        }
        {
            LatestMeterReadingMethodCodeType lhsLatestMeterReadingMethodCode;
            lhsLatestMeterReadingMethodCode = this.getLatestMeterReadingMethodCode();
            LatestMeterReadingMethodCodeType rhsLatestMeterReadingMethodCode;
            rhsLatestMeterReadingMethodCode = that.getLatestMeterReadingMethodCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestMeterReadingMethodCode", lhsLatestMeterReadingMethodCode), LocatorUtils.property(thatLocator, "latestMeterReadingMethodCode", rhsLatestMeterReadingMethodCode), lhsLatestMeterReadingMethodCode, rhsLatestMeterReadingMethodCode, (this.latestMeterReadingMethodCode!= null), (that.latestMeterReadingMethodCode!= null))) {
                return false;
            }
        }
        {
            List<MeterReadingCommentsType> lhsMeterReadingComments;
            lhsMeterReadingComments = (((this.meterReadingComments!= null)&&(!this.meterReadingComments.isEmpty()))?this.getMeterReadingComments():null);
            List<MeterReadingCommentsType> rhsMeterReadingComments;
            rhsMeterReadingComments = (((that.meterReadingComments!= null)&&(!that.meterReadingComments.isEmpty()))?that.getMeterReadingComments():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meterReadingComments", lhsMeterReadingComments), LocatorUtils.property(thatLocator, "meterReadingComments", rhsMeterReadingComments), lhsMeterReadingComments, rhsMeterReadingComments, ((this.meterReadingComments!= null)&&(!this.meterReadingComments.isEmpty())), ((that.meterReadingComments!= null)&&(!that.meterReadingComments.isEmpty())))) {
                return false;
            }
        }
        {
            DeliveredQuantityType lhsDeliveredQuantity;
            lhsDeliveredQuantity = this.getDeliveredQuantity();
            DeliveredQuantityType rhsDeliveredQuantity;
            rhsDeliveredQuantity = that.getDeliveredQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveredQuantity", lhsDeliveredQuantity), LocatorUtils.property(thatLocator, "deliveredQuantity", rhsDeliveredQuantity), lhsDeliveredQuantity, rhsDeliveredQuantity, (this.deliveredQuantity!= null), (that.deliveredQuantity!= null))) {
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
            MeterReadingTypeType theMeterReadingType;
            theMeterReadingType = this.getMeterReadingType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meterReadingType", theMeterReadingType), currentHashCode, theMeterReadingType, (this.meterReadingType!= null));
        }
        {
            MeterReadingTypeCodeType theMeterReadingTypeCode;
            theMeterReadingTypeCode = this.getMeterReadingTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meterReadingTypeCode", theMeterReadingTypeCode), currentHashCode, theMeterReadingTypeCode, (this.meterReadingTypeCode!= null));
        }
        {
            PreviousMeterReadingDateType thePreviousMeterReadingDate;
            thePreviousMeterReadingDate = this.getPreviousMeterReadingDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousMeterReadingDate", thePreviousMeterReadingDate), currentHashCode, thePreviousMeterReadingDate, (this.previousMeterReadingDate!= null));
        }
        {
            PreviousMeterQuantityType thePreviousMeterQuantity;
            thePreviousMeterQuantity = this.getPreviousMeterQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousMeterQuantity", thePreviousMeterQuantity), currentHashCode, thePreviousMeterQuantity, (this.previousMeterQuantity!= null));
        }
        {
            LatestMeterReadingDateType theLatestMeterReadingDate;
            theLatestMeterReadingDate = this.getLatestMeterReadingDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestMeterReadingDate", theLatestMeterReadingDate), currentHashCode, theLatestMeterReadingDate, (this.latestMeterReadingDate!= null));
        }
        {
            LatestMeterQuantityType theLatestMeterQuantity;
            theLatestMeterQuantity = this.getLatestMeterQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestMeterQuantity", theLatestMeterQuantity), currentHashCode, theLatestMeterQuantity, (this.latestMeterQuantity!= null));
        }
        {
            PreviousMeterReadingMethodType thePreviousMeterReadingMethod;
            thePreviousMeterReadingMethod = this.getPreviousMeterReadingMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousMeterReadingMethod", thePreviousMeterReadingMethod), currentHashCode, thePreviousMeterReadingMethod, (this.previousMeterReadingMethod!= null));
        }
        {
            PreviousMeterReadingMethodCodeType thePreviousMeterReadingMethodCode;
            thePreviousMeterReadingMethodCode = this.getPreviousMeterReadingMethodCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousMeterReadingMethodCode", thePreviousMeterReadingMethodCode), currentHashCode, thePreviousMeterReadingMethodCode, (this.previousMeterReadingMethodCode!= null));
        }
        {
            LatestMeterReadingMethodType theLatestMeterReadingMethod;
            theLatestMeterReadingMethod = this.getLatestMeterReadingMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestMeterReadingMethod", theLatestMeterReadingMethod), currentHashCode, theLatestMeterReadingMethod, (this.latestMeterReadingMethod!= null));
        }
        {
            LatestMeterReadingMethodCodeType theLatestMeterReadingMethodCode;
            theLatestMeterReadingMethodCode = this.getLatestMeterReadingMethodCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestMeterReadingMethodCode", theLatestMeterReadingMethodCode), currentHashCode, theLatestMeterReadingMethodCode, (this.latestMeterReadingMethodCode!= null));
        }
        {
            List<MeterReadingCommentsType> theMeterReadingComments;
            theMeterReadingComments = (((this.meterReadingComments!= null)&&(!this.meterReadingComments.isEmpty()))?this.getMeterReadingComments():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meterReadingComments", theMeterReadingComments), currentHashCode, theMeterReadingComments, ((this.meterReadingComments!= null)&&(!this.meterReadingComments.isEmpty())));
        }
        {
            DeliveredQuantityType theDeliveredQuantity;
            theDeliveredQuantity = this.getDeliveredQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveredQuantity", theDeliveredQuantity), currentHashCode, theDeliveredQuantity, (this.deliveredQuantity!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
