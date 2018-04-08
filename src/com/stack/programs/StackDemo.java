package com.stack.programs;

import java.util.Stack;

public class StackDemo 
{
	public static void main(String [] arg)
	{
		Stack<Integer> stck = new Stack<Integer>();
		
		stck.push(1);
		stck.push(2);
		
		System.out.println(stck.search(1));
		System.out.println(stck.isEmpty());
		
		System.out.println(stck.peek());
		System.out.println(stck.pop());
		System.out.println(stck.pop());
		
		System.out.println(stck.isEmpty());
		System.out.println(stck.search(1));
		
	}
}
