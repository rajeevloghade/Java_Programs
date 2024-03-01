package io.java.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		/**
		 * LinkedHashSet preserve the insertion order
		 */
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("AWS");
		linkedHashSet.add("Python");
		linkedHashSet.add("Blockchain");
		linkedHashSet.add("Python");
		linkedHashSet.add("Java");
		linkedHashSet.add("Blockchain");
		System.out.println(linkedHashSet);
		linkedHashSet.stream().filter(s -> s.contains("Python")).forEach(System.out::println);
		linkedHashSet.removeAll(linkedHashSet);
		System.out.println(linkedHashSet);

	}

}
