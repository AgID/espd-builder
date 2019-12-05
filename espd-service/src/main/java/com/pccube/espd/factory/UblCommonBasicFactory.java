package com.pccube.espd.factory;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.pccube.espd.config.EspdConfiguration;
import com.pccube.espd.config.VariableConfiguration;
import com.pccube.espd.model.BuyerProfileUriModel;
import com.pccube.espd.model.ConfidentialityLevelCodeModel;
import com.pccube.espd.model.ContractFolderIDModel;
import com.pccube.espd.model.CriterionTypeCodeModel;
import com.pccube.espd.model.CustomizationIDModel;
import com.pccube.espd.model.DescriptionModel;
import com.pccube.espd.model.DocumentTypeCodeModel;
import com.pccube.espd.model.DocumentTypeModel;
import com.pccube.espd.model.EmployeeQuantityModel;
import com.pccube.espd.model.EndPointIDModel;
import com.pccube.espd.model.EvaluationMethodTypeCodeModel;
import com.pccube.espd.model.ExpectedAmountModel;
import com.pccube.espd.model.ExpectedCodeModel;
import com.pccube.espd.model.ExpectedIDModel;
import com.pccube.espd.model.IDModel;
import com.pccube.espd.model.IdentificationCodeModel;
import com.pccube.espd.model.IndustryClassificationCodeModel;
import com.pccube.espd.model.ItemClassificationCodeModel;
import com.pccube.espd.model.ProcedureCodeModel;
import com.pccube.espd.model.ProcurementTypeCodeModel;
import com.pccube.espd.model.ProfileExecutionIDModel;
import com.pccube.espd.model.ProfileIDModel;
import com.pccube.espd.model.PropertyGroupTypeCodeModel;
import com.pccube.espd.model.QualificationApplicationTypeCodeModel;
import com.pccube.espd.model.ResponseAmountModel;
import com.pccube.espd.model.ResponseCodeModel;
import com.pccube.espd.model.ResponseCodeTypeModel;
import com.pccube.espd.model.ResponseIDModel;
import com.pccube.espd.model.ResponseMeasureModel;
import com.pccube.espd.model.ResponseQuantityModel;
import com.pccube.espd.model.RoleCodeModel;
import com.pccube.espd.model.UUIDModel;
import com.pccube.espd.model.UriModel;
import com.pccube.espd.model.ValueAmountModel;
import com.pccube.espd.model.ValueCurrencyCodeModel;
import com.pccube.espd.model.ValueUnitCodeModel;
import com.pccube.espd.model.VersionIDModel;
import com.pccube.espd.model.WebsiteUriModel;
import com.pccube.espd.model.WeightingTypeCodeModel;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ArticleType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BirthDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BirthplaceNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BuyerProfileURIType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CandidateStatementType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CertificationLevelDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CityNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ConfidentialityLevelCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ContractFolderIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CopyIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CriterionTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CustomizationIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DocumentTypeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ElectronicMailType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EmployeeQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EndDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EndpointIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.EvaluationMethodTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ExpectedValueNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FamilyNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FileNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FirstNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IdentificationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IndustryClassificationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ItemClassificationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.JurisdictionLevelType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LineType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MaximumValueNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.MinimumValueNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PostalZoneType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PreviousVersionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProcedureCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProcurementTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProfileExecutionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ProfileIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PropertyGroupTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QualificationApplicationTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseIndicatorType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseQuantityType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseTimeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ResponseURIType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RoleCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.RoleDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StartDateType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.StreetNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TelefaxType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TelephoneType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TitleType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UBLVersionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.URIType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.UUIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValidatedCriterionPropertyIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueCurrencyCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueDataTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.ValueUnitCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.VersionIDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WebsiteURIType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeightNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeightScoringMethodologyNoteType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeightingConsiderationDescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.WeightingTypeCodeType;
import oasis.names.specification.ubl.schema.xsd.qualificationapplicationrequest_2.QualificationApplicationRequestType;
import oasis.names.specification.ubl.schema.xsd.qualificationapplicationresponse_2.QualificationApplicationResponseType;

