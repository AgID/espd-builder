package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdProfileExecutionID extends CodeList implements ICodeList<CdProfileExecutionID> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdProfileExecutionID mapper(CodeList codelist){
		CdProfileExecutionID type = new CdProfileExecutionID();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdProfileExecutionID> mapperlist(List<CodeList> codelists){
		List<CdProfileExecutionID> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdProfileExecutionID>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}

}
