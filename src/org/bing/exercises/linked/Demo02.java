package org.bing.exercises.linked;

/*
 * 在单链表中和双链表中删除第k个节点
 */
public class Demo02 {

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
		head.setPrior(null);
		node1.setPrior(head);
		node2.setPrior(node1);
		node3.setPrior(node2);
		node4.setPrior(node3);
		
//		deleteSingleLinkedlist(head, 3);
//		System.out.println(node2.next.data);
		deleteDoubleLinkedlist(head, 3);
		System.out.println(node2.next.data);
		
		
	}
	
	public static void deleteSingleLinkedlist(Node head,int k){
		for(int i = 0;i < k;i++){
			if(head.next == null){
				return;
			}else if (i + 1 == k) {
				head.next = head.next.next;
			}else {
				head = head.next;
			}
		}
		
	}
	
	public static void deleteDoubleLinkedlist(Node head,int k){
		for(int i = 0;i <= k;i++){
			if(head == null){
				return;
			}else if (i == k) {
				head.prior.next = head.next;
				head.next.prior = head.prior;
			}else {
				head = head.next;
			}
		}
		
	}

}
