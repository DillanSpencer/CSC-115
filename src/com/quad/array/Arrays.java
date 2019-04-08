package com.quad.array;

public class Arrays {
	
	/*
	 * INTEGER ARRAY
	 */
	public static double average(int[] arr) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (sum / arr.length);
	}
	
	public static int numAboveAverage(int[] arr) {
		double average = Arrays.average(arr);
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > average) count++;
		}
		return count;
	}
	
	/*
	 * STRING ARRAY
	 */
	public static int numUppercase(String[] strings) {
		int count = 0;
		for(int i = 0; i < strings.length; i++) {
			if(Character.isUpperCase(strings[i].charAt(0))) count++;
		}
		return count;
	}
}
