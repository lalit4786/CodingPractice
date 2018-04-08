package com.linkedlist.programs;

public class ListDriver {

	public static void main(String[] args) 
	{
		SingleLinkedList s = new SingleLinkedList();
		
		s.addFirst(1);
		s.addFirst(2);
		s.addFirst(3);
		s.addFirst(4);
		s.addLast(5);
		s.addLast(6);
		s.addLast(7);
		s.addLast(8);
		
		s.printList();
		
		System.out.println("Number of nodes in the list " + s.getLength(s.getHead()));
		
		s.deleteNode(6);
		
		s.printList();
		
		System.out.println("Number of nodes in the list " + s.getLength(s.getHead()));
		
		//s.printList(MergeSortSL.mergesort(s.getHead()));
		
		Node head_ref = s.reverseList();
		
		if(head_ref != null)
			s.printList(head_ref);
	
		SingleLinkedList s1 = new SingleLinkedList();
		SingleLinkedList s2 = new SingleLinkedList();
		
		s1.addFirst(6);
		s1.addFirst(4);
		s1.addFirst(9);
		s1.addFirst(5);
		s1.addFirst(7);
		
		s1.printList();
		
		s2.addFirst(4);
		s2.addFirst(8);
		
		s2.printList();
		
		TwoListAddition.addTwoList(s1, s2).printList();
	
	}
	
	
}
