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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CompanyIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CompanyLegalFormCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CompanyLegalFormType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CompanyLiquidationStatusCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CorporateStockAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FullyPaidSharesIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationExpirationDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SoleProprietorshipIndicatorType;
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
 * <p>Classe Java per PartyLegalEntityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PartyLegalEntityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationExpirationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyLegalFormCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyLegalForm" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SoleProprietorshipIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyLiquidationStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorporateStockAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FullyPaidSharesIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistrationAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CorporateRegistrationScheme" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HeadOfficeParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShareholderParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyLegalEntityType", propOrder = {
    "registrationName",
    "companyID",
    "registrationDate",
    "registrationExpirationDate",
    "companyLegalFormCode",
    "companyLegalForm",
    "soleProprietorshipIndicator",
    "companyLiquidationStatusCode",
    "corporateStockAmount",
    "fullyPaidSharesIndicator",
    "registrationAddress",
    "corporateRegistrationScheme",
    "headOfficeParty",
    "shareholderParty"
})
public class PartyLegalEntityType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "RegistrationName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegistrationNameType registrationName;
    @XmlElement(name = "CompanyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyIDType companyID;
    @XmlElement(name = "RegistrationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegistrationDateType registrationDate;
    @XmlElement(name = "RegistrationExpirationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegistrationExpirationDateType registrationExpirationDate;
    @XmlElement(name = "CompanyLegalFormCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyLegalFormCodeType companyLegalFormCode;
    @XmlElement(name = "CompanyLegalForm", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyLegalFormType companyLegalForm;
    @XmlElement(name = "SoleProprietorshipIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SoleProprietorshipIndicatorType soleProprietorshipIndicator;
    @XmlElement(name = "CompanyLiquidationStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyLiquidationStatusCodeType companyLiquidationStatusCode;
    @XmlElement(name = "CorporateStockAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CorporateStockAmountType corporateStockAmount;
    @XmlElement(name = "FullyPaidSharesIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FullyPaidSharesIndicatorType fullyPaidSharesIndicator;
    @XmlElement(name = "RegistrationAddress")
    protected AddressType registrationAddress;
    @XmlElement(name = "CorporateRegistrationScheme")
    protected CorporateRegistrationSchemeType corporateRegistrationScheme;
    @XmlElement(name = "HeadOfficeParty")
    protected PartyType headOfficeParty;
    @XmlElement(name = "ShareholderParty")
    protected List<ShareholderPartyType> shareholderParty;

    /**
     * Recupera il valore della proprietà registrationName.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationNameType }
     *     
     */
    public RegistrationNameType getRegistrationName() {
        return registrationName;
    }

    /**
     * Imposta il valore della proprietà registrationName.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationNameType }
     *     
     */
    public void setRegistrationName(RegistrationNameType value) {
        this.registrationName = value;
    }

    /**
     * Recupera il valore della proprietà companyID.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIDType }
     *     
     */
    public CompanyIDType getCompanyID() {
        return companyID;
    }

    /**
     * Imposta il valore della proprietà companyID.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIDType }
     *     
     */
    public void setCompanyID(CompanyIDType value) {
        this.companyID = value;
    }

    /**
     * Recupera il valore della proprietà registrationDate.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationDateType }
     *     
     */
    public RegistrationDateType getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Imposta il valore della proprietà registrationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationDateType }
     *     
     */
    public void setRegistrationDate(RegistrationDateType value) {
        this.registrationDate = value;
    }

    /**
     * Recupera il valore della proprietà registrationExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationExpirationDateType }
     *     
     */
    public RegistrationExpirationDateType getRegistrationExpirationDate() {
        return registrationExpirationDate;
    }

    /**
     * Imposta il valore della proprietà registrationExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationExpirationDateType }
     *     
     */
    public void setRegistrationExpirationDate(RegistrationExpirationDateType value) {
        this.registrationExpirationDate = value;
    }

    /**
     * Recupera il valore della proprietà companyLegalFormCode.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLegalFormCodeType }
     *     
     */
    public CompanyLegalFormCodeType getCompanyLegalFormCode() {
        return companyLegalFormCode;
    }

    /**
     * Imposta il valore della proprietà companyLegalFormCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLegalFormCodeType }
     *     
     */
    public void setCompanyLegalFormCode(CompanyLegalFormCodeType value) {
        this.companyLegalFormCode = value;
    }

    /**
     * Recupera il valore della proprietà companyLegalForm.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLegalFormType }
     *     
     */
    public CompanyLegalFormType getCompanyLegalForm() {
        return companyLegalForm;
    }

    /**
     * Imposta il valore della proprietà companyLegalForm.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLegalFormType }
     *     
     */
    public void setCompanyLegalForm(CompanyLegalFormType value) {
        this.companyLegalForm = value;
    }

    /**
     * Recupera il valore della proprietà soleProprietorshipIndicator.
     * 
     * @return
     *     possible object is
     *     {@link SoleProprietorshipIndicatorType }
     *     
     */
    public SoleProprietorshipIndicatorType getSoleProprietorshipIndicator() {
        return soleProprietorshipIndicator;
    }

    /**
     * Imposta il valore della proprietà soleProprietorshipIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link SoleProprietorshipIndicatorType }
     *     
     */
    public void setSoleProprietorshipIndicator(SoleProprietorshipIndicatorType value) {
        this.soleProprietorshipIndicator = value;
    }

    /**
     * Recupera il valore della proprietà companyLiquidationStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLiquidationStatusCodeType }
     *     
     */
    public CompanyLiquidationStatusCodeType getCompanyLiquidationStatusCode() {
        return companyLiquidationStatusCode;
    }

    /**
     * Imposta il valore della proprietà companyLiquidationStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLiquidationStatusCodeType }
     *     
     */
    public void setCompanyLiquidationStatusCode(CompanyLiquidationStatusCodeType value) {
        this.companyLiquidationStatusCode = value;
    }

    /**
     * Recupera il valore della proprietà corporateStockAmount.
     * 
     * @return
     *     possible object is
     *     {@link CorporateStockAmountType }
     *     
     */
    public CorporateStockAmountType getCorporateStockAmount() {
        return corporateStockAmount;
    }

    /**
     * Imposta il valore della proprietà corporateStockAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateStockAmountType }
     *     
     */
    public void setCorporateStockAmount(CorporateStockAmountType value) {
        this.corporateStockAmount = value;
    }

    /**
     * Recupera il valore della proprietà fullyPaidSharesIndicator.
     * 
     * @return
     *     possible object is
     *     {@link FullyPaidSharesIndicatorType }
     *     
     */
    public FullyPaidSharesIndicatorType getFullyPaidSharesIndicator() {
        return fullyPaidSharesIndicator;
    }

    /**
     * Imposta il valore della proprietà fullyPaidSharesIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link FullyPaidSharesIndicatorType }
     *     
     */
    public void setFullyPaidSharesIndicator(FullyPaidSharesIndicatorType value) {
        this.fullyPaidSharesIndicator = value;
    }

    /**
     * Recupera il valore della proprietà registrationAddress.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * Imposta il valore della proprietà registrationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setRegistrationAddress(AddressType value) {
        this.registrationAddress = value;
    }

    /**
     * Recupera il valore della proprietà corporateRegistrationScheme.
     * 
     * @return
     *     possible object is
     *     {@link CorporateRegistrationSchemeType }
     *     
     */
    public CorporateRegistrationSchemeType getCorporateRegistrationScheme() {
        return corporateRegistrationScheme;
    }

    /**
     * Imposta il valore della proprietà corporateRegistrationScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateRegistrationSchemeType }
     *     
     */
    public void setCorporateRegistrationScheme(CorporateRegistrationSchemeType value) {
        this.corporateRegistrationScheme = value;
    }

    /**
     * Recupera il valore della proprietà headOfficeParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getHeadOfficeParty() {
        return headOfficeParty;
    }

    /**
     * Imposta il valore della proprietà headOfficeParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setHeadOfficeParty(PartyType value) {
        this.headOfficeParty = value;
    }

    /**
     * Gets the value of the shareholderParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareholderParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareholderParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareholderPartyType }
     * 
     * 
     */
    public List<ShareholderPartyType> getShareholderParty() {
        if (shareholderParty == null) {
            shareholderParty = new ArrayList<ShareholderPartyType>();
        }
        return this.shareholderParty;
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
            RegistrationNameType theRegistrationName;
            theRegistrationName = this.getRegistrationName();
            strategy.appendField(locator, this, "registrationName", buffer, theRegistrationName, (this.registrationName!= null));
        }
        {
            CompanyIDType theCompanyID;
            theCompanyID = this.getCompanyID();
            strategy.appendField(locator, this, "companyID", buffer, theCompanyID, (this.companyID!= null));
        }
        {
            RegistrationDateType theRegistrationDate;
            theRegistrationDate = this.getRegistrationDate();
            strategy.appendField(locator, this, "registrationDate", buffer, theRegistrationDate, (this.registrationDate!= null));
        }
        {
            RegistrationExpirationDateType theRegistrationExpirationDate;
            theRegistrationExpirationDate = this.getRegistrationExpirationDate();
            strategy.appendField(locator, this, "registrationExpirationDate", buffer, theRegistrationExpirationDate, (this.registrationExpirationDate!= null));
        }
        {
            CompanyLegalFormCodeType theCompanyLegalFormCode;
            theCompanyLegalFormCode = this.getCompanyLegalFormCode();
            strategy.appendField(locator, this, "companyLegalFormCode", buffer, theCompanyLegalFormCode, (this.companyLegalFormCode!= null));
        }
        {
            CompanyLegalFormType theCompanyLegalForm;
            theCompanyLegalForm = this.getCompanyLegalForm();
            strategy.appendField(locator, this, "companyLegalForm", buffer, theCompanyLegalForm, (this.companyLegalForm!= null));
        }
        {
            SoleProprietorshipIndicatorType theSoleProprietorshipIndicator;
            theSoleProprietorshipIndicator = this.getSoleProprietorshipIndicator();
            strategy.appendField(locator, this, "soleProprietorshipIndicator", buffer, theSoleProprietorshipIndicator, (this.soleProprietorshipIndicator!= null));
        }
        {
            CompanyLiquidationStatusCodeType theCompanyLiquidationStatusCode;
            theCompanyLiquidationStatusCode = this.getCompanyLiquidationStatusCode();
            strategy.appendField(locator, this, "companyLiquidationStatusCode", buffer, theCompanyLiquidationStatusCode, (this.companyLiquidationStatusCode!= null));
        }
        {
            CorporateStockAmountType theCorporateStockAmount;
            theCorporateStockAmount = this.getCorporateStockAmount();
            strategy.appendField(locator, this, "corporateStockAmount", buffer, theCorporateStockAmount, (this.corporateStockAmount!= null));
        }
        {
            FullyPaidSharesIndicatorType theFullyPaidSharesIndicator;
            theFullyPaidSharesIndicator = this.getFullyPaidSharesIndicator();
            strategy.appendField(locator, this, "fullyPaidSharesIndicator", buffer, theFullyPaidSharesIndicator, (this.fullyPaidSharesIndicator!= null));
        }
        {
            AddressType theRegistrationAddress;
            theRegistrationAddress = this.getRegistrationAddress();
            strategy.appendField(locator, this, "registrationAddress", buffer, theRegistrationAddress, (this.registrationAddress!= null));
        }
        {
            CorporateRegistrationSchemeType theCorporateRegistrationScheme;
            theCorporateRegistrationScheme = this.getCorporateRegistrationScheme();
            strategy.appendField(locator, this, "corporateRegistrationScheme", buffer, theCorporateRegistrationScheme, (this.corporateRegistrationScheme!= null));
        }
        {
            PartyType theHeadOfficeParty;
            theHeadOfficeParty = this.getHeadOfficeParty();
            strategy.appendField(locator, this, "headOfficeParty", buffer, theHeadOfficeParty, (this.headOfficeParty!= null));
        }
        {
            List<ShareholderPartyType> theShareholderParty;
            theShareholderParty = (((this.shareholderParty!= null)&&(!this.shareholderParty.isEmpty()))?this.getShareholderParty():null);
            strategy.appendField(locator, this, "shareholderParty", buffer, theShareholderParty, ((this.shareholderParty!= null)&&(!this.shareholderParty.isEmpty())));
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
        final PartyLegalEntityType that = ((PartyLegalEntityType) object);
        {
            RegistrationNameType lhsRegistrationName;
            lhsRegistrationName = this.getRegistrationName();
            RegistrationNameType rhsRegistrationName;
            rhsRegistrationName = that.getRegistrationName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationName", lhsRegistrationName), LocatorUtils.property(thatLocator, "registrationName", rhsRegistrationName), lhsRegistrationName, rhsRegistrationName, (this.registrationName!= null), (that.registrationName!= null))) {
                return false;
            }
        }
        {
            CompanyIDType lhsCompanyID;
            lhsCompanyID = this.getCompanyID();
            CompanyIDType rhsCompanyID;
            rhsCompanyID = that.getCompanyID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyID", lhsCompanyID), LocatorUtils.property(thatLocator, "companyID", rhsCompanyID), lhsCompanyID, rhsCompanyID, (this.companyID!= null), (that.companyID!= null))) {
                return false;
            }
        }
        {
            RegistrationDateType lhsRegistrationDate;
            lhsRegistrationDate = this.getRegistrationDate();
            RegistrationDateType rhsRegistrationDate;
            rhsRegistrationDate = that.getRegistrationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationDate", lhsRegistrationDate), LocatorUtils.property(thatLocator, "registrationDate", rhsRegistrationDate), lhsRegistrationDate, rhsRegistrationDate, (this.registrationDate!= null), (that.registrationDate!= null))) {
                return false;
            }
        }
        {
            RegistrationExpirationDateType lhsRegistrationExpirationDate;
            lhsRegistrationExpirationDate = this.getRegistrationExpirationDate();
            RegistrationExpirationDateType rhsRegistrationExpirationDate;
            rhsRegistrationExpirationDate = that.getRegistrationExpirationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationExpirationDate", lhsRegistrationExpirationDate), LocatorUtils.property(thatLocator, "registrationExpirationDate", rhsRegistrationExpirationDate), lhsRegistrationExpirationDate, rhsRegistrationExpirationDate, (this.registrationExpirationDate!= null), (that.registrationExpirationDate!= null))) {
                return false;
            }
        }
        {
            CompanyLegalFormCodeType lhsCompanyLegalFormCode;
            lhsCompanyLegalFormCode = this.getCompanyLegalFormCode();
            CompanyLegalFormCodeType rhsCompanyLegalFormCode;
            rhsCompanyLegalFormCode = that.getCompanyLegalFormCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyLegalFormCode", lhsCompanyLegalFormCode), LocatorUtils.property(thatLocator, "companyLegalFormCode", rhsCompanyLegalFormCode), lhsCompanyLegalFormCode, rhsCompanyLegalFormCode, (this.companyLegalFormCode!= null), (that.companyLegalFormCode!= null))) {
                return false;
            }
        }
        {
            CompanyLegalFormType lhsCompanyLegalForm;
            lhsCompanyLegalForm = this.getCompanyLegalForm();
            CompanyLegalFormType rhsCompanyLegalForm;
            rhsCompanyLegalForm = that.getCompanyLegalForm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyLegalForm", lhsCompanyLegalForm), LocatorUtils.property(thatLocator, "companyLegalForm", rhsCompanyLegalForm), lhsCompanyLegalForm, rhsCompanyLegalForm, (this.companyLegalForm!= null), (that.companyLegalForm!= null))) {
                return false;
            }
        }
        {
            SoleProprietorshipIndicatorType lhsSoleProprietorshipIndicator;
            lhsSoleProprietorshipIndicator = this.getSoleProprietorshipIndicator();
            SoleProprietorshipIndicatorType rhsSoleProprietorshipIndicator;
            rhsSoleProprietorshipIndicator = that.getSoleProprietorshipIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "soleProprietorshipIndicator", lhsSoleProprietorshipIndicator), LocatorUtils.property(thatLocator, "soleProprietorshipIndicator", rhsSoleProprietorshipIndicator), lhsSoleProprietorshipIndicator, rhsSoleProprietorshipIndicator, (this.soleProprietorshipIndicator!= null), (that.soleProprietorshipIndicator!= null))) {
                return false;
            }
        }
        {
            CompanyLiquidationStatusCodeType lhsCompanyLiquidationStatusCode;
            lhsCompanyLiquidationStatusCode = this.getCompanyLiquidationStatusCode();
            CompanyLiquidationStatusCodeType rhsCompanyLiquidationStatusCode;
            rhsCompanyLiquidationStatusCode = that.getCompanyLiquidationStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "companyLiquidationStatusCode", lhsCompanyLiquidationStatusCode), LocatorUtils.property(thatLocator, "companyLiquidationStatusCode", rhsCompanyLiquidationStatusCode), lhsCompanyLiquidationStatusCode, rhsCompanyLiquidationStatusCode, (this.companyLiquidationStatusCode!= null), (that.companyLiquidationStatusCode!= null))) {
                return false;
            }
        }
        {
            CorporateStockAmountType lhsCorporateStockAmount;
            lhsCorporateStockAmount = this.getCorporateStockAmount();
            CorporateStockAmountType rhsCorporateStockAmount;
            rhsCorporateStockAmount = that.getCorporateStockAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "corporateStockAmount", lhsCorporateStockAmount), LocatorUtils.property(thatLocator, "corporateStockAmount", rhsCorporateStockAmount), lhsCorporateStockAmount, rhsCorporateStockAmount, (this.corporateStockAmount!= null), (that.corporateStockAmount!= null))) {
                return false;
            }
        }
        {
            FullyPaidSharesIndicatorType lhsFullyPaidSharesIndicator;
            lhsFullyPaidSharesIndicator = this.getFullyPaidSharesIndicator();
            FullyPaidSharesIndicatorType rhsFullyPaidSharesIndicator;
            rhsFullyPaidSharesIndicator = that.getFullyPaidSharesIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fullyPaidSharesIndicator", lhsFullyPaidSharesIndicator), LocatorUtils.property(thatLocator, "fullyPaidSharesIndicator", rhsFullyPaidSharesIndicator), lhsFullyPaidSharesIndicator, rhsFullyPaidSharesIndicator, (this.fullyPaidSharesIndicator!= null), (that.fullyPaidSharesIndicator!= null))) {
                return false;
            }
        }
        {
            AddressType lhsRegistrationAddress;
            lhsRegistrationAddress = this.getRegistrationAddress();
            AddressType rhsRegistrationAddress;
            rhsRegistrationAddress = that.getRegistrationAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "registrationAddress", lhsRegistrationAddress), LocatorUtils.property(thatLocator, "registrationAddress", rhsRegistrationAddress), lhsRegistrationAddress, rhsRegistrationAddress, (this.registrationAddress!= null), (that.registrationAddress!= null))) {
                return false;
            }
        }
        {
            CorporateRegistrationSchemeType lhsCorporateRegistrationScheme;
            lhsCorporateRegistrationScheme = this.getCorporateRegistrationScheme();
            CorporateRegistrationSchemeType rhsCorporateRegistrationScheme;
            rhsCorporateRegistrationScheme = that.getCorporateRegistrationScheme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "corporateRegistrationScheme", lhsCorporateRegistrationScheme), LocatorUtils.property(thatLocator, "corporateRegistrationScheme", rhsCorporateRegistrationScheme), lhsCorporateRegistrationScheme, rhsCorporateRegistrationScheme, (this.corporateRegistrationScheme!= null), (that.corporateRegistrationScheme!= null))) {
                return false;
            }
        }
        {
            PartyType lhsHeadOfficeParty;
            lhsHeadOfficeParty = this.getHeadOfficeParty();
            PartyType rhsHeadOfficeParty;
            rhsHeadOfficeParty = that.getHeadOfficeParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "headOfficeParty", lhsHeadOfficeParty), LocatorUtils.property(thatLocator, "headOfficeParty", rhsHeadOfficeParty), lhsHeadOfficeParty, rhsHeadOfficeParty, (this.headOfficeParty!= null), (that.headOfficeParty!= null))) {
                return false;
            }
        }
        {
            List<ShareholderPartyType> lhsShareholderParty;
            lhsShareholderParty = (((this.shareholderParty!= null)&&(!this.shareholderParty.isEmpty()))?this.getShareholderParty():null);
            List<ShareholderPartyType> rhsShareholderParty;
            rhsShareholderParty = (((that.shareholderParty!= null)&&(!that.shareholderParty.isEmpty()))?that.getShareholderParty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shareholderParty", lhsShareholderParty), LocatorUtils.property(thatLocator, "shareholderParty", rhsShareholderParty), lhsShareholderParty, rhsShareholderParty, ((this.shareholderParty!= null)&&(!this.shareholderParty.isEmpty())), ((that.shareholderParty!= null)&&(!that.shareholderParty.isEmpty())))) {
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
            RegistrationNameType theRegistrationName;
            theRegistrationName = this.getRegistrationName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationName", theRegistrationName), currentHashCode, theRegistrationName, (this.registrationName!= null));
        }
        {
            CompanyIDType theCompanyID;
            theCompanyID = this.getCompanyID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "companyID", theCompanyID), currentHashCode, theCompanyID, (this.companyID!= null));
        }
        {
            RegistrationDateType theRegistrationDate;
            theRegistrationDate = this.getRegistrationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationDate", theRegistrationDate), currentHashCode, theRegistrationDate, (this.registrationDate!= null));
        }
        {
            RegistrationExpirationDateType theRegistrationExpirationDate;
            theRegistrationExpirationDate = this.getRegistrationExpirationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationExpirationDate", theRegistrationExpirationDate), currentHashCode, theRegistrationExpirationDate, (this.registrationExpirationDate!= null));
        }
        {
            CompanyLegalFormCodeType theCompanyLegalFormCode;
            theCompanyLegalFormCode = this.getCompanyLegalFormCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "companyLegalFormCode", theCompanyLegalFormCode), currentHashCode, theCompanyLegalFormCode, (this.companyLegalFormCode!= null));
        }
        {
            CompanyLegalFormType theCompanyLegalForm;
            theCompanyLegalForm = this.getCompanyLegalForm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "companyLegalForm", theCompanyLegalForm), currentHashCode, theCompanyLegalForm, (this.companyLegalForm!= null));
        }
        {
            SoleProprietorshipIndicatorType theSoleProprietorshipIndicator;
            theSoleProprietorshipIndicator = this.getSoleProprietorshipIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "soleProprietorshipIndicator", theSoleProprietorshipIndicator), currentHashCode, theSoleProprietorshipIndicator, (this.soleProprietorshipIndicator!= null));
        }
        {
            CompanyLiquidationStatusCodeType theCompanyLiquidationStatusCode;
            theCompanyLiquidationStatusCode = this.getCompanyLiquidationStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "companyLiquidationStatusCode", theCompanyLiquidationStatusCode), currentHashCode, theCompanyLiquidationStatusCode, (this.companyLiquidationStatusCode!= null));
        }
        {
            CorporateStockAmountType theCorporateStockAmount;
            theCorporateStockAmount = this.getCorporateStockAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "corporateStockAmount", theCorporateStockAmount), currentHashCode, theCorporateStockAmount, (this.corporateStockAmount!= null));
        }
        {
            FullyPaidSharesIndicatorType theFullyPaidSharesIndicator;
            theFullyPaidSharesIndicator = this.getFullyPaidSharesIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fullyPaidSharesIndicator", theFullyPaidSharesIndicator), currentHashCode, theFullyPaidSharesIndicator, (this.fullyPaidSharesIndicator!= null));
        }
        {
            AddressType theRegistrationAddress;
            theRegistrationAddress = this.getRegistrationAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationAddress", theRegistrationAddress), currentHashCode, theRegistrationAddress, (this.registrationAddress!= null));
        }
        {
            CorporateRegistrationSchemeType theCorporateRegistrationScheme;
            theCorporateRegistrationScheme = this.getCorporateRegistrationScheme();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "corporateRegistrationScheme", theCorporateRegistrationScheme), currentHashCode, theCorporateRegistrationScheme, (this.corporateRegistrationScheme!= null));
        }
        {
            PartyType theHeadOfficeParty;
            theHeadOfficeParty = this.getHeadOfficeParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "headOfficeParty", theHeadOfficeParty), currentHashCode, theHeadOfficeParty, (this.headOfficeParty!= null));
        }
        {
            List<ShareholderPartyType> theShareholderParty;
            theShareholderParty = (((this.shareholderParty!= null)&&(!this.shareholderParty.isEmpty()))?this.getShareholderParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shareholderParty", theShareholderParty), currentHashCode, theShareholderParty, ((this.shareholderParty!= null)&&(!this.shareholderParty.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
