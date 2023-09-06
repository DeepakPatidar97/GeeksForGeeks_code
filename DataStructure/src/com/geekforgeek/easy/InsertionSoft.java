package com.geekforgeek.easy;

public class InsertionSoft {

 	public static void main(String[]  args) {
		int arr[] = { 4, 1, 3, 9, 7,8,6,1,2,4,7,8,5,22,66,22,44,5,8};
		insertionSort(arr, 19);
	}
	public static void insertionSort(int arr[], int n)
	{
	   int temp=arr[0];
	   for(int a=0;a<n;a++) {
		   for(int b=0;b<n-1;b++) {
			   if(arr[a]<arr[b]) {
				   temp = arr[a];
				   arr[a] = arr[b];
				   arr[b] = temp;
			   }
		   }
	   }
	   
	}

}
