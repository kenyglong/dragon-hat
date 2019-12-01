package com.dragonhat.util.combine;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CombinationResolverTest {
	@Test
	public void testGetCombination() {
		CombinationResolver co = new CombinationResolver();
		co.setCombine(new CombineOperator());
		
		List<Integer> singleDigitList = new ArrayList<Integer>();
		
		singleDigitList.add(new Integer(0));
		singleDigitList.add(new Integer(3));
		Assert.assertTrue("d e f".equals(co.getCombination(singleDigitList).getResult()));
		
		singleDigitList.add(new Integer(2));
		Assert.assertTrue("da db dc ea eb ec fa fb fc".equals(co.getCombination(singleDigitList).getResult()));
		
		singleDigitList.add(new Integer(1));
		singleDigitList.add(new Integer(7));
		Assert.assertTrue(co.getCombination(singleDigitList).getActualCount() == 3*3*4);
		Assert.assertTrue(co.getCombination(singleDigitList).getCountInTheory() == 3*3*4);
	}
}
