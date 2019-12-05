package com.pccube.espd.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pccube.espd.codelists.CdCriterionElementType;
import com.pccube.espd.codelists.CdResponseDataType;
import com.pccube.espd.config.EspdConfiguration;
import com.pccube.espd.config.VariableConfiguration;
import com.pccube.espd.enums.Agency;
import com.pccube.espd.enums.CodeList;
import com.pccube.espd.enums.CriterionElement;
import com.pccube.espd.enums.Language;
import com.pccube.espd.enums.ResponseData;
import com.pccube.espd.model.CodeModel;
import com.pccube.espd.model.CommodityClassificationModel;
import com.pccube.espd.model.CriterionTypeCodeModel;
import com.pccube.espd.model.DescriptionModel;
import com.pccube.espd.model.ExpectedCodeModel;
import com.pccube.espd.model.ExpectedIDModel;
import com.pccube.espd.model.IDModel;
import com.pccube.espd.model.ProcurementProjectLotModel;
import com.pccube.espd.model.ResponseCodeModel;
import com.pccube.espd.model.ResponseCodeTypeModel;
import com.pccube.espd.model.ResponseIDModel;
import com.pccube.espd.model.ResponseValueModel;
import com.pccube.espd.model.TenderingCriterionPropertyModel;

@Component
public class GenericMapperFactory extends GenericFactory {
	
	private static EspdConfiguration espdConfiguration;
	
	private static VariableConfiguration variableConfiguration;
	
	@Autowired
    public GenericMapperFactory(EspdConfiguration espdConfiguration, VariableConfiguration variableConfiguration) {
		GenericMapperFactory.espdConfiguration = espdConfiguration;
		GenericMapperFactory.variableConfiguration = variableConfiguration;
    }
	
	public static List<TenderingCriterionPropertyModel> mapperLotsListCA(List<ProcurementProjectLotModel> models) {
		List<TenderingCriterionPropertyModel> list = new ArrayList<TenderingCriterionPropertyModel>();
		
		if (models != null && !models.isEmpty()) {
			for (ProcurementProjectLotModel model : models) {
				list.add(initTenderingCriterionPropertyModel(
						CriterionElement.REQUIREMENT, ResponseData.LOT_IDENTIFIER, null, LOTS_EN, LOTS_IT, model.getIdModel().getId()));
			}
		}
		
		return list;
	}

	public static List<ResponseValueModel> mapperLotsListEO(List<ProcurementProjectLotModel> models){
		List<ResponseValueModel> list = new ArrayList<ResponseValueModel>();
		
		if (models != null && !models.isEmpty()) {
			for (ProcurementProjectLotModel model : models) {
				list.add(initResponseValueModel(ResponseData.LOT_IDENTIFIER, model.getIdModel().getId()));
			}
		}
		
		return list;
	}
	
	public static List<TenderingCriterionPropertyModel> mapperCpvsListCA(List<CommodityClassificationModel> models){
		List<TenderingCriterionPropertyModel> list = new ArrayList<TenderingCriterionPropertyModel>();
		
		if (models != null && !models.isEmpty()) {
			for (CommodityClassificationModel model : models) {
				list.add(initTenderingCriterionPropertyModel(
						CriterionElement.REQUIREMENT, ResponseData.CODE, variableConfiguration.cmCPVCodes, CPV_CODE_EN, CPV_CODE_IT, model.getItemClassificationCodeModel().getItemClassificationCode()));
			}
		}
		
		return list;
	}
	
	public static List<ResponseValueModel> mapperCpvsListEO(List<CommodityClassificationModel> models){
		List<ResponseValueModel> list = new ArrayList<ResponseValueModel>();
		
		if (models != null && !models.isEmpty()) {
			for (CommodityClassificationModel model : models) {
				list.add(initResponseValueModel(ResponseData.CODE, model.getItemClassificationCodeModel().getItemClassificationCode()));
			}
		}
		
		return list;
	}
	
