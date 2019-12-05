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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RoleCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SequenceNumericType;
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
 * <p>Classe Java per EndorserPartyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EndorserPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoleCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceNumeric"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SignatoryContact"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndorserPartyType", propOrder = {
    "roleCode",
    "sequenceNumeric",
    "party",
    "signatoryContact"
})
public class EndorserPartyType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "RoleCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected RoleCodeType roleCode;
    @XmlElement(name = "SequenceNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected SequenceNumericType sequenceNumeric;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;
    @XmlElement(name = "SignatoryContact", required = true)
    protected ContactType signatoryContact;

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
     * Recupera il valore della proprietà sequenceNumeric.
     * 
     * @return
     *     possible object is
     *     {@link SequenceNumericType }
     *     
     */
    public SequenceNumericType getSequenceNumeric() {
        return sequenceNumeric;
    }

    /**
     * Imposta il valore della proprietà sequenceNumeric.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceNumericType }
     *     
     */
    public void setSequenceNumeric(SequenceNumericType value) {
        this.sequenceNumeric = value;
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

    /**
     * Recupera il valore della proprietà signatoryContact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getSignatoryContact() {
        return signatoryContact;
    }

    /**
     * Imposta il valore della proprietà signatoryContact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setSignatoryContact(ContactType value) {
        this.signatoryContact = value;
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
            SequenceNumericType theSequenceNumeric;
            theSequenceNumeric = this.getSequenceNumeric();
            strategy.appendField(locator, this, "sequenceNumeric", buffer, theSequenceNumeric, (this.sequenceNumeric!= null));
        }
        {
            PartyType theParty;
            theParty = this.getParty();
            strategy.appendField(locator, this, "party", buffer, theParty, (this.party!= null));
        }
        {
            ContactType theSignatoryContact;
            theSignatoryContact = this.getSignatoryContact();
            strategy.appendField(locator, this, "signatoryContact", buffer, theSignatoryContact, (this.signatoryContact!= null));
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
        final EndorserPartyType that = ((EndorserPartyType) object);
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
            SequenceNumericType lhsSequenceNumeric;
            lhsSequenceNumeric = this.getSequenceNumeric();
            SequenceNumericType rhsSequenceNumeric;
            rhsSequenceNumeric = that.getSequenceNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sequenceNumeric", lhsSequenceNumeric), LocatorUtils.property(thatLocator, "sequenceNumeric", rhsSequenceNumeric), lhsSequenceNumeric, rhsSequenceNumeric, (this.sequenceNumeric!= null), (that.sequenceNumeric!= null))) {
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
        {
            ContactType lhsSignatoryContact;
            lhsSignatoryContact = this.getSignatoryContact();
            ContactType rhsSignatoryContact;
            rhsSignatoryContact = that.getSignatoryContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signatoryContact", lhsSignatoryContact), LocatorUtils.property(thatLocator, "signatoryContact", rhsSignatoryContact), lhsSignatoryContact, rhsSignatoryContact, (this.signatoryContact!= null), (that.signatoryContact!= null))) {
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
            SequenceNumericType theSequenceNumeric;
            theSequenceNumeric = this.getSequenceNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sequenceNumeric", theSequenceNumeric), currentHashCode, theSequenceNumeric, (this.sequenceNumeric!= null));
        }
        {
            PartyType theParty;
            theParty = this.getParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "party", theParty), currentHashCode, theParty, (this.party!= null));
        }
        {
            ContactType theSignatoryContact;
            theSignatoryContact = this.getSignatoryContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signatoryContact", theSignatoryContact), currentHashCode, theSignatoryContact, (this.signatoryContact!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
