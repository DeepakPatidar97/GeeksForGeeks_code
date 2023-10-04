package com.geekforgeek.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindDublicatesInArray {

	public static void main(String[] args) {
		// int a[] = new int[] {0,3,1,2};
		int b[] = new int[] { 2, 3, 1, 2, 3, 45, 78, 78, 1, 2, 33, 66, 99, 100, 14, 52, 8, 6, 3, 4, 7, 8, 5, 6, 9, 1,
				22, 5, 8, 66, 33, 11, 44, 7, 88, 55, 66, 99 };
		System.out.println("b  = "+b.length);
		// System.out.println(duplicates(a, a.length));
		System.out.println(duplicates(b, b.length));
	}


	public static ArrayList<Integer> duplicates(int arr[], int n) {
//		ArrayList<Integer> al = new ArrayList<>();
//
//		for (int i = 0; i < n; i++) {
//			if (al.contains(arr[i])) {
//				continue;
//			} else {
//				for (int j = i + 1; j < n; j++) {
//					if (arr[i] == arr[j]) {
//						al.add(arr[j]);
//						break;
//					}
//				}
//			}
//		}
//		Collections.sort(al);
//		if (al.isEmpty()) {
//			al.add(-1);
//		}
//		return al;
//	}
	
	
	
	  ArrayList<Integer> list = new ArrayList<>();
      
      for(int i=0; i<n; i++){
          arr[arr[i] % n] += n;
      }
      
      for(int i=0; i<n; i++){
          if(arr[i]/n >= 2){
              list.add(i);
          }
      }
      
      if(list.isEmpty()){
          list.add(-1);
      }
     
     return list;
    }
}
