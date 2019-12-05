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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FinancingInstrumentCodeType;
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
 * <p>Classe Java per TradeFinancingType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TradeFinancingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FinancingInstrumentCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancingParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancingFinancialAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Clause" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeFinancingType", propOrder = {
    "id",
    "financingInstrumentCode",
    "contractDocumentReference",
    "documentReference",
    "financingParty",
    "financingFinancialAccount",
    "clause"
})
public class TradeFinancingType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "FinancingInstrumentCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FinancingInstrumentCodeType financingInstrumentCode;
    @XmlElement(name = "ContractDocumentReference")
    protected DocumentReferenceType contractDocumentReference;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "FinancingParty", required = true)
    protected PartyType financingParty;
    @XmlElement(name = "FinancingFinancialAccount")
    protected FinancialAccountType financingFinancialAccount;
    @XmlElement(name = "Clause")
    protected List<ClauseType> clause;

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
     * Recupera il valore della proprietà financingInstrumentCode.
     * 
     * @return
     *     possible object is
     *     {@link FinancingInstrumentCodeType }
     *     
     */
    public FinancingInstrumentCodeType getFinancingInstrumentCode() {
        return financingInstrumentCode;
    }

    /**
     * Imposta il valore della proprietà financingInstrumentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingInstrumentCodeType }
     *     
     */
    public void setFinancingInstrumentCode(FinancingInstrumentCodeType value) {
        this.financingInstrumentCode = value;
    }

    /**
     * Recupera il valore della proprietà contractDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getContractDocumentReference() {
        return contractDocumentReference;
    }

    /**
     * Imposta il valore della proprietà contractDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setContractDocumentReference(DocumentReferenceType value) {
        this.contractDocumentReference = value;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReference;
    }

    /**
     * Recupera il valore della proprietà financingParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getFinancingParty() {
        return financingParty;
    }

    /**
     * Imposta il valore della proprietà financingParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setFinancingParty(PartyType value) {
        this.financingParty = value;
    }

    /**
     * Recupera il valore della proprietà financingFinancialAccount.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountType }
     *     
     */
    public FinancialAccountType getFinancingFinancialAccount() {
        return financingFinancialAccount;
    }

    /**
     * Imposta il valore della proprietà financingFinancialAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountType }
     *     
     */
    public void setFinancingFinancialAccount(FinancialAccountType value) {
        this.financingFinancialAccount = value;
    }

    /**
     * Gets the value of the clause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClauseType }
     * 
     * 
     */
    public List<ClauseType> getClause() {
        if (clause == null) {
            clause = new ArrayList<ClauseType>();
        }
        return this.clause;
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
            FinancingInstrumentCodeType theFinancingInstrumentCode;
            theFinancingInstrumentCode = this.getFinancingInstrumentCode();
            strategy.appendField(locator, this, "financingInstrumentCode", buffer, theFinancingInstrumentCode, (this.financingInstrumentCode!= null));
        }
        {
            DocumentReferenceType theContractDocumentReference;
            theContractDocumentReference = this.getContractDocumentReference();
            strategy.appendField(locator, this, "contractDocumentReference", buffer, theContractDocumentReference, (this.contractDocumentReference!= null));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            strategy.appendField(locator, this, "documentReference", buffer, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            PartyType theFinancingParty;
            theFinancingParty = this.getFinancingParty();
            strategy.appendField(locator, this, "financingParty", buffer, theFinancingParty, (this.financingParty!= null));
        }
        {
            FinancialAccountType theFinancingFinancialAccount;
            theFinancingFinancialAccount = this.getFinancingFinancialAccount();
            strategy.appendField(locator, this, "financingFinancialAccount", buffer, theFinancingFinancialAccount, (this.financingFinancialAccount!= null));
        }
        {
            List<ClauseType> theClause;
            theClause = (((this.clause!= null)&&(!this.clause.isEmpty()))?this.getClause():null);
            strategy.appendField(locator, this, "clause", buffer, theClause, ((this.clause!= null)&&(!this.clause.isEmpty())));
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
        final TradeFinancingType that = ((TradeFinancingType) object);
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
            FinancingInstrumentCodeType lhsFinancingInstrumentCode;
            lhsFinancingInstrumentCode = this.getFinancingInstrumentCode();
            FinancingInstrumentCodeType rhsFinancingInstrumentCode;
            rhsFinancingInstrumentCode = that.getFinancingInstrumentCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financingInstrumentCode", lhsFinancingInstrumentCode), LocatorUtils.property(thatLocator, "financingInstrumentCode", rhsFinancingInstrumentCode), lhsFinancingInstrumentCode, rhsFinancingInstrumentCode, (this.financingInstrumentCode!= null), (that.financingInstrumentCode!= null))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsContractDocumentReference;
            lhsContractDocumentReference = this.getContractDocumentReference();
            DocumentReferenceType rhsContractDocumentReference;
            rhsContractDocumentReference = that.getContractDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractDocumentReference", lhsContractDocumentReference), LocatorUtils.property(thatLocator, "contractDocumentReference", rhsContractDocumentReference), lhsContractDocumentReference, rhsContractDocumentReference, (this.contractDocumentReference!= null), (that.contractDocumentReference!= null))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsDocumentReference;
            lhsDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            List<DocumentReferenceType> rhsDocumentReference;
            rhsDocumentReference = (((that.documentReference!= null)&&(!that.documentReference.isEmpty()))?that.getDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentReference", lhsDocumentReference), LocatorUtils.property(thatLocator, "documentReference", rhsDocumentReference), lhsDocumentReference, rhsDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())), ((that.documentReference!= null)&&(!that.documentReference.isEmpty())))) {
                return false;
            }
        }
        {
            PartyType lhsFinancingParty;
            lhsFinancingParty = this.getFinancingParty();
            PartyType rhsFinancingParty;
            rhsFinancingParty = that.getFinancingParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financingParty", lhsFinancingParty), LocatorUtils.property(thatLocator, "financingParty", rhsFinancingParty), lhsFinancingParty, rhsFinancingParty, (this.financingParty!= null), (that.financingParty!= null))) {
                return false;
            }
        }
        {
            FinancialAccountType lhsFinancingFinancialAccount;
            lhsFinancingFinancialAccount = this.getFinancingFinancialAccount();
            FinancialAccountType rhsFinancingFinancialAccount;
            rhsFinancingFinancialAccount = that.getFinancingFinancialAccount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financingFinancialAccount", lhsFinancingFinancialAccount), LocatorUtils.property(thatLocator, "financingFinancialAccount", rhsFinancingFinancialAccount), lhsFinancingFinancialAccount, rhsFinancingFinancialAccount, (this.financingFinancialAccount!= null), (that.financingFinancialAccount!= null))) {
                return false;
            }
        }
        {
            List<ClauseType> lhsClause;
            lhsClause = (((this.clause!= null)&&(!this.clause.isEmpty()))?this.getClause():null);
            List<ClauseType> rhsClause;
            rhsClause = (((that.clause!= null)&&(!that.clause.isEmpty()))?that.getClause():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clause", lhsClause), LocatorUtils.property(thatLocator, "clause", rhsClause), lhsClause, rhsClause, ((this.clause!= null)&&(!this.clause.isEmpty())), ((that.clause!= null)&&(!that.clause.isEmpty())))) {
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
            FinancingInstrumentCodeType theFinancingInstrumentCode;
            theFinancingInstrumentCode = this.getFinancingInstrumentCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financingInstrumentCode", theFinancingInstrumentCode), currentHashCode, theFinancingInstrumentCode, (this.financingInstrumentCode!= null));
        }
        {
            DocumentReferenceType theContractDocumentReference;
            theContractDocumentReference = this.getContractDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractDocumentReference", theContractDocumentReference), currentHashCode, theContractDocumentReference, (this.contractDocumentReference!= null));
        }
        {
            List<DocumentReferenceType> theDocumentReference;
            theDocumentReference = (((this.documentReference!= null)&&(!this.documentReference.isEmpty()))?this.getDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentReference", theDocumentReference), currentHashCode, theDocumentReference, ((this.documentReference!= null)&&(!this.documentReference.isEmpty())));
        }
        {
            PartyType theFinancingParty;
            theFinancingParty = this.getFinancingParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financingParty", theFinancingParty), currentHashCode, theFinancingParty, (this.financingParty!= null));
        }
        {
            FinancialAccountType theFinancingFinancialAccount;
            theFinancingFinancialAccount = this.getFinancingFinancialAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financingFinancialAccount", theFinancingFinancialAccount), currentHashCode, theFinancingFinancialAccount, (this.financingFinancialAccount!= null));
        }
        {
            List<ClauseType> theClause;
            theClause = (((this.clause!= null)&&(!this.clause.isEmpty()))?this.getClause():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clause", theClause), currentHashCode, theClause, ((this.clause!= null)&&(!this.clause.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
