//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package un.unece.uncefact.data.specification.corecomponenttypeschemamodule._2;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UNDT000018&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;CCT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A counted number of non-monetary units possibly
 * 					including fractions.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;decimal&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java per QuantityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="QuantityType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *       &lt;attribute name="unitCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="unitCodeListID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="unitCodeListAgencyID" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *       &lt;attribute name="unitCodeListAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityType", propOrder = {
    "value"
})
@XmlSeeAlso({
    oasis.names.specification.ubl.schema.xsd.unqualifieddatatypes_2.QuantityType.class
})
public class QuantityType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "unitCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String unitCode;
    @XmlAttribute(name = "unitCodeListID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String unitCodeListID;
    @XmlAttribute(name = "unitCodeListAgencyID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String unitCodeListAgencyID;
    @XmlAttribute(name = "unitCodeListAgencyName")
    protected String unitCodeListAgencyName;

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà unitCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Imposta il valore della proprietà unitCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Recupera il valore della proprietà unitCodeListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCodeListID() {
        return unitCodeListID;
    }

    /**
     * Imposta il valore della proprietà unitCodeListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCodeListID(String value) {
        this.unitCodeListID = value;
    }

    /**
     * Recupera il valore della proprietà unitCodeListAgencyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCodeListAgencyID() {
        return unitCodeListAgencyID;
    }

    /**
     * Imposta il valore della proprietà unitCodeListAgencyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCodeListAgencyID(String value) {
        this.unitCodeListAgencyID = value;
    }

    /**
     * Recupera il valore della proprietà unitCodeListAgencyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCodeListAgencyName() {
        return unitCodeListAgencyName;
    }

    /**
     * Imposta il valore della proprietà unitCodeListAgencyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCodeListAgencyName(String value) {
        this.unitCodeListAgencyName = value;
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
            BigDecimal theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
        }
        {
            String theUnitCode;
            theUnitCode = this.getUnitCode();
            strategy.appendField(locator, this, "unitCode", buffer, theUnitCode, (this.unitCode!= null));
        }
        {
            String theUnitCodeListID;
            theUnitCodeListID = this.getUnitCodeListID();
            strategy.appendField(locator, this, "unitCodeListID", buffer, theUnitCodeListID, (this.unitCodeListID!= null));
        }
        {
            String theUnitCodeListAgencyID;
            theUnitCodeListAgencyID = this.getUnitCodeListAgencyID();
            strategy.appendField(locator, this, "unitCodeListAgencyID", buffer, theUnitCodeListAgencyID, (this.unitCodeListAgencyID!= null));
        }
        {
            String theUnitCodeListAgencyName;
            theUnitCodeListAgencyName = this.getUnitCodeListAgencyName();
            strategy.appendField(locator, this, "unitCodeListAgencyName", buffer, theUnitCodeListAgencyName, (this.unitCodeListAgencyName!= null));
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
        final QuantityType that = ((QuantityType) object);
        {
            BigDecimal lhsValue;
            lhsValue = this.getValue();
            BigDecimal rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                return false;
            }
        }
        {
            String lhsUnitCode;
            lhsUnitCode = this.getUnitCode();
            String rhsUnitCode;
            rhsUnitCode = that.getUnitCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitCode", lhsUnitCode), LocatorUtils.property(thatLocator, "unitCode", rhsUnitCode), lhsUnitCode, rhsUnitCode, (this.unitCode!= null), (that.unitCode!= null))) {
                return false;
            }
        }
        {
            String lhsUnitCodeListID;
            lhsUnitCodeListID = this.getUnitCodeListID();
            String rhsUnitCodeListID;
            rhsUnitCodeListID = that.getUnitCodeListID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitCodeListID", lhsUnitCodeListID), LocatorUtils.property(thatLocator, "unitCodeListID", rhsUnitCodeListID), lhsUnitCodeListID, rhsUnitCodeListID, (this.unitCodeListID!= null), (that.unitCodeListID!= null))) {
                return false;
            }
        }
        {
            String lhsUnitCodeListAgencyID;
            lhsUnitCodeListAgencyID = this.getUnitCodeListAgencyID();
            String rhsUnitCodeListAgencyID;
            rhsUnitCodeListAgencyID = that.getUnitCodeListAgencyID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitCodeListAgencyID", lhsUnitCodeListAgencyID), LocatorUtils.property(thatLocator, "unitCodeListAgencyID", rhsUnitCodeListAgencyID), lhsUnitCodeListAgencyID, rhsUnitCodeListAgencyID, (this.unitCodeListAgencyID!= null), (that.unitCodeListAgencyID!= null))) {
                return false;
            }
        }
        {
            String lhsUnitCodeListAgencyName;
            lhsUnitCodeListAgencyName = this.getUnitCodeListAgencyName();
            String rhsUnitCodeListAgencyName;
            rhsUnitCodeListAgencyName = that.getUnitCodeListAgencyName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitCodeListAgencyName", lhsUnitCodeListAgencyName), LocatorUtils.property(thatLocator, "unitCodeListAgencyName", rhsUnitCodeListAgencyName), lhsUnitCodeListAgencyName, rhsUnitCodeListAgencyName, (this.unitCodeListAgencyName!= null), (that.unitCodeListAgencyName!= null))) {
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
            BigDecimal theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue, (this.value!= null));
        }
        {
            String theUnitCode;
            theUnitCode = this.getUnitCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitCode", theUnitCode), currentHashCode, theUnitCode, (this.unitCode!= null));
        }
        {
            String theUnitCodeListID;
            theUnitCodeListID = this.getUnitCodeListID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitCodeListID", theUnitCodeListID), currentHashCode, theUnitCodeListID, (this.unitCodeListID!= null));
        }
        {
            String theUnitCodeListAgencyID;
            theUnitCodeListAgencyID = this.getUnitCodeListAgencyID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitCodeListAgencyID", theUnitCodeListAgencyID), currentHashCode, theUnitCodeListAgencyID, (this.unitCodeListAgencyID!= null));
        }
        {
            String theUnitCodeListAgencyName;
            theUnitCodeListAgencyName = this.getUnitCodeListAgencyName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitCodeListAgencyName", theUnitCodeListAgencyName), currentHashCode, theUnitCodeListAgencyName, (this.unitCodeListAgencyName!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
