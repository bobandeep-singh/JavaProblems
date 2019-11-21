package com.boban.practice;

public class StaticTest {
	
	static int i = 9;
	
	public static void methodOne() {
		i = 8;
	}
	
	public static void main(String[] args) {
		System.out.println(i);
		methodOne();
		System.out.println(StaticTest.i);
	}

}
