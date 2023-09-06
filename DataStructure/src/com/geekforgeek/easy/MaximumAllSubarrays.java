package com.geekforgeek.easy;

import java.util.ArrayList;

public class MaximumAllSubarrays {

	public static void main(String[] args) {
		int N = 9, K = 3;
		int arr[] = {1,2, 3, 1, 4, 5, 2, 3, 6};
		System.out.println(max_of_subarrays(arr, N, K));
		
	}
	static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
		//3 3 4 5 5 5 6
		ArrayList<Integer> al = new ArrayList<>();
		
        for(int i=0; (k+i-1)<n;i++) {
        	int max = Integer.MIN_VALUE;
        	for(int j=i;j<(k+i);j++) {
        		if(max< arr[j]) {
        			max = arr[j];
        		}   		
        	}
        	al.add(max);
        }
        return al;
    }

}
