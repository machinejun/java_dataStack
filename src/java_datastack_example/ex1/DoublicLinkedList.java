package java_datastack_example.ex1;

public class DoublicLinkedList <T> {
	private DoubleNode<T> head, tail;
	private int size;
	
	public DoubleNode getHead() {
		return this.head;
	}
	
	public DoubleNode getTail() {
		return this.tail;
	}
	
	
	public DoublicLinkedList() {
		this.head = new DoubleNode<T>((T) "HEAD", null, null);
		this.tail = new DoubleNode<T>((T) "TAIL", head, null);
		this.head.setNext(tail);
		size = 0;
	}
	
	public DoubleNode<T> searchFromHead(T target) {
		DoubleNode<T> tempNode = head;
		for(int i = 0; i < size+2; i++) {
			if(target == tempNode.getItem()) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		
		return null;
	}
	
	public DoubleNode<T> searchFromTail(T target) {
		DoubleNode<T> tempNode = tail;
		for(int i = 0; i < size+2; i++) {
			if(target == tempNode.getItem()) {
				return tempNode;
			}
			tempNode = tempNode.getPrevious();
		}
		
		return null;
	}
	
	public void insertBefore(DoubleNode<T> targetNode, T newItem) {
		DoubleNode<T> priveousNode = targetNode.getPrevious();
		DoubleNode<T> newNode = new DoubleNode<T>(newItem, priveousNode, targetNode);
		targetNode.setPrevious(newNode);
		priveousNode.setNext(newNode);
		size++;
	}
	
	public void insertAfter(DoubleNode<T> targetNode, T newItem) {
		DoubleNode<T> nextNode= targetNode.getNext();	
		DoubleNode<T> newNode = new DoubleNode<T>(newItem, targetNode, nextNode);
		nextNode.setPrevious(newNode);
		targetNode.setNext(newNode);
		size++;
	}
	
	public void delete(DoubleNode<T> targetNode) {
		DoubleNode<T> priveousNode = targetNode.getPrevious();
		DoubleNode<T> nextNode = targetNode.getNext();
		priveousNode.setNext(nextNode);
		nextNode.setPrevious(priveousNode);
		size--;
	}
	
	public void printLinklist() {
		DoubleNode<T> temphead = head.getNext();
		for(int i = 0; i < size; i++) {
			System.out.println("node(" + i + ") " + temphead.getItem());
			temphead = temphead.getNext();
			if(temphead == null) return;
		}
	}
	
	
}
