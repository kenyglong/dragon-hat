package com.dragonhat.util.convert;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SingleDigitInputConvertorTest {
	@Test
	public void testIsDigit() {
		SingleDigitInputConvertor convertor = new SingleDigitInputConvertor();
		Assert.assertTrue(convertor.isDigit("012"));
		Assert.assertTrue(convertor.isDigit("999"));
		Assert.assertTrue(convertor.isDigit("1"));
		Assert.assertFalse(convertor.isDigit("a1"));
		Assert.assertFalse(convertor.isDigit(""));
	}
	
	@Test
	public void testConvert() {
		List<String> inputList = new ArrayList<String> ();
		List<Integer> outputList = new ArrayList<Integer> ();
		SingleDigitInputConvertor convertor = new SingleDigitInputConvertor();
		
		inputList.add("0");
		inputList.add("2");
		inputList.add("1");
		inputList.add("9");
		outputList = convertor.convert(inputList);
		Assert.assertTrue(outputList.size() == 4);
		Assert.assertTrue(new Integer("0").equals(outputList.get(0)));
		Assert.assertTrue(new Integer("2").equals(outputList.get(1)));
		Assert.assertTrue(new Integer("1").equals(outputList.get(2)));
		Assert.assertTrue(new Integer("9").equals(outputList.get(3)));
	}
	
	@Test
	public void testParse() {
		List<String> resultList;
		SingleDigitInputConvertor convertor = new SingleDigitInputConvertor();
		resultList = convertor.parse(" 1,a2,2 ,03,50,31,9,0,,");
		Assert.assertTrue(resultList.size() == 7);
		Assert.assertTrue("1".equals(resultList.get(0)));
		Assert.assertTrue("2".equals(resultList.get(1)));
		Assert.assertTrue("03".equals(resultList.get(2)));
		Assert.assertTrue("50".equals(resultList.get(3)));
		Assert.assertTrue("31".equals(resultList.get(4)));
		Assert.assertTrue("9".equals(resultList.get(5)));
		Assert.assertTrue("0".equals(resultList.get(6)));
	}
}
