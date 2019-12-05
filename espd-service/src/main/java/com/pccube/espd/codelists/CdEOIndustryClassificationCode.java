package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdEOIndustryClassificationCode extends CodeList implements ICodeList<CdEOIndustryClassificationCode> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdEOIndustryClassificationCode mapper(CodeList codelist){
		CdEOIndustryClassificationCode type = new CdEOIndustryClassificationCode();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdEOIndustryClassificationCode> mapperlist(List<CodeList> codelists){
		List<CdEOIndustryClassificationCode> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdEOIndustryClassificationCode>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}

}
