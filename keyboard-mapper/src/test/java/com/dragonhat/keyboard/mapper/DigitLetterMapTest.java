package com.dragonhat.keyboard.mapper;


import org.junit.*;

public class DigitLetterMapTest {
	
	@Test
	public void testGetLetter() {
		Assert.assertEquals(DigitLetterMap.getLetter(0).length, 0);
		Assert.assertEquals(DigitLetterMap.getLetter(1).length, 0);
		Assert.assertEquals(DigitLetterMap.getLetter(2).length, 3);
		Assert.assertEquals("abc", new String(DigitLetterMap.getLetter(2)));
		Assert.assertEquals("def", new String(DigitLetterMap.getLetter(3)));
		Assert.assertEquals("ghi", new String(DigitLetterMap.getLetter(4)));
		Assert.assertEquals("jkl", new String(DigitLetterMap.getLetter(5)));
		Assert.assertEquals("mno", new String(DigitLetterMap.getLetter(6)));
		Assert.assertEquals(DigitLetterMap.getLetter(7).length, 4);
		Assert.assertEquals("pqrs", new String(DigitLetterMap.getLetter(7)));
		Assert.assertEquals("tuv", new String(DigitLetterMap.getLetter(8)));
		Assert.assertEquals("wxyz", new String(DigitLetterMap.getLetter(9)));
	}
}