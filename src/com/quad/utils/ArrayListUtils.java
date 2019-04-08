package com.quad.utils;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListUtils {
	
	/*
	 * INTEGER
	 */
	public static int sum(ArrayList<Integer> arr) {
		int sum = 0;
		for(Integer i : arr) sum += i;
		return sum;
	}
	
	public static double average(ArrayList<Integer> arr) {
		return (ArrayListUtils.sum(arr) / arr.size());
	}
	
	public static int numAboveAverage(ArrayList<Integer> arr) {
		double avg = ArrayListUtils.average(arr);
		int count = 0;
		for(Integer i : arr) if(i > avg) count++;
		return count;
	}
	
	public static boolean isAllAbove(ArrayList<Integer> arr, int threshold) {
		for(Integer i : arr) {
			if(i < threshold) return false;
		}
		return true;
	}
	
	public static void negate(ArrayList<Integer> arr) {
		for(int i = 0; i < arr.size(); i++) {
			arr.set(i, -arr.get(i));
		}
	}
	
	public static void removeNegative(ArrayList<Integer> arr) {
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) < 0) {
				arr.remove(i);
				i--;
			}
		}
	}
	
	public static void appendList(ArrayList<Integer> arr, ArrayList<Integer> other) {
		for(int i = 0; i < other.size(); i++) {
			arr.add(other.get(i));
		}
	}
	
	/*
	 * STRING
	 */
	public static int numUppercase(ArrayList<String> arr) {
		int count = 0;
		for(String s : arr) {
			if(Character.isUpperCase(s.charAt(0))) count++;
		}
		return count;
	}
	
	/*
	 * PRINT
	 */
	public static void printArrayList(ArrayList<Integer> arr) {
		System.out.println(arr.toString());
	}
	
	/*
	 * GENERATER
	 */
	public static ArrayList<Integer> generateList(int n){
		Random r = new Random();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			arr.add(r.nextInt(n));
		}
		return arr;
	}
	
	public static ArrayList<String> generateStrings(int n){
		String[] s = ArrayUtils.generateStrings(n);
		ArrayList<String> strings = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			strings.add(s[i]);
		}
		return strings;
	}

}
