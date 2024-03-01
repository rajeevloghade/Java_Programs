package com.program.string;

public class ReverseString {

	public static void main(String[] args) {

		String str = "abcdefgh";
		String reverseString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			// To reverse string
			reverseString += str.charAt(i);
		}
		System.out.println(reverseString);
	}

}
