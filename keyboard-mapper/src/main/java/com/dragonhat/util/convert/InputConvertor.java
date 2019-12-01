package com.dragonhat.util.convert;

import java.util.List;

public interface InputConvertor {
	
	public List<String> parse(String str);
	
	public List<Integer> convert(List<String> strList);
}
