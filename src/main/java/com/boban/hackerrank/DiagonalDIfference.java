package com.boban.hackerrank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'diagonalDifference' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
	 */
	public static int diagonalDifference(List<List<Integer>> arr) {
		int sumD1 = 0;
		int sumD2 = 0;
		int n = arr.size();
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if( i == j)
					sumD1 = sumD1 + arr.get(i).get(j);
				if(i == n - j -1) sumD2 = sumD2 + arr.get(i).get(j);
			}
		}
		return Math.abs(sumD1 - sumD2);

	}
}

public class DiagonalDIfference {
	public static void main(String[] args) throws IOException {
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<>();
		l1.add(11); l1.add(2); l1.add(4);
		l2.add(4); l2.add(5); l2.add(6);
		l3.add(10); l3.add(8); l3.add(-12);
		arr.add(l1); arr.add(l2); arr.add(l3);

		int result = Result.diagonalDifference(arr);
		System.out.println(result);

	}
}

/*
 * 11 2 4
 * 4  5 6
 * 
 */
