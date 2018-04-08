
public class MinUnsortedSubArray 
{
    static void printUnsorted(int [] arr, int size)
    {
    	int low = 0, high = size-1;
    	
    	for(int i = 0 ; i < size ; i++)
    	{
    		if(arr[i]>arr[i+1])
    		{
    			low=i;
    			break;
    		}
    	}
    	
    	if (low == size-1)
        {
          System.out.println("The complete array is sorted");
          return;
        }
    	
    	for(int j = size-1 ; j >=0 ; j--)
    	{
    		if(arr[j]<arr[j-1])
    		{
    			high=j;
    			break;
    		}
    	}
    	
    	
    	int min = Integer.MAX_VALUE,max=Integer.MIN_VALUE;
    	
    	for(int k=low;k<=high;k++)
    	{
    		if(arr[k]<min)
    			min = arr[k];
    		if(arr[k]>max)
    			max = arr[k];
    	}
    	
    	for(int i = 0 ; i < low ; i++)
    	{
    		if(arr[i] > min)
    		{
    			low = i;
    			break;
    		}
    	}
    	
    	
    	for(int j = high+1 ; j < size ; j++)
    	{
    		if(arr[j] < max)
    		{
    			high = j;
    			break;
    		}
    	}
    	
    	
    	System.out.println(" The unsorted subarray which"+ " makes the given array sorted lies"+ "  between the indices "+low+" and "+high);

    	return;
    	
    }
	
	public static void main(String[] args) 
	{
    	int arr[] = {0, 1, 15, 25, 6, 7, 30, 40, 50};
        int arr_size = arr.length;
        printUnsorted(arr, arr_size);
	}

}
