package com.program.arrays;

public class LargestAndSmallestElementInArray {

	public static void main(String[] args) {
		int[] array = { 4, 7, 9, 4, 6, 1, 0, 10, 4, 8, 3 };

		int largest = array[0];
		int smallest = array[0];

		for (int i = 1; i < array.length; i++) {
			if (largest < array[i])
				largest = array[i];
			else if (smallest > array[i])
				smallest = array[i];
		}

		System.out.println("largest : " + largest);
		System.out.println("smallest : " + smallest);
	}

}
