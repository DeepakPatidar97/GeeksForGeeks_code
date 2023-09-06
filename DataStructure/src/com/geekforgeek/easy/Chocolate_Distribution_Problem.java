package com.geekforgeek.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Chocolate_Distribution_Problem {

	public static void main(String[] args) {

		int N=8, M=5;
		int ar[] = {3, 4, 1, 9, 56, 7, 9, 12};
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0;i<N;i++) {
			a.add(ar[i]);
		}
		System.out.println(findMinDiffUsingArray(a, N, M));
		System.out.println(findMinDiffUsingCollection(a, N, M));
	}
	//using array
	public static long findMinDiffUsingArray (ArrayList<Integer> a, int n, int m)
    {	
		long min = Integer.MAX_VALUE;
		int ar[] = new int[n];

		for(int i=0;i<n;i++) {
			ar[i] = a.get(i);
		}
		
		Arrays.sort(ar);
		for(int i=0;(m+i-1)<n;i++) {
//			System.out.println(ar[i]+"  "+ar[(m+i-1)]+"   "+(ar[(m+i-1)]-ar[i])+" ");
			if(min>(ar[(m+i-1)]-ar[i])) {
				min = (ar[(m+i-1)]-ar[i]);
			}
		}
		return min;
    }
	public static long findMinDiffUsingCollection (ArrayList<Integer> a, int n, int m)
    {	
		long min = Integer.MAX_VALUE;
		Collections.sort(a);
		for(int i=0;(m+i-1)<n;i++) {
			if(min>(a.get(m+i-1)-a.get(i))) {
				min = (a.get(m+i-1)-a.get(i));
			}
		}
		return min;
    }
	
	
}
