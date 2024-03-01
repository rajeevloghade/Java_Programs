package com.program.string;

public class RemoveDuplicatesFromStringAndSort {

	public static void main(String[] args) {

		String str = "geeksforgeeks";
		String unique = "";

		// remove duplicates
		for (char ch : str.toCharArray()) {
			if (unique.indexOf(ch) == -1)
				unique += ch;
		}

		System.out.println("Unique element : " + unique);

		// now sort unique element string
		char[] chars = unique.toCharArray();

		for (int i = 0; i < chars.length - 1; i++) {
			if (chars[i] > chars[i + 1]) {
				char temp = chars[i];
				chars[i] = chars[i + 1];
				chars[i + 1] = temp;
				i = -1;
			}
		}

		System.out.print("Sorted unique element : ");
		System.out.println(chars);

	}

}
