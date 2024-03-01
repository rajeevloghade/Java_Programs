package com.program.arrays;

import java.util.Arrays;

public class SecondLargestElementWithouSortingInArray {

	public static void main(String[] args) {
		int[] array = { 4, 7, 9, 4, 6, 4, 8, 3 };

		int max = array[0];
		int secondMax = array[0];

		for (int i = 0; i < array.length; i++) {
			System.out.println(max + " < " + array[i]);
			if (max < array[i]) {
				secondMax = max;
				max = array[i];
			}
			System.out.println(array[i] + " < " + max + " && " + array[i] + " > " + secondMax);
			if (array[i] < max && array[i] > secondMax) {
				secondMax = array[i];
			}
		}

		System.out.println("Array : " + Arrays.toString(array));
		System.out.println("Second largest element without soring : " + secondMax);
	}

}
