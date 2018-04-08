
public class Leader 
{
	static void printLeaders(int arr[], int n)
	{
		int leader = Integer.MIN_VALUE;
		
		for(int i = n-1 ; i >= 0 ; i--)
		{
			if(arr[i] > leader)
			{
				System.out.print(arr[i] + " ");
				leader = arr[i];
			}
		}
	}

	public static void main(String[] args) 
	{
		int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        printLeaders(arr, n);
	}

}
