package com.linkedlist.programs;

public class TwoListAddition 
{
	public static SingleLinkedList addTwoList(SingleLinkedList s1 , SingleLinkedList s2)
	{
		Node head_ref1 = s1.getHead(), head_ref2 = s2.getHead();
		
		SingleLinkedList s3 = new SingleLinkedList();
		
		if(head_ref1==null)
			return s2;
		if(head_ref2== null)
			return s1;
		
		if(head_ref1==null && head_ref2==null)
			return null;
		
		int sum;
		int carry = 0;
		
		while(head_ref1!=null && head_ref2!=null)
		{
			sum = head_ref1.data + head_ref2.data + carry;
			
			if(sum>=10)
			{
				s3.addLast(sum-10);
				carry = 1;
			}
			else
			{
				s3.addLast(sum);
				carry = 0;
			}
				
			head_ref1 = head_ref1.next;
			head_ref2 = head_ref2.next;
					
		}
		
		if(head_ref1 == null)
		{
			while(head_ref2 != null)
			{
				sum = head_ref2.data + carry;
				
				if(sum>=10)
				{
					s3.addLast(sum-10);
					carry = 1;
				}
				else
				{
					s3.addLast(sum);
					carry = 0;
				}
				
				head_ref2 = head_ref2.next;
			}		
		}
		
		if(head_ref2 == null)
		{
			while(head_ref1 != null)
			{
				sum = head_ref1.data + carry;
				
				if(sum>=10)
				{
					s3.addLast(sum-10);
					carry = 1;
				}
				else
				{
					s3.addLast(sum);
					carry = 0;
				}
				
				head_ref1 = head_ref1.next;
			}		
		}
		
		return s3;
	}
}
