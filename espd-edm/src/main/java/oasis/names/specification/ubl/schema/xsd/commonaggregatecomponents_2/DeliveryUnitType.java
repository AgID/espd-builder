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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BatchQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsumerUnitQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HazardousRiskIndicatorType;
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
 * <p>Classe Java per DeliveryUnitType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeliveryUnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BatchQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumerUnitQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRiskIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryUnitType", propOrder = {
    "batchQuantity",
    "consumerUnitQuantity",
    "hazardousRiskIndicator"
})
public class DeliveryUnitType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "BatchQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected BatchQuantityType batchQuantity;
    @XmlElement(name = "ConsumerUnitQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumerUnitQuantityType consumerUnitQuantity;
    @XmlElement(name = "HazardousRiskIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardousRiskIndicatorType hazardousRiskIndicator;

    /**
     * Recupera il valore della proprietà batchQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BatchQuantityType }
     *     
     */
    public BatchQuantityType getBatchQuantity() {
        return batchQuantity;
    }

    /**
     * Imposta il valore della proprietà batchQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchQuantityType }
     *     
     */
    public void setBatchQuantity(BatchQuantityType value) {
        this.batchQuantity = value;
    }

    /**
     * Recupera il valore della proprietà consumerUnitQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerUnitQuantityType }
     *     
     */
    public ConsumerUnitQuantityType getConsumerUnitQuantity() {
        return consumerUnitQuantity;
    }

    /**
     * Imposta il valore della proprietà consumerUnitQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerUnitQuantityType }
     *     
     */
    public void setConsumerUnitQuantity(ConsumerUnitQuantityType value) {
        this.consumerUnitQuantity = value;
    }

    /**
     * Recupera il valore della proprietà hazardousRiskIndicator.
     * 
     * @return
     *     possible object is
     *     {@link HazardousRiskIndicatorType }
     *     
     */
    public HazardousRiskIndicatorType getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Imposta il valore della proprietà hazardousRiskIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousRiskIndicatorType }
     *     
     */
    public void setHazardousRiskIndicator(HazardousRiskIndicatorType value) {
        this.hazardousRiskIndicator = value;
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
            BatchQuantityType theBatchQuantity;
            theBatchQuantity = this.getBatchQuantity();
            strategy.appendField(locator, this, "batchQuantity", buffer, theBatchQuantity, (this.batchQuantity!= null));
        }
        {
            ConsumerUnitQuantityType theConsumerUnitQuantity;
            theConsumerUnitQuantity = this.getConsumerUnitQuantity();
            strategy.appendField(locator, this, "consumerUnitQuantity", buffer, theConsumerUnitQuantity, (this.consumerUnitQuantity!= null));
        }
        {
            HazardousRiskIndicatorType theHazardousRiskIndicator;
            theHazardousRiskIndicator = this.getHazardousRiskIndicator();
            strategy.appendField(locator, this, "hazardousRiskIndicator", buffer, theHazardousRiskIndicator, (this.hazardousRiskIndicator!= null));
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
        final DeliveryUnitType that = ((DeliveryUnitType) object);
        {
            BatchQuantityType lhsBatchQuantity;
            lhsBatchQuantity = this.getBatchQuantity();
            BatchQuantityType rhsBatchQuantity;
            rhsBatchQuantity = that.getBatchQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "batchQuantity", lhsBatchQuantity), LocatorUtils.property(thatLocator, "batchQuantity", rhsBatchQuantity), lhsBatchQuantity, rhsBatchQuantity, (this.batchQuantity!= null), (that.batchQuantity!= null))) {
                return false;
            }
        }
        {
            ConsumerUnitQuantityType lhsConsumerUnitQuantity;
            lhsConsumerUnitQuantity = this.getConsumerUnitQuantity();
            ConsumerUnitQuantityType rhsConsumerUnitQuantity;
            rhsConsumerUnitQuantity = that.getConsumerUnitQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerUnitQuantity", lhsConsumerUnitQuantity), LocatorUtils.property(thatLocator, "consumerUnitQuantity", rhsConsumerUnitQuantity), lhsConsumerUnitQuantity, rhsConsumerUnitQuantity, (this.consumerUnitQuantity!= null), (that.consumerUnitQuantity!= null))) {
                return false;
            }
        }
        {
            HazardousRiskIndicatorType lhsHazardousRiskIndicator;
            lhsHazardousRiskIndicator = this.getHazardousRiskIndicator();
            HazardousRiskIndicatorType rhsHazardousRiskIndicator;
            rhsHazardousRiskIndicator = that.getHazardousRiskIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hazardousRiskIndicator", lhsHazardousRiskIndicator), LocatorUtils.property(thatLocator, "hazardousRiskIndicator", rhsHazardousRiskIndicator), lhsHazardousRiskIndicator, rhsHazardousRiskIndicator, (this.hazardousRiskIndicator!= null), (that.hazardousRiskIndicator!= null))) {
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
            BatchQuantityType theBatchQuantity;
            theBatchQuantity = this.getBatchQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "batchQuantity", theBatchQuantity), currentHashCode, theBatchQuantity, (this.batchQuantity!= null));
        }
        {
            ConsumerUnitQuantityType theConsumerUnitQuantity;
            theConsumerUnitQuantity = this.getConsumerUnitQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerUnitQuantity", theConsumerUnitQuantity), currentHashCode, theConsumerUnitQuantity, (this.consumerUnitQuantity!= null));
        }
        {
            HazardousRiskIndicatorType theHazardousRiskIndicator;
            theHazardousRiskIndicator = this.getHazardousRiskIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hazardousRiskIndicator", theHazardousRiskIndicator), currentHashCode, theHazardousRiskIndicator, (this.hazardousRiskIndicator!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
