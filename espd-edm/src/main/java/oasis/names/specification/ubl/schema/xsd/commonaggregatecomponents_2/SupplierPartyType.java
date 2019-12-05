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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AdditionalAccountIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CustomerAssignedAccountIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DataSendingCapabilityType;
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
 * <p>Classe Java per SupplierPartyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SupplierPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomerAssignedAccountID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalAccountID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DataSendingCapability" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchContact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AccountingContact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerContact" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierPartyType", propOrder = {
    "customerAssignedAccountID",
    "additionalAccountID",
    "dataSendingCapability",
    "party",
    "despatchContact",
    "accountingContact",
    "sellerContact"
})
public class SupplierPartyType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "CustomerAssignedAccountID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CustomerAssignedAccountIDType customerAssignedAccountID;
    @XmlElement(name = "AdditionalAccountID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<AdditionalAccountIDType> additionalAccountID;
    @XmlElement(name = "DataSendingCapability", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DataSendingCapabilityType dataSendingCapability;
    @XmlElement(name = "Party")
    protected PartyType party;
    @XmlElement(name = "DespatchContact")
    protected ContactType despatchContact;
    @XmlElement(name = "AccountingContact")
    protected ContactType accountingContact;
    @XmlElement(name = "SellerContact")
    protected ContactType sellerContact;

    /**
     * Recupera il valore della proprietà customerAssignedAccountID.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAssignedAccountIDType }
     *     
     */
    public CustomerAssignedAccountIDType getCustomerAssignedAccountID() {
        return customerAssignedAccountID;
    }

    /**
     * Imposta il valore della proprietà customerAssignedAccountID.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAssignedAccountIDType }
     *     
     */
    public void setCustomerAssignedAccountID(CustomerAssignedAccountIDType value) {
        this.customerAssignedAccountID = value;
    }

    /**
     * Gets the value of the additionalAccountID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalAccountID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalAccountID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalAccountIDType }
     * 
     * 
     */
    public List<AdditionalAccountIDType> getAdditionalAccountID() {
        if (additionalAccountID == null) {
            additionalAccountID = new ArrayList<AdditionalAccountIDType>();
        }
        return this.additionalAccountID;
    }

    /**
     * Recupera il valore della proprietà dataSendingCapability.
     * 
     * @return
     *     possible object is
     *     {@link DataSendingCapabilityType }
     *     
     */
    public DataSendingCapabilityType getDataSendingCapability() {
        return dataSendingCapability;
    }

    /**
     * Imposta il valore della proprietà dataSendingCapability.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSendingCapabilityType }
     *     
     */
    public void setDataSendingCapability(DataSendingCapabilityType value) {
        this.dataSendingCapability = value;
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
     * Recupera il valore della proprietà despatchContact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getDespatchContact() {
        return despatchContact;
    }

    /**
     * Imposta il valore della proprietà despatchContact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setDespatchContact(ContactType value) {
        this.despatchContact = value;
    }

    /**
     * Recupera il valore della proprietà accountingContact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getAccountingContact() {
        return accountingContact;
    }

    /**
     * Imposta il valore della proprietà accountingContact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setAccountingContact(ContactType value) {
        this.accountingContact = value;
    }

    /**
     * Recupera il valore della proprietà sellerContact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getSellerContact() {
        return sellerContact;
    }

    /**
     * Imposta il valore della proprietà sellerContact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setSellerContact(ContactType value) {
        this.sellerContact = value;
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
            CustomerAssignedAccountIDType theCustomerAssignedAccountID;
            theCustomerAssignedAccountID = this.getCustomerAssignedAccountID();
            strategy.appendField(locator, this, "customerAssignedAccountID", buffer, theCustomerAssignedAccountID, (this.customerAssignedAccountID!= null));
        }
        {
            List<AdditionalAccountIDType> theAdditionalAccountID;
            theAdditionalAccountID = (((this.additionalAccountID!= null)&&(!this.additionalAccountID.isEmpty()))?this.getAdditionalAccountID():null);
            strategy.appendField(locator, this, "additionalAccountID", buffer, theAdditionalAccountID, ((this.additionalAccountID!= null)&&(!this.additionalAccountID.isEmpty())));
        }
        {
            DataSendingCapabilityType theDataSendingCapability;
            theDataSendingCapability = this.getDataSendingCapability();
            strategy.appendField(locator, this, "dataSendingCapability", buffer, theDataSendingCapability, (this.dataSendingCapability!= null));
        }
        {
            PartyType theParty;
            theParty = this.getParty();
            strategy.appendField(locator, this, "party", buffer, theParty, (this.party!= null));
        }
        {
            ContactType theDespatchContact;
            theDespatchContact = this.getDespatchContact();
            strategy.appendField(locator, this, "despatchContact", buffer, theDespatchContact, (this.despatchContact!= null));
        }
        {
            ContactType theAccountingContact;
            theAccountingContact = this.getAccountingContact();
            strategy.appendField(locator, this, "accountingContact", buffer, theAccountingContact, (this.accountingContact!= null));
        }
        {
            ContactType theSellerContact;
            theSellerContact = this.getSellerContact();
            strategy.appendField(locator, this, "sellerContact", buffer, theSellerContact, (this.sellerContact!= null));
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
        final SupplierPartyType that = ((SupplierPartyType) object);
        {
            CustomerAssignedAccountIDType lhsCustomerAssignedAccountID;
            lhsCustomerAssignedAccountID = this.getCustomerAssignedAccountID();
            CustomerAssignedAccountIDType rhsCustomerAssignedAccountID;
            rhsCustomerAssignedAccountID = that.getCustomerAssignedAccountID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerAssignedAccountID", lhsCustomerAssignedAccountID), LocatorUtils.property(thatLocator, "customerAssignedAccountID", rhsCustomerAssignedAccountID), lhsCustomerAssignedAccountID, rhsCustomerAssignedAccountID, (this.customerAssignedAccountID!= null), (that.customerAssignedAccountID!= null))) {
                return false;
            }
        }
        {
            List<AdditionalAccountIDType> lhsAdditionalAccountID;
            lhsAdditionalAccountID = (((this.additionalAccountID!= null)&&(!this.additionalAccountID.isEmpty()))?this.getAdditionalAccountID():null);
            List<AdditionalAccountIDType> rhsAdditionalAccountID;
            rhsAdditionalAccountID = (((that.additionalAccountID!= null)&&(!that.additionalAccountID.isEmpty()))?that.getAdditionalAccountID():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalAccountID", lhsAdditionalAccountID), LocatorUtils.property(thatLocator, "additionalAccountID", rhsAdditionalAccountID), lhsAdditionalAccountID, rhsAdditionalAccountID, ((this.additionalAccountID!= null)&&(!this.additionalAccountID.isEmpty())), ((that.additionalAccountID!= null)&&(!that.additionalAccountID.isEmpty())))) {
                return false;
            }
        }
        {
            DataSendingCapabilityType lhsDataSendingCapability;
            lhsDataSendingCapability = this.getDataSendingCapability();
            DataSendingCapabilityType rhsDataSendingCapability;
            rhsDataSendingCapability = that.getDataSendingCapability();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataSendingCapability", lhsDataSendingCapability), LocatorUtils.property(thatLocator, "dataSendingCapability", rhsDataSendingCapability), lhsDataSendingCapability, rhsDataSendingCapability, (this.dataSendingCapability!= null), (that.dataSendingCapability!= null))) {
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
            ContactType lhsDespatchContact;
            lhsDespatchContact = this.getDespatchContact();
            ContactType rhsDespatchContact;
            rhsDespatchContact = that.getDespatchContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "despatchContact", lhsDespatchContact), LocatorUtils.property(thatLocator, "despatchContact", rhsDespatchContact), lhsDespatchContact, rhsDespatchContact, (this.despatchContact!= null), (that.despatchContact!= null))) {
                return false;
            }
        }
        {
            ContactType lhsAccountingContact;
            lhsAccountingContact = this.getAccountingContact();
            ContactType rhsAccountingContact;
            rhsAccountingContact = that.getAccountingContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountingContact", lhsAccountingContact), LocatorUtils.property(thatLocator, "accountingContact", rhsAccountingContact), lhsAccountingContact, rhsAccountingContact, (this.accountingContact!= null), (that.accountingContact!= null))) {
                return false;
            }
        }
        {
            ContactType lhsSellerContact;
            lhsSellerContact = this.getSellerContact();
            ContactType rhsSellerContact;
            rhsSellerContact = that.getSellerContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sellerContact", lhsSellerContact), LocatorUtils.property(thatLocator, "sellerContact", rhsSellerContact), lhsSellerContact, rhsSellerContact, (this.sellerContact!= null), (that.sellerContact!= null))) {
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
            CustomerAssignedAccountIDType theCustomerAssignedAccountID;
            theCustomerAssignedAccountID = this.getCustomerAssignedAccountID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerAssignedAccountID", theCustomerAssignedAccountID), currentHashCode, theCustomerAssignedAccountID, (this.customerAssignedAccountID!= null));
        }
        {
            List<AdditionalAccountIDType> theAdditionalAccountID;
            theAdditionalAccountID = (((this.additionalAccountID!= null)&&(!this.additionalAccountID.isEmpty()))?this.getAdditionalAccountID():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalAccountID", theAdditionalAccountID), currentHashCode, theAdditionalAccountID, ((this.additionalAccountID!= null)&&(!this.additionalAccountID.isEmpty())));
        }
        {
            DataSendingCapabilityType theDataSendingCapability;
            theDataSendingCapability = this.getDataSendingCapability();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataSendingCapability", theDataSendingCapability), currentHashCode, theDataSendingCapability, (this.dataSendingCapability!= null));
        }
        {
            PartyType theParty;
            theParty = this.getParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "party", theParty), currentHashCode, theParty, (this.party!= null));
        }
        {
            ContactType theDespatchContact;
            theDespatchContact = this.getDespatchContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "despatchContact", theDespatchContact), currentHashCode, theDespatchContact, (this.despatchContact!= null));
        }
        {
            ContactType theAccountingContact;
            theAccountingContact = this.getAccountingContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountingContact", theAccountingContact), currentHashCode, theAccountingContact, (this.accountingContact!= null));
        }
        {
            ContactType theSellerContact;
            theSellerContact = this.getSellerContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sellerContact", theSellerContact), currentHashCode, theSellerContact, (this.sellerContact!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
