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
 * <p>Classe Java per PricingReferenceType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PricingReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginalItemLocationQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AlternativeConditionPrice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingReferenceType", propOrder = {
    "originalItemLocationQuantity",
    "alternativeConditionPrice"
})
public class PricingReferenceType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "OriginalItemLocationQuantity")
    protected ItemLocationQuantityType originalItemLocationQuantity;
    @XmlElement(name = "AlternativeConditionPrice")
    protected List<PriceType> alternativeConditionPrice;

    /**
     * Recupera il valore della proprietà originalItemLocationQuantity.
     * 
     * @return
     *     possible object is
     *     {@link ItemLocationQuantityType }
     *     
     */
    public ItemLocationQuantityType getOriginalItemLocationQuantity() {
        return originalItemLocationQuantity;
    }

    /**
     * Imposta il valore della proprietà originalItemLocationQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLocationQuantityType }
     *     
     */
    public void setOriginalItemLocationQuantity(ItemLocationQuantityType value) {
        this.originalItemLocationQuantity = value;
    }

    /**
     * Gets the value of the alternativeConditionPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeConditionPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeConditionPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceType }
     * 
     * 
     */
    public List<PriceType> getAlternativeConditionPrice() {
        if (alternativeConditionPrice == null) {
            alternativeConditionPrice = new ArrayList<PriceType>();
        }
        return this.alternativeConditionPrice;
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
            ItemLocationQuantityType theOriginalItemLocationQuantity;
            theOriginalItemLocationQuantity = this.getOriginalItemLocationQuantity();
            strategy.appendField(locator, this, "originalItemLocationQuantity", buffer, theOriginalItemLocationQuantity, (this.originalItemLocationQuantity!= null));
        }
        {
            List<PriceType> theAlternativeConditionPrice;
            theAlternativeConditionPrice = (((this.alternativeConditionPrice!= null)&&(!this.alternativeConditionPrice.isEmpty()))?this.getAlternativeConditionPrice():null);
            strategy.appendField(locator, this, "alternativeConditionPrice", buffer, theAlternativeConditionPrice, ((this.alternativeConditionPrice!= null)&&(!this.alternativeConditionPrice.isEmpty())));
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
        final PricingReferenceType that = ((PricingReferenceType) object);
        {
            ItemLocationQuantityType lhsOriginalItemLocationQuantity;
            lhsOriginalItemLocationQuantity = this.getOriginalItemLocationQuantity();
            ItemLocationQuantityType rhsOriginalItemLocationQuantity;
            rhsOriginalItemLocationQuantity = that.getOriginalItemLocationQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalItemLocationQuantity", lhsOriginalItemLocationQuantity), LocatorUtils.property(thatLocator, "originalItemLocationQuantity", rhsOriginalItemLocationQuantity), lhsOriginalItemLocationQuantity, rhsOriginalItemLocationQuantity, (this.originalItemLocationQuantity!= null), (that.originalItemLocationQuantity!= null))) {
                return false;
            }
        }
        {
            List<PriceType> lhsAlternativeConditionPrice;
            lhsAlternativeConditionPrice = (((this.alternativeConditionPrice!= null)&&(!this.alternativeConditionPrice.isEmpty()))?this.getAlternativeConditionPrice():null);
            List<PriceType> rhsAlternativeConditionPrice;
            rhsAlternativeConditionPrice = (((that.alternativeConditionPrice!= null)&&(!that.alternativeConditionPrice.isEmpty()))?that.getAlternativeConditionPrice():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "alternativeConditionPrice", lhsAlternativeConditionPrice), LocatorUtils.property(thatLocator, "alternativeConditionPrice", rhsAlternativeConditionPrice), lhsAlternativeConditionPrice, rhsAlternativeConditionPrice, ((this.alternativeConditionPrice!= null)&&(!this.alternativeConditionPrice.isEmpty())), ((that.alternativeConditionPrice!= null)&&(!that.alternativeConditionPrice.isEmpty())))) {
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
            ItemLocationQuantityType theOriginalItemLocationQuantity;
            theOriginalItemLocationQuantity = this.getOriginalItemLocationQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalItemLocationQuantity", theOriginalItemLocationQuantity), currentHashCode, theOriginalItemLocationQuantity, (this.originalItemLocationQuantity!= null));
        }
        {
            List<PriceType> theAlternativeConditionPrice;
            theAlternativeConditionPrice = (((this.alternativeConditionPrice!= null)&&(!this.alternativeConditionPrice.isEmpty()))?this.getAlternativeConditionPrice():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "alternativeConditionPrice", theAlternativeConditionPrice), currentHashCode, theAlternativeConditionPrice, ((this.alternativeConditionPrice!= null)&&(!this.alternativeConditionPrice.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
