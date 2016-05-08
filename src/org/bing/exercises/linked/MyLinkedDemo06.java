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
	// 添加节点，新节点对象赋值给节点的next属性才可以。
	public void appendToTail(String name){
		NameNode node = new NameNode(name);
		NameNode current = this;
		while(current.next != null){
			current = current.next;
		}
		current.next = node;
	}
	// 删除指定名称的节点，返回链表的头节点。
	public NameNode deleteNode(String name){
		NameNode head = this;
		NameNode current = head;
		// 若删除的是头节点，直接返回头节点的下一个节点。
		if(head.getName().equals(name)){
			return head.getNext();
		}
		// 若不是头节点，就要从第一个节点的next开始判断。
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
 * 删除某个节点
 * @author Acer
 *
 */
public class MyLinkedDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NameNode head = new NameNode("张三");
		head.appendToTail("李四");
		head.appendToTail("王五");
		head.appendToTail("赵六");
		NameNode current = head;
		while(current != null){
			System.out.println(current.getName());
			current = current.getNext();
		}
		System.out.println("删除指定节点之后:");
		head = head.deleteNode("王五");
		current = head;
		while(current != null){
			System.out.println(current.getName());
			current = current.getNext();
		}
		
	}
	/**
	 * 删除单向链表中的某个节点，假定你只能访问该节点。注意，若要删除的节点是尾节点，则无解。
	 * 这里的要求，访问不到链表的头节点，只能访问待删除的节点。可以直接将后继节点的数据复制到待删除的节点上，然后删除后继节点。
	 * @return
	 */
	public static boolean delNode(NameNode n){
		// 删除失败
		if(n == null || n.getNext() == null) return false;
		NameNode next = n.getNext();
		n.setName(next.getName());
		n.setNext(next.getNext());
		return true;
	}
	
}
