package com.program.string;

import java.util.Arrays;

public class SortString {

	// Bubble sort
	public static void main(String[] args) {
		String str = "rajeevloghade";

		char[] chars = str.toCharArray();

		for (int i = 0; i < chars.length - 1; i++) {
			if (chars[i] > chars[i + 1]) {
				char temp = chars[i];
				chars[i] = chars[i + 1];
				chars[i + 1] = temp;
				i = -1;
			}
		}
		System.out.println(Arrays.toString(chars));
		for (char c : chars) {
			System.out.print(c + " ");
		}
	}

}
