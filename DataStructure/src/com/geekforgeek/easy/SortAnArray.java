package com.geekforgeek.easy;

import java.util.Scanner;

//Sort an array of 0s, 1s and 2s
public class SortAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array :");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the value of array:");
		for(int i=0; i<n ;i++) {
		a[i] = sc.nextInt();
		}
		int temp=0;
		System.out.println("output : ");
		int low = 0,mid =0, high = n-1;
		
		while(mid<=high) {
			if(a[mid]==0) {
				temp = a[low];
				a[low] =a[mid];
				a[mid] = temp;
				
				mid++;
				low++;
			}else if(a[mid]==1) {
				mid++;
			}else if(a[high]==2) {
				temp = a[mid];
				a[mid] =a[high];
				a[high] = temp;
				
				temp--;
			}
			
		
		}
		
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+" ");
		
		}
	}
}
