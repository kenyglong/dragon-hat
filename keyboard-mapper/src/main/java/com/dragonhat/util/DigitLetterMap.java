package com.dragonhat.util;

import java.util.ArrayList;
import java.util.List;

public class DigitLetterMap {
	private static final String[][] letterArray = {
			{},						// 0
			{},						// 1
			{"a", "b", "c"},        // 2
			{"d", "e", "f"},        // 3
			{"g", "h", "i"},        // 4
			{"j", "k", "l"},        // 5
			{"m", "n", "o"},        // 6
			{"p", "q", "r", "s"},   // 7
			{"t", "u", "v"},        // 8
			{"w", "x", "y", "z"}    // 9
	};
	
	public static final List<StringBuilder> getLetter(int digit) {
		ArrayList<StringBuilder> result = new ArrayList<StringBuilder> ();
		for (String letter : letterArray[digit])
			result.add(new StringBuilder(letter));
		return result;
	}
	
	public static final int getLetterCount(int digit) {
		return letterArray[digit].length;
	}
}
