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
 * <p>Classe Java per EconomicOperatorPartyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EconomicOperatorPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}QualifyingParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EconomicOperatorRole" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EconomicOperatorPartyType", propOrder = {
    "qualifyingParty",
    "economicOperatorRole",
    "party"
})
public class EconomicOperatorPartyType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "QualifyingParty")
    protected List<QualifyingPartyType> qualifyingParty;
    @XmlElement(name = "EconomicOperatorRole")
    protected EconomicOperatorRoleType economicOperatorRole;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;

    /**
     * Gets the value of the qualifyingParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifyingParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifyingParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifyingPartyType }
     * 
     * 
     */
    public List<QualifyingPartyType> getQualifyingParty() {
        if (qualifyingParty == null) {
            qualifyingParty = new ArrayList<QualifyingPartyType>();
        }
        return this.qualifyingParty;
    }

    /**
     * Recupera il valore della proprietà economicOperatorRole.
     * 
     * @return
     *     possible object is
     *     {@link EconomicOperatorRoleType }
     *     
     */
    public EconomicOperatorRoleType getEconomicOperatorRole() {
        return economicOperatorRole;
    }

    /**
     * Imposta il valore della proprietà economicOperatorRole.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicOperatorRoleType }
     *     
     */
    public void setEconomicOperatorRole(EconomicOperatorRoleType value) {
        this.economicOperatorRole = value;
    }

    /**
     * Recupera il valore della proprietà party.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Imposta il valore della proprietà party.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
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
            List<QualifyingPartyType> theQualifyingParty;
            theQualifyingParty = (((this.qualifyingParty!= null)&&(!this.qualifyingParty.isEmpty()))?this.getQualifyingParty():null);
            strategy.appendField(locator, this, "qualifyingParty", buffer, theQualifyingParty, ((this.qualifyingParty!= null)&&(!this.qualifyingParty.isEmpty())));
        }
        {
            EconomicOperatorRoleType theEconomicOperatorRole;
            theEconomicOperatorRole = this.getEconomicOperatorRole();
            strategy.appendField(locator, this, "economicOperatorRole", buffer, theEconomicOperatorRole, (this.economicOperatorRole!= null));
        }
        {
            PartyType theParty;
            theParty = this.getParty();
            strategy.appendField(locator, this, "party", buffer, theParty, (this.party!= null));
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
        final EconomicOperatorPartyType that = ((EconomicOperatorPartyType) object);
        {
            List<QualifyingPartyType> lhsQualifyingParty;
            lhsQualifyingParty = (((this.qualifyingParty!= null)&&(!this.qualifyingParty.isEmpty()))?this.getQualifyingParty():null);
            List<QualifyingPartyType> rhsQualifyingParty;
            rhsQualifyingParty = (((that.qualifyingParty!= null)&&(!that.qualifyingParty.isEmpty()))?that.getQualifyingParty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qualifyingParty", lhsQualifyingParty), LocatorUtils.property(thatLocator, "qualifyingParty", rhsQualifyingParty), lhsQualifyingParty, rhsQualifyingParty, ((this.qualifyingParty!= null)&&(!this.qualifyingParty.isEmpty())), ((that.qualifyingParty!= null)&&(!that.qualifyingParty.isEmpty())))) {
                return false;
            }
        }
        {
            EconomicOperatorRoleType lhsEconomicOperatorRole;
            lhsEconomicOperatorRole = this.getEconomicOperatorRole();
            EconomicOperatorRoleType rhsEconomicOperatorRole;
            rhsEconomicOperatorRole = that.getEconomicOperatorRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "economicOperatorRole", lhsEconomicOperatorRole), LocatorUtils.property(thatLocator, "economicOperatorRole", rhsEconomicOperatorRole), lhsEconomicOperatorRole, rhsEconomicOperatorRole, (this.economicOperatorRole!= null), (that.economicOperatorRole!= null))) {
                return false;
            }
        }
        {
            PartyType lhsParty;
            lhsParty = this.getParty();
            PartyType rhsParty;
            rhsParty = that.getParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "party", lhsParty), LocatorUtils.property(thatLocator, "party", rhsParty), lhsParty, rhsParty, (this.party!= null), (that.party!= null))) {
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
            List<QualifyingPartyType> theQualifyingParty;
            theQualifyingParty = (((this.qualifyingParty!= null)&&(!this.qualifyingParty.isEmpty()))?this.getQualifyingParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qualifyingParty", theQualifyingParty), currentHashCode, theQualifyingParty, ((this.qualifyingParty!= null)&&(!this.qualifyingParty.isEmpty())));
        }
        {
            EconomicOperatorRoleType theEconomicOperatorRole;
            theEconomicOperatorRole = this.getEconomicOperatorRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "economicOperatorRole", theEconomicOperatorRole), currentHashCode, theEconomicOperatorRole, (this.economicOperatorRole!= null));
        }
        {
            PartyType theParty;
            theParty = this.getParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "party", theParty), currentHashCode, theParty, (this.party!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
