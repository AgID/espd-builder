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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AccountFormatCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AccountTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AliasNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentNoteType;
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
 * <p>Classe Java per FinancialAccountType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="FinancialAccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AliasName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountFormatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentNote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancialInstitutionBranch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Country" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialAccountType", propOrder = {
    "id",
    "name",
    "aliasName",
    "accountTypeCode",
    "accountFormatCode",
    "currencyCode",
    "paymentNote",
    "financialInstitutionBranch",
    "country"
})
public class FinancialAccountType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameType name;
    @XmlElement(name = "AliasName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AliasNameType aliasName;
    @XmlElement(name = "AccountTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountTypeCodeType accountTypeCode;
    @XmlElement(name = "AccountFormatCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccountFormatCodeType accountFormatCode;
    @XmlElement(name = "CurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CurrencyCodeType currencyCode;
    @XmlElement(name = "PaymentNote", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PaymentNoteType> paymentNote;
    @XmlElement(name = "FinancialInstitutionBranch")
    protected BranchType financialInstitutionBranch;
    @XmlElement(name = "Country")
    protected CountryType country;

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
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà aliasName.
     * 
     * @return
     *     possible object is
     *     {@link AliasNameType }
     *     
     */
    public AliasNameType getAliasName() {
        return aliasName;
    }

    /**
     * Imposta il valore della proprietà aliasName.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasNameType }
     *     
     */
    public void setAliasName(AliasNameType value) {
        this.aliasName = value;
    }

    /**
     * Recupera il valore della proprietà accountTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link AccountTypeCodeType }
     *     
     */
    public AccountTypeCodeType getAccountTypeCode() {
        return accountTypeCode;
    }

    /**
     * Imposta il valore della proprietà accountTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountTypeCodeType }
     *     
     */
    public void setAccountTypeCode(AccountTypeCodeType value) {
        this.accountTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà accountFormatCode.
     * 
     * @return
     *     possible object is
     *     {@link AccountFormatCodeType }
     *     
     */
    public AccountFormatCodeType getAccountFormatCode() {
        return accountFormatCode;
    }

    /**
     * Imposta il valore della proprietà accountFormatCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountFormatCodeType }
     *     
     */
    public void setAccountFormatCode(AccountFormatCodeType value) {
        this.accountFormatCode = value;
    }

    /**
     * Recupera il valore della proprietà currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Imposta il valore della proprietà currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyCode(CurrencyCodeType value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the paymentNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentNoteType }
     * 
     * 
     */
    public List<PaymentNoteType> getPaymentNote() {
        if (paymentNote == null) {
            paymentNote = new ArrayList<PaymentNoteType>();
        }
        return this.paymentNote;
    }

    /**
     * Recupera il valore della proprietà financialInstitutionBranch.
     * 
     * @return
     *     possible object is
     *     {@link BranchType }
     *     
     */
    public BranchType getFinancialInstitutionBranch() {
        return financialInstitutionBranch;
    }

    /**
     * Imposta il valore della proprietà financialInstitutionBranch.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchType }
     *     
     */
    public void setFinancialInstitutionBranch(BranchType value) {
        this.financialInstitutionBranch = value;
    }

    /**
     * Recupera il valore della proprietà country.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Imposta il valore della proprietà country.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
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
            NameType theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            AliasNameType theAliasName;
            theAliasName = this.getAliasName();
            strategy.appendField(locator, this, "aliasName", buffer, theAliasName, (this.aliasName!= null));
        }
        {
            AccountTypeCodeType theAccountTypeCode;
            theAccountTypeCode = this.getAccountTypeCode();
            strategy.appendField(locator, this, "accountTypeCode", buffer, theAccountTypeCode, (this.accountTypeCode!= null));
        }
        {
            AccountFormatCodeType theAccountFormatCode;
            theAccountFormatCode = this.getAccountFormatCode();
            strategy.appendField(locator, this, "accountFormatCode", buffer, theAccountFormatCode, (this.accountFormatCode!= null));
        }
        {
            CurrencyCodeType theCurrencyCode;
            theCurrencyCode = this.getCurrencyCode();
            strategy.appendField(locator, this, "currencyCode", buffer, theCurrencyCode, (this.currencyCode!= null));
        }
        {
            List<PaymentNoteType> thePaymentNote;
            thePaymentNote = (((this.paymentNote!= null)&&(!this.paymentNote.isEmpty()))?this.getPaymentNote():null);
            strategy.appendField(locator, this, "paymentNote", buffer, thePaymentNote, ((this.paymentNote!= null)&&(!this.paymentNote.isEmpty())));
        }
        {
            BranchType theFinancialInstitutionBranch;
            theFinancialInstitutionBranch = this.getFinancialInstitutionBranch();
            strategy.appendField(locator, this, "financialInstitutionBranch", buffer, theFinancialInstitutionBranch, (this.financialInstitutionBranch!= null));
        }
        {
            CountryType theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry, (this.country!= null));
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
        final FinancialAccountType that = ((FinancialAccountType) object);
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
            NameType lhsName;
            lhsName = this.getName();
            NameType rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            AliasNameType lhsAliasName;
            lhsAliasName = this.getAliasName();
            AliasNameType rhsAliasName;
            rhsAliasName = that.getAliasName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aliasName", lhsAliasName), LocatorUtils.property(thatLocator, "aliasName", rhsAliasName), lhsAliasName, rhsAliasName, (this.aliasName!= null), (that.aliasName!= null))) {
                return false;
            }
        }
        {
            AccountTypeCodeType lhsAccountTypeCode;
            lhsAccountTypeCode = this.getAccountTypeCode();
            AccountTypeCodeType rhsAccountTypeCode;
            rhsAccountTypeCode = that.getAccountTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountTypeCode", lhsAccountTypeCode), LocatorUtils.property(thatLocator, "accountTypeCode", rhsAccountTypeCode), lhsAccountTypeCode, rhsAccountTypeCode, (this.accountTypeCode!= null), (that.accountTypeCode!= null))) {
                return false;
            }
        }
        {
            AccountFormatCodeType lhsAccountFormatCode;
            lhsAccountFormatCode = this.getAccountFormatCode();
            AccountFormatCodeType rhsAccountFormatCode;
            rhsAccountFormatCode = that.getAccountFormatCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountFormatCode", lhsAccountFormatCode), LocatorUtils.property(thatLocator, "accountFormatCode", rhsAccountFormatCode), lhsAccountFormatCode, rhsAccountFormatCode, (this.accountFormatCode!= null), (that.accountFormatCode!= null))) {
                return false;
            }
        }
        {
            CurrencyCodeType lhsCurrencyCode;
            lhsCurrencyCode = this.getCurrencyCode();
            CurrencyCodeType rhsCurrencyCode;
            rhsCurrencyCode = that.getCurrencyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currencyCode", lhsCurrencyCode), LocatorUtils.property(thatLocator, "currencyCode", rhsCurrencyCode), lhsCurrencyCode, rhsCurrencyCode, (this.currencyCode!= null), (that.currencyCode!= null))) {
                return false;
            }
        }
        {
            List<PaymentNoteType> lhsPaymentNote;
            lhsPaymentNote = (((this.paymentNote!= null)&&(!this.paymentNote.isEmpty()))?this.getPaymentNote():null);
            List<PaymentNoteType> rhsPaymentNote;
            rhsPaymentNote = (((that.paymentNote!= null)&&(!that.paymentNote.isEmpty()))?that.getPaymentNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentNote", lhsPaymentNote), LocatorUtils.property(thatLocator, "paymentNote", rhsPaymentNote), lhsPaymentNote, rhsPaymentNote, ((this.paymentNote!= null)&&(!this.paymentNote.isEmpty())), ((that.paymentNote!= null)&&(!that.paymentNote.isEmpty())))) {
                return false;
            }
        }
        {
            BranchType lhsFinancialInstitutionBranch;
            lhsFinancialInstitutionBranch = this.getFinancialInstitutionBranch();
            BranchType rhsFinancialInstitutionBranch;
            rhsFinancialInstitutionBranch = that.getFinancialInstitutionBranch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financialInstitutionBranch", lhsFinancialInstitutionBranch), LocatorUtils.property(thatLocator, "financialInstitutionBranch", rhsFinancialInstitutionBranch), lhsFinancialInstitutionBranch, rhsFinancialInstitutionBranch, (this.financialInstitutionBranch!= null), (that.financialInstitutionBranch!= null))) {
                return false;
            }
        }
        {
            CountryType lhsCountry;
            lhsCountry = this.getCountry();
            CountryType rhsCountry;
            rhsCountry = that.getCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry, (this.country!= null), (that.country!= null))) {
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
            NameType theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            AliasNameType theAliasName;
            theAliasName = this.getAliasName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aliasName", theAliasName), currentHashCode, theAliasName, (this.aliasName!= null));
        }
        {
            AccountTypeCodeType theAccountTypeCode;
            theAccountTypeCode = this.getAccountTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountTypeCode", theAccountTypeCode), currentHashCode, theAccountTypeCode, (this.accountTypeCode!= null));
        }
        {
            AccountFormatCodeType theAccountFormatCode;
            theAccountFormatCode = this.getAccountFormatCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountFormatCode", theAccountFormatCode), currentHashCode, theAccountFormatCode, (this.accountFormatCode!= null));
        }
        {
            CurrencyCodeType theCurrencyCode;
            theCurrencyCode = this.getCurrencyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currencyCode", theCurrencyCode), currentHashCode, theCurrencyCode, (this.currencyCode!= null));
        }
        {
            List<PaymentNoteType> thePaymentNote;
            thePaymentNote = (((this.paymentNote!= null)&&(!this.paymentNote.isEmpty()))?this.getPaymentNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentNote", thePaymentNote), currentHashCode, thePaymentNote, ((this.paymentNote!= null)&&(!this.paymentNote.isEmpty())));
        }
        {
            BranchType theFinancialInstitutionBranch;
            theFinancialInstitutionBranch = this.getFinancialInstitutionBranch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financialInstitutionBranch", theFinancialInstitutionBranch), currentHashCode, theFinancialInstitutionBranch, (this.financialInstitutionBranch!= null));
        }
        {
            CountryType theCountry;
            theCountry = this.getCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "country", theCountry), currentHashCode, theCountry, (this.country!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
