package org.bing.exercises.stack;

public class MyLinkedStack<T> implements MyStack<T>{
	// ’ª∂•÷∏’Î
	private Node top;
	// ’ª≥§∂»
	private int size;
	
//	public int getSize(){
//		return this.size;
//	}
//	
//	public Node getTop(){
//		return this.top;
//	}
	
	public MyLinkedStack() {
		this.top = null;
		this.size = 0;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void clear() {
		top = null;
		size = 0;
	}

	@Override
	public int length() {
		return this.size;
	}

	@Override
	public boolean push(T data) {
		Node node = new Node();
		node.data = data;
		node.pre = top;
		top = node;
		size++;
		return true;
	}

	@Override
	public T pop() {
		if(top != null){
			T t = top.data;
			top = top.pre;
			size--;
			return t;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private final class Node{
		private T data;
		private Node pre;
	}
	
}
