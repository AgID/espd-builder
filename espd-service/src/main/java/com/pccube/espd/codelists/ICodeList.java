package com.pccube.espd.codelists;

import java.util.List;

/**
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public interface ICodeList<T> {
	
	public T mapper(CodeList codelist);
	
	public List<T> mapperlist(List<CodeList> codelists);
}
