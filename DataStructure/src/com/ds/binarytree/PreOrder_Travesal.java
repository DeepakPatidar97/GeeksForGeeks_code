package com.ds.binarytree;

import java.util.ArrayList;

public class PreOrder_Travesal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static ArrayList<Integer> preorder(Node root) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		if (root == null) return a;
		
			a.add(root.data);
			a.addAll(preorder(root.left));
			a.addAll(preorder(root.right));
			return a;
		
		
	}

}

class Node {
	int data;
	Node left, right;

	Node(int d) {
		data = d;
		left = right = null;
	}
}
