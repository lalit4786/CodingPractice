
public class CheckZeroSumSubArray 
{

	static boolean CheckSum(int [] arr)
	{
		int len = arr.length;
		
		for(int i = 0 ; i < len ; i++)
		{
			int sum = 0;
			
			for(int j = i ; j < len ; j++)
			{
				sum += arr[j];
				
				if(sum == 0)
					return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(CheckSum(new int [] {4,2,-3,1,6}));
	}

}
