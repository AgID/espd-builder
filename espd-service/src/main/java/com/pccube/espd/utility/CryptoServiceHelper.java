package com.pccube.espd.utility;

public class CryptoServiceHelper  {
	
	private CryptoServiceHelper() {}
	
	private static final String[][] attributoDefault = new String[][]{
			new String []{}, 
			new String []{}};
	private static final String[][] attributoAbout = new String[][]{
			new String []{}, 
			new String []{}};
	
	public static String[][] supportoBean(Class<?> classeBean){
		switch(classeBean.getName()) {
			case "com.pccube.espd.model.AboutModel" : return attributoAbout;
			default : return attributoDefault;
		}
	}
}
