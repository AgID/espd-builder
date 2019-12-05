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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CV2IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CardChipCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CardTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ChipApplicationIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpiryDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.HolderNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueNumberIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssuerIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NetworkIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PrimaryAccountNumberIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidityStartDateType;
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
 * <p>Classe Java per CardAccountType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CardAccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrimaryAccountNumberID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetworkID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CardTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidityStartDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpiryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssuerID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueNumberID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CV2ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CardChipCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChipApplicationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HolderName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAccountType", propOrder = {
    "primaryAccountNumberID",
    "networkID",
    "cardTypeCode",
    "validityStartDate",
    "expiryDate",
    "issuerID",
    "issueNumberID",
    "cv2ID",
    "cardChipCode",
    "chipApplicationID",
    "holderName"
})
public class CardAccountType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "PrimaryAccountNumberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected PrimaryAccountNumberIDType primaryAccountNumberID;
    @XmlElement(name = "NetworkID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected NetworkIDType networkID;
    @XmlElement(name = "CardTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CardTypeCodeType cardTypeCode;
    @XmlElement(name = "ValidityStartDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ValidityStartDateType validityStartDate;
    @XmlElement(name = "ExpiryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpiryDateType expiryDate;
    @XmlElement(name = "IssuerID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssuerIDType issuerID;
    @XmlElement(name = "IssueNumberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssueNumberIDType issueNumberID;
    @XmlElement(name = "CV2ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CV2IDType cv2ID;
    @XmlElement(name = "CardChipCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CardChipCodeType cardChipCode;
    @XmlElement(name = "ChipApplicationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ChipApplicationIDType chipApplicationID;
    @XmlElement(name = "HolderName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HolderNameType holderName;

    /**
     * Recupera il valore della proprietà primaryAccountNumberID.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAccountNumberIDType }
     *     
     */
    public PrimaryAccountNumberIDType getPrimaryAccountNumberID() {
        return primaryAccountNumberID;
    }

    /**
     * Imposta il valore della proprietà primaryAccountNumberID.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAccountNumberIDType }
     *     
     */
    public void setPrimaryAccountNumberID(PrimaryAccountNumberIDType value) {
        this.primaryAccountNumberID = value;
    }

    /**
     * Recupera il valore della proprietà networkID.
     * 
     * @return
     *     possible object is
     *     {@link NetworkIDType }
     *     
     */
    public NetworkIDType getNetworkID() {
        return networkID;
    }

    /**
     * Imposta il valore della proprietà networkID.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkIDType }
     *     
     */
    public void setNetworkID(NetworkIDType value) {
        this.networkID = value;
    }

    /**
     * Recupera il valore della proprietà cardTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link CardTypeCodeType }
     *     
     */
    public CardTypeCodeType getCardTypeCode() {
        return cardTypeCode;
    }

    /**
     * Imposta il valore della proprietà cardTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTypeCodeType }
     *     
     */
    public void setCardTypeCode(CardTypeCodeType value) {
        this.cardTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà validityStartDate.
     * 
     * @return
     *     possible object is
     *     {@link ValidityStartDateType }
     *     
     */
    public ValidityStartDateType getValidityStartDate() {
        return validityStartDate;
    }

    /**
     * Imposta il valore della proprietà validityStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityStartDateType }
     *     
     */
    public void setValidityStartDate(ValidityStartDateType value) {
        this.validityStartDate = value;
    }

    /**
     * Recupera il valore della proprietà expiryDate.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDateType }
     *     
     */
    public ExpiryDateType getExpiryDate() {
        return expiryDate;
    }

    /**
     * Imposta il valore della proprietà expiryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDateType }
     *     
     */
    public void setExpiryDate(ExpiryDateType value) {
        this.expiryDate = value;
    }

    /**
     * Recupera il valore della proprietà issuerID.
     * 
     * @return
     *     possible object is
     *     {@link IssuerIDType }
     *     
     */
    public IssuerIDType getIssuerID() {
        return issuerID;
    }

    /**
     * Imposta il valore della proprietà issuerID.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerIDType }
     *     
     */
    public void setIssuerID(IssuerIDType value) {
        this.issuerID = value;
    }

    /**
     * Recupera il valore della proprietà issueNumberID.
     * 
     * @return
     *     possible object is
     *     {@link IssueNumberIDType }
     *     
     */
    public IssueNumberIDType getIssueNumberID() {
        return issueNumberID;
    }

    /**
     * Imposta il valore della proprietà issueNumberID.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueNumberIDType }
     *     
     */
    public void setIssueNumberID(IssueNumberIDType value) {
        this.issueNumberID = value;
    }

    /**
     * Recupera il valore della proprietà cv2ID.
     * 
     * @return
     *     possible object is
     *     {@link CV2IDType }
     *     
     */
    public CV2IDType getCV2ID() {
        return cv2ID;
    }

    /**
     * Imposta il valore della proprietà cv2ID.
     * 
     * @param value
     *     allowed object is
     *     {@link CV2IDType }
     *     
     */
    public void setCV2ID(CV2IDType value) {
        this.cv2ID = value;
    }

    /**
     * Recupera il valore della proprietà cardChipCode.
     * 
     * @return
     *     possible object is
     *     {@link CardChipCodeType }
     *     
     */
    public CardChipCodeType getCardChipCode() {
        return cardChipCode;
    }

    /**
     * Imposta il valore della proprietà cardChipCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CardChipCodeType }
     *     
     */
    public void setCardChipCode(CardChipCodeType value) {
        this.cardChipCode = value;
    }

    /**
     * Recupera il valore della proprietà chipApplicationID.
     * 
     * @return
     *     possible object is
     *     {@link ChipApplicationIDType }
     *     
     */
    public ChipApplicationIDType getChipApplicationID() {
        return chipApplicationID;
    }

    /**
     * Imposta il valore della proprietà chipApplicationID.
     * 
     * @param value
     *     allowed object is
     *     {@link ChipApplicationIDType }
     *     
     */
    public void setChipApplicationID(ChipApplicationIDType value) {
        this.chipApplicationID = value;
    }

    /**
     * Recupera il valore della proprietà holderName.
     * 
     * @return
     *     possible object is
     *     {@link HolderNameType }
     *     
     */
    public HolderNameType getHolderName() {
        return holderName;
    }

    /**
     * Imposta il valore della proprietà holderName.
     * 
     * @param value
     *     allowed object is
     *     {@link HolderNameType }
     *     
     */
    public void setHolderName(HolderNameType value) {
        this.holderName = value;
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
            PrimaryAccountNumberIDType thePrimaryAccountNumberID;
            thePrimaryAccountNumberID = this.getPrimaryAccountNumberID();
            strategy.appendField(locator, this, "primaryAccountNumberID", buffer, thePrimaryAccountNumberID, (this.primaryAccountNumberID!= null));
        }
        {
            NetworkIDType theNetworkID;
            theNetworkID = this.getNetworkID();
            strategy.appendField(locator, this, "networkID", buffer, theNetworkID, (this.networkID!= null));
        }
        {
            CardTypeCodeType theCardTypeCode;
            theCardTypeCode = this.getCardTypeCode();
            strategy.appendField(locator, this, "cardTypeCode", buffer, theCardTypeCode, (this.cardTypeCode!= null));
        }
        {
            ValidityStartDateType theValidityStartDate;
            theValidityStartDate = this.getValidityStartDate();
            strategy.appendField(locator, this, "validityStartDate", buffer, theValidityStartDate, (this.validityStartDate!= null));
        }
        {
            ExpiryDateType theExpiryDate;
            theExpiryDate = this.getExpiryDate();
            strategy.appendField(locator, this, "expiryDate", buffer, theExpiryDate, (this.expiryDate!= null));
        }
        {
            IssuerIDType theIssuerID;
            theIssuerID = this.getIssuerID();
            strategy.appendField(locator, this, "issuerID", buffer, theIssuerID, (this.issuerID!= null));
        }
        {
            IssueNumberIDType theIssueNumberID;
            theIssueNumberID = this.getIssueNumberID();
            strategy.appendField(locator, this, "issueNumberID", buffer, theIssueNumberID, (this.issueNumberID!= null));
        }
        {
            CV2IDType theCV2ID;
            theCV2ID = this.getCV2ID();
            strategy.appendField(locator, this, "cv2ID", buffer, theCV2ID, (this.cv2ID!= null));
        }
        {
            CardChipCodeType theCardChipCode;
            theCardChipCode = this.getCardChipCode();
            strategy.appendField(locator, this, "cardChipCode", buffer, theCardChipCode, (this.cardChipCode!= null));
        }
        {
            ChipApplicationIDType theChipApplicationID;
            theChipApplicationID = this.getChipApplicationID();
            strategy.appendField(locator, this, "chipApplicationID", buffer, theChipApplicationID, (this.chipApplicationID!= null));
        }
        {
            HolderNameType theHolderName;
            theHolderName = this.getHolderName();
            strategy.appendField(locator, this, "holderName", buffer, theHolderName, (this.holderName!= null));
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
        final CardAccountType that = ((CardAccountType) object);
        {
            PrimaryAccountNumberIDType lhsPrimaryAccountNumberID;
            lhsPrimaryAccountNumberID = this.getPrimaryAccountNumberID();
            PrimaryAccountNumberIDType rhsPrimaryAccountNumberID;
            rhsPrimaryAccountNumberID = that.getPrimaryAccountNumberID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primaryAccountNumberID", lhsPrimaryAccountNumberID), LocatorUtils.property(thatLocator, "primaryAccountNumberID", rhsPrimaryAccountNumberID), lhsPrimaryAccountNumberID, rhsPrimaryAccountNumberID, (this.primaryAccountNumberID!= null), (that.primaryAccountNumberID!= null))) {
                return false;
            }
        }
        {
            NetworkIDType lhsNetworkID;
            lhsNetworkID = this.getNetworkID();
            NetworkIDType rhsNetworkID;
            rhsNetworkID = that.getNetworkID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "networkID", lhsNetworkID), LocatorUtils.property(thatLocator, "networkID", rhsNetworkID), lhsNetworkID, rhsNetworkID, (this.networkID!= null), (that.networkID!= null))) {
                return false;
            }
        }
        {
            CardTypeCodeType lhsCardTypeCode;
            lhsCardTypeCode = this.getCardTypeCode();
            CardTypeCodeType rhsCardTypeCode;
            rhsCardTypeCode = that.getCardTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardTypeCode", lhsCardTypeCode), LocatorUtils.property(thatLocator, "cardTypeCode", rhsCardTypeCode), lhsCardTypeCode, rhsCardTypeCode, (this.cardTypeCode!= null), (that.cardTypeCode!= null))) {
                return false;
            }
        }
        {
            ValidityStartDateType lhsValidityStartDate;
            lhsValidityStartDate = this.getValidityStartDate();
            ValidityStartDateType rhsValidityStartDate;
            rhsValidityStartDate = that.getValidityStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validityStartDate", lhsValidityStartDate), LocatorUtils.property(thatLocator, "validityStartDate", rhsValidityStartDate), lhsValidityStartDate, rhsValidityStartDate, (this.validityStartDate!= null), (that.validityStartDate!= null))) {
                return false;
            }
        }
        {
            ExpiryDateType lhsExpiryDate;
            lhsExpiryDate = this.getExpiryDate();
            ExpiryDateType rhsExpiryDate;
            rhsExpiryDate = that.getExpiryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expiryDate", lhsExpiryDate), LocatorUtils.property(thatLocator, "expiryDate", rhsExpiryDate), lhsExpiryDate, rhsExpiryDate, (this.expiryDate!= null), (that.expiryDate!= null))) {
                return false;
            }
        }
        {
            IssuerIDType lhsIssuerID;
            lhsIssuerID = this.getIssuerID();
            IssuerIDType rhsIssuerID;
            rhsIssuerID = that.getIssuerID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issuerID", lhsIssuerID), LocatorUtils.property(thatLocator, "issuerID", rhsIssuerID), lhsIssuerID, rhsIssuerID, (this.issuerID!= null), (that.issuerID!= null))) {
                return false;
            }
        }
        {
            IssueNumberIDType lhsIssueNumberID;
            lhsIssueNumberID = this.getIssueNumberID();
            IssueNumberIDType rhsIssueNumberID;
            rhsIssueNumberID = that.getIssueNumberID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issueNumberID", lhsIssueNumberID), LocatorUtils.property(thatLocator, "issueNumberID", rhsIssueNumberID), lhsIssueNumberID, rhsIssueNumberID, (this.issueNumberID!= null), (that.issueNumberID!= null))) {
                return false;
            }
        }
        {
            CV2IDType lhsCV2ID;
            lhsCV2ID = this.getCV2ID();
            CV2IDType rhsCV2ID;
            rhsCV2ID = that.getCV2ID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cv2ID", lhsCV2ID), LocatorUtils.property(thatLocator, "cv2ID", rhsCV2ID), lhsCV2ID, rhsCV2ID, (this.cv2ID!= null), (that.cv2ID!= null))) {
                return false;
            }
        }
        {
            CardChipCodeType lhsCardChipCode;
            lhsCardChipCode = this.getCardChipCode();
            CardChipCodeType rhsCardChipCode;
            rhsCardChipCode = that.getCardChipCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cardChipCode", lhsCardChipCode), LocatorUtils.property(thatLocator, "cardChipCode", rhsCardChipCode), lhsCardChipCode, rhsCardChipCode, (this.cardChipCode!= null), (that.cardChipCode!= null))) {
                return false;
            }
        }
        {
            ChipApplicationIDType lhsChipApplicationID;
            lhsChipApplicationID = this.getChipApplicationID();
            ChipApplicationIDType rhsChipApplicationID;
            rhsChipApplicationID = that.getChipApplicationID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "chipApplicationID", lhsChipApplicationID), LocatorUtils.property(thatLocator, "chipApplicationID", rhsChipApplicationID), lhsChipApplicationID, rhsChipApplicationID, (this.chipApplicationID!= null), (that.chipApplicationID!= null))) {
                return false;
            }
        }
        {
            HolderNameType lhsHolderName;
            lhsHolderName = this.getHolderName();
            HolderNameType rhsHolderName;
            rhsHolderName = that.getHolderName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "holderName", lhsHolderName), LocatorUtils.property(thatLocator, "holderName", rhsHolderName), lhsHolderName, rhsHolderName, (this.holderName!= null), (that.holderName!= null))) {
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
            PrimaryAccountNumberIDType thePrimaryAccountNumberID;
            thePrimaryAccountNumberID = this.getPrimaryAccountNumberID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primaryAccountNumberID", thePrimaryAccountNumberID), currentHashCode, thePrimaryAccountNumberID, (this.primaryAccountNumberID!= null));
        }
        {
            NetworkIDType theNetworkID;
            theNetworkID = this.getNetworkID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "networkID", theNetworkID), currentHashCode, theNetworkID, (this.networkID!= null));
        }
        {
            CardTypeCodeType theCardTypeCode;
            theCardTypeCode = this.getCardTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardTypeCode", theCardTypeCode), currentHashCode, theCardTypeCode, (this.cardTypeCode!= null));
        }
        {
            ValidityStartDateType theValidityStartDate;
            theValidityStartDate = this.getValidityStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validityStartDate", theValidityStartDate), currentHashCode, theValidityStartDate, (this.validityStartDate!= null));
        }
        {
            ExpiryDateType theExpiryDate;
            theExpiryDate = this.getExpiryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expiryDate", theExpiryDate), currentHashCode, theExpiryDate, (this.expiryDate!= null));
        }
        {
            IssuerIDType theIssuerID;
            theIssuerID = this.getIssuerID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issuerID", theIssuerID), currentHashCode, theIssuerID, (this.issuerID!= null));
        }
        {
            IssueNumberIDType theIssueNumberID;
            theIssueNumberID = this.getIssueNumberID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issueNumberID", theIssueNumberID), currentHashCode, theIssueNumberID, (this.issueNumberID!= null));
        }
        {
            CV2IDType theCV2ID;
            theCV2ID = this.getCV2ID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cv2ID", theCV2ID), currentHashCode, theCV2ID, (this.cv2ID!= null));
        }
        {
            CardChipCodeType theCardChipCode;
            theCardChipCode = this.getCardChipCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cardChipCode", theCardChipCode), currentHashCode, theCardChipCode, (this.cardChipCode!= null));
        }
        {
            ChipApplicationIDType theChipApplicationID;
            theChipApplicationID = this.getChipApplicationID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chipApplicationID", theChipApplicationID), currentHashCode, theChipApplicationID, (this.chipApplicationID!= null));
        }
        {
            HolderNameType theHolderName;
            theHolderName = this.getHolderName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "holderName", theHolderName), currentHashCode, theHolderName, (this.holderName!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
