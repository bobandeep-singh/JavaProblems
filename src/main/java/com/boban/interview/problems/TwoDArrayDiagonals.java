package com.boban.interview.problems;

public class TwoDArrayDiagonals {

	public static void main(String[] args) {
		String[][] inputArray = {   {"A", "B", "C", "D", "E"},
				{"F", "G", "H", "I", "J"},
				{"K", "L", "M", "N", "O"},
				{"P", "Q", "R", "S", "T"}};
		/*
		 * Expected output: A
		 * FB
		 * KGC
		 * PLHD
		 * QMIE
		 * RNJ
		 * SO
		 * T
		 */
		int c = 0;
		for(int row=0; row<inputArray.length; row++) {
			for(int col=0; col<inputArray[row].length; col++) {
				System.out.print(inputArray[row][col]);
			}
		}
		System.out.println();
		int m = inputArray.length;
		int n = inputArray[0].length;

		/*
		 * In this for loop we will go through all the rows.
		 */
		for(int k=0; k <= m-1; k++) {
			int i = k; ///i for row
			int j = 0; ///j for column

			while(i >= 0) {
				System.out.print(inputArray[i][j]);
				i = i-1;
				j = j+1;
			}
			System.out.println();

		}

		/*
		 * At this point we have printed half the diagonals including the middle diagonal. 
		 * Now, in this for loop we will go from last row
		 */
		for(int k=1; k <= n-1; k++) {
			int i = m-1;///this is the last row and it will be fixed as all diagonals begin from this last row.
			int j = k;

			while(j <= n-1) {
				System.out.print(inputArray[i][j]);
				i = i-1;
				j = j+1;
			}
			System.out.println();

		}

	}

}
