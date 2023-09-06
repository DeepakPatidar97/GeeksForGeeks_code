package com.geekforgeek.easy;

import java.util.Scanner;

public class NumberOf1Bits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The decimal Value : ");
		int num = sc.nextInt();
		int count =0;
		while(num!=0) {
			if(num%2!=0) {
				count++;
			}
			num /= 2;
		}
		System.out.println("1's is :"+ count);

	}

}
