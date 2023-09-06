package com.geekforgeek.easy;

import java.util.ArrayList;

public class Leaders_in_an_array {

	public static void main(String[] args) {
		int N = 10, S = 15;
		int A[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(subarraySum(A, N, S));
		
		/*
		 * int A[] = {16,17,4,3,5,2}; System.out.println(leaders(A, 6)); int B[] =
		 * {5,4,3,2,1}; System.out.println(leaders(B, 5)); int C[] = {1,2,3,4,0};
		 * System.out.println(leaders(C, 5));
		 */
 
	}
	
	static ArrayList<Integer> leaders(int arr[], int n){
        
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 0;i<n;i++) {
			for(int j=i; j<n; j++) {
				if(arr[i]>=arr[j] && j==n-1) {
					al.add(arr[i]);
					break;
				}else if(arr[i]<arr[j]) {
					break;
				}
			}
		}
		return al;
    }
	
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
		ArrayList<Integer> al = new ArrayList<>();
		int sum = 0;
		for(int i = 0;i<n;i++) {
			sum=arr[i];
			for(int j=i+1; j<n; j++) {
				if(sum==s) {
					al.add(i+1);
					al.add(j);
					return al;
				}else if(sum<s) {
					sum +=arr[j];
				}else {
					break;
				}
			}
		}
		return al;
    }

}
