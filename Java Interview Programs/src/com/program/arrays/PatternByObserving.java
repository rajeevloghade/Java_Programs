package com.program.arrays;

public class PatternByObserving {

	// Asked in Deqode
	// Input : 1, 4, 3, 2
	// Output : 24, 6, 8, 12

	public static void main(String[] args) {

		int[] array = { 1, 4, 3, 2 };
		int[] tempArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			int result = 1;
			for (int j = 0; j < array.length; j++) {
				if (i != j)
					result *= array[j];
			}
			tempArray[i] = result;
		}
		for (int element : tempArray) {
			System.out.print(element + " ");
		}
	}

}