/**
 * Simple factory for creating simple UBL elements that are shared between a 
 * {@link QualificationApplicationRequestType} and {@link QualificationApplicationResponseType}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public final class UblCommonBasicFactory extends GenericCommonFactory {

	public UblCommonBasicFactory(EspdConfiguration espdConfiguration, VariableConfiguration variableConfiguration) {
		super(espdConfiguration, variableConfiguration);
		// TODO Auto-generated constructor stub
	}

	/**
     * Identifies the earliest version of the UBL 2 schema for this document type that defines all of the elements
     * that might be encountered in the current instance.
     * 
     * Cardinality 1
     * 
     * @param versionIDModel The current version of UBL 
     *
     * @return The corresponding UBL element
     */
    public static UBLVersionIDType buildUblVersionIDType(VersionIDModel versionIDModel) {
        UBLVersionIDType versionIDType = null;
        
        if (versionIDModel != null && StringUtils.isNotBlank(versionIDModel.getUblVersion())){
        	versionIDType = new UBLVersionIDType();
            versionIDType.setValue(versionIDModel.getUblVersion());
            if (StringUtils.isNotBlank(versionIDModel.getSchemeAgencyID())) {
        		versionIDType.setSchemeAgencyID(versionIDModel.getSchemeAgencyID());
            }
        }
        return versionIDType;
    }

    /**
     * Identifies a user-defined customization of UBL for a specific use.
     * 
     * Cardinality 1
     *
     * @param customizationModel A user-defined customization of UBL {@link QualificationApplicationRequestType} or {@link QualificationApplicationResponseType}.
     *
     * @return The corresponding UBL element
     */
    public static CustomizationIDType buildCustomizationIDType(CustomizationIDModel customizationModel) {
        CustomizationIDType customizationIDType = null;
        
    	if (customizationModel != null && StringUtils.isNotBlank(customizationModel.getCustomizationID())){
            customizationIDType = new CustomizationIDType();
            customizationIDType.setValue(customizationModel.getCustomizationID());
            if (StringUtils.isNotBlank(customizationModel.getSchemeAgencyID())) {
        		customizationIDType.setSchemeAgencyID(customizationModel.getSchemeAgencyID());
            }
            if (StringUtils.isNotBlank(customizationModel.getSchemeVersionID())) {
        		customizationIDType.setSchemeVersionID(customizationModel.getSchemeVersionID());
            }
    	}
        return customizationIDType;
    }

    /**
     * An identification of the specification containing the total set of rules regarding semantic content, 
     * cardinalities and business rules to which the data contained in the instance document conforms. 
     * The identification may include the version of the specification as well as any customizations applied.
     * 
     * Cardinality 0..1
     * 
     * @param profileId The identification of BIS
     *
     * @return The corresponding UBL element
     */
    public static ProfileIDType buildProfileIDType(ProfileIDModel profileIDModel) {
    	ProfileIDType profileIDType = null;
    	
    	if (profileIDModel != null && StringUtils.isNotBlank(profileIDModel.getProfileID())){
    		profileIDType = new ProfileIDType();
        	profileIDType.setValue(profileIDModel.getProfileID());
        	if (StringUtils.isNotBlank(profileIDModel.getSchemeAgencyID())) {
        		profileIDType.setSchemeAgencyID(profileIDModel.getSchemeAgencyID());
        	}
        	if (StringUtils.isNotBlank(profileIDModel.getSchemeVersionID())) {
        		profileIDType.setSchemeVersionID(profileIDModel.getSchemeVersionID());
        	}
    	}
        return profileIDType;
    }

    /**
     * The identification and version of the ESPD Exchange Data Model used to create the to XML instance. 
     * The identification may include the exact version of the specification.
     * 
     * Cardinality 1
     *
     * @param profileExecutionIDModel The specification of ESPD Document (if is a Regulated or a Self-Contained) 
     * and the version of ESPD Exchange Data Model. 
     *
     * @return The corresponding UBL element
     */
    public static ProfileExecutionIDType buildProfileExecutionIDType(ProfileExecutionIDModel profileExecutionIDModel) {
    	ProfileExecutionIDType profileExecutionIDType = null;
    	
    	if (profileExecutionIDModel != null && profileExecutionIDModel.getProfileExecutionID() != null
    			&& StringUtils.isNotBlank(profileExecutionIDModel.getProfileExecutionID().getCode())){
    		profileExecutionIDType = new ProfileExecutionIDType();
        	profileExecutionIDType.setValue(profileExecutionIDModel.getProfileExecutionID().getCode());
        	if (StringUtils.isNotBlank(profileExecutionIDModel.getSchemeID())) {
        		profileExecutionIDType.setSchemeID(profileExecutionIDModel.getSchemeID());
        	}
        	if (StringUtils.isNotBlank(profileExecutionIDModel.getSchemeAgencyName())) {
        		profileExecutionIDType.setSchemeAgencyName(profileExecutionIDModel.getSchemeAgencyName());
        	}
        	if (StringUtils.isNotBlank(profileExecutionIDModel.getSchemeAgencyID())) {
        		profileExecutionIDType.setSchemeAgencyID(profileExecutionIDModel.getSchemeAgencyID());
        	}
        	if (StringUtils.isNotBlank(profileExecutionIDModel.getSchemeVersionID())) {
        		profileExecutionIDType.setSchemeVersionID(profileExecutionIDModel.getSchemeVersionID());
        	}
    	}
        return profileExecutionIDType;
    }

    /**
     * An identifier for this document, normally generated by the system that creates the ESPD document, 
     * or the organisation responsible for the document (e.g. the buyer, e.g. a contracting authority, or the supplier, e.g. an economic operator). 
     * The identifier enables positive referencing the document instance for various purposes 
     * including referencing between transactions that are part of the same process.
     * 
     * Cardinality 1
     *
     * @param idModel The identifier of this document.
     *
     * @return The corresponding UBL element
     */
    public static IDType buildIdType(IDModel idModel) {
    	IDType idType = null;
    	
    	if (idModel != null && StringUtils.isNotBlank(idModel.getId())){
    		idType = new IDType();
        	idType.setValue(idModel.getId());
    		if (StringUtils.isNotBlank(idModel.getSchemeAgencyID())) {
    			idType.setSchemeAgencyID(idModel.getSchemeAgencyID());
    		}
    		if (StringUtils.isNotBlank(idModel.getSchemeID())) {
    			idType.setSchemeID(idModel.getSchemeID());
    		}
    		if (StringUtils.isNotBlank(idModel.getSchemeVersionID())) {
    			idType.setSchemeVersionID(idModel.getSchemeVersionID());
    		}
    	}
        return idType;
    }

    /**
     * Indicates whether this document is a copy (true) or not (false).
     *  
     * Cardinality 0..1
     *
     * @param isCopy If the document is a copy or not.
     *
     * @return The corresponding UBL element
     */
    public static CopyIndicatorType buildCopyIndicatorType(boolean isCopy) {
        CopyIndicatorType copyIndicatorType = new CopyIndicatorType();
        copyIndicatorType.setValue(isCopy);
        return copyIndicatorType;
    }

    /**
     * A universally unique identifier that can be used to reference this ESPD document instance.
     * 
     * Cardinality 1
     *
     * @return The corresponding UBL element
     */
    public static UUIDType buildUuidType(UUIDModel uuidModel) {
    	UUIDType uuidType = null;
    	
    	if (uuidModel != null && StringUtils.isNotBlank(uuidModel.getUuid())){
    		uuidType = new UUIDType();
        	uuidType.setValue(uuidModel.getUuid());
        	if (StringUtils.isNotBlank(uuidModel.getSchemeID())) {
        		uuidType.setSchemeID(uuidModel.getSchemeID());
        	}
        	if (StringUtils.isNotBlank(uuidModel.getSchemeAgencyName())) {
        		uuidType.setSchemeAgencyName(uuidModel.getSchemeAgencyName());
        	}
        	if (StringUtils.isNotBlank(uuidModel.getSchemeAgencyID())) {
        		uuidType.setSchemeAgencyID(uuidModel.getSchemeAgencyID());
        	}
        	if (StringUtils.isNotBlank(uuidModel.getSchemeVersionID())) {
        		uuidType.setSchemeVersionID(uuidModel.getSchemeVersionID());
        	}
    	}
        return uuidType;
    }

    /**
     * An identifier that is specified by the buyer and used as a reference number for all documents in the procurement process. 
     * It is also known as procurement project identifier, procurement reference number or contract folder identifier. 
     * A reference to the procurement procedure to which a Qualification request document and the delivered response documents are associated.
     * 
     * Cardinality 1
     *
     * @param contractFolderIDModel The reference number the contracting authority assigns to this procurement procedure.
     *
     * @return The corresponding UBL element
     */
    public static ContractFolderIDType buildContractFolderIDType(ContractFolderIDModel contractFolderIDModel) {
    	ContractFolderIDType contractFolderIDType = null;
    	
    	if (contractFolderIDModel != null && StringUtils.isNotBlank(contractFolderIDModel.getReferenceNumber())){
    		contractFolderIDType = new ContractFolderIDType();
        	contractFolderIDType.setValue(contractFolderIDModel.getReferenceNumber());
        	if (StringUtils.isNotBlank(contractFolderIDModel.getSchemeAgencyID())) {
        		contractFolderIDType.setSchemeAgencyID(contractFolderIDModel.getSchemeAgencyID());
        	}
    	}
        return contractFolderIDType;
    }

    /**
     * Date when the document was issued by the contracting authority.
     *
     * Cardinality 1
     *
     * @param when The desired date {format yyyy-MM-dd}
     *
     * @return The corresponding UBL element
     */
    public static IssueDateType buildIssueDateType(Date when) {
        if (when == null) {
            return null;
        }
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        LocalDate localDate = LocalDate.parse(df.format(when), formatter);
        IssueDateType issueDateType = new IssueDateType();
        issueDateType.setValue(localDate);
        return issueDateType;
    }

    /**
     * Time when the document was issued by the contracting authority.
     *
     * Cardinality 0..1
     *
     * @param when The desired time {format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'}
     *
     * @return The corresponding UBL element
     */
    public static IssueTimeType buildIssueTimeType(Date when) {
        if (when == null) {
            return null;
        }
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        LocalTime localTime = LocalTime.parse(df.format(when), formatter);
        IssueTimeType issueTimeType = new IssueTimeType();
        issueTimeType.setValue(localTime);
        return issueTimeType;
    }

    /**
     * The version identifying the content of this document.
     *
     * Cardinality 0..1
     *
     * @param versionIDModel The version of the content of this document.
     *
     * @return The corresponding UBL element
     */
    public static VersionIDType buildVersionIDType(VersionIDModel versionIDModel) {
    	VersionIDType versionIDType = null;
    	
    	if (versionIDModel != null && StringUtils.isNotBlank(versionIDModel.getVersionID())){
    		versionIDType = new VersionIDType();
        	versionIDType.setValue(versionIDModel.getVersionID());
    		if (StringUtils.isNotBlank(versionIDModel.getSchemeAgencyID())) {
    			versionIDType.setSchemeAgencyID(versionIDModel.getSchemeAgencyID());
    		}
    		if (StringUtils.isNotBlank(versionIDType.getSchemeVersionID())) {
    			versionIDType.setSchemeVersionID(versionIDModel.getSchemeVersionID());
    		}
    	}
        return versionIDType;
    }

    /**
     * The version identifying the previous modification of the content of this document.
     *
     * Cardinality 0..1
     *
     * @param previousVersionIDModel The previous version of the content of this document.
     *
     * @return The corresponding UBL element
     */
    public static PreviousVersionIDType buildPreviousVersionIDType(VersionIDModel previousVersionIDModel) {
    	PreviousVersionIDType previousVersionIDType = null;
    	
    	if (previousVersionIDModel != null && StringUtils.isNotBlank(previousVersionIDModel.getPreviousVersionID())){
    		previousVersionIDType = new PreviousVersionIDType();
        	previousVersionIDType.setValue(previousVersionIDModel.getPreviousVersionID());
    	}
        return previousVersionIDType;
    }

    /**
     * The type of the procurement administrative procedure according to the EU Directives.
     *
     * Cardinality 0..1
     *
     * @param procedureCodeModel The type of the procurement administrative procedure.
     *
     * @return The corresponding UBL element
     */
    public static ProcedureCodeType buildProcedureCodeType(ProcedureCodeModel procedureCodeModel) {
    	ProcedureCodeType procedureCodeType = null;
    	
    	if (procedureCodeModel != null && procedureCodeModel.getProcedureType() != null
    			&& StringUtils.isNotBlank(procedureCodeModel.getProcedureType().getCode())){
    		procedureCodeType = new ProcedureCodeType();
        	procedureCodeType.setValue(procedureCodeModel.getProcedureType().getCode());
        	if (StringUtils.isNotBlank(procedureCodeModel.getListID())) {
        		procedureCodeType.setListID(procedureCodeModel.getListID());
        	}
        	if (StringUtils.isNotBlank(procedureCodeModel.getListAgencyName())) {
        		procedureCodeType.setListAgencyName(procedureCodeModel.getListAgencyName());
        	}
        	if (StringUtils.isNotBlank(procedureCodeModel.getListAgencyID())) {
        		procedureCodeType.setListAgencyID(procedureCodeModel.getListAgencyID());
        	}
        	if (StringUtils.isNotBlank(procedureCodeModel.getListVersionID())) {
        		procedureCodeType.setListVersionID(procedureCodeModel.getListVersionID());
        	}
        	procedureCodeType = initProcedureCodeType(procedureCodeType);
    	}
    	return procedureCodeType;
    }

    /**
     * The type of European Single Procurement Document (ESPD).
     *
     * Cardinality 1
     *
     * @param qualificationApplicationTypeCodeModel The type of ESPD.
     *
     * @return The corresponding UBL element
     */
    public static QualificationApplicationTypeCodeType buildQualificationApplicationTypeCodeType(QualificationApplicationTypeCodeModel qualificationApplicationTypeCodeModel) {
    	QualificationApplicationTypeCodeType qualificationApplicationTypeCodeType = null;
    	
    	if (qualificationApplicationTypeCodeModel != null && qualificationApplicationTypeCodeModel.getQualificationApplicationType() != null
    			&& StringUtils.isNotBlank(qualificationApplicationTypeCodeModel.getQualificationApplicationType().getCode())){
    		qualificationApplicationTypeCodeType = new QualificationApplicationTypeCodeType();
        	qualificationApplicationTypeCodeType.setValue(qualificationApplicationTypeCodeModel.getQualificationApplicationType().getCode());
        	if (StringUtils.isNotBlank(qualificationApplicationTypeCodeModel.getListID())) {
        		qualificationApplicationTypeCodeType.setListID(qualificationApplicationTypeCodeModel.getListID());
        	}
        	if (StringUtils.isNotBlank(qualificationApplicationTypeCodeModel.getListAgencyName())) {
        		qualificationApplicationTypeCodeType.setListAgencyName(qualificationApplicationTypeCodeModel.getListAgencyName());
        	}
        	if (StringUtils.isNotBlank(qualificationApplicationTypeCodeModel.getListAgencyID())) {
        		qualificationApplicationTypeCodeType.setListAgencyID(qualificationApplicationTypeCodeModel.getListAgencyID());
        	}
        	if (StringUtils.isNotBlank(qualificationApplicationTypeCodeModel.getListVersionID())) {
        		qualificationApplicationTypeCodeType.setListVersionID(qualificationApplicationTypeCodeModel.getListVersionID());
        	}
    	}
    	return qualificationApplicationTypeCodeType;
    }

    /**
     * Free-form text to describing information about Weight Scoring Methodology.
     *
     * Cardinality 0..n
     *
     * @param notes A text explaining clearly the method that will be used to select those selection criteria that will be weighted.
     *
     * @return The corresponding UBL element
     */
    public static List<WeightScoringMethodologyNoteType> buildWeightScoringMethodologyNoteTypes(List<String> notes) {
    	List<WeightScoringMethodologyNoteType> weightScoringMethodologyNoteTypes = null;
    	
    	if (notes != null && notes.size() > 0){
    		weightScoringMethodologyNoteTypes = new ArrayList<WeightScoringMethodologyNoteType>();
	    	WeightScoringMethodologyNoteType weightScoringMethodologyNoteType = null;
    		for (String note : notes){
    	    	if (StringUtils.isNotBlank(note)){
        	    	weightScoringMethodologyNoteType = new WeightScoringMethodologyNoteType();
        	    	weightScoringMethodologyNoteType.setValue(note);
        	    	weightScoringMethodologyNoteTypes.add(weightScoringMethodologyNoteType);
    	    	}
    		}
    		
    		if (weightScoringMethodologyNoteTypes.isEmpty())  {
    			weightScoringMethodologyNoteTypes = null;
    		}
    	}
    	return weightScoringMethodologyNoteTypes;
    }

    /**
     * A code specifying the type of the Weighting.
     *
     * Cardinality 0..1
     *
     * @param weightingTypeCodeModel A code specifying the type of the Weighting. 
     * If this element it is not instantiated and one or more selection criteria are weighted the type defaults to NUMERIC.
     *
     * @return The corresponding UBL element
     */
    public static WeightingTypeCodeType buildWeightingTypeCodeType(WeightingTypeCodeModel weightingTypeCodeModel) {
    	WeightingTypeCodeType weightingTypeCodeType = null;
    	
    	if (weightingTypeCodeModel != null && weightingTypeCodeModel.getWeightingType() != null
    			&& StringUtils.isNotBlank(weightingTypeCodeModel.getWeightingType().getCode())){
    		weightingTypeCodeType = new WeightingTypeCodeType();
        	weightingTypeCodeType.setValue(weightingTypeCodeModel.getWeightingType().getCode());
        	if (StringUtils.isNotBlank(weightingTypeCodeModel.getListID())) {
        		weightingTypeCodeType.setListID(weightingTypeCodeModel.getListID());
        	}
        	if (StringUtils.isNotBlank(weightingTypeCodeModel.getListAgencyID())) {
        		weightingTypeCodeType.setListAgencyID(weightingTypeCodeModel.getListAgencyID());
        	}
        	if (StringUtils.isNotBlank(weightingTypeCodeModel.getListVersionID())) {
        		weightingTypeCodeType.setListVersionID(weightingTypeCodeModel.getListVersionID());
        	}
    	}
    	return weightingTypeCodeType;
    }

    /**
     * The type of document being referenced, expressed as a code.
     *
     * Cardinality 1
     *
     * @param documentTypeCodeModel A code specifying the type of document.
     *
     * @return The corresponding UBL element
     */
    public static DocumentTypeCodeType buildDocumentTypeCodeType(DocumentTypeCodeModel documentTypeCodeModel) {
    	DocumentTypeCodeType documentTypeCodeType = null;
    	
    	if (documentTypeCodeModel != null && documentTypeCodeModel.getDocRefContentType() != null
    			&& StringUtils.isNotBlank(documentTypeCodeModel.getDocRefContentType().getCode())){
    		documentTypeCodeType = new DocumentTypeCodeType();
        	documentTypeCodeType.setValue(documentTypeCodeModel.getDocRefContentType().getCode());
        	if (StringUtils.isNotBlank(documentTypeCodeModel.getListID())) {
        		documentTypeCodeType.setListID(documentTypeCodeModel.getListID());
        	}
        	if (StringUtils.isNotBlank(documentTypeCodeModel.getListAgencyName())) {
        		documentTypeCodeType.setListAgencyName(documentTypeCodeModel.getListAgencyName());
        	}
        	if (StringUtils.isNotBlank(documentTypeCodeModel.getListAgencyID())) {
        		documentTypeCodeType.setListAgencyID(documentTypeCodeModel.getListAgencyID());
        	}
        	if (StringUtils.isNotBlank(documentTypeCodeModel.getListVersionID())) {
        		documentTypeCodeType.setListVersionID(documentTypeCodeModel.getListVersionID());
        	}
    	}
    	return documentTypeCodeType;
    }

    /**
     * The type of document being referenced, expressed as text.
     *
     * Cardinality 0..1
     *
     * @param documentTypeModel A text specifying the type of document and indicating the language of the text.
     *
     * @return The corresponding UBL element
     */
    public static DocumentTypeType buildDocumentTypeType(DocumentTypeModel documentTypeModel) {
    	DocumentTypeType documentTypeType = null;
    	
		if (documentTypeModel != null && StringUtils.isNotBlank(documentTypeModel.getDocumentType())){
			documentTypeType = new DocumentTypeType();
	    	documentTypeType.setValue(documentTypeModel.getDocumentType());
	    	if (StringUtils.isNotBlank(documentTypeModel.getLanguageID())) {
        		documentTypeType.setLanguageID(documentTypeModel.getLanguageID());
	    	}
		}
    	return documentTypeType;
    }

    /**
     * The Uniform Resource Identifier (URI).
     *
     * Cardinality 0..1
     * 
     * @param uriModel The URI.
     *
     * @return The corresponding UBL element
     */
    public static URIType buildUriType(UriModel uriModel) {
    	URIType uriType = null;
    	
    	if (uriModel != null && StringUtils.isNotBlank(uriModel.getUri())){
    		uriType = new URIType();
        	uriType.setValue(uriModel.getUri());
        	if (StringUtils.isNotBlank(uriModel.getSchemeAgencyID())) {
    			uriType.setSchemeAgencyID(uriModel.getSchemeAgencyID());
        	}
    	}
    	return uriType;
    }

    /**
     * A list of the Uniform Resource Identifier (URI).
     *
     * Cardinality 0..1
     * 
     * @param uriModels A list of the URI.
     *
     * @return The corresponding UBL element
     */
    public static List<URIType> buildUriTypes(List<UriModel> uriModels) {
    	List<URIType> uriTypes = null;
    	
    	if (uriModels != null && uriModels.size() > 0){
    		uriTypes = new ArrayList<URIType>();
    		for (UriModel uriModel : uriModels){
    			URIType uriType = UblCommonBasicFactory.buildUriType(uriModel);
    	    	if (uriType != null) {
    	    		uriTypes.add(uriType);
    	    	}
    		}
    		
    		if (uriTypes.isEmpty()) {
    			uriTypes = null;
    		}
    	}
    	return uriTypes;
    }

    /**
     * The title of the document.
     *
     * Cardinality 0..1
     * 
     * @param fileName The title of the document.
     *
     * @return The corresponding UBL element
     */
    public static FileNameType buildFileNameType(String fileName) {
    	FileNameType fileNameType = null;
    	
    	if (StringUtils.isNotBlank(fileName)){
    		fileNameType = new FileNameType();
        	fileNameType.setValue(fileName);
        }
    	return fileNameType;
    }

    /**
     * Short description of something.
     *
     * Cardinality 0..n
     * 
     * @param descriptionModels Short description of something.
     * @param writeIfIsEmpty Add a model even if the description string is empty
     *
     * @return The corresponding UBL element
     */
    public static List<DescriptionType> buildDescriptionTypes(List<DescriptionModel> descriptionModels, boolean writeIfIsEmpty) {
    	List<DescriptionType> descriptionTypes = null;
    	
    	if (descriptionModels != null && descriptionModels.size() > 0){
    		descriptionTypes = new ArrayList<DescriptionType>();
    		DescriptionType descriptionType = null;
    		for (DescriptionModel descriptionModel : descriptionModels){
    			if (descriptionModel != null && (StringUtils.isNotBlank(descriptionModel.getDescription()) || writeIfIsEmpty)){
        			descriptionType = new DescriptionType();
        			descriptionType.setValue(descriptionModel.getDescription());
        			if (StringUtils.isNotBlank(descriptionModel.getLanguageID())) {
        				descriptionType.setLanguageID(descriptionModel.getLanguageID());
        			}
        			descriptionTypes.add(descriptionType);
    			}
    		}
    		
    		if (descriptionTypes.isEmpty()) {
    			descriptionTypes = null;
    		}
    	}
    	return descriptionTypes;
    }

    /**
     * URL of the web section, in the contracting body web site, that contains information about the contracting body, 
     * the norms it applies when contracting, published calls for tenders, 
     * Prior Information Notices and Contract Notices as well as the related procurement documents, contract award notices, etc.
     *
     * Cardinality 0..1
     * 
     * @param buyerProfileUriModel The URI that identifies where the document is located.
     *
     * @return The corresponding UBL element
     */
    public static BuyerProfileURIType buildBuyerProfileURIType(BuyerProfileUriModel buyerProfileUriModel) {
    	BuyerProfileURIType buyerProfileURIType = null;
    	
    	if (buyerProfileUriModel != null && StringUtils.isNotBlank(buyerProfileUriModel.getBuyerProfileUri())){
    		buyerProfileURIType = new BuyerProfileURIType();
        	buyerProfileURIType.setValue(buyerProfileUriModel.getBuyerProfileUri());
    	}
    	return buyerProfileURIType;
    }

    /**
     * The website of the contracting body.
     *
     * Cardinality 0..1
     * 
     * @param websiteUriModel The website of the contracting body.
     *
     * @return The corresponding UBL element
     */
    public static WebsiteURIType buildWebsiteURIType(WebsiteUriModel websiteUriModel) {
    	WebsiteURIType websiteURIType = null;
    	
    	if (websiteUriModel != null && StringUtils.isNotBlank(websiteUriModel.getWebsiteUri())){
    		websiteURIType = new WebsiteURIType();
        	websiteURIType.setValue(websiteUriModel.getWebsiteUri());
    	}
    	return websiteURIType;
    }

    /**
     * Electronic address of the contracting body.
     *
     * Cardinality 0..1
     * 
     * @param endpointIDModel Electronic address of the contracting body.
     *
     * @return The corresponding UBL element
     */
    public static EndpointIDType buildEndpointIDType(EndPointIDModel endpointIDModel) {
    	EndpointIDType endpointIDType = null;
    	
    	if (endpointIDModel != null && StringUtils.isNotBlank(endpointIDModel.getEndPointID())){
    		endpointIDType = new EndpointIDType();
        	endpointIDType.setValue(endpointIDModel.getEndPointID());
        	if (StringUtils.isNotBlank(endpointIDModel.getSchemeID())) {
        		endpointIDType.setSchemeID(endpointIDModel.getSchemeID());
        	}
        	if (StringUtils.isNotBlank(endpointIDModel.getSchemeAgencyID())) {
        		endpointIDType.setSchemeAgencyID(endpointIDModel.getSchemeAgencyID());
        	}
    	}
    	return endpointIDType;
    }

    /**
     * The name of something.
     *
     * Cardinality 1
     * 
     * @param name The name of something.
     *
     * @return The corresponding UBL element
     */
    public static NameType buildNameType(String name) {
    	NameType nameType = null;
    	
    	if (StringUtils.isNotBlank(name)){
    		nameType = new NameType();
        	nameType.setValue(name);
        }
    	return nameType;
    }

    /**
     * Names of something.
     *
     * Cardinality 0..n
     * 
     * @param names Names of something.
     *
     * @return The corresponding UBL element
     */
    public static List<NameType> buildNameTypes(List<String> names) {
    	List<NameType> nameTypes = null;
    	
    	if (names != null && names.size() > 0){
    		nameTypes = new ArrayList<NameType>();
    		NameType nameType = null;
    		for (String name : names){
    			if (StringUtils.isNotBlank(name)){
        			nameType = new NameType();
        			nameType.setValue(name);
        			nameTypes.add(nameType);
    			}
    		}
    		
    		if (nameTypes.isEmpty()) { 
    			nameTypes = null;
    		}
    	}
    	return nameTypes;
    }

    /**
     * The main address line in an address. Usually the street name and number or post office box.
     *
     * 0..1
     * 
     * @param streetName The main address line in an address.
     *
     * @return The corresponding UBL element
     */
    public static StreetNameType buildStreetNameType(String streetName) {
    	StreetNameType streetNameType = null;
    	
    	if (StringUtils.isNotBlank(streetName)){
    		streetNameType = new StreetNameType();
        	streetNameType.setValue(streetName);
        }
    	return streetNameType;
    }

    /**
     * The common name of a city where the address is located.
     *
     * 0..1
     * 
     * @param cityName The common name of a city where the address is located.
     *
     * @return The corresponding UBL element
     */
    public static CityNameType buildCityNameType(String cityName) {
    	CityNameType cityNameType = null;
    	
    	if (StringUtils.isNotBlank(cityName)){
    		cityNameType = new CityNameType();
        	cityNameType.setValue(cityName);
        }
    	return cityNameType;
    }

    /**
     * The identifier for an addressable group of properties according
     * to the relevant postal service, such as a ZIP code or Post Code.
     *
     * 0..1
     * 
     * @param postalZone The identifier for an addressable group of properties.
     *
     * @return The corresponding UBL element
     */
    public static PostalZoneType buildPostalZoneType(String postalZone) {
    	PostalZoneType postalZoneType = null;
    	
    	if (StringUtils.isNotBlank(postalZone)){
    		postalZoneType = new PostalZoneType();
        	postalZoneType.setValue(postalZone);
        }
    	return postalZoneType;
    }

    /**
     * The main address line in an address. Usually the street name and number or post office box.
     *
     * 0..1
     * 
     * @param line
     *
     * @return The corresponding UBL element
     */
    public static LineType buildLineType(String line) {
    	LineType lineType = null;
    	
    	if (StringUtils.isNotBlank(line)){
        	lineType = new LineType();
        	lineType.setValue(line);
    	}
    	return lineType;
    }

    /**
     * A code that identifies the country. The lists of valid countries are registered 
     * with the ISO 3166-1 Maintenance agency, "Codes for the representation of names of 
     * countries and their subdivisions". It is recommended to use the Country Code ISO 3166-1 2A:2006 
     * representation.
     *
     * 0..1
     * 
     * @param identificationCodeModel A code that identifies the country.
     *
     * @return The corresponding UBL element
     */
    public static IdentificationCodeType buildIdentificationCodeType(IdentificationCodeModel identificationCodeModel) {
    	IdentificationCodeType identificationCodeType = null;
    	
    	if (identificationCodeModel != null && identificationCodeModel.getCountryCodeIdentifier() != null
    			&& StringUtils.isNotBlank(identificationCodeModel.getCountryCodeIdentifier().getCode())){
    		identificationCodeType = new IdentificationCodeType();
        	identificationCodeType.setValue(identificationCodeModel.getCountryCodeIdentifier().getCode());
        	if (StringUtils.isNotBlank(identificationCodeModel.getListID())) {
        		identificationCodeType.setListID(identificationCodeModel.getListID());
        	}
        	if (StringUtils.isNotBlank(identificationCodeModel.getListAgencyName())) {
        		identificationCodeType.setListAgencyName(identificationCodeModel.getListAgencyName());
        	}
        	if (StringUtils.isNotBlank(identificationCodeModel.getListAgencyID())) {
        		identificationCodeType.setListAgencyID(identificationCodeModel.getListAgencyID());
        	}
        	if (StringUtils.isNotBlank(identificationCodeModel.getListVersionID())) {
        		identificationCodeType.setListVersionID(identificationCodeModel.getListVersionID());
        	}
        	identificationCodeType = initIdentificationCodeType(identificationCodeType);
    	}
    	return identificationCodeType;
    }

    /**
     * A phone number for the contact point.
     *
     * 0..1
     * 
     * @param telephone A phone number for the contact point.
     *
     * @return The corresponding UBL element
     */
    public static TelephoneType buildTelephoneType(String telephone) {
    	TelephoneType telephoneType = null;
    	
    	if (StringUtils.isNotBlank(telephone)){
    		telephoneType = new TelephoneType();
        	telephoneType.setValue(telephone);
        }
    	return telephoneType;
    }

    /**
     * A fax number for the contact point.
     *
     * 0..1
     * 
     * @param telefax A fax number for the contact point.
     *
     * @return The corresponding UBL element
     */
    public static TelefaxType buildTelefaxType(String telefax) {
    	TelefaxType telefaxType = null;
    	
    	if (StringUtils.isNotBlank(telefax)){
    		telefaxType = new TelefaxType();
        	telefaxType.setValue(telefax);
        }
    	return telefaxType;
    }

    /**
     * An e-mail address for the contact point.
     *
     * 0..1
     * 
     * @param email An e-mail address for the contact point.
     *
     * @return The corresponding UBL element
     */
    public static ElectronicMailType buildElectronicMailType(String email) {
    	ElectronicMailType electronicMailType = null;
    	
    	if (StringUtils.isNotBlank(email)) {
    		electronicMailType = new ElectronicMailType();
        	electronicMailType.setValue(email);
    	}
    	return electronicMailType;
    }

    /**
     * A code to describe the object of the project 
     * (e.g. works, supplies, services, public work concessions, service concessions, other).
     *
     * 0..1
     * 
     * @param identificationCodeModel A code to describe the object of the project.
     *
     * @return The corresponding UBL element
     */
    public static ProcurementTypeCodeType buildProcurementTypeCodeType(ProcurementTypeCodeModel procurementTypeCodeModel) {
    	ProcurementTypeCodeType procurementTypeCodeType = null;
    	
    	if (procurementTypeCodeModel != null && procurementTypeCodeModel.getProjectType() != null
    			&& StringUtils.isNotBlank(procurementTypeCodeModel.getProjectType().getCode())){
    		procurementTypeCodeType = new ProcurementTypeCodeType();
        	procurementTypeCodeType.setValue(procurementTypeCodeModel.getProjectType().getCode());
        	if (StringUtils.isNotBlank(procurementTypeCodeModel.getListID())) {
        		procurementTypeCodeType.setListID(procurementTypeCodeModel.getListID());
        	}
        	if (StringUtils.isNotBlank(procurementTypeCodeModel.getListAgencyName())) {
        		procurementTypeCodeType.setListAgencyName(procurementTypeCodeModel.getListAgencyName());
        	}
        	if (StringUtils.isNotBlank(procurementTypeCodeModel.getListAgencyID())) {
        		procurementTypeCodeType.setListAgencyID(procurementTypeCodeModel.getListAgencyID());
        	}
        	if (StringUtils.isNotBlank(procurementTypeCodeModel.getListVersionID())) {
        		procurementTypeCodeType.setListVersionID(procurementTypeCodeModel.getListVersionID());
        	}
    	}
    	return procurementTypeCodeType;
    }

    /**
     * A specification of the CPV code.
     *
     * 0..1
     * 
     * @param itemClassificationCodeModel A specification of the CPV code.
     *
     * @return The corresponding UBL element
     */
    public static ItemClassificationCodeType buildItemClassificationCodeType(ItemClassificationCodeModel itemClassificationCodeModel) {
    	ItemClassificationCodeType itemClassificationCodeType = null;
    	
    	if (itemClassificationCodeModel != null && StringUtils.isNotBlank(itemClassificationCodeModel.getItemClassificationCode())){
    		itemClassificationCodeType = new ItemClassificationCodeType();
        	itemClassificationCodeType.setValue(itemClassificationCodeModel.getItemClassificationCode());
    		if (StringUtils.isNotBlank(itemClassificationCodeModel.getName())) {
    			itemClassificationCodeType.setName(itemClassificationCodeModel.getName());
    		}
    	}
    	return itemClassificationCodeType;
    }

    /**
     * A classification code defined by the ESPD-EDM to represent 
     * the criterion in the ESPD taxonomy of criteria.
     *
     * Cardinality 1
     *
     * @param criterionTypeCodeModel A code specifying the type of the Criterion.
     *
     * @return The corresponding UBL element
     */
    public static CriterionTypeCodeType buildCriterionTypeCodeType(CriterionTypeCodeModel criterionTypeCodeModel) {
    	CriterionTypeCodeType criterionTypeCodeType = null;
    	
    	if (criterionTypeCodeModel != null && criterionTypeCodeModel.getCriterionElementType() != null
    			 && StringUtils.isNotBlank(criterionTypeCodeModel.getCriterionElementType().getCode())){
    		criterionTypeCodeType = new CriterionTypeCodeType();
        	criterionTypeCodeType.setValue(criterionTypeCodeModel.getCriterionElementType().getCode());
        	if (StringUtils.isNotBlank(criterionTypeCodeModel.getListID())) {
        		criterionTypeCodeType.setListID(criterionTypeCodeModel.getListID());
        	}
        	if (StringUtils.isNotBlank(criterionTypeCodeModel.getListAgencyID())) {
        		criterionTypeCodeType.setListAgencyID(criterionTypeCodeModel.getListAgencyID());
        	}
        	if (StringUtils.isNotBlank(criterionTypeCodeModel.getListVersionID())) {
        		criterionTypeCodeType.setListVersionID(criterionTypeCodeModel.getListVersionID());
        	}
    	}
    	return criterionTypeCodeType;
    }

    /**
     * A code to inform about the type of Evaluation, namely for transparency purposes 
     * (e.g. PASSFAIL, WEIGHTED)
     *
     * Cardinality 0..1
     *
     * @param evaluationMethodTypeCodeModel A code to inform about the type of Evaluation.
     *
     * @return The corresponding UBL element
     */
    public static EvaluationMethodTypeCodeType buildEvaluationMethodTypeCodeType(EvaluationMethodTypeCodeModel evaluationMethodTypeCodeModel) {
    	EvaluationMethodTypeCodeType evaluationMethodTypeCodeType = null;
    	
    	if (evaluationMethodTypeCodeModel != null && evaluationMethodTypeCodeModel.getEvaluationMethodType() != null
    			&& StringUtils.isNotBlank(evaluationMethodTypeCodeModel.getEvaluationMethodType().getCode())){
    		evaluationMethodTypeCodeType = new EvaluationMethodTypeCodeType();
        	evaluationMethodTypeCodeType.setValue(evaluationMethodTypeCodeModel.getEvaluationMethodType().getCode());
    		if (StringUtils.isNotBlank(evaluationMethodTypeCodeModel.getListID())){
    			evaluationMethodTypeCodeType.setListID(evaluationMethodTypeCodeModel.getListID());
    		}
    		if (StringUtils.isNotBlank(evaluationMethodTypeCodeModel.getListAgencyID())){
    			evaluationMethodTypeCodeType.setListAgencyID(evaluationMethodTypeCodeModel.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(evaluationMethodTypeCodeModel.getListVersionID())){
    			evaluationMethodTypeCodeType.setListVersionID(evaluationMethodTypeCodeModel.getListVersionID());
    		}
    	}
    	return evaluationMethodTypeCodeType;
    }

    /**
     * The numeric of something.
     *
     * Cardinality 1
     * 
     * @param numeric The numeric of something.
     *
     * @return The corresponding UBL element
     */
    public static WeightNumericType buildWeightNumericType(Float numeric) {
    	WeightNumericType weightNumericType = null;
    	
    	if (numeric != null && !Float.isNaN(numeric)){
    		weightNumericType = new WeightNumericType();
        	weightNumericType.setValue(new BigDecimal(numeric));
    	}
    	return weightNumericType;
    }

    /**
     * Additional information, comments or considerations about the weighting and 
     * the evaluation method, namely for transparency purposes; 
     * e.g. '0 Points 0 IT specialists, 30 Points 1 IT specialists, 60 Points 2 IT specialists'. 
     * See section about Selection Criteria and sub-section on 'Weighting', for more details.
     *
     * Cardinality 0..n
     * 
     * @param weightingConsiderationDescriptions Additional information, comments or considerations about the weighting and the evaluation method.
     *
     * @return The corresponding UBL element
     */
    public static List<WeightingConsiderationDescriptionType> buildWeightingConsiderationDescriptionTypes(List<String> weightingConsiderationDescriptions) {
    	List<WeightingConsiderationDescriptionType> weightingConsiderationDescriptionTypes = null;
    	
    	if (weightingConsiderationDescriptions != null && weightingConsiderationDescriptions.size() > 0){
    		weightingConsiderationDescriptionTypes = new ArrayList<WeightingConsiderationDescriptionType>();
    		WeightingConsiderationDescriptionType weightingConsiderationDescriptionType = null;
    		for (String weightingConsiderationDescription : weightingConsiderationDescriptions){
    			if (StringUtils.isNotBlank(weightingConsiderationDescription)){
        			weightingConsiderationDescriptionType = new WeightingConsiderationDescriptionType();
        			weightingConsiderationDescriptionType.setValue(weightingConsiderationDescription);
        			weightingConsiderationDescriptionTypes.add(weightingConsiderationDescriptionType);
    			}
    		}
    		
    		if (weightingConsiderationDescriptionTypes.isEmpty()) {
    			weightingConsiderationDescriptionTypes = null;
    		}
    	}
    	return weightingConsiderationDescriptionTypes;
    }

    /**
     * The complete title of the legislation provided as in the original legal text.
     *
     * Cardinality 1..n
     * 
     * @param titles Title of the legislation.
     *
     * @return The corresponding UBL element
     */
    public static List<TitleType> buildTitleTypes(List<String> titles) {
    	List<TitleType> titleTypes = null;
    	
    	if (titles != null && titles.size() > 0){
    		titleTypes = new ArrayList<TitleType>();
    		TitleType titleType = null;
    		for (String title : titles){
    			if (StringUtils.isNotBlank(title)){
        			titleType = new TitleType();
        			titleType.setValue(title);
        			titleTypes.add(titleType);	
    			}
    		}
    		
    		if (titleTypes.isEmpty()) {
    			titleTypes = null;
    		}
    	}
    	return titleTypes;
    }

    /**
     * Jurisdictional level of a particular legislation.
     *
     * Cardinality 0..n
     * 
     * @param levels Jurisdictional level of a particular legislation.
     *
     * @return The corresponding UBL element
     */
    public static List<JurisdictionLevelType> buildJurisdictionLevelTypes(List<String> levels) {
    	List<JurisdictionLevelType> jurisdictionLevelTypes = null;
    	
    	if (levels != null && levels.size() > 0){
    		jurisdictionLevelTypes = new ArrayList<JurisdictionLevelType>();
    		JurisdictionLevelType jurisdictionLevelType = null;
    		for (String level : levels){
    			if (StringUtils.isNotBlank(level)){
        			jurisdictionLevelType = new JurisdictionLevelType();
        			jurisdictionLevelType.setValue(level);
        			jurisdictionLevelTypes.add(jurisdictionLevelType);	
    			}
    		}
    		
    		if (jurisdictionLevelTypes.isEmpty()) {
    			jurisdictionLevelTypes = null;
    		}
    	}
    	return jurisdictionLevelTypes;
    }

    /**
     * Textual description of the article of the legislation.
     *
     * Cardinality 0..n
     * 
     * @param articles Textual description of the article of the legislation.
     *
     * @return The corresponding UBL element
     */
    public static List<ArticleType> buildArticleTypes(List<String> articles) {
    	List<ArticleType> articleTypes = null;
    	
    	if (articles != null && articles.size() > 0){
    		articleTypes = new ArrayList<ArticleType>();
    		ArticleType articleType  = null;
    		for (String article : articles){
    			if (StringUtils.isNotBlank(article)){
	    			articleType = new ArticleType();
	    			articleType.setValue(article);
	    			articleTypes.add(articleType);
    			}
    		}
    		
    		if (articleTypes.isEmpty()) {
    			articleTypes = null;
    		}
    	}
    	return articleTypes;
    }

    /**
     * Code addressed to control the behavior of the group of criteria.
     *
     * Cardinality 1
     *
     * @param PropertyGroupTypeCodeModel Code addressed to control the behavior of the group of criteria.
     *
     * @return The corresponding UBL element
     */
    public static PropertyGroupTypeCodeType buildPropertyGroupTypeCodeType(PropertyGroupTypeCodeModel propertyGroupTypeCodeModel) {
    	PropertyGroupTypeCodeType propertyGroupTypeCodeType = null;
    	
    	if (propertyGroupTypeCodeModel != null && propertyGroupTypeCodeModel.getPropertyGroupType() != null
   			 && StringUtils.isNotBlank(propertyGroupTypeCodeModel.getPropertyGroupType().getCode())){
    		propertyGroupTypeCodeType = new PropertyGroupTypeCodeType();
        	propertyGroupTypeCodeType.setValue(propertyGroupTypeCodeModel.getPropertyGroupType().getCode());
        	if (StringUtils.isNotBlank(propertyGroupTypeCodeModel.getListID())) {
        		propertyGroupTypeCodeType.setListID(propertyGroupTypeCodeModel.getListID());
    		}
        	if (StringUtils.isNotBlank(propertyGroupTypeCodeModel.getListAgencyID())) {
        		propertyGroupTypeCodeType.setListAgencyID(propertyGroupTypeCodeModel.getListAgencyID());
    		}
        	if (StringUtils.isNotBlank(propertyGroupTypeCodeModel.getListVersionID())) {
        		propertyGroupTypeCodeType.setListVersionID(propertyGroupTypeCodeModel.getListVersionID());
    		}
    	}
    	return propertyGroupTypeCodeType;
    }

    /**
     * The type of property. Used to verify that structure of the property is correct.
     *
     * Cardinality 1
     *
     * @param typeCodeModel The type of property.
     *
     * @return The corresponding UBL element
     */
    public static TypeCodeType buildTypeCodeType(CriterionTypeCodeModel typeCodeModel) {
    	TypeCodeType typeCodeType = null;
    	
    	if (typeCodeModel != null && typeCodeModel.getCriterionElementType() != null
    			&& StringUtils.isNotBlank(typeCodeModel.getCriterionElementType().getCode())){
    		typeCodeType = new TypeCodeType();
        	typeCodeType.setValue(typeCodeModel.getCriterionElementType().getCode());
        	if (StringUtils.isNotBlank(typeCodeModel.getListID())) {
        		typeCodeType.setListID(typeCodeModel.getListID());
        	}
        	if (StringUtils.isNotBlank(typeCodeModel.getListAgencyID())) {
        		typeCodeType.setListAgencyID(typeCodeModel.getListAgencyID());
        	}
        	if (StringUtils.isNotBlank(typeCodeModel.getListVersionID())) {
        		typeCodeType.setListVersionID(typeCodeModel.getListVersionID());
        	}
    	}
    	return typeCodeType;
    }

    /**
     * The type of answer expected by the contracting authority 
     * in the case of a property of type QUESTION.
     *
     * Cardinality 1
     *
     * @param valueDataTypeCodeTypeModel The type of answer.
     *
     * @return The corresponding UBL element
     */
    public static ValueDataTypeCodeType buildValueDataTypeCodeType(ResponseCodeTypeModel valueDataTypeCodeTypeModel) {
    	ValueDataTypeCodeType valueDataTypeCodeType = null;
    	
    	if (valueDataTypeCodeTypeModel != null && valueDataTypeCodeTypeModel.getResponseDataType() != null
    			&& StringUtils.isNotBlank(valueDataTypeCodeTypeModel.getResponseDataType().getCode())){
    		valueDataTypeCodeType = new ValueDataTypeCodeType();
        	valueDataTypeCodeType.setValue(valueDataTypeCodeTypeModel.getResponseDataType().getCode());
        	if (StringUtils.isNotBlank(valueDataTypeCodeTypeModel.getListID())) {
        		valueDataTypeCodeType.setListID(valueDataTypeCodeTypeModel.getListID());
    		}
        	if (StringUtils.isNotBlank(valueDataTypeCodeTypeModel.getListAgencyID())) {
        		valueDataTypeCodeType.setListAgencyID(valueDataTypeCodeTypeModel.getListAgencyID());
			}
        	if (StringUtils.isNotBlank(valueDataTypeCodeTypeModel.getListVersionID())) {
        		valueDataTypeCodeType.setListVersionID(valueDataTypeCodeTypeModel.getListVersionID());
			}
    	}
    	return valueDataTypeCodeType;
    }

    /**
     * The unit of measure of the numeric value as a quantity 
     * or measure in the expected response from the economic operator.
     *
     * Cardinality 0..1
     *
     * @param valueUnitCodeModel
     *
     * @return The corresponding UBL element
     */
    public static ValueUnitCodeType buildValueUnitCodeType(ValueUnitCodeModel valueUnitCodeModel) {
    	ValueUnitCodeType valueUnitCodeType = null;
    	
    	if (valueUnitCodeModel != null && StringUtils.isNotBlank(valueUnitCodeModel.getValueUnitCode())){
    		valueUnitCodeType = new ValueUnitCodeType();
        	valueUnitCodeType.setValue(valueUnitCodeModel.getValueUnitCode());
    	}
    	return valueUnitCodeType;
    }

    /**
     * The currency of the numeric value as an amount 
     * in the expected response from the economic operator.
     *
     * Cardinality 0..1
     *
     * @param valueCurrencyCodeModel
     *
     * @return The corresponding UBL element
     */
    public static ValueCurrencyCodeType buildValueCurrencyCodeType(ValueCurrencyCodeModel valueCurrencyCodeModel) {
    	ValueCurrencyCodeType valueCurrencyCodeType = null;
    	
    	if (valueCurrencyCodeModel != null && StringUtils.isNotBlank(valueCurrencyCodeModel.getValueCurrencyCode())){
    		valueCurrencyCodeType = new ValueCurrencyCodeType();
        	valueCurrencyCodeType.setValue(valueCurrencyCodeModel.getValueCurrencyCode());
    	}
    	return valueCurrencyCodeType;
    }

    /**
     * The expected amount that the economic operator has to provide in the criterion response.
     *
     * Cardinality 0..1
     *
     * @param expectedAmountModel
     *
     * @return The corresponding UBL element
     */
    public static ExpectedAmountType buildExpectedAmountType(ExpectedAmountModel expectedAmountModel) {
    	ExpectedAmountType expectedAmountType = null;
    	
    	if (expectedAmountModel != null && expectedAmountModel.getExpectedAmount() != null 
    			&& !Float.isNaN(expectedAmountModel.getExpectedAmount())){
    		expectedAmountType = new ExpectedAmountType();
    		expectedAmountType.setValue(new BigDecimal(expectedAmountModel.getExpectedAmount()));
    		if (StringUtils.isNotBlank(expectedAmountModel.getCurrencyID())) {
        		expectedAmountType.setCurrencyID(expectedAmountModel.getCurrencyID());
    		}
    	}
    	return expectedAmountType;
    }

    /**
     * The expected identifier that the economic operator has to provide in the criterion response.
     *
     * Cardinality 0..1
     *
     * @param expectedIDModel
     *
     * @return The corresponding UBL element
     */
    public static ExpectedIDType buildExpectedIDType(ExpectedIDModel expectedIDModel) {
    	ExpectedIDType expectedIDType = null;
    	
    	if (expectedIDModel != null && StringUtils.isNotBlank(expectedIDModel.getExpectedID())){
    		expectedIDModel = initExpectedIDModel(expectedIDModel);
    		
    		expectedIDType = new ExpectedIDType();
        	expectedIDType.setValue(expectedIDModel.getExpectedID());
    		if (StringUtils.isNotBlank(expectedIDModel.getSchemeID())) {
    			expectedIDType.setSchemeID(expectedIDModel.getSchemeID());
    		}
    		if (StringUtils.isNotBlank(expectedIDModel.getSchemeAgencyID())) {
    			expectedIDType.setSchemeAgencyID(expectedIDModel.getSchemeAgencyID());
    		}
    		if (StringUtils.isNotBlank(expectedIDModel.getSchemeVersionID())) {
    			expectedIDType.setSchemeVersionID(expectedIDModel.getSchemeVersionID());
    		}
    	}
    	return expectedIDType;
    }

    /**
     * The expected code that the economic operator has to provide in the Criterion response.
     *
     * Cardinality 0..1
     *
     * @param expectedCodeModel
     *
     * @return The corresponding UBL element
     */
    public static ExpectedCodeType buildExpectedCodeType(ExpectedCodeModel expectedCodeModel) {
    	ExpectedCodeType expectedCodeType = null;
    	
    	if (expectedCodeModel != null && StringUtils.isNotBlank(expectedCodeModel.getExpectedCode())){
    		expectedCodeType = new ExpectedCodeType();
        	expectedCodeType.setValue(expectedCodeModel.getExpectedCode());
        	if (StringUtils.isNotBlank(expectedCodeModel.getListID())) {
        		expectedCodeType.setListID(expectedCodeModel.getListID());
        	}
        	if (StringUtils.isNotBlank(expectedCodeModel.getListAgencyID())) {
        		expectedCodeType.setListAgencyID(expectedCodeModel.getListAgencyID());
        	}
        	if (StringUtils.isNotBlank(expectedCodeModel.getListVersionID())) {
        		expectedCodeType.setListVersionID(expectedCodeModel.getListVersionID());
        	}
    	}
    	return expectedCodeType;
    }

    /**
     * The expected description that the economic operator has to provide in the Criterion response.
     *
     * 0..1
     * 
     * @param description
     *
     * @return The corresponding UBL element
     */
    public static ExpectedDescriptionType buildExpectedDescriptionType(String description) {
    	ExpectedDescriptionType expectedDescriptionType = null;
    	
    	if (StringUtils.isNotBlank(description)) {
        	expectedDescriptionType = new ExpectedDescriptionType();
        	expectedDescriptionType.setValue(description);
    	}
    	return expectedDescriptionType;
    }

    /**
     * The expected value that the economic operator has to provide in the Criterion response.
     *
     * Cardinality 0..1
     *
     * @param numeric
     *
     * @return The corresponding UBL element
     */
    public static ExpectedValueNumericType buildExpectedValueNumericType(Float numeric) {
    	ExpectedValueNumericType expectedValueNumericType = null;
    	
    	if (numeric != null && !Float.isNaN(numeric)){
    		expectedValueNumericType = new ExpectedValueNumericType();
        	expectedValueNumericType.setValue(new BigDecimal(numeric));
    	}
    	return expectedValueNumericType;
    }

    /**
     * The maximum value the response must have.
     *
     * Cardinality 0..1
     *
     * @param numeric
     *
     * @return The corresponding UBL element
     */
    public static MaximumValueNumericType buildMaximumValueNumericType(Float numeric) {
    	MaximumValueNumericType maximumValueNumericType = null;
    	
    	if (numeric != null && !Float.isNaN(numeric)){
    		maximumValueNumericType = new MaximumValueNumericType();
        	maximumValueNumericType.setValue(new BigDecimal(numeric));
    	}
    	return maximumValueNumericType;
    }

    /**
     * The minimum value the response must have.
     *
     * Cardinality 0..1
     *
     * @param numeric
     *
     * @return The corresponding UBL element
     */
    public static MinimumValueNumericType buildMinimumValueNumericType(Float numeric) {
    	MinimumValueNumericType minimumValueNumericType = null;
    	
    	if (numeric != null && !Float.isNaN(numeric)){
    		minimumValueNumericType = new MinimumValueNumericType();
        	minimumValueNumericType.setValue(new BigDecimal(numeric));
    	}
    	return minimumValueNumericType;
    }

    /**
     * The description of the level of the expected certification.
     *
     * Cardinality 0..n
     * 
     * @param levels The description of the level of the expected certification.
     *
     * @return The corresponding UBL element
     */
    public static List<CertificationLevelDescriptionType> buildCertificationLevelDescriptionTypes(List<String> levels) {
    	List<CertificationLevelDescriptionType> certificationLevelDescriptionTypes = null;
    	
    	if (levels != null && levels.size() > 0){
    		certificationLevelDescriptionTypes = new ArrayList<CertificationLevelDescriptionType>();
    		CertificationLevelDescriptionType certificationLevelDescriptionType = null;
    		for (String level : levels){
    			if (StringUtils.isNotBlank(level)){
	    			certificationLevelDescriptionType = new CertificationLevelDescriptionType();
	    			certificationLevelDescriptionType.setValue(level);
	    			certificationLevelDescriptionTypes.add(certificationLevelDescriptionType);
    			}
    		}
    		
    		if (certificationLevelDescriptionTypes.isEmpty()) {
    			certificationLevelDescriptionTypes = null;
    		}
    	}
    	return certificationLevelDescriptionTypes;
    }

    /**
     * Start date of a period.
     *
     * Cardinality 1
     *
     * @param startDate The start date {format YYYY-MM-DD}
     *
     * @return The corresponding UBL element
     */
    public static StartDateType buildStartDateType(Date startDate) {
        if (startDate == null) {
            return null;
        }
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        LocalDate localDate = LocalDate.parse(df.format(startDate), formatter);
        StartDateType startDateType = new StartDateType();
        startDateType.setValue(localDate);
        return startDateType;
    }

    /**
     * End date of a period.
     *
     * Cardinality 1
     *
     * @param endDate The end date {format YYYY-MM-DD}
     *
     * @return The corresponding UBL element
     */
    public static EndDateType buildEndDateType(Date endDate) {
        if (endDate == null) {
            return null;
        }
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        LocalDate localDate = LocalDate.parse(df.format(endDate), formatter);
        EndDateType endDateType = new EndDateType();
        endDateType.setValue(localDate);
        return endDateType;
    }

    /**
     * Information about a candidate statement that the contracting authority 
     * accepts as a sufficient response.
     *
     * Cardinality 0..n
     * 
     * @param candidates
     *
     * @return The corresponding UBL element
     */
    public static List<CandidateStatementType> buildCandidateStatementTypes(List<String> candidates) {
    	List<CandidateStatementType> candidateStatementTypes = null;
    	
    	if (candidates != null && candidates.size() > 0){
    		candidateStatementTypes = new ArrayList<CandidateStatementType>();
    		CandidateStatementType candidateStatementType = null;
    		for (String candidate : candidates){
    			if (StringUtils.isNotBlank(candidate)){
	    			candidateStatementType = new CandidateStatementType();
	    			candidateStatementType.setValue(candidate);
	    			candidateStatementTypes.add(candidateStatementType);
    			}
    		}
    		
    		if (candidateStatementTypes.isEmpty()) {
    			candidateStatementTypes = null;
    		}
    	}
    	return candidateStatementTypes;
    }

    /**
     * A code specifying the confidentiality level of this evidence.
     *
     * Cardinality 0..1
     *
     * @param confidentialityLevelCodeModel A code specifying the confidentiality level of this evidence.
     *
     * @return The corresponding UBL element
     */
    public static ConfidentialityLevelCodeType buildConfidentialityLevelCodeType(ConfidentialityLevelCodeModel confidentialityLevelCodeModel) {
    	ConfidentialityLevelCodeType confidentialityLevelCodeType = null;
    	
    	if (confidentialityLevelCodeModel != null && confidentialityLevelCodeModel.getConfidentialityLevel() != null
    			 && StringUtils.isNotBlank(confidentialityLevelCodeModel.getConfidentialityLevel().getCode())){
    		confidentialityLevelCodeType = new ConfidentialityLevelCodeType();
        	confidentialityLevelCodeType.setValue(confidentialityLevelCodeModel.getConfidentialityLevel().getCode());
        	if (StringUtils.isNotBlank(confidentialityLevelCodeModel.getListID())) {
        		confidentialityLevelCodeType.setListID(confidentialityLevelCodeModel.getListID());
        	}
        	if (StringUtils.isNotBlank(confidentialityLevelCodeModel.getListAgencyName())) {
        		confidentialityLevelCodeType.setListAgencyName(confidentialityLevelCodeModel.getListAgencyName());
        	}
        	if (StringUtils.isNotBlank(confidentialityLevelCodeModel.getListAgencyID())) {
        		confidentialityLevelCodeType.setListAgencyID(confidentialityLevelCodeModel.getListAgencyID());
        	}
        	if (StringUtils.isNotBlank(confidentialityLevelCodeModel.getListVersionID())) {
        		confidentialityLevelCodeType.setListVersionID(confidentialityLevelCodeModel.getListVersionID());
        	}
    	}
    	return confidentialityLevelCodeType;
    }

    /**
     * The number of people employed by the economic operator participating in the tender.
     *
     * Cardinality 0..1
     *
     * @param employeeQuantityModel Integer value expected.
     *
     * @return The corresponding UBL element
     */
    public static EmployeeQuantityType buildEmployeeQuantityType(EmployeeQuantityModel employeeQuantityModel) {
    	EmployeeQuantityType employeeQuantityType = null;
    	
    	if (employeeQuantityModel != null && employeeQuantityModel.getEmployeeQuantity() != null){
    		employeeQuantityType = new EmployeeQuantityType();
    		employeeQuantityType.setValue(new BigDecimal(employeeQuantityModel.getEmployeeQuantity()));
    	}

    	return employeeQuantityType;
    }

    /**
     * A monetary amount as a measure of this capability.
     *
     * Cardinality 0..1
     *
     * @param valueAmountModel
     *
     * @return The corresponding UBL element
     */
    public static ValueAmountType buildValueAmountType(ValueAmountModel valueAmountModel) {
    	ValueAmountType valueAmountType = null;
    	
    	if (valueAmountModel != null && valueAmountModel.getValueAmount() != null 
    			&& !Float.isNaN(valueAmountModel.getValueAmount())){
    		valueAmountType = new ValueAmountType();
    		valueAmountType.setValue(new BigDecimal(valueAmountModel.getValueAmount()));
    		if (StringUtils.isNotBlank(valueAmountModel.getCurrencyID())) {
        		valueAmountType.setCurrencyID(valueAmountModel.getCurrencyID());
        	}
    	}

    	return valueAmountType;
    }

    /**
     * Short description of role.
     *
     * Cardinality 0..n
     * 
     * @param descriptions Short description of role.
     *
     * @return The corresponding UBL element
     */
    public static List<RoleDescriptionType> buildRoleDescriptionTypes(List<String> roleDescriptions) {
    	List<RoleDescriptionType> roleDescriptionTypes = null;
    	
    	if (roleDescriptions != null && roleDescriptions.size() > 0){
    		roleDescriptionTypes = new ArrayList<RoleDescriptionType>();
    		RoleDescriptionType roleDescriptionType = null;
    		for (String roleDescription : roleDescriptions){
    			if (StringUtils.isNotBlank(roleDescription)){
	    			roleDescriptionType = new RoleDescriptionType();
	    			roleDescriptionType.setValue(roleDescription);
	    			roleDescriptionTypes.add(roleDescriptionType);
    			}
    		}
    		
    		if (roleDescriptionTypes.isEmpty()) {
    			roleDescriptionTypes = null;
    		}
    	}
    	return roleDescriptionTypes;
    }

    /**
     * Identifies the role of the economic operator in the bid.
     *
     * Cardinality 1
     * 
     * @param roleCodeModel The role of the economic operator.
     *
     * @return The corresponding UBL element
     */
    public static RoleCodeType buildRoleCodeType(RoleCodeModel roleCodeModel) {
    	RoleCodeType roleCodeType = null;
    	
    	if (roleCodeModel != null && roleCodeModel.getEoRoleType() != null
    			&& StringUtils.isNotBlank(roleCodeModel.getEoRoleType().getCode())){
    		roleCodeType = new RoleCodeType();
    		roleCodeType.setValue(roleCodeModel.getEoRoleType().getCode());
    		if (StringUtils.isNotBlank(roleCodeModel.getListID())) {
        		roleCodeType.setListID(roleCodeModel.getListID());
    		}
    		if (StringUtils.isNotBlank(roleCodeModel.getListAgencyName())) {
        		roleCodeType.setListAgencyName(roleCodeModel.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(roleCodeModel.getListAgencyID())) {
        		roleCodeType.setListAgencyID(roleCodeModel.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(roleCodeModel.getListVersionID())) {
        		roleCodeType.setListVersionID(roleCodeModel.getListVersionID());
    		}
    	}
    	return roleCodeType;
    }

    /**
     * Used to indicate whether the company is a micro, small, medium or large enterprise.
     *
     * Cardinality 0..1
     *
     * @param industryClassificationCodeModel A code specifying the size of the company. 
     *
     * @return The corresponding UBL element
     */
    public static IndustryClassificationCodeType buildIndustryClassificationCodeType(IndustryClassificationCodeModel industryClassificationCodeModel) {
    	IndustryClassificationCodeType industryClassificationCodeType = null;
    	
    	if (industryClassificationCodeModel != null && industryClassificationCodeModel.getEoIndustryClassificationCode() != null
    			&& StringUtils.isNotBlank(industryClassificationCodeModel.getEoIndustryClassificationCode().getCode())){
    		industryClassificationCodeType = new IndustryClassificationCodeType();
    		industryClassificationCodeType.setValue(industryClassificationCodeModel.getEoIndustryClassificationCode().getCode());
    		if (StringUtils.isNotBlank(industryClassificationCodeModel.getListID())) {
        		industryClassificationCodeType.setListID(industryClassificationCodeModel.getListID());
    		}
    		if (StringUtils.isNotBlank(industryClassificationCodeModel.getListAgencyName())) {
        		industryClassificationCodeType.setListAgencyName(industryClassificationCodeModel.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(industryClassificationCodeModel.getListAgencyID())) {
        		industryClassificationCodeType.setListAgencyID(industryClassificationCodeModel.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(industryClassificationCodeModel.getListVersionID())) {
        		industryClassificationCodeType.setListVersionID(industryClassificationCodeModel.getListVersionID());
    		}
    	}
    	return industryClassificationCodeType;
    }

    /**
     * Name of the natural person.
     *
     * Cardinality 1
     * 
     * @param firstName Name of the natural person.
     *
     * @return The corresponding UBL element
     */
    public static FirstNameType buildFirstNameType(String firstName) {
    	FirstNameType firstNameType = null;
    	
    	if (StringUtils.isNotBlank(firstName)){
    		firstNameType = new FirstNameType();
        	firstNameType.setValue(firstName);
        }
    	return firstNameType;
    }

    /**
     * Family Name of the natural person.
     *
     * Cardinality 1
     * 
     * @param familyName Family Name of the natural person.
     *
     * @return The corresponding UBL element
     */
    public static FamilyNameType buildFamilyNameType(String familyName) {
    	FamilyNameType familyNameType = null;
    	
    	if (StringUtils.isNotBlank(familyName)){
    		familyNameType = new FamilyNameType();
        	familyNameType.setValue(familyName);
        }
    	return familyNameType;
    }

    /**
     * Date of birth of the natural person.
     *
     * Cardinality 0..1
     *
     * @param birthDate The desired date {format yyyy-MM-dd}
     *
     * @return The corresponding UBL element
     */
    public static BirthDateType buildBirthDateType(Date birthDate) {
        if (birthDate == null) {
            return null;
        }
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        LocalDate localDate = LocalDate.parse(df.format(birthDate), formatter);
        BirthDateType birthDateType = new BirthDateType();
        birthDateType.setValue(localDate);
        return birthDateType;
    }

    /**
     * Place of birth of the natural person.
     *
     * Cardinality 0..1
     * 
     * @param birthplaceName Place of birth of the natural person.
     *
     * @return The corresponding UBL element
     */
    public static BirthplaceNameType buildBirthplaceNameType(String birthplaceName) {
    	BirthplaceNameType birthplaceNameType = null;
    	
    	if (StringUtils.isNotBlank(birthplaceName)){
    		birthplaceNameType = new BirthplaceNameType();
        	birthplaceNameType.setValue(birthplaceName);
    	}
    	return birthplaceNameType;
    }

    /**
     * A cross-reference to the criterion propertys which is validated thorugh this response expressed as an identifier.
     * 
     * Cardinality 1
     *
     * @param validatedCriterionPropertyIdModel The identifier of the criterion.
     *
     * @return The corresponding UBL element
     */
    public static ValidatedCriterionPropertyIDType buildValidatedCriterionPropertyIdType(IDModel validatedCriterionPropertyIdModel) {
    	ValidatedCriterionPropertyIDType validatedCriterionPropertyIDType = null;
    	
    	if (validatedCriterionPropertyIdModel != null && StringUtils.isNotBlank(validatedCriterionPropertyIdModel.getId())){
    		validatedCriterionPropertyIDType = new ValidatedCriterionPropertyIDType();
    		validatedCriterionPropertyIDType.setValue(validatedCriterionPropertyIdModel.getId());
    		if (StringUtils.isNotBlank(validatedCriterionPropertyIdModel.getSchemeID())) {
    			validatedCriterionPropertyIDType.setSchemeID(validatedCriterionPropertyIdModel.getSchemeID());
    		}
    		if (StringUtils.isNotBlank(validatedCriterionPropertyIdModel.getSchemeAgencyID())) {
    			validatedCriterionPropertyIDType.setSchemeAgencyID(validatedCriterionPropertyIdModel.getSchemeAgencyID());
    		}
    		if (StringUtils.isNotBlank(validatedCriterionPropertyIDType.getSchemeVersionID())) {
    			validatedCriterionPropertyIDType.setSchemeVersionID(validatedCriterionPropertyIdModel.getSchemeVersionID());
    		}
    	}
        return validatedCriterionPropertyIDType;
    }

    /**
     * An amount used as a reply to the criterion property.
     *
     * Cardinality 0..1
     *
     * @param responseAmountModel
     *
     * @return The corresponding UBL element
     */
    public static ResponseAmountType buildResponseAmountType(ResponseAmountModel responseAmountModel) {
    	ResponseAmountType responseAmountType = null;
    	
    	if (responseAmountModel != null && responseAmountModel.getResponseAmount() != null 
    			&& !Float.isNaN(responseAmountModel.getResponseAmount())){
    		responseAmountType = new ResponseAmountType();
    		responseAmountType.setValue(new BigDecimal(responseAmountModel.getResponseAmount()));
    		if (StringUtils.isNotBlank(responseAmountModel.getCurrencyID())) {
        		responseAmountType.setCurrencyID(responseAmountModel.getCurrencyID());
    		}
    	}

    	return responseAmountType;
    }

    /**
     * A code used as a reply to the criterion property.
     *
     * Cardinality 0..1
     *
     * @param responseCodeModel
     *
     * @return The corresponding UBL element
     */
    public static ResponseCodeType buildResponseCodeType(ResponseCodeModel responseCodeModel) {
    	ResponseCodeType responseCodeType = null;
    	
    	if (responseCodeModel != null && StringUtils.isNotBlank(responseCodeModel.getResponseCode())){
    		responseCodeType = new ResponseCodeType();
    		responseCodeType.setValue(responseCodeModel.getResponseCode());
    	}
    	return responseCodeType;
    }

    /**
     * A date used as a reply to the criterion property.
     *
     * Cardinality 0..1
     *
     * @param when The desired date {format yyyy-MM-dd}
     *
     * @return The corresponding UBL element
     */
    public static ResponseDateType buildResponseDateType(Date when) {
        if (when == null) {
            return null;
        }
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        LocalDate localDate = LocalDate.parse(df.format(when), formatter);
        ResponseDateType responseDateType = new ResponseDateType();
        responseDateType.setValue(localDate);
        return responseDateType;
    }

    /**
     * A time used as a reply to the criterion property.
     *
     * Cardinality 0..1
     *
     * @param when The desired time {format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'}
     *
     * @return The corresponding UBL element
     */
    public static ResponseTimeType buildResponseTimeType(Date when) {
        if (when == null) {
            return null;
        }
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        LocalTime localTime = LocalTime.parse(df.format(when), formatter);
        ResponseTimeType responseTimeType = new ResponseTimeType();
        responseTimeType.setValue(localTime);
        return responseTimeType;
    }

    /**
     * An identifier used as a reply to the criterion property.
     * 
     * Cardinality 0..1
     *
     * @param responseIdModel The identifier of the criterion property.
     *
     * @return The corresponding UBL element
     */
    public static ResponseIDType buildResponseIDType(ResponseIDModel responseIDModel) {
    	ResponseIDType responseIDType = null;
    	
    	if (responseIDModel != null && StringUtils.isNotBlank(responseIDModel.getResponseId())){
    		responseIDType = new ResponseIDType();
    		responseIDType.setValue(responseIDModel.getResponseId());
    		if (StringUtils.isNotBlank(responseIDModel.getSchemeID())) {
    			responseIDType.setSchemeID(responseIDModel.getSchemeID());
    		}
    		if (StringUtils.isNotBlank(responseIDModel.getSchemeAgencyID())) {
    			responseIDType.setSchemeAgencyID(responseIDModel.getSchemeAgencyID());
    		}
    		if (StringUtils.isNotBlank(responseIDModel.getSchemeVersionID())) {
    			responseIDType.setSchemeVersionID(responseIDModel.getSchemeVersionID());
    		}
    		responseIDType = initResponseIDType(responseIDType);
    	}
        return responseIDType;
    }

    /**
     * An indicator used as a reply to the criterion property.
     *  
     * Cardinality 0..1
     *
     * @param isResponseIndicator
     *
     * @return The corresponding UBL element
     */
    public static ResponseIndicatorType buildResponseIndicatorType(String isResponseIndicator) {
    	ResponseIndicatorType responseIndicatorType = null;
    	
    	if (StringUtils.isNotBlank(isResponseIndicator)){
    		responseIndicatorType = new ResponseIndicatorType();
        	responseIndicatorType.setValue(Boolean.parseBoolean(isResponseIndicator));
    	}
        return responseIndicatorType;
    }

    /**
     * A measure used as a reply to the criterion property.
     *
     * Cardinality 0..1
     *
     * @param numeric
     *
     * @return The corresponding UBL element
     */
    public static ResponseMeasureType buildResponseMeasureType(ResponseMeasureModel responseMeasureModel) {
    	ResponseMeasureType responseMeasureType = null;
    	
    	if (responseMeasureModel != null && responseMeasureModel.getResponseMeasure() != null 
    			&& !Float.isNaN(responseMeasureModel.getResponseMeasure())){
    		responseMeasureType = new ResponseMeasureType();
    		responseMeasureType.setValue(new BigDecimal(responseMeasureModel.getResponseMeasure()));
    		if (StringUtils.isNotBlank(responseMeasureModel.getUnitCode())) {
    			responseMeasureType.setUnitCode(responseMeasureModel.getUnitCode());
    		}
    	}
    	return responseMeasureType;
    }

    /**
     * A number used as a reply to the criterion property.
     *
     * Cardinality 0..1
     *
     * @param numeric
     *
     * @return The corresponding UBL element
     */
    public static ResponseNumericType buildResponseNumericType(Float numeric) {
    	ResponseNumericType responseNumericType = null;
    	
    	if (numeric != null && !Float.isNaN(numeric)){
    		responseNumericType = new ResponseNumericType();
    		responseNumericType.setValue(new BigDecimal(numeric));
    	}
    	return responseNumericType;
    }

    /**
     * A quantity used as a reply to the criterion property.
     *
     * Cardinality 0..1
     *
     * @param numeric
     *
     * @return The corresponding UBL element
     */
    public static ResponseQuantityType buildResponseQuantityType(ResponseQuantityModel responseQuantityModel) {
    	ResponseQuantityType responseQuantityType = null;
    	
    	if (responseQuantityModel != null && responseQuantityModel.getResponseQuantity() != null 
    			&& !Float.isNaN(responseQuantityModel.getResponseQuantity())){
    		responseQuantityType = new ResponseQuantityType();
    		responseQuantityType.setValue(new BigDecimal(responseQuantityModel.getResponseQuantity()));
    		if (StringUtils.isNotBlank(responseQuantityModel.getUnitCode())) {
    			responseQuantityType.setUnitCode(responseQuantityModel.getUnitCode());
    		}
    	}
    	return responseQuantityType;
    }

    /**
     * A URI used as a reply to the criterion property.
     *
     * Cardinality 0..1
     * 
     * @param responseUriModel The URI.
     *
     * @return The corresponding UBL element
     */
    public static ResponseURIType buildResponseUriType(UriModel responseUriModel) {
    	ResponseURIType responseUriType = null;
    	
    	if (responseUriModel != null && StringUtils.isNotBlank(responseUriModel.getUri())){
    		responseUriType = new ResponseURIType();
    		responseUriType.setValue(responseUriModel.getUri());
    	}
    	return responseUriType;
    }
    
}
