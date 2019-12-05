package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdEvaluationMethodType extends CodeList implements ICodeList<CdEvaluationMethodType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdEvaluationMethodType mapper(CodeList codelist){
		CdEvaluationMethodType type = new CdEvaluationMethodType();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdEvaluationMethodType> mapperlist(List<CodeList> codelists){
		List<CdEvaluationMethodType> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdEvaluationMethodType>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}

}
