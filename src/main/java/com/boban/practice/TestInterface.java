package com.boban.practice;

public interface TestInterface {
	
	default void m1() {
		System.out.println("M1");
	}
	
	default void m2() {
		System.out.println("M2");
	}
	
	String abc();
	
	
	
	

}
