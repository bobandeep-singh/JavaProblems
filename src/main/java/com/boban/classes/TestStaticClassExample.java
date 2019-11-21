package com.boban.classes;

import com.boban.classes.StaticClassExample.StaticInnerClass;

public class TestStaticClassExample {

	public static void main(String[] args) {
		StaticClassExample staticClassExample = new StaticClassExample();
		StaticClassExample.StaticInnerClass staticInnerClass = new StaticClassExample.StaticInnerClass();
		StaticClassExample.StaticInnerClass staticInnerClass2 = new StaticInnerClass();
		StaticInnerClass staticInnerClass3 = new StaticInnerClass();
	}

}
