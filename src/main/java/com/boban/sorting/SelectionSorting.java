package com.boban.sorting;

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {
		int[] inputArray = {88, 4, 6, 2, 9, 23, 90, 40, 30, 66, 8, 32, 16};
		System.out.println("Input array: ");
		printArray(inputArray);
		selectionSortMethod(inputArray);


	}

	public static int[] selectionSortMethod(int[] arr) {
		System.out.println("selectionSortMethod(+)");
		int n = arr.length;

		for(int i=0; i < n-1; i++) {
			int iMin = i;
			for(int j = i+1; j < n; j++) {
				if(arr[iMin] > arr[j]) iMin = j;
			}
			int temp = arr[i];
			arr[i] = arr[iMin];
			arr[iMin] = temp;
			printArray(arr);
		}
		System.out.println("Final output:");
		printArray(arr);

		System.out.println("selectionSortMethod(-)");
		return null;
	}

	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
