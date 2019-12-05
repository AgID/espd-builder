package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdDocRefContentType extends CodeList implements ICodeList<CdDocRefContentType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CdDocRefContentType mapper(CodeList codelist){
		CdDocRefContentType type = new CdDocRefContentType();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdDocRefContentType> mapperlist(List<CodeList> codelists){
		List<CdDocRefContentType> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdDocRefContentType>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}
}
