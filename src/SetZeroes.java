
public class SetZeroes 
{

	static void setZero(int [][] arr)
	{
		int [] row = new int [arr.length];
		int [] col = new int [arr[0].length];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for (int j = 0 ; j < arr[0].length ; j++)
			{
				if(arr[i][j] == 0)
				{
					row[i] = 1;
					col[j] = 1; 
				}
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for (int j = 0 ; j < arr[0].length ; j++)
			{
				if(row[i] == 1 || col[j] == 1)
				{
					arr[i][j] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int [][] intarray= {
							{1,0,1,7},{1,1,1,1},{2,2,2,2},{3,3,3,3}
				           };

		//Original Array
		
		System.out.println("The array before ::");
		
		for(int i = 0 ; i < intarray.length ; i++)
		{
			
			System.out.print("[");
			
			for (int j = 0 ; j < intarray[0].length ; j++)
			{
				System.out.print(intarray[i][j]+" ");
			}
			
			System.out.println("]");
		}
		
		//After setting the rows and columns to zeroes Array
		
			System.out.println("The array after ::");
			
			setZero(intarray);
			
		    for(int i = 0 ; i < intarray.length ; i++)
			{		
				System.out.print("[");	
					
				for (int j = 0 ; j < intarray[0].length ; j++)
				{
					System.out.print(intarray[i][j]+" ");
				}
					
				System.out.println("]");
			}
	}
}
