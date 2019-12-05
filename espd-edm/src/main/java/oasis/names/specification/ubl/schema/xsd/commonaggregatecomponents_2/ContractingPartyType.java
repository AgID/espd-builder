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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BuyerProfileURIType;
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
 * <p>Classe Java per ContractingPartyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ContractingPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BuyerProfileURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractingPartyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractingActivity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractingPartyType", propOrder = {
    "buyerProfileURI",
    "contractingPartyType",
    "contractingActivity",
    "party"
})
public class ContractingPartyType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "BuyerProfileURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BuyerProfileURIType buyerProfileURI;
    @XmlElement(name = "ContractingPartyType")
    protected List<ContractingPartyTypeType> contractingPartyType;
    @XmlElement(name = "ContractingActivity")
    protected List<ContractingActivityType> contractingActivity;
    @XmlElement(name = "Party", required = true)
    protected PartyType party;

    /**
     * Recupera il valore della proprietà buyerProfileURI.
     * 
     * @return
     *     possible object is
     *     {@link BuyerProfileURIType }
     *     
     */
    public BuyerProfileURIType getBuyerProfileURI() {
        return buyerProfileURI;
    }

    /**
     * Imposta il valore della proprietà buyerProfileURI.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerProfileURIType }
     *     
     */
    public void setBuyerProfileURI(BuyerProfileURIType value) {
        this.buyerProfileURI = value;
    }

    /**
     * Gets the value of the contractingPartyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractingPartyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractingPartyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractingPartyTypeType }
     * 
     * 
     */
    public List<ContractingPartyTypeType> getContractingPartyType() {
        if (contractingPartyType == null) {
            contractingPartyType = new ArrayList<ContractingPartyTypeType>();
        }
        return this.contractingPartyType;
    }

    /**
     * Gets the value of the contractingActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractingActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractingActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractingActivityType }
     * 
     * 
     */
    public List<ContractingActivityType> getContractingActivity() {
        if (contractingActivity == null) {
            contractingActivity = new ArrayList<ContractingActivityType>();
        }
        return this.contractingActivity;
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
            BuyerProfileURIType theBuyerProfileURI;
            theBuyerProfileURI = this.getBuyerProfileURI();
            strategy.appendField(locator, this, "buyerProfileURI", buffer, theBuyerProfileURI, (this.buyerProfileURI!= null));
        }
        {
            List<ContractingPartyTypeType> theContractingPartyType;
            theContractingPartyType = (((this.contractingPartyType!= null)&&(!this.contractingPartyType.isEmpty()))?this.getContractingPartyType():null);
            strategy.appendField(locator, this, "contractingPartyType", buffer, theContractingPartyType, ((this.contractingPartyType!= null)&&(!this.contractingPartyType.isEmpty())));
        }
        {
            List<ContractingActivityType> theContractingActivity;
            theContractingActivity = (((this.contractingActivity!= null)&&(!this.contractingActivity.isEmpty()))?this.getContractingActivity():null);
            strategy.appendField(locator, this, "contractingActivity", buffer, theContractingActivity, ((this.contractingActivity!= null)&&(!this.contractingActivity.isEmpty())));
        }
        {
            PartyType theParty;
            theParty = this.getParty();
            strategy.appendField(locator, this, "party", buffer, theParty, (this.party!= null));
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
        final ContractingPartyType that = ((ContractingPartyType) object);
        {
            BuyerProfileURIType lhsBuyerProfileURI;
            lhsBuyerProfileURI = this.getBuyerProfileURI();
            BuyerProfileURIType rhsBuyerProfileURI;
            rhsBuyerProfileURI = that.getBuyerProfileURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buyerProfileURI", lhsBuyerProfileURI), LocatorUtils.property(thatLocator, "buyerProfileURI", rhsBuyerProfileURI), lhsBuyerProfileURI, rhsBuyerProfileURI, (this.buyerProfileURI!= null), (that.buyerProfileURI!= null))) {
                return false;
            }
        }
        {
            List<ContractingPartyTypeType> lhsContractingPartyType;
            lhsContractingPartyType = (((this.contractingPartyType!= null)&&(!this.contractingPartyType.isEmpty()))?this.getContractingPartyType():null);
            List<ContractingPartyTypeType> rhsContractingPartyType;
            rhsContractingPartyType = (((that.contractingPartyType!= null)&&(!that.contractingPartyType.isEmpty()))?that.getContractingPartyType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractingPartyType", lhsContractingPartyType), LocatorUtils.property(thatLocator, "contractingPartyType", rhsContractingPartyType), lhsContractingPartyType, rhsContractingPartyType, ((this.contractingPartyType!= null)&&(!this.contractingPartyType.isEmpty())), ((that.contractingPartyType!= null)&&(!that.contractingPartyType.isEmpty())))) {
                return false;
            }
        }
        {
            List<ContractingActivityType> lhsContractingActivity;
            lhsContractingActivity = (((this.contractingActivity!= null)&&(!this.contractingActivity.isEmpty()))?this.getContractingActivity():null);
            List<ContractingActivityType> rhsContractingActivity;
            rhsContractingActivity = (((that.contractingActivity!= null)&&(!that.contractingActivity.isEmpty()))?that.getContractingActivity():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractingActivity", lhsContractingActivity), LocatorUtils.property(thatLocator, "contractingActivity", rhsContractingActivity), lhsContractingActivity, rhsContractingActivity, ((this.contractingActivity!= null)&&(!this.contractingActivity.isEmpty())), ((that.contractingActivity!= null)&&(!that.contractingActivity.isEmpty())))) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            BuyerProfileURIType theBuyerProfileURI;
            theBuyerProfileURI = this.getBuyerProfileURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "buyerProfileURI", theBuyerProfileURI), currentHashCode, theBuyerProfileURI, (this.buyerProfileURI!= null));
        }
        {
            List<ContractingPartyTypeType> theContractingPartyType;
            theContractingPartyType = (((this.contractingPartyType!= null)&&(!this.contractingPartyType.isEmpty()))?this.getContractingPartyType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractingPartyType", theContractingPartyType), currentHashCode, theContractingPartyType, ((this.contractingPartyType!= null)&&(!this.contractingPartyType.isEmpty())));
        }
        {
            List<ContractingActivityType> theContractingActivity;
            theContractingActivity = (((this.contractingActivity!= null)&&(!this.contractingActivity.isEmpty()))?this.getContractingActivity():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractingActivity", theContractingActivity), currentHashCode, theContractingActivity, ((this.contractingActivity!= null)&&(!this.contractingActivity.isEmpty())));
        }
        {
            PartyType theParty;
            theParty = this.getParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "party", theParty), currentHashCode, theParty, (this.party!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
