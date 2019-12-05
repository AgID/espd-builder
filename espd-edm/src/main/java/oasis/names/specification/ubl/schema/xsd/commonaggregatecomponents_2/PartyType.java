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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EndpointIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IndustryClassificationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LogoReferenceIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MarkAttentionIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MarkCareIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WebsiteURIType;
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
 * <p>Classe Java per PartyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkCareIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkAttentionIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WebsiteURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LogoReferenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EndpointID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IndustryClassificationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PartyIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PartyName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Language" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PostalAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PhysicalLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PartyTaxScheme" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PartyLegalEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Person" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AgentParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ServiceProviderParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PowerOfAttorney" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancialAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalWebSite" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SocialMediaProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyType", propOrder = {
    "markCareIndicator",
    "markAttentionIndicator",
    "websiteURI",
    "logoReferenceID",
    "endpointID",
    "industryClassificationCode",
    "partyIdentification",
    "partyName",
    "language",
    "postalAddress",
    "physicalLocation",
    "partyTaxScheme",
    "partyLegalEntity",
    "contact",
    "person",
    "agentParty",
    "serviceProviderParty",
    "powerOfAttorney",
    "financialAccount",
    "additionalWebSite",
    "socialMediaProfile"
})
public class PartyType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "MarkCareIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MarkCareIndicatorType markCareIndicator;
    @XmlElement(name = "MarkAttentionIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MarkAttentionIndicatorType markAttentionIndicator;
    @XmlElement(name = "WebsiteURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected WebsiteURIType websiteURI;
    @XmlElement(name = "LogoReferenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LogoReferenceIDType logoReferenceID;
    @XmlElement(name = "EndpointID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EndpointIDType endpointID;
    @XmlElement(name = "IndustryClassificationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IndustryClassificationCodeType industryClassificationCode;
    @XmlElement(name = "PartyIdentification")
    protected List<PartyIdentificationType> partyIdentification;
    @XmlElement(name = "PartyName")
    protected List<PartyNameType> partyName;
    @XmlElement(name = "Language")
    protected LanguageType language;
    @XmlElement(name = "PostalAddress")
    protected AddressType postalAddress;
    @XmlElement(name = "PhysicalLocation")
    protected LocationType physicalLocation;
    @XmlElement(name = "PartyTaxScheme")
    protected List<PartyTaxSchemeType> partyTaxScheme;
    @XmlElement(name = "PartyLegalEntity")
    protected List<PartyLegalEntityType> partyLegalEntity;
    @XmlElement(name = "Contact")
    protected ContactType contact;
    @XmlElement(name = "Person")
    protected List<PersonType> person;
    @XmlElement(name = "AgentParty")
    protected PartyType agentParty;
    @XmlElement(name = "ServiceProviderParty")
    protected List<ServiceProviderPartyType> serviceProviderParty;
    @XmlElement(name = "PowerOfAttorney")
    protected List<PowerOfAttorneyType> powerOfAttorney;
    @XmlElement(name = "FinancialAccount")
    protected FinancialAccountType financialAccount;
    @XmlElement(name = "AdditionalWebSite")
    protected List<WebSiteType> additionalWebSite;
    @XmlElement(name = "SocialMediaProfile")
    protected List<SocialMediaProfileType> socialMediaProfile;

    /**
     * Recupera il valore della proprietà markCareIndicator.
     * 
     * @return
     *     possible object is
     *     {@link MarkCareIndicatorType }
     *     
     */
    public MarkCareIndicatorType getMarkCareIndicator() {
        return markCareIndicator;
    }

    /**
     * Imposta il valore della proprietà markCareIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkCareIndicatorType }
     *     
     */
    public void setMarkCareIndicator(MarkCareIndicatorType value) {
        this.markCareIndicator = value;
    }

    /**
     * Recupera il valore della proprietà markAttentionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link MarkAttentionIndicatorType }
     *     
     */
    public MarkAttentionIndicatorType getMarkAttentionIndicator() {
        return markAttentionIndicator;
    }

    /**
     * Imposta il valore della proprietà markAttentionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkAttentionIndicatorType }
     *     
     */
    public void setMarkAttentionIndicator(MarkAttentionIndicatorType value) {
        this.markAttentionIndicator = value;
    }

    /**
     * Recupera il valore della proprietà websiteURI.
     * 
     * @return
     *     possible object is
     *     {@link WebsiteURIType }
     *     
     */
    public WebsiteURIType getWebsiteURI() {
        return websiteURI;
    }

    /**
     * Imposta il valore della proprietà websiteURI.
     * 
     * @param value
     *     allowed object is
     *     {@link WebsiteURIType }
     *     
     */
    public void setWebsiteURI(WebsiteURIType value) {
        this.websiteURI = value;
    }

    /**
     * Recupera il valore della proprietà logoReferenceID.
     * 
     * @return
     *     possible object is
     *     {@link LogoReferenceIDType }
     *     
     */
    public LogoReferenceIDType getLogoReferenceID() {
        return logoReferenceID;
    }

    /**
     * Imposta il valore della proprietà logoReferenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoReferenceIDType }
     *     
     */
    public void setLogoReferenceID(LogoReferenceIDType value) {
        this.logoReferenceID = value;
    }

    /**
     * Recupera il valore della proprietà endpointID.
     * 
     * @return
     *     possible object is
     *     {@link EndpointIDType }
     *     
     */
    public EndpointIDType getEndpointID() {
        return endpointID;
    }

    /**
     * Imposta il valore della proprietà endpointID.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointIDType }
     *     
     */
    public void setEndpointID(EndpointIDType value) {
        this.endpointID = value;
    }

    /**
     * Recupera il valore della proprietà industryClassificationCode.
     * 
     * @return
     *     possible object is
     *     {@link IndustryClassificationCodeType }
     *     
     */
    public IndustryClassificationCodeType getIndustryClassificationCode() {
        return industryClassificationCode;
    }

    /**
     * Imposta il valore della proprietà industryClassificationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryClassificationCodeType }
     *     
     */
    public void setIndustryClassificationCode(IndustryClassificationCodeType value) {
        this.industryClassificationCode = value;
    }

    /**
     * Gets the value of the partyIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationType }
     * 
     * 
     */
    public List<PartyIdentificationType> getPartyIdentification() {
        if (partyIdentification == null) {
            partyIdentification = new ArrayList<PartyIdentificationType>();
        }
        return this.partyIdentification;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyNameType }
     * 
     * 
     */
    public List<PartyNameType> getPartyName() {
        if (partyName == null) {
            partyName = new ArrayList<PartyNameType>();
        }
        return this.partyName;
    }

    /**
     * Recupera il valore della proprietà language.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getLanguage() {
        return language;
    }

    /**
     * Imposta il valore della proprietà language.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setLanguage(LanguageType value) {
        this.language = value;
    }

    /**
     * Recupera il valore della proprietà postalAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /**
     * Imposta il valore della proprietà postalAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setPostalAddress(AddressType value) {
        this.postalAddress = value;
    }

    /**
     * Recupera il valore della proprietà physicalLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getPhysicalLocation() {
        return physicalLocation;
    }

    /**
     * Imposta il valore della proprietà physicalLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setPhysicalLocation(LocationType value) {
        this.physicalLocation = value;
    }

    /**
     * Gets the value of the partyTaxScheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyTaxScheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyTaxScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTaxSchemeType }
     * 
     * 
     */
    public List<PartyTaxSchemeType> getPartyTaxScheme() {
        if (partyTaxScheme == null) {
            partyTaxScheme = new ArrayList<PartyTaxSchemeType>();
        }
        return this.partyTaxScheme;
    }

    /**
     * Gets the value of the partyLegalEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyLegalEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyLegalEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyLegalEntityType }
     * 
     * 
     */
    public List<PartyLegalEntityType> getPartyLegalEntity() {
        if (partyLegalEntity == null) {
            partyLegalEntity = new ArrayList<PartyLegalEntityType>();
        }
        return this.partyLegalEntity;
    }

    /**
     * Recupera il valore della proprietà contact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContact() {
        return contact;
    }

    /**
     * Imposta il valore della proprietà contact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContact(ContactType value) {
        this.contact = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the person property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getPerson() {
        if (person == null) {
            person = new ArrayList<PersonType>();
        }
        return this.person;
    }

    /**
     * Recupera il valore della proprietà agentParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getAgentParty() {
        return agentParty;
    }

    /**
     * Imposta il valore della proprietà agentParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setAgentParty(PartyType value) {
        this.agentParty = value;
    }

    /**
     * Gets the value of the serviceProviderParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceProviderParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceProviderParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceProviderPartyType }
     * 
     * 
     */
    public List<ServiceProviderPartyType> getServiceProviderParty() {
        if (serviceProviderParty == null) {
            serviceProviderParty = new ArrayList<ServiceProviderPartyType>();
        }
        return this.serviceProviderParty;
    }

    /**
     * Gets the value of the powerOfAttorney property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the powerOfAttorney property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerOfAttorney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerOfAttorneyType }
     * 
     * 
     */
    public List<PowerOfAttorneyType> getPowerOfAttorney() {
        if (powerOfAttorney == null) {
            powerOfAttorney = new ArrayList<PowerOfAttorneyType>();
        }
        return this.powerOfAttorney;
    }

    /**
     * Recupera il valore della proprietà financialAccount.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountType }
     *     
     */
    public FinancialAccountType getFinancialAccount() {
        return financialAccount;
    }

    /**
     * Imposta il valore della proprietà financialAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountType }
     *     
     */
    public void setFinancialAccount(FinancialAccountType value) {
        this.financialAccount = value;
    }

    /**
     * Gets the value of the additionalWebSite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalWebSite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalWebSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebSiteType }
     * 
     * 
     */
    public List<WebSiteType> getAdditionalWebSite() {
        if (additionalWebSite == null) {
            additionalWebSite = new ArrayList<WebSiteType>();
        }
        return this.additionalWebSite;
    }

    /**
     * Gets the value of the socialMediaProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialMediaProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialMediaProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialMediaProfileType }
     * 
     * 
     */
    public List<SocialMediaProfileType> getSocialMediaProfile() {
        if (socialMediaProfile == null) {
            socialMediaProfile = new ArrayList<SocialMediaProfileType>();
        }
        return this.socialMediaProfile;
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
            MarkCareIndicatorType theMarkCareIndicator;
            theMarkCareIndicator = this.getMarkCareIndicator();
            strategy.appendField(locator, this, "markCareIndicator", buffer, theMarkCareIndicator, (this.markCareIndicator!= null));
        }
        {
            MarkAttentionIndicatorType theMarkAttentionIndicator;
            theMarkAttentionIndicator = this.getMarkAttentionIndicator();
            strategy.appendField(locator, this, "markAttentionIndicator", buffer, theMarkAttentionIndicator, (this.markAttentionIndicator!= null));
        }
        {
            WebsiteURIType theWebsiteURI;
            theWebsiteURI = this.getWebsiteURI();
            strategy.appendField(locator, this, "websiteURI", buffer, theWebsiteURI, (this.websiteURI!= null));
        }
        {
            LogoReferenceIDType theLogoReferenceID;
            theLogoReferenceID = this.getLogoReferenceID();
            strategy.appendField(locator, this, "logoReferenceID", buffer, theLogoReferenceID, (this.logoReferenceID!= null));
        }
        {
            EndpointIDType theEndpointID;
            theEndpointID = this.getEndpointID();
            strategy.appendField(locator, this, "endpointID", buffer, theEndpointID, (this.endpointID!= null));
        }
        {
            IndustryClassificationCodeType theIndustryClassificationCode;
            theIndustryClassificationCode = this.getIndustryClassificationCode();
            strategy.appendField(locator, this, "industryClassificationCode", buffer, theIndustryClassificationCode, (this.industryClassificationCode!= null));
        }
        {
            List<PartyIdentificationType> thePartyIdentification;
            thePartyIdentification = (((this.partyIdentification!= null)&&(!this.partyIdentification.isEmpty()))?this.getPartyIdentification():null);
            strategy.appendField(locator, this, "partyIdentification", buffer, thePartyIdentification, ((this.partyIdentification!= null)&&(!this.partyIdentification.isEmpty())));
        }
        {
            List<PartyNameType> thePartyName;
            thePartyName = (((this.partyName!= null)&&(!this.partyName.isEmpty()))?this.getPartyName():null);
            strategy.appendField(locator, this, "partyName", buffer, thePartyName, ((this.partyName!= null)&&(!this.partyName.isEmpty())));
        }
        {
            LanguageType theLanguage;
            theLanguage = this.getLanguage();
            strategy.appendField(locator, this, "language", buffer, theLanguage, (this.language!= null));
        }
        {
            AddressType thePostalAddress;
            thePostalAddress = this.getPostalAddress();
            strategy.appendField(locator, this, "postalAddress", buffer, thePostalAddress, (this.postalAddress!= null));
        }
        {
            LocationType thePhysicalLocation;
            thePhysicalLocation = this.getPhysicalLocation();
            strategy.appendField(locator, this, "physicalLocation", buffer, thePhysicalLocation, (this.physicalLocation!= null));
        }
        {
            List<PartyTaxSchemeType> thePartyTaxScheme;
            thePartyTaxScheme = (((this.partyTaxScheme!= null)&&(!this.partyTaxScheme.isEmpty()))?this.getPartyTaxScheme():null);
            strategy.appendField(locator, this, "partyTaxScheme", buffer, thePartyTaxScheme, ((this.partyTaxScheme!= null)&&(!this.partyTaxScheme.isEmpty())));
        }
        {
            List<PartyLegalEntityType> thePartyLegalEntity;
            thePartyLegalEntity = (((this.partyLegalEntity!= null)&&(!this.partyLegalEntity.isEmpty()))?this.getPartyLegalEntity():null);
            strategy.appendField(locator, this, "partyLegalEntity", buffer, thePartyLegalEntity, ((this.partyLegalEntity!= null)&&(!this.partyLegalEntity.isEmpty())));
        }
        {
            ContactType theContact;
            theContact = this.getContact();
            strategy.appendField(locator, this, "contact", buffer, theContact, (this.contact!= null));
        }
        {
            List<PersonType> thePerson;
            thePerson = (((this.person!= null)&&(!this.person.isEmpty()))?this.getPerson():null);
            strategy.appendField(locator, this, "person", buffer, thePerson, ((this.person!= null)&&(!this.person.isEmpty())));
        }
        {
            PartyType theAgentParty;
            theAgentParty = this.getAgentParty();
            strategy.appendField(locator, this, "agentParty", buffer, theAgentParty, (this.agentParty!= null));
        }
        {
            List<ServiceProviderPartyType> theServiceProviderParty;
            theServiceProviderParty = (((this.serviceProviderParty!= null)&&(!this.serviceProviderParty.isEmpty()))?this.getServiceProviderParty():null);
            strategy.appendField(locator, this, "serviceProviderParty", buffer, theServiceProviderParty, ((this.serviceProviderParty!= null)&&(!this.serviceProviderParty.isEmpty())));
        }
        {
            List<PowerOfAttorneyType> thePowerOfAttorney;
            thePowerOfAttorney = (((this.powerOfAttorney!= null)&&(!this.powerOfAttorney.isEmpty()))?this.getPowerOfAttorney():null);
            strategy.appendField(locator, this, "powerOfAttorney", buffer, thePowerOfAttorney, ((this.powerOfAttorney!= null)&&(!this.powerOfAttorney.isEmpty())));
        }
        {
            FinancialAccountType theFinancialAccount;
            theFinancialAccount = this.getFinancialAccount();
            strategy.appendField(locator, this, "financialAccount", buffer, theFinancialAccount, (this.financialAccount!= null));
        }
        {
            List<WebSiteType> theAdditionalWebSite;
            theAdditionalWebSite = (((this.additionalWebSite!= null)&&(!this.additionalWebSite.isEmpty()))?this.getAdditionalWebSite():null);
            strategy.appendField(locator, this, "additionalWebSite", buffer, theAdditionalWebSite, ((this.additionalWebSite!= null)&&(!this.additionalWebSite.isEmpty())));
        }
        {
            List<SocialMediaProfileType> theSocialMediaProfile;
            theSocialMediaProfile = (((this.socialMediaProfile!= null)&&(!this.socialMediaProfile.isEmpty()))?this.getSocialMediaProfile():null);
            strategy.appendField(locator, this, "socialMediaProfile", buffer, theSocialMediaProfile, ((this.socialMediaProfile!= null)&&(!this.socialMediaProfile.isEmpty())));
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
        final PartyType that = ((PartyType) object);
        {
            MarkCareIndicatorType lhsMarkCareIndicator;
            lhsMarkCareIndicator = this.getMarkCareIndicator();
            MarkCareIndicatorType rhsMarkCareIndicator;
            rhsMarkCareIndicator = that.getMarkCareIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markCareIndicator", lhsMarkCareIndicator), LocatorUtils.property(thatLocator, "markCareIndicator", rhsMarkCareIndicator), lhsMarkCareIndicator, rhsMarkCareIndicator, (this.markCareIndicator!= null), (that.markCareIndicator!= null))) {
                return false;
            }
        }
        {
            MarkAttentionIndicatorType lhsMarkAttentionIndicator;
            lhsMarkAttentionIndicator = this.getMarkAttentionIndicator();
            MarkAttentionIndicatorType rhsMarkAttentionIndicator;
            rhsMarkAttentionIndicator = that.getMarkAttentionIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markAttentionIndicator", lhsMarkAttentionIndicator), LocatorUtils.property(thatLocator, "markAttentionIndicator", rhsMarkAttentionIndicator), lhsMarkAttentionIndicator, rhsMarkAttentionIndicator, (this.markAttentionIndicator!= null), (that.markAttentionIndicator!= null))) {
                return false;
            }
        }
        {
            WebsiteURIType lhsWebsiteURI;
            lhsWebsiteURI = this.getWebsiteURI();
            WebsiteURIType rhsWebsiteURI;
            rhsWebsiteURI = that.getWebsiteURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "websiteURI", lhsWebsiteURI), LocatorUtils.property(thatLocator, "websiteURI", rhsWebsiteURI), lhsWebsiteURI, rhsWebsiteURI, (this.websiteURI!= null), (that.websiteURI!= null))) {
                return false;
            }
        }
        {
            LogoReferenceIDType lhsLogoReferenceID;
            lhsLogoReferenceID = this.getLogoReferenceID();
            LogoReferenceIDType rhsLogoReferenceID;
            rhsLogoReferenceID = that.getLogoReferenceID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logoReferenceID", lhsLogoReferenceID), LocatorUtils.property(thatLocator, "logoReferenceID", rhsLogoReferenceID), lhsLogoReferenceID, rhsLogoReferenceID, (this.logoReferenceID!= null), (that.logoReferenceID!= null))) {
                return false;
            }
        }
        {
            EndpointIDType lhsEndpointID;
            lhsEndpointID = this.getEndpointID();
            EndpointIDType rhsEndpointID;
            rhsEndpointID = that.getEndpointID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endpointID", lhsEndpointID), LocatorUtils.property(thatLocator, "endpointID", rhsEndpointID), lhsEndpointID, rhsEndpointID, (this.endpointID!= null), (that.endpointID!= null))) {
                return false;
            }
        }
        {
            IndustryClassificationCodeType lhsIndustryClassificationCode;
            lhsIndustryClassificationCode = this.getIndustryClassificationCode();
            IndustryClassificationCodeType rhsIndustryClassificationCode;
            rhsIndustryClassificationCode = that.getIndustryClassificationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "industryClassificationCode", lhsIndustryClassificationCode), LocatorUtils.property(thatLocator, "industryClassificationCode", rhsIndustryClassificationCode), lhsIndustryClassificationCode, rhsIndustryClassificationCode, (this.industryClassificationCode!= null), (that.industryClassificationCode!= null))) {
                return false;
            }
        }
        {
            List<PartyIdentificationType> lhsPartyIdentification;
            lhsPartyIdentification = (((this.partyIdentification!= null)&&(!this.partyIdentification.isEmpty()))?this.getPartyIdentification():null);
            List<PartyIdentificationType> rhsPartyIdentification;
            rhsPartyIdentification = (((that.partyIdentification!= null)&&(!that.partyIdentification.isEmpty()))?that.getPartyIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partyIdentification", lhsPartyIdentification), LocatorUtils.property(thatLocator, "partyIdentification", rhsPartyIdentification), lhsPartyIdentification, rhsPartyIdentification, ((this.partyIdentification!= null)&&(!this.partyIdentification.isEmpty())), ((that.partyIdentification!= null)&&(!that.partyIdentification.isEmpty())))) {
                return false;
            }
        }
        {
            List<PartyNameType> lhsPartyName;
            lhsPartyName = (((this.partyName!= null)&&(!this.partyName.isEmpty()))?this.getPartyName():null);
            List<PartyNameType> rhsPartyName;
            rhsPartyName = (((that.partyName!= null)&&(!that.partyName.isEmpty()))?that.getPartyName():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partyName", lhsPartyName), LocatorUtils.property(thatLocator, "partyName", rhsPartyName), lhsPartyName, rhsPartyName, ((this.partyName!= null)&&(!this.partyName.isEmpty())), ((that.partyName!= null)&&(!that.partyName.isEmpty())))) {
                return false;
            }
        }
        {
            LanguageType lhsLanguage;
            lhsLanguage = this.getLanguage();
            LanguageType rhsLanguage;
            rhsLanguage = that.getLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "language", lhsLanguage), LocatorUtils.property(thatLocator, "language", rhsLanguage), lhsLanguage, rhsLanguage, (this.language!= null), (that.language!= null))) {
                return false;
            }
        }
        {
            AddressType lhsPostalAddress;
            lhsPostalAddress = this.getPostalAddress();
            AddressType rhsPostalAddress;
            rhsPostalAddress = that.getPostalAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postalAddress", lhsPostalAddress), LocatorUtils.property(thatLocator, "postalAddress", rhsPostalAddress), lhsPostalAddress, rhsPostalAddress, (this.postalAddress!= null), (that.postalAddress!= null))) {
                return false;
            }
        }
        {
            LocationType lhsPhysicalLocation;
            lhsPhysicalLocation = this.getPhysicalLocation();
            LocationType rhsPhysicalLocation;
            rhsPhysicalLocation = that.getPhysicalLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "physicalLocation", lhsPhysicalLocation), LocatorUtils.property(thatLocator, "physicalLocation", rhsPhysicalLocation), lhsPhysicalLocation, rhsPhysicalLocation, (this.physicalLocation!= null), (that.physicalLocation!= null))) {
                return false;
            }
        }
        {
            List<PartyTaxSchemeType> lhsPartyTaxScheme;
            lhsPartyTaxScheme = (((this.partyTaxScheme!= null)&&(!this.partyTaxScheme.isEmpty()))?this.getPartyTaxScheme():null);
            List<PartyTaxSchemeType> rhsPartyTaxScheme;
            rhsPartyTaxScheme = (((that.partyTaxScheme!= null)&&(!that.partyTaxScheme.isEmpty()))?that.getPartyTaxScheme():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partyTaxScheme", lhsPartyTaxScheme), LocatorUtils.property(thatLocator, "partyTaxScheme", rhsPartyTaxScheme), lhsPartyTaxScheme, rhsPartyTaxScheme, ((this.partyTaxScheme!= null)&&(!this.partyTaxScheme.isEmpty())), ((that.partyTaxScheme!= null)&&(!that.partyTaxScheme.isEmpty())))) {
                return false;
            }
        }
        {
            List<PartyLegalEntityType> lhsPartyLegalEntity;
            lhsPartyLegalEntity = (((this.partyLegalEntity!= null)&&(!this.partyLegalEntity.isEmpty()))?this.getPartyLegalEntity():null);
            List<PartyLegalEntityType> rhsPartyLegalEntity;
            rhsPartyLegalEntity = (((that.partyLegalEntity!= null)&&(!that.partyLegalEntity.isEmpty()))?that.getPartyLegalEntity():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partyLegalEntity", lhsPartyLegalEntity), LocatorUtils.property(thatLocator, "partyLegalEntity", rhsPartyLegalEntity), lhsPartyLegalEntity, rhsPartyLegalEntity, ((this.partyLegalEntity!= null)&&(!this.partyLegalEntity.isEmpty())), ((that.partyLegalEntity!= null)&&(!that.partyLegalEntity.isEmpty())))) {
                return false;
            }
        }
        {
            ContactType lhsContact;
            lhsContact = this.getContact();
            ContactType rhsContact;
            rhsContact = that.getContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contact", lhsContact), LocatorUtils.property(thatLocator, "contact", rhsContact), lhsContact, rhsContact, (this.contact!= null), (that.contact!= null))) {
                return false;
            }
        }
        {
            List<PersonType> lhsPerson;
            lhsPerson = (((this.person!= null)&&(!this.person.isEmpty()))?this.getPerson():null);
            List<PersonType> rhsPerson;
            rhsPerson = (((that.person!= null)&&(!that.person.isEmpty()))?that.getPerson():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "person", lhsPerson), LocatorUtils.property(thatLocator, "person", rhsPerson), lhsPerson, rhsPerson, ((this.person!= null)&&(!this.person.isEmpty())), ((that.person!= null)&&(!that.person.isEmpty())))) {
                return false;
            }
        }
        {
            PartyType lhsAgentParty;
            lhsAgentParty = this.getAgentParty();
            PartyType rhsAgentParty;
            rhsAgentParty = that.getAgentParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agentParty", lhsAgentParty), LocatorUtils.property(thatLocator, "agentParty", rhsAgentParty), lhsAgentParty, rhsAgentParty, (this.agentParty!= null), (that.agentParty!= null))) {
                return false;
            }
        }
        {
            List<ServiceProviderPartyType> lhsServiceProviderParty;
            lhsServiceProviderParty = (((this.serviceProviderParty!= null)&&(!this.serviceProviderParty.isEmpty()))?this.getServiceProviderParty():null);
            List<ServiceProviderPartyType> rhsServiceProviderParty;
            rhsServiceProviderParty = (((that.serviceProviderParty!= null)&&(!that.serviceProviderParty.isEmpty()))?that.getServiceProviderParty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceProviderParty", lhsServiceProviderParty), LocatorUtils.property(thatLocator, "serviceProviderParty", rhsServiceProviderParty), lhsServiceProviderParty, rhsServiceProviderParty, ((this.serviceProviderParty!= null)&&(!this.serviceProviderParty.isEmpty())), ((that.serviceProviderParty!= null)&&(!that.serviceProviderParty.isEmpty())))) {
                return false;
            }
        }
        {
            List<PowerOfAttorneyType> lhsPowerOfAttorney;
            lhsPowerOfAttorney = (((this.powerOfAttorney!= null)&&(!this.powerOfAttorney.isEmpty()))?this.getPowerOfAttorney():null);
            List<PowerOfAttorneyType> rhsPowerOfAttorney;
            rhsPowerOfAttorney = (((that.powerOfAttorney!= null)&&(!that.powerOfAttorney.isEmpty()))?that.getPowerOfAttorney():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "powerOfAttorney", lhsPowerOfAttorney), LocatorUtils.property(thatLocator, "powerOfAttorney", rhsPowerOfAttorney), lhsPowerOfAttorney, rhsPowerOfAttorney, ((this.powerOfAttorney!= null)&&(!this.powerOfAttorney.isEmpty())), ((that.powerOfAttorney!= null)&&(!that.powerOfAttorney.isEmpty())))) {
                return false;
            }
        }
        {
            FinancialAccountType lhsFinancialAccount;
            lhsFinancialAccount = this.getFinancialAccount();
            FinancialAccountType rhsFinancialAccount;
            rhsFinancialAccount = that.getFinancialAccount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financialAccount", lhsFinancialAccount), LocatorUtils.property(thatLocator, "financialAccount", rhsFinancialAccount), lhsFinancialAccount, rhsFinancialAccount, (this.financialAccount!= null), (that.financialAccount!= null))) {
                return false;
            }
        }
        {
            List<WebSiteType> lhsAdditionalWebSite;
            lhsAdditionalWebSite = (((this.additionalWebSite!= null)&&(!this.additionalWebSite.isEmpty()))?this.getAdditionalWebSite():null);
            List<WebSiteType> rhsAdditionalWebSite;
            rhsAdditionalWebSite = (((that.additionalWebSite!= null)&&(!that.additionalWebSite.isEmpty()))?that.getAdditionalWebSite():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalWebSite", lhsAdditionalWebSite), LocatorUtils.property(thatLocator, "additionalWebSite", rhsAdditionalWebSite), lhsAdditionalWebSite, rhsAdditionalWebSite, ((this.additionalWebSite!= null)&&(!this.additionalWebSite.isEmpty())), ((that.additionalWebSite!= null)&&(!that.additionalWebSite.isEmpty())))) {
                return false;
            }
        }
        {
            List<SocialMediaProfileType> lhsSocialMediaProfile;
            lhsSocialMediaProfile = (((this.socialMediaProfile!= null)&&(!this.socialMediaProfile.isEmpty()))?this.getSocialMediaProfile():null);
            List<SocialMediaProfileType> rhsSocialMediaProfile;
            rhsSocialMediaProfile = (((that.socialMediaProfile!= null)&&(!that.socialMediaProfile.isEmpty()))?that.getSocialMediaProfile():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "socialMediaProfile", lhsSocialMediaProfile), LocatorUtils.property(thatLocator, "socialMediaProfile", rhsSocialMediaProfile), lhsSocialMediaProfile, rhsSocialMediaProfile, ((this.socialMediaProfile!= null)&&(!this.socialMediaProfile.isEmpty())), ((that.socialMediaProfile!= null)&&(!that.socialMediaProfile.isEmpty())))) {
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
            MarkCareIndicatorType theMarkCareIndicator;
            theMarkCareIndicator = this.getMarkCareIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markCareIndicator", theMarkCareIndicator), currentHashCode, theMarkCareIndicator, (this.markCareIndicator!= null));
        }
        {
            MarkAttentionIndicatorType theMarkAttentionIndicator;
            theMarkAttentionIndicator = this.getMarkAttentionIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markAttentionIndicator", theMarkAttentionIndicator), currentHashCode, theMarkAttentionIndicator, (this.markAttentionIndicator!= null));
        }
        {
            WebsiteURIType theWebsiteURI;
            theWebsiteURI = this.getWebsiteURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "websiteURI", theWebsiteURI), currentHashCode, theWebsiteURI, (this.websiteURI!= null));
        }
        {
            LogoReferenceIDType theLogoReferenceID;
            theLogoReferenceID = this.getLogoReferenceID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logoReferenceID", theLogoReferenceID), currentHashCode, theLogoReferenceID, (this.logoReferenceID!= null));
        }
        {
            EndpointIDType theEndpointID;
            theEndpointID = this.getEndpointID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endpointID", theEndpointID), currentHashCode, theEndpointID, (this.endpointID!= null));
        }
        {
            IndustryClassificationCodeType theIndustryClassificationCode;
            theIndustryClassificationCode = this.getIndustryClassificationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "industryClassificationCode", theIndustryClassificationCode), currentHashCode, theIndustryClassificationCode, (this.industryClassificationCode!= null));
        }
        {
            List<PartyIdentificationType> thePartyIdentification;
            thePartyIdentification = (((this.partyIdentification!= null)&&(!this.partyIdentification.isEmpty()))?this.getPartyIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyIdentification", thePartyIdentification), currentHashCode, thePartyIdentification, ((this.partyIdentification!= null)&&(!this.partyIdentification.isEmpty())));
        }
        {
            List<PartyNameType> thePartyName;
            thePartyName = (((this.partyName!= null)&&(!this.partyName.isEmpty()))?this.getPartyName():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyName", thePartyName), currentHashCode, thePartyName, ((this.partyName!= null)&&(!this.partyName.isEmpty())));
        }
        {
            LanguageType theLanguage;
            theLanguage = this.getLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "language", theLanguage), currentHashCode, theLanguage, (this.language!= null));
        }
        {
            AddressType thePostalAddress;
            thePostalAddress = this.getPostalAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postalAddress", thePostalAddress), currentHashCode, thePostalAddress, (this.postalAddress!= null));
        }
        {
            LocationType thePhysicalLocation;
            thePhysicalLocation = this.getPhysicalLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "physicalLocation", thePhysicalLocation), currentHashCode, thePhysicalLocation, (this.physicalLocation!= null));
        }
        {
            List<PartyTaxSchemeType> thePartyTaxScheme;
            thePartyTaxScheme = (((this.partyTaxScheme!= null)&&(!this.partyTaxScheme.isEmpty()))?this.getPartyTaxScheme():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyTaxScheme", thePartyTaxScheme), currentHashCode, thePartyTaxScheme, ((this.partyTaxScheme!= null)&&(!this.partyTaxScheme.isEmpty())));
        }
        {
            List<PartyLegalEntityType> thePartyLegalEntity;
            thePartyLegalEntity = (((this.partyLegalEntity!= null)&&(!this.partyLegalEntity.isEmpty()))?this.getPartyLegalEntity():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partyLegalEntity", thePartyLegalEntity), currentHashCode, thePartyLegalEntity, ((this.partyLegalEntity!= null)&&(!this.partyLegalEntity.isEmpty())));
        }
        {
            ContactType theContact;
            theContact = this.getContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contact", theContact), currentHashCode, theContact, (this.contact!= null));
        }
        {
            List<PersonType> thePerson;
            thePerson = (((this.person!= null)&&(!this.person.isEmpty()))?this.getPerson():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "person", thePerson), currentHashCode, thePerson, ((this.person!= null)&&(!this.person.isEmpty())));
        }
        {
            PartyType theAgentParty;
            theAgentParty = this.getAgentParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agentParty", theAgentParty), currentHashCode, theAgentParty, (this.agentParty!= null));
        }
        {
            List<ServiceProviderPartyType> theServiceProviderParty;
            theServiceProviderParty = (((this.serviceProviderParty!= null)&&(!this.serviceProviderParty.isEmpty()))?this.getServiceProviderParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceProviderParty", theServiceProviderParty), currentHashCode, theServiceProviderParty, ((this.serviceProviderParty!= null)&&(!this.serviceProviderParty.isEmpty())));
        }
        {
            List<PowerOfAttorneyType> thePowerOfAttorney;
            thePowerOfAttorney = (((this.powerOfAttorney!= null)&&(!this.powerOfAttorney.isEmpty()))?this.getPowerOfAttorney():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "powerOfAttorney", thePowerOfAttorney), currentHashCode, thePowerOfAttorney, ((this.powerOfAttorney!= null)&&(!this.powerOfAttorney.isEmpty())));
        }
        {
            FinancialAccountType theFinancialAccount;
            theFinancialAccount = this.getFinancialAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financialAccount", theFinancialAccount), currentHashCode, theFinancialAccount, (this.financialAccount!= null));
        }
        {
            List<WebSiteType> theAdditionalWebSite;
            theAdditionalWebSite = (((this.additionalWebSite!= null)&&(!this.additionalWebSite.isEmpty()))?this.getAdditionalWebSite():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalWebSite", theAdditionalWebSite), currentHashCode, theAdditionalWebSite, ((this.additionalWebSite!= null)&&(!this.additionalWebSite.isEmpty())));
        }
        {
            List<SocialMediaProfileType> theSocialMediaProfile;
            theSocialMediaProfile = (((this.socialMediaProfile!= null)&&(!this.socialMediaProfile.isEmpty()))?this.getSocialMediaProfile():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "socialMediaProfile", theSocialMediaProfile), currentHashCode, theSocialMediaProfile, ((this.socialMediaProfile!= null)&&(!this.socialMediaProfile.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
