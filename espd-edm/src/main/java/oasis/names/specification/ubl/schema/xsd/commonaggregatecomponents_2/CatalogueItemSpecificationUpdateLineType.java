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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
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
 * <p>Classe Java per CatalogueItemSpecificationUpdateLineType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CatalogueItemSpecificationUpdateLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractorCustomerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerSupplierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueItemSpecificationUpdateLineType", propOrder = {
    "id",
    "contractorCustomerParty",
    "sellerSupplierParty",
    "item"
})
public class CatalogueItemSpecificationUpdateLineType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IDType id;
    @XmlElement(name = "ContractorCustomerParty")
    protected CustomerPartyType contractorCustomerParty;
    @XmlElement(name = "SellerSupplierParty")
    protected SupplierPartyType sellerSupplierParty;
    @XmlElement(name = "Item", required = true)
    protected ItemType item;

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
     * Recupera il valore della proprietà contractorCustomerParty.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getContractorCustomerParty() {
        return contractorCustomerParty;
    }

    /**
     * Imposta il valore della proprietà contractorCustomerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setContractorCustomerParty(CustomerPartyType value) {
        this.contractorCustomerParty = value;
    }

    /**
     * Recupera il valore della proprietà sellerSupplierParty.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getSellerSupplierParty() {
        return sellerSupplierParty;
    }

    /**
     * Imposta il valore della proprietà sellerSupplierParty.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setSellerSupplierParty(SupplierPartyType value) {
        this.sellerSupplierParty = value;
    }

    /**
     * Recupera il valore della proprietà item.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Imposta il valore della proprietà item.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
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
            CustomerPartyType theContractorCustomerParty;
            theContractorCustomerParty = this.getContractorCustomerParty();
            strategy.appendField(locator, this, "contractorCustomerParty", buffer, theContractorCustomerParty, (this.contractorCustomerParty!= null));
        }
        {
            SupplierPartyType theSellerSupplierParty;
            theSellerSupplierParty = this.getSellerSupplierParty();
            strategy.appendField(locator, this, "sellerSupplierParty", buffer, theSellerSupplierParty, (this.sellerSupplierParty!= null));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            strategy.appendField(locator, this, "item", buffer, theItem, (this.item!= null));
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
        final CatalogueItemSpecificationUpdateLineType that = ((CatalogueItemSpecificationUpdateLineType) object);
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
            CustomerPartyType lhsContractorCustomerParty;
            lhsContractorCustomerParty = this.getContractorCustomerParty();
            CustomerPartyType rhsContractorCustomerParty;
            rhsContractorCustomerParty = that.getContractorCustomerParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractorCustomerParty", lhsContractorCustomerParty), LocatorUtils.property(thatLocator, "contractorCustomerParty", rhsContractorCustomerParty), lhsContractorCustomerParty, rhsContractorCustomerParty, (this.contractorCustomerParty!= null), (that.contractorCustomerParty!= null))) {
                return false;
            }
        }
        {
            SupplierPartyType lhsSellerSupplierParty;
            lhsSellerSupplierParty = this.getSellerSupplierParty();
            SupplierPartyType rhsSellerSupplierParty;
            rhsSellerSupplierParty = that.getSellerSupplierParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sellerSupplierParty", lhsSellerSupplierParty), LocatorUtils.property(thatLocator, "sellerSupplierParty", rhsSellerSupplierParty), lhsSellerSupplierParty, rhsSellerSupplierParty, (this.sellerSupplierParty!= null), (that.sellerSupplierParty!= null))) {
                return false;
            }
        }
        {
            ItemType lhsItem;
            lhsItem = this.getItem();
            ItemType rhsItem;
            rhsItem = that.getItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "item", lhsItem), LocatorUtils.property(thatLocator, "item", rhsItem), lhsItem, rhsItem, (this.item!= null), (that.item!= null))) {
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
            CustomerPartyType theContractorCustomerParty;
            theContractorCustomerParty = this.getContractorCustomerParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractorCustomerParty", theContractorCustomerParty), currentHashCode, theContractorCustomerParty, (this.contractorCustomerParty!= null));
        }
        {
            SupplierPartyType theSellerSupplierParty;
            theSellerSupplierParty = this.getSellerSupplierParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sellerSupplierParty", theSellerSupplierParty), currentHashCode, theSellerSupplierParty, (this.sellerSupplierParty!= null));
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "item", theItem), currentHashCode, theItem, (this.item!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
