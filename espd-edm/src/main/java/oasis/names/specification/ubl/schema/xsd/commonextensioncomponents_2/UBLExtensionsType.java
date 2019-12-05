//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2;

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
 * 
 * 				A container for all extensions present in the document.
 * 			
 * 
 * <p>Classe Java per UBLExtensionsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UBLExtensionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtension" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UBLExtensionsType", propOrder = {
    "ublExtension"
})
public class UBLExtensionsType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "UBLExtension", required = true)
    protected List<UBLExtensionType> ublExtension;

    /**
     * 
     * 						A single extension for private use.
     * 					Gets the value of the ublExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ublExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUBLExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UBLExtensionType }
     * 
     * 
     */
    public List<UBLExtensionType> getUBLExtension() {
        if (ublExtension == null) {
            ublExtension = new ArrayList<UBLExtensionType>();
        }
        return this.ublExtension;
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
            List<UBLExtensionType> theUBLExtension;
            theUBLExtension = (((this.ublExtension!= null)&&(!this.ublExtension.isEmpty()))?this.getUBLExtension():null);
            strategy.appendField(locator, this, "ublExtension", buffer, theUBLExtension, ((this.ublExtension!= null)&&(!this.ublExtension.isEmpty())));
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
        final UBLExtensionsType that = ((UBLExtensionsType) object);
        {
            List<UBLExtensionType> lhsUBLExtension;
            lhsUBLExtension = (((this.ublExtension!= null)&&(!this.ublExtension.isEmpty()))?this.getUBLExtension():null);
            List<UBLExtensionType> rhsUBLExtension;
            rhsUBLExtension = (((that.ublExtension!= null)&&(!that.ublExtension.isEmpty()))?that.getUBLExtension():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ublExtension", lhsUBLExtension), LocatorUtils.property(thatLocator, "ublExtension", rhsUBLExtension), lhsUBLExtension, rhsUBLExtension, ((this.ublExtension!= null)&&(!this.ublExtension.isEmpty())), ((that.ublExtension!= null)&&(!that.ublExtension.isEmpty())))) {
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
            List<UBLExtensionType> theUBLExtension;
            theUBLExtension = (((this.ublExtension!= null)&&(!this.ublExtension.isEmpty()))?this.getUBLExtension():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ublExtension", theUBLExtension), currentHashCode, theUBLExtension, ((this.ublExtension!= null)&&(!this.ublExtension.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
