package com.java.test;

public class TestBinarySearchTree {
	
	public static void main(String[] args) {
		TestBinarySearchTree treeTest = new TestBinarySearchTree();
		TreeNode root = treeTest.buildTree(new int[]{50,60,10,30,20, 90});
		treeTest.printTree(root);
	}
	
	private TreeNode buildTree(int[] values) {
		TreeNode rootNode = null; 
		for (int value : values) {
			TreeNode node = new TreeNode(value, null, null);
			if (rootNode == null) {
				rootNode = node;
			} else {
				setNode(rootNode, node);
			}
		}
		return rootNode;
	}
	
	private void printTree(TreeNode node) {
		if (node == null) {
			System.out.println("null");
			return;
		}
		System.out.println(node.getValue() + " ");
		System.out.println("Left of " + node.getValue());
		printTree(node.getLeft());
		System.out.println("Right of " + node.getValue());
		printTree(node.getRight());
	}
	
	private void setNode(TreeNode currentNode, TreeNode newNode) {
		if (newNode.getValue() <= currentNode.getValue()) {
			if (currentNode.getLeft() == null) {
				currentNode.setLeft(newNode);
			} else {
				setNode(currentNode.getLeft(), newNode);
			}
		} else if (newNode.getValue() > currentNode.getValue()) {
			if (currentNode.getRight() == null) {
				currentNode.setRight(newNode);
			} else {
				setNode(currentNode.getRight(), newNode);
			}
		} 
	}
}

class TreeNode {
	private int value;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int value, TreeNode left, TreeNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
}
