package io.java.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		System.out.println(queue.offer(12));
		queue.offer(24);
		queue.offer(36);
		System.out.println(queue);
		System.out.println("Poll : " + queue.poll());
		System.out.println(queue);
		System.out.println("Peek : " + queue.peek());

	}

}
