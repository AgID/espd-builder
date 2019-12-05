package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdWeightingType extends CodeList implements ICodeList<CdWeightingType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdWeightingType mapper(CodeList codelist){
		CdWeightingType type = new CdWeightingType();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdWeightingType> mapperlist(List<CodeList> codelists){
		List<CdWeightingType> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdWeightingType>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}

}
