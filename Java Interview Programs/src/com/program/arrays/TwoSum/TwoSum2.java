package com.program.arrays.TwoSum;

import java.util.HashMap;

public class TwoSum2 {

	// find it possible of not / find indexes using HashMap
	public static void main(String[] args) {
		int[] array = { 2, 6, 5, 8, 11 };
		int target = 10;
		String isPossible = "NO";
		int[] indexes = new int[2];
		indexes[0] = indexes[1] = -1;

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			int number = array[i];
			int moreNeeded = target - number;
			if (map.containsKey(moreNeeded)) {
				isPossible = "YES";
				indexes[0] = map.get(moreNeeded);
				indexes[1] = i;

			} else
				map.put(number, i);
		}
		System.out.println("isPossible : " + isPossible);
		System.out.println("indexes : " + indexes[0] + ", " + indexes[1]);

	}

}
//Time Complexity: O(N), where N = size of the array.
//Space Complexity: O(N) as we use the map data structure.
