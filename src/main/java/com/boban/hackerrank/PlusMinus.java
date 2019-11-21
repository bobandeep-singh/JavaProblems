package com.boban.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class PlusMinus {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		int arrSize = arr.length;
		double pos = 0;
		double neg = 0;
		double zer = 0;

		for(int a: arr){
			if(a > 0) pos++;
			else if(a < 0) neg++;
			else zer++;
		}
		System.out.println(pos);
		System.out.println(neg);
		System.out.println(zer);
		DecimalFormat df = new DecimalFormat("#.#####");
		System.out.println(df.format(pos/arrSize));
		System.out.println(df.format(neg/arrSize));
		System.out.println(df.format(zer/arrSize));

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arr = {1, 0, -1, 1, 0, -1, 0, -1, 0, 1, 1, 1, 0, 1, -1};

		plusMinus(arr);

		scanner.close();
	}
}
