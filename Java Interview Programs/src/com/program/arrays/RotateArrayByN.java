package com.program.arrays;

import java.util.Arrays;

public class RotateArrayByN {

	// rotate array by N in Left
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7 };
		int temp[] = new int[array.length];
		int n = 2;
		int j = 0;

		// TO LEFT SIDE
		for (int i = n; i < array.length; i++) {
			temp[j++] = array[i];
		}

		// TO RIGHT SIDE
//		for (int i = array.length - 1; i >= n; i--) {
//			temp[j++] = array[i];
//		}

		System.out.println(Arrays.toString(temp));

		for (int i = 0; i < n; i++) {
			temp[j++] = array[i];
		}
		System.out.println(Arrays.toString(temp));

	}

}
