//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package org.etsi.uri._01903.v1_3;

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
 * <p>Classe Java per ClaimedRolesListType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ClaimedRolesListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaimedRole" type="{http://uri.etsi.org/01903/v1.3.2#}AnyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimedRolesListType", propOrder = {
    "claimedRole"
})
public class ClaimedRolesListType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ClaimedRole", required = true)
    protected List<AnyType> claimedRole;

    /**
     * Gets the value of the claimedRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimedRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimedRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyType }
     * 
     * 
     */
    public List<AnyType> getClaimedRole() {
        if (claimedRole == null) {
            claimedRole = new ArrayList<AnyType>();
        }
        return this.claimedRole;
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
            List<AnyType> theClaimedRole;
            theClaimedRole = (((this.claimedRole!= null)&&(!this.claimedRole.isEmpty()))?this.getClaimedRole():null);
            strategy.appendField(locator, this, "claimedRole", buffer, theClaimedRole, ((this.claimedRole!= null)&&(!this.claimedRole.isEmpty())));
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
        final ClaimedRolesListType that = ((ClaimedRolesListType) object);
        {
            List<AnyType> lhsClaimedRole;
            lhsClaimedRole = (((this.claimedRole!= null)&&(!this.claimedRole.isEmpty()))?this.getClaimedRole():null);
            List<AnyType> rhsClaimedRole;
            rhsClaimedRole = (((that.claimedRole!= null)&&(!that.claimedRole.isEmpty()))?that.getClaimedRole():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "claimedRole", lhsClaimedRole), LocatorUtils.property(thatLocator, "claimedRole", rhsClaimedRole), lhsClaimedRole, rhsClaimedRole, ((this.claimedRole!= null)&&(!this.claimedRole.isEmpty())), ((that.claimedRole!= null)&&(!that.claimedRole.isEmpty())))) {
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
            List<AnyType> theClaimedRole;
            theClaimedRole = (((this.claimedRole!= null)&&(!this.claimedRole.isEmpty()))?this.getClaimedRole():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "claimedRole", theClaimedRole), currentHashCode, theClaimedRole, ((this.claimedRole!= null)&&(!this.claimedRole.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
