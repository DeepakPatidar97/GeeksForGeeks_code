package com.geekforgeek.easy;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		System.out.println(Anagram("deepak", "paldee")); 

	}
	public static boolean Anagram(String a, String b) {
		if(a.length()!=b.length()) {
			return false;
		}
		char ar1[] = a.toCharArray();
		char ar2[] = b.toCharArray();
		Arrays.sort(ar1);
		Arrays.sort(ar2);		
		for(int i=0;i<a.length();i++) {
			if(ar1[i]!=ar2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
}
