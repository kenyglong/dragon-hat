package com.dragonhat.keyboard.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class InputConvertor {
	public static List<String> getDigitList(String str) throws Exception {
		List<String> resultList = new ArrayList<String> ();
		
		String[] digitArray = str.split(",");
		for (String digits : digitArray) {
			digits = digits.trim();
			if (isDigit(digits))
				resultList.add(digits);
			else
				throw new Exception("\"" + digits + "\" is not digit, please input digit only");
		}
		
		return resultList;
	}
	
	public static boolean isDigit(String str) {
		Pattern p = Pattern.compile("[\\d]+");
		return p.matcher(str).matches();
	}
	
	public static List<Integer> parse(List<String> digitList) {
		List<Integer> resultList = new ArrayList<Integer> ();

		for (String str : digitList) {
			for (int i=0; i< str.length(); i++) {
				String digit = str.substring(i, i+1);
				// 0 and 1 map to no letter, so skip them
				if (!digit.equalsIgnoreCase("0") && !digit.equalsIgnoreCase("1"))
					resultList.add(new Integer(digit));
			}
		}
		
		return resultList;
	}
}
