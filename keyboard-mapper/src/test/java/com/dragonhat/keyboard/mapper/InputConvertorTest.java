package com.dragonhat.keyboard.mapper;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class InputConvertorTest {
	
	@Test
	public void testIsDigit() {
		Assert.assertTrue(InputConvertor.isDigit("012"));
		Assert.assertTrue(InputConvertor.isDigit("999"));
		Assert.assertTrue(InputConvertor.isDigit("1"));
		Assert.assertFalse(InputConvertor.isDigit("a1"));
		Assert.assertFalse(InputConvertor.isDigit(""));
	}
	
	@Test
	public void testGetDigitList() throws Exception {
		List<String> resultList;
		
		resultList = InputConvertor.getDigitList(" 1,2 ,03,50,31,9,0");
		Assert.assertTrue(resultList.size() == 7);
		Assert.assertTrue("1".equals(resultList.get(0)));
		Assert.assertTrue("2".equals(resultList.get(1)));
		Assert.assertTrue("03".equals(resultList.get(2)));
		Assert.assertTrue("50".equals(resultList.get(3)));
		Assert.assertTrue("31".equals(resultList.get(4)));
		Assert.assertTrue("9".equals(resultList.get(5)));
		Assert.assertTrue("0".equals(resultList.get(6)));
	}
	
	@Test
	public void testParse() {
		List<String> inputList = new ArrayList<String> ();
		List<Integer> outputList = new ArrayList<Integer> ();
		
		inputList.add("4");
		inputList.add("12");
		inputList.add("1");
		inputList.add("30");
		inputList.add("0");
		inputList.add("98");
		outputList = InputConvertor.parse(inputList);
		Assert.assertTrue(outputList.size() == 5);
		Assert.assertTrue(new Integer("4").equals(outputList.get(0)));
		Assert.assertTrue(new Integer("2").equals(outputList.get(1)));
		Assert.assertTrue(new Integer("3").equals(outputList.get(2)));
		Assert.assertTrue(new Integer("9").equals(outputList.get(3)));
		Assert.assertTrue(new Integer("8").equals(outputList.get(4)));
	}
}
