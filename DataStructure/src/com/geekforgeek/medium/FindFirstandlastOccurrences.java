package com.geekforgeek.medium;

import java.util.ArrayList;

public class FindFirstandlastOccurrences {

	public static void main(String[] args) {
		int n=5, x=6;
		int arr[] = { 7, 7, 9, 10, 10 };
		System.out.println(find(arr, n, x));
		

	}
	static ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(-1);
        al.add(-1);
        for(int i=0;i<n;i++) {
        	if(arr[i]==x) {
        		if(al.get(0)==-1 && al.get(1) == -1) {
        			al.set(0, i);
        			al.set(1, i);
        		}else {
        			al.set(1, i);
        		}
        	}
        }
        return al;
    }

}
