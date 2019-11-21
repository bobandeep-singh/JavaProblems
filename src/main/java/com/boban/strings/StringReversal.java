package com.boban.strings;

public class StringReversal {

	public static void main(String[] args) {

		String givenString = "Boban";
		String expectedOutput = "naboB";

		char[] cArr = givenString.toCharArray();
		char[] ocArr = new char[givenString.length()];

		for(int i=0; i <givenString.length(); i++) {
			ocArr[i] = cArr[givenString.length()-1-i];
		}

		String myOutput = ocArr.toString();
		System.out.println("myOutput: "+myOutput);
		System.out.println(expectedOutput);

		System.out.println(expectedOutput == myOutput);

		for(char c: ocArr) {
			System.out.print(c);
		}

		System.out.println();
		
		/////Now by using byte array
		byte[] b1 = givenString.getBytes();
		byte[] b2 = new byte[b1.length];

		for(int i=0; i<b1.length; i++) {
			b2[i] = b1[b1.length - 1 - i];
		}
		
		String byteOptStr = b2.toString();
		System.out.println(byteOptStr);

	}

}
