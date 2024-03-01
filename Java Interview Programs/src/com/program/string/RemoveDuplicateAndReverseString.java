package com.program.string;

public class RemoveDuplicateAndReverseString {

	public static void main(String[] args) {

		String str = "abcdefghabcdefgh";
		String reverseString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			// To remove duplicates
			char ch = str.charAt(i);
			if (reverseString.indexOf(ch) == -1)
				// To reverse string
				reverseString += ch;
		}
		System.out.println(reverseString);
	}

}
