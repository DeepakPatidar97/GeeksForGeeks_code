package com.geekforgeek.medium;

import java.util.ArrayList;

public class ColumnNameGivenColumnNumber {

	public static void main(String[] args) {
		System.out.println(colName(5473578));
		//System.out.println(colName(13));
		//KYJZF

	}
	static String colName (long n)
    {
        StringBuilder col =  new StringBuilder();
        int num=0;
        while(n!=0) {
        	num = (int) (n%26);
        	System.out.println("Num "+num+" == "+n);
        	if(num==0) {
        		col.append((char)('@'+26));
        		n=n-26;
        		//System.out.println("Num "+(char)('@'+26)+" == "+num);
        	}else {
        	col.append((char)('@'+num));
        	//System.out.println("Num "+(char)('@'+num)+" == "+num);
        	}
        	n=n/26;
        }
        
        return col.reverse().toString();
    }
}
