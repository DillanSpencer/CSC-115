package com.quad.binarytree;

public class BinaryTree {
	
	//print constants
	public static final int INORDER = 1;
	public static final int PREORDER = 2;
	public static final int POSTORDER = 3;
	public static final int LEVELORDER = 4;
	
	private Node root;
	
	//inserts a node in tree
	public void insert(String key, int val) {
		root = insert(root, key, val);
	}
	
	//recursive insert
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
	
	//returns the height of the tree
	public int getHeight() {
		return height(root);
	}
	
	//recursive height
	private int height(Node node) {
		if(node == null) return 0;
		return 1+Math.max(height(node.getLeft()), height(node.getRight()));
	}
	
	//returns number of nodes in the tree
	public int countNodes(Node root)  
    { 
        if (root == null) 
            return (0); 
        return (1 + countNodes(root.left) + countNodes(root.right)); 
    } 
	
	//checks if tree is full
	public boolean isFull() {
		return isFull(root, 0, countNodes(root));
	}
   
    /* This function checks if the binary tree is complete or not */
    public boolean isFull(Node root, int index, int number_nodes) 
    { 
        // An empty tree is complete 
        if (root == null)         
           return true; 
   
        // If index assigned to current node is more than 
        // number of nodes in tree, then tree is not complete 
        if (index >= number_nodes) 
           return false; 
   
        // Recur for left and right subtrees 
        return (isFull(root.left, 2 * index + 1, number_nodes) 
            && isFull(root.right, 2 * index + 2, number_nodes)); 
    } 
    
    public int findGreatestValue() {
    	return findGreatestValue(root);
    }
    
    //finds the greatest value in the tree
    private int findGreatestValue(Node node) {
    	if(node == null) return Integer.MIN_VALUE;
    	
    	//roots data
    	int max = node.getValue();
    	//left
    	int left = findGreatestValue(node.left);
    	//right
    	int right = findGreatestValue(node.right);
    	
    	//find greatest
    	if(left > max) max = left;
    	if(right > max) max = right;
    	
    	return max;
    	
    }
    
    /*
     * PRINT FUNCTIONS
     */
    
    public void printTree(int order) {
    	System.out.print("{ ");
    	switch(order) {
    	case INORDER:
    		printInOrder(root);
    		break;
    	case PREORDER:
    		printPreOrder(root);
    		break;
    	case POSTORDER:
    		printPostOrder(root);
    		break;
    	case LEVELORDER:
    		printLevelOrder();
    		break;
    	}
    	System.out.println("}");
    }
    
    private void printInOrder(Node node) {
    	if(node == null) return;
    	printInOrder(node.left);
    	System.out.print(node.getKey()+":"+node.getValue()+" ");
    	printInOrder(node.right);
    }
    
    private void printPreOrder(Node node) {
    	if(node == null) return;
    	System.out.print(node.getKey()+":"+node.getValue()+" ");
    	printPreOrder(node.left);
    	printPreOrder(node.right);
    }
    
    private void printPostOrder(Node node) {
    	if(node == null) return;
    	printPostOrder(node.left);
    	printPostOrder(node.right);
    	System.out.print(node.getKey()+":"+node.getValue()+" ");
    }
    
    //prints level order
    private void printLevelOrder() {
    	int h = getHeight();
    	for(int i = 1; i < h; i++) {
    		printLevelAt(root, i);
    	}
    }
    
    //prints a certain level in the tree
    private void printLevelAt(Node root, int level) {
    	 if (root == null) 
             return; 
         if (level == 1) 
        	 System.out.print(root.getKey()+":"+root.getValue()+" "); 
         else if (level > 1) 
         { 
        	 printLevelAt(root.left, level-1); 
        	 printLevelAt(root.right, level-1); 
         } 
    }
    
    /*
     * GETTERS AND SETTERS
     */
    public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
}
