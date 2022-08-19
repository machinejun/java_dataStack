package java_datastack_example.ex1;

import java.util.NoSuchElementException;

public class ArraySample<T> {
	
	private T list[];
	private int size;
	
	public ArraySample() {
		this.list = (T[]) new Object[1];
		this.size = 0;
	}
	
	public T getIndex(int k) {
		if(size == 0) throw new NoSuchElementException("리스트가 비었습니다.");
		return list[k];
	}
	
	public void insertLast(T newItem) {
		if(size == list.length) resize(2*list.length);
		list[size++] = newItem;
	}
	
	public void insert(T newItem, int k) {
		if(size == list.length) {
			resize(2*list.length);
		}
		
		for(int i = size-1; i >= k; i--) {
			list[i+1] = list[i];
		}
		list[k] = newItem;
		size++;
	}
	
	private void resize(int newSize) {
		Object[] newlist = new Object[newSize];
		for(int i =0; i <size; i++) {
			newlist[i] = list[i]; 
		}
		list = (T[]) newlist;
	}
	
	public T delete(int k) {
		if(isEmpty()) throw new NoSuchElementException();
		T item = list[k];
		for(int i =k; i < size-1; i++) list[i] = list[i+1];
		list[size -1] = null;
		size--;
		if(size > 0 && size == list.length/4) {
			resize(list.length/2);
		}
		return item;
	}

	private boolean isEmpty() {
		if(list[0] == null) {
			return true;
		}
		return false;
	}
	
	public T[] getlist() {
		return list;
	}
	public void printlist() {
		for(int i = 0; i <list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
