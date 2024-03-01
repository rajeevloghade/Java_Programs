package com.program.arrays.TwoSum;

public class IndexOfFirstOne {

	// find first index of 1
	public static void main(String[] args) {
		int[] array = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1 };
		int index = -1;
		for (int i = 0; i < array.length; i++)
			if (array[i] == 1) {
				index = i;
				break;
			}

		System.out.println("First index of 1 is : " + index);
	}

}
