package com.program.arrays;

import java.util.Arrays;

public class ShiftAllZeroToLeftAndOneToRight {

//	Shift All Zero To Left And One To Right 
	public static void main(String[] args) {
		
		int[] array = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };

		int count = 0;
		// count for 0s
		for (int i = 0; i < array.length; i++)
			if (array[i] == 0)
				count++;

		// insert 0 in array
		for (int i = 0; i < count; i++)
			array[i] = 0;

		// insert 1 in array
		for (int i = count; i < array.length; i++)
			array[i] = 1;

		System.out.println(Arrays.toString(array));
	}

}
//Time Complexity: O(2n) 
//Auxiliary Space: O(1)

