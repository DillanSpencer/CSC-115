package com.quad.core;

import java.util.ArrayList;

import com.quad.array.Arrays;
import com.quad.binarytree.BinaryTree;
import com.quad.date.Trip;
import com.quad.utils.ArrayListUtils;
import com.quad.utils.ArrayUtils;
import com.quad.utils.BinaryTreeUtils;
import com.quad.utils.TripUtils;

public class MainApp {
	
	public static void main(String...strings) {
		System.out.println("-----App Test-----\n");
		
		//test array
//		System.out.println("ARRAY TEST");
//		int[] arr = ArrayUtils.generateArray(15);
//		ArrayUtils.printArray(arr);
//		System.out.println("AVERAGE");
//		System.out.println(Arrays.average(arr));
//		System.out.println("NUM ABOVE AVERAGE");
//		System.out.println(Arrays.numAboveAverage(arr));
//		
//		//test string array
//		System.out.println("\nSTRING TEST");
//		String[] words = ArrayUtils.generateStrings(5);
//		ArrayUtils.printArray(words);
//		System.out.println("NUM UPPERCASE");
//		System.out.println(Arrays.numUppercase(words));
//		
//		//test trip
//		System.out.println("\nTRIP TEST");
//		Trip[] trips = TripUtils.generateTrips(3);
//		ArrayUtils.printArray(trips);
//		System.out.println("LONGEST TRIP");
//		TripUtils.findLongestTrip(trips);
//		System.out.println("List of Destinations");
//		ArrayUtils.printArray(TripUtils.listOfDestinations(trips));
//		
//		//test array list
//		System.out.println("\nARRAY LIST TEST");
//		ArrayList<Integer> list = ArrayListUtils.generateList(10);
//		ArrayList<Integer> other = ArrayListUtils.generateList(10);
//		ArrayList<String> stringList = ArrayListUtils.generateStrings(3);
//		ArrayListUtils.printArrayList(list);
//		ArrayListUtils.printArrayList(other);
//		System.out.println("Num above average: " + ArrayListUtils.numAboveAverage(list));
//		System.out.println("Sum: " + ArrayListUtils.sum(list));
//		ArrayListUtils.negate(list);
//		System.out.println("Negate: " + list.toString());
//		ArrayListUtils.removeNegative(list);
//		System.out.println("Remove Negatives: " + list.toString());
//		ArrayListUtils.appendList(list, other);
//		System.out.println("Append Other List: " + list.toString());
//		System.out.println("STRING TEST");
//		System.out.println("List of Strings: " + stringList.toString());
//		System.out.println("Num capital: " + ArrayListUtils.numUppercase(stringList));
		
		//binary tree
		BinaryTree tree = new BinaryTree();
		BinaryTreeUtils.generateTree(tree,15);
		System.out.println("Tree height: " + tree.getHeight());
		System.out.println("Is the tree full: " + tree.isFull());
		System.out.println("Greatest value in tree: " + tree.findGreatestValue());
		tree.printTree(BinaryTree.LEVELORDER);
	}

}
