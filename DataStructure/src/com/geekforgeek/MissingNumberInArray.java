package com.geekforgeek;

import java.util.Scanner;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int n = 0,total_array=0,total_n=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the value of N");
			n = sc.nextInt();
			int array[] = new int[n-1];
			System.out.println("Enter the value of array");
			for (int i = 0; i < n-1; i++) {
				array[i] = sc.nextInt();
			}

			for (int i = 1; i <= n; i++) {
				total_n = total_n + i;
			}
			System.out.println("total n "+total_n);
			for(int i=0;i<n-1; i++) {
				total_array = total_array + array[i];
			}
		}

		System.out.println("total array "+total_array);
		System.out.println(" missing number "+ (total_n - total_array));
	}
}
