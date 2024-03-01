package com.program.string;

import java.util.HashMap;
import java.util.Map;

public class StringWithItsCharCount {

	public static void main(String[] args) {

		String str = "geeksforgeeks";
		String stringWithItsCharCount = "";

		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for (Map.Entry<Character, Integer> charWithCount : map.entrySet()) {
			stringWithItsCharCount += charWithCount.getKey() + "" + charWithCount.getValue();
		}
		System.out.println(map);
		System.out.println(stringWithItsCharCount);
	}

}
