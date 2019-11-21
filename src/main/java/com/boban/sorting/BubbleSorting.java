package com.boban.sorting;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		int[] inputArray = {4, 6, 2, 9, 23, 90, 40, 30, 66, 8, 32, 16};
		System.out.println("Input array: ");
		printArray(inputArray);
		bubbleSortMethod(inputArray);
		
	}

	public static void bubbleSortMethod(int[] arr) {
		int n = arr.length;
		for(int i=0; i < n-1; i++) {
			for(int j=0; j < n; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					break;
				}
			}
		}
		
		System.out.println("Final output:");
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
