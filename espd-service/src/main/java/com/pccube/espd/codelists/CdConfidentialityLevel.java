package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdConfidentialityLevel extends CodeList implements ICodeList<CdConfidentialityLevel> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdConfidentialityLevel mapper(CodeList codelist){
		CdConfidentialityLevel type = new CdConfidentialityLevel();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdConfidentialityLevel> mapperlist(List<CodeList> codelists){
		List<CdConfidentialityLevel> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdConfidentialityLevel>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}

}
