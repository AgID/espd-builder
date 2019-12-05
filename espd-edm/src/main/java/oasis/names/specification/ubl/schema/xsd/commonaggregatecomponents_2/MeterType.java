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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MeterConstantCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MeterConstantType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MeterNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MeterNumberType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalDeliveredQuantityType;
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
 * <p>Classe Java per MeterType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MeterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterConstant" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterConstantCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalDeliveredQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeterReading" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeterProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterType", propOrder = {
    "meterNumber",
    "meterName",
    "meterConstant",
    "meterConstantCode",
    "totalDeliveredQuantity",
    "meterReading",
    "meterProperty"
})
public class MeterType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "MeterNumber", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeterNumberType meterNumber;
    @XmlElement(name = "MeterName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeterNameType meterName;
    @XmlElement(name = "MeterConstant", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeterConstantType meterConstant;
    @XmlElement(name = "MeterConstantCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MeterConstantCodeType meterConstantCode;
    @XmlElement(name = "TotalDeliveredQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TotalDeliveredQuantityType totalDeliveredQuantity;
    @XmlElement(name = "MeterReading")
    protected List<MeterReadingType> meterReading;
    @XmlElement(name = "MeterProperty")
    protected List<MeterPropertyType> meterProperty;

    /**
     * Recupera il valore della proprietà meterNumber.
     * 
     * @return
     *     possible object is
     *     {@link MeterNumberType }
     *     
     */
    public MeterNumberType getMeterNumber() {
        return meterNumber;
    }

    /**
     * Imposta il valore della proprietà meterNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterNumberType }
     *     
     */
    public void setMeterNumber(MeterNumberType value) {
        this.meterNumber = value;
    }

    /**
     * Recupera il valore della proprietà meterName.
     * 
     * @return
     *     possible object is
     *     {@link MeterNameType }
     *     
     */
    public MeterNameType getMeterName() {
        return meterName;
    }

    /**
     * Imposta il valore della proprietà meterName.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterNameType }
     *     
     */
    public void setMeterName(MeterNameType value) {
        this.meterName = value;
    }

    /**
     * Recupera il valore della proprietà meterConstant.
     * 
     * @return
     *     possible object is
     *     {@link MeterConstantType }
     *     
     */
    public MeterConstantType getMeterConstant() {
        return meterConstant;
    }

    /**
     * Imposta il valore della proprietà meterConstant.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterConstantType }
     *     
     */
    public void setMeterConstant(MeterConstantType value) {
        this.meterConstant = value;
    }

    /**
     * Recupera il valore della proprietà meterConstantCode.
     * 
     * @return
     *     possible object is
     *     {@link MeterConstantCodeType }
     *     
     */
    public MeterConstantCodeType getMeterConstantCode() {
        return meterConstantCode;
    }

    /**
     * Imposta il valore della proprietà meterConstantCode.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterConstantCodeType }
     *     
     */
    public void setMeterConstantCode(MeterConstantCodeType value) {
        this.meterConstantCode = value;
    }

    /**
     * Recupera il valore della proprietà totalDeliveredQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalDeliveredQuantityType }
     *     
     */
    public TotalDeliveredQuantityType getTotalDeliveredQuantity() {
        return totalDeliveredQuantity;
    }

    /**
     * Imposta il valore della proprietà totalDeliveredQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalDeliveredQuantityType }
     *     
     */
    public void setTotalDeliveredQuantity(TotalDeliveredQuantityType value) {
        this.totalDeliveredQuantity = value;
    }

    /**
     * Gets the value of the meterReading property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterReading property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterReading().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterReadingType }
     * 
     * 
     */
    public List<MeterReadingType> getMeterReading() {
        if (meterReading == null) {
            meterReading = new ArrayList<MeterReadingType>();
        }
        return this.meterReading;
    }

    /**
     * Gets the value of the meterProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterPropertyType }
     * 
     * 
     */
    public List<MeterPropertyType> getMeterProperty() {
        if (meterProperty == null) {
            meterProperty = new ArrayList<MeterPropertyType>();
        }
        return this.meterProperty;
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
            MeterNumberType theMeterNumber;
            theMeterNumber = this.getMeterNumber();
            strategy.appendField(locator, this, "meterNumber", buffer, theMeterNumber, (this.meterNumber!= null));
        }
        {
            MeterNameType theMeterName;
            theMeterName = this.getMeterName();
            strategy.appendField(locator, this, "meterName", buffer, theMeterName, (this.meterName!= null));
        }
        {
            MeterConstantType theMeterConstant;
            theMeterConstant = this.getMeterConstant();
            strategy.appendField(locator, this, "meterConstant", buffer, theMeterConstant, (this.meterConstant!= null));
        }
        {
            MeterConstantCodeType theMeterConstantCode;
            theMeterConstantCode = this.getMeterConstantCode();
            strategy.appendField(locator, this, "meterConstantCode", buffer, theMeterConstantCode, (this.meterConstantCode!= null));
        }
        {
            TotalDeliveredQuantityType theTotalDeliveredQuantity;
            theTotalDeliveredQuantity = this.getTotalDeliveredQuantity();
            strategy.appendField(locator, this, "totalDeliveredQuantity", buffer, theTotalDeliveredQuantity, (this.totalDeliveredQuantity!= null));
        }
        {
            List<MeterReadingType> theMeterReading;
            theMeterReading = (((this.meterReading!= null)&&(!this.meterReading.isEmpty()))?this.getMeterReading():null);
            strategy.appendField(locator, this, "meterReading", buffer, theMeterReading, ((this.meterReading!= null)&&(!this.meterReading.isEmpty())));
        }
        {
            List<MeterPropertyType> theMeterProperty;
            theMeterProperty = (((this.meterProperty!= null)&&(!this.meterProperty.isEmpty()))?this.getMeterProperty():null);
            strategy.appendField(locator, this, "meterProperty", buffer, theMeterProperty, ((this.meterProperty!= null)&&(!this.meterProperty.isEmpty())));
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
        final MeterType that = ((MeterType) object);
        {
            MeterNumberType lhsMeterNumber;
            lhsMeterNumber = this.getMeterNumber();
            MeterNumberType rhsMeterNumber;
            rhsMeterNumber = that.getMeterNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meterNumber", lhsMeterNumber), LocatorUtils.property(thatLocator, "meterNumber", rhsMeterNumber), lhsMeterNumber, rhsMeterNumber, (this.meterNumber!= null), (that.meterNumber!= null))) {
                return false;
            }
        }
        {
            MeterNameType lhsMeterName;
            lhsMeterName = this.getMeterName();
            MeterNameType rhsMeterName;
            rhsMeterName = that.getMeterName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meterName", lhsMeterName), LocatorUtils.property(thatLocator, "meterName", rhsMeterName), lhsMeterName, rhsMeterName, (this.meterName!= null), (that.meterName!= null))) {
                return false;
            }
        }
        {
            MeterConstantType lhsMeterConstant;
            lhsMeterConstant = this.getMeterConstant();
            MeterConstantType rhsMeterConstant;
            rhsMeterConstant = that.getMeterConstant();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meterConstant", lhsMeterConstant), LocatorUtils.property(thatLocator, "meterConstant", rhsMeterConstant), lhsMeterConstant, rhsMeterConstant, (this.meterConstant!= null), (that.meterConstant!= null))) {
                return false;
            }
        }
        {
            MeterConstantCodeType lhsMeterConstantCode;
            lhsMeterConstantCode = this.getMeterConstantCode();
            MeterConstantCodeType rhsMeterConstantCode;
            rhsMeterConstantCode = that.getMeterConstantCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meterConstantCode", lhsMeterConstantCode), LocatorUtils.property(thatLocator, "meterConstantCode", rhsMeterConstantCode), lhsMeterConstantCode, rhsMeterConstantCode, (this.meterConstantCode!= null), (that.meterConstantCode!= null))) {
                return false;
            }
        }
        {
            TotalDeliveredQuantityType lhsTotalDeliveredQuantity;
            lhsTotalDeliveredQuantity = this.getTotalDeliveredQuantity();
            TotalDeliveredQuantityType rhsTotalDeliveredQuantity;
            rhsTotalDeliveredQuantity = that.getTotalDeliveredQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalDeliveredQuantity", lhsTotalDeliveredQuantity), LocatorUtils.property(thatLocator, "totalDeliveredQuantity", rhsTotalDeliveredQuantity), lhsTotalDeliveredQuantity, rhsTotalDeliveredQuantity, (this.totalDeliveredQuantity!= null), (that.totalDeliveredQuantity!= null))) {
                return false;
            }
        }
        {
            List<MeterReadingType> lhsMeterReading;
            lhsMeterReading = (((this.meterReading!= null)&&(!this.meterReading.isEmpty()))?this.getMeterReading():null);
            List<MeterReadingType> rhsMeterReading;
            rhsMeterReading = (((that.meterReading!= null)&&(!that.meterReading.isEmpty()))?that.getMeterReading():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meterReading", lhsMeterReading), LocatorUtils.property(thatLocator, "meterReading", rhsMeterReading), lhsMeterReading, rhsMeterReading, ((this.meterReading!= null)&&(!this.meterReading.isEmpty())), ((that.meterReading!= null)&&(!that.meterReading.isEmpty())))) {
                return false;
            }
        }
        {
            List<MeterPropertyType> lhsMeterProperty;
            lhsMeterProperty = (((this.meterProperty!= null)&&(!this.meterProperty.isEmpty()))?this.getMeterProperty():null);
            List<MeterPropertyType> rhsMeterProperty;
            rhsMeterProperty = (((that.meterProperty!= null)&&(!that.meterProperty.isEmpty()))?that.getMeterProperty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meterProperty", lhsMeterProperty), LocatorUtils.property(thatLocator, "meterProperty", rhsMeterProperty), lhsMeterProperty, rhsMeterProperty, ((this.meterProperty!= null)&&(!this.meterProperty.isEmpty())), ((that.meterProperty!= null)&&(!that.meterProperty.isEmpty())))) {
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
            MeterNumberType theMeterNumber;
            theMeterNumber = this.getMeterNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meterNumber", theMeterNumber), currentHashCode, theMeterNumber, (this.meterNumber!= null));
        }
        {
            MeterNameType theMeterName;
            theMeterName = this.getMeterName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meterName", theMeterName), currentHashCode, theMeterName, (this.meterName!= null));
        }
        {
            MeterConstantType theMeterConstant;
            theMeterConstant = this.getMeterConstant();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meterConstant", theMeterConstant), currentHashCode, theMeterConstant, (this.meterConstant!= null));
        }
        {
            MeterConstantCodeType theMeterConstantCode;
            theMeterConstantCode = this.getMeterConstantCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meterConstantCode", theMeterConstantCode), currentHashCode, theMeterConstantCode, (this.meterConstantCode!= null));
        }
        {
            TotalDeliveredQuantityType theTotalDeliveredQuantity;
            theTotalDeliveredQuantity = this.getTotalDeliveredQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalDeliveredQuantity", theTotalDeliveredQuantity), currentHashCode, theTotalDeliveredQuantity, (this.totalDeliveredQuantity!= null));
        }
        {
            List<MeterReadingType> theMeterReading;
            theMeterReading = (((this.meterReading!= null)&&(!this.meterReading.isEmpty()))?this.getMeterReading():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meterReading", theMeterReading), currentHashCode, theMeterReading, ((this.meterReading!= null)&&(!this.meterReading.isEmpty())));
        }
        {
            List<MeterPropertyType> theMeterProperty;
            theMeterProperty = (((this.meterProperty!= null)&&(!this.meterProperty.isEmpty()))?this.getMeterProperty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meterProperty", theMeterProperty), currentHashCode, theMeterProperty, ((this.meterProperty!= null)&&(!this.meterProperty.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
