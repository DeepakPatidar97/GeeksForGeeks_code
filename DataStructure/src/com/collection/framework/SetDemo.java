package com.collection.framework;

public class SetDemo {

	public static void main(String[] args) {
		subdemo sd = new subdemo();
		sd.m1(10); //subdemo m1
		demo d = new demo();
		d.m1(10); //demo m1
		demo dd = new subdemo();
		dd.m1(0); //demo m1
		
	}

}

class demo {
	public void m1(int... i) {
		System.out.println("Demo m1");
	}
}
class subdemo extends demo{
	public void m1(int... i) {
		System.out.println("subdemo m1");
	}
}
