package com.dragonhat.util.convert;

import java.util.ArrayList;
import java.util.List;

public class MultipleDigitInputConvertor extends SingleDigitInputConvertor{
	@Override
	public List<Integer> convert(List<String> strList) {
		List<Integer> resultList = new ArrayList<Integer> ();
		
		strList.stream().forEach( x -> {
			if (x.length() == 1) {
				resultList.add(new Integer(x));
			} else {
				// convert every digit into Integer 
				for (int i=0; i< x.length(); i++) {
					String digit = x.substring(i, i+1);
					resultList.add(new Integer(digit));
				}
			}
		});
		
		return resultList;
	}
}
