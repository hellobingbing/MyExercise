package org.bing.exercises.linked;


/*
 * 实现单链表和双链表的反转
 */
public class Demo04 {

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
		
		Node newHead = reverseSingleLinkedlist(head);
		System.out.println(newHead.data);
		System.out.println(newHead.next.data);
		System.out.println(newHead.next.next.data);
		System.out.println(newHead.next.next.next.data);
		System.out.println(newHead.next.next.next.next.data);
		
	}
	
	public static Node reverseSingleLinkedlist(Node head){
		Node pre = null;
		Node next = null;
		while(head != null){
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
	
	public static void reverseDoubleLinkedlist(Node head){
		
	}

}
