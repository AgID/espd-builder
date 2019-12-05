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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FaceValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ImmobilizationCertificateIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MarketValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SecurityIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SharesNumberQuantityType;
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
 * <p>Classe Java per ImmobilizedSecurityType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ImmobilizedSecurityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ImmobilizationCertificateID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SecurityID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FaceValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarketValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SharesNumberQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}IssuerParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmobilizedSecurityType", propOrder = {
    "immobilizationCertificateID",
    "securityID",
    "issueDate",
    "faceValueAmount",
    "marketValueAmount",
    "sharesNumberQuantity",
    "issuerParty"
})
public class ImmobilizedSecurityType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ImmobilizationCertificateID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ImmobilizationCertificateIDType immobilizationCertificateID;
    @XmlElement(name = "SecurityID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SecurityIDType securityID;
    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssueDateType issueDate;
    @XmlElement(name = "FaceValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FaceValueAmountType faceValueAmount;
    @XmlElement(name = "MarketValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MarketValueAmountType marketValueAmount;
    @XmlElement(name = "SharesNumberQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SharesNumberQuantityType sharesNumberQuantity;
    @XmlElement(name = "IssuerParty")
    protected PartyType issuerParty;

    /**
     * Recupera il valore della proprietà immobilizationCertificateID.
     * 
     * @return
     *     possible object is
     *     {@link ImmobilizationCertificateIDType }
     *     
     */
    public ImmobilizationCertificateIDType getImmobilizationCertificateID() {
        return immobilizationCertificateID;
    }

    /**
     * Imposta il valore della proprietà immobilizationCertificateID.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmobilizationCertificateIDType }
     *     
     */
    public void setImmobilizationCertificateID(ImmobilizationCertificateIDType value) {
        this.immobilizationCertificateID = value;
    }

    /**
     * Recupera il valore della proprietà securityID.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIDType }
     *     
     */
    public SecurityIDType getSecurityID() {
        return securityID;
    }

    /**
     * Imposta il valore della proprietà securityID.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIDType }
     *     
     */
    public void setSecurityID(SecurityIDType value) {
        this.securityID = value;
    }

    /**
     * Recupera il valore della proprietà issueDate.
     * 
     * @return
     *     possible object is
     *     {@link IssueDateType }
     *     
     */
    public IssueDateType getIssueDate() {
        return issueDate;
    }

    /**
     * Imposta il valore della proprietà issueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueDateType }
     *     
     */
    public void setIssueDate(IssueDateType value) {
        this.issueDate = value;
    }

    /**
     * Recupera il valore della proprietà faceValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link FaceValueAmountType }
     *     
     */
    public FaceValueAmountType getFaceValueAmount() {
        return faceValueAmount;
    }

    /**
     * Imposta il valore della proprietà faceValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link FaceValueAmountType }
     *     
     */
    public void setFaceValueAmount(FaceValueAmountType value) {
        this.faceValueAmount = value;
    }

    /**
     * Recupera il valore della proprietà marketValueAmount.
     * 
     * @return
     *     possible object is
     *     {@link MarketValueAmountType }
     *     
     */
    public MarketValueAmountType getMarketValueAmount() {
        return marketValueAmount;
    }

    /**
     * Imposta il valore della proprietà marketValueAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketValueAmountType }
     *     
     */
    public void setMarketValueAmount(MarketValueAmountType value) {
        this.marketValueAmount = value;
    }

    /**
     * Recupera il valore della proprietà sharesNumberQuantity.
     * 
     * @return
     *     possible object is
     *     {@link SharesNumberQuantityType }
     *     
     */
    public SharesNumberQuantityType getSharesNumberQuantity() {
        return sharesNumberQuantity;
    }

    /**
     * Imposta il valore della proprietà sharesNumberQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link SharesNumberQuantityType }
     *     
     */
    public void setSharesNumberQuantity(SharesNumberQuantityType value) {
        this.sharesNumberQuantity = value;
    }

    /**
     * Recupera il valore della proprietà issuerParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getIssuerParty() {
        return issuerParty;
    }

    /**
     * Imposta il valore della proprietà issuerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setIssuerParty(PartyType value) {
        this.issuerParty = value;
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
            ImmobilizationCertificateIDType theImmobilizationCertificateID;
            theImmobilizationCertificateID = this.getImmobilizationCertificateID();
            strategy.appendField(locator, this, "immobilizationCertificateID", buffer, theImmobilizationCertificateID, (this.immobilizationCertificateID!= null));
        }
        {
            SecurityIDType theSecurityID;
            theSecurityID = this.getSecurityID();
            strategy.appendField(locator, this, "securityID", buffer, theSecurityID, (this.securityID!= null));
        }
        {
            IssueDateType theIssueDate;
            theIssueDate = this.getIssueDate();
            strategy.appendField(locator, this, "issueDate", buffer, theIssueDate, (this.issueDate!= null));
        }
        {
            FaceValueAmountType theFaceValueAmount;
            theFaceValueAmount = this.getFaceValueAmount();
            strategy.appendField(locator, this, "faceValueAmount", buffer, theFaceValueAmount, (this.faceValueAmount!= null));
        }
        {
            MarketValueAmountType theMarketValueAmount;
            theMarketValueAmount = this.getMarketValueAmount();
            strategy.appendField(locator, this, "marketValueAmount", buffer, theMarketValueAmount, (this.marketValueAmount!= null));
        }
        {
            SharesNumberQuantityType theSharesNumberQuantity;
            theSharesNumberQuantity = this.getSharesNumberQuantity();
            strategy.appendField(locator, this, "sharesNumberQuantity", buffer, theSharesNumberQuantity, (this.sharesNumberQuantity!= null));
        }
        {
            PartyType theIssuerParty;
            theIssuerParty = this.getIssuerParty();
            strategy.appendField(locator, this, "issuerParty", buffer, theIssuerParty, (this.issuerParty!= null));
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
        final ImmobilizedSecurityType that = ((ImmobilizedSecurityType) object);
        {
            ImmobilizationCertificateIDType lhsImmobilizationCertificateID;
            lhsImmobilizationCertificateID = this.getImmobilizationCertificateID();
            ImmobilizationCertificateIDType rhsImmobilizationCertificateID;
            rhsImmobilizationCertificateID = that.getImmobilizationCertificateID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "immobilizationCertificateID", lhsImmobilizationCertificateID), LocatorUtils.property(thatLocator, "immobilizationCertificateID", rhsImmobilizationCertificateID), lhsImmobilizationCertificateID, rhsImmobilizationCertificateID, (this.immobilizationCertificateID!= null), (that.immobilizationCertificateID!= null))) {
                return false;
            }
        }
        {
            SecurityIDType lhsSecurityID;
            lhsSecurityID = this.getSecurityID();
            SecurityIDType rhsSecurityID;
            rhsSecurityID = that.getSecurityID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "securityID", lhsSecurityID), LocatorUtils.property(thatLocator, "securityID", rhsSecurityID), lhsSecurityID, rhsSecurityID, (this.securityID!= null), (that.securityID!= null))) {
                return false;
            }
        }
        {
            IssueDateType lhsIssueDate;
            lhsIssueDate = this.getIssueDate();
            IssueDateType rhsIssueDate;
            rhsIssueDate = that.getIssueDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issueDate", lhsIssueDate), LocatorUtils.property(thatLocator, "issueDate", rhsIssueDate), lhsIssueDate, rhsIssueDate, (this.issueDate!= null), (that.issueDate!= null))) {
                return false;
            }
        }
        {
            FaceValueAmountType lhsFaceValueAmount;
            lhsFaceValueAmount = this.getFaceValueAmount();
            FaceValueAmountType rhsFaceValueAmount;
            rhsFaceValueAmount = that.getFaceValueAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faceValueAmount", lhsFaceValueAmount), LocatorUtils.property(thatLocator, "faceValueAmount", rhsFaceValueAmount), lhsFaceValueAmount, rhsFaceValueAmount, (this.faceValueAmount!= null), (that.faceValueAmount!= null))) {
                return false;
            }
        }
        {
            MarketValueAmountType lhsMarketValueAmount;
            lhsMarketValueAmount = this.getMarketValueAmount();
            MarketValueAmountType rhsMarketValueAmount;
            rhsMarketValueAmount = that.getMarketValueAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "marketValueAmount", lhsMarketValueAmount), LocatorUtils.property(thatLocator, "marketValueAmount", rhsMarketValueAmount), lhsMarketValueAmount, rhsMarketValueAmount, (this.marketValueAmount!= null), (that.marketValueAmount!= null))) {
                return false;
            }
        }
        {
            SharesNumberQuantityType lhsSharesNumberQuantity;
            lhsSharesNumberQuantity = this.getSharesNumberQuantity();
            SharesNumberQuantityType rhsSharesNumberQuantity;
            rhsSharesNumberQuantity = that.getSharesNumberQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sharesNumberQuantity", lhsSharesNumberQuantity), LocatorUtils.property(thatLocator, "sharesNumberQuantity", rhsSharesNumberQuantity), lhsSharesNumberQuantity, rhsSharesNumberQuantity, (this.sharesNumberQuantity!= null), (that.sharesNumberQuantity!= null))) {
                return false;
            }
        }
        {
            PartyType lhsIssuerParty;
            lhsIssuerParty = this.getIssuerParty();
            PartyType rhsIssuerParty;
            rhsIssuerParty = that.getIssuerParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issuerParty", lhsIssuerParty), LocatorUtils.property(thatLocator, "issuerParty", rhsIssuerParty), lhsIssuerParty, rhsIssuerParty, (this.issuerParty!= null), (that.issuerParty!= null))) {
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
            ImmobilizationCertificateIDType theImmobilizationCertificateID;
            theImmobilizationCertificateID = this.getImmobilizationCertificateID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "immobilizationCertificateID", theImmobilizationCertificateID), currentHashCode, theImmobilizationCertificateID, (this.immobilizationCertificateID!= null));
        }
        {
            SecurityIDType theSecurityID;
            theSecurityID = this.getSecurityID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "securityID", theSecurityID), currentHashCode, theSecurityID, (this.securityID!= null));
        }
        {
            IssueDateType theIssueDate;
            theIssueDate = this.getIssueDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issueDate", theIssueDate), currentHashCode, theIssueDate, (this.issueDate!= null));
        }
        {
            FaceValueAmountType theFaceValueAmount;
            theFaceValueAmount = this.getFaceValueAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "faceValueAmount", theFaceValueAmount), currentHashCode, theFaceValueAmount, (this.faceValueAmount!= null));
        }
        {
            MarketValueAmountType theMarketValueAmount;
            theMarketValueAmount = this.getMarketValueAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "marketValueAmount", theMarketValueAmount), currentHashCode, theMarketValueAmount, (this.marketValueAmount!= null));
        }
        {
            SharesNumberQuantityType theSharesNumberQuantity;
            theSharesNumberQuantity = this.getSharesNumberQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sharesNumberQuantity", theSharesNumberQuantity), currentHashCode, theSharesNumberQuantity, (this.sharesNumberQuantity!= null));
        }
        {
            PartyType theIssuerParty;
            theIssuerParty = this.getIssuerParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issuerParty", theIssuerParty), currentHashCode, theIssuerParty, (this.issuerParty!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
