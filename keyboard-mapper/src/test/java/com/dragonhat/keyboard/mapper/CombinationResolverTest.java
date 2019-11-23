package com.dragonhat.keyboard.mapper;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class CombinationResolverTest {
	@Test
	public void testCombine() {
		StringBuilder beforeStr = new StringBuilder();
		char[] letterArray = {'a', 'b', 'c'};
		
		Assert.assertTrue("a b c".equals(CombinationResolver.combine(beforeStr, letterArray).toString()));
		beforeStr.append("d e f");
		Assert.assertTrue("da db dc ea eb ec fa fb fc".equals(CombinationResolver.combine(beforeStr, letterArray).toString()));
	}
	
	@Test
	public void testGetLetters() {
		List<Integer> singleDigitList = new ArrayList<Integer>();
		
		singleDigitList.add(new Integer(3));
		Assert.assertTrue("d e f".equals(CombinationResolver.getLetters(singleDigitList).toString()));
		
		singleDigitList.add(new Integer(2));
		Assert.assertTrue("da db dc ea eb ec fa fb fc".equals(CombinationResolver.getLetters(singleDigitList).toString()));
		
		singleDigitList.add(new Integer(7));
		Assert.assertTrue(CombinationResolver.getLetters(singleDigitList).toString().split(" ").length == 3*3*4);
	}
}
