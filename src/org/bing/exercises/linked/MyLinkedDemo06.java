package org.bing.exercises.linked;

class NameNode{
	private String name;
	private NameNode next;
	public NameNode(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setNext(NameNode next){
		this.next = next;
	}
	public NameNode getNext(){
		return this.next;
	}
	// ��ӽڵ㣬�½ڵ����ֵ���ڵ��next���Բſ��ԡ�
	public void appendToTail(String name){
		NameNode node = new NameNode(name);
		NameNode current = this;
		while(current.next != null){
			current = current.next;
		}
		current.next = node;
	}
	// ɾ��ָ�����ƵĽڵ㣬���������ͷ�ڵ㡣
	public NameNode deleteNode(String name){
		NameNode head = this;
		NameNode current = head;
		// ��ɾ������ͷ�ڵ㣬ֱ�ӷ���ͷ�ڵ����һ���ڵ㡣
		if(head.getName().equals(name)){
			return head.getNext();
		}
		// ������ͷ�ڵ㣬��Ҫ�ӵ�һ���ڵ��next��ʼ�жϡ�
		while(current.getNext() != null){
			if(current.getNext().getName().equals(name)){
				current.next = current.next.next;
				return this;
			}
			current = current.getNext();
		}
		return this;
		
	}
	
}
/**
 * ɾ��ĳ���ڵ�
 * @author Acer
 *
 */
public class MyLinkedDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NameNode head = new NameNode("����");
		head.appendToTail("����");
		head.appendToTail("����");
		head.appendToTail("����");
		NameNode current = head;
		while(current != null){
			System.out.println(current.getName());
			current = current.getNext();
		}
		System.out.println("ɾ��ָ���ڵ�֮��:");
		head = head.deleteNode("����");
		current = head;
		while(current != null){
			System.out.println(current.getName());
			current = current.getNext();
		}
		
	}
	/**
	 * ɾ�����������е�ĳ���ڵ㣬�ٶ���ֻ�ܷ��ʸýڵ㡣ע�⣬��Ҫɾ���Ľڵ���β�ڵ㣬���޽⡣
	 * �����Ҫ�󣬷��ʲ��������ͷ�ڵ㣬ֻ�ܷ��ʴ�ɾ���Ľڵ㡣����ֱ�ӽ���̽ڵ�����ݸ��Ƶ���ɾ���Ľڵ��ϣ�Ȼ��ɾ����̽ڵ㡣
	 * @return
	 */
	public static boolean delNode(NameNode n){
		// ɾ��ʧ��
		if(n == null || n.getNext() == null) return false;
		NameNode next = n.getNext();
		n.setName(next.getName());
		n.setNext(next.getNext());
		return true;
	}
	
}
