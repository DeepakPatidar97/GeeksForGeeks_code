package com.geekforgeek.basic;

public class WaveArray {

	public static void main(String[] args) {
		int n = 8;
		int arr[] = {1,2,3,4,5,6,7,8};
		convertToWave(n, arr);
		System.out.println(findMaximum(arr, n));
	}
	public static void convertToWave(int n, int[] a) {
        int temp;
        for(int i=0;i<=((n%2==0)?(n-1):(n-2));i=i+2) {
        	temp = a[i];
        	a[i] = a[i+1];
        	a[i+1] = temp;
        }
        for(int i=0;i<n;i++) {
        	System.out.print(a[i]+" ");
        }
    }
	static int findMaximum(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for(int i:arr) {
        	if(max<i) {
        		max = i;
        	}
        }
        return max;
    }

}
