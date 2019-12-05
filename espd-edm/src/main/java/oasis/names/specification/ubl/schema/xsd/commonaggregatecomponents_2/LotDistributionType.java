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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GroupingLotsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumLotsAwardedNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumLotsSubmittedNumericType;
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
 * <p>Classe Java per LotDistributionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="LotDistributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumLotsAwardedNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumLotsSubmittedNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GroupingLots" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LotDistributionType", propOrder = {
    "maximumLotsAwardedNumeric",
    "maximumLotsSubmittedNumeric",
    "groupingLots"
})
public class LotDistributionType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "MaximumLotsAwardedNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumLotsAwardedNumericType maximumLotsAwardedNumeric;
    @XmlElement(name = "MaximumLotsSubmittedNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumLotsSubmittedNumericType maximumLotsSubmittedNumeric;
    @XmlElement(name = "GroupingLots", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<GroupingLotsType> groupingLots;

    /**
     * Recupera il valore della proprietà maximumLotsAwardedNumeric.
     * 
     * @return
     *     possible object is
     *     {@link MaximumLotsAwardedNumericType }
     *     
     */
    public MaximumLotsAwardedNumericType getMaximumLotsAwardedNumeric() {
        return maximumLotsAwardedNumeric;
    }

    /**
     * Imposta il valore della proprietà maximumLotsAwardedNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumLotsAwardedNumericType }
     *     
     */
    public void setMaximumLotsAwardedNumeric(MaximumLotsAwardedNumericType value) {
        this.maximumLotsAwardedNumeric = value;
    }

    /**
     * Recupera il valore della proprietà maximumLotsSubmittedNumeric.
     * 
     * @return
     *     possible object is
     *     {@link MaximumLotsSubmittedNumericType }
     *     
     */
    public MaximumLotsSubmittedNumericType getMaximumLotsSubmittedNumeric() {
        return maximumLotsSubmittedNumeric;
    }

    /**
     * Imposta il valore della proprietà maximumLotsSubmittedNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumLotsSubmittedNumericType }
     *     
     */
    public void setMaximumLotsSubmittedNumeric(MaximumLotsSubmittedNumericType value) {
        this.maximumLotsSubmittedNumeric = value;
    }

    /**
     * Gets the value of the groupingLots property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupingLots property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupingLots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupingLotsType }
     * 
     * 
     */
    public List<GroupingLotsType> getGroupingLots() {
        if (groupingLots == null) {
            groupingLots = new ArrayList<GroupingLotsType>();
        }
        return this.groupingLots;
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
            MaximumLotsAwardedNumericType theMaximumLotsAwardedNumeric;
            theMaximumLotsAwardedNumeric = this.getMaximumLotsAwardedNumeric();
            strategy.appendField(locator, this, "maximumLotsAwardedNumeric", buffer, theMaximumLotsAwardedNumeric, (this.maximumLotsAwardedNumeric!= null));
        }
        {
            MaximumLotsSubmittedNumericType theMaximumLotsSubmittedNumeric;
            theMaximumLotsSubmittedNumeric = this.getMaximumLotsSubmittedNumeric();
            strategy.appendField(locator, this, "maximumLotsSubmittedNumeric", buffer, theMaximumLotsSubmittedNumeric, (this.maximumLotsSubmittedNumeric!= null));
        }
        {
            List<GroupingLotsType> theGroupingLots;
            theGroupingLots = (((this.groupingLots!= null)&&(!this.groupingLots.isEmpty()))?this.getGroupingLots():null);
            strategy.appendField(locator, this, "groupingLots", buffer, theGroupingLots, ((this.groupingLots!= null)&&(!this.groupingLots.isEmpty())));
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
        final LotDistributionType that = ((LotDistributionType) object);
        {
            MaximumLotsAwardedNumericType lhsMaximumLotsAwardedNumeric;
            lhsMaximumLotsAwardedNumeric = this.getMaximumLotsAwardedNumeric();
            MaximumLotsAwardedNumericType rhsMaximumLotsAwardedNumeric;
            rhsMaximumLotsAwardedNumeric = that.getMaximumLotsAwardedNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumLotsAwardedNumeric", lhsMaximumLotsAwardedNumeric), LocatorUtils.property(thatLocator, "maximumLotsAwardedNumeric", rhsMaximumLotsAwardedNumeric), lhsMaximumLotsAwardedNumeric, rhsMaximumLotsAwardedNumeric, (this.maximumLotsAwardedNumeric!= null), (that.maximumLotsAwardedNumeric!= null))) {
                return false;
            }
        }
        {
            MaximumLotsSubmittedNumericType lhsMaximumLotsSubmittedNumeric;
            lhsMaximumLotsSubmittedNumeric = this.getMaximumLotsSubmittedNumeric();
            MaximumLotsSubmittedNumericType rhsMaximumLotsSubmittedNumeric;
            rhsMaximumLotsSubmittedNumeric = that.getMaximumLotsSubmittedNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumLotsSubmittedNumeric", lhsMaximumLotsSubmittedNumeric), LocatorUtils.property(thatLocator, "maximumLotsSubmittedNumeric", rhsMaximumLotsSubmittedNumeric), lhsMaximumLotsSubmittedNumeric, rhsMaximumLotsSubmittedNumeric, (this.maximumLotsSubmittedNumeric!= null), (that.maximumLotsSubmittedNumeric!= null))) {
                return false;
            }
        }
        {
            List<GroupingLotsType> lhsGroupingLots;
            lhsGroupingLots = (((this.groupingLots!= null)&&(!this.groupingLots.isEmpty()))?this.getGroupingLots():null);
            List<GroupingLotsType> rhsGroupingLots;
            rhsGroupingLots = (((that.groupingLots!= null)&&(!that.groupingLots.isEmpty()))?that.getGroupingLots():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupingLots", lhsGroupingLots), LocatorUtils.property(thatLocator, "groupingLots", rhsGroupingLots), lhsGroupingLots, rhsGroupingLots, ((this.groupingLots!= null)&&(!this.groupingLots.isEmpty())), ((that.groupingLots!= null)&&(!that.groupingLots.isEmpty())))) {
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
            MaximumLotsAwardedNumericType theMaximumLotsAwardedNumeric;
            theMaximumLotsAwardedNumeric = this.getMaximumLotsAwardedNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumLotsAwardedNumeric", theMaximumLotsAwardedNumeric), currentHashCode, theMaximumLotsAwardedNumeric, (this.maximumLotsAwardedNumeric!= null));
        }
        {
            MaximumLotsSubmittedNumericType theMaximumLotsSubmittedNumeric;
            theMaximumLotsSubmittedNumeric = this.getMaximumLotsSubmittedNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumLotsSubmittedNumeric", theMaximumLotsSubmittedNumeric), currentHashCode, theMaximumLotsSubmittedNumeric, (this.maximumLotsSubmittedNumeric!= null));
        }
        {
            List<GroupingLotsType> theGroupingLots;
            theGroupingLots = (((this.groupingLots!= null)&&(!this.groupingLots.isEmpty()))?this.getGroupingLots():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupingLots", theGroupingLots), currentHashCode, theGroupingLots, ((this.groupingLots!= null)&&(!this.groupingLots.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
