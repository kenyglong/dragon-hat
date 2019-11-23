package com.dragonhat.keyboard.mapper;

import java.util.List;

public class CombinationResolver {
	private static final String delimiter = " ";
	
	public static final String getLetters(List<Integer> singleDigitList) {
		StringBuilder sb = new StringBuilder();
		long numOfCombination = 1;
		
		for (Integer digitInteger : singleDigitList) {
			// for validation only
			int digit = digitInteger.intValue();
			switch (digit) {
			case 0:
			case 1:
				numOfCombination = numOfCombination * 1;
				break;
			case 7:
			case 9:
				numOfCombination = numOfCombination * 4;
				break;
			default:
				numOfCombination = numOfCombination * 3;
				break;
			}
			
			char[] letterArray = DigitLetterMap.getLetter(digit);
			sb = combine(sb, letterArray);
		}
		
		if (numOfCombination == 1)
			numOfCombination = 0;
		
		String resultStr = sb.toString();
		System.out.println("Number of combiation should be: " + numOfCombination);
		System.out.println("Number of combiation resolved by program is: " 
				+ (resultStr.length() == 0 ? 0 : sb.toString().split(delimiter).length));
		System.out.println("Output: " + sb.toString());
		
		return resultStr;
	}
	
	public static final StringBuilder combine(StringBuilder beforeStr, char[] letterArray) {
		StringBuilder afterStr = new StringBuilder();
		String[] beforeStrArray = beforeStr.toString().split(delimiter);
		
		// if before string is empty
		if (beforeStrArray.length == 0) {
			for (char c : letterArray) {
				afterStr.append(c).append(delimiter);
			}
			// remove the delimiter at the end
			afterStr.deleteCharAt(afterStr.length() - 1);
		} else {
			for (String str : beforeStrArray) {
				for (char c : letterArray) {
					afterStr.append(str + c).append(delimiter);
				}
			}
			// remove the delimiter at the end
			afterStr.deleteCharAt(afterStr.length() - 1);
		}
		
		return afterStr;
	}
}
