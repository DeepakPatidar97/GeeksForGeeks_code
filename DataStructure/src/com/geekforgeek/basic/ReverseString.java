package com.geekforgeek.basic;

public class ReverseString {

	public static String main(String[] args) {
		String str = "Chotu";
		
		char arr[] = str.toCharArray();
		str ="";
 		for(int i=arr.length-1;i>=0;i--) {
			str= str + arr[i];
		}
		return str.toString();
	}

}
