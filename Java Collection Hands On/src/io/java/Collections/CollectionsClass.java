package io.java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsClass {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(34);
		arrayList.add(76);
		arrayList.add(98);
		arrayList.add(32);
		arrayList.add(98);
		arrayList.add(71);
		arrayList.add(1);
		arrayList.add(12);
		arrayList.add(67);
		arrayList.add(64);
		arrayList.add(98);
		System.out.println(arrayList);
		System.out.println("Min : " + Collections.min(arrayList));
		System.out.println("Max : " + Collections.max(arrayList));
		System.out.println("Frequency : " + Collections.frequency(arrayList, 98));
		Collections.sort(arrayList);
		System.out.println("Sort : " + arrayList);
		Collections.sort(arrayList, Comparator.reverseOrder());
		System.out.println("Sort : " + arrayList);

	}

}
