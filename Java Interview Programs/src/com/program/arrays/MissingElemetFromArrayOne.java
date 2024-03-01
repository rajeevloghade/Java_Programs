package com.program.arrays;

public class MissingElemetFromArrayOne {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int mainSum = 0;
		int tempSum = 0;

		for (int i = 1; i < 10; i++) {
			mainSum += i;
		}
		for (int i = 0; i < array.length; i++) {
			tempSum += array[i];
		}
		System.out.println("Missing element :" + (mainSum - tempSum));
	}

}
