package com.geekforgeek.easy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ConvertRomanToDecimal {

	public static void main(String[] args) {
		//System.out.println("value is "+convertRomanToDecimal("I"));
		//System.out.println("value is "+convertRomanToDecimal("III"));
		//System.out.println("value is "+convertRomanToDecimal("IV"));
		//System.out.println("value is "+convertRomanToDecimal("XIX"));
		//System.out.println("value is "+convertRomanToDecimal("MLIX"));
		System.out.println(convertRomanToDecimal("MMMDCCCLIV"));//3854

	}
	public static int convertRomanToDecimal(String roman) {
		Map<Character, Integer> decimal = new HashMap<Character, Integer>();
		decimal.put('I', 1);
		decimal.put('V', 5);
		decimal.put('X', 10);
		decimal.put('L', 50);
		decimal.put('C', 100);
		decimal.put('D', 500);
		decimal.put('M', 1000);
		
		if(roman.isEmpty()) {
			return 0;
		}
		char c;
		int prevalue=0,currvalue=0;
		int sum = 0;
		
		for(int i=0;i<roman.length();i++) {
			c = roman.charAt(i);
			//System.out.println("c  = "+ c);
			currvalue = (int)decimal.get(c);
			if(prevalue==0) {
				prevalue=currvalue;
			}
			if(prevalue<currvalue) {
				sum = sum + (currvalue-prevalue)-prevalue;
				prevalue = currvalue;
			}else if(prevalue>=currvalue) {
				sum = sum+currvalue;
				prevalue =currvalue;
			}
		}
		
	return sum;
	}

}
