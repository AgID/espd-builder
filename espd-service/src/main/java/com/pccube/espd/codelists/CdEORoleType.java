package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdEORoleType extends CodeList implements ICodeList<CdEORoleType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdEORoleType mapper(CodeList codelist){
		CdEORoleType type = new CdEORoleType();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdEORoleType> mapperlist(List<CodeList> codelists){
		List<CdEORoleType> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdEORoleType>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}
}
