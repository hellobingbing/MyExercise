package org.bing.exercises.tree;

import java.util.LinkedList;

public class BinaryTree {
	
	public Node root = null;
	
	private class Node{
		int val ;
		Node left ;
		Node right ;
		public Node(int val){
			this.val = val;
			this.left = null;
			this.right = null;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {6,2,8,4,9,3,6,10,4};
		BinaryTree binaryTree = new BinaryTree();
		
		for(int val : array){
			binaryTree.buildTree(binaryTree.root, val);
		}
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		preOrder(binaryTree.root, list);
		for(int i : list){
			System.out.println(i);
		}
		
	}
	//
	public void buildTree(Node node,int val){
		if(this.root == null){
			this.root = new Node(val);
		}else {
			if(val < node.val){
				if(node.left == null){
					node.left = new Node(val);
				}else {
					buildTree(node.left, val);
				}
			}else {
				if(node.right == null){
					node.right = new Node(val);
				}else {
					buildTree(node.right, val);
				}
			}
		}
		
	}
	//
	public void createTree(int[] array,Node root){
		for(int i = 0;i<array.length/2 - 1;i++){
			if(i == 0){
				root = new Node(array[0]);
				root.left = new Node(array[1]);
				root.right = new Node(array[2]);
			}else {
				Node node = new Node(array[i]);
				node.left = new Node(array[2*i + 1]);
				node.right = new Node(array[2*i + 2]);
			}
			
		}
		Node lastParentNode = new Node(array[array.length/2 - 1]);
		lastParentNode.left = new Node(array[(array.length/2 - 1)*2 + 1]);
		if(array.length % 2 == 1){
			lastParentNode.right = new Node(array[(array.length/2 - 1)*2 + 2]);
		}
		
	}
	//
	public static void preOrder(Node root,LinkedList<Integer> list){
		if(root != null){
			list.add(root.val);
			preOrder(root.left, list);
			preOrder(root.right, list);
		}
		
	}

}
