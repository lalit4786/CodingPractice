package com.string.questions;

import java.util.Arrays;

public class StringReverse 
{
    static String reverseStringWordInplace(String s)
    {
    	int begin_pos,end_pos;
    	char swap;
    	
    	begin_pos = 0 ; end_pos=s.indexOf(" ", begin_pos)-1;
    	
    	char stringArray [] = s.toCharArray();
    	
    	while(end_pos >= 0)
    	{		
    		int track_pos = end_pos+1;
    		
    		while(begin_pos < end_pos)
    		{
    			swap = stringArray[begin_pos];
    			stringArray[begin_pos] = stringArray[end_pos];
    			stringArray[end_pos] = swap;
    			
    			begin_pos++;end_pos--;
    		}
    		
    		begin_pos=track_pos+1;
    		end_pos=s.indexOf(" ", begin_pos)-1;
    	}
    	
    	if(end_pos<0)
    	{
    		end_pos = s.length()-1;
    		
    		while(begin_pos < end_pos)
    		{
    			swap = stringArray[begin_pos];
    			stringArray[begin_pos] = stringArray[end_pos];
    			stringArray[end_pos] = swap;
    			
    			begin_pos++;end_pos--;
    		}
    	}
    	
    	return String.valueOf(stringArray);
    }
	
	
	static String reverseString(String s)
    {
    	if(s.equals(null) || s.equals("") || s.length() == 1)
    		return s;
    	else
    	{
    		return (reverseString(s.substring(1,s.length())) + s.charAt(0));
    	}
    }
    
    static String reverseStringWithoutSpecialCharacter(String s)
    {
    	if(s.equals(null) || s.equals("") || s.length() == 1)
    		return s;
    	else
    	{
    		int i = 0 , j = s.length()-1;
    		char temp;
    		
    		char [] sArray = s.toCharArray();
    		
    		while(i<j)
    		{
    			if(!Character.isAlphabetic(sArray[i]))
    					i++;		
    			
    			else if(!Character.isAlphabetic(sArray[j]))
    				j--;
    			
    			else
    			{
    				temp = sArray[i];
    				sArray[i] = sArray[j];
    				sArray[j] = temp;
    				
    				i++;
    				j--;
    			}				
    		}
    		
    		return new String(sArray);
    	}
    }
	
	
	public static void main(String[] args) 
	{
		
       //System.out.println(reverseString("a,b$c"));
       //System.out.println(reverseStringWithoutSpecialCharacter("a,b$c"));
       System.out.println(reverseStringWordInplace(" look"));
	}

}
