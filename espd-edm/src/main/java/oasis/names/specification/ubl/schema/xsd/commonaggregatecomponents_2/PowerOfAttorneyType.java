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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueTimeType;
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
 * <p>Classe Java per PowerOfAttorneyType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PowerOfAttorneyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotaryParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AgentParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WitnessParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MandateDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerOfAttorneyType", propOrder = {
    "id",
    "issueDate",
    "issueTime",
    "description",
    "notaryParty",
    "agentParty",
    "witnessParty",
    "mandateDocumentReference"
})
public class PowerOfAttorneyType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssueDateType issueDate;
    @XmlElement(name = "IssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssueTimeType issueTime;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "NotaryParty")
    protected PartyType notaryParty;
    @XmlElement(name = "AgentParty", required = true)
    protected PartyType agentParty;
    @XmlElement(name = "WitnessParty")
    protected List<PartyType> witnessParty;
    @XmlElement(name = "MandateDocumentReference")
    protected List<DocumentReferenceType> mandateDocumentReference;

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
     * Recupera il valore della proprietà issueTime.
     * 
     * @return
     *     possible object is
     *     {@link IssueTimeType }
     *     
     */
    public IssueTimeType getIssueTime() {
        return issueTime;
    }

    /**
     * Imposta il valore della proprietà issueTime.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueTimeType }
     *     
     */
    public void setIssueTime(IssueTimeType value) {
        this.issueTime = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Recupera il valore della proprietà notaryParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getNotaryParty() {
        return notaryParty;
    }

    /**
     * Imposta il valore della proprietà notaryParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setNotaryParty(PartyType value) {
        this.notaryParty = value;
    }

    /**
     * Recupera il valore della proprietà agentParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getAgentParty() {
        return agentParty;
    }

    /**
     * Imposta il valore della proprietà agentParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setAgentParty(PartyType value) {
        this.agentParty = value;
    }

    /**
     * Gets the value of the witnessParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the witnessParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWitnessParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getWitnessParty() {
        if (witnessParty == null) {
            witnessParty = new ArrayList<PartyType>();
        }
        return this.witnessParty;
    }

    /**
     * Gets the value of the mandateDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mandateDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMandateDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getMandateDocumentReference() {
        if (mandateDocumentReference == null) {
            mandateDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.mandateDocumentReference;
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
            IssueDateType theIssueDate;
            theIssueDate = this.getIssueDate();
            strategy.appendField(locator, this, "issueDate", buffer, theIssueDate, (this.issueDate!= null));
        }
        {
            IssueTimeType theIssueTime;
            theIssueTime = this.getIssueTime();
            strategy.appendField(locator, this, "issueTime", buffer, theIssueTime, (this.issueTime!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            PartyType theNotaryParty;
            theNotaryParty = this.getNotaryParty();
            strategy.appendField(locator, this, "notaryParty", buffer, theNotaryParty, (this.notaryParty!= null));
        }
        {
            PartyType theAgentParty;
            theAgentParty = this.getAgentParty();
            strategy.appendField(locator, this, "agentParty", buffer, theAgentParty, (this.agentParty!= null));
        }
        {
            List<PartyType> theWitnessParty;
            theWitnessParty = (((this.witnessParty!= null)&&(!this.witnessParty.isEmpty()))?this.getWitnessParty():null);
            strategy.appendField(locator, this, "witnessParty", buffer, theWitnessParty, ((this.witnessParty!= null)&&(!this.witnessParty.isEmpty())));
        }
        {
            List<DocumentReferenceType> theMandateDocumentReference;
            theMandateDocumentReference = (((this.mandateDocumentReference!= null)&&(!this.mandateDocumentReference.isEmpty()))?this.getMandateDocumentReference():null);
            strategy.appendField(locator, this, "mandateDocumentReference", buffer, theMandateDocumentReference, ((this.mandateDocumentReference!= null)&&(!this.mandateDocumentReference.isEmpty())));
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
        final PowerOfAttorneyType that = ((PowerOfAttorneyType) object);
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
            IssueDateType lhsIssueDate;
            lhsIssueDate = this.getIssueDate();
            IssueDateType rhsIssueDate;
            rhsIssueDate = that.getIssueDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issueDate", lhsIssueDate), LocatorUtils.property(thatLocator, "issueDate", rhsIssueDate), lhsIssueDate, rhsIssueDate, (this.issueDate!= null), (that.issueDate!= null))) {
                return false;
            }
        }
        {
            IssueTimeType lhsIssueTime;
            lhsIssueTime = this.getIssueTime();
            IssueTimeType rhsIssueTime;
            rhsIssueTime = that.getIssueTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "issueTime", lhsIssueTime), LocatorUtils.property(thatLocator, "issueTime", rhsIssueTime), lhsIssueTime, rhsIssueTime, (this.issueTime!= null), (that.issueTime!= null))) {
                return false;
            }
        }
        {
            List<DescriptionType> lhsDescription;
            lhsDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            List<DescriptionType> rhsDescription;
            rhsDescription = (((that.description!= null)&&(!that.description.isEmpty()))?that.getDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, ((this.description!= null)&&(!this.description.isEmpty())), ((that.description!= null)&&(!that.description.isEmpty())))) {
                return false;
            }
        }
        {
            PartyType lhsNotaryParty;
            lhsNotaryParty = this.getNotaryParty();
            PartyType rhsNotaryParty;
            rhsNotaryParty = that.getNotaryParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notaryParty", lhsNotaryParty), LocatorUtils.property(thatLocator, "notaryParty", rhsNotaryParty), lhsNotaryParty, rhsNotaryParty, (this.notaryParty!= null), (that.notaryParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsAgentParty;
            lhsAgentParty = this.getAgentParty();
            PartyType rhsAgentParty;
            rhsAgentParty = that.getAgentParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agentParty", lhsAgentParty), LocatorUtils.property(thatLocator, "agentParty", rhsAgentParty), lhsAgentParty, rhsAgentParty, (this.agentParty!= null), (that.agentParty!= null))) {
                return false;
            }
        }
        {
            List<PartyType> lhsWitnessParty;
            lhsWitnessParty = (((this.witnessParty!= null)&&(!this.witnessParty.isEmpty()))?this.getWitnessParty():null);
            List<PartyType> rhsWitnessParty;
            rhsWitnessParty = (((that.witnessParty!= null)&&(!that.witnessParty.isEmpty()))?that.getWitnessParty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "witnessParty", lhsWitnessParty), LocatorUtils.property(thatLocator, "witnessParty", rhsWitnessParty), lhsWitnessParty, rhsWitnessParty, ((this.witnessParty!= null)&&(!this.witnessParty.isEmpty())), ((that.witnessParty!= null)&&(!that.witnessParty.isEmpty())))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsMandateDocumentReference;
            lhsMandateDocumentReference = (((this.mandateDocumentReference!= null)&&(!this.mandateDocumentReference.isEmpty()))?this.getMandateDocumentReference():null);
            List<DocumentReferenceType> rhsMandateDocumentReference;
            rhsMandateDocumentReference = (((that.mandateDocumentReference!= null)&&(!that.mandateDocumentReference.isEmpty()))?that.getMandateDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mandateDocumentReference", lhsMandateDocumentReference), LocatorUtils.property(thatLocator, "mandateDocumentReference", rhsMandateDocumentReference), lhsMandateDocumentReference, rhsMandateDocumentReference, ((this.mandateDocumentReference!= null)&&(!this.mandateDocumentReference.isEmpty())), ((that.mandateDocumentReference!= null)&&(!that.mandateDocumentReference.isEmpty())))) {
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
            IssueDateType theIssueDate;
            theIssueDate = this.getIssueDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issueDate", theIssueDate), currentHashCode, theIssueDate, (this.issueDate!= null));
        }
        {
            IssueTimeType theIssueTime;
            theIssueTime = this.getIssueTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issueTime", theIssueTime), currentHashCode, theIssueTime, (this.issueTime!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            PartyType theNotaryParty;
            theNotaryParty = this.getNotaryParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notaryParty", theNotaryParty), currentHashCode, theNotaryParty, (this.notaryParty!= null));
        }
        {
            PartyType theAgentParty;
            theAgentParty = this.getAgentParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agentParty", theAgentParty), currentHashCode, theAgentParty, (this.agentParty!= null));
        }
        {
            List<PartyType> theWitnessParty;
            theWitnessParty = (((this.witnessParty!= null)&&(!this.witnessParty.isEmpty()))?this.getWitnessParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "witnessParty", theWitnessParty), currentHashCode, theWitnessParty, ((this.witnessParty!= null)&&(!this.witnessParty.isEmpty())));
        }
        {
            List<DocumentReferenceType> theMandateDocumentReference;
            theMandateDocumentReference = (((this.mandateDocumentReference!= null)&&(!this.mandateDocumentReference.isEmpty()))?this.getMandateDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mandateDocumentReference", theMandateDocumentReference), currentHashCode, theMandateDocumentReference, ((this.mandateDocumentReference!= null)&&(!this.mandateDocumentReference.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
