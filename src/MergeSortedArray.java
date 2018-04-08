
public class MergeSortedArray 
{

	static void shiftMplusN(int [] mplusn , int size)
	{
		int j = size-1;
		
		for(int i = size-1;i>=0;i--)
		{
			if(mplusn[i]!=-1)
			{
				mplusn[j] = mplusn[i];
				j--;
			}
		}
	}
	
	static void mergesortedarray(int [] MplusN, int [] N ,int m , int n)
	{
		int k = 0;
		int j = 0;
		int i = n;
		
		while(k<(m+n))
		{
			if((i<(m+n) && MplusN[i] <= N[j]) || (j==n))
			{
				MplusN[k]=MplusN[i];
				k++;
				i++;
			}
			else
			{
				MplusN[k]=N[j];
				k++;
				j++;
			}
		}
	}
	
	static void printArray(int [] arr, int size)
	{
		int i;
        for (i = 0; i < size; i++) 
            System.out.print(arr[i] + " ");
 
        System.out.println("");
	}
	
	public static void main(String[] args) 
	{
		int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};
        int N[] = {5, 7, 9, 25};
        int n = N.length;
        int m = mPlusN.length - n;
        
        shiftMplusN(mPlusN, m + n);
        
        mergesortedarray(mPlusN, N, m, n);
        
        printArray(mPlusN, m + n);

	}

}
