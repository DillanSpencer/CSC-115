package com.quad.binarytree;

public class BinaryTree {
	
	private Node root;
	
	public void insert(String key, int val) {
		root = insert(root, key, val);
	}
	
	private Node insert(Node node, String key, int val) {
		if(node == null) return new Node(key, val);
		
		if(node.getKey() == key) {
			node.setValue(val);
		}
		if(val < node.getValue())
			node.setLeft(insert(node.getLeft(), key, val));
		if(val > node.getValue())
			node.setRight(insert(node.getRight(), key, val));
		
		return node;
	}
	
	public int getHeight() {
		return height(root);
	}
	
	private int height(Node node) {
		if(node == null) return 0;
		return 1+Math.max(height(node.getLeft()), height(node.getRight()));
	}

}
