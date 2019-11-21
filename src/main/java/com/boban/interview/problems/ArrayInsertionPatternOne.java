package com.boban.interview.problems;

/*
 * In this problem we have to insert create array in certain fashion.
 * For an input n, we have to create n*n matrix where we will fill the first line first then last line and then second last then third line and then third last line
 * as this goes on till we reach the n^2 value.
 * These values start from 1 and have to be inserted in the serial order.
 * Ex: for input 3, output will be:
 *  1 2 3
 *  7 8 9
 *  4 5 6
 */
public class ArrayInsertionPatternOne {

	public static void main(String[] args) {
		int n = 5;				///Input

		int evenCof = 0;
		int oddCof = n-1;

		if(n%2 == 0) {
			oddCof = n-1;
			for(int i = 1; i <= n; i++) {
				if(i <= n/2) {
					printArray(evenCof * n + 1, n);
					evenCof = evenCof + 2;
				} else if(i > n/2) {
					printArray(oddCof * n + 1, n);
					oddCof = oddCof - 2;
				}
			}
		}
		else if(n%2 != 0) {
			oddCof = n-2;
			for(int i = 1; i <= n; i++) {
				if(i <= n/2 + 1) {
					printArray(evenCof * n + 1, n);
					evenCof = evenCof + 2;
				} else if(i > n/2) {
					printArray(oddCof * n + 1, n);
					oddCof = oddCof - 2;
				}
			}
		} else System.out.println("Enter a valid number please");

	}

	public static void printArray(int start, int end) {
		for(int i = 0; i<end; i++) {
			System.out.print(start + i +" ");
		}
		System.out.println();
	}

}
