package com.program.arrays;

public class ReverseLinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList linkedList = new ReverseLinkedList();
		linkedList.head = new Node(80);
		linkedList.head.next = new Node(70);
		linkedList.head.next.next = new Node(60);
		linkedList.head.next.next.next = new Node(50);
		linkedList.head.next.next.next.next = new Node(40);

		printLinkedList(head);
		printLinkedList(reverseLinkedList(head));
	}

	private static Node reverseLinkedList(Node node) {
		Node pre = null;
		Node current = node;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = pre;
			pre = current;
			current = next;
		}

		return pre;
	}

	public static void printLinkedList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}
}
