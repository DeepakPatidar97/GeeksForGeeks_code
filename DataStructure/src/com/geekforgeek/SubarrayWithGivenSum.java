package com.geekforgeek;

import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array :");
		int n = sc.nextInt();
		System.out.println("Enter the sum of sub_array :");
		int s = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter the " + n + " values");
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		ArrayList<Integer> arrayList = subarraySum(ar, n, s);
		System.out.println(arrayList);
	}

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
		ArrayList<Integer> list = new ArrayList<Integer>();
       int sum = 0,start=0, end = 0;
       if(s==0) {
    	   list.add(-1);
	    return list;
       }
		for(int i=0;i<n;i++) {
			sum = sum + arr[i];
			while(s < sum)
            {
                sum -= arr[start];
                start++;
            }
				if(sum == s) {
					list.add(start+1);
			        list.add(i+1);
					return list;
				}	
    }
	
		list.add(-1);
	    return list;
    }
}


