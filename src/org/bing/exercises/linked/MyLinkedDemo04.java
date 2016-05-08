package org.bing.exercises.linked;

import java.util.HashMap;
import java.util.HashSet;

class Person{
	private int age;
	private Person next;
	public Person(int age){
		this.age = age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public void setNext(Person next){
		this.next = next;
	}
	public Person getNext(){
		return this.next;
	}
	// 添加节点到链表尾部
	public void appendToTail(int age){
		Person per = new Person(age);
		Person current = this;
		while(current.next != null){
			current = current.next;
		}
		current.next = per;
	}
	
	
}

public class MyLinkedDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person head = new Person(1);
		head.appendToTail(2);
		head.appendToTail(3);
		head.appendToTail(2);
		head.appendToTail(3);
		head.appendToTail(4);
		Person current = head;
		while(current != null){
			System.out.println(current.getAge());
			current = current.getNext();
		}
		System.out.println("删除链表中的重复节点之后:");
		Person pointer = deleteRepeat(head);
		//Person cur = afterDelete;
		while(pointer != null){
			System.out.println(pointer.getAge());
			pointer = pointer.getNext();
		}
		
	}
	/**
	 * 删除未排序链表中的重复节点
	 * @param head
	 * @return
	 */
	public static Person deleteRepeat(Person head){
		HashSet<Integer> set = new HashSet<Integer>();
		Person current = head;
		
		if(head == null){
			return head;
		}
		// 非空链表，添加第一个节点中的数据
		set.add(current.getAge());
		while(current.getNext() != null){
			Person next = current.getNext();
			if(set.contains(next.getAge())){
				next = next.getNext();
				//current = next;
			}else{
				set.add(next.getAge());
				current = next;
			}
		}
		return head;
		
	}
	public static Person deleteDups(Person head){
		if(head == null) return head;
		HashSet<Integer> set = new HashSet<Integer>();
		Person newHead = null;
		Person current = head;
		while(current != null){
			if(set.contains(current.getAge())){
				
			}
		}
		
	}

	
}
