package io.java.Set;

import java.util.HashSet;

public class CustomHashSetExample {

	public static void main(String[] args) {
		/**
		 * HashSet does not preserve the insertion order
		 */
		HashSet<Student> set = new HashSet<>();
		set.add(new Student(1, "AAA"));
		set.add(new Student(3, "CCC"));
		set.add(new Student(4, "DDD"));
		set.add(new Student(2, "BBB"));
		set.add(new Student(4, "DDD"));
		set.add(new Student(3, "CCC"));
		System.out.println(set);
		
		set.removeAll(set);
		System.out.println(set);

	}

}
/**
 * Set (Interface)-> (Classes) HashSet, LinkedHashSet, (Interface)SortedSet,
 * (Class)TreeSet
 * 
 * Set is an UnOrdered collection of elements. It does not maintain the
 * insertion order. It does not allow duplicate values. Only one null value can
 * be stored.
 */