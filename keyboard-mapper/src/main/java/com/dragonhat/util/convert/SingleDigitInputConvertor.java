package com.dragonhat.util.convert;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SingleDigitInputConvertor implements InputConvertor {
	private static final String delimiter = ",";
	
	public boolean isDigit(String str) {
		Pattern p = Pattern.compile("[\\d]+");
		return p.matcher(str).matches();
	}

	@Override
	public List<String> parse(String str) {
		List<String> digitStrList = new ArrayList<String> ();
		
		String[] digitArray = str.split(delimiter);
		for (String digits : digitArray) {
			digits = digits.trim();
			digitStrList.add(digits);
		}
		
		// filer out non-digit input
		return digitStrList.stream()
				.filter(x -> x != null)
				.filter(x -> isDigit(x))
				.collect(Collectors.toList());
	}

	@Override
	public List<Integer> convert(List<String> strList) {
		return strList.stream().map(x -> new Integer(x)).collect(Collectors.toList());
	}
	
}
