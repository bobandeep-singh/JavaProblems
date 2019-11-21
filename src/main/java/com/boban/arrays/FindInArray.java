package com.boban.arrays;

import java.util.Arrays;
import java.util.List;

public class FindInArray {

	public static void main(String[] args) {

		String[] array = {"B", "O", "B", "A", "N"};

		//Method 1: Using for loop
		for(int i=0; i < array.length; i++) {
			if("B".equalsIgnoreCase(array[i])) {
				System.out.println("Value found using simple for loop: "+array[i]);
			}
		}

		//Method 2: Using Arrays convert the array to list and then use its method to find the value
		List<String> list = Arrays.asList(array);
		list.contains("B");
		System.out.println("B is present in the given array? "+list.contains("B"));
		System.out.println("B is present in the given array? "+list.indexOf("B"));

		//Method 3: Using Stream anyMatch() Method
		//If you are using Java 8 or higher, you can create a stream from the array.
		//Then use the anyMatch() method with a lambda expression to check if it contains a given value.
		
		//System.out.println("Using stream: "+		Arrays.stream(array).anyMatch("B"::equals)		);
		
		
		//Method 4: Arrays binarySearch() for sorted array
		Arrays.parallelSort(array);
		System.out.println(Arrays.toString(array));
		int i = Arrays.binarySearch(array, "M");
		if( i < 0 ) System.out.println("Not found");
		else System.out.println("Found");
		
		
		
		//Checking if Array Contains Multiple Values
		String[] subset = {"B", "B", "N"};
		boolean presentTag = Arrays.asList(array).containsAll(Arrays.asList(subset));
		System.out.println("Multiple values is present in the main array: "+presentTag);
	}

}
