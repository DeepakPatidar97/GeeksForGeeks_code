package com.geekforgeek.medium;

import java.util.Scanner;

public class PowerOfNumbers {
	public static void main(String[] args) {
		int n=0,r=0;
		long pow=1,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N and R ");
		n=sc.nextInt();
		r=sc.nextInt();
		if(n==0) {
			System.out.println("0");
		}
		if(r==0) {
			System.out.println("1");
		}
		rev =pow(n,r);
		System.out.println("pow "+rev);
	}
	public static long pow(int n, int r) {
		long mod = 1000000007;
		if (r == 0)
            return 1;

        long ans = 0;

        if (r % 2 == 0) {
            // If p is even, calculate (n^(p/2)) and square it
            ans = pow(n, r / 2);
            ans = (ans * ans) % mod;
        } else {
            // If p is odd, calculate n^(p-1) and multiply it with n
            ans = n % mod;
            ans = (ans * pow(n, r - 1) % mod) % mod;
        }

        return ans % mod;
	}
}
