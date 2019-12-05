package com.pccube.espd.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Language {

    /**
     * Bulgarian
     */
    BULGARIAN( "български", "Bulgarian", "bg", "bul", 3),
    /**
     * Spanish
     */
    SPANISH( "Español", "Spanish", "es", "spa", 4),
    /**
     * Czech
     */
    CZECH("čeština", "Czech", "cs", "ces", 5),
    /**
     * Danish
     */
    DANISH( "Dansk", "Danish", "da", "dan", 6),
    /**
     * German
     */
    GERMAN("Deutsch", "German", "de", "deu", 7),
    /**
     * Estonian
     */
    ESTONIAN( "Eesti keel", "Estonian", "et", "est", 8),
    /**
     * Greek
     */
    GREEK("Eλληνικά", "Greek", "el", "ell", 9),
    /**
     * English
     */
    ENGLISH( "English", "English", "en", "eng", 10),
    /**
     * French
     */
    FRENCH( "Français", "French", "fr", "fra", 11),
    /**
     * Gaelic
     */
    GAELIC( "Gaeilge", "Gaelic", "ga", "gle", 12),
    /**
     * Croatian
     */
    CROATIAN( "Hrvatski", "Croatian", "hr", "hrv", 13),
    /**
     * Italian
     */
    ITALIAN( "Italiano", "Italian", "it", "ita", 14),
    /**
     * Latvian
     */
    LATVIAN("Latviešu valoda", "Latvian", "lv", "lav", 15),
    /**
     * Lithuanian
     */
    LITHUANIAN( "Lietuvių kalba", "Lithuanian", "lt", "lit", 16),
    /**
     * Hungarian
     */
    HUNGARIAN( "Magyar", "Hungarian", "hu", "hun", 17),
    /**
     * Maltese
     */
    MALTESE( "Malti", "Maltese", "mt", "mlt", 18),
    /**
     * Dutch
     */
    DUTCH( "Nederlands", "Dutch", "nl", "nld", 19),
    /**
     * Polish
     */
    POLISH( "Polski", "Polish", "pl", "pol", 20),
    /**
     * Portuguese
     */
    PORTUGUESE( "Português", "Portuguese", "pt", "por", 21),
    /**
     * Romanian
     */
    ROMANIAN( "Română", "Romanian", "ro", "ron", 22),
    /**
     * Slovak
     */
    SLOVAK( "Slovenčina", "Slovak", "sk", "slk", 23),
    /**
     * Slovenian
     */
    SLOVENIAN( "Slovenščina", "Slovenian", "sl", "slv", 24),
    /**
     * Finnish
     */
    FINNISH( "Suomi", "Finnish", "fi", "fin", 25),
    /**
     * Swedish
     */
    SWEDISH( "Svenska", "Swedish", "sv", "swe", 26),
    /**
     * Norwegian
     */
    NORWEGIAN( "Norsk", "Norwegian", "no", "nor", -1),
    /**
     * Icelandic
     */
    ICELANDIC( "Íslenska", "Icelandic", "is", "ise", -1);

	public static final List<Language> LANGUAGES = Collections.unmodifiableList(Arrays.asList(values()));

    private String sourceLanguage;
    private String englishName;
    private String code;
    /* 
     * @param columnCode
     * Attributo utilizzato per reperire le codelist dai file excel. 
     * E' il titolo della colonna corrispondente alla lingua selezionata.
     */
    private String columnCode;
    /* 
     * @param columnIndex
     * Attributo utilizzato per reperire le codelist dai file excel. 
     * E' l'indice della colonna corrispondente alla lingua selezionata.
     * Se l'index è -1, significa che non si trova corrispondenza della lingua sul file excel.
     */
    private Integer columnIndex; 

    Language(final String sourceLanguage, final String englishName, final String code, 
    		final String columnCode, final Integer columnIndex) {
        this.sourceLanguage = sourceLanguage;
        this.englishName = englishName;
        this.code = code;
        this.columnCode = columnCode;
        this.columnIndex = columnIndex;
    }
    
    public String getSourceLanguage() {
		return sourceLanguage;
	}
	public void setSourceLanguage(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
	}
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getColumnCode() {
		return columnCode;
	}
	public void setColumnCode(String columnCode) {
		this.columnCode = columnCode;
	}
	public Integer getColumnIndex() {
		return columnIndex;
	}
	public void setColumnIndex(Integer columnIndex) {
		this.columnIndex = columnIndex;
	}


	/**
     * Load an official language by the ISO-2 code. Returns null if the language
     * cannot be found in the list.
     *
     * @param code The language code
     *
     * @return The language if the code was correct, null otherwise
     *
     */
    public static Language getByLanguageCode(final String code) {
        for (Language lang : LANGUAGES) {
            if (lang.getCode().equalsIgnoreCase(code)) {
                return lang;
            }
        }
        return ENGLISH;
    }

}
