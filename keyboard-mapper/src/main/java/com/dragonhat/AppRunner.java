package com.dragonhat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.dragonhat.util.combine.CombinationResolver;
import com.dragonhat.util.combine.CombineOperator;
import com.dragonhat.util.convert.MultipleDigitInputConvertor;
import com.dragonhat.util.domain.Combination;

public class AppRunner {
	public static void main(String args[]) {
		System.out.println("Please input digit array (using comma as separator, non-digit character will be ignored). Press \"Ctrl + c\" to abort. \n"
				+ "e.g. \n"
				+ "1, 32,99, 04 \n"
				+ "0,53, 143");

		CombinationResolver resolver = new CombinationResolver();
		resolver.setCombine(new CombineOperator());
		MultipleDigitInputConvertor convertor = new MultipleDigitInputConvertor();
		Combination result;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		while (true) {
			try {
				input = br.readLine();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
	
			result = resolver.getCombination(convertor.convert(convertor.parse(input)));
			System.out.println("Output: " + result.getResult());
			System.out.println("Number of combination in theory is: " + result.getCountInTheory());
			System.out.println("Actual Number of combination resolved is: " + result.getActualCount());
		}
	}
}
