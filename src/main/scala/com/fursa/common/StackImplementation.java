package com.fursa.common;

import java.util.ArrayList;

public class StackImplementation<E> extends ArrayList<E>{
	
	
		public void push(E e){
		add(e);
	}
	
	public E pop(){
		get(size()-1);
		return remove(size()-1);
	}
	
	public E top(){
		return get(size()-1);
	}
	
	public boolean isEmpty(){
		return size() ==0 ? true : false;
	}

}
