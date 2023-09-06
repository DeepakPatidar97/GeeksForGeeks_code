package com.geekforgeek.medium;

import java.util.LinkedList;

public class Longest_Common_Subsequence {

	public static void main(String[] args) {
		System.out.println(lcs(6,6,"ABCDGH","AEDFHR"));
		System.out.println(lcs(7,6,"ABCREFD","AREDFH"));

	}
	
	 static int lcs(int x, int y, String s1, String s2)
	 {
		 int count1 = 0, count2 = 0;
		 
		 char str1[] = s1.toCharArray();
		 char str2[] = s2.toCharArray();
		 for(int i=0;i<x;i++) {
			 for(int j=0;j<y;j++) {
				 if(str1[i]==str2[j]) {
					 count1++;
				 }
			 }
		 }
		 for(int i=0;i<y;i++) {
			 for(int j=0;j<x;j++) {
				 if(str2[i]==str1[j]) {
					 count2++;
				 }
			 }
		 }
		 
		 
		 if(count1<=count2) {
			 return count1;
		 }else {
			 return count2;
		 }
	        	
	 }
	 

}
