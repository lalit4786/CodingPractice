public class test2 
{
	public static void main (String ...arg)
	{
		int sum = 3568;
		int count ;
		
		int [] arr = {2000,500,100,50,10,5,1};
			
		for(int i = 0 ; i < arr.length ; i++)
		{
				count = 0;
					
				while(sum - arr[i]>=0)
				{
						count++;
						sum = sum - arr[i];
				}
								
				System.out.println(arr[i] + " : " + count);
		 }
	}
}
