package org.bing.exercises.stack;

public class MyArrayStack<T> implements MyStack<T>{
	
	private Object[] objs = new Object[16];
	private int size = 0;
	
	@Override
	public boolean isEmpty(){
		return this.size == 0;
	}

	@Override
	public void clear() {
		for(int i = 0;i < size;i++){
			objs[i] = null;
		}
		this.size = 0;
	}

	@Override
	public int length() {
		return this.size;
	}

	@Override
	public boolean push(T data) {
		// 判断是否需要扩容
		if(this.size >= objs.length){
			resize();
		}
		objs[this.size++] = data;
		return true;
	}
	/*
	 * 数组扩容
	 */
	private void resize(){
		Object[] temp = new Object[objs.length*3/2 + 1];
		for(int i = 0;i < size;i++){
			temp[i] = objs[i];
			objs[i] = null;
		}
		objs = temp;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		if(size == 0){
			return null;
		}
		T t = (T)objs[--size];
		objs[size] = null;
		return t;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		for(int i = 0;i < this.size;i++){
			buf.append(objs[i]);
			if(i < this.size - 1){
				buf.append(",");
			}
		}
		return buf.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
