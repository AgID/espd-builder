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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConsumerIncentiveTacticTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DisplayTacticTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FeatureTacticTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TradeItemPackingLabelingTypeCodeType;
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
 * <p>Classe Java per EventTacticEnumerationType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EventTacticEnumerationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumerIncentiveTacticTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DisplayTacticTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FeatureTacticTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TradeItemPackingLabelingTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventTacticEnumerationType", propOrder = {
    "consumerIncentiveTacticTypeCode",
    "displayTacticTypeCode",
    "featureTacticTypeCode",
    "tradeItemPackingLabelingTypeCode"
})
public class EventTacticEnumerationType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ConsumerIncentiveTacticTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ConsumerIncentiveTacticTypeCodeType consumerIncentiveTacticTypeCode;
    @XmlElement(name = "DisplayTacticTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DisplayTacticTypeCodeType displayTacticTypeCode;
    @XmlElement(name = "FeatureTacticTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FeatureTacticTypeCodeType featureTacticTypeCode;
    @XmlElement(name = "TradeItemPackingLabelingTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TradeItemPackingLabelingTypeCodeType tradeItemPackingLabelingTypeCode;

    /**
     * Recupera il valore della proprietà consumerIncentiveTacticTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerIncentiveTacticTypeCodeType }
     *     
     */
    public ConsumerIncentiveTacticTypeCodeType getConsumerIncentiveTacticTypeCode() {
        return consumerIncentiveTacticTypeCode;
    }

    /**
     * Imposta il valore della proprietà consumerIncentiveTacticTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerIncentiveTacticTypeCodeType }
     *     
     */
    public void setConsumerIncentiveTacticTypeCode(ConsumerIncentiveTacticTypeCodeType value) {
        this.consumerIncentiveTacticTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà displayTacticTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link DisplayTacticTypeCodeType }
     *     
     */
    public DisplayTacticTypeCodeType getDisplayTacticTypeCode() {
        return displayTacticTypeCode;
    }

    /**
     * Imposta il valore della proprietà displayTacticTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayTacticTypeCodeType }
     *     
     */
    public void setDisplayTacticTypeCode(DisplayTacticTypeCodeType value) {
        this.displayTacticTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà featureTacticTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link FeatureTacticTypeCodeType }
     *     
     */
    public FeatureTacticTypeCodeType getFeatureTacticTypeCode() {
        return featureTacticTypeCode;
    }

    /**
     * Imposta il valore della proprietà featureTacticTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureTacticTypeCodeType }
     *     
     */
    public void setFeatureTacticTypeCode(FeatureTacticTypeCodeType value) {
        this.featureTacticTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà tradeItemPackingLabelingTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemPackingLabelingTypeCodeType }
     *     
     */
    public TradeItemPackingLabelingTypeCodeType getTradeItemPackingLabelingTypeCode() {
        return tradeItemPackingLabelingTypeCode;
    }

    /**
     * Imposta il valore della proprietà tradeItemPackingLabelingTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemPackingLabelingTypeCodeType }
     *     
     */
    public void setTradeItemPackingLabelingTypeCode(TradeItemPackingLabelingTypeCodeType value) {
        this.tradeItemPackingLabelingTypeCode = value;
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
            ConsumerIncentiveTacticTypeCodeType theConsumerIncentiveTacticTypeCode;
            theConsumerIncentiveTacticTypeCode = this.getConsumerIncentiveTacticTypeCode();
            strategy.appendField(locator, this, "consumerIncentiveTacticTypeCode", buffer, theConsumerIncentiveTacticTypeCode, (this.consumerIncentiveTacticTypeCode!= null));
        }
        {
            DisplayTacticTypeCodeType theDisplayTacticTypeCode;
            theDisplayTacticTypeCode = this.getDisplayTacticTypeCode();
            strategy.appendField(locator, this, "displayTacticTypeCode", buffer, theDisplayTacticTypeCode, (this.displayTacticTypeCode!= null));
        }
        {
            FeatureTacticTypeCodeType theFeatureTacticTypeCode;
            theFeatureTacticTypeCode = this.getFeatureTacticTypeCode();
            strategy.appendField(locator, this, "featureTacticTypeCode", buffer, theFeatureTacticTypeCode, (this.featureTacticTypeCode!= null));
        }
        {
            TradeItemPackingLabelingTypeCodeType theTradeItemPackingLabelingTypeCode;
            theTradeItemPackingLabelingTypeCode = this.getTradeItemPackingLabelingTypeCode();
            strategy.appendField(locator, this, "tradeItemPackingLabelingTypeCode", buffer, theTradeItemPackingLabelingTypeCode, (this.tradeItemPackingLabelingTypeCode!= null));
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
        final EventTacticEnumerationType that = ((EventTacticEnumerationType) object);
        {
            ConsumerIncentiveTacticTypeCodeType lhsConsumerIncentiveTacticTypeCode;
            lhsConsumerIncentiveTacticTypeCode = this.getConsumerIncentiveTacticTypeCode();
            ConsumerIncentiveTacticTypeCodeType rhsConsumerIncentiveTacticTypeCode;
            rhsConsumerIncentiveTacticTypeCode = that.getConsumerIncentiveTacticTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consumerIncentiveTacticTypeCode", lhsConsumerIncentiveTacticTypeCode), LocatorUtils.property(thatLocator, "consumerIncentiveTacticTypeCode", rhsConsumerIncentiveTacticTypeCode), lhsConsumerIncentiveTacticTypeCode, rhsConsumerIncentiveTacticTypeCode, (this.consumerIncentiveTacticTypeCode!= null), (that.consumerIncentiveTacticTypeCode!= null))) {
                return false;
            }
        }
        {
            DisplayTacticTypeCodeType lhsDisplayTacticTypeCode;
            lhsDisplayTacticTypeCode = this.getDisplayTacticTypeCode();
            DisplayTacticTypeCodeType rhsDisplayTacticTypeCode;
            rhsDisplayTacticTypeCode = that.getDisplayTacticTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "displayTacticTypeCode", lhsDisplayTacticTypeCode), LocatorUtils.property(thatLocator, "displayTacticTypeCode", rhsDisplayTacticTypeCode), lhsDisplayTacticTypeCode, rhsDisplayTacticTypeCode, (this.displayTacticTypeCode!= null), (that.displayTacticTypeCode!= null))) {
                return false;
            }
        }
        {
            FeatureTacticTypeCodeType lhsFeatureTacticTypeCode;
            lhsFeatureTacticTypeCode = this.getFeatureTacticTypeCode();
            FeatureTacticTypeCodeType rhsFeatureTacticTypeCode;
            rhsFeatureTacticTypeCode = that.getFeatureTacticTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "featureTacticTypeCode", lhsFeatureTacticTypeCode), LocatorUtils.property(thatLocator, "featureTacticTypeCode", rhsFeatureTacticTypeCode), lhsFeatureTacticTypeCode, rhsFeatureTacticTypeCode, (this.featureTacticTypeCode!= null), (that.featureTacticTypeCode!= null))) {
                return false;
            }
        }
        {
            TradeItemPackingLabelingTypeCodeType lhsTradeItemPackingLabelingTypeCode;
            lhsTradeItemPackingLabelingTypeCode = this.getTradeItemPackingLabelingTypeCode();
            TradeItemPackingLabelingTypeCodeType rhsTradeItemPackingLabelingTypeCode;
            rhsTradeItemPackingLabelingTypeCode = that.getTradeItemPackingLabelingTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tradeItemPackingLabelingTypeCode", lhsTradeItemPackingLabelingTypeCode), LocatorUtils.property(thatLocator, "tradeItemPackingLabelingTypeCode", rhsTradeItemPackingLabelingTypeCode), lhsTradeItemPackingLabelingTypeCode, rhsTradeItemPackingLabelingTypeCode, (this.tradeItemPackingLabelingTypeCode!= null), (that.tradeItemPackingLabelingTypeCode!= null))) {
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
            ConsumerIncentiveTacticTypeCodeType theConsumerIncentiveTacticTypeCode;
            theConsumerIncentiveTacticTypeCode = this.getConsumerIncentiveTacticTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consumerIncentiveTacticTypeCode", theConsumerIncentiveTacticTypeCode), currentHashCode, theConsumerIncentiveTacticTypeCode, (this.consumerIncentiveTacticTypeCode!= null));
        }
        {
            DisplayTacticTypeCodeType theDisplayTacticTypeCode;
            theDisplayTacticTypeCode = this.getDisplayTacticTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "displayTacticTypeCode", theDisplayTacticTypeCode), currentHashCode, theDisplayTacticTypeCode, (this.displayTacticTypeCode!= null));
        }
        {
            FeatureTacticTypeCodeType theFeatureTacticTypeCode;
            theFeatureTacticTypeCode = this.getFeatureTacticTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "featureTacticTypeCode", theFeatureTacticTypeCode), currentHashCode, theFeatureTacticTypeCode, (this.featureTacticTypeCode!= null));
        }
        {
            TradeItemPackingLabelingTypeCodeType theTradeItemPackingLabelingTypeCode;
            theTradeItemPackingLabelingTypeCode = this.getTradeItemPackingLabelingTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tradeItemPackingLabelingTypeCode", theTradeItemPackingLabelingTypeCode), currentHashCode, theTradeItemPackingLabelingTypeCode, (this.tradeItemPackingLabelingTypeCode!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
