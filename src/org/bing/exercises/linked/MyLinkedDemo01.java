package org.bing.exercises.linked;
/**
 * 链表节点类
 * @author Acer
 *
 */
class Node{
	private int data;
	private Node next;
	public Node(int data){
		this.setDate(data);
	}
	public void setDate(int data){
		this.data = data;
	}
	public int getData(){
		return this.data;
	}
	public void setNode(Node next){
		this.next = next;
	}
	public Node getNode(){
		return this.next;
	}
	public void appendToTail(Node next){
		this.next = next;
	}
}
/**
 * 创建链表
 * @author Acer
 *
 */
public class MyLinkedDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		
		node1.appendToTail(node2);
		node2.appendToTail(node3);
		System.out.println(node1.getData());
		System.out.println(node1.getNode().getData());
		System.out.println(node1.getNode().getNode().getData());
		
	}

}
