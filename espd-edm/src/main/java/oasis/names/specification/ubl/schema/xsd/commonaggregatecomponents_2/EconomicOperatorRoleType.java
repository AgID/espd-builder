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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RoleCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RoleDescriptionType;
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
 * <p>Classe Java per EconomicOperatorRoleType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EconomicOperatorRoleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoleCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoleDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EconomicOperatorRoleType", propOrder = {
    "roleCode",
    "roleDescription"
})
public class EconomicOperatorRoleType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "RoleCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RoleCodeType roleCode;
    @XmlElement(name = "RoleDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<RoleDescriptionType> roleDescription;

    /**
     * Recupera il valore della proprietà roleCode.
     * 
     * @return
     *     possible object is
     *     {@link RoleCodeType }
     *     
     */
    public RoleCodeType getRoleCode() {
        return roleCode;
    }

    /**
     * Imposta il valore della proprietà roleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleCodeType }
     *     
     */
    public void setRoleCode(RoleCodeType value) {
        this.roleCode = value;
    }

    /**
     * Gets the value of the roleDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleDescriptionType }
     * 
     * 
     */
    public List<RoleDescriptionType> getRoleDescription() {
        if (roleDescription == null) {
            roleDescription = new ArrayList<RoleDescriptionType>();
        }
        return this.roleDescription;
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
            RoleCodeType theRoleCode;
            theRoleCode = this.getRoleCode();
            strategy.appendField(locator, this, "roleCode", buffer, theRoleCode, (this.roleCode!= null));
        }
        {
            List<RoleDescriptionType> theRoleDescription;
            theRoleDescription = (((this.roleDescription!= null)&&(!this.roleDescription.isEmpty()))?this.getRoleDescription():null);
            strategy.appendField(locator, this, "roleDescription", buffer, theRoleDescription, ((this.roleDescription!= null)&&(!this.roleDescription.isEmpty())));
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
        final EconomicOperatorRoleType that = ((EconomicOperatorRoleType) object);
        {
            RoleCodeType lhsRoleCode;
            lhsRoleCode = this.getRoleCode();
            RoleCodeType rhsRoleCode;
            rhsRoleCode = that.getRoleCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roleCode", lhsRoleCode), LocatorUtils.property(thatLocator, "roleCode", rhsRoleCode), lhsRoleCode, rhsRoleCode, (this.roleCode!= null), (that.roleCode!= null))) {
                return false;
            }
        }
        {
            List<RoleDescriptionType> lhsRoleDescription;
            lhsRoleDescription = (((this.roleDescription!= null)&&(!this.roleDescription.isEmpty()))?this.getRoleDescription():null);
            List<RoleDescriptionType> rhsRoleDescription;
            rhsRoleDescription = (((that.roleDescription!= null)&&(!that.roleDescription.isEmpty()))?that.getRoleDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roleDescription", lhsRoleDescription), LocatorUtils.property(thatLocator, "roleDescription", rhsRoleDescription), lhsRoleDescription, rhsRoleDescription, ((this.roleDescription!= null)&&(!this.roleDescription.isEmpty())), ((that.roleDescription!= null)&&(!that.roleDescription.isEmpty())))) {
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
            RoleCodeType theRoleCode;
            theRoleCode = this.getRoleCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roleCode", theRoleCode), currentHashCode, theRoleCode, (this.roleCode!= null));
        }
        {
            List<RoleDescriptionType> theRoleDescription;
            theRoleDescription = (((this.roleDescription!= null)&&(!this.roleDescription.isEmpty()))?this.getRoleDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roleDescription", theRoleDescription), currentHashCode, theRoleDescription, ((this.roleDescription!= null)&&(!this.roleDescription.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
