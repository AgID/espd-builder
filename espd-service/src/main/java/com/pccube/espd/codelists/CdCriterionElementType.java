package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdCriterionElementType extends CodeList implements ICodeList<CdCriterionElementType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdCriterionElementType mapper(CodeList codelist){
		CdCriterionElementType type = new CdCriterionElementType();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdCriterionElementType> mapperlist(List<CodeList> codelists){
		List<CdCriterionElementType> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdCriterionElementType>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}

}
