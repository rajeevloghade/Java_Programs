package com.program.string;

public class PellindromeString {

	public static void main(String[] args) {

		String str = "Nayan";
		String reverseString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			// To reverse string
			reverseString += str.charAt(i);
		}
		// To check is Pellindrome or NOT
		if (reverseString.equalsIgnoreCase(str)) {
			System.out.println(reverseString + " is Pellindrome");
		} else
			System.out.println(reverseString + " is NOT Pellindrome");
	}

}
