package com.boban.interview.problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class CountWordsFromFile {

	public static void main(String[] args) {
		//String filePathAndName = "C:\\Users\\ab66417\\Desktop\\CountWordsFromFile.txt";
		BufferedReader br = null;
		FileReader fr = null;
		try {

			fr = new FileReader("C:\\Users\\ab66417\\Desktop\\CountWordsFromFile.txt");
			br = new BufferedReader(fr);
			String line = null;
			StringBuffer strBuffer = null;
			HashMap<String, Integer> hashMap = new HashMap();

			while((line = br.readLine()) != null) {
				
				//System.out.println("Line: "+ line);
				String[] strArry = line.split("\\s");
				
				for(String s: strArry) {
					String key = s.toLowerCase();
					if(hashMap.containsKey(key)) {
						hashMap.put(key, hashMap.get(key) + 1);
					} else {
						hashMap.put(key, 1);
					}
				}
			}
			
			Entry<String, Integer> output = Collections.max(hashMap.entrySet(), 
					(Entry<String, Integer> e1, Entry<String, Integer> e2) -> e1.getValue().compareTo(e2.getValue()));
			
			System.out.println("The most occuring word in the given input is: "+output.getKey()+", number of times it came in the input is: "+output.getValue());

			/*
			 * for(Map.Entry<String, Integer> entry: hashMap.entrySet()) {
			 * System.out.println("Key: "+ entry.getKey() + ", Value: "+entry.getValue()); }
			 */

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}


}
