package com.pccube.espd.codelists;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class CdBidType extends CodeList implements ICodeList<CdBidType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CdBidType mapper(CodeList codelist){
		CdBidType type = new CdBidType();
		
		type.setCode(codelist.getCode());
		type.setName(codelist.getName());
		type.setDescription(codelist.getDescription());
		type.setTranslation(codelist.getTranslation());
		type.setStatus(codelist.getStatus());
		
		return type;
	}
	
	public List<CdBidType> mapperlist(List<CodeList> codelists){
		List<CdBidType> types = null;
		
		if (codelists != null && codelists.size() > 0){
			types = new ArrayList<CdBidType>();
			for (CodeList codelist : codelists){
				types.add(mapper(codelist));
			}
		}
		
		return types;
	}
	
}
