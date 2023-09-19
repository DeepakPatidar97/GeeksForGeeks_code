package com.geekforgeek.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class FirstSetBit {

	public static void main(String[] args) {
		System.out.println(getFirstSetBit(18));
		System.out.println(getFirstSetBit(12));
	}
	public static int getFirstSetBit(int n){
        LinkedList<Integer> bit = new LinkedList<Integer>();
        while(n!=0) {
        	bit.add((n%2));
        	n = n/2;
        }
        int count = 0;
        for (Integer temp : bit) {
        	count++;
        	if(temp==1) {
        		break;
        	}
        	
		}
        return count;  
    }

}
