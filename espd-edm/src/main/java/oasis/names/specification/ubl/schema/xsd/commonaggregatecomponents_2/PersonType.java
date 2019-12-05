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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BirthDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BirthplaceNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FamilyNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FirstNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GenderCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.JobTitleType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MiddleNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameSuffixType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NationalityIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OrganizationDepartmentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OtherNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RoleCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TitleType;
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
 * <p>Classe Java per PersonType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FirstName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FamilyName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Title" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MiddleName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OtherName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NameSuffix" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}JobTitle" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NationalityID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GenderCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BirthDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BirthplaceName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrganizationDepartment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoleCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CitizenshipCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancialAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}IdentityDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ResidenceAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
    "id",
    "firstName",
    "familyName",
    "title",
    "middleName",
    "otherName",
    "nameSuffix",
    "jobTitle",
    "nationalityID",
    "genderCode",
    "birthDate",
    "birthplaceName",
    "organizationDepartment",
    "roleCode",
    "citizenshipCountry",
    "contact",
    "financialAccount",
    "identityDocumentReference",
    "residenceAddress"
})
public class PersonType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "FirstName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FirstNameType firstName;
    @XmlElement(name = "FamilyName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FamilyNameType familyName;
    @XmlElement(name = "Title", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TitleType title;
    @XmlElement(name = "MiddleName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MiddleNameType middleName;
    @XmlElement(name = "OtherName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OtherNameType otherName;
    @XmlElement(name = "NameSuffix", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameSuffixType nameSuffix;
    @XmlElement(name = "JobTitle", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected JobTitleType jobTitle;
    @XmlElement(name = "NationalityID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NationalityIDType nationalityID;
    @XmlElement(name = "GenderCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GenderCodeType genderCode;
    @XmlElement(name = "BirthDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BirthDateType birthDate;
    @XmlElement(name = "BirthplaceName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BirthplaceNameType birthplaceName;
    @XmlElement(name = "OrganizationDepartment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OrganizationDepartmentType organizationDepartment;
    @XmlElement(name = "RoleCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RoleCodeType roleCode;
    @XmlElement(name = "CitizenshipCountry")
    protected CountryType citizenshipCountry;
    @XmlElement(name = "Contact")
    protected ContactType contact;
    @XmlElement(name = "FinancialAccount")
    protected FinancialAccountType financialAccount;
    @XmlElement(name = "IdentityDocumentReference")
    protected List<DocumentReferenceType> identityDocumentReference;
    @XmlElement(name = "ResidenceAddress")
    protected AddressType residenceAddress;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà firstName.
     * 
     * @return
     *     possible object is
     *     {@link FirstNameType }
     *     
     */
    public FirstNameType getFirstName() {
        return firstName;
    }

    /**
     * Imposta il valore della proprietà firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstNameType }
     *     
     */
    public void setFirstName(FirstNameType value) {
        this.firstName = value;
    }

    /**
     * Recupera il valore della proprietà familyName.
     * 
     * @return
     *     possible object is
     *     {@link FamilyNameType }
     *     
     */
    public FamilyNameType getFamilyName() {
        return familyName;
    }

    /**
     * Imposta il valore della proprietà familyName.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyNameType }
     *     
     */
    public void setFamilyName(FamilyNameType value) {
        this.familyName = value;
    }

    /**
     * Recupera il valore della proprietà title.
     * 
     * @return
     *     possible object is
     *     {@link TitleType }
     *     
     */
    public TitleType getTitle() {
        return title;
    }

    /**
     * Imposta il valore della proprietà title.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleType }
     *     
     */
    public void setTitle(TitleType value) {
        this.title = value;
    }

    /**
     * Recupera il valore della proprietà middleName.
     * 
     * @return
     *     possible object is
     *     {@link MiddleNameType }
     *     
     */
    public MiddleNameType getMiddleName() {
        return middleName;
    }

    /**
     * Imposta il valore della proprietà middleName.
     * 
     * @param value
     *     allowed object is
     *     {@link MiddleNameType }
     *     
     */
    public void setMiddleName(MiddleNameType value) {
        this.middleName = value;
    }

    /**
     * Recupera il valore della proprietà otherName.
     * 
     * @return
     *     possible object is
     *     {@link OtherNameType }
     *     
     */
    public OtherNameType getOtherName() {
        return otherName;
    }

    /**
     * Imposta il valore della proprietà otherName.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherNameType }
     *     
     */
    public void setOtherName(OtherNameType value) {
        this.otherName = value;
    }

    /**
     * Recupera il valore della proprietà nameSuffix.
     * 
     * @return
     *     possible object is
     *     {@link NameSuffixType }
     *     
     */
    public NameSuffixType getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Imposta il valore della proprietà nameSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link NameSuffixType }
     *     
     */
    public void setNameSuffix(NameSuffixType value) {
        this.nameSuffix = value;
    }

    /**
     * Recupera il valore della proprietà jobTitle.
     * 
     * @return
     *     possible object is
     *     {@link JobTitleType }
     *     
     */
    public JobTitleType getJobTitle() {
        return jobTitle;
    }

    /**
     * Imposta il valore della proprietà jobTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link JobTitleType }
     *     
     */
    public void setJobTitle(JobTitleType value) {
        this.jobTitle = value;
    }

    /**
     * Recupera il valore della proprietà nationalityID.
     * 
     * @return
     *     possible object is
     *     {@link NationalityIDType }
     *     
     */
    public NationalityIDType getNationalityID() {
        return nationalityID;
    }

    /**
     * Imposta il valore della proprietà nationalityID.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalityIDType }
     *     
     */
    public void setNationalityID(NationalityIDType value) {
        this.nationalityID = value;
    }

    /**
     * Recupera il valore della proprietà genderCode.
     * 
     * @return
     *     possible object is
     *     {@link GenderCodeType }
     *     
     */
    public GenderCodeType getGenderCode() {
        return genderCode;
    }

    /**
     * Imposta il valore della proprietà genderCode.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCodeType }
     *     
     */
    public void setGenderCode(GenderCodeType value) {
        this.genderCode = value;
    }

    /**
     * Recupera il valore della proprietà birthDate.
     * 
     * @return
     *     possible object is
     *     {@link BirthDateType }
     *     
     */
    public BirthDateType getBirthDate() {
        return birthDate;
    }

    /**
     * Imposta il valore della proprietà birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDateType }
     *     
     */
    public void setBirthDate(BirthDateType value) {
        this.birthDate = value;
    }

    /**
     * Recupera il valore della proprietà birthplaceName.
     * 
     * @return
     *     possible object is
     *     {@link BirthplaceNameType }
     *     
     */
    public BirthplaceNameType getBirthplaceName() {
        return birthplaceName;
    }

    /**
     * Imposta il valore della proprietà birthplaceName.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthplaceNameType }
     *     
     */
    public void setBirthplaceName(BirthplaceNameType value) {
        this.birthplaceName = value;
    }

    /**
     * Recupera il valore della proprietà organizationDepartment.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDepartmentType }
     *     
     */
    public OrganizationDepartmentType getOrganizationDepartment() {
        return organizationDepartment;
    }

    /**
     * Imposta il valore della proprietà organizationDepartment.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDepartmentType }
     *     
     */
    public void setOrganizationDepartment(OrganizationDepartmentType value) {
        this.organizationDepartment = value;
    }

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
     * Recupera il valore della proprietà citizenshipCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCitizenshipCountry() {
        return citizenshipCountry;
    }

    /**
     * Imposta il valore della proprietà citizenshipCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCitizenshipCountry(CountryType value) {
        this.citizenshipCountry = value;
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
     * Gets the value of the identityDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identityDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getIdentityDocumentReference() {
        if (identityDocumentReference == null) {
            identityDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.identityDocumentReference;
    }

    /**
     * Recupera il valore della proprietà residenceAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getResidenceAddress() {
        return residenceAddress;
    }

    /**
     * Imposta il valore della proprietà residenceAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setResidenceAddress(AddressType value) {
        this.residenceAddress = value;
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
            IDType theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID, (this.id!= null));
        }
        {
            FirstNameType theFirstName;
            theFirstName = this.getFirstName();
            strategy.appendField(locator, this, "firstName", buffer, theFirstName, (this.firstName!= null));
        }
        {
            FamilyNameType theFamilyName;
            theFamilyName = this.getFamilyName();
            strategy.appendField(locator, this, "familyName", buffer, theFamilyName, (this.familyName!= null));
        }
        {
            TitleType theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle, (this.title!= null));
        }
        {
            MiddleNameType theMiddleName;
            theMiddleName = this.getMiddleName();
            strategy.appendField(locator, this, "middleName", buffer, theMiddleName, (this.middleName!= null));
        }
        {
            OtherNameType theOtherName;
            theOtherName = this.getOtherName();
            strategy.appendField(locator, this, "otherName", buffer, theOtherName, (this.otherName!= null));
        }
        {
            NameSuffixType theNameSuffix;
            theNameSuffix = this.getNameSuffix();
            strategy.appendField(locator, this, "nameSuffix", buffer, theNameSuffix, (this.nameSuffix!= null));
        }
        {
            JobTitleType theJobTitle;
            theJobTitle = this.getJobTitle();
            strategy.appendField(locator, this, "jobTitle", buffer, theJobTitle, (this.jobTitle!= null));
        }
        {
            NationalityIDType theNationalityID;
            theNationalityID = this.getNationalityID();
            strategy.appendField(locator, this, "nationalityID", buffer, theNationalityID, (this.nationalityID!= null));
        }
        {
            GenderCodeType theGenderCode;
            theGenderCode = this.getGenderCode();
            strategy.appendField(locator, this, "genderCode", buffer, theGenderCode, (this.genderCode!= null));
        }
        {
            BirthDateType theBirthDate;
            theBirthDate = this.getBirthDate();
            strategy.appendField(locator, this, "birthDate", buffer, theBirthDate, (this.birthDate!= null));
        }
        {
            BirthplaceNameType theBirthplaceName;
            theBirthplaceName = this.getBirthplaceName();
            strategy.appendField(locator, this, "birthplaceName", buffer, theBirthplaceName, (this.birthplaceName!= null));
        }
        {
            OrganizationDepartmentType theOrganizationDepartment;
            theOrganizationDepartment = this.getOrganizationDepartment();
            strategy.appendField(locator, this, "organizationDepartment", buffer, theOrganizationDepartment, (this.organizationDepartment!= null));
        }
        {
            RoleCodeType theRoleCode;
            theRoleCode = this.getRoleCode();
            strategy.appendField(locator, this, "roleCode", buffer, theRoleCode, (this.roleCode!= null));
        }
        {
            CountryType theCitizenshipCountry;
            theCitizenshipCountry = this.getCitizenshipCountry();
            strategy.appendField(locator, this, "citizenshipCountry", buffer, theCitizenshipCountry, (this.citizenshipCountry!= null));
        }
        {
            ContactType theContact;
            theContact = this.getContact();
            strategy.appendField(locator, this, "contact", buffer, theContact, (this.contact!= null));
        }
        {
            FinancialAccountType theFinancialAccount;
            theFinancialAccount = this.getFinancialAccount();
            strategy.appendField(locator, this, "financialAccount", buffer, theFinancialAccount, (this.financialAccount!= null));
        }
        {
            List<DocumentReferenceType> theIdentityDocumentReference;
            theIdentityDocumentReference = (((this.identityDocumentReference!= null)&&(!this.identityDocumentReference.isEmpty()))?this.getIdentityDocumentReference():null);
            strategy.appendField(locator, this, "identityDocumentReference", buffer, theIdentityDocumentReference, ((this.identityDocumentReference!= null)&&(!this.identityDocumentReference.isEmpty())));
        }
        {
            AddressType theResidenceAddress;
            theResidenceAddress = this.getResidenceAddress();
            strategy.appendField(locator, this, "residenceAddress", buffer, theResidenceAddress, (this.residenceAddress!= null));
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
        final PersonType that = ((PersonType) object);
        {
            IDType lhsID;
            lhsID = this.getID();
            IDType rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            FirstNameType lhsFirstName;
            lhsFirstName = this.getFirstName();
            FirstNameType rhsFirstName;
            rhsFirstName = that.getFirstName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstName", lhsFirstName), LocatorUtils.property(thatLocator, "firstName", rhsFirstName), lhsFirstName, rhsFirstName, (this.firstName!= null), (that.firstName!= null))) {
                return false;
            }
        }
        {
            FamilyNameType lhsFamilyName;
            lhsFamilyName = this.getFamilyName();
            FamilyNameType rhsFamilyName;
            rhsFamilyName = that.getFamilyName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "familyName", lhsFamilyName), LocatorUtils.property(thatLocator, "familyName", rhsFamilyName), lhsFamilyName, rhsFamilyName, (this.familyName!= null), (that.familyName!= null))) {
                return false;
            }
        }
        {
            TitleType lhsTitle;
            lhsTitle = this.getTitle();
            TitleType rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle, (this.title!= null), (that.title!= null))) {
                return false;
            }
        }
        {
            MiddleNameType lhsMiddleName;
            lhsMiddleName = this.getMiddleName();
            MiddleNameType rhsMiddleName;
            rhsMiddleName = that.getMiddleName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "middleName", lhsMiddleName), LocatorUtils.property(thatLocator, "middleName", rhsMiddleName), lhsMiddleName, rhsMiddleName, (this.middleName!= null), (that.middleName!= null))) {
                return false;
            }
        }
        {
            OtherNameType lhsOtherName;
            lhsOtherName = this.getOtherName();
            OtherNameType rhsOtherName;
            rhsOtherName = that.getOtherName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherName", lhsOtherName), LocatorUtils.property(thatLocator, "otherName", rhsOtherName), lhsOtherName, rhsOtherName, (this.otherName!= null), (that.otherName!= null))) {
                return false;
            }
        }
        {
            NameSuffixType lhsNameSuffix;
            lhsNameSuffix = this.getNameSuffix();
            NameSuffixType rhsNameSuffix;
            rhsNameSuffix = that.getNameSuffix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameSuffix", lhsNameSuffix), LocatorUtils.property(thatLocator, "nameSuffix", rhsNameSuffix), lhsNameSuffix, rhsNameSuffix, (this.nameSuffix!= null), (that.nameSuffix!= null))) {
                return false;
            }
        }
        {
            JobTitleType lhsJobTitle;
            lhsJobTitle = this.getJobTitle();
            JobTitleType rhsJobTitle;
            rhsJobTitle = that.getJobTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jobTitle", lhsJobTitle), LocatorUtils.property(thatLocator, "jobTitle", rhsJobTitle), lhsJobTitle, rhsJobTitle, (this.jobTitle!= null), (that.jobTitle!= null))) {
                return false;
            }
        }
        {
            NationalityIDType lhsNationalityID;
            lhsNationalityID = this.getNationalityID();
            NationalityIDType rhsNationalityID;
            rhsNationalityID = that.getNationalityID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nationalityID", lhsNationalityID), LocatorUtils.property(thatLocator, "nationalityID", rhsNationalityID), lhsNationalityID, rhsNationalityID, (this.nationalityID!= null), (that.nationalityID!= null))) {
                return false;
            }
        }
        {
            GenderCodeType lhsGenderCode;
            lhsGenderCode = this.getGenderCode();
            GenderCodeType rhsGenderCode;
            rhsGenderCode = that.getGenderCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "genderCode", lhsGenderCode), LocatorUtils.property(thatLocator, "genderCode", rhsGenderCode), lhsGenderCode, rhsGenderCode, (this.genderCode!= null), (that.genderCode!= null))) {
                return false;
            }
        }
        {
            BirthDateType lhsBirthDate;
            lhsBirthDate = this.getBirthDate();
            BirthDateType rhsBirthDate;
            rhsBirthDate = that.getBirthDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "birthDate", lhsBirthDate), LocatorUtils.property(thatLocator, "birthDate", rhsBirthDate), lhsBirthDate, rhsBirthDate, (this.birthDate!= null), (that.birthDate!= null))) {
                return false;
            }
        }
        {
            BirthplaceNameType lhsBirthplaceName;
            lhsBirthplaceName = this.getBirthplaceName();
            BirthplaceNameType rhsBirthplaceName;
            rhsBirthplaceName = that.getBirthplaceName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "birthplaceName", lhsBirthplaceName), LocatorUtils.property(thatLocator, "birthplaceName", rhsBirthplaceName), lhsBirthplaceName, rhsBirthplaceName, (this.birthplaceName!= null), (that.birthplaceName!= null))) {
                return false;
            }
        }
        {
            OrganizationDepartmentType lhsOrganizationDepartment;
            lhsOrganizationDepartment = this.getOrganizationDepartment();
            OrganizationDepartmentType rhsOrganizationDepartment;
            rhsOrganizationDepartment = that.getOrganizationDepartment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organizationDepartment", lhsOrganizationDepartment), LocatorUtils.property(thatLocator, "organizationDepartment", rhsOrganizationDepartment), lhsOrganizationDepartment, rhsOrganizationDepartment, (this.organizationDepartment!= null), (that.organizationDepartment!= null))) {
                return false;
            }
        }
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
            CountryType lhsCitizenshipCountry;
            lhsCitizenshipCountry = this.getCitizenshipCountry();
            CountryType rhsCitizenshipCountry;
            rhsCitizenshipCountry = that.getCitizenshipCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "citizenshipCountry", lhsCitizenshipCountry), LocatorUtils.property(thatLocator, "citizenshipCountry", rhsCitizenshipCountry), lhsCitizenshipCountry, rhsCitizenshipCountry, (this.citizenshipCountry!= null), (that.citizenshipCountry!= null))) {
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
            FinancialAccountType lhsFinancialAccount;
            lhsFinancialAccount = this.getFinancialAccount();
            FinancialAccountType rhsFinancialAccount;
            rhsFinancialAccount = that.getFinancialAccount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financialAccount", lhsFinancialAccount), LocatorUtils.property(thatLocator, "financialAccount", rhsFinancialAccount), lhsFinancialAccount, rhsFinancialAccount, (this.financialAccount!= null), (that.financialAccount!= null))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsIdentityDocumentReference;
            lhsIdentityDocumentReference = (((this.identityDocumentReference!= null)&&(!this.identityDocumentReference.isEmpty()))?this.getIdentityDocumentReference():null);
            List<DocumentReferenceType> rhsIdentityDocumentReference;
            rhsIdentityDocumentReference = (((that.identityDocumentReference!= null)&&(!that.identityDocumentReference.isEmpty()))?that.getIdentityDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identityDocumentReference", lhsIdentityDocumentReference), LocatorUtils.property(thatLocator, "identityDocumentReference", rhsIdentityDocumentReference), lhsIdentityDocumentReference, rhsIdentityDocumentReference, ((this.identityDocumentReference!= null)&&(!this.identityDocumentReference.isEmpty())), ((that.identityDocumentReference!= null)&&(!that.identityDocumentReference.isEmpty())))) {
                return false;
            }
        }
        {
            AddressType lhsResidenceAddress;
            lhsResidenceAddress = this.getResidenceAddress();
            AddressType rhsResidenceAddress;
            rhsResidenceAddress = that.getResidenceAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "residenceAddress", lhsResidenceAddress), LocatorUtils.property(thatLocator, "residenceAddress", rhsResidenceAddress), lhsResidenceAddress, rhsResidenceAddress, (this.residenceAddress!= null), (that.residenceAddress!= null))) {
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
            IDType theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID, (this.id!= null));
        }
        {
            FirstNameType theFirstName;
            theFirstName = this.getFirstName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firstName", theFirstName), currentHashCode, theFirstName, (this.firstName!= null));
        }
        {
            FamilyNameType theFamilyName;
            theFamilyName = this.getFamilyName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "familyName", theFamilyName), currentHashCode, theFamilyName, (this.familyName!= null));
        }
        {
            TitleType theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle, (this.title!= null));
        }
        {
            MiddleNameType theMiddleName;
            theMiddleName = this.getMiddleName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "middleName", theMiddleName), currentHashCode, theMiddleName, (this.middleName!= null));
        }
        {
            OtherNameType theOtherName;
            theOtherName = this.getOtherName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherName", theOtherName), currentHashCode, theOtherName, (this.otherName!= null));
        }
        {
            NameSuffixType theNameSuffix;
            theNameSuffix = this.getNameSuffix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameSuffix", theNameSuffix), currentHashCode, theNameSuffix, (this.nameSuffix!= null));
        }
        {
            JobTitleType theJobTitle;
            theJobTitle = this.getJobTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jobTitle", theJobTitle), currentHashCode, theJobTitle, (this.jobTitle!= null));
        }
        {
            NationalityIDType theNationalityID;
            theNationalityID = this.getNationalityID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nationalityID", theNationalityID), currentHashCode, theNationalityID, (this.nationalityID!= null));
        }
        {
            GenderCodeType theGenderCode;
            theGenderCode = this.getGenderCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "genderCode", theGenderCode), currentHashCode, theGenderCode, (this.genderCode!= null));
        }
        {
            BirthDateType theBirthDate;
            theBirthDate = this.getBirthDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "birthDate", theBirthDate), currentHashCode, theBirthDate, (this.birthDate!= null));
        }
        {
            BirthplaceNameType theBirthplaceName;
            theBirthplaceName = this.getBirthplaceName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "birthplaceName", theBirthplaceName), currentHashCode, theBirthplaceName, (this.birthplaceName!= null));
        }
        {
            OrganizationDepartmentType theOrganizationDepartment;
            theOrganizationDepartment = this.getOrganizationDepartment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "organizationDepartment", theOrganizationDepartment), currentHashCode, theOrganizationDepartment, (this.organizationDepartment!= null));
        }
        {
            RoleCodeType theRoleCode;
            theRoleCode = this.getRoleCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roleCode", theRoleCode), currentHashCode, theRoleCode, (this.roleCode!= null));
        }
        {
            CountryType theCitizenshipCountry;
            theCitizenshipCountry = this.getCitizenshipCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "citizenshipCountry", theCitizenshipCountry), currentHashCode, theCitizenshipCountry, (this.citizenshipCountry!= null));
        }
        {
            ContactType theContact;
            theContact = this.getContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contact", theContact), currentHashCode, theContact, (this.contact!= null));
        }
        {
            FinancialAccountType theFinancialAccount;
            theFinancialAccount = this.getFinancialAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financialAccount", theFinancialAccount), currentHashCode, theFinancialAccount, (this.financialAccount!= null));
        }
        {
            List<DocumentReferenceType> theIdentityDocumentReference;
            theIdentityDocumentReference = (((this.identityDocumentReference!= null)&&(!this.identityDocumentReference.isEmpty()))?this.getIdentityDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identityDocumentReference", theIdentityDocumentReference), currentHashCode, theIdentityDocumentReference, ((this.identityDocumentReference!= null)&&(!this.identityDocumentReference.isEmpty())));
        }
        {
            AddressType theResidenceAddress;
            theResidenceAddress = this.getResidenceAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "residenceAddress", theResidenceAddress), currentHashCode, theResidenceAddress, (this.residenceAddress!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
