package com.geekforgeek.easy;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class DeleteMiddleElementOfAStack {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Enter the size of stack");
		int stack_size = scanner.nextInt();
		System.out.println("Enter the "+stack_size+" value for stack");
		for(int i=0;i<stack_size;i++) {
			stack.add(scanner.nextInt());
		
		System.out.println(stack.remove(((stack_size+1)/2)-1));
	}

}
}

