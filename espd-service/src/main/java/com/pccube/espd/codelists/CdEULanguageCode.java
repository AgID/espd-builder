package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdEULanguageCode extends CodeList implements ICodeList<CdEULanguageCode> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdEULanguageCode mapper(CodeList codelist){
		CdEULanguageCode type = new CdEULanguageCode();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdEULanguageCode> mapperlist(List<CodeList> codelists){
		List<CdEULanguageCode> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdEULanguageCode>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}

}
