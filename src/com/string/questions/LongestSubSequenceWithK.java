package com.string.questions;

public class LongestSubSequenceWithK 
{

	static String getLongestSubSequenceWithK(String s, int k)
	{
		char [] tempArray = new char[256];
		
		for(int i = 0 ; i < s.length() ; i++)
			tempArray[s.charAt(i)]++;
		
		StringBuilder subSequence = new StringBuilder();
		
		for(int j = 0 ; j < s.length() ; j++)
		{
			if(tempArray[s.charAt(j)] >= k)
				subSequence.append(s.charAt(j));
		}
		
		return subSequence.toString();
	}
	
	public static void main(String[] args) 
	{
		System.out.println(getLongestSubSequenceWithK("baaabaacba",3));
	}

}
