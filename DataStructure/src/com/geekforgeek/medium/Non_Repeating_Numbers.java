package com.geekforgeek.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Non_Repeating_Numbers {

	public static void main(String[] args) {
		int item[] = { 2, 1, 3, 2, 1, 3 };

		int[] ar = singleNumberUsingMap(item);
		if (ar != null) {
			return;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

	}

	public static int[] singleNumberUsingMap(int[] nums) {
		int temp[] = new int[nums.length];

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == null) {
				map.put(nums[i], 1);
			} else {
				int count = map.get(nums[i]);
				map.replace(nums[i], count, count + 1);
			}
		}
		int i = 0;
		for (Map.Entry<Integer, Integer> maps : map.entrySet()) {
			if (maps.getValue() == 1) {
				temp[i] = maps.getKey();
				i++;
			}
		}
		Arrays.sort(temp);

		return temp;
	}

	public static int count(Map<Integer, Integer> map) {

		int count = 0;
		for (Map.Entry<Integer, Integer> maps : map.entrySet()) {
			if (maps.getValue() == 1) {
				count++;
			}
		}
		return count;
	}

}

/*
 * Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers
 * exist in pairs whereas the other two number occur exactly once and are
 * distinct. Find the other two numbers. Return in increasing order.
 * 
 * Example 1:
 * 
 * Input: N = 2 arr[] = {1, 2, 3, 2, 1, 4} Output: 3 4 Explanation: 3 and 4
 * occur exactly once. Example 2:
 * 
 * Input: N = 1 arr[] = {2, 1, 3, 2} Output: 1 3 Explanation: 1 3 occur exactly
 * once. Your Task: You do not need to read or print anything. Your task is to
 * complete the function singleNumber() which takes the array as input parameter
 * and returns a list of two numbers which occur exactly once in the array. The
 * list must be in ascending order.
 * 
 * Expected Time Complexity: O(N) Expected Space Complexity: O(1)
 * 
 * Constraints: 1 <= length of array <= 106 1 <= Elements in array <= 5 * 106
 */