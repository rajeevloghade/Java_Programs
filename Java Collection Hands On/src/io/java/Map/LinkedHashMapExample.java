package io.java.Map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// Java Program to Demonstrate Working of LinkedHashMap

		// Creating an empty LinkedHashMap
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();

		// Adding entries in Map
		// using put() method
		lhm.put("one", "practice.geeksforgeeks.org");
		lhm.put("two", "code.geeksforgeeks.org");
		lhm.put("four", "quiz.geeksforgeeks.org");

		// Printing all entries inside Map
		System.out.println(lhm);

		// Note: It prints the elements in same order
		// as they were inserted

		// Getting and printing value for a specific key
		System.out.println("Getting value for key 'one': " + lhm.get("one"));

		// Getting size of Map using size() method
		System.out.println("\nSize of the map: " + lhm.size());

		// Checking whether Map is empty or not
		System.out.println("\nIs map empty? " + lhm.isEmpty());

		// Using containsKey() method to check for a key
		System.out.println("\nContains key 'two'? " + lhm.containsKey("two"));

		// Using containsKey() method to check for a value
		System.out.println("\nContains value 'practice.geeks" + "forgeeks.org'? "
				+ lhm.containsValue("practice" + ".geeksforgeeks.org"));

		// Removing entry using remove() method
		System.out.println("\ndelete element 'one': " + lhm.remove("one"));

		// Printing mappings to the console
		System.out.println("\nMappings of LinkedHashMap : " + lhm);

		System.out.println("\nIterating using entrySet : ");

		for (Entry<String, String> map : lhm.entrySet()) {
			System.out.println(map.getKey() + "=" + map.getValue());
		}
	}
}
