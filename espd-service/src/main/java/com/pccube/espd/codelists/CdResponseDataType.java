package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdResponseDataType extends CodeList implements ICodeList<CdResponseDataType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdResponseDataType mapper(CodeList codelist){
		CdResponseDataType type = new CdResponseDataType();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdResponseDataType> mapperlist(List<CodeList> codelists){
		List<CdResponseDataType> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdResponseDataType>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}
}
