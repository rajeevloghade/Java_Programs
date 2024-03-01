package com.program.arrays.TwoSum;

public class TwoSum {

	// find it possible or not / find indexes
	public static void main(String[] args) {
		int[] array = { 2, 6, 5, 8, 11 };
		int[] indexes = new int[2];
		indexes[0] = indexes[1] = -1;
		int target = 10;
		String isPossible = "NO";
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == target) {
					isPossible = "YES";
					indexes[0] = j;
					indexes[1] = i;
				}
			}
		}
		System.out.println("isPossible :" + isPossible);
		System.out.println("Indexes : " + indexes[0] + ", " + indexes[1]);
	}

}
//Time Complexity: O(N2), where N = size of the array.
//Space Complexity: O(1) as we are not using any extra space.