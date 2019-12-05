package com.pccube.espd.utility;

import com.google.common.base.Splitter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import static org.apache.commons.lang3.StringUtils.trimToEmpty;

/**
 * Implementation taken from http://stackoverflow.com/questions/28369458/how-to-fill-hashmap-from-java-property-file-with-spring-value
 * and slightly adjusted.
 * <p>
 * Using this class and Spring SPEL we can define more complex properties inside 'general.properties' file
 * which can be mapped to lists or map like structures.
 * </p>
 */
@Repository
public class PropertySplitter {

	/**
	 * Example: one.example.property = KEY1:VALUE1,KEY2:VALUE2
	 */
	public Map<String, String> map(String property) {
		return mapWithSeparators(property, ",", ":");
	}

	/**
	 * Example: one.example.property = KEY1:VALUE1,KEY2:VALUE2
	 */
	public static Map<String, String> mapWithSeparators(String property, String separator, String keyValueSeparator) {
		return Splitter.on(trimToEmpty(separator))
		               .omitEmptyStrings()
		               .trimResults()
		               .withKeyValueSeparator(trimToEmpty(keyValueSeparator))
		               .split(trimToEmpty(property));
	}

	/**
	 * Example: one.example.property = KEY1:VALUE1.1,VALUE1.2;KEY2:VALUE2.1,VALUE2.2
	 */
	public Map<String, List<String>> mapOfList(String property) {
		Map<String, String> map = mapWithSeparators(property, ";", ":");

		Map<String, List<String>> mapOfList = new HashMap<>();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			mapOfList.put(entry.getKey(), list(entry.getValue()));
		}

		return mapOfList;
	}

	/**
	 * Example: one.example.property = VALUE1,VALUE2,VALUE3,VALUE4
	 */
	public List<String> list(String property) {
		return this.list(property, ",");
	}

	private List<String> list(String property, String separator) {
		return Splitter.on(trimToEmpty(separator))
		               .omitEmptyStrings()
		               .trimResults()
		               .splitToList(trimToEmpty(property));
	}

}
