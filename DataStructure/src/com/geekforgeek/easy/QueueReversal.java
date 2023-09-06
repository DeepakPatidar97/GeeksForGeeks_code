package com.geekforgeek.easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueReversal {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the number of inputs : ");
			int input = scanner.nextInt();
			System.out.println("Enter the "+input+" values : ");
			for(int i=0;i<input;i++)
			q.add(scanner.nextInt());
		}
		Object[] arr = q.toArray();
		q.clear();
		for(int i=arr.length-1;i>=0;i--) {
			q.add((Integer) arr[i]);
		}
		System.out.println(q);
	}

}
