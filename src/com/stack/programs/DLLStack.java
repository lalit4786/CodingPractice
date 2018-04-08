package com.stack.programs;

public class DLLStack 
{

	static class DLLNode
	{
		DLLNode prev,next;
		int data;
		
		DLLNode(int data)
		{
			this.data = data;
		}
	}
	
	
	DLLNode head,middle;
	int count;
	
	
	public DLLStack()
	{
		head = middle = null;
		count = 0;
	}
	
	void push(DLLStack stck,int data)
	{
		DLLNode dll_node = new DLLNode(data);
		
		dll_node.prev = null;
		dll_node.next = stck.head;
		stck.count++;
		
		if(stck.count == 1)
		{
			stck.middle = dll_node;
		}
		else
		{
			stck.head.prev = dll_node;
					
			if(stck.count%2!=0)
				stck.middle = stck.middle.prev;
		}
		stck.head = dll_node;
		
	}
			
	int pop(DLLStack stck)
	{
		if(stck.count == 0)
		{
			System.out.println("Stack is empty");
			System.exit(0);
		}
			
		
		DLLNode del_dllnode = stck.head;
		stck.head = del_dllnode.next;
		
		if(stck.head!=null)
			stck.head.prev = null;
		
		stck.count--;
		
		if(stck.count%2==0)
		{
			stck.middle = stck.middle.next;
		}
		
		return del_dllnode.data;
		
	}
	
	int findMiddle1(DLLStack stck)
	{
		if(stck.count == 0)
		{
			System.out.println("Stack is empty now");
			System.exit(0);
		}
		
		return stck.middle.data;
	}
	
	int deleteMiddle(DLLStack stck)
	{
		if(stck.count == 0)
		{
			System.out.println("Stack is empty now");
			System.exit(0);
		}
		
		
		DLLNode mid_dllNode = stck.middle;
		
		if(stck.count == 1)
		{
			stck.count--;
			stck.middle = null;
			stck.head = null;
			
		}
		else
		{
			stck.count--;
			
			if(stck.count%2==0)
			{
				stck.middle.prev.next = stck.middle.next;
				stck.middle.next.prev = stck.middle.prev;
				stck.middle = stck.middle.next;
			}
				
			else
			{
				stck.middle.prev.next = stck.middle.next;
				
				if(stck.middle.next != null)
					mid_dllNode.next.prev = mid_dllNode.prev;
				
				stck.middle = stck.middle.prev;
			}
				
		}

		return mid_dllNode.data;		
	}
	
	public static void main(String[] args) 
	{
	  DLLStack stck = new DLLStack();
	  
	  stck.push(stck, 1);
	  stck.push(stck, 2);
	  stck.push(stck, 3);
	  stck.push(stck, 4);
	  stck.push(stck, 5);
	  
	  
	  System.out.println(stck.findMiddle1(stck));
	  System.out.println(stck.deleteMiddle(stck));
	  System.out.println(stck.findMiddle1(stck));
	  
	  System.out.println(stck.pop(stck));
	  System.out.println(stck.pop(stck));
	  System.out.println(stck.pop(stck));
	  
	  System.out.println(stck.findMiddle1(stck));
	  System.out.println(stck.pop(stck));

	  System.out.println(stck.deleteMiddle(stck));
	  System.out.println(stck.findMiddle1(stck));
	}

}
