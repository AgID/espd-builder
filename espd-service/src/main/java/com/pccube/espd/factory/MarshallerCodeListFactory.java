package com.pccube.espd.factory;

import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.lang3.StringUtils;
import org.oasis_open.docs.codelist.ns.genericode._1.CodeListDocument;
import org.oasis_open.docs.codelist.ns.genericode._1.Column;
import org.oasis_open.docs.codelist.ns.genericode._1.GeneralIdentifier;
import org.oasis_open.docs.codelist.ns.genericode._1.Identification;
import org.oasis_open.docs.codelist.ns.genericode._1.LongName;
import org.oasis_open.docs.codelist.ns.genericode._1.Row;
import org.oasis_open.docs.codelist.ns.genericode._1.SimpleCodeList;
import org.oasis_open.docs.codelist.ns.genericode._1.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pccube.espd.config.JaxbConfiguration;
import com.pccube.espd.enums.Language;
import com.pccube.espd.enums.Status;
import com.pccube.espd.model.CodeModel;


/**
 * Class used to generate CodeList Object from GC stream files.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
@Component
public class MarshallerCodeListFactory {

	@Autowired
	private JaxbConfiguration jaxbConfiguration;


	public CodeModel codeListIdentification(com.pccube.espd.enums.CodeList enumCodeList) throws ParseException {

		InputStream codeListStream = MarshallerCodeListFactory.class.getResourceAsStream("/codelists/gc/" + enumCodeList.getNameList() + "-CodeList.gc");
		
		CodeListDocument codeListDocument = unmarshalCodeList(codeListStream);
		
		CodeModel codeModel = null;
		
		if (codeListDocument != null && codeListDocument.getIdentification() != null) {
			codeModel = mapperCodeModel(codeListDocument.getIdentification());
		}
				
		return codeModel;
	}
	
	public List<com.pccube.espd.codelists.CodeList> codeListSimple(com.pccube.espd.enums.CodeList enumCodeList, Language eLang) throws ParseException {

		InputStream codeListStream = MarshallerCodeListFactory.class.getResourceAsStream("/codelists/gc/" + enumCodeList.getNameList() + "-CodeList.gc");
		
		CodeListDocument codeListDocument = unmarshalCodeList(codeListStream);
		
		List<com.pccube.espd.codelists.CodeList> codeList = null;
		
		if (codeListDocument != null && codeListDocument.getSimpleCodeList() != null) {
			codeList = mapperCodeList(codeListDocument.getSimpleCodeList(), eLang.getColumnCode());
		}
				
		return codeList;
	}
	
	private CodeModel mapperCodeModel(Identification identification){
		CodeModel codeModel = new CodeModel();
		
		if (identification.getShortName() != null) {
			codeModel.setListID(identification.getShortName().getValue());
		}
		
		codeModel.setListVersionID(identification.getVersion());
		
		if (identification.getAgency() != null) {
			for (LongName longName : identification.getAgency().getLongName()) {
				if (StringUtils.isNotBlank(longName.getValue())) {
					codeModel.setListAgencyName(codeModel.getListAgencyName().concat(longName.getValue()));
				}
			}

			for (GeneralIdentifier identifier : identification.getAgency().getIdentifier()) {
				if (StringUtils.isNotBlank(identifier.getValue())) {
					codeModel.setListAgencyID(codeModel.getListAgencyID().concat(identifier.getValue()));
				}
			}
		}
		
		return codeModel;
	}
	
	private List<com.pccube.espd.codelists.CodeList> mapperCodeList(SimpleCodeList simple, String lang){
		List<com.pccube.espd.codelists.CodeList> codeList = new ArrayList<com.pccube.espd.codelists.CodeList>();
		
		if (simple.getRow() != null) {
			for (Row row : simple.getRow()){
				codeList.add(setInfoCodeList(row, lang));
			}
		}
		
		return codeList;
	}
	
	private com.pccube.espd.codelists.CodeList setInfoCodeList(Row row, String lang){
		com.pccube.espd.codelists.CodeList single = new com.pccube.espd.codelists.CodeList();
		
		for (Value value : row.getValue()){
			Column columnRef = (Column) value.getColumnRef();
			if ("status".equalsIgnoreCase(columnRef.getId())) {
				single.setStatus(Status.getByStatusCode(value.getSimpleValue().getValue()));
			}
			if ("code".equalsIgnoreCase(columnRef.getId())) {
				single.setCode(value.getSimpleValue().getValue());
			}
			if (("name-" + lang).equalsIgnoreCase(columnRef.getId())) {
				single.setTranslation(value.getSimpleValue().getValue());
			}
		}
		
		return single;
	}
	
	@SuppressWarnings("unchecked")
	protected CodeListDocument unmarshalCodeList(InputStream codeListStream) throws ParseException {

		JAXBElement<CodeListDocument> codeListElement = 
				(JAXBElement<CodeListDocument>) 
				jaxbConfiguration.jaxb2Marshaller.unmarshal(new StreamSource(codeListStream));
		
		CodeListDocument codeListDocument = null;
		
		if (codeListElement.getValue() != null) {
			codeListDocument = codeListElement.getValue();
		}
		
		return codeListDocument;
	}
}
