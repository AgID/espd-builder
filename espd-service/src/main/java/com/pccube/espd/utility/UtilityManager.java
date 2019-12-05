package com.pccube.espd.utility;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.CharacterPredicate;
import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;

/**
 * Utility methods to use inside the service. 
 * 
 * Created by MPetruzzi on 14/09/18.
 */
public class UtilityManager {

	/**
     * Generates a random alphanumeric string.
     * 
     * @param digits The length of returned string.
     * @param lower Indicate if the returned string contains lowercase letters.
     * @param upper Indicate if the returned string contains uppercase letters.
     *
     * @return A random alphanumeric string
     */
	public static String randomAlphanumeric(int digits, boolean lower, boolean upper){
		
		CharacterPredicate caseLetter = CharacterPredicates.ASCII_LOWERCASE_LETTERS;
		if (lower && upper) {
			caseLetter = CharacterPredicates.LETTERS;
		} else if(upper) {
			caseLetter = CharacterPredicates.ASCII_UPPERCASE_LETTERS;
		}
		
		RandomStringGenerator randomStringGenerator =
		        new RandomStringGenerator.Builder()
		                .withinRange('0', 'z')
		                .filteredBy(caseLetter, CharacterPredicates.DIGITS)
		                .build();
		
		return randomStringGenerator.generate(digits);
	}

	/**
     * Generates a new number version.
     * 
     * @param oldVersion The old version that can be increment o decrement (format x.x.x).
     * @param changeDigit Index of digit to change (base = 0).
     * @param decrement Indicate if the version can be increment o decrement.
     *
     * @return A number of new version
     */
	public static String changeVersion(String oldVersion, int changeDigit, boolean decrement){
		
		String newVersion = "";
		
		if (StringUtils.isNotEmpty(oldVersion)){
			String[] digits = oldVersion.split("\\.");
			digits[changeDigit] = String.valueOf(
					Integer.parseInt(digits[changeDigit]) + 1);
			for(int i = 0; i < digits.length; i++){
				if(i < digits.length - 1) {
					newVersion += digits[i] + ".";
				} else {
					newVersion += digits[i];
				}
			}
		}
		
		return newVersion;
	}
	
	/**
     * Generates an {@link InputStream} from an uploaded file.
     * 
     * @param file An encoded file (by Base64).
     *
     * @return An {@link InputStream} of file.
     */
	public static InputStream getStreamFromFile(Object file){
		
		InputStream stream = null;
		
		if (file != null){

			byte[] decodedFile = Base64.getDecoder().decode(
					file.toString().getBytes(StandardCharsets.UTF_8));
			
			if (decodedFile != null){
				stream = new ByteArrayInputStream(decodedFile); 
			}
		}
		
		return stream;
	}
}
