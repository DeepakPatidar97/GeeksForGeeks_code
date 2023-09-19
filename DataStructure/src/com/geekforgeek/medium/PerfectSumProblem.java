package com.geekforgeek.medium;

public class PerfectSumProblem {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int size = 5;
		int sum = 10;
		System.out.println(perfectSum(arr, size, sum));
	}

	public static int perfectSum(int arr[], int n, int sum) {
		int temp = 0, count = 0;
		for (int i = 0; i < n; i++) {
			temp += arr[i];
			if (temp == sum) {
				count++;
			} else {
				for (int j = 0; j < n; j++) {
					if(i!=j) {
						continue;
					}
					temp += arr[j];
					if (temp == sum) {
						count++;
					}
					temp -= arr[j];
				}
			}
		}

		return count;
	}
}
