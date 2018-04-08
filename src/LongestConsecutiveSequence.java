import java.util.Arrays;

public class LongestConsecutiveSequence 
{
	static void getLongestSubSequence(int [] arr)
	{
		int len = arr.length;
		int i = 0;
		Arrays.sort(arr);
		
		for (; i < len ; i++)
		{
			if(arr[i] + 1 !=arr[i+1])
				break;
		}
		
		int j = 0 ;
		
		
		System.out.print("[ ");
		while(j <= i)
		{
			System.out.print(arr[j] + " ");
			j++;
		}
		System.out.print(" ]");
		
	}
	
	public static void main(String[] args) 
	{
		getLongestSubSequence(new int [] {100,4,200,1,3,2});

	}

}
