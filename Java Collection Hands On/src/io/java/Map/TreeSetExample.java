package io.java.Map;

import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeSetExample {

	public static void main(String[] args) {
		/**
		 * TreeMap stores the elements in a sorted order
		 */
		TreeMap<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(25, "Welcomes");
		treeMap.put(10, "Geeks");
		treeMap.put(30, "You");
		treeMap.put(20, "Geeks");
		treeMap.put(15, "4");

		System.out.println("TreeMap: " + treeMap);

		Entry<Integer, String> firstEntry = treeMap.firstEntry();
		System.out.println(firstEntry);

		Entry<Integer, String> ceilingEntry = treeMap.ceilingEntry(25);
		System.out.println(ceilingEntry);

		NavigableSet<Integer> descendingKeySet = treeMap.descendingKeySet();
		System.out.println(descendingKeySet);

		Set<Entry<Integer, String>> entrySet = treeMap.entrySet();
		System.out.println(entrySet);

	}
}
