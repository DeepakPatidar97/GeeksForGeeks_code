package com.ds.stack;

public class Stack {

	int element[];
	int top;
	final int MAX;
	boolean flag = false;
	
	public Stack(int size) {
		element = new int[size];
		top = -1;
		this.MAX = size-1;
	}
	
	public boolean push(int value) {
		flag = true;
		if(top == MAX ) {
			flag = false;
			System.out.println("Stack overflow");
		}else {
			element[++top] = value;
			flag = true;
		}
		return flag;
	}

	public int pop() {
		return element[top--];
	}
	
	public void display() {
	 System.out.println("Stack value is : ");
	 for(int i=0; i<=top;i++) {
		 System.out.print(element[i]+" ");
	 }
	 System.out.println("\n");
	}

	public boolean is_empty() {
		flag = false;
		if(top == -1) {
			flag = true;
			System.out.println("stack is empty");
		}
		return flag;
	}

	public boolean find(int item) {
		flag = false;
		 for(int i=0; i<=top;i++) {
			if(element[i]==item) {
				flag = true;
			}
		 }
		return flag;
	}
	
	
}
