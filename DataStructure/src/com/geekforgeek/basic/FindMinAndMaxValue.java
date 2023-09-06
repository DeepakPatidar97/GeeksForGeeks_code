package com.geekforgeek.basic;

public class FindMinAndMaxValue {

	public static void main(String[] args) {
		int N = 5;
		long A[]  = {1, 345, 234, 21, 56789};
		Pair pair = getMinMax(A, N);
		System.out.println(pair.first+"  "+pair.second);
	}
	static Pair getMinMax(long a[], long n)  
    {
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		for(long i=0;i<n;i++) {
        	if(min>a[(int) i]) {
        		min = a[(int) i];
        	}
        	if(max<a[(int) i]) {
        		max = a[(int) i];
        	}
        }
		return new Pair(min,max);
    }
	 

}
class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
