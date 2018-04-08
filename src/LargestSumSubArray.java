
public class LargestSumSubArray 
{

	static int getLargestSum(int [] arr)
	{
		int len = arr.length;
		
		int higestsum = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < len ; i++)
		{
			int sum = 0;
			
			for(int j = i ; j < len ; j++)
			{
				sum += arr[j];
				
				if(higestsum < sum)
					higestsum = sum;
			}
		}
		
		return higestsum;
	}
	
	static void getLargestSumSubArray(int [] arr)
	{
		int highsum = getLargestSum(arr);
		
		int len = arr.length;
		
		int initpos = 0;
		int endpos = 0;
		
		for(int i = 0 ; i < len ; i++)
		{	
			int sum = 0;
			for(int j = i ; j < len ; j++)
			{
				sum += arr[j];
				
				if(highsum == sum)
				{
					initpos = i;
					endpos = j;		
					break;
				}
			}
		}
		
		System.out.print("[");
		for(int k = initpos ; k <= endpos ; k++)
		{
			System.out.print(arr[k] + " ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) 
	{
		getLargestSumSubArray(new int [] {-2,1,-3,4,-1,2,1,-5,4});
	}
}
