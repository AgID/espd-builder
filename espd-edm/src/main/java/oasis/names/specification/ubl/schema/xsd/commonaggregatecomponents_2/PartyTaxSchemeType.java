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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExemptionReasonCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExemptionReasonType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RegistrationNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxLevelCodeType;
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
 * <p>Classe Java per PartyTaxSchemeType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PartyTaxSchemeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExemptionReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExemptionReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistrationAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxScheme"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyTaxSchemeType", propOrder = {
    "registrationName",
    "companyID",
    "taxLevelCode",
    "exemptionReasonCode",
    "exemptionReason",
    "registrationAddress",
    "taxScheme"
})
public class PartyTaxSchemeType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "RegistrationName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegistrationNameType registrationName;
    @XmlElement(name = "CompanyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CompanyIDType companyID;
    @XmlElement(name = "TaxLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxLevelCodeType taxLevelCode;
    @XmlElement(name = "ExemptionReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExemptionReasonCodeType exemptionReasonCode;
    @XmlElement(name = "ExemptionReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ExemptionReasonType> exemptionReason;
    @XmlElement(name = "RegistrationAddress")
    protected AddressType registrationAddress;
    @XmlElement(name = "TaxScheme", required = true)
    protected TaxSchemeType taxScheme;

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
     * Recupera il valore della proprietà taxLevelCode.
     * 
     * @return
     *     possible object is
     *     {@link TaxLevelCodeType }
     *     
     */
    public TaxLevelCodeType getTaxLevelCode() {
        return taxLevelCode;
    }

    /**
     * Imposta il valore della proprietà taxLevelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxLevelCodeType }
     *     
     */
    public void setTaxLevelCode(TaxLevelCodeType value) {
        this.taxLevelCode = value;
    }

    /**
     * Recupera il valore della proprietà exemptionReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link ExemptionReasonCodeType }
     *     
     */
    public ExemptionReasonCodeType getExemptionReasonCode() {
        return exemptionReasonCode;
    }

    /**
     * Imposta il valore della proprietà exemptionReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptionReasonCodeType }
     *     
     */
    public void setExemptionReasonCode(ExemptionReasonCodeType value) {
        this.exemptionReasonCode = value;
    }

    /**
     * Gets the value of the exemptionReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemptionReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExemptionReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExemptionReasonType }
     * 
     * 
     */
    public List<ExemptionReasonType> getExemptionReason() {
        if (exemptionReason == null) {
            exemptionReason = new ArrayList<ExemptionReasonType>();
        }
        return this.exemptionReason;
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
     * Recupera il valore della proprietà taxScheme.
     * 
     * @return
     *     possible object is
     *     {@link TaxSchemeType }
     *     
     */
    public TaxSchemeType getTaxScheme() {
        return taxScheme;
    }

    /**
     * Imposta il valore della proprietà taxScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSchemeType }
     *     
     */
    public void setTaxScheme(TaxSchemeType value) {
        this.taxScheme = value;
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
            TaxLevelCodeType theTaxLevelCode;
            theTaxLevelCode = this.getTaxLevelCode();
            strategy.appendField(locator, this, "taxLevelCode", buffer, theTaxLevelCode, (this.taxLevelCode!= null));
        }
        {
            ExemptionReasonCodeType theExemptionReasonCode;
            theExemptionReasonCode = this.getExemptionReasonCode();
            strategy.appendField(locator, this, "exemptionReasonCode", buffer, theExemptionReasonCode, (this.exemptionReasonCode!= null));
        }
        {
            List<ExemptionReasonType> theExemptionReason;
            theExemptionReason = (((this.exemptionReason!= null)&&(!this.exemptionReason.isEmpty()))?this.getExemptionReason():null);
            strategy.appendField(locator, this, "exemptionReason", buffer, theExemptionReason, ((this.exemptionReason!= null)&&(!this.exemptionReason.isEmpty())));
        }
        {
            AddressType theRegistrationAddress;
            theRegistrationAddress = this.getRegistrationAddress();
            strategy.appendField(locator, this, "registrationAddress", buffer, theRegistrationAddress, (this.registrationAddress!= null));
        }
        {
            TaxSchemeType theTaxScheme;
            theTaxScheme = this.getTaxScheme();
            strategy.appendField(locator, this, "taxScheme", buffer, theTaxScheme, (this.taxScheme!= null));
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
        final PartyTaxSchemeType that = ((PartyTaxSchemeType) object);
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
            TaxLevelCodeType lhsTaxLevelCode;
            lhsTaxLevelCode = this.getTaxLevelCode();
            TaxLevelCodeType rhsTaxLevelCode;
            rhsTaxLevelCode = that.getTaxLevelCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxLevelCode", lhsTaxLevelCode), LocatorUtils.property(thatLocator, "taxLevelCode", rhsTaxLevelCode), lhsTaxLevelCode, rhsTaxLevelCode, (this.taxLevelCode!= null), (that.taxLevelCode!= null))) {
                return false;
            }
        }
        {
            ExemptionReasonCodeType lhsExemptionReasonCode;
            lhsExemptionReasonCode = this.getExemptionReasonCode();
            ExemptionReasonCodeType rhsExemptionReasonCode;
            rhsExemptionReasonCode = that.getExemptionReasonCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exemptionReasonCode", lhsExemptionReasonCode), LocatorUtils.property(thatLocator, "exemptionReasonCode", rhsExemptionReasonCode), lhsExemptionReasonCode, rhsExemptionReasonCode, (this.exemptionReasonCode!= null), (that.exemptionReasonCode!= null))) {
                return false;
            }
        }
        {
            List<ExemptionReasonType> lhsExemptionReason;
            lhsExemptionReason = (((this.exemptionReason!= null)&&(!this.exemptionReason.isEmpty()))?this.getExemptionReason():null);
            List<ExemptionReasonType> rhsExemptionReason;
            rhsExemptionReason = (((that.exemptionReason!= null)&&(!that.exemptionReason.isEmpty()))?that.getExemptionReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exemptionReason", lhsExemptionReason), LocatorUtils.property(thatLocator, "exemptionReason", rhsExemptionReason), lhsExemptionReason, rhsExemptionReason, ((this.exemptionReason!= null)&&(!this.exemptionReason.isEmpty())), ((that.exemptionReason!= null)&&(!that.exemptionReason.isEmpty())))) {
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
            TaxSchemeType lhsTaxScheme;
            lhsTaxScheme = this.getTaxScheme();
            TaxSchemeType rhsTaxScheme;
            rhsTaxScheme = that.getTaxScheme();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxScheme", lhsTaxScheme), LocatorUtils.property(thatLocator, "taxScheme", rhsTaxScheme), lhsTaxScheme, rhsTaxScheme, (this.taxScheme!= null), (that.taxScheme!= null))) {
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
            TaxLevelCodeType theTaxLevelCode;
            theTaxLevelCode = this.getTaxLevelCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxLevelCode", theTaxLevelCode), currentHashCode, theTaxLevelCode, (this.taxLevelCode!= null));
        }
        {
            ExemptionReasonCodeType theExemptionReasonCode;
            theExemptionReasonCode = this.getExemptionReasonCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exemptionReasonCode", theExemptionReasonCode), currentHashCode, theExemptionReasonCode, (this.exemptionReasonCode!= null));
        }
        {
            List<ExemptionReasonType> theExemptionReason;
            theExemptionReason = (((this.exemptionReason!= null)&&(!this.exemptionReason.isEmpty()))?this.getExemptionReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exemptionReason", theExemptionReason), currentHashCode, theExemptionReason, ((this.exemptionReason!= null)&&(!this.exemptionReason.isEmpty())));
        }
        {
            AddressType theRegistrationAddress;
            theRegistrationAddress = this.getRegistrationAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "registrationAddress", theRegistrationAddress), currentHashCode, theRegistrationAddress, (this.registrationAddress!= null));
        }
        {
            TaxSchemeType theTaxScheme;
            theTaxScheme = this.getTaxScheme();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxScheme", theTaxScheme), currentHashCode, theTaxScheme, (this.taxScheme!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
