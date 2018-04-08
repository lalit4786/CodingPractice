package com.string.questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class KthNonRepeatingCharacter 
{
	
	static void getKthNonRepeteadCharacter(String s,int k)
	{
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();  
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			if(map.containsKey(s.charAt(i)))
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			else
				map.put(s.charAt(i),1);
		}
		
		for(Character c : map.keySet())
		{
			if(map.get(c)==1 && k > 0)
				k--;
			if(k == 0)
			{
				System.out.println(c);
				break;
			}
				
		}	
	}

	public static void main(String[] args) 
	{
		getKthNonRepeteadCharacter("geeksforgeeks",2);
	}

}
