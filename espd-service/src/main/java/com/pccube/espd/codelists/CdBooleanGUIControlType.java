package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdBooleanGUIControlType extends CodeList implements ICodeList<CdBooleanGUIControlType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdBooleanGUIControlType mapper(CodeList codelist){
		CdBooleanGUIControlType type = new CdBooleanGUIControlType();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdBooleanGUIControlType> mapperlist(List<CodeList> codelists){
		List<CdBooleanGUIControlType> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdBooleanGUIControlType>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));				
			}
		}
		
		return types;
	}

}
