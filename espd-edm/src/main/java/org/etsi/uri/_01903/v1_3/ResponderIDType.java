//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.etsi.uri._01903.v1_3;

import java.io.Serializable;
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
 * <p>Classe Java per ResponderIDType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ResponderIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ByName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ByKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponderIDType", propOrder = {
    "byName",
    "byKey"
})
public class ResponderIDType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ByName")
    protected String byName;
    @XmlElement(name = "ByKey")
    protected byte[] byKey;

    /**
     * Recupera il valore della proprietà byName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByName() {
        return byName;
    }

    /**
     * Imposta il valore della proprietà byName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByName(String value) {
        this.byName = value;
    }

    /**
     * Recupera il valore della proprietà byKey.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getByKey() {
        return byKey;
    }

    /**
     * Imposta il valore della proprietà byKey.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setByKey(byte[] value) {
        this.byKey = value;
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
            String theByName;
            theByName = this.getByName();
            strategy.appendField(locator, this, "byName", buffer, theByName, (this.byName!= null));
        }
        {
            byte[] theByKey;
            theByKey = this.getByKey();
            strategy.appendField(locator, this, "byKey", buffer, theByKey, (this.byKey!= null));
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
        final ResponderIDType that = ((ResponderIDType) object);
        {
            String lhsByName;
            lhsByName = this.getByName();
            String rhsByName;
            rhsByName = that.getByName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "byName", lhsByName), LocatorUtils.property(thatLocator, "byName", rhsByName), lhsByName, rhsByName, (this.byName!= null), (that.byName!= null))) {
                return false;
            }
        }
        {
            byte[] lhsByKey;
            lhsByKey = this.getByKey();
            byte[] rhsByKey;
            rhsByKey = that.getByKey();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "byKey", lhsByKey), LocatorUtils.property(thatLocator, "byKey", rhsByKey), lhsByKey, rhsByKey, (this.byKey!= null), (that.byKey!= null))) {
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
            String theByName;
            theByName = this.getByName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "byName", theByName), currentHashCode, theByName, (this.byName!= null));
        }
        {
            byte[] theByKey;
            theByKey = this.getByKey();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "byKey", theByKey), currentHashCode, theByKey, (this.byKey!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
