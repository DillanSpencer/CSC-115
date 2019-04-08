package com.quad.binarytree;

public class BinarySearchTree {
	
	private BinaryTree tree;
	private Node root;
	
	public BinarySearchTree() {
		tree = new BinaryTree();
		root = null;
	}
	
	public BinarySearchTree(BinaryTree tree) {
		this.tree = tree;
		root = tree.getRoot();
	}
	
	public int findValue(String key) {
		return findValue(root, key);
	}
	
	private int findValue(Node node, String key) {
		if (node == null)
	         return 0;
	      else
	      if (key.equals(node.getKey()))
	      	return node.getValue();
	      else
	      if (key.compareTo(node.getKey()) < 0)
	         return findValue(node.left, key);
	      else
	         return findValue(node.right, key);
		
	}

	public BinaryTree getTree() {
		return tree;
	}

	public void setTree(BinaryTree tree) {
		this.tree = tree;
	}
	
	

}
