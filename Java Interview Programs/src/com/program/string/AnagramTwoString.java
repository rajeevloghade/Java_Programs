package com.program.string;

public class AnagramTwoString {

	// check two string Anagram
	public static void main(String[] args) {
		String str = "rajeevloghade";
		String str2 = "radogajeevelh";
		boolean isAnagram = false;

		// check length of both strings
		if (str.length() == str2.length()) {
			// sort both strings
			char[] chars = sortString(str);
			char[] chars2 = sortString(str2);

			// compare both sorted char arrays
			for (int i = 0; i < chars.length; i++) {
				if (chars[i] == chars2[i])
					isAnagram = true;
				else {
					isAnagram = false;
					break;
				}
			}
		}
		if (isAnagram)
			System.out.println(str + " and " + str2 + " is Anagram");
		else
			System.out.println(str + " and " + str2 + " is NOT Anagram");

	}

	private static char[] sortString(String str) {
		char[] chars = str.toCharArray();

		for (int i = 0; i < chars.length - 1; i++) {
			if (chars[i] > chars[i + 1]) {
				char temp = chars[i];
				chars[i] = chars[i + 1];
				chars[i + 1] = temp;
				i = -1;
			}
		}
		return chars;
	}

}
