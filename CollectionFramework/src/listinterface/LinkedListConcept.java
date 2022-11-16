package listinterface;

import java.util.AbstractList;
import java.util.List;

public class LinkedListConcept {
	Node head;

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void printMyLinkedList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String[] args) {
		LinkedListConcept link = new LinkedListConcept();
		Node first = link.new Node(10);
		link.head = first;

		Node second = link.new Node(20);
		first.next = second;

		Node third = link.new Node(30);
		second.next = third;
		
		link.printMyLinkedList();
	}

	
}
