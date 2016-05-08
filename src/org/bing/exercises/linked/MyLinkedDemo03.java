package org.bing.exercises.linked;

class Number{
	private int age;
	private Number next;
	public Number(int age){
		this.setAge(age);
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public void setNext(Number next){
		this.next = next;
	}
	public Number getNext(){
		return this.next;
	}
	
	public void appendToTail(int age){
		Number number = new Number(age);
		Number current = this;
		while(current.next != null){
			current = current.next;
		}
		current.next = number;
	}
	
	
}
/**
 * 为了说明'快行指针'技巧。
 * @author Acer
 *
 */
public class MyLinkedDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Number head = new Number(1);
		head.appendToTail(1);
		head.appendToTail(1);
		head.appendToTail(2);
		head.appendToTail(2);
		head.appendToTail(2);
		Number current = head;
		while(current != null){
			System.out.println(current.getAge());
			current = current.getNext();
		}
		// quick pointer and slow pointer
		int len = 2;
		Number quick = head.getNext();
		Number slow = head;
		while(quick.getNext() != null){
			slow = slow.getNext();
			quick = quick.getNext().getNext();
			len += 2;
		}
		System.out.println("链表共有节点:" + len);
		Number start1 = head;
		Number start2 = head;
		for(int i = 0;i < len/2;i++){
			start2 = start2.getNext();
		}
		for(int i = 0;i < len/2;i++){
			System.out.print(start1.getAge() + ",");
			System.out.print(start2.getAge() + ",");
			start1 = start1.getNext();
			start2 = start2.getNext();
		}
		
	}

}
