package com.string.questions;

public class ExtactAllSubString {

	public static void main(String[] args) 
	{
		String test = "ABCDEGHF";
		
		for(int i = 0 ; i < test.length() ; i++)
		{
			for(int j = i ; j < test.length(); j++)
			{
				System.out.println(test.substring(i, j));
			}
		}

	}

}
