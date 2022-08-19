package java_datastack_example;

import java_datastack_example.ex1.DoublicLinkedList;

public class Main {
	public static void main(String[] args) {

		
		DoublicLinkedList<String> dlist = new DoublicLinkedList<String>();
		
		dlist.insertAfter(dlist.getHead(), "철수");
		dlist.insertAfter(dlist.searchFromHead("철수"), "영희");
		dlist.insertAfter(dlist.searchFromHead("영희"), "길동");
		dlist.insertAfter(dlist.searchFromHead("길동"), "규동");
		dlist.printLinklist();
		System.out.println("------------------------------------");
		dlist.delete(dlist.searchFromTail("영희"));
		dlist.printLinklist();
		

		
		
	}

}
