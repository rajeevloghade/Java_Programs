package com.program.arrays;

public class CommonElemetInThreeArray {

	public static void main(String[] args) {

		int[] array1 = { 1, 5, 10, 20, 40, 80, 44 };
		int[] array2 = { 6, 7, 20, 80, 44, 100 };
		int[] array3 = { 3, 4, 44, 15, 20, 30, 70, 80, 120 };

		int[] tempArray1 = new int[5];
		int[] tempArray2 = new int[5];
		int count = 0;

		// Compare array1 with array2
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j])
					tempArray1[count++] = array1[i];
			}
		}

		count = 0;
		// Compare tempArray1 with array3
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < tempArray1.length; j++) {
				if (array3[i] == tempArray1[j])
					tempArray2[count++] = array3[i];
			}
		}

		for (int i = 0; i < count; i++) {
			System.out.print(tempArray2[i] + " ");
		}

	}

}
