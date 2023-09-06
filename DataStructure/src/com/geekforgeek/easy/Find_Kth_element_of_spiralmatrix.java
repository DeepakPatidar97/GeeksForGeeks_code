package com.geekforgeek.easy;

import java.util.Scanner;

public class Find_Kth_element_of_spiralmatrix {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the row(N) and colunm(M) size of Array :");
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.println("Enter the value of K :");
			int k = sc.nextInt();
			int ar[][] = new int[n][m];
			System.out.println("Enter the " + n * m + " values");
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					ar[i][j] = sc.nextInt();
				}
			}
			/*
			 * int temp1=0,temp2=0; System.out.println("output: "); for (int i = 0; i < n;
			 * i++) { for (int j = 0; j < m; j++) { if(i==0 || j+1==m) {
			 * System.out.print(ar[i][j]+" "); } temp1=j; } temp2=i; }
			 * System.out.println(temp1+" "+temp2);
			 */
			
			//Logic for treves spiral and find Kth number

			int top = 0, bottom = n - 1, left = 0, right = m - 1, dir = 0;
			while (top <= bottom && left <= right) {
				if (dir == 0) {
					for (int i = left; i <= right; i++) {
						/*System.out.println(ar[top][i] + " ");*/
						k--;
						if(k==0) {
							System.out.println(" Kth number is : "+ar[top][i]);
						}
					}
					top++;
				} else if (dir == 1) {
					for (int i = top; i <= bottom; i++) {
						/*System.out.println(ar[i][right] + " ");*/
						k--;
						if(k==0) {
							System.out.println(" Kth number is : "+ar[i][right]);
						}
					}
					right--;
				} else if (dir == 2) {
					for (int i = right; i >= left; i--) {
						/*System.out.println(ar[bottom][i] + " ");*/
						k--;
						if(k==0) {
							System.out.println(" Kth number is : "+ar[bottom][i]);
						}
					}
					bottom--;
				} else if (dir == 3) {
					for (int i = bottom; i >= top; i--) {
						/*System.out.println(ar[i][left] + " ");*/
						k--;
						if(k==0) {
							System.out.println(" Kth number is : "+ar[i][left]);
						}
					}
					left++;
				}
				dir = (dir + 1) % 4;
			}
		}

	}
}
