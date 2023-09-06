package com.geekforgeek.basic;

public class FibonacciNumbers {

	public static void main(String[] args) {
		long ar[] = printFibb(9);
		for(long a=0;a<ar.length;a++) {
			System.out.println(ar[(int)a]+"");
		}
	}
	public static long[] printFibb(int n) 
    {
        long []arr = new long[n];
        long firstlast = 0, secondlast = 1,temp;
        arr[0] = 1;
        for(int i=1;i<n;i++) {
        	arr[i] = firstlast+secondlast;
        	firstlast = secondlast;
        	secondlast = arr[i];
        }
        return arr;
    }
	
	

}
