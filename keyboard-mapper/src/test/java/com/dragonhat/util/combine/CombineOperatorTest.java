package com.dragonhat.util.combine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.*;

public class CombineOperatorTest {
	@Test
	public void testApply() {
		List<StringBuilder> list1 = new ArrayList<StringBuilder> ();
		List<StringBuilder> list2 = new ArrayList<StringBuilder> ();
		list2.add(new StringBuilder("d"));
		list2.add(new StringBuilder("e"));
		list2.add(new StringBuilder("f"));
		
		CombineOperator co = new CombineOperator();
		Assert.assertEquals("d e f", co.apply(list1, list2).stream().collect(Collectors.joining(" ")));
		Assert.assertEquals("d e f", co.apply(list2, list1).stream().collect(Collectors.joining(" ")));
		
		list1.add(new StringBuilder("a"));
		Assert.assertEquals("ad ae af", co.apply(list1, list2).stream().collect(Collectors.joining(" ")));
		
		list1.add(new StringBuilder("b"));
		list1.add(new StringBuilder("c"));
		Assert.assertEquals("ad ae af bd be bf cd ce cf", co.apply(list1, list2).stream().collect(Collectors.joining(" ")));
	}
}
