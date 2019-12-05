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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AcceptedVariantsDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AdditionalConditionsType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AwardingMethodTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentationFeeAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EconomicOperatorRegistryURIType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EstimatedTimingFurtherPublicationType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FundingProgramCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FundingProgramType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LatestSecurityClearanceDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumAdvertisementAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumVariantQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.OtherConditionsIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PaymentFrequencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PriceEvaluationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PriceRevisionFormulaDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RecurringProcurementIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RequiredCurriculaIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.VariantConstraintIndicatorType;
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
 * <p>Classe Java per TenderingTermsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TenderingTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardingMethodTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceEvaluationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumVariantQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VariantConstraintIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AcceptedVariantsDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceRevisionFormulaDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FundingProgramCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FundingProgram" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumAdvertisementAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentFrequencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EconomicOperatorRegistryURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequiredCurriculaIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OtherConditionsIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RecurringProcurementIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedTimingFurtherPublication" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalConditions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestSecurityClearanceDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentationFeeAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PenaltyClause" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredFinancialGuarantee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementLegislationDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FiscalLegislationDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnvironmentalLegislationDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EmploymentLegislationDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractualDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CallForTendersDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TendererQualificationRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowedSubcontractTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderPreparation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractExecutionRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AwardingTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalInformationParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentProviderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderRecipientParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractResponsibleParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderEvaluationParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractAcceptancePeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AppealTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Language" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BudgetAccountLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReplacedNoticeDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LotDistribution" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PostAwardProcess" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EconomicOperatorShortList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderingTermsType", propOrder = {
    "awardingMethodTypeCode",
    "priceEvaluationCode",
    "maximumVariantQuantity",
    "variantConstraintIndicator",
    "acceptedVariantsDescription",
    "priceRevisionFormulaDescription",
    "fundingProgramCode",
    "fundingProgram",
    "maximumAdvertisementAmount",
    "note",
    "paymentFrequencyCode",
    "economicOperatorRegistryURI",
    "requiredCurriculaIndicator",
    "otherConditionsIndicator",
    "recurringProcurementIndicator",
    "estimatedTimingFurtherPublication",
    "additionalConditions",
    "latestSecurityClearanceDate",
    "documentationFeeAmount",
    "penaltyClause",
    "requiredFinancialGuarantee",
    "procurementLegislationDocumentReference",
    "fiscalLegislationDocumentReference",
    "environmentalLegislationDocumentReference",
    "employmentLegislationDocumentReference",
    "contractualDocumentReference",
    "callForTendersDocumentReference",
    "warrantyValidityPeriod",
    "paymentTerms",
    "tendererQualificationRequest",
    "allowedSubcontractTerms",
    "tenderPreparation",
    "contractExecutionRequirement",
    "awardingTerms",
    "additionalInformationParty",
    "documentProviderParty",
    "tenderRecipientParty",
    "contractResponsibleParty",
    "tenderEvaluationParty",
    "tenderValidityPeriod",
    "contractAcceptancePeriod",
    "appealTerms",
    "language",
    "budgetAccountLine",
    "replacedNoticeDocumentReference",
    "lotDistribution",
    "postAwardProcess",
    "economicOperatorShortList"
})
public class TenderingTermsType implements Serializable, Equals2, HashCode2, ToString2
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "AwardingMethodTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AwardingMethodTypeCodeType awardingMethodTypeCode;
    @XmlElement(name = "PriceEvaluationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PriceEvaluationCodeType priceEvaluationCode;
    @XmlElement(name = "MaximumVariantQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumVariantQuantityType maximumVariantQuantity;
    @XmlElement(name = "VariantConstraintIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected VariantConstraintIndicatorType variantConstraintIndicator;
    @XmlElement(name = "AcceptedVariantsDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<AcceptedVariantsDescriptionType> acceptedVariantsDescription;
    @XmlElement(name = "PriceRevisionFormulaDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<PriceRevisionFormulaDescriptionType> priceRevisionFormulaDescription;
    @XmlElement(name = "FundingProgramCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FundingProgramCodeType fundingProgramCode;
    @XmlElement(name = "FundingProgram", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<FundingProgramType> fundingProgram;
    @XmlElement(name = "MaximumAdvertisementAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MaximumAdvertisementAmountType maximumAdvertisementAmount;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<NoteType> note;
    @XmlElement(name = "PaymentFrequencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PaymentFrequencyCodeType paymentFrequencyCode;
    @XmlElement(name = "EconomicOperatorRegistryURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected EconomicOperatorRegistryURIType economicOperatorRegistryURI;
    @XmlElement(name = "RequiredCurriculaIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RequiredCurriculaIndicatorType requiredCurriculaIndicator;
    @XmlElement(name = "OtherConditionsIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected OtherConditionsIndicatorType otherConditionsIndicator;
    @XmlElement(name = "RecurringProcurementIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RecurringProcurementIndicatorType recurringProcurementIndicator;
    @XmlElement(name = "EstimatedTimingFurtherPublication", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<EstimatedTimingFurtherPublicationType> estimatedTimingFurtherPublication;
    @XmlElement(name = "AdditionalConditions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<AdditionalConditionsType> additionalConditions;
    @XmlElement(name = "LatestSecurityClearanceDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LatestSecurityClearanceDateType latestSecurityClearanceDate;
    @XmlElement(name = "DocumentationFeeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DocumentationFeeAmountType documentationFeeAmount;
    @XmlElement(name = "PenaltyClause")
    protected List<ClauseType> penaltyClause;
    @XmlElement(name = "RequiredFinancialGuarantee")
    protected List<FinancialGuaranteeType> requiredFinancialGuarantee;
    @XmlElement(name = "ProcurementLegislationDocumentReference")
    protected DocumentReferenceType procurementLegislationDocumentReference;
    @XmlElement(name = "FiscalLegislationDocumentReference")
    protected DocumentReferenceType fiscalLegislationDocumentReference;
    @XmlElement(name = "EnvironmentalLegislationDocumentReference")
    protected DocumentReferenceType environmentalLegislationDocumentReference;
    @XmlElement(name = "EmploymentLegislationDocumentReference")
    protected DocumentReferenceType employmentLegislationDocumentReference;
    @XmlElement(name = "ContractualDocumentReference")
    protected List<DocumentReferenceType> contractualDocumentReference;
    @XmlElement(name = "CallForTendersDocumentReference")
    protected DocumentReferenceType callForTendersDocumentReference;
    @XmlElement(name = "WarrantyValidityPeriod")
    protected PeriodType warrantyValidityPeriod;
    @XmlElement(name = "PaymentTerms")
    protected List<PaymentTermsType> paymentTerms;
    @XmlElement(name = "TendererQualificationRequest")
    protected List<TendererQualificationRequestType> tendererQualificationRequest;
    @XmlElement(name = "AllowedSubcontractTerms")
    protected List<SubcontractTermsType> allowedSubcontractTerms;
    @XmlElement(name = "TenderPreparation")
    protected List<TenderPreparationType> tenderPreparation;
    @XmlElement(name = "ContractExecutionRequirement")
    protected List<ContractExecutionRequirementType> contractExecutionRequirement;
    @XmlElement(name = "AwardingTerms")
    protected AwardingTermsType awardingTerms;
    @XmlElement(name = "AdditionalInformationParty")
    protected PartyType additionalInformationParty;
    @XmlElement(name = "DocumentProviderParty")
    protected PartyType documentProviderParty;
    @XmlElement(name = "TenderRecipientParty")
    protected PartyType tenderRecipientParty;
    @XmlElement(name = "ContractResponsibleParty")
    protected PartyType contractResponsibleParty;
    @XmlElement(name = "TenderEvaluationParty")
    protected List<PartyType> tenderEvaluationParty;
    @XmlElement(name = "TenderValidityPeriod")
    protected PeriodType tenderValidityPeriod;
    @XmlElement(name = "ContractAcceptancePeriod")
    protected PeriodType contractAcceptancePeriod;
    @XmlElement(name = "AppealTerms")
    protected AppealTermsType appealTerms;
    @XmlElement(name = "Language")
    protected List<LanguageType> language;
    @XmlElement(name = "BudgetAccountLine")
    protected List<BudgetAccountLineType> budgetAccountLine;
    @XmlElement(name = "ReplacedNoticeDocumentReference")
    protected DocumentReferenceType replacedNoticeDocumentReference;
    @XmlElement(name = "LotDistribution")
    protected LotDistributionType lotDistribution;
    @XmlElement(name = "PostAwardProcess")
    protected PostAwardProcessType postAwardProcess;
    @XmlElement(name = "EconomicOperatorShortList")
    protected EconomicOperatorShortListType economicOperatorShortList;

    /**
     * Recupera il valore della proprietà awardingMethodTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link AwardingMethodTypeCodeType }
     *     
     */
    public AwardingMethodTypeCodeType getAwardingMethodTypeCode() {
        return awardingMethodTypeCode;
    }

    /**
     * Imposta il valore della proprietà awardingMethodTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardingMethodTypeCodeType }
     *     
     */
    public void setAwardingMethodTypeCode(AwardingMethodTypeCodeType value) {
        this.awardingMethodTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà priceEvaluationCode.
     * 
     * @return
     *     possible object is
     *     {@link PriceEvaluationCodeType }
     *     
     */
    public PriceEvaluationCodeType getPriceEvaluationCode() {
        return priceEvaluationCode;
    }

    /**
     * Imposta il valore della proprietà priceEvaluationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceEvaluationCodeType }
     *     
     */
    public void setPriceEvaluationCode(PriceEvaluationCodeType value) {
        this.priceEvaluationCode = value;
    }

    /**
     * Recupera il valore della proprietà maximumVariantQuantity.
     * 
     * @return
     *     possible object is
     *     {@link MaximumVariantQuantityType }
     *     
     */
    public MaximumVariantQuantityType getMaximumVariantQuantity() {
        return maximumVariantQuantity;
    }

    /**
     * Imposta il valore della proprietà maximumVariantQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumVariantQuantityType }
     *     
     */
    public void setMaximumVariantQuantity(MaximumVariantQuantityType value) {
        this.maximumVariantQuantity = value;
    }

    /**
     * Recupera il valore della proprietà variantConstraintIndicator.
     * 
     * @return
     *     possible object is
     *     {@link VariantConstraintIndicatorType }
     *     
     */
    public VariantConstraintIndicatorType getVariantConstraintIndicator() {
        return variantConstraintIndicator;
    }

    /**
     * Imposta il valore della proprietà variantConstraintIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link VariantConstraintIndicatorType }
     *     
     */
    public void setVariantConstraintIndicator(VariantConstraintIndicatorType value) {
        this.variantConstraintIndicator = value;
    }

    /**
     * Gets the value of the acceptedVariantsDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptedVariantsDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptedVariantsDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcceptedVariantsDescriptionType }
     * 
     * 
     */
    public List<AcceptedVariantsDescriptionType> getAcceptedVariantsDescription() {
        if (acceptedVariantsDescription == null) {
            acceptedVariantsDescription = new ArrayList<AcceptedVariantsDescriptionType>();
        }
        return this.acceptedVariantsDescription;
    }

    /**
     * Gets the value of the priceRevisionFormulaDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceRevisionFormulaDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceRevisionFormulaDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceRevisionFormulaDescriptionType }
     * 
     * 
     */
    public List<PriceRevisionFormulaDescriptionType> getPriceRevisionFormulaDescription() {
        if (priceRevisionFormulaDescription == null) {
            priceRevisionFormulaDescription = new ArrayList<PriceRevisionFormulaDescriptionType>();
        }
        return this.priceRevisionFormulaDescription;
    }

    /**
     * Recupera il valore della proprietà fundingProgramCode.
     * 
     * @return
     *     possible object is
     *     {@link FundingProgramCodeType }
     *     
     */
    public FundingProgramCodeType getFundingProgramCode() {
        return fundingProgramCode;
    }

    /**
     * Imposta il valore della proprietà fundingProgramCode.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingProgramCodeType }
     *     
     */
    public void setFundingProgramCode(FundingProgramCodeType value) {
        this.fundingProgramCode = value;
    }

    /**
     * Gets the value of the fundingProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundingProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundingProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingProgramType }
     * 
     * 
     */
    public List<FundingProgramType> getFundingProgram() {
        if (fundingProgram == null) {
            fundingProgram = new ArrayList<FundingProgramType>();
        }
        return this.fundingProgram;
    }

    /**
     * Recupera il valore della proprietà maximumAdvertisementAmount.
     * 
     * @return
     *     possible object is
     *     {@link MaximumAdvertisementAmountType }
     *     
     */
    public MaximumAdvertisementAmountType getMaximumAdvertisementAmount() {
        return maximumAdvertisementAmount;
    }

    /**
     * Imposta il valore della proprietà maximumAdvertisementAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumAdvertisementAmountType }
     *     
     */
    public void setMaximumAdvertisementAmount(MaximumAdvertisementAmountType value) {
        this.maximumAdvertisementAmount = value;
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
     * Recupera il valore della proprietà paymentFrequencyCode.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFrequencyCodeType }
     *     
     */
    public PaymentFrequencyCodeType getPaymentFrequencyCode() {
        return paymentFrequencyCode;
    }

    /**
     * Imposta il valore della proprietà paymentFrequencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFrequencyCodeType }
     *     
     */
    public void setPaymentFrequencyCode(PaymentFrequencyCodeType value) {
        this.paymentFrequencyCode = value;
    }

    /**
     * Recupera il valore della proprietà economicOperatorRegistryURI.
     * 
     * @return
     *     possible object is
     *     {@link EconomicOperatorRegistryURIType }
     *     
     */
    public EconomicOperatorRegistryURIType getEconomicOperatorRegistryURI() {
        return economicOperatorRegistryURI;
    }

    /**
     * Imposta il valore della proprietà economicOperatorRegistryURI.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicOperatorRegistryURIType }
     *     
     */
    public void setEconomicOperatorRegistryURI(EconomicOperatorRegistryURIType value) {
        this.economicOperatorRegistryURI = value;
    }

    /**
     * Recupera il valore della proprietà requiredCurriculaIndicator.
     * 
     * @return
     *     possible object is
     *     {@link RequiredCurriculaIndicatorType }
     *     
     */
    public RequiredCurriculaIndicatorType getRequiredCurriculaIndicator() {
        return requiredCurriculaIndicator;
    }

    /**
     * Imposta il valore della proprietà requiredCurriculaIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredCurriculaIndicatorType }
     *     
     */
    public void setRequiredCurriculaIndicator(RequiredCurriculaIndicatorType value) {
        this.requiredCurriculaIndicator = value;
    }

    /**
     * Recupera il valore della proprietà otherConditionsIndicator.
     * 
     * @return
     *     possible object is
     *     {@link OtherConditionsIndicatorType }
     *     
     */
    public OtherConditionsIndicatorType getOtherConditionsIndicator() {
        return otherConditionsIndicator;
    }

    /**
     * Imposta il valore della proprietà otherConditionsIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherConditionsIndicatorType }
     *     
     */
    public void setOtherConditionsIndicator(OtherConditionsIndicatorType value) {
        this.otherConditionsIndicator = value;
    }

    /**
     * Recupera il valore della proprietà recurringProcurementIndicator.
     * 
     * @return
     *     possible object is
     *     {@link RecurringProcurementIndicatorType }
     *     
     */
    public RecurringProcurementIndicatorType getRecurringProcurementIndicator() {
        return recurringProcurementIndicator;
    }

    /**
     * Imposta il valore della proprietà recurringProcurementIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringProcurementIndicatorType }
     *     
     */
    public void setRecurringProcurementIndicator(RecurringProcurementIndicatorType value) {
        this.recurringProcurementIndicator = value;
    }

    /**
     * Gets the value of the estimatedTimingFurtherPublication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedTimingFurtherPublication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedTimingFurtherPublication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedTimingFurtherPublicationType }
     * 
     * 
     */
    public List<EstimatedTimingFurtherPublicationType> getEstimatedTimingFurtherPublication() {
        if (estimatedTimingFurtherPublication == null) {
            estimatedTimingFurtherPublication = new ArrayList<EstimatedTimingFurtherPublicationType>();
        }
        return this.estimatedTimingFurtherPublication;
    }

    /**
     * Gets the value of the additionalConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalConditionsType }
     * 
     * 
     */
    public List<AdditionalConditionsType> getAdditionalConditions() {
        if (additionalConditions == null) {
            additionalConditions = new ArrayList<AdditionalConditionsType>();
        }
        return this.additionalConditions;
    }

    /**
     * Recupera il valore della proprietà latestSecurityClearanceDate.
     * 
     * @return
     *     possible object is
     *     {@link LatestSecurityClearanceDateType }
     *     
     */
    public LatestSecurityClearanceDateType getLatestSecurityClearanceDate() {
        return latestSecurityClearanceDate;
    }

    /**
     * Imposta il valore della proprietà latestSecurityClearanceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestSecurityClearanceDateType }
     *     
     */
    public void setLatestSecurityClearanceDate(LatestSecurityClearanceDateType value) {
        this.latestSecurityClearanceDate = value;
    }

    /**
     * Recupera il valore della proprietà documentationFeeAmount.
     * 
     * @return
     *     possible object is
     *     {@link DocumentationFeeAmountType }
     *     
     */
    public DocumentationFeeAmountType getDocumentationFeeAmount() {
        return documentationFeeAmount;
    }

    /**
     * Imposta il valore della proprietà documentationFeeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentationFeeAmountType }
     *     
     */
    public void setDocumentationFeeAmount(DocumentationFeeAmountType value) {
        this.documentationFeeAmount = value;
    }

    /**
     * Gets the value of the penaltyClause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyClause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyClause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClauseType }
     * 
     * 
     */
    public List<ClauseType> getPenaltyClause() {
        if (penaltyClause == null) {
            penaltyClause = new ArrayList<ClauseType>();
        }
        return this.penaltyClause;
    }

    /**
     * Gets the value of the requiredFinancialGuarantee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredFinancialGuarantee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredFinancialGuarantee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialGuaranteeType }
     * 
     * 
     */
    public List<FinancialGuaranteeType> getRequiredFinancialGuarantee() {
        if (requiredFinancialGuarantee == null) {
            requiredFinancialGuarantee = new ArrayList<FinancialGuaranteeType>();
        }
        return this.requiredFinancialGuarantee;
    }

    /**
     * Recupera il valore della proprietà procurementLegislationDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getProcurementLegislationDocumentReference() {
        return procurementLegislationDocumentReference;
    }

    /**
     * Imposta il valore della proprietà procurementLegislationDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setProcurementLegislationDocumentReference(DocumentReferenceType value) {
        this.procurementLegislationDocumentReference = value;
    }

    /**
     * Recupera il valore della proprietà fiscalLegislationDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getFiscalLegislationDocumentReference() {
        return fiscalLegislationDocumentReference;
    }

    /**
     * Imposta il valore della proprietà fiscalLegislationDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setFiscalLegislationDocumentReference(DocumentReferenceType value) {
        this.fiscalLegislationDocumentReference = value;
    }

    /**
     * Recupera il valore della proprietà environmentalLegislationDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getEnvironmentalLegislationDocumentReference() {
        return environmentalLegislationDocumentReference;
    }

    /**
     * Imposta il valore della proprietà environmentalLegislationDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setEnvironmentalLegislationDocumentReference(DocumentReferenceType value) {
        this.environmentalLegislationDocumentReference = value;
    }

    /**
     * Recupera il valore della proprietà employmentLegislationDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getEmploymentLegislationDocumentReference() {
        return employmentLegislationDocumentReference;
    }

    /**
     * Imposta il valore della proprietà employmentLegislationDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setEmploymentLegislationDocumentReference(DocumentReferenceType value) {
        this.employmentLegislationDocumentReference = value;
    }

    /**
     * Gets the value of the contractualDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractualDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractualDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getContractualDocumentReference() {
        if (contractualDocumentReference == null) {
            contractualDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.contractualDocumentReference;
    }

    /**
     * Recupera il valore della proprietà callForTendersDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getCallForTendersDocumentReference() {
        return callForTendersDocumentReference;
    }

    /**
     * Imposta il valore della proprietà callForTendersDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setCallForTendersDocumentReference(DocumentReferenceType value) {
        this.callForTendersDocumentReference = value;
    }

    /**
     * Recupera il valore della proprietà warrantyValidityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getWarrantyValidityPeriod() {
        return warrantyValidityPeriod;
    }

    /**
     * Imposta il valore della proprietà warrantyValidityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setWarrantyValidityPeriod(PeriodType value) {
        this.warrantyValidityPeriod = value;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTermsType }
     * 
     * 
     */
    public List<PaymentTermsType> getPaymentTerms() {
        if (paymentTerms == null) {
            paymentTerms = new ArrayList<PaymentTermsType>();
        }
        return this.paymentTerms;
    }

    /**
     * Gets the value of the tendererQualificationRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tendererQualificationRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTendererQualificationRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TendererQualificationRequestType }
     * 
     * 
     */
    public List<TendererQualificationRequestType> getTendererQualificationRequest() {
        if (tendererQualificationRequest == null) {
            tendererQualificationRequest = new ArrayList<TendererQualificationRequestType>();
        }
        return this.tendererQualificationRequest;
    }

    /**
     * Gets the value of the allowedSubcontractTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedSubcontractTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedSubcontractTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubcontractTermsType }
     * 
     * 
     */
    public List<SubcontractTermsType> getAllowedSubcontractTerms() {
        if (allowedSubcontractTerms == null) {
            allowedSubcontractTerms = new ArrayList<SubcontractTermsType>();
        }
        return this.allowedSubcontractTerms;
    }

    /**
     * Gets the value of the tenderPreparation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderPreparation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderPreparation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderPreparationType }
     * 
     * 
     */
    public List<TenderPreparationType> getTenderPreparation() {
        if (tenderPreparation == null) {
            tenderPreparation = new ArrayList<TenderPreparationType>();
        }
        return this.tenderPreparation;
    }

    /**
     * Gets the value of the contractExecutionRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractExecutionRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractExecutionRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractExecutionRequirementType }
     * 
     * 
     */
    public List<ContractExecutionRequirementType> getContractExecutionRequirement() {
        if (contractExecutionRequirement == null) {
            contractExecutionRequirement = new ArrayList<ContractExecutionRequirementType>();
        }
        return this.contractExecutionRequirement;
    }

    /**
     * Recupera il valore della proprietà awardingTerms.
     * 
     * @return
     *     possible object is
     *     {@link AwardingTermsType }
     *     
     */
    public AwardingTermsType getAwardingTerms() {
        return awardingTerms;
    }

    /**
     * Imposta il valore della proprietà awardingTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardingTermsType }
     *     
     */
    public void setAwardingTerms(AwardingTermsType value) {
        this.awardingTerms = value;
    }

    /**
     * Recupera il valore della proprietà additionalInformationParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getAdditionalInformationParty() {
        return additionalInformationParty;
    }

    /**
     * Imposta il valore della proprietà additionalInformationParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setAdditionalInformationParty(PartyType value) {
        this.additionalInformationParty = value;
    }

    /**
     * Recupera il valore della proprietà documentProviderParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getDocumentProviderParty() {
        return documentProviderParty;
    }

    /**
     * Imposta il valore della proprietà documentProviderParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setDocumentProviderParty(PartyType value) {
        this.documentProviderParty = value;
    }

    /**
     * Recupera il valore della proprietà tenderRecipientParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getTenderRecipientParty() {
        return tenderRecipientParty;
    }

    /**
     * Imposta il valore della proprietà tenderRecipientParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setTenderRecipientParty(PartyType value) {
        this.tenderRecipientParty = value;
    }

    /**
     * Recupera il valore della proprietà contractResponsibleParty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getContractResponsibleParty() {
        return contractResponsibleParty;
    }

    /**
     * Imposta il valore della proprietà contractResponsibleParty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setContractResponsibleParty(PartyType value) {
        this.contractResponsibleParty = value;
    }

    /**
     * Gets the value of the tenderEvaluationParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderEvaluationParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderEvaluationParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getTenderEvaluationParty() {
        if (tenderEvaluationParty == null) {
            tenderEvaluationParty = new ArrayList<PartyType>();
        }
        return this.tenderEvaluationParty;
    }

    /**
     * Recupera il valore della proprietà tenderValidityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getTenderValidityPeriod() {
        return tenderValidityPeriod;
    }

    /**
     * Imposta il valore della proprietà tenderValidityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setTenderValidityPeriod(PeriodType value) {
        this.tenderValidityPeriod = value;
    }

    /**
     * Recupera il valore della proprietà contractAcceptancePeriod.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getContractAcceptancePeriod() {
        return contractAcceptancePeriod;
    }

    /**
     * Imposta il valore della proprietà contractAcceptancePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setContractAcceptancePeriod(PeriodType value) {
        this.contractAcceptancePeriod = value;
    }

    /**
     * Recupera il valore della proprietà appealTerms.
     * 
     * @return
     *     possible object is
     *     {@link AppealTermsType }
     *     
     */
    public AppealTermsType getAppealTerms() {
        return appealTerms;
    }

    /**
     * Imposta il valore della proprietà appealTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link AppealTermsType }
     *     
     */
    public void setAppealTerms(AppealTermsType value) {
        this.appealTerms = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageType }
     * 
     * 
     */
    public List<LanguageType> getLanguage() {
        if (language == null) {
            language = new ArrayList<LanguageType>();
        }
        return this.language;
    }

    /**
     * Gets the value of the budgetAccountLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the budgetAccountLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudgetAccountLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BudgetAccountLineType }
     * 
     * 
     */
    public List<BudgetAccountLineType> getBudgetAccountLine() {
        if (budgetAccountLine == null) {
            budgetAccountLine = new ArrayList<BudgetAccountLineType>();
        }
        return this.budgetAccountLine;
    }

    /**
     * Recupera il valore della proprietà replacedNoticeDocumentReference.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getReplacedNoticeDocumentReference() {
        return replacedNoticeDocumentReference;
    }

    /**
     * Imposta il valore della proprietà replacedNoticeDocumentReference.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setReplacedNoticeDocumentReference(DocumentReferenceType value) {
        this.replacedNoticeDocumentReference = value;
    }

    /**
     * Recupera il valore della proprietà lotDistribution.
     * 
     * @return
     *     possible object is
     *     {@link LotDistributionType }
     *     
     */
    public LotDistributionType getLotDistribution() {
        return lotDistribution;
    }

    /**
     * Imposta il valore della proprietà lotDistribution.
     * 
     * @param value
     *     allowed object is
     *     {@link LotDistributionType }
     *     
     */
    public void setLotDistribution(LotDistributionType value) {
        this.lotDistribution = value;
    }

    /**
     * Recupera il valore della proprietà postAwardProcess.
     * 
     * @return
     *     possible object is
     *     {@link PostAwardProcessType }
     *     
     */
    public PostAwardProcessType getPostAwardProcess() {
        return postAwardProcess;
    }

    /**
     * Imposta il valore della proprietà postAwardProcess.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAwardProcessType }
     *     
     */
    public void setPostAwardProcess(PostAwardProcessType value) {
        this.postAwardProcess = value;
    }

    /**
     * Recupera il valore della proprietà economicOperatorShortList.
     * 
     * @return
     *     possible object is
     *     {@link EconomicOperatorShortListType }
     *     
     */
    public EconomicOperatorShortListType getEconomicOperatorShortList() {
        return economicOperatorShortList;
    }

    /**
     * Imposta il valore della proprietà economicOperatorShortList.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicOperatorShortListType }
     *     
     */
    public void setEconomicOperatorShortList(EconomicOperatorShortListType value) {
        this.economicOperatorShortList = value;
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
            AwardingMethodTypeCodeType theAwardingMethodTypeCode;
            theAwardingMethodTypeCode = this.getAwardingMethodTypeCode();
            strategy.appendField(locator, this, "awardingMethodTypeCode", buffer, theAwardingMethodTypeCode, (this.awardingMethodTypeCode!= null));
        }
        {
            PriceEvaluationCodeType thePriceEvaluationCode;
            thePriceEvaluationCode = this.getPriceEvaluationCode();
            strategy.appendField(locator, this, "priceEvaluationCode", buffer, thePriceEvaluationCode, (this.priceEvaluationCode!= null));
        }
        {
            MaximumVariantQuantityType theMaximumVariantQuantity;
            theMaximumVariantQuantity = this.getMaximumVariantQuantity();
            strategy.appendField(locator, this, "maximumVariantQuantity", buffer, theMaximumVariantQuantity, (this.maximumVariantQuantity!= null));
        }
        {
            VariantConstraintIndicatorType theVariantConstraintIndicator;
            theVariantConstraintIndicator = this.getVariantConstraintIndicator();
            strategy.appendField(locator, this, "variantConstraintIndicator", buffer, theVariantConstraintIndicator, (this.variantConstraintIndicator!= null));
        }
        {
            List<AcceptedVariantsDescriptionType> theAcceptedVariantsDescription;
            theAcceptedVariantsDescription = (((this.acceptedVariantsDescription!= null)&&(!this.acceptedVariantsDescription.isEmpty()))?this.getAcceptedVariantsDescription():null);
            strategy.appendField(locator, this, "acceptedVariantsDescription", buffer, theAcceptedVariantsDescription, ((this.acceptedVariantsDescription!= null)&&(!this.acceptedVariantsDescription.isEmpty())));
        }
        {
            List<PriceRevisionFormulaDescriptionType> thePriceRevisionFormulaDescription;
            thePriceRevisionFormulaDescription = (((this.priceRevisionFormulaDescription!= null)&&(!this.priceRevisionFormulaDescription.isEmpty()))?this.getPriceRevisionFormulaDescription():null);
            strategy.appendField(locator, this, "priceRevisionFormulaDescription", buffer, thePriceRevisionFormulaDescription, ((this.priceRevisionFormulaDescription!= null)&&(!this.priceRevisionFormulaDescription.isEmpty())));
        }
        {
            FundingProgramCodeType theFundingProgramCode;
            theFundingProgramCode = this.getFundingProgramCode();
            strategy.appendField(locator, this, "fundingProgramCode", buffer, theFundingProgramCode, (this.fundingProgramCode!= null));
        }
        {
            List<FundingProgramType> theFundingProgram;
            theFundingProgram = (((this.fundingProgram!= null)&&(!this.fundingProgram.isEmpty()))?this.getFundingProgram():null);
            strategy.appendField(locator, this, "fundingProgram", buffer, theFundingProgram, ((this.fundingProgram!= null)&&(!this.fundingProgram.isEmpty())));
        }
        {
            MaximumAdvertisementAmountType theMaximumAdvertisementAmount;
            theMaximumAdvertisementAmount = this.getMaximumAdvertisementAmount();
            strategy.appendField(locator, this, "maximumAdvertisementAmount", buffer, theMaximumAdvertisementAmount, (this.maximumAdvertisementAmount!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            strategy.appendField(locator, this, "note", buffer, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            PaymentFrequencyCodeType thePaymentFrequencyCode;
            thePaymentFrequencyCode = this.getPaymentFrequencyCode();
            strategy.appendField(locator, this, "paymentFrequencyCode", buffer, thePaymentFrequencyCode, (this.paymentFrequencyCode!= null));
        }
        {
            EconomicOperatorRegistryURIType theEconomicOperatorRegistryURI;
            theEconomicOperatorRegistryURI = this.getEconomicOperatorRegistryURI();
            strategy.appendField(locator, this, "economicOperatorRegistryURI", buffer, theEconomicOperatorRegistryURI, (this.economicOperatorRegistryURI!= null));
        }
        {
            RequiredCurriculaIndicatorType theRequiredCurriculaIndicator;
            theRequiredCurriculaIndicator = this.getRequiredCurriculaIndicator();
            strategy.appendField(locator, this, "requiredCurriculaIndicator", buffer, theRequiredCurriculaIndicator, (this.requiredCurriculaIndicator!= null));
        }
        {
            OtherConditionsIndicatorType theOtherConditionsIndicator;
            theOtherConditionsIndicator = this.getOtherConditionsIndicator();
            strategy.appendField(locator, this, "otherConditionsIndicator", buffer, theOtherConditionsIndicator, (this.otherConditionsIndicator!= null));
        }
        {
            RecurringProcurementIndicatorType theRecurringProcurementIndicator;
            theRecurringProcurementIndicator = this.getRecurringProcurementIndicator();
            strategy.appendField(locator, this, "recurringProcurementIndicator", buffer, theRecurringProcurementIndicator, (this.recurringProcurementIndicator!= null));
        }
        {
            List<EstimatedTimingFurtherPublicationType> theEstimatedTimingFurtherPublication;
            theEstimatedTimingFurtherPublication = (((this.estimatedTimingFurtherPublication!= null)&&(!this.estimatedTimingFurtherPublication.isEmpty()))?this.getEstimatedTimingFurtherPublication():null);
            strategy.appendField(locator, this, "estimatedTimingFurtherPublication", buffer, theEstimatedTimingFurtherPublication, ((this.estimatedTimingFurtherPublication!= null)&&(!this.estimatedTimingFurtherPublication.isEmpty())));
        }
        {
            List<AdditionalConditionsType> theAdditionalConditions;
            theAdditionalConditions = (((this.additionalConditions!= null)&&(!this.additionalConditions.isEmpty()))?this.getAdditionalConditions():null);
            strategy.appendField(locator, this, "additionalConditions", buffer, theAdditionalConditions, ((this.additionalConditions!= null)&&(!this.additionalConditions.isEmpty())));
        }
        {
            LatestSecurityClearanceDateType theLatestSecurityClearanceDate;
            theLatestSecurityClearanceDate = this.getLatestSecurityClearanceDate();
            strategy.appendField(locator, this, "latestSecurityClearanceDate", buffer, theLatestSecurityClearanceDate, (this.latestSecurityClearanceDate!= null));
        }
        {
            DocumentationFeeAmountType theDocumentationFeeAmount;
            theDocumentationFeeAmount = this.getDocumentationFeeAmount();
            strategy.appendField(locator, this, "documentationFeeAmount", buffer, theDocumentationFeeAmount, (this.documentationFeeAmount!= null));
        }
        {
            List<ClauseType> thePenaltyClause;
            thePenaltyClause = (((this.penaltyClause!= null)&&(!this.penaltyClause.isEmpty()))?this.getPenaltyClause():null);
            strategy.appendField(locator, this, "penaltyClause", buffer, thePenaltyClause, ((this.penaltyClause!= null)&&(!this.penaltyClause.isEmpty())));
        }
        {
            List<FinancialGuaranteeType> theRequiredFinancialGuarantee;
            theRequiredFinancialGuarantee = (((this.requiredFinancialGuarantee!= null)&&(!this.requiredFinancialGuarantee.isEmpty()))?this.getRequiredFinancialGuarantee():null);
            strategy.appendField(locator, this, "requiredFinancialGuarantee", buffer, theRequiredFinancialGuarantee, ((this.requiredFinancialGuarantee!= null)&&(!this.requiredFinancialGuarantee.isEmpty())));
        }
        {
            DocumentReferenceType theProcurementLegislationDocumentReference;
            theProcurementLegislationDocumentReference = this.getProcurementLegislationDocumentReference();
            strategy.appendField(locator, this, "procurementLegislationDocumentReference", buffer, theProcurementLegislationDocumentReference, (this.procurementLegislationDocumentReference!= null));
        }
        {
            DocumentReferenceType theFiscalLegislationDocumentReference;
            theFiscalLegislationDocumentReference = this.getFiscalLegislationDocumentReference();
            strategy.appendField(locator, this, "fiscalLegislationDocumentReference", buffer, theFiscalLegislationDocumentReference, (this.fiscalLegislationDocumentReference!= null));
        }
        {
            DocumentReferenceType theEnvironmentalLegislationDocumentReference;
            theEnvironmentalLegislationDocumentReference = this.getEnvironmentalLegislationDocumentReference();
            strategy.appendField(locator, this, "environmentalLegislationDocumentReference", buffer, theEnvironmentalLegislationDocumentReference, (this.environmentalLegislationDocumentReference!= null));
        }
        {
            DocumentReferenceType theEmploymentLegislationDocumentReference;
            theEmploymentLegislationDocumentReference = this.getEmploymentLegislationDocumentReference();
            strategy.appendField(locator, this, "employmentLegislationDocumentReference", buffer, theEmploymentLegislationDocumentReference, (this.employmentLegislationDocumentReference!= null));
        }
        {
            List<DocumentReferenceType> theContractualDocumentReference;
            theContractualDocumentReference = (((this.contractualDocumentReference!= null)&&(!this.contractualDocumentReference.isEmpty()))?this.getContractualDocumentReference():null);
            strategy.appendField(locator, this, "contractualDocumentReference", buffer, theContractualDocumentReference, ((this.contractualDocumentReference!= null)&&(!this.contractualDocumentReference.isEmpty())));
        }
        {
            DocumentReferenceType theCallForTendersDocumentReference;
            theCallForTendersDocumentReference = this.getCallForTendersDocumentReference();
            strategy.appendField(locator, this, "callForTendersDocumentReference", buffer, theCallForTendersDocumentReference, (this.callForTendersDocumentReference!= null));
        }
        {
            PeriodType theWarrantyValidityPeriod;
            theWarrantyValidityPeriod = this.getWarrantyValidityPeriod();
            strategy.appendField(locator, this, "warrantyValidityPeriod", buffer, theWarrantyValidityPeriod, (this.warrantyValidityPeriod!= null));
        }
        {
            List<PaymentTermsType> thePaymentTerms;
            thePaymentTerms = (((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty()))?this.getPaymentTerms():null);
            strategy.appendField(locator, this, "paymentTerms", buffer, thePaymentTerms, ((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty())));
        }
        {
            List<TendererQualificationRequestType> theTendererQualificationRequest;
            theTendererQualificationRequest = (((this.tendererQualificationRequest!= null)&&(!this.tendererQualificationRequest.isEmpty()))?this.getTendererQualificationRequest():null);
            strategy.appendField(locator, this, "tendererQualificationRequest", buffer, theTendererQualificationRequest, ((this.tendererQualificationRequest!= null)&&(!this.tendererQualificationRequest.isEmpty())));
        }
        {
            List<SubcontractTermsType> theAllowedSubcontractTerms;
            theAllowedSubcontractTerms = (((this.allowedSubcontractTerms!= null)&&(!this.allowedSubcontractTerms.isEmpty()))?this.getAllowedSubcontractTerms():null);
            strategy.appendField(locator, this, "allowedSubcontractTerms", buffer, theAllowedSubcontractTerms, ((this.allowedSubcontractTerms!= null)&&(!this.allowedSubcontractTerms.isEmpty())));
        }
        {
            List<TenderPreparationType> theTenderPreparation;
            theTenderPreparation = (((this.tenderPreparation!= null)&&(!this.tenderPreparation.isEmpty()))?this.getTenderPreparation():null);
            strategy.appendField(locator, this, "tenderPreparation", buffer, theTenderPreparation, ((this.tenderPreparation!= null)&&(!this.tenderPreparation.isEmpty())));
        }
        {
            List<ContractExecutionRequirementType> theContractExecutionRequirement;
            theContractExecutionRequirement = (((this.contractExecutionRequirement!= null)&&(!this.contractExecutionRequirement.isEmpty()))?this.getContractExecutionRequirement():null);
            strategy.appendField(locator, this, "contractExecutionRequirement", buffer, theContractExecutionRequirement, ((this.contractExecutionRequirement!= null)&&(!this.contractExecutionRequirement.isEmpty())));
        }
        {
            AwardingTermsType theAwardingTerms;
            theAwardingTerms = this.getAwardingTerms();
            strategy.appendField(locator, this, "awardingTerms", buffer, theAwardingTerms, (this.awardingTerms!= null));
        }
        {
            PartyType theAdditionalInformationParty;
            theAdditionalInformationParty = this.getAdditionalInformationParty();
            strategy.appendField(locator, this, "additionalInformationParty", buffer, theAdditionalInformationParty, (this.additionalInformationParty!= null));
        }
        {
            PartyType theDocumentProviderParty;
            theDocumentProviderParty = this.getDocumentProviderParty();
            strategy.appendField(locator, this, "documentProviderParty", buffer, theDocumentProviderParty, (this.documentProviderParty!= null));
        }
        {
            PartyType theTenderRecipientParty;
            theTenderRecipientParty = this.getTenderRecipientParty();
            strategy.appendField(locator, this, "tenderRecipientParty", buffer, theTenderRecipientParty, (this.tenderRecipientParty!= null));
        }
        {
            PartyType theContractResponsibleParty;
            theContractResponsibleParty = this.getContractResponsibleParty();
            strategy.appendField(locator, this, "contractResponsibleParty", buffer, theContractResponsibleParty, (this.contractResponsibleParty!= null));
        }
        {
            List<PartyType> theTenderEvaluationParty;
            theTenderEvaluationParty = (((this.tenderEvaluationParty!= null)&&(!this.tenderEvaluationParty.isEmpty()))?this.getTenderEvaluationParty():null);
            strategy.appendField(locator, this, "tenderEvaluationParty", buffer, theTenderEvaluationParty, ((this.tenderEvaluationParty!= null)&&(!this.tenderEvaluationParty.isEmpty())));
        }
        {
            PeriodType theTenderValidityPeriod;
            theTenderValidityPeriod = this.getTenderValidityPeriod();
            strategy.appendField(locator, this, "tenderValidityPeriod", buffer, theTenderValidityPeriod, (this.tenderValidityPeriod!= null));
        }
        {
            PeriodType theContractAcceptancePeriod;
            theContractAcceptancePeriod = this.getContractAcceptancePeriod();
            strategy.appendField(locator, this, "contractAcceptancePeriod", buffer, theContractAcceptancePeriod, (this.contractAcceptancePeriod!= null));
        }
        {
            AppealTermsType theAppealTerms;
            theAppealTerms = this.getAppealTerms();
            strategy.appendField(locator, this, "appealTerms", buffer, theAppealTerms, (this.appealTerms!= null));
        }
        {
            List<LanguageType> theLanguage;
            theLanguage = (((this.language!= null)&&(!this.language.isEmpty()))?this.getLanguage():null);
            strategy.appendField(locator, this, "language", buffer, theLanguage, ((this.language!= null)&&(!this.language.isEmpty())));
        }
        {
            List<BudgetAccountLineType> theBudgetAccountLine;
            theBudgetAccountLine = (((this.budgetAccountLine!= null)&&(!this.budgetAccountLine.isEmpty()))?this.getBudgetAccountLine():null);
            strategy.appendField(locator, this, "budgetAccountLine", buffer, theBudgetAccountLine, ((this.budgetAccountLine!= null)&&(!this.budgetAccountLine.isEmpty())));
        }
        {
            DocumentReferenceType theReplacedNoticeDocumentReference;
            theReplacedNoticeDocumentReference = this.getReplacedNoticeDocumentReference();
            strategy.appendField(locator, this, "replacedNoticeDocumentReference", buffer, theReplacedNoticeDocumentReference, (this.replacedNoticeDocumentReference!= null));
        }
        {
            LotDistributionType theLotDistribution;
            theLotDistribution = this.getLotDistribution();
            strategy.appendField(locator, this, "lotDistribution", buffer, theLotDistribution, (this.lotDistribution!= null));
        }
        {
            PostAwardProcessType thePostAwardProcess;
            thePostAwardProcess = this.getPostAwardProcess();
            strategy.appendField(locator, this, "postAwardProcess", buffer, thePostAwardProcess, (this.postAwardProcess!= null));
        }
        {
            EconomicOperatorShortListType theEconomicOperatorShortList;
            theEconomicOperatorShortList = this.getEconomicOperatorShortList();
            strategy.appendField(locator, this, "economicOperatorShortList", buffer, theEconomicOperatorShortList, (this.economicOperatorShortList!= null));
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
        final TenderingTermsType that = ((TenderingTermsType) object);
        {
            AwardingMethodTypeCodeType lhsAwardingMethodTypeCode;
            lhsAwardingMethodTypeCode = this.getAwardingMethodTypeCode();
            AwardingMethodTypeCodeType rhsAwardingMethodTypeCode;
            rhsAwardingMethodTypeCode = that.getAwardingMethodTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "awardingMethodTypeCode", lhsAwardingMethodTypeCode), LocatorUtils.property(thatLocator, "awardingMethodTypeCode", rhsAwardingMethodTypeCode), lhsAwardingMethodTypeCode, rhsAwardingMethodTypeCode, (this.awardingMethodTypeCode!= null), (that.awardingMethodTypeCode!= null))) {
                return false;
            }
        }
        {
            PriceEvaluationCodeType lhsPriceEvaluationCode;
            lhsPriceEvaluationCode = this.getPriceEvaluationCode();
            PriceEvaluationCodeType rhsPriceEvaluationCode;
            rhsPriceEvaluationCode = that.getPriceEvaluationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceEvaluationCode", lhsPriceEvaluationCode), LocatorUtils.property(thatLocator, "priceEvaluationCode", rhsPriceEvaluationCode), lhsPriceEvaluationCode, rhsPriceEvaluationCode, (this.priceEvaluationCode!= null), (that.priceEvaluationCode!= null))) {
                return false;
            }
        }
        {
            MaximumVariantQuantityType lhsMaximumVariantQuantity;
            lhsMaximumVariantQuantity = this.getMaximumVariantQuantity();
            MaximumVariantQuantityType rhsMaximumVariantQuantity;
            rhsMaximumVariantQuantity = that.getMaximumVariantQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumVariantQuantity", lhsMaximumVariantQuantity), LocatorUtils.property(thatLocator, "maximumVariantQuantity", rhsMaximumVariantQuantity), lhsMaximumVariantQuantity, rhsMaximumVariantQuantity, (this.maximumVariantQuantity!= null), (that.maximumVariantQuantity!= null))) {
                return false;
            }
        }
        {
            VariantConstraintIndicatorType lhsVariantConstraintIndicator;
            lhsVariantConstraintIndicator = this.getVariantConstraintIndicator();
            VariantConstraintIndicatorType rhsVariantConstraintIndicator;
            rhsVariantConstraintIndicator = that.getVariantConstraintIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "variantConstraintIndicator", lhsVariantConstraintIndicator), LocatorUtils.property(thatLocator, "variantConstraintIndicator", rhsVariantConstraintIndicator), lhsVariantConstraintIndicator, rhsVariantConstraintIndicator, (this.variantConstraintIndicator!= null), (that.variantConstraintIndicator!= null))) {
                return false;
            }
        }
        {
            List<AcceptedVariantsDescriptionType> lhsAcceptedVariantsDescription;
            lhsAcceptedVariantsDescription = (((this.acceptedVariantsDescription!= null)&&(!this.acceptedVariantsDescription.isEmpty()))?this.getAcceptedVariantsDescription():null);
            List<AcceptedVariantsDescriptionType> rhsAcceptedVariantsDescription;
            rhsAcceptedVariantsDescription = (((that.acceptedVariantsDescription!= null)&&(!that.acceptedVariantsDescription.isEmpty()))?that.getAcceptedVariantsDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "acceptedVariantsDescription", lhsAcceptedVariantsDescription), LocatorUtils.property(thatLocator, "acceptedVariantsDescription", rhsAcceptedVariantsDescription), lhsAcceptedVariantsDescription, rhsAcceptedVariantsDescription, ((this.acceptedVariantsDescription!= null)&&(!this.acceptedVariantsDescription.isEmpty())), ((that.acceptedVariantsDescription!= null)&&(!that.acceptedVariantsDescription.isEmpty())))) {
                return false;
            }
        }
        {
            List<PriceRevisionFormulaDescriptionType> lhsPriceRevisionFormulaDescription;
            lhsPriceRevisionFormulaDescription = (((this.priceRevisionFormulaDescription!= null)&&(!this.priceRevisionFormulaDescription.isEmpty()))?this.getPriceRevisionFormulaDescription():null);
            List<PriceRevisionFormulaDescriptionType> rhsPriceRevisionFormulaDescription;
            rhsPriceRevisionFormulaDescription = (((that.priceRevisionFormulaDescription!= null)&&(!that.priceRevisionFormulaDescription.isEmpty()))?that.getPriceRevisionFormulaDescription():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceRevisionFormulaDescription", lhsPriceRevisionFormulaDescription), LocatorUtils.property(thatLocator, "priceRevisionFormulaDescription", rhsPriceRevisionFormulaDescription), lhsPriceRevisionFormulaDescription, rhsPriceRevisionFormulaDescription, ((this.priceRevisionFormulaDescription!= null)&&(!this.priceRevisionFormulaDescription.isEmpty())), ((that.priceRevisionFormulaDescription!= null)&&(!that.priceRevisionFormulaDescription.isEmpty())))) {
                return false;
            }
        }
        {
            FundingProgramCodeType lhsFundingProgramCode;
            lhsFundingProgramCode = this.getFundingProgramCode();
            FundingProgramCodeType rhsFundingProgramCode;
            rhsFundingProgramCode = that.getFundingProgramCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fundingProgramCode", lhsFundingProgramCode), LocatorUtils.property(thatLocator, "fundingProgramCode", rhsFundingProgramCode), lhsFundingProgramCode, rhsFundingProgramCode, (this.fundingProgramCode!= null), (that.fundingProgramCode!= null))) {
                return false;
            }
        }
        {
            List<FundingProgramType> lhsFundingProgram;
            lhsFundingProgram = (((this.fundingProgram!= null)&&(!this.fundingProgram.isEmpty()))?this.getFundingProgram():null);
            List<FundingProgramType> rhsFundingProgram;
            rhsFundingProgram = (((that.fundingProgram!= null)&&(!that.fundingProgram.isEmpty()))?that.getFundingProgram():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fundingProgram", lhsFundingProgram), LocatorUtils.property(thatLocator, "fundingProgram", rhsFundingProgram), lhsFundingProgram, rhsFundingProgram, ((this.fundingProgram!= null)&&(!this.fundingProgram.isEmpty())), ((that.fundingProgram!= null)&&(!that.fundingProgram.isEmpty())))) {
                return false;
            }
        }
        {
            MaximumAdvertisementAmountType lhsMaximumAdvertisementAmount;
            lhsMaximumAdvertisementAmount = this.getMaximumAdvertisementAmount();
            MaximumAdvertisementAmountType rhsMaximumAdvertisementAmount;
            rhsMaximumAdvertisementAmount = that.getMaximumAdvertisementAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximumAdvertisementAmount", lhsMaximumAdvertisementAmount), LocatorUtils.property(thatLocator, "maximumAdvertisementAmount", rhsMaximumAdvertisementAmount), lhsMaximumAdvertisementAmount, rhsMaximumAdvertisementAmount, (this.maximumAdvertisementAmount!= null), (that.maximumAdvertisementAmount!= null))) {
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
            PaymentFrequencyCodeType lhsPaymentFrequencyCode;
            lhsPaymentFrequencyCode = this.getPaymentFrequencyCode();
            PaymentFrequencyCodeType rhsPaymentFrequencyCode;
            rhsPaymentFrequencyCode = that.getPaymentFrequencyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentFrequencyCode", lhsPaymentFrequencyCode), LocatorUtils.property(thatLocator, "paymentFrequencyCode", rhsPaymentFrequencyCode), lhsPaymentFrequencyCode, rhsPaymentFrequencyCode, (this.paymentFrequencyCode!= null), (that.paymentFrequencyCode!= null))) {
                return false;
            }
        }
        {
            EconomicOperatorRegistryURIType lhsEconomicOperatorRegistryURI;
            lhsEconomicOperatorRegistryURI = this.getEconomicOperatorRegistryURI();
            EconomicOperatorRegistryURIType rhsEconomicOperatorRegistryURI;
            rhsEconomicOperatorRegistryURI = that.getEconomicOperatorRegistryURI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "economicOperatorRegistryURI", lhsEconomicOperatorRegistryURI), LocatorUtils.property(thatLocator, "economicOperatorRegistryURI", rhsEconomicOperatorRegistryURI), lhsEconomicOperatorRegistryURI, rhsEconomicOperatorRegistryURI, (this.economicOperatorRegistryURI!= null), (that.economicOperatorRegistryURI!= null))) {
                return false;
            }
        }
        {
            RequiredCurriculaIndicatorType lhsRequiredCurriculaIndicator;
            lhsRequiredCurriculaIndicator = this.getRequiredCurriculaIndicator();
            RequiredCurriculaIndicatorType rhsRequiredCurriculaIndicator;
            rhsRequiredCurriculaIndicator = that.getRequiredCurriculaIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requiredCurriculaIndicator", lhsRequiredCurriculaIndicator), LocatorUtils.property(thatLocator, "requiredCurriculaIndicator", rhsRequiredCurriculaIndicator), lhsRequiredCurriculaIndicator, rhsRequiredCurriculaIndicator, (this.requiredCurriculaIndicator!= null), (that.requiredCurriculaIndicator!= null))) {
                return false;
            }
        }
        {
            OtherConditionsIndicatorType lhsOtherConditionsIndicator;
            lhsOtherConditionsIndicator = this.getOtherConditionsIndicator();
            OtherConditionsIndicatorType rhsOtherConditionsIndicator;
            rhsOtherConditionsIndicator = that.getOtherConditionsIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherConditionsIndicator", lhsOtherConditionsIndicator), LocatorUtils.property(thatLocator, "otherConditionsIndicator", rhsOtherConditionsIndicator), lhsOtherConditionsIndicator, rhsOtherConditionsIndicator, (this.otherConditionsIndicator!= null), (that.otherConditionsIndicator!= null))) {
                return false;
            }
        }
        {
            RecurringProcurementIndicatorType lhsRecurringProcurementIndicator;
            lhsRecurringProcurementIndicator = this.getRecurringProcurementIndicator();
            RecurringProcurementIndicatorType rhsRecurringProcurementIndicator;
            rhsRecurringProcurementIndicator = that.getRecurringProcurementIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recurringProcurementIndicator", lhsRecurringProcurementIndicator), LocatorUtils.property(thatLocator, "recurringProcurementIndicator", rhsRecurringProcurementIndicator), lhsRecurringProcurementIndicator, rhsRecurringProcurementIndicator, (this.recurringProcurementIndicator!= null), (that.recurringProcurementIndicator!= null))) {
                return false;
            }
        }
        {
            List<EstimatedTimingFurtherPublicationType> lhsEstimatedTimingFurtherPublication;
            lhsEstimatedTimingFurtherPublication = (((this.estimatedTimingFurtherPublication!= null)&&(!this.estimatedTimingFurtherPublication.isEmpty()))?this.getEstimatedTimingFurtherPublication():null);
            List<EstimatedTimingFurtherPublicationType> rhsEstimatedTimingFurtherPublication;
            rhsEstimatedTimingFurtherPublication = (((that.estimatedTimingFurtherPublication!= null)&&(!that.estimatedTimingFurtherPublication.isEmpty()))?that.getEstimatedTimingFurtherPublication():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedTimingFurtherPublication", lhsEstimatedTimingFurtherPublication), LocatorUtils.property(thatLocator, "estimatedTimingFurtherPublication", rhsEstimatedTimingFurtherPublication), lhsEstimatedTimingFurtherPublication, rhsEstimatedTimingFurtherPublication, ((this.estimatedTimingFurtherPublication!= null)&&(!this.estimatedTimingFurtherPublication.isEmpty())), ((that.estimatedTimingFurtherPublication!= null)&&(!that.estimatedTimingFurtherPublication.isEmpty())))) {
                return false;
            }
        }
        {
            List<AdditionalConditionsType> lhsAdditionalConditions;
            lhsAdditionalConditions = (((this.additionalConditions!= null)&&(!this.additionalConditions.isEmpty()))?this.getAdditionalConditions():null);
            List<AdditionalConditionsType> rhsAdditionalConditions;
            rhsAdditionalConditions = (((that.additionalConditions!= null)&&(!that.additionalConditions.isEmpty()))?that.getAdditionalConditions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalConditions", lhsAdditionalConditions), LocatorUtils.property(thatLocator, "additionalConditions", rhsAdditionalConditions), lhsAdditionalConditions, rhsAdditionalConditions, ((this.additionalConditions!= null)&&(!this.additionalConditions.isEmpty())), ((that.additionalConditions!= null)&&(!that.additionalConditions.isEmpty())))) {
                return false;
            }
        }
        {
            LatestSecurityClearanceDateType lhsLatestSecurityClearanceDate;
            lhsLatestSecurityClearanceDate = this.getLatestSecurityClearanceDate();
            LatestSecurityClearanceDateType rhsLatestSecurityClearanceDate;
            rhsLatestSecurityClearanceDate = that.getLatestSecurityClearanceDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestSecurityClearanceDate", lhsLatestSecurityClearanceDate), LocatorUtils.property(thatLocator, "latestSecurityClearanceDate", rhsLatestSecurityClearanceDate), lhsLatestSecurityClearanceDate, rhsLatestSecurityClearanceDate, (this.latestSecurityClearanceDate!= null), (that.latestSecurityClearanceDate!= null))) {
                return false;
            }
        }
        {
            DocumentationFeeAmountType lhsDocumentationFeeAmount;
            lhsDocumentationFeeAmount = this.getDocumentationFeeAmount();
            DocumentationFeeAmountType rhsDocumentationFeeAmount;
            rhsDocumentationFeeAmount = that.getDocumentationFeeAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentationFeeAmount", lhsDocumentationFeeAmount), LocatorUtils.property(thatLocator, "documentationFeeAmount", rhsDocumentationFeeAmount), lhsDocumentationFeeAmount, rhsDocumentationFeeAmount, (this.documentationFeeAmount!= null), (that.documentationFeeAmount!= null))) {
                return false;
            }
        }
        {
            List<ClauseType> lhsPenaltyClause;
            lhsPenaltyClause = (((this.penaltyClause!= null)&&(!this.penaltyClause.isEmpty()))?this.getPenaltyClause():null);
            List<ClauseType> rhsPenaltyClause;
            rhsPenaltyClause = (((that.penaltyClause!= null)&&(!that.penaltyClause.isEmpty()))?that.getPenaltyClause():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "penaltyClause", lhsPenaltyClause), LocatorUtils.property(thatLocator, "penaltyClause", rhsPenaltyClause), lhsPenaltyClause, rhsPenaltyClause, ((this.penaltyClause!= null)&&(!this.penaltyClause.isEmpty())), ((that.penaltyClause!= null)&&(!that.penaltyClause.isEmpty())))) {
                return false;
            }
        }
        {
            List<FinancialGuaranteeType> lhsRequiredFinancialGuarantee;
            lhsRequiredFinancialGuarantee = (((this.requiredFinancialGuarantee!= null)&&(!this.requiredFinancialGuarantee.isEmpty()))?this.getRequiredFinancialGuarantee():null);
            List<FinancialGuaranteeType> rhsRequiredFinancialGuarantee;
            rhsRequiredFinancialGuarantee = (((that.requiredFinancialGuarantee!= null)&&(!that.requiredFinancialGuarantee.isEmpty()))?that.getRequiredFinancialGuarantee():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requiredFinancialGuarantee", lhsRequiredFinancialGuarantee), LocatorUtils.property(thatLocator, "requiredFinancialGuarantee", rhsRequiredFinancialGuarantee), lhsRequiredFinancialGuarantee, rhsRequiredFinancialGuarantee, ((this.requiredFinancialGuarantee!= null)&&(!this.requiredFinancialGuarantee.isEmpty())), ((that.requiredFinancialGuarantee!= null)&&(!that.requiredFinancialGuarantee.isEmpty())))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsProcurementLegislationDocumentReference;
            lhsProcurementLegislationDocumentReference = this.getProcurementLegislationDocumentReference();
            DocumentReferenceType rhsProcurementLegislationDocumentReference;
            rhsProcurementLegislationDocumentReference = that.getProcurementLegislationDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "procurementLegislationDocumentReference", lhsProcurementLegislationDocumentReference), LocatorUtils.property(thatLocator, "procurementLegislationDocumentReference", rhsProcurementLegislationDocumentReference), lhsProcurementLegislationDocumentReference, rhsProcurementLegislationDocumentReference, (this.procurementLegislationDocumentReference!= null), (that.procurementLegislationDocumentReference!= null))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsFiscalLegislationDocumentReference;
            lhsFiscalLegislationDocumentReference = this.getFiscalLegislationDocumentReference();
            DocumentReferenceType rhsFiscalLegislationDocumentReference;
            rhsFiscalLegislationDocumentReference = that.getFiscalLegislationDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fiscalLegislationDocumentReference", lhsFiscalLegislationDocumentReference), LocatorUtils.property(thatLocator, "fiscalLegislationDocumentReference", rhsFiscalLegislationDocumentReference), lhsFiscalLegislationDocumentReference, rhsFiscalLegislationDocumentReference, (this.fiscalLegislationDocumentReference!= null), (that.fiscalLegislationDocumentReference!= null))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsEnvironmentalLegislationDocumentReference;
            lhsEnvironmentalLegislationDocumentReference = this.getEnvironmentalLegislationDocumentReference();
            DocumentReferenceType rhsEnvironmentalLegislationDocumentReference;
            rhsEnvironmentalLegislationDocumentReference = that.getEnvironmentalLegislationDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "environmentalLegislationDocumentReference", lhsEnvironmentalLegislationDocumentReference), LocatorUtils.property(thatLocator, "environmentalLegislationDocumentReference", rhsEnvironmentalLegislationDocumentReference), lhsEnvironmentalLegislationDocumentReference, rhsEnvironmentalLegislationDocumentReference, (this.environmentalLegislationDocumentReference!= null), (that.environmentalLegislationDocumentReference!= null))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsEmploymentLegislationDocumentReference;
            lhsEmploymentLegislationDocumentReference = this.getEmploymentLegislationDocumentReference();
            DocumentReferenceType rhsEmploymentLegislationDocumentReference;
            rhsEmploymentLegislationDocumentReference = that.getEmploymentLegislationDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "employmentLegislationDocumentReference", lhsEmploymentLegislationDocumentReference), LocatorUtils.property(thatLocator, "employmentLegislationDocumentReference", rhsEmploymentLegislationDocumentReference), lhsEmploymentLegislationDocumentReference, rhsEmploymentLegislationDocumentReference, (this.employmentLegislationDocumentReference!= null), (that.employmentLegislationDocumentReference!= null))) {
                return false;
            }
        }
        {
            List<DocumentReferenceType> lhsContractualDocumentReference;
            lhsContractualDocumentReference = (((this.contractualDocumentReference!= null)&&(!this.contractualDocumentReference.isEmpty()))?this.getContractualDocumentReference():null);
            List<DocumentReferenceType> rhsContractualDocumentReference;
            rhsContractualDocumentReference = (((that.contractualDocumentReference!= null)&&(!that.contractualDocumentReference.isEmpty()))?that.getContractualDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractualDocumentReference", lhsContractualDocumentReference), LocatorUtils.property(thatLocator, "contractualDocumentReference", rhsContractualDocumentReference), lhsContractualDocumentReference, rhsContractualDocumentReference, ((this.contractualDocumentReference!= null)&&(!this.contractualDocumentReference.isEmpty())), ((that.contractualDocumentReference!= null)&&(!that.contractualDocumentReference.isEmpty())))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsCallForTendersDocumentReference;
            lhsCallForTendersDocumentReference = this.getCallForTendersDocumentReference();
            DocumentReferenceType rhsCallForTendersDocumentReference;
            rhsCallForTendersDocumentReference = that.getCallForTendersDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "callForTendersDocumentReference", lhsCallForTendersDocumentReference), LocatorUtils.property(thatLocator, "callForTendersDocumentReference", rhsCallForTendersDocumentReference), lhsCallForTendersDocumentReference, rhsCallForTendersDocumentReference, (this.callForTendersDocumentReference!= null), (that.callForTendersDocumentReference!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsWarrantyValidityPeriod;
            lhsWarrantyValidityPeriod = this.getWarrantyValidityPeriod();
            PeriodType rhsWarrantyValidityPeriod;
            rhsWarrantyValidityPeriod = that.getWarrantyValidityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "warrantyValidityPeriod", lhsWarrantyValidityPeriod), LocatorUtils.property(thatLocator, "warrantyValidityPeriod", rhsWarrantyValidityPeriod), lhsWarrantyValidityPeriod, rhsWarrantyValidityPeriod, (this.warrantyValidityPeriod!= null), (that.warrantyValidityPeriod!= null))) {
                return false;
            }
        }
        {
            List<PaymentTermsType> lhsPaymentTerms;
            lhsPaymentTerms = (((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty()))?this.getPaymentTerms():null);
            List<PaymentTermsType> rhsPaymentTerms;
            rhsPaymentTerms = (((that.paymentTerms!= null)&&(!that.paymentTerms.isEmpty()))?that.getPaymentTerms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentTerms", lhsPaymentTerms), LocatorUtils.property(thatLocator, "paymentTerms", rhsPaymentTerms), lhsPaymentTerms, rhsPaymentTerms, ((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty())), ((that.paymentTerms!= null)&&(!that.paymentTerms.isEmpty())))) {
                return false;
            }
        }
        {
            List<TendererQualificationRequestType> lhsTendererQualificationRequest;
            lhsTendererQualificationRequest = (((this.tendererQualificationRequest!= null)&&(!this.tendererQualificationRequest.isEmpty()))?this.getTendererQualificationRequest():null);
            List<TendererQualificationRequestType> rhsTendererQualificationRequest;
            rhsTendererQualificationRequest = (((that.tendererQualificationRequest!= null)&&(!that.tendererQualificationRequest.isEmpty()))?that.getTendererQualificationRequest():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tendererQualificationRequest", lhsTendererQualificationRequest), LocatorUtils.property(thatLocator, "tendererQualificationRequest", rhsTendererQualificationRequest), lhsTendererQualificationRequest, rhsTendererQualificationRequest, ((this.tendererQualificationRequest!= null)&&(!this.tendererQualificationRequest.isEmpty())), ((that.tendererQualificationRequest!= null)&&(!that.tendererQualificationRequest.isEmpty())))) {
                return false;
            }
        }
        {
            List<SubcontractTermsType> lhsAllowedSubcontractTerms;
            lhsAllowedSubcontractTerms = (((this.allowedSubcontractTerms!= null)&&(!this.allowedSubcontractTerms.isEmpty()))?this.getAllowedSubcontractTerms():null);
            List<SubcontractTermsType> rhsAllowedSubcontractTerms;
            rhsAllowedSubcontractTerms = (((that.allowedSubcontractTerms!= null)&&(!that.allowedSubcontractTerms.isEmpty()))?that.getAllowedSubcontractTerms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowedSubcontractTerms", lhsAllowedSubcontractTerms), LocatorUtils.property(thatLocator, "allowedSubcontractTerms", rhsAllowedSubcontractTerms), lhsAllowedSubcontractTerms, rhsAllowedSubcontractTerms, ((this.allowedSubcontractTerms!= null)&&(!this.allowedSubcontractTerms.isEmpty())), ((that.allowedSubcontractTerms!= null)&&(!that.allowedSubcontractTerms.isEmpty())))) {
                return false;
            }
        }
        {
            List<TenderPreparationType> lhsTenderPreparation;
            lhsTenderPreparation = (((this.tenderPreparation!= null)&&(!this.tenderPreparation.isEmpty()))?this.getTenderPreparation():null);
            List<TenderPreparationType> rhsTenderPreparation;
            rhsTenderPreparation = (((that.tenderPreparation!= null)&&(!that.tenderPreparation.isEmpty()))?that.getTenderPreparation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderPreparation", lhsTenderPreparation), LocatorUtils.property(thatLocator, "tenderPreparation", rhsTenderPreparation), lhsTenderPreparation, rhsTenderPreparation, ((this.tenderPreparation!= null)&&(!this.tenderPreparation.isEmpty())), ((that.tenderPreparation!= null)&&(!that.tenderPreparation.isEmpty())))) {
                return false;
            }
        }
        {
            List<ContractExecutionRequirementType> lhsContractExecutionRequirement;
            lhsContractExecutionRequirement = (((this.contractExecutionRequirement!= null)&&(!this.contractExecutionRequirement.isEmpty()))?this.getContractExecutionRequirement():null);
            List<ContractExecutionRequirementType> rhsContractExecutionRequirement;
            rhsContractExecutionRequirement = (((that.contractExecutionRequirement!= null)&&(!that.contractExecutionRequirement.isEmpty()))?that.getContractExecutionRequirement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractExecutionRequirement", lhsContractExecutionRequirement), LocatorUtils.property(thatLocator, "contractExecutionRequirement", rhsContractExecutionRequirement), lhsContractExecutionRequirement, rhsContractExecutionRequirement, ((this.contractExecutionRequirement!= null)&&(!this.contractExecutionRequirement.isEmpty())), ((that.contractExecutionRequirement!= null)&&(!that.contractExecutionRequirement.isEmpty())))) {
                return false;
            }
        }
        {
            AwardingTermsType lhsAwardingTerms;
            lhsAwardingTerms = this.getAwardingTerms();
            AwardingTermsType rhsAwardingTerms;
            rhsAwardingTerms = that.getAwardingTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "awardingTerms", lhsAwardingTerms), LocatorUtils.property(thatLocator, "awardingTerms", rhsAwardingTerms), lhsAwardingTerms, rhsAwardingTerms, (this.awardingTerms!= null), (that.awardingTerms!= null))) {
                return false;
            }
        }
        {
            PartyType lhsAdditionalInformationParty;
            lhsAdditionalInformationParty = this.getAdditionalInformationParty();
            PartyType rhsAdditionalInformationParty;
            rhsAdditionalInformationParty = that.getAdditionalInformationParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalInformationParty", lhsAdditionalInformationParty), LocatorUtils.property(thatLocator, "additionalInformationParty", rhsAdditionalInformationParty), lhsAdditionalInformationParty, rhsAdditionalInformationParty, (this.additionalInformationParty!= null), (that.additionalInformationParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsDocumentProviderParty;
            lhsDocumentProviderParty = this.getDocumentProviderParty();
            PartyType rhsDocumentProviderParty;
            rhsDocumentProviderParty = that.getDocumentProviderParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentProviderParty", lhsDocumentProviderParty), LocatorUtils.property(thatLocator, "documentProviderParty", rhsDocumentProviderParty), lhsDocumentProviderParty, rhsDocumentProviderParty, (this.documentProviderParty!= null), (that.documentProviderParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsTenderRecipientParty;
            lhsTenderRecipientParty = this.getTenderRecipientParty();
            PartyType rhsTenderRecipientParty;
            rhsTenderRecipientParty = that.getTenderRecipientParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderRecipientParty", lhsTenderRecipientParty), LocatorUtils.property(thatLocator, "tenderRecipientParty", rhsTenderRecipientParty), lhsTenderRecipientParty, rhsTenderRecipientParty, (this.tenderRecipientParty!= null), (that.tenderRecipientParty!= null))) {
                return false;
            }
        }
        {
            PartyType lhsContractResponsibleParty;
            lhsContractResponsibleParty = this.getContractResponsibleParty();
            PartyType rhsContractResponsibleParty;
            rhsContractResponsibleParty = that.getContractResponsibleParty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractResponsibleParty", lhsContractResponsibleParty), LocatorUtils.property(thatLocator, "contractResponsibleParty", rhsContractResponsibleParty), lhsContractResponsibleParty, rhsContractResponsibleParty, (this.contractResponsibleParty!= null), (that.contractResponsibleParty!= null))) {
                return false;
            }
        }
        {
            List<PartyType> lhsTenderEvaluationParty;
            lhsTenderEvaluationParty = (((this.tenderEvaluationParty!= null)&&(!this.tenderEvaluationParty.isEmpty()))?this.getTenderEvaluationParty():null);
            List<PartyType> rhsTenderEvaluationParty;
            rhsTenderEvaluationParty = (((that.tenderEvaluationParty!= null)&&(!that.tenderEvaluationParty.isEmpty()))?that.getTenderEvaluationParty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderEvaluationParty", lhsTenderEvaluationParty), LocatorUtils.property(thatLocator, "tenderEvaluationParty", rhsTenderEvaluationParty), lhsTenderEvaluationParty, rhsTenderEvaluationParty, ((this.tenderEvaluationParty!= null)&&(!this.tenderEvaluationParty.isEmpty())), ((that.tenderEvaluationParty!= null)&&(!that.tenderEvaluationParty.isEmpty())))) {
                return false;
            }
        }
        {
            PeriodType lhsTenderValidityPeriod;
            lhsTenderValidityPeriod = this.getTenderValidityPeriod();
            PeriodType rhsTenderValidityPeriod;
            rhsTenderValidityPeriod = that.getTenderValidityPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenderValidityPeriod", lhsTenderValidityPeriod), LocatorUtils.property(thatLocator, "tenderValidityPeriod", rhsTenderValidityPeriod), lhsTenderValidityPeriod, rhsTenderValidityPeriod, (this.tenderValidityPeriod!= null), (that.tenderValidityPeriod!= null))) {
                return false;
            }
        }
        {
            PeriodType lhsContractAcceptancePeriod;
            lhsContractAcceptancePeriod = this.getContractAcceptancePeriod();
            PeriodType rhsContractAcceptancePeriod;
            rhsContractAcceptancePeriod = that.getContractAcceptancePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractAcceptancePeriod", lhsContractAcceptancePeriod), LocatorUtils.property(thatLocator, "contractAcceptancePeriod", rhsContractAcceptancePeriod), lhsContractAcceptancePeriod, rhsContractAcceptancePeriod, (this.contractAcceptancePeriod!= null), (that.contractAcceptancePeriod!= null))) {
                return false;
            }
        }
        {
            AppealTermsType lhsAppealTerms;
            lhsAppealTerms = this.getAppealTerms();
            AppealTermsType rhsAppealTerms;
            rhsAppealTerms = that.getAppealTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "appealTerms", lhsAppealTerms), LocatorUtils.property(thatLocator, "appealTerms", rhsAppealTerms), lhsAppealTerms, rhsAppealTerms, (this.appealTerms!= null), (that.appealTerms!= null))) {
                return false;
            }
        }
        {
            List<LanguageType> lhsLanguage;
            lhsLanguage = (((this.language!= null)&&(!this.language.isEmpty()))?this.getLanguage():null);
            List<LanguageType> rhsLanguage;
            rhsLanguage = (((that.language!= null)&&(!that.language.isEmpty()))?that.getLanguage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "language", lhsLanguage), LocatorUtils.property(thatLocator, "language", rhsLanguage), lhsLanguage, rhsLanguage, ((this.language!= null)&&(!this.language.isEmpty())), ((that.language!= null)&&(!that.language.isEmpty())))) {
                return false;
            }
        }
        {
            List<BudgetAccountLineType> lhsBudgetAccountLine;
            lhsBudgetAccountLine = (((this.budgetAccountLine!= null)&&(!this.budgetAccountLine.isEmpty()))?this.getBudgetAccountLine():null);
            List<BudgetAccountLineType> rhsBudgetAccountLine;
            rhsBudgetAccountLine = (((that.budgetAccountLine!= null)&&(!that.budgetAccountLine.isEmpty()))?that.getBudgetAccountLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "budgetAccountLine", lhsBudgetAccountLine), LocatorUtils.property(thatLocator, "budgetAccountLine", rhsBudgetAccountLine), lhsBudgetAccountLine, rhsBudgetAccountLine, ((this.budgetAccountLine!= null)&&(!this.budgetAccountLine.isEmpty())), ((that.budgetAccountLine!= null)&&(!that.budgetAccountLine.isEmpty())))) {
                return false;
            }
        }
        {
            DocumentReferenceType lhsReplacedNoticeDocumentReference;
            lhsReplacedNoticeDocumentReference = this.getReplacedNoticeDocumentReference();
            DocumentReferenceType rhsReplacedNoticeDocumentReference;
            rhsReplacedNoticeDocumentReference = that.getReplacedNoticeDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "replacedNoticeDocumentReference", lhsReplacedNoticeDocumentReference), LocatorUtils.property(thatLocator, "replacedNoticeDocumentReference", rhsReplacedNoticeDocumentReference), lhsReplacedNoticeDocumentReference, rhsReplacedNoticeDocumentReference, (this.replacedNoticeDocumentReference!= null), (that.replacedNoticeDocumentReference!= null))) {
                return false;
            }
        }
        {
            LotDistributionType lhsLotDistribution;
            lhsLotDistribution = this.getLotDistribution();
            LotDistributionType rhsLotDistribution;
            rhsLotDistribution = that.getLotDistribution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotDistribution", lhsLotDistribution), LocatorUtils.property(thatLocator, "lotDistribution", rhsLotDistribution), lhsLotDistribution, rhsLotDistribution, (this.lotDistribution!= null), (that.lotDistribution!= null))) {
                return false;
            }
        }
        {
            PostAwardProcessType lhsPostAwardProcess;
            lhsPostAwardProcess = this.getPostAwardProcess();
            PostAwardProcessType rhsPostAwardProcess;
            rhsPostAwardProcess = that.getPostAwardProcess();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postAwardProcess", lhsPostAwardProcess), LocatorUtils.property(thatLocator, "postAwardProcess", rhsPostAwardProcess), lhsPostAwardProcess, rhsPostAwardProcess, (this.postAwardProcess!= null), (that.postAwardProcess!= null))) {
                return false;
            }
        }
        {
            EconomicOperatorShortListType lhsEconomicOperatorShortList;
            lhsEconomicOperatorShortList = this.getEconomicOperatorShortList();
            EconomicOperatorShortListType rhsEconomicOperatorShortList;
            rhsEconomicOperatorShortList = that.getEconomicOperatorShortList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "economicOperatorShortList", lhsEconomicOperatorShortList), LocatorUtils.property(thatLocator, "economicOperatorShortList", rhsEconomicOperatorShortList), lhsEconomicOperatorShortList, rhsEconomicOperatorShortList, (this.economicOperatorShortList!= null), (that.economicOperatorShortList!= null))) {
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
            AwardingMethodTypeCodeType theAwardingMethodTypeCode;
            theAwardingMethodTypeCode = this.getAwardingMethodTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "awardingMethodTypeCode", theAwardingMethodTypeCode), currentHashCode, theAwardingMethodTypeCode, (this.awardingMethodTypeCode!= null));
        }
        {
            PriceEvaluationCodeType thePriceEvaluationCode;
            thePriceEvaluationCode = this.getPriceEvaluationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceEvaluationCode", thePriceEvaluationCode), currentHashCode, thePriceEvaluationCode, (this.priceEvaluationCode!= null));
        }
        {
            MaximumVariantQuantityType theMaximumVariantQuantity;
            theMaximumVariantQuantity = this.getMaximumVariantQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumVariantQuantity", theMaximumVariantQuantity), currentHashCode, theMaximumVariantQuantity, (this.maximumVariantQuantity!= null));
        }
        {
            VariantConstraintIndicatorType theVariantConstraintIndicator;
            theVariantConstraintIndicator = this.getVariantConstraintIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "variantConstraintIndicator", theVariantConstraintIndicator), currentHashCode, theVariantConstraintIndicator, (this.variantConstraintIndicator!= null));
        }
        {
            List<AcceptedVariantsDescriptionType> theAcceptedVariantsDescription;
            theAcceptedVariantsDescription = (((this.acceptedVariantsDescription!= null)&&(!this.acceptedVariantsDescription.isEmpty()))?this.getAcceptedVariantsDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "acceptedVariantsDescription", theAcceptedVariantsDescription), currentHashCode, theAcceptedVariantsDescription, ((this.acceptedVariantsDescription!= null)&&(!this.acceptedVariantsDescription.isEmpty())));
        }
        {
            List<PriceRevisionFormulaDescriptionType> thePriceRevisionFormulaDescription;
            thePriceRevisionFormulaDescription = (((this.priceRevisionFormulaDescription!= null)&&(!this.priceRevisionFormulaDescription.isEmpty()))?this.getPriceRevisionFormulaDescription():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceRevisionFormulaDescription", thePriceRevisionFormulaDescription), currentHashCode, thePriceRevisionFormulaDescription, ((this.priceRevisionFormulaDescription!= null)&&(!this.priceRevisionFormulaDescription.isEmpty())));
        }
        {
            FundingProgramCodeType theFundingProgramCode;
            theFundingProgramCode = this.getFundingProgramCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fundingProgramCode", theFundingProgramCode), currentHashCode, theFundingProgramCode, (this.fundingProgramCode!= null));
        }
        {
            List<FundingProgramType> theFundingProgram;
            theFundingProgram = (((this.fundingProgram!= null)&&(!this.fundingProgram.isEmpty()))?this.getFundingProgram():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fundingProgram", theFundingProgram), currentHashCode, theFundingProgram, ((this.fundingProgram!= null)&&(!this.fundingProgram.isEmpty())));
        }
        {
            MaximumAdvertisementAmountType theMaximumAdvertisementAmount;
            theMaximumAdvertisementAmount = this.getMaximumAdvertisementAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximumAdvertisementAmount", theMaximumAdvertisementAmount), currentHashCode, theMaximumAdvertisementAmount, (this.maximumAdvertisementAmount!= null));
        }
        {
            List<NoteType> theNote;
            theNote = (((this.note!= null)&&(!this.note.isEmpty()))?this.getNote():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, ((this.note!= null)&&(!this.note.isEmpty())));
        }
        {
            PaymentFrequencyCodeType thePaymentFrequencyCode;
            thePaymentFrequencyCode = this.getPaymentFrequencyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentFrequencyCode", thePaymentFrequencyCode), currentHashCode, thePaymentFrequencyCode, (this.paymentFrequencyCode!= null));
        }
        {
            EconomicOperatorRegistryURIType theEconomicOperatorRegistryURI;
            theEconomicOperatorRegistryURI = this.getEconomicOperatorRegistryURI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "economicOperatorRegistryURI", theEconomicOperatorRegistryURI), currentHashCode, theEconomicOperatorRegistryURI, (this.economicOperatorRegistryURI!= null));
        }
        {
            RequiredCurriculaIndicatorType theRequiredCurriculaIndicator;
            theRequiredCurriculaIndicator = this.getRequiredCurriculaIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requiredCurriculaIndicator", theRequiredCurriculaIndicator), currentHashCode, theRequiredCurriculaIndicator, (this.requiredCurriculaIndicator!= null));
        }
        {
            OtherConditionsIndicatorType theOtherConditionsIndicator;
            theOtherConditionsIndicator = this.getOtherConditionsIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherConditionsIndicator", theOtherConditionsIndicator), currentHashCode, theOtherConditionsIndicator, (this.otherConditionsIndicator!= null));
        }
        {
            RecurringProcurementIndicatorType theRecurringProcurementIndicator;
            theRecurringProcurementIndicator = this.getRecurringProcurementIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recurringProcurementIndicator", theRecurringProcurementIndicator), currentHashCode, theRecurringProcurementIndicator, (this.recurringProcurementIndicator!= null));
        }
        {
            List<EstimatedTimingFurtherPublicationType> theEstimatedTimingFurtherPublication;
            theEstimatedTimingFurtherPublication = (((this.estimatedTimingFurtherPublication!= null)&&(!this.estimatedTimingFurtherPublication.isEmpty()))?this.getEstimatedTimingFurtherPublication():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedTimingFurtherPublication", theEstimatedTimingFurtherPublication), currentHashCode, theEstimatedTimingFurtherPublication, ((this.estimatedTimingFurtherPublication!= null)&&(!this.estimatedTimingFurtherPublication.isEmpty())));
        }
        {
            List<AdditionalConditionsType> theAdditionalConditions;
            theAdditionalConditions = (((this.additionalConditions!= null)&&(!this.additionalConditions.isEmpty()))?this.getAdditionalConditions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalConditions", theAdditionalConditions), currentHashCode, theAdditionalConditions, ((this.additionalConditions!= null)&&(!this.additionalConditions.isEmpty())));
        }
        {
            LatestSecurityClearanceDateType theLatestSecurityClearanceDate;
            theLatestSecurityClearanceDate = this.getLatestSecurityClearanceDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestSecurityClearanceDate", theLatestSecurityClearanceDate), currentHashCode, theLatestSecurityClearanceDate, (this.latestSecurityClearanceDate!= null));
        }
        {
            DocumentationFeeAmountType theDocumentationFeeAmount;
            theDocumentationFeeAmount = this.getDocumentationFeeAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentationFeeAmount", theDocumentationFeeAmount), currentHashCode, theDocumentationFeeAmount, (this.documentationFeeAmount!= null));
        }
        {
            List<ClauseType> thePenaltyClause;
            thePenaltyClause = (((this.penaltyClause!= null)&&(!this.penaltyClause.isEmpty()))?this.getPenaltyClause():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "penaltyClause", thePenaltyClause), currentHashCode, thePenaltyClause, ((this.penaltyClause!= null)&&(!this.penaltyClause.isEmpty())));
        }
        {
            List<FinancialGuaranteeType> theRequiredFinancialGuarantee;
            theRequiredFinancialGuarantee = (((this.requiredFinancialGuarantee!= null)&&(!this.requiredFinancialGuarantee.isEmpty()))?this.getRequiredFinancialGuarantee():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requiredFinancialGuarantee", theRequiredFinancialGuarantee), currentHashCode, theRequiredFinancialGuarantee, ((this.requiredFinancialGuarantee!= null)&&(!this.requiredFinancialGuarantee.isEmpty())));
        }
        {
            DocumentReferenceType theProcurementLegislationDocumentReference;
            theProcurementLegislationDocumentReference = this.getProcurementLegislationDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "procurementLegislationDocumentReference", theProcurementLegislationDocumentReference), currentHashCode, theProcurementLegislationDocumentReference, (this.procurementLegislationDocumentReference!= null));
        }
        {
            DocumentReferenceType theFiscalLegislationDocumentReference;
            theFiscalLegislationDocumentReference = this.getFiscalLegislationDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fiscalLegislationDocumentReference", theFiscalLegislationDocumentReference), currentHashCode, theFiscalLegislationDocumentReference, (this.fiscalLegislationDocumentReference!= null));
        }
        {
            DocumentReferenceType theEnvironmentalLegislationDocumentReference;
            theEnvironmentalLegislationDocumentReference = this.getEnvironmentalLegislationDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "environmentalLegislationDocumentReference", theEnvironmentalLegislationDocumentReference), currentHashCode, theEnvironmentalLegislationDocumentReference, (this.environmentalLegislationDocumentReference!= null));
        }
        {
            DocumentReferenceType theEmploymentLegislationDocumentReference;
            theEmploymentLegislationDocumentReference = this.getEmploymentLegislationDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "employmentLegislationDocumentReference", theEmploymentLegislationDocumentReference), currentHashCode, theEmploymentLegislationDocumentReference, (this.employmentLegislationDocumentReference!= null));
        }
        {
            List<DocumentReferenceType> theContractualDocumentReference;
            theContractualDocumentReference = (((this.contractualDocumentReference!= null)&&(!this.contractualDocumentReference.isEmpty()))?this.getContractualDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractualDocumentReference", theContractualDocumentReference), currentHashCode, theContractualDocumentReference, ((this.contractualDocumentReference!= null)&&(!this.contractualDocumentReference.isEmpty())));
        }
        {
            DocumentReferenceType theCallForTendersDocumentReference;
            theCallForTendersDocumentReference = this.getCallForTendersDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "callForTendersDocumentReference", theCallForTendersDocumentReference), currentHashCode, theCallForTendersDocumentReference, (this.callForTendersDocumentReference!= null));
        }
        {
            PeriodType theWarrantyValidityPeriod;
            theWarrantyValidityPeriod = this.getWarrantyValidityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "warrantyValidityPeriod", theWarrantyValidityPeriod), currentHashCode, theWarrantyValidityPeriod, (this.warrantyValidityPeriod!= null));
        }
        {
            List<PaymentTermsType> thePaymentTerms;
            thePaymentTerms = (((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty()))?this.getPaymentTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentTerms", thePaymentTerms), currentHashCode, thePaymentTerms, ((this.paymentTerms!= null)&&(!this.paymentTerms.isEmpty())));
        }
        {
            List<TendererQualificationRequestType> theTendererQualificationRequest;
            theTendererQualificationRequest = (((this.tendererQualificationRequest!= null)&&(!this.tendererQualificationRequest.isEmpty()))?this.getTendererQualificationRequest():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tendererQualificationRequest", theTendererQualificationRequest), currentHashCode, theTendererQualificationRequest, ((this.tendererQualificationRequest!= null)&&(!this.tendererQualificationRequest.isEmpty())));
        }
        {
            List<SubcontractTermsType> theAllowedSubcontractTerms;
            theAllowedSubcontractTerms = (((this.allowedSubcontractTerms!= null)&&(!this.allowedSubcontractTerms.isEmpty()))?this.getAllowedSubcontractTerms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowedSubcontractTerms", theAllowedSubcontractTerms), currentHashCode, theAllowedSubcontractTerms, ((this.allowedSubcontractTerms!= null)&&(!this.allowedSubcontractTerms.isEmpty())));
        }
        {
            List<TenderPreparationType> theTenderPreparation;
            theTenderPreparation = (((this.tenderPreparation!= null)&&(!this.tenderPreparation.isEmpty()))?this.getTenderPreparation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderPreparation", theTenderPreparation), currentHashCode, theTenderPreparation, ((this.tenderPreparation!= null)&&(!this.tenderPreparation.isEmpty())));
        }
        {
            List<ContractExecutionRequirementType> theContractExecutionRequirement;
            theContractExecutionRequirement = (((this.contractExecutionRequirement!= null)&&(!this.contractExecutionRequirement.isEmpty()))?this.getContractExecutionRequirement():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractExecutionRequirement", theContractExecutionRequirement), currentHashCode, theContractExecutionRequirement, ((this.contractExecutionRequirement!= null)&&(!this.contractExecutionRequirement.isEmpty())));
        }
        {
            AwardingTermsType theAwardingTerms;
            theAwardingTerms = this.getAwardingTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "awardingTerms", theAwardingTerms), currentHashCode, theAwardingTerms, (this.awardingTerms!= null));
        }
        {
            PartyType theAdditionalInformationParty;
            theAdditionalInformationParty = this.getAdditionalInformationParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalInformationParty", theAdditionalInformationParty), currentHashCode, theAdditionalInformationParty, (this.additionalInformationParty!= null));
        }
        {
            PartyType theDocumentProviderParty;
            theDocumentProviderParty = this.getDocumentProviderParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentProviderParty", theDocumentProviderParty), currentHashCode, theDocumentProviderParty, (this.documentProviderParty!= null));
        }
        {
            PartyType theTenderRecipientParty;
            theTenderRecipientParty = this.getTenderRecipientParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderRecipientParty", theTenderRecipientParty), currentHashCode, theTenderRecipientParty, (this.tenderRecipientParty!= null));
        }
        {
            PartyType theContractResponsibleParty;
            theContractResponsibleParty = this.getContractResponsibleParty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractResponsibleParty", theContractResponsibleParty), currentHashCode, theContractResponsibleParty, (this.contractResponsibleParty!= null));
        }
        {
            List<PartyType> theTenderEvaluationParty;
            theTenderEvaluationParty = (((this.tenderEvaluationParty!= null)&&(!this.tenderEvaluationParty.isEmpty()))?this.getTenderEvaluationParty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderEvaluationParty", theTenderEvaluationParty), currentHashCode, theTenderEvaluationParty, ((this.tenderEvaluationParty!= null)&&(!this.tenderEvaluationParty.isEmpty())));
        }
        {
            PeriodType theTenderValidityPeriod;
            theTenderValidityPeriod = this.getTenderValidityPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tenderValidityPeriod", theTenderValidityPeriod), currentHashCode, theTenderValidityPeriod, (this.tenderValidityPeriod!= null));
        }
        {
            PeriodType theContractAcceptancePeriod;
            theContractAcceptancePeriod = this.getContractAcceptancePeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contractAcceptancePeriod", theContractAcceptancePeriod), currentHashCode, theContractAcceptancePeriod, (this.contractAcceptancePeriod!= null));
        }
        {
            AppealTermsType theAppealTerms;
            theAppealTerms = this.getAppealTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "appealTerms", theAppealTerms), currentHashCode, theAppealTerms, (this.appealTerms!= null));
        }
        {
            List<LanguageType> theLanguage;
            theLanguage = (((this.language!= null)&&(!this.language.isEmpty()))?this.getLanguage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "language", theLanguage), currentHashCode, theLanguage, ((this.language!= null)&&(!this.language.isEmpty())));
        }
        {
            List<BudgetAccountLineType> theBudgetAccountLine;
            theBudgetAccountLine = (((this.budgetAccountLine!= null)&&(!this.budgetAccountLine.isEmpty()))?this.getBudgetAccountLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "budgetAccountLine", theBudgetAccountLine), currentHashCode, theBudgetAccountLine, ((this.budgetAccountLine!= null)&&(!this.budgetAccountLine.isEmpty())));
        }
        {
            DocumentReferenceType theReplacedNoticeDocumentReference;
            theReplacedNoticeDocumentReference = this.getReplacedNoticeDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replacedNoticeDocumentReference", theReplacedNoticeDocumentReference), currentHashCode, theReplacedNoticeDocumentReference, (this.replacedNoticeDocumentReference!= null));
        }
        {
            LotDistributionType theLotDistribution;
            theLotDistribution = this.getLotDistribution();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotDistribution", theLotDistribution), currentHashCode, theLotDistribution, (this.lotDistribution!= null));
        }
        {
            PostAwardProcessType thePostAwardProcess;
            thePostAwardProcess = this.getPostAwardProcess();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postAwardProcess", thePostAwardProcess), currentHashCode, thePostAwardProcess, (this.postAwardProcess!= null));
        }
        {
            EconomicOperatorShortListType theEconomicOperatorShortList;
            theEconomicOperatorShortList = this.getEconomicOperatorShortList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "economicOperatorShortList", theEconomicOperatorShortList), currentHashCode, theEconomicOperatorShortList, (this.economicOperatorShortList!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
