package java_datastack_example.ex1;

import java.util.NoSuchElementException;

/*
 * 단순연결리스트 
 * : 동적 메모리를 할당을 이용해 리스트를 구현하는 가장 간단한 형태
 * : ★ 메모리를 할당받아서 Node를 저장하고, 노드는 레퍼런스를 이용하여 다음 노드를 가르키도록 하여 한 줄로 연결시킨다.
 * : 1 차원 배열에서는 항목을 삭제 또는 삽입을 하는 경우 뒤따르는 항목들이 한칸씩 뒤/ 앞으로 이동해야하는 경우가 생김
 * : but ★ 연결리스트에서는 삽입이나 삭제시 항목들이 이동할 필요가 없다. 
 *   why = 1차원 배열일 경우 크기를 예측하여 결정해야하지만 연결리스트는 빈공간이 필요가 없다.
 *   
 * : 단 >>> ★ 연결리스트에서는 항목을 탐색하려면 첫 노드부터 원하는 노드를 찾을 때 까지 순차 탐색이 이루어져야한다.
 * : ★ 배열은 각 원소들의 래퍼런스를 저장할 필요가 없지만 연결리스트는 노드만다 래퍼런스를 저장할 공간이 필요하다.
 */
public class SingleLinkedListSample <T> {
	private Node head;
	private int size;
	
	
	
	public SingleLinkedListSample() {
		this.head = new Node<T>((T) "HEAD", null);
		this.size = 0;
	}
	
	public Node search(T target) {
		Node node = head;
		for(int i = 0; i < size; i++) {
			if(target == node.getItem()) {
				return node;
			}
			node = node.getNext();
		}
		return null;
	}
	
	public void insertFront(T newitem) {
		head = new Node(newitem, head);
		size++;
	}
	
	public void insertAfter(T newitem, Node newNode) {
		newNode.setNext(new Node(newitem, newNode.getNext()));
		size++;
	}
	
	public void deleteFront() {
		if(head == null) throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}
	
	public void deleteAfter(Node node) {
		if(node == null) throw new NoSuchElementException();
		Node t = node.getNext();
		node.setNext(t.getNext());
		t.setNext(null);
		size--;
	}
	
	public void printLinklist() {
		Node temphead = head;
		for(int i = 0; i < size; i++) {
			System.out.println("node(" + i + ") " + temphead.getItem());
			temphead = temphead.getNext();
			if(temphead == null) return;
		}
	}
}

