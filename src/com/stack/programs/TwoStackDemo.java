package com.stack.programs;

public class TwoStackDemo 
{
	private static final int TWO_STACK_SIZE = 10; 
	private int [] arr;
	private int top1,top2;
	
	public TwoStackDemo()
	{
		arr = new int[TWO_STACK_SIZE];
		top1 = -1;
		top2 = TWO_STACK_SIZE;
	}
	
	
	public void pushStack1(int item)
	{
		if(IsEmpty())
			arr[++top1] = item;
		else
			System.out.println("Stack is Full");
	}
	
	public void pushStack2(int item)
	{
		if(IsEmpty())
			arr[--top2] = item;
		else
			System.out.println("Stack is Full");
	}
	
	public int popStack1()
	{
		if(top1 >  -1)
			return arr[top1--];
		
		return -1;
	}
	
	public int popStack2()
	{
		if(top2 < TWO_STACK_SIZE)
			return arr[top2++];
		
		return -1;
	}
	
	public boolean IsEmpty()
	{
		if(top2-top1>1)
			return true;
		return false;
	}
	
	public int peepStack1()
	{
		return arr[top1];
	}
	
	public int peepStack2()
	{
		return arr[top2];
	}
	
	public static void main (String [] args)
	{
		TwoStackDemo s = new TwoStackDemo();
		
		s.pushStack1(1);
		s.pushStack1(2);
		s.pushStack1(3);
		s.pushStack1(4);
		s.pushStack1(5);
		s.pushStack1(6);
		s.pushStack1(7);
		s.pushStack2(8);
		s.pushStack2(9);
		s.pushStack2(10);
		s.pushStack1(11);
		
		System.out.println(s.peepStack1());
		System.out.println(s.peepStack2());
		
		System.out.println(s.popStack1());
		System.out.println(s.popStack1());
		System.out.println(s.popStack1());
		System.out.println(s.popStack1());
		System.out.println(s.popStack2());
		System.out.println(s.popStack2());
		System.out.println(s.popStack2());
		System.out.println(s.popStack2());
		System.out.println(s.popStack2());
		
	}
}
