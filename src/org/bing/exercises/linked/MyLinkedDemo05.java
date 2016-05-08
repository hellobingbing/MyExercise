package org.bing.exercises.linked;

class LinkedNode{
	private int data;
	private LinkedNode next;
	public LinkedNode(int data){
		this.setData(data);
	}
	public void setData(int data){
		this.data = data;
	}
	public int getData(){
		return this.data;
	}
	public void setNext(LinkedNode next){
		this.next = next;
	}
	public LinkedNode getNext(){
		return this.next;
	}
	public void appendToTail(int data){
		LinkedNode newNode = new LinkedNode(data);
		LinkedNode current = this;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
	}
	
}

/**
 * �ҳ���������ĵ�����k��
 * @author Acer
 *
 */
public class MyLinkedDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedNode head = new LinkedNode(1);
		head.appendToTail(2);
		head.appendToTail(3);
		head.appendToTail(4);
		head.appendToTail(5);
		head.appendToTail(6);
		LinkedNode current = head;
		while(current != null){
			System.out.println(current.getData());
			current = current.getNext();
		}
		System.out.println("��ǰ��������5���ڵ�����Ϊ:" + findBackwards(head, 5));
		System.out.println("��ǰ��������5���ڵ�����Ϊ:" + nthToLast(head, 5));
		
	}
	/**
	 * �����뵽�ķ�����
	 * @param head
	 * @param k
	 * @return
	 */
	public static int findBackwards(LinkedNode head,int k){
		LinkedNode current = head;
		int data = 0;
		int len = 0;
		while(current != null){
			current = current.getNext();
			len++;
		}
		System.out.println("�����нڵ�:" + len);
		int forwards = len - k + 1;
		current = head;
		for(int i = 1;i < forwards;i++){
			current = current.getNext();
		}
		data = current.getData();
		return data;
	}
	/**
	 * ����еĵ�������������ָ��p1��p2������ָ���ͷ���ٽ�p2��ǰ�ƶ�k���ڵ㣬֮����ͬ���ٶ��ƶ���length-k����p2����β������ʱp1ָ������k���ڵ㡣
	 * @param head
	 * @param k
	 * @return
	 * ���㷨������Сbug
	 */
	public static int nthToLast(LinkedNode head,int k){
		LinkedNode p1 = head;
		LinkedNode p2 = head;
		if(p1 == null){
			return -1;
		}
		int count = 1;
		for(int i = 0;i < k;i++){
			p2 = p2.getNext();
			// �����������:һ��Ԫ�ط��ص�����һ��������Ԫ�ط��ص����ڶ���
			if(count == k && p2.getNext() == null){
				return p1.getData();
			}
			// ���k����������
			if(p2 == null && k > count){
				return -1;
			}
			count++;
		}
		// p1p2����ͬ�ٶ���ǰ�ƶ�
		while(p2 != null){
			p1 = p1.getNext();
			p2 = p2.getNext();
		}
		return p1.getData();
		
	}

}
