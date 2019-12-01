package com.dragonhat.util.convert;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MultipleDigitInputConvertorTest {
	@Test
	public void testConvert() {
		List<String> inputList = new ArrayList<String> ();
		List<Integer> outputList = new ArrayList<Integer> ();
		SingleDigitInputConvertor convertor = new MultipleDigitInputConvertor();
		
		inputList.add("03");
		inputList.add("301");
		inputList.add("1");
		inputList.add("99");
		outputList = convertor.convert(inputList);
		Assert.assertTrue(outputList.size() == 8);
		Assert.assertTrue(new Integer("0").equals(outputList.get(0)));
		Assert.assertTrue(new Integer("3").equals(outputList.get(1)));
		Assert.assertTrue(new Integer("3").equals(outputList.get(2)));
		Assert.assertTrue(new Integer("0").equals(outputList.get(3)));
		Assert.assertTrue(new Integer("1").equals(outputList.get(4)));
		Assert.assertTrue(new Integer("1").equals(outputList.get(5)));
		Assert.assertTrue(new Integer("9").equals(outputList.get(6)));
		Assert.assertTrue(new Integer("9").equals(outputList.get(7)));
	}
}
