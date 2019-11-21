package com.boban.interview.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SocksMerchant {

	public static void main(String[] args) {
		int[] inputArray = {5, 6, 5, 3, 5, 6, 4, 3};
		System.out.println(countPairs(inputArray));

	}

	public static int countPairs(int[] arr) {
		Map<Integer, Integer> hashMap = new HashMap();
		int count = 0;
		for(int i: arr) {
			if(hashMap.containsKey(i)){
				hashMap.put(i, hashMap.get(i) + 1);
			} else {
				hashMap.put(i, 1);
			}
			//System.out.println(hashMap.toString());
		}
		for (Entry<Integer, Integer> entry : hashMap.entrySet()) {
			//System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
			count = count + entry.getValue()/2;
		}
		return count;
	}
}
