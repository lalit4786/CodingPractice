import java.util.Arrays;

public class SumCloseToZero 
{
	static void minAbsSumPair(int [] arr , int size)
	{
		int low = 0 ,high = size-1;
		int min_l = low , min_r = size-1;
		
		Arrays.sort(arr);
		
		int sum,min_sum;
		
		min_sum = Integer.MIN_VALUE;
		
		while(low<high)
		{
			sum = arr[low]+arr[high];
			
			if(Math.abs(sum) < Math.abs(min_sum))
			{
				min_sum = sum;
				min_l = low;
				min_r = high;
			}
			
			if(sum < 0)
				low++;
			else
				high--;
			
		}
		
		System.out.println(" The two elements whose "+ "sum is minimum are "+ arr[min_l]+ " and "+arr[min_r]);
	}
	
	public static void main(String [] args)
	{
		int arr[] = {1, 60, -10, 70, -80, 85};
        int n = arr.length;
        minAbsSumPair(arr, n);
	}
}
