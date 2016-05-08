package org.bing.exercises.linked;

import org.bing.exercises.stack.MyLinkedStack;

/*
 * ����ѭ���͵ݹ��ʵ��
 * ��β��ͷ��ӡ����
 * ��ջʵ�֡�����ȳ���
 */
public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(null);
		
		printListReversingly_Iteratively(head);
		printListReversingly_Recursively(head);
		
		
	}
	/*
	 * ѭ������
	 */
	public static void printListReversingly_Iteratively(Node head){
		MyLinkedStack<Integer> stack = new MyLinkedStack<Integer>();
		while(head != null){
			int data = head.data;
			stack.push(data);
			head = head.next;
		}
		
		while(!stack.isEmpty()){
			int data = stack.pop();
			System.out.println(data);
		}
		
	}
	/*
	 * �ݹ鷽��
	 */
	public static void printListReversingly_Recursively(Node head){
		if(head != null){
			if(head.next != null){
				printListReversingly_Recursively(head.next);
			}
			System.out.println(head.data);
		}
	}
	

}
