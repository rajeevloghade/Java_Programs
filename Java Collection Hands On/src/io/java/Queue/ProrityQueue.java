package io.java.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ProrityQueue {

	public static void main(String[] args) {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
		System.out.println(priorityQueue.offer(12));
		priorityQueue.offer(24);
		priorityQueue.offer(36);
		priorityQueue.offer(40);
		System.out.println(priorityQueue);
		System.out.println("Poll : " + priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println("Peek : " + priorityQueue.peek());

	}

}
