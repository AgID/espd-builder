package com.pccube.espd.factory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.pccube.espd.codelists.CdConfidentialityLevel;
import com.pccube.espd.codelists.CdCountryCodeIdentifier;
import com.pccube.espd.codelists.CdCriterionElementType;
import com.pccube.espd.codelists.CdDocRefContentType;
import com.pccube.espd.codelists.CdEOIndustryClassificationCode;
import com.pccube.espd.codelists.CdEORoleType;
import com.pccube.espd.codelists.CdEvaluationMethodType;
import com.pccube.espd.codelists.CdProcedureType;
import com.pccube.espd.codelists.CdProfileExecutionID;
import com.pccube.espd.codelists.CdProjectType;
import com.pccube.espd.codelists.CdPropertyGroupType;
import com.pccube.espd.codelists.CdQualificationApplicationType;
import com.pccube.espd.codelists.CdResponseDataType;
import com.pccube.espd.codelists.CdWeightingType;
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
import com.pccube.espd.model.QualificationApplicationRequestModel;
import com.pccube.espd.model.QualificationApplicationResponseModel;
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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CardinalityType;
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
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.FirstNameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IdentificationCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IndexType;
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

/**
 * Simple factory for creating simple BEAN elements that are shared between a 
 * {@link QualificationApplicationRequestModel} and {@link QualificationApplicationResponseModel}.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class BeanCommonBasicFactory extends GenericCommonFactory {

    public BeanCommonBasicFactory(EspdConfiguration espdConfiguration, VariableConfiguration variableConfiguration) {
		super(espdConfiguration, variableConfiguration);
		// TODO Auto-generated constructor stub
	}

	public static VersionIDModel buildUblVersionIDModel(UBLVersionIDType versionIDType) {
    	VersionIDModel ublVersionIDModel = null;
        
        if (versionIDType != null && StringUtils.isNotBlank(versionIDType.getValue())){
        	ublVersionIDModel = new VersionIDModel();
        	ublVersionIDModel.setUblVersion(versionIDType.getValue());
        	if (StringUtils.isNotBlank(versionIDType.getSchemeAgencyID())){ 
				ublVersionIDModel.setSchemeAgencyID(versionIDType.getSchemeAgencyID());
        	}
        }
        return ublVersionIDModel;
    }

    public static CustomizationIDModel buildCustomizationIDModel(CustomizationIDType customizationIDType) {
    	CustomizationIDModel customizationIDModel = null;
        
    	if (customizationIDType != null && StringUtils.isNotBlank(customizationIDType.getValue())){
    		customizationIDModel = new CustomizationIDModel();
    		customizationIDModel.setCustomizationID(customizationIDType.getValue());
    		if (StringUtils.isNotBlank(customizationIDType.getSchemeAgencyID())){
        		customizationIDModel.setSchemeAgencyID(customizationIDType.getSchemeAgencyID());
    		}
        	if (StringUtils.isNotBlank(customizationIDType.getSchemeVersionID())){
        		customizationIDModel.setSchemeVersionID(customizationIDType.getSchemeVersionID());
        	}
    	}
        return customizationIDModel;
    }
    
    public static ProfileIDModel buildProfileIDModel(ProfileIDType profileIDType) {
    	ProfileIDModel profileIDModel = null;
    	
    	if (profileIDType != null && StringUtils.isNotBlank(profileIDType.getValue())){
    		profileIDModel = new ProfileIDModel();
    		profileIDModel.setProfileID(profileIDType.getValue());
    		if (StringUtils.isNotBlank(profileIDType.getSchemeAgencyID())){
        		profileIDModel.setSchemeAgencyID(profileIDType.getSchemeAgencyID());
    		}
    		if (StringUtils.isNotBlank(profileIDType.getSchemeVersionID())){
        		profileIDModel.setSchemeVersionID(profileIDType.getSchemeVersionID());
    		}
    	}
        return profileIDModel;
    }
    
    public static ProfileExecutionIDModel buildProfileExecutionIDModel(ProfileExecutionIDType profileExecutionIDType) {
    	ProfileExecutionIDModel profileExecutionIDModel = null;
    	
    	if (profileExecutionIDType != null && StringUtils.isNotBlank(profileExecutionIDType.getValue())){
    		CdProfileExecutionID cdProfileExecutionID = new CdProfileExecutionID();
    		cdProfileExecutionID.setCode(profileExecutionIDType.getValue());
    		
    		profileExecutionIDModel = new ProfileExecutionIDModel();
    		profileExecutionIDModel.setProfileExecutionID(cdProfileExecutionID);
    		if (StringUtils.isNotBlank(profileExecutionIDType.getSchemeID())){
        		profileExecutionIDModel.setSchemeID(profileExecutionIDType.getSchemeID());
    		}
    		if (StringUtils.isNotBlank(profileExecutionIDType.getSchemeAgencyName())){
        		profileExecutionIDModel.setSchemeAgencyName(profileExecutionIDType.getSchemeAgencyName());
    		}
    		if (StringUtils.isNotBlank(profileExecutionIDType.getSchemeAgencyID())){
        		profileExecutionIDModel.setSchemeAgencyID(profileExecutionIDType.getSchemeAgencyID());
    		}
    		if (StringUtils.isNotBlank(profileExecutionIDType.getSchemeVersionID())){
        		profileExecutionIDModel.setSchemeVersionID(profileExecutionIDType.getSchemeVersionID());
    		}
    	}
        return profileExecutionIDModel;
    }
    
    public static IDModel buildIdModel(IDType idType) {
    	IDModel idModel = null;
    	
    	if (idType != null && StringUtils.isNotBlank(idType.getValue())){
    		idModel = new IDModel();
    		idModel.setId(idType.getValue());
    		if (StringUtils.isNotBlank(idType.getSchemeAgencyID())){
    			idModel.setSchemeAgencyID(idType.getSchemeAgencyID());
    		}
    		if (StringUtils.isNotBlank(idType.getSchemeID())){
    			idModel.setSchemeID(idType.getSchemeID());
    		}
    		if (StringUtils.isNotBlank(idType.getSchemeVersionID())){
    			idModel.setSchemeVersionID(idType.getSchemeVersionID());
    		}
    	}
        return idModel;
    }

    public static boolean buildCopyIndicator(CopyIndicatorType copyIndicatorType) {
        boolean isCopy = false;
        
        if (copyIndicatorType != null){
        	isCopy = copyIndicatorType.isValue();
        }
        return isCopy;
    }
    
    public static UUIDModel buildUuidModel(UUIDType uuidType) {
    	UUIDModel uuidModel = null;
    	
    	if (uuidType != null && StringUtils.isNotBlank(uuidType.getValue())){
    		uuidModel = new UUIDModel();
    		uuidModel.setUuid(uuidType.getValue());
    		if (StringUtils.isNotBlank(uuidType.getSchemeID())){
    			uuidModel.setSchemeID(uuidType.getSchemeID());
    		}
    		if (StringUtils.isNotBlank(uuidType.getSchemeAgencyName())){
    			uuidModel.setSchemeAgencyName(uuidType.getSchemeAgencyName());
    		}
    		if (StringUtils.isNotBlank(uuidType.getSchemeAgencyID())){
    			uuidModel.setSchemeAgencyID(uuidType.getSchemeAgencyID());
    		}
    		if (StringUtils.isNotBlank(uuidType.getSchemeVersionID())){
    			uuidModel.setSchemeVersionID(uuidType.getSchemeVersionID());
    		}
    	}
        return uuidModel;
    }
    
    public static ContractFolderIDModel buildContractFolderIDModel(ContractFolderIDType contractFolderIDType) {
    	ContractFolderIDModel contractFolderIDModel = null;
    	
    	if (contractFolderIDType != null && StringUtils.isNotBlank(contractFolderIDType.getValue())){
    		contractFolderIDModel = new ContractFolderIDModel();
    		contractFolderIDModel.setReferenceNumber(contractFolderIDType.getValue());
    		if (StringUtils.isNotBlank(contractFolderIDType.getSchemeAgencyID())){
        		contractFolderIDModel.setSchemeAgencyID(contractFolderIDType.getSchemeAgencyID());
    		}
    	}
        return contractFolderIDModel;
    }
    
    public static Date buildDate(IssueDateType issueDateType) throws ParseException {
        if (issueDateType == null || issueDateType.getValue() == null) {
            return null;
        }
        Instant instant = issueDateType.getValue().atStartOfDay().toInstant(ZoneOffset.UTC);
        Date date = Date.from(instant);
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return (isInit) ? null : dateFormat.parse(dateFormat.format(date));
    }
    
    public static Date buildTime(IssueTimeType issueTimeType) throws ParseException {
        if (issueTimeType == null || issueTimeType.getValue() == null) {
            return null;
        }
        Instant instant = issueTimeType.getValue().atDate(LocalDate.now()).toInstant(ZoneOffset.UTC);
        Date date = Date.from(instant);
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return dateFormat.parse(dateFormat.format(date));
    }
    
    public static VersionIDModel buildVersionIDModel(VersionIDType versionIDType) {
    	VersionIDModel versionIDModel = null;
    	
    	if (versionIDType != null && StringUtils.isNotBlank(versionIDType.getValue())){
    		versionIDModel = new VersionIDModel();
    		versionIDModel.setVersionID(versionIDType.getValue());
    		if (StringUtils.isNotBlank(versionIDType.getSchemeAgencyID())){
    			versionIDModel.setSchemeAgencyID(versionIDType.getSchemeAgencyID());
    		}
    		if (StringUtils.isNotBlank(versionIDType.getSchemeVersionID())){
    			versionIDModel.setSchemeVersionID(versionIDType.getSchemeVersionID());
    		}
    	}
        return versionIDModel;
    }
    
    public static VersionIDModel buildPreviousVersionIDModel(PreviousVersionIDType previousVersionIDType) {
    	VersionIDModel previousVersionIDModel = null;
    	
    	if (previousVersionIDType != null && StringUtils.isNotBlank(previousVersionIDType.getValue())){
    		previousVersionIDModel = new VersionIDModel();
    		previousVersionIDModel.setPreviousVersionID(previousVersionIDType.getValue());
    	}
        return previousVersionIDModel;
    }
    
    public static ProcedureCodeModel buildProcedureCodeModel(ProcedureCodeType procedureCodeType) {
    	ProcedureCodeModel procedureCodeModel = null;
    	
    	if (procedureCodeType != null && StringUtils.isNotBlank(procedureCodeType.getValue())){
    		CdProcedureType cdProcedureType = new CdProcedureType();
    		cdProcedureType.setCode(procedureCodeType.getValue());
    		
    		procedureCodeModel = new ProcedureCodeModel();
    		procedureCodeModel.setProcedureType(cdProcedureType);
    		if (StringUtils.isNotBlank(procedureCodeType.getListID())){
        		procedureCodeModel.setListID(procedureCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(procedureCodeType.getListAgencyName())){
        		procedureCodeModel.setListAgencyName(procedureCodeType.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(procedureCodeType.getListAgencyID())){
        		procedureCodeModel.setListAgencyID(procedureCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(procedureCodeType.getListVersionID())){
        		procedureCodeModel.setListVersionID(procedureCodeType.getListVersionID());
    		}
    	}
    	return procedureCodeModel;
    }

    public static QualificationApplicationTypeCodeModel buildQualificationApplicationTypeCodeModel(QualificationApplicationTypeCodeType qualificationApplicationTypeCodeType) {
    	QualificationApplicationTypeCodeModel qualificationApplicationTypeCodeModel = null;
    	
    	if (qualificationApplicationTypeCodeType != null && StringUtils.isNotBlank(qualificationApplicationTypeCodeType.getValue())){
    		CdQualificationApplicationType cdQualificationApplicationType = new CdQualificationApplicationType();
    		cdQualificationApplicationType.setCode(qualificationApplicationTypeCodeType.getValue());
    		
    		qualificationApplicationTypeCodeModel = new QualificationApplicationTypeCodeModel();
    		qualificationApplicationTypeCodeModel.setQualificationApplicationType(cdQualificationApplicationType);
    		if (StringUtils.isNotBlank(qualificationApplicationTypeCodeType.getListID())){
        		qualificationApplicationTypeCodeModel.setListID(qualificationApplicationTypeCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(qualificationApplicationTypeCodeType.getListAgencyName())){
        		qualificationApplicationTypeCodeModel.setListAgencyName(qualificationApplicationTypeCodeType.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(qualificationApplicationTypeCodeType.getListAgencyID())){
        		qualificationApplicationTypeCodeModel.setListAgencyID(qualificationApplicationTypeCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(qualificationApplicationTypeCodeType.getListVersionID())){
        		qualificationApplicationTypeCodeModel.setListVersionID(qualificationApplicationTypeCodeType.getListVersionID());
    		}
    	}
    	return qualificationApplicationTypeCodeModel;
    }

    public static WeightingTypeCodeModel buildWeightingTypeCodeModel(WeightingTypeCodeType weightingTypeCodeType) {
    	WeightingTypeCodeModel weightingTypeCodeModel = null;
    	
    	if (weightingTypeCodeType != null && StringUtils.isNotBlank(weightingTypeCodeType.getValue())){
    		CdWeightingType cdWeightingType = new CdWeightingType();
    		cdWeightingType.setCode(weightingTypeCodeType.getValue());
    		
    		weightingTypeCodeModel = new WeightingTypeCodeModel();
    		weightingTypeCodeModel.setWeightingType(cdWeightingType);
    		if (StringUtils.isNotBlank(weightingTypeCodeType.getListID())){
        		weightingTypeCodeModel.setListID(weightingTypeCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(weightingTypeCodeType.getListAgencyName())){
        		weightingTypeCodeModel.setListAgencyName(weightingTypeCodeType.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(weightingTypeCodeType.getListAgencyID())){
        		weightingTypeCodeModel.setListAgencyID(weightingTypeCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(weightingTypeCodeType.getListVersionID())){
        		weightingTypeCodeModel.setListVersionID(weightingTypeCodeType.getListVersionID());
    		}
    	}
    	return weightingTypeCodeModel;
    }
    
    public static List<String> buildWeightScoringMethodologyNotes(List<WeightScoringMethodologyNoteType> weightScoringMethodologyNoteTypes) {
    	List<String> weightScoringMethodologyNotes = null;
    	
    	if (weightScoringMethodologyNoteTypes != null && weightScoringMethodologyNoteTypes.size() > 0){
    		weightScoringMethodologyNotes = new ArrayList<String>();
    		for (WeightScoringMethodologyNoteType weightScoringMethodologyNoteType : weightScoringMethodologyNoteTypes){
    			if (StringUtils.isNotBlank(weightScoringMethodologyNoteType.getValue())){
    				weightScoringMethodologyNotes.add(weightScoringMethodologyNoteType.getValue());
    			}
    		}
    		
    		if (weightScoringMethodologyNotes.isEmpty()) { 
    			weightScoringMethodologyNotes = null;
    		}
    	}
    	return weightScoringMethodologyNotes;
    }
    
    public static WebsiteUriModel buildWebsiteURIModel(WebsiteURIType websiteURIType) {
    	WebsiteUriModel websiteUriModel = null;
    	
    	if (websiteURIType != null && StringUtils.isNotBlank(websiteURIType.getValue())){
    		websiteUriModel = new WebsiteUriModel();
    		websiteUriModel.setWebsiteUri(websiteURIType.getValue());
    	}
    	return websiteUriModel;
    }
    
    public static EndPointIDModel buildEndpointIDModel(EndpointIDType endpointIDType) {
    	EndPointIDModel endpointIDModel = null;
    	
    	if (endpointIDType != null && StringUtils.isNotBlank(endpointIDType.getValue())){
    		endpointIDModel = new EndPointIDModel();
    		endpointIDModel.setEndPointID(endpointIDType.getValue());
    		if (StringUtils.isNotBlank(endpointIDType.getSchemeID())){
        		endpointIDModel.setSchemeID(endpointIDType.getSchemeID());
    		}
    		if (StringUtils.isNotBlank(endpointIDType.getSchemeAgencyID())){
        		endpointIDModel.setSchemeAgencyID(endpointIDType.getSchemeAgencyID());
    		}
    	}
    	return endpointIDModel;
    }

    public static BuyerProfileUriModel buildBuyerProfileURIModel(BuyerProfileURIType buyerProfileURIType) {
    	BuyerProfileUriModel buyerProfileUriModel = null;
    	
    	if (buyerProfileURIType != null && StringUtils.isNotBlank(buyerProfileURIType.getValue())){
    		buyerProfileUriModel = new BuyerProfileUriModel();
    		buyerProfileUriModel.setBuyerProfileUri(buyerProfileURIType.getValue());
    	}
    	return buyerProfileUriModel;
    }

    public static String buildName(NameType nameType) {
    	String name = StringUtils.EMPTY;
        
        if (nameType != null){
        	name = nameType.getValue();
        }
        return name;
    }

    public static List<String> buildNames(List<NameType> nameTypes) {
    	List<String> names = null;
        
        if (nameTypes != null && nameTypes.size() > 0){
        	names = new ArrayList<String>();
        	String name = null;
    		for (NameType nameType : nameTypes){
    			name = buildName(nameType);
    			if (StringUtils.isNotBlank(name)){
    				names.add(name);
    			}
    		}
    		
    		if (names.isEmpty()) {
    			names = null;
    		}
        }
        return names;
    }
    
    public static String buildStreetName(StreetNameType streetNameType) {
    	String streetName = StringUtils.EMPTY;
        
        if (streetNameType != null){
        	streetName = streetNameType.getValue();
        }
        return streetName;
    }

    public static String buildCityName(CityNameType cityNameType) {
    	String cityName = StringUtils.EMPTY;
        
        if (cityNameType != null){
        	cityName = cityNameType.getValue();
        }
        return cityName;
    }
    
    public static String buildPostalZone(PostalZoneType postalZoneType) {
    	String postalZone = StringUtils.EMPTY;
        
        if (postalZoneType != null){
        	postalZone = postalZoneType.getValue();
        }
        return postalZone;
    }
    
    public static IdentificationCodeModel buildIdentificationCodeModel(IdentificationCodeType identificationCodeType) {
    	IdentificationCodeModel identificationCodeModel = null;
    	
    	if (identificationCodeType != null && StringUtils.isNotBlank(identificationCodeType.getValue())){
    		CdCountryCodeIdentifier cdCountryCodeIdentifier = new CdCountryCodeIdentifier();
    		cdCountryCodeIdentifier.setCode(identificationCodeType.getValue());
    		
    		identificationCodeModel = new IdentificationCodeModel();
    		identificationCodeModel.setCountryCodeIdentifier(cdCountryCodeIdentifier);
    		if (StringUtils.isNotBlank(identificationCodeType.getListID())){
        		identificationCodeModel.setListID(identificationCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(identificationCodeType.getListAgencyName())){
        		identificationCodeModel.setListAgencyName(identificationCodeType.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(identificationCodeType.getListAgencyID())){
        		identificationCodeModel.setListAgencyID(identificationCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(identificationCodeType.getListVersionID())){
        		identificationCodeModel.setListVersionID(identificationCodeType.getListVersionID());
    		}
    	}
    	return identificationCodeModel;
    }

    public static String buildTelephone(TelephoneType telephoneType) {
    	String telephone = StringUtils.EMPTY;
        
        if (telephoneType != null){
        	telephone = telephoneType.getValue();
        }
        return telephone;
    }

    public static String buildTelefax(TelefaxType telefaxType) {
    	String telefax = StringUtils.EMPTY;
        
        if (telefaxType != null){
        	telefax = telefaxType.getValue();
        }
        return telefax;
    }

    public static String buildElectronicMail(ElectronicMailType eMailType) {
    	String email = StringUtils.EMPTY;
        
        if (eMailType != null){
        	email = eMailType.getValue();
        }
        return email;
    }

    public static DescriptionModel buildDescriptionModel(DescriptionType descriptionType) {
    	DescriptionModel descriptionModel = null;
        
        if (descriptionType != null){
        	descriptionModel = new DescriptionModel();
        	descriptionModel.setDescription(descriptionType.getValue());
        	if (StringUtils.isNotBlank(descriptionType.getLanguageID())){
        		descriptionModel.setLanguageID(descriptionType.getLanguageID());
        	}
        }
        return descriptionModel;
    }

    public static List<DescriptionModel> buildDescriptionModels(List<DescriptionType> descriptionTypes) {
    	List<DescriptionModel> descriptionModels = null;
        
        if (descriptionTypes != null && descriptionTypes.size() > 0){
        	descriptionModels = new ArrayList<DescriptionModel>();
        	DescriptionModel descriptionModel = null;
    		for (DescriptionType descriptionType : descriptionTypes){
    			descriptionModel = buildDescriptionModel(descriptionType);
    			descriptionModels.add(descriptionModel);
    		}
    		
    		if (descriptionModels.isEmpty()) {
    			descriptionModels = null;
    		}
        }
        return descriptionModels;
    }
    
    public static ProcurementTypeCodeModel buildProcurementTypeCodeModel(ProcurementTypeCodeType procurementTypeCodeType) {
    	ProcurementTypeCodeModel procurementTypeCodeModel = null;
    	
    	if (procurementTypeCodeType != null && StringUtils.isNotBlank(procurementTypeCodeType.getValue())){
    		CdProjectType cdProjectType = new CdProjectType();
    		cdProjectType.setCode(procurementTypeCodeType.getValue());
    		
    		procurementTypeCodeModel = new ProcurementTypeCodeModel();
    		procurementTypeCodeModel.setProjectType(cdProjectType);
    		if (StringUtils.isNotBlank(procurementTypeCodeType.getListID())){
        		procurementTypeCodeModel.setListID(procurementTypeCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(procurementTypeCodeType.getListAgencyName())){
        		procurementTypeCodeModel.setListAgencyName(procurementTypeCodeType.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(procurementTypeCodeType.getListAgencyID())){
        		procurementTypeCodeModel.setListAgencyID(procurementTypeCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(procurementTypeCodeType.getListVersionID())){
        		procurementTypeCodeModel.setListVersionID(procurementTypeCodeType.getListVersionID());
    		}
    	}
    	return procurementTypeCodeModel;
    }
    
    public static ItemClassificationCodeModel buildItemClassificationCodeModel(ItemClassificationCodeType itemClassificationCodeType) {
    	ItemClassificationCodeModel itemClassificationCodeModel = null;
    	
    	if (itemClassificationCodeType != null && StringUtils.isNotBlank(itemClassificationCodeType.getValue())){
    		itemClassificationCodeModel = new ItemClassificationCodeModel();
    		itemClassificationCodeModel.setItemClassificationCode(itemClassificationCodeType.getValue());
    		if (StringUtils.isNotBlank(itemClassificationCodeType.getName())){
    			itemClassificationCodeModel.setName(itemClassificationCodeType.getName());
    		}
    	}
    	return itemClassificationCodeModel;
    }
    
    public static DocumentTypeCodeModel buildDocumentTypeCodeModel(DocumentTypeCodeType documentTypeCodeType) {
    	DocumentTypeCodeModel documentTypeCodeModel = null;
    	
    	if (documentTypeCodeType != null && StringUtils.isNotBlank(documentTypeCodeType.getValue())){
    		CdDocRefContentType cdDocRefContentType = new CdDocRefContentType();
    		cdDocRefContentType.setCode(documentTypeCodeType.getValue());
    		
    		documentTypeCodeModel = new DocumentTypeCodeModel();
    		documentTypeCodeModel.setDocRefContentType(cdDocRefContentType);
    		if (StringUtils.isNotBlank(documentTypeCodeType.getListID())){
        		documentTypeCodeModel.setListID(documentTypeCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(documentTypeCodeType.getListAgencyName())){
        		documentTypeCodeModel.setListAgencyName(documentTypeCodeType.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(documentTypeCodeType.getListAgencyID())){
        		documentTypeCodeModel.setListAgencyID(documentTypeCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(documentTypeCodeType.getListVersionID())){
        		documentTypeCodeModel.setListVersionID(documentTypeCodeType.getListVersionID());
    		}
    	}
    	return documentTypeCodeModel;
    }
    
    public static DocumentTypeModel buildDocumentTypeModel(DocumentTypeType documentTypeType) {
    	DocumentTypeModel documentTypeModel = null;
    	
		if (documentTypeType != null && StringUtils.isNotBlank(documentTypeType.getValue())){
			documentTypeModel = new DocumentTypeModel();
			documentTypeModel.setDocumentType(documentTypeType.getValue());
			if (StringUtils.isNotBlank(documentTypeType.getLanguageID())){
        		documentTypeModel.setLanguageID(documentTypeType.getLanguageID());
			}
		}
    	return documentTypeModel;
    }
    
    public static UriModel buildUriModel(URIType uriType) {
    	UriModel uriModel = null;
    	
    	if (uriType != null && StringUtils.isNotBlank(uriType.getValue())){
    		uriModel = new UriModel();
    		uriModel.setUri(uriType.getValue());
    		if (StringUtils.isNotBlank(uriType.getSchemeAgencyID())){
    			uriModel.setSchemeAgencyID(uriType.getSchemeAgencyID());
    		}
    	}
    	return uriModel;
    }
    
    public static List<UriModel> buildUriModels(List<URIType> uriTypes) {
    	List<UriModel> uriModels = null;
    	
    	if (uriTypes != null && uriTypes.size() > 0){
    		uriModels = new ArrayList<UriModel>();
    		for (URIType uriType : uriTypes){
    			UriModel uriModel = BeanCommonBasicFactory.buildUriModel(uriType);
    			if (uriModel != null){
    				uriModels.add(uriModel);
    			}
    		}
    		
    		if (uriModels.isEmpty()) {
    			uriModels = null;
    		}
    	}
    	return uriModels;
    }
    
    public static List<String> buildArticles(List<ArticleType> articleTypes) {
    	List<String> articles = null;
    	
    	if (articleTypes != null && articleTypes.size() > 0){
    		articles = new ArrayList<String>();
    		for (ArticleType articleType : articleTypes){
    			if (StringUtils.isNotBlank(articleType.getValue())){
        			articles.add(articleType.getValue());
    			}
    		}
    		
    		if (articles.isEmpty()) {
    			articles = null;
    		}
    	}
    	return articles;
    }
    
    public static List<String> buildJurisdictionLevels(List<JurisdictionLevelType> jurisdictionLevelTypes) {
    	List<String> jurisdictionLevels = null;
    	
    	if (jurisdictionLevelTypes != null && jurisdictionLevelTypes.size() > 0){
    		jurisdictionLevels = new ArrayList<String>();
    		for (JurisdictionLevelType jurisdictionLevelType : jurisdictionLevelTypes){
    			if (StringUtils.isNotBlank(jurisdictionLevelType.getValue())){
        			jurisdictionLevels.add(jurisdictionLevelType.getValue());
    			}
    		}
    		
    		if (jurisdictionLevels.isEmpty()) {
    			jurisdictionLevels = null;
    		}
    	}
    	return jurisdictionLevels;
    }
    
    public static List<String> buildTitles(List<TitleType> titleTypes) {
    	List<String> titles = null;
    	
    	if (titleTypes != null && titleTypes.size() > 0){
    		titles = new ArrayList<String>();
    		for (TitleType titleType : titleTypes){
    			if (StringUtils.isNotBlank(titleType.getValue())) {
        			titles.add(titleType.getValue());
    			}
    		}
    		
    		if (titles.isEmpty()) {
    			titles = null;
    		}
    	}
    	return titles;
    }
    
    public static Date buildStartDate(StartDateType startDateType) throws ParseException {
        if (startDateType == null || startDateType.getValue() == null) {
            return null;
        }
        Instant instant = startDateType.getValue().atStartOfDay().toInstant(ZoneOffset.UTC);
        Date date = Date.from(instant);
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return (isInit) ? null : dateFormat.parse(dateFormat.format(date));
    }
    
    public static Date buildEndDate(EndDateType endDateType) throws ParseException {
        if (endDateType == null || endDateType.getValue() == null) {
            return null;
        }
        Instant instant = endDateType.getValue().atStartOfDay().toInstant(ZoneOffset.UTC);
        Date date = Date.from(instant);
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return (isInit) ? null : dateFormat.parse(dateFormat.format(date));
    }
    
    public static PropertyGroupTypeCodeModel buildPropertyGroupTypeCodeModel(PropertyGroupTypeCodeType propertyGroupTypeCodeType) {
    	PropertyGroupTypeCodeModel propertyGroupTypeCodeModel = null;
    	
    	if (propertyGroupTypeCodeType != null && StringUtils.isNotBlank(propertyGroupTypeCodeType.getValue())){
    		CdPropertyGroupType cdPropertyGroupType = new CdPropertyGroupType();
    		cdPropertyGroupType.setCode(propertyGroupTypeCodeType.getValue());
    		
    		propertyGroupTypeCodeModel = new PropertyGroupTypeCodeModel();
    		propertyGroupTypeCodeModel.setPropertyGroupType(cdPropertyGroupType);
    		if (StringUtils.isNotBlank(propertyGroupTypeCodeType.getListID())) {
        		propertyGroupTypeCodeModel.setListID(propertyGroupTypeCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(propertyGroupTypeCodeType.getListAgencyName())) {
        		propertyGroupTypeCodeModel.setListAgencyName(propertyGroupTypeCodeType.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(propertyGroupTypeCodeType.getListAgencyID())) {
        		propertyGroupTypeCodeModel.setListAgencyID(propertyGroupTypeCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(propertyGroupTypeCodeType.getListVersionID())) {
        		propertyGroupTypeCodeModel.setListVersionID(propertyGroupTypeCodeType.getListVersionID());
    		}
    	}
    	return propertyGroupTypeCodeModel;
    }
    
    public static CriterionTypeCodeModel buildCriterionTypeCodeModel(CriterionTypeCodeType criterionTypeCodeType) {
    	CriterionTypeCodeModel criterionTypeCodeModel = null;
    	
    	if (criterionTypeCodeType != null && StringUtils.isNotBlank(criterionTypeCodeType.getValue())){
    		CdCriterionElementType cdCriterionElementType = new CdCriterionElementType();
    		cdCriterionElementType.setCode(criterionTypeCodeType.getValue());
    		
    		criterionTypeCodeModel = new CriterionTypeCodeModel();
    		criterionTypeCodeModel.setCriterionElementType(cdCriterionElementType);
    		if (StringUtils.isNotBlank(criterionTypeCodeType.getListID())) {
        		criterionTypeCodeModel.setListID(criterionTypeCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(criterionTypeCodeType.getListAgencyName())) {
        		criterionTypeCodeModel.setListAgencyName(criterionTypeCodeType.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(criterionTypeCodeType.getListAgencyID())) {
        		criterionTypeCodeModel.setListAgencyID(criterionTypeCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(criterionTypeCodeType.getListVersionID())) {
        		criterionTypeCodeModel.setListVersionID(criterionTypeCodeType.getListVersionID());
    		}
    	}
    	return criterionTypeCodeModel;
    }
    
    public static CriterionTypeCodeModel buildTypeCodeModel(TypeCodeType typeCodeType) {
    	CriterionTypeCodeModel typeCodeModel = null;
    	
    	if (typeCodeType != null && StringUtils.isNotBlank(typeCodeType.getValue())){
    		CdCriterionElementType cdCriterionElementType = new CdCriterionElementType();
    		cdCriterionElementType.setCode(typeCodeType.getValue());
    		
    		typeCodeModel = new CriterionTypeCodeModel();
    		typeCodeModel.setCriterionElementType(cdCriterionElementType);
    		if (StringUtils.isNotBlank(typeCodeType.getListID())) {
        		typeCodeModel.setListID(typeCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(typeCodeType.getListAgencyName())) {
        		typeCodeModel.setListAgencyName(typeCodeType.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(typeCodeType.getListAgencyID())) {
        		typeCodeModel.setListAgencyID(typeCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(typeCodeType.getListVersionID())) {
        		typeCodeModel.setListVersionID(typeCodeType.getListVersionID());
    		}
    	}
    	return typeCodeModel;
    }
    
    public static ResponseCodeTypeModel buildResponseCodeTypeModel(ValueDataTypeCodeType valueDataTypeCodeType) {
    	ResponseCodeTypeModel responseCodeTypeModel = null;
    	
    	if (valueDataTypeCodeType != null && StringUtils.isNotBlank(valueDataTypeCodeType.getValue())){
    				
    		CdResponseDataType cdResponseDataType = new CdResponseDataType();
    		cdResponseDataType.setCode(valueDataTypeCodeType.getValue());
    		
    		responseCodeTypeModel = new ResponseCodeTypeModel();
    		responseCodeTypeModel.setResponseDataType(cdResponseDataType);
    		if (StringUtils.isNotBlank(valueDataTypeCodeType.getListID())) {
        		responseCodeTypeModel.setListID(valueDataTypeCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(valueDataTypeCodeType.getListAgencyName())) {
        		responseCodeTypeModel.setListAgencyName(valueDataTypeCodeType.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(valueDataTypeCodeType.getListAgencyID())){
        		responseCodeTypeModel.setListAgencyID(valueDataTypeCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(valueDataTypeCodeType.getListVersionID())){
        		responseCodeTypeModel.setListVersionID(valueDataTypeCodeType.getListVersionID());
    		}
    	}
    	return responseCodeTypeModel;
    }
    
    public static ValueUnitCodeModel buildValueUnitCodeModel(ValueUnitCodeType valueUnitCodeType) {
    	ValueUnitCodeModel valueUnitCodeModel = null;
    	
    	if (valueUnitCodeType != null && StringUtils.isNotBlank(valueUnitCodeType.getValue())){
    		valueUnitCodeModel = new ValueUnitCodeModel();
    		valueUnitCodeModel.setValueUnitCode(valueUnitCodeType.getValue());
    	}
    	return valueUnitCodeModel;
    }
    
    public static ValueCurrencyCodeModel buildValueCurrencyCodeModel(ValueCurrencyCodeType valueCurrencyCodeType) {
    	ValueCurrencyCodeModel valueCurrencyCodeModel = null;
    	
    	if (valueCurrencyCodeType != null && StringUtils.isNotBlank(valueCurrencyCodeType.getValue())){
    		valueCurrencyCodeModel = new ValueCurrencyCodeModel();
    		valueCurrencyCodeModel.setValueCurrencyCode(valueCurrencyCodeType.getValue());
    	}
    	return valueCurrencyCodeModel;
    }
    
    public static ExpectedAmountModel buildExpectedAmountModel(ExpectedAmountType expectedAmountType) {
    	ExpectedAmountModel expectedAmountModel = null;
    	
    	if (expectedAmountType != null && (isInit || (expectedAmountType.getValue() != null 
    			&& !Float.isNaN(expectedAmountType.getValue().floatValue())))){
    		expectedAmountModel = new ExpectedAmountModel();
    		expectedAmountModel.setExpectedAmount((isInit) ? null : expectedAmountType.getValue().floatValue());
    		if (StringUtils.isNotBlank(expectedAmountType.getCurrencyID())) {
        		expectedAmountModel.setCurrencyID(expectedAmountType.getCurrencyID());
    		}
    	}

    	return expectedAmountModel;
    }
    
    public static ExpectedIDModel buildExpectedIDModel(ExpectedIDType expectedIDType) {
    	ExpectedIDModel expectedIDModel = null;
    	
    	if (expectedIDType != null && (isInit || StringUtils.isNotBlank(expectedIDType.getValue()))){
    		expectedIDModel = new ExpectedIDModel();
    		expectedIDModel.setExpectedID((isInit) ? null : expectedIDType.getValue());
    		expectedIDModel = initExpectedIDModel(expectedIDModel);
    		if (StringUtils.isNotBlank(expectedIDType.getSchemeID())) {
    			expectedIDModel.setSchemeID(expectedIDType.getSchemeID());
    		}
    		if (StringUtils.isNotBlank(expectedIDType.getSchemeAgencyID())){
    			expectedIDModel.setSchemeAgencyID(expectedIDType.getSchemeAgencyID());
    		}
    		if (StringUtils.isNotBlank(expectedIDType.getSchemeVersionID())){
    			expectedIDModel.setSchemeVersionID(expectedIDType.getSchemeVersionID());
    		}
    	}
    	return expectedIDModel;
    }

    public static ExpectedCodeModel buildExpectedCodeModel(ExpectedCodeType expectedCodeType) {
    	ExpectedCodeModel expectedCodeModel = null;
    	
    	if (expectedCodeType != null && (isInit || StringUtils.isNotBlank(expectedCodeType.getValue()))){
    		expectedCodeModel = new ExpectedCodeModel();
    		expectedCodeModel.setExpectedCode((isInit) ? null : expectedCodeType.getValue());
    		if (StringUtils.isNotBlank(expectedCodeType.getListID())){
    			expectedCodeModel.setListID(expectedCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(expectedCodeType.getListAgencyID())){
    			expectedCodeModel.setListAgencyID(expectedCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(expectedCodeType.getListVersionID())){
    			expectedCodeModel.setListVersionID(expectedCodeType.getListVersionID());
    		}
    	}
    	return expectedCodeModel;
    }

    public static String buildExpectedDescription(ExpectedDescriptionType expectedDescriptionType) {
    	String description = StringUtils.EMPTY;
        
        if (expectedDescriptionType != null && !isInit){
        	description = expectedDescriptionType.getValue();
        }
        return description;
    }
    
    public static Float buildExpectedValueNumeric(ExpectedValueNumericType expectedValueNumericType) {
    	Float numeric = null;
    	
    	if (expectedValueNumericType != null && expectedValueNumericType.getValue() != null 
    			&& !Float.isNaN(expectedValueNumericType.getValue().floatValue()) && !isInit){
    		numeric = expectedValueNumericType.getValue().floatValue();
    	}
    	return numeric;
    }
    
    public static Float buildMaximumValueNumeric(MaximumValueNumericType maximumValueNumericType) {
    	Float numeric = null;
    	
    	if (maximumValueNumericType != null && maximumValueNumericType.getValue() != null 
    			&& !Float.isNaN(maximumValueNumericType.getValue().floatValue()) && !isInit){
    		numeric = maximumValueNumericType.getValue().floatValue();
    	}
    	return numeric;
    }

    public static Float buildMinimumValueNumeric(MinimumValueNumericType minimumValueNumericType) {
    	Float numeric = null;
    	
    	if (minimumValueNumericType != null && minimumValueNumericType.getValue() != null 
    			&& !Float.isNaN(minimumValueNumericType.getValue().floatValue()) && !isInit){
    		numeric = minimumValueNumericType.getValue().floatValue();
    	}
    	return numeric;
    }

    public static List<String> buildCertificationLevelDescriptions(List<CertificationLevelDescriptionType> certificationLevelDescriptionTypes) {
    	List<String> certificationLevelDescriptions = null;
    	
    	if (certificationLevelDescriptionTypes != null && certificationLevelDescriptionTypes.size() > 0){
    		certificationLevelDescriptions = new ArrayList<String>();
    		for (CertificationLevelDescriptionType certificationLevelDescriptionType : certificationLevelDescriptionTypes){
    			if (StringUtils.isNotBlank(certificationLevelDescriptionType.getValue())){
        			certificationLevelDescriptions.add(certificationLevelDescriptionType.getValue());
    			}
    		}
    		
    		if (certificationLevelDescriptions.isEmpty()) { 
    			certificationLevelDescriptions = null;
    		}
    	}
    	return certificationLevelDescriptions;
    }
    
    public static Float buildWeightNumeric(WeightNumericType weightNumericType) {
    	Float numeric = null;
    	
    	if (weightNumericType != null && weightNumericType.getValue() != null 
    			&& !Float.isNaN(weightNumericType.getValue().floatValue())){
    		numeric = weightNumericType.getValue().floatValue();
    	}
    	return numeric;
    }

    public static EvaluationMethodTypeCodeModel buildEvaluationMethodTypeCodeModel(EvaluationMethodTypeCodeType evaluationMethodTypeCodeType) {
    	EvaluationMethodTypeCodeModel evaluationMethodTypeCodeModel = null;
    	
    	if (evaluationMethodTypeCodeType != null && StringUtils.isNotBlank(evaluationMethodTypeCodeType.getValue())){
    		CdEvaluationMethodType cdEvaluationMethodType = new CdEvaluationMethodType();
    		cdEvaluationMethodType.setCode(evaluationMethodTypeCodeType.getValue());
    		
    		evaluationMethodTypeCodeModel = new EvaluationMethodTypeCodeModel();
    		evaluationMethodTypeCodeModel.setEvaluationMethodType(cdEvaluationMethodType);
    		if (StringUtils.isNotBlank(evaluationMethodTypeCodeType.getListID())){
        		evaluationMethodTypeCodeModel.setListID(evaluationMethodTypeCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(evaluationMethodTypeCodeType.getListAgencyName())){
        		evaluationMethodTypeCodeModel.setListAgencyName(evaluationMethodTypeCodeType.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(evaluationMethodTypeCodeType.getListAgencyID())){
        		evaluationMethodTypeCodeModel.setListAgencyID(evaluationMethodTypeCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(evaluationMethodTypeCodeType.getListVersionID())){
        		evaluationMethodTypeCodeModel.setListVersionID(evaluationMethodTypeCodeType.getListVersionID());
    		}
    	}
    	return evaluationMethodTypeCodeModel;
    }
    
    public static List<String> buildWeightingConsiderationDescriptions(List<WeightingConsiderationDescriptionType> weightingConsiderationDescriptionTypes) {
    	List<String> weightingConsiderationDescriptions = null;
    	
    	if (weightingConsiderationDescriptionTypes != null && weightingConsiderationDescriptionTypes.size() > 0){
    		weightingConsiderationDescriptions = new ArrayList<String>();
    		for (WeightingConsiderationDescriptionType weightingConsiderationDescriptionType : weightingConsiderationDescriptionTypes){
    			if (StringUtils.isNotBlank(weightingConsiderationDescriptionType.getValue())){
        			weightingConsiderationDescriptions.add(weightingConsiderationDescriptionType.getValue());
    			}
    		}
    		
    		if (weightingConsiderationDescriptions.isEmpty()) { 
    			weightingConsiderationDescriptions = null;
    		}
    	}
    	return weightingConsiderationDescriptions;
    }
    
    public static List<String> buildCandidateStatements(List<CandidateStatementType> candidateStatementTypes) {
    	List<String> candidates = null;
    	
    	if (candidateStatementTypes != null && candidateStatementTypes.size() > 0){
    		candidates = new ArrayList<String>();
    		for (CandidateStatementType candidateStatementType : candidateStatementTypes){
    			if (StringUtils.isNotBlank(candidateStatementType.getValue())){
        			candidates.add(candidateStatementType.getValue());
    			}
    		}
    		
    		if (candidates.isEmpty()) { 
    			candidates = null;
    		}
    	}
    	return candidates;
    }

    public static ConfidentialityLevelCodeModel buildConfidentialityLevelCodeModel(ConfidentialityLevelCodeType confidentialityLevelCodeType) {
    	ConfidentialityLevelCodeModel confidentialityLevelCodeModel = null;
    	
    	if (confidentialityLevelCodeType != null && StringUtils.isNotBlank(confidentialityLevelCodeType.getValue())){
    		CdConfidentialityLevel cdConfidentialityLevel = new CdConfidentialityLevel();
    		cdConfidentialityLevel.setCode(confidentialityLevelCodeType.getValue());
    		
    		confidentialityLevelCodeModel = new ConfidentialityLevelCodeModel();
    		confidentialityLevelCodeModel.setConfidentialityLevel(cdConfidentialityLevel);
    		if (StringUtils.isNotBlank(confidentialityLevelCodeType.getListID())){
        		confidentialityLevelCodeModel.setListID(confidentialityLevelCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(confidentialityLevelCodeType.getListAgencyName())){
        		confidentialityLevelCodeModel.setListAgencyName(confidentialityLevelCodeType.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(confidentialityLevelCodeType.getListAgencyID())){
        		confidentialityLevelCodeModel.setListAgencyID(confidentialityLevelCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(confidentialityLevelCodeType.getListVersionID())){
        		confidentialityLevelCodeModel.setListVersionID(confidentialityLevelCodeType.getListVersionID());
    		}
    	}
    	return confidentialityLevelCodeModel;
    }

    public static EmployeeQuantityModel buildEmployeeQuantityModel(EmployeeQuantityType employeeQuantityType) {
    	EmployeeQuantityModel employeeQuantityModel = null;
    	
    	if (employeeQuantityType != null && employeeQuantityType.getValue() != null){
    		employeeQuantityModel = new EmployeeQuantityModel();
    		employeeQuantityModel.setEmployeeQuantity(Integer.valueOf(employeeQuantityType.getValue().intValue()));
    	}
    	return employeeQuantityModel;
    }

    public static ValueAmountModel buildValueAmountModel(ValueAmountType valueAmountType) {
    	ValueAmountModel valueAmountModel = null;
    	
    	if (valueAmountType != null && valueAmountType.getValue() != null 
    			&& !Float.isNaN(valueAmountType.getValue().floatValue()) && !isInit){
    		valueAmountModel = new ValueAmountModel();
    		valueAmountModel.setValueAmount(valueAmountType.getValue().floatValue());
    		if (StringUtils.isNotBlank(valueAmountType.getCurrencyID())){
        		valueAmountModel.setCurrencyID(valueAmountType.getCurrencyID());
    		}
    	}

    	return valueAmountModel;
    }

    public static List<String> buildRoleDescriptions(List<RoleDescriptionType> roleDescriptionTypes) {
    	List<String> roleDescriptions = null;
    	
    	if (roleDescriptionTypes != null && roleDescriptionTypes.size() > 0){
    		roleDescriptions = new ArrayList<String>();
    		for (RoleDescriptionType roleDescriptionType : roleDescriptionTypes){
    			if (StringUtils.isNotBlank(roleDescriptionType.getValue())){
        			roleDescriptions.add(roleDescriptionType.getValue());
    			}
    		}
    		
    		if (roleDescriptions.isEmpty()) {
    			roleDescriptions = null;
    		}
    	}
    	return roleDescriptions;
    }

    public static IndustryClassificationCodeModel buildIndustryClassificationCodeModel(IndustryClassificationCodeType industryClassificationCodeType) {
    	IndustryClassificationCodeModel industryClassificationCodeModel = null;
    	
    	if (industryClassificationCodeType != null && StringUtils.isNotBlank(industryClassificationCodeType.getValue())){
    		CdEOIndustryClassificationCode eoIndustryClassificationCode = new CdEOIndustryClassificationCode();
    		eoIndustryClassificationCode.setCode(industryClassificationCodeType.getValue());
    		
    		industryClassificationCodeModel = new IndustryClassificationCodeModel();
    		industryClassificationCodeModel.setEoIndustryClassificationCode(eoIndustryClassificationCode);
    		if (StringUtils.isNotBlank(industryClassificationCodeType.getListID())){
        		industryClassificationCodeModel.setListID(industryClassificationCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(industryClassificationCodeType.getListAgencyName())){
        		industryClassificationCodeModel.setListAgencyName(industryClassificationCodeType.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(industryClassificationCodeType.getListAgencyID())){
        		industryClassificationCodeModel.setListAgencyID(industryClassificationCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(industryClassificationCodeType.getListVersionID())){
        		industryClassificationCodeModel.setListVersionID(industryClassificationCodeType.getListVersionID());
    		}
    	}
    	return industryClassificationCodeModel;
    }

    public static String buildFirstName(FirstNameType firstNameType) {
    	String firstName = StringUtils.EMPTY;
        
        if (firstNameType != null){
        	firstName = firstNameType.getValue();
        }
        return firstName;
    }

    public static String buildFamilyName(FamilyNameType familyNameType) {
    	String familyName = StringUtils.EMPTY;
        
        if (familyNameType != null){
        	familyName = familyNameType.getValue();
        }
        return familyName;
    }
    
    public static Date buildBirthDate(BirthDateType birthDateType) throws ParseException {
        if (birthDateType == null || birthDateType.getValue() == null) {
            return null;
        }
        Instant instant = birthDateType.getValue().atStartOfDay().toInstant(ZoneOffset.UTC);
        Date date = Date.from(instant);
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return (isInit) ? null : dateFormat.parse(dateFormat.format(date));
    }

    public static String buildBirthplaceName(BirthplaceNameType birthplaceNameType) {
    	String birthplaceName = StringUtils.EMPTY;
        
        if (birthplaceNameType != null){
        	birthplaceName = birthplaceNameType.getValue();
        }
        return birthplaceName;
    }
    
    public static RoleCodeModel buildRoleCodeModel(RoleCodeType roleCodeType) {
    	RoleCodeModel roleCodeModel = null;
    	
    	if (roleCodeType != null && StringUtils.isNotBlank(roleCodeType.getValue())){
    		CdEORoleType cdEORoleType = new CdEORoleType();
    		cdEORoleType.setCode(roleCodeType.getValue());
    		
    		roleCodeModel = new RoleCodeModel();
    		roleCodeModel.setEoRoleType(cdEORoleType);
    		if (StringUtils.isNotBlank(roleCodeType.getListID())){
        		roleCodeModel.setListID(roleCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(roleCodeType.getListAgencyName())){
        		roleCodeModel.setListAgencyName(roleCodeType.getListAgencyName());
    		}
    		if (StringUtils.isNotBlank(roleCodeType.getListAgencyID())){
        		roleCodeModel.setListAgencyID(roleCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(roleCodeType.getListVersionID())){
        		roleCodeModel.setListVersionID(roleCodeType.getListVersionID());
    		}
    	}
    	return roleCodeModel;
    }
    
    public static String buildLine(LineType lineType) {
    	String line = StringUtils.EMPTY;
        
        if (lineType != null){
        	line = lineType.getValue();
        }
        return line;
    }
    
    public static IDModel buildValidatedCriterionPropertyIdModel(ValidatedCriterionPropertyIDType validatedCriterionPropertyIDType) {
    	IDModel idModel = null;
    	
    	if (validatedCriterionPropertyIDType != null && StringUtils.isNotBlank(validatedCriterionPropertyIDType.getValue())){
    		idModel = new IDModel();
    		idModel.setId(validatedCriterionPropertyIDType.getValue());
    		if (StringUtils.isNotBlank(validatedCriterionPropertyIDType.getSchemeID())){
    			idModel.setSchemeID(validatedCriterionPropertyIDType.getSchemeID());
    		}
    		if (StringUtils.isNotBlank(validatedCriterionPropertyIDType.getSchemeAgencyID())){
    			idModel.setSchemeAgencyID(validatedCriterionPropertyIDType.getSchemeAgencyID());
    		}
    		if (StringUtils.isNotBlank(validatedCriterionPropertyIDType.getSchemeVersionID())){
    			idModel.setSchemeVersionID(validatedCriterionPropertyIDType.getSchemeVersionID());
    		}
    	}
        return idModel;
    }

    public static ResponseAmountModel buildResponseAmountModel(ResponseAmountType responseAmountType) {
    	ResponseAmountModel responseAmountModel = null;
    	
    	if (responseAmountType != null && (isInitResponse || responseAmountType.getValue() != null 
    			&& !Float.isNaN(responseAmountType.getValue().floatValue()))){
    		responseAmountModel = new ResponseAmountModel();
    		//responseAmountModel.setResponseAmount((isInitResponse) ? null : responseAmountType.getValue().floatValue());
    		responseAmountModel.setResponseAmount(resetFloat(responseAmountType.getValue()));
    		if (StringUtils.isNotBlank(responseAmountType.getCurrencyID())) {
        		responseAmountModel.setCurrencyID(responseAmountType.getCurrencyID());
    		}
    	}

    	return responseAmountModel;
    }
    
    public static ResponseCodeModel buildResponseCodeModel(ResponseCodeType responseCodeType, boolean forUtility) {
    	ResponseCodeModel responseCodeModel = null;
    	
    	if (responseCodeType != null && (isInitResponse || StringUtils.isNotBlank(responseCodeType.getValue()) || forUtility)){
    		responseCodeModel = new ResponseCodeModel();
    		responseCodeModel.setResponseCode(resetString(responseCodeType.getValue()));
    		if (StringUtils.isNotBlank(responseCodeType.getListID())) {
    			responseCodeModel.setListID(responseCodeType.getListID());
    		}
    		if (StringUtils.isNotBlank(responseCodeType.getListAgencyID())) {
    			responseCodeModel.setListAgencyID(responseCodeType.getListAgencyID());
    		}
    		if (StringUtils.isNotBlank(responseCodeType.getListVersionID())) {
    			responseCodeModel.setListVersionID(responseCodeType.getListVersionID());
    		}
    	}
    	return responseCodeModel;
    }
    
    public static Date buildResponseDate(ResponseDateType responseDateType) throws ParseException {
        if (responseDateType == null || responseDateType.getValue() == null) {
            return null;
        }
        Instant instant = responseDateType.getValue().atStartOfDay().toInstant(ZoneOffset.UTC);
        Date date = Date.from(instant);
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return (isInitResponse) ? null : dateFormat.parse(dateFormat.format(date));
    }
    
    public static Date buildResponseTime(ResponseTimeType responseTimeType) throws ParseException {
        if (responseTimeType == null || responseTimeType.getValue() == null) {
            return null;
        }
        Instant instant = responseTimeType.getValue().atDate(LocalDate.now()).toInstant(ZoneOffset.UTC);
        Date date = Date.from(instant);
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return (isInitResponse) ? null : dateFormat.parse(dateFormat.format(date));
    }
    
    public static ResponseIDModel buildResponseIDModel(ResponseIDType responseIdType) {
    	ResponseIDModel responseIDModel = null;
    	
    	if (responseIdType != null && (isInitResponse || StringUtils.isNotBlank(responseIdType.getValue()))){
    		responseIDModel = new ResponseIDModel();
    		responseIDModel.setResponseId(resetString(responseIdType.getValue()));
    		if (StringUtils.isNotBlank(responseIdType.getSchemeID())) {
    			responseIDModel.setSchemeID(responseIdType.getSchemeID());
    		}
    		if (StringUtils.isNotBlank(responseIdType.getSchemeAgencyID())) {
    			responseIDModel.setSchemeAgencyID(responseIdType.getSchemeAgencyID());
    		}
    		if (StringUtils.isNotBlank(responseIdType.getSchemeVersionID())) {
    			responseIDModel.setSchemeVersionID(responseIdType.getSchemeVersionID());
    		}
    	}
        return responseIDModel;
    }

    public static String buildResponseIndicator(ResponseIndicatorType responseIndicatorType) {
        String isResponseIndicator = null;
        
        if (responseIndicatorType != null && !isInit && !fromRequest){
        	isResponseIndicator = String.valueOf(responseIndicatorType.isValue());
        }
        return isResponseIndicator;
    }
    
    public static ResponseMeasureModel buildResponseMeasureModel(ResponseMeasureType responseMeasureType) {
    	ResponseMeasureModel responseMeasureModel = null;
    	
    	if (responseMeasureType != null && (isInitResponse || (responseMeasureType.getValue() != null 
    			&& !Float.isNaN(responseMeasureType.getValue().floatValue()) && !isInit))){
    		responseMeasureModel = new ResponseMeasureModel();
    		responseMeasureModel.setResponseMeasure(resetFloat(responseMeasureType.getValue()));
    		if (StringUtils.isNotBlank(responseMeasureType.getUnitCode())) {
    			responseMeasureModel.setUnitCode(responseMeasureType.getUnitCode());
    		}
    	}
    	return responseMeasureModel;
    }
    
    public static Float buildResponseNumeric(ResponseNumericType responseNumericType) {
    	Float numeric = null;
    	
    	if (responseNumericType != null && responseNumericType.getValue() != null 
    			&& !Float.isNaN(responseNumericType.getValue().floatValue()) && !isInit){
    		numeric = responseNumericType.getValue().floatValue();
    	}
    	return numeric;
    }
    
    public static ResponseQuantityModel buildResponseQuantityModel(ResponseQuantityType responseQuantityType) {
    	ResponseQuantityModel responseQuantityModel = null;
    	
    	if (responseQuantityType != null) {
    		if (isInitResponse || (responseQuantityType.getValue() != null 
    			&& !Float.isNaN(responseQuantityType.getValue().floatValue()) && !isInit)) {
	    		responseQuantityModel = new ResponseQuantityModel();
	    		responseQuantityModel.setResponseQuantity(resetFloat(responseQuantityType.getValue()));
	    		if (StringUtils.isNotBlank(responseQuantityType.getUnitCode())) {
	    			responseQuantityModel.setUnitCode(responseQuantityType.getUnitCode());
	    		}
    		}
    	}
    	return responseQuantityModel;
    }
    
    public static UriModel buildResponseUriModel(ResponseURIType responseUriType) {
    	UriModel uriModel = null;
    	
    	if (responseUriType != null && StringUtils.isNotBlank(responseUriType.getValue())){
    		uriModel = new UriModel();
    		uriModel.setUri(responseUriType.getValue());
    	}
    	return uriModel;
    }

    public static String buildCardinality(CardinalityType cardinalityType) {
    	String cardinality = StringUtils.EMPTY;
        
        if (cardinalityType != null && StringUtils.isNotBlank(cardinalityType.getValue())){
        	cardinality = cardinalityType.getValue().toLowerCase();
        }
        return cardinality;
    }

    public static String buildIndex(IndexType indexType) {
    	String index = StringUtils.EMPTY;
        
        if (indexType != null && StringUtils.isNotBlank(indexType.getValue())){
        	index = indexType.getValue().toLowerCase();
        }
        return index;
    }
}
