package com.geekforgeek.easy;

import java.util.Scanner;

public class TwoStacksInAnArray {
	static TwoStacksInAnArray twoStacksInAnArray = new TwoStacksInAnArray();
	static int top1 = 0, top2= 0,stack_size = 0;
	static int ar[] = null;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the size of stack1 and stack2 size");
		int stack1 = sc.nextInt();
		int stack2 = sc.nextInt();
		stack_size =  stack1+stack2; 
		ar = new int[stack_size];
		top1 = -1;
		top2 = stack_size;
		
		twoStacksInAnArray.push1(1);
		twoStacksInAnArray.push2(2);
		System.out.println(twoStacksInAnArray.pop1());
		twoStacksInAnArray.push1(3);
		System.out.println(twoStacksInAnArray.pop1());
		System.out.println(twoStacksInAnArray.pop1());
	}
	
	void push1(int x)
    {
     ar[++top1] = x;
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
    	ar[--top2] = x;
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
    	if(top1==-1) {
    		return -1;
    	}else {
    		return ar[top1--];
    	}
		
        
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
    	if(top2==stack_size) {
    		return -1;
    	}else {
    		return ar[top2++];
    	}
        
    }

}
