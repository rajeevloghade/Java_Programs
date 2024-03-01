package io.java.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ArrayListExample {

	public static void main(String[] args) {
		System.out.println("Array List Examples : ");
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("AWS");
		arrayList.add("Java");
		arrayList.add("Python");
		arrayList.add("Blockchain");
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		arrayList.remove(2);
		arrayList.remove(String.valueOf("AWS"));
		System.out.println(arrayList);
		arrayList.addAll(Arrays.asList("AAA", "BBB", "CCC"));
		System.out.println(arrayList);
		System.out.println("\nContains and containsAll methods : ");
		System.out.println(arrayList.contains("FFF"));
		System.out.println(arrayList.containsAll((Arrays.asList("BBB", "CCC"))));
		System.out.println(arrayList);
		System.out.println("\nPrinting using lamda for each : ");
		arrayList.forEach(System.out::println);

		System.out.println("\nIterating using Iterator : ");
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\nIterating using ListIterator : ");
		ListIterator<String> listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("\nFiltering Using Stream Apis: ");
		ArrayList<Integer> arrayListOne = new ArrayList<>();
		arrayListOne.add(99);
		arrayListOne.add(234);
		arrayListOne.add(12);
		arrayListOne.add(64);
		arrayListOne.add(410);
		arrayListOne.add(110);
		System.out.println(arrayListOne);
		
		System.out.println("\nGetting elements from list which greater than 100 as another list : ");
		List<Integer> collect = arrayListOne.stream().filter(list -> list > 100).collect(Collectors.toList());
		System.out.println(collect);
	}

}

/**
 * List (Interface)-> (Classes) ArrayList, LinkedList, Vector, Stack
 * ArrayList 
           -> initial size is 10. And it increases its size by (n+n/2+1). n is size(10) of list
 * List is an an ordered collection of elements. It maintains the insertion
 * order. It allows duplicate values. Any no. of null values can be stored.
 */
