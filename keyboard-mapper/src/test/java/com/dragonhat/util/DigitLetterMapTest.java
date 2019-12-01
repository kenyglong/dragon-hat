package com.dragonhat.util;


import org.junit.*;

public class DigitLetterMapTest {
	
	@Test
	public void testGetLetter() {
		Assert.assertEquals(DigitLetterMap.getLetter(0).size(), 0);
		Assert.assertEquals(DigitLetterMap.getLetter(1).size(), 0);
		Assert.assertEquals(DigitLetterMap.getLetter(2).size(), 3);
		Assert.assertEquals("[a, b, c]", DigitLetterMap.getLetter(2).toString());
		Assert.assertEquals("[d, e, f]", DigitLetterMap.getLetter(3).toString());
		Assert.assertEquals("[g, h, i]", DigitLetterMap.getLetter(4).toString());
		Assert.assertEquals("[j, k, l]", DigitLetterMap.getLetter(5).toString());
		Assert.assertEquals("[m, n, o]", DigitLetterMap.getLetter(6).toString());
		Assert.assertEquals(DigitLetterMap.getLetter(7).size(), 4);
		Assert.assertEquals("[p, q, r, s]", DigitLetterMap.getLetter(7).toString());
		Assert.assertEquals("[t, u, v]", DigitLetterMap.getLetter(8).toString());
		Assert.assertEquals("[w, x, y, z]", DigitLetterMap.getLetter(9).toString());
	}
}