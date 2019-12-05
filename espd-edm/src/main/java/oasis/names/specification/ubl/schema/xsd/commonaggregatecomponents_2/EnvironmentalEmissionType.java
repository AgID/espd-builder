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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EnvironmentalEmissionTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueMeasureType;
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
 * <p>Classe Java per EnvironmentalEmissionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentalEmissionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EnvironmentalEmissionTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueMeasure"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EmissionCalculationMethod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentalEmissionType", propOrder = {
    "environmentalEmissionTypeCode",
    "valueMeasure",
    "description",
    "emissionCalculationMethod"
})
public class EnvironmentalEmissionType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "EnvironmentalEmissionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected EnvironmentalEmissionTypeCodeType environmentalEmissionTypeCode;
    @XmlElement(name = "ValueMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ValueMeasureType valueMeasure;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "EmissionCalculationMethod")
    protected List<EmissionCalculationMethodType> emissionCalculationMethod;

    /**
     * Recupera il valore della proprietà environmentalEmissionTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalEmissionTypeCodeType }
     *     
     */
    public EnvironmentalEmissionTypeCodeType getEnvironmentalEmissionTypeCode() {
        return environmentalEmissionTypeCode;
    }

    /**
     * Imposta il valore della proprietà environmentalEmissionTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalEmissionTypeCodeType }
     *     
     */
    public void setEnvironmentalEmissionTypeCode(EnvironmentalEmissionTypeCodeType value) {
        this.environmentalEmissionTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà valueMeasure.
     * 
     * @return
     *     possible object is
     *     {@link ValueMeasureType }
     *     
     */
    public ValueMeasureType getValueMeasure() {
        return valueMeasure;
    }

    /**
     * Imposta il valore della proprietà valueMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueMeasureType }
     *     
     */
    public void setValueMeasure(ValueMeasureType value) {
        this.valueMeasure = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the emissionCalculationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emissionCalculationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmissionCalculationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmissionCalculationMethodType }
     * 
     * 
     */
    public List<EmissionCalculationMethodType> getEmissionCalculationMethod() {
        if (emissionCalculationMethod == null) {
            emissionCalculationMethod = new ArrayList<EmissionCalculationMethodType>();
        }
        return this.emissionCalculationMethod;
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
            EnvironmentalEmissionTypeCodeType theEnvironmentalEmissionTypeCode;
            theEnvironmentalEmissionTypeCode = this.getEnvironmentalEmissionTypeCode();
            strategy.appendField(locator, this, "environmentalEmissionTypeCode", buffer, theEnvironmentalEmissionTypeCode, (this.environmentalEmissionTypeCode!= null));
        }
        {
            ValueMeasureType theValueMeasure;
            theValueMeasure = this.getValueMeasure();
            strategy.appendField(locator, this, "valueMeasure", buffer, theValueMeasure, (this.valueMeasure!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<EmissionCalculationMethodType> theEmissionCalculationMethod;
            theEmissionCalculationMethod = (((this.emissionCalculationMethod!= null)&&(!this.emissionCalculationMethod.isEmpty()))?this.getEmissionCalculationMethod():null);
            strategy.appendField(locator, this, "emissionCalculationMethod", buffer, theEmissionCalculationMethod, ((this.emissionCalculationMethod!= null)&&(!this.emissionCalculationMethod.isEmpty())));
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
        final EnvironmentalEmissionType that = ((EnvironmentalEmissionType) object);
        {
            EnvironmentalEmissionTypeCodeType lhsEnvironmentalEmissionTypeCode;
            lhsEnvironmentalEmissionTypeCode = this.getEnvironmentalEmissionTypeCode();
            EnvironmentalEmissionTypeCodeType rhsEnvironmentalEmissionTypeCode;
            rhsEnvironmentalEmissionTypeCode = that.getEnvironmentalEmissionTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "environmentalEmissionTypeCode", lhsEnvironmentalEmissionTypeCode), LocatorUtils.property(thatLocator, "environmentalEmissionTypeCode", rhsEnvironmentalEmissionTypeCode), lhsEnvironmentalEmissionTypeCode, rhsEnvironmentalEmissionTypeCode, (this.environmentalEmissionTypeCode!= null), (that.environmentalEmissionTypeCode!= null))) {
                return false;
            }
        }
        {
            ValueMeasureType lhsValueMeasure;
            lhsValueMeasure = this.getValueMeasure();
            ValueMeasureType rhsValueMeasure;
            rhsValueMeasure = that.getValueMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "valueMeasure", lhsValueMeasure), LocatorUtils.property(thatLocator, "valueMeasure", rhsValueMeasure), lhsValueMeasure, rhsValueMeasure, (this.valueMeasure!= null), (that.valueMeasure!= null))) {
                return false;
            }
        }
        {
            List<DescriptionType> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<DescriptionType> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, ((this.description!= null)&&(!this.description.isEmpty())), ((that.description!= null)&&(!that.description.isEmpty())))) {
                return false;
            }
        }
        {
            List<EmissionCalculationMethodType> lhsEmissionCalculationMethod;
            lhsEmissionCalculationMethod = (((this.emissionCalculationMethod!= null)&&(!this.emissionCalculationMethod.isEmpty()))?this.getEmissionCalculationMethod():null);
            List<EmissionCalculationMethodType> rhsEmissionCalculationMethod;
            rhsEmissionCalculationMethod = (((that.emissionCalculationMethod!= null)&&(!that.emissionCalculationMethod.isEmpty()))?that.getEmissionCalculationMethod():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emissionCalculationMethod", lhsEmissionCalculationMethod), LocatorUtils.property(thatLocator, "emissionCalculationMethod", rhsEmissionCalculationMethod), lhsEmissionCalculationMethod, rhsEmissionCalculationMethod, ((this.emissionCalculationMethod!= null)&&(!this.emissionCalculationMethod.isEmpty())), ((that.emissionCalculationMethod!= null)&&(!that.emissionCalculationMethod.isEmpty())))) {
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
            EnvironmentalEmissionTypeCodeType theEnvironmentalEmissionTypeCode;
            theEnvironmentalEmissionTypeCode = this.getEnvironmentalEmissionTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "environmentalEmissionTypeCode", theEnvironmentalEmissionTypeCode), currentHashCode, theEnvironmentalEmissionTypeCode, (this.environmentalEmissionTypeCode!= null));
        }
        {
            ValueMeasureType theValueMeasure;
            theValueMeasure = this.getValueMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "valueMeasure", theValueMeasure), currentHashCode, theValueMeasure, (this.valueMeasure!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<EmissionCalculationMethodType> theEmissionCalculationMethod;
            theEmissionCalculationMethod = (((this.emissionCalculationMethod!= null)&&(!this.emissionCalculationMethod.isEmpty()))?this.getEmissionCalculationMethod():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emissionCalculationMethod", theEmissionCalculationMethod), currentHashCode, theEmissionCalculationMethod, ((this.emissionCalculationMethod!= null)&&(!this.emissionCalculationMethod.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
