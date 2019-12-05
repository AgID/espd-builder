package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdQualificationApplicationType extends CodeList implements ICodeList<CdQualificationApplicationType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdQualificationApplicationType mapper(CodeList codelist){
		CdQualificationApplicationType type = new CdQualificationApplicationType();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdQualificationApplicationType> mapperlist(List<CodeList> codelists){
		List<CdQualificationApplicationType> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdQualificationApplicationType>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}

}