	private static ResponseValueModel initResponseValueModel(ResponseData responseData, String value){
		ResponseValueModel responseValueModel = new ResponseValueModel();
		
		IDModel idModel = new IDModel();
		idModel.setId(UUID.randomUUID().toString());
		idModel.setSchemeID(espdConfiguration.getIsoNumberPublication());
		idModel.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
		idModel.setSchemeVersionID(espdConfiguration.getTaxonomyVersion());
		responseValueModel.setIdModel(idModel);
		
		if (ResponseData.LOT_IDENTIFIER.equals(responseData)) {
			ResponseIDModel responseIdModel = new ResponseIDModel();
			responseIdModel.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
			responseIdModel.setResponseId(value);
			responseValueModel.setResponseIdModel(responseIdModel);
		} else if (ResponseData.CODE.equals(responseData)) {
			ResponseCodeModel responseCodeModel = new ResponseCodeModel();
			responseCodeModel.setResponseCode(value);
			responseValueModel.setResponseCodeModel(responseCodeModel);
		}
		
		return responseValueModel;
	}
	
	private static TenderingCriterionPropertyModel initTenderingCriterionPropertyModel(CriterionElement criterionElement, ResponseData responseData, 
			CodeModel codeModel, String descriptionEN, String descriptionIT, String expectedValue){
		TenderingCriterionPropertyModel tenderingCriterionPropertyModel = new TenderingCriterionPropertyModel();

		/* Section: TenderingCriterionProperty.Id */
		IDModel idModel = new IDModel();
		idModel.setId(UUID.randomUUID().toString());
		idModel.setSchemeID(CodeList.CRITERIA_TAXONOMY.getNameList());
		idModel.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
		idModel.setSchemeVersionID(espdConfiguration.getTaxonomyVersion());
		tenderingCriterionPropertyModel.setIdModel(idModel);
		
		/* Section: TenderingCriterionProperty.Description */
		List<DescriptionModel> descriptionModels = new ArrayList<DescriptionModel>();
		DescriptionModel descriptionModel = new DescriptionModel();
		descriptionModel.setDescription(descriptionEN);
		descriptionModel.setLanguageID(Language.ENGLISH.getCode().toUpperCase());
		descriptionModels.add(descriptionModel);
		descriptionModel = new DescriptionModel();
		descriptionModel.setDescription(descriptionIT);
		descriptionModel.setLanguageID(Language.ITALIAN.getCode().toUpperCase());
		descriptionModels.add(descriptionModel);
		tenderingCriterionPropertyModel.setDescriptionModels(descriptionModels);
		
		/* Section: TenderingCriterionProperty.TypeCode */
		CdCriterionElementType cdCriterionElementType = new CdCriterionElementType();
		cdCriterionElementType.setCode(criterionElement.getCode());
		CriterionTypeCodeModel criterionTypeCodeModel = new CriterionTypeCodeModel(variableConfiguration.cmCriterionElementType);
		criterionTypeCodeModel.setCriterionElementType(cdCriterionElementType);
		tenderingCriterionPropertyModel.setTypeCodeModel(criterionTypeCodeModel);
		
		/* Section: TenderingCriterionProperty.ValueDataTypeCode */
		CdResponseDataType cdResponseDataType = new CdResponseDataType();
		cdResponseDataType.setCode(responseData.getCode());
		ResponseCodeTypeModel responseCodeTypeModel = new ResponseCodeTypeModel(variableConfiguration.cmResponseDataType);
		responseCodeTypeModel.setResponseDataType(cdResponseDataType);
		tenderingCriterionPropertyModel.setValueDataTypeCodeModel(responseCodeTypeModel);
		
		/* Section: TenderingCriterionProperty.ExpectedId */
		if (ResponseData.LOT_IDENTIFIER.equals(responseData)) {
			ExpectedIDModel expectedIDModel = new ExpectedIDModel();
			expectedIDModel.setExpectedID(expectedValue);
			expectedIDModel.setSchemeAgencyID(Agency.EU_COM_GROW.getCode());
			tenderingCriterionPropertyModel.setExpectedIDModel(expectedIDModel);
		} else if (ResponseData.CODE.equals(responseData)) {
			ExpectedCodeModel expectedCodeModel = new ExpectedCodeModel();
			expectedCodeModel.setExpectedCode(expectedValue);
			if (codeModel != null){
				expectedCodeModel.setListID(codeModel.getListID());
				expectedCodeModel.setListAgencyID(codeModel.getListAgencyID());
				expectedCodeModel.setListVersionID(codeModel.getListVersionID());
			}
			tenderingCriterionPropertyModel.setExpectedCodeModel(expectedCodeModel);
		}
		
		return tenderingCriterionPropertyModel;
	}
}
