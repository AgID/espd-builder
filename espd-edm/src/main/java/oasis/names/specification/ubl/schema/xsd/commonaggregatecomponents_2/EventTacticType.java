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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CommentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType;
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
 * <p>Classe Java per EventTacticType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EventTacticType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Comment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EventTacticEnumeration"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventTacticType", propOrder = {
    "comment",
    "quantity",
    "eventTacticEnumeration",
    "period"
})
public class EventTacticType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "Comment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CommentType comment;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QuantityType quantity;
    @XmlElement(name = "EventTacticEnumeration", required = true)
    protected EventTacticEnumerationType eventTacticEnumeration;
    @XmlElement(name = "Period")
    protected PeriodType period;

    /**
     * Recupera il valore della proprietà comment.
     * 
     * @return
     *     possible object is
     *     {@link CommentType }
     *     
     */
    public CommentType getComment() {
        return comment;
    }

    /**
     * Imposta il valore della proprietà comment.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentType }
     *     
     */
    public void setComment(CommentType value) {
        this.comment = value;
    }

    /**
     * Recupera il valore della proprietà quantity.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantity() {
        return quantity;
    }

    /**
     * Imposta il valore della proprietà quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantity(QuantityType value) {
        this.quantity = value;
    }

    /**
     * Recupera il valore della proprietà eventTacticEnumeration.
     * 
     * @return
     *     possible object is
     *     {@link EventTacticEnumerationType }
     *     
     */
    public EventTacticEnumerationType getEventTacticEnumeration() {
        return eventTacticEnumeration;
    }

    /**
     * Imposta il valore della proprietà eventTacticEnumeration.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTacticEnumerationType }
     *     
     */
    public void setEventTacticEnumeration(EventTacticEnumerationType value) {
        this.eventTacticEnumeration = value;
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
            CommentType theComment;
            theComment = this.getComment();
            strategy.appendField(locator, this, "comment", buffer, theComment, (this.comment!= null));
        }
        {
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            strategy.appendField(locator, this, "quantity", buffer, theQuantity, (this.quantity!= null));
        }
        {
            EventTacticEnumerationType theEventTacticEnumeration;
            theEventTacticEnumeration = this.getEventTacticEnumeration();
            strategy.appendField(locator, this, "eventTacticEnumeration", buffer, theEventTacticEnumeration, (this.eventTacticEnumeration!= null));
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
        final EventTacticType that = ((EventTacticType) object);
        {
            CommentType lhsComment;
            lhsComment = this.getComment();
            CommentType rhsComment;
            rhsComment = that.getComment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comment", lhsComment), LocatorUtils.property(thatLocator, "comment", rhsComment), lhsComment, rhsComment, (this.comment!= null), (that.comment!= null))) {
                return false;
            }
        }
        {
            QuantityType lhsQuantity;
            lhsQuantity = this.getQuantity();
            QuantityType rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity, (this.quantity!= null), (that.quantity!= null))) {
                return false;
            }
        }
        {
            EventTacticEnumerationType lhsEventTacticEnumeration;
            lhsEventTacticEnumeration = this.getEventTacticEnumeration();
            EventTacticEnumerationType rhsEventTacticEnumeration;
            rhsEventTacticEnumeration = that.getEventTacticEnumeration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eventTacticEnumeration", lhsEventTacticEnumeration), LocatorUtils.property(thatLocator, "eventTacticEnumeration", rhsEventTacticEnumeration), lhsEventTacticEnumeration, rhsEventTacticEnumeration, (this.eventTacticEnumeration!= null), (that.eventTacticEnumeration!= null))) {
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
            CommentType theComment;
            theComment = this.getComment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comment", theComment), currentHashCode, theComment, (this.comment!= null));
        }
        {
            QuantityType theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity, (this.quantity!= null));
        }
        {
            EventTacticEnumerationType theEventTacticEnumeration;
            theEventTacticEnumeration = this.getEventTacticEnumeration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eventTacticEnumeration", theEventTacticEnumeration), currentHashCode, theEventTacticEnumeration, (this.eventTacticEnumeration!= null));
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
