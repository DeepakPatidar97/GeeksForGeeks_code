package com.geekforgeek.medium;

public class NthCatalanNumber {
	
	public static void main(String[] args) {
		System.out.println(findCatalan(5));
		System.out.println(findCatalan(4));
		System.out.println(findCatalan(9));
		System.out.println(findCatalan(90));
	}
	public static int findCatalan(int n) {
		int mod = (int)1e9+7;
        int c[] = new int[n+1];
        c[0] = 1;
        c[1] = 1;
        for(int i = 2;i<=n;i++) {
        	c[i] = 0;
        	for(int j = 0; j<i;j++) {
        		c[i]=  (c[i] + (int)((long)c[j] * c[i - j - 1] % mod)) % mod;
        	}
        }
        return c[n];
    }
	
}
