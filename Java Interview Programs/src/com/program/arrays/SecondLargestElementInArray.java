package com.program.arrays;

import java.util.Arrays;

public class SecondLargestElementInArray {

	// Bubble sort
	public static void main(String[] args) {
		int[] array = { 4, 7, 9, 4, 6, 4, 8, 3 };

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
				i = -1;
			}
		}

		System.out.println("Array : " + Arrays.toString(array));
		System.out.println("Second largest element : " + array[array.length - 2]);
	}

}
