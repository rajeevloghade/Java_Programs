package com.program.arrays;

import java.util.Arrays;

public class SortArrayWithoutMethodOne {

	// Selection sort
	public static void main(String[] args) {
		int[] array = { 4, 7, 9, 4, 2, 6, 0, 4, 8, 3 };

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}

//TC : O(N^2)
//SC : O(1)