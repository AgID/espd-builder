package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdCPVCodes extends CodeList implements ICodeList<CdCPVCodes> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdCPVCodes mapper(CodeList codelist){
		CdCPVCodes type = new CdCPVCodes();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdCPVCodes> mapperlist(List<CodeList> codelists){
		List<CdCPVCodes> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdCPVCodes>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}

}
