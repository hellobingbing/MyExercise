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
 * 找出单向链表的倒数第k个
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
		System.out.println("当前链表倒数第5个节点数据为:" + findBackwards(head, 5));
		System.out.println("当前链表倒数第5个节点数据为:" + nthToLast(head, 5));
		
	}
	/**
	 * 首先想到的方法。
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
		System.out.println("链表共有节点:" + len);
		int forwards = len - k + 1;
		current = head;
		for(int i = 1;i < forwards;i++){
			current = current.getNext();
		}
		data = current.getData();
		return data;
	}
	/**
	 * 金典中的迭代方法。两个指针p1和p2，首先指向表头，再将p2向前移动k个节点，之后相同的速度移动，length-k步后p2到达尾部，此时p1指向倒数第k个节点。
	 * @param head
	 * @param k
	 * @return
	 * 此算法还存在小bug
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
			// 这是如下情况:一个元素返回倒数第一个，两个元素返回倒数第二个
			if(count == k && p2.getNext() == null){
				return p1.getData();
			}
			// 如果k大于链表长度
			if(p2 == null && k > count){
				return -1;
			}
			count++;
		}
		// p1p2以相同速度往前移动
		while(p2 != null){
			p1 = p1.getNext();
			p2 = p2.getNext();
		}
		return p1.getData();
		
	}

}
