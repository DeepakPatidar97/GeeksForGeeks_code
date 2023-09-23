package com.geekforgeek.easy;

public class EquilibriumPoint {

	public static void main(String[] args) {
		int n = 8;
		long A[] = { 8, 8, 3, 7, 8, 2, 7, 2 };

		// 8
		// 8 8 3 7 8 2 7 2

		System.out.println(equilibriumPoint(A, n));
	}

	/*
	 * public static int equilibriumPoint(long arr[], int n) { int leftsum = 0,
	 * rightsum = 0;
	 * 
	 * for (int i = 0; i < n; i++) { leftsum = 0; rightsum = 0; for (int j = 0; j <
	 * i; j++) { leftsum += arr[j]; }
	 * 
	 * for (int j = i + 1; j < n; j++) { rightsum += arr[j]; } if (leftsum ==
	 * rightsum) { return i + 1; }
	 * 
	 * }
	 * 
	 * return -1; }
	 */

	public static int equilibriumPoint(long arr[], int n) {

		long sum = 0, presum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		for (int j = 0; j < n; j++) {
			sum -= arr[j];
			if (sum == presum)
				return j + 1;
			presum += arr[j];
		}
		return -1;
	}
}

/*
 * Equilibrium Point EasyAccuracy: 28.13%Submissions: 488K+Points: 2 Learn
 * Google Cloud with Curated Lab Assignments. Register, Earn Rewards, Get
 * noticed by experts at Google & Land your Dream Job! Given an array A of n
 * positive numbers. The task is to find the first equilibrium point in an
 * array. Equilibrium point in an array is a position such that the sum of
 * elements before it is equal to the sum of elements after it.
 * 
 * Note: Return equilibrium point in 1-based indexing. Return -1 if no such
 * point exists.
 * 
 * Example 1:
 * 
 * Input: n = 5 A[] = {1,3,5,2,2} Output: 3 Explanation: equilibrium point is at
 * position 3 as sum of elements before it (1+3) = sum of elements after it
 * (2+2). Example 2:
 * 
 * Input: n = 1 A[] = {1} Output: 1 Explanation: Since there's only element
 * hence its only the equilibrium point. Your Task: The task is to complete the
 * function equilibriumPoint() which takes the array and n as input parameters
 * and returns the point of equilibrium.
 * 
 * Expected Time Complexity: O(n) Expected Auxiliary Space: O(1)
 * 
 * Constraints: 1 <= n <= 105 1 <= A[i] <= 109
 */
