//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.25 alle 12:32:23 PM CET 
//


package oasis.names.specification.ubl.schema.xsd.qualificationapplicationresponse_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ContractingPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DocumentReferenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EconomicOperatorPartyType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.EvidenceType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ProcurementProjectLotType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ProcurementProjectType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.SignatureType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionResponseType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TenderingCriterionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ContractFolderIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ContractNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CopyIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CustomizationIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EconomicOperatorGroupNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PreviousVersionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProcedureCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProfileExecutionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProfileIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QualificationApplicationTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UBLVersionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UUIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.VersionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeightScoringMethodologyNoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeightingTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_2.UBLExtensionsType;
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
 * <p>Classe Java per QualificationApplicationResponseType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="QualificationApplicationResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UBLVersionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomizationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProfileID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProfileExecutionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CopyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContractFolderID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContractName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EconomicOperatorGroupName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VersionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousVersionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcedureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}QualificationApplicationTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeightScoringMethodologyNote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeightingTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractingParty" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EconomicOperatorParty" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementProject" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementProjectLot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderingCriterion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderingCriterionResponse" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Evidence" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Signature" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualificationApplicationResponseType", propOrder = {
    "ublExtensions",
    "ublVersionID",
    "customizationID",
    "profileID",
    "profileExecutionID",
    "id",
    "copyIndicator",
    "uuid",
    "contractFolderID",
    "contractName",
    "issueDate",
    "issueTime",
    "economicOperatorGroupName",
    "versionID",
    "previousVersionID",
    "procedureCode",
    "qualificationApplicationTypeCode",
    "weightScoringMethodologyNote",
    "weightingTypeCode",
    "note",
    "contractingParty",
    "economicOperatorParty",
    "procurementProject",
    "procurementProjectLot",
    "tenderingCriterion",
    "tenderingCriterionResponse",
    "additionalDocumentReference",
    "evidence",
    "signature"
})
public class QualificationApplicationResponseType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    protected UBLExtensionsType ublExtensions;
    @XmlElement(name = "UBLVersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UBLVersionIDType ublVersionID;
    @XmlElement(name = "CustomizationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CustomizationIDType customizationID;
    @XmlElement(name = "ProfileID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProfileIDType profileID;
    @XmlElement(name = "ProfileExecutionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProfileExecutionIDType profileExecutionID;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "CopyIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CopyIndicatorType copyIndicator;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected UUIDType uuid;
    @XmlElement(name = "ContractFolderID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected ContractFolderIDType contractFolderID;
    @XmlElement(name = "ContractName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ContractNameType> contractName;
    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected IssueDateType issueDate;
    @XmlElement(name = "IssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IssueTimeType issueTime;
    @XmlElement(name = "EconomicOperatorGroupName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EconomicOperatorGroupNameType economicOperatorGroupName;
    @XmlElement(name = "VersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VersionIDType versionID;
    @XmlElement(name = "PreviousVersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PreviousVersionIDType previousVersionID;
    @XmlElement(name = "ProcedureCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected ProcedureCodeType procedureCode;
    @XmlElement(name = "QualificationApplicationTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected QualificationApplicationTypeCodeType qualificationApplicationTypeCode;
    @XmlElement(name = "WeightScoringMethodologyNote", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<WeightScoringMethodologyNoteType> weightScoringMethodologyNote;
    @XmlElement(name = "WeightingTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected WeightingTypeCodeType weightingTypeCode;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "ContractingParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected List<ContractingPartyType> contractingParty;
    @XmlElement(name = "EconomicOperatorParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected List<EconomicOperatorPartyType> economicOperatorParty;
    @XmlElement(name = "ProcurementProject", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected ProcurementProjectType procurementProject;
    @XmlElement(name = "ProcurementProjectLot", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<ProcurementProjectLotType> procurementProjectLot;
    @XmlElement(name = "TenderingCriterion", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<TenderingCriterionType> tenderingCriterion;
    @XmlElement(name = "TenderingCriterionResponse", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    protected List<TenderingCriterionResponseType> tenderingCriterionResponse;
    @XmlElement(name = "AdditionalDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<DocumentReferenceType> additionalDocumentReference;
    @XmlElement(name = "Evidence", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<EvidenceType> evidence;
    @XmlElement(name = "Signature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected List<SignatureType> signature;

    /**
     * Recupera il valore della proprietà ublExtensions.
     * 
     * @return
     *     possible object is
     *     {@link UBLExtensionsType }
     *     
     */
    public UBLExtensionsType getUBLExtensions() {
        return ublExtensions;
    }

    /**
     * Imposta il valore della proprietà ublExtensions.
     * 
     * @param value
     *     allowed object is
     *     {@link UBLExtensionsType }
     *     
     */
    public void setUBLExtensions(UBLExtensionsType value) {
        this.ublExtensions = value;
    }

    /**
     * Recupera il valore della proprietà ublVersionID.
     * 
     * @return
     *     possible object is
     *     {@link UBLVersionIDType }
     *     
     */
    public UBLVersionIDType getUBLVersionID() {
        return ublVersionID;
    }

    /**
     * Imposta il valore della proprietà ublVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link UBLVersionIDType }
     *     
     */
    public void setUBLVersionID(UBLVersionIDType value) {
        this.ublVersionID = value;
    }

    /**
     * Recupera il valore della proprietà customizationID.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationIDType }
     *     
     */
    public CustomizationIDType getCustomizationID() {
        return customizationID;
    }

    /**
     * Imposta il valore della proprietà customizationID.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationIDType }
     *     
     */
    public void setCustomizationID(CustomizationIDType value) {
        this.customizationID = value;
    }

    /**
     * Recupera il valore della proprietà profileID.
     * 
     * @return
     *     possible object is
     *     {@link ProfileIDType }
     *     
     */
    public ProfileIDType getProfileID() {
        return profileID;
    }

    /**
     * Imposta il valore della proprietà profileID.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileIDType }
     *     
     */
    public void setProfileID(ProfileIDType value) {
        this.profileID = value;
    }

    /**
     * Recupera il valore della proprietà profileExecutionID.
     * 
     * @return
     *     possible object is
     *     {@link ProfileExecutionIDType }
     *     
     */
    public ProfileExecutionIDType getProfileExecutionID() {
        return profileExecutionID;
    }

    /**
     * Imposta il valore della proprietà profileExecutionID.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileExecutionIDType }
     *     
     */
    public void setProfileExecutionID(ProfileExecutionIDType value) {
        this.profileExecutionID = value;
    }

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
     * Recupera il valore della proprietà copyIndicator.
     * 
     * @return
     *     possible object is
     *     {@link CopyIndicatorType }
     *     
     */
    public CopyIndicatorType getCopyIndicator() {
        return copyIndicator;
    }

    /**
     * Imposta il valore della proprietà copyIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyIndicatorType }
     *     
     */
    public void setCopyIndicator(CopyIndicatorType value) {
        this.copyIndicator = value;
    }

    /**
     * Recupera il valore della proprietà uuid.
     * 
     * @return
     *     possible object is
     *     {@link UUIDType }
     *     
     */
    public UUIDType getUUID() {
        return uuid;
    }

    /**
     * Imposta il valore della proprietà uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link UUIDType }
     *     
     */
    public void setUUID(UUIDType value) {
        this.uuid = value;
    }

    /**
     * Recupera il valore della proprietà contractFolderID.
     * 
     * @return
     *     possible object is
     *     {@link ContractFolderIDType }
     *     
     */
    public ContractFolderIDType getContractFolderID() {
        return contractFolderID;
    }

    /**
     * Imposta il valore della proprietà contractFolderID.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractFolderIDType }
     *     
     */
    public void setContractFolderID(ContractFolderIDType value) {
        this.contractFolderID = value;
    }

    /**
     * Gets the value of the contractName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractNameType }
     * 
     * 
     */
    public List<ContractNameType> getContractName() {
        if (contractName == null) {
            contractName = new ArrayList<ContractNameType>();
        }
        return this.contractName;
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
     * Recupera il valore della proprietà economicOperatorGroupName.
     * 
     * @return
     *     possible object is
     *     {@link EconomicOperatorGroupNameType }
     *     
     */
    public EconomicOperatorGroupNameType getEconomicOperatorGroupName() {
        return economicOperatorGroupName;
    }

    /**
     * Imposta il valore della proprietà economicOperatorGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicOperatorGroupNameType }
     *     
     */
    public void setEconomicOperatorGroupName(EconomicOperatorGroupNameType value) {
        this.economicOperatorGroupName = value;
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
     * Recupera il valore della proprietà previousVersionID.
     * 
     * @return
     *     possible object is
     *     {@link PreviousVersionIDType }
     *     
     */
    public PreviousVersionIDType getPreviousVersionID() {
        return previousVersionID;
    }

    /**
     * Imposta il valore della proprietà previousVersionID.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousVersionIDType }
     *     
     */
    public void setPreviousVersionID(PreviousVersionIDType value) {
        this.previousVersionID = value;
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
     * Recupera il valore della proprietà qualificationApplicationTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link QualificationApplicationTypeCodeType }
     *     
     */
    public QualificationApplicationTypeCodeType getQualificationApplicationTypeCode() {
        return qualificationApplicationTypeCode;
    }

    /**
     * Imposta il valore della proprietà qualificationApplicationTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationApplicationTypeCodeType }
     *     
     */
    public void setQualificationApplicationTypeCode(QualificationApplicationTypeCodeType value) {
        this.qualificationApplicationTypeCode = value;
    }

    /**
     * Gets the value of the weightScoringMethodologyNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weightScoringMethodologyNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeightScoringMethodologyNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightScoringMethodologyNoteType }
     * 
     * 
     */
    public List<WeightScoringMethodologyNoteType> getWeightScoringMethodologyNote() {
        if (weightScoringMethodologyNote == null) {
            weightScoringMethodologyNote = new ArrayList<WeightScoringMethodologyNoteType>();
        }
        return this.weightScoringMethodologyNote;
    }

    /**
     * Recupera il valore della proprietà weightingTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link WeightingTypeCodeType }
     *     
     */
    public WeightingTypeCodeType getWeightingTypeCode() {
        return weightingTypeCode;
    }

    /**
     * Imposta il valore della proprietà weightingTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightingTypeCodeType }
     *     
     */
    public void setWeightingTypeCode(WeightingTypeCodeType value) {
        this.weightingTypeCode = value;
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
     * Gets the value of the contractingParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractingParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractingParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractingPartyType }
     * 
     * 
     */
    public List<ContractingPartyType> getContractingParty() {
        if (contractingParty == null) {
            contractingParty = new ArrayList<ContractingPartyType>();
        }
        return this.contractingParty;
    }

    /**
     * Gets the value of the economicOperatorParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the economicOperatorParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEconomicOperatorParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EconomicOperatorPartyType }
     * 
     * 
     */
    public List<EconomicOperatorPartyType> getEconomicOperatorParty() {
        if (economicOperatorParty == null) {
            economicOperatorParty = new ArrayList<EconomicOperatorPartyType>();
        }
        return this.economicOperatorParty;
    }

    /**
     * Recupera il valore della proprietà procurementProject.
     * 
     * @return
     *     possible object is
     *     {@link ProcurementProjectType }
     *     
     */
    public ProcurementProjectType getProcurementProject() {
        return procurementProject;
    }

    /**
     * Imposta il valore della proprietà procurementProject.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcurementProjectType }
     *     
     */
    public void setProcurementProject(ProcurementProjectType value) {
        this.procurementProject = value;
    }

    /**
     * Gets the value of the procurementProjectLot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procurementProjectLot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcurementProjectLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcurementProjectLotType }
     * 
     * 
     */
    public List<ProcurementProjectLotType> getProcurementProjectLot() {
        if (procurementProjectLot == null) {
            procurementProjectLot = new ArrayList<ProcurementProjectLotType>();
        }
        return this.procurementProjectLot;
    }

    /**
     * Gets the value of the tenderingCriterion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderingCriterion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderingCriterion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderingCriterionType }
     * 
     * 
     */
    public List<TenderingCriterionType> getTenderingCriterion() {
        if (tenderingCriterion == null) {
            tenderingCriterion = new ArrayList<TenderingCriterionType>();
        }
        return this.tenderingCriterion;
    }

    /**
     * Gets the value of the tenderingCriterionResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderingCriterionResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderingCriterionResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderingCriterionResponseType }
     * 
     * 
     */
    public List<TenderingCriterionResponseType> getTenderingCriterionResponse() {
        if (tenderingCriterionResponse == null) {
            tenderingCriterionResponse = new ArrayList<TenderingCriterionResponseType>();
        }
        return this.tenderingCriterionResponse;
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
     * Gets the value of the evidence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evidence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvidenceType }
     * 
     * 
     */
    public List<EvidenceType> getEvidence() {
        if (evidence == null) {
            evidence = new ArrayList<EvidenceType>();
        }
        return this.evidence;
    }

    /**
     * Gets the value of the signature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureType }
     * 
     * 
     */
    public List<SignatureType> getSignature() {
        if (signature == null) {
            signature = new ArrayList<SignatureType>();
        }
        return this.signature;
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
            UBLExtensionsType theUBLExtensions;
            theUBLExtensions = this.getUBLExtensions();
            strategy.appendField(locator, this, "ublExtensions", buffer, theUBLExtensions, (this.ublExtensions!= null));
        }
        {
            UBLVersionIDType theUBLVersionID;
            theUBLVersionID = this.getUBLVersionID();
            strategy.appendField(locator, this, "ublVersionID", buffer, theUBLVersionID, (this.ublVersionID!= null));
        }
        {
            CustomizationIDType theCustomizationID;
            theCustomizationID = this.getCustomizationID();
            strategy.appendField(locator, this, "customizationID", buffer, theCustomizationID, (this.customizationID!= null));
        }
        {
            ProfileIDType theProfileID;
            theProfileID = this.getProfileID();
            strategy.appendField(locator, this, "profileID", buffer, theProfileID, (this.profileID!= null));
        }
        {
            ProfileExecutionIDType theProfileExecutionID;
            theProfileExecutionID = this.getProfileExecutionID();
            strategy.appendField(locator, this, "profileExecutionID", buffer, theProfileExecutionID, (this.profileExecutionID!= null));
        }
        {
            IDType theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID, (this.id!= null));
        }
        {
            CopyIndicatorType theCopyIndicator;
            theCopyIndicator = this.getCopyIndicator();
            strategy.appendField(locator, this, "copyIndicator", buffer, theCopyIndicator, (this.copyIndicator!= null));
        }
        {
            UUIDType theUUID;
            theUUID = this.getUUID();
            strategy.appendField(locator, this, "uuid", buffer, theUUID, (this.uuid!= null));
        }
        {
            ContractFolderIDType theContractFolderID;
            theContractFolderID = this.getContractFolderID();
            strategy.appendField(locator, this, "contractFolderID", buffer, theContractFolderID, (this.contractFolderID!= null));
        }
        {
            List<ContractNameType> theContractName;
            theContractName = (((this.contractName!= null)&&(!this.contractName.isEmpty()))?this.getContractName():null);
            strategy.appendField(locator, this, "contractName", buffer, theContractName, ((this.contractName!= null)&&(!this.contractName.isEmpty())));
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
            EconomicOperatorGroupNameType theEconomicOperatorGroupName;
            theEconomicOperatorGroupName = this.getEconomicOperatorGroupName();
            strategy.appendField(locator, this, "economicOperatorGroupName", buffer, theEconomicOperatorGroupName, (this.economicOperatorGroupName!= null));
        }
        {
            VersionIDType theVersionID;
            theVersionID = this.getVersionID();
            strategy.appendField(locator, this, "versionID", buffer, theVersionID, (this.versionID!= null));
        }
        {
            PreviousVersionIDType thePreviousVersionID;
            thePreviousVersionID = this.getPreviousVersionID();
            strategy.appendField(locator, this, "previousVersionID", buffer, thePreviousVersionID, (this.previousVersionID!= null));
        }
        {
            ProcedureCodeType theProcedureCode;
            theProcedureCode = this.getProcedureCode();
            strategy.appendField(locator, this, "procedureCode", buffer, theProcedureCode, (this.procedureCode!= null));
        }
        {
            QualificationApplicationTypeCodeType theQualificationApplicationTypeCode;
            theQualificationApplicationTypeCode = this.getQualificationApplicationTypeCode();
            strategy.appendField(locator, this, "qualificationApplicationTypeCode", buffer, theQualificationApplicationTypeCode, (this.qualificationApplicationTypeCode!= null));
        }
        {
            List<WeightScoringMethodologyNoteType> theWeightScoringMethodologyNote;
            theWeightScoringMethodologyNote = (((this.weightScoringMethodologyNote!= null)&&(!this.weightScoringMethodologyNote.isEmpty()))?this.getWeightScoringMethodologyNote():null);
            strategy.appendField(locator, this, "weightScoringMethodologyNote", buffer, theWeightScoringMethodologyNote, ((this.weightScoringMethodologyNote!= null)&&(!this.weightScoringMethodologyNote.isEmpty())));
        }
        {
            WeightingTypeCodeType theWeightingTypeCode;
            theWeightingTypeCode = this.getWeightingTypeCode();
            strategy.appendField(locator, this, "weightingTypeCode", buffer, theWeightingTypeCode, (this.weightingTypeCode!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            strategy.appendField(locator, this, "note", buffer, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            List<ContractingPartyType> theContractingParty;
            theContractingParty = (((this.contractingParty!= null)&&(!this.contractingParty.isEmpty()))?this.getContractingParty():null);
            strategy.appendField(locator, this, "contractingParty", buffer, theContractingParty, ((this.contractingParty!= null)&&(!this.contractingParty.isEmpty())));
        }
        {
            List<EconomicOperatorPartyType> theEconomicOperatorParty;
            theEconomicOperatorParty = (((this.economicOperatorParty!= null)&&(!this.economicOperatorParty.isEmpty()))?this.getEconomicOperatorParty():null);
            strategy.appendField(locator, this, "economicOperatorParty", buffer, theEconomicOperatorParty, ((this.economicOperatorParty!= null)&&(!this.economicOperatorParty.isEmpty())));
        }
        {
            ProcurementProjectType theProcurementProject;
            theProcurementProject = this.getProcurementProject();
            strategy.appendField(locator, this, "procurementProject", buffer, theProcurementProject, (this.procurementProject!= null));
        }
        {
            List<ProcurementProjectLotType> theProcurementProjectLot;
            theProcurementProjectLot = (((this.procurementProjectLot!= null)&&(!this.procurementProjectLot.isEmpty()))?this.getProcurementProjectLot():null);
            strategy.appendField(locator, this, "procurementProjectLot", buffer, theProcurementProjectLot, ((this.procurementProjectLot!= null)&&(!this.procurementProjectLot.isEmpty())));
        }
        {
            List<TenderingCriterionType> theTenderingCriterion;
            theTenderingCriterion = (((this.tenderingCriterion!= null)&&(!this.tenderingCriterion.isEmpty()))?this.getTenderingCriterion():null);
            strategy.appendField(locator, this, "tenderingCriterion", buffer, theTenderingCriterion, ((this.tenderingCriterion!= null)&&(!this.tenderingCriterion.isEmpty())));
        }
        {
            List<TenderingCriterionResponseType> theTenderingCriterionResponse;
            theTenderingCriterionResponse = (((this.tenderingCriterionResponse!= null)&&(!this.tenderingCriterionResponse.isEmpty()))?this.getTenderingCriterionResponse():null);
            strategy.appendField(locator, this, "tenderingCriterionResponse", buffer, theTenderingCriterionResponse, ((this.tenderingCriterionResponse!= null)&&(!this.tenderingCriterionResponse.isEmpty())));
        }
        {
            List<DocumentReferenceType> theAdditionalDocumentReference;
            theAdditionalDocumentReference = (((this.additionalDocumentReference!= null)&&(!this.additionalDocumentReference.isEmpty()))?this.getAdditionalDocumentReference():null);
            strategy.appendField(locator, this, "additionalDocumentReference", buffer, theAdditionalDocumentReference, ((this.additionalDocumentReference!= null)&&(!this.additionalDocumentReference.isEmpty())));
        }
        {
            List<EvidenceType> theEvidence;
            theEvidence = (((this.evidence!= null)&&(!this.evidence.isEmpty()))?this.getEvidence():null);
            strategy.appendField(locator, this, "evidence", buffer, theEvidence, ((this.evidence!= null)&&(!this.evidence.isEmpty())));
        }
        {
            List<SignatureType> theSignature;
            theSignature = (((this.signature!= null)&&(!this.signature.isEmpty()))?this.getSignature():null);
            strategy.appendField(locator, this, "signature", buffer, theSignature, ((this.signature!= null)&&(!this.signature.isEmpty())));
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
        final QualificationApplicationResponseType that = ((QualificationApplicationResponseType) object);
        {
            UBLExtensionsType lhsUBLExtensions;
            lhsUBLExtensions = this.getUBLExtensions();
            UBLExtensionsType rhsUBLExtensions;
            rhsUBLExtensions = that.getUBLExtensions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ublExtensions", lhsUBLExtensions), LocatorUtils.property(thatLocator, "ublExtensions", rhsUBLExtensions), lhsUBLExtensions, rhsUBLExtensions, (this.ublExtensions!= null), (that.ublExtensions!= null))) {
                return false;
            }
        }
        {
            UBLVersionIDType lhsUBLVersionID;
            lhsUBLVersionID = this.getUBLVersionID();
            UBLVersionIDType rhsUBLVersionID;
            rhsUBLVersionID = that.getUBLVersionID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ublVersionID", lhsUBLVersionID), LocatorUtils.property(thatLocator, "ublVersionID", rhsUBLVersionID), lhsUBLVersionID, rhsUBLVersionID, (this.ublVersionID!= null), (that.ublVersionID!= null))) {
                return false;
            }
        }
        {
            CustomizationIDType lhsCustomizationID;
            lhsCustomizationID = this.getCustomizationID();
            CustomizationIDType rhsCustomizationID;
            rhsCustomizationID = that.getCustomizationID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customizationID", lhsCustomizationID), LocatorUtils.property(thatLocator, "customizationID", rhsCustomizationID), lhsCustomizationID, rhsCustomizationID, (this.customizationID!= null), (that.customizationID!= null))) {
                return false;
            }
        }
        {
            ProfileIDType lhsProfileID;
            lhsProfileID = this.getProfileID();
            ProfileIDType rhsProfileID;
            rhsProfileID = that.getProfileID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "profileID", lhsProfileID), LocatorUtils.property(thatLocator, "profileID", rhsProfileID), lhsProfileID, rhsProfileID, (this.profileID!= null), (that.profileID!= null))) {
                return false;
            }
        }
        {
            ProfileExecutionIDType lhsProfileExecutionID;
            lhsProfileExecutionID = this.getProfileExecutionID();
            ProfileExecutionIDType rhsProfileExecutionID;
            rhsProfileExecutionID = that.getProfileExecutionID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "profileExecutionID", lhsProfileExecutionID), LocatorUtils.property(thatLocator, "profileExecutionID", rhsProfileExecutionID), lhsProfileExecutionID, rhsProfileExecutionID, (this.profileExecutionID!= null), (that.profileExecutionID!= null))) {
                return false;
            }
        }
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
            CopyIndicatorType lhsCopyIndicator;
            lhsCopyIndicator = this.getCopyIndicator();
            CopyIndicatorType rhsCopyIndicator;
            rhsCopyIndicator = that.getCopyIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "copyIndicator", lhsCopyIndicator), LocatorUtils.property(thatLocator, "copyIndicator", rhsCopyIndicator), lhsCopyIndicator, rhsCopyIndicator, (this.copyIndicator!= null), (that.copyIndicator!= null))) {
                return false;
            }
        }
        {
            UUIDType lhsUUID;
            lhsUUID = this.getUUID();
            UUIDType rhsUUID;
            rhsUUID = that.getUUID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uuid", lhsUUID), LocatorUtils.property(thatLocator, "uuid", rhsUUID), lhsUUID, rhsUUID, (this.uuid!= null), (that.uuid!= null))) {
                return false;
            }
        }
        {
            ContractFolderIDType lhsContractFolderID;
            lhsContractFolderID = this.getContractFolderID();
            ContractFolderIDType rhsContractFolderID;
            rhsContractFolderID = that.getContractFolderID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractFolderID", lhsContractFolderID), LocatorUtils.property(thatLocator, "contractFolderID", rhsContractFolderID), lhsContractFolderID, rhsContractFolderID, (this.contractFolderID!= null), (that.contractFolderID!= null))) {
                return false;
            }
        }
        {
            List<ContractNameType> lhsContractName;
            lhsContractName = (((this.contractName!= null)&&(!this.contractName.isEmpty()))?this.getContractName():null);
            List<ContractNameType> rhsContractName;
            rhsContractName = (((that.contractName!= null)&&(!that.contractName.isEmpty()))?that.getContractName():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractName", lhsContractName), LocatorUtils.property(thatLocator, "contractName", rhsContractName), lhsContractName, rhsContractName, ((this.contractName!= null)&&(!this.contractName.isEmpty())), ((that.contractName!= null)&&(!that.contractName.isEmpty())))) {
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
            EconomicOperatorGroupNameType lhsEconomicOperatorGroupName;
            lhsEconomicOperatorGroupName = this.getEconomicOperatorGroupName();
            EconomicOperatorGroupNameType rhsEconomicOperatorGroupName;
            rhsEconomicOperatorGroupName = that.getEconomicOperatorGroupName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "economicOperatorGroupName", lhsEconomicOperatorGroupName), LocatorUtils.property(thatLocator, "economicOperatorGroupName", rhsEconomicOperatorGroupName), lhsEconomicOperatorGroupName, rhsEconomicOperatorGroupName, (this.economicOperatorGroupName!= null), (that.economicOperatorGroupName!= null))) {
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
            PreviousVersionIDType lhsPreviousVersionID;
            lhsPreviousVersionID = this.getPreviousVersionID();
            PreviousVersionIDType rhsPreviousVersionID;
            rhsPreviousVersionID = that.getPreviousVersionID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousVersionID", lhsPreviousVersionID), LocatorUtils.property(thatLocator, "previousVersionID", rhsPreviousVersionID), lhsPreviousVersionID, rhsPreviousVersionID, (this.previousVersionID!= null), (that.previousVersionID!= null))) {
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
            QualificationApplicationTypeCodeType lhsQualificationApplicationTypeCode;
            lhsQualificationApplicationTypeCode = this.getQualificationApplicationTypeCode();
            QualificationApplicationTypeCodeType rhsQualificationApplicationTypeCode;
            rhsQualificationApplicationTypeCode = that.getQualificationApplicationTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qualificationApplicationTypeCode", lhsQualificationApplicationTypeCode), LocatorUtils.property(thatLocator, "qualificationApplicationTypeCode", rhsQualificationApplicationTypeCode), lhsQualificationApplicationTypeCode, rhsQualificationApplicationTypeCode, (this.qualificationApplicationTypeCode!= null), (that.qualificationApplicationTypeCode!= null))) {
                return false;
            }
        }
        {
            List<WeightScoringMethodologyNoteType> lhsWeightScoringMethodologyNote;
            lhsWeightScoringMethodologyNote = (((this.weightScoringMethodologyNote!= null)&&(!this.weightScoringMethodologyNote.isEmpty()))?this.getWeightScoringMethodologyNote():null);
            List<WeightScoringMethodologyNoteType> rhsWeightScoringMethodologyNote;
            rhsWeightScoringMethodologyNote = (((that.weightScoringMethodologyNote!= null)&&(!that.weightScoringMethodologyNote.isEmpty()))?that.getWeightScoringMethodologyNote():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weightScoringMethodologyNote", lhsWeightScoringMethodologyNote), LocatorUtils.property(thatLocator, "weightScoringMethodologyNote", rhsWeightScoringMethodologyNote), lhsWeightScoringMethodologyNote, rhsWeightScoringMethodologyNote, ((this.weightScoringMethodologyNote!= null)&&(!this.weightScoringMethodologyNote.isEmpty())), ((that.weightScoringMethodologyNote!= null)&&(!that.weightScoringMethodologyNote.isEmpty())))) {
                return false;
            }
        }
        {
            WeightingTypeCodeType lhsWeightingTypeCode;
            lhsWeightingTypeCode = this.getWeightingTypeCode();
            WeightingTypeCodeType rhsWeightingTypeCode;
            rhsWeightingTypeCode = that.getWeightingTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weightingTypeCode", lhsWeightingTypeCode), LocatorUtils.property(thatLocator, "weightingTypeCode", rhsWeightingTypeCode), lhsWeightingTypeCode, rhsWeightingTypeCode, (this.weightingTypeCode!= null), (that.weightingTypeCode!= null))) {
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
            List<ContractingPartyType> lhsContractingParty;
            lhsContractingParty = (((this.contractingParty!= null)&&(!this.contractingParty.isEmpty()))?this.getContractingParty():null);
            List<ContractingPartyType> rhsContractingParty;
            rhsContractingParty = (((that.contractingParty!= null)&&(!that.contractingParty.isEmpty()))?that.getContractingParty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractingParty", lhsContractingParty), LocatorUtils.property(thatLocator, "contractingParty", rhsContractingParty), lhsContractingParty, rhsContractingParty, ((this.contractingParty!= null)&&(!this.contractingParty.isEmpty())), ((that.contractingParty!= null)&&(!that.contractingParty.isEmpty())))) {
                return false;
            }
        }
        {
            List<EconomicOperatorPartyType> lhsEconomicOperatorParty;
            lhsEconomicOperatorParty = (((this.economicOperatorParty!= null)&&(!this.economicOperatorParty.isEmpty()))?this.getEconomicOperatorParty():null);
            List<EconomicOperatorPartyType> rhsEconomicOperatorParty;
            rhsEconomicOperatorParty = (((that.economicOperatorParty!= null)&&(!that.economicOperatorParty.isEmpty()))?that.getEconomicOperatorParty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "economicOperatorParty", lhsEconomicOperatorParty), LocatorUtils.property(thatLocator, "economicOperatorParty", rhsEconomicOperatorParty), lhsEconomicOperatorParty, rhsEconomicOperatorParty, ((this.economicOperatorParty!= null)&&(!this.economicOperatorParty.isEmpty())), ((that.economicOperatorParty!= null)&&(!that.economicOperatorParty.isEmpty())))) {
                return false;
            }
        }
        {
            ProcurementProjectType lhsProcurementProject;
            lhsProcurementProject = this.getProcurementProject();
            ProcurementProjectType rhsProcurementProject;
            rhsProcurementProject = that.getProcurementProject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "procurementProject", lhsProcurementProject), LocatorUtils.property(thatLocator, "procurementProject", rhsProcurementProject), lhsProcurementProject, rhsProcurementProject, (this.procurementProject!= null), (that.procurementProject!= null))) {
                return false;
            }
        }
        {
            List<ProcurementProjectLotType> lhsProcurementProjectLot;
            lhsProcurementProjectLot = (((this.procurementProjectLot!= null)&&(!this.procurementProjectLot.isEmpty()))?this.getProcurementProjectLot():null);
            List<ProcurementProjectLotType> rhsProcurementProjectLot;
            rhsProcurementProjectLot = (((that.procurementProjectLot!= null)&&(!that.procurementProjectLot.isEmpty()))?that.getProcurementProjectLot():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "procurementProjectLot", lhsProcurementProjectLot), LocatorUtils.property(thatLocator, "procurementProjectLot", rhsProcurementProjectLot), lhsProcurementProjectLot, rhsProcurementProjectLot, ((this.procurementProjectLot!= null)&&(!this.procurementProjectLot.isEmpty())), ((that.procurementProjectLot!= null)&&(!that.procurementProjectLot.isEmpty())))) {
                return false;
            }
        }
        {
            List<TenderingCriterionType> lhsTenderingCriterion;
            lhsTenderingCriterion = (((this.tenderingCriterion!= null)&&(!this.tenderingCriterion.isEmpty()))?this.getTenderingCriterion():null);
            List<TenderingCriterionType> rhsTenderingCriterion;
            rhsTenderingCriterion = (((that.tenderingCriterion!= null)&&(!that.tenderingCriterion.isEmpty()))?that.getTenderingCriterion():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderingCriterion", lhsTenderingCriterion), LocatorUtils.property(thatLocator, "tenderingCriterion", rhsTenderingCriterion), lhsTenderingCriterion, rhsTenderingCriterion, ((this.tenderingCriterion!= null)&&(!this.tenderingCriterion.isEmpty())), ((that.tenderingCriterion!= null)&&(!that.tenderingCriterion.isEmpty())))) {
                return false;
            }
        }
        {
            List<TenderingCriterionResponseType> lhsTenderingCriterionResponse;
            lhsTenderingCriterionResponse = (((this.tenderingCriterionResponse!= null)&&(!this.tenderingCriterionResponse.isEmpty()))?this.getTenderingCriterionResponse():null);
            List<TenderingCriterionResponseType> rhsTenderingCriterionResponse;
            rhsTenderingCriterionResponse = (((that.tenderingCriterionResponse!= null)&&(!that.tenderingCriterionResponse.isEmpty()))?that.getTenderingCriterionResponse():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderingCriterionResponse", lhsTenderingCriterionResponse), LocatorUtils.property(thatLocator, "tenderingCriterionResponse", rhsTenderingCriterionResponse), lhsTenderingCriterionResponse, rhsTenderingCriterionResponse, ((this.tenderingCriterionResponse!= null)&&(!this.tenderingCriterionResponse.isEmpty())), ((that.tenderingCriterionResponse!= null)&&(!that.tenderingCriterionResponse.isEmpty())))) {
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
            List<EvidenceType> lhsEvidence;
            lhsEvidence = (((this.evidence!= null)&&(!this.evidence.isEmpty()))?this.getEvidence():null);
            List<EvidenceType> rhsEvidence;
            rhsEvidence = (((that.evidence!= null)&&(!that.evidence.isEmpty()))?that.getEvidence():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "evidence", lhsEvidence), LocatorUtils.property(thatLocator, "evidence", rhsEvidence), lhsEvidence, rhsEvidence, ((this.evidence!= null)&&(!this.evidence.isEmpty())), ((that.evidence!= null)&&(!that.evidence.isEmpty())))) {
                return false;
            }
        }
        {
            List<SignatureType> lhsSignature;
            lhsSignature = (((this.signature!= null)&&(!this.signature.isEmpty()))?this.getSignature():null);
            List<SignatureType> rhsSignature;
            rhsSignature = (((that.signature!= null)&&(!that.signature.isEmpty()))?that.getSignature():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "signature", lhsSignature), LocatorUtils.property(thatLocator, "signature", rhsSignature), lhsSignature, rhsSignature, ((this.signature!= null)&&(!this.signature.isEmpty())), ((that.signature!= null)&&(!that.signature.isEmpty())))) {
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
            UBLExtensionsType theUBLExtensions;
            theUBLExtensions = this.getUBLExtensions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ublExtensions", theUBLExtensions), currentHashCode, theUBLExtensions, (this.ublExtensions!= null));
        }
        {
            UBLVersionIDType theUBLVersionID;
            theUBLVersionID = this.getUBLVersionID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ublVersionID", theUBLVersionID), currentHashCode, theUBLVersionID, (this.ublVersionID!= null));
        }
        {
            CustomizationIDType theCustomizationID;
            theCustomizationID = this.getCustomizationID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customizationID", theCustomizationID), currentHashCode, theCustomizationID, (this.customizationID!= null));
        }
        {
            ProfileIDType theProfileID;
            theProfileID = this.getProfileID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "profileID", theProfileID), currentHashCode, theProfileID, (this.profileID!= null));
        }
        {
            ProfileExecutionIDType theProfileExecutionID;
            theProfileExecutionID = this.getProfileExecutionID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "profileExecutionID", theProfileExecutionID), currentHashCode, theProfileExecutionID, (this.profileExecutionID!= null));
        }
        {
            IDType theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID, (this.id!= null));
        }
        {
            CopyIndicatorType theCopyIndicator;
            theCopyIndicator = this.getCopyIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "copyIndicator", theCopyIndicator), currentHashCode, theCopyIndicator, (this.copyIndicator!= null));
        }
        {
            UUIDType theUUID;
            theUUID = this.getUUID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uuid", theUUID), currentHashCode, theUUID, (this.uuid!= null));
        }
        {
            ContractFolderIDType theContractFolderID;
            theContractFolderID = this.getContractFolderID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractFolderID", theContractFolderID), currentHashCode, theContractFolderID, (this.contractFolderID!= null));
        }
        {
            List<ContractNameType> theContractName;
            theContractName = (((this.contractName!= null)&&(!this.contractName.isEmpty()))?this.getContractName():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractName", theContractName), currentHashCode, theContractName, ((this.contractName!= null)&&(!this.contractName.isEmpty())));
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
            EconomicOperatorGroupNameType theEconomicOperatorGroupName;
            theEconomicOperatorGroupName = this.getEconomicOperatorGroupName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "economicOperatorGroupName", theEconomicOperatorGroupName), currentHashCode, theEconomicOperatorGroupName, (this.economicOperatorGroupName!= null));
        }
        {
            VersionIDType theVersionID;
            theVersionID = this.getVersionID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versionID", theVersionID), currentHashCode, theVersionID, (this.versionID!= null));
        }
        {
            PreviousVersionIDType thePreviousVersionID;
            thePreviousVersionID = this.getPreviousVersionID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousVersionID", thePreviousVersionID), currentHashCode, thePreviousVersionID, (this.previousVersionID!= null));
        }
        {
            ProcedureCodeType theProcedureCode;
            theProcedureCode = this.getProcedureCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "procedureCode", theProcedureCode), currentHashCode, theProcedureCode, (this.procedureCode!= null));
        }
        {
            QualificationApplicationTypeCodeType theQualificationApplicationTypeCode;
            theQualificationApplicationTypeCode = this.getQualificationApplicationTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qualificationApplicationTypeCode", theQualificationApplicationTypeCode), currentHashCode, theQualificationApplicationTypeCode, (this.qualificationApplicationTypeCode!= null));
        }
        {
            List<WeightScoringMethodologyNoteType> theWeightScoringMethodologyNote;
            theWeightScoringMethodologyNote = (((this.weightScoringMethodologyNote!= null)&&(!this.weightScoringMethodologyNote.isEmpty()))?this.getWeightScoringMethodologyNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weightScoringMethodologyNote", theWeightScoringMethodologyNote), currentHashCode, theWeightScoringMethodologyNote, ((this.weightScoringMethodologyNote!= null)&&(!this.weightScoringMethodologyNote.isEmpty())));
        }
        {
            WeightingTypeCodeType theWeightingTypeCode;
            theWeightingTypeCode = this.getWeightingTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weightingTypeCode", theWeightingTypeCode), currentHashCode, theWeightingTypeCode, (this.weightingTypeCode!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            List<ContractingPartyType> theContractingParty;
            theContractingParty = (((this.contractingParty!= null)&&(!this.contractingParty.isEmpty()))?this.getContractingParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractingParty", theContractingParty), currentHashCode, theContractingParty, ((this.contractingParty!= null)&&(!this.contractingParty.isEmpty())));
        }
        {
            List<EconomicOperatorPartyType> theEconomicOperatorParty;
            theEconomicOperatorParty = (((this.economicOperatorParty!= null)&&(!this.economicOperatorParty.isEmpty()))?this.getEconomicOperatorParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "economicOperatorParty", theEconomicOperatorParty), currentHashCode, theEconomicOperatorParty, ((this.economicOperatorParty!= null)&&(!this.economicOperatorParty.isEmpty())));
        }
        {
            ProcurementProjectType theProcurementProject;
            theProcurementProject = this.getProcurementProject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "procurementProject", theProcurementProject), currentHashCode, theProcurementProject, (this.procurementProject!= null));
        }
        {
            List<ProcurementProjectLotType> theProcurementProjectLot;
            theProcurementProjectLot = (((this.procurementProjectLot!= null)&&(!this.procurementProjectLot.isEmpty()))?this.getProcurementProjectLot():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "procurementProjectLot", theProcurementProjectLot), currentHashCode, theProcurementProjectLot, ((this.procurementProjectLot!= null)&&(!this.procurementProjectLot.isEmpty())));
        }
        {
            List<TenderingCriterionType> theTenderingCriterion;
            theTenderingCriterion = (((this.tenderingCriterion!= null)&&(!this.tenderingCriterion.isEmpty()))?this.getTenderingCriterion():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderingCriterion", theTenderingCriterion), currentHashCode, theTenderingCriterion, ((this.tenderingCriterion!= null)&&(!this.tenderingCriterion.isEmpty())));
        }
        {
            List<TenderingCriterionResponseType> theTenderingCriterionResponse;
            theTenderingCriterionResponse = (((this.tenderingCriterionResponse!= null)&&(!this.tenderingCriterionResponse.isEmpty()))?this.getTenderingCriterionResponse():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderingCriterionResponse", theTenderingCriterionResponse), currentHashCode, theTenderingCriterionResponse, ((this.tenderingCriterionResponse!= null)&&(!this.tenderingCriterionResponse.isEmpty())));
        }
        {
            List<DocumentReferenceType> theAdditionalDocumentReference;
            theAdditionalDocumentReference = (((this.additionalDocumentReference!= null)&&(!this.additionalDocumentReference.isEmpty()))?this.getAdditionalDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalDocumentReference", theAdditionalDocumentReference), currentHashCode, theAdditionalDocumentReference, ((this.additionalDocumentReference!= null)&&(!this.additionalDocumentReference.isEmpty())));
        }
        {
            List<EvidenceType> theEvidence;
            theEvidence = (((this.evidence!= null)&&(!this.evidence.isEmpty()))?this.getEvidence():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "evidence", theEvidence), currentHashCode, theEvidence, ((this.evidence!= null)&&(!this.evidence.isEmpty())));
        }
        {
            List<SignatureType> theSignature;
            theSignature = (((this.signature!= null)&&(!this.signature.isEmpty()))?this.getSignature():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "signature", theSignature), currentHashCode, theSignature, ((this.signature!= null)&&(!this.signature.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
