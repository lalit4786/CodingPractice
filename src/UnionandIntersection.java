
public class UnionandIntersection 
{
	static void printUnion(int arr1[] , int arr2[])
	{
		int l1 = arr1.length;
		int l2 = arr2.length;
		
		int i = 0 , j = 0;

		while(i < l1 && j < l2)
		{
			if(arr1[i]<arr2[j])
			{
				System.out.print(arr1[i] + " ");
				i++;
			}
			else if (arr1[i]>arr2[j])
			{
				System.out.print(arr2[j] + " ");
				j++;
			}
			else
			{
				System.out.print(arr2[j] + " ");
				i++;j++;
			}				
		 }
		
		while(i < l1)
		{
			System.out.print(arr1[i] + " ");
			i++;
		}
		
		while(j < l2)
		{
			System.out.print(arr2[j] + " ");
			j++;
		}
	}
	
	
	static void printIntersection(int arr1[] , int arr2[])
	{
		int l1 = arr1.length;
		int l2 = arr2.length;
		
		int i = 0 , j = 0;

		while(i < l1 && j < l2)
		{
			if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if (arr1[i]>arr2[j])
			{
				j++;
			}
			else
			{
				System.out.print(arr2[j] + " ");
				i++;j++;
			}				
		 }
	}
	
	public static void main(String[] args) 
	{
		int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};
        System.out.println("Union");
        printUnion(arr1, arr2);
        System.out.println("Intersection");
        printIntersection(arr1, arr2);
	}

}
