import java.util.HashSet;
import java.util.Set;

public class PairSum 
{
   static void printpairs(int arr [] , int sum )
   {
	   Set<Integer> s = new HashSet<Integer>();
	   
	   System.out.print("The pair of given sum " + sum + " is, ");
	   
	   for(int i = 0 ; i < arr.length ; i++)
	   {
		   if(s.contains(sum-arr[i]))
		   {
			   System.out.print("{" + arr[i] + "," +(sum-arr[i])+"}");
		   }
		   s.add(arr[i]);
	   }   
   }
		
	public static void main(String[] args) 
	{
		int A[] = {1, 4, 45, 6, 10, 8};
        int n = 16;
        printpairs(A,  n);

	}

}
