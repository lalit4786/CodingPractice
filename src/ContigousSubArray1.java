
public class ContigousSubArray1 
{
	public static void main(String[] args) 
	{
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 23;
        
        int curr_sum = arr[0];
        
        int start = 0;
        
        for(int i = 1 ; i <= arr.length ; i++)
        {
        	while(curr_sum > sum && start < i-1)
        	{
        		curr_sum = curr_sum - arr[start];
        		start++;
        	}
        	
        	if(curr_sum == sum)
        	{
        		System.out.print("Start Index : " + start + " , " + "End Index : " + (i-1));
        		break;
        	}
        	
        	if(i<n)
        	{
        		curr_sum = curr_sum + arr[i];
        	}
        }
	}
}
