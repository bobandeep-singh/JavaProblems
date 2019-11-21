package com.boban.classes;

public class StaticClassExample {

	public static class StaticInnerClass{
		public StaticInnerClass(){
			System.out.println("StaticInnerClass constructor");
		}
	}
	
	public StaticClassExample() {
		System.out.println("StaticClassExample constructor");
	}

}
