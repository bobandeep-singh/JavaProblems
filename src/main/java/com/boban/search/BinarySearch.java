package com.boban.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("Main start");

		int[] sortedArray = {12, 4, 13, 14, 19, 22, 24, 25};
		int length = sortedArray.length;
		Arrays.sort(sortedArray);
		int findInt = 13;

		System.out.println("We want to find: "+findInt);

		System.out.println("Sorted array: "+Arrays.toString(sortedArray));

		System.out.println("Found the element "+findInt+" using loop at index: "+binarySearchWithLoop(sortedArray, 0, length-1, findInt));

		System.out.println("Found the elemen "+findInt+" using recursion at index: "+binarySearchWithRecursion(sortedArray, 0, length-1, findInt));

		
		List<String> list = Arrays.asList("B", "C", "A", "R", "M");
		System.out.println("Unsorted list: "+list);
		Collections.sort(list, new CompareWithString());
		System.out.println("Sorted list: "+ list);
		
		
		System.out.println("Main end");
	}

	public static int binarySearchWithLoop(int[] arr, int start, int last, int key) {
		int mid = (start + last)/2;

		while(last >= start) {

			if(arr[mid] == key) {
				//System.out.println("Element found at index: "+mid);
				break;
			}
			else if(key > arr[mid]) start = mid + 1;
			else last = mid - 1;

			mid = (start + last) / 2;
		}
		if(last < start) {
			return -1;
		}
		return mid;
	}

	public static int binarySearchWithRecursion(int[] arr, int first, int last, int key) {

		if(last >= first) {
			int mid = (first + last)/2;

			if(arr[mid] == key) return mid;

			if(key > arr[mid]) return binarySearchWithRecursion(arr, mid+1, last, key); //right side search
			else return binarySearchWithRecursion(arr, first, mid-1, key);
		}
		return -1;
	}
	

}



class CompareWithString implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		return arg0.compareTo(arg1);
	}
	
}