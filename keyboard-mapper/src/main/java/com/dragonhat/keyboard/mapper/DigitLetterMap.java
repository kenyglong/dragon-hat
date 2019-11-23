package com.dragonhat.keyboard.mapper;

public class DigitLetterMap {
	private static final char[][] letterArray = {
			{},						// 0
			{},						// 1
			{'a', 'b', 'c'},        // 2
			{'d', 'e', 'f'},        // 3
			{'g', 'h', 'i'},        // 4
			{'j', 'k', 'l'},        // 5
			{'m', 'n', 'o'},        // 6
			{'p', 'q', 'r', 's'},   // 7
			{'t', 'u', 'v'},        // 8
			{'w', 'x', 'y', 'z'}    // 9
	};
	
	public static final char[] getLetter(int digit) {
		return letterArray[digit];
	}
}