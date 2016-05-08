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
	// ��ӽڵ㵽����β��
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
		System.out.println("ɾ�������е��ظ��ڵ�֮��:");
		Person pointer = deleteRepeat(head);
		//Person cur = afterDelete;
		while(pointer != null){
			System.out.println(pointer.getAge());
			pointer = pointer.getNext();
		}
		
	}
	/**
	 * ɾ��δ���������е��ظ��ڵ�
	 * @param head
	 * @return
	 */
	public static Person deleteRepeat(Person head){
		HashSet<Integer> set = new HashSet<Integer>();
		Person current = head;
		
		if(head == null){
			return head;
		}
		// �ǿ�������ӵ�һ���ڵ��е�����
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
