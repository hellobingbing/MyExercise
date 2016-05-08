package org.bing.exercises.linked;

class DataNode{
	private int data;
	private DataNode next;
	public DataNode(int data){
		this.setData(data);
	}
	public void setData(int data){
		this.data = data;
	}
	public int getData(){
		return this.data;
	}
	public void setNext(DataNode next){
		this.next = next;
	}
	public DataNode getNext(){
		return this.next;
	}
	public void appendToTail(int data){
		DataNode node = new DataNode(data);
		DataNode current = this;
		while(current.next != null){
			current = current.next;
		}
		current.next = node;
	}
	
}
/**
 * 以给定值x为基准，将链表分隔成两部分，小于x的节点排在大于等于x的节点之前。
 * @author Acer
 *
 */
public class MyLinkedDemo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataNode head = new DataNode(12);
		head.appendToTail(26);
		head.appendToTail(6);
		head.appendToTail(11);
		head.appendToTail(7);
		head.appendToTail(2);
		DataNode current = head;
		while(current != null){
			System.out.println(current.getData());
			current = current.getNext();
		}
		
	}

}
