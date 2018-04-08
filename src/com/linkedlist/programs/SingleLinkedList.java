package com.linkedlist.programs;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class SingleLinkedList 
{
	private Node head;
	
	public SingleLinkedList()
	{
		head = null;
	}
	
	public void addFirst(int n)
	{
		Node new_node = new Node(n);
		
		if(head == null)
			head = new_node;
		else
		{
			new_node.next = head;
			head = new_node;
		}	
	}
	
	public void addLast(int n)
	{
		Node new_node = new Node(n);
		
		if(head == null)
			head = new_node;
		else
			getTail().next = new_node;	
	}
	
	public Node getHead()
	{
		return head;
	}
	
	public Node getTail()
	{
		Node temp = head;
		
		if(temp != null)
		{	
			while(temp.next != null)
				temp = temp.next;
		}
		
		return temp;
	}
	
	public void printList()
	{
		Node temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
		System.out.println();
	}
	
	public void printList(Node head_ref)
	{
		while(head_ref != null)
		{
			System.out.print(head_ref.data + " ");
			head_ref = head_ref.next;
		}
		
		System.out.println();
	}
	
	public void deleteNode(int key)
	{
		Node curr_node, prev_node;
		
		prev_node = null;
		curr_node = this.getHead();
		
		
		if(curr_node != null && curr_node.data == key)
			head = head.next;
		
		while(curr_node!=null)
		{
			if(curr_node.data == key)
			{
				prev_node.next = curr_node.next;
				break;
			}
				
			prev_node = curr_node;
			curr_node = curr_node.next;
		}
		
	}
	
	public int getLength(Node curr_node)
	{
		if(curr_node==null)
			return 0;
		else
			return 1 + getLength(curr_node.next);
	}
	
	public Node reverseList()
	{
		Node prev_node , curr_node , next_node;
		
		prev_node = null;
		curr_node = head;
		
		while(curr_node!=null)
		{
			next_node = curr_node.next;
			curr_node.next = prev_node;
			prev_node = curr_node;
			curr_node = next_node;
		}
		
		return prev_node;
	}
	
	public void removeuplicates()
	{
		if(head == null || head.next == null)
			return ;
		
		Node head_ref = head;
		
		while(head_ref.next != null)
		{
			if(head_ref.data == head_ref.next.data)
			{
				head_ref.next = head_ref.next.next;
			}
			else
			{
				head_ref = head_ref.next;
			}
		}
	}
}
