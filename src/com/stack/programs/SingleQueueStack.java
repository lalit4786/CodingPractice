package com.stack.programs;

import java.util.LinkedList;
import java.util.Queue;

public class SingleQueueStack {
	
	private Queue<Integer> stckq = new LinkedList<Integer>();
	
	void push(int x) {
       stckq.add(x);
       
       while(stckq.peek() != x)
       {
    	   stckq.add(stckq.poll());
       }
	}
    
	int pop()
	{
		if(!stckq.isEmpty())
			return stckq.poll();
		else
			return -1;
	}
	
	public static void main(String[] args) {

		SingleQueueStack stckq = new SingleQueueStack();
		
		for (int i = 0; i < 10; i++)
			stckq.push(i);
		
		int x;
		
		while ((x = stckq.pop()) != -1)
			System.out.print(x + " ");

	}
}
