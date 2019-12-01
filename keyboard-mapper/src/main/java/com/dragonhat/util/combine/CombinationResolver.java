package com.dragonhat.util.combine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.dragonhat.util.DigitLetterMap;
import com.dragonhat.util.domain.Combination;

public class CombinationResolver {
	private static final String delimiter = " ";
	private CombineOperator combine;
	
	public void setCombine(CombineOperator combine) {
		this.combine = combine;
	}

	public Combination getCombination(List<Integer> digitList) {
		List<StringBuilder> sbl = new ArrayList<StringBuilder> ();
		
		// calculate number of combination according to math theory
		long countInTheory = digitList.stream()
				.map(x -> DigitLetterMap.getLetterCount(x))
				.reduce(0, (a, b) -> (a == 0 || b == 0) ? a + b : a * b);

		sbl = digitList.stream()
				.map(x -> DigitLetterMap.getLetter(x))
				.reduce(new ArrayList<StringBuilder> (), (a, b) -> combine.apply(a, b));
		
		Combination result = new Combination();
		result.setCountInTheory(countInTheory);
		result.setActualCount(sbl.size());
		result.setResult(sbl.stream().collect(Collectors.joining(delimiter)));
		
		return result;
	}
}
