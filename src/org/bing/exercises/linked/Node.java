package org.bing.exercises.linked;

public class Node {
	
	public int data;
	public Node next;
	public Node prior;
	public Node(int data){
		this.data = data;
	}
	public void setNext(Node next){
		this.next = next;
	}
	public void setPrior(Node prior){
		this.prior = prior;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
