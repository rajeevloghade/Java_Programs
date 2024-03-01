package com.program.arrays;

public class RemoveDuplicatesFromArray {

//Input  : a[] = {1, 1, 2, 2, 2}
//Output : a[] = {1,2}

	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 2, 2, 3, 4, 5, 6, 6, 7, 7 };
		int[] tempArray = new int[array.length];

		int j = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1])
				tempArray[j++] = array[i];
		}
		tempArray[j++] = array[array.length - 1];
		for (int i = 0; i < j; i++) {
			System.out.print(tempArray[i] + " ");
		}
		
		/* Return unique element in array (Asked in Nagarro)
		int[] tempArray2 = new int[j];
		for (int i = 0; i < j; i++) {
			tempArray2[i] = tempArray[i];
		}
		return tempArray2;
		for (int i = 0; i < tempArray2.length; i++) {
			System.out.print(tempArray2[i] + " ");
		}*/

	}

}
//Time Complexity: O(n)
//Space Complexity: O(n)
