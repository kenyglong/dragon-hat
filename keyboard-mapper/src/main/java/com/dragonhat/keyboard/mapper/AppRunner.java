package com.dragonhat.keyboard.mapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppRunner {
	public static void main(String args[]) {
		System.out.println("Please input digit array (using comma as separator, space will be ignored). Press \"Ctrl + c\" to abort. \n"
				+ "e.g. \n"
				+ "1, 32,99, 04 \n"
				+ "0,53, 143");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		while (true) {
			try {
				input = br.readLine();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
	
			if (input != null) {
				try {
					CombinationResolver.getLetters(InputConvertor.parse(InputConvertor.getDigitList(input)));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
