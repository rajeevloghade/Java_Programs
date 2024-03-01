package com.program.arrays;

public class MissingElemetFromArrayTwo {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 7, 8, 9, 6, 11 };

		int length = array.length;
		int sum = (length + 1) * (length + 2) / 2;

		for (int i = 0; i < array.length; i++) {
			sum -= array[i];
		}
		System.out.println("Missing element :" + sum);
	}

}
