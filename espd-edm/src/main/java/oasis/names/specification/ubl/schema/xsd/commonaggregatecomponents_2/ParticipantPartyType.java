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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.InitiatingPartyIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PrivatePartyIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PublicPartyIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ServiceProviderPartyIndicatorType;
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
 * <p>Classe Java per ParticipantPartyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ParticipantPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InitiatingPartyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrivatePartyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PublicPartyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ServiceProviderPartyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LegalContact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TechnicalContact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupportContact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CommercialContact" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantPartyType", propOrder = {
    "initiatingPartyIndicator",
    "privatePartyIndicator",
    "publicPartyIndicator",
    "serviceProviderPartyIndicator",
    "party",
    "legalContact",
    "technicalContact",
    "supportContact",
    "commercialContact"
})
public class ParticipantPartyType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "InitiatingPartyIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InitiatingPartyIndicatorType initiatingPartyIndicator;
    @XmlElement(name = "PrivatePartyIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PrivatePartyIndicatorType privatePartyIndicator;
    @XmlElement(name = "PublicPartyIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PublicPartyIndicatorType publicPartyIndicator;
    @XmlElement(name = "ServiceProviderPartyIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ServiceProviderPartyIndicatorType serviceProviderPartyIndicator;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;
    @XmlElement(name = "LegalContact")
    protected ContactType legalContact;
    @XmlElement(name = "TechnicalContact")
    protected ContactType technicalContact;
    @XmlElement(name = "SupportContact")
    protected ContactType supportContact;
    @XmlElement(name = "CommercialContact")
    protected ContactType commercialContact;

    /**
     * Recupera il valore della proprietà initiatingPartyIndicator.
     * 
     * @return
     *     possible object is
     *     {@link InitiatingPartyIndicatorType }
     *     
     */
    public InitiatingPartyIndicatorType getInitiatingPartyIndicator() {
        return initiatingPartyIndicator;
    }

    /**
     * Imposta il valore della proprietà initiatingPartyIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link InitiatingPartyIndicatorType }
     *     
     */
    public void setInitiatingPartyIndicator(InitiatingPartyIndicatorType value) {
        this.initiatingPartyIndicator = value;
    }

    /**
     * Recupera il valore della proprietà privatePartyIndicator.
     * 
     * @return
     *     possible object is
     *     {@link PrivatePartyIndicatorType }
     *     
     */
    public PrivatePartyIndicatorType getPrivatePartyIndicator() {
        return privatePartyIndicator;
    }

    /**
     * Imposta il valore della proprietà privatePartyIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivatePartyIndicatorType }
     *     
     */
    public void setPrivatePartyIndicator(PrivatePartyIndicatorType value) {
        this.privatePartyIndicator = value;
    }

    /**
     * Recupera il valore della proprietà publicPartyIndicator.
     * 
     * @return
     *     possible object is
     *     {@link PublicPartyIndicatorType }
     *     
     */
    public PublicPartyIndicatorType getPublicPartyIndicator() {
        return publicPartyIndicator;
    }

    /**
     * Imposta il valore della proprietà publicPartyIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicPartyIndicatorType }
     *     
     */
    public void setPublicPartyIndicator(PublicPartyIndicatorType value) {
        this.publicPartyIndicator = value;
    }

    /**
     * Recupera il valore della proprietà serviceProviderPartyIndicator.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProviderPartyIndicatorType }
     *     
     */
    public ServiceProviderPartyIndicatorType getServiceProviderPartyIndicator() {
        return serviceProviderPartyIndicator;
    }

    /**
     * Imposta il valore della proprietà serviceProviderPartyIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProviderPartyIndicatorType }
     *     
     */
    public void setServiceProviderPartyIndicator(ServiceProviderPartyIndicatorType value) {
        this.serviceProviderPartyIndicator = value;
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
     * Recupera il valore della proprietà legalContact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getLegalContact() {
        return legalContact;
    }

    /**
     * Imposta il valore della proprietà legalContact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setLegalContact(ContactType value) {
        this.legalContact = value;
    }

    /**
     * Recupera il valore della proprietà technicalContact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getTechnicalContact() {
        return technicalContact;
    }

    /**
     * Imposta il valore della proprietà technicalContact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setTechnicalContact(ContactType value) {
        this.technicalContact = value;
    }

    /**
     * Recupera il valore della proprietà supportContact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getSupportContact() {
        return supportContact;
    }

    /**
     * Imposta il valore della proprietà supportContact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setSupportContact(ContactType value) {
        this.supportContact = value;
    }

    /**
     * Recupera il valore della proprietà commercialContact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getCommercialContact() {
        return commercialContact;
    }

    /**
     * Imposta il valore della proprietà commercialContact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setCommercialContact(ContactType value) {
        this.commercialContact = value;
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
            InitiatingPartyIndicatorType theInitiatingPartyIndicator;
            theInitiatingPartyIndicator = this.getInitiatingPartyIndicator();
            strategy.appendField(locator, this, "initiatingPartyIndicator", buffer, theInitiatingPartyIndicator, (this.initiatingPartyIndicator!= null));
        }
        {
            PrivatePartyIndicatorType thePrivatePartyIndicator;
            thePrivatePartyIndicator = this.getPrivatePartyIndicator();
            strategy.appendField(locator, this, "privatePartyIndicator", buffer, thePrivatePartyIndicator, (this.privatePartyIndicator!= null));
        }
        {
            PublicPartyIndicatorType thePublicPartyIndicator;
            thePublicPartyIndicator = this.getPublicPartyIndicator();
            strategy.appendField(locator, this, "publicPartyIndicator", buffer, thePublicPartyIndicator, (this.publicPartyIndicator!= null));
        }
        {
            ServiceProviderPartyIndicatorType theServiceProviderPartyIndicator;
            theServiceProviderPartyIndicator = this.getServiceProviderPartyIndicator();
            strategy.appendField(locator, this, "serviceProviderPartyIndicator", buffer, theServiceProviderPartyIndicator, (this.serviceProviderPartyIndicator!= null));
        }
        {
            PartyType theParty;
            theParty = this.getParty();
            strategy.appendField(locator, this, "party", buffer, theParty, (this.party!= null));
        }
        {
            ContactType theLegalContact;
            theLegalContact = this.getLegalContact();
            strategy.appendField(locator, this, "legalContact", buffer, theLegalContact, (this.legalContact!= null));
        }
        {
            ContactType theTechnicalContact;
            theTechnicalContact = this.getTechnicalContact();
            strategy.appendField(locator, this, "technicalContact", buffer, theTechnicalContact, (this.technicalContact!= null));
        }
        {
            ContactType theSupportContact;
            theSupportContact = this.getSupportContact();
            strategy.appendField(locator, this, "supportContact", buffer, theSupportContact, (this.supportContact!= null));
        }
        {
            ContactType theCommercialContact;
            theCommercialContact = this.getCommercialContact();
            strategy.appendField(locator, this, "commercialContact", buffer, theCommercialContact, (this.commercialContact!= null));
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
        final ParticipantPartyType that = ((ParticipantPartyType) object);
        {
            InitiatingPartyIndicatorType lhsInitiatingPartyIndicator;
            lhsInitiatingPartyIndicator = this.getInitiatingPartyIndicator();
            InitiatingPartyIndicatorType rhsInitiatingPartyIndicator;
            rhsInitiatingPartyIndicator = that.getInitiatingPartyIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "initiatingPartyIndicator", lhsInitiatingPartyIndicator), LocatorUtils.property(thatLocator, "initiatingPartyIndicator", rhsInitiatingPartyIndicator), lhsInitiatingPartyIndicator, rhsInitiatingPartyIndicator, (this.initiatingPartyIndicator!= null), (that.initiatingPartyIndicator!= null))) {
                return false;
            }
        }
        {
            PrivatePartyIndicatorType lhsPrivatePartyIndicator;
            lhsPrivatePartyIndicator = this.getPrivatePartyIndicator();
            PrivatePartyIndicatorType rhsPrivatePartyIndicator;
            rhsPrivatePartyIndicator = that.getPrivatePartyIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "privatePartyIndicator", lhsPrivatePartyIndicator), LocatorUtils.property(thatLocator, "privatePartyIndicator", rhsPrivatePartyIndicator), lhsPrivatePartyIndicator, rhsPrivatePartyIndicator, (this.privatePartyIndicator!= null), (that.privatePartyIndicator!= null))) {
                return false;
            }
        }
        {
            PublicPartyIndicatorType lhsPublicPartyIndicator;
            lhsPublicPartyIndicator = this.getPublicPartyIndicator();
            PublicPartyIndicatorType rhsPublicPartyIndicator;
            rhsPublicPartyIndicator = that.getPublicPartyIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publicPartyIndicator", lhsPublicPartyIndicator), LocatorUtils.property(thatLocator, "publicPartyIndicator", rhsPublicPartyIndicator), lhsPublicPartyIndicator, rhsPublicPartyIndicator, (this.publicPartyIndicator!= null), (that.publicPartyIndicator!= null))) {
                return false;
            }
        }
        {
            ServiceProviderPartyIndicatorType lhsServiceProviderPartyIndicator;
            lhsServiceProviderPartyIndicator = this.getServiceProviderPartyIndicator();
            ServiceProviderPartyIndicatorType rhsServiceProviderPartyIndicator;
            rhsServiceProviderPartyIndicator = that.getServiceProviderPartyIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceProviderPartyIndicator", lhsServiceProviderPartyIndicator), LocatorUtils.property(thatLocator, "serviceProviderPartyIndicator", rhsServiceProviderPartyIndicator), lhsServiceProviderPartyIndicator, rhsServiceProviderPartyIndicator, (this.serviceProviderPartyIndicator!= null), (that.serviceProviderPartyIndicator!= null))) {
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
            ContactType lhsLegalContact;
            lhsLegalContact = this.getLegalContact();
            ContactType rhsLegalContact;
            rhsLegalContact = that.getLegalContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legalContact", lhsLegalContact), LocatorUtils.property(thatLocator, "legalContact", rhsLegalContact), lhsLegalContact, rhsLegalContact, (this.legalContact!= null), (that.legalContact!= null))) {
                return false;
            }
        }
        {
            ContactType lhsTechnicalContact;
            lhsTechnicalContact = this.getTechnicalContact();
            ContactType rhsTechnicalContact;
            rhsTechnicalContact = that.getTechnicalContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "technicalContact", lhsTechnicalContact), LocatorUtils.property(thatLocator, "technicalContact", rhsTechnicalContact), lhsTechnicalContact, rhsTechnicalContact, (this.technicalContact!= null), (that.technicalContact!= null))) {
                return false;
            }
        }
        {
            ContactType lhsSupportContact;
            lhsSupportContact = this.getSupportContact();
            ContactType rhsSupportContact;
            rhsSupportContact = that.getSupportContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supportContact", lhsSupportContact), LocatorUtils.property(thatLocator, "supportContact", rhsSupportContact), lhsSupportContact, rhsSupportContact, (this.supportContact!= null), (that.supportContact!= null))) {
                return false;
            }
        }
        {
            ContactType lhsCommercialContact;
            lhsCommercialContact = this.getCommercialContact();
            ContactType rhsCommercialContact;
            rhsCommercialContact = that.getCommercialContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commercialContact", lhsCommercialContact), LocatorUtils.property(thatLocator, "commercialContact", rhsCommercialContact), lhsCommercialContact, rhsCommercialContact, (this.commercialContact!= null), (that.commercialContact!= null))) {
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
            InitiatingPartyIndicatorType theInitiatingPartyIndicator;
            theInitiatingPartyIndicator = this.getInitiatingPartyIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "initiatingPartyIndicator", theInitiatingPartyIndicator), currentHashCode, theInitiatingPartyIndicator, (this.initiatingPartyIndicator!= null));
        }
        {
            PrivatePartyIndicatorType thePrivatePartyIndicator;
            thePrivatePartyIndicator = this.getPrivatePartyIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "privatePartyIndicator", thePrivatePartyIndicator), currentHashCode, thePrivatePartyIndicator, (this.privatePartyIndicator!= null));
        }
        {
            PublicPartyIndicatorType thePublicPartyIndicator;
            thePublicPartyIndicator = this.getPublicPartyIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "publicPartyIndicator", thePublicPartyIndicator), currentHashCode, thePublicPartyIndicator, (this.publicPartyIndicator!= null));
        }
        {
            ServiceProviderPartyIndicatorType theServiceProviderPartyIndicator;
            theServiceProviderPartyIndicator = this.getServiceProviderPartyIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceProviderPartyIndicator", theServiceProviderPartyIndicator), currentHashCode, theServiceProviderPartyIndicator, (this.serviceProviderPartyIndicator!= null));
        }
        {
            PartyType theParty;
            theParty = this.getParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "party", theParty), currentHashCode, theParty, (this.party!= null));
        }
        {
            ContactType theLegalContact;
            theLegalContact = this.getLegalContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legalContact", theLegalContact), currentHashCode, theLegalContact, (this.legalContact!= null));
        }
        {
            ContactType theTechnicalContact;
            theTechnicalContact = this.getTechnicalContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "technicalContact", theTechnicalContact), currentHashCode, theTechnicalContact, (this.technicalContact!= null));
        }
        {
            ContactType theSupportContact;
            theSupportContact = this.getSupportContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supportContact", theSupportContact), currentHashCode, theSupportContact, (this.supportContact!= null));
        }
        {
            ContactType theCommercialContact;
            theCommercialContact = this.getCommercialContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "commercialContact", theCommercialContact), currentHashCode, theCommercialContact, (this.commercialContact!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
