package com.ds.stack;

import java.util.Scanner;

public class App {
   
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of stack : ");
		Stack stack = new Stack(input.nextInt());
		 
		
		boolean flag = true;
		do {
		System.out.println("Hello there, Which Opration you want to perform ? check below\n"
				+ "1. Push\n"
				+ "2. Pop\n"
				+ "3. Display\n"
				+ "4. is_Empty\n"
				+ "5. Find Value\n"
				+ "8. exit\n");
		int ops = input.nextInt();
		
		switch (ops) {
		case 1: {
			System.out.println("Enter the Value : ");
			int item = input.nextInt();
			if(stack.push(item)) {
				System.out.println("\nValue Successfully Insrted");
			}
			break;
			
		}
		case 2:{
			System.out.println("\nValue has been revomed : "+stack.pop()+" \n");
			break;
		}
		case 3:{
			stack.display();
			break;
		}
		case 4:{
			if(!stack.is_empty()) {
				System.out.println("Stack have some value");
			}
			break;
		}
		case 5:{
			System.out.println("Enter the Value : ");
			int item = input.nextInt();
			if(stack.find(item)) {
				System.out.println("\nItem found in Stack");
			}
			break;
		}
		case 8:{
			flag = false;
			break;
		}
		default:
			System.out.println("Enter Vaild Key");
		}
		}while(flag);
	}
}
