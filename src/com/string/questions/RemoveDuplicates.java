package com.string.questions;

public class RemoveDuplicates 
{

	static String removeDuplicates(String s)
	{
		char [] sArray = s.toCharArray();
		boolean [] flagArray = new boolean[255];
		int curr_index = 0 , next_index = 0;
		
		while(curr_index < s.length())
		{
			if(flagArray[sArray[curr_index]] == false)
			{
				flagArray[sArray[curr_index]] = true;
				sArray[next_index] = sArray[curr_index];
				next_index++;
			}
			
			curr_index++;
		}
		
	
		return (new String(sArray)).substring(0,next_index);
	}
	
	public static void main(String[] args) 
	{
		System.out.println(removeDuplicates("geeksforgeeks"));
	}

}
