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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BestBeforeDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ManufactureDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ManufactureTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProductTraceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SerialIDType;
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
 * <p>Classe Java per ItemInstanceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ItemInstanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProductTraceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ManufactureDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ManufactureTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BestBeforeDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SerialID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalItemProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LotIdentification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemInstanceType", propOrder = {
    "productTraceID",
    "manufactureDate",
    "manufactureTime",
    "bestBeforeDate",
    "registrationID",
    "serialID",
    "additionalItemProperty",
    "lotIdentification"
})
public class ItemInstanceType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ProductTraceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProductTraceIDType productTraceID;
    @XmlElement(name = "ManufactureDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ManufactureDateType manufactureDate;
    @XmlElement(name = "ManufactureTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ManufactureTimeType manufactureTime;
    @XmlElement(name = "BestBeforeDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BestBeforeDateType bestBeforeDate;
    @XmlElement(name = "RegistrationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegistrationIDType registrationID;
    @XmlElement(name = "SerialID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SerialIDType serialID;
    @XmlElement(name = "AdditionalItemProperty")
    protected List<ItemPropertyType> additionalItemProperty;
    @XmlElement(name = "LotIdentification")
    protected LotIdentificationType lotIdentification;

    /**
     * Recupera il valore della proprietà productTraceID.
     * 
     * @return
     *     possible object is
     *     {@link ProductTraceIDType }
     *     
     */
    public ProductTraceIDType getProductTraceID() {
        return productTraceID;
    }

    /**
     * Imposta il valore della proprietà productTraceID.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTraceIDType }
     *     
     */
    public void setProductTraceID(ProductTraceIDType value) {
        this.productTraceID = value;
    }

    /**
     * Recupera il valore della proprietà manufactureDate.
     * 
     * @return
     *     possible object is
     *     {@link ManufactureDateType }
     *     
     */
    public ManufactureDateType getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Imposta il valore della proprietà manufactureDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufactureDateType }
     *     
     */
    public void setManufactureDate(ManufactureDateType value) {
        this.manufactureDate = value;
    }

    /**
     * Recupera il valore della proprietà manufactureTime.
     * 
     * @return
     *     possible object is
     *     {@link ManufactureTimeType }
     *     
     */
    public ManufactureTimeType getManufactureTime() {
        return manufactureTime;
    }

    /**
     * Imposta il valore della proprietà manufactureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufactureTimeType }
     *     
     */
    public void setManufactureTime(ManufactureTimeType value) {
        this.manufactureTime = value;
    }

    /**
     * Recupera il valore della proprietà bestBeforeDate.
     * 
     * @return
     *     possible object is
     *     {@link BestBeforeDateType }
     *     
     */
    public BestBeforeDateType getBestBeforeDate() {
        return bestBeforeDate;
    }

    /**
     * Imposta il valore della proprietà bestBeforeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link BestBeforeDateType }
     *     
     */
    public void setBestBeforeDate(BestBeforeDateType value) {
        this.bestBeforeDate = value;
    }

    /**
     * Recupera il valore della proprietà registrationID.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationIDType }
     *     
     */
    public RegistrationIDType getRegistrationID() {
        return registrationID;
    }

    /**
     * Imposta il valore della proprietà registrationID.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationIDType }
     *     
     */
    public void setRegistrationID(RegistrationIDType value) {
        this.registrationID = value;
    }

    /**
     * Recupera il valore della proprietà serialID.
     * 
     * @return
     *     possible object is
     *     {@link SerialIDType }
     *     
     */
    public SerialIDType getSerialID() {
        return serialID;
    }

    /**
     * Imposta il valore della proprietà serialID.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialIDType }
     *     
     */
    public void setSerialID(SerialIDType value) {
        this.serialID = value;
    }

    /**
     * Gets the value of the additionalItemProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalItemProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalItemProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPropertyType }
     * 
     * 
     */
    public List<ItemPropertyType> getAdditionalItemProperty() {
        if (additionalItemProperty == null) {
            additionalItemProperty = new ArrayList<ItemPropertyType>();
        }
        return this.additionalItemProperty;
    }

    /**
     * Recupera il valore della proprietà lotIdentification.
     * 
     * @return
     *     possible object is
     *     {@link LotIdentificationType }
     *     
     */
    public LotIdentificationType getLotIdentification() {
        return lotIdentification;
    }

    /**
     * Imposta il valore della proprietà lotIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link LotIdentificationType }
     *     
     */
    public void setLotIdentification(LotIdentificationType value) {
        this.lotIdentification = value;
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
            ProductTraceIDType theProductTraceID;
            theProductTraceID = this.getProductTraceID();
            strategy.appendField(locator, this, "productTraceID", buffer, theProductTraceID, (this.productTraceID!= null));
        }
        {
            ManufactureDateType theManufactureDate;
            theManufactureDate = this.getManufactureDate();
            strategy.appendField(locator, this, "manufactureDate", buffer, theManufactureDate, (this.manufactureDate!= null));
        }
        {
            ManufactureTimeType theManufactureTime;
            theManufactureTime = this.getManufactureTime();
            strategy.appendField(locator, this, "manufactureTime", buffer, theManufactureTime, (this.manufactureTime!= null));
        }
        {
            BestBeforeDateType theBestBeforeDate;
            theBestBeforeDate = this.getBestBeforeDate();
            strategy.appendField(locator, this, "bestBeforeDate", buffer, theBestBeforeDate, (this.bestBeforeDate!= null));
        }
        {
            RegistrationIDType theRegistrationID;
            theRegistrationID = this.getRegistrationID();
            strategy.appendField(locator, this, "registrationID", buffer, theRegistrationID, (this.registrationID!= null));
        }
        {
            SerialIDType theSerialID;
            theSerialID = this.getSerialID();
            strategy.appendField(locator, this, "serialID", buffer, theSerialID, (this.serialID!= null));
        }
        {
            List<ItemPropertyType> theAdditionalItemProperty;
            theAdditionalItemProperty = (((this.additionalItemProperty!= null)&&(!this.additionalItemProperty.isEmpty()))?this.getAdditionalItemProperty():null);
            strategy.appendField(locator, this, "additionalItemProperty", buffer, theAdditionalItemProperty, ((this.additionalItemProperty!= null)&&(!this.additionalItemProperty.isEmpty())));
        }
        {
            LotIdentificationType theLotIdentification;
            theLotIdentification = this.getLotIdentification();
            strategy.appendField(locator, this, "lotIdentification", buffer, theLotIdentification, (this.lotIdentification!= null));
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
        final ItemInstanceType that = ((ItemInstanceType) object);
        {
            ProductTraceIDType lhsProductTraceID;
            lhsProductTraceID = this.getProductTraceID();
            ProductTraceIDType rhsProductTraceID;
            rhsProductTraceID = that.getProductTraceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productTraceID", lhsProductTraceID), LocatorUtils.property(thatLocator, "productTraceID", rhsProductTraceID), lhsProductTraceID, rhsProductTraceID, (this.productTraceID!= null), (that.productTraceID!= null))) {
                return false;
            }
        }
        {
            ManufactureDateType lhsManufactureDate;
            lhsManufactureDate = this.getManufactureDate();
            ManufactureDateType rhsManufactureDate;
            rhsManufactureDate = that.getManufactureDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufactureDate", lhsManufactureDate), LocatorUtils.property(thatLocator, "manufactureDate", rhsManufactureDate), lhsManufactureDate, rhsManufactureDate, (this.manufactureDate!= null), (that.manufactureDate!= null))) {
                return false;
            }
        }
        {
            ManufactureTimeType lhsManufactureTime;
            lhsManufactureTime = this.getManufactureTime();
            ManufactureTimeType rhsManufactureTime;
            rhsManufactureTime = that.getManufactureTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufactureTime", lhsManufactureTime), LocatorUtils.property(thatLocator, "manufactureTime", rhsManufactureTime), lhsManufactureTime, rhsManufactureTime, (this.manufactureTime!= null), (that.manufactureTime!= null))) {
                return false;
            }
        }
        {
            BestBeforeDateType lhsBestBeforeDate;
            lhsBestBeforeDate = this.getBestBeforeDate();
            BestBeforeDateType rhsBestBeforeDate;
            rhsBestBeforeDate = that.getBestBeforeDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bestBeforeDate", lhsBestBeforeDate), LocatorUtils.property(thatLocator, "bestBeforeDate", rhsBestBeforeDate), lhsBestBeforeDate, rhsBestBeforeDate, (this.bestBeforeDate!= null), (that.bestBeforeDate!= null))) {
                return false;
            }
        }
        {
            RegistrationIDType lhsRegistrationID;
            lhsRegistrationID = this.getRegistrationID();
            RegistrationIDType rhsRegistrationID;
            rhsRegistrationID = that.getRegistrationID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationID", lhsRegistrationID), LocatorUtils.property(thatLocator, "registrationID", rhsRegistrationID), lhsRegistrationID, rhsRegistrationID, (this.registrationID!= null), (that.registrationID!= null))) {
                return false;
            }
        }
        {
            SerialIDType lhsSerialID;
            lhsSerialID = this.getSerialID();
            SerialIDType rhsSerialID;
            rhsSerialID = that.getSerialID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serialID", lhsSerialID), LocatorUtils.property(thatLocator, "serialID", rhsSerialID), lhsSerialID, rhsSerialID, (this.serialID!= null), (that.serialID!= null))) {
                return false;
            }
        }
        {
            List<ItemPropertyType> lhsAdditionalItemProperty;
            lhsAdditionalItemProperty = (((this.additionalItemProperty!= null)&&(!this.additionalItemProperty.isEmpty()))?this.getAdditionalItemProperty():null);
            List<ItemPropertyType> rhsAdditionalItemProperty;
            rhsAdditionalItemProperty = (((that.additionalItemProperty!= null)&&(!that.additionalItemProperty.isEmpty()))?that.getAdditionalItemProperty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalItemProperty", lhsAdditionalItemProperty), LocatorUtils.property(thatLocator, "additionalItemProperty", rhsAdditionalItemProperty), lhsAdditionalItemProperty, rhsAdditionalItemProperty, ((this.additionalItemProperty!= null)&&(!this.additionalItemProperty.isEmpty())), ((that.additionalItemProperty!= null)&&(!that.additionalItemProperty.isEmpty())))) {
                return false;
            }
        }
        {
            LotIdentificationType lhsLotIdentification;
            lhsLotIdentification = this.getLotIdentification();
            LotIdentificationType rhsLotIdentification;
            rhsLotIdentification = that.getLotIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotIdentification", lhsLotIdentification), LocatorUtils.property(thatLocator, "lotIdentification", rhsLotIdentification), lhsLotIdentification, rhsLotIdentification, (this.lotIdentification!= null), (that.lotIdentification!= null))) {
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
            ProductTraceIDType theProductTraceID;
            theProductTraceID = this.getProductTraceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productTraceID", theProductTraceID), currentHashCode, theProductTraceID, (this.productTraceID!= null));
        }
        {
            ManufactureDateType theManufactureDate;
            theManufactureDate = this.getManufactureDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufactureDate", theManufactureDate), currentHashCode, theManufactureDate, (this.manufactureDate!= null));
        }
        {
            ManufactureTimeType theManufactureTime;
            theManufactureTime = this.getManufactureTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufactureTime", theManufactureTime), currentHashCode, theManufactureTime, (this.manufactureTime!= null));
        }
        {
            BestBeforeDateType theBestBeforeDate;
            theBestBeforeDate = this.getBestBeforeDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bestBeforeDate", theBestBeforeDate), currentHashCode, theBestBeforeDate, (this.bestBeforeDate!= null));
        }
        {
            RegistrationIDType theRegistrationID;
            theRegistrationID = this.getRegistrationID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationID", theRegistrationID), currentHashCode, theRegistrationID, (this.registrationID!= null));
        }
        {
            SerialIDType theSerialID;
            theSerialID = this.getSerialID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serialID", theSerialID), currentHashCode, theSerialID, (this.serialID!= null));
        }
        {
            List<ItemPropertyType> theAdditionalItemProperty;
            theAdditionalItemProperty = (((this.additionalItemProperty!= null)&&(!this.additionalItemProperty.isEmpty()))?this.getAdditionalItemProperty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalItemProperty", theAdditionalItemProperty), currentHashCode, theAdditionalItemProperty, ((this.additionalItemProperty!= null)&&(!this.additionalItemProperty.isEmpty())));
        }
        {
            LotIdentificationType theLotIdentification;
            theLotIdentification = this.getLotIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotIdentification", theLotIdentification), currentHashCode, theLotIdentification, (this.lotIdentification!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
