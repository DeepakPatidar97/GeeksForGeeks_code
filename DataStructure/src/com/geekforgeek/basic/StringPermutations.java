package com.geekforgeek.basic;

import java.util.ArrayList;
import java.util.Collections;

public class StringPermutations {
	public static void main(String[] args) {
		String s = "ABCDE";
		for(String st: permutation(s)) {
			System.out.print(st+" ");
		}
		
	}
	public static ArrayList<String> permutation(String S)
    {
		ArrayList<String> str = new ArrayList<>();
		
		calculate(S, str, 0, S.length()-1);
		Collections.sort(str);
		
		return str;
        
    }
	private static void calculate(String s, ArrayList<String> str ,int left,int right) {
		if(left==right) {
			str.add(s);
			return;
		}else {
			for(int i=left;i<=right;i++) {
				s=swap(s, left, i);
				calculate(s, str, left+1, right);
				s=swap(s, left, i);
			}
		}
	}
	private static String swap(String s, int index1,int index2) {
		char temp;
		if(s.isEmpty()) return s;
		char a[] = s.toCharArray();
		
		temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
		
		return String.valueOf(a);
	}
}
