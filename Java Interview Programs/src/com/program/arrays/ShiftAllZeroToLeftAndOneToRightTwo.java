package com.program.arrays;

import java.util.Arrays;

public class ShiftAllZeroToLeftAndOneToRightTwo {

//	Shift All Zero To Left And One To Right or VICE-VERSA
	public static void main(String[] args) {
		int[] array = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };

		int left = 0;
		int right = array.length - 1;

		while (left < right) {

			// check for zero left side
			while (array[left] == 0 && left < right)
				left++;

			// check for one right side
			while (array[right] == 1 && left < right)
				right--;

			// swap 0 and 1
			if (left < right) {
				array[left++] = 0;
				array[right--] = 1;
			}
		}

		System.out.println(Arrays.toString(array));
	}

}
