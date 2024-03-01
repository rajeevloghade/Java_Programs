package com.program.string;

public class StringWithBalancedBrackets {

	public static void main(String[] args) {

		String str = "[()]{}{[()()]()}(){}";

		char[] result = new char[str.length()];
		int i = -1;
		for (char ch : str.toCharArray()) {

			if (ch == '(' || ch == '[' || ch == '{') {
				result[++i] = ch;
			} else if (i >= 0 && (result[i] == '(' && ch == ')') || (result[i] == '{' && ch == '}')
					|| (result[i] == '[' && ch == ']')) {
				i--;
			}

		}
		boolean check = i == -1;
		System.out.println("Is " + str + " Balanced : " + check);

	}

}
//Time Complexity: O(N), Iteration over the string of size N one time.
//Auxiliary Space: O(N) for the char array. 
