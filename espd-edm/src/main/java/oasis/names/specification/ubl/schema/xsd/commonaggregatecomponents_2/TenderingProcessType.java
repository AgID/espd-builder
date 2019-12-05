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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AccessToolsURIType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CandidateReductionConstraintIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ContractingSystemCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpenseCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.GovernmentAgreementConstraintIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NegotiationDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OriginalContractingSystemIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PartPresentationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProcedureCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SubmissionMethodCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UrgencyCodeType;
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
 * <p>Classe Java per TenderingProcessType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TenderingProcessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OriginalContractingSystemID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NegotiationDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcedureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UrgencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpenseCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PartPresentationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContractingSystemCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubmissionMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CandidateReductionConstraintIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GovernmentAgreementConstraintIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccessToolsURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentAvailabilityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderSubmissionDeadlinePeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InvitationSubmissionPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ParticipationRequestReceptionPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NoticeDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcessJustification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EconomicOperatorShortList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OpenTenderEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AuctionTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FrameworkAgreement" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractingSystem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderingProcessType", propOrder = {
    "id",
    "originalContractingSystemID",
    "description",
    "negotiationDescription",
    "procedureCode",
    "urgencyCode",
    "expenseCode",
    "partPresentationCode",
    "contractingSystemCode",
    "submissionMethodCode",
    "candidateReductionConstraintIndicator",
    "governmentAgreementConstraintIndicator",
    "accessToolsURI",
    "documentAvailabilityPeriod",
    "tenderSubmissionDeadlinePeriod",
    "invitationSubmissionPeriod",
    "participationRequestReceptionPeriod",
    "noticeDocumentReference",
    "additionalDocumentReference",
    "processJustification",
    "economicOperatorShortList",
    "openTenderEvent",
    "auctionTerms",
    "frameworkAgreement",
    "contractingSystem"
})
public class TenderingProcessType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "OriginalContractingSystemID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OriginalContractingSystemIDType originalContractingSystemID;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "NegotiationDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NegotiationDescriptionType> negotiationDescription;
    @XmlElement(name = "ProcedureCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProcedureCodeType procedureCode;
    @XmlElement(name = "UrgencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UrgencyCodeType urgencyCode;
    @XmlElement(name = "ExpenseCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ExpenseCodeType expenseCode;
    @XmlElement(name = "PartPresentationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PartPresentationCodeType partPresentationCode;
    @XmlElement(name = "ContractingSystemCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ContractingSystemCodeType contractingSystemCode;
    @XmlElement(name = "SubmissionMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SubmissionMethodCodeType submissionMethodCode;
    @XmlElement(name = "CandidateReductionConstraintIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CandidateReductionConstraintIndicatorType candidateReductionConstraintIndicator;
    @XmlElement(name = "GovernmentAgreementConstraintIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected GovernmentAgreementConstraintIndicatorType governmentAgreementConstraintIndicator;
    @XmlElement(name = "AccessToolsURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AccessToolsURIType accessToolsURI;
    @XmlElement(name = "DocumentAvailabilityPeriod")
    protected PeriodType documentAvailabilityPeriod;
    @XmlElement(name = "TenderSubmissionDeadlinePeriod")
    protected PeriodType tenderSubmissionDeadlinePeriod;
    @XmlElement(name = "InvitationSubmissionPeriod")
    protected PeriodType invitationSubmissionPeriod;
    @XmlElement(name = "ParticipationRequestReceptionPeriod")
    protected PeriodType participationRequestReceptionPeriod;
    @XmlElement(name = "NoticeDocumentReference")
    protected List<DocumentReferenceType> noticeDocumentReference;
    @XmlElement(name = "AdditionalDocumentReference")
    protected List<DocumentReferenceType> additionalDocumentReference;
    @XmlElement(name = "ProcessJustification")
    protected List<ProcessJustificationType> processJustification;
    @XmlElement(name = "EconomicOperatorShortList")
    protected List<EconomicOperatorShortListType> economicOperatorShortList;
    @XmlElement(name = "OpenTenderEvent")
    protected List<EventType> openTenderEvent;
    @XmlElement(name = "AuctionTerms")
    protected AuctionTermsType auctionTerms;
    @XmlElement(name = "FrameworkAgreement")
    protected FrameworkAgreementType frameworkAgreement;
    @XmlElement(name = "ContractingSystem")
    protected List<ContractingSystemType> contractingSystem;

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
     * Recupera il valore della proprietà originalContractingSystemID.
     * 
     * @return
     *     possible object is
     *     {@link OriginalContractingSystemIDType }
     *     
     */
    public OriginalContractingSystemIDType getOriginalContractingSystemID() {
        return originalContractingSystemID;
    }

    /**
     * Imposta il valore della proprietà originalContractingSystemID.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalContractingSystemIDType }
     *     
     */
    public void setOriginalContractingSystemID(OriginalContractingSystemIDType value) {
        this.originalContractingSystemID = value;
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
     * Gets the value of the negotiationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the negotiationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegotiationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NegotiationDescriptionType }
     * 
     * 
     */
    public List<NegotiationDescriptionType> getNegotiationDescription() {
        if (negotiationDescription == null) {
            negotiationDescription = new ArrayList<NegotiationDescriptionType>();
        }
        return this.negotiationDescription;
    }

    /**
     * Recupera il valore della proprietà procedureCode.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureCodeType }
     *     
     */
    public ProcedureCodeType getProcedureCode() {
        return procedureCode;
    }

    /**
     * Imposta il valore della proprietà procedureCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureCodeType }
     *     
     */
    public void setProcedureCode(ProcedureCodeType value) {
        this.procedureCode = value;
    }

    /**
     * Recupera il valore della proprietà urgencyCode.
     * 
     * @return
     *     possible object is
     *     {@link UrgencyCodeType }
     *     
     */
    public UrgencyCodeType getUrgencyCode() {
        return urgencyCode;
    }

    /**
     * Imposta il valore della proprietà urgencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link UrgencyCodeType }
     *     
     */
    public void setUrgencyCode(UrgencyCodeType value) {
        this.urgencyCode = value;
    }

    /**
     * Recupera il valore della proprietà expenseCode.
     * 
     * @return
     *     possible object is
     *     {@link ExpenseCodeType }
     *     
     */
    public ExpenseCodeType getExpenseCode() {
        return expenseCode;
    }

    /**
     * Imposta il valore della proprietà expenseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpenseCodeType }
     *     
     */
    public void setExpenseCode(ExpenseCodeType value) {
        this.expenseCode = value;
    }

    /**
     * Recupera il valore della proprietà partPresentationCode.
     * 
     * @return
     *     possible object is
     *     {@link PartPresentationCodeType }
     *     
     */
    public PartPresentationCodeType getPartPresentationCode() {
        return partPresentationCode;
    }

    /**
     * Imposta il valore della proprietà partPresentationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PartPresentationCodeType }
     *     
     */
    public void setPartPresentationCode(PartPresentationCodeType value) {
        this.partPresentationCode = value;
    }

    /**
     * Recupera il valore della proprietà contractingSystemCode.
     * 
     * @return
     *     possible object is
     *     {@link ContractingSystemCodeType }
     *     
     */
    public ContractingSystemCodeType getContractingSystemCode() {
        return contractingSystemCode;
    }

    /**
     * Imposta il valore della proprietà contractingSystemCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractingSystemCodeType }
     *     
     */
    public void setContractingSystemCode(ContractingSystemCodeType value) {
        this.contractingSystemCode = value;
    }

    /**
     * Recupera il valore della proprietà submissionMethodCode.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionMethodCodeType }
     *     
     */
    public SubmissionMethodCodeType getSubmissionMethodCode() {
        return submissionMethodCode;
    }

    /**
     * Imposta il valore della proprietà submissionMethodCode.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionMethodCodeType }
     *     
     */
    public void setSubmissionMethodCode(SubmissionMethodCodeType value) {
        this.submissionMethodCode = value;
    }

    /**
     * Recupera il valore della proprietà candidateReductionConstraintIndicator.
     * 
     * @return
     *     possible object is
     *     {@link CandidateReductionConstraintIndicatorType }
     *     
     */
    public CandidateReductionConstraintIndicatorType getCandidateReductionConstraintIndicator() {
        return candidateReductionConstraintIndicator;
    }

    /**
     * Imposta il valore della proprietà candidateReductionConstraintIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateReductionConstraintIndicatorType }
     *     
     */
    public void setCandidateReductionConstraintIndicator(CandidateReductionConstraintIndicatorType value) {
        this.candidateReductionConstraintIndicator = value;
    }

    /**
     * Recupera il valore della proprietà governmentAgreementConstraintIndicator.
     * 
     * @return
     *     possible object is
     *     {@link GovernmentAgreementConstraintIndicatorType }
     *     
     */
    public GovernmentAgreementConstraintIndicatorType getGovernmentAgreementConstraintIndicator() {
        return governmentAgreementConstraintIndicator;
    }

    /**
     * Imposta il valore della proprietà governmentAgreementConstraintIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernmentAgreementConstraintIndicatorType }
     *     
     */
    public void setGovernmentAgreementConstraintIndicator(GovernmentAgreementConstraintIndicatorType value) {
        this.governmentAgreementConstraintIndicator = value;
    }

    /**
     * Recupera il valore della proprietà accessToolsURI.
     * 
     * @return
     *     possible object is
     *     {@link AccessToolsURIType }
     *     
     */
    public AccessToolsURIType getAccessToolsURI() {
        return accessToolsURI;
    }

    /**
     * Imposta il valore della proprietà accessToolsURI.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessToolsURIType }
     *     
     */
    public void setAccessToolsURI(AccessToolsURIType value) {
        this.accessToolsURI = value;
    }

    /**
     * Recupera il valore della proprietà documentAvailabilityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getDocumentAvailabilityPeriod() {
        return documentAvailabilityPeriod;
    }

    /**
     * Imposta il valore della proprietà documentAvailabilityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setDocumentAvailabilityPeriod(PeriodType value) {
        this.documentAvailabilityPeriod = value;
    }

    /**
     * Recupera il valore della proprietà tenderSubmissionDeadlinePeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getTenderSubmissionDeadlinePeriod() {
        return tenderSubmissionDeadlinePeriod;
    }

    /**
     * Imposta il valore della proprietà tenderSubmissionDeadlinePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setTenderSubmissionDeadlinePeriod(PeriodType value) {
        this.tenderSubmissionDeadlinePeriod = value;
    }

    /**
     * Recupera il valore della proprietà invitationSubmissionPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getInvitationSubmissionPeriod() {
        return invitationSubmissionPeriod;
    }

    /**
     * Imposta il valore della proprietà invitationSubmissionPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setInvitationSubmissionPeriod(PeriodType value) {
        this.invitationSubmissionPeriod = value;
    }

    /**
     * Recupera il valore della proprietà participationRequestReceptionPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getParticipationRequestReceptionPeriod() {
        return participationRequestReceptionPeriod;
    }

    /**
     * Imposta il valore della proprietà participationRequestReceptionPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setParticipationRequestReceptionPeriod(PeriodType value) {
        this.participationRequestReceptionPeriod = value;
    }

    /**
     * Gets the value of the noticeDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noticeDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoticeDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getNoticeDocumentReference() {
        if (noticeDocumentReference == null) {
            noticeDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.noticeDocumentReference;
    }

    /**
     * Gets the value of the additionalDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getAdditionalDocumentReference() {
        if (additionalDocumentReference == null) {
            additionalDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.additionalDocumentReference;
    }

    /**
     * Gets the value of the processJustification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processJustification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessJustification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessJustificationType }
     * 
     * 
     */
    public List<ProcessJustificationType> getProcessJustification() {
        if (processJustification == null) {
            processJustification = new ArrayList<ProcessJustificationType>();
        }
        return this.processJustification;
    }

    /**
     * Gets the value of the economicOperatorShortList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the economicOperatorShortList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEconomicOperatorShortList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EconomicOperatorShortListType }
     * 
     * 
     */
    public List<EconomicOperatorShortListType> getEconomicOperatorShortList() {
        if (economicOperatorShortList == null) {
            economicOperatorShortList = new ArrayList<EconomicOperatorShortListType>();
        }
        return this.economicOperatorShortList;
    }

    /**
     * Gets the value of the openTenderEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the openTenderEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpenTenderEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventType }
     * 
     * 
     */
    public List<EventType> getOpenTenderEvent() {
        if (openTenderEvent == null) {
            openTenderEvent = new ArrayList<EventType>();
        }
        return this.openTenderEvent;
    }

    /**
     * Recupera il valore della proprietà auctionTerms.
     * 
     * @return
     *     possible object is
     *     {@link AuctionTermsType }
     *     
     */
    public AuctionTermsType getAuctionTerms() {
        return auctionTerms;
    }

    /**
     * Imposta il valore della proprietà auctionTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionTermsType }
     *     
     */
    public void setAuctionTerms(AuctionTermsType value) {
        this.auctionTerms = value;
    }

    /**
     * Recupera il valore della proprietà frameworkAgreement.
     * 
     * @return
     *     possible object is
     *     {@link FrameworkAgreementType }
     *     
     */
    public FrameworkAgreementType getFrameworkAgreement() {
        return frameworkAgreement;
    }

    /**
     * Imposta il valore della proprietà frameworkAgreement.
     * 
     * @param value
     *     allowed object is
     *     {@link FrameworkAgreementType }
     *     
     */
    public void setFrameworkAgreement(FrameworkAgreementType value) {
        this.frameworkAgreement = value;
    }

    /**
     * Gets the value of the contractingSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractingSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractingSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractingSystemType }
     * 
     * 
     */
    public List<ContractingSystemType> getContractingSystem() {
        if (contractingSystem == null) {
            contractingSystem = new ArrayList<ContractingSystemType>();
        }
        return this.contractingSystem;
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
            OriginalContractingSystemIDType theOriginalContractingSystemID;
            theOriginalContractingSystemID = this.getOriginalContractingSystemID();
            strategy.appendField(locator, this, "originalContractingSystemID", buffer, theOriginalContractingSystemID, (this.originalContractingSystemID!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            strategy.appendField(locator, this, "description", buffer, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<NegotiationDescriptionType> theNegotiationDescription;
            theNegotiationDescription = (((this.negotiationDescription!= null)&&(!this.negotiationDescription.isEmpty()))?this.getNegotiationDescription():null);
            strategy.appendField(locator, this, "negotiationDescription", buffer, theNegotiationDescription, ((this.negotiationDescription!= null)&&(!this.negotiationDescription.isEmpty())));
        }
        {
            ProcedureCodeType theProcedureCode;
            theProcedureCode = this.getProcedureCode();
            strategy.appendField(locator, this, "procedureCode", buffer, theProcedureCode, (this.procedureCode!= null));
        }
        {
            UrgencyCodeType theUrgencyCode;
            theUrgencyCode = this.getUrgencyCode();
            strategy.appendField(locator, this, "urgencyCode", buffer, theUrgencyCode, (this.urgencyCode!= null));
        }
        {
            ExpenseCodeType theExpenseCode;
            theExpenseCode = this.getExpenseCode();
            strategy.appendField(locator, this, "expenseCode", buffer, theExpenseCode, (this.expenseCode!= null));
        }
        {
            PartPresentationCodeType thePartPresentationCode;
            thePartPresentationCode = this.getPartPresentationCode();
            strategy.appendField(locator, this, "partPresentationCode", buffer, thePartPresentationCode, (this.partPresentationCode!= null));
        }
        {
            ContractingSystemCodeType theContractingSystemCode;
            theContractingSystemCode = this.getContractingSystemCode();
            strategy.appendField(locator, this, "contractingSystemCode", buffer, theContractingSystemCode, (this.contractingSystemCode!= null));
        }
        {
            SubmissionMethodCodeType theSubmissionMethodCode;
            theSubmissionMethodCode = this.getSubmissionMethodCode();
            strategy.appendField(locator, this, "submissionMethodCode", buffer, theSubmissionMethodCode, (this.submissionMethodCode!= null));
        }
        {
            CandidateReductionConstraintIndicatorType theCandidateReductionConstraintIndicator;
            theCandidateReductionConstraintIndicator = this.getCandidateReductionConstraintIndicator();
            strategy.appendField(locator, this, "candidateReductionConstraintIndicator", buffer, theCandidateReductionConstraintIndicator, (this.candidateReductionConstraintIndicator!= null));
        }
        {
            GovernmentAgreementConstraintIndicatorType theGovernmentAgreementConstraintIndicator;
            theGovernmentAgreementConstraintIndicator = this.getGovernmentAgreementConstraintIndicator();
            strategy.appendField(locator, this, "governmentAgreementConstraintIndicator", buffer, theGovernmentAgreementConstraintIndicator, (this.governmentAgreementConstraintIndicator!= null));
        }
        {
            AccessToolsURIType theAccessToolsURI;
            theAccessToolsURI = this.getAccessToolsURI();
            strategy.appendField(locator, this, "accessToolsURI", buffer, theAccessToolsURI, (this.accessToolsURI!= null));
        }
        {
            PeriodType theDocumentAvailabilityPeriod;
            theDocumentAvailabilityPeriod = this.getDocumentAvailabilityPeriod();
            strategy.appendField(locator, this, "documentAvailabilityPeriod", buffer, theDocumentAvailabilityPeriod, (this.documentAvailabilityPeriod!= null));
        }
        {
            PeriodType theTenderSubmissionDeadlinePeriod;
            theTenderSubmissionDeadlinePeriod = this.getTenderSubmissionDeadlinePeriod();
            strategy.appendField(locator, this, "tenderSubmissionDeadlinePeriod", buffer, theTenderSubmissionDeadlinePeriod, (this.tenderSubmissionDeadlinePeriod!= null));
        }
        {
            PeriodType theInvitationSubmissionPeriod;
            theInvitationSubmissionPeriod = this.getInvitationSubmissionPeriod();
            strategy.appendField(locator, this, "invitationSubmissionPeriod", buffer, theInvitationSubmissionPeriod, (this.invitationSubmissionPeriod!= null));
        }
        {
            PeriodType theParticipationRequestReceptionPeriod;
            theParticipationRequestReceptionPeriod = this.getParticipationRequestReceptionPeriod();
            strategy.appendField(locator, this, "participationRequestReceptionPeriod", buffer, theParticipationRequestReceptionPeriod, (this.participationRequestReceptionPeriod!= null));
        }
        {
            List<DocumentReferenceType> theNoticeDocumentReference;
            theNoticeDocumentReference = (((this.noticeDocumentReference!= null)&&(!this.noticeDocumentReference.isEmpty()))?this.getNoticeDocumentReference():null);
            strategy.appendField(locator, this, "noticeDocumentReference", buffer, theNoticeDocumentReference, ((this.noticeDocumentReference!= null)&&(!this.noticeDocumentReference.isEmpty())));
        }
        {
            List<DocumentReferenceType> theAdditionalDocumentReference;
            theAdditionalDocumentReference = (((this.additionalDocumentReference!= null)&&(!this.additionalDocumentReference.isEmpty()))?this.getAdditionalDocumentReference():null);
            strategy.appendField(locator, this, "additionalDocumentReference", buffer, theAdditionalDocumentReference, ((this.additionalDocumentReference!= null)&&(!this.additionalDocumentReference.isEmpty())));
        }
        {
            List<ProcessJustificationType> theProcessJustification;
            theProcessJustification = (((this.processJustification!= null)&&(!this.processJustification.isEmpty()))?this.getProcessJustification():null);
            strategy.appendField(locator, this, "processJustification", buffer, theProcessJustification, ((this.processJustification!= null)&&(!this.processJustification.isEmpty())));
        }
        {
            List<EconomicOperatorShortListType> theEconomicOperatorShortList;
            theEconomicOperatorShortList = (((this.economicOperatorShortList!= null)&&(!this.economicOperatorShortList.isEmpty()))?this.getEconomicOperatorShortList():null);
            strategy.appendField(locator, this, "economicOperatorShortList", buffer, theEconomicOperatorShortList, ((this.economicOperatorShortList!= null)&&(!this.economicOperatorShortList.isEmpty())));
        }
        {
            List<EventType> theOpenTenderEvent;
            theOpenTenderEvent = (((this.openTenderEvent!= null)&&(!this.openTenderEvent.isEmpty()))?this.getOpenTenderEvent():null);
            strategy.appendField(locator, this, "openTenderEvent", buffer, theOpenTenderEvent, ((this.openTenderEvent!= null)&&(!this.openTenderEvent.isEmpty())));
        }
        {
            AuctionTermsType theAuctionTerms;
            theAuctionTerms = this.getAuctionTerms();
            strategy.appendField(locator, this, "auctionTerms", buffer, theAuctionTerms, (this.auctionTerms!= null));
        }
        {
            FrameworkAgreementType theFrameworkAgreement;
            theFrameworkAgreement = this.getFrameworkAgreement();
            strategy.appendField(locator, this, "frameworkAgreement", buffer, theFrameworkAgreement, (this.frameworkAgreement!= null));
        }
        {
            List<ContractingSystemType> theContractingSystem;
            theContractingSystem = (((this.contractingSystem!= null)&&(!this.contractingSystem.isEmpty()))?this.getContractingSystem():null);
            strategy.appendField(locator, this, "contractingSystem", buffer, theContractingSystem, ((this.contractingSystem!= null)&&(!this.contractingSystem.isEmpty())));
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
        final TenderingProcessType that = ((TenderingProcessType) object);
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
            OriginalContractingSystemIDType lhsOriginalContractingSystemID;
            lhsOriginalContractingSystemID = this.getOriginalContractingSystemID();
            OriginalContractingSystemIDType rhsOriginalContractingSystemID;
            rhsOriginalContractingSystemID = that.getOriginalContractingSystemID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalContractingSystemID", lhsOriginalContractingSystemID), LocatorUtils.property(thatLocator, "originalContractingSystemID", rhsOriginalContractingSystemID), lhsOriginalContractingSystemID, rhsOriginalContractingSystemID, (this.originalContractingSystemID!= null), (that.originalContractingSystemID!= null))) {
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
            List<NegotiationDescriptionType> lhsNegotiationDescription;
            lhsNegotiationDescription = (((this.negotiationDescription!= null)&&(!this.negotiationDescription.isEmpty()))?this.getNegotiationDescription():null);
            List<NegotiationDescriptionType> rhsNegotiationDescription;
            rhsNegotiationDescription = (((that.negotiationDescription!= null)&&(!that.negotiationDescription.isEmpty()))?that.getNegotiationDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "negotiationDescription", lhsNegotiationDescription), LocatorUtils.property(thatLocator, "negotiationDescription", rhsNegotiationDescription), lhsNegotiationDescription, rhsNegotiationDescription, ((this.negotiationDescription!= null)&&(!this.negotiationDescription.isEmpty())), ((that.negotiationDescription!= null)&&(!that.negotiationDescription.isEmpty())))) {
                return false;
            }
        }
        {
            ProcedureCodeType lhsProcedureCode;
            lhsProcedureCode = this.getProcedureCode();
            ProcedureCodeType rhsProcedureCode;
            rhsProcedureCode = that.getProcedureCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "procedureCode", lhsProcedureCode), LocatorUtils.property(thatLocator, "procedureCode", rhsProcedureCode), lhsProcedureCode, rhsProcedureCode, (this.procedureCode!= null), (that.procedureCode!= null))) {
                return false;
            }
        }
        {
            UrgencyCodeType lhsUrgencyCode;
            lhsUrgencyCode = this.getUrgencyCode();
            UrgencyCodeType rhsUrgencyCode;
            rhsUrgencyCode = that.getUrgencyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "urgencyCode", lhsUrgencyCode), LocatorUtils.property(thatLocator, "urgencyCode", rhsUrgencyCode), lhsUrgencyCode, rhsUrgencyCode, (this.urgencyCode!= null), (that.urgencyCode!= null))) {
                return false;
            }
        }
        {
            ExpenseCodeType lhsExpenseCode;
            lhsExpenseCode = this.getExpenseCode();
            ExpenseCodeType rhsExpenseCode;
            rhsExpenseCode = that.getExpenseCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expenseCode", lhsExpenseCode), LocatorUtils.property(thatLocator, "expenseCode", rhsExpenseCode), lhsExpenseCode, rhsExpenseCode, (this.expenseCode!= null), (that.expenseCode!= null))) {
                return false;
            }
        }
        {
            PartPresentationCodeType lhsPartPresentationCode;
            lhsPartPresentationCode = this.getPartPresentationCode();
            PartPresentationCodeType rhsPartPresentationCode;
            rhsPartPresentationCode = that.getPartPresentationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partPresentationCode", lhsPartPresentationCode), LocatorUtils.property(thatLocator, "partPresentationCode", rhsPartPresentationCode), lhsPartPresentationCode, rhsPartPresentationCode, (this.partPresentationCode!= null), (that.partPresentationCode!= null))) {
                return false;
            }
        }
        {
            ContractingSystemCodeType lhsContractingSystemCode;
            lhsContractingSystemCode = this.getContractingSystemCode();
            ContractingSystemCodeType rhsContractingSystemCode;
            rhsContractingSystemCode = that.getContractingSystemCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractingSystemCode", lhsContractingSystemCode), LocatorUtils.property(thatLocator, "contractingSystemCode", rhsContractingSystemCode), lhsContractingSystemCode, rhsContractingSystemCode, (this.contractingSystemCode!= null), (that.contractingSystemCode!= null))) {
                return false;
            }
        }
        {
            SubmissionMethodCodeType lhsSubmissionMethodCode;
            lhsSubmissionMethodCode = this.getSubmissionMethodCode();
            SubmissionMethodCodeType rhsSubmissionMethodCode;
            rhsSubmissionMethodCode = that.getSubmissionMethodCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "submissionMethodCode", lhsSubmissionMethodCode), LocatorUtils.property(thatLocator, "submissionMethodCode", rhsSubmissionMethodCode), lhsSubmissionMethodCode, rhsSubmissionMethodCode, (this.submissionMethodCode!= null), (that.submissionMethodCode!= null))) {
                return false;
            }
        }
        {
            CandidateReductionConstraintIndicatorType lhsCandidateReductionConstraintIndicator;
            lhsCandidateReductionConstraintIndicator = this.getCandidateReductionConstraintIndicator();
            CandidateReductionConstraintIndicatorType rhsCandidateReductionConstraintIndicator;
            rhsCandidateReductionConstraintIndicator = that.getCandidateReductionConstraintIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "candidateReductionConstraintIndicator", lhsCandidateReductionConstraintIndicator), LocatorUtils.property(thatLocator, "candidateReductionConstraintIndicator", rhsCandidateReductionConstraintIndicator), lhsCandidateReductionConstraintIndicator, rhsCandidateReductionConstraintIndicator, (this.candidateReductionConstraintIndicator!= null), (that.candidateReductionConstraintIndicator!= null))) {
                return false;
            }
        }
        {
            GovernmentAgreementConstraintIndicatorType lhsGovernmentAgreementConstraintIndicator;
            lhsGovernmentAgreementConstraintIndicator = this.getGovernmentAgreementConstraintIndicator();
            GovernmentAgreementConstraintIndicatorType rhsGovernmentAgreementConstraintIndicator;
            rhsGovernmentAgreementConstraintIndicator = that.getGovernmentAgreementConstraintIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "governmentAgreementConstraintIndicator", lhsGovernmentAgreementConstraintIndicator), LocatorUtils.property(thatLocator, "governmentAgreementConstraintIndicator", rhsGovernmentAgreementConstraintIndicator), lhsGovernmentAgreementConstraintIndicator, rhsGovernmentAgreementConstraintIndicator, (this.governmentAgreementConstraintIndicator!= null), (that.governmentAgreementConstraintIndicator!= null))) {
                return false;
            }
        }
        {
            AccessToolsURIType lhsAccessToolsURI;
            lhsAccessToolsURI = this.getAccessToolsURI();
            AccessToolsURIType rhsAccessToolsURI;
            rhsAccessToolsURI = that.getAccessToolsURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accessToolsURI", lhsAccessToolsURI), LocatorUtils.property(thatLocator, "accessToolsURI", rhsAccessToolsURI), lhsAccessToolsURI, rhsAccessToolsURI, (this.accessToolsURI!= null), (that.accessToolsURI!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsDocumentAvailabilityPeriod;
            lhsDocumentAvailabilityPeriod = this.getDocumentAvailabilityPeriod();
            PeriodType rhsDocumentAvailabilityPeriod;
            rhsDocumentAvailabilityPeriod = that.getDocumentAvailabilityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentAvailabilityPeriod", lhsDocumentAvailabilityPeriod), LocatorUtils.property(thatLocator, "documentAvailabilityPeriod", rhsDocumentAvailabilityPeriod), lhsDocumentAvailabilityPeriod, rhsDocumentAvailabilityPeriod, (this.documentAvailabilityPeriod!= null), (that.documentAvailabilityPeriod!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsTenderSubmissionDeadlinePeriod;
            lhsTenderSubmissionDeadlinePeriod = this.getTenderSubmissionDeadlinePeriod();
            PeriodType rhsTenderSubmissionDeadlinePeriod;
            rhsTenderSubmissionDeadlinePeriod = that.getTenderSubmissionDeadlinePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderSubmissionDeadlinePeriod", lhsTenderSubmissionDeadlinePeriod), LocatorUtils.property(thatLocator, "tenderSubmissionDeadlinePeriod", rhsTenderSubmissionDeadlinePeriod), lhsTenderSubmissionDeadlinePeriod, rhsTenderSubmissionDeadlinePeriod, (this.tenderSubmissionDeadlinePeriod!= null), (that.tenderSubmissionDeadlinePeriod!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsInvitationSubmissionPeriod;
            lhsInvitationSubmissionPeriod = this.getInvitationSubmissionPeriod();
            PeriodType rhsInvitationSubmissionPeriod;
            rhsInvitationSubmissionPeriod = that.getInvitationSubmissionPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invitationSubmissionPeriod", lhsInvitationSubmissionPeriod), LocatorUtils.property(thatLocator, "invitationSubmissionPeriod", rhsInvitationSubmissionPeriod), lhsInvitationSubmissionPeriod, rhsInvitationSubmissionPeriod, (this.invitationSubmissionPeriod!= null), (that.invitationSubmissionPeriod!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsParticipationRequestReceptionPeriod;
            lhsParticipationRequestReceptionPeriod = this.getParticipationRequestReceptionPeriod();
            PeriodType rhsParticipationRequestReceptionPeriod;
            rhsParticipationRequestReceptionPeriod = that.getParticipationRequestReceptionPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "participationRequestReceptionPeriod", lhsParticipationRequestReceptionPeriod), LocatorUtils.property(thatLocator, "participationRequestReceptionPeriod", rhsParticipationRequestReceptionPeriod), lhsParticipationRequestReceptionPeriod, rhsParticipationRequestReceptionPeriod, (this.participationRequestReceptionPeriod!= null), (that.participationRequestReceptionPeriod!= null))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsNoticeDocumentReference;
            lhsNoticeDocumentReference = (((this.noticeDocumentReference!= null)&&(!this.noticeDocumentReference.isEmpty()))?this.getNoticeDocumentReference():null);
            List<DocumentReferenceType> rhsNoticeDocumentReference;
            rhsNoticeDocumentReference = (((that.noticeDocumentReference!= null)&&(!that.noticeDocumentReference.isEmpty()))?that.getNoticeDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noticeDocumentReference", lhsNoticeDocumentReference), LocatorUtils.property(thatLocator, "noticeDocumentReference", rhsNoticeDocumentReference), lhsNoticeDocumentReference, rhsNoticeDocumentReference, ((this.noticeDocumentReference!= null)&&(!this.noticeDocumentReference.isEmpty())), ((that.noticeDocumentReference!= null)&&(!that.noticeDocumentReference.isEmpty())))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsAdditionalDocumentReference;
            lhsAdditionalDocumentReference = (((this.additionalDocumentReference!= null)&&(!this.additionalDocumentReference.isEmpty()))?this.getAdditionalDocumentReference():null);
            List<DocumentReferenceType> rhsAdditionalDocumentReference;
            rhsAdditionalDocumentReference = (((that.additionalDocumentReference!= null)&&(!that.additionalDocumentReference.isEmpty()))?that.getAdditionalDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalDocumentReference", lhsAdditionalDocumentReference), LocatorUtils.property(thatLocator, "additionalDocumentReference", rhsAdditionalDocumentReference), lhsAdditionalDocumentReference, rhsAdditionalDocumentReference, ((this.additionalDocumentReference!= null)&&(!this.additionalDocumentReference.isEmpty())), ((that.additionalDocumentReference!= null)&&(!that.additionalDocumentReference.isEmpty())))) {
                return false;
            }
        }
        {
            List<ProcessJustificationType> lhsProcessJustification;
            lhsProcessJustification = (((this.processJustification!= null)&&(!this.processJustification.isEmpty()))?this.getProcessJustification():null);
            List<ProcessJustificationType> rhsProcessJustification;
            rhsProcessJustification = (((that.processJustification!= null)&&(!that.processJustification.isEmpty()))?that.getProcessJustification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processJustification", lhsProcessJustification), LocatorUtils.property(thatLocator, "processJustification", rhsProcessJustification), lhsProcessJustification, rhsProcessJustification, ((this.processJustification!= null)&&(!this.processJustification.isEmpty())), ((that.processJustification!= null)&&(!that.processJustification.isEmpty())))) {
                return false;
            }
        }
        {
            List<EconomicOperatorShortListType> lhsEconomicOperatorShortList;
            lhsEconomicOperatorShortList = (((this.economicOperatorShortList!= null)&&(!this.economicOperatorShortList.isEmpty()))?this.getEconomicOperatorShortList():null);
            List<EconomicOperatorShortListType> rhsEconomicOperatorShortList;
            rhsEconomicOperatorShortList = (((that.economicOperatorShortList!= null)&&(!that.economicOperatorShortList.isEmpty()))?that.getEconomicOperatorShortList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "economicOperatorShortList", lhsEconomicOperatorShortList), LocatorUtils.property(thatLocator, "economicOperatorShortList", rhsEconomicOperatorShortList), lhsEconomicOperatorShortList, rhsEconomicOperatorShortList, ((this.economicOperatorShortList!= null)&&(!this.economicOperatorShortList.isEmpty())), ((that.economicOperatorShortList!= null)&&(!that.economicOperatorShortList.isEmpty())))) {
                return false;
            }
        }
        {
            List<EventType> lhsOpenTenderEvent;
            lhsOpenTenderEvent = (((this.openTenderEvent!= null)&&(!this.openTenderEvent.isEmpty()))?this.getOpenTenderEvent():null);
            List<EventType> rhsOpenTenderEvent;
            rhsOpenTenderEvent = (((that.openTenderEvent!= null)&&(!that.openTenderEvent.isEmpty()))?that.getOpenTenderEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "openTenderEvent", lhsOpenTenderEvent), LocatorUtils.property(thatLocator, "openTenderEvent", rhsOpenTenderEvent), lhsOpenTenderEvent, rhsOpenTenderEvent, ((this.openTenderEvent!= null)&&(!this.openTenderEvent.isEmpty())), ((that.openTenderEvent!= null)&&(!that.openTenderEvent.isEmpty())))) {
                return false;
            }
        }
        {
            AuctionTermsType lhsAuctionTerms;
            lhsAuctionTerms = this.getAuctionTerms();
            AuctionTermsType rhsAuctionTerms;
            rhsAuctionTerms = that.getAuctionTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auctionTerms", lhsAuctionTerms), LocatorUtils.property(thatLocator, "auctionTerms", rhsAuctionTerms), lhsAuctionTerms, rhsAuctionTerms, (this.auctionTerms!= null), (that.auctionTerms!= null))) {
                return false;
            }
        }
        {
            FrameworkAgreementType lhsFrameworkAgreement;
            lhsFrameworkAgreement = this.getFrameworkAgreement();
            FrameworkAgreementType rhsFrameworkAgreement;
            rhsFrameworkAgreement = that.getFrameworkAgreement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "frameworkAgreement", lhsFrameworkAgreement), LocatorUtils.property(thatLocator, "frameworkAgreement", rhsFrameworkAgreement), lhsFrameworkAgreement, rhsFrameworkAgreement, (this.frameworkAgreement!= null), (that.frameworkAgreement!= null))) {
                return false;
            }
        }
        {
            List<ContractingSystemType> lhsContractingSystem;
            lhsContractingSystem = (((this.contractingSystem!= null)&&(!this.contractingSystem.isEmpty()))?this.getContractingSystem():null);
            List<ContractingSystemType> rhsContractingSystem;
            rhsContractingSystem = (((that.contractingSystem!= null)&&(!that.contractingSystem.isEmpty()))?that.getContractingSystem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractingSystem", lhsContractingSystem), LocatorUtils.property(thatLocator, "contractingSystem", rhsContractingSystem), lhsContractingSystem, rhsContractingSystem, ((this.contractingSystem!= null)&&(!this.contractingSystem.isEmpty())), ((that.contractingSystem!= null)&&(!that.contractingSystem.isEmpty())))) {
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
            OriginalContractingSystemIDType theOriginalContractingSystemID;
            theOriginalContractingSystemID = this.getOriginalContractingSystemID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalContractingSystemID", theOriginalContractingSystemID), currentHashCode, theOriginalContractingSystemID, (this.originalContractingSystemID!= null));
        }
        {
            List<DescriptionType> theDescription;
            theDescription = (((this.description!= null)&&(!this.description.isEmpty()))?this.getDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, ((this.description!= null)&&(!this.description.isEmpty())));
        }
        {
            List<NegotiationDescriptionType> theNegotiationDescription;
            theNegotiationDescription = (((this.negotiationDescription!= null)&&(!this.negotiationDescription.isEmpty()))?this.getNegotiationDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "negotiationDescription", theNegotiationDescription), currentHashCode, theNegotiationDescription, ((this.negotiationDescription!= null)&&(!this.negotiationDescription.isEmpty())));
        }
        {
            ProcedureCodeType theProcedureCode;
            theProcedureCode = this.getProcedureCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "procedureCode", theProcedureCode), currentHashCode, theProcedureCode, (this.procedureCode!= null));
        }
        {
            UrgencyCodeType theUrgencyCode;
            theUrgencyCode = this.getUrgencyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "urgencyCode", theUrgencyCode), currentHashCode, theUrgencyCode, (this.urgencyCode!= null));
        }
        {
            ExpenseCodeType theExpenseCode;
            theExpenseCode = this.getExpenseCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expenseCode", theExpenseCode), currentHashCode, theExpenseCode, (this.expenseCode!= null));
        }
        {
            PartPresentationCodeType thePartPresentationCode;
            thePartPresentationCode = this.getPartPresentationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partPresentationCode", thePartPresentationCode), currentHashCode, thePartPresentationCode, (this.partPresentationCode!= null));
        }
        {
            ContractingSystemCodeType theContractingSystemCode;
            theContractingSystemCode = this.getContractingSystemCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractingSystemCode", theContractingSystemCode), currentHashCode, theContractingSystemCode, (this.contractingSystemCode!= null));
        }
        {
            SubmissionMethodCodeType theSubmissionMethodCode;
            theSubmissionMethodCode = this.getSubmissionMethodCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "submissionMethodCode", theSubmissionMethodCode), currentHashCode, theSubmissionMethodCode, (this.submissionMethodCode!= null));
        }
        {
            CandidateReductionConstraintIndicatorType theCandidateReductionConstraintIndicator;
            theCandidateReductionConstraintIndicator = this.getCandidateReductionConstraintIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "candidateReductionConstraintIndicator", theCandidateReductionConstraintIndicator), currentHashCode, theCandidateReductionConstraintIndicator, (this.candidateReductionConstraintIndicator!= null));
        }
        {
            GovernmentAgreementConstraintIndicatorType theGovernmentAgreementConstraintIndicator;
            theGovernmentAgreementConstraintIndicator = this.getGovernmentAgreementConstraintIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "governmentAgreementConstraintIndicator", theGovernmentAgreementConstraintIndicator), currentHashCode, theGovernmentAgreementConstraintIndicator, (this.governmentAgreementConstraintIndicator!= null));
        }
        {
            AccessToolsURIType theAccessToolsURI;
            theAccessToolsURI = this.getAccessToolsURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accessToolsURI", theAccessToolsURI), currentHashCode, theAccessToolsURI, (this.accessToolsURI!= null));
        }
        {
            PeriodType theDocumentAvailabilityPeriod;
            theDocumentAvailabilityPeriod = this.getDocumentAvailabilityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentAvailabilityPeriod", theDocumentAvailabilityPeriod), currentHashCode, theDocumentAvailabilityPeriod, (this.documentAvailabilityPeriod!= null));
        }
        {
            PeriodType theTenderSubmissionDeadlinePeriod;
            theTenderSubmissionDeadlinePeriod = this.getTenderSubmissionDeadlinePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderSubmissionDeadlinePeriod", theTenderSubmissionDeadlinePeriod), currentHashCode, theTenderSubmissionDeadlinePeriod, (this.tenderSubmissionDeadlinePeriod!= null));
        }
        {
            PeriodType theInvitationSubmissionPeriod;
            theInvitationSubmissionPeriod = this.getInvitationSubmissionPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invitationSubmissionPeriod", theInvitationSubmissionPeriod), currentHashCode, theInvitationSubmissionPeriod, (this.invitationSubmissionPeriod!= null));
        }
        {
            PeriodType theParticipationRequestReceptionPeriod;
            theParticipationRequestReceptionPeriod = this.getParticipationRequestReceptionPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "participationRequestReceptionPeriod", theParticipationRequestReceptionPeriod), currentHashCode, theParticipationRequestReceptionPeriod, (this.participationRequestReceptionPeriod!= null));
        }
        {
            List<DocumentReferenceType> theNoticeDocumentReference;
            theNoticeDocumentReference = (((this.noticeDocumentReference!= null)&&(!this.noticeDocumentReference.isEmpty()))?this.getNoticeDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noticeDocumentReference", theNoticeDocumentReference), currentHashCode, theNoticeDocumentReference, ((this.noticeDocumentReference!= null)&&(!this.noticeDocumentReference.isEmpty())));
        }
        {
            List<DocumentReferenceType> theAdditionalDocumentReference;
            theAdditionalDocumentReference = (((this.additionalDocumentReference!= null)&&(!this.additionalDocumentReference.isEmpty()))?this.getAdditionalDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalDocumentReference", theAdditionalDocumentReference), currentHashCode, theAdditionalDocumentReference, ((this.additionalDocumentReference!= null)&&(!this.additionalDocumentReference.isEmpty())));
        }
        {
            List<ProcessJustificationType> theProcessJustification;
            theProcessJustification = (((this.processJustification!= null)&&(!this.processJustification.isEmpty()))?this.getProcessJustification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processJustification", theProcessJustification), currentHashCode, theProcessJustification, ((this.processJustification!= null)&&(!this.processJustification.isEmpty())));
        }
        {
            List<EconomicOperatorShortListType> theEconomicOperatorShortList;
            theEconomicOperatorShortList = (((this.economicOperatorShortList!= null)&&(!this.economicOperatorShortList.isEmpty()))?this.getEconomicOperatorShortList():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "economicOperatorShortList", theEconomicOperatorShortList), currentHashCode, theEconomicOperatorShortList, ((this.economicOperatorShortList!= null)&&(!this.economicOperatorShortList.isEmpty())));
        }
        {
            List<EventType> theOpenTenderEvent;
            theOpenTenderEvent = (((this.openTenderEvent!= null)&&(!this.openTenderEvent.isEmpty()))?this.getOpenTenderEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "openTenderEvent", theOpenTenderEvent), currentHashCode, theOpenTenderEvent, ((this.openTenderEvent!= null)&&(!this.openTenderEvent.isEmpty())));
        }
        {
            AuctionTermsType theAuctionTerms;
            theAuctionTerms = this.getAuctionTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "auctionTerms", theAuctionTerms), currentHashCode, theAuctionTerms, (this.auctionTerms!= null));
        }
        {
            FrameworkAgreementType theFrameworkAgreement;
            theFrameworkAgreement = this.getFrameworkAgreement();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "frameworkAgreement", theFrameworkAgreement), currentHashCode, theFrameworkAgreement, (this.frameworkAgreement!= null));
        }
        {
            List<ContractingSystemType> theContractingSystem;
            theContractingSystem = (((this.contractingSystem!= null)&&(!this.contractingSystem.isEmpty()))?this.getContractingSystem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractingSystem", theContractingSystem), currentHashCode, theContractingSystem, ((this.contractingSystem!= null)&&(!this.contractingSystem.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
