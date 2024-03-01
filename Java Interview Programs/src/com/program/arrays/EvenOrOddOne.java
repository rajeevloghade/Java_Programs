package com.program.arrays;

public class EvenOrOddOne {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 7, 8, 9 };

		for (int i = 0; i < array.length; i++) {

			if ((array[i] & 1) == 0 || (array[i] % 2) == 0)
				System.out.println("Even: " + array[i]);
			else
				System.out.println("Odd: " + array[i]);
		}

	}

}
