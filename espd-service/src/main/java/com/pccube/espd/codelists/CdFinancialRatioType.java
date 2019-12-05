package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdFinancialRatioType extends CodeList implements ICodeList<CdFinancialRatioType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdFinancialRatioType mapper(CodeList codelist){
		CdFinancialRatioType type = new CdFinancialRatioType();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdFinancialRatioType> mapperlist(List<CodeList> codelists){
		List<CdFinancialRatioType> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdFinancialRatioType>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}

}
