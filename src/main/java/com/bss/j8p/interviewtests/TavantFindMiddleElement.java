package com.bss.j8p.interviewtests;

import java.util.Vector;

public class TavantFindMiddleElement {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		head.next.next.next.next.next.next = new Node(70);

		System.out.println("Middle Value Of Linked List is: " + getMiddle(head));

	}

	static int getMiddle(Node head) {

		System.out.println(head);

		// Vector to store the values of all nodes
		Vector<Integer> list_values = new Vector<>();

		// Traverse through the entire linked list and push
		// all the values into the list
		while (head != null) {
			list_values.add(head.data);
			head = head.next;
		}
		System.out.println(list_values.size());

		// Find the middle index
		int mid_index = list_values.size() / 2;

		// Return the value stored at the middle index
		return list_values.get(mid_index);
	}
}

class Node {
	int data;
	Node next;

	Node(int new_data) {
		this.data = new_data;
		this.next = null;
	}
}
