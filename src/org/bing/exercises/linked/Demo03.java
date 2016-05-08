package org.bing.exercises.linked;
/*
 * 给定链表,删除其中间节点
 */
public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(null);
		
		Node headNode = deleteMiddleNode(head);
		System.out.println(headNode.next.next.data);
		System.out.println(node1.next.data);
		
		
	}
	
	public static Node deleteMiddleNode(Node head){
		if(head == null || head.next == null){
			return null;
		}
		Node headNode = head;
		int count = 0;
		while(head.next != null){
			count++;
			head = head.next;
		}
		head = headNode;
		int i = 0;
		while(++i < (count + 1)/2){
			head = head.next;
		}
		head.next = head.next.next;
		
		return headNode;
	}
	

}
