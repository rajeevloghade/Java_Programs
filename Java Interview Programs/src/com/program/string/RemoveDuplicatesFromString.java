package com.program.string;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {

		String str = "geeksforgeeks";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (result.indexOf(ch) == -1)
				result += ch;
		}
		System.out.println(result);

	}

}
