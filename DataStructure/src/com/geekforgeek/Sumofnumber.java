package com.geekforgeek;

public class Sumofnumber {
public static void main(String[] args) {
	System.out.println(usingfor(171));
	System.out.println(usingformula(171));
}
static int usingfor(int n) {
	int sum = 0;
	for(int i=1;i<=n;i++) {
		sum+=i;
	}
	return sum;
}
static int usingformula(int n) {
		return (n*(n+1))/2;
}
}
