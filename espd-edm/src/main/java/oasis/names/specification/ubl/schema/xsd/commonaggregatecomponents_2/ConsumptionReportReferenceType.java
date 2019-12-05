//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsumptionReportIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsumptionTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsumptionTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TotalConsumedQuantityType;
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
 * <p>Classe Java per ConsumptionReportReferenceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionReportReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionReportID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalConsumedQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionReportReferenceType", propOrder = {
    "consumptionReportID",
    "consumptionType",
    "consumptionTypeCode",
    "totalConsumedQuantity",
    "period"
})
public class ConsumptionReportReferenceType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ConsumptionReportID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ConsumptionReportIDType consumptionReportID;
    @XmlElement(name = "ConsumptionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionTypeType consumptionType;
    @XmlElement(name = "ConsumptionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumptionTypeCodeType consumptionTypeCode;
    @XmlElement(name = "TotalConsumedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TotalConsumedQuantityType totalConsumedQuantity;
    @XmlElement(name = "Period", required = true)
    protected PeriodType period;

    /**
     * Recupera il valore della proprietà consumptionReportID.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionReportIDType }
     *     
     */
    public ConsumptionReportIDType getConsumptionReportID() {
        return consumptionReportID;
    }

    /**
     * Imposta il valore della proprietà consumptionReportID.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionReportIDType }
     *     
     */
    public void setConsumptionReportID(ConsumptionReportIDType value) {
        this.consumptionReportID = value;
    }

    /**
     * Recupera il valore della proprietà consumptionType.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionTypeType }
     *     
     */
    public ConsumptionTypeType getConsumptionType() {
        return consumptionType;
    }

    /**
     * Imposta il valore della proprietà consumptionType.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionTypeType }
     *     
     */
    public void setConsumptionType(ConsumptionTypeType value) {
        this.consumptionType = value;
    }

    /**
     * Recupera il valore della proprietà consumptionTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionTypeCodeType }
     *     
     */
    public ConsumptionTypeCodeType getConsumptionTypeCode() {
        return consumptionTypeCode;
    }

    /**
     * Imposta il valore della proprietà consumptionTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionTypeCodeType }
     *     
     */
    public void setConsumptionTypeCode(ConsumptionTypeCodeType value) {
        this.consumptionTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà totalConsumedQuantity.
     * 
     * @return
     *     possible object is
     *     {@link TotalConsumedQuantityType }
     *     
     */
    public TotalConsumedQuantityType getTotalConsumedQuantity() {
        return totalConsumedQuantity;
    }

    /**
     * Imposta il valore della proprietà totalConsumedQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalConsumedQuantityType }
     *     
     */
    public void setTotalConsumedQuantity(TotalConsumedQuantityType value) {
        this.totalConsumedQuantity = value;
    }

    /**
     * Recupera il valore della proprietà period.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPeriod() {
        return period;
    }

    /**
     * Imposta il valore della proprietà period.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPeriod(PeriodType value) {
        this.period = value;
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
            ConsumptionReportIDType theConsumptionReportID;
            theConsumptionReportID = this.getConsumptionReportID();
            strategy.appendField(locator, this, "consumptionReportID", buffer, theConsumptionReportID, (this.consumptionReportID!= null));
        }
        {
            ConsumptionTypeType theConsumptionType;
            theConsumptionType = this.getConsumptionType();
            strategy.appendField(locator, this, "consumptionType", buffer, theConsumptionType, (this.consumptionType!= null));
        }
        {
            ConsumptionTypeCodeType theConsumptionTypeCode;
            theConsumptionTypeCode = this.getConsumptionTypeCode();
            strategy.appendField(locator, this, "consumptionTypeCode", buffer, theConsumptionTypeCode, (this.consumptionTypeCode!= null));
        }
        {
            TotalConsumedQuantityType theTotalConsumedQuantity;
            theTotalConsumedQuantity = this.getTotalConsumedQuantity();
            strategy.appendField(locator, this, "totalConsumedQuantity", buffer, theTotalConsumedQuantity, (this.totalConsumedQuantity!= null));
        }
        {
            PeriodType thePeriod;
            thePeriod = this.getPeriod();
            strategy.appendField(locator, this, "period", buffer, thePeriod, (this.period!= null));
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
        final ConsumptionReportReferenceType that = ((ConsumptionReportReferenceType) object);
        {
            ConsumptionReportIDType lhsConsumptionReportID;
            lhsConsumptionReportID = this.getConsumptionReportID();
            ConsumptionReportIDType rhsConsumptionReportID;
            rhsConsumptionReportID = that.getConsumptionReportID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionReportID", lhsConsumptionReportID), LocatorUtils.property(thatLocator, "consumptionReportID", rhsConsumptionReportID), lhsConsumptionReportID, rhsConsumptionReportID, (this.consumptionReportID!= null), (that.consumptionReportID!= null))) {
                return false;
            }
        }
        {
            ConsumptionTypeType lhsConsumptionType;
            lhsConsumptionType = this.getConsumptionType();
            ConsumptionTypeType rhsConsumptionType;
            rhsConsumptionType = that.getConsumptionType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionType", lhsConsumptionType), LocatorUtils.property(thatLocator, "consumptionType", rhsConsumptionType), lhsConsumptionType, rhsConsumptionType, (this.consumptionType!= null), (that.consumptionType!= null))) {
                return false;
            }
        }
        {
            ConsumptionTypeCodeType lhsConsumptionTypeCode;
            lhsConsumptionTypeCode = this.getConsumptionTypeCode();
            ConsumptionTypeCodeType rhsConsumptionTypeCode;
            rhsConsumptionTypeCode = that.getConsumptionTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumptionTypeCode", lhsConsumptionTypeCode), LocatorUtils.property(thatLocator, "consumptionTypeCode", rhsConsumptionTypeCode), lhsConsumptionTypeCode, rhsConsumptionTypeCode, (this.consumptionTypeCode!= null), (that.consumptionTypeCode!= null))) {
                return false;
            }
        }
        {
            TotalConsumedQuantityType lhsTotalConsumedQuantity;
            lhsTotalConsumedQuantity = this.getTotalConsumedQuantity();
            TotalConsumedQuantityType rhsTotalConsumedQuantity;
            rhsTotalConsumedQuantity = that.getTotalConsumedQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalConsumedQuantity", lhsTotalConsumedQuantity), LocatorUtils.property(thatLocator, "totalConsumedQuantity", rhsTotalConsumedQuantity), lhsTotalConsumedQuantity, rhsTotalConsumedQuantity, (this.totalConsumedQuantity!= null), (that.totalConsumedQuantity!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsPeriod;
            lhsPeriod = this.getPeriod();
            PeriodType rhsPeriod;
            rhsPeriod = that.getPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "period", lhsPeriod), LocatorUtils.property(thatLocator, "period", rhsPeriod), lhsPeriod, rhsPeriod, (this.period!= null), (that.period!= null))) {
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
            ConsumptionReportIDType theConsumptionReportID;
            theConsumptionReportID = this.getConsumptionReportID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionReportID", theConsumptionReportID), currentHashCode, theConsumptionReportID, (this.consumptionReportID!= null));
        }
        {
            ConsumptionTypeType theConsumptionType;
            theConsumptionType = this.getConsumptionType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionType", theConsumptionType), currentHashCode, theConsumptionType, (this.consumptionType!= null));
        }
        {
            ConsumptionTypeCodeType theConsumptionTypeCode;
            theConsumptionTypeCode = this.getConsumptionTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumptionTypeCode", theConsumptionTypeCode), currentHashCode, theConsumptionTypeCode, (this.consumptionTypeCode!= null));
        }
        {
            TotalConsumedQuantityType theTotalConsumedQuantity;
            theTotalConsumedQuantity = this.getTotalConsumedQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalConsumedQuantity", theTotalConsumedQuantity), currentHashCode, theTotalConsumedQuantity, (this.totalConsumedQuantity!= null));
        }
        {
            PeriodType thePeriod;
            thePeriod = this.getPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "period", thePeriod), currentHashCode, thePeriod, (this.period!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
