package com.boban.hackerrank;

public class NumberOfIslands {

	public static void main(String[] args) {
		int[][] arr = {
				{1, 0, 1, 1, 0},
				{0, 0, 1, 0, 1},
				{1, 1, 0, 1, 1}};
		int count = 0;
		int len = arr.length;
		int breadth = arr[0].length;

		for(int i=0; i < len; i++) {
			for(int j=0; j < breadth; j++) {
				if(arr[i][j] == 1) {
					count++;
					checkIsland(arr, i, j);
				}
			}
		}
		System.out.println("Number of islands in the given canvas are: "+count);

	}

	private static void checkIsland(int[][] arr, int i, int j) {
		if(i < 0 || j < 0 || i > arr.length-1 || j > arr[0].length-1 || arr[i][j] == 0) return;

		arr[i][j] = 0;

		checkIsland(arr, i-1, j);//up
		checkIsland(arr, i+1, j);//down
		checkIsland(arr, i, j-1);//left
		checkIsland(arr, i, j+1);//right

	}

}
