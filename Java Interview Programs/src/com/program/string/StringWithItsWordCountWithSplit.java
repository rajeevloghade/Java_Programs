package com.program.string;

import java.util.HashMap;
import java.util.Map;

public class StringWithItsWordCountWithSplit {

	public static void main(String[] args) {
		String sentence = "Rajeev is a good person and Rajeev is software engineer";
		String[] words = sentence.split(" "); // Split the sentence into words

		HashMap<String, Integer> wordCountMap = new HashMap<>();

		for (String word : words) {
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
		}

		for (Map.Entry<String, Integer> map : wordCountMap.entrySet()) {
			System.out.println(map);
		}
		System.out.println(wordCountMap);
	}

}
