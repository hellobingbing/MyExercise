package org.bing.exercises.linked;
/*
 * 打印两个有序链表公共部分
 */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head1 = new Node(1);
		Node node01 = new Node(2);
		Node node02 = new Node(4);
		Node node03 = new Node(6);
		head1.setNext(node01);
		node01.setNext(node02);
		node02.setNext(node03);
		
		Node head2 = new Node(2);
		Node node1 = new Node(6);
		Node node2 = new Node(8);
		head2.setNext(node1);
		node1.setNext(node2);
		
		print(head1, head2);
		
		
	}
	
	public static void print(Node head1,Node head2){
		while(head1 != null && head2 != null){
			if(head1.data == head2.data){
				System.out.println(head1.data);
				head1 = head1.next;
				head2 = head2.next;
			}else if (head1.data > head2.data) {
				head2 = head2.next;
			}else {
				head1 = head1.next;
			}
		}
	}

}
