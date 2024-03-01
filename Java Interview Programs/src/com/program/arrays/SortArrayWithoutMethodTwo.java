package com.program.arrays;

public class SortArrayWithoutMethodTwo {

	// Bubble sort
	public static void main(String[] args) {
		int[] array = { 4, 7, 9, 4, 2, 6, 0, 4, 8, 3 };

		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] > array[i + 1]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
				i = -1;
			}
		}
		for (int ele : array) {
			System.out.print(ele + " ");
		}
	}

}

//TC : O(N)
//SC : O(1)