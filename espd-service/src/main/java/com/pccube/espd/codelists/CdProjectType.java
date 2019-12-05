package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdProjectType extends CodeList implements ICodeList<CdProjectType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CdProjectType mapper(CodeList codelist){
		CdProjectType type = new CdProjectType();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdProjectType> mapperlist(List<CodeList> codelists){
		List<CdProjectType> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdProjectType>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}

}
