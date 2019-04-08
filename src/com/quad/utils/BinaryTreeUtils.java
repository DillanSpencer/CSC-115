package com.quad.utils;

import java.util.Random;

import com.quad.binarytree.BinaryTree;

public class BinaryTreeUtils {
	
	public static void generateTree(BinaryTree tree, int n) {
		String[] s = ArrayUtils.generateStrings(n);
		Random r = new Random();
		for(int i = 0; i < n; i++) {
			tree.insert(s[i], r.nextInt(10));
		}
	}

}
