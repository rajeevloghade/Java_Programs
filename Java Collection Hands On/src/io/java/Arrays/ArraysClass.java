package io.java.Arrays;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int index = Arrays.binarySearch(array, 6);
		System.out.println(index);

		int[] array2 = { 3, 4, 1, 2, 5, 8, 9, 0, 6, 7, };
		Arrays.sort(array2);

//		Arrays.fill(array2, 11);
		for (int i : array2) {
			System.out.print(i + " ");
		}

	}
}
