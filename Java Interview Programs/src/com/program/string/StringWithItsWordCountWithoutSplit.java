package com.program.string;

import java.util.HashMap;
import java.util.Scanner;

public class StringWithItsWordCountWithoutSplit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String wordString = scanner.nextLine();

		StringBuilder word = new StringBuilder();

		HashMap<String, Integer> wordWithCount = new HashMap<>();

		for (char ch : wordString.toCharArray()) {
			if (ch == ' ') {
				String wordInString = word.toString();
				wordWithCount.put(wordInString, wordWithCount.getOrDefault(wordInString, 0) + 1);
				word.setLength(0);
			} else {
				word.append(ch);
			}

		}

		String wordInString = word.toString();
		wordWithCount.put(wordInString, wordWithCount.getOrDefault(wordInString, 0) + 1);
		word.setLength(0);

		System.out.println(wordWithCount);
		scanner.close();
	}

}
