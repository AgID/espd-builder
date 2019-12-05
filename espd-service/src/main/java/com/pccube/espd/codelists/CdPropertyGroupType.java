package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdPropertyGroupType extends CodeList implements ICodeList<CdPropertyGroupType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdPropertyGroupType mapper(CodeList codelist){
		CdPropertyGroupType type = new CdPropertyGroupType();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdPropertyGroupType> mapperlist(List<CodeList> codelists){
		List<CdPropertyGroupType> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdPropertyGroupType>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}

}
