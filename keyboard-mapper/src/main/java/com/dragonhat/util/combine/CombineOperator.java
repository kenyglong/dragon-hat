package com.dragonhat.util.combine;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class CombineOperator implements BinaryOperator<List<StringBuilder>> {

	@Override
	public List<StringBuilder> apply(List<StringBuilder> t, List<StringBuilder> u) {
		if (t.size() == 0)
			return u;
		if (u.size() == 0)
			return t;
		
		List<StringBuilder> result = new ArrayList<StringBuilder> ();
		t.stream()
			.map(x -> x == null ? new StringBuilder("") : x)
			.forEach( x -> {
					u.stream().map(y -> y == null ? new StringBuilder("") : y)
						.forEach(y -> result.add(new StringBuilder(x).append(y)));
			});
		
		return result;
	}

}
