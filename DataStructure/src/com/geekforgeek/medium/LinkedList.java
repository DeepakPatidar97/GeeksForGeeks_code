package com.geekforgeek.medium;

import java.util.Scanner;

public class LinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		try (Scanner scanner = new Scanner(System.in)) {

			Node head = new Node();
			head = list.addList(head);
			head = list.addList(head);
			head = list.addList(head);
			list.display(head);
		}
	}

	public Node addList(Node head) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int data = scanner.nextInt();
		Node node = new Node(data);
		if (head == null) {
			head = node;
		}

		for (Node start = head.next; start != null; start = start.next) {
			if (start.next.next != null) {
				start.next.next = node;
				break;
			}
		}

		return node;

	}

	public static int getNth(Node node, int ind) {
		int n = (int) Math.floor(ind/size(node));
		
		Node start = node;
		int count=1;
		while(start != null) {
			if(count == n) {
				return start.data;
			}
			count++;
			start = start.next;
		}
		return -1;
		
	}
	public static int size(Node node) {
		int count = 0;
		Node start=node;
		while(start!=null) {
			count++;
			start = start.next;
		}
		
		return count;
	}

	public void display(Node head) {
		System.out.println("\nvalue is : ");
		if (head == null) {
			System.out.println("List is empty");
		}
		while (head != null) {
			System.out.println(head.data + " ");
			head = head.next;
		}
	}

}

class Node {
	int data;
	Node next;

	public Node() {
		this.data = 0;
		this.next = null;
	}

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
