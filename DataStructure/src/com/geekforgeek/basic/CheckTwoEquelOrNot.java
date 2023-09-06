package com.geekforgeek.basic;

public class CheckTwoEquelOrNot {

	public static void main(String[] args) {
		long a[] = {20,6, 17, 15, 19};
		long B[] = {20,6, 17, 15, 19};
		check(a, B, 5);

	}
	public static boolean check(long A[],long B[],int N)
    {
        
        A = sort(A, N);
            
        for(int i = 0;i<N;i++) {
        	System.out.print(A[i]+" ");
        }
        return true;
    }
	
	public static long[] sort(long a[], int n) {
		long temp =0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++){
			if(a[i]<=a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			}
		}
		
		return a;
	}
	

}
