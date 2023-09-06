package com.geekforgeek;

import java.util.Scanner;

public class MatrixofAddition {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of matrix");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		int i, j;
		System.out.println("enter the matrix values");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}
}
