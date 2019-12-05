package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdProcedureType extends CodeList implements ICodeList<CdProcedureType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CdProcedureType mapper(CodeList codelist){
		CdProcedureType type = new CdProcedureType();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdProcedureType> mapperlist(List<CodeList> codelists){
		List<CdProcedureType> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdProcedureType>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}
	
}
