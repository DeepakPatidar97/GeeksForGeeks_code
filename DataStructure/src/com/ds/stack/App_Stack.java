package com.ds.stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App_Stack {

	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<>();
		Stack<Integer> s = new Stack<>();
		s.add(4);
		s.add(5);
		s.add(7);
		while(!s.isEmpty()){
            q1.add(s.pop());
        }
        while(!q1.isEmpty()){
            s.push(q1.remove());
        }
        int minEle =s.firstElement();
        for(int item : s){
    	    if(minEle > item){
    	        minEle = item;
    	    }
    	}
        System.out.println(minEle);
	}

}
