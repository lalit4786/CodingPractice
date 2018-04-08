package com.string.questions;

public class SecondMostFrequent 
{
    static char getSecondMostFrequent(String s)
    {
    	int max = Integer.MIN_VALUE, secmax = Integer.MIN_VALUE;
    	
    	int [] tempArry = new int[255];
    	char c='0';
    	
    	for(int i = 0 ; i < s.length() ; i++)
    		tempArry[s.charAt(i)]++;
    	
    	for(int j = 0 ; j < 255 ; j++)
    	{
    		if(tempArry[j] > max)
    			max = tempArry[j];
    		
    		if(tempArry[j] < max && secmax < tempArry[j])
    		{
    			secmax = tempArry[j];
    			c = (char)j;
    		}
    			
    	}
    	
    	return c;
    	
    }
	
	
	public static void main(String[] args) 
	{
		System.out.println(getSecondMostFrequent("aabababa"));

	}

}
