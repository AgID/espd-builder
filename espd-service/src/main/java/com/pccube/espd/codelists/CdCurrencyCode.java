package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdCurrencyCode extends CodeList implements ICodeList<CdCurrencyCode> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdCurrencyCode mapper(CodeList codelist){
		CdCurrencyCode type = new CdCurrencyCode();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdCurrencyCode> mapperlist(List<CodeList> codelists){
		List<CdCurrencyCode> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdCurrencyCode>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}

}
