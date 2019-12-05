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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PriceAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TimeAmountType;
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
 * <p>Classe Java per UnstructuredPriceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UnstructuredPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimeAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnstructuredPriceType", propOrder = {
    "priceAmount",
    "timeAmount"
})
public class UnstructuredPriceType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "PriceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PriceAmountType priceAmount;
    @XmlElement(name = "TimeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TimeAmountType timeAmount;

    /**
     * Recupera il valore della proprietà priceAmount.
     * 
     * @return
     *     possible object is
     *     {@link PriceAmountType }
     *     
     */
    public PriceAmountType getPriceAmount() {
        return priceAmount;
    }

    /**
     * Imposta il valore della proprietà priceAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAmountType }
     *     
     */
    public void setPriceAmount(PriceAmountType value) {
        this.priceAmount = value;
    }

    /**
     * Recupera il valore della proprietà timeAmount.
     * 
     * @return
     *     possible object is
     *     {@link TimeAmountType }
     *     
     */
    public TimeAmountType getTimeAmount() {
        return timeAmount;
    }

    /**
     * Imposta il valore della proprietà timeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeAmountType }
     *     
     */
    public void setTimeAmount(TimeAmountType value) {
        this.timeAmount = value;
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
            PriceAmountType thePriceAmount;
            thePriceAmount = this.getPriceAmount();
            strategy.appendField(locator, this, "priceAmount", buffer, thePriceAmount, (this.priceAmount!= null));
        }
        {
            TimeAmountType theTimeAmount;
            theTimeAmount = this.getTimeAmount();
            strategy.appendField(locator, this, "timeAmount", buffer, theTimeAmount, (this.timeAmount!= null));
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
        final UnstructuredPriceType that = ((UnstructuredPriceType) object);
        {
            PriceAmountType lhsPriceAmount;
            lhsPriceAmount = this.getPriceAmount();
            PriceAmountType rhsPriceAmount;
            rhsPriceAmount = that.getPriceAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceAmount", lhsPriceAmount), LocatorUtils.property(thatLocator, "priceAmount", rhsPriceAmount), lhsPriceAmount, rhsPriceAmount, (this.priceAmount!= null), (that.priceAmount!= null))) {
                return false;
            }
        }
        {
            TimeAmountType lhsTimeAmount;
            lhsTimeAmount = this.getTimeAmount();
            TimeAmountType rhsTimeAmount;
            rhsTimeAmount = that.getTimeAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeAmount", lhsTimeAmount), LocatorUtils.property(thatLocator, "timeAmount", rhsTimeAmount), lhsTimeAmount, rhsTimeAmount, (this.timeAmount!= null), (that.timeAmount!= null))) {
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
            PriceAmountType thePriceAmount;
            thePriceAmount = this.getPriceAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceAmount", thePriceAmount), currentHashCode, thePriceAmount, (this.priceAmount!= null));
        }
        {
            TimeAmountType theTimeAmount;
            theTimeAmount = this.getTimeAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeAmount", theTimeAmount), currentHashCode, theTimeAmount, (this.timeAmount!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
