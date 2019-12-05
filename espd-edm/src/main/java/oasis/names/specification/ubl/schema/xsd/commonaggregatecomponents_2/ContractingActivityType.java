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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActivityTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ActivityTypeType;
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
 * <p>Classe Java per ContractingActivityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ContractingActivityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActivityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActivityType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractingActivityType", propOrder = {
    "activityTypeCode",
    "activityType"
})
public class ContractingActivityType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ActivityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActivityTypeCodeType activityTypeCode;
    @XmlElement(name = "ActivityType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ActivityTypeType activityType;

    /**
     * Recupera il valore della proprietà activityTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ActivityTypeCodeType }
     *     
     */
    public ActivityTypeCodeType getActivityTypeCode() {
        return activityTypeCode;
    }

    /**
     * Imposta il valore della proprietà activityTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityTypeCodeType }
     *     
     */
    public void setActivityTypeCode(ActivityTypeCodeType value) {
        this.activityTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà activityType.
     * 
     * @return
     *     possible object is
     *     {@link ActivityTypeType }
     *     
     */
    public ActivityTypeType getActivityType() {
        return activityType;
    }

    /**
     * Imposta il valore della proprietà activityType.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityTypeType }
     *     
     */
    public void setActivityType(ActivityTypeType value) {
        this.activityType = value;
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
            ActivityTypeCodeType theActivityTypeCode;
            theActivityTypeCode = this.getActivityTypeCode();
            strategy.appendField(locator, this, "activityTypeCode", buffer, theActivityTypeCode, (this.activityTypeCode!= null));
        }
        {
            ActivityTypeType theActivityType;
            theActivityType = this.getActivityType();
            strategy.appendField(locator, this, "activityType", buffer, theActivityType, (this.activityType!= null));
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
        final ContractingActivityType that = ((ContractingActivityType) object);
        {
            ActivityTypeCodeType lhsActivityTypeCode;
            lhsActivityTypeCode = this.getActivityTypeCode();
            ActivityTypeCodeType rhsActivityTypeCode;
            rhsActivityTypeCode = that.getActivityTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activityTypeCode", lhsActivityTypeCode), LocatorUtils.property(thatLocator, "activityTypeCode", rhsActivityTypeCode), lhsActivityTypeCode, rhsActivityTypeCode, (this.activityTypeCode!= null), (that.activityTypeCode!= null))) {
                return false;
            }
        }
        {
            ActivityTypeType lhsActivityType;
            lhsActivityType = this.getActivityType();
            ActivityTypeType rhsActivityType;
            rhsActivityType = that.getActivityType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activityType", lhsActivityType), LocatorUtils.property(thatLocator, "activityType", rhsActivityType), lhsActivityType, rhsActivityType, (this.activityType!= null), (that.activityType!= null))) {
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
            ActivityTypeCodeType theActivityTypeCode;
            theActivityTypeCode = this.getActivityTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activityTypeCode", theActivityTypeCode), currentHashCode, theActivityTypeCode, (this.activityTypeCode!= null));
        }
        {
            ActivityTypeType theActivityType;
            theActivityType = this.getActivityType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activityType", theActivityType), currentHashCode, theActivityType, (this.activityType!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
