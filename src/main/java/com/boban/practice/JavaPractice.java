package com.boban.practice;

public class JavaPractice {
	
	
	static {
		System.out.println("static Three");
	}
	
	public JavaPractice(){
		System.out.println("One");
		System.out.println("Two");
	}
	
	{
		System.out.println("instance Three");
	}
	
	static {
		System.out.println("static four");
	}
	
	public static void main(String[] args) {
		System.out.println("M1");
		JavaPractice jp = new JavaPractice();
		System.out.println("M2");
		String hrie= "asd";
	}
	
	

}
