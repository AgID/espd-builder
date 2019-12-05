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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ContractTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ContractTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NominationDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NominationTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.VersionIDType;
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
 * <p>Classe Java per ContractType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ContractType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NominationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NominationTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContractTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContractType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VersionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NominationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractualDelivery" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractType", propOrder = {
    "id",
    "issueDate",
    "issueTime",
    "nominationDate",
    "nominationTime",
    "contractTypeCode",
    "contractType",
    "note",
    "versionID",
    "description",
    "validityPeriod",
    "contractDocumentReference",
    "nominationPeriod",
    "contractualDelivery"
})
public class ContractType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssueDateType issueDate;
    @XmlElement(name = "IssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssueTimeType issueTime;
    @XmlElement(name = "NominationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NominationDateType nominationDate;
    @XmlElement(name = "NominationTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NominationTimeType nominationTime;
    @XmlElement(name = "ContractTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ContractTypeCodeType contractTypeCode;
    @XmlElement(name = "ContractType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ContractTypeType contractType;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "VersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VersionIDType versionID;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "ValidityPeriod")
    protected PeriodType validityPeriod;
    @XmlElement(name = "ContractDocumentReference")
    protected List<DocumentReferenceType> contractDocumentReference;
    @XmlElement(name = "NominationPeriod")
    protected PeriodType nominationPeriod;
    @XmlElement(name = "ContractualDelivery")
    protected DeliveryType contractualDelivery;

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
     * Recupera il valore della proprietà nominationDate.
     * 
     * @return
     *     possible object is
     *     {@link NominationDateType }
     *     
     */
    public NominationDateType getNominationDate() {
        return nominationDate;
    }

    /**
     * Imposta il valore della proprietà nominationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link NominationDateType }
     *     
     */
    public void setNominationDate(NominationDateType value) {
        this.nominationDate = value;
    }

    /**
     * Recupera il valore della proprietà nominationTime.
     * 
     * @return
     *     possible object is
     *     {@link NominationTimeType }
     *     
     */
    public NominationTimeType getNominationTime() {
        return nominationTime;
    }

    /**
     * Imposta il valore della proprietà nominationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link NominationTimeType }
     *     
     */
    public void setNominationTime(NominationTimeType value) {
        this.nominationTime = value;
    }

    /**
     * Recupera il valore della proprietà contractTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link ContractTypeCodeType }
     *     
     */
    public ContractTypeCodeType getContractTypeCode() {
        return contractTypeCode;
    }

    /**
     * Imposta il valore della proprietà contractTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractTypeCodeType }
     *     
     */
    public void setContractTypeCode(ContractTypeCodeType value) {
        this.contractTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà contractType.
     * 
     * @return
     *     possible object is
     *     {@link ContractTypeType }
     *     
     */
    public ContractTypeType getContractType() {
        return contractType;
    }

    /**
     * Imposta il valore della proprietà contractType.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractTypeType }
     *     
     */
    public void setContractType(ContractTypeType value) {
        this.contractType = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Recupera il valore della proprietà versionID.
     * 
     * @return
     *     possible object is
     *     {@link VersionIDType }
     *     
     */
    public VersionIDType getVersionID() {
        return versionID;
    }

    /**
     * Imposta il valore della proprietà versionID.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionIDType }
     *     
     */
    public void setVersionID(VersionIDType value) {
        this.versionID = value;
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
     * Recupera il valore della proprietà validityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Imposta il valore della proprietà validityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setValidityPeriod(PeriodType value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the contractDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getContractDocumentReference() {
        if (contractDocumentReference == null) {
            contractDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.contractDocumentReference;
    }

    /**
     * Recupera il valore della proprietà nominationPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getNominationPeriod() {
        return nominationPeriod;
    }

    /**
     * Imposta il valore della proprietà nominationPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setNominationPeriod(PeriodType value) {
        this.nominationPeriod = value;
    }

    /**
     * Recupera il valore della proprietà contractualDelivery.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryType }
     *     
     */
    public DeliveryType getContractualDelivery() {
        return contractualDelivery;
    }

    /**
     * Imposta il valore della proprietà contractualDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryType }
     *     
     */
    public void setContractualDelivery(DeliveryType value) {
        this.contractualDelivery = value;
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
            NominationDateType theNominationDate;
            theNominationDate = this.getNominationDate();
            strategy.appendField(locator, this, "nominationDate", buffer, theNominationDate, (this.nominationDate!= null));
        }
        {
            NominationTimeType theNominationTime;
            theNominationTime = this.getNominationTime();
            strategy.appendField(locator, this, "nominationTime", buffer, theNominationTime, (this.nominationTime!= null));
        }
        {
            ContractTypeCodeType theContractTypeCode;
            theContractTypeCode = this.getContractTypeCode();
            strategy.appendField(locator, this, "contractTypeCode", buffer, theContractTypeCode, (this.contractTypeCode!= null));
        }
        {
            ContractTypeType theContractType;
            theContractType = this.getContractType();
            strategy.appendField(locator, this, "contractType", buffer, theContractType, (this.contractType!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            strategy.appendField(locator, this, "note", buffer, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            VersionIDType theVersionID;
            theVersionID = this.getVersionID();
            strategy.appendField(locator, this, "versionID", buffer, theVersionID, (this.versionID!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            PeriodType theValidityPeriod;
            theValidityPeriod = this.getValidityPeriod();
            strategy.appendField(locator, this, "validityPeriod", buffer, theValidityPeriod, (this.validityPeriod!= null));
        }
        {
            List<DocumentReferenceType> theContractDocumentReference;
            theContractDocumentReference = (((this.contractDocumentReference!= null)&&(!this.contractDocumentReference.isEmpty()))?this.getContractDocumentReference():null);
            strategy.appendField(locator, this, "contractDocumentReference", buffer, theContractDocumentReference, ((this.contractDocumentReference!= null)&&(!this.contractDocumentReference.isEmpty())));
        }
        {
            PeriodType theNominationPeriod;
            theNominationPeriod = this.getNominationPeriod();
            strategy.appendField(locator, this, "nominationPeriod", buffer, theNominationPeriod, (this.nominationPeriod!= null));
        }
        {
            DeliveryType theContractualDelivery;
            theContractualDelivery = this.getContractualDelivery();
            strategy.appendField(locator, this, "contractualDelivery", buffer, theContractualDelivery, (this.contractualDelivery!= null));
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
        final ContractType that = ((ContractType) object);
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
            NominationDateType lhsNominationDate;
            lhsNominationDate = this.getNominationDate();
            NominationDateType rhsNominationDate;
            rhsNominationDate = that.getNominationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nominationDate", lhsNominationDate), LocatorUtils.property(thatLocator, "nominationDate", rhsNominationDate), lhsNominationDate, rhsNominationDate, (this.nominationDate!= null), (that.nominationDate!= null))) {
                return false;
            }
        }
        {
            NominationTimeType lhsNominationTime;
            lhsNominationTime = this.getNominationTime();
            NominationTimeType rhsNominationTime;
            rhsNominationTime = that.getNominationTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nominationTime", lhsNominationTime), LocatorUtils.property(thatLocator, "nominationTime", rhsNominationTime), lhsNominationTime, rhsNominationTime, (this.nominationTime!= null), (that.nominationTime!= null))) {
                return false;
            }
        }
        {
            ContractTypeCodeType lhsContractTypeCode;
            lhsContractTypeCode = this.getContractTypeCode();
            ContractTypeCodeType rhsContractTypeCode;
            rhsContractTypeCode = that.getContractTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractTypeCode", lhsContractTypeCode), LocatorUtils.property(thatLocator, "contractTypeCode", rhsContractTypeCode), lhsContractTypeCode, rhsContractTypeCode, (this.contractTypeCode!= null), (that.contractTypeCode!= null))) {
                return false;
            }
        }
        {
            ContractTypeType lhsContractType;
            lhsContractType = this.getContractType();
            ContractTypeType rhsContractType;
            rhsContractType = that.getContractType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractType", lhsContractType), LocatorUtils.property(thatLocator, "contractType", rhsContractType), lhsContractType, rhsContractType, (this.contractType!= null), (that.contractType!= null))) {
                return false;
            }
        }
        {
            List<NoteType> lhsNote;
            lhsNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            List<NoteType> rhsNote;
            rhsNote = (((that.note!= null)&&(!that.note.isEmpty()))?that.getNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote, ((this.note!= null)&&(!this.note.isEmpty())), ((that.note!= null)&&(!that.note.isEmpty())))) {
                return false;
            }
        }
        {
            VersionIDType lhsVersionID;
            lhsVersionID = this.getVersionID();
            VersionIDType rhsVersionID;
            rhsVersionID = that.getVersionID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versionID", lhsVersionID), LocatorUtils.property(thatLocator, "versionID", rhsVersionID), lhsVersionID, rhsVersionID, (this.versionID!= null), (that.versionID!= null))) {
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
            PeriodType lhsValidityPeriod;
            lhsValidityPeriod = this.getValidityPeriod();
            PeriodType rhsValidityPeriod;
            rhsValidityPeriod = that.getValidityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validityPeriod", lhsValidityPeriod), LocatorUtils.property(thatLocator, "validityPeriod", rhsValidityPeriod), lhsValidityPeriod, rhsValidityPeriod, (this.validityPeriod!= null), (that.validityPeriod!= null))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsContractDocumentReference;
            lhsContractDocumentReference = (((this.contractDocumentReference!= null)&&(!this.contractDocumentReference.isEmpty()))?this.getContractDocumentReference():null);
            List<DocumentReferenceType> rhsContractDocumentReference;
            rhsContractDocumentReference = (((that.contractDocumentReference!= null)&&(!that.contractDocumentReference.isEmpty()))?that.getContractDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractDocumentReference", lhsContractDocumentReference), LocatorUtils.property(thatLocator, "contractDocumentReference", rhsContractDocumentReference), lhsContractDocumentReference, rhsContractDocumentReference, ((this.contractDocumentReference!= null)&&(!this.contractDocumentReference.isEmpty())), ((that.contractDocumentReference!= null)&&(!that.contractDocumentReference.isEmpty())))) {
                return false;
            }
        }
        {
            PeriodType lhsNominationPeriod;
            lhsNominationPeriod = this.getNominationPeriod();
            PeriodType rhsNominationPeriod;
            rhsNominationPeriod = that.getNominationPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nominationPeriod", lhsNominationPeriod), LocatorUtils.property(thatLocator, "nominationPeriod", rhsNominationPeriod), lhsNominationPeriod, rhsNominationPeriod, (this.nominationPeriod!= null), (that.nominationPeriod!= null))) {
                return false;
            }
        }
        {
            DeliveryType lhsContractualDelivery;
            lhsContractualDelivery = this.getContractualDelivery();
            DeliveryType rhsContractualDelivery;
            rhsContractualDelivery = that.getContractualDelivery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractualDelivery", lhsContractualDelivery), LocatorUtils.property(thatLocator, "contractualDelivery", rhsContractualDelivery), lhsContractualDelivery, rhsContractualDelivery, (this.contractualDelivery!= null), (that.contractualDelivery!= null))) {
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
            NominationDateType theNominationDate;
            theNominationDate = this.getNominationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nominationDate", theNominationDate), currentHashCode, theNominationDate, (this.nominationDate!= null));
        }
        {
            NominationTimeType theNominationTime;
            theNominationTime = this.getNominationTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nominationTime", theNominationTime), currentHashCode, theNominationTime, (this.nominationTime!= null));
        }
        {
            ContractTypeCodeType theContractTypeCode;
            theContractTypeCode = this.getContractTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractTypeCode", theContractTypeCode), currentHashCode, theContractTypeCode, (this.contractTypeCode!= null));
        }
        {
            ContractTypeType theContractType;
            theContractType = this.getContractType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractType", theContractType), currentHashCode, theContractType, (this.contractType!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            VersionIDType theVersionID;
            theVersionID = this.getVersionID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versionID", theVersionID), currentHashCode, theVersionID, (this.versionID!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            PeriodType theValidityPeriod;
            theValidityPeriod = this.getValidityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "validityPeriod", theValidityPeriod), currentHashCode, theValidityPeriod, (this.validityPeriod!= null));
        }
        {
            List<DocumentReferenceType> theContractDocumentReference;
            theContractDocumentReference = (((this.contractDocumentReference!= null)&&(!this.contractDocumentReference.isEmpty()))?this.getContractDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractDocumentReference", theContractDocumentReference), currentHashCode, theContractDocumentReference, ((this.contractDocumentReference!= null)&&(!this.contractDocumentReference.isEmpty())));
        }
        {
            PeriodType theNominationPeriod;
            theNominationPeriod = this.getNominationPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nominationPeriod", theNominationPeriod), currentHashCode, theNominationPeriod, (this.nominationPeriod!= null));
        }
        {
            DeliveryType theContractualDelivery;
            theContractualDelivery = this.getContractualDelivery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractualDelivery", theContractualDelivery), currentHashCode, theContractualDelivery, (this.contractualDelivery!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
