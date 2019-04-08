package com.quad.utils;

import java.util.Random;

public class ArrayUtils {
	
	/*
	 * INTEGER ARRAY
	 */
	public static int[] generateArray(int n) {
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new Random().nextInt(n);
		}
		return arr;
	}

	/*
	 * STRING ARRAY
	 */
	public static String[] generateStrings(int n) {
		String[] randomStrings = new String[n];
	    Random random = new Random();
	    for(int i = 0; i < n; i++)
	    {
	        char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
	        for(int j = 0; j < word.length; j++)
	        {
	        	if(random.nextBoolean())
	        		word[j] = (char)('a' + random.nextInt(26));
	        	else 
	        		word[j] = (char)('A' + random.nextInt(26));
	        }
	        randomStrings[i] = new String(word);
	    }
	    return randomStrings;
	}
	
	/*
	 * PRINT ARRAYS
	 */
	
	//INTEGER
	public static void printArray(int[] arr) {
		System.out.print("{");
		for(int i = 0; i < arr.length-1;i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length-1] + "}");
	}
	
	//STRING
	public static void printArray(String[] arr) {
		System.out.print("{");
		for(int i = 0; i < arr.length-1;i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length-1] + "}");
	}
	
	//GENARIC OBJECT
	public static void printArray(Object[] arr) {
		System.out.print("{");
		for(int i = 0; i < arr.length-1;i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length-1] + "}");
	}
}
