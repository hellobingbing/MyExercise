package org.bing.exercises.stack;

public interface MyStack<T> {

	boolean isEmpty();
	
	void clear();
	
	int length();
	
	boolean push(T data);
	
	T pop();
	
}
