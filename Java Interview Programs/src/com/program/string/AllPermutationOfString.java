package com.program.string;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationOfString {

	public static void main(String[] args) {
		String str = "ABC";
		List<String> allPermutation = generatePermutation(str);

		for (String permutation : allPermutation) {
			System.out.println(permutation);
		}
	}

	private static List<String> generatePermutation(String str) {
		List<String> permutaions = new ArrayList<>();
		generatePermutationHelper(str.toCharArray(), 0, permutaions);
		return permutaions;
	}

	private static void generatePermutationHelper(char[] ch, int index, List<String> permutaions) {

		if (index == ch.length - 1) {
			permutaions.add(new String(ch));
		}

		for (int i = index; i < ch.length; i++) {
			swap(ch, index, i);
			generatePermutationHelper(ch, index + 1, permutaions);
			swap(ch, index, i);
		}
	}

	private static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
}
