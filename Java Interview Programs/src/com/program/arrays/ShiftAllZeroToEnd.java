package com.program.arrays;

import java.util.Arrays;

public class ShiftAllZeroToEnd {

	// Shift All Zero To End of the array
	public static void main(String[] args) {

		int[] array = { 1, 0, 8, 7, 0, 5, 0, 4, 0, 6, 3 };

		int count = 0;
		// traverse array and check for non-zero
		for (int i = 0; i < array.length; i++)
			if (array[i] != 0)
				array[count++] = array[i];

		System.out.println(Arrays.toString(array));
		// now insert 0 at the end
		while (count < array.length)
			array[count++] = 0;

		System.out.println(Arrays.toString(array));
	}

}
//Time Complexity: O(n) 
//Auxiliary Space: O(1)
