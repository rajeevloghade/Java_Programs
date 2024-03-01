package io.java.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		System.out.println("Linked List Examples : ");

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("A");
		linkedList.add("B");
		linkedList.addLast("C");
		linkedList.addFirst("D");
		System.out.println(linkedList);
		linkedList.add(2, "E");
		linkedList.set(4, "set");

//		linkedList.clear(); delete all elements

		System.out.println(linkedList);

		System.out.println(linkedList.getFirst());
		System.out.println("\nIterating using Iterator : ");
		Iterator<String> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("\nRemove methods : ");
		linkedList.remove("B");
		linkedList.remove(3);
		linkedList.removeFirst();
		linkedList.removeLast();

		System.out.println(linkedList);
	}

}
