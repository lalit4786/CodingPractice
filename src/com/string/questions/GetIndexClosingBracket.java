package com.string.questions;

import java.util.Stack;

public class GetIndexClosingBracket 
{	
	static int getIndex(String s , int obracket)
	{
		Stack<Character> st = new Stack<Character>();
		
		st.push(s.charAt(obracket));
		
		int i = obracket+1;
		
		for(; i < s.length() ; i++)
		{
			if(s.charAt(i)=='[')
				st.push(s.charAt(i));
			if(s.charAt(i)== ']')
				st.pop();
			if(st.isEmpty())
				break;
		}
		
		
		return i;
	}
	
	
	public static void main(String[] args) 
	{
		
		System.out.println(getIndex("[ABC[23]][89]",9));
	}

}
