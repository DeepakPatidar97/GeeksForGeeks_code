
package com.geekforgeek.easy;

import java.util.Scanner;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
	    System.out.println("enter the size of matrix");
	    int n=sc.nextInt();
		int ar[][] =new int[n][n];
		int i,j;
		System.out.println("enter the values of matrix");
		for( i=0;i<n;i++) {
			for( j=0;j<n;j++) {
				ar[i][j]=sc.nextInt();
		}
		}
		
			for( i=0;i<n;i++) {
				for( j=i;j<n;j++) {
					if(i!=j) {
						int temp= ar[i][j];
						ar[i][j]=ar[j][i];
						ar[j][i]=temp;
					}
			}
				
				
				
	}
			System.out.println("output :");
			for( i=0;i<n;i++) {
				for( j=0;j<n;j++) {
					
						
				System.out.print(ar[i][j]+" ");
			}
				System.out.println();
				
 }
}
}
