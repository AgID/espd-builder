package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdEOIDType extends CodeList implements ICodeList<CdEOIDType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdEOIDType mapper(CodeList codelist){
		CdEOIDType type = new CdEOIDType();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdEOIDType> mapperlist(List<CodeList> codelists){
		List<CdEOIDType> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdEOIDType>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}

}
