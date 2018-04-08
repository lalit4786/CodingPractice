
public class MajorityElement 
{
	static int findcandidate(int [] arr,int n)
	{
		int majority_index = 0; int count = 1;
		
		for(int i = 1 ; i < n-1 ; i++)
		{
			if(arr[majority_index]==arr[i])
				count++;
			else
				count--;
			if(count==0)
				majority_index=i;
		}
		
		return majority_index;
	}
	
	static void printMajority(int [] arr, int n)
	{
	  int candidate = findcandidate(arr,n);
	  
	  int count=0;
	  
	  for(int item : arr)
	  {
		  if(item == arr[candidate])
		  {
			  count++;
		  }
	  }
	  
	  if(count> n/2)
		  System.out.println(arr[candidate]);
	  else
		  System.out.println("No Majority Element");
	}
	
	public static void main(String[] args) 
	{
        int a[] = new int[]{1, 3, 3, 1, 2};
        int size = a.length;
        printMajority(a, size);
	}
}
