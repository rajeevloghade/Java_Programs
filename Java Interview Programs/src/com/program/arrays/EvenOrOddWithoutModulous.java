package com.program.arrays;

public class EvenOrOddWithoutModulous {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 7, 8, 9 };

		for (int i = 0; i < array.length; i++) {
			if (isEven(array[i]))
				System.out.println(array[i] + " is Even");
			else
				System.out.println(array[i] + " is Odd");

		}

	}

	public static boolean isEven(int n) {
		boolean isEven = true;

		for (int i = 1; i <= n; i++)
			isEven = !isEven;

		return isEven;
	}

}
//Time Complexity: O(n) 
//Auxiliary Space: O(1)