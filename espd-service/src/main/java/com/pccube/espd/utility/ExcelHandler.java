package com.pccube.espd.utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.pccube.espd.codelists.CodeList;
import com.pccube.espd.enums.Language;
import com.pccube.espd.model.CodeModel;

/**
 * Using this class we can read codelists inside 'ESPD-CodeLists-V2.0.2.xlsx' file in Resources folder.
 * 
 * Created by MPetruzzi on 14/09/18.
 */
@Deprecated
public class ExcelHandler {

	static final Logger logger = Logger.getLogger(ExcelHandler.class);

	private String path;
	private Language language;
	private InputStream filestream;
	private String sheetname;
	private List<CodeList> codelist;
	private CodeModel codemodel;
	
	public ExcelHandler(String langcode, String namecode, String pathcode) {
		path = "/" + pathcode;
		language = Language.getByLanguageCode(langcode);
		filestream = ExcelHandler.class.getResourceAsStream(path);
		sheetname = namecode;
		readCodelistFromExcel();
	}

	public ExcelHandler(String namecode, String pathcode) {
		path = "/" + pathcode;
		filestream = ExcelHandler.class.getResourceAsStream(path);
		sheetname = namecode;
		readAttributeFromExcel();
	}
	
	private void readCodelistFromExcel() {
		
		codelist = null;
		
		if (filestream != null) {

			Integer columnIndex = language.getColumnIndex();	
			
			if (columnIndex > 0) {

		        XSSFWorkbook workBook;
				
		        try {
		        	
		        	codelist = new ArrayList<CodeList>();
					
					workBook = new XSSFWorkbook(filestream);
					
			        XSSFSheet sheet = workBook.getSheet(sheetname);
			       
			        Iterator<Row> rowIterator = sheet.iterator();

			        CodeList beanCodelist = null;
			        
			        while (rowIterator.hasNext()) {
			            Row row = rowIterator.next();
		
			            if(row.getRowNum() > 11){
			            	beanCodelist = new CodeList();
			            	
			            	Cell cell = row.getCell(0); //Column "Code"
			            	
			            	if (cell != null && StringUtils.isNotEmpty(cell.getStringCellValue())){

			            		beanCodelist.setCode(cell.getStringCellValue());
			            	
			            		cell = row.getCell(1); //Column "Name"
				            	if (cell != null){
				            		beanCodelist.setName(cell.getStringCellValue());
				            	}
				            	
			            		cell = row.getCell(2); //Column "Description"
				            	if (cell != null){
				            		beanCodelist.setDescription(cell.getStringCellValue());
				            	}
				            	
			            		cell = row.getCell(columnIndex); //Column "Translation"
				            	if (cell != null){
				            		beanCodelist.setTranslation(cell.getStringCellValue());
				            	}
				            	
				            	codelist.add(beanCodelist);
			            	}
			            }
			        }
				} catch (IOException e) {
					logger.error("Error", e);
				}
			
			} else {
				logger.error("Language not enable " + language.getEnglishName());
			}
		} else {
			logger.error("Resource not found " + path);
		}
	}

	private void readAttributeFromExcel() {
		
		codemodel = null;
		
		if (filestream != null) {

	        XSSFWorkbook workBook;
			
	        try {
	        	
	        	codemodel = new CodeModel();
				
				workBook = new XSSFWorkbook(filestream);
				
		        XSSFSheet sheet = workBook.getSheet(sheetname);
		       
		        Iterator<Row> rowIterator = sheet.iterator();
		        
		        while (rowIterator.hasNext()) {
		            Row row = rowIterator.next();
	
		            if(row.getRowNum() == 2){ //Row "ListID"
		            	Cell cell = row.getCell(1);
		            	if (cell != null){
		            		codemodel.setListID(cell.getStringCellValue());
		            	}
		            }

		            if(row.getRowNum() == 3){ //Row "Version"
		            	Cell cell = row.getCell(1);
		            	if (cell != null){
		            		codemodel.setListVersionID(cell.getStringCellValue());
		            	}
		            }

		            if(row.getRowNum() == 7){ //Row "AgencyLongName"
		            	Cell cell = row.getCell(1);
		            	if (cell != null){
		            		codemodel.setListAgencyName(cell.getStringCellValue());
		            	}
		            }

		            if(row.getRowNum() == 8){ //Row "AgencyIdentifier"
		            	Cell cell = row.getCell(1);
		            	if (cell != null){
		            		codemodel.setListAgencyID(cell.getStringCellValue());
		            	}
		            }
		        }
			} catch (IOException e) {
				logger.error("Error", e);
			}
			
		} else {
			logger.error("Resource not found " + path);
		}
	}
}
