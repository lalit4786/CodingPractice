package com.linkedlist.programs;

public class MergeSortSL 
{
	private static Node getMiddle(Node head_ref)
	{
		Node slow_node,fast_node;
		
		slow_node = head_ref;
		fast_node = head_ref.next;
		
		while(fast_node != null)
		{
			fast_node = fast_node.next;
			if(fast_node != null)
			{
				slow_node = slow_node.next;
				fast_node = fast_node.next;
			}		
		}
		
		return slow_node;
	}
	
	private static Node sortedmerge(Node a, Node b)
	{
		Node result;
		if(a == null)
			return b;
		if(b == null)
			return a;
		
		if(a.data <= b.data)
		{
			result = a;
			result.next = sortedmerge(a.next,b);
		}
		else
		{
			result = b;
			result.next = sortedmerge(a,b.next);
		}
		
		return result;
	}
	
  public static Node mergesort(Node head_ref)
  {
	  if(head_ref == null || head_ref.next == null)
		  return head_ref;
	  
	  Node middle = getMiddle(head_ref);
	  Node middle_next = middle.next;
	  
	  middle.next = null;
	  
	  Node left = mergesort(head_ref);
	  Node right = mergesort(middle_next);
	  
	  return sortedmerge(left,right);
  }
}
