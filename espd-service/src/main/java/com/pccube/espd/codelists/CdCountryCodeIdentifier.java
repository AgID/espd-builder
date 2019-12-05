package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdCountryCodeIdentifier extends CodeList implements ICodeList<CdCountryCodeIdentifier> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdCountryCodeIdentifier mapper(CodeList codelist){
		CdCountryCodeIdentifier type = new CdCountryCodeIdentifier();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdCountryCodeIdentifier> mapperlist(List<CodeList> codelists){
		List<CdCountryCodeIdentifier> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdCountryCodeIdentifier>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}

}
