package io.java.Set;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		/**
		 * TreeSet stores the elements in a sorted order
		 */
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("AWS");
		treeSet.add("Python");
		treeSet.add("Blockchain");
		treeSet.add("Python");
		treeSet.add("Java");
		treeSet.add("Blockchain");
		System.out.println(treeSet);
		treeSet.stream().filter(s -> s.contains("Python")).forEach(System.out::println);
		treeSet.removeAll(treeSet);
		System.out.println(treeSet);

	}

}
