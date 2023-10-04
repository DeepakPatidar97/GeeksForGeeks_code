package com.geekforgeek.school;

public class PrintPattern {

	public static void main(String[] args) {
		printPat(3);
	}

	static void printPat(int n) {
		if (n == 1) {
			System.out.print(n + " $");

		} else {
			int count = 0;
			for(int i = n;i>0;i--) {
				int num = i;
				for(int j=i*n;j>0;j--) {
					if(count == i) {
						count = 0;
						--num;
						
					}else {
						System.out.print(num+" ");
						count++;
					}
				}
				System.out.print("$ ");
			}
				
		}
	}

	public static void pattern(int n, int m) {
		if (n != 0) {
			for (int i = n; i > 0; i--) {
				for (int j = m; j > 0; j--) {
					System.out.print(i + " ");
				}
			}
			System.out.print("$");
		}
	}
}