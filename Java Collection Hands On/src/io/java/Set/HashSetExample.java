package io.java.Set;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		/**
		 * HashSet does not preserve the insertion order
		 */
		HashSet<String> set = new HashSet<>();
		set.add("AWS");
		set.add("Python");
		set.add("Blockchain");
		set.add("Python");
		set.add("Java");
		set.add("Blockchain");
		System.out.println(set);
		set.stream().filter(s -> s.contains("Python")).forEach(System.out::println);
		set.removeAll(set);
		System.out.println(set);

	}

}
/**
 * Set (Interface)-> (Classes) HashSet, LinkedHashSet, (Interface)SortedSet,
 * (Class)TreeSet
 * 
 * Set is an UnOrdered collection of elements. It does not maintain the
 * insertion order. It does not allow duplicate values. Only one null value can be stored.
 */