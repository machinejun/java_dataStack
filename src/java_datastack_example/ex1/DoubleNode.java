package java_datastack_example.ex1;

public class DoubleNode <T>{
	private T item;
	private DoubleNode<T> previous;
	private DoubleNode<T> next;
	
	public DoubleNode(T item, DoubleNode<T> previous, DoubleNode<T> next) {
		this.item = item;
		this.previous = previous;
		this.next = next;
	}
	
	public T getItem() {return item;}
	public DoubleNode<T> getPrevious() {return previous;}
	public DoubleNode<T> getNext() {return next;}
	
	public void setItem(T newItem) { this.item = newItem;}
	public void setPrevious(DoubleNode<T> Dnode) {previous = Dnode;}
	public void setNext(DoubleNode<T> Dnode) {next = Dnode;}
	
	
	
	

}
