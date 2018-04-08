package com.stack.programs;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueueDemo 
{
	private Queue<Integer> q1,q2;
	
	public StackUsingQueueDemo()
	{
		q1 = new LinkedList<Integer>();
		q2 = new LinkedList<Integer>();
	}
	
	void push(int x) {
		q2.add(x);

		Queue<Integer> tempq;

		while (!q1.isEmpty()) {
			q2.add(q1.poll());
		}

		tempq = q1;
		q1 = q2;
		q2 = tempq;
	}
	
	int pop() {
		if (!q1.isEmpty())
			return q1.poll();
		return -1;
	}
	
	public static void main(String[] args) {
		StackUsingQueueDemo stckq = new StackUsingQueueDemo();
		
		for (int i = 0; i < 10; i++)
			stckq.push(i);
		
		int x;
		
		while ((x = stckq.pop()) != -1)
			System.out.print(x + " ");
	}
}
